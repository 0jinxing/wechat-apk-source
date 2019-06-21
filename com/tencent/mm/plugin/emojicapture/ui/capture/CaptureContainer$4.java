package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.a;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView;
import com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView;
import com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$4", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$TouchCallback;", "onDoubleClick", "", "onTouchDown", "x", "", "y", "onZoomIn", "onZoomOut", "plugin-emojicapture_release"})
public final class CaptureContainer$4
  implements MMSightCaptureTouchView.a
{
  public final void P(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(2953);
    CaptureContainer.c(this.lmt).b(paramFloat1, paramFloat2, CaptureContainer.h(this.lmt).getWidth(), CaptureContainer.h(this.lmt).getHeight());
    CaptureContainer.i(this.lmt).X(paramFloat1, paramFloat2);
    AppMethodBeat.o(2953);
  }

  public final void asx()
  {
    AppMethodBeat.i(2955);
    CaptureContainer.c(this.lmt).a(true, false, 1);
    AppMethodBeat.o(2955);
  }

  public final void asy()
  {
    AppMethodBeat.i(2956);
    CaptureContainer.c(this.lmt).a(false, false, 1);
    AppMethodBeat.o(2956);
  }

  public final void bnY()
  {
    AppMethodBeat.i(2954);
    CaptureContainer.c(this.lmt).Wp();
    this.lmt.Wg();
    AppMethodBeat.o(2954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.4
 * JD-Core Version:    0.6.2
 */