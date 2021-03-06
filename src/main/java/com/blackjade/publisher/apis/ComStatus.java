package com.blackjade.publisher.apis;

public class ComStatus {
	
	public static enum OrderStatus{
		DEALING,	
		PAID,
		PAYCONFIRM,
		CANCELLED,
		DONE,
		REJECT_LOCK,
		REJECT_DONE,
		ERROR,
		UNKNOWN
	}
		
	public static enum PnSStatus{
		PUBLISHED,		//0
		HALF_TRADED,	//0
		//HALF_LOCKED,	//0
		FULL_LOCKED,	//0
		FULL_TRADED,	//final
		CANCELLED,		//final
		HALF_CANCELLED,	//final
		UNKNOWN			//final
	}
		
	public static enum PublishStatus {
		SUCCESS, 
		WRONG_MSGID,
		DATABASE_ERR,
		IN_MSG_ERR,
		UNKNOWN
	}
	
	public static enum DealStatus {
		SUCCESS, 
		WRONG_MSGID,
		DATABASE_ERR,
		IN_QUANT_ERR,
		IN_MSG_ERR,
		PNS_MISS_MATCH,
		PNS_DATA_MESS,
		PNS_STATUS_MESS,
		PNS_STATUS_FINAL,
		PNS_STATUS_LOCKED,
		PNS_NET_NOT_ENOUGH,		
		UNKNOWN
	}
	
	public static enum PaidStatus {
		SUCCESS, 
		WRONG_MSGID,
		DATABASE_ERR,
		IN_MSG_ERR,
		IN_QUANT_ERR,
		ORD_MISS_MATCH,
		ORD_DATA_MESS,
		ORD_STATUS_MESS,
		ORD_STATUS_FINAL,
		ORD_STATUS_LOCKED,
		ORD_STATUS_PAID_ALREADY,
		ORD_STATUS_PAYCONFIRM,
		UNKNOWN
	}

	public static enum PayConfirmStatus {
		SUCCESS, 
		WRONG_MSGID,
		IN_MSG_ERR,
		PC_DATABASE_ERR,
		PC_DB_MISS_MATCH,
		PC_DB_CORRUPT,
		STATUS_FINAL,
		STATUS_MISS,
		DB_ORD_MISS,
		DB_ORD_STATUS,
		ORD_FINAL,
		ORD_ERR,
		DB_PNS_ERR,
		UNKNOWN
	}
	
	public static enum CancelStatus {
		SUCCESS, 
		WRONG_MSGID,
		MSG_ERR,
		TYPE_ERR,
		DB_ORD_MISS,
		DB_ORD_MESS,
		ORD_STATUS_FINAL,
		ORD_UPDATE_FAILED,
		DB_PNS_MISS,
		DB_PNS_MESS,
		DB_PNS_STATUS,
		PNS_UPDATE_FAILED,
		PNS_STATUS_FINAL,
		UNKNOWN
	}
	
	public static enum DCancelStatus {
		SUCCESS, 
		WRONG_MSGID,
		IN_MSG_ERR,
		MSG_ERR,
		TYPE_ERR,
		DB_ORD_MISS,
		DB_ORD_MESS,
		ORD_STATUS_FINAL,
		ORD_UPDATE_FAILED,
		DB_PNS_MISS,
		DB_PNS_MESS,
		DB_PNS_STATUS,
		PNS_UPDATE_FAILED,
		PNS_STATUS_FINAL,
		UNKNOWN
	}
	
	public static enum PCancelStatus {
		SUCCESS, 
		WRONG_MSGID,
		IN_MSG_ERR,
		MSG_ERR,
		TYPE_ERR,
		DB_ORD_MISS,
		DB_ORD_MESS,
		ORD_STATUS_FINAL,
		ORD_UPDATE_FAILED,
		DB_PNS_MISS,
		DB_PNS_MESS,
		DB_PNS_STATUS,
		PNS_UPDATE_FAILED,
		PNS_STATUS_FINAL,
		UNKNOWN
	}
	
}
