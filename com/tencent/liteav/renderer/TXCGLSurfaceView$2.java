package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCGLSurfaceView$2
  implements Runnable
{
  TXCGLSurfaceView$2(TXCGLSurfaceView paramTXCGLSurfaceView, int paramInt)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67336);
    TXCGLSurfaceView.b(this.b, this.a);
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glClear(16640);
    AppMethodBeat.o(67336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCGLSurfaceView.2
 * JD-Core Version:    0.6.2
 */