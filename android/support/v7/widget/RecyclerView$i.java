package android.support.v7.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class RecyclerView$i
{
  protected RecyclerView aiB;
  v anf;
  bi aoA = new bi(this.aoy);
  bi aoB = new bi(this.aoz);
  RecyclerView.r aoC;
  public boolean aoD = false;
  protected boolean aoE = false;
  protected boolean aoF = true;
  boolean aoG = true;
  int aoH;
  boolean aoI;
  protected int aoJ;
  protected int aoK;
  private final bi.b aoy = new RecyclerView.i.1(this);
  private final bi.b aoz = new RecyclerView.i.2(this);
  public int mHeight;
  public int mWidth;
  boolean pv = false;

  private void A(View paramView, int paramInt)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    RecyclerView.v localv = RecyclerView.bn(paramView);
    if (localv.isRemoved())
      this.aiB.ang.J(localv);
    while (true)
    {
      this.anf.a(paramView, paramInt, localLayoutParams, localv.isRemoved());
      return;
      this.aiB.ang.K(localv);
    }
  }

  private void a(RecyclerView.o paramo, int paramInt, View paramView)
  {
    RecyclerView.v localv = RecyclerView.bn(paramView);
    if (localv.kh());
    while (true)
    {
      return;
      if ((localv.kq()) && (!localv.isRemoved()) && (!this.aiB.Yq.aoq))
      {
        removeViewAt(paramInt);
        paramo.s(localv);
      }
      else
      {
        cj(paramInt);
        paramo.bK(paramView);
        this.aiB.ang.K(localv);
      }
    }
  }

  private void aC(int paramInt1, int paramInt2)
  {
    View localView = getChildAt(paramInt1);
    if (localView == null)
      throw new IllegalArgumentException("Cannot move a child from non-existing index:" + paramInt1 + this.aiB.toString());
    cj(paramInt1);
    A(localView, paramInt2);
  }

  public static int bA(View paramView)
  {
    return paramView.getBottom() + bC(paramView);
  }

  public static int bB(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala.top;
  }

  public static int bC(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala.bottom;
  }

  public static int bD(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala.left;
  }

  public static int bE(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala.right;
  }

  public static int bt(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).aoM.ki();
  }

  public static int bv(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala;
    int i = paramView.getMeasuredWidth();
    int j = localRect.left;
    return localRect.right + (i + j);
  }

  public static int bw(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala;
    int i = paramView.getMeasuredHeight();
    int j = localRect.top;
    return localRect.bottom + (i + j);
  }

  public static int bx(View paramView)
  {
    return paramView.getLeft() - bD(paramView);
  }

  public static int by(View paramView)
  {
    return paramView.getTop() - bB(paramView);
  }

  public static int bz(View paramView)
  {
    return paramView.getRight() + bE(paramView);
  }

  public static int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i = Math.max(0, paramInt1 - paramInt3);
    if (paramBoolean)
      if (paramInt4 >= 0)
      {
        paramInt1 = 1073741824;
        paramInt3 = paramInt4;
      }
    while (true)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt3, paramInt1);
      if (paramInt4 == -1)
      {
        paramInt3 = i;
        paramInt1 = paramInt2;
        switch (paramInt2)
        {
        case 1073741824:
        case -2147483648:
        case 0:
        }
        paramInt1 = 0;
        paramInt3 = 0;
      }
      else if (paramInt4 == -2)
      {
        paramInt3 = 0;
        do
        {
          paramInt1 = 0;
          break;
          if (paramInt4 >= 0)
          {
            paramInt1 = 1073741824;
            paramInt3 = paramInt4;
            break;
          }
          paramInt3 = i;
          paramInt1 = paramInt2;
          if (paramInt4 == -1)
            break;
          if (paramInt4 != -2)
            break label150;
          if (paramInt2 == -2147483648)
            break label140;
          paramInt3 = i;
        }
        while (paramInt2 != 1073741824);
        label140: paramInt1 = -2147483648;
        paramInt3 = i;
      }
      else
      {
        label150: paramInt1 = 0;
        paramInt3 = 0;
      }
    }
  }

  private void c(View paramView, int paramInt, boolean paramBoolean)
  {
    RecyclerView.v localv = RecyclerView.bn(paramView);
    RecyclerView.LayoutParams localLayoutParams;
    if ((paramBoolean) || (localv.isRemoved()))
    {
      this.aiB.ang.J(localv);
      localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      if ((!localv.kn()) && (!localv.kl()))
        break label128;
      if (!localv.kl())
        break label120;
      localv.km();
      label68: this.anf.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    while (true)
    {
      if (localLayoutParams.aoO)
      {
        localv.apJ.invalidate();
        localLayoutParams.aoO = false;
      }
      return;
      this.aiB.ang.K(localv);
      break;
      label120: localv.ko();
      break label68;
      label128: if (paramView.getParent() == this.aiB)
      {
        int i = this.anf.indexOfChild(paramView);
        int j = paramInt;
        if (paramInt == -1)
          j = this.anf.getChildCount();
        if (i == -1)
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.aiB.indexOfChild(paramView) + this.aiB.ji());
        if (i != j)
          this.aiB.ank.aC(i, j);
      }
      else
      {
        this.anf.a(paramView, paramInt, false);
        localLayoutParams.aoN = true;
        if ((this.aoC != null) && (this.aoC.apg))
          this.aoC.bL(paramView);
      }
    }
  }

  private void cj(int paramInt)
  {
    getChildAt(paramInt);
    this.anf.detachViewFromParent(paramInt);
  }

  public static void d(View paramView, Rect paramRect)
  {
    RecyclerView.e(paramView, paramRect);
  }

  private boolean f(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    paramRecyclerView = paramRecyclerView.getFocusedChild();
    boolean bool2;
    if (paramRecyclerView == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      int i = getPaddingLeft();
      int j = getPaddingTop();
      int k = this.mWidth;
      int m = getPaddingRight();
      int n = this.mHeight;
      int i1 = getPaddingBottom();
      Rect localRect = this.aiB.mTempRect;
      RecyclerView.e(paramRecyclerView, localRect);
      bool2 = bool1;
      if (localRect.left - paramInt1 < k - m)
      {
        bool2 = bool1;
        if (localRect.right - paramInt1 > i)
        {
          bool2 = bool1;
          if (localRect.top - paramInt2 < n - i1)
          {
            bool2 = bool1;
            if (localRect.bottom - paramInt2 > j)
              bool2 = true;
          }
        }
      }
    }
  }

  private int[] h(View paramView, Rect paramRect)
  {
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = this.mWidth - getPaddingRight();
    int m = this.mHeight;
    int n = getPaddingBottom();
    int i1 = paramView.getLeft() + paramRect.left - paramView.getScrollX();
    int i2 = paramView.getTop() + paramRect.top - paramView.getScrollY();
    int i3 = i1 + paramRect.width();
    int i4 = paramRect.height();
    int i5 = Math.min(0, i1 - i);
    int i6 = Math.min(0, i2 - j);
    int i7 = Math.max(0, i3 - k);
    n = Math.max(0, i2 + i4 - (m - n));
    if (s.T(this.aiB) == 1)
      if (i7 != 0)
        if (i6 == 0)
          break label206;
    while (true)
    {
      return new int[] { i7, i6 };
      i7 = Math.max(i5, i3 - k);
      break;
      if (i5 != 0);
      for (i7 = i5; ; i7 = Math.min(i1 - i, i7))
        break;
      label206: i6 = Math.min(i2 - j, n);
    }
  }

  public static void j(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala;
    paramView.layout(localRect.left + paramInt1, localRect.top + paramInt2, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }

  public static void k(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = localLayoutParams.ala;
    paramView.layout(localRect.left + paramInt1 + localLayoutParams.leftMargin, localRect.top + paramInt2 + localLayoutParams.topMargin, paramInt3 - localRect.right - localLayoutParams.rightMargin, paramInt4 - localRect.bottom - localLayoutParams.bottomMargin);
  }

  public static int l(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = j;
    switch (i)
    {
    default:
    case 1073741824:
    case -2147483648:
    }
    for (paramInt1 = Math.max(paramInt2, paramInt3); ; paramInt1 = Math.min(j, Math.max(paramInt2, paramInt3)))
      return paramInt1;
  }

  private static boolean m(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if ((paramInt3 > 0) && (paramInt1 != paramInt3));
    while (true)
    {
      return bool;
      switch (i)
      {
      default:
        break;
      case -2147483648:
        if (paramInt2 >= paramInt1)
          bool = true;
        break;
      case 0:
        bool = true;
        break;
      case 1073741824:
        if (paramInt2 == paramInt1)
          bool = true;
        break;
      }
    }
  }

  private void removeView(View paramView)
  {
    v localv = this.anf;
    int i = localv.aha.indexOfChild(paramView);
    if (i >= 0)
    {
      if (localv.ahb.bJ(i))
        localv.aX(paramView);
      localv.aha.removeViewAt(i);
    }
  }

  private void removeViewAt(int paramInt)
  {
    if (getChildAt(paramInt) != null)
      this.anf.removeViewAt(paramInt);
  }

  public void T(String paramString)
  {
    if (this.aiB != null)
      this.aiB.T(paramString);
  }

  public int a(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    return 0;
  }

  public int a(RecyclerView.o paramo, RecyclerView.s params)
  {
    int i = 1;
    int j = i;
    if (this.aiB != null)
    {
      if (this.aiB.Yq != null)
        break label28;
      j = i;
    }
    while (true)
    {
      return j;
      label28: j = i;
      if (iH())
        j = this.aiB.Yq.getItemCount();
    }
  }

  public RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new RecyclerView.LayoutParams(paramContext, paramAttributeSet);
  }

  public View a(View paramView, int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    return null;
  }

  public void a(int paramInt1, int paramInt2, RecyclerView.s params, RecyclerView.i.a parama)
  {
  }

  public void a(int paramInt, RecyclerView.i.a parama)
  {
  }

  public final void a(int paramInt, RecyclerView.o paramo)
  {
    View localView = getChildAt(paramInt);
    removeViewAt(paramInt);
    paramo.bI(localView);
  }

  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = paramRect.width();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int m = paramRect.height();
    int n = getPaddingTop();
    int i1 = getPaddingBottom();
    setMeasuredDimension(l(paramInt1, i + j + k, s.Z(this.aiB)), l(paramInt2, m + n + i1, s.aa(this.aiB)));
  }

  public void a(RecyclerView.o paramo, RecyclerView.s params, View paramView, b paramb)
  {
    int i;
    if (iH())
    {
      i = bt(paramView);
      if (!iG())
        break label48;
    }
    label48: for (int j = bt(paramView); ; j = 0)
    {
      paramb.H(b.c.b(i, 1, j, 1, false));
      return;
      i = 0;
      break;
    }
  }

  public final void a(RecyclerView.r paramr)
  {
    if ((this.aoC != null) && (paramr != this.aoC) && (this.aoC.apg))
      this.aoC.stop();
    this.aoC = paramr;
    paramr = this.aoC;
    paramr.aiB = this.aiB;
    paramr.amP = this;
    if (paramr.ape == -1)
      throw new IllegalArgumentException("Invalid target position");
    paramr.aiB.anY.ape = paramr.ape;
    paramr.apg = true;
    paramr.apf = true;
    int i = paramr.ape;
    paramr.aph = paramr.aiB.ank.bW(i);
    paramr.aiB.anV.ke();
  }

  public void a(RecyclerView.s params)
  {
  }

  public void a(RecyclerView paramRecyclerView)
  {
  }

  public void a(RecyclerView paramRecyclerView, int paramInt)
  {
  }

  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    g(paramRecyclerView, paramInt1, paramInt2);
  }

  public void a(RecyclerView paramRecyclerView, RecyclerView.o paramo)
  {
  }

  final void a(View paramView, b paramb)
  {
    RecyclerView.v localv = RecyclerView.bn(paramView);
    if ((localv != null) && (!localv.isRemoved()) && (!this.anf.aY(localv.apJ)))
      a(this.aiB.anc, this.aiB.anY, paramView, paramb);
  }

  public final void a(View paramView, RecyclerView.o paramo)
  {
    removeView(paramView);
    paramo.bI(paramView);
  }

  public boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    paramView = h(paramView, paramRect);
    int i = paramView[0];
    int j = paramView[1];
    if (paramBoolean2)
    {
      paramBoolean2 = bool;
      if (!f(paramRecyclerView, i, j));
    }
    else if (i == 0)
    {
      paramBoolean2 = bool;
      if (j == 0);
    }
    else
    {
      if (!paramBoolean1)
        break label74;
      paramRecyclerView.scrollBy(i, j);
    }
    while (true)
    {
      paramBoolean2 = true;
      return paramBoolean2;
      label74: paramRecyclerView.a(i, j, null);
    }
  }

  public boolean a(RecyclerView paramRecyclerView, ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    return false;
  }

  final boolean a(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    if ((!this.aoF) || (!m(paramView.getMeasuredWidth(), paramInt1, paramLayoutParams.width)) || (!m(paramView.getMeasuredHeight(), paramInt2, paramLayoutParams.height)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void aA(int paramInt1, int paramInt2)
  {
    this.mWidth = View.MeasureSpec.getSize(paramInt1);
    this.aoJ = View.MeasureSpec.getMode(paramInt1);
    if ((this.aoJ == 0) && (!RecyclerView.amV))
      this.mWidth = 0;
    this.mHeight = View.MeasureSpec.getSize(paramInt2);
    this.aoK = View.MeasureSpec.getMode(paramInt2);
    if ((this.aoK == 0) && (!RecyclerView.amV))
      this.mHeight = 0;
  }

  final void aB(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    if (i == 0)
      this.aiB.an(paramInt1, paramInt2);
    while (true)
    {
      return;
      int j = 0;
      int k = -2147483648;
      int m = -2147483648;
      int n = 2147483647;
      int i1 = 2147483647;
      while (j < i)
      {
        View localView = getChildAt(j);
        Rect localRect = this.aiB.mTempRect;
        RecyclerView.e(localView, localRect);
        int i2 = i1;
        if (localRect.left < i1)
          i2 = localRect.left;
        int i3 = m;
        if (localRect.right > m)
          i3 = localRect.right;
        int i4 = n;
        if (localRect.top < n)
          i4 = localRect.top;
        int i5 = k;
        if (localRect.bottom > k)
          i5 = localRect.bottom;
        j++;
        i1 = i2;
        m = i3;
        n = i4;
        k = i5;
      }
      this.aiB.mTempRect.set(i1, n, m, k);
      a(this.aiB.mTempRect, paramInt1, paramInt2);
    }
  }

  public final void aD(int paramInt1, int paramInt2)
  {
    this.aiB.an(paramInt1, paramInt2);
  }

  public final void addView(View paramView)
  {
    c(paramView, -1, false);
  }

  public final void addView(View paramView, int paramInt)
  {
    c(paramView, paramInt, false);
  }

  public final void an(boolean paramBoolean)
  {
    if (paramBoolean != this.aoG)
    {
      this.aoG = paramBoolean;
      this.aoH = 0;
      if (this.aiB != null)
        this.aiB.anc.kb();
    }
  }

  public int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    return 0;
  }

  public int b(RecyclerView.o paramo, RecyclerView.s params)
  {
    int i = 1;
    int j = i;
    if (this.aiB != null)
    {
      if (this.aiB.Yq != null)
        break label28;
      j = i;
    }
    while (true)
    {
      return j;
      label28: j = i;
      if (iG())
        j = this.aiB.Yq.getItemCount();
    }
  }

  public final void b(RecyclerView.o paramo)
  {
    for (int i = getChildCount() - 1; i >= 0; i--)
      a(paramo, i, getChildAt(i));
  }

  final void b(RecyclerView paramRecyclerView, RecyclerView.o paramo)
  {
    this.pv = false;
    a(paramRecyclerView, paramo);
  }

  final boolean b(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    if ((paramView.isLayoutRequested()) || (!this.aoF) || (!m(paramView.getWidth(), paramInt1, paramLayoutParams.width)) || (!m(paramView.getHeight(), paramInt2, paramLayoutParams.height)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public View bW(int paramInt)
  {
    int i = getChildCount();
    int j = 0;
    View localView1;
    if (j < i)
    {
      localView1 = getChildAt(j);
      RecyclerView.v localv = RecyclerView.bn(localView1);
      if ((localv != null) && (localv.ki() == paramInt) && (!localv.kh()))
      {
        localView2 = localView1;
        if (!this.aiB.anY.apv)
          if (localv.isRemoved())
            break label80;
      }
    }
    for (View localView2 = localView1; ; localView2 = null)
    {
      return localView2;
      label80: j++;
      break;
    }
  }

  public void bY(int paramInt)
  {
  }

  public final View bl(View paramView)
  {
    Object localObject = null;
    if (this.aiB == null)
      paramView = localObject;
    while (true)
    {
      return paramView;
      View localView = this.aiB.bl(paramView);
      paramView = localObject;
      if (localView != null)
      {
        paramView = localObject;
        if (!this.anf.aY(localView))
          paramView = localView;
      }
    }
  }

  public final void bu(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = this.aiB.bq(paramView);
    int i = localRect.left;
    int j = localRect.right;
    int k = localRect.top;
    int m = localRect.bottom;
    i = c(this.mWidth, this.aoJ, i + j + 0 + (getPaddingLeft() + getPaddingRight() + localLayoutParams.leftMargin + localLayoutParams.rightMargin), localLayoutParams.width, iG());
    m = c(this.mHeight, this.aoK, m + k + 0 + (getPaddingTop() + getPaddingBottom() + localLayoutParams.topMargin + localLayoutParams.bottomMargin), localLayoutParams.height, iH());
    if (b(paramView, i, m, localLayoutParams))
      paramView.measure(i, m);
  }

  final void c(RecyclerView.o paramo)
  {
    int i = paramo.aoV.size();
    for (int j = i - 1; j >= 0; j--)
    {
      View localView = ((RecyclerView.v)paramo.aoV.get(j)).apJ;
      RecyclerView.v localv = RecyclerView.bn(localView);
      if (!localv.kh())
      {
        localv.ao(false);
        if (localv.ks())
          this.aiB.removeDetachedView(localView, false);
        if (this.aiB.anJ != null)
          this.aiB.anJ.d(localv);
        localv.ao(true);
        paramo.bJ(localView);
      }
    }
    paramo.aoV.clear();
    if (paramo.aoW != null)
      paramo.aoW.clear();
    if (i > 0)
      this.aiB.invalidate();
  }

  public void c(RecyclerView.o paramo, RecyclerView.s params)
  {
  }

  public void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
  }

  public void ck(int paramInt)
  {
    if (this.aiB != null)
    {
      RecyclerView localRecyclerView = this.aiB;
      int i = localRecyclerView.anf.getChildCount();
      for (int j = 0; j < i; j++)
        localRecyclerView.anf.getChildAt(j).offsetLeftAndRight(paramInt);
    }
  }

  public void cl(int paramInt)
  {
    if (this.aiB != null)
    {
      RecyclerView localRecyclerView = this.aiB;
      int i = localRecyclerView.anf.getChildCount();
      for (int j = 0; j < i; j++)
        localRecyclerView.anf.getChildAt(j).offsetTopAndBottom(paramInt);
    }
  }

  public void cm(int paramInt)
  {
  }

  public int d(RecyclerView.s params)
  {
    return 0;
  }

  public RecyclerView.LayoutParams d(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof RecyclerView.LayoutParams))
      paramLayoutParams = new RecyclerView.LayoutParams((RecyclerView.LayoutParams)paramLayoutParams);
    while (true)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
        paramLayoutParams = new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
      else
        paramLayoutParams = new RecyclerView.LayoutParams(paramLayoutParams);
    }
  }

  public final void d(RecyclerView.o paramo)
  {
    for (int i = getChildCount() - 1; i >= 0; i--)
      if (!RecyclerView.bn(getChildAt(i)).kh())
        a(i, paramo);
  }

  public void d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
  }

  public int e(RecyclerView.s params)
  {
    return 0;
  }

  final void e(RecyclerView paramRecyclerView)
  {
    this.pv = true;
    f(paramRecyclerView);
  }

  public int f(RecyclerView.s params)
  {
    return 0;
  }

  public void f(RecyclerView paramRecyclerView)
  {
  }

  public final void f(View paramView, Rect paramRect)
  {
    Object localObject = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).ala;
    int i = -((Rect)localObject).left;
    int j = -((Rect)localObject).top;
    int k = paramView.getWidth();
    int m = ((Rect)localObject).right;
    int n = paramView.getHeight();
    paramRect.set(i, j, k + m, ((Rect)localObject).bottom + n);
    if (this.aiB != null)
    {
      Matrix localMatrix = paramView.getMatrix();
      if ((localMatrix != null) && (!localMatrix.isIdentity()))
      {
        localObject = this.aiB.anj;
        ((RectF)localObject).set(paramRect);
        localMatrix.mapRect((RectF)localObject);
        paramRect.set((int)Math.floor(((RectF)localObject).left), (int)Math.floor(((RectF)localObject).top), (int)Math.ceil(((RectF)localObject).right), (int)Math.ceil(((RectF)localObject).bottom));
      }
    }
    paramRect.offset(paramView.getLeft(), paramView.getTop());
  }

  public int g(RecyclerView.s params)
  {
    return 0;
  }

  final void g(RecyclerView paramRecyclerView)
  {
    aA(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
  }

  public void g(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
  }

  public final void g(View paramView, Rect paramRect)
  {
    if (this.aiB == null)
      paramRect.set(0, 0, 0, 0);
    while (true)
    {
      return;
      paramRect.set(this.aiB.bq(paramView));
    }
  }

  public final View getChildAt(int paramInt)
  {
    if (this.anf != null);
    for (View localView = this.anf.getChildAt(paramInt); ; localView = null)
      return localView;
  }

  public final int getChildCount()
  {
    if (this.anf != null);
    for (int i = this.anf.getChildCount(); ; i = 0)
      return i;
  }

  public final boolean getClipToPadding()
  {
    if ((this.aiB != null) && (this.aiB.anh));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final View getFocusedChild()
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.aiB == null)
      localObject2 = localObject1;
    while (true)
    {
      return localObject2;
      View localView = this.aiB.getFocusedChild();
      localObject2 = localObject1;
      if (localView != null)
      {
        localObject2 = localObject1;
        if (!this.anf.aY(localView))
          localObject2 = localView;
      }
    }
  }

  public final int getHeight()
  {
    return this.mHeight;
  }

  public final int getItemCount()
  {
    RecyclerView.a locala;
    if (this.aiB != null)
    {
      locala = this.aiB.getAdapter();
      if (locala == null)
        break label31;
    }
    label31: for (int i = locala.getItemCount(); ; i = 0)
    {
      return i;
      locala = null;
      break;
    }
  }

  public int getPaddingBottom()
  {
    if (this.aiB != null);
    for (int i = this.aiB.getPaddingBottom(); ; i = 0)
      return i;
  }

  public int getPaddingEnd()
  {
    if (this.aiB != null);
    for (int i = s.X(this.aiB); ; i = 0)
      return i;
  }

  public int getPaddingLeft()
  {
    if (this.aiB != null);
    for (int i = this.aiB.getPaddingLeft(); ; i = 0)
      return i;
  }

  public int getPaddingRight()
  {
    if (this.aiB != null);
    for (int i = this.aiB.getPaddingRight(); ; i = 0)
      return i;
  }

  public int getPaddingStart()
  {
    if (this.aiB != null);
    for (int i = s.W(this.aiB); ; i = 0)
      return i;
  }

  public int getPaddingTop()
  {
    if (this.aiB != null);
    for (int i = this.aiB.getPaddingTop(); ; i = 0)
      return i;
  }

  public final int getWidth()
  {
    return this.mWidth;
  }

  public int h(RecyclerView.s params)
  {
    return 0;
  }

  public int i(RecyclerView.s params)
  {
    return 0;
  }

  public abstract RecyclerView.LayoutParams iA();

  public boolean iE()
  {
    return false;
  }

  public boolean iF()
  {
    return this.aoE;
  }

  public boolean iG()
  {
    return false;
  }

  public boolean iH()
  {
    return false;
  }

  boolean iL()
  {
    return false;
  }

  @Deprecated
  public final void jU()
  {
    this.aoE = true;
  }

  public final boolean jV()
  {
    if ((this.aoC != null) && (this.aoC.apg));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void jW()
  {
  }

  final void jX()
  {
    if (this.aoC != null)
      this.aoC.stop();
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool1 = true;
    if ((this.aiB == null) || (paramAccessibilityEvent == null))
      return;
    boolean bool2 = bool1;
    if (!this.aiB.canScrollVertically(1))
    {
      bool2 = bool1;
      if (!this.aiB.canScrollVertically(-1))
      {
        bool2 = bool1;
        if (!this.aiB.canScrollHorizontally(-1))
          if (!this.aiB.canScrollHorizontally(1))
            break label98;
      }
    }
    label98: for (bool2 = bool1; ; bool2 = false)
    {
      paramAccessibilityEvent.setScrollable(bool2);
      if (this.aiB.Yq == null)
        break;
      paramAccessibilityEvent.setItemCount(this.aiB.Yq.getItemCount());
      break;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
  }

  public Parcelable onSaveInstanceState()
  {
    return null;
  }

  public final void removeAllViews()
  {
    for (int i = getChildCount() - 1; i >= 0; i--)
      this.anf.removeViewAt(i);
  }

  public final boolean removeCallbacks(Runnable paramRunnable)
  {
    if (this.aiB != null);
    for (boolean bool = this.aiB.removeCallbacks(paramRunnable); ; bool = false)
      return bool;
  }

  public final void requestLayout()
  {
    if (this.aiB != null)
      this.aiB.requestLayout();
  }

  public final void setMeasuredDimension(int paramInt1, int paramInt2)
  {
    RecyclerView.e(this.aiB, paramInt1, paramInt2);
  }

  final void setRecyclerView(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      this.aiB = null;
      this.anf = null;
      this.mWidth = 0;
    }
    for (this.mHeight = 0; ; this.mHeight = paramRecyclerView.getHeight())
    {
      this.aoJ = 1073741824;
      this.aoK = 1073741824;
      return;
      this.aiB = paramRecyclerView;
      this.anf = paramRecyclerView.anf;
      this.mWidth = paramRecyclerView.getWidth();
    }
  }

  public final void z(View paramView, int paramInt)
  {
    c(paramView, paramInt, true);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.i
 * JD-Core Version:    0.6.2
 */