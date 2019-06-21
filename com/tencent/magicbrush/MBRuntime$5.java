package com.tencent.magicbrush;

import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MBRuntime$5
  implements Runnable
{
  MBRuntime$5(MBRuntime paramMBRuntime, SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115791);
    if (this.bSn.mNativeInst == 0L)
      AppMethodBeat.o(115791);
    while (true)
    {
      return;
      MBRuntime.access$700(this.bSn, this.bSn.mNativeInst, this.bSo, this.val$w, this.val$h);
      AppMethodBeat.o(115791);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime.5
 * JD-Core Version:    0.6.2
 */