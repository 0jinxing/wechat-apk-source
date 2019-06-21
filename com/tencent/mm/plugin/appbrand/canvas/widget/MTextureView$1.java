package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MTextureView$1
  implements Runnable
{
  MTextureView$1(MTextureView paramMTextureView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103811);
    if (!this.hen.isAvailable())
      AppMethodBeat.o(103811);
    while (true)
    {
      return;
      Canvas localCanvas = this.hen.lockCanvas();
      if (localCanvas == null)
      {
        AppMethodBeat.o(103811);
        continue;
      }
      synchronized (MTextureView.a(this.hen))
      {
        MTextureView.a(this.hen, true);
        localCanvas.drawColor(-1);
        this.hen.e(localCanvas);
        this.hen.unlockCanvasAndPost(localCanvas);
      }
      synchronized (MTextureView.a(this.hen))
      {
        MTextureView.a(this.hen, false);
        MTextureView.a(this.hen).notifyAll();
        AppMethodBeat.o(103811);
        continue;
        localObject1 = finally;
        AppMethodBeat.o(103811);
        throw localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView.1
 * JD-Core Version:    0.6.2
 */