package com.tencent.liteav.basic.log;

import android.os.Environment;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class TXCLog
{
  public static final int LOG_ASYNC = 0;
  public static final int LOG_DEBUG = 1;
  public static final int LOG_ERROR = 4;
  public static final int LOG_FATAL = 5;
  public static final int LOG_INFO = 2;
  public static final int LOG_NONE = 6;
  public static final int LOG_SYNC = 1;
  public static final int LOG_VERBOSE = 0;
  public static final int LOG_WARNING = 3;
  private static boolean mHasInit;
  private static TXCLog.a mListener;
  private static final Object mLogLock;

  static
  {
    AppMethodBeat.i(66092);
    mLogLock = new Object();
    mHasInit = false;
    mListener = null;
    b.e();
    AppMethodBeat.o(66092);
  }

  public static void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(66087);
    log(1, paramString1, paramString2);
    AppMethodBeat.o(66087);
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(66090);
    log(4, paramString1, paramString2);
    AppMethodBeat.o(66090);
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(66088);
    log(2, paramString1, paramString2);
    AppMethodBeat.o(66088);
  }

  public static void init()
  {
    AppMethodBeat.i(66082);
    synchronized (mLogLock)
    {
      if (!mHasInit)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/log/tencent/liteav";
        nativeLogInit();
        nativeLogSetLevel(0);
        nativeLogSetConsole(true);
        nativeLogOpen(0, (String)localObject2, "LiteAV");
        mHasInit = true;
      }
      AppMethodBeat.o(66082);
      return;
    }
  }

  public static void log(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(66083);
    init();
    nativeLog(paramInt, paramString1, "", 0, "", paramString2);
    log_callback(paramInt, paramString1, paramString2);
    AppMethodBeat.o(66083);
  }

  private static void log_callback(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(66091);
    if (mListener != null)
      mListener.a(paramInt, paramString1, paramString2);
    AppMethodBeat.o(66091);
  }

  private static native void nativeLog(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4);

  private static native void nativeLogClose();

  private static native void nativeLogInit();

  private static native void nativeLogOpen(int paramInt, String paramString1, String paramString2);

  private static native void nativeLogSetConsole(boolean paramBoolean);

  private static native void nativeLogSetLevel(int paramInt);

  public static void setConsoleEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(66085);
    init();
    nativeLogSetConsole(paramBoolean);
    AppMethodBeat.o(66085);
  }

  public static void setLevel(int paramInt)
  {
    AppMethodBeat.i(66084);
    init();
    nativeLogSetLevel(paramInt);
    AppMethodBeat.o(66084);
  }

  public static void setListener(TXCLog.a parama)
  {
    mListener = parama;
  }

  public static void v(String paramString1, String paramString2)
  {
    AppMethodBeat.i(66086);
    log(0, paramString1, paramString2);
    AppMethodBeat.o(66086);
  }

  public static void w(String paramString1, String paramString2)
  {
    AppMethodBeat.i(66089);
    log(3, paramString1, paramString2);
    AppMethodBeat.o(66089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.log.TXCLog
 * JD-Core Version:    0.6.2
 */