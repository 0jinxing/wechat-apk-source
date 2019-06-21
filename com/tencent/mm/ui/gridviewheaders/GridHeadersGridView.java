package com.tencent.mm.ui.gridviewheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.List;

public class GridHeadersGridView extends GridView
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemSelectedListener
{
  private DataSetObserver PL;
  private AdapterView.OnItemSelectedListener Up;
  private AdapterView.OnItemClickListener arw;
  protected int ath;
  private ak mHandler;
  private int mNumColumns;
  private int mScrollState;
  private int mTouchSlop;
  private AdapterView.OnItemLongClickListener oiQ;
  private AbsListView.OnScrollListener rLS;
  protected boolean ysL;
  private int ysw;
  private int ysx;
  private Runnable yxd;
  private final Rect zyA;
  private boolean zyB;
  private boolean zyC;
  private int zyD;
  private long zyE;
  private int zyF;
  private float zyG;
  private boolean zyH;
  private int zyI;
  GridHeadersGridView.c zyJ;
  GridHeadersGridView.d zyK;
  private GridHeadersGridView.e zyL;
  private View zyM;
  protected c zyN;
  protected int zyO;
  private boolean zyP;
  public a zyx;
  public GridHeadersGridView.b zyy;
  private boolean zyz;

  public GridHeadersGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842865);
  }

  public GridHeadersGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107373);
    this.mHandler = new ak();
    this.zyz = true;
    this.zyA = new Rect();
    this.zyE = -1L;
    this.PL = new GridHeadersGridView.1(this);
    this.zyI = 1;
    this.mScrollState = 0;
    this.zyP = true;
    super.setOnScrollListener(this);
    setVerticalFadingEdgeEnabled(false);
    if (!this.zyH)
      this.mNumColumns = -1;
    this.mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    AppMethodBeat.o(107373);
  }

  private void PF(int paramInt)
  {
    AppMethodBeat.i(107397);
    if ((this.zyN == null) || (this.zyN.getCount() == 0) || (!this.zyz))
      AppMethodBeat.o(107397);
    while (true)
    {
      return;
      if ((c.d)getChildAt(0) != null)
        break;
      AppMethodBeat.o(107397);
    }
    int i = paramInt - this.zyI;
    int j = i;
    if (i < 0)
      j = paramInt;
    int k = this.zyI + paramInt;
    i = k;
    if (k >= this.zyN.getCount())
      i = paramInt;
    long l;
    label143: Object localObject;
    label200: c.d locald;
    if (this.ysx != 0)
      if (this.ysx < 0)
      {
        this.zyN.tw(paramInt);
        if (getChildAt(this.zyI).getTop() <= 0)
        {
          l = this.zyN.tw(i);
          j = i;
          if (this.zyE != l)
          {
            this.zyM = this.zyN.a(j, this.zyM, this);
            dJi();
            this.zyE = l;
          }
          int m = getChildCount();
          if (m == 0)
            break label524;
          localObject = null;
          j = 99999;
          k = 0;
          if (k >= m)
            break label347;
          locald = (c.d)super.getChildAt(k);
          if (!this.zyB)
            break label338;
          i = locald.getTop() - getPaddingTop();
          label236: if ((i < 0) || (!(locald.getView() instanceof c.b)) || (i >= j))
            break label532;
          localObject = locald;
        }
      }
    while (true)
    {
      k += this.zyI;
      j = i;
      break label200;
      l = this.zyN.tw(paramInt);
      j = paramInt;
      break label143;
      i = getChildAt(0).getTop();
      if ((i > 0) && (i < this.ysx))
      {
        l = this.zyN.tw(j);
        break label143;
      }
      l = this.zyN.tw(paramInt);
      j = paramInt;
      break label143;
      label338: i = locald.getTop();
      break label236;
      label347: j = getHeaderHeight();
      if (localObject != null)
      {
        if ((paramInt == 0) && (super.getChildAt(0).getTop() > 0) && (!this.zyB))
        {
          this.zyF = 0;
          AppMethodBeat.o(107397);
          break;
        }
        if (this.zyB)
        {
          this.zyF = Math.min(localObject.getTop(), getPaddingTop() + j);
          if (this.zyF < getPaddingTop());
          for (paramInt = j + getPaddingTop(); ; paramInt = this.zyF)
          {
            this.zyF = paramInt;
            AppMethodBeat.o(107397);
            break;
          }
        }
        this.zyF = Math.min(localObject.getTop(), j);
        if (this.zyF < 0);
        for (paramInt = j; ; paramInt = this.zyF)
        {
          this.zyF = paramInt;
          AppMethodBeat.o(107397);
          break;
        }
      }
      this.zyF = j;
      if (this.zyB)
        this.zyF += getPaddingTop();
      label524: AppMethodBeat.o(107397);
      break;
      label532: i = j;
    }
  }

  private void dJi()
  {
    AppMethodBeat.i(107396);
    if (this.zyM == null)
    {
      AppMethodBeat.o(107396);
      return;
    }
    int i = View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 1073741824);
    ViewGroup.LayoutParams localLayoutParams = this.zyM.getLayoutParams();
    if ((localLayoutParams != null) && (localLayoutParams.height > 0));
    for (int j = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824); ; j = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      this.zyM.measure(i, j);
      this.zyM.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.zyM.getMeasuredHeight());
      AppMethodBeat.o(107396);
      break;
    }
  }

  private int getHeaderHeight()
  {
    AppMethodBeat.i(107395);
    int i;
    if (this.zyM != null)
    {
      i = this.zyM.getMeasuredHeight();
      AppMethodBeat.o(107395);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(107395);
    }
  }

  private void reset()
  {
    this.zyF = 0;
    this.zyM = null;
    this.zyE = -9223372036854775808L;
  }

  public final View PE(int paramInt)
  {
    AppMethodBeat.i(107374);
    View localView;
    if (paramInt == -2)
    {
      localView = this.zyM;
      AppMethodBeat.o(107374);
    }
    while (true)
    {
      return localView;
      try
      {
        localView = (View)getChildAt(paramInt).getTag();
        AppMethodBeat.o(107374);
      }
      catch (Exception localException)
      {
        Object localObject = null;
        AppMethodBeat.o(107374);
      }
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107398);
    if (Build.VERSION.SDK_INT < 8)
      PF(getFirstVisiblePosition());
    if ((this.zyM != null) && (this.zyz) && (this.zyM.getVisibility() == 0));
    int j;
    int k;
    ArrayList localArrayList;
    int n;
    for (int i = 1; ; i = 0)
    {
      j = getHeaderHeight();
      k = this.zyF - j;
      if ((i != 0) && (this.zyP))
      {
        this.zyA.left = getPaddingLeft();
        this.zyA.right = (getWidth() - getPaddingRight());
        this.zyA.top = this.zyF;
        this.zyA.bottom = getHeight();
        paramCanvas.save();
        paramCanvas.clipRect(this.zyA);
      }
      super.dispatchDraw(paramCanvas);
      localArrayList = new ArrayList();
      m = 0;
      n = getFirstVisiblePosition();
      while (n <= getLastVisiblePosition())
      {
        if (getItemIdAtPosition(n) == -1L)
          localArrayList.add(Integer.valueOf(m));
        n += this.zyI;
        m += this.zyI;
      }
    }
    int m = 0;
    if (m < localArrayList.size())
    {
      c.d locald = (c.d)getChildAt(((Integer)localArrayList.get(m)).intValue());
      while (true)
      {
        try
        {
          View localView = (View)locald.getTag();
          if ((((c.b)locald.getChildAt(0)).getHeaderId() != this.zyE) || (locald.getTop() >= 0) || (!this.zyz))
            break label482;
          n = 1;
          if ((localView.getVisibility() == 0) && (n == 0))
          {
            localView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824 - getPaddingLeft() - getPaddingRight()), View.MeasureSpec.makeMeasureSpec(0, 0));
            localView.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), locald.getHeight());
            this.zyA.left = getPaddingLeft();
            this.zyA.right = (getWidth() - getPaddingRight());
            this.zyA.bottom = locald.getBottom();
            this.zyA.top = locald.getTop();
            paramCanvas.save();
            paramCanvas.clipRect(this.zyA);
            paramCanvas.translate(getPaddingLeft(), locald.getTop());
            localView.draw(paramCanvas);
            paramCanvas.restore();
          }
          m++;
        }
        catch (Exception paramCanvas)
        {
          AppMethodBeat.o(107398);
        }
        return;
        label482: n = 0;
      }
    }
    if ((i != 0) && (this.zyP))
    {
      paramCanvas.restore();
      label503: if (this.zyM.getWidth() != getWidth() - getPaddingLeft() - getPaddingRight())
      {
        m = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824 - getPaddingLeft() - getPaddingRight());
        i = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.zyM.measure(m, i);
        this.zyM.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.zyM.getHeight());
      }
      this.zyA.left = getPaddingLeft();
      this.zyA.right = (getWidth() - getPaddingRight());
      this.zyA.bottom = (k + j);
      if (!this.zyB)
        break label749;
    }
    label749: for (this.zyA.top = getPaddingTop(); ; this.zyA.top = 0)
    {
      paramCanvas.save();
      paramCanvas.clipRect(this.zyA);
      paramCanvas.translate(getPaddingLeft(), k);
      paramCanvas.saveLayerAlpha(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), (int)(255.0F * this.zyF / j), 31);
      this.zyM.draw(paramCanvas);
      paramCanvas.restore();
      paramCanvas.restore();
      AppMethodBeat.o(107398);
      break;
      if (i != 0)
        break label503;
      AppMethodBeat.o(107398);
      break;
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = -2;
    boolean bool = false;
    AppMethodBeat.i(107383);
    int j;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
      j = 0;
      label47: if (j != 0)
        AppMethodBeat.o(107383);
      break;
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      return bool;
      if (this.zyy == null)
        this.zyy = new GridHeadersGridView.b(this);
      this.mHandler.postDelayed(this.zyx, ViewConfiguration.getTapTimeout());
      j = (int)paramMotionEvent.getY();
      this.zyG = j;
      float f = j;
      if ((this.zyM != null) && (f <= this.zyM.getBottom()));
      while (true)
      {
        this.zyO = i;
        if ((this.zyO == -1) || (this.mScrollState == 2))
          break;
        this.ath = 0;
        break;
        int k = getFirstVisiblePosition();
        j = 0;
        while (true)
        {
          if (k > getLastVisiblePosition())
            break label257;
          if (getItemIdAtPosition(k) == -1L)
          {
            localObject = getChildAt(j);
            i = ((View)localObject).getBottom();
            int m = ((View)localObject).getTop();
            if (f <= i)
            {
              i = j;
              if (f >= m)
                break;
            }
          }
          k += this.zyI;
          j += this.zyI;
        }
        label257: i = -1;
      }
      if ((this.zyO == -1) || (Math.abs(paramMotionEvent.getY() - this.zyG) <= this.mTouchSlop))
        break;
      this.ath = -1;
      Object localObject = PE(this.zyO);
      if (localObject != null)
        ((View)localObject).setPressed(false);
      if (this.zyx != null)
        this.mHandler.removeCallbacks(this.zyx);
      this.zyO = -1;
      break;
      if ((this.ath == -2) || (this.ath == -1) || (this.zyO == -1))
        break;
      View localView = PE(this.zyO);
      GridHeadersGridView.e locale;
      if ((localView != null) && (!localView.hasFocusable()))
      {
        if (this.ath != 0)
          localView.setPressed(false);
        if (this.zyL == null)
          this.zyL = new GridHeadersGridView.e(this, (byte)0);
        locale = this.zyL;
        locale.zyT = this.zyO;
        locale.dJk();
        if ((this.ath == 0) && (this.ath == 1))
          break label584;
        localak = this.mHandler;
        if (this.ath == 0);
        for (localObject = this.zyy; ; localObject = this.zyx)
        {
          localak.removeCallbacks((Runnable)localObject);
          if (this.ysL)
            break label571;
          this.ath = 1;
          localView.setPressed(true);
          setPressed(true);
          if (this.yxd != null)
            removeCallbacks(this.yxd);
          this.yxd = new GridHeadersGridView.2(this, localView, locale);
          this.mHandler.postDelayed(this.yxd, ViewConfiguration.getPressedStateDuration());
          j = 1;
          break;
        }
        label571: this.ath = -1;
      }
      label584: 
      while (this.ysL)
      {
        ak localak;
        this.ath = -1;
        break;
      }
      locale.run();
      j = 1;
      break label47;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(107383);
    }
  }

  public View getStickiedHeader()
  {
    return this.zyM;
  }

  public boolean getStickyHeaderIsTranscluent()
  {
    if (!this.zyP);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107375);
    this.arw.onItemClick(paramAdapterView, paramView, this.zyN.PD(paramInt).mPosition, paramLong);
    AppMethodBeat.o(107375);
  }

  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107376);
    boolean bool = this.oiQ.onItemLongClick(paramAdapterView, paramView, this.zyN.PD(paramInt).mPosition, paramLong);
    AppMethodBeat.o(107376);
    return bool;
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107377);
    this.Up.onItemSelected(paramAdapterView, paramView, this.zyN.PD(paramInt).mPosition, paramLong);
    AppMethodBeat.o(107377);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    AppMethodBeat.i(107399);
    if (this.mNumColumns == -1)
      if (this.zyD > 0)
      {
        int j = Math.max(View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight(), 0);
        int k = j / this.zyD;
        if (k > 0)
          for (i = k; (i != 1) && (this.zyD * i + (i - 1) * this.ysw > j); i--);
      }
      else
      {
        i = 2;
      }
    while (true)
      for (this.zyI = i; ; this.zyI = this.mNumColumns)
      {
        if (this.zyN != null)
          this.zyN.setNumColumns(this.zyI);
        dJi();
        super.onMeasure(paramInt1, paramInt2);
        AppMethodBeat.o(107399);
        return;
      }
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    AppMethodBeat.i(107378);
    this.Up.onNothingSelected(paramAdapterView);
    AppMethodBeat.o(107378);
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(107379);
    paramParcelable = (GridHeadersGridView.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.zyz = paramParcelable.zyU;
    requestLayout();
    AppMethodBeat.o(107379);
  }

  public Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(107380);
    GridHeadersGridView.SavedState localSavedState = new GridHeadersGridView.SavedState(super.onSaveInstanceState());
    localSavedState.zyU = this.zyz;
    AppMethodBeat.o(107380);
    return localSavedState;
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107381);
    if (this.rLS != null)
      this.rLS.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (Build.VERSION.SDK_INT >= 8)
      PF(paramInt1);
    AppMethodBeat.o(107381);
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(107382);
    if (this.rLS != null)
      this.rLS.onScrollStateChanged(paramAbsListView, paramInt);
    this.mScrollState = paramInt;
    AppMethodBeat.o(107382);
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(107384);
    if ((this.zyN != null) && (this.PL != null))
      this.zyN.unregisterDataSetObserver(this.PL);
    if (!this.zyC)
      this.zyB = true;
    if ((paramListAdapter instanceof b))
      paramListAdapter = (b)paramListAdapter;
    while (true)
    {
      this.zyN = new c(getContext(), this, paramListAdapter);
      this.zyN.registerDataSetObserver(this.PL);
      reset();
      super.setAdapter(this.zyN);
      AppMethodBeat.o(107384);
      return;
      if ((paramListAdapter instanceof e))
        paramListAdapter = new f((e)paramListAdapter);
      else
        paramListAdapter = new d(paramListAdapter);
    }
  }

  public void setAreHeadersSticky(boolean paramBoolean)
  {
    AppMethodBeat.i(107385);
    if (paramBoolean != this.zyz)
    {
      this.zyz = paramBoolean;
      requestLayout();
    }
    AppMethodBeat.o(107385);
  }

  public void setClipToPadding(boolean paramBoolean)
  {
    AppMethodBeat.i(107386);
    super.setClipToPadding(paramBoolean);
    this.zyB = paramBoolean;
    this.zyC = true;
    AppMethodBeat.o(107386);
  }

  public void setColumnWidth(int paramInt)
  {
    AppMethodBeat.i(107387);
    super.setColumnWidth(paramInt);
    this.zyD = paramInt;
    AppMethodBeat.o(107387);
  }

  public void setHorizontalSpacing(int paramInt)
  {
    AppMethodBeat.i(107388);
    super.setHorizontalSpacing(paramInt);
    this.ysw = paramInt;
    AppMethodBeat.o(107388);
  }

  public void setNumColumns(int paramInt)
  {
    AppMethodBeat.i(107389);
    super.setNumColumns(paramInt);
    this.zyH = true;
    this.mNumColumns = paramInt;
    if ((paramInt != -1) && (this.zyN != null))
      this.zyN.setNumColumns(paramInt);
    AppMethodBeat.o(107389);
  }

  public void setOnHeaderClickListener(GridHeadersGridView.c paramc)
  {
    this.zyJ = paramc;
  }

  public void setOnHeaderLongClickListener(GridHeadersGridView.d paramd)
  {
    AppMethodBeat.i(107390);
    if (!isLongClickable())
      setLongClickable(true);
    this.zyK = paramd;
    AppMethodBeat.o(107390);
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    AppMethodBeat.i(107391);
    this.arw = paramOnItemClickListener;
    super.setOnItemClickListener(this);
    AppMethodBeat.o(107391);
  }

  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    AppMethodBeat.i(107392);
    this.oiQ = paramOnItemLongClickListener;
    super.setOnItemLongClickListener(this);
    AppMethodBeat.o(107392);
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    AppMethodBeat.i(107393);
    this.Up = paramOnItemSelectedListener;
    super.setOnItemSelectedListener(this);
    AppMethodBeat.o(107393);
  }

  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.rLS = paramOnScrollListener;
  }

  public void setStickyHeaderIsTranscluent(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.zyP = paramBoolean;
      return;
    }
  }

  public void setVerticalSpacing(int paramInt)
  {
    AppMethodBeat.i(107394);
    super.setVerticalSpacing(paramInt);
    this.ysx = paramInt;
    AppMethodBeat.o(107394);
  }

  final class a extends GridHeadersGridView.f
    implements Runnable
  {
    private a()
    {
      super((byte)0);
    }

    public final void run()
    {
      AppMethodBeat.i(107363);
      View localView = GridHeadersGridView.this.PE(GridHeadersGridView.this.zyO);
      boolean bool1;
      if (localView != null)
      {
        GridHeadersGridView.a(GridHeadersGridView.this, GridHeadersGridView.this.zyO);
        if ((!dJl()) || (GridHeadersGridView.this.ysL))
          break label157;
        GridHeadersGridView localGridHeadersGridView = GridHeadersGridView.this;
        if (localGridHeadersGridView.zyK == null)
          break label152;
        bool1 = localGridHeadersGridView.zyK.dJj();
        bool2 = bool1;
        if (bool1)
        {
          if (localView != null)
            localView.sendAccessibilityEvent(2);
          localGridHeadersGridView.performHapticFeedback(0);
        }
      }
      label152: label157: for (boolean bool2 = bool1; ; bool2 = false)
      {
        if (bool2)
        {
          GridHeadersGridView.this.ath = -2;
          GridHeadersGridView.this.setPressed(false);
          localView.setPressed(false);
          AppMethodBeat.o(107363);
        }
        while (true)
        {
          return;
          GridHeadersGridView.this.ath = 2;
          AppMethodBeat.o(107363);
        }
        bool1 = false;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.GridHeadersGridView
 * JD-Core Version:    0.6.2
 */