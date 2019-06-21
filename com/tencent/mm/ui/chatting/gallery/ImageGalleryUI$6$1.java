package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.WxImageView;
import com.tencent.mm.ui.base.g;

final class ImageGalleryUI$6$1
  implements Runnable
{
  ImageGalleryUI$6$1(ImageGalleryUI.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32199);
    View localView = ImageGalleryUI.a(this.yWF.yWC, ImageGalleryUI.j(this.yWF.yWC), this.yWF.yWC.mQT);
    if ((localView != null) && ((localView instanceof g)))
      if ((localView instanceof MultiTouchImageView))
      {
        ((MultiTouchImageView)localView).dzA();
        AppMethodBeat.o(32199);
      }
    while (true)
    {
      return;
      if ((localView instanceof WxImageView))
        ((WxImageView)localView).dzA();
      AppMethodBeat.o(32199);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.6.1
 * JD-Core Version:    0.6.2
 */