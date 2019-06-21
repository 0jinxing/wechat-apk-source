package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class w
{
  private WeakReference<View> Nw;
  Runnable Nx = null;
  Runnable Ny = null;
  int Nz = -1;

  w(View paramView)
  {
    this.Nw = new WeakReference(paramView);
  }

  private void a(final View paramView, final x paramx)
  {
    if (paramx != null)
      paramView.animate().setListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          paramx.aB(paramView);
        }

        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          paramx.aA(paramView);
        }

        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          paramx.az(paramView);
        }
      });
    while (true)
    {
      return;
      paramView.animate().setListener(null);
    }
  }

  public final w A(float paramFloat)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().scaleY(paramFloat);
    return this;
  }

  public final w a(x paramx)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
    {
      if (Build.VERSION.SDK_INT < 16)
        break label31;
      a(localView, paramx);
    }
    while (true)
    {
      return this;
      label31: localView.setTag(2113929216, paramx);
      a(localView, new a(this));
    }
  }

  public final w a(final z paramz)
  {
    final View localView = (View)this.Nw.get();
    if ((localView != null) && (Build.VERSION.SDK_INT >= 19))
    {
      ValueAnimator.AnimatorUpdateListener local2 = null;
      if (paramz != null)
        local2 = new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            paramz.es();
          }
        };
      localView.animate().setUpdateListener(local2);
    }
    return this;
  }

  public final w c(Interpolator paramInterpolator)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().setInterpolator(paramInterpolator);
    return this;
  }

  public final void cancel()
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().cancel();
  }

  public final long getDuration()
  {
    View localView = (View)this.Nw.get();
    if (localView != null);
    for (long l = localView.animate().getDuration(); ; l = 0L)
      return l;
  }

  public final w l(long paramLong)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().setDuration(paramLong);
    return this;
  }

  public final w m(long paramLong)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().setStartDelay(paramLong);
    return this;
  }

  public final void start()
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().start();
  }

  public final w t(float paramFloat)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().alpha(paramFloat);
    return this;
  }

  public final w u(float paramFloat)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().translationY(paramFloat);
    return this;
  }

  public final w v(float paramFloat)
  {
    View localView = (View)this.Nw.get();
    if (localView != null)
      localView.animate().scaleX(paramFloat);
    return this;
  }

  static final class a
    implements x
  {
    w ND;
    boolean NE;

    a(w paramw)
    {
      this.ND = paramw;
    }

    public final void aA(View paramView)
    {
      if (this.ND.Nz >= 0)
      {
        paramView.setLayerType(this.ND.Nz, null);
        this.ND.Nz = -1;
      }
      if ((Build.VERSION.SDK_INT >= 16) || (!this.NE))
      {
        if (this.ND.Ny != null)
        {
          localObject = this.ND.Ny;
          this.ND.Ny = null;
          ((Runnable)localObject).run();
        }
        localObject = paramView.getTag(2113929216);
        if (!(localObject instanceof x))
          break label113;
      }
      label113: for (Object localObject = (x)localObject; ; localObject = null)
      {
        if (localObject != null)
          ((x)localObject).aA(paramView);
        this.NE = true;
        return;
      }
    }

    public final void aB(View paramView)
    {
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof x));
      for (localObject = (x)localObject; ; localObject = null)
      {
        if (localObject != null)
          ((x)localObject).aB(paramView);
        return;
      }
    }

    public final void az(View paramView)
    {
      this.NE = false;
      if (this.ND.Nz >= 0)
        paramView.setLayerType(2, null);
      if (this.ND.Nx != null)
      {
        localObject = this.ND.Nx;
        this.ND.Nx = null;
        ((Runnable)localObject).run();
      }
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof x));
      for (localObject = (x)localObject; ; localObject = null)
      {
        if (localObject != null)
          ((x)localObject).az(paramView);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.w
 * JD-Core Version:    0.6.2
 */