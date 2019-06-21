package com.tencent.mm.ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.Queue;

public class MMHorList extends AdapterView<ListAdapter>
{
  private boolean oOm;
  private int offset;
  private boolean yvA;
  private boolean yvB;
  private int yvC;
  private int yvD;
  private boolean yvE;
  private DataSetObserver yvF;
  private GestureDetector.OnGestureListener yvG;
  private a yvl;
  private int yvm;
  private int yvn;
  private int yvo;
  private int yvp;
  private int yvq;
  private Queue<View> yvr;
  private boolean yvs;
  private boolean yvt;
  protected Scroller yvu;
  private GestureDetector yvv;
  private AdapterView.OnItemSelectedListener yvw;
  private AdapterView.OnItemClickListener yvx;
  private ListAdapter yvy;
  private Runnable yvz;

  public MMHorList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106662);
    this.yvq = 536870912;
    this.yvr = new LinkedList();
    this.yvs = false;
    this.yvt = false;
    this.yvz = new MMHorList.1(this);
    this.yvA = false;
    this.yvB = false;
    this.yvC = 0;
    this.yvD = 0;
    this.oOm = false;
    this.yvE = false;
    this.yvF = new MMHorList.2(this);
    this.yvG = new MMHorList.3(this);
    init();
    AppMethodBeat.o(106662);
  }

  public MMHorList(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106661);
    this.yvq = 536870912;
    this.yvr = new LinkedList();
    this.yvs = false;
    this.yvt = false;
    this.yvz = new MMHorList.1(this);
    this.yvA = false;
    this.yvB = false;
    this.yvC = 0;
    this.yvD = 0;
    this.oOm = false;
    this.yvE = false;
    this.yvF = new MMHorList.2(this);
    this.yvG = new MMHorList.3(this);
    init();
    AppMethodBeat.o(106661);
  }

  private void ai(View paramView, int paramInt)
  {
    AppMethodBeat.i(106666);
    this.yvt = true;
    ViewGroup.LayoutParams localLayoutParams1 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams2 = localLayoutParams1;
    if (localLayoutParams1 == null)
      localLayoutParams2 = new ViewGroup.LayoutParams(-1, -1);
    addViewInLayout(paramView, paramInt, localLayoutParams2, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), -2147483648), View.MeasureSpec.makeMeasureSpec(getHeight(), -2147483648));
    AppMethodBeat.o(106666);
  }

  private int getChildViewTotalWidth()
  {
    AppMethodBeat.i(106664);
    int i = this.yvy.getCount();
    int j = this.yvC;
    AppMethodBeat.o(106664);
    return i * j;
  }

  private void init()
  {
    AppMethodBeat.i(106660);
    this.yvu = new Scroller(getContext());
    this.yvm = -1;
    this.yvn = 0;
    this.offset = 0;
    this.yvo = 0;
    this.yvp = 0;
    this.yvs = false;
    this.yvq = 536870912;
    this.yvv = new GestureDetector(getContext(), this.yvG);
    AppMethodBeat.o(106660);
  }

  private void reset()
  {
    AppMethodBeat.i(106672);
    init();
    removeAllViewsInLayout();
    requestLayout();
    AppMethodBeat.o(106672);
  }

  public final void NI(int paramInt)
  {
    AppMethodBeat.i(106670);
    this.yvu.forceFinished(true);
    this.yvu.startScroll(this.yvo, 0, paramInt - this.yvo, 0);
    this.yvE = true;
    requestLayout();
    AppMethodBeat.o(106670);
  }

  protected final boolean bp(float paramFloat)
  {
    AppMethodBeat.i(106671);
    this.yvu.fling(this.yvp, 0, (int)-paramFloat, 0, 0, this.yvq, 0, 0);
    requestLayout();
    AppMethodBeat.o(106671);
    return true;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106668);
    boolean bool = this.yvv.onTouchEvent(paramMotionEvent);
    if (paramMotionEvent.getAction() == 0)
    {
      this.oOm = true;
      if (this.yvl != null)
        this.yvl.cEF();
    }
    while ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1))
    {
      AppMethodBeat.o(106668);
      return bool;
    }
    if (this.yvB)
    {
      if (getChildViewTotalWidth() <= getWidth())
        break label193;
      if (this.yvo >= 0)
        break label145;
      this.yvu.forceFinished(true);
      this.yvu.startScroll(this.yvo, 0, 0 - this.yvo, 0);
      requestLayout();
    }
    while (true)
    {
      this.oOm = false;
      if (this.yvl == null)
        break;
      this.yvl.cEG();
      break;
      label145: if (this.yvo > this.yvq)
      {
        this.yvu.forceFinished(true);
        this.yvu.startScroll(this.yvo, 0, this.yvq - this.yvo, 0);
        requestLayout();
        continue;
        label193: if (this.yvo != this.yvD * -1)
        {
          this.yvu.forceFinished(true);
          this.yvu.startScroll(this.yvo, 0, 0 - this.yvo, 0);
          requestLayout();
        }
      }
    }
  }

  protected final boolean dzt()
  {
    AppMethodBeat.i(106669);
    this.yvu.forceFinished(true);
    AppMethodBeat.o(106669);
    return true;
  }

  public ListAdapter getAdapter()
  {
    return this.yvy;
  }

  public int getCurrentPosition()
  {
    return this.yvo;
  }

  public boolean getIsTouching()
  {
    return this.oOm;
  }

  public View getSelectedView()
  {
    return null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106665);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.yvy == null)
    {
      AppMethodBeat.o(106665);
      return;
    }
    this.yvt = true;
    if (this.yvs)
    {
      paramInt1 = this.yvo;
      init();
      removeAllViewsInLayout();
      this.yvp = paramInt1;
      if (this.yvA)
      {
        this.yvD = Math.max(0, (getWidth() - getChildViewTotalWidth()) / 2);
        this.offset = this.yvD;
      }
      this.yvs = false;
    }
    if (this.yvu.computeScrollOffset())
      this.yvp = this.yvu.getCurrX();
    if (this.yvB)
      if (getChildViewTotalWidth() > getWidth())
      {
        if (this.yvp < getWidth() * -1)
        {
          this.yvp = (getWidth() * -1 + 1);
          this.yvu.forceFinished(true);
        }
        if (this.yvp > this.yvq + getWidth())
        {
          this.yvp = (this.yvq + getWidth() - 1);
          this.yvu.forceFinished(true);
        }
      }
    while (true)
    {
      paramInt2 = this.yvo - this.yvp;
      localView = getChildAt(0);
      while ((localView != null) && (localView.getRight() + paramInt2 <= 0))
      {
        this.offset += localView.getMeasuredWidth();
        this.yvr.offer(localView);
        removeViewInLayout(localView);
        this.yvm += 1;
        localView = getChildAt(0);
        this.yvt = true;
      }
      if (this.yvp < getWidth() * -1 + this.yvD)
      {
        this.yvp = (getWidth() * -1 + this.yvD + 1);
        this.yvu.forceFinished(true);
      }
      if (this.yvp > getWidth() - this.yvD)
      {
        this.yvp = (getWidth() - this.yvD - 1);
        this.yvu.forceFinished(true);
        continue;
        if (this.yvp < 0)
        {
          this.yvp = 0;
          this.yvu.forceFinished(true);
        }
        if (this.yvp > this.yvq)
        {
          this.yvp = this.yvq;
          this.yvu.forceFinished(true);
        }
      }
    }
    View localView = getChildAt(getChildCount() - 1);
    while ((localView != null) && (localView.getLeft() + paramInt2 >= getWidth()))
    {
      this.yvr.offer(localView);
      removeViewInLayout(localView);
      this.yvn -= 1;
      localView = getChildAt(getChildCount() - 1);
      this.yvt = true;
    }
    localView = getChildAt(getChildCount() - 1);
    if (localView != null)
      paramInt1 = localView.getRight();
    while (true)
      if ((paramInt1 + paramInt2 < getWidth()) && (this.yvn < this.yvy.getCount()))
      {
        localView = this.yvy.getView(this.yvn, (View)this.yvr.poll(), this);
        ai(localView, -1);
        paramInt1 = localView.getMeasuredWidth() + paramInt1;
        if (this.yvn == this.yvy.getCount() - 1)
          this.yvq = (this.yvo + paramInt1 - getWidth());
        this.yvn += 1;
      }
      else
      {
        localView = getChildAt(0);
        if (localView != null)
          paramInt1 = localView.getLeft();
        while (true)
          if ((paramInt1 + paramInt2 > 0) && (this.yvm >= 0))
          {
            localView = this.yvy.getView(this.yvm, (View)this.yvr.poll(), this);
            ai(localView, 0);
            paramInt3 = localView.getMeasuredWidth();
            this.yvm -= 1;
            this.offset -= localView.getMeasuredWidth();
            paramInt1 -= paramInt3;
          }
          else
          {
            if ((getChildCount() > 0) && (this.yvt))
            {
              this.offset += paramInt2;
              paramInt2 = this.offset;
              for (paramInt1 = 0; paramInt1 < getChildCount(); paramInt1++)
              {
                localView = getChildAt(paramInt1);
                paramInt3 = localView.getMeasuredWidth();
                localView.layout(paramInt2, 0, paramInt2 + paramInt3, localView.getMeasuredHeight());
                paramInt2 += paramInt3;
              }
            }
            this.yvo = this.yvp;
            if (!this.yvu.isFinished())
            {
              post(this.yvz);
              AppMethodBeat.o(106665);
              break;
            }
            if ((this.yvl != null) && (this.yvE))
            {
              this.yvl.aQe();
              this.yvE = false;
            }
            AppMethodBeat.o(106665);
            break;
            paramInt1 = 0;
          }
        paramInt1 = 0;
      }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106667);
    if ((this.yvy != null) && (this.yvy.getCount() > 0))
    {
      View localView = getChildAt(0);
      if (localView != null)
      {
        super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), -2147483648));
        AppMethodBeat.o(106667);
      }
    }
    while (true)
    {
      return;
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(106667);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(106663);
    if (this.yvy == null)
      paramListAdapter.registerDataSetObserver(this.yvF);
    this.yvy = paramListAdapter;
    reset();
    AppMethodBeat.o(106663);
  }

  public void setCenterInParent(boolean paramBoolean)
  {
    this.yvA = paramBoolean;
  }

  public void setHorListLitener(a parama)
  {
    this.yvl = parama;
  }

  public void setItemWidth(int paramInt)
  {
    this.yvC = paramInt;
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.yvx = paramOnItemClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.yvw = paramOnItemSelectedListener;
  }

  public void setOverScrollEnabled(boolean paramBoolean)
  {
    this.yvB = paramBoolean;
  }

  public void setSelection(int paramInt)
  {
  }

  public static abstract interface a
  {
    public abstract void aQe();

    public abstract void cEF();

    public abstract void cEG();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMHorList
 * JD-Core Version:    0.6.2
 */