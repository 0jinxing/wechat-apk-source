package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Util4Phone
{
  private static final String TAG = "Util4Phone";

  public static boolean isSupportNeon()
  {
    AppMethodBeat.i(128386);
    boolean bool1 = false;
    try
    {
      boolean bool2 = Util4NativeCommon.isSupportNeon();
      bool1 = bool2;
      AppMethodBeat.o(128386);
      return bool1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        Logger.e("Util4Phone", "isSupportNeon", localThrowable);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.Util4Phone
 * JD-Core Version:    0.6.2
 */