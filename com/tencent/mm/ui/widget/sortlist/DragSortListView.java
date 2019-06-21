package com.tencent.mm.ui.widget.sortlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;

public class DragSortListView extends ListView
{
  private int SG;
  private int iJ;
  private int iK;
  private View iYn;
  private int itQ;
  private int itR;
  private DataSetObserver mObserver;
  private int mOffsetX;
  private int mOffsetY;
  private Point zUA;
  private Point zUB;
  private int zUC;
  private boolean zUD;
  private float zUE;
  private float zUF;
  private int zUG;
  private int zUH;
  private int zUI;
  private boolean zUJ;
  private int zUK;
  private int zUL;
  private int zUM;
  private DragSortListView.b zUN;
  private DragSortListView.h zUO;
  private DragSortListView.l zUP;
  boolean zUQ;
  private int zUR;
  private int zUS;
  private int zUT;
  private int zUU;
  private View[] zUV;
  private DragSortListView.d zUW;
  private float zUX;
  private float zUY;
  private int zUZ;
  boolean zVA;
  private boolean zVB;
  private int zVa;
  private float zVb;
  private float zVc;
  private float zVd;
  private float zVe;
  private float zVf;
  private DragSortListView.c zVg;
  private int zVh;
  private int zVi;
  private boolean zVj;
  boolean zVk;
  DragSortListView.i zVl;
  private MotionEvent zVm;
  private int zVn;
  private float zVo;
  private float zVp;
  private DragSortListView.a zVq;
  private boolean zVr;
  private DragSortListView.f zVs;
  private boolean zVt;
  private boolean zVu;
  private DragSortListView.j zVv;
  private DragSortListView.k zVw;
  private DragSortListView.g zVx;
  private boolean zVy;
  private float zVz;

  public DragSortListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113061);
    this.zUA = new Point();
    this.zUB = new Point();
    this.zUD = false;
    this.zUE = 1.0F;
    this.zUF = 1.0F;
    this.zUJ = false;
    this.zUQ = true;
    this.SG = 0;
    this.zUR = 1;
    this.zUU = 0;
    this.zUV = new View[1];
    this.zUX = 0.3333333F;
    this.zUY = 0.3333333F;
    this.zVf = 0.5F;
    this.zVg = new DragSortListView.1(this);
    this.zVi = 0;
    this.zVj = false;
    this.zVk = false;
    this.zVl = null;
    this.zVn = 0;
    this.zVo = 0.25F;
    this.zVp = 0.0F;
    this.zVr = false;
    this.zVt = false;
    this.zVu = false;
    this.zVv = new DragSortListView.j(this, (byte)0);
    this.zVz = 0.0F;
    this.zVA = false;
    this.zVB = false;
    int i = 150;
    int j = 150;
    if (paramAttributeSet != null)
    {
      paramContext = getContext().obtainStyledAttributes(paramAttributeSet, a.a.DragSortListView, 0, 0);
      this.zUR = Math.max(1, paramContext.getDimensionPixelSize(0, 1));
      this.zVr = paramContext.getBoolean(5, false);
      if (this.zVr)
        this.zVs = new DragSortListView.f(this);
      this.zUE = paramContext.getFloat(6, this.zUE);
      this.zUF = this.zUE;
      this.zUQ = paramContext.getBoolean(10, this.zUQ);
      this.zVo = Math.max(0.0F, Math.min(1.0F, 1.0F - paramContext.getFloat(7, 0.75F)));
      if (this.zVo <= 0.0F)
        break label602;
    }
    label602: for (boolean bool1 = true; ; bool1 = false)
    {
      this.zUJ = bool1;
      setDragScrollStart(paramContext.getFloat(1, this.zUX));
      this.zVf = paramContext.getFloat(2, this.zVf);
      i = paramContext.getInt(8, 150);
      j = paramContext.getInt(9, 150);
      if (paramContext.getBoolean(17, true))
      {
        boolean bool2 = paramContext.getBoolean(12, false);
        int k = paramContext.getInt(4, 1);
        bool1 = paramContext.getBoolean(11, true);
        int m = paramContext.getInt(13, 0);
        int n = paramContext.getResourceId(14, 0);
        int i1 = paramContext.getResourceId(15, 0);
        int i2 = paramContext.getResourceId(16, 0);
        int i3 = paramContext.getColor(3, -16777216);
        paramAttributeSet = new a(this, n, m, k, i2, i1);
        paramAttributeSet.zUi = bool2;
        paramAttributeSet.zUh = bool1;
        paramAttributeSet.zWh = i3;
        this.zVl = paramAttributeSet;
        setOnTouchListener(paramAttributeSet);
      }
      paramContext.recycle();
      this.zUW = new DragSortListView.d(this);
      if (i > 0)
        this.zVw = new DragSortListView.k(this, i, (byte)0);
      if (j > 0)
        this.zVx = new DragSortListView.g(this, j, (byte)0);
      this.zVm = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
      this.mObserver = new DragSortListView.2(this);
      AppMethodBeat.o(113061);
      return;
    }
  }

  private int Qs(int paramInt)
  {
    AppMethodBeat.i(113065);
    View localView = getChildAt(paramInt - getFirstVisiblePosition());
    if (localView != null)
    {
      paramInt = localView.getHeight();
      AppMethodBeat.o(113065);
    }
    while (true)
    {
      return paramInt;
      paramInt = hF(paramInt, Qu(paramInt));
      AppMethodBeat.o(113065);
    }
  }

  private void Qt(int paramInt)
  {
    AppMethodBeat.i(113073);
    this.SG = 1;
    if (this.zUP != null)
      this.zUP.remove(paramInt);
    dLI();
    dLB();
    dLz();
    if (this.zVk)
    {
      this.SG = 3;
      AppMethodBeat.o(113073);
    }
    while (true)
    {
      return;
      this.SG = 0;
      AppMethodBeat.o(113073);
    }
  }

  private int Qu(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(113086);
    if (paramInt == this.zUK)
    {
      AppMethodBeat.o(113086);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      localObject = getChildAt(paramInt - getFirstVisiblePosition());
      if (localObject != null)
      {
        paramInt = b(paramInt, (View)localObject, false);
        AppMethodBeat.o(113086);
      }
      else
      {
        i = this.zVv.get(paramInt);
        if (i == -1)
          break;
        AppMethodBeat.o(113086);
        paramInt = i;
      }
    }
    Object localObject = getAdapter();
    i = ((ListAdapter)localObject).getItemViewType(paramInt);
    int j = ((ListAdapter)localObject).getViewTypeCount();
    if (j != this.zUV.length)
      this.zUV = new View[j];
    if (i >= 0)
      if (this.zUV[i] == null)
      {
        localObject = ((ListAdapter)localObject).getView(paramInt, null, this);
        this.zUV[i] = localObject;
      }
    while (true)
    {
      i = b(paramInt, (View)localObject, true);
      this.zVv.add(paramInt, i);
      AppMethodBeat.o(113086);
      paramInt = i;
      break;
      localObject = ((ListAdapter)localObject).getView(paramInt, this.zUV[i], this);
      continue;
      localObject = ((ListAdapter)localObject).getView(paramInt, null, this);
    }
  }

  private void U(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113079);
    int i = paramMotionEvent.getAction() & 0xFF;
    if (i != 0)
    {
      this.itQ = this.iJ;
      this.itR = this.iK;
    }
    this.iJ = ((int)paramMotionEvent.getX());
    this.iK = ((int)paramMotionEvent.getY());
    if (i == 0)
    {
      this.itQ = this.iJ;
      this.itR = this.iK;
    }
    this.mOffsetX = ((int)paramMotionEvent.getRawX() - this.iJ);
    this.mOffsetY = ((int)paramMotionEvent.getRawY() - this.iK);
    AppMethodBeat.o(113079);
  }

  private int a(int paramInt1, View paramView, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(113090);
    int i = Qu(paramInt1);
    int j = paramView.getHeight();
    int k = hF(paramInt1, i);
    int m;
    if (paramInt1 != this.zUK)
    {
      m = j - i;
      i = k - i;
    }
    while (true)
    {
      int n = this.zUS;
      int i1 = n;
      if (this.zUK != this.zUH)
      {
        i1 = n;
        if (this.zUK != this.zUI)
          i1 = n - this.zUR;
      }
      if (paramInt1 <= paramInt2)
      {
        if (paramInt1 <= this.zUH)
          break label208;
        paramInt1 = i1 - i + 0;
      }
      while (true)
      {
        AppMethodBeat.o(113090);
        return paramInt1;
        if (paramInt1 == paramInt3)
        {
          if (paramInt1 <= this.zUH)
            paramInt1 = m - i1 + 0;
          else if (paramInt1 == this.zUI)
            paramInt1 = j - k + 0;
          else
            paramInt1 = m + 0;
        }
        else if (paramInt1 <= this.zUH)
          paramInt1 = 0 - i1;
        else if (paramInt1 == this.zUI)
          paramInt1 = 0 - i;
        else
          label208: paramInt1 = 0;
      }
      i = k;
      m = j;
    }
  }

  private void a(int paramInt, Canvas paramCanvas)
  {
    AppMethodBeat.i(113063);
    Drawable localDrawable = getDivider();
    int i = getDividerHeight();
    ViewGroup localViewGroup;
    int j;
    int k;
    int m;
    if ((localDrawable != null) && (i != 0))
    {
      localViewGroup = (ViewGroup)getChildAt(paramInt - getFirstVisiblePosition());
      if (localViewGroup != null)
      {
        j = getPaddingLeft();
        k = getWidth() - getPaddingRight();
        m = localViewGroup.getChildAt(0).getHeight();
        if (paramInt <= this.zUK)
          break label142;
        m += localViewGroup.getTop();
        paramInt = m + i;
      }
    }
    while (true)
    {
      paramCanvas.save();
      paramCanvas.clipRect(j, m, k, paramInt);
      localDrawable.setBounds(j, m, k, paramInt);
      localDrawable.draw(paramCanvas);
      paramCanvas.restore();
      AppMethodBeat.o(113063);
      return;
      label142: paramInt = localViewGroup.getBottom() - m;
      m = paramInt - i;
    }
  }

  private void a(int paramInt, View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(113085);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    int i;
    if ((paramInt != this.zUK) && (paramInt != this.zUH) && (paramInt != this.zUI))
    {
      i = -2;
      if (i != localLayoutParams.height)
      {
        localLayoutParams.height = i;
        paramView.setLayoutParams(localLayoutParams);
      }
      if ((paramInt == this.zUH) || (paramInt == this.zUI))
      {
        if (paramInt >= this.zUK)
          break label163;
        ((b)paramView).setGravity(80);
      }
    }
    while (true)
    {
      int j = paramView.getVisibility();
      int k = 0;
      i = k;
      if (paramInt == this.zUK)
      {
        i = k;
        if (this.iYn != null)
          i = 4;
      }
      if (i != j)
        paramView.setVisibility(i);
      AppMethodBeat.o(113085);
      return;
      i = c(paramInt, paramView, paramBoolean);
      break;
      label163: if (paramInt > this.zUK)
        ((b)paramView).setGravity(48);
    }
  }

  private int b(int paramInt, View paramView, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(113087);
    if (paramInt == this.zUK)
    {
      AppMethodBeat.o(113087);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      View localView = paramView;
      if (paramInt >= getHeaderViewsCount())
        if (paramInt < getCount() - getFooterViewsCount())
          break label86;
      label86: for (localView = paramView; ; localView = ((ViewGroup)paramView).getChildAt(0))
      {
        paramView = localView.getLayoutParams();
        if ((paramView == null) || (paramView.height <= 0))
          break label99;
        paramInt = paramView.height;
        AppMethodBeat.o(113087);
        break;
      }
      label99: paramInt = localView.getHeight();
      if ((paramInt == 0) || (paramBoolean))
      {
        fq(localView);
        paramInt = localView.getMeasuredHeight();
      }
      AppMethodBeat.o(113087);
    }
  }

  private boolean b(boolean paramBoolean, float paramFloat)
  {
    AppMethodBeat.i(113076);
    if (this.iYn != null)
    {
      this.zUW.dLJ();
      if (paramBoolean)
      {
        q(this.zUK - getHeaderViewsCount(), paramFloat);
        if (this.zVr)
          this.zVs.stopTracking();
        paramBoolean = true;
        AppMethodBeat.o(113076);
      }
    }
    while (true)
    {
      return paramBoolean;
      if (this.zVx != null)
      {
        this.zVx.start();
        break;
      }
      dLA();
      break;
      paramBoolean = false;
      AppMethodBeat.o(113076);
    }
  }

  private int c(int paramInt, View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(113088);
    paramInt = hF(paramInt, b(paramInt, paramView, paramBoolean));
    AppMethodBeat.o(113088);
    return paramInt;
  }

  private void d(int paramInt, View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(113097);
    this.zVt = true;
    dLH();
    int i = this.zUH;
    int j = this.zUI;
    boolean bool = dLx();
    if (bool)
    {
      dLE();
      setSelectionFromTop(paramInt, a(paramInt, paramView, i, j) + paramView.getTop() - getPaddingTop());
      layoutChildren();
    }
    if ((bool) || (paramBoolean))
      invalidate();
    this.zVt = false;
    AppMethodBeat.o(113097);
  }

  private void dLA()
  {
    AppMethodBeat.i(113072);
    this.SG = 2;
    if ((this.zUO != null) && (this.zUG >= 0) && (this.zUG < getCount()))
    {
      int i = getHeaderViewsCount();
      this.zUO.dm(this.zUK - i, this.zUG - i);
    }
    dLI();
    dLB();
    dLz();
    dLE();
    if (this.zVk)
    {
      this.SG = 3;
      AppMethodBeat.o(113072);
    }
    while (true)
    {
      return;
      this.SG = 0;
      AppMethodBeat.o(113072);
    }
  }

  private void dLB()
  {
    int i = 0;
    AppMethodBeat.i(113074);
    int j = getFirstVisiblePosition();
    if (this.zUK < j)
    {
      View localView = getChildAt(0);
      if (localView != null)
        i = localView.getTop();
      setSelectionFromTop(j - 1, i - getPaddingTop());
    }
    AppMethodBeat.o(113074);
  }

  private void dLC()
  {
    AppMethodBeat.i(113078);
    this.zVn = 0;
    this.zVk = false;
    if (this.SG == 3)
      this.SG = 0;
    this.zUF = this.zUE;
    this.zVA = false;
    this.zVv.clear();
    AppMethodBeat.o(113078);
  }

  private void dLD()
  {
    AppMethodBeat.i(113082);
    int i = getPaddingTop();
    int j = getHeight() - i - getPaddingBottom();
    float f1 = j;
    this.zVc = (i + this.zUX * f1);
    float f2 = i;
    this.zVb = (f1 * (1.0F - this.zUY) + f2);
    this.zUZ = ((int)this.zVc);
    this.zVa = ((int)this.zVb);
    this.zVd = (this.zVc - i);
    this.zVe = (i + j - this.zVb);
    AppMethodBeat.o(113082);
  }

  private void dLE()
  {
    AppMethodBeat.i(113084);
    int i = getFirstVisiblePosition();
    int j = getLastVisiblePosition();
    int k = Math.max(0, getHeaderViewsCount() - i);
    j = Math.min(j - i, getCount() - 1 - getFooterViewsCount() - i);
    while (k <= j)
    {
      View localView = getChildAt(k);
      if (localView != null)
        a(i + k, localView, false);
      k++;
    }
    AppMethodBeat.o(113084);
  }

  private void dLF()
  {
    AppMethodBeat.i(113092);
    if (this.iYn != null)
    {
      fq(this.iYn);
      this.zUS = this.iYn.getMeasuredHeight();
      this.zUT = (this.zUS / 2);
    }
    AppMethodBeat.o(113092);
  }

  private void dLG()
  {
    AppMethodBeat.i(113096);
    int i = getFirstVisiblePosition();
    int j = getChildCount() / 2;
    View localView = getChildAt(getChildCount() / 2);
    if (localView == null)
      AppMethodBeat.o(113096);
    while (true)
    {
      return;
      d(i + j, localView, true);
      AppMethodBeat.o(113096);
    }
  }

  private void dLH()
  {
    AppMethodBeat.i(113098);
    if (this.zVl != null)
    {
      this.zUB.set(this.iJ, this.iK);
      this.zVl.h(this.zUA);
    }
    int i = this.zUA.x;
    int j = this.zUA.y;
    int k = getPaddingLeft();
    int m;
    if (((this.zVi & 0x1) == 0) && (i > k))
    {
      this.zUA.x = k;
      k = getHeaderViewsCount();
      m = getFooterViewsCount();
      int n = getFirstVisiblePosition();
      int i1 = getLastVisiblePosition();
      i = getPaddingTop();
      if (n < k)
        i = getChildAt(k - n - 1).getBottom();
      k = i;
      if ((this.zVi & 0x8) == 0)
      {
        k = i;
        if (n <= this.zUK)
          k = Math.max(getChildAt(this.zUK - n).getTop(), i);
      }
      i = getHeight() - getPaddingBottom();
      if (i1 >= getCount() - m - 1)
        i = getChildAt(getCount() - m - 1 - n).getBottom();
      m = i;
      if ((this.zVi & 0x4) == 0)
      {
        m = i;
        if (i1 >= this.zUK)
          m = Math.min(getChildAt(this.zUK - n).getBottom(), i);
      }
      if (j >= k)
        break label323;
      this.zUA.y = k;
    }
    while (true)
    {
      this.zUC = (this.zUA.y + this.zUT);
      AppMethodBeat.o(113098);
      return;
      if (((this.zVi & 0x2) != 0) || (i >= k))
        break;
      this.zUA.x = k;
      break;
      label323: if (this.zUS + j > m)
        this.zUA.y = (m - this.zUS);
    }
  }

  private void dLI()
  {
    AppMethodBeat.i(113099);
    if (this.iYn != null)
    {
      this.iYn.setVisibility(8);
      if (this.zVl != null)
        this.zVl.fr(this.iYn);
      this.iYn = null;
      invalidate();
    }
    AppMethodBeat.o(113099);
  }

  private boolean dLx()
  {
    boolean bool1 = true;
    AppMethodBeat.i(113067);
    int i = getFirstVisiblePosition();
    int j = this.zUH;
    View localView1 = getChildAt(j - i);
    View localView2 = localView1;
    if (localView1 == null)
    {
      j = i + getChildCount() / 2;
      localView2 = getChildAt(j - i);
    }
    int k = localView2.getTop();
    int m = localView2.getHeight();
    i = hE(j, k);
    int n = getDividerHeight();
    int i1;
    int i2;
    int i3;
    if (this.zUC < i)
    {
      i1 = i;
      i2 = j;
      i3 = i;
      i = i1;
      j = i;
      i1 = i2;
      if (i2 < 0)
        break label639;
      m = i2 - 1;
      j = Qs(m);
      if (m == 0)
      {
        j = k - n - j;
        i1 = m;
      }
    }
    while (true)
    {
      label143: i3 = getHeaderViewsCount();
      n = getFooterViewsCount();
      k = this.zUH;
      m = this.zUI;
      float f1 = this.zVp;
      int i4;
      label196: float f2;
      if (this.zUJ)
      {
        i4 = Math.abs(j - i);
        if (this.zUC < j)
        {
          i2 = (int)(this.zVo * 0.5F * i4);
          f2 = i2;
          i += i2;
          if (this.zUC >= i)
            break label528;
          this.zUH = (i1 - 1);
          this.zUI = i1;
          this.zVp = ((i - this.zUC) * 0.5F / f2);
          label259: if (this.zUH >= i3)
            break label590;
          this.zUH = i3;
          this.zUI = i3;
          i1 = i3;
          label284: if ((this.zUH == k) && (this.zUI == m) && (Math.abs(this.zVp - f1) <= 0.0F))
            break label633;
        }
      }
      label528: label590: label633: for (boolean bool2 = true; ; bool2 = false)
      {
        if (i1 != this.zUG)
        {
          this.zUG = i1;
          bool2 = bool1;
        }
        while (true)
        {
          AppMethodBeat.o(113067);
          return bool2;
          k -= j + n;
          i2 = hE(m, k);
          j = i2;
          i1 = m;
          if (this.zUC >= i2)
            break label143;
          i = i2;
          i3 = i2;
          i2 = m;
          break;
          i4 = getCount();
          i3 = i;
          i2 = j;
          i1 = i;
          i = i3;
          while (true)
          {
            j = i;
            i3 = i1;
            i1 = i2;
            if (i2 >= i4)
              break label639;
            if (i2 == i4 - 1)
            {
              j = k + n + m;
              i1 = i2;
              break;
            }
            k += n + m;
            m = Qs(i2 + 1);
            i3 = hE(i2 + 1, k);
            j = i3;
            i1 = i2;
            if (this.zUC < i3)
              break;
            i2++;
            i = i3;
            i1 = i3;
          }
          i2 = j;
          j = i;
          i = i2;
          break label196;
          if (this.zUC >= j - i2)
          {
            this.zUH = i1;
            this.zUI = (i1 + 1);
            this.zVp = ((1.0F + (j - this.zUC) / f2) * 0.5F);
            break label259;
          }
          this.zUH = i1;
          this.zUI = i1;
          break label259;
          if (this.zUI < getCount() - n)
            break label284;
          i1 = getCount() - n - 1;
          this.zUH = i1;
          this.zUI = i1;
          break label284;
        }
      }
      label639: i = j;
      j = i3;
    }
  }

  private void dLz()
  {
    this.zUK = -1;
    this.zUH = -1;
    this.zUI = -1;
    this.zUG = -1;
  }

  private void fq(View paramView)
  {
    AppMethodBeat.i(113091);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    Object localObject = localLayoutParams;
    if (localLayoutParams == null)
    {
      localObject = new AbsListView.LayoutParams(-1, -2);
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    int i = ViewGroup.getChildMeasureSpec(this.zUU, getListPaddingLeft() + getListPaddingRight(), ((ViewGroup.LayoutParams)localObject).width);
    if (((ViewGroup.LayoutParams)localObject).height > 0);
    for (int j = View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams)localObject).height, 1073741824); ; j = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(i, j);
      AppMethodBeat.o(113091);
      return;
    }
  }

  private int hE(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113066);
    int i = getHeaderViewsCount();
    int j = getFooterViewsCount();
    if ((paramInt1 <= i) || (paramInt1 >= getCount() - j))
    {
      AppMethodBeat.o(113066);
      paramInt1 = paramInt2;
      return paramInt1;
    }
    i = getDividerHeight();
    int k = this.zUS - this.zUR;
    int m = Qu(paramInt1);
    int n = Qs(paramInt1);
    if (this.zUI <= this.zUK)
      if ((paramInt1 == this.zUI) && (this.zUH != this.zUI))
        if (paramInt1 == this.zUK)
        {
          j = paramInt2 + n - this.zUS;
          label122: if (paramInt1 > this.zUK)
            break label267;
        }
    label267: for (paramInt1 = (this.zUS - i - Qu(paramInt1 - 1)) / 2 + j; ; paramInt1 = (m - i - this.zUS) / 2 + j)
    {
      AppMethodBeat.o(113066);
      break;
      j = n - m + paramInt2 - k;
      break label122;
      j = paramInt2;
      if (paramInt1 <= this.zUI)
        break label122;
      j = paramInt2;
      if (paramInt1 > this.zUK)
        break label122;
      j = paramInt2 - k;
      break label122;
      if ((paramInt1 > this.zUK) && (paramInt1 <= this.zUH))
      {
        j = paramInt2 + k;
        break label122;
      }
      j = paramInt2;
      if (paramInt1 != this.zUI)
        break label122;
      j = paramInt2;
      if (this.zUH == this.zUI)
        break label122;
      j = paramInt2 + (n - m);
      break label122;
    }
  }

  private int hF(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    if ((this.zUJ) && (this.zUH != this.zUI))
    {
      i = 1;
      j = this.zUS - this.zUR;
      k = (int)(this.zVp * j);
      if (paramInt1 != this.zUK)
        break label118;
      if (this.zUK != this.zUH)
        break label88;
      if (i == 0)
        break label80;
      i = k + this.zUR;
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      label80: i = this.zUS;
      continue;
      label88: if (this.zUK == this.zUI)
      {
        i = this.zUS - k;
      }
      else
      {
        i = this.zUR;
        continue;
        label118: if (paramInt1 == this.zUH)
        {
          if (i != 0)
            i = paramInt2 + k;
          else
            i = paramInt2 + j;
        }
        else
        {
          i = paramInt2;
          if (paramInt1 == this.zUI)
            i = paramInt2 + j - k;
        }
      }
    }
  }

  private void q(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(113070);
    if ((this.SG == 0) || (this.SG == 4))
    {
      if (this.SG == 0)
      {
        this.zUK = (getHeaderViewsCount() + paramInt);
        this.zUH = this.zUK;
        this.zUI = this.zUK;
        this.zUG = this.zUK;
        View localView = getChildAt(this.zUK - getFirstVisiblePosition());
        if (localView != null)
          localView.setVisibility(4);
      }
      this.SG = 1;
      this.zVz = paramFloat;
      if (this.zVk);
      switch (this.zVn)
      {
      default:
        if (this.zVw != null)
        {
          this.zVw.start();
          AppMethodBeat.o(113070);
        }
        break;
      case 1:
      case 2:
      }
    }
    while (true)
    {
      return;
      super.onTouchEvent(this.zVm);
      break;
      super.onInterceptTouchEvent(this.zVm);
      break;
      Qt(paramInt);
      AppMethodBeat.o(113070);
    }
  }

  public final boolean a(int paramInt1, View paramView, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = true;
    AppMethodBeat.i(113095);
    if ((this.SG != 0) || (!this.zVk) || (this.iYn != null) || (paramView == null) || (!this.zUQ))
    {
      AppMethodBeat.o(113095);
      bool = false;
      return bool;
    }
    if (getParent() != null)
      getParent().requestDisallowInterceptTouchEvent(true);
    paramInt1 = getHeaderViewsCount() + paramInt1;
    this.zUH = paramInt1;
    this.zUI = paramInt1;
    this.zUK = paramInt1;
    this.zUG = paramInt1;
    this.SG = 4;
    this.zVi = 0;
    this.zVi |= paramInt2;
    this.iYn = paramView;
    dLF();
    this.zUL = paramInt3;
    this.zUM = paramInt4;
    this.zVh = this.iK;
    this.zUA.x = (this.iJ - this.zUL);
    this.zUA.y = (this.iK - this.zUM);
    paramView = getChildAt(this.zUK - getFirstVisiblePosition());
    if (paramView != null)
      paramView.setVisibility(4);
    if (this.zVr)
    {
      paramView = this.zVs;
      paramView.mBuilder.append("<DSLVStates>\n");
      paramView.zVN = 0;
      paramView.zVO = true;
    }
    switch (this.zVn)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      requestLayout();
      AppMethodBeat.o(113095);
      break;
      super.onTouchEvent(this.zVm);
      continue;
      super.onInterceptTouchEvent(this.zVm);
    }
  }

  public final boolean br(float paramFloat)
  {
    AppMethodBeat.i(113075);
    this.zVy = true;
    boolean bool = b(true, paramFloat);
    AppMethodBeat.o(113075);
    return bool;
  }

  public final void dLy()
  {
    AppMethodBeat.i(113071);
    if (this.SG == 4)
    {
      this.zUW.dLJ();
      dLI();
      dLz();
      dLE();
      if (this.zVk)
      {
        this.SG = 3;
        AppMethodBeat.o(113071);
      }
    }
    while (true)
    {
      return;
      this.SG = 0;
      AppMethodBeat.o(113071);
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(113064);
    super.dispatchDraw(paramCanvas);
    if (this.SG != 0)
    {
      if (this.zUH != this.zUK)
        a(this.zUH, paramCanvas);
      if ((this.zUI != this.zUH) && (this.zUI != this.zUK))
        a(this.zUI, paramCanvas);
    }
    int i;
    int j;
    int n;
    float f;
    if (this.iYn != null)
    {
      i = this.iYn.getWidth();
      j = this.iYn.getHeight();
      int k = this.zUA.x;
      int m = getWidth();
      n = k;
      if (k < 0)
        n = -k;
      if (n >= m)
        break label233;
      f = (m - n) / m;
    }
    label233: for (f *= f; ; f = 0.0F)
    {
      n = (int)(f * (255.0F * this.zUF));
      paramCanvas.save();
      paramCanvas.translate(this.zUA.x, this.zUA.y);
      paramCanvas.clipRect(0, 0, i, j);
      paramCanvas.saveLayerAlpha(0.0F, 0.0F, i, j, n, 31);
      this.iYn.draw(paramCanvas);
      paramCanvas.restore();
      paramCanvas.restore();
      AppMethodBeat.o(113064);
      return;
    }
  }

  public float getFloatAlpha()
  {
    return this.zUF;
  }

  public ListAdapter getInputAdapter()
  {
    if (this.zVq == null);
    for (ListAdapter localListAdapter = null; ; localListAdapter = this.zVq.Ei)
      return localListAdapter;
  }

  protected void layoutChildren()
  {
    AppMethodBeat.i(113094);
    super.layoutChildren();
    if (this.iYn != null)
    {
      if ((this.iYn.isLayoutRequested()) && (!this.zUD))
        dLF();
      this.iYn.layout(0, 0, this.iYn.getMeasuredWidth(), this.iYn.getMeasuredHeight());
      this.zUD = false;
    }
    AppMethodBeat.o(113094);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(113068);
    super.onDraw(paramCanvas);
    if (this.zVr)
    {
      paramCanvas = this.zVs;
      if (paramCanvas.zVO)
      {
        paramCanvas.mBuilder.append("<DSLVState>\n");
        int i = paramCanvas.zVC.getChildCount();
        int j = paramCanvas.zVC.getFirstVisiblePosition();
        paramCanvas.mBuilder.append("    <Positions>");
        for (int k = 0; k < i; k++)
          paramCanvas.mBuilder.append(j + k).append(",");
        paramCanvas.mBuilder.append("</Positions>\n");
        paramCanvas.mBuilder.append("    <Tops>");
        for (k = 0; k < i; k++)
          paramCanvas.mBuilder.append(paramCanvas.zVC.getChildAt(k).getTop()).append(",");
        paramCanvas.mBuilder.append("</Tops>\n");
        paramCanvas.mBuilder.append("    <Bottoms>");
        for (k = 0; k < i; k++)
          paramCanvas.mBuilder.append(paramCanvas.zVC.getChildAt(k).getBottom()).append(",");
        paramCanvas.mBuilder.append("</Bottoms>\n");
        paramCanvas.mBuilder.append("    <FirstExpPos>").append(paramCanvas.zVC.zUH).append("</FirstExpPos>\n");
        paramCanvas.mBuilder.append("    <FirstExpBlankHeight>").append(paramCanvas.zVC.Qs(paramCanvas.zVC.zUH) - paramCanvas.zVC.Qu(paramCanvas.zVC.zUH)).append("</FirstExpBlankHeight>\n");
        paramCanvas.mBuilder.append("    <SecondExpPos>").append(paramCanvas.zVC.zUI).append("</SecondExpPos>\n");
        paramCanvas.mBuilder.append("    <SecondExpBlankHeight>").append(paramCanvas.zVC.Qs(paramCanvas.zVC.zUI) - paramCanvas.zVC.Qu(paramCanvas.zVC.zUI)).append("</SecondExpBlankHeight>\n");
        paramCanvas.mBuilder.append("    <SrcPos>").append(paramCanvas.zVC.zUK).append("</SrcPos>\n");
        paramCanvas.mBuilder.append("    <SrcHeight>").append(paramCanvas.zVC.zUS + paramCanvas.zVC.getDividerHeight()).append("</SrcHeight>\n");
        paramCanvas.mBuilder.append("    <ViewHeight>").append(paramCanvas.zVC.getHeight()).append("</ViewHeight>\n");
        paramCanvas.mBuilder.append("    <LastY>").append(paramCanvas.zVC.itR).append("</LastY>\n");
        paramCanvas.mBuilder.append("    <FloatY>").append(paramCanvas.zVC.zUC).append("</FloatY>\n");
        paramCanvas.mBuilder.append("    <ShuffleEdges>");
        for (k = 0; k < i; k++)
          paramCanvas.mBuilder.append(paramCanvas.zVC.hE(j + k, paramCanvas.zVC.getChildAt(k).getTop())).append(",");
        paramCanvas.mBuilder.append("</ShuffleEdges>\n");
        paramCanvas.mBuilder.append("</DSLVState>\n");
        paramCanvas.zVM += 1;
        if (paramCanvas.zVM > 1000)
        {
          paramCanvas.flush();
          paramCanvas.zVM = 0;
        }
      }
    }
    AppMethodBeat.o(113068);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(113080);
    if (!this.zUQ)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(113080);
    }
    int i;
    while (true)
    {
      return bool;
      U(paramMotionEvent);
      this.zVj = true;
      i = paramMotionEvent.getAction() & 0xFF;
      if (i == 0)
      {
        if (this.SG != 0)
        {
          this.zVu = true;
          AppMethodBeat.o(113080);
        }
        else
        {
          this.zVk = true;
        }
      }
      else
      {
        if (this.iYn == null)
          break;
        bool = true;
        if ((i == 1) || (i == 3))
          this.zVk = false;
        AppMethodBeat.o(113080);
      }
    }
    if (super.onInterceptTouchEvent(paramMotionEvent))
      this.zVA = true;
    for (bool = true; ; bool = false)
      switch (i)
      {
      case 2:
      default:
        if (bool)
          this.zVn = 1;
        break;
      case 1:
      case 3:
        dLC();
        break;
        this.zVn = 2;
        break;
      }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113093);
    super.onMeasure(paramInt1, paramInt2);
    if (this.iYn != null)
    {
      if (this.iYn.isLayoutRequested())
        dLF();
      this.zUD = true;
    }
    this.zUU = paramInt1;
    AppMethodBeat.o(113093);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(113083);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    dLD();
    AppMethodBeat.o(113083);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(113077);
    if (this.zVu)
    {
      this.zVu = false;
      AppMethodBeat.o(113077);
    }
    while (true)
    {
      return bool1;
      if (this.zUQ)
        break;
      bool1 = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(113077);
    }
    bool1 = this.zVj;
    this.zVj = false;
    if (!bool1)
      U(paramMotionEvent);
    if (this.SG == 4)
    {
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      default:
      case 3:
      case 1:
      case 2:
      }
      while (true)
      {
        bool1 = true;
        AppMethodBeat.o(113077);
        break;
        if (this.SG == 4)
          dLy();
        dLC();
        continue;
        if (this.SG == 4)
        {
          this.zVy = false;
          b(false, 0.0F);
        }
        dLC();
        continue;
        int i = (int)paramMotionEvent.getX();
        int j = (int)paramMotionEvent.getY();
        this.zUA.x = (i - this.zUL);
        this.zUA.y = (j - this.zUM);
        dLG();
        i = Math.min(j, this.zUC + this.zUT);
        int k = Math.max(j, this.zUC - this.zUT);
        paramMotionEvent = this.zUW;
        if (paramMotionEvent.zOp);
        for (j = paramMotionEvent.zVK; ; j = -1)
        {
          if ((i <= this.itR) || (i <= this.zVa) || (j == 1))
            break label314;
          if (j != -1)
            this.zUW.dLJ();
          this.zUW.Qv(1);
          break;
        }
        label314: if ((k < this.itR) && (k < this.zUZ) && (j != 0))
        {
          if (j != -1)
            this.zUW.dLJ();
          this.zUW.Qv(0);
        }
        else if ((k >= this.zUZ) && (i <= this.zVa) && (this.zUW.zOp))
        {
          this.zUW.dLJ();
        }
      }
    }
    if ((this.SG == 0) && (super.onTouchEvent(paramMotionEvent)));
    for (boolean bool2 = true; ; bool2 = false)
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      case 2:
      default:
        bool1 = bool2;
        if (!bool2)
          break;
        this.zVn = 1;
        bool1 = bool2;
        break;
      case 1:
      case 3:
        dLC();
        bool1 = bool2;
        break;
      }
  }

  public final void removeItem(int paramInt)
  {
    AppMethodBeat.i(113069);
    this.zVy = false;
    q(paramInt, 0.0F);
    AppMethodBeat.o(113069);
  }

  public void requestLayout()
  {
    AppMethodBeat.i(113089);
    if (!this.zVt)
      super.requestLayout();
    AppMethodBeat.o(113089);
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(113062);
    if (paramListAdapter != null)
    {
      this.zVq = new DragSortListView.a(this, paramListAdapter, (byte)0);
      paramListAdapter.registerDataSetObserver(this.mObserver);
      if ((paramListAdapter instanceof DragSortListView.h))
        setDropListener((DragSortListView.h)paramListAdapter);
      if ((paramListAdapter instanceof DragSortListView.b))
        setDragListener((DragSortListView.b)paramListAdapter);
      if ((paramListAdapter instanceof DragSortListView.l))
        setRemoveListener((DragSortListView.l)paramListAdapter);
    }
    while (true)
    {
      super.setAdapter(this.zVq);
      AppMethodBeat.o(113062);
      return;
      this.zVq = null;
    }
  }

  public void setDragEnabled(boolean paramBoolean)
  {
    this.zUQ = paramBoolean;
  }

  public void setDragListener(DragSortListView.b paramb)
  {
    this.zUN = paramb;
  }

  public void setDragScrollProfile(DragSortListView.c paramc)
  {
    if (paramc != null)
      this.zVg = paramc;
  }

  public void setDragScrollStart(float paramFloat)
  {
    AppMethodBeat.i(113081);
    if (paramFloat > 0.5F)
    {
      this.zUY = 0.5F;
      if (paramFloat <= 0.5F)
        break label58;
    }
    label58: for (this.zUX = 0.5F; ; this.zUX = paramFloat)
    {
      if (getHeight() != 0)
        dLD();
      AppMethodBeat.o(113081);
      return;
      this.zUY = paramFloat;
      break;
    }
  }

  public void setDragSortListener(DragSortListView.e parame)
  {
    AppMethodBeat.i(113100);
    setDropListener(parame);
    setDragListener(parame);
    setRemoveListener(parame);
    AppMethodBeat.o(113100);
  }

  public void setDropListener(DragSortListView.h paramh)
  {
    this.zUO = paramh;
  }

  public void setFloatAlpha(float paramFloat)
  {
    this.zUF = paramFloat;
  }

  public void setFloatViewManager(DragSortListView.i parami)
  {
    this.zVl = parami;
  }

  public void setMaxScrollSpeed(float paramFloat)
  {
    this.zVf = paramFloat;
  }

  public void setRemoveListener(DragSortListView.l paraml)
  {
    this.zUP = paraml;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView
 * JD-Core Version:    0.6.2
 */