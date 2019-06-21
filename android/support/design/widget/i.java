package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class i extends h
{
  private InsetDrawable qL;

  i(VisibilityAwareImageButton paramVisibilityAwareImageButton, k paramk)
  {
    super(paramVisibilityAwareImageButton, paramk);
  }

  final void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.qv = a.f(cj());
    a.a(this.qv, paramColorStateList);
    if (paramMode != null)
      a.a(this.qv, paramMode);
    if (paramInt2 > 0)
      this.qx = a(paramInt2, paramColorStateList);
    for (paramColorStateList = new LayerDrawable(new Drawable[] { this.qx, this.qv }); ; paramColorStateList = this.qv)
    {
      this.qw = new RippleDrawable(ColorStateList.valueOf(paramInt1), paramColorStateList, null);
      this.qy = this.qw;
      this.qD.setBackgroundDrawable(this.qw);
      return;
      this.qx = null;
    }
  }

  final void c(int[] paramArrayOfInt)
  {
  }

  final void ce()
  {
  }

  final void cf()
  {
    cg();
  }

  final boolean ch()
  {
    return false;
  }

  final d ci()
  {
    return new e();
  }

  final GradientDrawable ck()
  {
    return new i.a();
  }

  final void d(Rect paramRect)
  {
    if (this.qD.cd())
    {
      float f1 = this.qD.getRadius();
      float f2 = this.qC.getElevation() + this.qA;
      int i = (int)Math.ceil(j.d(f2, f1, false));
      int j = (int)Math.ceil(j.c(f2, f1, false));
      paramRect.set(i, j, i, j);
    }
    while (true)
    {
      return;
      paramRect.set(0, 0, 0, 0);
    }
  }

  final void e(Rect paramRect)
  {
    if (this.qD.cd())
    {
      this.qL = new InsetDrawable(this.qw, paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
      this.qD.setBackgroundDrawable(this.qL);
    }
    while (true)
    {
      return;
      this.qD.setBackgroundDrawable(this.qw);
    }
  }

  public final float getElevation()
  {
    return this.qC.getElevation();
  }

  final void o(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT == 21)
      if (this.qC.isEnabled())
      {
        this.qC.setElevation(paramFloat1);
        if ((this.qC.isFocused()) || (this.qC.isPressed()))
          this.qC.setTranslationZ(paramFloat2);
      }
    while (true)
    {
      if (this.qD.cd())
        cg();
      return;
      this.qC.setTranslationZ(0.0F);
      continue;
      this.qC.setElevation(0.0F);
      this.qC.setTranslationZ(0.0F);
      continue;
      StateListAnimator localStateListAnimator = new StateListAnimator();
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.play(ObjectAnimator.ofFloat(this.qC, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with(ObjectAnimator.ofFloat(this.qC, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
      localAnimatorSet.setInterpolator(qr);
      localStateListAnimator.addState(PRESSED_ENABLED_STATE_SET, localAnimatorSet);
      localAnimatorSet = new AnimatorSet();
      localAnimatorSet.play(ObjectAnimator.ofFloat(this.qC, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with(ObjectAnimator.ofFloat(this.qC, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
      localAnimatorSet.setInterpolator(qr);
      localStateListAnimator.addState(qB, localAnimatorSet);
      localAnimatorSet = new AnimatorSet();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(ObjectAnimator.ofFloat(this.qC, "elevation", new float[] { paramFloat1 }).setDuration(0L));
      if ((Build.VERSION.SDK_INT >= 22) && (Build.VERSION.SDK_INT <= 24))
        localArrayList.add(ObjectAnimator.ofFloat(this.qC, View.TRANSLATION_Z, new float[] { this.qC.getTranslationZ() }).setDuration(100L));
      localArrayList.add(ObjectAnimator.ofFloat(this.qC, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(100L));
      localAnimatorSet.playSequentially((Animator[])localArrayList.toArray(new ObjectAnimator[0]));
      localAnimatorSet.setInterpolator(qr);
      localStateListAnimator.addState(ENABLED_STATE_SET, localAnimatorSet);
      localAnimatorSet = new AnimatorSet();
      localAnimatorSet.play(ObjectAnimator.ofFloat(this.qC, "elevation", new float[] { 0.0F }).setDuration(0L)).with(ObjectAnimator.ofFloat(this.qC, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(0L));
      localAnimatorSet.setInterpolator(qr);
      localStateListAnimator.addState(EMPTY_STATE_SET, localAnimatorSet);
      this.qC.setStateListAnimator(localStateListAnimator);
    }
  }

  final void setRippleColor(int paramInt)
  {
    if ((this.qw instanceof RippleDrawable))
      ((RippleDrawable)this.qw).setColor(ColorStateList.valueOf(paramInt));
    while (true)
    {
      return;
      super.setRippleColor(paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.design.widget.i
 * JD-Core Version:    0.6.2
 */