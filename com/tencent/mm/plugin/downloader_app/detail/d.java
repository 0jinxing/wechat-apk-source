package com.tencent.mm.plugin.downloader_app.detail;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
{
  private static k kOm;
  private static String kOn = "";
  private static String kOo = "action_id";
  private static String kOp = "preload_url";
  private static String kOq = "detail_url";
  private static int kOr = 1;
  private static int kOs = 2;
  private static int kOt = 3;
  private static int kOu = 4;

  public static void IC(String paramString)
  {
    AppMethodBeat.i(136058);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(136058);
    while (true)
    {
      return;
      if (ah.doF())
        break;
      localObject = new Bundle();
      ((Bundle)localObject).putInt(kOo, kOt);
      ((Bundle)localObject).putString(kOp, paramString);
      ToolsProcessIPCService.a((Parcelable)localObject, d.a.class, null);
      AppMethodBeat.o(136058);
    }
    int i = paramString.indexOf("appid");
    Object localObject = "";
    if (i != -1)
    {
      int j = paramString.indexOf('&', i);
      int k = j;
      if (j == -1)
        k = paramString.length();
      localObject = paramString.substring(i, k);
    }
    if (!bo.isNullOrNil((String)localObject));
    for (paramString = paramString.replace((CharSequence)localObject, ""); ; paramString = "")
    {
      if ((!bo.isNullOrNil(paramString)) && (!paramString.equals(kOn)))
      {
        kOn = paramString;
        ab.i("MicroMsg.PreloadDetailHelp", "setPreloadlUrl : %s", new Object[] { kOn });
        biC();
      }
      AppMethodBeat.o(136058);
      break;
    }
  }

  private static void biC()
  {
    AppMethodBeat.i(136059);
    if (!ah.doF())
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt(kOo, kOr);
      ToolsProcessIPCService.a(localBundle, d.a.class, null);
      AppMethodBeat.o(136059);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(kOn))
      {
        AppMethodBeat.o(136059);
      }
      else
      {
        com.tencent.mm.plugin.game.luggage.d.a(b.class, kOn, new d.1());
        AppMethodBeat.o(136059);
      }
    }
  }

  public static k dC(Context paramContext)
  {
    AppMethodBeat.i(136060);
    if (kOm != null)
      kOm.setContext(paramContext);
    l.postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(136055);
        d.BK();
        AppMethodBeat.o(136055);
      }
    }
    , 50L);
    paramContext = kOm;
    kOm = null;
    AppMethodBeat.o(136060);
    return paramContext;
  }

  public static void destroy()
  {
    AppMethodBeat.i(136062);
    if (!ah.doF())
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt(kOo, kOs);
      ToolsProcessIPCService.a(localBundle, d.a.class, null);
      AppMethodBeat.o(136062);
    }
    while (true)
    {
      return;
      if (kOm != null)
      {
        kOm.destroy();
        kOm = null;
      }
      AppMethodBeat.o(136062);
    }
  }

  public static void setUrl(String paramString)
  {
    AppMethodBeat.i(136061);
    if (ah.doF())
    {
      if (kOm == null)
        break label96;
      ab.i("MicroMsg.PreloadDetailHelp", "setUrl: %s", new Object[] { paramString });
      paramString = Uri.parse(paramString).getQueryParameter("appid");
      kOm.a(new d.3(paramString));
      AppMethodBeat.o(136061);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putInt(kOo, kOu);
      localBundle.putString(kOq, paramString);
      ToolsProcessIPCService.a(localBundle, d.a.class, null);
      label96: AppMethodBeat.o(136061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.d
 * JD-Core Version:    0.6.2
 */