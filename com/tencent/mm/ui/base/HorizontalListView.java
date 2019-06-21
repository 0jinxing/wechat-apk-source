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

public class HorizontalListView extends AdapterView<ListAdapter>
{
  protected ListAdapter Ei;
  protected Scroller mScroller;
  private HorizontalListView.a voO;
  public boolean ysA;
  private int ysB;
  private int ysC;
  protected int ysD;
  protected int ysE;
  private int ysF;
  private int ysG;
  private GestureDetector ysH;
  private Queue<View> ysI;
  private AdapterView.OnItemSelectedListener ysJ;
  private AdapterView.OnItemClickListener ysK;
  private boolean ysL;
  private DataSetObserver ysM;
  private GestureDetector.OnGestureListener ysN;

  public HorizontalListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106316);
    this.ysA = true;
    this.ysB = -1;
    this.ysC = 0;
    this.ysF = 2147483647;
    this.ysG = 0;
    this.ysI = new LinkedList();
    this.ysL = false;
    this.ysM = new HorizontalListView.1(this);
    this.ysN = new HorizontalListView.3(this);
    initView();
    AppMethodBeat.o(106316);
  }

  private void ai(View paramView, int paramInt)
  {
    AppMethodBeat.i(106320);
    ViewGroup.LayoutParams localLayoutParams1 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams2 = localLayoutParams1;
    if (localLayoutParams1 == null)
      localLayoutParams2 = new ViewGroup.LayoutParams(-1, -1);
    addViewInLayout(paramView, paramInt, localLayoutParams2, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), -2147483648), View.MeasureSpec.makeMeasureSpec(getHeight(), -2147483648));
    AppMethodBeat.o(106320);
  }

  private void initView()
  {
    try
    {
      AppMethodBeat.i(106317);
      this.ysB = -1;
      this.ysC = 0;
      this.ysG = 0;
      this.ysD = 0;
      this.ysE = 0;
      this.ysF = 2147483647;
      Object localObject1 = new android/widget/Scroller;
      ((Scroller)localObject1).<init>(getContext());
      this.mScroller = ((Scroller)localObject1);
      localObject1 = new android/view/GestureDetector;
      ((GestureDetector)localObject1).<init>(getContext(), this.ysN);
      this.ysH = ((GestureDetector)localObject1);
      AppMethodBeat.o(106317);
      return;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }

  private void reset()
  {
    try
    {
      AppMethodBeat.i(106319);
      initView();
      removeAllViewsInLayout();
      requestLayout();
      AppMethodBeat.o(106319);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final boolean bp(float paramFloat)
  {
    AppMethodBeat.i(106323);
    try
    {
      this.mScroller.fling(this.ysE, 0, (int)-paramFloat, 0, 0, this.ysF, 0, 0);
      requestLayout();
      AppMethodBeat.o(106323);
      return true;
    }
    finally
    {
      AppMethodBeat.o(106323);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106322);
    if (this.voO != null)
      this.voO.o(paramMotionEvent);
    boolean bool1 = super.dispatchTouchEvent(paramMotionEvent);
    boolean bool2 = this.ysH.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(106322);
    return bool1 | bool2;
  }

  protected final boolean dzt()
  {
    AppMethodBeat.i(106324);
    this.mScroller.forceFinished(true);
    AppMethodBeat.o(106324);
    return true;
  }

  public ListAdapter getAdapter()
  {
    return this.Ei;
  }

  public View getSelectedView()
  {
    return null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(106321);
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.Ei == null)
      {
        AppMethodBeat.o(106321);
        return;
      }
      if (this.ysL)
      {
        paramInt1 = this.ysD;
        initView();
        removeAllViewsInLayout();
        this.ysE = paramInt1;
        this.ysL = false;
      }
      if (this.mScroller.computeScrollOffset())
        this.ysE = this.mScroller.getCurrX();
      if (this.ysE <= 0)
      {
        this.ysE = 0;
        this.mScroller.forceFinished(true);
      }
      if (this.ysE >= this.ysF)
      {
        this.ysE = this.ysF;
        this.mScroller.forceFinished(true);
      }
      paramInt2 = this.ysD - this.ysE;
      for (View localView = getChildAt(0); (localView != null) && (localView.getRight() + paramInt2 <= 0); localView = getChildAt(0))
      {
        this.ysG += localView.getMeasuredWidth();
        this.ysI.offer(localView);
        removeViewInLayout(localView);
        this.ysB += 1;
      }
      while (true)
      {
        localView = getChildAt(getChildCount() - 1);
        if ((localView == null) || (localView.getLeft() + paramInt2 < getWidth()))
          break;
        this.ysI.offer(localView);
        removeViewInLayout(localView);
        this.ysC -= 1;
      }
    }
    finally
    {
    }
    Object localObject2 = getChildAt(getChildCount() - 1);
    if (localObject2 != null)
      paramInt1 = ((View)localObject2).getRight();
    while (true)
      if ((paramInt1 + paramInt2 < getWidth()) && (this.ysC < this.Ei.getCount()))
      {
        localObject2 = this.Ei.getView(this.ysC, (View)this.ysI.poll(), this);
        ai((View)localObject2, -1);
        paramInt1 = ((View)localObject2).getMeasuredWidth() + paramInt1;
        if (this.ysC == this.Ei.getCount() - 1)
          this.ysF = (this.ysD + paramInt1 - getWidth());
        if (this.ysF < 0)
          this.ysF = 0;
        this.ysC += 1;
      }
      else
      {
        localObject2 = getChildAt(0);
        if (localObject2 != null)
          paramInt1 = ((View)localObject2).getLeft();
        while (true)
          if ((paramInt1 + paramInt2 > 0) && (this.ysB >= 0))
          {
            localObject2 = this.Ei.getView(this.ysB, (View)this.ysI.poll(), this);
            ai((View)localObject2, 0);
            paramInt3 = ((View)localObject2).getMeasuredWidth();
            this.ysB -= 1;
            this.ysG -= ((View)localObject2).getMeasuredWidth();
            paramInt1 -= paramInt3;
          }
          else
          {
            if (getChildCount() > 0)
            {
              this.ysG += paramInt2;
              paramInt2 = this.ysG;
              for (paramInt1 = i; paramInt1 < getChildCount(); paramInt1++)
              {
                localObject2 = getChildAt(paramInt1);
                paramInt3 = ((View)localObject2).getMeasuredWidth();
                ((View)localObject2).layout(paramInt2, 0, paramInt2 + paramInt3, ((View)localObject2).getMeasuredHeight());
                paramInt2 += paramInt3;
              }
            }
            this.ysD = this.ysE;
            if (!this.mScroller.isFinished())
            {
              localObject2 = new com/tencent/mm/ui/base/HorizontalListView$2;
              ((HorizontalListView.2)localObject2).<init>(this);
              post((Runnable)localObject2);
            }
            AppMethodBeat.o(106321);
            break;
            paramInt1 = 0;
          }
        paramInt1 = 0;
      }
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(106318);
    if (this.Ei != null)
      this.Ei.unregisterDataSetObserver(this.ysM);
    this.Ei = paramListAdapter;
    this.Ei.registerDataSetObserver(this.ysM);
    reset();
    AppMethodBeat.o(106318);
  }

  public void setDispatchTouchListener(HorizontalListView.a parama)
  {
    this.voO = parama;
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.ysK = paramOnItemClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.ysJ = paramOnItemSelectedListener;
  }

  public void setSelection(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListView
 * JD-Core Version:    0.6.2
 */