package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DynamicGridView extends WrappingGridView
{
  private List<Long> idList;
  boolean lBk;
  private int mActivePointerId;
  private int mScrollState;
  private boolean rLA;
  private AbsListView.OnScrollListener rLB;
  private DynamicGridView.f rLC;
  private DynamicGridView.e rLD;
  private DynamicGridView.g rLE;
  private AdapterView.OnItemClickListener rLF;
  private AdapterView.OnItemClickListener rLG;
  private boolean rLH;
  private Stack<a> rLI;
  private a rLJ;
  private DynamicGridView.h rLK;
  private View rLL;
  DynamicGridView.d rLM;
  int rLN;
  float rLO;
  float rLP;
  private float rLQ;
  private float rLR;
  private AbsListView.OnScrollListener rLS;
  private BitmapDrawable rLg;
  private Rect rLh;
  private Rect rLi;
  private Rect rLj;
  private int rLk;
  private int rLl;
  private int rLm;
  private int rLn;
  private int rLo;
  private int rLp;
  private int rLq;
  private long rLr;
  private boolean rLs;
  private boolean rLt;
  private int rLu;
  private boolean rLv;
  private List<ObjectAnimator> rLw;
  boolean rLx;
  boolean rLy;
  boolean rLz;

  public DynamicGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(40367);
    this.rLk = 0;
    this.rLl = 0;
    this.rLm = -1;
    this.rLn = -1;
    this.rLo = -1;
    this.rLp = -1;
    this.idList = new ArrayList();
    this.rLr = -1L;
    this.rLs = false;
    this.mActivePointerId = -1;
    this.rLu = 0;
    this.rLv = false;
    this.mScrollState = 0;
    this.lBk = false;
    this.rLw = new LinkedList();
    this.rLz = true;
    this.rLA = true;
    this.rLG = new DynamicGridView.1(this);
    this.rLM = new DynamicGridView.d(this, (byte)0);
    this.rLN = -1;
    this.rLS = new DynamicGridView.2(this);
    init(paramContext);
    AppMethodBeat.o(40367);
  }

  public DynamicGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40368);
    this.rLk = 0;
    this.rLl = 0;
    this.rLm = -1;
    this.rLn = -1;
    this.rLo = -1;
    this.rLp = -1;
    this.idList = new ArrayList();
    this.rLr = -1L;
    this.rLs = false;
    this.mActivePointerId = -1;
    this.rLu = 0;
    this.rLv = false;
    this.mScrollState = 0;
    this.lBk = false;
    this.rLw = new LinkedList();
    this.rLz = true;
    this.rLA = true;
    this.rLG = new DynamicGridView.1(this);
    this.rLM = new DynamicGridView.d(this, (byte)0);
    this.rLN = -1;
    this.rLS = new DynamicGridView.2(this);
    init(paramContext);
    AppMethodBeat.o(40368);
  }

  private boolean Ey(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(40388);
    if (!getAdapterInterface().Es(paramInt))
      AppMethodBeat.o(40388);
    while (true)
    {
      return bool;
      this.rLk = 0;
      this.rLl = 0;
      View localView = getChildAt(paramInt - getFirstVisiblePosition());
      if (localView != null)
      {
        this.rLr = getAdapter().getItemId(paramInt);
        this.rLg = dX(localView);
        cvi();
        if (cvj())
          localView.setVisibility(4);
        kN(this.rLr);
        if (this.rLD != null)
          this.rLD.Ev(paramInt);
        bool = true;
        AppMethodBeat.o(40388);
      }
      else
      {
        AppMethodBeat.o(40388);
      }
    }
  }

  private long Ez(int paramInt)
  {
    AppMethodBeat.i(40399);
    long l = getAdapter().getItemId(paramInt);
    AppMethodBeat.o(40399);
    return l;
  }

  @TargetApi(11)
  private void cve()
  {
    AppMethodBeat.i(40372);
    int i = 0;
    if (i < getChildCount())
    {
      View localView = getChildAt(i);
      if ((localView != null) && (Boolean.TRUE != localView.getTag(2131820591)))
      {
        if (i % 2 != 0)
          break label66;
        dU(localView);
      }
      while (true)
      {
        localView.setTag(2131820591, Boolean.TRUE);
        i++;
        break;
        label66: dV(localView);
      }
    }
    AppMethodBeat.o(40372);
  }

  private boolean cvf()
  {
    AppMethodBeat.i(40387);
    int i = kO(this.rLr);
    boolean bool;
    if (i != -1)
    {
      this.rLD.Ew(i);
      if (this.rLL != null)
        break label58;
      AppMethodBeat.o(40387);
      bool = false;
    }
    label58: int j;
    while (true)
    {
      return bool;
      AppMethodBeat.o(40387);
      bool = false;
      continue;
      j = getPositionForView(this.rLL);
      i = getChildCount() - 1;
      new StringBuilder("switch ").append(j).append(",").append(i);
      if (j != -1)
        break;
      AppMethodBeat.o(40387);
      bool = false;
    }
    fC(j, i);
    if (this.rLH)
      this.rLJ.fD(j, i);
    this.rLn = this.rLo;
    this.rLm = this.rLp;
    Object localObject;
    if ((cvj()) && (cvk()))
      localObject = new b(0, 0);
    while (true)
    {
      kN(this.rLr);
      ((DynamicGridView.j)localObject).fE(j, i);
      bool = true;
      AppMethodBeat.o(40387);
      break;
      if (cvk())
        localObject = new DynamicGridView.i(this, 0, 0);
      else
        localObject = new c(0, 0);
    }
  }

  private void cvg()
  {
    AppMethodBeat.i(40389);
    this.rLt = n(this.rLh);
    AppMethodBeat.o(40389);
  }

  private void cvh()
  {
    AppMethodBeat.i(40392);
    this.rLM.removeMessages(1);
    View localView = kP(this.rLr);
    Rect localRect;
    if (this.rLh != null)
    {
      localRect = new Rect(this.rLh);
      localRect.offset(0, this.rLh.height() >>> 1);
    }
    while (true)
    {
      if ((this.rLD != null) && (this.rLD.m(localRect)) && (cvf()))
      {
        this.rLg = null;
        cvl();
        if (this.rLC != null)
          this.rLC.cvd();
      }
      while (true)
      {
        if (this.rLD != null)
          this.rLD.cvc();
        AppMethodBeat.o(40392);
        return;
        if ((localView != null) && ((this.rLs) || (this.rLv)))
        {
          this.rLs = false;
          this.rLv = false;
          this.rLt = false;
          this.mActivePointerId = -1;
          this.rLh.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          new StringBuilder("animating to  ").append(this.rLh);
          if (Build.VERSION.SDK_INT > 11)
          {
            dY(localView);
          }
          else
          {
            this.rLg.setBounds(this.rLh);
            invalidate();
            dZ(localView);
          }
        }
        else
        {
          cvl();
        }
      }
      localRect = null;
    }
  }

  @TargetApi(11)
  private void cvi()
  {
    AppMethodBeat.i(40393);
    Object localObject = new TypeEvaluator()
    {
      private static int e(int paramAnonymousInt1, int paramAnonymousInt2, float paramAnonymousFloat)
      {
        return (int)(paramAnonymousInt1 + (paramAnonymousInt2 - paramAnonymousInt1) * paramAnonymousFloat);
      }
    };
    localObject = ObjectAnimator.ofObject(this.rLg, "bounds", (TypeEvaluator)localObject, new Object[] { this.rLh });
    ((ObjectAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        AppMethodBeat.i(40348);
        DynamicGridView.this.invalidate();
        AppMethodBeat.o(40348);
      }
    });
    ((ObjectAnimator)localObject).addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(40350);
        DynamicGridView.a(DynamicGridView.this, false);
        DynamicGridView.b(DynamicGridView.this);
        AppMethodBeat.o(40350);
      }

      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(40349);
        DynamicGridView.a(DynamicGridView.this, true);
        DynamicGridView.b(DynamicGridView.this);
        AppMethodBeat.o(40349);
      }
    });
    ((ObjectAnimator)localObject).setDuration(10L);
    ((ObjectAnimator)localObject).start();
    AppMethodBeat.o(40393);
  }

  static boolean cvj()
  {
    if (Build.VERSION.SDK_INT >= 11);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean cvk()
  {
    if (Build.VERSION.SDK_INT < 21);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void cvl()
  {
    AppMethodBeat.i(40396);
    View localView = kP(this.rLr);
    if (localView == null)
      AppMethodBeat.o(40396);
    while (true)
    {
      return;
      if (this.rLs)
        dZ(localView);
      this.rLs = false;
      this.rLt = false;
      this.mActivePointerId = -1;
      AppMethodBeat.o(40396);
    }
  }

  private void cvm()
  {
    AppMethodBeat.i(40397);
    int i = this.rLo - this.rLn;
    int j = this.rLp - this.rLm;
    int k = this.rLi.centerY() + this.rLk + i;
    int m = this.rLi.centerX() + this.rLl + j;
    this.rLL = kP(this.rLr);
    if (this.rLL == null)
    {
      AppMethodBeat.o(40397);
      return;
    }
    Object localObject = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    Point localPoint1 = ea(this.rLL);
    Iterator localIterator = this.idList.iterator();
    label113: int n;
    if (localIterator.hasNext())
    {
      View localView = kP(((Long)localIterator.next()).longValue());
      if (localView == null)
        break label903;
      Point localPoint2 = ea(localView);
      if ((localPoint2.y < localPoint1.y) && (localPoint2.x > localPoint1.x))
      {
        n = 1;
        label184: label343: label492: if ((n == 0) || (k >= localView.getBottom()) || (m <= localView.getLeft()))
        {
          if ((localPoint2.y >= localPoint1.y) || (localPoint2.x >= localPoint1.x))
            break label634;
          n = 1;
          label237: if ((n == 0) || (k >= localView.getBottom()) || (m >= localView.getRight()))
          {
            if ((localPoint2.y <= localPoint1.y) || (localPoint2.x <= localPoint1.x))
              break label640;
            n = 1;
            if ((n == 0) || (k <= localView.getTop()) || (m <= localView.getLeft()))
            {
              if ((localPoint2.y <= localPoint1.y) || (localPoint2.x >= localPoint1.x))
                break label646;
              n = 1;
              if ((n == 0) || (k <= localView.getTop()) || (m >= localView.getRight()))
              {
                if ((localPoint2.y >= localPoint1.y) || (localPoint2.x != localPoint1.x))
                  break label652;
                n = 1;
                if ((n == 0) || (k >= localView.getBottom() - this.rLq))
                {
                  if ((localPoint2.y <= localPoint1.y) || (localPoint2.x != localPoint1.x))
                    break label658;
                  n = 1;
                  if ((n == 0) || (k <= localView.getTop() + this.rLq))
                  {
                    if ((localPoint2.y != localPoint1.y) || (localPoint2.x <= localPoint1.x))
                      break label664;
                    n = 1;
                    if ((n == 0) || (m <= localView.getLeft() + this.rLq))
                    {
                      if ((localPoint2.y != localPoint1.y) || (localPoint2.x >= localPoint1.x))
                        break label670;
                      n = 1;
                      if ((n == 0) || (m >= localView.getRight() - this.rLq))
                        break label903;
                    }
                  }
                }
              }
            }
          }
        }
        label290: label444: float f3 = Math.abs(f.dS(localView) - f.dS(this.rLL));
        label396: label541: float f4 = Math.abs(f.dT(localView) - f.dT(this.rLL));
        if ((f3 < f1) || (f4 < f2))
          break label903;
        f1 = f3;
        localObject = localView;
        f2 = f4;
      }
    }
    label640: label646: label903: 
    while (true)
    {
      break label113;
      n = 0;
      break label184;
      label634: n = 0;
      break label237;
      n = 0;
      break label290;
      n = 0;
      break label343;
      label652: n = 0;
      break label396;
      label658: n = 0;
      break label444;
      label664: n = 0;
      break label492;
      label670: n = 0;
      break label541;
      if (localObject != null)
      {
        k = getPositionForView(this.rLL);
        n = getPositionForView((View)localObject);
        new StringBuilder("switch ").append(k).append(",").append(n);
        localObject = getAdapterInterface();
        if ((n == -1) || (!((d)localObject).Et(k)) || (!((d)localObject).Et(n)))
        {
          kN(this.rLr);
          AppMethodBeat.o(40397);
          break;
        }
        fC(k, n);
        if (this.rLH)
          this.rLJ.fD(k, n);
        this.rLn = this.rLo;
        this.rLm = this.rLp;
        if ((!cvj()) || (!cvk()))
          break label867;
        localObject = new b(j, i);
      }
      while (true)
      {
        kN(this.rLr);
        ((DynamicGridView.j)localObject).fE(k, n);
        AppMethodBeat.o(40397);
        break;
        label867: if (cvk())
          localObject = new DynamicGridView.i(this, j, i);
        else
          localObject = new c(j, i);
      }
    }
  }

  @TargetApi(11)
  private void dU(View paramView)
  {
    AppMethodBeat.i(40375);
    paramView = dW(paramView);
    paramView.setFloatValues(new float[] { -2.0F, 2.0F });
    paramView.start();
    this.rLw.add(paramView);
    AppMethodBeat.o(40375);
  }

  @TargetApi(11)
  private void dV(View paramView)
  {
    AppMethodBeat.i(40376);
    paramView = dW(paramView);
    paramView.setFloatValues(new float[] { 2.0F, -2.0F });
    paramView.start();
    this.rLw.add(paramView);
    AppMethodBeat.o(40376);
  }

  @TargetApi(11)
  private ObjectAnimator dW(View paramView)
  {
    AppMethodBeat.i(40377);
    if (!cvk())
      paramView.setLayerType(1, null);
    ObjectAnimator localObjectAnimator = new ObjectAnimator();
    localObjectAnimator.setDuration(180L);
    localObjectAnimator.setRepeatMode(2);
    localObjectAnimator.setRepeatCount(-1);
    localObjectAnimator.setPropertyName("rotation");
    localObjectAnimator.setTarget(paramView);
    localObjectAnimator.addListener(new DynamicGridView.3(this, paramView));
    AppMethodBeat.o(40377);
    return localObjectAnimator;
  }

  private BitmapDrawable dX(View paramView)
  {
    AppMethodBeat.i(40381);
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    int k = paramView.getTop();
    int m = paramView.getLeft();
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(localBitmap));
    paramView = new BitmapDrawable(getResources(), localBitmap);
    this.rLi = new Rect(m, k, m + i, k + j);
    int n = this.rLi.left;
    int i1 = (int)(i * 0.05F);
    m = this.rLi.top;
    k = (int)(j * 0.05F);
    int i2 = this.rLi.right;
    int i3 = (int)(i * 0.05F);
    i = this.rLi.bottom;
    this.rLh = new Rect(n - i1, m - k, i3 + i2, (int)(j * 0.05F) + i);
    this.rLj = new Rect(this.rLh);
    paramView.setBounds(this.rLi);
    AppMethodBeat.o(40381);
    return paramView;
  }

  @TargetApi(11)
  private void dY(View paramView)
  {
    AppMethodBeat.i(40394);
    Object localObject = new DynamicGridView.7(this);
    localObject = ObjectAnimator.ofObject(this.rLg, "bounds", (TypeEvaluator)localObject, new Object[] { this.rLh });
    ((ObjectAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        AppMethodBeat.i(40352);
        DynamicGridView.this.invalidate();
        AppMethodBeat.o(40352);
      }
    });
    ((ObjectAnimator)localObject).addListener(new DynamicGridView.9(this, paramView));
    ((ObjectAnimator)localObject).setDuration(200L);
    ((ObjectAnimator)localObject).start();
    AppMethodBeat.o(40394);
  }

  private void dZ(View paramView)
  {
    AppMethodBeat.i(40395);
    this.idList.clear();
    this.rLr = -1L;
    paramView.setVisibility(0);
    this.rLg = null;
    if ((cvj()) && (this.rLz))
    {
      if (!this.lBk)
        break label97;
      lo(false);
      cve();
    }
    while (true)
    {
      for (int i = 0; i < getLastVisiblePosition() - getFirstVisiblePosition(); i++)
      {
        paramView = getChildAt(i);
        if (paramView != null)
          paramView.setVisibility(0);
      }
      label97: lo(true);
    }
    invalidate();
    AppMethodBeat.o(40395);
  }

  @TargetApi(11)
  private static AnimatorSet e(View paramView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(40400);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramView, "translationX", new float[] { paramFloat1, 0.0F });
    paramView = ObjectAnimator.ofFloat(paramView, "translationY", new float[] { paramFloat2, 0.0F });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator, paramView });
    AppMethodBeat.o(40400);
    return localAnimatorSet;
  }

  private Point ea(View paramView)
  {
    AppMethodBeat.i(40398);
    int i = getPositionForView(paramView);
    int j = getColumnCount();
    paramView = new Point(i % j, i / j);
    AppMethodBeat.o(40398);
    return paramView;
  }

  private void fC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40378);
    getAdapterInterface().fB(paramInt1, paramInt2);
    AppMethodBeat.o(40378);
  }

  private d getAdapterInterface()
  {
    AppMethodBeat.i(40380);
    d locald = (d)getAdapter();
    AppMethodBeat.o(40380);
    return locald;
  }

  private int getColumnCount()
  {
    AppMethodBeat.i(40379);
    int i = getAdapterInterface().getColumnCount();
    AppMethodBeat.o(40379);
    return i;
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(40374);
    super.setOnScrollListener(this.rLS);
    this.rLu = ((int)(paramContext.getResources().getDisplayMetrics().density * 8.0F + 0.5F));
    this.rLq = getResources().getDimensionPixelSize(2131428300);
    AppMethodBeat.o(40374);
  }

  private void kN(long paramLong)
  {
    AppMethodBeat.i(40382);
    this.idList.clear();
    int i = kO(paramLong);
    for (int j = getFirstVisiblePosition(); j <= getLastVisiblePosition(); j++)
      if ((i != j) && (getAdapterInterface().Et(j)))
        this.idList.add(Long.valueOf(Ez(j)));
    AppMethodBeat.o(40382);
  }

  private boolean n(Rect paramRect)
  {
    boolean bool = true;
    AppMethodBeat.i(40390);
    int i = computeVerticalScrollOffset();
    int j = getHeight();
    int k = computeVerticalScrollExtent();
    int m = computeVerticalScrollRange();
    int n = paramRect.top;
    int i1 = paramRect.height();
    if ((n <= 0) && (i > 0))
    {
      smoothScrollBy(-this.rLu, 0);
      AppMethodBeat.o(40390);
    }
    while (true)
    {
      return bool;
      if ((n + i1 >= j) && (i + k < m))
      {
        smoothScrollBy(this.rLu, 0);
        AppMethodBeat.o(40390);
      }
      else
      {
        AppMethodBeat.o(40390);
        bool = false;
      }
    }
  }

  public final void Ex(int paramInt)
  {
    AppMethodBeat.i(40369);
    if (!this.rLA)
      AppMethodBeat.o(40369);
    while (true)
    {
      return;
      requestDisallowInterceptTouchEvent(true);
      if ((cvj()) && (this.rLz))
        cve();
      if (paramInt != -1)
      {
        this.lBk = Ey(paramInt);
        if (this.lBk)
          this.rLs = true;
      }
      AppMethodBeat.o(40369);
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(40401);
    super.dispatchDraw(paramCanvas);
    if (this.rLg != null)
      this.rLg.draw(paramCanvas);
    AppMethodBeat.o(40401);
  }

  public final int kO(long paramLong)
  {
    AppMethodBeat.i(40383);
    View localView = kP(paramLong);
    int i;
    if (localView == null)
    {
      i = -1;
      AppMethodBeat.o(40383);
    }
    while (true)
    {
      return i;
      i = getPositionForView(localView);
      AppMethodBeat.o(40383);
    }
  }

  public final View kP(long paramLong)
  {
    AppMethodBeat.i(40384);
    int i = getFirstVisiblePosition();
    ListAdapter localListAdapter = getAdapter();
    int j = 0;
    View localView;
    if (j < getChildCount())
    {
      localView = getChildAt(j);
      if (localListAdapter.getItemId(i + j) == paramLong)
        AppMethodBeat.o(40384);
    }
    while (true)
    {
      return localView;
      j++;
      break;
      localView = null;
      AppMethodBeat.o(40384);
    }
  }

  @TargetApi(11)
  final void lo(boolean paramBoolean)
  {
    AppMethodBeat.i(40373);
    Object localObject = this.rLw.iterator();
    while (((Iterator)localObject).hasNext())
      ((Animator)((Iterator)localObject).next()).cancel();
    this.rLw.clear();
    for (int i = 0; i < getChildCount(); i++)
    {
      localObject = getChildAt(i);
      if (localObject != null)
      {
        if (paramBoolean)
          ((View)localObject).setRotation(0.0F);
        ((View)localObject).setTag(2131820591, Boolean.FALSE);
      }
    }
    AppMethodBeat.o(40373);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(40385);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    new StringBuilder("onInterceptTouchEvent ").append(paramMotionEvent.getAction()).append(" ").append(bool);
    AppMethodBeat.o(40385);
    return bool;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(40386);
    int i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
    new StringBuilder("onTouchEvent ").append(paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 4:
    case 5:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 6:
    }
    while (true)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(40386);
      Object localObject;
      while (true)
      {
        return bool;
        this.rLO = paramMotionEvent.getX();
        this.rLP = paramMotionEvent.getY();
        this.rLN = f.a(this, paramMotionEvent.getX(), paramMotionEvent.getY());
        new StringBuilder("onTouchEvent ").append(paramMotionEvent.getAction()).append(",downPos ").append(this.rLN);
        if ((!this.rLx) && (this.rLN >= 0))
        {
          localObject = this.rLM;
          ((DynamicGridView.d)localObject).removeMessages(1);
          ((DynamicGridView.d)localObject).sendEmptyMessageDelayed(1, 300L);
        }
        this.rLo = -1;
        this.rLp = -1;
        this.rLm = ((int)paramMotionEvent.getX());
        this.rLn = ((int)paramMotionEvent.getY());
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
        if ((this.lBk) && (isEnabled()))
        {
          layoutChildren();
          Ey(pointToPosition(this.rLm, this.rLn));
          break;
        }
        if (isEnabled())
          break;
        AppMethodBeat.o(40386);
        continue;
        this.rLO = paramMotionEvent.getX();
        this.rLP = paramMotionEvent.getY();
        if ((!this.rLs) || (this.mActivePointerId == -1) || (i == -1))
          break;
        if ((this.rLp == -1) && (this.rLo == -1))
        {
          this.rLo = ((int)paramMotionEvent.getY(i));
          this.rLp = ((int)paramMotionEvent.getX(i));
          this.rLm = this.rLp;
          this.rLn = this.rLo;
          break;
        }
        this.rLQ = paramMotionEvent.getRawX();
        this.rLR = paramMotionEvent.getRawY();
        this.rLo = ((int)paramMotionEvent.getY(i));
        this.rLp = ((int)paramMotionEvent.getX(i));
        int j = this.rLo;
        i = this.rLn;
        int k = this.rLp;
        int m = this.rLm;
        this.rLh.offsetTo(k - m + this.rLj.left + this.rLl, j - i + this.rLj.top + this.rLk);
        if (this.rLg != null)
          this.rLg.setBounds(this.rLh);
        invalidate();
        cvm();
        this.rLt = false;
        cvg();
        if (this.rLD != null)
        {
          paramMotionEvent = new Rect(this.rLh);
          paramMotionEvent.offset(0, this.rLh.height() >>> 1);
          this.rLD.l(paramMotionEvent);
        }
        AppMethodBeat.o(40386);
      }
      cvh();
      if ((this.rLH) && (this.rLJ != null))
      {
        localObject = this.rLJ;
        Collections.reverse(((a)localObject).rLZ);
        if (!((a)localObject).rLZ.isEmpty())
        {
          this.rLI.push(this.rLJ);
          this.rLJ = new a();
          continue;
          cvl();
          cvh();
          continue;
          if (paramMotionEvent.getPointerId((paramMotionEvent.getAction() & 0xFF00) >> 8) == this.mActivePointerId)
            cvh();
        }
      }
    }
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(40391);
    super.setAdapter(paramListAdapter);
    AppMethodBeat.o(40391);
  }

  public void setEditModeEnabled(boolean paramBoolean)
  {
    this.rLA = paramBoolean;
  }

  public void setOnDragListener(DynamicGridView.e parame)
  {
    this.rLD = parame;
  }

  public void setOnDropListener(DynamicGridView.f paramf)
  {
    this.rLC = paramf;
  }

  public void setOnEditModeChangeListener(DynamicGridView.g paramg)
  {
    this.rLE = paramg;
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    AppMethodBeat.i(40370);
    this.rLF = paramOnItemClickListener;
    super.setOnItemClickListener(this.rLG);
    AppMethodBeat.o(40370);
  }

  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.rLB = paramOnScrollListener;
  }

  public void setOnSelectedItemBitmapCreationListener(DynamicGridView.h paramh)
  {
    this.rLK = paramh;
  }

  public void setUndoSupportEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(40371);
    if (this.rLH != paramBoolean)
      if (!paramBoolean)
        break label41;
    label41: for (this.rLI = new Stack(); ; this.rLI = null)
    {
      this.rLH = paramBoolean;
      AppMethodBeat.o(40371);
      return;
    }
  }

  public void setWobbleInEditMode(boolean paramBoolean)
  {
    this.rLz = paramBoolean;
  }

  static final class a
  {
    List<Pair<Integer, Integer>> rLZ;

    a()
    {
      AppMethodBeat.i(40357);
      this.rLZ = new Stack();
      AppMethodBeat.o(40357);
    }

    public final void fD(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(40358);
      this.rLZ.add(new Pair(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2)));
      AppMethodBeat.o(40358);
    }
  }

  final class b
    implements DynamicGridView.j
  {
    private int yH;
    private int yI;

    static
    {
      AppMethodBeat.i(40361);
      if (!DynamicGridView.class.desiredAssertionStatus());
      for (boolean bool = true; ; bool = false)
      {
        $assertionsDisabled = bool;
        AppMethodBeat.o(40361);
        return;
      }
    }

    public b(int paramInt1, int arg3)
    {
      this.yH = paramInt1;
      int i;
      this.yI = i;
    }

    public final void fE(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(40360);
      if ((!$assertionsDisabled) && (DynamicGridView.g(DynamicGridView.this) == null))
      {
        AssertionError localAssertionError = new AssertionError();
        AppMethodBeat.o(40360);
        throw localAssertionError;
      }
      DynamicGridView.this.getViewTreeObserver().addOnPreDrawListener(new DynamicGridView.b.a(this, DynamicGridView.g(DynamicGridView.this), paramInt1, paramInt2));
      DynamicGridView.b(DynamicGridView.this, DynamicGridView.this.kP(DynamicGridView.h(DynamicGridView.this)));
      AppMethodBeat.o(40360);
    }
  }

  final class c
    implements DynamicGridView.j
  {
    int yH;
    int yI;

    public c(int paramInt1, int arg3)
    {
      this.yH = paramInt1;
      int i;
      this.yI = i;
    }

    public final void fE(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(40364);
      DynamicGridView.this.getViewTreeObserver().addOnPreDrawListener(new DynamicGridView.c.a(this, paramInt1, paramInt2));
      AppMethodBeat.o(40364);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView
 * JD-Core Version:    0.6.2
 */