package com.tencent.mm.plugin.story.a;

import a.f.b.j;
import a.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/animation/SwingAnimator;", "Lcom/tencent/mm/plugin/story/animation/BaseViewAnimator;", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "prepare", "", "target", "Landroid/view/View;", "plugin-story_release"})
public final class b extends a
{
  private final String tag = "MicroMsg.SwingAnimator";

  protected final void eb(View paramView)
  {
    AppMethodBeat.i(108939);
    j.p(paramView, "target");
    paramView.setPivotX(paramView.getWidth() / 2.0F);
    paramView.setPivotY(paramView.getHeight());
    this.mDuration = 800L;
    AnimatorSet localAnimatorSet = this.rQu;
    if (localAnimatorSet != null)
    {
      localAnimatorSet.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(paramView, "rotation", new float[] { 0.0F, 5.0F, 0.0F, -5.0F, 0.0F, 5.0F, 0.0F, -5.0F, 0.0F }) });
      AppMethodBeat.o(108939);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(108939);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.a.b
 * JD-Core Version:    0.6.2
 */