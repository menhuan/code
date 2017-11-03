package web.study.model.wechat.pay;

/**
 * 微信支付实体bean
 * @author dell
 *
 */
public class PayWeBean {
	/**
	 * 微信支付分配的公众号id
	 */
	private String appid ;
	
	/**
	 *  微信支付 分配的商户号
	 */
	private String mch_id ;
	
	/**
	 * 设备号
	 */
	private String device_info ;

	/**
	 * 随机字符串
	 */
	private String nonce_str ;

	/**
	 * 签名
	 */
	private String sign ;

	/**
	 * 签名 类型 默认为md5
	 */
	private String sign_type ;
	
	/**
	 * 商品详情
	 */
	private String detail ;
	
	/**
	 * 附加数据 
	 */
	private String attach ;

	/**
	 * 商户订单号
	 */
	private String out_trade_no ;

	/**
	 * 标价币种
	 */
	private String fee_type;
	
}
