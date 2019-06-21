package com.tencent.mm.ui.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.s;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.EdgeEffect;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HorizontalListViewV2 extends AdapterView<ListAdapter>
{
  protected ListAdapter Ei;
  private Drawable ahS;
  private int alv;
  private GestureDetector iay;
  private View.OnClickListener mOnClickListener;
  private Rect mRect;
  protected int ysD;
  protected int ysE;
  private int ysF;
  private int ysG;
  private boolean ysL;
  protected Scroller ysP;
  private final HorizontalListViewV2.a ysQ;
  private List<Queue<View>> ysR;
  private View ysS;
  private Integer ysT;
  private int ysU;
  private int ysV;
  private int ysW;
  private HorizontalListViewV2.e ysX;
  private int ysY;
  private boolean ysZ;
  private HorizontalListViewV2.d yta;
  private HorizontalListViewV2.d.a ytb;
  private i ytc;
  private i ytd;
  private int yte;
  private boolean ytf;
  private boolean ytg;
  private DataSetObserver yth;
  private Runnable yti;

  public HorizontalListViewV2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106344);
    this.ysP = new Scroller(getContext());
    this.ysQ = new HorizontalListViewV2.a(this, (byte)0);
    this.ysR = new ArrayList();
    this.ysL = false;
    this.mRect = new Rect();
    this.ysS = null;
    this.alv = 0;
    this.ahS = null;
    this.ysT = null;
    this.ysF = 2147483647;
    this.ysX = null;
    this.ysY = 0;
    this.ysZ = false;
    this.yta = null;
    this.ytb = HorizontalListViewV2.d.a.ytk;
    this.ytf = false;
    this.ytg = false;
    this.yth = new HorizontalListViewV2.2(this);
    this.yti = new HorizontalListViewV2.3(this);
    this.ytc = new i(paramContext);
    this.ytd = new i(paramContext);
    this.iay = new GestureDetector(paramContext, this.ysQ);
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(106328);
        boolean bool = HorizontalListViewV2.a(HorizontalListViewV2.this).onTouchEvent(paramAnonymousMotionEvent);
        AppMethodBeat.o(106328);
        return bool;
      }
    });
    initView();
    setWillNotDraw(false);
    if (Build.VERSION.SDK_INT >= 11)
      HorizontalListViewV2.b.a(this.ysP);
    AppMethodBeat.o(106344);
  }

  private boolean NA(int paramInt)
  {
    AppMethodBeat.i(106367);
    boolean bool;
    if (paramInt == this.Ei.getCount() - 1)
    {
      bool = true;
      AppMethodBeat.o(106367);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106367);
    }
  }

  private View Ny(int paramInt)
  {
    AppMethodBeat.i(106354);
    paramInt = this.Ei.getItemViewType(paramInt);
    View localView;
    if (Nz(paramInt))
    {
      localView = (View)((Queue)this.ysR.get(paramInt)).poll();
      AppMethodBeat.o(106354);
    }
    while (true)
    {
      return localView;
      localView = null;
      AppMethodBeat.o(106354);
    }
  }

  private boolean Nz(int paramInt)
  {
    AppMethodBeat.i(106356);
    boolean bool;
    if (paramInt < this.ysR.size())
    {
      bool = true;
      AppMethodBeat.o(106356);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106356);
    }
  }

  private void a(Canvas paramCanvas, Rect paramRect)
  {
    AppMethodBeat.i(106371);
    if (this.ahS != null)
    {
      this.ahS.setBounds(paramRect);
      this.ahS.draw(paramCanvas);
    }
    AppMethodBeat.o(106371);
  }

  private void ai(View paramView, int paramInt)
  {
    AppMethodBeat.i(106357);
    addViewInLayout(paramView, paramInt, eF(paramView), true);
    ViewGroup.LayoutParams localLayoutParams = eF(paramView);
    int i = ViewGroup.getChildMeasureSpec(this.yte, getPaddingTop() + getPaddingBottom(), localLayoutParams.height);
    if (localLayoutParams.width > 0);
    for (paramInt = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824); ; paramInt = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(paramInt, i);
      AppMethodBeat.o(106357);
      return;
    }
  }

  private float dzu()
  {
    AppMethodBeat.i(106362);
    float f;
    if (Build.VERSION.SDK_INT >= 14)
    {
      f = HorizontalListViewV2.c.b(this.ysP);
      AppMethodBeat.o(106362);
    }
    while (true)
    {
      return f;
      f = 30.0F;
      AppMethodBeat.o(106362);
    }
  }

  private void dzw()
  {
    AppMethodBeat.i(106376);
    if (this.ysS != null)
    {
      this.ysS.setPressed(false);
      refreshDrawableState();
      this.ysS = null;
    }
    AppMethodBeat.o(106376);
  }

  private void dzx()
  {
    AppMethodBeat.i(106378);
    if (this.ytc != null)
      this.ytc.eL();
    if (this.ytd != null)
      this.ytd.eL();
    AppMethodBeat.o(106378);
  }

  private static ViewGroup.LayoutParams eF(View paramView)
  {
    AppMethodBeat.i(106358);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView = localLayoutParams;
    if (localLayoutParams == null)
      paramView = new ViewGroup.LayoutParams(-2, -1);
    AppMethodBeat.o(106358);
    return paramView;
  }

  private View getLeftmostChild()
  {
    AppMethodBeat.i(106364);
    View localView = getChildAt(0);
    AppMethodBeat.o(106364);
    return localView;
  }

  private int getRenderHeight()
  {
    AppMethodBeat.i(106368);
    int i = getHeight();
    int j = getPaddingTop();
    int k = getPaddingBottom();
    AppMethodBeat.o(106368);
    return i - j - k;
  }

  private int getRenderWidth()
  {
    AppMethodBeat.i(106369);
    int i = getWidth();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    AppMethodBeat.o(106369);
    return i - j - k;
  }

  private View getRightmostChild()
  {
    AppMethodBeat.i(106365);
    View localView = getChildAt(getChildCount() - 1);
    AppMethodBeat.o(106365);
    return localView;
  }

  private int hf(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106366);
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      getChildAt(j).getHitRect(this.mRect);
      if (this.mRect.contains(paramInt1, paramInt2))
        AppMethodBeat.o(106366);
    }
    while (true)
    {
      return j;
      j++;
      break;
      j = -1;
      AppMethodBeat.o(106366);
    }
  }

  private void i(int paramInt, View paramView)
  {
    AppMethodBeat.i(106355);
    paramInt = this.Ei.getItemViewType(paramInt);
    if (Nz(paramInt))
      ((Queue)this.ysR.get(paramInt)).offer(paramView);
    AppMethodBeat.o(106355);
  }

  private void initView()
  {
    AppMethodBeat.i(106350);
    this.ysU = -1;
    this.ysV = -1;
    this.ysG = 0;
    this.ysD = 0;
    this.ysE = 0;
    this.ysF = 2147483647;
    setCurrentScrollState(HorizontalListViewV2.d.a.ytk);
    AppMethodBeat.o(106350);
  }

  private void j(Boolean paramBoolean)
  {
    AppMethodBeat.i(106345);
    Object localObject;
    if (this.ytg != paramBoolean.booleanValue())
    {
      localObject = this;
      if ((((View)localObject).getParent() instanceof View))
        if (((((View)localObject).getParent() instanceof ListView)) || ((((View)localObject).getParent() instanceof ScrollView)))
        {
          ((View)localObject).getParent().requestDisallowInterceptTouchEvent(paramBoolean.booleanValue());
          this.ytg = paramBoolean.booleanValue();
          AppMethodBeat.o(106345);
        }
    }
    while (true)
    {
      return;
      localObject = (View)((View)localObject).getParent();
      break;
      AppMethodBeat.o(106345);
    }
  }

  private void reset()
  {
    AppMethodBeat.i(106351);
    initView();
    removeAllViewsInLayout();
    requestLayout();
    AppMethodBeat.o(106351);
  }

  private void setCurrentScrollState(HorizontalListViewV2.d.a parama)
  {
    AppMethodBeat.i(106379);
    if ((this.ytb != parama) && (this.yta != null))
      this.yta.a(parama);
    this.ytb = parama;
    AppMethodBeat.o(106379);
  }

  protected final boolean bp(float paramFloat)
  {
    AppMethodBeat.i(106374);
    this.ysP.fling(this.ysE, 0, (int)-paramFloat, 0, 0, this.ysF, 0, 0);
    setCurrentScrollState(HorizontalListViewV2.d.a.ytm);
    requestLayout();
    AppMethodBeat.o(106374);
    return true;
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(106373);
    super.dispatchDraw(paramCanvas);
    AppMethodBeat.o(106373);
  }

  protected void dispatchSetPressed(boolean paramBoolean)
  {
  }

  public final void dzv()
  {
    AppMethodBeat.i(106370);
    this.ysP.startScroll(this.ysE, 0, 0 - this.ysE, 0);
    setCurrentScrollState(HorizontalListViewV2.d.a.ytm);
    requestLayout();
    AppMethodBeat.o(106370);
  }

  public ListAdapter getAdapter()
  {
    return this.Ei;
  }

  public int getFirstVisiblePosition()
  {
    return this.ysU;
  }

  public int getLastVisiblePosition()
  {
    return this.ysV;
  }

  protected float getLeftFadingEdgeStrength()
  {
    AppMethodBeat.i(106360);
    int i = getHorizontalFadingEdgeLength();
    float f;
    if (this.ysD == 0)
    {
      f = 0.0F;
      AppMethodBeat.o(106360);
    }
    while (true)
    {
      return f;
      if (this.ysD < i)
      {
        f = this.ysD / i;
        AppMethodBeat.o(106360);
      }
      else
      {
        f = 1.0F;
        AppMethodBeat.o(106360);
      }
    }
  }

  protected float getRightFadingEdgeStrength()
  {
    AppMethodBeat.i(106361);
    int i = getHorizontalFadingEdgeLength();
    float f;
    if (this.ysD == this.ysF)
    {
      f = 0.0F;
      AppMethodBeat.o(106361);
    }
    while (true)
    {
      return f;
      if (this.ysF - this.ysD < i)
      {
        f = (this.ysF - this.ysD) / i;
        AppMethodBeat.o(106361);
      }
      else
      {
        f = 1.0F;
        AppMethodBeat.o(106361);
      }
    }
  }

  public View getSelectedView()
  {
    AppMethodBeat.i(106352);
    int i = this.ysW;
    View localView;
    if ((i >= this.ysU) && (i <= this.ysV))
    {
      localView = getChildAt(i - this.ysU);
      AppMethodBeat.o(106352);
    }
    while (true)
    {
      return localView;
      localView = null;
      AppMethodBeat.o(106352);
    }
  }

  protected final boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106375);
    if (!this.ysP.isFinished());
    for (boolean bool = true; ; bool = false)
    {
      this.ytf = bool;
      this.ysP.forceFinished(true);
      setCurrentScrollState(HorizontalListViewV2.d.a.ytk);
      dzw();
      if (!this.ytf)
      {
        int i = hf((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        if (i >= 0)
        {
          this.ysS = getChildAt(i);
          if (this.ysS != null)
          {
            this.ysS.setPressed(true);
            refreshDrawableState();
          }
        }
      }
      AppMethodBeat.o(106375);
      return true;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(106372);
    super.onDraw(paramCanvas);
    int i = getChildCount();
    Rect localRect = this.mRect;
    this.mRect.top = getPaddingTop();
    this.mRect.bottom = (this.mRect.top + getRenderHeight());
    for (int j = 0; j < i; j++)
      if ((j != i - 1) || (!NA(this.ysV)))
      {
        View localView = getChildAt(j);
        localRect.left = localView.getRight();
        localRect.right = (localView.getRight() + this.alv);
        if (localRect.left < getPaddingLeft())
          localRect.left = getPaddingLeft();
        if (localRect.right > getWidth() - getPaddingRight())
          localRect.right = (getWidth() - getPaddingRight());
        a(paramCanvas, localRect);
        if ((j == 0) && (localView.getLeft() > getPaddingLeft()))
        {
          localRect.left = getPaddingLeft();
          localRect.right = localView.getLeft();
          a(paramCanvas, localRect);
        }
      }
    AppMethodBeat.o(106372);
  }

  @SuppressLint({"WrongCall"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106359);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.Ei == null)
      AppMethodBeat.o(106359);
    while (true)
    {
      return;
      invalidate();
      if (this.ysL)
      {
        i = this.ysD;
        initView();
        removeAllViewsInLayout();
        this.ysE = i;
        this.ysL = false;
      }
      if (this.ysT != null)
      {
        this.ysE = this.ysT.intValue();
        this.ysT = null;
      }
      if (this.ysP.computeScrollOffset())
        this.ysE = this.ysP.getCurrX();
      int j;
      label181: int k;
      if (this.ysE < 0)
      {
        this.ysE = 0;
        if (this.ytc.QM.isFinished())
          this.ytc.aT((int)dzu());
        this.ysP.forceFinished(true);
        setCurrentScrollState(HorizontalListViewV2.d.a.ytk);
        j = this.ysD - this.ysE;
        localView = getLeftmostChild();
        if ((localView == null) || (localView.getRight() + j > 0))
          break label343;
        k = this.ysG;
        if (!NA(this.ysU))
          break label328;
      }
      label328: for (int i = localView.getMeasuredWidth(); ; i = this.alv + localView.getMeasuredWidth())
      {
        this.ysG = (i + k);
        i(this.ysU, localView);
        removeViewInLayout(localView);
        this.ysU += 1;
        localView = getLeftmostChild();
        break label181;
        if (this.ysE <= this.ysF)
          break;
        this.ysE = this.ysF;
        if (this.ytd.QM.isFinished())
          this.ytd.aT((int)dzu());
        this.ysP.forceFinished(true);
        setCurrentScrollState(HorizontalListViewV2.d.a.ytk);
        break;
      }
      while (true)
      {
        label343: localView = getRightmostChild();
        if ((localView == null) || (localView.getLeft() + j < getWidth()))
          break;
        i(this.ysV, localView);
        removeViewInLayout(localView);
        this.ysV -= 1;
      }
      i = 0;
      View localView = getRightmostChild();
      if (localView != null)
        i = localView.getRight();
      if ((i + j + this.alv < getWidth()) && (this.ysV + 1 < this.Ei.getCount()))
      {
        this.ysV += 1;
        if (this.ysU < 0)
          this.ysU = this.ysV;
        localView = this.Ei.getView(this.ysV, Ny(this.ysV), this);
        ai(localView, -1);
        if (this.ysV == 0);
        for (k = 0; ; k = this.alv)
        {
          k = i + (k + localView.getMeasuredWidth());
          i = k;
          if (this.ysX == null)
            break;
          i = k;
          if (this.Ei == null)
            break;
          i = k;
          if (this.Ei.getCount() - (this.ysV + 1) >= this.ysY)
            break;
          i = k;
          if (this.ysZ)
            break;
          this.ysZ = true;
          i = k;
          break;
        }
      }
      i = 0;
      localView = getLeftmostChild();
      if (localView != null)
        i = localView.getLeft();
      if ((i + j - this.alv > 0) && (this.ysU > 0))
      {
        this.ysU -= 1;
        localView = this.Ei.getView(this.ysU, Ny(this.ysU), this);
        ai(localView, 0);
        if (this.ysU == 0)
        {
          k = localView.getMeasuredWidth();
          label710: k = i - k;
          m = this.ysG;
          if (k + j != 0)
            break label769;
        }
        label769: for (i = localView.getMeasuredWidth(); ; i = this.alv + localView.getMeasuredWidth())
        {
          this.ysG = (m - i);
          i = k;
          break;
          k = this.alv + localView.getMeasuredWidth();
          break label710;
        }
      }
      int m = getChildCount();
      if (m > 0)
      {
        this.ysG += j;
        k = this.ysG;
        for (i = 0; i < m; i++)
        {
          localView = getChildAt(i);
          j = getPaddingLeft() + k;
          int n = getPaddingTop();
          localView.layout(j, n, localView.getMeasuredWidth() + j, localView.getMeasuredHeight() + n);
          k += localView.getMeasuredWidth() + this.alv;
        }
      }
      this.ysD = this.ysE;
      if (NA(this.ysV))
      {
        localView = getRightmostChild();
        if (localView != null)
        {
          k = this.ysF;
          i = this.ysD;
          this.ysF = (localView.getRight() - getPaddingLeft() + i - getRenderWidth());
          if (this.ysF < 0)
            this.ysF = 0;
          if (this.ysF == k);
        }
      }
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label1010;
        onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(106359);
        break;
      }
      label1010: if (this.ysP.isFinished())
      {
        if (this.ytb == HorizontalListViewV2.d.a.ytm)
        {
          setCurrentScrollState(HorizontalListViewV2.d.a.ytk);
          AppMethodBeat.o(106359);
        }
      }
      else
      {
        s.b(this, this.yti);
        AppMethodBeat.o(106359);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106363);
    super.onMeasure(paramInt1, paramInt2);
    this.yte = paramInt2;
    AppMethodBeat.o(106363);
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(106347);
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      this.ysT = Integer.valueOf(paramParcelable.getInt("BUNDLE_ID_CURRENT_X"));
      super.onRestoreInstanceState(paramParcelable.getParcelable("BUNDLE_ID_PARENT_STATE"));
    }
    AppMethodBeat.o(106347);
  }

  public Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(106346);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
    localBundle.putInt("BUNDLE_ID_CURRENT_X", this.ysD);
    AppMethodBeat.o(106346);
    return localBundle;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106377);
    if (paramMotionEvent.getAction() == 1)
    {
      if ((this.ysP == null) || (this.ysP.isFinished()))
        setCurrentScrollState(HorizontalListViewV2.d.a.ytk);
      j(Boolean.FALSE);
      dzx();
    }
    while (true)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106377);
      return bool;
      if (paramMotionEvent.getAction() == 3)
      {
        dzw();
        dzx();
        j(Boolean.FALSE);
      }
    }
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    int i = 0;
    AppMethodBeat.i(106353);
    if (this.Ei != null)
      this.Ei.unregisterDataSetObserver(this.yth);
    if (paramListAdapter != null)
    {
      this.ysZ = false;
      this.Ei = paramListAdapter;
      this.Ei.registerDataSetObserver(this.yth);
    }
    if (this.Ei != null)
    {
      int j = this.Ei.getViewTypeCount();
      this.ysR.clear();
      while (i < j)
      {
        this.ysR.add(new LinkedList());
        i++;
      }
    }
    reset();
    AppMethodBeat.o(106353);
  }

  public void setDivider(Drawable paramDrawable)
  {
    AppMethodBeat.i(106348);
    this.ahS = paramDrawable;
    if (paramDrawable != null)
    {
      setDividerWidth(paramDrawable.getIntrinsicWidth());
      AppMethodBeat.o(106348);
    }
    while (true)
    {
      return;
      setDividerWidth(0);
      AppMethodBeat.o(106348);
    }
  }

  public void setDividerWidth(int paramInt)
  {
    AppMethodBeat.i(106349);
    this.alv = paramInt;
    requestLayout();
    invalidate();
    AppMethodBeat.o(106349);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }

  public void setOnScrollStateChangedListener(HorizontalListViewV2.d paramd)
  {
    this.yta = paramd;
  }

  public void setSelection(int paramInt)
  {
    this.ysW = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListViewV2
 * JD-Core Version:    0.6.2
 */