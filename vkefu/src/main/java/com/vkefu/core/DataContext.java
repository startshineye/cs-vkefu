package com.vkefu.core;
public class DataContext{
	/**
	 * 排队中的坐席是否已被通知过
	 */
	public enum IsUserWaitNotify{
		NOTIFY,
		UNNOTIFY;
		public String toString(){
			return super.toString().toLowerCase() ;
		}
	}
	/**
	 *分配坐席结果状态
	 */
	public enum AllotAgentStatusEnum{
		INSERVICE,
		INQUENE,NOAGENT,TIMEOUT;
		public String toString(){
			return super.toString().toLowerCase() ;
		}
	}
	/**
	 *微信响应消息类型
	 */
	public enum WexinRespMessageTypeEnum{
		TEXT,IMAGE,VOICE,VIDEO;
		public String toString(){
			return super.toString().toLowerCase() ;
		}
	}
	/**
	 * 命令
	 */
	public enum CmdTypeEnum{
		 AGENTSTATEHEART,//状态坐席心跳
		 AGENTHEART,//坐席心态
		 USERHEART,//用户心跳
 		 WEBCHATCLIENTMSG,//客户发送web聊天信息(C-->A)
		 WEBCHATCLIENTEND,//用户超时结束聊天
		 WEBCHATAGENTMSG,//坐席发送web聊天信息(A-->C)
		 AGENTSTATUS,//坐席报告状态
		 FOCUSAGENTLOGIN,//坐席开始报告状态,用于绑定特定的坐席状态socketSession,focus中agent登录
		 WEBCHATAGENTSTART;//坐席开始报告状态,用于绑定特定的坐席状态socketSession,focus中agent登录
		 public String toString(){
			 return super.toString().toLowerCase();
		 }
	}
	/**
	 * 聊天状态
	 */
	public enum ChatStatusTypeEnum{
		WAITING(0),//等待
		CHATTING(1),//聊天中
		END(2);//结束
		private Integer status;
		ChatStatusTypeEnum(Integer status){
			this.status=status;
		}
		public void setStatus(Integer status){
			this.status=status;
		}
		public Integer getStatus(){
			return this.status;
		}
		public String toString(){
			return super.toString().toLowerCase();
		}
	}
	/**
	 *渠道来源
	 */
	public enum SourceTypeEnum{
		WEBIM,
		WEIXIN,
		WEIBO,
		VIDEO,
		PHONE,
		EMAIL;
		public String toString(){
			return super.toString().toLowerCase();
		}
	}

	public enum NameSpaceEnum{
		IM("/im/user") ,
		AGENT("/im/agent"),
		ENTIM("/im/ent") ,
		AIIM("/im/ai") ,
		CALLCENTER("/callcenter/event");
		private String namespace ;
		public String getNamespace() {
			return namespace;
		}
		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}
		NameSpaceEnum(String namespace){
			this.namespace = namespace ;
		}
		public String toString(){
			return super.toString().toLowerCase() ;
		}
	}

	/**
	 * 消息类型
	 */
	public enum MessageTypeEnum{
		NEW,
		ONLINEUSER,
		MESSAGE,
		END,
		TRANS, STATUS , AGENTSTATUS , SERVICE, WRITING;
		public String toString(){
			return super.toString().toLowerCase() ;
		}
	}
}

