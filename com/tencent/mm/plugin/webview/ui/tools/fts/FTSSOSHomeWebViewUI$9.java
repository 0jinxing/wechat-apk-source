package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayoutWithAll;

final class FTSSOSHomeWebViewUI$9
  implements ViewTreeObserver.OnPreDrawListener
{
  FTSSOSHomeWebViewUI$9(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(8437);
    FTSSOSHomeWebViewUI.C(this.uBG).getViewTreeObserver().removeOnPreDrawListener(this);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(FTSSOSHomeWebViewUI.C(this.uBG), View.TRANSLATION_Y, new float[] { -FTSSOSHomeWebViewUI.C(this.uBG).getHeight(), 0.0F });
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(FTSSOSHomeWebViewUI.D(this.uBG), View.ALPHA, new float[] { 0.0F, 1.0F });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.setInterpolator(new AccelerateInterpolator());
    localAnimatorSet.setDuration(300L);
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1 });
    localAnimatorSet.start();
    AppMethodBeat.o(8437);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.9
 * JD-Core Version:    0.6.2
 */