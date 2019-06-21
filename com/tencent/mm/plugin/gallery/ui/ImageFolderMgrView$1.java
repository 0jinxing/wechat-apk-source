package com.tencent.mm.plugin.gallery.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageFolderMgrView$1
  implements Animation.AnimationListener
{
  ImageFolderMgrView$1(ImageFolderMgrView paramImageFolderMgrView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(21472);
    ImageFolderMgrView.a(this.mQF).setVisibility(8);
    ImageFolderMgrView.a(this.mQF, false);
    ImageFolderMgrView.b(this.mQF);
    AppMethodBeat.o(21472);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView.1
 * JD-Core Version:    0.6.2
 */