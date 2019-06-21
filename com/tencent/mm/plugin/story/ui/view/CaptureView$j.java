package com.tencent.mm.plugin.story.ui.view;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.a;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/CaptureView$initCaptureButton$3", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightRecordButton$LongPressScrollCallback;", "onScrollDown", "", "factor", "", "onScrollUp", "plugin-story_release"})
public final class CaptureView$j
  implements MMSightRecordButton.c
{
  public final void uF(int paramInt)
  {
    AppMethodBeat.i(110315);
    CaptureView.b(this.sij).a(true, true, paramInt);
    AppMethodBeat.o(110315);
  }

  public final void uG(int paramInt)
  {
    AppMethodBeat.i(110316);
    CaptureView.b(this.sij).a(false, true, paramInt);
    AppMethodBeat.o(110316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CaptureView.j
 * JD-Core Version:    0.6.2
 */