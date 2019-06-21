package com.tencent.xweb.x5.sdk;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.x;
import java.util.HashMap;
import java.util.Map;
import org.xwalk.core.Log;

public final class d
{
  static a AQV;
  static boolean AQW;

  static
  {
    AppMethodBeat.i(4149);
    x.initInterface();
    AQW = false;
    AppMethodBeat.o(4149);
  }

  public static void a(Context paramContext, d.a parama)
  {
    try
    {
      AppMethodBeat.i(4135);
      if (AQV != null)
      {
        AQV.a(paramContext, parama);
        AppMethodBeat.o(4135);
      }
      while (true)
      {
        return;
        Log.e("TbsDownloader", "preInit: sImp is null");
        AppMethodBeat.o(4135);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void a(Context paramContext, String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    AppMethodBeat.i(4142);
    if (AQV != null)
    {
      AQV.a(paramContext, paramString, paramValueCallback);
      AppMethodBeat.o(4142);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "canOpenFile: sImp is null");
      AppMethodBeat.o(4142);
    }
  }

  public static void a(a parama)
  {
    AQV = parama;
  }

  public static void a(h paramh)
  {
    AppMethodBeat.i(4139);
    if (AQV != null)
    {
      AQV.a(paramh);
      AppMethodBeat.o(4139);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "setTbsListener: sImp is null");
      AppMethodBeat.o(4139);
    }
  }

  public static boolean a(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(4141);
    boolean bool;
    if (AQV != null)
    {
      bool = AQV.a(paramContext, paramString, paramHashMap, paramValueCallback);
      AppMethodBeat.o(4141);
    }
    while (true)
    {
      return bool;
      Log.e("TbsDownloader", "startQbOrMiniQBToLoadUrl: sImp is null");
      bool = false;
      AppMethodBeat.o(4141);
    }
  }

  public static boolean canOpenWebPlus(Context paramContext)
  {
    AppMethodBeat.i(4145);
    boolean bool;
    if (AQV != null)
    {
      bool = AQV.canOpenWebPlus(paramContext);
      AppMethodBeat.o(4145);
    }
    while (true)
    {
      return bool;
      Log.e("TbsDownloader", "canOpenWebPlus: sImp is null");
      bool = false;
      AppMethodBeat.o(4145);
    }
  }

  public static void closeFileReader(Context paramContext)
  {
    AppMethodBeat.i(4146);
    if (AQV != null)
    {
      AQV.closeFileReader(paramContext);
      AppMethodBeat.o(4146);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "closeFileReader: sImp is null");
      AppMethodBeat.o(4146);
    }
  }

  public static void forceSysWebView()
  {
    AppMethodBeat.i(4147);
    AQW = true;
    if (AQV != null)
    {
      AQV.forceSysWebView();
      AppMethodBeat.o(4147);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "forceSysWebView: sImp is null");
      AppMethodBeat.o(4147);
    }
  }

  public static boolean getTBSInstalling()
  {
    AppMethodBeat.i(4137);
    boolean bool;
    if (AQV != null)
    {
      bool = AQV.getTBSInstalling();
      AppMethodBeat.o(4137);
    }
    while (true)
    {
      return bool;
      Log.e("TbsDownloader", "getTBSInstalling: sImp is null");
      bool = false;
      AppMethodBeat.o(4137);
    }
  }

  public static int getTbsVersion(Context paramContext)
  {
    AppMethodBeat.i(4138);
    int i;
    if (AQV != null)
    {
      i = AQV.getTbsVersion(paramContext);
      AppMethodBeat.o(4138);
    }
    while (true)
    {
      return i;
      Log.e("TbsDownloader", "getTbsVersion: sImp is null");
      i = 0;
      AppMethodBeat.o(4138);
    }
  }

  public static void initTbsSettings(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(4144);
    if (AQV != null)
    {
      AQV.initTbsSettings(paramMap);
      AppMethodBeat.o(4144);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "initTbsSettings: sImp is null");
      AppMethodBeat.o(4144);
    }
  }

  public static boolean isTbsCoreInited()
  {
    AppMethodBeat.i(4143);
    boolean bool;
    if (AQV != null)
    {
      bool = AQV.isTbsCoreInited();
      AppMethodBeat.o(4143);
    }
    while (true)
    {
      return bool;
      Log.e("TbsDownloader", "isTbsCoreInited: sImp is null");
      bool = false;
      AppMethodBeat.o(4143);
    }
  }

  public static void reset(Context paramContext)
  {
    AppMethodBeat.i(4136);
    if (AQV != null)
    {
      AQV.reset(paramContext);
      AppMethodBeat.o(4136);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "reset: sImp is null");
      AppMethodBeat.o(4136);
    }
  }

  public static void setUploadCode(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(4148);
    if (AQV != null)
    {
      AQV.setUploadCode(paramContext, paramInt);
      AppMethodBeat.o(4148);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "forceSysWebView: sImp is null");
      AppMethodBeat.o(4148);
    }
  }

  public static int startMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(4140);
    int i;
    if (AQV != null)
    {
      i = AQV.startMiniQBToLoadUrl(paramContext, paramString, paramHashMap, paramValueCallback);
      AppMethodBeat.o(4140);
    }
    while (true)
    {
      return i;
      Log.e("TbsDownloader", "startMiniQBToLoadUrl: sImp is null");
      i = 0;
      AppMethodBeat.o(4140);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.sdk.d
 * JD-Core Version:    0.6.2
 */