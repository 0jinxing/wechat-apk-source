package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.i;
import com.tencent.mm.ui.tools.i.a;

public class MMPullDownView extends FrameLayout
  implements GestureDetector.OnGestureListener
{
  private static int ywE;
  private static final int ywH;
  private int bgColor;
  protected Context context;
  private GestureDetector lCs;
  private Scroller mScroller;
  public View yho;
  private int ytq;
  private int yud;
  private boolean ywA;
  private i ywB;
  private boolean ywC;
  private MMPullDownView.a ywD;
  private ak ywF;
  boolean ywG;
  private boolean ywI;
  private int ywJ;
  private int ywK;
  private MMPullDownView.b ywL;
  private MMPullDownView.g ywg;
  private MMPullDownView.e ywh;
  private int ywi;
  private int ywj;
  private boolean ywk;
  private boolean ywl;
  private boolean ywm;
  private boolean ywn;
  protected boolean ywo;
  private boolean ywp;
  private boolean ywq;
  private boolean ywr;
  private MMPullDownView.c yws;
  private MMPullDownView.d ywt;
  public View ywu;
  private int ywv;
  private int yww;
  private int ywx;
  private boolean ywy;
  private MMPullDownView.f ywz;

  static
  {
    AppMethodBeat.i(106746);
    ywE = 400;
    ywH = Color.parseColor("#00000000");
    AppMethodBeat.o(106746);
  }

  public MMPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMPullDownView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106722);
    this.yud = 1;
    this.ywk = false;
    this.ywl = false;
    this.ywm = false;
    this.ywn = false;
    this.ywo = true;
    this.ywp = false;
    this.ywq = true;
    this.ywr = true;
    this.yww = 4;
    this.ywx = 4;
    this.ywy = false;
    this.ywA = true;
    this.ywC = false;
    this.ywF = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(106721);
        super.handleMessage(paramAnonymousMessage);
        switch (MMPullDownView.a(MMPullDownView.this))
        {
        default:
        case 0:
        case 1:
        }
        while (true)
        {
          ab.i("MicroMsg.MMPullDownView", "updateDelayHandler handleMessage loadDataType[%d] loadDataEnd[%b]", new Object[] { Integer.valueOf(MMPullDownView.a(MMPullDownView.this)), Boolean.valueOf(MMPullDownView.this.ywo) });
          AppMethodBeat.o(106721);
          return;
          if (MMPullDownView.b(MMPullDownView.this) != null)
            MMPullDownView.this.ywo = MMPullDownView.b(MMPullDownView.this).bhn();
          if ((MMPullDownView.this.ywo) && (MMPullDownView.c(MMPullDownView.this).getVisibility() == 0))
          {
            MMPullDownView.this.scrollTo(0, MMPullDownView.d(MMPullDownView.this));
            continue;
            if (MMPullDownView.e(MMPullDownView.this) != null)
              MMPullDownView.this.ywo = MMPullDownView.e(MMPullDownView.this).bhk();
            if ((MMPullDownView.this.ywo) && (MMPullDownView.f(MMPullDownView.this).getVisibility() == 0))
              MMPullDownView.this.scrollTo(0, MMPullDownView.d(MMPullDownView.this));
          }
        }
      }
    };
    this.ywG = false;
    this.ywI = false;
    this.bgColor = Color.parseColor("#ffffffff");
    this.ywJ = -2147483648;
    this.ywK = this.bgColor;
    this.mScroller = new Scroller(paramContext, new AccelerateInterpolator());
    this.ytq = this.yud;
    this.lCs = new GestureDetector(paramContext, this);
    this.ywB = new i(paramContext);
    this.context = paramContext;
    AppMethodBeat.o(106722);
  }

  public static void d(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(106730);
    ab.i("MicroMsg.MMPullDownView", "fix android O progress bar bug.");
    if ((paramViewGroup != null) && (paramViewGroup.getVisibility() == 0))
    {
      if (paramViewGroup.getTag() == null)
        paramViewGroup.setTag(paramViewGroup.findViewById(2131822172));
      paramViewGroup = (View)paramViewGroup.getTag();
      if (paramViewGroup != null)
        paramViewGroup.setVisibility(paramInt);
    }
    AppMethodBeat.o(106730);
  }

  private void dzS()
  {
    AppMethodBeat.i(106731);
    d((ViewGroup)this.ywu, 0);
    d((ViewGroup)this.yho, 0);
    AppMethodBeat.o(106731);
  }

  private void dzT()
  {
    AppMethodBeat.i(106740);
    if (this.ywz != null)
      this.ywz.cuq();
    Scroller localScroller;
    int i;
    int j;
    if (getScrollY() - this.ywi < 0)
    {
      if (this.ywq)
      {
        localScroller = this.mScroller;
        i = getScrollY();
        j = -getScrollY();
        localScroller.startScroll(0, i, 0, this.ywi + j, 200);
        postInvalidate();
      }
    }
    else if (getScrollY() > this.ywj)
    {
      if (!this.ywr)
        break label226;
      this.mScroller.startScroll(0, getScrollY(), 0, this.ywj - getScrollY(), 200);
    }
    while (true)
    {
      postInvalidate();
      this.ywm = false;
      AppMethodBeat.o(106740);
      return;
      if (this.ywu.getVisibility() == 4)
      {
        localScroller = this.mScroller;
        j = getScrollY();
        i = -getScrollY();
        localScroller.startScroll(0, j, 0, this.ywi + i, 200);
      }
      if (this.ywu.getVisibility() == 0)
        this.mScroller.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
      this.ywv = 0;
      this.ywn = true;
      this.ywo = false;
      break;
      label226: if (this.yho.getVisibility() == 4)
        this.mScroller.startScroll(0, getScrollY(), 0, this.ywj - getScrollY(), 200);
      if (this.yho.getVisibility() == 0)
      {
        localScroller = this.mScroller;
        i = getScrollY();
        j = this.ywj;
        int k = getScrollY();
        localScroller.startScroll(0, i, 0, this.ywj + (j - k), 200);
      }
      this.ywv = 1;
      this.ywn = true;
      this.ywo = false;
    }
  }

  protected void bhG()
  {
    AppMethodBeat.i(106723);
    View localView1 = inflate(this.context, 2130969942, null);
    View localView2 = inflate(this.context, 2130969942, null);
    addView(localView1, 0, new FrameLayout.LayoutParams(-1, -2));
    addView(localView2, new FrameLayout.LayoutParams(-1, -2));
    AppMethodBeat.o(106723);
  }

  public void computeScroll()
  {
    AppMethodBeat.i(106734);
    if (this.mScroller.computeScrollOffset())
    {
      scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
      postInvalidate();
    }
    while (true)
    {
      this.mScroller.isFinished();
      AppMethodBeat.o(106734);
      return;
      if (this.ywn)
      {
        ab.i("MicroMsg.MMPullDownView", "computeScroll loadDataBegin true UPDATE_DELAY");
        this.ywn = false;
        this.ywF.sendEmptyMessageDelayed(0, ywE);
        dzS();
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(106737);
    i locali = this.ywB;
    if (locali.zFy != null)
      locali.aJM.onTouchEvent(paramMotionEvent);
    boolean bool2;
    if (!this.ywo)
    {
      AppMethodBeat.o(106737);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (this.ywt == null)
      {
        this.ywk = false;
        label60: if (this.yws != null)
          break label160;
        this.ywl = false;
        label72: if (this.ywx == 0)
        {
          if (!this.ywq)
            break label176;
          this.ywu.setVisibility(4);
        }
        label94: if (this.yww == 0)
        {
          if (!this.ywr)
            break label187;
          this.yho.setVisibility(4);
        }
      }
      while (true)
      {
        if (paramMotionEvent.getAction() != 1)
          break label198;
        dzT();
        bool2 = super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(106737);
        break;
        this.ywk = this.ywt.bhl();
        break label60;
        label160: this.ywl = this.yws.bhm();
        break label72;
        label176: this.ywu.setVisibility(0);
        break label94;
        label187: this.yho.setVisibility(0);
      }
      label198: if (paramMotionEvent.getAction() == 3)
      {
        dzT();
        if (this.ywC)
        {
          bool2 = super.dispatchTouchEvent(paramMotionEvent);
          AppMethodBeat.o(106737);
        }
        else
        {
          AppMethodBeat.o(106737);
          bool2 = false;
        }
      }
      else if (this.lCs.onTouchEvent(paramMotionEvent))
      {
        paramMotionEvent.setAction(3);
        this.ywG = true;
        bool2 = super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(106737);
      }
      else
      {
        try
        {
          bool2 = super.dispatchTouchEvent(paramMotionEvent);
          AppMethodBeat.o(106737);
        }
        catch (Exception paramMotionEvent)
        {
          ab.printErrStackTrace("MicroMsg.MMPullDownView", paramMotionEvent, "", new Object[0]);
          AppMethodBeat.o(106737);
          bool2 = bool1;
        }
      }
    }
  }

  public int getBottomHeight()
  {
    return this.ywj;
  }

  public int getCurScreen()
  {
    return this.ytq;
  }

  public int getTopHeight()
  {
    return this.ywi;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106741);
    if (!this.mScroller.isFinished())
      this.mScroller.abortAnimation();
    AppMethodBeat.o(106741);
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106742);
    ab.v("MicroMsg.MMPullDownView", "on fling, velocityX %f velocityY %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    AppMethodBeat.o(106742);
    return false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106735);
    if (this.ywD != null)
      this.ywD.onInterceptTouchEvent(paramMotionEvent);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    AppMethodBeat.o(106735);
    return bool;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106733);
    ab.d("MicroMsg.MMPullDownView", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    paramInt2 = 0;
    paramInt4 = getChildCount();
    paramInt1 = 0;
    while (true)
      if (paramInt1 < paramInt4)
      {
        View localView = getChildAt(paramInt1);
        int i = localView.getMeasuredHeight();
        paramInt3 = paramInt2;
        if (localView.getVisibility() != 8);
        try
        {
          localView.layout(0, paramInt2, localView.getMeasuredWidth(), paramInt2 + i);
          paramInt3 = paramInt2 + i;
          paramInt1++;
          paramInt2 = paramInt3;
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.MMPullDownView", localArrayIndexOutOfBoundsException, "childCount: %d, i:%d, childHeight:%d", new Object[] { Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(i) });
        }
      }
    this.ywu = getChildAt(0);
    this.yho = getChildAt(getChildCount() - 1);
    this.ywu.setVisibility(this.ywx);
    this.yho.setVisibility(this.yww);
    this.ywi = this.ywu.getHeight();
    this.ywj = this.yho.getHeight();
    this.ywJ = this.ywi;
    if ((!this.ywp) && (this.ywi != 0))
    {
      this.ywp = true;
      scrollTo(0, this.ywi);
    }
    AppMethodBeat.o(106733);
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106732);
    if (!this.ywy)
    {
      bhG();
      this.ywy = true;
    }
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(106732);
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    AppMethodBeat.i(106743);
    if (this.ywz != null)
      this.ywz.ba(paramFloat2);
    if (paramFloat2 > 0.0F)
    {
      this.ywm = true;
      if ((!this.ywl) || ((!this.ywm) && (getScrollY() - this.ywi <= 0)))
        break label297;
      if ((this.ywA) || ((this.yho.getVisibility() == 0) && ((!this.ywm) || (getScrollY() < this.ywi * 2))))
        break label119;
      AppMethodBeat.o(106743);
    }
    label392: 
    while (true)
    {
      return bool;
      this.ywm = false;
      break;
      label119: int i = (int)(paramFloat2 * 0.5D);
      int j = i;
      if (i == 0)
      {
        if (paramFloat2 > 0.0F)
          j = 1;
      }
      else
      {
        label148: ab.v("check", "moveUp:" + j + " distanceY:" + paramFloat2 + " scrollY:" + getScrollY());
        if ((getScrollY() + j >= this.ywi) || (this.ywm))
          break label250;
        i = this.ywi - getScrollY();
      }
      while (true)
      {
        scrollBy(0, i);
        AppMethodBeat.o(106743);
        break;
        j = -1;
        break label148;
        label250: i = j;
        if (!this.ywA)
        {
          i = j;
          if (getScrollY() + j >= this.ywi * 2)
            i = this.ywi * 2 - getScrollY();
        }
      }
      label297: if ((this.ywk) && ((!this.ywm) || (getScrollY() - this.ywi < 0)))
      {
        if ((!this.ywA) && ((this.ywu.getVisibility() != 0) || ((!this.ywm) && (getScrollY() <= 0))))
        {
          AppMethodBeat.o(106743);
        }
        else
        {
          i = (int)(paramFloat2 * 0.5D);
          j = i;
          if (i == 0)
          {
            if (paramFloat2 > 0.0F)
              j = 1;
          }
          else
          {
            if (getScrollY() + j <= this.ywi)
              break label439;
            i = this.ywi - getScrollY();
          }
          while (true)
          {
            scrollBy(0, i);
            AppMethodBeat.o(106743);
            break;
            j = -1;
            break label392;
            label439: i = j;
            if (!this.ywA)
            {
              i = j;
              if (getScrollY() + j < 0)
                i = -getScrollY();
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(106743);
        bool = false;
      }
    }
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106745);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.ywL != null)
      this.ywL.bpT();
    if (!this.ywI)
      AppMethodBeat.o(106745);
    while (true)
    {
      return;
      if (this.ywJ == -2147483648)
      {
        this.ywJ = this.ywi;
        ab.d("MicroMsg.MMPullDownView", "onScrollChanged static y:" + this.ywJ);
      }
      if ((paramInt2 <= this.ywJ) && (this.ywK != ywH))
      {
        setBackgroundResource(2130839563);
        this.ywK = ywH;
        ab.d("MicroMsg.MMPullDownView", "onScrollChanged full");
        AppMethodBeat.o(106745);
      }
      else
      {
        if ((paramInt2 > this.ywJ) && (this.ywK != this.bgColor))
        {
          ab.d("MicroMsg.MMPullDownView", "onScrollChanged white");
          setBackgroundColor(this.bgColor);
          this.ywK = this.bgColor;
        }
        AppMethodBeat.o(106745);
      }
    }
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106736);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(106736);
      return true;
      if (getScrollY() - this.ywi < 0)
        this.ywk = true;
      if (getScrollY() > this.ywj)
        this.ywl = true;
      dzT();
    }
  }

  public void qc(boolean paramBoolean)
  {
    AppMethodBeat.i(106738);
    ab.i("MicroMsg.MMPullDownView", "forceTopLoadData start[%b] loadDataBegin[%b], loadDataEnd[%b], isTopShowAll[%b], getScrollY[%d]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.ywn), Boolean.valueOf(this.ywo), Boolean.valueOf(this.ywq), Integer.valueOf(getScrollY()) });
    Scroller localScroller;
    int i;
    int j;
    if (paramBoolean)
    {
      if (this.ywu != null)
        this.ywu.setVisibility(this.ywx);
      if (this.ywq)
      {
        localScroller = this.mScroller;
        i = getScrollY();
        j = -getScrollY();
        localScroller.startScroll(0, i, 0, this.ywi + j, 200);
        postInvalidate();
      }
    }
    while (true)
    {
      dzS();
      AppMethodBeat.o(106738);
      return;
      if ((this.ywu != null) && (this.ywu.getVisibility() == 4))
      {
        localScroller = this.mScroller;
        j = getScrollY();
        i = -getScrollY();
        localScroller.startScroll(0, j, 0, this.ywi + i, 200);
      }
      if ((this.ywu != null) && (this.ywu.getVisibility() == 0))
        this.mScroller.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
      this.ywv = 0;
      this.ywn = true;
      this.ywo = false;
      break;
      if (!this.ywo)
      {
        this.ywo = true;
        this.ywn = false;
        if ((this.ywu != null) && (this.ywu.getVisibility() == 0))
          scrollTo(0, this.ywi);
      }
      if ((this.ywu != null) && (this.ywu.getVisibility() == 0))
        this.ywu.setVisibility(8);
    }
  }

  public final void qd(boolean paramBoolean)
  {
    AppMethodBeat.i(106739);
    ab.i("MicroMsg.MMPullDownView", "forceBottomLoadData start[%b] loadDataBegin[%b] loadDataEnd[%b], isBottomShowAll[%b], getScrollY[%d]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.ywn), Boolean.valueOf(this.ywo), Boolean.valueOf(this.ywr), Integer.valueOf(getScrollY()) });
    if (paramBoolean)
    {
      if (this.yho != null)
        this.yho.setVisibility(this.ywx);
      if (this.ywr)
      {
        this.mScroller.startScroll(0, getScrollY(), 0, this.ywj - getScrollY(), 200);
        postInvalidate();
        AppMethodBeat.o(106739);
      }
    }
    while (true)
    {
      return;
      if ((this.yho != null) && (this.yho.getVisibility() == 4))
        this.mScroller.startScroll(0, getScrollY(), 0, this.ywj - getScrollY(), 200);
      if ((this.yho != null) && (this.yho.getVisibility() == 0))
      {
        Scroller localScroller = this.mScroller;
        int i = getScrollY();
        int j = this.ywj;
        int k = getScrollY();
        localScroller.startScroll(0, i, 0, this.ywj + (j - k), 200);
      }
      this.ywv = 1;
      this.ywn = true;
      this.ywo = false;
      break;
      if (!this.ywo)
      {
        this.ywo = true;
        this.ywn = false;
      }
      if ((this.yho != null) && (this.yho.getVisibility() == 0))
      {
        ab.i("MicroMsg.MMPullDownView", "forceBottomLoadData false bottomView VISIBLE scroll to 0");
        scrollTo(0, this.ywi);
      }
      if ((this.yho != null) && (this.yho.getVisibility() == 0))
        this.yho.setVisibility(8);
      AppMethodBeat.o(106739);
    }
  }

  public void setAtBottomCallBack(MMPullDownView.c paramc)
  {
    this.yws = paramc;
  }

  public void setAtTopCallBack(MMPullDownView.d paramd)
  {
    this.ywt = paramd;
  }

  public void setBgColor(String paramString)
  {
    AppMethodBeat.i(106744);
    this.bgColor = Color.parseColor(paramString);
    this.ywK = this.bgColor;
    AppMethodBeat.o(106744);
  }

  public void setBottomView(View paramView)
  {
    AppMethodBeat.i(106727);
    if (paramView == null)
    {
      this.yww = 4;
      if (this.yho == null)
        break label88;
      this.yho.setVisibility(4);
      AppMethodBeat.o(106727);
    }
    while (true)
    {
      return;
      this.yho = paramView;
      this.yho.setVisibility(0);
      this.yww = 0;
      removeViewAt(getChildCount() - 1);
      addView(this.yho, new FrameLayout.LayoutParams(-1, -2));
      this.ywj = 0;
      label88: AppMethodBeat.o(106727);
    }
  }

  public void setBottomViewVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(106728);
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      this.yww = i;
      if (this.yho != null)
        this.yho.setVisibility(this.yww);
      ab.i("MicroMsg.MMPullDownView", "setBottomViewVisible visible[%b], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bo.dpG() });
      AppMethodBeat.o(106728);
      return;
    }
  }

  public void setCanOverScrool(boolean paramBoolean)
  {
    this.ywA = paramBoolean;
  }

  public void setIsBottomShowAll(boolean paramBoolean)
  {
    AppMethodBeat.i(106725);
    ab.i("MicroMsg.MMPullDownView", "setIsBottomShowAll showAll[%b], isBottomShowAll[%b], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.ywr), bo.dpG() });
    this.ywr = paramBoolean;
    AppMethodBeat.o(106725);
  }

  public void setIsReturnSuperDispatchWhenCancel(boolean paramBoolean)
  {
    this.ywC = paramBoolean;
  }

  public void setIsTopShowAll(boolean paramBoolean)
  {
    AppMethodBeat.i(106724);
    ab.i("MicroMsg.MMPullDownView", "setIsTopShowAll showAll[%b], isTopShowAll[%b], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.ywq), bo.dpG() });
    this.ywq = paramBoolean;
    AppMethodBeat.o(106724);
  }

  public void setOnBottomLoadDataListener(MMPullDownView.e parame)
  {
    this.ywh = parame;
  }

  public void setOnInterceptTouchEventListener(MMPullDownView.a parama)
  {
    this.ywD = parama;
  }

  public void setOnMMFlingListener(i.a parama)
  {
    this.ywB.zFy = parama;
  }

  public void setOnScrollChangedListener(MMPullDownView.b paramb)
  {
    this.ywL = paramb;
  }

  public void setOnSrcollDistance(MMPullDownView.f paramf)
  {
    this.ywz = paramf;
  }

  public void setOnTopLoadDataListener(MMPullDownView.g paramg)
  {
    this.ywg = paramg;
  }

  public void setShowBackground(boolean paramBoolean)
  {
    this.ywI = paramBoolean;
  }

  public void setTopView(View paramView)
  {
    AppMethodBeat.i(106726);
    if (paramView == null)
    {
      this.ywx = 4;
      if (this.ywu == null)
        break label84;
      this.ywu.setVisibility(4);
      AppMethodBeat.o(106726);
    }
    while (true)
    {
      return;
      removeViewAt(0);
      this.ywu = paramView;
      this.ywu.setVisibility(0);
      this.ywx = 0;
      addView(this.ywu, 0, new FrameLayout.LayoutParams(-1, -2));
      this.ywi = 0;
      label84: AppMethodBeat.o(106726);
    }
  }

  public void setTopViewVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(106729);
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      this.ywx = i;
      if (this.ywu != null)
        this.ywu.setVisibility(this.ywx);
      ab.i("MicroMsg.MMPullDownView", "setTopViewVisible visible[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(106729);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMPullDownView
 * JD-Core Version:    0.6.2
 */