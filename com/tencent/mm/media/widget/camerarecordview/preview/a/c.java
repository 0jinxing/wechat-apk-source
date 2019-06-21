package com.tencent.mm.media.widget.camerarecordview.preview.a;

import a.f.a.b;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/preview/controller/GPUPreviewController;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/controller/AbsPreviewController;", "view", "Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "(Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;)V", "TAG", "", "setRender", "", "renderer", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "plugin-mediaeditor_release"})
public final class c extends a
{
  private final String TAG;

  public c(com.tencent.mm.media.widget.camerarecordview.preview.c paramc)
  {
    super(paramc);
    AppMethodBeat.i(13314);
    this.TAG = "MicroMsg.GPUPreviewController";
    AppMethodBeat.o(13314);
  }

  public final void a(com.tencent.mm.media.h.a parama)
  {
    AppMethodBeat.i(13313);
    j.p(parama, "renderer");
    super.a(parama);
    parama.eYT = ((b)new c.a(this, parama));
    ab.i(this.TAG, "setPreviewRenderer: " + parama.hashCode());
    AppMethodBeat.o(13313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.preview.a.c
 * JD-Core Version:    0.6.2
 */