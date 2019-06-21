package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiCopyPwdUI$2
  implements View.OnClickListener
{
  FreeWifiCopyPwdUI$2(FreeWifiCopyPwdUI paramFreeWifiCopyPwdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20937);
    paramView = new Intent("android.settings.WIFI_SETTINGS");
    this.myE.startActivityForResult(paramView, FreeWifiCopyPwdUI.myy);
    AppMethodBeat.o(20937);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI.2
 * JD-Core Version:    0.6.2
 */