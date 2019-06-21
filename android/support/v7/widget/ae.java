package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ae
  implements View.OnAttachStateChangeListener, View.OnTouchListener
{
  private final float aiL;
  private final int aiM;
  private final int aiN;
  final View aiO;
  private Runnable aiP;
  private Runnable aiQ;
  private boolean aiR;
  private final int[] aiS = new int[2];
  private int mActivePointerId;

  public ae(View paramView)
  {
    this.aiO = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    this.aiL = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.aiM = ViewConfiguration.getTapTimeout();
    this.aiN = ((this.aiM + ViewConfiguration.getLongPressTimeout()) / 2);
  }

  private void ie()
  {
    if (this.aiQ != null)
      this.aiO.removeCallbacks(this.aiQ);
    if (this.aiP != null)
      this.aiO.removeCallbacks(this.aiP);
  }

  public abstract s gm();

  protected boolean gn()
  {
    s locals = gm();
    if ((locals != null) && (!locals.isShowing()))
      locals.show();
    return true;
  }

  protected boolean hc()
  {
    s locals = gm();
    if ((locals != null) && (locals.isShowing()))
      locals.dismiss();
    return true;
  }

  final void jdMethod_if()
  {
    ie();
    View localView = this.aiO;
    if ((!localView.isEnabled()) || (localView.isLongClickable()));
    while (true)
    {
      return;
      if (gn())
      {
        localView.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        this.aiR = true;
      }
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2 = this.aiR;
    int i;
    if (bool2)
    {
      Object localObject = this.aiO;
      paramView = gm();
      if ((paramView == null) || (!paramView.isShowing()))
      {
        i = 0;
        if ((i == 0) && (hc()))
          break label236;
      }
      label230: label236: for (bool3 = true; ; bool3 = false)
      {
        this.aiR = bool3;
        if (!bool3)
        {
          bool3 = bool1;
          if (!bool2);
        }
        else
        {
          bool3 = true;
        }
        return bool3;
        ab localab = (ab)paramView.getListView();
        if ((localab == null) || (!localab.isShown()))
        {
          i = 0;
          break;
        }
        paramView = MotionEvent.obtainNoHistory(paramMotionEvent);
        int[] arrayOfInt = this.aiS;
        ((View)localObject).getLocationOnScreen(arrayOfInt);
        paramView.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
        localObject = this.aiS;
        localab.getLocationOnScreen((int[])localObject);
        paramView.offsetLocation(-localObject[0], -localObject[1]);
        bool3 = localab.b(paramView, this.mActivePointerId);
        paramView.recycle();
        i = paramMotionEvent.getActionMasked();
        if ((i != 1) && (i != 3));
        for (i = 1; ; i = 0)
        {
          if ((!bool3) || (i == 0))
            break label230;
          i = 1;
          break;
        }
        i = 0;
        break;
      }
    }
    paramView = this.aiO;
    if (paramView.isEnabled());
    switch (paramMotionEvent.getActionMasked())
    {
    default:
      label288: i = 0;
      label291: if ((i == 0) || (!gn()))
        break;
    case 0:
    case 2:
    case 1:
    case 3:
    }
    for (boolean bool3 = true; ; bool3 = false)
    {
      if (bool3)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.aiO.onTouchEvent(paramView);
        paramView.recycle();
      }
      break;
      this.mActivePointerId = paramMotionEvent.getPointerId(0);
      if (this.aiP == null)
        this.aiP = new a();
      paramView.postDelayed(this.aiP, this.aiM);
      if (this.aiQ == null)
        this.aiQ = new b();
      paramView.postDelayed(this.aiQ, this.aiN);
      break label288;
      i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
      if (i < 0)
        break label288;
      float f1 = paramMotionEvent.getX(i);
      float f2 = paramMotionEvent.getY(i);
      float f3 = this.aiL;
      if ((f1 >= -f3) && (f2 >= -f3) && (f1 < paramView.getRight() - paramView.getLeft() + f3) && (f2 < paramView.getBottom() - paramView.getTop() + f3));
      for (i = 1; i == 0; i = 0)
      {
        ie();
        paramView.getParent().requestDisallowInterceptTouchEvent(true);
        i = 1;
        break label291;
      }
      ie();
      break label288;
    }
  }

  public void onViewAttachedToWindow(View paramView)
  {
  }

  public void onViewDetachedFromWindow(View paramView)
  {
    this.aiR = false;
    this.mActivePointerId = -1;
    if (this.aiP != null)
      this.aiO.removeCallbacks(this.aiP);
  }

  final class a
    implements Runnable
  {
    a()
    {
    }

    public final void run()
    {
      ViewParent localViewParent = ae.this.aiO.getParent();
      if (localViewParent != null)
        localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }

  final class b
    implements Runnable
  {
    b()
    {
    }

    public final void run()
    {
      ae.this.jdMethod_if();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ae
 * JD-Core Version:    0.6.2
 */