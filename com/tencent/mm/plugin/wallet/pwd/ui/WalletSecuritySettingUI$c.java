package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletSecuritySettingUI$c
{
  String desc;
  String oRi;
  int status;
  String title;
  String tsX;
  String tta;
  String ttb;
  String ttc;

  WalletSecuritySettingUI$c(WalletSecuritySettingUI paramWalletSecuritySettingUI, Context paramContext)
  {
    AppMethodBeat.i(46400);
    if (p.u(paramContext, "com.tencent.qqpimsecure"))
      if (bo.bH(paramContext, "com.tencent.server.back.BackEngine"))
      {
        this.status = 2;
        AppMethodBeat.o(46400);
      }
    while (true)
    {
      return;
      this.status = 1;
      AppMethodBeat.o(46400);
      continue;
      this.status = 0;
      AppMethodBeat.o(46400);
    }
  }

  private String gL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46402);
    paramString1 = Uri.parse(this.tsX).buildUpon().appendQueryParameter(paramString1, paramString2).build().toString();
    AppMethodBeat.o(46402);
    return paramString1;
  }

  public final String getUrl()
  {
    AppMethodBeat.i(46401);
    String str;
    if (this.status == 0)
    {
      str = gL("qqpimsecurestatus", "not_installed");
      AppMethodBeat.o(46401);
    }
    while (true)
    {
      return str;
      if (this.status == 1)
      {
        str = gL("qqpimsecurestatus", "not_run");
        AppMethodBeat.o(46401);
      }
      else
      {
        str = gL("qqpimsecurestatus", "runing");
        AppMethodBeat.o(46401);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI.c
 * JD-Core Version:    0.6.2
 */