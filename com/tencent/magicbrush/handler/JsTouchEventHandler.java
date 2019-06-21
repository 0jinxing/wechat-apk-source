package com.tencent.magicbrush.handler;

import android.view.MotionEvent;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.MBRuntime.MBParams;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class JsTouchEventHandler
{
  public IntBuffer bSF;
  public FloatBuffer bSG;
  public JsTouchEventHandler.b bSH;
  public MBRuntime bSv;
  public float mDensity;

  public JsTouchEventHandler(MBRuntime paramMBRuntime)
  {
    AppMethodBeat.i(115886);
    this.bSH = new JsTouchEventHandler.b(this);
    this.bSv = paramMBRuntime;
    this.mDensity = ((float)this.bSv.getParams().device_pixel_ratio_);
    fS(10);
    AppMethodBeat.o(115886);
  }

  public static int n(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(115888);
    int i;
    switch (paramMotionEvent.getActionMasked())
    {
    case 4:
    default:
      i = -1;
      AppMethodBeat.o(115888);
    case 0:
    case 5:
    case 2:
    case 1:
    case 6:
    case 3:
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(115888);
      continue;
      i = 1;
      AppMethodBeat.o(115888);
      continue;
      i = 2;
      AppMethodBeat.o(115888);
      continue;
      i = 3;
      AppMethodBeat.o(115888);
    }
  }

  private native void nativeFreeTouchEvent(long paramLong);

  public final void fS(int paramInt)
  {
    AppMethodBeat.i(115887);
    if ((this.bSF != null) && (this.bSF.capacity() >= paramInt))
    {
      this.bSF.clear();
      this.bSG.clear();
      AppMethodBeat.o(115887);
      return;
    }
    if (this.bSF != null)
    {
      i = this.bSF.capacity();
      while (true)
      {
        j = i;
        if (i >= paramInt)
          break;
        i *= 2;
      }
    }
    int j = paramInt;
    if (this.bSF == null);
    for (int i = 0; ; i = this.bSF.capacity())
    {
      c.c.i("MicroMsg.JsTouchEventHandler", "Should Create A New Buffer, Current = [%d], Request = [%d], ShouldBe = [%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(j) });
      this.bSF = ByteBuffer.allocateDirect(j * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
      this.bSG = ByteBuffer.allocateDirect(j * 2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      AppMethodBeat.o(115887);
      break;
    }
  }

  public native long nativeCreateTouchEvent(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, FloatBuffer paramFloatBuffer, long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.JsTouchEventHandler
 * JD-Core Version:    0.6.2
 */