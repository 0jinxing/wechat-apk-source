package com.tencent.mm.ui.tools;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$4
  implements Animation.AnimationListener
{
  e$4(e parame, e.b paramb)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(107645);
    ab.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation end!");
    if (this.zFq != null)
      this.zFq.onAnimationEnd();
    this.zFr.zFp = this.zFr.zFl;
    AppMethodBeat.o(107645);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(107644);
    ab.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation start!");
    if (this.zFq != null)
      this.zFq.onAnimationStart();
    this.zFr.zFp = this.zFr.zFo;
    AppMethodBeat.o(107644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.e.4
 * JD-Core Version:    0.6.2
 */