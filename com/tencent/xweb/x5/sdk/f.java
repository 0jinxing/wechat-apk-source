package com.tencent.xweb.x5.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.x;
import org.xwalk.core.Log;

public final class f
{
  static b AQZ;

  static
  {
    AppMethodBeat.i(4158);
    x.initInterface();
    AppMethodBeat.o(4158);
  }

  public static void a(b paramb)
  {
    AQZ = paramb;
  }

  public static boolean a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, f.a parama)
  {
    AppMethodBeat.i(4152);
    if (AQZ != null)
    {
      paramBoolean1 = AQZ.a(paramContext, paramBoolean1, paramBoolean2, parama);
      AppMethodBeat.o(4152);
    }
    while (true)
    {
      return paramBoolean1;
      Log.e("TbsDownloader", "needDownload: sImp is null");
      paramBoolean1 = false;
      AppMethodBeat.o(4152);
    }
  }

  public static boolean isDownloadForeground()
  {
    AppMethodBeat.i(4157);
    boolean bool;
    if (AQZ != null)
    {
      bool = AQZ.isDownloadForeground();
      AppMethodBeat.o(4157);
    }
    while (true)
    {
      return bool;
      Log.e("TbsDownloader", "isDownloadForeground: sImp is null");
      bool = false;
      AppMethodBeat.o(4157);
    }
  }

  public static boolean isDownloading()
  {
    try
    {
      AppMethodBeat.i(4156);
      boolean bool;
      if (AQZ != null)
      {
        bool = AQZ.isDownloading();
        AppMethodBeat.o(4156);
      }
      while (true)
      {
        return bool;
        Log.e("TbsDownloader", "isDownloading: sImp is null");
        bool = false;
        AppMethodBeat.o(4156);
      }
    }
    finally
    {
    }
  }

  public static boolean jA(Context paramContext)
  {
    AppMethodBeat.i(4150);
    boolean bool;
    if (AQZ != null)
    {
      bool = AQZ.jA(paramContext);
      AppMethodBeat.o(4150);
    }
    while (true)
    {
      return bool;
      Log.e("TbsDownloader", "needSendRequest: sImp is null");
      bool = false;
      AppMethodBeat.o(4150);
    }
  }

  public static boolean needDownload(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(4151);
    paramBoolean = a(paramContext, paramBoolean, false, null);
    AppMethodBeat.o(4151);
    return paramBoolean;
  }

  public static void startDownload(Context paramContext)
  {
    AppMethodBeat.i(4153);
    startDownload(paramContext, false);
    AppMethodBeat.o(4153);
  }

  public static void startDownload(Context paramContext, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(4154);
      if (AQZ != null)
      {
        AQZ.startDownload(paramContext, paramBoolean);
        AppMethodBeat.o(4154);
      }
      while (true)
      {
        return;
        Log.e("TbsDownloader", "startDownload: sImp is null");
        AppMethodBeat.o(4154);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void stopDownload()
  {
    AppMethodBeat.i(4155);
    if (AQZ != null)
    {
      AQZ.stopDownload();
      AppMethodBeat.o(4155);
    }
    while (true)
    {
      return;
      Log.e("TbsDownloader", "stopDownload: sImp is null");
      AppMethodBeat.o(4155);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.sdk.f
 * JD-Core Version:    0.6.2
 */