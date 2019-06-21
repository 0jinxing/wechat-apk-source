package com.tencent.xweb.extension.video;

import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1
  implements SurfaceHolder.Callback
{
  d$1(d paramd)
  {
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(84575);
    Canvas localCanvas = paramSurfaceHolder.lockCanvas();
    localCanvas.drawColor(-16777216);
    paramSurfaceHolder.unlockCanvasAndPost(localCanvas);
    AppMethodBeat.o(84575);
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(84574);
    Canvas localCanvas = paramSurfaceHolder.lockCanvas();
    localCanvas.drawColor(-16777216);
    paramSurfaceHolder.unlockCanvasAndPost(localCanvas);
    AppMethodBeat.o(84574);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.1
 * JD-Core Version:    0.6.2
 */