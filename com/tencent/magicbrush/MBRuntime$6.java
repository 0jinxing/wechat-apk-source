package com.tencent.magicbrush;

import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MBRuntime$6
  implements Runnable
{
  MBRuntime$6(MBRuntime paramMBRuntime, SurfaceTexture paramSurfaceTexture)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115792);
    if (this.bSn.mNativeInst == 0L)
      AppMethodBeat.o(115792);
    while (true)
    {
      return;
      MBRuntime.access$800(this.bSn, this.bSn.mNativeInst);
      this.bSo.release();
      AppMethodBeat.o(115792);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime.6
 * JD-Core Version:    0.6.2
 */