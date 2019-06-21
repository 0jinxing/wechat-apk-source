package com.tencent.mm.plugin.gallery.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageFolderMgrView$2
  implements Animation.AnimationListener
{
  ImageFolderMgrView$2(ImageFolderMgrView paramImageFolderMgrView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(21473);
    ImageFolderMgrView.a(this.mQF, true);
    ImageFolderMgrView.b(this.mQF);
    AppMethodBeat.o(21473);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView.2
 * JD-Core Version:    0.6.2
 */