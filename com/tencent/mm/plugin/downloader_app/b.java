package com.tencent.mm.plugin.downloader_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import com.tencent.mm.plugin.downloader_app.a.a.c;
import com.tencent.mm.plugin.downloader_app.b.j;
import com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI;
import com.tencent.mm.plugin.webview.luggage.o;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.downloader_app.a.d
{
  private static String IA(String paramString)
  {
    AppMethodBeat.i(136024);
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        str1 = URLDecoder.decode(paramString, "utf-8");
      }
      catch (UnsupportedEncodingException paramString)
      {
        try
        {
          String str1;
          paramString = new org/json/JSONObject;
          paramString.<init>(str1);
          localObject = paramString;
          if (paramString == null)
            localObject = new JSONObject();
          if (((JSONObject)localObject).optInt("OpInWidget") == 1)
            ((JSONObject)localObject).remove("OpInWidget");
        }
        catch (Exception paramString)
        {
          try
          {
            ((JSONObject)localObject).put("DownloadInWidget", 1);
            try
            {
              paramString = URLEncoder.encode(((JSONObject)localObject).toString(), "utf-8");
              AppMethodBeat.o(136024);
              return paramString;
              localUnsupportedEncodingException = localUnsupportedEncodingException;
              str2 = paramString;
              continue;
              paramString = paramString;
              paramString = null;
            }
            catch (UnsupportedEncodingException paramString)
            {
              paramString = str2;
              continue;
            }
          }
          catch (JSONException paramString)
          {
            continue;
          }
        }
      }
      Object localObject = null;
      String str2 = paramString;
      paramString = (String)localObject;
    }
  }

  public final void Iz(String paramString)
  {
    AppMethodBeat.i(136023);
    if (!j.contains(paramString))
    {
      LinkedList localLinkedList = j.biP();
      localLinkedList.add(paramString);
      com.tencent.mm.plugin.downloader_app.b.g.a(localLinkedList, null);
      j.Iz(paramString);
    }
    AppMethodBeat.o(136023);
  }

  public final long a(com.tencent.mm.plugin.downloader_app.b.a parama, a.b paramb)
  {
    AppMethodBeat.i(136017);
    parama.extInfo = IA(parama.extInfo);
    long l = com.tencent.mm.plugin.downloader_app.b.c.a(parama, paramb);
    AppMethodBeat.o(136017);
    return l;
  }

  public final void a(Context paramContext, Intent paramIntent, a.c paramc)
  {
    AppMethodBeat.i(136016);
    if (paramContext == null)
    {
      if (paramc != null)
        paramc.biB();
      AppMethodBeat.o(136016);
    }
    while (true)
    {
      return;
      Intent localIntent = paramIntent;
      if (paramIntent == null)
        localIntent = new Intent();
      localIntent.getExtras();
      localIntent.setClass(paramContext, DownloadMainUI.class);
      paramContext.startActivity(localIntent);
      if (paramc != null)
        paramc.biB();
      AppMethodBeat.o(136016);
    }
  }

  public final boolean a(long paramLong, boolean paramBoolean, a.b paramb)
  {
    AppMethodBeat.i(136022);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if (locala != null)
    {
      locala.field_extInfo = IA(locala.field_extInfo);
      com.tencent.mm.plugin.downloader.model.c.e(locala);
      paramBoolean = com.tencent.mm.plugin.downloader_app.b.c.a(locala, paramBoolean, paramb);
      AppMethodBeat.o(136022);
    }
    while (true)
    {
      return paramBoolean;
      paramb.a(com.tencent.mm.plugin.downloader_app.a.a.a.kOa, paramLong);
      paramBoolean = false;
      AppMethodBeat.o(136022);
    }
  }

  public final void ak(Context paramContext, String paramString)
  {
    AppMethodBeat.i(136018);
    l.postDelayed(new b.1(this, paramContext, paramString), 200L);
    AppMethodBeat.o(136018);
  }

  public final boolean bix()
  {
    AppMethodBeat.i(136014);
    boolean bool = j.bix();
    AppMethodBeat.o(136014);
    return bool;
  }

  public final void biy()
  {
    AppMethodBeat.i(136015);
    j.biO();
    AppMethodBeat.o(136015);
  }

  public final LinkedList<com.tencent.mm.plugin.downloader_app.a.b> biz()
  {
    AppMethodBeat.i(136019);
    Object localObject1 = j.biQ();
    Object localObject2;
    if (bo.ek((List)localObject1))
    {
      localObject2 = null;
      AppMethodBeat.o(136019);
    }
    while (true)
    {
      return localObject2;
      localObject2 = new LinkedList();
      Iterator localIterator = ((LinkedList)localObject1).iterator();
      while (localIterator.hasNext())
      {
        Object localObject3 = (String)localIterator.next();
        localObject1 = new com.tencent.mm.plugin.downloader_app.a.b();
        ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).appId = ((String)localObject3);
        localObject3 = com.tencent.mm.plugin.downloader.model.d.bij().Ir((String)localObject3);
        if (localObject3 != null)
        {
          ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).crZ = ((FileDownloadTaskInfo)localObject3).id;
          switch (((FileDownloadTaskInfo)localObject3).status)
          {
          default:
            ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).kOe = "default";
            label138: if (((FileDownloadTaskInfo)localObject3).jrb > 0L)
              ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).progress = ((int)(((FileDownloadTaskInfo)localObject3).kNr * 100L / ((FileDownloadTaskInfo)localObject3).jrb));
            if (!((com.tencent.mm.plugin.downloader_app.a.b)localObject1).kOe.equals("default"))
              if (((com.tencent.mm.plugin.downloader_app.a.b)localObject1).progress != 0)
                break label258;
            break;
          case 1:
          case 3:
          case 2:
          case 4:
          }
          label258: for (int i = 1; ; i = ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).progress)
          {
            ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).progress = i;
            if (((FileDownloadTaskInfo)localObject3).kNu)
              ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).kNu = true;
            ((LinkedList)localObject2).add(localObject1);
            break;
            ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).kOe = "downloading";
            break label138;
            ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).kOe = "download_succ";
            break label138;
            ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).kOe = "download_pause";
            break label138;
            ((com.tencent.mm.plugin.downloader_app.a.b)localObject1).kOe = "download_fail";
            break label138;
          }
        }
      }
      AppMethodBeat.o(136019);
    }
  }

  public final void f(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(136020);
    if (paramContext == null)
      AppMethodBeat.o(136020);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lFH, false))
      {
        o.C(paramContext, localIntent);
        AppMethodBeat.o(136020);
      }
      else
      {
        com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.game.GameWebViewUI", localIntent);
        AppMethodBeat.o(136020);
      }
    }
  }

  public final void kP(String paramString)
  {
    AppMethodBeat.i(136021);
    j.kP(paramString);
    AppMethodBeat.o(136021);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b
 * JD-Core Version:    0.6.2
 */