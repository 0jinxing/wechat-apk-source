package com.tencent.mm.ui.chatting.gallery;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ImageGalleryGridUI$6$1
  implements Runnable
{
  ImageGalleryGridUI$6$1(ImageGalleryGridUI.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32040);
    Animation localAnimation = AnimationUtils.loadAnimation(this.yUV.yUT.mController.ylL, 2131034181);
    ImageGalleryGridUI.b(this.yUV.yUT).startAnimation(localAnimation);
    ImageGalleryGridUI.b(this.yUV.yUT).setVisibility(8);
    AppMethodBeat.o(32040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.6.1
 * JD-Core Version:    0.6.2
 */