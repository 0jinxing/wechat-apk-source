package com.tencent.qqmusic.mediaplayer;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class NLog
{
  private static final int LEVEL_DEBUG = 1;
  private static final int LEVEL_ERROR = 4;
  private static final int LEVEL_INFO = 2;
  private static final int LEVEL_WARNING = 3;
  private static final String TAG = "NLog";
  private static volatile boolean mIsLoadSuccess = false;

  public static void D(String paramString1, String paramString2)
  {
    AppMethodBeat.i(128446);
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      AppMethodBeat.o(128446);
    }
    while (true)
    {
      return;
      try
      {
        d(paramString1, paramString2);
        AppMethodBeat.o(128446);
      }
      catch (UnsatisfiedLinkError paramString1)
      {
        Logger.e("NLog", paramString1);
        AppMethodBeat.o(128446);
      }
    }
  }

  public static void D(String paramString1, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(128450);
    d(paramString1, paramString2 + "\n" + Log.getStackTraceString(paramThrowable));
    AppMethodBeat.o(128450);
  }

  public static void E(String paramString1, String paramString2)
  {
    AppMethodBeat.i(128449);
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      AppMethodBeat.o(128449);
    }
    while (true)
    {
      return;
      try
      {
        e(paramString1, paramString2);
        AppMethodBeat.o(128449);
      }
      catch (UnsatisfiedLinkError paramString1)
      {
        Logger.e("NLog", paramString1);
        AppMethodBeat.o(128449);
      }
    }
  }

  public static void E(String paramString1, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(128453);
    e(paramString1, paramString2 + "\n" + Log.getStackTraceString(paramThrowable));
    AppMethodBeat.o(128453);
  }

  public static String GetLogPath()
  {
    AppMethodBeat.i(128445);
    String str1;
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      str1 = "";
      AppMethodBeat.o(128445);
    }
    while (true)
    {
      return str1;
      try
      {
        str1 = getLogPath();
        AppMethodBeat.o(128445);
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        Logger.e("NLog", localUnsatisfiedLinkError);
        String str2 = "";
        AppMethodBeat.o(128445);
      }
    }
  }

  public static void I(String paramString1, String paramString2)
  {
    AppMethodBeat.i(128447);
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      AppMethodBeat.o(128447);
    }
    while (true)
    {
      return;
      try
      {
        i(paramString1, paramString2);
        AppMethodBeat.o(128447);
      }
      catch (UnsatisfiedLinkError paramString1)
      {
        Logger.e("NLog", paramString1);
        AppMethodBeat.o(128447);
      }
    }
  }

  public static void I(String paramString1, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(128451);
    i(paramString1, paramString2 + "\n" + Log.getStackTraceString(paramThrowable));
    AppMethodBeat.o(128451);
  }

  public static boolean Start(String paramString, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(128442);
    boolean bool2;
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      AppMethodBeat.o(128442);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        bool2 = start(paramString, paramInt);
        AppMethodBeat.o(128442);
      }
      catch (UnsatisfiedLinkError paramString)
      {
        Logger.e("NLog", paramString);
        AppMethodBeat.o(128442);
        bool2 = bool1;
      }
    }
  }

  public static void Stop()
  {
    AppMethodBeat.i(128443);
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      AppMethodBeat.o(128443);
    }
    while (true)
    {
      return;
      try
      {
        stop();
        AppMethodBeat.o(128443);
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        Logger.e("NLog", localUnsatisfiedLinkError);
        AppMethodBeat.o(128443);
      }
    }
  }

  public static void W(String paramString1, String paramString2)
  {
    AppMethodBeat.i(128448);
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      AppMethodBeat.o(128448);
    }
    while (true)
    {
      return;
      try
      {
        w(paramString1, paramString2);
        AppMethodBeat.o(128448);
      }
      catch (UnsatisfiedLinkError paramString1)
      {
        Logger.e("NLog", paramString1);
        AppMethodBeat.o(128448);
      }
    }
  }

  public static void W(String paramString1, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(128452);
    w(paramString1, paramString2 + "\n" + Log.getStackTraceString(paramThrowable));
    AppMethodBeat.o(128452);
  }

  private static void WriteLogCallback(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(128441);
    switch (paramInt)
    {
    default:
      Logger.i(paramString1, paramString2);
      AppMethodBeat.o(128441);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      Logger.d(paramString1, paramString2);
      AppMethodBeat.o(128441);
      continue;
      Logger.i(paramString1, paramString2);
      AppMethodBeat.o(128441);
      continue;
      Logger.w(paramString1, paramString2);
      AppMethodBeat.o(128441);
      continue;
      Logger.e(paramString1, paramString2);
      AppMethodBeat.o(128441);
    }
  }

  private static native void d(String paramString1, String paramString2);

  private static native void e(String paramString1, String paramString2);

  private static native String getLogPath();

  private static native void i(String paramString1, String paramString2);

  public static boolean init(String paramString1, String paramString2, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(128454);
    if (AudioPlayerConfigure.getSoLibraryLoader().load(paramString1))
    {
      mIsLoadSuccess = true;
      Start(paramString2, paramInt);
      AppMethodBeat.o(128454);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(128454);
    }
  }

  private static native void setLogWriteCallback(int paramInt);

  public static void setWriteCallback(boolean paramBoolean)
  {
    AppMethodBeat.i(128444);
    if (!mIsLoadSuccess)
    {
      Logger.e("NLog", "Not load NLog lib!!!");
      AppMethodBeat.o(128444);
    }
    while (true)
    {
      return;
      int i;
      if (paramBoolean)
        i = 1;
      try
      {
        while (true)
        {
          setLogWriteCallback(i);
          AppMethodBeat.o(128444);
          break;
          i = 0;
        }
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        Logger.e("NLog", localUnsatisfiedLinkError);
        AppMethodBeat.o(128444);
      }
    }
  }

  private static native boolean start(String paramString, int paramInt);

  private static native void stop();

  private static native void w(String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.NLog
 * JD-Core Version:    0.6.2
 */