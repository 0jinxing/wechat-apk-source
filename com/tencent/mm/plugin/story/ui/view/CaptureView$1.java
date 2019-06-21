package com.tencent.mm.plugin.story.ui.view;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.a;
import com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView;
import com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView.a;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/CaptureView$1", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$TouchCallback;", "onDoubleClick", "", "onTouchDown", "x", "", "y", "onZoomIn", "onZoomOut", "plugin-story_release"})
public final class CaptureView$1
  implements MMSightCaptureTouchView.a
{
  public final void P(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(110295);
    CaptureView.b(this.sij).b(paramFloat1, paramFloat2, CaptureView.h(this.sij).getWidth(), CaptureView.h(this.sij).getHeight());
    CaptureView.i(this.sij).X(paramFloat1, paramFloat2);
    AppMethodBeat.o(110295);
  }

  public final void asx()
  {
    AppMethodBeat.i(110297);
    CaptureView.b(this.sij).a(true, false, 1);
    AppMethodBeat.o(110297);
  }

  public final void asy()
  {
    AppMethodBeat.i(110298);
    CaptureView.b(this.sij).a(false, false, 1);
    AppMethodBeat.o(110298);
  }

  public final void bnY()
  {
    AppMethodBeat.i(110296);
    if (bo.az(CaptureView.j(this.sij)) < 1000L)
      AppMethodBeat.o(110296);
    while (true)
    {
      return;
      CaptureView.b(this.sij).Wp();
      CaptureView.a(this.sij, CaptureView.b(this.sij).Wg());
      AppMethodBeat.o(110296);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CaptureView.1
 * JD-Core Version:    0.6.2
 */