package com.tencent.magicbrush.engine;

import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class JsInspector
{
  private static JsInspector.a bSE;

  static native int JniNotify(long paramLong1, long paramLong2, String paramString);

  static native void JniReceiveData(long paramLong, String paramString);

  @Keep
  public static int jniCallbackNotify(long paramLong1, long paramLong2, String paramString)
  {
    AppMethodBeat.i(115883);
    int i;
    if (bSE == null)
    {
      i = -1;
      AppMethodBeat.o(115883);
    }
    while (true)
    {
      return i;
      i = bSE.yD();
      AppMethodBeat.o(115883);
    }
  }

  @Keep
  public static int jniCallbackSendData(long paramLong, String paramString)
  {
    AppMethodBeat.i(115882);
    int i;
    if (bSE == null)
    {
      i = -1;
      AppMethodBeat.o(115882);
    }
    while (true)
    {
      return i;
      i = bSE.yC();
      AppMethodBeat.o(115882);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.engine.JsInspector
 * JD-Core Version:    0.6.2
 */