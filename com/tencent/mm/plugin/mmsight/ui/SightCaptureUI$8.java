package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.video.b;
import com.tencent.mm.sdk.platformtools.ab;

final class SightCaptureUI$8
  implements b
{
  SightCaptureUI$8(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void e(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(55192);
    ab.i("MicroMsg.SightCaptureUI", "callback onSurfaceTextureAvailable set local surface: %s", new Object[] { paramSurfaceTexture });
    SightCaptureUI.a(this.oDf, paramSurfaceTexture);
    if (SightCaptureUI.J(this.oDf))
    {
      SightCaptureUI.g(this.oDf, 1);
      AppMethodBeat.o(55192);
    }
    while (true)
    {
      return;
      SightCaptureUI.g(this.oDf, 8);
      AppMethodBeat.o(55192);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.8
 * JD-Core Version:    0.6.2
 */