package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.ui.base.h;

final class ImageGalleryUI$19$1
  implements Runnable
{
  ImageGalleryUI$19$1(ImageGalleryUI.19 param19)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32218);
    if ((g.Rg().acS() != 6) && (g.Rg().acS() != 4) && (ImageGalleryUI.f(this.yWH.yWC) == 1))
    {
      h.b(this.yWH.yWC, this.yWH.yWC.getString(2131305816), "", true);
      ImageGalleryUI.g(this.yWH.yWC);
    }
    AppMethodBeat.o(32218);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.19.1
 * JD-Core Version:    0.6.2
 */