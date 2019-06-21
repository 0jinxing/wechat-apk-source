package com.tencent.mm.plugin.gallery.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.m;
import com.tencent.mm.plugin.gallery.model.m.a;

final class ImagePreviewUI$17
  implements m.a
{
  ImagePreviewUI$17(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void a(m paramm)
  {
    AppMethodBeat.i(21516);
    if (paramm.position != ImagePreviewUI.g(this.mRu).intValue())
      AppMethodBeat.o(21516);
    while (true)
    {
      return;
      ImagePreviewUI.a(this.mRu, paramm.path, paramm.mOA);
      AppMethodBeat.o(21516);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.17
 * JD-Core Version:    0.6.2
 */