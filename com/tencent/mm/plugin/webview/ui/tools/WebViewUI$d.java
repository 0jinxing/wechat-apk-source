package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class WebViewUI$d
{
  private String lang;
  private String ujA;
  private String ujB;
  private String ujC;
  private String ujD;
  private String ujE;
  private String ujz;
  private String uxB;

  private WebViewUI$d(Bundle paramBundle)
  {
    AppMethodBeat.i(7891);
    this.uxB = paramBundle.getString("close_window_confirm_dialog_switch");
    this.ujz = paramBundle.getString("close_window_confirm_dialog_title_cn");
    this.ujA = paramBundle.getString("close_window_confirm_dialog_title_eng");
    this.ujB = paramBundle.getString("close_window_confirm_dialog_ok_cn");
    this.ujC = paramBundle.getString("close_window_confirm_dialog_ok_eng");
    this.ujD = paramBundle.getString("close_window_confirm_dialog_cancel_cn");
    this.ujE = paramBundle.getString("close_window_confirm_dialog_cancel_eng");
    this.lang = paramBundle.getString("application_language");
    AppMethodBeat.o(7891);
  }

  public static d ad(Bundle paramBundle)
  {
    AppMethodBeat.i(7892);
    paramBundle = new d(paramBundle);
    AppMethodBeat.o(7892);
    return paramBundle;
  }

  public final boolean cXi()
  {
    AppMethodBeat.i(7893);
    boolean bool;
    if (bo.isNullOrNil(this.uxB))
    {
      bool = false;
      AppMethodBeat.o(7893);
    }
    while (true)
    {
      return bool;
      bool = this.uxB.equals("true");
      AppMethodBeat.o(7893);
    }
  }

  public final String cXk()
  {
    AppMethodBeat.i(7895);
    String str;
    if ("zh_CN".equals(this.lang))
    {
      str = this.ujB;
      AppMethodBeat.o(7895);
    }
    while (true)
    {
      return str;
      str = this.ujC;
      AppMethodBeat.o(7895);
    }
  }

  public final String cXl()
  {
    AppMethodBeat.i(7896);
    String str;
    if ("zh_CN".equals(this.lang))
    {
      str = this.ujD;
      AppMethodBeat.o(7896);
    }
    while (true)
    {
      return str;
      str = this.ujE;
      AppMethodBeat.o(7896);
    }
  }

  public final String daM()
  {
    AppMethodBeat.i(7894);
    String str;
    if ("zh_CN".equals(this.lang))
    {
      str = this.ujz;
      AppMethodBeat.o(7894);
    }
    while (true)
    {
      return str;
      str = this.ujA;
      AppMethodBeat.o(7894);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.d
 * JD-Core Version:    0.6.2
 */