package android.support.v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class z
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener
{
  private ViewTreeObserver FT;
  private final Runnable mRunnable;
  private final View mView;

  private z(View paramView, Runnable paramRunnable)
  {
    this.mView = paramView;
    this.FT = paramView.getViewTreeObserver();
    this.mRunnable = paramRunnable;
  }

  public static z a(View paramView, Runnable paramRunnable)
  {
    paramRunnable = new z(paramView, paramRunnable);
    paramView.getViewTreeObserver().addOnPreDrawListener(paramRunnable);
    paramView.addOnAttachStateChangeListener(paramRunnable);
    return paramRunnable;
  }

  private void removeListener()
  {
    if (this.FT.isAlive())
      this.FT.removeOnPreDrawListener(this);
    while (true)
    {
      this.mView.removeOnAttachStateChangeListener(this);
      return;
      this.mView.getViewTreeObserver().removeOnPreDrawListener(this);
    }
  }

  public final boolean onPreDraw()
  {
    removeListener();
    this.mRunnable.run();
    return true;
  }

  public final void onViewAttachedToWindow(View paramView)
  {
    this.FT = paramView.getViewTreeObserver();
  }

  public final void onViewDetachedFromWindow(View paramView)
  {
    removeListener();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.z
 * JD-Core Version:    0.6.2
 */