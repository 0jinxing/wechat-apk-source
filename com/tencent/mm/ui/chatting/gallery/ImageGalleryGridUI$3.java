package com.tencent.mm.ui.chatting.gallery;

import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryGridUI$3
  implements Runnable
{
  ImageGalleryGridUI$3(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32036);
    if ((ImageGalleryGridUI.a(this.yUT) != null) && (ImageGalleryGridUI.a(this.yUT).getVisibility() != 0))
      ImageGalleryGridUI.a(this.yUT).setVisibility(0);
    AppMethodBeat.o(32036);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.3
 * JD-Core Version:    0.6.2
 */