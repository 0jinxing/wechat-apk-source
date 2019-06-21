package com.tencent.mm.plugin.mmsight.ui;

import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.plugin.mmsight.model.e.c;
import com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView;

final class SightCaptureUI$5
  implements MMSightCaptureTouchView.a
{
  SightCaptureUI$5(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void P(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(55184);
    if ((SightCaptureUI.g(this.oDf) != 0) && (SightCaptureUI.g(this.oDf) != 3) && (SightCaptureUI.g(this.oDf) != 4) && (SightCaptureUI.x(this.oDf) != null))
    {
      SightCaptureUI.j(this.oDf).b(paramFloat1, paramFloat2, SightCaptureUI.x(this.oDf).getWidth(), SightCaptureUI.x(this.oDf).getHeight());
      SightCaptureUI localSightCaptureUI = this.oDf;
      if (localSightCaptureUI.oCv != null)
      {
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localSightCaptureUI.oCv.getLayoutParams();
        localLayoutParams.leftMargin = ((int)paramFloat1 - localSightCaptureUI.oCv.mWidth / 2);
        localLayoutParams.topMargin = ((int)paramFloat2 - localSightCaptureUI.oCv.mHeight / 2);
        localSightCaptureUI.oCv.setLayoutParams(localLayoutParams);
        localSightCaptureUI.oCv.bQr();
      }
    }
    AppMethodBeat.o(55184);
  }

  public final void asx()
  {
    AppMethodBeat.i(55186);
    if ((SightCaptureUI.g(this.oDf) != 0) && (SightCaptureUI.j(this.oDf) != null))
      SightCaptureUI.j(this.oDf).d(true, false, 1);
    AppMethodBeat.o(55186);
  }

  public final void asy()
  {
    AppMethodBeat.i(55187);
    if ((SightCaptureUI.g(this.oDf) != 0) && (SightCaptureUI.j(this.oDf) != null))
      SightCaptureUI.j(this.oDf).d(false, false, 1);
    AppMethodBeat.o(55187);
  }

  public final void bnY()
  {
    AppMethodBeat.i(55185);
    if ((SightCaptureUI.g(this.oDf) != 0) && (SightCaptureUI.y(this.oDf) > 1))
    {
      SightCaptureUI.j(this.oDf).oug.removeMessages(4354);
      SightCaptureUI.d(this.oDf);
    }
    AppMethodBeat.o(55185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.5
 * JD-Core Version:    0.6.2
 */