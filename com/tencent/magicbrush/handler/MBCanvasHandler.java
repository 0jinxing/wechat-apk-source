package com.tencent.magicbrush.handler;

import android.graphics.Bitmap;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.a.c.c;
import com.tencent.magicbrush.c.b;
import com.tencent.magicbrush.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MBCanvasHandler
{
  public final MBRuntime bSv;
  public final long mNativeInst;

  public MBCanvasHandler(MBRuntime paramMBRuntime, long paramLong)
  {
    this.bSv = paramMBRuntime;
    this.mNativeInst = paramLong;
  }

  private int[] u(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(115894);
    Object localObject;
    if (paramBoolean)
    {
      localObject = this.bSv.getCanvasSize(paramInt);
      AppMethodBeat.o(115894);
    }
    while (true)
    {
      return localObject;
      localObject = this.bSv.getJsThreadHandler();
      if (localObject == null)
      {
        localObject = null;
        AppMethodBeat.o(115894);
      }
      else
      {
        localObject = (int[])((MBJsThreadHandler)localObject).a(new MBCanvasHandler.2(this, paramInt));
        AppMethodBeat.o(115894);
      }
    }
  }

  public final Bitmap a(Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(115893);
    b localb = this.bSv.getMBRuntimeView();
    if (localb == null)
    {
      c.c.i("MicroMsg.MBCanvasHandler", "MBRuntimeView is null.", new Object[0]);
      paramBitmap = null;
      AppMethodBeat.o(115893);
    }
    while (true)
    {
      return paramBitmap;
      paramBitmap = (Bitmap)c.b(new MBCanvasHandler.1(this, localb, u(this.bSv.getScreenCanvasId(), paramBoolean), paramBitmap));
      AppMethodBeat.o(115893);
    }
  }

  public native Bitmap nativeCaptureCanvas(long paramLong, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.MBCanvasHandler
 * JD-Core Version:    0.6.2
 */