package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;

public class p
  implements f
{
  int eTi;
  int eTj;
  volatile int frameCount;
  long miD;
  boolean ouL;
  long ovu;
  int owR;
  int owS;
  int owT;
  int owU;
  int owV;

  public p(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(76663);
    this.owR = -1;
    this.frameCount = 0;
    this.miD = 0L;
    this.ovu = 0L;
    this.owS = -1;
    this.owT = -1;
    this.owU = -1;
    this.owV = -1;
    this.ouL = paramBoolean;
    this.owS = paramInt1;
    this.eTi = paramInt2;
    this.eTj = paramInt3;
    ab.i("MicroMsg.MMSightX264YUVRecorder", "create MMSightX264YUVRecorder, needRotateEachFrame: %s, initRotate: %s, targetWidth: %s, targetHeight: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(this.owS), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(76663);
  }

  public final long UQ()
  {
    long l = 0L;
    AppMethodBeat.i(76665);
    if (0L == this.miD)
    {
      ab.w("MicroMsg.MMSightX264YUVRecorder", "do not start record");
      AppMethodBeat.o(76665);
    }
    while (true)
    {
      return l;
      l = System.currentTimeMillis() - this.miD;
      AppMethodBeat.o(76665);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(76666);
    SightVideoJNI.releaseBigSightDataBuffer(this.owR);
    this.owR = -1;
    try
    {
      this.frameCount = 0;
      this.miD = 0L;
      AppMethodBeat.o(76666);
      return;
    }
    finally
    {
      AppMethodBeat.o(76666);
    }
  }

  public final void stop()
  {
    try
    {
      this.frameCount = 0;
      this.miD = 0L;
      return;
    }
    finally
    {
    }
  }

  public final int yU(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(76664);
    if (paramInt < 0)
    {
      ab.e("MicroMsg.MMSightX264YUVRecorder", "init error, yuv buffer id error");
      paramInt = -1;
      AppMethodBeat.o(76664);
    }
    while (true)
    {
      return paramInt;
      this.owR = paramInt;
      try
      {
        this.frameCount = 0;
        this.miD = 0L;
        AppMethodBeat.o(76664);
        paramInt = i;
      }
      finally
      {
        AppMethodBeat.o(76664);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.p
 * JD-Core Version:    0.6.2
 */