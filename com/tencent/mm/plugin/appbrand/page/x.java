package com.tencent.mm.plugin.appbrand.page;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class x extends FrameLayout
{
  private int AL;
  View WL;
  View itI;
  FrameLayout itJ;
  FrameLayout itK;
  public boolean itL;
  private boolean itM;
  private boolean itN;
  private boolean itO;
  private boolean itP;
  private int itQ;
  private int itR;
  private boolean itS;
  private ObjectAnimator itT;
  private int mTouchSlop;

  public x(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(87278);
    this.itL = true;
    this.itM = false;
    this.itN = false;
    this.itO = false;
    this.itP = false;
    this.itS = false;
    this.itT = null;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    AppMethodBeat.o(87278);
  }

  private int getMaxOverScrollDistance()
  {
    AppMethodBeat.i(87285);
    int i = getHeight();
    AppMethodBeat.o(87285);
    return i;
  }

  private void pu(int paramInt)
  {
    AppMethodBeat.i(87288);
    int i = (int)this.itK.getTranslationY();
    if (i == paramInt)
      AppMethodBeat.o(87288);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
      if (this.itT != null)
        this.itT.cancel();
      long l = ()(Math.abs(i - paramInt) / getStayHeight() * 250.0F);
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.itK, "translationY", new float[] { i, paramInt });
      localObjectAnimator.setDuration(Math.min(l, 250L));
      localObjectAnimator.setInterpolator(new DecelerateInterpolator());
      localObjectAnimator.start();
      localObjectAnimator.addUpdateListener(new x.1(this));
      this.itT = localObjectAnimator;
      AppMethodBeat.o(87288);
    }
  }

  protected boolean aAO()
  {
    AppMethodBeat.i(87284);
    boolean bool;
    if (this.WL.getScrollY() == 0)
    {
      bool = true;
      AppMethodBeat.o(87284);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87284);
    }
  }

  protected final void aKa()
  {
    AppMethodBeat.i(87281);
    pu(getStayHeight());
    if (!this.itN)
      aKc();
    this.itO = true;
    this.itN = true;
    this.itP = true;
    AppMethodBeat.o(87281);
  }

  protected final void aKb()
  {
    AppMethodBeat.i(87282);
    pu(0);
    if (this.itN)
      aKd();
    this.itO = false;
    this.itN = false;
    this.itP = false;
    AppMethodBeat.o(87282);
  }

  protected void aKc()
  {
  }

  protected void aKd()
  {
  }

  protected int getOpenHeight()
  {
    AppMethodBeat.i(87286);
    int i = this.itI.getHeight();
    AppMethodBeat.o(87286);
    return i;
  }

  protected int getStayHeight()
  {
    AppMethodBeat.i(87287);
    int i = this.itI.getHeight();
    AppMethodBeat.o(87287);
    return i;
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(87279);
    if (this.itL)
    {
      bool = this.itP;
      AppMethodBeat.o(87279);
    }
    while (true)
    {
      return bool;
      int i = paramMotionEvent.getAction();
      if ((i == 3) || (i == 1))
      {
        this.itO = false;
        this.itS = false;
        AppMethodBeat.o(87279);
        bool = false;
      }
      else if ((i == 2) && (this.itO))
      {
        AppMethodBeat.o(87279);
      }
      else
      {
        switch (i)
        {
        case 1:
        default:
        case 0:
        case 2:
        }
        while (true)
          if ((this.itO) || (this.itP))
          {
            AppMethodBeat.o(87279);
            break;
            if (aAO())
            {
              this.itQ = ((int)paramMotionEvent.getX());
              this.itR = ((int)paramMotionEvent.getY());
              this.AL = ((int)paramMotionEvent.getY());
              this.itO = false;
              this.itS = true;
              continue;
              if (aAO())
              {
                if (!this.itS)
                {
                  this.itQ = ((int)paramMotionEvent.getX());
                  this.itR = ((int)paramMotionEvent.getY());
                  this.AL = ((int)paramMotionEvent.getY());
                  this.itO = false;
                  this.itS = true;
                  AppMethodBeat.o(87279);
                  bool = false;
                  break;
                }
                int j = (int)paramMotionEvent.getX();
                int k = (int)paramMotionEvent.getY();
                int m = this.itQ;
                i = k - this.itR;
                if ((Math.abs(i) > this.mTouchSlop) && (Math.abs(i) > Math.abs(j - m)) && (i > 0))
                {
                  this.itQ = j;
                  this.itR = k;
                  this.itO = true;
                  this.itS = false;
                  AppMethodBeat.o(87279);
                  break;
                }
              }
            }
          }
        AppMethodBeat.o(87279);
        bool = false;
      }
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(87280);
    boolean bool;
    if (this.itL)
    {
      if (this.itP)
        aKb();
      bool = this.itP;
      AppMethodBeat.o(87280);
    }
    while (true)
    {
      return bool;
      if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      {
        AppMethodBeat.o(87280);
        bool = false;
      }
      else
      {
        switch (paramMotionEvent.getAction())
        {
        default:
        case 0:
        case 2:
        case 1:
        case 3:
        }
        do
        {
          do
          {
            do
            {
              AppMethodBeat.o(87280);
              bool = false;
              break;
            }
            while ((!aAO()) && (!this.itP));
            this.itR = ((int)paramMotionEvent.getY());
            this.itQ = ((int)paramMotionEvent.getX());
            this.AL = ((int)paramMotionEvent.getY());
            this.itS = true;
            AppMethodBeat.o(87280);
            bool = true;
            break;
          }
          while ((!this.itO) && (!this.itP));
          if (!this.itS)
          {
            this.itR = ((int)paramMotionEvent.getY());
            this.itQ = ((int)paramMotionEvent.getX());
            this.AL = ((int)paramMotionEvent.getY());
            this.itS = true;
            AppMethodBeat.o(87280);
            bool = true;
            break;
          }
          int i = (int)paramMotionEvent.getY() - this.AL;
          int j = i >> 1;
          int k = getMaxOverScrollDistance();
          if (j > k);
          while (true)
          {
            j = k;
            if (this.itN)
              j = k + getStayHeight();
            k = Math.max(j, 0);
            ab.d("MicroMsg.AppBrandPullDownView", "real diff: %d, calc diff: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
            j = Math.min(getMaxOverScrollDistance(), k);
            this.itK.setTranslationY(j);
            pt(k);
            AppMethodBeat.o(87280);
            bool = true;
            break;
            k = j;
          }
          this.itS = false;
          if ((this.itK.getTranslationY() > getOpenHeight()) && (this.itM))
          {
            aKa();
            AppMethodBeat.o(87280);
            bool = true;
            break;
          }
        }
        while ((!this.itO) && (!this.itP));
        aKb();
        AppMethodBeat.o(87280);
        bool = true;
      }
    }
  }

  protected void pt(int paramInt)
  {
  }

  public void setNeedStay(boolean paramBoolean)
  {
    this.itM = paramBoolean;
  }

  public void setPullDownBackgroundColor(int paramInt)
  {
    AppMethodBeat.i(87283);
    this.itJ.setBackgroundColor(paramInt);
    AppMethodBeat.o(87283);
  }

  public void setPullDownEnabled(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.itL = paramBoolean;
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.x
 * JD-Core Version:    0.6.2
 */