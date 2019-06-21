package com.tencent.mm.pluginsdk.ui.tools;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FileSelectorFolderView$2
  implements Animation.AnimationListener
{
  FileSelectorFolderView$2(FileSelectorFolderView paramFileSelectorFolderView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(28159);
    FileSelectorFolderView.a(this.vuk, true);
    FileSelectorFolderView.b(this.vuk);
    AppMethodBeat.o(28159);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView.2
 * JD-Core Version:    0.6.2
 */