package web.study.model.wechat.menu;

/**
 * 二级菜单
 * @author dell
 *
 */
public class SubButton extends Button {

	/**
	 * 二级菜单
	 */
	private Button[]  sub_button ;

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}


	
}
