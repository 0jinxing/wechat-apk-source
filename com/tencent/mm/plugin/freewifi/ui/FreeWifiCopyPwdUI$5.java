package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiCopyPwdUI$5
  implements View.OnClickListener
{
  FreeWifiCopyPwdUI$5(FreeWifiCopyPwdUI paramFreeWifiCopyPwdUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20940);
    paramView = new Intent();
    paramView.putExtra("free_wifi_show_detail_error", 1);
    paramView.putExtra("free_wifi_error_ui_error_msg", this.myE.getString(2131300037));
    paramView.putExtra("free_wifi_error_ui_error_msg_detail1", this.myF);
    paramView.setClass(this.myE, FreeWifiErrorUI.class);
    this.myE.startActivity(paramView);
    AppMethodBeat.o(20940);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI.5
 * JD-Core Version:    0.6.2
 */