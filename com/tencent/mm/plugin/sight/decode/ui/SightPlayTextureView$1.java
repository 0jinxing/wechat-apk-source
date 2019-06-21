package com.tencent.mm.plugin.sight.decode.ui;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class SightPlayTextureView$1
  implements TextureView.SurfaceTextureListener
{
  SightPlayTextureView$1(SightPlayTextureView paramSightPlayTextureView)
  {
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24973);
    ab.i("MicroMsg.SightPlayTextureView", "on surface texture available, width %d height %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    SightPlayTextureView.a locala = new SightPlayTextureView.a((byte)0);
    locala.qyO = SightPlayTextureView.e(this.qyN);
    o.i(locala, 0L);
    SightPlayTextureView.a(this.qyN, new Surface(paramSurfaceTexture));
    SightPlayTextureView.d(this.qyN).g(SightPlayTextureView.e(this.qyN));
    this.qyN.dAh();
    AppMethodBeat.o(24973);
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(24972);
    ab.i("MicroMsg.SightPlayTextureView", "on surface texture destroyed");
    SightPlayTextureView.d(this.qyN).g(null);
    SightPlayTextureView.d(this.qyN).clear();
    paramSurfaceTexture = new SightPlayTextureView.a((byte)0);
    paramSurfaceTexture.qyO = SightPlayTextureView.e(this.qyN);
    o.i(paramSurfaceTexture, 0L);
    SightPlayTextureView.a(this.qyN, null);
    AppMethodBeat.o(24972);
    return false;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24971);
    ab.i("MicroMsg.SightPlayTextureView", "on surface texture size changed, width " + paramInt1 + " height " + paramInt2);
    AppMethodBeat.o(24971);
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SightPlayTextureView.1
 * JD-Core Version:    0.6.2
 */