package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.an;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.widget.a.d.a;

final class ImageGalleryUI$8
  implements d.a
{
  ImageGalleryUI$8(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(32204);
    an localan = new an();
    localan.ctC.filePath = ImageGalleryUI.b(this.yWC);
    a.xxA.m(localan);
    ImageGalleryUI.z(this.yWC);
    ImageGalleryUI.e(this.yWC);
    ImageGalleryUI.a(this.yWC, null);
    ImageGalleryUI.a(this.yWC, ImageGalleryUI.b(this.yWC, 0));
    ImageGalleryUI.A(this.yWC);
    AppMethodBeat.o(32204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.8
 * JD-Core Version:    0.6.2
 */