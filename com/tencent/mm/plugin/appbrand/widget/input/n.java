package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v4.view.s;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.luggage.g.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.d.a;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

@SuppressLint({"ViewConstructor"})
public final class n extends FrameLayout
{
  private static final int huq = 2131820575;
  private View fs;
  private View jeH;
  private int jeI;
  private final int[] jeJ;
  private a jeK;
  private WeakHashMap<View, n.b> jeL;
  private Runnable jeM;
  private final Runnable jeN;
  public final Set<n.a> jeO;
  private boolean mInLayout;

  public n(Context paramContext, View paramView)
  {
    super(paramContext);
    AppMethodBeat.i(126668);
    this.jeI = -1;
    this.mInLayout = false;
    this.jeJ = new int[2];
    this.jeL = new WeakHashMap();
    this.jeM = new n.1(this);
    this.jeN = new n.2(this);
    this.jeO = new HashSet();
    super.setId(huq);
    this.fs = paramView;
    super.addView(paramView);
    AppMethodBeat.o(126668);
  }

  public static n cG(View paramView)
  {
    AppMethodBeat.i(126665);
    paramView = (n)paramView.getRootView().findViewById(huq);
    AppMethodBeat.o(126665);
    return paramView;
  }

  public static u cI(View paramView)
  {
    AppMethodBeat.i(126681);
    paramView = cG(paramView);
    if (paramView == null)
    {
      paramView = null;
      AppMethodBeat.o(126681);
    }
    while (true)
    {
      return paramView;
      if ((paramView.getOnLayoutListener() == null) || (!(paramView.getOnLayoutListener() instanceof u)))
        paramView.setOnLayoutListener(new u());
      paramView = (u)paramView.getOnLayoutListener();
      AppMethodBeat.o(126681);
    }
  }

  public static n v(Activity paramActivity)
  {
    AppMethodBeat.i(126666);
    paramActivity = (n)paramActivity.findViewById(huq);
    AppMethodBeat.o(126666);
    return paramActivity;
  }

  public static void w(Activity paramActivity)
  {
    AppMethodBeat.i(126667);
    paramActivity = v(paramActivity);
    if ((paramActivity != null) && (paramActivity.jeH != null))
    {
      paramActivity.jeH.setVisibility(8);
      paramActivity.jeH = null;
    }
    AppMethodBeat.o(126667);
  }

  public final void addView(View paramView)
  {
    AppMethodBeat.i(126673);
    if ((paramView == this.fs) || (paramView == this.jeH))
      super.addView(paramView);
    AppMethodBeat.o(126673);
  }

  public final void addView(View paramView, int paramInt)
  {
    AppMethodBeat.i(126674);
    if ((paramView == this.fs) || (paramView == this.jeH))
      super.addView(paramView, paramInt);
    AppMethodBeat.o(126674);
  }

  public final void addView(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126675);
    if ((paramView == this.fs) || (paramView == this.jeH))
      super.addView(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(126675);
  }

  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(126677);
    if ((paramView == this.fs) || (paramView == this.jeH))
      super.addView(paramView, paramInt, paramLayoutParams);
    AppMethodBeat.o(126677);
  }

  public final void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(126676);
    if ((paramView == this.fs) || (paramView == this.jeH))
      super.addView(paramView, paramLayoutParams);
    AppMethodBeat.o(126676);
  }

  protected final boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    return false;
  }

  protected final boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    return false;
  }

  public final void cH(View paramView)
  {
    AppMethodBeat.i(126679);
    n(paramView, false);
    AppMethodBeat.o(126679);
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(126671);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1))
      if ((this.jeH != null) && (this.jeH.isShown()))
      {
        this.jeH.setVisibility(8);
        AppMethodBeat.o(126671);
      }
    while (true)
    {
      return bool;
      if (f.az(getContext()))
      {
        AppMethodBeat.o(126671);
      }
      else
      {
        bool = super.dispatchKeyEvent(paramKeyEvent);
        AppMethodBeat.o(126671);
      }
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126672);
    n.b localb = (n.b)this.jeL.get(this.jeH);
    boolean bool;
    if ((localb != null) && (localb.jeQ) && (this.jeH != null) && (this.jeH.isShown()) && (paramMotionEvent.getAction() == 0))
    {
      float f1 = paramMotionEvent.getRawY();
      this.jeH.getLocationOnScreen(this.jeJ);
      float f2 = this.jeJ[1];
      float f3 = this.jeH.getHeight();
      if ((f1 < f2) || (f1 > f3 + f2))
      {
        this.jeH.setVisibility(8);
        AppMethodBeat.o(126672);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(126672);
    }
  }

  public final View getCurrentBottomPanel()
  {
    return this.jeH;
  }

  public final a getOnLayoutListener()
  {
    return this.jeK;
  }

  public final void n(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(126678);
    if (this.jeH != null)
    {
      this.jeH.setVisibility(8);
      this.jeH = null;
    }
    if (this != paramView.getParent())
    {
      if (paramView.getParent() != null)
        ((ViewGroup)paramView.getParent()).removeView(paramView);
      this.jeH = paramView;
      Object localObject = new FrameLayout.LayoutParams(-1, -2);
      ((FrameLayout.LayoutParams)localObject).gravity = 80;
      super.addView(paramView, (ViewGroup.LayoutParams)localObject);
      localObject = new n.b((byte)0);
      ((n.b)localObject).jeQ = paramBoolean;
      this.jeL.put(paramView, localObject);
    }
    AppMethodBeat.o(126678);
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(126680);
    this.mInLayout = true;
    if (s.as(this))
    {
      int i = 0;
      int j = 0;
      int k = 1;
      int m = 0;
      if (i < getChildCount())
      {
        View localView = getChildAt(i);
        int n = j;
        int i1 = k;
        int i2 = m;
        n.b localb;
        if (localView != null)
        {
          n = j;
          i1 = k;
          i2 = m;
          if (localView != this.fs)
          {
            localb = (n.b)this.jeL.get(localView);
            n = j;
            i1 = k;
            i2 = m;
            if (localb != null)
            {
              n = j;
              if (j == 0)
              {
                n = j;
                if (localb.jeR != 0)
                {
                  n = j;
                  if (localView.getVisibility() == 0)
                  {
                    this.jeH = localView;
                    post(this.jeM);
                    n = 1;
                  }
                }
              }
              if (localb.jeR != 0)
                break label231;
              j = 1;
              label178: if (localView.getVisibility() == 0)
                break label237;
            }
          }
        }
        label231: label237: for (i2 = 1; ; i2 = 0)
        {
          i1 = k & i2;
          localb.jeR = localView.getVisibility();
          i2 = j | m;
          i++;
          j = n;
          k = i1;
          m = i2;
          break;
          j = 0;
          break label178;
        }
      }
      if ((j != 0) || ((m != 0) && (k != 0)))
        post(this.jeN);
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.jeK != null)
      this.jeK.cK(this);
    this.mInLayout = false;
    AppMethodBeat.o(126680);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126670);
    if (this.jeI > 0)
      paramInt2 = View.MeasureSpec.makeMeasureSpec(this.jeI, 1073741824);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(126670);
  }

  public final void setForceHeight(int paramInt)
  {
    AppMethodBeat.i(126669);
    int i;
    if (paramInt != this.jeI)
    {
      i = 1;
      this.jeI = paramInt;
      if (i == 0)
        break label64;
      if (s.as(this))
        break label44;
      AppMethodBeat.o(126669);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label44: if (this.mInLayout)
      {
        AppMethodBeat.o(126669);
      }
      else
      {
        requestLayout();
        label64: AppMethodBeat.o(126669);
      }
    }
  }

  public final void setId(int paramInt)
  {
  }

  public final void setOnLayoutListener(a parama)
  {
    this.jeK = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.n
 * JD-Core Version:    0.6.2
 */