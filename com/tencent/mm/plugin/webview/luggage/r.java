package com.tencent.mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class r
{
  private String lang;
  private String ujA;
  private String ujB;
  private String ujC;
  private String ujD;
  private String ujE;
  private boolean ujy;
  private String ujz;

  public r(Bundle paramBundle)
  {
    AppMethodBeat.i(6233);
    this.ujy = paramBundle.getBoolean("close_window_confirm_dialog_switch");
    this.ujz = paramBundle.getString("close_window_confirm_dialog_title_cn");
    this.ujA = paramBundle.getString("close_window_confirm_dialog_title_eng");
    this.ujB = paramBundle.getString("close_window_confirm_dialog_ok_cn");
    this.ujC = paramBundle.getString("close_window_confirm_dialog_ok_eng");
    this.ujD = paramBundle.getString("close_window_confirm_dialog_cancel_cn");
    this.ujE = paramBundle.getString("close_window_confirm_dialog_cancel_eng");
    this.lang = aa.gw(ah.getContext());
    AppMethodBeat.o(6233);
  }

  public final boolean cXi()
  {
    AppMethodBeat.i(6234);
    boolean bool;
    if ((this.ujy) && (!bo.isNullOrNil(cXj())) && (!bo.isNullOrNil(cXk())) && (!bo.isNullOrNil(cXl())))
    {
      bool = true;
      AppMethodBeat.o(6234);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6234);
    }
  }

  public final String cXj()
  {
    AppMethodBeat.i(6235);
    String str;
    if ("zh_CN".equals(this.lang))
    {
      str = this.ujz;
      AppMethodBeat.o(6235);
    }
    while (true)
    {
      return str;
      str = this.ujA;
      AppMethodBeat.o(6235);
    }
  }

  public final String cXk()
  {
    AppMethodBeat.i(6236);
    String str;
    if ("zh_CN".equals(this.lang))
    {
      str = this.ujB;
      AppMethodBeat.o(6236);
    }
    while (true)
    {
      return str;
      str = this.ujC;
      AppMethodBeat.o(6236);
    }
  }

  public final String cXl()
  {
    AppMethodBeat.i(6237);
    String str;
    if ("zh_CN".equals(this.lang))
    {
      str = this.ujD;
      AppMethodBeat.o(6237);
    }
    while (true)
    {
      return str;
      str = this.ujE;
      AppMethodBeat.o(6237);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.r
 * JD-Core Version:    0.6.2
 */