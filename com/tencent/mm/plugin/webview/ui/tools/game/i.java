package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.base.h;
import org.json.JSONObject;

public final class i
{
  private static void a(Context paramContext, long paramLong, i.a parama)
  {
    AppMethodBeat.i(8803);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if (locala == null)
    {
      parama.d("fail", null);
      AppMethodBeat.o(8803);
    }
    while (true)
    {
      return;
      PBool localPBool = new PBool();
      JSONObject localJSONObject = new JSONObject();
      ((com.tencent.mm.plugin.downloader_app.a.c)g.K(com.tencent.mm.plugin.downloader_app.a.c.class)).b(paramContext, locala.field_appId, new i.8(localPBool, locala, parama), new i.9(localPBool, localJSONObject, locala, parama), new i.10(localPBool, parama));
      AppMethodBeat.o(8803);
    }
  }

  public static void a(Context paramContext, long paramLong, boolean paramBoolean, i.a parama)
  {
    AppMethodBeat.i(8801);
    if (paramLong <= 0L)
    {
      ab.e("MicroMsg.JsApiGameDownloadManager", "fail, invalid downloadId = ".concat(String.valueOf(paramLong)));
      parama.d("invalid_downloadid", null);
      AppMethodBeat.o(8801);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
      if (locala == null)
      {
        parama.d("fail", null);
        AppMethodBeat.o(8801);
      }
      else
      {
        Object localObject = com.tencent.mm.plugin.downloader.model.d.bij().hm(locala.field_downloadId);
        if (localObject != null)
        {
          if (((FileDownloadTaskInfo)localObject).status == 1)
          {
            parama.d(null, null);
            AppMethodBeat.o(8801);
          }
          else if (((FileDownloadTaskInfo)localObject).status == 3)
          {
            com.tencent.mm.plugin.downloader.h.a.a(((FileDownloadTaskInfo)localObject).id, false, null);
            parama.d(null, null);
            AppMethodBeat.o(8801);
          }
        }
        else if (at.isWifi(paramContext))
        {
          a(locala, false, parama);
          AppMethodBeat.o(8801);
        }
        else if (paramBoolean)
        {
          if (locala.field_reserveInWifi)
          {
            a(paramContext, locala.field_downloadId, parama);
            AppMethodBeat.o(8801);
          }
          else
          {
            localObject = new PBool();
            ((com.tencent.mm.plugin.downloader_app.a.c)g.K(com.tencent.mm.plugin.downloader_app.a.c.class)).a(paramContext, locala.field_appId, new i.2((PBool)localObject, locala, parama), new i.3((PBool)localObject, locala, parama), new i.4((PBool)localObject, parama));
            AppMethodBeat.o(8801);
          }
        }
        else
        {
          if (locala.field_reserveInWifi)
          {
            locala.field_downloadInWifi = false;
            locala.field_reserveInWifi = false;
            com.tencent.mm.plugin.downloader.model.c.e(locala);
          }
          h.a(paramContext, paramContext.getString(2131305542), paramContext.getString(2131305543), paramContext.getString(2131305537), paramContext.getString(2131296868), false, new i.5(locala, parama), new i.6(parama), 2131690683);
          AppMethodBeat.o(8801);
        }
      }
    }
  }

  public static void a(Context paramContext, com.tencent.mm.plugin.downloader_app.b.a parama, i.a parama1)
  {
    AppMethodBeat.i(8799);
    if ((parama == null) || (!parama.isValid()))
    {
      parama1.d("fail", null);
      AppMethodBeat.o(8799);
    }
    while (true)
    {
      return;
      if (!at.isNetworkConnected(paramContext))
      {
        parama1.d("network_not_connected", null);
        com.tencent.mm.ce.a.q(new i.1(paramContext));
        ab.i("MicroMsg.JsApiGameDownloadManager", " fail, network not ready");
        AppMethodBeat.o(8799);
      }
      else if (!f.Mn())
      {
        parama1.d("sdcard_not_ready", null);
        com.tencent.mm.ce.a.q(new i.11(paramContext));
        ab.i("MicroMsg.JsApiGameDownloadManager", " fail, sdcard not ready");
        AppMethodBeat.o(8799);
      }
      else if ((parama.kOC > 0L) && (!f.eW(parama.kOC)))
      {
        parama1.d("has_not_enough_space", null);
        com.tencent.mm.plugin.webview.luggage.c.c.runOnUiThread(new i.12(paramContext));
        ab.i("MicroMsg.JsApiGameDownloadManager", "fail, not enough space, require size = " + parama.kOC);
        AppMethodBeat.o(8799);
      }
      else
      {
        com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.Iq(parama.downloadUrl);
        Object localObject;
        if (locala != null)
        {
          localObject = com.tencent.mm.plugin.downloader.model.d.bij().hm(locala.field_downloadId);
          if (localObject != null)
          {
            if (((FileDownloadTaskInfo)localObject).status == 1)
            {
              parama1.d(null, null);
              AppMethodBeat.o(8799);
              continue;
            }
            if (((FileDownloadTaskInfo)localObject).status == 3)
            {
              com.tencent.mm.plugin.downloader.h.a.a(((FileDownloadTaskInfo)localObject).id, false, null);
              parama1.d(null, null);
              AppMethodBeat.o(8799);
              continue;
            }
            if ((parama.kNt) && (locala.field_reserveInWifi) && (!at.isWifi(paramContext)))
            {
              a(paramContext, locala.field_downloadId, parama1);
              AppMethodBeat.o(8799);
            }
          }
        }
        else if (at.isWifi(paramContext))
        {
          a(parama, parama1, false);
          AppMethodBeat.o(8799);
        }
        else if (parama.kNt)
        {
          localObject = new PBool();
          ((com.tencent.mm.plugin.downloader_app.a.c)g.K(com.tencent.mm.plugin.downloader_app.a.c.class)).a(paramContext, parama.appId, new i.13((PBool)localObject, parama, parama1), new i.14((PBool)localObject, parama, parama1), new i.15((PBool)localObject, parama1));
          AppMethodBeat.o(8799);
        }
        else
        {
          h.a(paramContext, paramContext.getString(2131305542), paramContext.getString(2131305543), paramContext.getString(2131305537), paramContext.getString(2131296868), false, new i.16(parama, parama1), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(8797);
              paramAnonymousDialogInterface.dismiss();
              this.uEo.d("network_not_wifi", null);
              AppMethodBeat.o(8797);
            }
          }
          , 2131690683);
          AppMethodBeat.o(8799);
        }
      }
    }
  }

  static void a(com.tencent.mm.plugin.downloader.f.a parama, boolean paramBoolean, i.a parama1)
  {
    AppMethodBeat.i(8802);
    com.tencent.mm.modelstat.d.b(10, "LuggageGameWebViewUI_resumeGameDownloadTask", "JsApiGameDownloadManager".hashCode());
    ((com.tencent.mm.plugin.downloader_app.a.d)g.K(com.tencent.mm.plugin.downloader_app.a.d.class)).a(parama.field_downloadId, paramBoolean, new i.7(paramBoolean, parama1));
    AppMethodBeat.o(8802);
  }

  static void a(com.tencent.mm.plugin.downloader_app.b.a parama, i.a parama1, boolean paramBoolean)
  {
    AppMethodBeat.i(8800);
    parama.kNt = paramBoolean;
    ((com.tencent.mm.plugin.downloader_app.a.d)g.K(com.tencent.mm.plugin.downloader_app.a.d.class)).a(parama, new i.18(parama1));
    AppMethodBeat.o(8800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i
 * JD-Core Version:    0.6.2
 */