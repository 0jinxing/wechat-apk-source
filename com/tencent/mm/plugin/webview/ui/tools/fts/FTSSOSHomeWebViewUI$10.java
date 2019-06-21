package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayoutWithAll;

final class FTSSOSHomeWebViewUI$10
  implements Animator.AnimatorListener
{
  FTSSOSHomeWebViewUI$10(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(8439);
    FTSSOSHomeWebViewUI.C(this.uBG).setVisibility(8);
    FTSSOSHomeWebViewUI.D(this.uBG).setVisibility(8);
    FTSSOSHomeWebViewUI.E(this.uBG);
    AppMethodBeat.o(8439);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(8438);
    FTSSOSHomeWebViewUI.C(this.uBG).setVisibility(8);
    FTSSOSHomeWebViewUI.D(this.uBG).setVisibility(8);
    FTSSOSHomeWebViewUI.E(this.uBG);
    AppMethodBeat.o(8438);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.10
 * JD-Core Version:    0.6.2
 */