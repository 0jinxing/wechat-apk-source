package com.tencent.mm.plugin.sight.encode.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

final class SightVideoTextureView$1
  implements TextureView.SurfaceTextureListener
{
  SightVideoTextureView$1(SightVideoTextureView paramSightVideoTextureView)
  {
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(25115);
    ab.i("MicroMsg.SightVideoTextureView", "onSurfaceTextureAvailable, [%d, %d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.qBR.qBz = SightCameraView.b.qBJ;
    SightVideoTextureView.a(this.qBR, paramSurfaceTexture);
    ((MMTextureView)SightVideoTextureView.a(this.qBR)).dAh();
    ab.i("MicroMsg.SightVideoTextureView", "available texture %s, wantPlay %B", new Object[] { paramSurfaceTexture, Boolean.valueOf(SightVideoTextureView.b(this.qBR)) });
    if (SightVideoTextureView.b(this.qBR))
      this.qBR.bg(SightVideoTextureView.c(this.qBR), SightVideoTextureView.d(this.qBR));
    AppMethodBeat.o(25115);
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(25117);
    ab.i("MicroMsg.SightVideoTextureView", "onSurfaceTextureDestroyed");
    this.qBR.qBz = SightCameraView.b.qBL;
    SightVideoTextureView.a(this.qBR, null);
    this.qBR.qBB = false;
    ab.i("MicroMsg.SightVideoTextureView", "destroyed texture %s", new Object[] { paramSurfaceTexture });
    AppMethodBeat.o(25117);
    return true;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(25116);
    ab.i("MicroMsg.SightVideoTextureView", "onSurfaceTextureSizeChanged, [%d, %d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.qBR.qBz = SightCameraView.b.qBK;
    ab.i("MicroMsg.SightVideoTextureView", "changed texture %s", new Object[] { paramSurfaceTexture });
    AppMethodBeat.o(25116);
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightVideoTextureView.1
 * JD-Core Version:    0.6.2
 */