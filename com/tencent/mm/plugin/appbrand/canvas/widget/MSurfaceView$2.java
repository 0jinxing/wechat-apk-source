package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.graphics.Canvas;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MSurfaceView$2
  implements Runnable
{
  MSurfaceView$2(MSurfaceView paramMSurfaceView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103783);
    if (MSurfaceView.a(this.hel))
      AppMethodBeat.o(103783);
    while (true)
    {
      return;
      Canvas localCanvas = MSurfaceView.b(this.hel).lockCanvas();
      if (localCanvas == null)
      {
        AppMethodBeat.o(103783);
      }
      else
      {
        localCanvas.drawColor(-1);
        this.hel.e(localCanvas);
        MSurfaceView.b(this.hel).unlockCanvasAndPost(localCanvas);
        AppMethodBeat.o(103783);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView.2
 * JD-Core Version:    0.6.2
 */