package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.f.l;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.a.a;
import android.support.v4.view.h;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v4.view.s;
import android.support.v4.view.t;
import android.support.v4.widget.i;
import android.support.v7.f.a.a;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup
  implements j
{
  private static final int[] amS = { 16843830 };
  private static final int[] amT = { 16842987 };
  static final boolean amU;
  static final boolean amV;
  static final boolean amW;
  private static final boolean amX;
  private static final boolean amY;
  private static final boolean amZ;
  private static final Class<?>[] ana;
  static final Interpolator aom;
  private final int[] Rd;
  private final int[] Re;
  a Yq;
  boolean anA = false;
  boolean anB = false;
  private int anC = 0;
  private int anD = 0;
  private RecyclerView.e anE = new RecyclerView.e();
  private EdgeEffect anF;
  private EdgeEffect anG;
  private EdgeEffect anH;
  private EdgeEffect anI;
  RecyclerView.f anJ = new y();
  private int anK = -1;
  private int anL;
  private int anM;
  private int anN;
  private int anO;
  private RecyclerView.k anP;
  private final int anQ;
  private final int anR;
  private float anS = 1.4E-45F;
  private float anT = 1.4E-45F;
  private boolean anU = true;
  final RecyclerView.u anV = new RecyclerView.u(this);
  af anW;
  af.a anX;
  final RecyclerView.s anY;
  private RecyclerView.m anZ;
  private final RecyclerView.q anb = new RecyclerView.q(this);
  final RecyclerView.o anc = new RecyclerView.o(this);
  private RecyclerView.SavedState and;
  f ane;
  v anf;
  final bj ang = new bj();
  boolean anh;
  final Runnable ani = new RecyclerView.1(this);
  final RectF anj = new RectF();
  RecyclerView.i ank;
  RecyclerView.p anl;
  public final ArrayList<RecyclerView.h> anm = new ArrayList();
  private final ArrayList<RecyclerView.l> ann = new ArrayList();
  private RecyclerView.l ano;
  boolean anp;
  boolean anq;
  boolean anr;
  boolean ans;
  private int ant = 0;
  boolean anu;
  public boolean anv;
  private boolean anw;
  private int anx;
  boolean any;
  public List<j> anz;
  private List<RecyclerView.m> aoa;
  boolean aob;
  boolean aoc;
  private RecyclerView.f.b aod;
  boolean aoe;
  ao aof;
  private d aog;
  private final int[] aoh;
  private k aoi;
  private final int[] aoj;
  final List<RecyclerView.v> aok;
  private Runnable aol;
  private final bj.b aon;
  private final AccessibilityManager mP;
  private int mScrollState = 0;
  final Rect mTempRect = new Rect();
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  private final Rect qT = new Rect();

  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20))
    {
      bool = true;
      amU = bool;
      if (Build.VERSION.SDK_INT < 23)
        break label167;
      bool = true;
      label62: amV = bool;
      if (Build.VERSION.SDK_INT < 16)
        break label172;
      bool = true;
      label76: amW = bool;
      if (Build.VERSION.SDK_INT < 21)
        break label177;
      bool = true;
      label90: amX = bool;
      if (Build.VERSION.SDK_INT > 15)
        break label182;
      bool = true;
      label104: amY = bool;
      if (Build.VERSION.SDK_INT > 15)
        break label187;
    }
    label167: label172: label177: label182: label187: for (boolean bool = true; ; bool = false)
    {
      amZ = bool;
      ana = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      aom = new RecyclerView.3();
      return;
      bool = false;
      break;
      bool = false;
      break label62;
      bool = false;
      break label76;
      bool = false;
      break label90;
      bool = false;
      break label104;
    }
  }

  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1;
    if (amX)
    {
      localObject1 = new af.a();
      this.anX = ((af.a)localObject1);
      this.anY = new RecyclerView.s();
      this.aob = false;
      this.aoc = false;
      this.aod = new RecyclerView.g(this);
      this.aoe = false;
      this.aoh = new int[2];
      this.Rd = new int[2];
      this.Re = new int[2];
      this.aoj = new int[2];
      this.aok = new ArrayList();
      this.aol = new RecyclerView.2(this);
      this.aon = new RecyclerView.4(this);
      if (paramAttributeSet == null)
        break label678;
      localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, amT, paramInt, 0);
      this.anh = ((TypedArray)localObject1).getBoolean(0, true);
      ((TypedArray)localObject1).recycle();
      label351: setScrollContainer(true);
      setFocusableInTouchMode(true);
      localObject1 = ViewConfiguration.get(paramContext);
      this.mTouchSlop = ((ViewConfiguration)localObject1).getScaledTouchSlop();
      this.anS = t.a((ViewConfiguration)localObject1, paramContext);
      this.anT = t.b((ViewConfiguration)localObject1, paramContext);
      this.anQ = ((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity();
      this.anR = ((ViewConfiguration)localObject1).getScaledMaximumFlingVelocity();
      if (getOverScrollMode() != 2)
        break label686;
    }
    Object localObject2;
    String str;
    Object localObject4;
    Drawable localDrawable;
    StateListDrawable localStateListDrawable;
    label678: label686: for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      this.anJ.aor = this.aod;
      this.ane = new f(new RecyclerView.6(this));
      this.anf = new v(new RecyclerView.5(this));
      if (s.S(this) == 0)
        s.o(this, 1);
      this.mP = ((AccessibilityManager)getContext().getSystemService("accessibility"));
      setAccessibilityDelegateCompat(new ao(this));
      if (paramAttributeSet == null)
        break label1267;
      localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.RecyclerView, paramInt, 0);
      str = ((TypedArray)localObject2).getString(2);
      if (((TypedArray)localObject2).getInt(1, -1) == -1)
        setDescendantFocusability(262144);
      this.anr = ((TypedArray)localObject2).getBoolean(6, false);
      if (!this.anr)
        break label742;
      localObject4 = (StateListDrawable)((TypedArray)localObject2).getDrawable(7);
      localDrawable = ((TypedArray)localObject2).getDrawable(8);
      localStateListDrawable = (StateListDrawable)((TypedArray)localObject2).getDrawable(9);
      localObject1 = ((TypedArray)localObject2).getDrawable(10);
      if ((localObject4 != null) && (localDrawable != null) && (localStateListDrawable != null) && (localObject1 != null))
        break label692;
      throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + ji());
      localObject1 = null;
      break;
      this.anh = true;
      break label351;
    }
    label692: Object localObject5 = getContext().getResources();
    new ac(this, (StateListDrawable)localObject4, localDrawable, localStateListDrawable, (Drawable)localObject1, ((Resources)localObject5).getDimensionPixelSize(2131428400), ((Resources)localObject5).getDimensionPixelSize(2131428402), ((Resources)localObject5).getDimensionPixelOffset(2131428401));
    label742: ((TypedArray)localObject2).recycle();
    if (str != null)
    {
      localObject1 = str.trim();
      if (!((String)localObject1).isEmpty())
      {
        if (((String)localObject1).charAt(0) != '.')
          break label932;
        localObject1 = paramContext.getPackageName() + (String)localObject1;
      }
    }
    while (true)
    {
      try
      {
        if (isInEditMode())
        {
          localObject5 = getClass().getClassLoader();
          localObject4 = ((ClassLoader)localObject5).loadClass((String)localObject1).asSubclass(RecyclerView.i.class);
        }
        try
        {
          localObject5 = ((Class)localObject4).getConstructor(ana);
          localObject2 = new Object[4];
          localObject2[0] = paramContext;
          localObject2[1] = paramAttributeSet;
          localObject2[2] = Integer.valueOf(paramInt);
          localObject2[3] = Integer.valueOf(0);
          ((Constructor)localObject5).setAccessible(true);
          setLayoutManager((RecyclerView.i)((Constructor)localObject5).newInstance((Object[])localObject2));
          if (Build.VERSION.SDK_INT < 21)
            break label1274;
          paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, amS, paramInt, 0);
          bool = paramContext.getBoolean(0, true);
          paramContext.recycle();
          setNestedScrollingEnabled(bool);
          return;
          label932: if (((String)localObject1).contains("."))
            continue;
          localObject1 = RecyclerView.class.getPackage().getName() + '.' + (String)localObject1;
          continue;
          localObject5 = paramContext.getClassLoader();
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          try
          {
            localObject5 = ((Class)localObject4).getConstructor(new Class[0]);
            localObject3 = null;
          }
          catch (NoSuchMethodException paramContext)
          {
            paramContext.initCause((Throwable)localObject3);
            localObject5 = new java/lang/IllegalStateException;
            Object localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((IllegalStateException)localObject5).<init>(paramAttributeSet.getPositionDescription() + ": Error creating LayoutManager " + (String)localObject1, paramContext);
            throw ((Throwable)localObject5);
          }
        }
      }
      catch (ClassNotFoundException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Unable to find LayoutManager " + (String)localObject1, paramContext);
      }
      catch (InvocationTargetException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + (String)localObject1, paramContext);
      }
      catch (InstantiationException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + (String)localObject1, paramContext);
      }
      catch (IllegalAccessException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Cannot access non-public constructor " + (String)localObject1, paramContext);
      }
      catch (ClassCastException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Class is not a LayoutManager " + (String)localObject1, paramContext);
      }
      label1267: setDescendantFocusability(262144);
      label1274: bool = true;
    }
  }

  private void a(long paramLong, RecyclerView.v paramv1, RecyclerView.v paramv2)
  {
    int i = this.anf.getChildCount();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.v localv = bn(this.anf.getChildAt(j));
      if ((localv != paramv1) && (g(localv) == paramLong))
      {
        if ((this.Yq != null) && (this.Yq.aoq))
          throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + localv + " \n View Holder 2:" + paramv1 + ji());
        throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + localv + " \n View Holder 2:" + paramv1 + ji());
      }
    }
    new StringBuilder("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ").append(paramv2).append(" cannot be found but it is necessary for ").append(paramv1).append(ji());
  }

  private void a(RecyclerView.v paramv1, RecyclerView.v paramv2, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramv1.ao(false);
    if (paramBoolean1)
      f(paramv1);
    if (paramv1 != paramv2)
    {
      if (paramBoolean2)
        f(paramv2);
      paramv1.apP = paramv2;
      f(paramv1);
      this.anc.t(paramv1);
      paramv2.ao(false);
      paramv2.apQ = paramv1;
    }
    if (this.anJ.a(paramv1, paramv2, paramc1, paramc2))
      jA();
  }

  private boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    jk();
    int i;
    int j;
    int k;
    int m;
    if (this.Yq != null)
    {
      jl();
      jw();
      android.support.v4.os.f.beginSection("RV Scroll");
      m(this.anY);
      if (paramInt1 != 0)
      {
        i = this.ank.a(paramInt1, this.anc, this.anY);
        j = paramInt1 - i;
        if (paramInt2 != 0)
        {
          k = this.ank.b(paramInt2, this.anc, this.anY);
          m = paramInt2 - k;
          label92: android.support.v4.os.f.endSection();
          jP();
          al(true);
          ak(false);
          int n = k;
          k = m;
          m = j;
          j = n;
        }
      }
    }
    while (true)
    {
      if (!this.anm.isEmpty())
        invalidate();
      if (a(i, j, m, k, this.Rd, 0))
      {
        this.anN -= this.Rd[0];
        this.anO -= this.Rd[1];
        if (paramMotionEvent != null)
          paramMotionEvent.offsetLocation(this.Rd[0], this.Rd[1]);
        paramMotionEvent = this.aoj;
        paramMotionEvent[0] += this.Rd[0];
        paramMotionEvent = this.aoj;
        paramMotionEvent[1] += this.Rd[1];
      }
      while (true)
      {
        if ((i != 0) || (j != 0))
          aq(i, j);
        if (!awakenScrollBars())
          invalidate();
        if ((i != 0) || (j != 0))
          bool = true;
        return bool;
        if (getOverScrollMode() != 2)
        {
          if ((paramMotionEvent != null) && (!h.d(paramMotionEvent)))
            e(paramMotionEvent.getX(), m, paramMotionEvent.getY(), k);
          al(paramInt1, paramInt2);
        }
      }
      k = 0;
      m = 0;
      break label92;
      i = 0;
      j = 0;
      break;
      j = 0;
      i = 0;
      k = 0;
      m = 0;
    }
  }

  private boolean ao(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    j(this.aoh);
    if ((this.aoh[0] != paramInt1) || (this.aoh[1] != paramInt2))
      bool = true;
    return bool;
  }

  static RecyclerView.v bn(View paramView)
  {
    if (paramView == null);
    for (paramView = null; ; paramView = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).aoM)
      return paramView;
  }

  public static int bo(View paramView)
  {
    paramView = bn(paramView);
    if (paramView != null);
    for (int i = paramView.kj(); ; i = -1)
      return i;
  }

  public static int bp(View paramView)
  {
    paramView = bn(paramView);
    if (paramView != null);
    for (int i = paramView.ki(); ; i = -1)
      return i;
  }

  static RecyclerView br(View paramView)
  {
    if (!(paramView instanceof ViewGroup))
      paramView = null;
    while (true)
    {
      return paramView;
      if ((paramView instanceof RecyclerView))
      {
        paramView = (RecyclerView)paramView;
      }
      else
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i = localViewGroup.getChildCount();
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label65;
          paramView = br(localViewGroup.getChildAt(j));
          if (paramView != null)
            break;
        }
        label65: paramView = null;
      }
    }
  }

  public static void d(View paramView, Rect paramRect)
  {
    e(paramView, paramRect);
  }

  private void d(View paramView1, View paramView2)
  {
    boolean bool1 = true;
    Object localObject1;
    Object localObject2;
    boolean bool2;
    if (paramView2 != null)
    {
      localObject1 = paramView2;
      this.mTempRect.set(0, 0, ((View)localObject1).getWidth(), ((View)localObject1).getHeight());
      localObject1 = ((View)localObject1).getLayoutParams();
      if ((localObject1 instanceof RecyclerView.LayoutParams))
      {
        localObject1 = (RecyclerView.LayoutParams)localObject1;
        if (!((RecyclerView.LayoutParams)localObject1).aoN)
        {
          localObject1 = ((RecyclerView.LayoutParams)localObject1).ala;
          localObject2 = this.mTempRect;
          ((Rect)localObject2).left -= ((Rect)localObject1).left;
          localObject2 = this.mTempRect;
          ((Rect)localObject2).right += ((Rect)localObject1).right;
          localObject2 = this.mTempRect;
          ((Rect)localObject2).top -= ((Rect)localObject1).top;
          localObject2 = this.mTempRect;
          int i = ((Rect)localObject2).bottom;
          ((Rect)localObject1).bottom += i;
        }
      }
      if (paramView2 != null)
      {
        offsetDescendantRectToMyCoords(paramView2, this.mTempRect);
        offsetRectIntoDescendantCoords(paramView1, this.mTempRect);
      }
      localObject2 = this.ank;
      localObject1 = this.mTempRect;
      if (this.ans)
        break label225;
      bool2 = true;
      label201: if (paramView2 != null)
        break label231;
    }
    while (true)
    {
      ((RecyclerView.i)localObject2).a(this, paramView1, (Rect)localObject1, bool2, bool1);
      return;
      localObject1 = paramView1;
      break;
      label225: bool2 = false;
      break label201;
      label231: bool1 = false;
    }
  }

  private void e(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = 1;
    int j = 0;
    if (paramFloat2 < 0.0F)
    {
      jp();
      i.a(this.anF, -paramFloat2 / getWidth(), 1.0F - paramFloat3 / getHeight());
      j = 1;
      if (paramFloat4 >= 0.0F)
        break label141;
      jr();
      i.a(this.anG, -paramFloat4 / getHeight(), paramFloat1 / getWidth());
      j = i;
    }
    while (true)
    {
      if ((j != 0) || (paramFloat2 != 0.0F) || (paramFloat4 != 0.0F))
        s.R(this);
      return;
      if (paramFloat2 <= 0.0F)
        break;
      jq();
      i.a(this.anH, paramFloat2 / getWidth(), paramFloat3 / getHeight());
      j = 1;
      break;
      label141: if (paramFloat4 > 0.0F)
      {
        js();
        i.a(this.anI, paramFloat4 / getHeight(), 1.0F - paramFloat1 / getWidth());
        j = i;
      }
    }
  }

  static void e(View paramView, Rect paramRect)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = localLayoutParams.ala;
    int i = paramView.getLeft();
    int j = localRect.left;
    int k = localLayoutParams.leftMargin;
    int m = paramView.getTop();
    int n = localRect.top;
    int i1 = localLayoutParams.topMargin;
    int i2 = paramView.getRight();
    int i3 = localRect.right;
    int i4 = localLayoutParams.rightMargin;
    int i5 = paramView.getBottom();
    int i6 = localRect.bottom;
    paramRect.set(i - j - k, m - n - i1, i2 + i3 + i4, localLayoutParams.bottomMargin + (i6 + i5));
  }

  private long g(RecyclerView.v paramv)
  {
    if (this.Yq.aoq);
    for (long l = paramv.apM; ; l = paramv.mPosition)
      return l;
  }

  static void h(RecyclerView.v paramv)
  {
    Object localObject;
    if (paramv.apK != null)
    {
      localObject = (View)paramv.apK.get();
      if (localObject == null)
        break label56;
      if (localObject != paramv.apJ)
        break label31;
    }
    while (true)
    {
      return;
      label31: localObject = ((View)localObject).getParent();
      if ((localObject instanceof View))
      {
        localObject = (View)localObject;
        break;
      }
      localObject = null;
      break;
      label56: paramv.apK = null;
    }
  }

  private void j(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.anK)
      if (i != 0)
        break label75;
    label75: for (i = 1; ; i = 0)
    {
      this.anK = paramMotionEvent.getPointerId(i);
      int j = (int)(paramMotionEvent.getX(i) + 0.5F);
      this.anN = j;
      this.anL = j;
      i = (int)(paramMotionEvent.getY(i) + 0.5F);
      this.anO = i;
      this.anM = i;
      return;
    }
  }

  private void j(int[] paramArrayOfInt)
  {
    int i = this.anf.getChildCount();
    if (i == 0)
    {
      paramArrayOfInt[0] = -1;
      paramArrayOfInt[1] = -1;
      return;
    }
    int j = 2147483647;
    int k = -2147483648;
    int m = 0;
    label33: int n;
    int i2;
    if (m < i)
    {
      RecyclerView.v localv = bn(this.anf.getChildAt(m));
      n = j;
      if (localv.kh())
        break label124;
      int i1 = localv.ki();
      i2 = j;
      if (i1 < j)
        i2 = i1;
      n = i2;
      if (i1 <= k)
        break label124;
      j = i2;
      i2 = i1;
    }
    while (true)
    {
      m++;
      k = i2;
      break label33;
      paramArrayOfInt[0] = j;
      paramArrayOfInt[1] = k;
      break;
      label124: i2 = k;
      j = n;
    }
  }

  private boolean jB()
  {
    if ((this.anJ != null) && (this.ank.iE()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void jC()
  {
    boolean bool1 = true;
    if (this.anA)
    {
      this.ane.reset();
      if (this.anB)
        this.ank.a(this);
    }
    int i;
    label61: RecyclerView.s locals;
    if (jB())
    {
      this.ane.hu();
      if ((!this.aob) && (!this.aoc))
        break label180;
      i = 1;
      locals = this.anY;
      if ((!this.ans) || (this.anJ == null) || ((!this.anA) && (i == 0) && (!this.ank.aoD)) || ((this.anA) && (!this.Yq.aoq)))
        break label185;
      bool2 = true;
      label121: locals.apy = bool2;
      locals = this.anY;
      if ((!this.anY.apy) || (i == 0) || (this.anA) || (!jB()))
        break label191;
    }
    label180: label185: label191: for (boolean bool2 = bool1; ; bool2 = false)
    {
      locals.apz = bool2;
      return;
      this.ane.hx();
      break;
      i = 0;
      break label61;
      bool2 = false;
      break label121;
    }
  }

  private void jD()
  {
    if (this.Yq == null)
      return;
    if (this.ank != null)
    {
      this.anY.apx = false;
      if (this.anY.aps != 1)
        break label57;
      jH();
      this.ank.g(this);
      jI();
    }
    while (true)
    {
      jJ();
      break;
      break;
      label57: if ((this.ane.hy()) || (this.ank.mWidth != getWidth()) || (this.ank.mHeight != getHeight()))
      {
        this.ank.g(this);
        jI();
      }
      else
      {
        this.ank.g(this);
      }
    }
  }

  private void jE()
  {
    if ((this.anU) && (hasFocus()) && (this.Yq != null));
    for (Object localObject1 = getFocusedChild(); ; localObject1 = null)
    {
      if (localObject1 == null)
      {
        localObject1 = null;
        if (localObject1 != null)
          break label50;
        jF();
      }
      while (true)
      {
        return;
        localObject1 = bm((View)localObject1);
        break;
        label50: Object localObject2 = this.anY;
        long l;
        int i;
        if (this.Yq.aoq)
        {
          l = ((RecyclerView.v)localObject1).apM;
          ((RecyclerView.s)localObject2).apB = l;
          localObject2 = this.anY;
          if (!this.anA)
            break label170;
          i = -1;
        }
        RecyclerView.s locals;
        while (true)
        {
          ((RecyclerView.s)localObject2).apA = i;
          locals = this.anY;
          localObject1 = ((RecyclerView.v)localObject1).apJ;
          i = ((View)localObject1).getId();
          while ((!((View)localObject1).isFocused()) && ((localObject1 instanceof ViewGroup)) && (((View)localObject1).hasFocus()))
          {
            localObject2 = ((ViewGroup)localObject1).getFocusedChild();
            localObject1 = localObject2;
            if (((View)localObject2).getId() != -1)
            {
              i = ((View)localObject2).getId();
              localObject1 = localObject2;
            }
          }
          l = -1L;
          break;
          label170: if (((RecyclerView.v)localObject1).isRemoved())
            i = ((RecyclerView.v)localObject1).apL;
          else
            i = ((RecyclerView.v)localObject1).kj();
        }
        locals.apC = i;
      }
    }
  }

  private void jF()
  {
    this.anY.apB = -1L;
    this.anY.apA = -1;
    this.anY.apC = -1;
  }

  private void jG()
  {
    Object localObject1 = null;
    if ((!this.anU) || (this.Yq == null) || (!hasFocus()) || (getDescendantFocusability() == 393216) || ((getDescendantFocusability() == 131072) && (isFocused())));
    Object localObject2;
    do
      while (true)
      {
        return;
        if (isFocused())
          break label112;
        localObject2 = getFocusedChild();
        if ((!amZ) || ((((View)localObject2).getParent() != null) && (((View)localObject2).hasFocus())))
          break;
        if (this.anf.getChildCount() != 0)
          break label112;
        requestFocus();
      }
    while (!this.anf.aY((View)localObject2));
    label112: long l;
    if ((this.anY.apB != -1L) && (this.Yq.aoq))
    {
      l = this.anY.apB;
      if ((this.Yq == null) || (!this.Yq.aoq))
        localObject2 = null;
    }
    while (true)
    {
      label163: int i;
      label221: int j;
      int k;
      label234: Object localObject3;
      if ((localObject2 == null) || (this.anf.aY(((RecyclerView.v)localObject2).apJ)) || (!((RecyclerView.v)localObject2).apJ.hasFocusable()))
      {
        if (this.anf.getChildCount() <= 0)
          break label493;
        if (this.anY.apA != -1)
        {
          i = this.anY.apA;
          j = this.anY.getItemCount();
          k = i;
          if (k >= j)
            break label423;
          localObject2 = cf(k);
          if (localObject2 == null)
            break label423;
          if (!((RecyclerView.v)localObject2).apJ.hasFocusable())
            break label417;
          localObject2 = ((RecyclerView.v)localObject2).apJ;
          label267: if (localObject2 == null)
            break label496;
          if (this.anY.apC == -1L)
            break label490;
          localObject3 = ((View)localObject2).findViewById(this.anY.apC);
          if ((localObject3 == null) || (!((View)localObject3).isFocusable()))
            break label490;
          localObject2 = localObject3;
          label315: ((View)localObject2).requestFocus();
          break;
          k = this.anf.hU();
          i = 0;
          localObject2 = null;
          label337: if (i < k)
          {
            localObject3 = bn(this.anf.bI(i));
            if ((localObject3 == null) || (((RecyclerView.v)localObject3).isRemoved()) || (((RecyclerView.v)localObject3).apM != l))
              break label498;
            localObject2 = localObject3;
            if (!this.anf.aY(((RecyclerView.v)localObject3).apJ))
              continue;
            localObject2 = localObject3;
          }
        }
      }
      label417: label423: label490: label493: label496: label498: 
      while (true)
      {
        i++;
        break label337;
        break label163;
        i = 0;
        break label221;
        k++;
        break label234;
        for (i = Math.min(j, i) - 1; ; i--)
        {
          localObject2 = localObject1;
          if (i < 0)
            break;
          localObject3 = cf(i);
          localObject2 = localObject1;
          if (localObject3 == null)
            break;
          if (((RecyclerView.v)localObject3).apJ.hasFocusable())
          {
            localObject2 = ((RecyclerView.v)localObject3).apJ;
            break;
          }
        }
        localObject2 = ((RecyclerView.v)localObject2).apJ;
        break label267;
        break label315;
        localObject2 = null;
        break label267;
        break;
      }
      localObject2 = null;
    }
  }

  private void jH()
  {
    this.anY.cw(1);
    m(this.anY);
    this.anY.apx = false;
    jl();
    this.ang.clear();
    jw();
    jC();
    jE();
    Object localObject1 = this.anY;
    if ((this.anY.apy) && (this.aoc));
    int i;
    int j;
    Object localObject2;
    for (boolean bool = true; ; bool = false)
    {
      ((RecyclerView.s)localObject1).apw = bool;
      this.aoc = false;
      this.aob = false;
      this.anY.apv = this.anY.apz;
      this.anY.apt = this.Yq.getItemCount();
      j(this.aoh);
      if (!this.anY.apy)
        break;
      i = this.anf.getChildCount();
      for (j = 0; j < i; j++)
      {
        localObject2 = bn(this.anf.getChildAt(j));
        if ((!((RecyclerView.v)localObject2).kh()) && ((!((RecyclerView.v)localObject2).kq()) || (this.Yq.aoq)))
        {
          localObject1 = this.anJ.a(this.anY, (RecyclerView.v)localObject2, RecyclerView.f.l((RecyclerView.v)localObject2), ((RecyclerView.v)localObject2).kv());
          this.ang.b((RecyclerView.v)localObject2, (RecyclerView.f.c)localObject1);
          if ((this.anY.apw) && (((RecyclerView.v)localObject2).kx()) && (!((RecyclerView.v)localObject2).isRemoved()) && (!((RecyclerView.v)localObject2).kh()) && (!((RecyclerView.v)localObject2).kq()))
          {
            long l = g((RecyclerView.v)localObject2);
            this.ang.a(l, (RecyclerView.v)localObject2);
          }
        }
      }
    }
    if (this.anY.apz)
    {
      jL();
      bool = this.anY.apu;
      this.anY.apu = false;
      this.ank.c(this.anc, this.anY);
      this.anY.apu = bool;
      j = 0;
      if (j < this.anf.getChildCount())
      {
        localObject1 = bn(this.anf.getChildAt(j));
        if ((!((RecyclerView.v)localObject1).kh()) && (!this.ang.I((RecyclerView.v)localObject1)))
        {
          int k = RecyclerView.f.l((RecyclerView.v)localObject1);
          bool = ((RecyclerView.v)localObject1).cx(8192);
          i = k;
          if (!bool)
            i = k | 0x1000;
          localObject2 = this.anJ.a(this.anY, (RecyclerView.v)localObject1, i, ((RecyclerView.v)localObject1).kv());
          if (!bool)
            break label458;
          a((RecyclerView.v)localObject1, (RecyclerView.f.c)localObject2);
        }
        while (true)
        {
          j++;
          break;
          label458: this.ang.c((RecyclerView.v)localObject1, (RecyclerView.f.c)localObject2);
        }
      }
      jM();
    }
    while (true)
    {
      al(true);
      ak(false);
      this.anY.aps = 2;
      return;
      jM();
    }
  }

  private void jI()
  {
    jl();
    jw();
    this.anY.cw(6);
    this.ane.hx();
    this.anY.apt = this.Yq.getItemCount();
    this.anY.apr = 0;
    this.anY.apv = false;
    this.ank.c(this.anc, this.anY);
    this.anY.apu = false;
    this.and = null;
    RecyclerView.s locals = this.anY;
    if ((this.anY.apy) && (this.anJ != null));
    for (boolean bool = true; ; bool = false)
    {
      locals.apy = bool;
      this.anY.aps = 4;
      al(true);
      ak(false);
      return;
    }
  }

  private void jJ()
  {
    this.anY.cw(4);
    jl();
    jw();
    this.anY.aps = 1;
    if (this.anY.apy)
    {
      int i = this.anf.getChildCount() - 1;
      if (i >= 0)
      {
        RecyclerView.v localv1 = bn(this.anf.getChildAt(i));
        RecyclerView.f.c localc1;
        RecyclerView.v localv2;
        boolean bool1;
        boolean bool2;
        RecyclerView.f.c localc2;
        if (!localv1.kh())
        {
          long l = g(localv1);
          localc1 = new RecyclerView.f.c().c(localv1, 0);
          localv2 = this.ang.o(l);
          if ((localv2 == null) || (localv2.kh()))
            break label213;
          bool1 = this.ang.H(localv2);
          bool2 = this.ang.H(localv1);
          if ((bool1) && (localv2 == localv1))
            break label213;
          localc2 = this.ang.d(localv2, 4);
          this.ang.d(localv1, localc1);
          localc1 = this.ang.d(localv1, 8);
          if (localc2 != null)
            break label195;
          a(l, localv1, localv2);
        }
        while (true)
        {
          i--;
          break;
          label195: a(localv2, localv1, localc2, localc1, bool1, bool2);
          continue;
          label213: this.ang.d(localv1, localc1);
        }
      }
      this.ang.a(this.aon);
    }
    this.ank.c(this.anc);
    this.anY.apq = this.anY.apt;
    this.anA = false;
    this.anB = false;
    this.anY.apy = false;
    this.anY.apz = false;
    this.ank.aoD = false;
    if (this.anc.aoW != null)
      this.anc.aoW.clear();
    if (this.ank.aoI)
    {
      this.ank.aoH = 0;
      this.ank.aoI = false;
      this.anc.kb();
    }
    this.ank.a(this.anY);
    al(true);
    ak(false);
    this.ang.clear();
    if (ao(this.aoh[0], this.aoh[1]))
      aq(0, 0);
    jG();
    jF();
  }

  private void jK()
  {
    int i = this.anf.hU();
    for (int j = 0; j < i; j++)
      ((RecyclerView.LayoutParams)this.anf.bI(j).getLayoutParams()).aoN = true;
    this.anc.jK();
  }

  private void jL()
  {
    int i = this.anf.hU();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.v localv = bn(this.anf.bI(j));
      if (!localv.kh())
        localv.kg();
    }
  }

  private void jM()
  {
    int i = this.anf.hU();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.v localv = bn(this.anf.bI(j));
      if (!localv.kh())
        localv.kf();
    }
    this.anc.jM();
  }

  private void jN()
  {
    int i = this.anf.hU();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.v localv = bn(this.anf.bI(j));
      if ((localv != null) && (!localv.kh()))
        localv.addFlags(6);
    }
    jK();
    this.anc.jN();
  }

  private void jQ()
  {
    for (int i = this.aok.size() - 1; i >= 0; i--)
    {
      RecyclerView.v localv = (RecyclerView.v)this.aok.get(i);
      if ((localv.apJ.getParent() == this) && (!localv.kh()))
      {
        int j = localv.apY;
        if (j != -1)
        {
          s.o(localv.apJ, j);
          localv.apY = -1;
        }
      }
    }
    this.aok.clear();
  }

  private void jn()
  {
    this.anV.stop();
    if (this.ank != null)
      this.ank.jX();
  }

  private void jo()
  {
    boolean bool1 = false;
    if (this.anF != null)
    {
      this.anF.onRelease();
      bool1 = this.anF.isFinished();
    }
    boolean bool2 = bool1;
    if (this.anG != null)
    {
      this.anG.onRelease();
      bool2 = bool1 | this.anG.isFinished();
    }
    bool1 = bool2;
    if (this.anH != null)
    {
      this.anH.onRelease();
      bool1 = bool2 | this.anH.isFinished();
    }
    bool2 = bool1;
    if (this.anI != null)
    {
      this.anI.onRelease();
      bool2 = bool1 | this.anI.isFinished();
    }
    if (bool2)
      s.R(this);
  }

  private void jp()
  {
    if (this.anF != null);
    while (true)
    {
      return;
      this.anF = RecyclerView.e.d(this);
      if (this.anh)
        this.anF.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      else
        this.anF.setSize(getMeasuredHeight(), getMeasuredWidth());
    }
  }

  private void jq()
  {
    if (this.anH != null);
    while (true)
    {
      return;
      this.anH = RecyclerView.e.d(this);
      if (this.anh)
        this.anH.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      else
        this.anH.setSize(getMeasuredHeight(), getMeasuredWidth());
    }
  }

  private void jr()
  {
    if (this.anG != null);
    while (true)
    {
      return;
      this.anG = RecyclerView.e.d(this);
      if (this.anh)
        this.anG.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      else
        this.anG.setSize(getMeasuredWidth(), getMeasuredHeight());
    }
  }

  private void js()
  {
    if (this.anI != null);
    while (true)
    {
      return;
      this.anI = RecyclerView.e.d(this);
      if (this.anh)
        this.anI.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      else
        this.anI.setSize(getMeasuredWidth(), getMeasuredHeight());
    }
  }

  private void jt()
  {
    this.anI = null;
    this.anG = null;
    this.anH = null;
    this.anF = null;
  }

  private void ju()
  {
    if (this.mVelocityTracker != null)
      this.mVelocityTracker.clear();
    aJ(0);
    jo();
  }

  private void jv()
  {
    ju();
    setScrollState(0);
  }

  private void jy()
  {
    int i = this.anx;
    this.anx = 0;
    if ((i != 0) && (jx()))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      localAccessibilityEvent.setEventType(2048);
      a.a(localAccessibilityEvent, i);
      sendAccessibilityEventUnchecked(localAccessibilityEvent);
    }
  }

  private boolean w(int paramInt1, int paramInt2)
  {
    return getScrollingChildHelper().w(paramInt1, paramInt2);
  }

  final void T(String paramString)
  {
    if (jz())
    {
      if (paramString == null)
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + ji());
      throw new IllegalStateException(paramString);
    }
    if (this.anD > 0)
      new IllegalStateException(ji());
  }

  public final void a(int paramInt1, int paramInt2, Interpolator paramInterpolator)
  {
    int i = 0;
    if (this.ank == null);
    label64: label65: 
    while (true)
    {
      return;
      if (!this.anv)
      {
        if (!this.ank.iG())
          paramInt1 = 0;
        if (this.ank.iH())
          break label64;
        paramInt2 = i;
      }
      while (true)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break label65;
        this.anV.a(paramInt1, paramInt2, paramInterpolator);
        break;
        break;
      }
    }
  }

  public final void a(RecyclerView.h paramh)
  {
    if (this.ank != null)
      this.ank.T("Cannot add item decoration during a scroll  or layout");
    if (this.anm.isEmpty())
      setWillNotDraw(false);
    this.anm.add(paramh);
    jK();
    requestLayout();
  }

  public final void a(RecyclerView.l paraml)
  {
    this.ann.add(paraml);
  }

  public final void a(RecyclerView.m paramm)
  {
    if (this.aoa == null)
      this.aoa = new ArrayList();
    this.aoa.add(paramm);
  }

  final void a(RecyclerView.v paramv, RecyclerView.f.c paramc)
  {
    paramv.setFlags(0, 8192);
    if ((this.anY.apw) && (paramv.kx()) && (!paramv.isRemoved()) && (!paramv.kh()))
    {
      long l = g(paramv);
      this.ang.a(l, paramv);
    }
    this.ang.b(paramv, paramc);
  }

  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }

  public final boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }

  public final void aJ(int paramInt)
  {
    getScrollingChildHelper().aJ(paramInt);
  }

  public final RecyclerView.v aZ(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this))
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    return bn(paramView);
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if ((this.ank == null) || (!this.ank.a(this, paramArrayList, paramInt1, paramInt2)))
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }

  final void ak(boolean paramBoolean)
  {
    if (this.ant <= 0)
      this.ant = 1;
    if ((!paramBoolean) && (!this.anv))
      this.anu = false;
    if (this.ant == 1)
    {
      if ((paramBoolean) && (this.anu) && (!this.anv) && (this.ank != null) && (this.Yq != null))
        jD();
      if (!this.anv)
        this.anu = false;
    }
    this.ant -= 1;
  }

  public boolean ak(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.ank == null)
      bool2 = bool1;
    boolean bool3;
    boolean bool4;
    int i;
    int j;
    boolean bool5;
    label175: 
    do
    {
      do
      {
        do
        {
          do
          {
            return bool2;
            bool2 = bool1;
          }
          while (this.anv);
          bool3 = this.ank.iG();
          bool4 = this.ank.iH();
          if (bool3)
          {
            i = paramInt1;
            if (Math.abs(paramInt1) >= this.anQ);
          }
          else
          {
            i = 0;
          }
          if (bool4)
          {
            j = paramInt2;
            if (Math.abs(paramInt2) >= this.anQ);
          }
          else
          {
            j = 0;
          }
          if (i != 0)
            break;
          bool2 = bool1;
        }
        while (j == 0);
        bool2 = bool1;
      }
      while (dispatchNestedPreFling(i, j));
      if ((bool3) || (bool4));
      for (bool5 = true; ; bool5 = false)
      {
        dispatchNestedFling(i, j, bool5);
        if ((this.anP == null) || (!this.anP.aE(i, j)))
          break label175;
        bool2 = true;
        break;
      }
      bool2 = bool1;
    }
    while (!bool5);
    if (bool3);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      paramInt2 = paramInt1;
      if (bool4)
        paramInt2 = paramInt1 | 0x2;
      w(paramInt2, 1);
      paramInt1 = Math.max(-this.anR, Math.min(i, this.anR));
      paramInt2 = Math.max(-this.anR, Math.min(j, this.anR));
      RecyclerView.u localu = this.anV;
      localu.aoo.setScrollState(2);
      localu.apG = 0;
      localu.apF = 0;
      localu.qN.fling(0, 0, paramInt1, paramInt2, -2147483648, 2147483647, -2147483648, 2147483647);
      localu.ke();
      bool2 = true;
      break;
    }
  }

  final void al(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.anF != null)
    {
      bool2 = bool1;
      if (!this.anF.isFinished())
      {
        bool2 = bool1;
        if (paramInt1 > 0)
        {
          this.anF.onRelease();
          bool2 = this.anF.isFinished();
        }
      }
    }
    bool1 = bool2;
    if (this.anH != null)
    {
      bool1 = bool2;
      if (!this.anH.isFinished())
      {
        bool1 = bool2;
        if (paramInt1 < 0)
        {
          this.anH.onRelease();
          bool1 = bool2 | this.anH.isFinished();
        }
      }
    }
    bool2 = bool1;
    if (this.anG != null)
    {
      bool2 = bool1;
      if (!this.anG.isFinished())
      {
        bool2 = bool1;
        if (paramInt2 > 0)
        {
          this.anG.onRelease();
          bool2 = bool1 | this.anG.isFinished();
        }
      }
    }
    bool1 = bool2;
    if (this.anI != null)
    {
      bool1 = bool2;
      if (!this.anI.isFinished())
      {
        bool1 = bool2;
        if (paramInt2 < 0)
        {
          this.anI.onRelease();
          bool1 = bool2 | this.anI.isFinished();
        }
      }
    }
    if (bool1)
      s.R(this);
  }

  final void al(boolean paramBoolean)
  {
    this.anC -= 1;
    if (this.anC <= 0)
    {
      this.anC = 0;
      if (paramBoolean)
      {
        jy();
        jQ();
      }
    }
  }

  final void am(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      jp();
      this.anF.onAbsorb(-paramInt1);
      if (paramInt2 >= 0)
        break label66;
      jr();
      this.anG.onAbsorb(-paramInt2);
    }
    while (true)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        s.R(this);
      return;
      if (paramInt1 <= 0)
        break;
      jq();
      this.anH.onAbsorb(paramInt1);
      break;
      label66: if (paramInt2 > 0)
      {
        js();
        this.anI.onAbsorb(paramInt2);
      }
    }
  }

  final void am(boolean paramBoolean)
  {
    this.anB |= paramBoolean;
    this.anA = true;
    jN();
  }

  final void an(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(RecyclerView.i.l(paramInt1, getPaddingLeft() + getPaddingRight(), s.Z(this)), RecyclerView.i.l(paramInt2, getPaddingTop() + getPaddingBottom(), s.aa(this)));
  }

  public void ap(int paramInt1, int paramInt2)
  {
  }

  final void aq(int paramInt1, int paramInt2)
  {
    this.anD += 1;
    int i = getScrollX();
    int j = getScrollY();
    onScrollChanged(i, j, i, j);
    ap(paramInt1, paramInt2);
    if (this.anZ != null)
      this.anZ.a(this, paramInt1, paramInt2);
    if (this.aoa != null)
      for (j = this.aoa.size() - 1; j >= 0; j--)
        ((RecyclerView.m)this.aoa.get(j)).a(this, paramInt1, paramInt2);
    this.anD -= 1;
  }

  public final void b(RecyclerView.h paramh)
  {
    a(paramh);
  }

  public final void b(RecyclerView.l paraml)
  {
    this.ann.remove(paraml);
    if (this.ano == paraml)
      this.ano = null;
  }

  public final void b(RecyclerView.m paramm)
  {
    if (this.aoa != null)
      this.aoa.remove(paramm);
  }

  final boolean b(RecyclerView.v paramv, int paramInt)
  {
    if (jz())
    {
      paramv.apY = paramInt;
      this.aok.add(paramv);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      s.o(paramv.apJ, paramInt);
    }
  }

  public void bY(int paramInt)
  {
    if (this.anv);
    while (true)
    {
      return;
      jm();
      if (this.ank != null)
      {
        this.ank.bY(paramInt);
        awakenScrollBars();
      }
    }
  }

  public final View bl(View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (localViewParent != this) && ((localViewParent instanceof View)); localViewParent = paramView.getParent())
      paramView = (View)localViewParent;
    if (localViewParent == this);
    while (true)
    {
      return paramView;
      paramView = null;
    }
  }

  public final RecyclerView.v bm(View paramView)
  {
    paramView = bl(paramView);
    if (paramView == null);
    for (paramView = null; ; paramView = aZ(paramView))
      return paramView;
  }

  final Rect bq(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (!localLayoutParams.aoN)
      paramView = localLayoutParams.ala;
    while (true)
    {
      return paramView;
      if ((this.anY.apv) && ((localLayoutParams.aoM.kx()) || (localLayoutParams.aoM.kq())))
      {
        paramView = localLayoutParams.ala;
      }
      else
      {
        Rect localRect = localLayoutParams.ala;
        localRect.set(0, 0, 0, 0);
        int i = this.anm.size();
        for (int j = 0; j < i; j++)
        {
          this.mTempRect.set(0, 0, 0, 0);
          ((RecyclerView.h)this.anm.get(j)).a(this.mTempRect, paramView, this, this.anY);
          localRect.left += this.mTempRect.left;
          localRect.top += this.mTempRect.top;
          localRect.right += this.mTempRect.right;
          localRect.bottom += this.mTempRect.bottom;
        }
        localLayoutParams.aoN = false;
        paramView = localRect;
      }
    }
  }

  final void bs(View paramView)
  {
    bn(paramView);
    if (this.anz != null)
      for (int i = this.anz.size() - 1; i >= 0; i--)
        ((j)this.anz.get(i)).bH(paramView);
  }

  public final void c(RecyclerView.h paramh)
  {
    if (this.ank != null)
      this.ank.T("Cannot remove item decoration during a scroll  or layout");
    this.anm.remove(paramh);
    if (this.anm.isEmpty())
      if (getOverScrollMode() != 2)
        break label60;
    label60: for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      jK();
      requestLayout();
      return;
    }
  }

  final void cd(int paramInt)
  {
    if (this.ank == null);
    while (true)
    {
      return;
      this.ank.bY(paramInt);
      awakenScrollBars();
    }
  }

  public final void ce(int paramInt)
  {
    a(0, paramInt, null);
  }

  public final RecyclerView.v cf(int paramInt)
  {
    Object localObject = null;
    if (this.anA);
    int j;
    label24: RecyclerView.v localv;
    do
    {
      return localObject;
      int i = this.anf.hU();
      j = 0;
      localObject = null;
      if (j >= i)
        break;
      localv = bn(this.anf.bI(j));
      if ((localv == null) || (localv.isRemoved()) || (i(localv) != paramInt))
        break label97;
      localObject = localv;
    }
    while (!this.anf.aY(localv.apJ));
    localObject = localv;
    label97: 
    while (true)
    {
      j++;
      break label24;
      break;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof RecyclerView.LayoutParams)) && (this.ank.a((RecyclerView.LayoutParams)paramLayoutParams)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int computeHorizontalScrollExtent()
  {
    int i = 0;
    if (this.ank == null);
    while (true)
    {
      return i;
      if (this.ank.iG())
        i = this.ank.f(this.anY);
    }
  }

  public int computeHorizontalScrollOffset()
  {
    int i = 0;
    if (this.ank == null);
    while (true)
    {
      return i;
      if (this.ank.iG())
        i = this.ank.d(this.anY);
    }
  }

  public int computeHorizontalScrollRange()
  {
    int i = 0;
    if (this.ank == null);
    while (true)
    {
      return i;
      if (this.ank.iG())
        i = this.ank.h(this.anY);
    }
  }

  public int computeVerticalScrollExtent()
  {
    int i = 0;
    if (this.ank == null);
    while (true)
    {
      return i;
      if (this.ank.iH())
        i = this.ank.g(this.anY);
    }
  }

  public int computeVerticalScrollOffset()
  {
    int i = 0;
    if (this.ank == null);
    while (true)
    {
      return i;
      if (this.ank.iH())
        i = this.ank.e(this.anY);
    }
  }

  public int computeVerticalScrollRange()
  {
    int i = 0;
    if (this.ank == null);
    while (true)
    {
      return i;
      if (this.ank.iH())
        i = this.ank.i(this.anY);
    }
  }

  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }

  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().dispatchNestedPreFling(paramFloat1, paramFloat2);
  }

  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }

  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }

  public void draw(Canvas paramCanvas)
  {
    int i = 1;
    int j = 0;
    super.draw(paramCanvas);
    int k = this.anm.size();
    for (int m = 0; m < k; m++)
      ((RecyclerView.h)this.anm.get(m)).a(paramCanvas, this);
    int n;
    if ((this.anF != null) && (!this.anF.isFinished()))
    {
      n = paramCanvas.save();
      if (this.anh)
      {
        m = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(m + -getHeight(), 0.0F);
        if ((this.anF == null) || (!this.anF.draw(paramCanvas)))
          break label486;
        k = 1;
        label129: paramCanvas.restoreToCount(n);
      }
    }
    while (true)
    {
      m = k;
      if (this.anG != null)
      {
        m = k;
        if (!this.anG.isFinished())
        {
          n = paramCanvas.save();
          if (this.anh)
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          if ((this.anG == null) || (!this.anG.draw(paramCanvas)))
            break label492;
          m = 1;
          label208: m = k | m;
          paramCanvas.restoreToCount(n);
        }
      }
      k = m;
      if (this.anH != null)
      {
        k = m;
        if (!this.anH.isFinished())
        {
          n = paramCanvas.save();
          int i1 = getWidth();
          if (!this.anh)
            break label498;
          k = getPaddingTop();
          label271: paramCanvas.rotate(90.0F);
          paramCanvas.translate(-k, -i1);
          if ((this.anH == null) || (!this.anH.draw(paramCanvas)))
            break label504;
          k = 1;
          label311: k = m | k;
          paramCanvas.restoreToCount(n);
        }
      }
      m = k;
      if (this.anI != null)
      {
        m = k;
        if (!this.anI.isFinished())
        {
          n = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.anh)
            break label510;
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label395: m = j;
          if (this.anI != null)
          {
            m = j;
            if (this.anI.draw(paramCanvas))
              m = 1;
          }
          m = k | m;
          paramCanvas.restoreToCount(n);
        }
      }
      if ((m == 0) && (this.anJ != null) && (this.anm.size() > 0) && (this.anJ.isRunning()))
        m = i;
      while (true)
      {
        if (m != 0)
          s.R(this);
        return;
        m = 0;
        break;
        label486: k = 0;
        break label129;
        label492: m = 0;
        break label208;
        label498: k = 0;
        break label271;
        label504: k = 0;
        break label311;
        label510: paramCanvas.translate(-getWidth(), -getHeight());
        break label395;
      }
      k = 0;
    }
  }

  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }

  final void e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = this.anf.hU();
    int j = 0;
    if (j < i)
    {
      localObject = bn(this.anf.bI(j));
      if ((localObject != null) && (!((RecyclerView.v)localObject).kh()))
      {
        if (((RecyclerView.v)localObject).mPosition < paramInt1 + paramInt2)
          break label79;
        ((RecyclerView.v)localObject).o(-paramInt2, paramBoolean);
        this.anY.apu = true;
      }
      while (true)
      {
        j++;
        break;
        label79: if (((RecyclerView.v)localObject).mPosition >= paramInt1)
        {
          int k = -paramInt2;
          ((RecyclerView.v)localObject).addFlags(8);
          ((RecyclerView.v)localObject).o(k, paramBoolean);
          ((RecyclerView.v)localObject).mPosition = (paramInt1 - 1);
          this.anY.apu = true;
        }
      }
    }
    Object localObject = this.anc;
    j = ((RecyclerView.o)localObject).aoX.size() - 1;
    if (j >= 0)
    {
      RecyclerView.v localv = (RecyclerView.v)((RecyclerView.o)localObject).aoX.get(j);
      if (localv != null)
      {
        if (localv.mPosition < paramInt1 + paramInt2)
          break label194;
        localv.o(-paramInt2, paramBoolean);
      }
      while (true)
      {
        j--;
        break;
        label194: if (localv.mPosition >= paramInt1)
        {
          localv.addFlags(8);
          ((RecyclerView.o)localObject).cs(j);
        }
      }
    }
    requestLayout();
  }

  final void f(RecyclerView.v paramv)
  {
    View localView = paramv.apJ;
    int i;
    if (localView.getParent() == this)
    {
      i = 1;
      this.anc.t(aZ(localView));
      if (!paramv.ks())
        break label54;
      this.anf.a(localView, -1, localView.getLayoutParams(), true);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label54: if (i == 0)
      {
        this.anf.a(localView, -1, true);
      }
      else
      {
        paramv = this.anf;
        i = paramv.aha.indexOfChild(localView);
        if (i < 0)
          throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(localView)));
        paramv.ahb.set(i);
        paramv.aW(localView);
      }
    }
  }

  public View focusSearch(View paramView, int paramInt)
  {
    int i = -1;
    int j = 0;
    Object localObject;
    int m;
    label76: int n;
    if ((this.Yq != null) && (this.ank != null) && (!jz()) && (!this.anv))
    {
      k = 1;
      localObject = FocusFinder.getInstance();
      if ((k == 0) || ((paramInt != 2) && (paramInt != 1)))
        break label345;
      if (!this.ank.iH())
        break label1023;
      if (paramInt != 2)
        break label237;
      m = 130;
      if (((FocusFinder)localObject).findNextFocus(this, paramView, m) != null)
        break label244;
      n = 1;
      label91: k = n;
      if (amY)
        paramInt = m;
    }
    label154: label162: label174: label189: label237: label244: label250: label1023: for (int k = n; ; k = 0)
    {
      int i1 = k;
      n = paramInt;
      if (k == 0)
      {
        i1 = k;
        n = paramInt;
        if (this.ank.iG())
        {
          if (s.T(this.ank.aiB) != 1)
            break label250;
          k = 1;
          if (paramInt != 2)
            break label256;
          m = 1;
          if ((m ^ k) == 0)
            break label262;
          k = 66;
          if (((FocusFinder)localObject).findNextFocus(this, paramView, k) != null)
            break label269;
          m = 1;
          i1 = m;
          n = paramInt;
          if (amY)
          {
            n = k;
            i1 = m;
          }
        }
      }
      if (i1 != 0)
      {
        jk();
        if (bl(paramView) == null)
          paramView = null;
      }
      while (true)
      {
        return paramView;
        k = 0;
        break;
        m = 33;
        break label76;
        n = 0;
        break label91;
        k = 0;
        break label154;
        m = 0;
        break label162;
        k = 17;
        break label174;
        m = 0;
        break label189;
        jl();
        this.ank.a(paramView, n, this.anc, this.anY);
        ak(false);
        localObject = ((FocusFinder)localObject).findNextFocus(this, paramView, n);
        while (true)
        {
          if ((localObject == null) || (((View)localObject).hasFocusable()))
            break label440;
          if (getFocusedChild() != null)
            break label430;
          paramView = super.focusSearch(paramView, n);
          break;
          View localView = ((FocusFinder)localObject).findNextFocus(this, paramView, paramInt);
          localObject = localView;
          n = paramInt;
          if (localView == null)
          {
            localObject = localView;
            n = paramInt;
            if (k != 0)
            {
              jk();
              if (bl(paramView) == null)
              {
                paramView = null;
                break;
              }
              jl();
              localObject = this.ank.a(paramView, paramInt, this.anc, this.anY);
              ak(false);
              n = paramInt;
            }
          }
        }
        d((View)localObject, null);
      }
      paramInt = j;
      if (localObject != null)
      {
        if (localObject != this)
          break label467;
        paramInt = j;
      }
      while (true)
        if (paramInt != 0)
        {
          paramView = (View)localObject;
          break;
          paramInt = j;
          if (bl((View)localObject) != null)
            if (paramView == null)
            {
              paramInt = 1;
            }
            else if (bl(paramView) == null)
            {
              paramInt = 1;
            }
            else
            {
              this.mTempRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
              this.qT.set(0, 0, ((View)localObject).getWidth(), ((View)localObject).getHeight());
              offsetDescendantRectToMyCoords(paramView, this.mTempRect);
              offsetDescendantRectToMyCoords((View)localObject, this.qT);
              if (s.T(this.ank.aiB) == 1)
              {
                i1 = -1;
                if (((this.mTempRect.left >= this.qT.left) && (this.mTempRect.right > this.qT.left)) || (this.mTempRect.right >= this.qT.right))
                  break label779;
                k = 1;
              }
            }
        }
      while (true)
      {
        if (((this.mTempRect.top < this.qT.top) || (this.mTempRect.bottom <= this.qT.top)) && (this.mTempRect.bottom < this.qT.bottom))
          m = 1;
        while (true)
          switch (n)
          {
          default:
            throw new IllegalArgumentException("Invalid direction: " + n + ji());
            i1 = 1;
            break label573;
            if (((this.mTempRect.right <= this.qT.right) && (this.mTempRect.left < this.qT.right)) || (this.mTempRect.left <= this.qT.left))
              break label1017;
            k = -1;
            break label627;
            if ((this.mTempRect.bottom > this.qT.bottom) || (this.mTempRect.top >= this.qT.bottom))
            {
              m = i;
              if (this.mTempRect.top > this.qT.top);
            }
            else
            {
              m = 0;
            }
            break;
          case 17:
          case 66:
          case 33:
          case 130:
          case 2:
          case 1:
          }
        paramInt = j;
        if (k >= 0)
          break label457;
        paramInt = 1;
        break label457;
        paramInt = j;
        if (k <= 0)
          break label457;
        paramInt = 1;
        break label457;
        paramInt = j;
        if (m >= 0)
          break label457;
        paramInt = 1;
        break label457;
        paramInt = j;
        if (m <= 0)
          break label457;
        paramInt = 1;
        break label457;
        if (m <= 0)
        {
          paramInt = j;
          if (m != 0)
            break label457;
          paramInt = j;
          if (i1 * k < 0)
            break label457;
        }
        paramInt = 1;
        break label457;
        if (m >= 0)
        {
          paramInt = j;
          if (m != 0)
            break label457;
          paramInt = j;
          if (i1 * k > 0)
            break label457;
        }
        paramInt = 1;
        break label457;
        paramView = super.focusSearch(paramView, n);
        break;
        k = 0;
      }
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.ank == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager" + ji());
    return this.ank.iA();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.ank == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager" + ji());
    return this.ank.a(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.ank == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager" + ji());
    return this.ank.d(paramLayoutParams);
  }

  public a getAdapter()
  {
    return this.Yq;
  }

  public int getBaseline()
  {
    if (this.ank != null);
    for (int i = -1; ; i = super.getBaseline())
      return i;
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.aog == null);
    for (paramInt1 = super.getChildDrawingOrder(paramInt1, paramInt2); ; paramInt1 = this.aog.az(paramInt1, paramInt2))
      return paramInt1;
  }

  public boolean getClipToPadding()
  {
    return this.anh;
  }

  public ao getCompatAccessibilityDelegate()
  {
    return this.aof;
  }

  public RecyclerView.e getEdgeEffectFactory()
  {
    return this.anE;
  }

  public RecyclerView.f getItemAnimator()
  {
    return this.anJ;
  }

  public int getItemDecorationCount()
  {
    return this.anm.size();
  }

  public RecyclerView.i getLayoutManager()
  {
    return this.ank;
  }

  public int getMaxFlingVelocity()
  {
    return this.anR;
  }

  public int getMinFlingVelocity()
  {
    return this.anQ;
  }

  long getNanoTime()
  {
    if (amX);
    for (long l = System.nanoTime(); ; l = 0L)
      return l;
  }

  public RecyclerView.k getOnFlingListener()
  {
    return this.anP;
  }

  public boolean getPreserveFocusAfterLayout()
  {
    return this.anU;
  }

  public RecyclerView.n getRecycledViewPool()
  {
    return this.anc.getRecycledViewPool();
  }

  public int getScrollState()
  {
    return this.mScrollState;
  }

  k getScrollingChildHelper()
  {
    if (this.aoi == null)
      this.aoi = new k(this);
    return this.aoi;
  }

  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().aI(0);
  }

  final int i(RecyclerView.v paramv)
  {
    if ((paramv.cx(524)) || (!paramv.isBound()));
    for (int i = -1; ; i = this.ane.bB(paramv.mPosition))
      return i;
  }

  public boolean isAttachedToWindow()
  {
    return this.anp;
  }

  public boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelper().Mp;
  }

  final void jA()
  {
    if ((!this.aoe) && (this.anp))
    {
      s.b(this, this.aol);
      this.aoe = true;
    }
  }

  public final boolean jO()
  {
    if ((!this.ans) || (this.anA) || (this.ane.hw()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void jP()
  {
    int i = this.anf.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = this.anf.getChildAt(j);
      Object localObject = aZ(localView);
      if ((localObject != null) && (((RecyclerView.v)localObject).apQ != null))
      {
        localObject = ((RecyclerView.v)localObject).apQ.apJ;
        int k = localView.getLeft();
        int m = localView.getTop();
        if ((k != ((View)localObject).getLeft()) || (m != ((View)localObject).getTop()))
          ((View)localObject).layout(k, m, ((View)localObject).getWidth() + k, ((View)localObject).getHeight() + m);
      }
    }
  }

  final String ji()
  {
    return " " + super.toString() + ", adapter:" + this.Yq + ", layout:" + this.ank + ", context:" + getContext();
  }

  final void jj()
  {
    if (this.anJ != null)
      this.anJ.hZ();
    if (this.ank != null)
    {
      this.ank.d(this.anc);
      this.ank.c(this.anc);
    }
    this.anc.clear();
  }

  final void jk()
  {
    int i = 0;
    if ((!this.ans) || (this.anA))
    {
      android.support.v4.os.f.beginSection("RV FullInvalidate");
      jD();
      android.support.v4.os.f.endSection();
    }
    while (true)
    {
      return;
      if (this.ane.hw())
      {
        if ((this.ane.bz(4)) && (!this.ane.bz(11)))
        {
          android.support.v4.os.f.beginSection("RV PartialInvalidate");
          jl();
          jw();
          this.ane.hu();
          int k;
          if (!this.anu)
          {
            int j = this.anf.getChildCount();
            k = 0;
            label101: int m = i;
            if (k < j)
            {
              RecyclerView.v localv = bn(this.anf.getChildAt(k));
              if ((localv == null) || (localv.kh()) || (!localv.kx()))
                break label171;
              m = 1;
            }
            if (m == 0)
              break label177;
            jD();
          }
          while (true)
          {
            ak(true);
            al(true);
            android.support.v4.os.f.endSection();
            break;
            label171: k++;
            break label101;
            label177: this.ane.hv();
          }
        }
        if (this.ane.hw())
        {
          android.support.v4.os.f.beginSection("RV FullInvalidate");
          jD();
          android.support.v4.os.f.endSection();
        }
      }
    }
  }

  final void jl()
  {
    this.ant += 1;
    if ((this.ant == 1) && (!this.anv))
      this.anu = false;
  }

  public final void jm()
  {
    setScrollState(0);
    jn();
  }

  final void jw()
  {
    this.anC += 1;
  }

  final boolean jx()
  {
    if ((this.mP != null) && (this.mP.isEnabled()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean jz()
  {
    if (this.anC > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void m(RecyclerView.s params)
  {
    OverScroller localOverScroller;
    if (getScrollState() == 2)
    {
      localOverScroller = RecyclerView.u.a(this.anV);
      params.apD = (localOverScroller.getFinalX() - localOverScroller.getCurrX());
    }
    for (params.apE = (localOverScroller.getFinalY() - localOverScroller.getCurrY()); ; params.apE = 0)
    {
      return;
      params.apD = 0;
    }
  }

  protected void onAttachedToWindow()
  {
    boolean bool = true;
    super.onAttachedToWindow();
    this.anC = 0;
    this.anp = true;
    float f;
    if ((this.ans) && (!isLayoutRequested()))
    {
      this.ans = bool;
      if (this.ank != null)
        this.ank.e(this);
      this.aoe = false;
      if (amX)
      {
        this.anW = ((af)af.aiU.get());
        if (this.anW == null)
        {
          this.anW = new af();
          Display localDisplay = s.ax(this);
          if ((isInEditMode()) || (localDisplay == null))
            break label162;
          f = localDisplay.getRefreshRate();
          if (f < 30.0F)
            break label162;
        }
      }
    }
    while (true)
    {
      this.anW.aiX = (()(1.0E+009F / f));
      af.aiU.set(this.anW);
      this.anW.aiV.add(this);
      return;
      bool = false;
      break;
      label162: f = 60.0F;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.anJ != null)
      this.anJ.hZ();
    jm();
    this.anp = false;
    if (this.ank != null)
      this.ank.b(this, this.anc);
    this.aok.clear();
    removeCallbacks(this.aol);
    bj.a.lz();
    if ((amX) && (this.anW != null))
    {
      this.anW.aiV.remove(this);
      this.anW = null;
    }
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = this.anm.size();
    for (int j = 0; j < i; j++)
      ((RecyclerView.h)this.anm.get(j)).a(paramCanvas, this, this.anY);
  }

  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.ank == null);
    label52: label193: 
    while (true)
    {
      return false;
      if ((!this.anv) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        float f2;
        float f3;
        if ((paramMotionEvent.getSource() & 0x2) != 0)
          if (this.ank.iH())
          {
            f1 = -paramMotionEvent.getAxisValue(9);
            if (!this.ank.iG())
              break label116;
            f2 = paramMotionEvent.getAxisValue(10);
            f3 = f1;
            f1 = f2;
          }
        while (true)
        {
          if ((f3 == 0.0F) && (f1 == 0.0F))
            break label193;
          a((int)(this.anS * f1), (int)(this.anT * f3), paramMotionEvent);
          break;
          f1 = 0.0F;
          break label52;
          label116: f2 = 0.0F;
          f3 = f1;
          f1 = f2;
          continue;
          if ((paramMotionEvent.getSource() & 0x400000) != 0)
          {
            f1 = paramMotionEvent.getAxisValue(26);
            if (this.ank.iH())
            {
              f3 = -f1;
              f1 = 0.0F;
            }
            else if (this.ank.iG())
            {
              f3 = 0.0F;
            }
            else
            {
              f1 = 0.0F;
              f3 = 0.0F;
            }
          }
          else
          {
            f1 = 0.0F;
            f3 = 0.0F;
          }
        }
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1;
    if (this.anv)
      bool1 = false;
    int i;
    int j;
    label42: label114: boolean bool2;
    while (true)
    {
      return bool1;
      i = paramMotionEvent.getAction();
      if ((i == 3) || (i == 0))
        this.ano = null;
      j = this.ann.size();
      k = 0;
      if (k < j)
      {
        RecyclerView.l locall = (RecyclerView.l)this.ann.get(k);
        if ((locall.h(paramMotionEvent)) && (i != 3))
          this.ano = locall;
      }
      for (k = 1; ; k = 0)
      {
        if (k == 0)
          break label114;
        jv();
        bool1 = true;
        break;
        k++;
        break label42;
      }
      if (this.ank == null)
      {
        bool1 = false;
      }
      else
      {
        bool2 = this.ank.iG();
        bool1 = this.ank.iH();
        if (this.mVelocityTracker == null)
          this.mVelocityTracker = VelocityTracker.obtain();
        this.mVelocityTracker.addMovement(paramMotionEvent);
        i = paramMotionEvent.getActionMasked();
        k = paramMotionEvent.getActionIndex();
        switch (i)
        {
        case 4:
        default:
          label220: if (this.mScrollState != 1)
            break label617;
          bool1 = true;
        case 0:
        case 5:
        case 2:
        case 6:
        case 1:
        case 3:
        }
      }
    }
    if (this.anw)
      this.anw = false;
    this.anK = paramMotionEvent.getPointerId(0);
    int k = (int)(paramMotionEvent.getX() + 0.5F);
    this.anN = k;
    this.anL = k;
    k = (int)(paramMotionEvent.getY() + 0.5F);
    this.anO = k;
    this.anM = k;
    if (this.mScrollState == 2)
    {
      getParent().requestDisallowInterceptTouchEvent(true);
      setScrollState(1);
    }
    paramMotionEvent = this.aoj;
    this.aoj[1] = 0;
    paramMotionEvent[0] = 0;
    if (bool2);
    for (k = 1; ; k = 0)
    {
      i = k;
      if (bool1)
        i = k | 0x2;
      w(i, 0);
      break label220;
      this.anK = paramMotionEvent.getPointerId(k);
      i = (int)(paramMotionEvent.getX(k) + 0.5F);
      this.anN = i;
      this.anL = i;
      k = (int)(paramMotionEvent.getY(k) + 0.5F);
      this.anO = k;
      this.anM = k;
      break label220;
      i = paramMotionEvent.findPointerIndex(this.anK);
      if (i < 0)
      {
        new StringBuilder("Error processing scroll; pointer index for id ").append(this.anK).append(" not found. Did any MotionEvents get skipped?");
        bool1 = false;
        break;
      }
      k = (int)(paramMotionEvent.getX(i) + 0.5F);
      j = (int)(paramMotionEvent.getY(i) + 0.5F);
      if (this.mScrollState == 1)
        break label220;
      i = this.anL;
      int m = this.anM;
      if ((bool2) && (Math.abs(k - i) > this.mTouchSlop))
        this.anN = k;
      for (k = 1; ; k = 0)
      {
        i = k;
        if (bool1)
        {
          i = k;
          if (Math.abs(j - m) > this.mTouchSlop)
          {
            this.anO = j;
            i = 1;
          }
        }
        if (i == 0)
          break label220;
        setScrollState(1);
        break label220;
        j(paramMotionEvent);
        break label220;
        this.mVelocityTracker.clear();
        aJ(0);
        break label220;
        jv();
        break label220;
        label617: bool1 = false;
        break;
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    android.support.v4.os.f.beginSection("RV OnLayout");
    jD();
    android.support.v4.os.f.endSection();
    this.ans = true;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (this.ank == null)
      an(paramInt1, paramInt2);
    while (true)
    {
      return;
      if (this.ank.iF())
      {
        int j = View.MeasureSpec.getMode(paramInt1);
        int k = View.MeasureSpec.getMode(paramInt2);
        this.ank.aD(paramInt1, paramInt2);
        int m = i;
        if (j == 1073741824)
        {
          m = i;
          if (k == 1073741824)
            m = 1;
        }
        if ((m == 0) && (this.Yq != null))
        {
          if (this.anY.aps == 1)
            jH();
          this.ank.aA(paramInt1, paramInt2);
          this.anY.apx = true;
          jI();
          this.ank.aB(paramInt1, paramInt2);
          if (this.ank.iL())
          {
            this.ank.aA(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.anY.apx = true;
            jI();
            this.ank.aB(paramInt1, paramInt2);
          }
        }
      }
      else
      {
        if (!this.anq)
          break;
        this.ank.aD(paramInt1, paramInt2);
      }
    }
    if (this.any)
    {
      jl();
      jw();
      jC();
      al(true);
      if (this.anY.apz)
      {
        this.anY.apv = true;
        label251: this.any = false;
        ak(false);
        label261: if (this.Yq == null)
          break label354;
      }
    }
    label354: for (this.anY.apt = this.Yq.getItemCount(); ; this.anY.apt = 0)
    {
      jl();
      this.ank.aD(paramInt1, paramInt2);
      ak(false);
      this.anY.apv = false;
      break;
      this.ane.hx();
      this.anY.apv = false;
      break label251;
      if (!this.anY.apz)
        break label261;
      setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
      break;
    }
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    if (jz());
    for (boolean bool = false; ; bool = super.onRequestFocusInDescendants(paramInt, paramRect))
      return bool;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof RecyclerView.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      this.and = ((RecyclerView.SavedState)paramParcelable);
      super.onRestoreInstanceState(this.and.LC);
      if ((this.ank != null) && (this.and.apd != null))
        this.ank.onRestoreInstanceState(this.and.apd);
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    RecyclerView.SavedState localSavedState = new RecyclerView.SavedState(super.onSaveInstanceState());
    if (this.and != null)
      localSavedState.apd = this.and.apd;
    while (true)
    {
      return localSavedState;
      if (this.ank != null)
        localSavedState.apd = this.ank.onSaveInstanceState();
      else
        localSavedState.apd = null;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
      jt();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!this.anv)
    {
      if (!this.anw)
        break label27;
      bool2 = bool1;
    }
    label27: int k;
    label67: Object localObject;
    label156: label162: label168: boolean bool3;
    int m;
    while (true)
    {
      return bool2;
      j = paramMotionEvent.getAction();
      if (this.ano != null)
      {
        if (j == 0)
          this.ano = null;
      }
      else
      {
        if (j == 0)
          break label162;
        k = this.ann.size();
        j = 0;
        if (j >= k)
          break label162;
        localObject = (RecyclerView.l)this.ann.get(j);
        if (!((RecyclerView.l)localObject).h(paramMotionEvent))
          break label156;
        this.ano = ((RecyclerView.l)localObject);
        j = 1;
      }
      while (true)
      {
        if (j == 0)
          break label168;
        jv();
        bool2 = true;
        break;
        this.ano.i(paramMotionEvent);
        if ((j == 3) || (j == 1))
          this.ano = null;
        j = 1;
        continue;
        j++;
        break label67;
        j = 0;
      }
      bool2 = bool1;
      if (this.ank != null)
      {
        bool3 = this.ank.iG();
        bool2 = this.ank.iH();
        if (this.mVelocityTracker == null)
          this.mVelocityTracker = VelocityTracker.obtain();
        localObject = MotionEvent.obtain(paramMotionEvent);
        m = paramMotionEvent.getActionMasked();
        k = paramMotionEvent.getActionIndex();
        if (m == 0)
        {
          int[] arrayOfInt = this.aoj;
          this.aoj[1] = 0;
          arrayOfInt[0] = 0;
        }
        ((MotionEvent)localObject).offsetLocation(this.aoj[0], this.aoj[1]);
        j = i;
        switch (m)
        {
        default:
          j = i;
        case 4:
          label319: if (j == 0)
            this.mVelocityTracker.addMovement((MotionEvent)localObject);
          ((MotionEvent)localObject).recycle();
          bool2 = true;
        case 0:
        case 5:
        case 2:
        case 6:
        case 1:
        case 3:
        }
      }
    }
    this.anK = paramMotionEvent.getPointerId(0);
    int j = (int)(paramMotionEvent.getX() + 0.5F);
    this.anN = j;
    this.anL = j;
    j = (int)(paramMotionEvent.getY() + 0.5F);
    this.anO = j;
    this.anM = j;
    if (bool3);
    label793: label945: label957: label975: label1118: for (j = 1; ; j = 0)
    {
      k = j;
      if (bool2)
        k = j | 0x2;
      w(k, 0);
      j = i;
      break label319;
      this.anK = paramMotionEvent.getPointerId(k);
      j = (int)(paramMotionEvent.getX(k) + 0.5F);
      this.anN = j;
      this.anL = j;
      j = (int)(paramMotionEvent.getY(k) + 0.5F);
      this.anO = j;
      this.anM = j;
      j = i;
      break label319;
      j = paramMotionEvent.findPointerIndex(this.anK);
      if (j < 0)
      {
        new StringBuilder("Error processing scroll; pointer index for id ").append(this.anK).append(" not found. Did any MotionEvents get skipped?");
        bool2 = bool1;
        break;
      }
      int n = (int)(paramMotionEvent.getX(j) + 0.5F);
      int i1 = (int)(paramMotionEvent.getY(j) + 0.5F);
      int i2 = this.anN - n;
      m = this.anO - i1;
      k = i2;
      j = m;
      if (a(i2, m, this.Re, this.Rd, 0))
      {
        k = i2 - this.Re[0];
        j = m - this.Re[1];
        ((MotionEvent)localObject).offsetLocation(this.Rd[0], this.Rd[1]);
        paramMotionEvent = this.aoj;
        paramMotionEvent[0] += this.Rd[0];
        paramMotionEvent = this.aoj;
        paramMotionEvent[1] += this.Rd[1];
      }
      i2 = k;
      m = j;
      if (this.mScrollState != 1)
      {
        if ((!bool3) || (Math.abs(k) <= this.mTouchSlop))
          break label1118;
        if (k <= 0)
          break label945;
        k -= this.mTouchSlop;
      }
      label743: for (m = 1; ; m = 0)
      {
        int i3 = j;
        int i4 = m;
        if (bool2)
        {
          i3 = j;
          i4 = m;
          if (Math.abs(j) > this.mTouchSlop)
          {
            if (j <= 0)
              break label957;
            j -= this.mTouchSlop;
            i4 = 1;
            i3 = j;
          }
        }
        i2 = k;
        m = i3;
        if (i4 != 0)
        {
          setScrollState(1);
          m = i3;
          i2 = k;
        }
        j = i;
        if (this.mScrollState != 1)
          break;
        this.anN = (n - this.Rd[0]);
        this.anO = (i1 - this.Rd[1]);
        if (bool3)
        {
          j = i2;
          label872: if (!bool2)
            break label975;
        }
        for (k = m; ; k = 0)
        {
          if (a(j, k, (MotionEvent)localObject))
            getParent().requestDisallowInterceptTouchEvent(true);
          j = i;
          if (this.anW == null)
            break;
          if (i2 == 0)
          {
            j = i;
            if (m == 0)
              break;
          }
          this.anW.b(this, i2, m);
          j = i;
          break;
          k = this.mTouchSlop + k;
          break label743;
          j = this.mTouchSlop + j;
          break label793;
          j = 0;
          break label872;
        }
        j(paramMotionEvent);
        j = i;
        break;
        this.mVelocityTracker.addMovement((MotionEvent)localObject);
        this.mVelocityTracker.computeCurrentVelocity(1000, this.anR);
        float f1;
        if (bool3)
        {
          f1 = -this.mVelocityTracker.getXVelocity(this.anK);
          if (!bool2)
            break label1102;
        }
        for (float f2 = -this.mVelocityTracker.getYVelocity(this.anK); ; f2 = 0.0F)
        {
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!ak((int)f1, (int)f2)))
            setScrollState(0);
          ju();
          j = 1;
          break;
          f1 = 0.0F;
          break label1035;
        }
        jv();
        j = i;
        break;
      }
    }
  }

  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    RecyclerView.v localv = bn(paramView);
    if (localv != null)
    {
      if (!localv.ks())
        break label36;
      localv.kp();
    }
    label36: 
    while (localv.kh())
    {
      paramView.clearAnimation();
      bs(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localv + ji());
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    if ((this.ank.jV()) || (jz()));
    for (int i = 1; ; i = 0)
    {
      if ((i == 0) && (paramView2 != null))
        d(paramView1, paramView2);
      super.requestChildFocus(paramView1, paramView2);
      return;
    }
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.ank.a(this, paramView, paramRect, paramBoolean, false);
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i = this.ann.size();
    for (int j = 0; j < i; j++)
      ((RecyclerView.l)this.ann.get(j)).ab(paramBoolean);
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void requestLayout()
  {
    if ((this.ant == 0) && (!this.anv))
      super.requestLayout();
    while (true)
    {
      return;
      this.anu = true;
    }
  }

  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.ank == null);
    boolean bool1;
    boolean bool2;
    do
    {
      return;
      if (this.anv)
        break;
      bool1 = this.ank.iG();
      bool2 = this.ank.iH();
    }
    while ((!bool1) && (!bool2));
    if (bool1)
      label45: if (!bool2)
        break label66;
    while (true)
    {
      a(paramInt1, paramInt2, null);
      break;
      break;
      paramInt1 = 0;
      break label45;
      label66: paramInt2 = 0;
    }
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
  }

  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = 0;
    int j = 0;
    if (jz())
    {
      if (paramAccessibilityEvent == null)
        break label67;
      if (Build.VERSION.SDK_INT < 19)
        break label51;
      i = paramAccessibilityEvent.getContentChangeTypes();
    }
    while (true)
    {
      if (i == 0)
        i = j;
      while (true)
      {
        this.anx |= i;
        i = 1;
        if (i != 0);
        while (true)
        {
          return;
          label51: i = 0;
          break;
          super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
        }
      }
      label67: i = 0;
    }
  }

  public void setAccessibilityDelegateCompat(ao paramao)
  {
    this.aof = paramao;
    s.a(this, this.aof);
  }

  public void setAdapter(a parama)
  {
    setLayoutFrozen(false);
    if (this.Yq != null)
      this.Yq.b(this.anb);
    jj();
    this.ane.reset();
    a locala = this.Yq;
    this.Yq = parama;
    if (parama != null)
      parama.a(this.anb);
    if (this.ank != null)
      this.ank.jW();
    Object localObject = this.anc;
    parama = this.Yq;
    ((RecyclerView.o)localObject).clear();
    localObject = ((RecyclerView.o)localObject).getRecycledViewPool();
    if (locala != null)
      ((RecyclerView.n)localObject).detach();
    if (((RecyclerView.n)localObject).aoQ == 0)
      for (int i = 0; i < ((RecyclerView.n)localObject).aoP.size(); i++)
        ((n.a)((RecyclerView.n)localObject).aoP.valueAt(i)).aoR.clear();
    if (parama != null)
      ((RecyclerView.n)localObject).ka();
    this.anY.apu = true;
    am(false);
    requestLayout();
  }

  public void setChildDrawingOrderCallback(d paramd)
  {
    if (paramd == this.aog)
      return;
    this.aog = paramd;
    if (this.aog != null);
    for (boolean bool = true; ; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      break;
    }
  }

  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.anh)
      jt();
    this.anh = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.ans)
      requestLayout();
  }

  public void setEdgeEffectFactory(RecyclerView.e parame)
  {
    l.checkNotNull(parame);
    this.anE = parame;
    jt();
  }

  public void setHasFixedSize(boolean paramBoolean)
  {
    this.anq = paramBoolean;
  }

  public void setItemAnimator(RecyclerView.f paramf)
  {
    if (this.anJ != null)
    {
      this.anJ.hZ();
      this.anJ.aor = null;
    }
    this.anJ = paramf;
    if (this.anJ != null)
      this.anJ.aor = this.aod;
  }

  public void setItemViewCacheSize(int paramInt)
  {
    RecyclerView.o localo = this.anc;
    localo.aoZ = paramInt;
    localo.kb();
  }

  public void setLayoutFrozen(boolean paramBoolean)
  {
    if (paramBoolean != this.anv)
    {
      T("Do not setLayoutFrozen in layout or scroll");
      if (paramBoolean)
        break label55;
      this.anv = false;
      if ((this.anu) && (this.ank != null) && (this.Yq != null))
        requestLayout();
      this.anu = false;
    }
    while (true)
    {
      return;
      label55: long l = SystemClock.uptimeMillis();
      onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
      this.anv = true;
      this.anw = true;
      jm();
    }
  }

  public void setLayoutManager(RecyclerView.i parami)
  {
    if (parami == this.ank);
    while (true)
    {
      return;
      jm();
      if (this.ank != null)
      {
        if (this.anJ != null)
          this.anJ.hZ();
        this.ank.d(this.anc);
        this.ank.c(this.anc);
        this.anc.clear();
        if (this.anp)
          this.ank.b(this, this.anc);
        this.ank.setRecyclerView(null);
        this.ank = null;
      }
      v localv;
      while (true)
      {
        localv = this.anf;
        for (v.a locala = localv.ahb; ; locala = locala.ahe)
        {
          locala.ahd = 0L;
          if (locala.ahe == null)
            break;
        }
        this.anc.clear();
      }
      for (int i = localv.ahc.size() - 1; i >= 0; i--)
      {
        localv.aha.bb((View)localv.ahc.get(i));
        localv.ahc.remove(i);
      }
      localv.aha.removeAllViews();
      this.ank = parami;
      if (parami != null)
      {
        if (parami.aiB != null)
          throw new IllegalArgumentException("LayoutManager " + parami + " is already attached to a RecyclerView:" + parami.aiB.ji());
        this.ank.setRecyclerView(this);
        if (this.anp)
          this.ank.e(this);
      }
      this.anc.kb();
      requestLayout();
    }
  }

  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().setNestedScrollingEnabled(paramBoolean);
  }

  public void setOnFlingListener(RecyclerView.k paramk)
  {
    this.anP = paramk;
  }

  @Deprecated
  public void setOnScrollListener(RecyclerView.m paramm)
  {
    this.anZ = paramm;
  }

  public void setPreserveFocusAfterLayout(boolean paramBoolean)
  {
    this.anU = paramBoolean;
  }

  public void setRecycledViewPool(RecyclerView.n paramn)
  {
    RecyclerView.o localo = this.anc;
    if (localo.apb != null)
      localo.apb.detach();
    localo.apb = paramn;
    if (paramn != null)
    {
      paramn = localo.apb;
      localo.aoo.getAdapter();
      paramn.ka();
    }
  }

  public void setRecyclerListener(RecyclerView.p paramp)
  {
    this.anl = paramp;
  }

  void setScrollState(int paramInt)
  {
    if (paramInt == this.mScrollState);
    while (true)
    {
      return;
      this.mScrollState = paramInt;
      if (paramInt != 2)
        jn();
      if (this.ank != null)
        this.ank.cm(paramInt);
      if (this.anZ != null)
        this.anZ.c(this, paramInt);
      if (this.aoa != null)
        for (int i = this.aoa.size() - 1; i >= 0; i--)
          ((RecyclerView.m)this.aoa.get(i)).c(this, paramInt);
    }
  }

  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    switch (paramInt)
    {
    default:
      new StringBuilder("setScrollingTouchSlop(): bad argument constant ").append(paramInt).append("; using default value");
    case 0:
    case 1:
    }
    for (this.mTouchSlop = localViewConfiguration.getScaledTouchSlop(); ; this.mTouchSlop = localViewConfiguration.getScaledPagingTouchSlop())
      return;
  }

  public void setViewCacheExtension(RecyclerView.t paramt)
  {
    this.anc.apc = paramt;
  }

  public final void smoothScrollToPosition(int paramInt)
  {
    if (this.anv);
    while (true)
    {
      return;
      if (this.ank != null)
        this.ank.a(this, paramInt);
    }
  }

  public boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().w(paramInt, 0);
  }

  public void stopNestedScroll()
  {
    getScrollingChildHelper().aJ(0);
  }

  public final View x(float paramFloat1, float paramFloat2)
  {
    int i = this.anf.getChildCount() - 1;
    View localView;
    if (i >= 0)
    {
      localView = this.anf.getChildAt(i);
      float f1 = localView.getTranslationX();
      float f2 = localView.getTranslationY();
      if ((paramFloat1 < localView.getLeft() + f1) || (paramFloat1 > f1 + localView.getRight()) || (paramFloat2 < localView.getTop() + f2) || (paramFloat2 > localView.getBottom() + f2));
    }
    while (true)
    {
      return localView;
      i--;
      break;
      localView = null;
    }
  }

  public static abstract class a<VH extends RecyclerView.v>
  {
    public final RecyclerView.b aop = new RecyclerView.b();
    protected boolean aoq = false;

    public abstract VH a(ViewGroup paramViewGroup, int paramInt);

    public final void a(RecyclerView.c paramc)
    {
      this.aop.registerObserver(paramc);
    }

    public void a(VH paramVH)
    {
    }

    public abstract void a(VH paramVH, int paramInt);

    public void a(VH paramVH, int paramInt, List<Object> paramList)
    {
      a(paramVH, paramInt);
    }

    public final void ar(int paramInt1, int paramInt2)
    {
      this.aop.ar(paramInt1, paramInt2);
    }

    public final void as(int paramInt1, int paramInt2)
    {
      this.aop.as(paramInt1, paramInt2);
    }

    public final void at(int paramInt1, int paramInt2)
    {
      this.aop.at(paramInt1, paramInt2);
    }

    public final void au(int paramInt1, int paramInt2)
    {
      this.aop.au(paramInt1, paramInt2);
    }

    public final void b(int paramInt, Object paramObject)
    {
      this.aop.c(paramInt, 1, paramObject);
    }

    public final void b(RecyclerView.c paramc)
    {
      this.aop.unregisterObserver(paramc);
    }

    public final VH c(ViewGroup paramViewGroup, int paramInt)
    {
      try
      {
        android.support.v4.os.f.beginSection("RV CreateView");
        paramViewGroup = a(paramViewGroup, paramInt);
        if (paramViewGroup.apJ.getParent() != null)
        {
          paramViewGroup = new java/lang/IllegalStateException;
          paramViewGroup.<init>("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
          throw paramViewGroup;
        }
      }
      finally
      {
        android.support.v4.os.f.endSection();
      }
      paramViewGroup.apN = paramInt;
      android.support.v4.os.f.endSection();
      return paramViewGroup;
    }

    public final void c(int paramInt1, int paramInt2, Object paramObject)
    {
      this.aop.c(paramInt1, paramInt2, paramObject);
    }

    public final void cg(int paramInt)
    {
      this.aop.ar(paramInt, 1);
    }

    public final void ch(int paramInt)
    {
      this.aop.at(paramInt, 1);
    }

    public final void ci(int paramInt)
    {
      this.aop.au(paramInt, 1);
    }

    public abstract int getItemCount();

    public long getItemId(int paramInt)
    {
      return -1L;
    }

    public int getItemViewType(int paramInt)
    {
      return 0;
    }

    public final void jR()
    {
      if (this.aop.hasObservers())
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
      this.aoq = true;
    }

    public void k(VH paramVH)
    {
    }

    public final void notifyDataSetChanged()
    {
      this.aop.notifyChanged();
    }
  }

  public static abstract class c
  {
    public void av(int paramInt1, int paramInt2)
    {
    }

    public void aw(int paramInt1, int paramInt2)
    {
    }

    public void ax(int paramInt1, int paramInt2)
    {
    }

    public void ay(int paramInt1, int paramInt2)
    {
    }

    public void d(int paramInt1, int paramInt2, Object paramObject)
    {
      av(paramInt1, paramInt2);
    }

    public void onChanged()
    {
    }
  }

  public static abstract interface d
  {
    public abstract int az(int paramInt1, int paramInt2);
  }

  public static abstract interface j
  {
    public abstract void bH(View paramView);
  }

  static final class n$a
  {
    final ArrayList<RecyclerView.v> aoR = new ArrayList();
    int aoS = 5;
    long aoT = 0L;
    long aoU = 0L;
  }

  public static abstract interface r$b
  {
    public abstract PointF bX(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView
 * JD-Core Version:    0.6.2
 */