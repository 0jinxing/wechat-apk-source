package com.tencent.mm.plugin.appbrand.page.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

public abstract class a
  implements c
{
  public static Animator cs(View paramView)
  {
    paramView = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { 1.0F, 0.0F, 1.0F });
    paramView.setDuration(2000L);
    paramView.setInterpolator(new AccelerateInterpolator());
    paramView.setRepeatCount(-1);
    paramView.setRepeatMode(1);
    return paramView;
  }

  protected abstract Context getContext();

  protected abstract void q(Drawable paramDrawable);

  protected abstract void y(CharSequence paramCharSequence);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.a
 * JD-Core Version:    0.6.2
 */