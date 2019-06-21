package com.tencent.liteav.screencapture;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class a$a$1
  implements SurfaceTexture.OnFrameAvailableListener
{
  a$a$1(a.a parama)
  {
  }

  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(66765);
    this.a.n.a(104, new a.a.1.1(this));
    paramSurfaceTexture.setOnFrameAvailableListener(null);
    AppMethodBeat.o(66765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.a.a.1
 * JD-Core Version:    0.6.2
 */