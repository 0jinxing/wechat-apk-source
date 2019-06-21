package com.tencent.luggage.d;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class e
{
  protected i bPd;
  public g bPe;
  protected e.a bPf;
  public Context mContext;

  public e(g paramg)
  {
    this.mContext = paramg.getContext();
    this.bPd = new i();
    this.bPe = paramg;
  }

  final void a(Animator paramAnimator, Runnable paramRunnable)
  {
    paramAnimator.addListener(new e.1(this, paramRunnable));
    paramAnimator.start();
  }

  public void a(e.a parama)
  {
    this.bPf = parama;
  }

  abstract void destroy();

  final void g(Runnable paramRunnable)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(getContentView(), "translationX", new float[] { -(getContentView().getWidth() * 0.25F), 0.0F });
    localObjectAnimator.setDuration(250L);
    a(localObjectAnimator, paramRunnable);
  }

  public abstract void g(String paramString, Bundle paramBundle);

  public abstract View getContentView();

  final void h(Runnable paramRunnable)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(getContentView(), "translationX", new float[] { 0.0F, getContentView().getWidth() });
    localObjectAnimator.setDuration(250L);
    a(localObjectAnimator, paramRunnable);
  }

  protected void onDestroy()
  {
  }

  protected abstract View wR();

  final void wS()
  {
    this.bPd.D(i.e.class);
  }

  public final void wT()
  {
    wU();
    this.bPd.D(i.d.class);
  }

  protected void wU()
  {
  }

  final void wV()
  {
    wW();
    this.bPd.D(i.b.class);
  }

  protected void wW()
  {
  }

  final boolean wX()
  {
    if ((this.bPd.D(i.a.class)) || (wY()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected boolean wY()
  {
    return false;
  }

  final void wZ()
  {
    onDestroy();
    this.bPd.D(i.c.class);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.e
 * JD-Core Version:    0.6.2
 */