package com.tencent.mm.ui.widget.sortlist;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends d
  implements GestureDetector.OnGestureListener, View.OnTouchListener
{
  private GestureDetector Mh;
  private int iaN;
  private int iaO;
  private int lcl;
  private int mTouchSlop;
  private int[] yr;
  private int zUg;
  boolean zUh;
  boolean zUi;
  private boolean zUj;
  private GestureDetector zUk;
  private int zUl;
  private int zUm;
  private int zUn;
  private int zUo;
  private int zUp;
  private boolean zUq;
  private float zUr;
  private int zUs;
  private int zUt;
  private int zUu;
  private boolean zUv;
  private DragSortListView zUw;
  private int zUx;
  private GestureDetector.OnGestureListener zUy;

  public a(DragSortListView paramDragSortListView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(paramDragSortListView);
    AppMethodBeat.i(113010);
    this.zUg = 0;
    this.zUh = true;
    this.zUi = false;
    this.zUj = false;
    this.zUl = -1;
    this.zUm = -1;
    this.zUn = -1;
    this.yr = new int[2];
    this.zUq = false;
    this.zUr = 500.0F;
    this.zUy = new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        AppMethodBeat.i(113009);
        int i;
        if ((a.a(a.this)) && (a.b(a.this)))
        {
          i = a.c(a.this).getWidth() / 5;
          if (paramAnonymousFloat1 <= a.d(a.this))
            break label91;
          if (a.e(a.this) > -i)
            a.c(a.this).br(paramAnonymousFloat1);
        }
        while (true)
        {
          a.f(a.this);
          AppMethodBeat.o(113009);
          return false;
          label91: if ((paramAnonymousFloat1 < -a.d(a.this)) && (a.e(a.this) < i))
            a.c(a.this).br(paramAnonymousFloat1);
        }
      }
    };
    this.zUw = paramDragSortListView;
    this.Mh = new GestureDetector(paramDragSortListView.getContext(), this);
    this.zUk = new GestureDetector(paramDragSortListView.getContext(), this.zUy);
    this.zUk.setIsLongpressEnabled(false);
    this.mTouchSlop = ViewConfiguration.get(paramDragSortListView.getContext()).getScaledTouchSlop();
    this.zUs = paramInt1;
    this.zUt = paramInt4;
    this.zUu = paramInt5;
    this.lcl = paramInt3;
    this.zUg = paramInt2;
    AppMethodBeat.o(113010);
  }

  private boolean aF(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = false;
    AppMethodBeat.i(113011);
    if ((this.zUh) && (!this.zUj));
    for (int i = 12; ; i = 0)
    {
      if ((this.zUi) && (this.zUj))
        i = i | 0x1 | 0x2;
      while (true)
      {
        DragSortListView localDragSortListView = this.zUw;
        paramInt1 -= this.zUw.getHeaderViewsCount();
        boolean bool2 = bool1;
        if (localDragSortListView.zVk)
        {
          if (localDragSortListView.zVl != null)
            break label108;
          bool2 = bool1;
        }
        while (true)
        {
          this.zUq = bool2;
          bool2 = this.zUq;
          AppMethodBeat.o(113011);
          return bool2;
          label108: View localView = localDragSortListView.zVl.Qw(paramInt1);
          bool2 = bool1;
          if (localView != null)
            bool2 = localDragSortListView.a(paramInt1, localView, i, paramInt2, paramInt3);
        }
      }
    }
  }

  private int e(MotionEvent paramMotionEvent, int paramInt)
  {
    AppMethodBeat.i(113013);
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    j = this.zUw.pointToPosition(i, j);
    i = this.zUw.getHeaderViewsCount();
    int k = this.zUw.getFooterViewsCount();
    int m = this.zUw.getCount();
    Object localObject;
    if ((j != -1) && (j >= i) && (j < m - k))
    {
      localObject = this.zUw;
      localObject = ((DragSortListView)localObject).getChildAt(j - ((DragSortListView)localObject).getFirstVisiblePosition());
      k = (int)paramMotionEvent.getRawX();
      i = (int)paramMotionEvent.getRawY();
      if (paramInt == 0)
      {
        paramMotionEvent = (MotionEvent)localObject;
        if (paramMotionEvent == null)
          break label223;
        paramMotionEvent.getLocationOnScreen(this.yr);
        if ((k <= this.yr[0]) || (i <= this.yr[1]) || (k >= this.yr[0] + paramMotionEvent.getWidth()))
          break label223;
        paramInt = this.yr[1];
        if (i >= paramMotionEvent.getHeight() + paramInt)
          break label223;
        this.zUo = ((View)localObject).getLeft();
        this.zUp = ((View)localObject).getTop();
        AppMethodBeat.o(113013);
      }
    }
    for (paramInt = j; ; paramInt = -1)
    {
      return paramInt;
      paramMotionEvent = ((View)localObject).findViewById(paramInt);
      break;
      label223: AppMethodBeat.o(113013);
    }
  }

  public final void h(Point paramPoint)
  {
    if ((this.zUi) && (this.zUj))
      this.zUx = paramPoint.x;
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    int i = -1;
    AppMethodBeat.i(113014);
    if ((this.zUi) && (this.lcl == 0))
      this.zUn = e(paramMotionEvent, this.zUt);
    this.zUl = e(paramMotionEvent, this.zUs);
    if ((this.zUl != -1) && (this.zUg == 0))
      aF(this.zUl, (int)paramMotionEvent.getX() - this.zUo, (int)paramMotionEvent.getY() - this.zUp);
    this.zUj = false;
    this.zUv = true;
    this.zUx = 0;
    if (this.lcl == 1)
      i = e(paramMotionEvent, this.zUu);
    this.zUm = i;
    AppMethodBeat.o(113014);
    return true;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113016);
    if ((this.zUl != -1) && (this.zUg == 2))
    {
      this.zUw.performHapticFeedback(0);
      aF(this.zUl, this.iaN - this.zUo, this.iaO - this.zUp);
    }
    AppMethodBeat.o(113016);
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(113015);
    int i = (int)paramMotionEvent1.getX();
    int j = (int)paramMotionEvent1.getY();
    int k = (int)paramMotionEvent2.getX();
    int m = (int)paramMotionEvent2.getY();
    int n = k - this.zUo;
    int i1 = m - this.zUp;
    if ((this.zUv) && (!this.zUq) && ((this.zUl != -1) || (this.zUm != -1)))
    {
      if (this.zUl == -1)
        break label189;
      if ((this.zUg != 1) || (Math.abs(m - j) <= this.mTouchSlop) || (!this.zUh))
        break label139;
      aF(this.zUl, n, i1);
    }
    while (true)
    {
      AppMethodBeat.o(113015);
      return false;
      label139: if ((this.zUg != 0) && (Math.abs(k - i) > this.mTouchSlop) && (this.zUi))
      {
        this.zUj = true;
        aF(this.zUm, n, i1);
        continue;
        label189: if (this.zUm != -1)
          if ((Math.abs(k - i) > this.mTouchSlop) && (this.zUi))
          {
            this.zUj = true;
            aF(this.zUm, n, i1);
          }
          else if (Math.abs(m - j) > this.mTouchSlop)
          {
            this.zUv = false;
          }
      }
    }
  }

  public final void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113017);
    if ((this.zUi) && (this.lcl == 0) && (this.zUn != -1))
      this.zUw.removeItem(this.zUn - this.zUw.getHeaderViewsCount());
    AppMethodBeat.o(113017);
    return true;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113012);
    if ((!this.zUw.zUQ) || (this.zUw.zVA))
    {
      AppMethodBeat.o(113012);
      return false;
    }
    this.Mh.onTouchEvent(paramMotionEvent);
    if ((this.zUi) && (this.zUq) && (this.lcl == 1))
      this.zUk.onTouchEvent(paramMotionEvent);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(113012);
      break;
      this.iaN = ((int)paramMotionEvent.getX());
      this.iaO = ((int)paramMotionEvent.getY());
      continue;
      if ((this.zUi) && (this.zUj))
      {
        if (this.zUx >= 0);
        for (int i = this.zUx; i > this.zUw.getWidth() / 2; i = -this.zUx)
        {
          this.zUw.br(0.0F);
          break;
        }
        this.zUj = false;
        this.zUq = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.a
 * JD-Core Version:    0.6.2
 */