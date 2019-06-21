package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.b.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.n;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.p.a;
import android.support.v7.view.menu.s;
import android.support.v7.view.menu.u;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

final class ActionMenuPresenter extends android.support.v7.view.menu.b
  implements b.a
{
  private int adA;
  private int adB;
  private int adC;
  private boolean adD;
  private boolean adE;
  private boolean adF;
  boolean adG;
  private int adH;
  private final SparseBooleanArray adI = new SparseBooleanArray();
  private View adJ;
  e adK;
  a adL;
  c adM;
  private b adN;
  final f adO = new f();
  int adP;
  d adv;
  Drawable adw;
  boolean adx;
  private boolean ady;
  private boolean adz;

  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext);
  }

  public final void F(boolean paramBoolean)
  {
    if (paramBoolean)
      super.a(null);
    while (true)
    {
      return;
      if (this.lo != null)
        this.lo.U(false);
    }
  }

  public final View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramj.getActionView();
    if ((localView == null) || (paramj.gN()))
      localView = super.a(paramj, paramView, paramViewGroup);
    if (paramj.isActionViewExpanded());
    for (int i = 8; ; i = 0)
    {
      localView.setVisibility(i);
      paramView = (ActionMenuView)paramViewGroup;
      paramj = localView.getLayoutParams();
      if (!paramView.checkLayoutParams(paramj))
        localView.setLayoutParams(ActionMenuView.b(paramj));
      return localView;
    }
  }

  public final void a(Context paramContext, h paramh)
  {
    boolean bool = true;
    super.a(paramContext, paramh);
    paramh = paramContext.getResources();
    paramContext = android.support.v7.view.a.X(paramContext);
    int i;
    if (!this.adz)
    {
      if (Build.VERSION.SDK_INT >= 19)
        this.ady = bool;
    }
    else
    {
      if (!this.adF)
        this.adA = (paramContext.mContext.getResources().getDisplayMetrics().widthPixels / 2);
      if (!this.adD)
        this.adC = paramContext.fY();
      i = this.adA;
      if (!this.ady)
        break label218;
      if (this.adv == null)
      {
        this.adv = new d(this.aak);
        if (this.adx)
        {
          this.adv.setImageDrawable(this.adw);
          this.adw = null;
          this.adx = false;
        }
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.adv.measure(j, j);
      }
      i -= this.adv.getMeasuredWidth();
    }
    while (true)
    {
      this.adB = i;
      this.adH = ((int)(56.0F * paramh.getDisplayMetrics().density));
      this.adJ = null;
      return;
      if (!ViewConfiguration.get(paramContext.mContext).hasPermanentMenuKey())
        break;
      bool = false;
      break;
      label218: this.adv = null;
    }
  }

  public final void a(h paramh, boolean paramBoolean)
  {
    ha();
    super.a(paramh, paramBoolean);
  }

  public final void a(j paramj, p.a parama)
  {
    parama.a(paramj);
    paramj = (ActionMenuView)this.aao;
    parama = (ActionMenuItemView)parama;
    parama.setItemInvoker(paramj);
    if (this.adN == null)
      this.adN = new b();
    parama.setPopupCallback(this.adN);
  }

  public final void a(ActionMenuView paramActionMenuView)
  {
    this.aao = paramActionMenuView;
    paramActionMenuView.lo = this.lo;
  }

  public final boolean a(u paramu)
  {
    boolean bool = false;
    if (!paramu.hasVisibleItems())
      return bool;
    for (Object localObject1 = paramu; ((u)localObject1).acs != this.lo; localObject1 = (u)((u)localObject1).acs);
    MenuItem localMenuItem = ((u)localObject1).getItem();
    Object localObject2 = (ViewGroup)this.aao;
    int j;
    if (localObject2 != null)
    {
      int i = ((ViewGroup)localObject2).getChildCount();
      j = 0;
      label65: if (j < i)
      {
        localObject1 = ((ViewGroup)localObject2).getChildAt(j);
        if (((localObject1 instanceof p.a)) && (((p.a)localObject1).getItemData() == localMenuItem))
        {
          label101: if (localObject1 == null)
            break label220;
          this.adP = paramu.getItem().getItemId();
          i = paramu.size();
          j = 0;
          label127: if (j >= i)
            break label239;
          localObject2 = paramu.getItem(j);
          if ((!((MenuItem)localObject2).isVisible()) || (((MenuItem)localObject2).getIcon() == null))
            break label222;
        }
      }
    }
    label220: label222: label239: for (bool = true; ; bool = false)
    {
      this.adL = new a(this.mContext, paramu, (View)localObject1);
      this.adL.setForceShowIcon(bool);
      if (!this.adL.gP())
      {
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        j++;
        break label65;
        localObject1 = null;
        break label101;
        break;
        j++;
        break label127;
      }
      super.a(paramu);
      bool = true;
      break;
    }
  }

  public final boolean b(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.adv);
    for (boolean bool = false; ; bool = super.b(paramViewGroup, paramInt))
      return bool;
  }

  public final boolean bt()
  {
    ArrayList localArrayList;
    int i;
    int j;
    int k;
    int m;
    ViewGroup localViewGroup;
    int n;
    int i1;
    int i2;
    int i3;
    label59: Object localObject1;
    if (this.lo != null)
    {
      localArrayList = this.lo.gB();
      i = localArrayList.size();
      j = this.adC;
      k = this.adB;
      m = View.MeasureSpec.makeMeasureSpec(0, 0);
      localViewGroup = (ViewGroup)this.aao;
      n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      if (i3 >= i)
        break label137;
      localObject1 = (j)localArrayList.get(i3);
      if (!((j)localObject1).gL())
        break label117;
      n++;
      label87: if ((!this.adG) || (!((j)localObject1).isActionViewExpanded()))
        break label769;
      j = 0;
    }
    label137: label431: 
    while (true)
    {
      i3++;
      break label59;
      i = 0;
      localArrayList = null;
      break;
      label117: if (((j)localObject1).gK())
      {
        i1++;
        break label87;
      }
      i2 = 1;
      break label87;
      i3 = j;
      if (this.ady)
        if (i2 == 0)
        {
          i3 = j;
          if (n + i1 <= j);
        }
        else
        {
          i3 = j - 1;
        }
      i3 -= n;
      localObject1 = this.adI;
      ((SparseBooleanArray)localObject1).clear();
      j = 0;
      if (this.adE)
      {
        j = k / this.adH;
        i1 = this.adH;
        n = this.adH;
      }
      label311: label609: label621: label627: label757: for (int i4 = k % i1 / j + n; ; i4 = 0)
      {
        n = 0;
        int i5 = 0;
        i1 = k;
        j localj;
        Object localObject2;
        if (i5 < i)
        {
          localj = (j)localArrayList.get(i5);
          if (localj.gL())
          {
            localObject2 = a(localj, this.adJ, localViewGroup);
            if (this.adJ == null)
              this.adJ = ((View)localObject2);
            if (this.adE)
            {
              j -= ActionMenuView.f((View)localObject2, i4, j, m, 0);
              i2 = ((View)localObject2).getMeasuredWidth();
              if (n != 0)
                break label760;
              n = i2;
            }
          }
        }
        label503: label760: 
        while (true)
        {
          k = localj.getGroupId();
          if (k != 0)
            ((SparseBooleanArray)localObject1).put(k, true);
          localj.Y(true);
          i1 -= i2;
          i5++;
          break;
          ((View)localObject2).measure(m, m);
          break label311;
          int i6;
          boolean bool;
          int i7;
          if (localj.gK())
          {
            i6 = localj.getGroupId();
            bool = ((SparseBooleanArray)localObject1).get(i6);
            if (((i3 > 0) || (bool)) && (i1 > 0) && ((!this.adE) || (j > 0)))
            {
              i7 = 1;
              if (i7 == 0)
                break label757;
              localObject2 = a(localj, this.adJ, localViewGroup);
              if (this.adJ == null)
                this.adJ = ((View)localObject2);
              if (!this.adE)
                break label609;
              k = ActionMenuView.f((View)localObject2, i4, j, m, 0);
              i2 = j - k;
              j = i2;
              if (k == 0)
              {
                i7 = 0;
                j = i2;
              }
              k = ((View)localObject2).getMeasuredWidth();
              i1 -= k;
              i2 = n;
              if (n == 0)
                i2 = k;
              if (!this.adE)
                break label627;
              if (i1 < 0)
                break label621;
              n = 1;
              i7 &= n;
              n = i2;
            }
          }
          while (true)
          {
            if ((i7 != 0) && (i6 != 0))
              ((SparseBooleanArray)localObject1).put(i6, true);
            while (true)
            {
              i2 = i3;
              if (i7 != 0)
                i2 = i3 - 1;
              localj.Y(i7);
              i3 = i2;
              break;
              int i8 = 0;
              break label431;
              ((View)localObject2).measure(m, m);
              break label503;
              n = 0;
              break label545;
              if (i1 + i2 > 0);
              for (n = 1; ; n = 0)
              {
                i8 &= n;
                n = i2;
                break;
              }
              if (bool)
              {
                ((SparseBooleanArray)localObject1).put(i6, false);
                k = 0;
                while (true)
                  if (k < i5)
                  {
                    localObject2 = (j)localArrayList.get(k);
                    i2 = i3;
                    if (((j)localObject2).getGroupId() == i6)
                    {
                      i2 = i3;
                      if (((j)localObject2).gJ())
                        i2 = i3 + 1;
                      ((j)localObject2).Y(false);
                    }
                    k++;
                    i3 = i2;
                    continue;
                    localj.Y(false);
                    break;
                    return true;
                  }
              }
            }
          }
        }
      }
    }
  }

  public final boolean e(j paramj)
  {
    return paramj.gJ();
  }

  public final p f(ViewGroup paramViewGroup)
  {
    p localp = this.aao;
    paramViewGroup = super.f(paramViewGroup);
    if (localp != paramViewGroup)
      ((ActionMenuView)paramViewGroup).setPresenter(this);
    return paramViewGroup;
  }

  public final void gY()
  {
    if (!this.adD)
      this.adC = android.support.v7.view.a.X(this.mContext).fY();
    if (this.lo != null)
      this.lo.p(true);
  }

  public final void gZ()
  {
    this.ady = true;
    this.adz = true;
  }

  public final boolean ha()
  {
    return hideOverflowMenu() | hb();
  }

  public final boolean hb()
  {
    if (this.adL != null)
      this.adL.dismiss();
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean hideOverflowMenu()
  {
    boolean bool;
    if ((this.adM != null) && (this.aao != null))
    {
      ((View)this.aao).removeCallbacks(this.adM);
      this.adM = null;
      bool = true;
    }
    while (true)
    {
      return bool;
      e locale = this.adK;
      if (locale != null)
      {
        locale.dismiss();
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }

  public final boolean isOverflowMenuShowing()
  {
    if ((this.adK != null) && (this.adK.isShowing()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void n(boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    super.n(paramBoolean);
    ((View)this.aao).requestLayout();
    Object localObject;
    int m;
    if (this.lo != null)
    {
      localObject = this.lo;
      ((h)localObject).gC();
      localObject = ((h)localObject).abu;
      int k = ((ArrayList)localObject).size();
      for (m = 0; m < k; m++)
      {
        android.support.v4.view.b localb = ((j)((ArrayList)localObject).get(m)).abS;
        if (localb != null)
          localb.LG = this;
      }
    }
    if (this.lo != null)
    {
      localObject = this.lo.gD();
      m = j;
      if (this.ady)
      {
        m = j;
        if (localObject != null)
        {
          m = ((ArrayList)localObject).size();
          if (m != 1)
            break label265;
          if (((j)((ArrayList)localObject).get(0)).isActionViewExpanded())
            break label259;
          m = 1;
        }
      }
      label158: if (m == 0)
        break label282;
      if (this.adv == null)
        this.adv = new d(this.aak);
      localObject = (ViewGroup)this.adv.getParent();
      if (localObject != this.aao)
      {
        if (localObject != null)
          ((ViewGroup)localObject).removeView(this.adv);
        ((ActionMenuView)this.aao).addView(this.adv, ActionMenuView.he());
      }
    }
    while (true)
    {
      ((ActionMenuView)this.aao).setOverflowReserved(this.ady);
      return;
      localObject = null;
      break;
      label259: m = 0;
      break label158;
      label265: if (m > 0);
      for (m = i; ; m = 0)
        break;
      label282: if ((this.adv != null) && (this.adv.getParent() == this.aao))
        ((ViewGroup)this.aao).removeView(this.adv);
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState));
    while (true)
    {
      return;
      paramParcelable = (SavedState)paramParcelable;
      if (paramParcelable.adV > 0)
      {
        paramParcelable = this.lo.findItem(paramParcelable.adV);
        if (paramParcelable != null)
          a((u)paramParcelable.getSubMenu());
      }
    }
  }

  public final Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState();
    localSavedState.adV = this.adP;
    return localSavedState;
  }

  public final boolean showOverflowMenu()
  {
    if ((this.ady) && (!isOverflowMenuShowing()) && (this.lo != null) && (this.aao != null) && (this.adM == null) && (!this.lo.gD().isEmpty()))
    {
      this.adM = new c(new e(this.mContext, this.lo, this.adv));
      ((View)this.aao).post(this.adM);
      super.a(null);
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
    };
    public int adV;

    SavedState()
    {
    }

    SavedState(Parcel paramParcel)
    {
      this.adV = paramParcel.readInt();
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.adV);
    }
  }

  final class a extends n
  {
    public a(Context paramu, u paramView, View arg4)
    {
      super(paramView, localView, false);
      if (!((j)paramView.getItem()).gJ())
        if (ActionMenuPresenter.this.adv != null)
          break label56;
      label56: for (paramu = (View)ActionMenuPresenter.this.aao; ; paramu = ActionMenuPresenter.this.adv)
      {
        this.pP = paramu;
        c(ActionMenuPresenter.this.adO);
        return;
      }
    }

    public final void onDismiss()
    {
      ActionMenuPresenter.this.adL = null;
      ActionMenuPresenter.this.adP = 0;
      super.onDismiss();
    }
  }

  final class b extends ActionMenuItemView.b
  {
    b()
    {
    }

    public final s gm()
    {
      if (ActionMenuPresenter.this.adL != null);
      for (m localm = ActionMenuPresenter.this.adL.gO(); ; localm = null)
        return localm;
    }
  }

  final class c
    implements Runnable
  {
    private ActionMenuPresenter.e adR;

    public c(ActionMenuPresenter.e arg2)
    {
      Object localObject;
      this.adR = localObject;
    }

    public final void run()
    {
      if (ActionMenuPresenter.this.lo != null)
      {
        localObject = ActionMenuPresenter.this.lo;
        if (((h)localObject).abr != null)
          ((h)localObject).abr.b((h)localObject);
      }
      Object localObject = (View)ActionMenuPresenter.this.aao;
      if ((localObject != null) && (((View)localObject).getWindowToken() != null) && (this.adR.gP()))
        ActionMenuPresenter.this.adK = this.adR;
      ActionMenuPresenter.this.adM = null;
    }
  }

  final class d extends AppCompatImageView
    implements ActionMenuView.a
  {
    private final float[] adS = new float[2];

    public d(Context arg2)
    {
      super(null, 2130772132);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      be.a(this, getContentDescription());
      setOnTouchListener(new ae(this)
      {
        public final s gm()
        {
          if (ActionMenuPresenter.this.adK == null);
          for (Object localObject = null; ; localObject = ActionMenuPresenter.this.adK.gO())
            return localObject;
        }

        public final boolean gn()
        {
          ActionMenuPresenter.this.showOverflowMenu();
          return true;
        }

        public final boolean hc()
        {
          if (ActionMenuPresenter.this.adM != null);
          for (boolean bool = false; ; bool = true)
          {
            return bool;
            ActionMenuPresenter.this.hideOverflowMenu();
          }
        }
      });
    }

    public final boolean gk()
    {
      return false;
    }

    public final boolean gl()
    {
      return false;
    }

    public final boolean performClick()
    {
      if (super.performClick());
      while (true)
      {
        return true;
        playSoundEffect(0);
        ActionMenuPresenter.this.showOverflowMenu();
      }
    }

    protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt3 = getHeight();
        paramInt1 = Math.max(i, paramInt3) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt4 = getPaddingTop();
        paramInt2 = getPaddingBottom();
        i = (i + (j - k)) / 2;
        paramInt2 = (paramInt3 + (paramInt4 - paramInt2)) / 2;
        android.support.v4.a.a.a.a(localDrawable2, i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
  }

  final class e extends n
  {
    public e(Context paramh, h paramView, View arg4)
    {
      super(paramView, localView, true);
      this.aaD = 8388613;
      c(ActionMenuPresenter.this.adO);
    }

    public final void onDismiss()
    {
      if (ActionMenuPresenter.this.lo != null)
        ActionMenuPresenter.this.lo.close();
      ActionMenuPresenter.this.adK = null;
      super.onDismiss();
    }
  }

  final class f
    implements o.a
  {
    f()
    {
    }

    public final void a(h paramh, boolean paramBoolean)
    {
      if ((paramh instanceof u))
        paramh.gE().U(false);
      o.a locala = ActionMenuPresenter.this.lL;
      if (locala != null)
        locala.a(paramh, paramBoolean);
    }

    public final boolean d(h paramh)
    {
      boolean bool;
      if (paramh == null)
        bool = false;
      while (true)
      {
        return bool;
        ActionMenuPresenter.this.adP = ((u)paramh).getItem().getItemId();
        o.a locala = ActionMenuPresenter.this.lL;
        if (locala != null)
          bool = locala.d(paramh);
        else
          bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionMenuPresenter
 * JD-Core Version:    0.6.2
 */