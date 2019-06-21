package com.tencent.liteav.basic.e;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class e$2
  implements SurfaceTexture.OnFrameAvailableListener
{
  e$2(e parame)
  {
  }

  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(66285);
    e.a(this.a, 103, new e.2.1(this));
    paramSurfaceTexture.setOnFrameAvailableListener(null);
    AppMethodBeat.o(66285);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.e.2
 * JD-Core Version:    0.6.2
 */