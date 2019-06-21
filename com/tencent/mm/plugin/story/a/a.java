package com.tencent.mm.plugin.story.a;

import a.f.b.j;
import a.l;
import android.animation.AnimatorSet;
import android.support.v4.view.s;
import android.view.View;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/animation/BaseViewAnimator;", "", "()V", "<set-?>", "Landroid/animation/AnimatorSet;", "animatorAgent", "getAnimatorAgent", "()Landroid/animation/AnimatorSet;", "setAnimatorAgent", "(Landroid/animation/AnimatorSet;)V", "isRunning", "", "()Z", "isStarted", "mDuration", "", "mRepeatMode", "", "mRepeatTimes", "startDelay", "getStartDelay", "()J", "addAnimatorListener", "l", "Landroid/animation/Animator$AnimatorListener;", "animate", "", "cancel", "getDuration", "prepare", "target", "Landroid/view/View;", "removeAllListener", "removeAnimatorListener", "reset", "restart", "setDuration", "duration", "setInterpolator", "interpolator", "Landroid/view/animation/Interpolator;", "setRepeatMode", "repeatMode", "setRepeatTimes", "repeatTimes", "setStartDelay", "delay", "setTarget", "start", "Companion", "plugin-story_release"})
public abstract class a
{
  private static final long rQx = 1000L;
  public static final a.a rQy = new a.a((byte)0);
  public long mDuration = rQx;
  public AnimatorSet rQu = new AnimatorSet();
  public int rQv;
  public int rQw = 1;

  protected abstract void eb(View paramView);

  public final a ec(View paramView)
  {
    j.p(paramView, "target");
    j.p(paramView, "target");
    s.e(paramView, 1.0F);
    s.f(paramView, 1.0F);
    s.g(paramView, 1.0F);
    s.ac(paramView);
    s.d(paramView, 0.0F);
    s.ad(paramView);
    s.af(paramView);
    s.ae(paramView);
    eb(paramView);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.a.a
 * JD-Core Version:    0.6.2
 */