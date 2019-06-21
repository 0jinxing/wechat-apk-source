package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.ui.cameraglview.a;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.video.b;

final class SightCaptureUI$21
  implements b
{
  SightCaptureUI$21(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void e(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(55218);
    SightCaptureUI.e(this.oDf).WB();
    SightCaptureUI.f(this.oDf).setTextureChangeCallback(null);
    AppMethodBeat.o(55218);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.21
 * JD-Core Version:    0.6.2
 */