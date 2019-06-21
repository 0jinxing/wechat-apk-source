package com.tencent.mm.plugin.downloader.h;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.File;

public final class a
{
  public static void a(long paramLong, boolean paramBoolean, com.tencent.mm.pluginsdk.permission.a parama)
  {
    AppMethodBeat.i(2525);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if ((locala == null) || (locala.field_status != 3) || (!e.ct(locala.field_filePath)))
    {
      if (parama != null)
        parama.dT(false);
      AppMethodBeat.o(2525);
    }
    while (true)
    {
      return;
      a(locala.field_filePath, new a.1(locala, paramBoolean, parama));
      AppMethodBeat.o(2525);
    }
  }

  public static void a(Context paramContext, String paramString, aj paramaj)
  {
    AppMethodBeat.i(2527);
    paramaj = new a.2(paramaj);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.DownloadAppUtil", "null or nil appid");
      paramaj.dR(false);
    }
    paramString = g.bT(paramString, true);
    if ((paramString == null) || (bo.isNullOrNil(paramString.field_appId)))
    {
      ab.e("MicroMsg.DownloadAppUtil", "appinfo is null or appid is null");
      paramaj.dR(false);
      AppMethodBeat.o(2527);
    }
    while (true)
    {
      return;
      WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXAppExtendObject());
      localWXMediaMessage.sdkVer = 620954368;
      localWXMediaMessage.messageAction = null;
      localWXMediaMessage.messageExt = "WX_GameCenter";
      ab.d("MicroMsg.DownloadAppUtil", "launch game app from wx: appid: [%s], appname:[%s], openid:[%s]", new Object[] { paramString.field_appId, paramString.field_appName, paramString.field_openId });
      if (bo.isNullOrNil(paramString.field_openId))
      {
        ab.i("MicroMsg.DownloadAppUtil", "open id is null or nil, try to get from server:[%s]", new Object[] { paramString.field_appName });
        com.tencent.mm.plugin.s.a.bYL().wy(paramString.field_appId);
      }
      com.tencent.mm.ce.a.post(new a.3(paramContext, paramString, localWXMediaMessage, paramaj));
      AppMethodBeat.o(2527);
    }
  }

  public static void a(String paramString, com.tencent.mm.pluginsdk.permission.a parama)
  {
    AppMethodBeat.i(2526);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.DownloadAppUtil", "installApk, path is null");
      if (parama != null)
        parama.dT(false);
      AppMethodBeat.o(2526);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.DownloadAppUtil", "installApk, path = ".concat(String.valueOf(paramString)));
      if (!e.ct(paramString))
      {
        ab.e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
        if (parama != null)
          parama.dT(false);
        AppMethodBeat.o(2526);
      }
      else
      {
        paramString = new File(paramString);
        q.a(ah.getContext(), paramString, parama, true);
        AppMethodBeat.o(2526);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.h.a
 * JD-Core Version:    0.6.2
 */