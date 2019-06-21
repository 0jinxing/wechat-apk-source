package com.tencent.mm.ui.chatting.gallery;

import android.animation.TimeInterpolator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class ImageGalleryGridUI$7
  implements Runnable
{
  ImageGalleryGridUI$7(ImageGalleryGridUI paramImageGalleryGridUI, View paramView, TimeInterpolator paramTimeInterpolator)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32045);
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.yUW.animate().setDuration(500L).alpha(0.0F).withEndAction(this.yUT.yUL).withLayer().setInterpolator(this.yUX);
      AppMethodBeat.o(32045);
    }
    while (true)
    {
      return;
      if (this.yUT.handler == null)
      {
        AppMethodBeat.o(32045);
      }
      else
      {
        this.yUW.animate().setDuration(500L).alpha(0.0F).setInterpolator(this.yUX);
        this.yUT.handler.postDelayed(this.yUT.yUL, 500L);
        AppMethodBeat.o(32045);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.7
 * JD-Core Version:    0.6.2
 */