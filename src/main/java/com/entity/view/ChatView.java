package com.entity.view;

import com.entity.ChatEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 客服聊天
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chat")
public class ChatView extends ChatEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 状态的值
		*/
		private String zhuangtaiValue;
		/**
		* 数据类型的值
		*/
		private String chatValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;

	public ChatView() {

	}

	public ChatView(ChatEntity chatEntity) {
		try {
			BeanUtils.copyProperties(this, chatEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 状态的值
			*/
			public String getZhuangtaiValue() {
				return zhuangtaiValue;
			}
			/**
			* 设置： 状态的值
			*/
			public void setZhuangtaiValue(String zhuangtaiValue) {
				this.zhuangtaiValue = zhuangtaiValue;
			}
			/**
			* 获取： 数据类型的值
			*/
			public String getChatValue() {
				return chatValue;
			}
			/**
			* 设置： 数据类型的值
			*/
			public void setChatValue(String chatValue) {
				this.chatValue = chatValue;
			}




































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}


}
