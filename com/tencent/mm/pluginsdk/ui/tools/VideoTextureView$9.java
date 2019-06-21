package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$9
  implements TextureView.SurfaceTextureListener
{
  VideoTextureView$9(VideoTextureView paramVideoTextureView)
  {
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118020);
    VideoTextureView.d(this.vvO, paramInt1);
    VideoTextureView.e(this.vvO, paramInt2);
    this.vvO.dAh();
    VideoTextureView.a(this.vvO, new Surface(paramSurfaceTexture));
    ab.i("MicroMsg.VideoTextureView", "%d on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", new Object[] { Integer.valueOf(this.vvO.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(VideoTextureView.s(this.vvO)), Integer.valueOf(VideoTextureView.u(this.vvO).hashCode()) });
    if ((VideoTextureView.a(this.vvO) == null) || (!VideoTextureView.s(this.vvO)))
    {
      VideoTextureView.v(this.vvO);
      if (VideoTextureView.x(this.vvO) != null)
        VideoTextureView.x(this.vvO).akY();
      AppMethodBeat.o(118020);
      return;
    }
    VideoTextureView.a(this.vvO).setSurface(VideoTextureView.u(this.vvO));
    if (VideoTextureView.w(this.vvO))
      VideoTextureView.a(this.vvO).start();
    while (true)
    {
      VideoTextureView.b(this.vvO, false);
      break;
      VideoTextureView.a(this.vvO, true);
      VideoTextureView.a(this.vvO).setVolume(0.0F, 0.0F);
      VideoTextureView.a(this.vvO).start();
    }
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(118019);
    ab.i("MicroMsg.VideoTextureView", "%d on texture destroyed mIsPrepared[%b]", new Object[] { Integer.valueOf(this.vvO.hashCode()), Boolean.valueOf(VideoTextureView.s(this.vvO)) });
    VideoTextureView.a(this.vvO, null);
    if ((VideoTextureView.a(this.vvO) != null) && (VideoTextureView.s(this.vvO)))
      if (this.vvO.isPlaying())
      {
        VideoTextureView.b(this.vvO, true);
        VideoTextureView.a(this.vvO).pause();
      }
    while (true)
    {
      AppMethodBeat.o(118019);
      return false;
      VideoTextureView.t(this.vvO);
      VideoTextureView.b(this.vvO, false);
    }
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118018);
    ab.i("MicroMsg.VideoTextureView", "on texture size changed width : " + paramInt1 + " height : " + paramInt2);
    if ((VideoTextureView.a(this.vvO) != null) && (VideoTextureView.s(this.vvO)) && (VideoTextureView.b(this.vvO) == paramInt1) && (VideoTextureView.c(this.vvO) == paramInt2))
      VideoTextureView.a(this.vvO).start();
    AppMethodBeat.o(118018);
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(118017);
    ab.d("MicroMsg.VideoTextureView", "on surface texture updated");
    if (VideoTextureView.j(this.vvO))
      if (VideoTextureView.a(this.vvO) != null)
      {
        VideoTextureView.a(this.vvO).pause();
        if (!VideoTextureView.m(this.vvO))
          break label221;
        VideoTextureView.a(this.vvO).setVolume(0.0F, 0.0F);
      }
    while (true)
    {
      VideoTextureView.a(this.vvO, false);
      if ((VideoTextureView.n(this.vvO) > 0L) && (VideoTextureView.o(this.vvO) != null))
      {
        VideoTextureView.o(this.vvO).bQL();
        VideoTextureView.p(this.vvO);
      }
      VideoTextureView.a(this.vvO, System.currentTimeMillis());
      if (VideoTextureView.q(this.vvO))
      {
        ab.i("MicroMsg.VideoTextureView", "%d flush surface pause now time[%d]", new Object[] { Integer.valueOf(this.vvO.hashCode()), Integer.valueOf(this.vvO.getCurrentPosition()) });
        if (VideoTextureView.a(this.vvO) != null)
        {
          VideoTextureView.a(this.vvO).pause();
          this.vvO.setMute(VideoTextureView.m(this.vvO));
        }
        VideoTextureView.r(this.vvO);
      }
      AppMethodBeat.o(118017);
      return;
      label221: VideoTextureView.a(this.vvO).setVolume(1.0F, 1.0F);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.9
 * JD-Core Version:    0.6.2
 */