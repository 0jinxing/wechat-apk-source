package com.tencent.mm.plugin.webview.luggage;

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
import com.tencent.xweb.WebView;

public class i extends FrameLayout
{
  private int AL;
  View WL;
  View itI;
  FrameLayout itJ;
  FrameLayout itK;
  private boolean itL;
  private boolean itM;
  private boolean itN;
  private boolean itO;
  private boolean itP;
  private int itQ;
  private int itR;
  private ObjectAnimator itT;
  private int mTouchSlop;

  public i(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(6158);
    this.itL = true;
    this.itM = false;
    this.itN = false;
    this.itO = false;
    this.itP = false;
    this.itT = null;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    AppMethodBeat.o(6158);
  }

  private boolean aAO()
  {
    AppMethodBeat.i(6163);
    boolean bool;
    if ((this.WL instanceof WebView))
      if (((WebView)this.WL).getWebScrollY() == 0)
      {
        AppMethodBeat.o(6163);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(6163);
      bool = false;
      continue;
      if (this.WL.getScrollY() == 0)
      {
        AppMethodBeat.o(6163);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(6163);
        bool = false;
      }
    }
  }

  private void aKb()
  {
    AppMethodBeat.i(6161);
    pu(0);
    this.itO = false;
    this.itN = false;
    this.itP = false;
    AppMethodBeat.o(6161);
  }

  private int getMaxOverScrollDistance()
  {
    AppMethodBeat.i(6164);
    int i = getHeight();
    AppMethodBeat.o(6164);
    return i;
  }

  private void pu(int paramInt)
  {
    AppMethodBeat.i(6167);
    int i = (int)this.itK.getTranslationY();
    if (i == paramInt)
      AppMethodBeat.o(6167);
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
      localObjectAnimator.addUpdateListener(new i.1(this));
      this.itT = localObjectAnimator;
      AppMethodBeat.o(6167);
    }
  }

  protected int getOpenHeight()
  {
    AppMethodBeat.i(6165);
    int i = this.itI.getHeight();
    AppMethodBeat.o(6165);
    return i;
  }

  protected int getStayHeight()
  {
    AppMethodBeat.i(6166);
    int i = this.itI.getHeight();
    AppMethodBeat.o(6166);
    return i;
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(6159);
    if (this.itL)
    {
      bool = this.itP;
      AppMethodBeat.o(6159);
    }
    while (true)
    {
      return bool;
      int i = paramMotionEvent.getAction();
      if ((i == 3) || (i == 1))
      {
        AppMethodBeat.o(6159);
        bool = false;
      }
      else if (this.itO)
      {
        AppMethodBeat.o(6159);
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
        int j;
        int k;
        do
        {
          do
            while (true)
            {
              AppMethodBeat.o(6159);
              bool = false;
              break;
              if (aAO())
              {
                this.itQ = ((int)paramMotionEvent.getX());
                this.itR = ((int)paramMotionEvent.getY());
                this.AL = ((int)paramMotionEvent.getY());
              }
            }
          while (!aAO());
          i = (int)paramMotionEvent.getX();
          j = (int)paramMotionEvent.getY();
          k = this.itQ;
          j -= this.itR;
        }
        while ((Math.abs(j) <= this.mTouchSlop) || (Math.abs(j) <= Math.abs(i - k)) || (j <= 0));
        this.itO = true;
        AppMethodBeat.o(6159);
      }
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(6160);
    boolean bool;
    if (this.itL)
    {
      if (this.itP)
        aKb();
      bool = this.itP;
      AppMethodBeat.o(6160);
    }
    while (true)
    {
      return bool;
      switch (paramMotionEvent.getAction())
      {
      default:
        AppMethodBeat.o(6160);
        bool = false;
        break;
      case 0:
        this.AL = ((int)paramMotionEvent.getY());
        AppMethodBeat.o(6160);
        bool = true;
      case 2:
      case 1:
      case 3:
      }
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
      k = Math.min(getMaxOverScrollDistance(), k);
      this.itK.setTranslationY(k);
      AppMethodBeat.o(6160);
      bool = true;
      break;
      k = j;
    }
    if ((this.itK.getTranslationY() > getOpenHeight()) && (this.itM))
    {
      pu(getStayHeight());
      this.itO = true;
      this.itN = true;
      this.itP = true;
    }
    while (true)
    {
      AppMethodBeat.o(6160);
      bool = true;
      break;
      aKb();
    }
  }

  public void setNeedStay(boolean paramBoolean)
  {
    this.itM = paramBoolean;
  }

  public void setPullDownBackgroundColor(int paramInt)
  {
    AppMethodBeat.i(6162);
    this.itJ.setBackgroundColor(paramInt);
    AppMethodBeat.o(6162);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.i
 * JD-Core Version:    0.6.2
 */