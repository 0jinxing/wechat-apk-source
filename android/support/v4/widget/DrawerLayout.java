package android.support.v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.a.b.a;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup
{
  static final int[] LAYOUT_ATTRS;
  private static final int[] PU;
  static final boolean PV;
  private static final boolean PW;
  private final b PX = new b();
  private float PY;
  private int PZ;
  private int Qa = -1728053248;
  private float Qb;
  private Paint Qc = new Paint();
  final t Qd;
  final t Qe;
  private final d Qf;
  private final d Qg;
  int Qh;
  private int Qi = 3;
  private int Qj = 3;
  private int Qk = 3;
  private int Ql = 3;
  private boolean Qm;
  boolean Qn;
  private c Qo;
  private Drawable Qp;
  private Drawable Qq;
  CharSequence Qr;
  CharSequence Qs;
  Object Qt;
  private Drawable Qu = null;
  private Drawable Qv = null;
  private Drawable Qw = null;
  private Drawable Qx = null;
  private final ArrayList<View> Qy;
  private boolean mFirstLayout = true;
  private boolean mInLayout;
  private float mInitialMotionX;
  private float mInitialMotionY;
  List<c> mq;
  boolean pB;
  private Drawable pC;

  static
  {
    boolean bool1 = true;
    PU = new int[] { 16843828 };
    LAYOUT_ATTRS = new int[] { 16842931 };
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool2 = true;
      PV = bool2;
      if (Build.VERSION.SDK_INT < 21)
        break label58;
    }
    label58: for (boolean bool2 = bool1; ; bool2 = false)
    {
      PW = bool2;
      return;
      bool2 = false;
      break;
    }
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.PZ = ((int)(64.0F * f1 + 0.5F));
    float f2 = 400.0F * f1;
    this.Qf = new d(3);
    this.Qg = new d(5);
    this.Qd = t.a(this, 1.0F, this.Qf);
    this.Qd.SS = 1;
    this.Qd.SQ = f2;
    this.Qf.QJ = this.Qd;
    this.Qe = t.a(this, 1.0F, this.Qg);
    this.Qe.SS = 2;
    this.Qe.SQ = f2;
    this.Qg.QJ = this.Qe;
    setFocusableInTouchMode(true);
    s.o(this, 1);
    s.a(this, new a());
    setMotionEventSplittingEnabled(false);
    if (s.al(this))
    {
      if (Build.VERSION.SDK_INT < 21)
        break label336;
      setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        @TargetApi(21)
        public final WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
        {
          boolean bool1 = true;
          paramAnonymousView = (DrawerLayout)paramAnonymousView;
          if (paramAnonymousWindowInsets.getSystemWindowInsetTop() > 0)
          {
            bool2 = true;
            paramAnonymousView.Qt = paramAnonymousWindowInsets;
            paramAnonymousView.pB = bool2;
            if ((bool2) || (paramAnonymousView.getBackground() != null))
              break label64;
          }
          label64: for (boolean bool2 = bool1; ; bool2 = false)
          {
            paramAnonymousView.setWillNotDraw(bool2);
            paramAnonymousView.requestLayout();
            return paramAnonymousWindowInsets.consumeSystemWindowInsets();
            bool2 = false;
            break;
          }
        }
      });
      setSystemUiVisibility(1280);
      paramAttributeSet = paramContext.obtainStyledAttributes(PU);
    }
    while (true)
    {
      try
      {
        this.pC = paramAttributeSet.getDrawable(0);
        paramAttributeSet.recycle();
        this.PY = (f1 * 10.0F);
        this.Qy = new ArrayList();
        return;
      }
      finally
      {
        paramAttributeSet.recycle();
      }
      label336: this.pC = null;
    }
  }

  private void J(boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      boolean bool = k;
      int m;
      if (aG(localView))
        if (paramBoolean)
        {
          bool = k;
          if (!localLayoutParams.QB);
        }
        else
        {
          m = localView.getWidth();
          if (!t(localView, 3))
            break label119;
          k |= this.Qd.h(localView, -m, localView.getTop());
        }
      while (true)
      {
        localLayoutParams.QB = false;
        m = k;
        j++;
        k = m;
        break;
        label119: k |= this.Qe.h(localView, getWidth(), localView.getTop());
      }
    }
    this.Qf.eD();
    this.Qg.eD();
    if (k != 0)
      invalidate();
  }

  static float aD(View paramView)
  {
    return ((LayoutParams)paramView.getLayoutParams()).QA;
  }

  private static boolean aF(View paramView)
  {
    if (((LayoutParams)paramView.getLayoutParams()).gravity == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static boolean aG(View paramView)
  {
    int i = d.getAbsoluteGravity(((LayoutParams)paramView.getLayoutParams()).gravity, s.T(paramView));
    boolean bool;
    if ((i & 0x3) != 0)
      bool = true;
    while (true)
    {
      return bool;
      if ((i & 0x5) != 0)
        bool = true;
      else
        bool = false;
    }
  }

  private void aH(View paramView)
  {
    if (!aG(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (this.mFirstLayout)
    {
      localLayoutParams.QA = 1.0F;
      localLayoutParams.QC = 1;
      f(paramView, true);
    }
    while (true)
    {
      invalidate();
      return;
      localLayoutParams.QC |= 2;
      if (t(paramView, 3))
        this.Qd.h(paramView, 0, paramView.getTop());
      else
        this.Qe.h(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
    }
  }

  static boolean aJ(View paramView)
  {
    if ((s.S(paramView) != 4) && (s.S(paramView) != 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean c(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable == null) || (!android.support.v4.a.a.a.b(paramDrawable)));
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      android.support.v4.a.a.a.b(paramDrawable, paramInt);
    }
  }

  private View eF()
  {
    int i = getChildCount();
    int j = 0;
    View localView;
    if (j < i)
    {
      localView = getChildAt(j);
      if ((((LayoutParams)localView.getLayoutParams()).QC & 0x1) != 1);
    }
    while (true)
    {
      return localView;
      j++;
      break;
      localView = null;
    }
  }

  private void y(int paramInt1, int paramInt2)
  {
    int i = d.getAbsoluteGravity(paramInt2, s.T(this));
    Object localObject;
    switch (paramInt2)
    {
    default:
      if (paramInt1 != 0)
      {
        if (i == 3)
        {
          localObject = this.Qd;
          label67: ((t)localObject).cancel();
        }
      }
      else
        switch (paramInt1)
        {
        default:
        case 2:
        case 1:
        }
      break;
    case 3:
    case 5:
    case 8388611:
    case 8388613:
    }
    while (true)
    {
      return;
      this.Qi = paramInt1;
      break;
      this.Qj = paramInt1;
      break;
      this.Qk = paramInt1;
      break;
      this.Ql = paramInt1;
      break;
      localObject = this.Qe;
      break label67;
      localObject = aS(i);
      if (localObject != null)
      {
        aH((View)localObject);
        continue;
        localObject = aS(i);
        if (localObject != null)
          aI((View)localObject);
      }
    }
  }

  public final int aC(View paramView)
  {
    if (!aG(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    int i = ((LayoutParams)paramView.getLayoutParams()).gravity;
    int j = s.T(this);
    switch (i)
    {
    default:
    case 3:
    case 5:
    case 8388611:
    case 8388613:
    }
    label262: 
    while (true)
    {
      j = 0;
      while (true)
      {
        label98: return j;
        if (this.Qi != 3)
        {
          j = this.Qi;
        }
        else
        {
          if (j == 0);
          for (j = this.Qk; j != 3; j = this.Ql)
            break label98;
          if (this.Qj != 3)
          {
            j = this.Qj;
          }
          else
          {
            if (j == 0);
            for (j = this.Ql; j != 3; j = this.Qk)
              break label98;
            if (this.Qk != 3)
            {
              j = this.Qk;
            }
            else
            {
              if (j == 0);
              for (j = this.Qi; j != 3; j = this.Qj)
                break label98;
              if (this.Ql == 3)
                break label239;
              j = this.Ql;
            }
          }
        }
      }
      label239: if (j == 0);
      for (j = this.Qj; ; j = this.Qi)
      {
        if (j == 3)
          break label262;
        break;
      }
    }
  }

  final int aE(View paramView)
  {
    return d.getAbsoluteGravity(((LayoutParams)paramView.getLayoutParams()).gravity, s.T(this));
  }

  public final void aI(View paramView)
  {
    if (!aG(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (this.mFirstLayout)
    {
      localLayoutParams.QA = 0.0F;
      localLayoutParams.QC = 0;
    }
    while (true)
    {
      invalidate();
      return;
      localLayoutParams.QC |= 4;
      if (t(paramView, 3))
        this.Qd.h(paramView, -paramView.getWidth(), paramView.getTop());
      else
        this.Qe.h(paramView, getWidth(), paramView.getTop());
    }
  }

  final View aS(int paramInt)
  {
    int i = d.getAbsoluteGravity(paramInt, s.T(this));
    int j = getChildCount();
    paramInt = 0;
    View localView;
    if (paramInt < j)
    {
      localView = getChildAt(paramInt);
      if ((aE(localView) & 0x7) != (i & 0x7));
    }
    while (true)
    {
      return localView;
      paramInt++;
      break;
      localView = null;
    }
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if (getDescendantFocusability() == 393216);
    while (true)
    {
      return;
      int i = getChildCount();
      int j = 0;
      int k = 0;
      View localView;
      if (j < i)
      {
        localView = getChildAt(j);
        int m;
        if (aG(localView))
        {
          if (!aG(localView))
            throw new IllegalArgumentException("View " + localView + " is not a drawer");
          if ((((LayoutParams)localView.getLayoutParams()).QC & 0x1) == 1)
          {
            m = 1;
            label106: if (m == 0)
              break label144;
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
            k = 1;
          }
        }
        label144: 
        while (true)
        {
          j++;
          break;
          m = 0;
          break label106;
          this.Qy.add(localView);
        }
      }
      if (k == 0)
      {
        j = this.Qy.size();
        for (k = 0; k < j; k++)
        {
          localView = (View)this.Qy.get(k);
          if (localView.getVisibility() == 0)
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
      this.Qy.clear();
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((eF() != null) || (aG(paramView)))
      s.o(paramView, 4);
    while (true)
    {
      if (!PV)
        s.a(paramView, this.PX);
      return;
      s.o(paramView, 1);
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void computeScroll()
  {
    int i = getChildCount();
    float f = 0.0F;
    for (int j = 0; j < i; j++)
      f = Math.max(f, ((LayoutParams)getChildAt(j).getLayoutParams()).QA);
    this.Qb = f;
    boolean bool1 = this.Qd.eX();
    boolean bool2 = this.Qe.eX();
    if ((bool1) || (bool2))
      s.R(this);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i = getHeight();
    boolean bool1 = aF(paramView);
    int j = 0;
    int k = 0;
    int m = getWidth();
    int n = paramCanvas.save();
    int i1 = m;
    int i3;
    View localView;
    int i4;
    if (bool1)
    {
      int i2 = getChildCount();
      i3 = 0;
      j = k;
      if (i3 < i2)
      {
        localView = getChildAt(i3);
        k = j;
        i4 = m;
        if (localView != paramView)
        {
          k = j;
          i4 = m;
          if (localView.getVisibility() == 0)
          {
            Drawable localDrawable = localView.getBackground();
            if (localDrawable == null)
              break label224;
            if (localDrawable.getOpacity() != -1)
              break label218;
            i1 = 1;
            label121: k = j;
            i4 = m;
            if (i1 != 0)
            {
              k = j;
              i4 = m;
              if (aG(localView))
              {
                k = j;
                i4 = m;
                if (localView.getHeight() >= i)
                {
                  if (!t(localView, 3))
                    break label230;
                  i1 = localView.getRight();
                  if (i1 <= j)
                    break label595;
                  j = i1;
                }
              }
            }
          }
        }
      }
    }
    label595: 
    while (true)
    {
      i4 = m;
      k = j;
      while (true)
      {
        i3++;
        j = k;
        m = i4;
        break;
        label218: i1 = 0;
        break label121;
        label224: i1 = 0;
        break label121;
        label230: i1 = localView.getLeft();
        k = j;
        i4 = m;
        if (i1 < m)
        {
          i4 = i1;
          k = j;
        }
      }
      paramCanvas.clipRect(j, 0, m, getHeight());
      i1 = m;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(n);
      if ((this.Qb > 0.0F) && (bool1))
      {
        i3 = (int)(((this.Qa & 0xFF000000) >>> 24) * this.Qb);
        m = this.Qa;
        this.Qc.setColor(i3 << 24 | m & 0xFFFFFF);
        paramCanvas.drawRect(j, 0.0F, i1, getHeight(), this.Qc);
      }
      while (true)
      {
        return bool2;
        float f;
        if ((this.Qp != null) && (t(paramView, 3)))
        {
          m = this.Qp.getIntrinsicWidth();
          i1 = paramView.getRight();
          j = this.Qd.SR;
          f = Math.max(0.0F, Math.min(i1 / j, 1.0F));
          this.Qp.setBounds(i1, paramView.getTop(), m + i1, paramView.getBottom());
          this.Qp.setAlpha((int)(255.0F * f));
          this.Qp.draw(paramCanvas);
        }
        else if ((this.Qq != null) && (t(paramView, 5)))
        {
          i1 = this.Qq.getIntrinsicWidth();
          i3 = paramView.getLeft();
          m = getWidth();
          j = this.Qe.SR;
          f = Math.max(0.0F, Math.min((m - i3) / j, 1.0F));
          this.Qq.setBounds(i3 - i1, paramView.getTop(), i3, paramView.getBottom());
          this.Qq.setAlpha((int)(255.0F * f));
          this.Qq.draw(paramCanvas);
        }
      }
    }
  }

  final View eG()
  {
    int i = getChildCount();
    int j = 0;
    View localView;
    int k;
    if (j < i)
    {
      localView = getChildAt(j);
      if (aG(localView))
      {
        if (!aG(localView))
          throw new IllegalArgumentException("View " + localView + " is not a drawer");
        if (((LayoutParams)localView.getLayoutParams()).QA > 0.0F)
        {
          k = 1;
          label81: if (k == 0)
            break label94;
        }
      }
    }
    while (true)
    {
      return localView;
      k = 0;
      break label81;
      label94: j++;
      break;
      localView = null;
    }
  }

  final void f(View paramView, boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      if (((!paramBoolean) && (!aG(localView))) || ((paramBoolean) && (localView == paramView)))
        s.o(localView, 1);
      while (true)
      {
        j++;
        break;
        s.o(localView, 4);
      }
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams))
      paramLayoutParams = new LayoutParams((LayoutParams)paramLayoutParams);
    while (true)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
        paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
      else
        paramLayoutParams = new LayoutParams(paramLayoutParams);
    }
  }

  public float getDrawerElevation()
  {
    if (PW);
    for (float f = this.PY; ; f = 0.0F)
      return f;
  }

  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.pC;
  }

  final void k(View paramView, float paramFloat)
  {
    paramView = (LayoutParams)paramView.getLayoutParams();
    if (paramFloat == paramView.QA);
    while (true)
    {
      return;
      paramView.QA = paramFloat;
      if (this.mq != null)
        for (int i = this.mq.size() - 1; i >= 0; i--)
          ((c)this.mq.get(i)).E(paramFloat);
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.mFirstLayout = true;
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i;
    if ((this.pB) && (this.pC != null))
    {
      if (Build.VERSION.SDK_INT < 21)
        break label77;
      if (this.Qt == null)
        break label72;
      i = ((WindowInsets)this.Qt).getSystemWindowInsetTop();
    }
    while (true)
    {
      if (i > 0)
      {
        this.pC.setBounds(0, 0, getWidth(), i);
        this.pC.draw(paramCanvas);
      }
      return;
      label72: i = 0;
      continue;
      label77: i = 0;
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i = paramMotionEvent.getActionMasked();
    boolean bool2 = this.Qd.f(paramMotionEvent);
    boolean bool3 = this.Qe.f(paramMotionEvent);
    label62: int j;
    label82: label107: float f1;
    float f2;
    switch (i)
    {
    default:
      i = 0;
      if ((!(bool3 | bool2)) && (i == 0))
      {
        j = getChildCount();
        i = 0;
        if (i >= j)
          break label361;
        if (!((LayoutParams)getChildAt(i).getLayoutParams()).QB)
          break;
        i = 1;
        if ((i == 0) && (!this.Qn));
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    case 0:
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      this.mInitialMotionX = f1;
      this.mInitialMotionY = f2;
      if (this.Qb > 0.0F)
      {
        paramMotionEvent = this.Qd.F((int)f1, (int)f2);
        if ((paramMotionEvent == null) || (!aF(paramMotionEvent)));
      }
      break;
    case 2:
    case 1:
    case 3:
    }
    for (i = 1; ; i = 0)
    {
      this.Qm = false;
      this.Qn = false;
      break label62;
      paramMotionEvent = this.Qd;
      int k = paramMotionEvent.SH.length;
      j = 0;
      label210: if (j < k)
        if (paramMotionEvent.aZ(j))
        {
          f2 = paramMotionEvent.SJ[j] - paramMotionEvent.SH[j];
          f1 = paramMotionEvent.SK[j] - paramMotionEvent.SI[j];
          if (f2 * f2 + f1 * f1 > paramMotionEvent.mTouchSlop * paramMotionEvent.mTouchSlop)
          {
            i = 1;
            if (i == 0)
              break label326;
          }
        }
      label287: for (i = 1; i != 0; i = 0)
      {
        this.Qf.eD();
        this.Qg.eD();
        i = 0;
        break label62;
        i = 0;
        break label287;
        i = 0;
        break label287;
        label326: j++;
        break label210;
      }
      J(true);
      this.Qm = false;
      this.Qn = false;
      break;
      i++;
      break label82;
      label361: i = 0;
      break label107;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    int i;
    if (paramInt == 4)
      if (eG() != null)
      {
        i = 1;
        if (i == 0)
          break label34;
        paramKeyEvent.startTracking();
      }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label34: bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (paramInt == 4)
    {
      paramKeyEvent = eG();
      if ((paramKeyEvent != null) && (aC(paramKeyEvent) == 0))
        J(false);
      if (paramKeyEvent == null);
    }
    for (bool = true; ; bool = super.onKeyUp(paramInt, paramKeyEvent))
      return bool;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mInLayout = true;
    int i = paramInt3 - paramInt1;
    int j = getChildCount();
    paramInt3 = 0;
    while (paramInt3 < j)
    {
      View localView = getChildAt(paramInt3);
      LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (aF(localView))
          localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
      }
      else
      {
        paramInt3++;
        continue;
      }
      int k = localView.getMeasuredWidth();
      int m = localView.getMeasuredHeight();
      int n;
      float f;
      label160: int i1;
      if (t(localView, 3))
      {
        paramInt1 = -k;
        n = (int)(k * localLayoutParams.QA) + paramInt1;
        f = (k + n) / k;
        if (f == localLayoutParams.QA)
          break label306;
        i1 = 1;
        label174: switch (localLayoutParams.gravity & 0x70)
        {
        default:
          localView.layout(n, localLayoutParams.topMargin, k + n, m + localLayoutParams.topMargin);
          label233: if (i1 != 0)
            k(localView, f);
          if (localLayoutParams.QA <= 0.0F)
            break;
        case 80:
        case 16:
        }
      }
      for (paramInt1 = 0; localView.getVisibility() != paramInt1; paramInt1 = 4)
      {
        localView.setVisibility(paramInt1);
        break;
        n = i - (int)(k * localLayoutParams.QA);
        f = (i - n) / k;
        break label160;
        label306: i1 = 0;
        break label174;
        paramInt1 = paramInt4 - paramInt2;
        localView.layout(n, paramInt1 - localLayoutParams.bottomMargin - localView.getMeasuredHeight(), k + n, paramInt1 - localLayoutParams.bottomMargin);
        break label233;
        int i2 = paramInt4 - paramInt2;
        int i3 = (i2 - m) / 2;
        if (i3 < localLayoutParams.topMargin)
          paramInt1 = localLayoutParams.topMargin;
        while (true)
        {
          localView.layout(n, paramInt1, k + n, m + paramInt1);
          break;
          paramInt1 = i3;
          if (i3 + m > i2 - localLayoutParams.bottomMargin)
            paramInt1 = i2 - localLayoutParams.bottomMargin - m;
        }
      }
    }
    this.mInLayout = false;
    this.mFirstLayout = false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n;
    int i1;
    if (i == 1073741824)
    {
      n = k;
      if (j == 1073741824);
    }
    else if (isInEditMode())
    {
      i1 = k;
      if (i != -2147483648)
      {
        i1 = k;
        if (i == 0)
          i1 = 300;
      }
      n = i1;
      if (j == -2147483648)
        break label796;
      n = i1;
      if (j != 0)
        break label796;
      m = 300;
    }
    label148: label795: label796: for (k = i1; ; k = n)
    {
      setMeasuredDimension(k, m);
      View localView;
      int i4;
      int i5;
      LayoutParams localLayoutParams;
      Object localObject1;
      Object localObject2;
      if ((this.Qt != null) && (s.al(this)))
      {
        j = 1;
        int i2 = s.T(this);
        i1 = 0;
        n = 0;
        int i3 = getChildCount();
        i = 0;
        if (i >= i3)
          break label795;
        localView = getChildAt(i);
        i4 = n;
        i5 = i1;
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (j != 0)
          {
            i4 = d.getAbsoluteGravity(localLayoutParams.gravity, i2);
            if (!s.al(localView))
              break label396;
            if (Build.VERSION.SDK_INT >= 21)
            {
              localObject1 = (WindowInsets)this.Qt;
              if (i4 != 3)
                break label360;
              localObject2 = ((WindowInsets)localObject1).replaceSystemWindowInsets(((WindowInsets)localObject1).getSystemWindowInsetLeft(), ((WindowInsets)localObject1).getSystemWindowInsetTop(), 0, ((WindowInsets)localObject1).getSystemWindowInsetBottom());
              localView.dispatchApplyWindowInsets((WindowInsets)localObject2);
            }
          }
        }
      }
      while (true)
        if (aF(localView))
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(k - localLayoutParams.leftMargin - localLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(m - localLayoutParams.topMargin - localLayoutParams.bottomMargin, 1073741824));
          i5 = i1;
          i4 = n;
          i++;
          n = i4;
          i1 = i5;
          break label148;
          throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
          j = 0;
          break;
          label360: localObject2 = localObject1;
          if (i4 != 5)
            break label260;
          localObject2 = ((WindowInsets)localObject1).replaceSystemWindowInsets(0, ((WindowInsets)localObject1).getSystemWindowInsetTop(), ((WindowInsets)localObject1).getSystemWindowInsetRight(), ((WindowInsets)localObject1).getSystemWindowInsetBottom());
          break label260;
          if (Build.VERSION.SDK_INT >= 21)
          {
            localObject1 = (WindowInsets)this.Qt;
            if (i4 == 3)
              localObject2 = ((WindowInsets)localObject1).replaceSystemWindowInsets(((WindowInsets)localObject1).getSystemWindowInsetLeft(), ((WindowInsets)localObject1).getSystemWindowInsetTop(), 0, ((WindowInsets)localObject1).getSystemWindowInsetBottom());
            while (true)
            {
              localLayoutParams.leftMargin = ((WindowInsets)localObject2).getSystemWindowInsetLeft();
              localLayoutParams.topMargin = ((WindowInsets)localObject2).getSystemWindowInsetTop();
              localLayoutParams.rightMargin = ((WindowInsets)localObject2).getSystemWindowInsetRight();
              localLayoutParams.bottomMargin = ((WindowInsets)localObject2).getSystemWindowInsetBottom();
              break;
              localObject2 = localObject1;
              if (i4 == 5)
                localObject2 = ((WindowInsets)localObject1).replaceSystemWindowInsets(0, ((WindowInsets)localObject1).getSystemWindowInsetTop(), ((WindowInsets)localObject1).getSystemWindowInsetRight(), ((WindowInsets)localObject1).getSystemWindowInsetBottom());
            }
          }
        }
      if (aG(localView))
      {
        if ((PW) && (s.ag(localView) != this.PY))
          s.h(localView, this.PY);
        i5 = aE(localView) & 0x7;
        if (i5 == 3)
        {
          i4 = 1;
          if (((i4 == 0) || (i1 == 0)) && ((i4 != 0) || (n == 0)))
            break label678;
          localObject1 = new StringBuilder("Child drawer has absolute gravity ");
          if ((i5 & 0x3) != 3)
            break label652;
          localObject2 = "LEFT";
        }
        while (true)
        {
          throw new IllegalStateException((String)localObject2 + " but this DrawerLayout already has a drawer view along that edge");
          i4 = 0;
          break;
          if ((i5 & 0x5) == 5)
            localObject2 = "RIGHT";
          else
            localObject2 = Integer.toHexString(i5);
        }
        label678: if (i4 != 0)
          i1 = 1;
        while (true)
        {
          localView.measure(getChildMeasureSpec(paramInt1, this.PZ + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
          i4 = n;
          i5 = i1;
          break;
          n = 1;
        }
      }
      throw new IllegalStateException("Child " + localView + " at index " + i + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
      return;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.LC);
      if (paramParcelable.QD != 0)
      {
        View localView = aS(paramParcelable.QD);
        if (localView != null)
          aH(localView);
      }
      if (paramParcelable.QE != 3)
        y(paramParcelable.QE, 3);
      if (paramParcelable.QF != 3)
        y(paramParcelable.QF, 5);
      if (paramParcelable.QG != 3)
        y(paramParcelable.QG, 8388611);
      if (paramParcelable.QH != 3)
        y(paramParcelable.QH, 8388613);
    }
  }

  public void onRtlPropertiesChanged(int paramInt)
  {
    Drawable localDrawable;
    if (!PW)
    {
      paramInt = s.T(this);
      if (paramInt != 0)
        break label77;
      if (this.Qu == null)
        break label101;
      c(this.Qu, paramInt);
      localDrawable = this.Qu;
      this.Qp = localDrawable;
      paramInt = s.T(this);
      if (paramInt != 0)
        break label109;
      if (this.Qv == null)
        break label133;
      c(this.Qv, paramInt);
      localDrawable = this.Qv;
    }
    label133: 
    while (true)
    {
      this.Qq = localDrawable;
      return;
      label77: if (this.Qv != null)
      {
        c(this.Qv, paramInt);
        localDrawable = this.Qv;
        break;
      }
      label101: localDrawable = this.Qw;
      break;
      label109: if (this.Qu != null)
      {
        c(this.Qu, paramInt);
        localDrawable = this.Qu;
      }
      else
      {
        localDrawable = this.Qx;
      }
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    int i = getChildCount();
    label114: label120: label126: for (int j = 0; ; j++)
    {
      LayoutParams localLayoutParams;
      int k;
      if (j < i)
      {
        localLayoutParams = (LayoutParams)getChildAt(j).getLayoutParams();
        if (localLayoutParams.QC != 1)
          break label114;
        k = 1;
        if (localLayoutParams.QC != 2)
          break label120;
      }
      for (int m = 1; ; m = 0)
      {
        if ((k == 0) && (m == 0))
          break label126;
        localSavedState.QD = localLayoutParams.gravity;
        localSavedState.QE = this.Qi;
        localSavedState.QF = this.Qj;
        localSavedState.QG = this.Qk;
        localSavedState.QH = this.Ql;
        return localSavedState;
        k = 0;
        break;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.Qd.g(paramMotionEvent);
    this.Qe.g(paramMotionEvent);
    float f1;
    float f2;
    boolean bool;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2:
    default:
    case 0:
      while (true)
      {
        return true;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.mInitialMotionX = f1;
        this.mInitialMotionY = f2;
        this.Qm = false;
        this.Qn = false;
      }
    case 1:
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      paramMotionEvent = this.Qd.F((int)f1, (int)f2);
      if ((paramMotionEvent != null) && (aF(paramMotionEvent)))
      {
        f1 -= this.mInitialMotionX;
        f2 -= this.mInitialMotionY;
        int i = this.Qd.mTouchSlop;
        if (f1 * f1 + f2 * f2 < i * i)
        {
          paramMotionEvent = eF();
          if (paramMotionEvent != null)
            if (aC(paramMotionEvent) == 2)
              bool = true;
        }
      }
      break;
    case 3:
    }
    while (true)
    {
      J(bool);
      this.Qm = false;
      break;
      bool = false;
      continue;
      J(true);
      this.Qm = false;
      this.Qn = false;
      break;
      bool = true;
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.Qm = paramBoolean;
    if (paramBoolean)
      J(true);
  }

  public void requestLayout()
  {
    if (!this.mInLayout)
      super.requestLayout();
  }

  public void setDrawerElevation(float paramFloat)
  {
    this.PY = paramFloat;
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (aG(localView))
        s.h(localView, this.PY);
    }
  }

  @Deprecated
  public void setDrawerListener(c paramc)
  {
    if (this.Qo != null)
    {
      c localc = this.Qo;
      if ((localc != null) && (this.mq != null))
        this.mq.remove(localc);
    }
    if ((paramc != null) && (paramc != null))
    {
      if (this.mq == null)
        this.mq = new ArrayList();
      this.mq.add(paramc);
    }
    this.Qo = paramc;
  }

  public void setDrawerLockMode(int paramInt)
  {
    y(paramInt, 3);
    y(paramInt, 5);
  }

  public void setScrimColor(int paramInt)
  {
    this.Qa = paramInt;
    invalidate();
  }

  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = android.support.v4.content.b.g(getContext(), paramInt); ; localDrawable = null)
    {
      this.pC = localDrawable;
      invalidate();
      return;
    }
  }

  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.pC = paramDrawable;
    invalidate();
  }

  public void setStatusBarBackgroundColor(int paramInt)
  {
    this.pC = new ColorDrawable(paramInt);
    invalidate();
  }

  final boolean t(View paramView, int paramInt)
  {
    if ((aE(paramView) & paramInt) == paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static class LayoutParams extends ViewGroup.MarginLayoutParams
  {
    float QA;
    boolean QB;
    int QC;
    public int gravity = 0;

    public LayoutParams()
    {
      super(-1);
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.LAYOUT_ATTRS);
      this.gravity = paramContext.getInt(0, 0);
      paramContext.recycle();
    }

    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.gravity = paramLayoutParams.gravity;
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }

    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }

  protected static class SavedState extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
    };
    int QD = 0;
    int QE;
    int QF;
    int QG;
    int QH;

    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.QD = paramParcel.readInt();
      this.QE = paramParcel.readInt();
      this.QF = paramParcel.readInt();
      this.QG = paramParcel.readInt();
      this.QH = paramParcel.readInt();
    }

    public SavedState(Parcelable paramParcelable)
    {
      super();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.QD);
      paramParcel.writeInt(this.QE);
      paramParcel.writeInt(this.QF);
      paramParcel.writeInt(this.QG);
      paramParcel.writeInt(this.QH);
    }
  }

  final class a extends android.support.v4.view.a
  {
    private final Rect oT = new Rect();

    a()
    {
    }

    public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      int i;
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent = paramAccessibilityEvent.getText();
        paramView = DrawerLayout.this.eG();
        if (paramView != null)
        {
          i = DrawerLayout.this.aE(paramView);
          paramView = DrawerLayout.this;
          i = d.getAbsoluteGravity(i, s.T(paramView));
          if (i != 3)
            break label77;
          paramView = paramView.Qr;
          if (paramView != null)
            paramAccessibilityEvent.add(paramView);
        }
      }
      for (boolean bool = true; ; bool = super.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent))
      {
        return bool;
        label77: if (i == 5)
        {
          paramView = paramView.Qs;
          break;
        }
        paramView = null;
        break;
      }
    }

    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(View paramView, android.support.v4.view.a.b paramb)
    {
      if (DrawerLayout.PV)
        super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      while (true)
      {
        paramb.setClassName(DrawerLayout.class.getName());
        paramb.setFocusable(false);
        paramb.setFocused(false);
        paramb.a(b.a.NI);
        paramb.a(b.a.NJ);
        return;
        Object localObject1 = android.support.v4.view.a.b.a(paramb);
        super.onInitializeAccessibilityNodeInfo(paramView, (android.support.v4.view.a.b)localObject1);
        paramb.setSource(paramView);
        Object localObject2 = s.U(paramView);
        if ((localObject2 instanceof View))
          paramb.setParent((View)localObject2);
        localObject2 = this.oT;
        ((android.support.v4.view.a.b)localObject1).getBoundsInParent((Rect)localObject2);
        paramb.setBoundsInParent((Rect)localObject2);
        ((android.support.v4.view.a.b)localObject1).getBoundsInScreen((Rect)localObject2);
        paramb.setBoundsInScreen((Rect)localObject2);
        paramb.setVisibleToUser(((android.support.v4.view.a.b)localObject1).isVisibleToUser());
        paramb.setPackageName(((android.support.v4.view.a.b)localObject1).NG.getPackageName());
        paramb.setClassName(((android.support.v4.view.a.b)localObject1).NG.getClassName());
        paramb.setContentDescription(((android.support.v4.view.a.b)localObject1).NG.getContentDescription());
        paramb.setEnabled(((android.support.v4.view.a.b)localObject1).NG.isEnabled());
        paramb.setClickable(((android.support.v4.view.a.b)localObject1).NG.isClickable());
        paramb.setFocusable(((android.support.v4.view.a.b)localObject1).NG.isFocusable());
        paramb.setFocused(((android.support.v4.view.a.b)localObject1).NG.isFocused());
        paramb.setAccessibilityFocused(((android.support.v4.view.a.b)localObject1).isAccessibilityFocused());
        paramb.setSelected(((android.support.v4.view.a.b)localObject1).NG.isSelected());
        paramb.setLongClickable(((android.support.v4.view.a.b)localObject1).NG.isLongClickable());
        paramb.addAction(((android.support.v4.view.a.b)localObject1).NG.getActions());
        ((android.support.v4.view.a.b)localObject1).NG.recycle();
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        for (int j = 0; j < i; j++)
        {
          localObject1 = paramView.getChildAt(j);
          if (DrawerLayout.aJ((View)localObject1))
            paramb.addChild((View)localObject1);
        }
      }
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if ((DrawerLayout.PV) || (DrawerLayout.aJ(paramView)));
      for (boolean bool = super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent); ; bool = false)
        return bool;
    }
  }

  static final class b extends android.support.v4.view.a
  {
    public final void onInitializeAccessibilityNodeInfo(View paramView, android.support.v4.view.a.b paramb)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      if (!DrawerLayout.aJ(paramView))
        paramb.setParent(null);
    }
  }

  public static abstract interface c
  {
    public abstract void E(float paramFloat);

    public abstract void eH();

    public abstract void eI();
  }

  final class d extends t.a
  {
    final int QI;
    t QJ;
    private final Runnable QK = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        Object localObject1 = DrawerLayout.d.this;
        int j = ((DrawerLayout.d)localObject1).QJ.SR;
        int k;
        Object localObject2;
        int m;
        if (((DrawerLayout.d)localObject1).QI == 3)
        {
          k = 1;
          if (k == 0)
            break label229;
          localObject2 = ((DrawerLayout.d)localObject1).Qz.aS(3);
          if (localObject2 == null)
            break label223;
          m = -((View)localObject2).getWidth();
          label54: m += j;
        }
        while (true)
          label60: if ((localObject2 != null) && (((k != 0) && (((View)localObject2).getLeft() < m)) || ((k == 0) && (((View)localObject2).getLeft() > m) && (((DrawerLayout.d)localObject1).Qz.aC((View)localObject2) == 0))))
          {
            DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)((View)localObject2).getLayoutParams();
            ((DrawerLayout.d)localObject1).QJ.h((View)localObject2, m, ((View)localObject2).getTop());
            localLayoutParams.QB = true;
            ((DrawerLayout.d)localObject1).Qz.invalidate();
            ((DrawerLayout.d)localObject1).eJ();
            localObject2 = ((DrawerLayout.d)localObject1).Qz;
            if (!((DrawerLayout)localObject2).Qn)
            {
              long l = SystemClock.uptimeMillis();
              localObject1 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
              m = ((DrawerLayout)localObject2).getChildCount();
              k = i;
              while (true)
                if (k < m)
                {
                  ((DrawerLayout)localObject2).getChildAt(k).dispatchTouchEvent((MotionEvent)localObject1);
                  k++;
                  continue;
                  k = 0;
                  break;
                  label223: m = 0;
                  break label54;
                  label229: localObject2 = ((DrawerLayout.d)localObject1).Qz.aS(5);
                  m = ((DrawerLayout.d)localObject1).Qz.getWidth() - j;
                  break label60;
                }
              ((MotionEvent)localObject1).recycle();
              ((DrawerLayout)localObject2).Qn = true;
            }
          }
      }
    };

    d(int arg2)
    {
      int i;
      this.QI = i;
    }

    public final void N(int paramInt)
    {
      DrawerLayout localDrawerLayout = DrawerLayout.this;
      View localView = this.QJ.SU;
      int i = localDrawerLayout.Qd.SG;
      int j = localDrawerLayout.Qe.SG;
      if ((i == 1) || (j == 1))
        j = 1;
      DrawerLayout.LayoutParams localLayoutParams;
      while ((localView != null) && (paramInt == 0))
      {
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.QA != 0.0F)
          break label253;
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if ((localLayoutParams.QC & 0x1) == 1)
        {
          localLayoutParams.QC = 0;
          if (localDrawerLayout.mq != null)
          {
            paramInt = localDrawerLayout.mq.size() - 1;
            while (true)
              if (paramInt >= 0)
              {
                ((DrawerLayout.c)localDrawerLayout.mq.get(paramInt)).eI();
                paramInt--;
                continue;
                if ((i == 2) || (j == 2))
                {
                  j = 2;
                  break;
                }
                j = 0;
                break;
              }
          }
          localDrawerLayout.f(localView, false);
          if (localDrawerLayout.hasWindowFocus())
          {
            localView = localDrawerLayout.getRootView();
            if (localView != null)
              localView.sendAccessibilityEvent(32);
          }
        }
      }
      while (j != localDrawerLayout.Qh)
      {
        localDrawerLayout.Qh = j;
        if (localDrawerLayout.mq == null)
          break;
        for (paramInt = localDrawerLayout.mq.size() - 1; paramInt >= 0; paramInt--)
          localDrawerLayout.mq.get(paramInt);
        label253: if (localLayoutParams.QA == 1.0F)
        {
          localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
          if ((localLayoutParams.QC & 0x1) == 0)
          {
            localLayoutParams.QC = 1;
            if (localDrawerLayout.mq != null)
              for (paramInt = localDrawerLayout.mq.size() - 1; paramInt >= 0; paramInt--)
                ((DrawerLayout.c)localDrawerLayout.mq.get(paramInt)).eH();
            localDrawerLayout.f(localView, true);
            if (localDrawerLayout.hasWindowFocus())
              localDrawerLayout.sendAccessibilityEvent(32);
          }
        }
      }
    }

    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      paramFloat2 = DrawerLayout.aD(paramView);
      int i = paramView.getWidth();
      int j;
      if (DrawerLayout.this.t(paramView, 3))
        if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (paramFloat2 > 0.5F)))
          j = 0;
      while (true)
      {
        this.QJ.D(j, paramView.getTop());
        DrawerLayout.this.invalidate();
        return;
        j = -i;
        continue;
        int k = DrawerLayout.this.getWidth();
        if (paramFloat1 >= 0.0F)
        {
          j = k;
          if (paramFloat1 == 0.0F)
          {
            j = k;
            if (paramFloat2 <= 0.5F);
          }
        }
        else
        {
          j = k - i;
        }
      }
    }

    public final void b(View paramView, int paramInt1, int paramInt2)
    {
      paramInt2 = paramView.getWidth();
      float f;
      if (DrawerLayout.this.t(paramView, 3))
      {
        f = (paramInt2 + paramInt1) / paramInt2;
        DrawerLayout.this.k(paramView, f);
        if (f != 0.0F)
          break label76;
      }
      label76: for (paramInt1 = 4; ; paramInt1 = 0)
      {
        paramView.setVisibility(paramInt1);
        DrawerLayout.this.invalidate();
        return;
        f = (DrawerLayout.this.getWidth() - paramInt1) / paramInt2;
        break;
      }
    }

    public final boolean b(View paramView, int paramInt)
    {
      if ((DrawerLayout.aG(paramView)) && (DrawerLayout.this.t(paramView, this.QI)) && (DrawerLayout.this.aC(paramView) == 0));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final int c(View paramView, int paramInt)
    {
      return paramView.getTop();
    }

    public final int d(View paramView, int paramInt)
    {
      if (DrawerLayout.this.t(paramView, 3));
      int i;
      for (paramInt = Math.max(-paramView.getWidth(), Math.min(paramInt, 0)); ; paramInt = Math.max(i - paramView.getWidth(), Math.min(paramInt, i)))
      {
        return paramInt;
        i = DrawerLayout.this.getWidth();
      }
    }

    public final void eD()
    {
      DrawerLayout.this.removeCallbacks(this.QK);
    }

    final void eJ()
    {
      int i = 3;
      if (this.QI == 3)
        i = 5;
      View localView = DrawerLayout.this.aS(i);
      if (localView != null)
        DrawerLayout.this.aI(localView);
    }

    public final void eK()
    {
      DrawerLayout.this.postDelayed(this.QK, 160L);
    }

    public final void k(View paramView, int paramInt)
    {
      ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).QB = false;
      eJ();
    }

    public final int s(View paramView)
    {
      if (DrawerLayout.aG(paramView));
      for (int i = paramView.getWidth(); ; i = 0)
        return i;
    }

    public final void z(int paramInt1, int paramInt2)
    {
      if ((paramInt1 & 0x1) == 1);
      for (View localView = DrawerLayout.this.aS(3); ; localView = DrawerLayout.this.aS(5))
      {
        if ((localView != null) && (DrawerLayout.this.aC(localView) == 0))
          this.QJ.u(localView, paramInt2);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.DrawerLayout
 * JD-Core Version:    0.6.2
 */