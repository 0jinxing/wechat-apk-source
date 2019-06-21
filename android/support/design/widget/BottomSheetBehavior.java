package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.design.a.a;
import android.support.v4.c.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.t;
import android.support.v4.widget.t.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V>
{
  int mActivePointerId;
  int mState = 4;
  private VelocityTracker mVelocityTracker;
  private float nd;
  private int ne;
  private boolean nf;
  private int ng;
  int nh;
  int ni;
  public boolean nj;
  private boolean nk;
  t nl;
  private boolean nm;
  private int nn;
  private boolean no;
  int np;
  WeakReference<V> nq;
  WeakReference<View> nr;
  public BottomSheetBehavior.a ns;
  private int nt;
  boolean nu;
  private final t.a nv = new t.a()
  {
    public final void N(int paramAnonymousInt)
    {
      if (paramAnonymousInt == 1)
        BottomSheetBehavior.this.L(1);
    }

    public final void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      int i = 3;
      int j;
      if (paramAnonymousFloat2 < 0.0F)
      {
        j = BottomSheetBehavior.this.nh;
        if (!BottomSheetBehavior.this.nl.D(paramAnonymousView.getLeft(), j))
          break label184;
        BottomSheetBehavior.this.L(2);
        s.b(paramAnonymousView, new BottomSheetBehavior.b(BottomSheetBehavior.this, paramAnonymousView, i));
      }
      while (true)
      {
        return;
        if ((BottomSheetBehavior.this.nj) && (BottomSheetBehavior.this.a(paramAnonymousView, paramAnonymousFloat2)))
        {
          j = BottomSheetBehavior.this.np;
          i = 5;
          break;
        }
        if (paramAnonymousFloat2 == 0.0F)
        {
          j = paramAnonymousView.getTop();
          if (Math.abs(j - BottomSheetBehavior.this.nh) < Math.abs(j - BottomSheetBehavior.this.ni))
          {
            j = BottomSheetBehavior.this.nh;
            break;
          }
          j = BottomSheetBehavior.this.ni;
          i = 4;
          break;
        }
        j = BottomSheetBehavior.this.ni;
        i = 4;
        break;
        label184: BottomSheetBehavior.this.L(i);
      }
    }

    public final void b(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      BottomSheetBehavior.this.M(paramAnonymousInt2);
    }

    public final boolean b(View paramAnonymousView, int paramAnonymousInt)
    {
      boolean bool;
      if (BottomSheetBehavior.this.mState == 1)
        bool = false;
      while (true)
      {
        return bool;
        if (BottomSheetBehavior.this.nu)
        {
          bool = false;
        }
        else if ((BottomSheetBehavior.this.mState == 3) && (BottomSheetBehavior.this.mActivePointerId == paramAnonymousInt))
        {
          View localView = (View)BottomSheetBehavior.this.nr.get();
          if ((localView != null) && (localView.canScrollVertically(-1)))
            bool = false;
        }
        else if ((BottomSheetBehavior.this.nq != null) && (BottomSheetBehavior.this.nq.get() == paramAnonymousView))
        {
          bool = true;
        }
        else
        {
          bool = false;
        }
      }
    }

    public final int bL()
    {
      if (BottomSheetBehavior.this.nj);
      for (int i = BottomSheetBehavior.this.np - BottomSheetBehavior.this.nh; ; i = BottomSheetBehavior.this.ni - BottomSheetBehavior.this.nh)
        return i;
    }

    public final int c(View paramAnonymousView, int paramAnonymousInt)
    {
      int i = BottomSheetBehavior.this.nh;
      if (BottomSheetBehavior.this.nj);
      for (int j = BottomSheetBehavior.this.np; ; j = BottomSheetBehavior.this.ni)
        return a.clamp(paramAnonymousInt, i, j);
    }

    public final int d(View paramAnonymousView, int paramAnonymousInt)
    {
      return paramAnonymousView.getLeft();
    }
  };

  public BottomSheetBehavior()
  {
  }

  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.BottomSheetBehavior_Layout);
    paramAttributeSet = localTypedArray.peekValue(0);
    if ((paramAttributeSet != null) && (paramAttributeSet.data == -1))
      K(paramAttributeSet.data);
    while (true)
    {
      this.nj = localTypedArray.getBoolean(1, false);
      this.nk = localTypedArray.getBoolean(2, false);
      localTypedArray.recycle();
      this.nd = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
      return;
      K(localTypedArray.getDimensionPixelSize(0, -1));
    }
  }

  private View i(View paramView)
  {
    if (s.aq(paramView));
    while (true)
    {
      return paramView;
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i = localViewGroup.getChildCount();
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label59;
          paramView = i(localViewGroup.getChildAt(j));
          if (paramView != null)
            break;
        }
      }
      label59: paramView = null;
    }
  }

  public static <V extends View> BottomSheetBehavior<V> j(V paramV)
  {
    paramV = paramV.getLayoutParams();
    if (!(paramV instanceof CoordinatorLayout.d))
      throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    paramV = ((CoordinatorLayout.d)paramV).pH;
    if (!(paramV instanceof BottomSheetBehavior))
      throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    return (BottomSheetBehavior)paramV;
  }

  private void reset()
  {
    this.mActivePointerId = -1;
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }

  public final boolean J(int paramInt)
  {
    boolean bool = false;
    this.nn = 0;
    this.no = false;
    if ((paramInt & 0x2) != 0)
      bool = true;
    return bool;
  }

  public final void K(int paramInt)
  {
    int i = 1;
    if (paramInt == -1)
    {
      if (this.nf)
        break label104;
      this.nf = true;
      paramInt = i;
    }
    while (true)
    {
      if ((paramInt != 0) && (this.mState == 4) && (this.nq != null))
      {
        View localView = (View)this.nq.get();
        if (localView != null)
          localView.requestLayout();
      }
      return;
      if ((this.nf) || (this.ne != paramInt))
      {
        this.nf = false;
        this.ne = Math.max(0, paramInt);
        this.ni = (this.np - paramInt);
        paramInt = i;
      }
      else
      {
        label104: paramInt = 0;
      }
    }
  }

  final void L(int paramInt)
  {
    if (this.mState == paramInt);
    while (true)
    {
      return;
      this.mState = paramInt;
      if (((View)this.nq.get() != null) && (this.ns != null))
        this.ns.O(paramInt);
    }
  }

  final void M(int paramInt)
  {
    if (((View)this.nq.get() != null) && (this.ns != null))
    {
      if (paramInt <= this.ni)
        break label54;
      this.ns.h((this.ni - paramInt) / (this.np - this.ni));
    }
    while (true)
    {
      return;
      label54: this.ns.h((this.ni - paramInt) / (this.ni - this.nh));
    }
  }

  public final void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable)
  {
    paramParcelable = (BottomSheetBehavior.SavedState)paramParcelable;
    super.a(paramCoordinatorLayout, paramV, paramParcelable.LC);
    if ((paramParcelable.state == 1) || (paramParcelable.state == 2));
    for (this.mState = 4; ; this.mState = paramParcelable.state)
      return;
  }

  final void a(View paramView, int paramInt)
  {
    int i;
    if (paramInt == 4)
    {
      i = this.ni;
      if (!this.nl.h(paramView, paramView.getLeft(), i))
        break label96;
      L(2);
      s.b(paramView, new BottomSheetBehavior.b(this, paramView, paramInt));
    }
    while (true)
    {
      return;
      if (paramInt == 3)
      {
        i = this.nh;
        break;
      }
      if ((this.nj) && (paramInt == 5))
      {
        i = this.np;
        break;
      }
      throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(paramInt)));
      label96: L(paramInt);
    }
  }

  public final void a(V paramV, View paramView)
  {
    int i = 3;
    if (paramV.getTop() == this.nh)
    {
      L(3);
      return;
    }
    int j;
    if ((this.nr != null) && (paramView == this.nr.get()) && (this.no))
    {
      if (this.nn <= 0)
        break label101;
      j = this.nh;
      label57: if (!this.nl.h(paramV, paramV.getLeft(), j))
        break label219;
      L(2);
      s.b(paramV, new BottomSheetBehavior.b(this, paramV, i));
    }
    while (true)
    {
      this.no = false;
      break;
      break;
      label101: if (this.nj)
      {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.nd);
        if (a(paramV, this.mVelocityTracker.getYVelocity(this.mActivePointerId)))
        {
          j = this.np;
          i = 5;
          break label57;
        }
      }
      if (this.nn == 0)
      {
        j = paramV.getTop();
        if (Math.abs(j - this.nh) < Math.abs(j - this.ni))
        {
          j = this.nh;
          break label57;
        }
        j = this.ni;
        i = 4;
        break label57;
      }
      j = this.ni;
      i = 4;
      break label57;
      label219: L(i);
    }
  }

  public final void a(V paramV, View paramView, int paramInt, int[] paramArrayOfInt)
  {
    if (paramView != (View)this.nr.get())
      return;
    int i = paramV.getTop();
    int j = i - paramInt;
    if (paramInt > 0)
      if (j < this.nh)
      {
        paramArrayOfInt[1] = (i - this.nh);
        s.q(paramV, -paramArrayOfInt[1]);
        L(3);
      }
    while (true)
    {
      M(paramV.getTop());
      this.nn = paramInt;
      this.no = true;
      break;
      paramArrayOfInt[1] = paramInt;
      s.q(paramV, -paramInt);
      L(1);
      continue;
      if ((paramInt < 0) && (!paramView.canScrollVertically(-1)))
        if ((j <= this.ni) || (this.nj))
        {
          paramArrayOfInt[1] = paramInt;
          s.q(paramV, -paramInt);
          L(1);
        }
        else
        {
          paramArrayOfInt[1] = (i - this.ni);
          s.q(paramV, -paramArrayOfInt[1]);
          L(4);
        }
    }
  }

  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    if ((s.al(paramCoordinatorLayout)) && (!s.al(paramV)))
      s.e(paramV, true);
    int i = paramV.getTop();
    paramCoordinatorLayout.e(paramV, paramInt);
    this.np = paramCoordinatorLayout.getHeight();
    if (this.nf)
    {
      if (this.ng == 0)
        this.ng = paramCoordinatorLayout.getResources().getDimensionPixelSize(2131428281);
      paramInt = Math.max(this.ng, this.np - paramCoordinatorLayout.getWidth() * 9 / 16);
      this.nh = Math.max(0, this.np - paramV.getHeight());
      this.ni = Math.max(this.np - paramInt, this.nh);
      if (this.mState != 3)
        break label197;
      s.q(paramV, this.nh);
    }
    while (true)
    {
      if (this.nl == null)
        this.nl = t.a(paramCoordinatorLayout, this.nv);
      this.nq = new WeakReference(paramV);
      this.nr = new WeakReference(i(paramV));
      return true;
      paramInt = this.ne;
      break;
      label197: if ((this.nj) && (this.mState == 5))
        s.q(paramV, this.np);
      else if (this.mState == 4)
        s.q(paramV, this.ni);
      else if ((this.mState == 1) || (this.mState == 2))
        s.q(paramV, i - paramV.getTop());
    }
  }

  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!paramV.isShown())
    {
      this.nm = true;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      int i = paramMotionEvent.getActionMasked();
      if (i == 0)
        reset();
      if (this.mVelocityTracker == null)
        this.mVelocityTracker = VelocityTracker.obtain();
      this.mVelocityTracker.addMovement(paramMotionEvent);
      switch (i)
      {
      case 2:
      default:
      case 1:
      case 3:
      case 0:
      }
      while (true)
        if ((!this.nm) && (this.nl.f(paramMotionEvent)))
        {
          bool2 = true;
          break;
          this.nu = false;
          this.mActivePointerId = -1;
          if (this.nm)
          {
            this.nm = false;
            bool2 = bool1;
            break;
            int j = (int)paramMotionEvent.getX();
            this.nt = ((int)paramMotionEvent.getY());
            View localView;
            if (this.nr != null)
            {
              localView = (View)this.nr.get();
              label180: if ((localView != null) && (paramCoordinatorLayout.d(localView, j, this.nt)))
              {
                this.mActivePointerId = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
                this.nu = true;
              }
              if ((this.mActivePointerId != -1) || (paramCoordinatorLayout.d(paramV, j, this.nt)))
                break label257;
            }
            label257: for (bool2 = true; ; bool2 = false)
            {
              this.nm = bool2;
              break;
              localView = null;
              break label180;
            }
          }
        }
      paramV = (View)this.nr.get();
      bool2 = bool1;
      if (i == 2)
      {
        bool2 = bool1;
        if (paramV != null)
        {
          bool2 = bool1;
          if (!this.nm)
          {
            bool2 = bool1;
            if (this.mState != 1)
            {
              bool2 = bool1;
              if (!paramCoordinatorLayout.d(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
              {
                bool2 = bool1;
                if (Math.abs(this.nt - paramMotionEvent.getY()) > this.nl.mTouchSlop)
                  bool2 = true;
              }
            }
          }
        }
      }
    }
  }

  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
  {
    if ((paramView == this.nr.get()) && ((this.mState != 3) || (super.a(paramCoordinatorLayout, paramV, paramView, paramFloat1, paramFloat2))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean a(View paramView, float paramFloat)
  {
    boolean bool = true;
    if (this.nk);
    while (true)
    {
      return bool;
      if (paramView.getTop() < this.ni)
        bool = false;
      else if (Math.abs(paramView.getTop() + 0.1F * paramFloat - this.ni) / this.ne <= 0.5F)
        bool = false;
    }
  }

  public final Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return new BottomSheetBehavior.SavedState(super.b(paramCoordinatorLayout, paramV), this.mState);
  }

  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    if (!paramV.isShown());
    while (true)
    {
      return bool;
      int i = paramMotionEvent.getActionMasked();
      if ((this.mState == 1) && (i == 0))
      {
        bool = true;
      }
      else
      {
        if (this.nl != null)
          this.nl.g(paramMotionEvent);
        if (i == 0)
          reset();
        if (this.mVelocityTracker == null)
          this.mVelocityTracker = VelocityTracker.obtain();
        this.mVelocityTracker.addMovement(paramMotionEvent);
        if ((i == 2) && (!this.nm) && (Math.abs(this.nt - paramMotionEvent.getY()) > this.nl.mTouchSlop))
          this.nl.u(paramV, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
        if (!this.nm)
          bool = true;
      }
    }
  }

  public final void setState(int paramInt)
  {
    if (paramInt == this.mState);
    while (true)
    {
      return;
      if (this.nq == null)
      {
        if ((paramInt == 4) || (paramInt == 3) || ((this.nj) && (paramInt == 5)))
          this.mState = paramInt;
      }
      else
      {
        View localView = (View)this.nq.get();
        if (localView != null)
        {
          ViewParent localViewParent = localView.getParent();
          if ((localViewParent != null) && (localViewParent.isLayoutRequested()) && (s.av(localView)))
            localView.post(new BottomSheetBehavior.1(this, localView, paramInt));
          else
            a(localView, paramInt);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomSheetBehavior
 * JD-Core Version:    0.6.2
 */