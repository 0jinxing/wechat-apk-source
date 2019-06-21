package com.tencent.mm.plugin.gallery.ui;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AlbumPreviewUI$5$1
  implements Runnable
{
  AlbumPreviewUI$5$1(AlbumPreviewUI.5 param5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21392);
    Animation localAnimation = AnimationUtils.loadAnimation(this.mPS.mPO.mController.ylL, 2131034181);
    AlbumPreviewUI.C(this.mPS.mPO).startAnimation(localAnimation);
    AlbumPreviewUI.C(this.mPS.mPO).setVisibility(8);
    AppMethodBeat.o(21392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.5.1
 * JD-Core Version:    0.6.2
 */