package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.l;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.support.v7.view.menu.o.a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup
  implements l, w
{
  static final int[] MT = { 2130772139, 16842841 };
  private final n Rk;
  private x Wk;
  private boolean Xc;
  private int acV;
  private int acW = 0;
  private ContentFrameLayout acX;
  ActionBarContainer acY;
  private Drawable acZ;
  private boolean ada;
  public boolean adb;
  private boolean adc;
  boolean add;
  private int ade;
  private int adf;
  private final Rect adg = new Rect();
  private final Rect adh = new Rect();
  private final Rect adi = new Rect();
  private final Rect adj = new Rect();
  private final Rect adk = new Rect();
  private final Rect adl = new Rect();
  private final Rect adm = new Rect();
  private a adn;
  private final int ado = 600;
  private OverScroller adp;
  ViewPropertyAnimator adq;
  final AnimatorListenerAdapter adr = new AnimatorListenerAdapter()
  {
    public final void onAnimationCancel(Animator paramAnonymousAnimator)
    {
      ActionBarOverlayLayout.this.adq = null;
      ActionBarOverlayLayout.this.add = false;
    }

    public final void onAnimationEnd(Animator paramAnonymousAnimator)
    {
      ActionBarOverlayLayout.this.adq = null;
      ActionBarOverlayLayout.this.add = false;
    }
  };
  private final Runnable ads = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.this.gU();
      ActionBarOverlayLayout.this.adq = ActionBarOverlayLayout.this.acY.animate().translationY(0.0F).setListener(ActionBarOverlayLayout.this.adr);
    }
  };
  private final Runnable adt = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.this.gU();
      ActionBarOverlayLayout.this.adq = ActionBarOverlayLayout.this.acY.animate().translationY(-ActionBarOverlayLayout.this.acY.getHeight()).setListener(ActionBarOverlayLayout.this.adr);
    }
  };

  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
    this.Rk = new n(this);
  }

  private static x aS(View paramView)
  {
    if ((paramView instanceof x));
    for (paramView = (x)paramView; ; paramView = ((Toolbar)paramView).getWrapper())
    {
      return paramView;
      if (!(paramView instanceof Toolbar))
        break;
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + paramView.getClass().getSimpleName());
  }

  private static boolean c(View paramView, Rect paramRect, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    paramView = (LayoutParams)paramView.getLayoutParams();
    if (paramView.leftMargin != paramRect.left)
    {
      paramView.leftMargin = paramRect.left;
      bool2 = true;
    }
    if (paramView.topMargin != paramRect.top)
    {
      paramView.topMargin = paramRect.top;
      bool2 = true;
    }
    if (paramView.rightMargin != paramRect.right)
    {
      paramView.rightMargin = paramRect.right;
      bool2 = true;
    }
    if ((paramBoolean) && (paramView.bottomMargin != paramRect.bottom))
    {
      paramView.bottomMargin = paramRect.bottom;
      bool2 = bool1;
    }
    while (true)
      return bool2;
  }

  private void gT()
  {
    if (this.acX == null)
    {
      this.acX = ((ContentFrameLayout)findViewById(2131820544));
      this.acY = ((ActionBarContainer)findViewById(2131820940));
      this.Wk = aS(findViewById(2131820941));
    }
  }

  private void init(Context paramContext)
  {
    boolean bool1 = true;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(MT);
    this.acV = localTypedArray.getDimensionPixelSize(0, 0);
    this.acZ = localTypedArray.getDrawable(1);
    if (this.acZ == null)
    {
      bool2 = true;
      setWillNotDraw(bool2);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19)
        break label95;
    }
    label95: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.ada = bool2;
      this.adp = new OverScroller(paramContext);
      return;
      bool2 = false;
      break;
    }
  }

  public final void a(Menu paramMenu, o.a parama)
  {
    gT();
    this.Wk.a(paramMenu, parama);
  }

  public final void bs(int paramInt)
  {
    gT();
    switch (paramInt)
    {
    case 2:
    case 5:
    default:
    case 109:
    }
    while (true)
    {
      return;
      setOverlayMode(true);
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.acZ != null) && (!this.ada))
      if (this.acY.getVisibility() != 0)
        break label82;
    label82: for (int i = (int)(this.acY.getBottom() + this.acY.getTranslationY() + 0.5F); ; i = 0)
    {
      this.acZ.setBounds(0, i, getWidth(), this.acZ.getIntrinsicHeight() + i);
      this.acZ.draw(paramCanvas);
      return;
    }
  }

  protected boolean fitSystemWindows(Rect paramRect)
  {
    gT();
    s.aj(this);
    boolean bool = c(this.acY, paramRect, false);
    this.adj.set(paramRect);
    bk.a(this, this.adj, this.adg);
    if (!this.adk.equals(this.adj))
    {
      this.adk.set(this.adj);
      bool = true;
    }
    if (!this.adh.equals(this.adg))
    {
      this.adh.set(this.adg);
      bool = true;
    }
    if (bool)
      requestLayout();
    return true;
  }

  public final void fy()
  {
    gT();
    this.Wk.dismissPopupMenus();
  }

  final void gU()
  {
    removeCallbacks(this.ads);
    removeCallbacks(this.adt);
    if (this.adq != null)
      this.adq.cancel();
  }

  public final boolean gV()
  {
    gT();
    return this.Wk.gV();
  }

  public final boolean gW()
  {
    gT();
    return this.Wk.gW();
  }

  public final void gX()
  {
    gT();
    this.Wk.gX();
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }

  public int getActionBarHideOffset()
  {
    if (this.acY != null);
    for (int i = -(int)this.acY.getTranslationY(); ; i = 0)
      return i;
  }

  public int getNestedScrollAxes()
  {
    return this.Rk.Ms;
  }

  public CharSequence getTitle()
  {
    gT();
    return this.Wk.getTitle();
  }

  public final boolean hideOverflowMenu()
  {
    gT();
    return this.Wk.hideOverflowMenu();
  }

  public final boolean isOverflowMenuShowing()
  {
    gT();
    return this.Wk.isOverflowMenuShowing();
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    init(getContext());
    s.ak(this);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    gU();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = getChildCount();
    paramInt2 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        int i = localView.getMeasuredWidth();
        int j = localView.getMeasuredHeight();
        int k = localLayoutParams.leftMargin + paramInt2;
        int m = localLayoutParams.topMargin + paramInt4;
        localView.layout(k, m, i + k, j + m);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    gT();
    measureChildWithMargins(this.acY, paramInt1, 0, paramInt2, 0);
    Object localObject = (LayoutParams)this.acY.getLayoutParams();
    int i = Math.max(0, this.acY.getMeasuredWidth() + ((LayoutParams)localObject).leftMargin + ((LayoutParams)localObject).rightMargin);
    int j = this.acY.getMeasuredHeight();
    int k = ((LayoutParams)localObject).topMargin;
    int m = Math.max(0, ((LayoutParams)localObject).bottomMargin + (j + k));
    int n = View.combineMeasuredStates(0, this.acY.getMeasuredState());
    int i1;
    if ((s.aj(this) & 0x100) != 0)
    {
      k = 1;
      if (k == 0)
        break label436;
      i1 = this.acV;
      j = i1;
      if (this.adc)
      {
        j = i1;
        if (this.acY.getTabContainer() != null)
          j = i1 + this.acV;
      }
    }
    while (true)
    {
      label153: this.adi.set(this.adg);
      this.adl.set(this.adj);
      if ((!this.adb) && (k == 0))
      {
        localObject = this.adi;
        ((Rect)localObject).top = (j + ((Rect)localObject).top);
        localObject = this.adi;
      }
      for (((Rect)localObject).bottom += 0; ; ((Rect)localObject).bottom += 0)
      {
        c(this.acX, this.adi, true);
        if (!this.adm.equals(this.adl))
        {
          this.adm.set(this.adl);
          this.acX.g(this.adl);
        }
        measureChildWithMargins(this.acX, paramInt1, 0, paramInt2, 0);
        localObject = (LayoutParams)this.acX.getLayoutParams();
        j = Math.max(i, this.acX.getMeasuredWidth() + ((LayoutParams)localObject).leftMargin + ((LayoutParams)localObject).rightMargin);
        i1 = this.acX.getMeasuredHeight();
        k = ((LayoutParams)localObject).topMargin;
        m = Math.max(m, ((LayoutParams)localObject).bottomMargin + (i1 + k));
        i1 = View.combineMeasuredStates(n, this.acX.getMeasuredState());
        k = getPaddingLeft();
        n = getPaddingRight();
        m = Math.max(m + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(j + (k + n), getSuggestedMinimumWidth()), paramInt1, i1), View.resolveSizeAndState(m, paramInt2, i1 << 16));
        return;
        k = 0;
        break;
        label436: if (this.acY.getVisibility() == 8)
          break label494;
        j = this.acY.getMeasuredHeight();
        break label153;
        localObject = this.adl;
        ((Rect)localObject).top = (j + ((Rect)localObject).top);
        localObject = this.adl;
      }
      label494: j = 0;
    }
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.Xc)
    {
      if (!paramBoolean)
        bool2 = bool1;
    }
    else
      return bool2;
    this.adp.fling(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    if (this.adp.getFinalY() > this.acY.getHeight())
      i = 1;
    if (i != 0)
    {
      gU();
      this.adt.run();
    }
    while (true)
    {
      this.add = true;
      bool2 = true;
      break;
      gU();
      this.ads.run();
    }
  }

  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.ade += paramInt2;
    setActionBarHideOffset(this.ade);
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.Rk.Ms = paramInt;
    this.ade = getActionBarHideOffset();
    gU();
    if (this.adn != null)
      this.adn.fJ();
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.acY.getVisibility() != 0));
    for (boolean bool = false; ; bool = this.Xc)
      return bool;
  }

  public void onStopNestedScroll(View paramView)
  {
    if ((this.Xc) && (!this.add))
    {
      if (this.ade > this.acY.getHeight())
        break label45;
      gU();
      postDelayed(this.ads, 600L);
    }
    while (true)
    {
      return;
      label45: gU();
      postDelayed(this.adt, 600L);
    }
  }

  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt);
    gT();
    int i = this.adf;
    this.adf = paramInt;
    int j;
    int k;
    if ((paramInt & 0x4) == 0)
    {
      j = 1;
      if ((paramInt & 0x100) == 0)
        break label122;
      k = 1;
      label49: if (this.adn != null)
      {
        a locala = this.adn;
        if (k != 0)
          break label128;
        label67: locala.O(bool);
        if ((j == 0) && (k != 0))
          break label133;
        this.adn.fG();
      }
    }
    while (true)
    {
      if ((((i ^ paramInt) & 0x100) != 0) && (this.adn != null))
        s.ak(this);
      return;
      j = 0;
      break;
      label122: k = 0;
      break label49;
      label128: bool = false;
      break label67;
      label133: this.adn.fI();
    }
  }

  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.acW = paramInt;
    if (this.adn != null)
      this.adn.onWindowVisibilityChanged(paramInt);
  }

  public void setActionBarHideOffset(int paramInt)
  {
    gU();
    paramInt = Math.max(0, Math.min(paramInt, this.acY.getHeight()));
    this.acY.setTranslationY(-paramInt);
  }

  public void setActionBarVisibilityCallback(a parama)
  {
    this.adn = parama;
    if (getWindowToken() != null)
    {
      this.adn.onWindowVisibilityChanged(this.acW);
      if (this.adf != 0)
      {
        onWindowSystemUiVisibilityChanged(this.adf);
        s.ak(this);
      }
    }
  }

  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    this.adc = paramBoolean;
  }

  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.Xc)
    {
      this.Xc = paramBoolean;
      if (!paramBoolean)
      {
        gU();
        setActionBarHideOffset(0);
      }
    }
  }

  public void setIcon(int paramInt)
  {
    gT();
    this.Wk.setIcon(paramInt);
  }

  public void setIcon(Drawable paramDrawable)
  {
    gT();
    this.Wk.setIcon(paramDrawable);
  }

  public void setLogo(int paramInt)
  {
    gT();
    this.Wk.setLogo(paramInt);
  }

  public void setOverlayMode(boolean paramBoolean)
  {
    this.adb = paramBoolean;
    if ((paramBoolean) && (getContext().getApplicationInfo().targetSdkVersion < 19));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.ada = paramBoolean;
      return;
    }
  }

  public void setShowingForActionMode(boolean paramBoolean)
  {
  }

  public void setUiOptions(int paramInt)
  {
  }

  public void setWindowCallback(Window.Callback paramCallback)
  {
    gT();
    this.Wk.setWindowCallback(paramCallback);
  }

  public void setWindowTitle(CharSequence paramCharSequence)
  {
    gT();
    this.Wk.setWindowTitle(paramCharSequence);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }

  public final boolean showOverflowMenu()
  {
    gT();
    return this.Wk.showOverflowMenu();
  }

  public static class LayoutParams extends ViewGroup.MarginLayoutParams
  {
    public LayoutParams()
    {
      super(-1);
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }

  public static abstract interface a
  {
    public abstract void O(boolean paramBoolean);

    public abstract void fG();

    public abstract void fI();

    public abstract void fJ();

    public abstract void onWindowVisibilityChanged(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.6.2
 */