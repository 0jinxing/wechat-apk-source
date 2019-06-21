package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryUI$15
  implements Runnable
{
  ImageGalleryUI$15(ImageGalleryUI paramImageGalleryUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32214);
    if (ImageGalleryUI.j(this.yWC) == null)
      AppMethodBeat.o(32214);
    while (true)
    {
      return;
      c localc = ImageGalleryUI.j(this.yWC);
      int i = this.gvp;
      localc.yTO.pause(i);
      AppMethodBeat.o(32214);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.15
 * JD-Core Version:    0.6.2
 */