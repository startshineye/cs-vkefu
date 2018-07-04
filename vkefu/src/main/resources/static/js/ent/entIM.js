
var userId = document.getElementById("userId").value;
var userName ="";
var sessionId = document.getElementById("sessionid").value;
var socket = io.connect('http://localhost:8078/im/ent?userId='+userId+'&userName='+userName+'&sessionId='+sessionId+'');
socket.on('connect',function(){
    console.info("im/ent connect",new Date());
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
/**
 * 用户状态
 */
socket.on('onlineuser', function(data) {
    console.info("onlineuser",data);
    $("#online").html("<tr><td>" + data.message + "</td> <td>"+new Date().toLocaleTimeString()+"</td></tr>");
});
function sendDisconnect(){
    socket.disconnect();
}
function sendMessage() {
        var agentId = "agent1101";
        var message = document.getElementById('content').value;
        console.info("==sendMessage()==message:"+message)
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
function onlineUser() {
    console.info("--onlineUser--",userId);
    socket.emit('onlineuser', {
        agentid:"",
        messageType:"" ,
        sessionid:"",
        fromId:userId,
        message : ""
    });
}
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });

    $("#disconnect").click(function () {
        disconnect();
    });
    $("#send").click(function () {
        sendMessage();
    });
    //定时监测
    setInterval("onlineUser()",3000);

})
