package com.tencent.mm.plugin.fav.ui.gallery;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$3$1
  implements Runnable
{
  c$3$1(c.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74542);
    Animation localAnimation = AnimationUtils.loadAnimation(this.mnU.mnT.czX, 2131034181);
    this.mnU.mnT.mnJ.startAnimation(localAnimation);
    this.mnU.mnT.mnJ.setVisibility(8);
    AppMethodBeat.o(74542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.c.3.1
 * JD-Core Version:    0.6.2
 */