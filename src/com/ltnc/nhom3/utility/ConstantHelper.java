/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltnc.nhom3.utility;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author admin
 */
public class ConstantHelper {
    
    private static Color getColorFromInt(int colorHex) {
        return new Color(colorHex);
    }
    
    public static final Color MENU_PANEL_BG = getColorFromInt(0x333333);
    public static final Color MENU_PANEL_LINE = getColorFromInt(0x838383);
    public static final Color MENU_BTN_BG_HOVER = getColorFromInt(0x19478a);
    public static final Color MENU_BTN_BG_SELECTED = getColorFromInt(0x3e6db5);
    
    public static final Color SECTION_PANEL_BG = getColorFromInt(0xffffff);
    public static final Color SECTION_PANEL_LINE = getColorFromInt(0xa0a0a0);
    
    public static final Color SEARCH_SECTION_TEXT_NON_FOCUS = getColorFromInt(0x808080);
    public static final Color SEARCH_SECTION_TEXT_FOCUS = getColorFromInt(0x000000);
    
    public static final Color SECTION_BTN_BODER_NORMAL = getColorFromInt(0xababab);
    public static final Color SECTION_BTN_BODER_HOVER = getColorFromInt(0xa3bde3);
    public static final Color SECTION_BTN_BG_NORMAL = SECTION_PANEL_BG;
    public static final Color SECTION_BTN_BG_HOVER = getColorFromInt(0xd5e1f2);
    
    public static final String PAGINATION_TEXT = "%d/%d";
    
    public static final String CONFIRM_DIALOG_TITLE = "Xác nhận";
    public static final String CONFIRM_DIALOG_MESSAGE = "Bạn có chắc chắn?";
    public static final String CONFIRM_LOGOUT_DIALOG_TITLE = CONFIRM_DIALOG_TITLE;
    public static final String CONFIRM_LOGOUT_DIALOG_MESSAGE = "Xác nhận đăng xuất?";
    public static final String ADD_DONE_DIALOG_MESSAGE = "Tạo thành công!";
    public static final String UPDATE_INFO_DONE_DIALOG_MESSAGE = "Cập nhật thông tin thành công!";
    public static final String UPDATE_INFO_PRICE_DONE_DIALOG_MESSAGE = "Cập nhật thông tin & đơn giá thành công!";
    public static final String ADD_MANUFACTURER_DIALOG_TITLE = "Thêm hãng sản xuất";
    public static final String EDIT_MANUFACTURER_DIALOG_TITLE = "Sửa hãng sản xuất";
    
    public static final String LOGOUT_BTN_TEXT = "Đăng xuất (%s)";
    
    public static final String PRODUCT_LIST_HEADING = "Danh sách sản phẩm";
    public static final String PRODUCT_LIST_SEARCH_HEADING = "Kết quả cho '%s'";
    
    public static final String CUSTOMER_LIST_HEADING = "Danh sách khách hàng";    
    
    public static final String NO_RESULT_MESSAGE = "Danh sách trống";
    public static final String NO_INFORMATION_MESSAGE = "Không có thông tin";
    public static final String PRODUCT_AVAILABEL_MESSAGE = "Còn hàng";
    public static final String PRODUCT_NOT_AVAILABEL_MESSAGE = "Hết hàng";
    public static final String MANUFACTURER_NAME_HAS_EXISTED_MESSAGE = "Tên đã tồn tại!";
    public static final String MANUFACTURER_FIELD_REQUIRED_MESSAGE = "Hãy điền đầy đủ thông tin!";
    public static final String LOGIN_FIELD_REQUIRED_MESSAGE = MANUFACTURER_FIELD_REQUIRED_MESSAGE;
    public static final String LOGIN_WRONG_INFO_MESSAGE = "Tên hoặc mật khẩu sai!";

    public static final String COMBOBOX_SELECT_MANUFACTURER = "-- Chọn --";
    
    public static final String[] TBL_PRODUCT_TITLES
            = new String[]{"ID", "Tên", "Đơn giá", "Ngày ra mắt", "Trạng thái"};
    public static final int[] TBL_PRODUCT_TITLES_WIDTHS
            = {40, 400, 165, 115, 125};
    
    public static final int ITEM_PER_PAGE = 15;
    public static final int STT_BTN_HOVER = 1;
    public static final int STT_BTN_NORMAL = 0;
    public static final int STT_BTN_SELECTED = 2;
    
    public static final int MAIN_FRAME_INIT_MODE = 0;
    public static final int MAIN_FRAME_PRODUCT_MODE = 1;
    public static final int MAIN_FRAME_CUSTOMER_MODE = 2;
    public static final int MAIN_FRAME_BILL_MODE = 3;
    
}
