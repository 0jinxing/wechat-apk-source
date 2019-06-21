package com.tencent.liteav.renderer;

import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCGLSurfaceView$1
  implements Runnable
{
  TXCGLSurfaceView$1(TXCGLSurfaceView paramTXCGLSurfaceView, int paramInt)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67355);
    TXCGLSurfaceView.a(this.b, this.a);
    if (TXCGLSurfaceView.a(this.b) <= 0)
      TXCGLSurfaceView.a(this.b, 1);
    while (true)
    {
      TXCGLSurfaceView.a(this.b, 0L);
      TXCGLSurfaceView.b(this.b, 0L);
      AppMethodBeat.o(67355);
      return;
      if (TXCGLSurfaceView.a(this.b) > 60)
        TXCGLSurfaceView.a(this.b, 60);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCGLSurfaceView.1
 * JD-Core Version:    0.6.2
 */