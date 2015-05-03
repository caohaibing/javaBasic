package com.json;


/**
 * 笑话
 * 
 * @author Administrator
 *
 */
public class Joke {

	/**
	 * title 标题 　　thumburl 大图地址 　　sourceurl 小图地址（宽度为230的图） 　　height 大图高度 　　width
	 * 大图宽度 　　url 来源地址
	 */
	private String title;
	private String thumburl;
	private String sourceurl;
	private String height;
	private String weith;
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumburl() {
		return thumburl;
	}

	public void setThumburl(String thumburl) {
		this.thumburl = thumburl;
	}

	public String getSourceurl() {
		return sourceurl;
	}

	public void setSourceurl(String sourceurl) {
		this.sourceurl = sourceurl;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeith() {
		return weith;
	}

	public void setWeith(String weith) {
		this.weith = weith;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
