package com.tencent.mm.media.widget.camerarecordview;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.h.b.c;
import com.tencent.mm.media.h.b.e;
import com.tencent.mm.media.h.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer$setRender$renderer$1", "Lcom/tencent/mm/media/render/SurfaceTextureRenderer;", "doInitRenderProc", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "plugin-mediaeditor_release"})
public final class a$c extends d
{
  a$c(int paramInt)
  {
  }

  public final com.tencent.mm.media.h.b.a Vc()
  {
    AppMethodBeat.i(13229);
    com.tencent.mm.media.h.b.a locala;
    if (this.fbM.fbK.WD())
    {
      locala = (com.tencent.mm.media.h.b.a)new e(this.eYW, this.eYX, this.eYY, this.eYZ, this.eZa, this.scaleType);
      AppMethodBeat.o(13229);
    }
    while (true)
    {
      return locala;
      locala = (com.tencent.mm.media.h.b.a)new c(this.eYW, this.eYX, this.eYY, this.eYZ, this.eZa, this.scaleType);
      AppMethodBeat.o(13229);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.a.c
 * JD-Core Version:    0.6.2
 */