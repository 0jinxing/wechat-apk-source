package com.tencent.mm.plugin.gallery.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class ImagePreviewUI$15
  implements ap.a
{
  ImagePreviewUI$15(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(21514);
    ImagePreviewUI localImagePreviewUI = this.mRu;
    if (!ImagePreviewUI.x(this.mRu));
    for (boolean bool = true; ; bool = false)
    {
      ImagePreviewUI.c(localImagePreviewUI, bool);
      ImagePreviewUI.a(this.mRu, ImagePreviewUI.x(this.mRu));
      AppMethodBeat.o(21514);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.15
 * JD-Core Version:    0.6.2
 */