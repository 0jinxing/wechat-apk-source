package com.tencent.magicbrush;

import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MBRuntime$4
  implements Runnable
{
  MBRuntime$4(MBRuntime paramMBRuntime, SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115790);
    if (this.bSn.mNativeInst == 0L)
      AppMethodBeat.o(115790);
    while (true)
    {
      return;
      MBRuntime.access$600(this.bSn, this.bSn.mNativeInst, this.bSo, this.val$width, this.val$height);
      AppMethodBeat.o(115790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime.4
 * JD-Core Version:    0.6.2
 */