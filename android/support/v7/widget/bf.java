package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.s;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

final class bf
  implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener
{
  private static bf auK;
  private static bf auL;
  private final CharSequence ZY;
  private final View auE;
  private final Runnable auF = new Runnable()
  {
    public final void run()
    {
      bf.b(bf.this);
    }
  };
  private int auG;
  private int auH;
  private bg auI;
  private boolean auJ;
  private final Runnable mHideRunnable = new Runnable()
  {
    public final void run()
    {
      bf.c(bf.this);
    }
  };

  private bf(View paramView, CharSequence paramCharSequence)
  {
    this.auE = paramView;
    this.ZY = paramCharSequence;
    this.auE.setOnLongClickListener(this);
    this.auE.setOnHoverListener(this);
  }

  private static void a(bf parambf)
  {
    if (auK != null)
      auK.lv();
    auK = parambf;
    if (parambf != null)
      auK.lu();
  }

  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if ((auK != null) && (auK.auE == paramView))
      a(null);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      if ((auL != null) && (auL.auE == paramView))
        auL.hide();
      paramView.setOnLongClickListener(null);
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
    }
    while (true)
    {
      return;
      new bf(paramView, paramCharSequence);
    }
  }

  private void av(boolean paramBoolean)
  {
    if (!s.av(this.auE))
      return;
    a(null);
    if (auL != null)
      auL.hide();
    auL = this;
    this.auJ = paramBoolean;
    this.auI = new bg(this.auE.getContext());
    this.auI.a(this.auE, this.auG, this.auH, this.auJ, this.ZY);
    this.auE.addOnAttachStateChangeListener(this);
    long l;
    if (this.auJ)
      l = 2500L;
    while (true)
    {
      this.auE.removeCallbacks(this.mHideRunnable);
      this.auE.postDelayed(this.mHideRunnable, l);
      break;
      if ((s.aj(this.auE) & 0x1) == 1)
        l = 3000L - ViewConfiguration.getLongPressTimeout();
      else
        l = 15000L - ViewConfiguration.getLongPressTimeout();
    }
  }

  private void hide()
  {
    if (auL == this)
    {
      auL = null;
      if (this.auI != null)
      {
        this.auI.hide();
        this.auI = null;
        this.auE.removeOnAttachStateChangeListener(this);
      }
    }
    if (auK == this)
      a(null);
    this.auE.removeCallbacks(this.mHideRunnable);
  }

  private void lu()
  {
    this.auE.postDelayed(this.auF, ViewConfiguration.getLongPressTimeout());
  }

  private void lv()
  {
    this.auE.removeCallbacks(this.auF);
  }

  public final boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    if ((this.auI != null) && (this.auJ));
    while (true)
    {
      return false;
      paramView = (AccessibilityManager)this.auE.getContext().getSystemService("accessibility");
      if ((!paramView.isEnabled()) || (!paramView.isTouchExplorationEnabled()))
        switch (paramMotionEvent.getAction())
        {
        case 8:
        case 9:
        default:
          break;
        case 7:
          if ((this.auE.isEnabled()) && (this.auI == null))
          {
            this.auG = ((int)paramMotionEvent.getX());
            this.auH = ((int)paramMotionEvent.getY());
            a(this);
          }
          break;
        case 10:
          hide();
        }
    }
  }

  public final boolean onLongClick(View paramView)
  {
    this.auG = (paramView.getWidth() / 2);
    this.auH = (paramView.getHeight() / 2);
    av(true);
    return true;
  }

  public final void onViewAttachedToWindow(View paramView)
  {
  }

  public final void onViewDetachedFromWindow(View paramView)
  {
    hide();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bf
 * JD-Core Version:    0.6.2
 */