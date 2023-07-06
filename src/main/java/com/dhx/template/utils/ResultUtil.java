package com.dhx.template.utils;

import com.dhx.template.common.BaseResponse;
import com.dhx.template.common.ErrorCode;

import java.io.Serializable;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
// extends HashMap<String, Object>
public class ResultUtil implements Serializable{
	private static final long serialVersionUID = 164567353L;
	/**
	 * 正常返回
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> success(T data){
		return new BaseResponse<T>(200,data,"ok");
	}


	/**
	 * 出现错误
	 * @param errorCode
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> error(ErrorCode errorCode){
		return new BaseResponse<T>(errorCode);
	}

	/**
	 * 失败
	 *
	 * @param code
	 * @param message
	 * @return
	 */
	public static BaseResponse error(int code, String message) {
		return new BaseResponse(code, null,message);
	}

	/**
	 *
	 * @param errorCode 错误码
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> error(ErrorCode errorCode,String message){
		return new BaseResponse<T>(errorCode,message);
	}


	/**
	 *
	 * @return
	 */
	public static <T> BaseResponse<T> error(){
		return new BaseResponse<T>(ErrorCode.SYSTEM_ERROR);
	}

	public static BaseResponse success() {
		return new BaseResponse(200,null,"success");
	}
}


