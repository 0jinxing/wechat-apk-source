package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.g;
import java.net.URI;
import java.net.URL;

final class m$2
  implements DialogInterface.OnClickListener
{
  m$2(m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23592);
    paramDialogInterface = "http://tools.3g.qq.com/j/wechatandriodpim";
    if (g.cdf == 1)
    {
      paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tencent.qqpim")).addFlags(268435456);
      if (bo.k(this.pnr.context, paramDialogInterface))
      {
        this.pnr.context.startActivity(paramDialogInterface);
        AppMethodBeat.o(23592);
      }
    }
    while (true)
    {
      return;
      paramDialogInterface = "https://play.google.com/store/apps/details?id=com.tencent.qqpim";
      try
      {
        Object localObject = new java/net/URL;
        ((URL)localObject).<init>(paramDialogInterface);
        paramDialogInterface = new java/net/URI;
        paramDialogInterface.<init>(((URL)localObject).getProtocol(), ((URL)localObject).getUserInfo(), ((URL)localObject).getHost(), ((URL)localObject).getPort(), ((URL)localObject).getPath(), ((URL)localObject).getQuery(), ((URL)localObject).getRef());
        paramDialogInterface = paramDialogInterface.toURL();
        localObject = new com/tencent/mm/plugin/downloader/model/e$a;
        ((e.a)localObject).<init>();
        ((e.a)localObject).Iv("qqpim.apk");
        ((e.a)localObject).It(paramDialogInterface.toString());
        ((e.a)localObject).ga(true);
        ((e.a)localObject).tN(1);
        d.bij().a(((e.a)localObject).kNl);
        AppMethodBeat.o(23592);
      }
      catch (Exception paramDialogInterface)
      {
        ab.e("MicroMsg.ContactWidgetQQSync", "dz[download qq mail error:%s]", new Object[] { paramDialogInterface.toString() });
        AppMethodBeat.o(23592);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.m.2
 * JD-Core Version:    0.6.2
 */