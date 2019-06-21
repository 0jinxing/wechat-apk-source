package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.b.a.a;
import android.support.v4.a.a.a;
import android.support.v4.content.b;
import android.support.v4.f.i;
import android.support.v4.f.k.a;
import android.support.v4.f.k.c;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.d;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.support.v4.widget.h;
import android.support.v4.widget.u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup
  implements android.support.v4.view.m
{
  static final String pk;
  static final Class<?>[] pl;
  static final ThreadLocal<Map<String, Constructor<CoordinatorLayout.Behavior>>> pm;
  static final Comparator<View> pn;
  private static final k.a<Rect> po;
  aa mp;
  private boolean pA;
  boolean pB;
  private Drawable pC;
  ViewGroup.OnHierarchyChangeListener pD;
  private o pE;
  private final n pF = new n(this);
  private final List<View> pp = new ArrayList();
  final h<View> pq = new h();
  private final List<View> pr = new ArrayList();
  final List<View> ps = new ArrayList();
  private final int[] pt = new int[2];
  private boolean pu;
  private boolean pv;
  private int[] pw;
  private View px;
  private View py;
  private CoordinatorLayout.e pz;

  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    if (localObject != null)
    {
      localObject = ((Package)localObject).getName();
      pk = (String)localObject;
      if (Build.VERSION.SDK_INT < 21)
        break label82;
    }
    label82: for (pn = new CoordinatorLayout.f(); ; pn = null)
    {
      pl = new Class[] { Context.class, AttributeSet.class };
      pm = new ThreadLocal();
      po = new k.c(12);
      return;
      localObject = null;
      break;
    }
  }

  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771981);
  }

  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (paramInt == 0);
    for (paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.CoordinatorLayout, 0, 2131493832); ; paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.CoordinatorLayout, paramInt, 0))
    {
      paramInt = paramAttributeSet.getResourceId(0, 0);
      if (paramInt == 0)
        break;
      paramContext = paramContext.getResources();
      this.pw = paramContext.getIntArray(paramInt);
      float f = paramContext.getDisplayMetrics().density;
      int j = this.pw.length;
      for (paramInt = i; paramInt < j; paramInt++)
      {
        paramContext = this.pw;
        paramContext[paramInt] = ((int)(paramContext[paramInt] * f));
      }
    }
    this.pC = paramAttributeSet.getDrawable(1);
    paramAttributeSet.recycle();
    ca();
    super.setOnHierarchyChangeListener(new CoordinatorLayout.c(this));
  }

  private int U(int paramInt)
  {
    int i = 0;
    if (this.pw == null)
    {
      new StringBuilder("No keylines defined for ").append(this).append(" - attempted index lookup ").append(paramInt);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if ((paramInt < 0) || (paramInt >= this.pw.length))
      {
        new StringBuilder("Keyline index ").append(paramInt).append(" out of range for ").append(this);
        paramInt = i;
      }
      else
      {
        paramInt = this.pw[paramInt];
      }
    }
  }

  private static int V(int paramInt)
  {
    if ((paramInt & 0x7) == 0)
      paramInt = 0x800003 | paramInt;
    while (true)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0)
        i = paramInt | 0x30;
      return i;
    }
  }

  private static int W(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0)
      i = 8388661;
    return i;
  }

  static CoordinatorLayout.Behavior a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      paramContext = null;
      return paramContext;
    }
    String str;
    if (paramString.startsWith("."))
      str = paramContext.getPackageName() + paramString;
    while (true)
      try
      {
        paramString = (Map)pm.get();
        if (paramString == null)
        {
          paramString = new java/util/HashMap;
          paramString.<init>();
          pm.set(paramString);
          Constructor localConstructor1 = (Constructor)paramString.get(str);
          Constructor localConstructor2 = localConstructor1;
          if (localConstructor1 == null)
          {
            localConstructor2 = paramContext.getClassLoader().loadClass(str).getConstructor(pl);
            localConstructor2.setAccessible(true);
            paramString.put(str, localConstructor2);
          }
          paramContext = (CoordinatorLayout.Behavior)localConstructor2.newInstance(new Object[] { paramContext, paramAttributeSet });
          break;
          str = paramString;
          if (paramString.indexOf('.') < 0)
          {
            str = paramString;
            if (!TextUtils.isEmpty(pk))
              str = pk + '.' + paramString;
          }
        }
      }
      catch (Exception paramContext)
      {
        throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), paramContext);
      }
  }

  private static void a(int paramInt1, Rect paramRect1, Rect paramRect2, CoordinatorLayout.d paramd, int paramInt2, int paramInt3)
  {
    int i = paramd.gravity;
    int j = i;
    if (i == 0)
      j = 17;
    int k = d.getAbsoluteGravity(j, paramInt1);
    j = d.getAbsoluteGravity(V(paramd.anchorGravity), paramInt1);
    switch (j & 0x7)
    {
    default:
      paramInt1 = paramRect1.left;
      switch (j & 0x70)
      {
      default:
        j = paramRect1.top;
        label114: i = paramInt1;
        switch (k & 0x7)
        {
        default:
          i = paramInt1 - paramInt2;
        case 5:
          label154: paramInt1 = j;
          switch (k & 0x70)
          {
          default:
          case 80:
          case 16:
          }
          break;
        case 1:
        }
        break;
      case 80:
      case 16:
      }
      break;
    case 5:
    case 1:
    }
    for (paramInt1 = j - paramInt3; ; paramInt1 = j - paramInt3 / 2)
    {
      paramRect2.set(i, paramInt1, i + paramInt2, paramInt1 + paramInt3);
      return;
      paramInt1 = paramRect1.right;
      break;
      paramInt1 = paramRect1.left;
      paramInt1 = paramRect1.width() / 2 + paramInt1;
      break;
      j = paramRect1.bottom;
      break label114;
      j = paramRect1.top + paramRect1.height() / 2;
      break label114;
      i = paramInt1 - paramInt2 / 2;
      break label154;
    }
  }

  private void a(CoordinatorLayout.d paramd, Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = getWidth();
    int j = getHeight();
    i = Math.max(getPaddingLeft() + paramd.leftMargin, Math.min(paramRect.left, i - getPaddingRight() - paramInt1 - paramd.rightMargin));
    j = Math.max(getPaddingTop() + paramd.topMargin, Math.min(paramRect.top, j - getPaddingBottom() - paramInt2 - paramd.bottomMargin));
    paramRect.set(i, j, i + paramInt1, j + paramInt2);
  }

  private void a(View paramView, int paramInt, Rect paramRect1, Rect paramRect2)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    a(paramInt, paramRect1, paramRect2, locald, i, j);
    a(locald, paramRect2, i, j);
  }

  private void a(View paramView1, View paramView2, int paramInt)
  {
    paramView1.getLayoutParams();
    Rect localRect1 = bY();
    Rect localRect2 = bY();
    try
    {
      u.a(this, paramView2, localRect1);
      a(paramView1, paramInt, localRect1, localRect2);
      paramView1.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
      return;
    }
    finally
    {
      c(localRect1);
      c(localRect2);
    }
    throw paramView1;
  }

  private void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    if ((paramView.isLayoutRequested()) || (paramView.getVisibility() == 8))
      paramRect.setEmpty();
    while (true)
    {
      return;
      if (paramBoolean)
        u.a(this, paramView, paramRect);
      else
        paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    }
  }

  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = false;
    int i = 0;
    int j = paramMotionEvent.getActionMasked();
    List localList = this.pr;
    localList.clear();
    boolean bool2 = isChildrenDrawingOrderEnabled();
    int k = getChildCount();
    int m = k - 1;
    if (m >= 0)
    {
      if (bool2);
      for (n = getChildDrawingOrder(k, m); ; n = m)
      {
        localList.add(getChildAt(n));
        m--;
        break;
      }
    }
    if (pn != null)
      Collections.sort(localList, pn);
    k = localList.size();
    int n = 0;
    MotionEvent localMotionEvent = null;
    m = i;
    View localView;
    CoordinatorLayout.d locald;
    CoordinatorLayout.Behavior localBehavior;
    if (n < k)
    {
      localView = (View)localList.get(n);
      locald = (CoordinatorLayout.d)localView.getLayoutParams();
      localBehavior = locald.pH;
      if (((bool1) || (m != 0)) && (j != 0))
      {
        if (localBehavior == null)
          break label443;
        if (localMotionEvent != null)
          break label440;
        long l = SystemClock.uptimeMillis();
        localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        label202: switch (paramInt)
        {
        default:
        case 0:
        case 1:
        }
      }
    }
    label296: label430: label440: label443: 
    while (true)
    {
      n++;
      break;
      localBehavior.a(this, localView, localMotionEvent);
      continue;
      localBehavior.b(this, localView, localMotionEvent);
      continue;
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (localBehavior == null);
      }
      switch (paramInt)
      {
      default:
        bool2 = bool1;
        if (bool1)
        {
          this.px = localView;
          bool2 = bool1;
        }
        bool1 = bool2;
        if (locald.pH == null)
          locald.pR = false;
        boolean bool3 = locald.pR;
        if (locald.pR)
        {
          bool2 = true;
          label347: if ((!bool2) || (bool3))
            break label421;
        }
        break;
      case 0:
      case 1:
      }
      for (m = 1; ; m = 0)
      {
        if (bool2)
        {
          bool2 = bool1;
          if (m == 0)
            break label430;
        }
        break;
        bool1 = localBehavior.a(this, localView, paramMotionEvent);
        break label296;
        bool1 = localBehavior.b(this, localView, paramMotionEvent);
        break label296;
        bool2 = locald.pR | false;
        locald.pR = bool2;
        break label347;
      }
      bool2 = bool1;
      localList.clear();
      return bool2;
      break label202;
    }
  }

  private static Rect bY()
  {
    Rect localRect1 = (Rect)po.aA();
    Rect localRect2 = localRect1;
    if (localRect1 == null)
      localRect2 = new Rect();
    return localRect2;
  }

  private void bZ()
  {
    this.pp.clear();
    Object localObject1 = this.pq;
    int i = ((h)localObject1).PR.size();
    Object localObject2;
    for (int j = 0; j < i; j++)
    {
      localObject2 = (ArrayList)((h)localObject1).PR.valueAt(j);
      if (localObject2 != null)
      {
        ((ArrayList)localObject2).clear();
        ((h)localObject1).PQ.release(localObject2);
      }
    }
    ((h)localObject1).PR.clear();
    int k = getChildCount();
    label215: label476: label485: label487: label498: label759: for (i = 0; i < k; i++)
    {
      View localView1 = getChildAt(i);
      CoordinatorLayout.d locald = o(localView1);
      if (locald.pK == -1)
      {
        locald.pQ = null;
        locald.pP = null;
        this.pq.I(localView1);
      }
      for (j = 0; ; j++)
      {
        if (j >= k)
          break label759;
        if (j != i)
        {
          View localView2 = getChildAt(j);
          int m;
          if (localView2 != locald.pQ)
          {
            m = s.T(this);
            int n = d.getAbsoluteGravity(((CoordinatorLayout.d)localView2.getLayoutParams()).pL, m);
            if ((n != 0) && ((d.getAbsoluteGravity(locald.pM, m) & n) == n))
            {
              m = 1;
              if ((m == 0) && ((locald.pH == null) || (!locald.pH.e(localView2))))
                break label675;
            }
          }
          else
          {
            m = 1;
          }
          while (true)
            if (m != 0)
            {
              if (!this.pq.PR.containsKey(localView2))
                this.pq.I(localView2);
              h localh = this.pq;
              if ((!localh.PR.containsKey(localView2)) || (!localh.PR.containsKey(localView1)))
              {
                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                if (locald.pP != null)
                {
                  if (locald.pP.getId() == locald.pK)
                    break label399;
                  j = 0;
                }
                while (true)
                {
                  if (j != 0)
                    break label485;
                  locald.pP = findViewById(locald.pK);
                  if (locald.pP == null)
                    break label600;
                  if (locald.pP != this)
                    break label498;
                  if (!isInEditMode())
                    break label487;
                  locald.pQ = null;
                  locald.pP = null;
                  break;
                  localObject1 = locald.pP;
                  for (localObject2 = locald.pP.getParent(); ; localObject2 = ((ViewParent)localObject2).getParent())
                  {
                    if (localObject2 == this)
                      break label476;
                    if ((localObject2 == null) || (localObject2 == localView1))
                    {
                      locald.pQ = null;
                      locald.pP = null;
                      j = 0;
                      break;
                    }
                    if ((localObject2 instanceof View))
                      localObject1 = (View)localObject2;
                  }
                  locald.pQ = ((View)localObject1);
                  j = 1;
                }
                break;
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                localObject1 = locald.pP;
                for (localObject2 = locald.pP.getParent(); ; localObject2 = ((ViewParent)localObject2).getParent())
                {
                  if ((localObject2 == this) || (localObject2 == null))
                    break label591;
                  if (localObject2 == localView1)
                  {
                    if (isInEditMode())
                    {
                      locald.pQ = null;
                      locald.pP = null;
                      break;
                    }
                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                  }
                  if ((localObject2 instanceof View))
                    localObject1 = (View)localObject2;
                }
                locald.pQ = ((View)localObject1);
                break;
                if (isInEditMode())
                {
                  locald.pQ = null;
                  locald.pP = null;
                  break;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(locald.pK) + " to anchor view " + localView1);
                m = 0;
                break label215;
                m = 0;
                continue;
              }
              localObject1 = (ArrayList)localh.PR.get(localView2);
              localObject2 = localObject1;
              if (localObject1 == null)
              {
                localObject1 = (ArrayList)localh.PQ.aA();
                localObject2 = localObject1;
                if (localObject1 == null)
                  localObject2 = new ArrayList();
                localh.PR.put(localView2, localObject2);
              }
              ((ArrayList)localObject2).add(localView1);
            }
        }
      }
    }
    label399: label591: label600: this.pp.addAll(this.pq.eE());
    label675: Collections.reverse(this.pp);
  }

  private static void c(Rect paramRect)
  {
    paramRect.setEmpty();
    po.release(paramRect);
  }

  private void c(View paramView, int paramInt1, int paramInt2)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    int i = d.getAbsoluteGravity(W(locald.gravity), paramInt2);
    int j = getWidth();
    int k = getHeight();
    int m = paramView.getMeasuredWidth();
    int n = paramView.getMeasuredHeight();
    int i1 = paramInt1;
    if (paramInt2 == 1)
      i1 = j - paramInt1;
    paramInt1 = U(i1) - m;
    paramInt2 = 0;
    switch (i & 0x7)
    {
    default:
      switch (i & 0x70)
      {
      default:
      case 80:
      case 16:
      }
      break;
    case 5:
    case 1:
    }
    while (true)
    {
      paramInt1 = Math.max(getPaddingLeft() + locald.leftMargin, Math.min(paramInt1, j - getPaddingRight() - m - locald.rightMargin));
      paramInt2 = Math.max(getPaddingTop() + locald.topMargin, Math.min(paramInt2, k - getPaddingBottom() - n - locald.bottomMargin));
      paramView.layout(paramInt1, paramInt2, paramInt1 + m, paramInt2 + n);
      return;
      paramInt1 += m;
      break;
      paramInt1 += m / 2;
      break;
      paramInt2 = n + 0;
      continue;
      paramInt2 = n / 2 + 0;
    }
  }

  private void ca()
  {
    if (Build.VERSION.SDK_INT < 21);
    while (true)
    {
      return;
      if (s.al(this))
      {
        if (this.pE == null)
          this.pE = new o()
          {
            public final aa a(View paramAnonymousView, aa paramAnonymousaa)
            {
              boolean bool1 = true;
              int i = 0;
              CoordinatorLayout localCoordinatorLayout = CoordinatorLayout.this;
              if (!i.equals(localCoordinatorLayout.mp, paramAnonymousaa))
              {
                localCoordinatorLayout.mp = paramAnonymousaa;
                if ((paramAnonymousaa != null) && (paramAnonymousaa.getSystemWindowInsetTop() > 0))
                {
                  bool2 = true;
                  localCoordinatorLayout.pB = bool2;
                  if ((localCoordinatorLayout.pB) || (localCoordinatorLayout.getBackground() != null))
                    break label155;
                }
                label155: for (boolean bool2 = bool1; ; bool2 = false)
                {
                  localCoordinatorLayout.setWillNotDraw(bool2);
                  if (paramAnonymousaa.isConsumed())
                    break label171;
                  int j = localCoordinatorLayout.getChildCount();
                  paramAnonymousView = paramAnonymousaa;
                  while (i < j)
                  {
                    paramAnonymousaa = localCoordinatorLayout.getChildAt(i);
                    if ((!s.al(paramAnonymousaa)) || (((CoordinatorLayout.d)paramAnonymousaa.getLayoutParams()).pH == null))
                      break label168;
                    paramAnonymousaa = CoordinatorLayout.Behavior.b(paramAnonymousView);
                    paramAnonymousView = paramAnonymousaa;
                    if (paramAnonymousaa.isConsumed())
                      break;
                    paramAnonymousView = paramAnonymousaa;
                    i++;
                  }
                  bool2 = false;
                  break;
                }
                label161: localCoordinatorLayout.requestLayout();
              }
              while (true)
              {
                return paramAnonymousView;
                label168: break;
                label171: paramAnonymousView = paramAnonymousaa;
                break label161;
                paramAnonymousView = paramAnonymousaa;
              }
            }
          };
        s.a(this, this.pE);
        setSystemUiVisibility(1280);
      }
      else
      {
        s.a(this, null);
      }
    }
  }

  private void f(View paramView, int paramInt)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    Rect localRect1 = bY();
    localRect1.set(getPaddingLeft() + locald.leftMargin, getPaddingTop() + locald.topMargin, getWidth() - getPaddingRight() - locald.rightMargin, getHeight() - getPaddingBottom() - locald.bottomMargin);
    if ((this.mp != null) && (s.al(this)) && (!s.al(paramView)))
    {
      localRect1.left += this.mp.getSystemWindowInsetLeft();
      localRect1.top += this.mp.getSystemWindowInsetTop();
      localRect1.right -= this.mp.getSystemWindowInsetRight();
      localRect1.bottom -= this.mp.getSystemWindowInsetBottom();
    }
    Rect localRect2 = bY();
    d.apply(V(locald.gravity), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect1, localRect2, paramInt);
    paramView.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
    c(localRect1);
    c(localRect2);
  }

  private static void g(View paramView, int paramInt)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    if (locald.pN != paramInt)
    {
      s.r(paramView, paramInt - locald.pN);
      locald.pN = paramInt;
    }
  }

  private static void h(View paramView, int paramInt)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    if (locald.pO != paramInt)
    {
      s.q(paramView, paramInt - locald.pO);
      locald.pO = paramInt;
    }
  }

  private static CoordinatorLayout.d o(View paramView)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    if (!locald.pI)
    {
      if (!(paramView instanceof CoordinatorLayout.a))
        break label42;
      locald.a(((CoordinatorLayout.a)paramView).cb());
      locald.pI = true;
    }
    while (true)
    {
      return locald;
      label42: Class localClass = paramView.getClass();
      paramView = null;
      View localView;
      while (true)
      {
        localView = paramView;
        if (localClass == null)
          break;
        paramView = (CoordinatorLayout.b)localClass.getAnnotation(CoordinatorLayout.b.class);
        localView = paramView;
        if (paramView != null)
          break;
        localClass = localClass.getSuperclass();
      }
      if (localView != null);
      try
      {
        locald.a((CoordinatorLayout.Behavior)localView.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        locald.pI = true;
      }
      catch (Exception paramView)
      {
        while (true)
          new StringBuilder("Default behavior class ").append(localView.value().getName()).append(" could not be instantiated. Did you forget a default constructor?");
      }
    }
  }

  private void q(boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      CoordinatorLayout.Behavior localBehavior = ((CoordinatorLayout.d)localView.getLayoutParams()).pH;
      MotionEvent localMotionEvent;
      if (localBehavior != null)
      {
        long l = SystemClock.uptimeMillis();
        localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        if (!paramBoolean)
          break label81;
        localBehavior.a(this, localView, localMotionEvent);
      }
      while (true)
      {
        localMotionEvent.recycle();
        j++;
        break;
        label81: localBehavior.b(this, localView, localMotionEvent);
      }
    }
    for (j = 0; j < i; j++)
      ((CoordinatorLayout.d)getChildAt(j).getLayoutParams()).pR = false;
    this.px = null;
    this.pu = false;
  }

  final void X(int paramInt)
  {
    int i = s.T(this);
    int j = this.pp.size();
    Rect localRect1 = bY();
    Rect localRect2 = bY();
    Rect localRect3 = bY();
    int k = 0;
    View localView;
    Object localObject1;
    int m;
    Object localObject2;
    Object localObject4;
    if (k < j)
    {
      localView = (View)this.pp.get(k);
      localObject1 = (CoordinatorLayout.d)localView.getLayoutParams();
      if ((paramInt != 0) || (localView.getVisibility() != 8))
      {
        m = 0;
        int n;
        int i1;
        int i2;
        if (m < k)
        {
          localObject2 = (View)this.pp.get(m);
          CoordinatorLayout.d locald;
          if (((CoordinatorLayout.d)localObject1).pQ == localObject2)
          {
            locald = (CoordinatorLayout.d)localView.getLayoutParams();
            if (locald.pP != null)
            {
              localObject3 = bY();
              localObject4 = bY();
              localObject2 = bY();
              u.a(this, locald.pP, (Rect)localObject3);
              a(localView, false, (Rect)localObject4);
              n = localView.getMeasuredWidth();
              i1 = localView.getMeasuredHeight();
              a(i, (Rect)localObject3, (Rect)localObject2, locald, n, i1);
              if ((((Rect)localObject2).left == ((Rect)localObject4).left) && (((Rect)localObject2).top == ((Rect)localObject4).top))
                break label339;
            }
          }
          label339: for (i2 = 1; ; i2 = 0)
          {
            a(locald, (Rect)localObject2, n, i1);
            n = ((Rect)localObject2).left - ((Rect)localObject4).left;
            i1 = ((Rect)localObject2).top - ((Rect)localObject4).top;
            if (n != 0)
              s.r(localView, n);
            if (i1 != 0)
              s.q(localView, i1);
            if (i2 != 0)
            {
              CoordinatorLayout.Behavior localBehavior = locald.pH;
              if (localBehavior != null)
                localBehavior.a(this, localView, locald.pP);
            }
            c((Rect)localObject3);
            c((Rect)localObject4);
            c((Rect)localObject2);
            m++;
            break;
          }
        }
        a(localView, true, localRect2);
        if ((((CoordinatorLayout.d)localObject1).pL != 0) && (!localRect2.isEmpty()))
        {
          m = d.getAbsoluteGravity(((CoordinatorLayout.d)localObject1).pL, i);
          switch (m & 0x70)
          {
          default:
            switch (m & 0x7)
            {
            case 4:
            default:
            case 3:
            case 5:
            }
            break;
          case 48:
          case 80:
          }
        }
        while (true)
        {
          if ((((CoordinatorLayout.d)localObject1).pM != 0) && (localView.getVisibility() == 0) && (s.as(localView)) && (localView.getWidth() > 0) && (localView.getHeight() > 0))
            break label709;
          label484: if (paramInt != 2)
          {
            localRect3.set(((CoordinatorLayout.d)localView.getLayoutParams()).pV);
            if (localRect3.equals(localRect2))
              break label1213;
            ((CoordinatorLayout.d)localView.getLayoutParams()).pV.set(localRect2);
          }
          for (m = k + 1; ; m++)
          {
            if (m >= j)
              break label1213;
            localObject2 = (View)this.pp.get(m);
            localObject1 = (CoordinatorLayout.d)((View)localObject2).getLayoutParams();
            localObject4 = ((CoordinatorLayout.d)localObject1).pH;
            if ((localObject4 != null) && (((CoordinatorLayout.Behavior)localObject4).e(localView)))
            {
              if ((paramInt != 0) || (!((CoordinatorLayout.d)localObject1).pU))
                break;
              ((CoordinatorLayout.d)localObject1).pU = false;
            }
          }
          localRect1.top = Math.max(localRect1.top, localRect2.bottom);
          break;
          localRect1.bottom = Math.max(localRect1.bottom, getHeight() - localRect2.top);
          break;
          localRect1.left = Math.max(localRect1.left, localRect2.right);
          continue;
          localRect1.right = Math.max(localRect1.right, getWidth() - localRect2.left);
        }
        label709: Object localObject3 = (CoordinatorLayout.d)localView.getLayoutParams();
        localObject1 = ((CoordinatorLayout.d)localObject3).pH;
        localObject4 = bY();
        localObject2 = bY();
        ((Rect)localObject2).set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if ((localObject1 != null) && (((CoordinatorLayout.Behavior)localObject1).a(localView, (Rect)localObject4)))
        {
          if (!((Rect)localObject2).contains((Rect)localObject4))
            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + ((Rect)localObject4).toShortString() + " | Bounds:" + ((Rect)localObject2).toShortString());
        }
        else
          ((Rect)localObject4).set((Rect)localObject2);
        c((Rect)localObject2);
        if (!((Rect)localObject4).isEmpty())
        {
          n = d.getAbsoluteGravity(((CoordinatorLayout.d)localObject3).pM, i);
          i2 = 0;
          m = i2;
          if ((n & 0x30) == 48)
          {
            i1 = ((Rect)localObject4).top - ((CoordinatorLayout.d)localObject3).topMargin - ((CoordinatorLayout.d)localObject3).pO;
            m = i2;
            if (i1 < localRect1.top)
            {
              h(localView, localRect1.top - i1);
              m = 1;
            }
          }
          i2 = m;
          if ((n & 0x50) == 80)
          {
            i1 = getHeight() - ((Rect)localObject4).bottom - ((CoordinatorLayout.d)localObject3).bottomMargin + ((CoordinatorLayout.d)localObject3).pO;
            i2 = m;
            if (i1 < localRect1.bottom)
            {
              h(localView, i1 - localRect1.bottom);
              i2 = 1;
            }
          }
          if (i2 == 0)
            h(localView, 0);
          i2 = 0;
          m = i2;
          if ((n & 0x3) == 3)
          {
            i1 = ((Rect)localObject4).left - ((CoordinatorLayout.d)localObject3).leftMargin - ((CoordinatorLayout.d)localObject3).pN;
            m = i2;
            if (i1 < localRect1.left)
            {
              g(localView, localRect1.left - i1);
              m = 1;
            }
          }
          if ((n & 0x5) != 5)
            break label1235;
          i2 = getWidth();
          i1 = ((Rect)localObject4).right;
          n = ((CoordinatorLayout.d)localObject3).rightMargin;
          i2 = ((CoordinatorLayout.d)localObject3).pN + (i2 - i1 - n);
          if (i2 >= localRect1.right)
            break label1235;
          g(localView, i2 - localRect1.right);
          m = 1;
        }
      }
    }
    label1213: label1235: 
    while (true)
    {
      if (m == 0)
        g(localView, 0);
      c((Rect)localObject4);
      break label484;
      switch (paramInt)
      {
      default:
      case 2:
      }
      for (boolean bool = ((CoordinatorLayout.Behavior)localObject4).a(this, (View)localObject2, localView); paramInt == 1; bool = true)
      {
        ((CoordinatorLayout.d)localObject1).pU = bool;
        break;
      }
      k++;
      break;
      c(localRect1);
      c(localRect2);
      c(localRect3);
      return;
    }
  }

  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = getChildCount();
    int n = 0;
    label126: int i1;
    if (n < m)
    {
      View localView = getChildAt(n);
      if (localView.getVisibility() == 8)
        break label238;
      Object localObject = (CoordinatorLayout.d)localView.getLayoutParams();
      if (!((CoordinatorLayout.d)localObject).Y(paramInt3))
        break label238;
      localObject = ((CoordinatorLayout.d)localObject).pH;
      if (localObject == null)
        break label238;
      int[] arrayOfInt = this.pt;
      this.pt[1] = 0;
      arrayOfInt[0] = 0;
      ((CoordinatorLayout.Behavior)localObject).a(this, localView, paramView, paramInt2, this.pt, paramInt3);
      if (paramInt1 > 0)
      {
        i = Math.max(i, this.pt[0]);
        if (paramInt2 <= 0)
          break label199;
        k = Math.max(j, this.pt[1]);
        label143: i1 = 1;
        j = i;
        i = k;
      }
    }
    while (true)
    {
      int i2 = n + 1;
      n = j;
      k = i1;
      j = i;
      i = n;
      n = i2;
      break;
      i = Math.min(i, this.pt[0]);
      break label126;
      label199: k = Math.min(j, this.pt[1]);
      break label143;
      paramArrayOfInt[0] = i;
      paramArrayOfInt[1] = j;
      if (k != 0)
        X(1);
      return;
      label238: i1 = j;
      j = i;
      i = i1;
      i1 = k;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof CoordinatorLayout.d)) && (super.checkLayoutParams(paramLayoutParams)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean d(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = bY();
    u.a(this, paramView, localRect);
    try
    {
      boolean bool = localRect.contains(paramInt1, paramInt2);
      return bool;
    }
    finally
    {
      c(localRect);
    }
    throw paramView;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    paramView.getLayoutParams();
    return super.drawChild(paramCanvas, paramView, paramLong);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool1 = false;
    Drawable localDrawable = this.pC;
    boolean bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful())
        bool2 = localDrawable.setState(arrayOfInt) | false;
    }
    if (bool2)
      invalidate();
  }

  public final void e(View paramView, int paramInt)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    if (locald.cc())
      throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    if (locald.pP != null)
      a(paramView, locald.pP, paramInt);
    while (true)
    {
      return;
      if (locald.pJ >= 0)
        c(paramView, locald.pJ, paramInt);
      else
        f(paramView, paramInt);
    }
  }

  public final boolean e(View paramView, int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      View localView = getChildAt(j);
      CoordinatorLayout.d locald;
      if (localView.getVisibility() != 8)
      {
        locald = (CoordinatorLayout.d)localView.getLayoutParams();
        CoordinatorLayout.Behavior localBehavior = locald.pH;
        if (localBehavior != null)
        {
          boolean bool2 = localBehavior.a(this, localView, paramView, paramInt1, paramInt2);
          bool1 |= bool2;
          locald.i(paramInt2, bool2);
        }
      }
      while (true)
      {
        j++;
        break;
        locald.i(paramInt2, false);
      }
    }
    return bool1;
  }

  final List<View> getDependencySortedChildren()
  {
    bZ();
    return Collections.unmodifiableList(this.pp);
  }

  public final aa getLastWindowInsets()
  {
    return this.mp;
  }

  public int getNestedScrollAxes()
  {
    return this.pF.Ms;
  }

  public Drawable getStatusBarBackground()
  {
    return this.pC;
  }

  protected int getSuggestedMinimumHeight()
  {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }

  protected int getSuggestedMinimumWidth()
  {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }

  public final void i(View paramView, int paramInt)
  {
    this.pF.Ms = paramInt;
    this.py = paramView;
    int i = getChildCount();
    for (paramInt = 0; paramInt < i; paramInt++)
      getChildAt(paramInt).getLayoutParams();
  }

  public final void j(View paramView, int paramInt)
  {
    this.pF.Ms = 0;
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      CoordinatorLayout.d locald = (CoordinatorLayout.d)localView.getLayoutParams();
      if (locald.Y(paramInt))
      {
        CoordinatorLayout.Behavior localBehavior = locald.pH;
        if (localBehavior != null)
          localBehavior.a(this, localView, paramView, paramInt);
        locald.i(paramInt, false);
        locald.pU = false;
      }
    }
    this.py = null;
  }

  public final void m(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() == 8)
        break label95;
      Object localObject = (CoordinatorLayout.d)localView.getLayoutParams();
      if (!((CoordinatorLayout.d)localObject).Y(paramInt2))
        break label95;
      localObject = ((CoordinatorLayout.d)localObject).pH;
      if (localObject == null)
        break label95;
      ((CoordinatorLayout.Behavior)localObject).b(this, localView, paramInt1);
      k = 1;
    }
    label95: 
    while (true)
    {
      j++;
      break;
      if (k != 0)
        X(1);
      return;
    }
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    q(false);
    if (this.pA)
    {
      if (this.pz == null)
        this.pz = new CoordinatorLayout.e(this);
      getViewTreeObserver().addOnPreDrawListener(this.pz);
    }
    if ((this.mp == null) && (s.al(this)))
      s.ak(this);
    this.pv = true;
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    q(false);
    if ((this.pA) && (this.pz != null))
      getViewTreeObserver().removeOnPreDrawListener(this.pz);
    if (this.py != null)
      onStopNestedScroll(this.py);
    this.pv = false;
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.pB) && (this.pC != null))
      if (this.mp == null)
        break label61;
    label61: for (int i = this.mp.getSystemWindowInsetTop(); ; i = 0)
    {
      if (i > 0)
      {
        this.pC.setBounds(0, 0, getWidth(), i);
        this.pC.draw(paramCanvas);
      }
      return;
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      q(true);
    boolean bool = a(paramMotionEvent, 0);
    if ((i == 1) || (i == 3))
      q(true);
    return bool;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = s.T(this);
    paramInt3 = this.pp.size();
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++)
    {
      View localView = (View)this.pp.get(paramInt1);
      if (localView.getVisibility() != 8)
      {
        CoordinatorLayout.Behavior localBehavior = ((CoordinatorLayout.d)localView.getLayoutParams()).pH;
        if ((localBehavior == null) || (!localBehavior.a(this, localView, paramInt2)))
          e(localView, paramInt2);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    bZ();
    int i = getChildCount();
    int j = 0;
    Object localObject1;
    Object localObject2;
    int k;
    int m;
    label45: Object localObject3;
    if (j < i)
    {
      localObject1 = getChildAt(j);
      localObject2 = this.pq;
      k = ((h)localObject2).PR.size();
      m = 0;
      if (m < k)
      {
        localObject3 = (ArrayList)((h)localObject2).PR.valueAt(m);
        if ((localObject3 != null) && (((ArrayList)localObject3).contains(localObject1)))
        {
          m = 1;
          label85: if (m == 0)
            break label599;
        }
      }
    }
    label149: label188: label720: for (int n = 1; ; n = 0)
    {
      int i1;
      int i6;
      int i11;
      label243: int i13;
      int i14;
      int i15;
      int i16;
      if (n != this.pA)
      {
        if (n != 0)
        {
          if (this.pv)
          {
            if (this.pz == null)
              this.pz = new CoordinatorLayout.e(this);
            getViewTreeObserver().addOnPreDrawListener(this.pz);
          }
          this.pA = true;
        }
      }
      else
      {
        i1 = getPaddingLeft();
        int i2 = getPaddingTop();
        int i3 = getPaddingRight();
        int i4 = getPaddingBottom();
        int i5 = s.T(this);
        if (i5 != 1)
          break label638;
        i6 = 1;
        int i7 = View.MeasureSpec.getMode(paramInt1);
        int i8 = View.MeasureSpec.getSize(paramInt1);
        int i9 = View.MeasureSpec.getMode(paramInt2);
        int i10 = View.MeasureSpec.getSize(paramInt2);
        j = getSuggestedMinimumWidth();
        m = getSuggestedMinimumHeight();
        i = 0;
        if ((this.mp == null) || (!s.al(this)))
          break label644;
        i11 = 1;
        int i12 = this.pp.size();
        i13 = 0;
        if (i13 >= i12)
          break label694;
        localObject2 = (View)this.pp.get(i13);
        if (((View)localObject2).getVisibility() == 8)
          break label729;
        localObject3 = (CoordinatorLayout.d)((View)localObject2).getLayoutParams();
        i14 = 0;
        k = i14;
        if (((CoordinatorLayout.d)localObject3).pJ >= 0)
        {
          k = i14;
          if (i7 != 0)
          {
            i15 = U(((CoordinatorLayout.d)localObject3).pJ);
            i16 = d.getAbsoluteGravity(W(((CoordinatorLayout.d)localObject3).gravity), i5) & 0x7;
            if (((i16 != 3) || (i6 != 0)) && ((i16 != 5) || (i6 == 0)))
              break label650;
            k = Math.max(0, i8 - i3 - i15);
          }
        }
        if ((i11 == 0) || (s.al((View)localObject2)))
          break label720;
        i15 = this.mp.getSystemWindowInsetLeft();
        int i17 = this.mp.getSystemWindowInsetRight();
        i16 = this.mp.getSystemWindowInsetTop();
        i14 = this.mp.getSystemWindowInsetBottom();
        i15 = View.MeasureSpec.makeMeasureSpec(i8 - (i15 + i17), i7);
        i14 = View.MeasureSpec.makeMeasureSpec(i10 - (i16 + i14), i9);
        label468: localObject1 = ((CoordinatorLayout.d)localObject3).pH;
        if ((localObject1 == null) || (!((CoordinatorLayout.Behavior)localObject1).a(this, (View)localObject2, i15, k, i14, 0)))
          a((View)localObject2, i15, k, i14, 0);
        j = Math.max(j, ((View)localObject2).getMeasuredWidth() + (i1 + i3) + ((CoordinatorLayout.d)localObject3).leftMargin + ((CoordinatorLayout.d)localObject3).rightMargin);
        m = Math.max(m, ((View)localObject2).getMeasuredHeight() + (i2 + i4) + ((CoordinatorLayout.d)localObject3).topMargin + ((CoordinatorLayout.d)localObject3).bottomMargin);
        i = View.combineMeasuredStates(i, ((View)localObject2).getMeasuredState());
      }
      label599: label729: 
      while (true)
      {
        i13++;
        break label257;
        m++;
        break label45;
        m = 0;
        break label85;
        j++;
        break;
        if ((this.pv) && (this.pz != null))
          getViewTreeObserver().removeOnPreDrawListener(this.pz);
        this.pA = false;
        break label149;
        label638: i6 = 0;
        break label188;
        i11 = 0;
        break label243;
        if ((i16 != 5) || (i6 != 0))
        {
          k = i14;
          if (i16 != 3)
            break label389;
          k = i14;
          if (i6 == 0)
            break label389;
        }
        k = Math.max(0, i15 - i1);
        break label389;
        setMeasuredDimension(View.resolveSizeAndState(j, paramInt1, 0xFF000000 & i), View.resolveSizeAndState(m, paramInt2, i << 16));
        return;
        i14 = paramInt2;
        i15 = paramInt1;
        break label468;
      }
    }
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      paramView = getChildAt(j);
      if (paramView.getVisibility() != 8)
        paramView.getLayoutParams();
    }
    return false;
  }

  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i = getChildCount();
    int j = 0;
    boolean bool = false;
    if (j < i)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() == 8)
        break label93;
      Object localObject = (CoordinatorLayout.d)localView.getLayoutParams();
      if (!((CoordinatorLayout.d)localObject).Y(0))
        break label93;
      localObject = ((CoordinatorLayout.d)localObject).pH;
      if (localObject == null)
        break label93;
      bool = ((CoordinatorLayout.Behavior)localObject).a(this, localView, paramView, paramFloat1, paramFloat2) | bool;
    }
    label93: 
    while (true)
    {
      j++;
      break;
      return bool;
    }
  }

  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    m(paramInt4, 0);
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    i(paramView2, paramInt);
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof CoordinatorLayout.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (CoordinatorLayout.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.LC);
      SparseArray localSparseArray = paramParcelable.pX;
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = getChildAt(j);
        int k = localView.getId();
        paramParcelable = o(localView).pH;
        if ((k != -1) && (paramParcelable != null))
        {
          Parcelable localParcelable = (Parcelable)localSparseArray.get(k);
          if (localParcelable != null)
            paramParcelable.a(this, localView, localParcelable);
        }
      }
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    CoordinatorLayout.SavedState localSavedState = new CoordinatorLayout.SavedState(super.onSaveInstanceState());
    SparseArray localSparseArray = new SparseArray();
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      int k = localView.getId();
      Object localObject = ((CoordinatorLayout.d)localView.getLayoutParams()).pH;
      if ((k != -1) && (localObject != null))
      {
        localObject = ((CoordinatorLayout.Behavior)localObject).b(this, localView);
        if (localObject != null)
          localSparseArray.append(k, localObject);
      }
    }
    localSavedState.pX = localSparseArray;
    return localSavedState;
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return e(paramView1, paramInt, 0);
  }

  public void onStopNestedScroll(View paramView)
  {
    j(paramView, 0);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    boolean bool1;
    if (this.px == null)
    {
      bool1 = a(paramMotionEvent, 1);
      if (!bool1);
    }
    while (true)
    {
      CoordinatorLayout.Behavior localBehavior = ((CoordinatorLayout.d)this.px.getLayoutParams()).pH;
      boolean bool2;
      if (localBehavior != null)
        bool2 = localBehavior.b(this, this.px, paramMotionEvent);
      while (true)
      {
        if (this.px == null)
        {
          bool2 |= super.onTouchEvent(paramMotionEvent);
          paramMotionEvent = null;
        }
        while (true)
        {
          if (paramMotionEvent != null)
            paramMotionEvent.recycle();
          if ((i == 1) || (i == 3))
            q(false);
          return bool2;
          if (bool1)
          {
            long l = SystemClock.uptimeMillis();
            paramMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            super.onTouchEvent(paramMotionEvent);
          }
          else
          {
            paramMotionEvent = null;
          }
        }
        bool2 = false;
        continue;
        bool2 = false;
      }
      bool1 = false;
    }
  }

  public final List<View> p(View paramView)
  {
    paramView = this.pq.K(paramView);
    this.ps.clear();
    if (paramView != null)
      this.ps.addAll(paramView);
    return this.ps;
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    CoordinatorLayout.Behavior localBehavior = ((CoordinatorLayout.d)paramView.getLayoutParams()).pH;
    if ((localBehavior != null) && (localBehavior.a(this, paramView, paramRect, paramBoolean)));
    for (paramBoolean = true; ; paramBoolean = super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean))
      return paramBoolean;
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if ((paramBoolean) && (!this.pu))
    {
      q(false);
      this.pu = true;
    }
  }

  public void setFitsSystemWindows(boolean paramBoolean)
  {
    super.setFitsSystemWindows(paramBoolean);
    ca();
  }

  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    this.pD = paramOnHierarchyChangeListener;
  }

  public void setStatusBarBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = null;
    if (this.pC != paramDrawable)
    {
      if (this.pC != null)
        this.pC.setCallback(null);
      if (paramDrawable != null)
        localDrawable = paramDrawable.mutate();
      this.pC = localDrawable;
      if (this.pC != null)
      {
        if (this.pC.isStateful())
          this.pC.setState(getDrawableState());
        a.b(this.pC, s.T(this));
        paramDrawable = this.pC;
        if (getVisibility() != 0)
          break label114;
      }
    }
    label114: for (boolean bool = true; ; bool = false)
    {
      paramDrawable.setVisible(bool, false);
      this.pC.setCallback(this);
      s.R(this);
      return;
    }
  }

  public void setStatusBarBackgroundColor(int paramInt)
  {
    setStatusBarBackground(new ColorDrawable(paramInt));
  }

  public void setStatusBarBackgroundResource(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = b.g(getContext(), paramInt); ; localDrawable = null)
    {
      setStatusBarBackground(localDrawable);
      return;
    }
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      if ((this.pC != null) && (this.pC.isVisible() != bool))
        this.pC.setVisible(bool, false);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.pC));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CoordinatorLayout
 * JD-Core Version:    0.6.2
 */