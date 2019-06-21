package com.tencent.mm.svg;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.svg.b.b;

public class WeChatSVG
{
  static
  {
    AppMethodBeat.i(70063);
    if (b.dvK())
    {
      System.loadLibrary("wechatsvg");
      nativeInit();
    }
    AppMethodBeat.o(70063);
  }

  public static native float[] getViewPort(long paramLong);

  private static native void nativeInit();

  public static native long parse(String paramString);

  public static native void release(long paramLong);

  public static native int render(long paramLong, Canvas paramCanvas);

  public static native int renderViewPort(long paramLong, Canvas paramCanvas, float paramFloat1, float paramFloat2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.WeChatSVG
 * JD-Core Version:    0.6.2
 */