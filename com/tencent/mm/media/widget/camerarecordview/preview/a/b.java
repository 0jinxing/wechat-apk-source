package com.tencent.mm.media.widget.camerarecordview.preview.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.preview.c;
import com.tencent.mm.plugin.mmsight.model.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/preview/controller/CPUPreviewController;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/controller/AbsPreviewController;", "view", "Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "(Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;)V", "frameDataCallback", "Lcom/tencent/mm/plugin/mmsight/model/MMSightCameraFrameDataCallback;", "drawFrame", "", "data", "", "getFrameDataCallback", "plugin-mediaeditor_release"})
public final class b extends a
{
  private final f fcA;

  public b(c paramc)
  {
    super(paramc);
    AppMethodBeat.i(13311);
    this.fcA = ((f)new b.a(this));
    AppMethodBeat.o(13311);
  }

  public final f getFrameDataCallback()
  {
    return this.fcA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.preview.a.b
 * JD-Core Version:    0.6.2
 */