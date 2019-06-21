package com.tencent.mm.plugin.gallery.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AlbumPreviewUI$9
  implements Animation.AnimationListener
{
  private Runnable mPU;

  AlbumPreviewUI$9(AlbumPreviewUI paramAlbumPreviewUI)
  {
    AppMethodBeat.i(21405);
    this.mPU = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(21404);
        Animation localAnimation = AnimationUtils.loadAnimation(AlbumPreviewUI.9.this.mPO.mController.ylL, 2131034181);
        AlbumPreviewUI.N(AlbumPreviewUI.9.this.mPO).startAnimation(localAnimation);
        AlbumPreviewUI.N(AlbumPreviewUI.9.this.mPO).setVisibility(8);
        AppMethodBeat.o(21404);
      }
    };
    AppMethodBeat.o(21405);
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(21406);
    AlbumPreviewUI.N(this.mPO).setVisibility(0);
    AlbumPreviewUI.N(this.mPO).postDelayed(this.mPU, 4000L);
    AppMethodBeat.o(21406);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.9
 * JD-Core Version:    0.6.2
 */