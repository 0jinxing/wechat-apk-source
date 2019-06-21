package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.tools.e.b;

final class ImageGalleryUI$4$1
  implements e.b
{
  ImageGalleryUI$4$1(ImageGalleryUI.4 param4)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(32195);
    ImageGalleryUI.t(this.yWD.yWC).post(new ImageGalleryUI.4.1.1(this));
    AppMethodBeat.o(32195);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(32194);
    if (this.yWD.yWC.yWm != null)
      this.yWD.yWC.yWm.l(Boolean.TRUE);
    AppMethodBeat.o(32194);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.4.1
 * JD-Core Version:    0.6.2
 */