package com.tencent.mm.ui.chatting.gallery;

import android.annotation.TargetApi;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageGalleryGridUI$8
  implements Runnable
{
  ImageGalleryGridUI$8(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  @TargetApi(12)
  public final void run()
  {
    AppMethodBeat.i(32046);
    if (this.yUT.yUM != null)
    {
      this.yUT.yUM.setVisibility(8);
      this.yUT.yUM = null;
    }
    AppMethodBeat.o(32046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.8
 * JD-Core Version:    0.6.2
 */