package com.tencent.mm.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.base.MMFlipper;
import com.tencent.mm.view.a.g;
import com.tencent.mm.view.popview.AbstractPopView;
import com.tencent.mm.view.popview.a;

public class SmileySubGrid extends SmileyGrid
{
  int AaP;
  boolean AaQ;
  private AbstractPopView AaR;
  private SmileySubGrid.c AaS;
  private int AaT;
  private SmileySubGrid.a AaU;
  private SmileySubGrid.b AaV;
  private View AaW;
  private boolean AaX;
  private volatile int AaY;
  private volatile boolean AaZ;
  public boolean Aba;
  private final Object Abb;
  Rect ahV;
  private int aiN;
  int aia;
  int ath;
  float lbS;
  float lbT;
  private WindowManager lca;
  private boolean lgu;
  private ak mHandler;
  private int mTouchSlop;
  int yto;

  public SmileySubGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62960);
    this.yto = 6;
    this.AaP = -1;
    this.ahV = new Rect();
    this.mHandler = new ak();
    this.AaX = false;
    this.AaY = -1;
    this.AaZ = false;
    this.Aba = true;
    this.Abb = new Object();
    this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.lca = ((WindowManager)paramContext.getSystemService("window"));
    this.aiN = getLongTouchTime();
    this.AaT = ViewConfiguration.getPressedStateDuration();
    AppMethodBeat.o(62960);
  }

  private void N(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(62967);
    this.ahV.set(paramInt1 - getPaddingLeft(), paramInt2 - getPaddingTop(), getPaddingRight() + paramInt3, getPaddingBottom() + paramInt4);
    AppMethodBeat.o(62967);
  }

  private boolean QB(int paramInt)
  {
    AppMethodBeat.i(62963);
    boolean bool;
    if ((paramInt == this.AaY) && (this.AaR.isShown()))
    {
      bool = true;
      AppMethodBeat.o(62963);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62963);
    }
  }

  private void az(View paramView, int paramInt)
  {
    AppMethodBeat.i(62962);
    if (!QB(paramInt))
    {
      ab.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "jacks begin show:%d", new Object[] { Integer.valueOf(paramInt) });
      Object localObject = getAdapter().getItem(paramInt);
      if (this.AaR == null)
        this.AaR = a.b(getContext(), localObject);
      cX(localObject);
      fu(paramView);
    }
    while (true)
    {
      this.AaY = paramInt;
      AppMethodBeat.o(62962);
      return;
      ab.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "jacks already show:%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }

  private void cX(Object paramObject)
  {
    AppMethodBeat.i(62970);
    synchronized (this.Abb)
    {
      if (this.AaR != null)
      {
        a.a(this.AaR, paramObject);
        AppMethodBeat.o(62970);
        return;
      }
      ab.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "mPopImageView is null.");
    }
  }

  private void dMK()
  {
    AppMethodBeat.i(62965);
    if (this.AaS != null)
      this.mHandler.removeCallbacks(this.AaS);
    if (this.lgu)
    {
      this.lca.removeView(this.AaR);
      this.lgu = false;
      this.AaZ = false;
    }
    AppMethodBeat.o(62965);
  }

  private void fu(View paramView)
  {
    AppMethodBeat.i(62964);
    if (this.AaS == null)
      this.AaS = new SmileySubGrid.c(this, (byte)0);
    ab.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "updatePopView %s", new Object[] { Boolean.valueOf(this.lgu) });
    this.AaR.fw(paramView);
    if (!this.lgu)
    {
      this.AaZ = true;
      this.mHandler.postDelayed(this.AaS, this.AaT);
      AppMethodBeat.o(62964);
    }
    while (true)
    {
      return;
      this.lca.updateViewLayout(this.AaR, this.AaR.getWindowLayoutParams());
      AppMethodBeat.o(62964);
    }
  }

  private void fv(View paramView)
  {
    AppMethodBeat.i(62966);
    Rect localRect = this.ahV;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    N(localRect.left, localRect.top, localRect.right, localRect.bottom);
    boolean bool = this.AaQ;
    if (paramView.isEnabled() != bool)
      if (bool)
        break label86;
    label86: for (bool = true; ; bool = false)
    {
      this.AaQ = bool;
      refreshDrawableState();
      AppMethodBeat.o(62966);
      return;
    }
  }

  protected int getLongTouchTime()
  {
    AppMethodBeat.i(62969);
    int i = ViewConfiguration.getLongPressTimeout();
    AppMethodBeat.o(62969);
    return i;
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(62972);
    super.onDetachedFromWindow();
    dMK();
    AppMethodBeat.o(62972);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(62961);
    boolean bool;
    if (!this.Aba)
    {
      dMK();
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(62961);
      return bool;
    }
    int i = paramMotionEvent.getAction();
    SmileySubGrid.b localb = null;
    switch (i)
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(62961);
      bool = true;
      break;
      i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      this.lbS = i;
      this.lbT = j;
      j = pointToPosition(i, j);
      if ((j >= 0) && (getAdapter().isEnabled(j)))
        this.ath = 0;
      paramMotionEvent = localb;
      if (j >= 0)
      {
        this.AaP = j;
        paramMotionEvent = getChildAt(j - getFirstVisiblePosition());
      }
      if (paramMotionEvent != null)
      {
        paramMotionEvent.setPressed(true);
        paramMotionEvent.setSelected(true);
        fv(paramMotionEvent);
      }
      if (this.AaU == null)
        this.AaU = new SmileySubGrid.a(this, (byte)0);
      this.AaU.dJk();
      this.aia = j;
      if ((j >= 0) && ((getAdapter() instanceof g)) && (((g)getAdapter()).ui(j)))
      {
        this.mHandler.postDelayed(this.AaU, this.aiN);
        continue;
        i = (int)paramMotionEvent.getX();
        j = (int)paramMotionEvent.getY();
        if (this.yto == 5)
        {
          j = pointToPosition(i, j);
          this.aia = j;
          if ((j >= 0) && ((getAdapter() instanceof g)) && (((g)getAdapter()).ui(j)))
            if (this.AaP != j)
            {
              this.AaP = j;
              paramMotionEvent = getChildAt(j - getFirstVisiblePosition());
              layoutChildren();
              if (paramMotionEvent != null)
              {
                paramMotionEvent.setPressed(true);
                paramMotionEvent.setSelected(true);
                fv(paramMotionEvent);
                az(paramMotionEvent, this.AaP);
              }
            }
          while (true)
          {
            this.mHandler.removeCallbacks(this.AaU);
            break;
            dMK();
            if (this.AaP >= 0)
            {
              paramMotionEvent = getChildAt(this.AaP - getFirstVisiblePosition());
              if (paramMotionEvent != null)
              {
                paramMotionEvent.setPressed(false);
                paramMotionEvent.setSelected(false);
                fv(paramMotionEvent);
              }
            }
          }
        }
        if (Math.abs(this.lbS - i) > this.mTouchSlop)
        {
          this.ath = -1;
          this.mHandler.removeCallbacks(this.AaU);
        }
        dMK();
        continue;
        j = this.aia;
        paramMotionEvent = getChildAt(j - getFirstVisiblePosition());
        if ((i == 1) && (this.ath != -1))
        {
          if (this.AaV == null)
            this.AaV = new SmileySubGrid.b(this, (byte)0);
          localb = this.AaV;
          localb.Dg = paramMotionEvent;
          localb.zyT = j;
          localb.dJk();
          this.mHandler.post(localb);
        }
        this.mHandler.removeCallbacks(this.AaU);
        setScrollEnable(true);
        dMK();
        if (this.AaP >= 0)
        {
          paramMotionEvent = getChildAt(this.AaP - getFirstVisiblePosition());
          if (paramMotionEvent != null)
          {
            paramMotionEvent.setPressed(false);
            paramMotionEvent.setSelected(false);
            fv(paramMotionEvent);
          }
        }
        this.yto = 6;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(62971);
    super.release();
    dMK();
    if (this.AaR != null)
      this.AaR = null;
    AppMethodBeat.o(62971);
  }

  public void setFromDetail(boolean paramBoolean)
  {
    this.AaX = paramBoolean;
  }

  public void setIsShowPopWin(boolean paramBoolean)
  {
    this.Aba = paramBoolean;
  }

  protected void setScrollEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(62968);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "cpan t setScrollEnable:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.AaW != null)
      if ((this.AaW instanceof MMFlipper))
      {
        ((MMFlipper)this.AaW).setScrollEnable(paramBoolean);
        AppMethodBeat.o(62968);
      }
    while (true)
    {
      return;
      if ((this.AaW instanceof CustomViewPager))
        ((CustomViewPager)this.AaW).setCanSlide(paramBoolean);
      AppMethodBeat.o(62968);
    }
  }

  public void setViewParent(View paramView)
  {
    this.AaW = paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileySubGrid
 * JD-Core Version:    0.6.2
 */