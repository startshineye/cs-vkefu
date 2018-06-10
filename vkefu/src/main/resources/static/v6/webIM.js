
var userId = "zs1000";
var userName = "张三";
var sessionId = "121212121212";
var socket = io.connect('http://localhost:8078/im/user?userId='+userId+'&userName='+userName+'&sessionId='+sessionId+'');
socket.on('connect',function(){
    //service.sendRequestMessage();
    //output('<span id="connect-message">'+ new Date().format("yyyy-MM-dd hh:mm:ss") + ' 开始沟通' +'</span>' , 'message connect-message');
})
socket.on("agentstatus",function(data){
    document.getElementById('connect-message').innerHTML=data.message;
})
socket.on("status",function(data){
    agentId=data.fromId;
    output('<span id="connect-message">'+data.message+'</span>' , 'message connect-message');
    if(data.messageType == "end"){
        service_end = true ;
        editor.readonly();
    }
})
socket.on('message', function(data) {
    var chat=document.getElementsByClassName('chatting-left').innerText;
    chat = data.message;
    if(data.messageType == "image"){
        chat = "<a href='"+data.message+"_original' target='_blank'><img src='"+data.message+"' class='ukefu-media-image'/></a>" ;
    }
    if(data.calltype == "in"){
        output('<div class="chat-right"> <img class="user-img" src="/im/img/user.png" alt=""><div class="chat-message"><label class="time">'+data.createtime+'</label><label  class="user">'+data.nickName+'</label> </div><div class="chatting-right"><i class="arrow arrow"></i><div class="chat-content theme">'+chat+'</div></div>' , "chat-block");
    }else if(data.calltype == "out"){
        output('<div class="chat-left"> <img class="user-img" src="" alt=""><div class="chat-message"><label  class="user">'+data.nickName+'</label><label class="time">'+data.createtime+'</label> </div><div class="chatting-left"><i class="arrow"></i><div class="chat-content">'+chat+'</div></div>' , "chat-block");
    }
});
socket.on('disconnect',function() {
    output('<span id="connect-message">连接坐席失败，在线咨询服务不可用</span>' , 'message connect-message');
});
function sendDisconnect(){
    socket.disconnect();
}
function sendMessage() {
    editor.sync();
    var count = editor.count("text");
    if(count>0 && service_end == false){
        var message = document.getElementById('message').value;
        if(message!= ""){
            socket.emit('message', {
                agentid:agentId,
                type:"message" ,
                sessionid:sessionId,
                userid:userId,
                message : message
            });
        }

    }else if(service_end == true){
        alert("坐席已断开和您的对话");
    }
    editor.html('');
}
function output(message , clazz) {
    if(clazz == "message connect-message"){
        var messages = document.getElementsByClassName("connect-message") ;
        for(inx =0 ; inx < messages.length ; ){
            document.getElementById('above').removeChild(messages[inx]) ;
            inx++ ;
        }
    }
    var element = ("<div class='clearfix "+clazz+"'>" +" " + message + "</div>");
    document.getElementById('above').innerHTML= (document.getElementById('above').innerHTML + element);
    document.getElementById('above').scrollTop = document.getElementById('above').scrollHeight  ;
}
function update(id , message) {
    document.getElementById(id).innerHTML= message;
}

var message={
    // text:data.message,
    // picture:function(){
    // }
    // file:function(){
    // }
    // lang:function(){
    // }
    // goods:function(){
    // }
    // POI:function(){
    // }
}
// 回车事件
document.onkeyup=function(e){
    if(!e) e=window.event;
    if((e.keyCode||e.which)==13){
        document.getElementById('sent').click();
    }
}
window.onresize = function(){
  /*  R3Helper.resize();*/
};