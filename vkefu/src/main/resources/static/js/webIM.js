
var userId = "zs1000";
var userName = "张三";
var sessionId = "121212121212";
var socket = io.connect('http://localhost:8078/im/user?userId='+userId+'&userName='+userName+'&sessionId='+sessionId+'');
socket.on('connect',function(){
    console.info("connect",new Date());
   /* output('<span id="connect-message">'+ new Date().format("yyyy-MM-dd hh:mm:ss") + ' 开始沟通' +'</span>' , 'message connect-message');*/
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

/**
 * 接收消息
 */
socket.on('message', function(data) {
    console.info("message",data.message);
    $("#record").append("<tr><td>" + data.message + "</td> <td>"+new Date().toLocaleTimeString()+"</td></tr>");
});
socket.on('disconnect',function() {
    console.info("disconnect","连接坐席失败，在线咨询服务不可用");
    /*output('<span id="connect-message">连接坐席失败，在线咨询服务不可用</span>' , 'message connect-message');*/
    document.getElementById("socket_info").innerHTML="连接坐席失败，在线咨询服务不可用";
});
function sendDisconnect(){
    socket.disconnect();
}
function sendMessage() {
        var agentId = "agent1101";
        var message = document.getElementById('content').value;
        if(message!= ""){
            socket.emit('message', {
                agentid:agentId,
                messageType:"text" ,
                sessionid:sessionId,
                fromId:userId,
                message : message
            });
        }
    document.getElementById('content').value="";
}
function output(message , clazz) {
   /* if(clazz == "message connect-message"){
        var messages = document.getElementsByClassName("connect-message") ;
        for(inx =0 ; inx < messages.length ; ){
            document.getElementById('above').removeChild(messages[inx]) ;
            inx++ ;
        }
    }
    var element = ("<div class='clearfix "+clazz+"'>" +" " + message + "</div>");
    document.getElementById('above').innerHTML= (document.getElementById('above').innerHTML + element);
    document.getElementById('above').scrollTop = document.getElementById('above').scrollHeight  ;*/
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
function outputSocketInfo(){

}
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });

    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() {
        sendMessage();
    });
});