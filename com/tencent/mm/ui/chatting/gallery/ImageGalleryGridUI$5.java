package com.tencent.mm.ui.chatting.gallery;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryGridUI$5
  implements MenuItem.OnMenuItemClickListener
{
  ImageGalleryGridUI$5(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(32039);
    this.yUT.onBackPressed();
    AppMethodBeat.o(32039);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.5
 * JD-Core Version:    0.6.2
 */