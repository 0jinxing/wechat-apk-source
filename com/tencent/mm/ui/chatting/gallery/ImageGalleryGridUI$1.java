package com.tencent.mm.ui.chatting.gallery;

import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryGridUI$1
  implements Runnable
{
  ImageGalleryGridUI$1(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32034);
    if ((ImageGalleryGridUI.a(this.yUT) != null) && (ImageGalleryGridUI.a(this.yUT).getVisibility() != 4))
      ImageGalleryGridUI.a(this.yUT).setVisibility(4);
    AppMethodBeat.o(32034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.1
 * JD-Core Version:    0.6.2
 */