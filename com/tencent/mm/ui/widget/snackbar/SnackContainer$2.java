package com.tencent.mm.ui.widget.snackbar;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;

final class SnackContainer$2
  implements Animation.AnimationListener
{
  SnackContainer$2(SnackContainer paramSnackContainer)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(112993);
    this.zTZ.removeAllViews();
    if (!SnackContainer.b(this.zTZ).isEmpty())
      SnackContainer.d((SnackContainer.a)SnackContainer.b(this.zTZ).poll());
    if (!this.zTZ.isEmpty())
    {
      SnackContainer.a(this.zTZ, (SnackContainer.a)SnackContainer.b(this.zTZ).peek());
      AppMethodBeat.o(112993);
    }
    while (true)
    {
      return;
      this.zTZ.setVisibility(8);
      AppMethodBeat.o(112993);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(112992);
    if ((!this.zTZ.isEmpty()) && (SnackContainer.b(this.zTZ).peek() != null) && (((SnackContainer.a)SnackContainer.b(this.zTZ).peek()).zUf != null))
    {
      b.rf(false);
      ((SnackContainer.a)SnackContainer.b(this.zTZ).peek()).zUf.cLd();
    }
    AppMethodBeat.o(112992);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.SnackContainer.2
 * JD-Core Version:    0.6.2
 */