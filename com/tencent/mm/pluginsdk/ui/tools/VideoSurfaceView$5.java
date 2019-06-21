package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSurfaceView$5
  implements SurfaceHolder.Callback
{
  VideoSurfaceView$5(VideoSurfaceView paramVideoSurfaceView)
  {
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(70444);
    ab.i("MicroMsg.VideoSurfaceView", "on surface changed %d*%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((VideoSurfaceView.g(this.vvG) != null) && (VideoSurfaceView.i(this.vvG)) && (VideoSurfaceView.a(this.vvG) == paramInt2) && (VideoSurfaceView.b(this.vvG) == paramInt3))
      VideoSurfaceView.g(this.vvG).start();
    AppMethodBeat.o(70444);
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(70445);
    ab.i("MicroMsg.VideoSurfaceView", "on surface created");
    VideoSurfaceView.a(this.vvG, paramSurfaceHolder);
    VideoSurfaceView.j(this.vvG);
    AppMethodBeat.o(70445);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(70446);
    ab.i("MicroMsg.VideoSurfaceView", "on surface destroyed");
    VideoSurfaceView.a(this.vvG, null);
    if (VideoSurfaceView.g(this.vvG) != null)
    {
      VideoSurfaceView.e(this.vvG).dG(VideoSurfaceView.g(this.vvG).getCurrentPosition(), VideoSurfaceView.g(this.vvG).getDuration());
      VideoSurfaceView.g(this.vvG).reset();
      VideoSurfaceView.g(this.vvG).release();
      VideoSurfaceView.k(this.vvG);
    }
    AppMethodBeat.o(70446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView.5
 * JD-Core Version:    0.6.2
 */