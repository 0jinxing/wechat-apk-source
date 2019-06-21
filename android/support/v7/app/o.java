package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.view.a;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.au;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class o extends ActionBar
  implements ActionBarOverlayLayout.a
{
  private static final Interpolator WF;
  private static final Interpolator WG;
  private Context WH;
  ActionBarOverlayLayout WI;
  ActionBarContainer WJ;
  ActionBarContextView WK;
  View WL;
  au WM;
  private int WN = -1;
  private boolean WO;
  a WP;
  b WQ;
  b.a WR;
  private boolean WS;
  private int WT = 0;
  boolean WV = true;
  boolean WW;
  boolean WX;
  private boolean WY;
  private boolean WZ = true;
  android.support.v7.widget.x Wk;
  private boolean Wo;
  private ArrayList<Object> Wp = new ArrayList();
  android.support.v7.view.h Xa;
  private boolean Xb;
  boolean Xc;
  final android.support.v4.view.x Xd = new y()
  {
    public final void aA(View paramAnonymousView)
    {
      if ((o.this.WV) && (o.this.WL != null))
      {
        o.this.WL.setTranslationY(0.0F);
        o.this.WJ.setTranslationY(0.0F);
      }
      o.this.WJ.setVisibility(8);
      o.this.WJ.setTransitioning(false);
      o.this.Xa = null;
      paramAnonymousView = o.this;
      if (paramAnonymousView.WR != null)
      {
        paramAnonymousView.WR.a(paramAnonymousView.WQ);
        paramAnonymousView.WQ = null;
        paramAnonymousView.WR = null;
      }
      if (o.this.WI != null)
        s.ak(o.this.WI);
    }
  };
  final android.support.v4.view.x Xe = new y()
  {
    public final void aA(View paramAnonymousView)
    {
      o.this.Xa = null;
      o.this.WJ.requestLayout();
    }
  };
  final z Xf = new z()
  {
    public final void es()
    {
      ((View)o.this.WJ.getParent()).invalidate();
    }
  };
  private Activity mActivity;
  Context mContext;
  private Dialog mDialog;
  private ArrayList<Object> rS = new ArrayList();

  static
  {
    if (!o.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      WF = new AccelerateInterpolator();
      WG = new DecelerateInterpolator();
      return;
    }
  }

  public o(Activity paramActivity, boolean paramBoolean)
  {
    this.mActivity = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    aR(paramActivity);
    if (!paramBoolean)
      this.WL = paramActivity.findViewById(16908290);
  }

  public o(Dialog paramDialog)
  {
    this.mDialog = paramDialog;
    aR(paramDialog.getWindow().getDecorView());
  }

  private void N(boolean paramBoolean)
  {
    boolean bool = true;
    this.WS = paramBoolean;
    int i;
    label45: label78: Object localObject;
    if (!this.WS)
    {
      this.Wk.a(null);
      this.WJ.setTabContainer(this.WM);
      if (getNavigationMode() != 2)
        break label155;
      i = 1;
      if (this.WM != null)
      {
        if (i == 0)
          break label160;
        this.WM.setVisibility(0);
        if (this.WI != null)
          s.ak(this.WI);
      }
      localObject = this.Wk;
      if ((this.WS) || (i == 0))
        break label172;
      paramBoolean = true;
      label97: ((android.support.v7.widget.x)localObject).setCollapsible(paramBoolean);
      localObject = this.WI;
      if ((this.WS) || (i == 0))
        break label177;
    }
    label155: label160: label172: label177: for (paramBoolean = bool; ; paramBoolean = false)
    {
      ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(paramBoolean);
      return;
      this.WJ.setTabContainer(null);
      this.Wk.a(this.WM);
      break;
      i = 0;
      break label45;
      this.WM.setVisibility(8);
      break label78;
      paramBoolean = false;
      break label97;
    }
  }

  private void P(boolean paramBoolean)
  {
    if (e(this.WW, this.WX, this.WY))
      if (!this.WZ)
      {
        this.WZ = true;
        Q(paramBoolean);
      }
    while (true)
    {
      return;
      if (this.WZ)
      {
        this.WZ = false;
        R(paramBoolean);
      }
    }
  }

  private void Q(boolean paramBoolean)
  {
    if (this.Xa != null)
      this.Xa.cancel();
    this.WJ.setVisibility(0);
    if ((this.WT == 0) && ((this.Xb) || (paramBoolean)))
    {
      this.WJ.setTranslationY(0.0F);
      float f1 = -this.WJ.getHeight();
      float f2 = f1;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp71_69 = localObject;
        tmp71_69[0] = 0;
        Object tmp75_71 = tmp71_69;
        tmp75_71[1] = 0;
        tmp75_71;
        this.WJ.getLocationInWindow((int[])localObject);
        f2 = f1 - localObject[1];
      }
      this.WJ.setTranslationY(f2);
      android.support.v7.view.h localh = new android.support.v7.view.h();
      Object localObject = s.ab(this.WJ).u(0.0F);
      ((w)localObject).a(this.Xf);
      localh.a((w)localObject);
      if ((this.WV) && (this.WL != null))
      {
        this.WL.setTranslationY(f2);
        localh.a(s.ab(this.WL).u(0.0F));
      }
      localh.d(WG);
      localh.gg();
      localh.b(this.Xe);
      this.Xa = localh;
      localh.start();
    }
    while (true)
    {
      if (this.WI != null)
        s.ak(this.WI);
      return;
      this.WJ.setAlpha(1.0F);
      this.WJ.setTranslationY(0.0F);
      if ((this.WV) && (this.WL != null))
        this.WL.setTranslationY(0.0F);
      this.Xe.aA(null);
    }
  }

  private void R(boolean paramBoolean)
  {
    if (this.Xa != null)
      this.Xa.cancel();
    if ((this.WT == 0) && ((this.Xb) || (paramBoolean)))
    {
      this.WJ.setAlpha(1.0F);
      this.WJ.setTransitioning(true);
      android.support.v7.view.h localh = new android.support.v7.view.h();
      float f1 = -this.WJ.getHeight();
      float f2 = f1;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp80_78 = localObject;
        tmp80_78[0] = 0;
        Object tmp84_80 = tmp80_78;
        tmp84_80[1] = 0;
        tmp84_80;
        this.WJ.getLocationInWindow((int[])localObject);
        f2 = f1 - localObject[1];
      }
      Object localObject = s.ab(this.WJ).u(f2);
      ((w)localObject).a(this.Xf);
      localh.a((w)localObject);
      if ((this.WV) && (this.WL != null))
        localh.a(s.ab(this.WL).u(f2));
      localh.d(WF);
      localh.gg();
      localh.b(this.Xd);
      this.Xa = localh;
      localh.start();
    }
    while (true)
    {
      return;
      this.Xd.aA(null);
    }
  }

  private void aR(View paramView)
  {
    this.WI = ((ActionBarOverlayLayout)paramView.findViewById(2131820939));
    if (this.WI != null)
      this.WI.setActionBarVisibilityCallback(this);
    this.Wk = aS(paramView.findViewById(2131820941));
    this.WK = ((ActionBarContextView)paramView.findViewById(2131820942));
    this.WJ = ((ActionBarContainer)paramView.findViewById(2131820940));
    if ((this.Wk == null) || (this.WK == null) || (this.WJ == null))
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    this.mContext = this.Wk.getContext();
    if ((this.Wk.getDisplayOptions() & 0x4) != 0);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.WO = true;
      paramView = a.X(this.mContext);
      paramView.ga();
      N(paramView.fZ());
      paramView = this.mContext.obtainStyledAttributes(null, a.a.ActionBar, 2130772135, 0);
      if (paramView.getBoolean(19, false))
        fe();
      i = paramView.getDimensionPixelSize(26, 0);
      if (i != 0)
        setElevation(i);
      paramView.recycle();
      return;
    }
  }

  private static android.support.v7.widget.x aS(View paramView)
  {
    if ((paramView instanceof android.support.v7.widget.x));
    for (paramView = (android.support.v7.widget.x)paramView; ; paramView = ((Toolbar)paramView).getWrapper())
    {
      return paramView;
      if (!(paramView instanceof Toolbar))
        break;
    }
    if ("Can't make a decor toolbar out of ".concat(String.valueOf(paramView)) != null);
    for (paramView = paramView.getClass().getSimpleName(); ; paramView = "null")
      throw new IllegalStateException(paramView);
  }

  static boolean e(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = true;
    if (paramBoolean3)
      paramBoolean1 = bool;
    while (true)
    {
      return paramBoolean1;
      if (!paramBoolean1)
      {
        paramBoolean1 = bool;
        if (!paramBoolean2);
      }
      else
      {
        paramBoolean1 = false;
      }
    }
  }

  private void fF()
  {
    if (!this.WY)
    {
      this.WY = true;
      if (this.WI != null)
        this.WI.setShowingForActionMode(true);
      P(false);
    }
  }

  private void fH()
  {
    if (this.WY)
    {
      this.WY = false;
      if (this.WI != null)
        this.WI.setShowingForActionMode(false);
      P(false);
    }
  }

  private int getNavigationMode()
  {
    return this.Wk.getNavigationMode();
  }

  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.Wk.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0)
      this.WO = true;
    this.Wk.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }

  public final void K(boolean paramBoolean)
  {
    if (!this.WO)
      setDisplayHomeAsUpEnabled(paramBoolean);
  }

  public final void L(boolean paramBoolean)
  {
    this.Xb = paramBoolean;
    if ((!paramBoolean) && (this.Xa != null))
      this.Xa.cancel();
  }

  public final void M(boolean paramBoolean)
  {
    if (paramBoolean == this.Wo);
    while (true)
    {
      return;
      this.Wo = paramBoolean;
      int i = this.Wp.size();
      for (int j = 0; j < i; j++)
        this.Wp.get(j);
    }
  }

  public final void O(boolean paramBoolean)
  {
    this.WV = paramBoolean;
  }

  public final void S(boolean paramBoolean)
  {
    w localw1;
    w localw2;
    if (paramBoolean)
    {
      fF();
      if (!s.as(this.WJ))
        break label108;
      if (!paramBoolean)
        break label78;
      localw1 = this.Wk.c(4, 100L);
      localw2 = this.WK.c(0, 200L);
      label48: android.support.v7.view.h localh = new android.support.v7.view.h();
      localh.a(localw1, localw2);
      localh.start();
    }
    while (true)
    {
      return;
      fH();
      break;
      label78: localw2 = this.Wk.c(0, 200L);
      localw1 = this.WK.c(8, 100L);
      break label48;
      label108: if (paramBoolean)
      {
        this.Wk.setVisibility(4);
        this.WK.setVisibility(0);
      }
      else
      {
        this.Wk.setVisibility(0);
        this.WK.setVisibility(8);
      }
    }
  }

  public final b a(b.a parama)
  {
    if (this.WP != null)
      this.WP.finish();
    this.WI.setHideOnContentScrollEnabled(false);
    this.WK.gS();
    parama = new a(this.WK.getContext(), parama);
    if (parama.fK())
    {
      this.WP = parama;
      parama.invalidate();
      this.WK.c(parama);
      S(true);
      this.WK.sendAccessibilityEvent(32);
    }
    while (true)
    {
      return parama;
      parama = null;
    }
  }

  public final boolean collapseActionView()
  {
    if ((this.Wk != null) && (this.Wk.hasExpandedActionView()))
      this.Wk.collapseActionView();
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void fG()
  {
    if (this.WX)
    {
      this.WX = false;
      P(true);
    }
  }

  public final void fI()
  {
    if (!this.WX)
    {
      this.WX = true;
      P(true);
    }
  }

  public final void fJ()
  {
    if (this.Xa != null)
    {
      this.Xa.cancel();
      this.Xa = null;
    }
  }

  public final void fa()
  {
    this.Wk.setIcon(2130840857);
  }

  public final void fb()
  {
    setDisplayOptions(0, 2);
  }

  public final void fc()
  {
    setDisplayOptions(0, 8);
  }

  public final void fd()
  {
    setDisplayOptions(16, 16);
  }

  public final void fe()
  {
    if (!this.WI.adb)
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    this.Xc = true;
    this.WI.setHideOnContentScrollEnabled(true);
  }

  public final View getCustomView()
  {
    return this.Wk.getCustomView();
  }

  public final int getDisplayOptions()
  {
    return this.Wk.getDisplayOptions();
  }

  public final int getHeight()
  {
    return this.WJ.getHeight();
  }

  public final Context getThemedContext()
  {
    int i;
    if (this.WH == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.mContext.getTheme().resolveAttribute(2130772138, localTypedValue, true);
      i = localTypedValue.resourceId;
      if (i == 0)
        break label61;
    }
    label61: for (this.WH = new ContextThemeWrapper(this.mContext, i); ; this.WH = this.mContext)
      return this.WH;
  }

  public final CharSequence getTitle()
  {
    return this.Wk.getTitle();
  }

  public final void hide()
  {
    if (!this.WW)
    {
      this.WW = true;
      P(false);
    }
  }

  public final boolean isShowing()
  {
    int i = this.WJ.getHeight();
    if ((this.WZ) && ((i == 0) || (this.WI.getActionBarHideOffset() < i)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    N(a.X(this.mContext).fZ());
  }

  public final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (this.WP == null);
    android.support.v7.view.menu.h localh;
    do
    {
      return bool;
      localh = this.WP.lo;
    }
    while (localh == null);
    int i;
    if (paramKeyEvent != null)
    {
      i = paramKeyEvent.getDeviceId();
      label35: if (KeyCharacterMap.load(i).getKeyboardType() == 1)
        break label77;
    }
    label77: for (bool = true; ; bool = false)
    {
      localh.setQwertyMode(bool);
      bool = localh.performShortcut(paramInt, paramKeyEvent, 0);
      break;
      i = -1;
      break label35;
    }
  }

  public final void onWindowVisibilityChanged(int paramInt)
  {
    this.WT = paramInt;
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.WJ.setPrimaryBackground(paramDrawable);
  }

  public final void setCustomView(int paramInt)
  {
    setCustomView(LayoutInflater.from(getThemedContext()).inflate(paramInt, this.Wk.hW(), false));
  }

  public final void setCustomView(View paramView)
  {
    this.Wk.setCustomView(paramView);
  }

  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 4; ; i = 0)
    {
      setDisplayOptions(i, 4);
      return;
    }
  }

  public final void setDisplayOptions(int paramInt)
  {
    if ((paramInt & 0x4) != 0)
      this.WO = true;
    this.Wk.setDisplayOptions(paramInt);
  }

  public final void setElevation(float paramFloat)
  {
    s.h(this.WJ, paramFloat);
  }

  public final void setHomeActionContentDescription(int paramInt)
  {
    this.Wk.setNavigationContentDescription(paramInt);
  }

  public final void setLogo(Drawable paramDrawable)
  {
    this.Wk.setLogo(paramDrawable);
  }

  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    this.Wk.setWindowTitle(paramCharSequence);
  }

  public final void show()
  {
    if (this.WW)
    {
      this.WW = false;
      P(false);
    }
  }

  public final class a extends b
    implements h.a
  {
    private final Context Xh;
    private b.a Xi;
    private WeakReference<View> Xj;
    final android.support.v7.view.menu.h lo;

    public a(Context parama, b.a arg3)
    {
      this.Xh = parama;
      Object localObject;
      this.Xi = localObject;
      this$1 = new android.support.v7.view.menu.h(parama);
      o.this.abx = 1;
      this.lo = o.this;
      this.lo.a(this);
    }

    public final boolean a(android.support.v7.view.menu.h paramh, MenuItem paramMenuItem)
    {
      if (this.Xi != null);
      for (boolean bool = this.Xi.a(this, paramMenuItem); ; bool = false)
        return bool;
    }

    public final void b(android.support.v7.view.menu.h paramh)
    {
      if (this.Xi == null);
      while (true)
      {
        return;
        invalidate();
        o.this.WK.showOverflowMenu();
      }
    }

    public final boolean fK()
    {
      this.lo.gx();
      try
      {
        boolean bool = this.Xi.a(this, this.lo);
        return bool;
      }
      finally
      {
        this.lo.gy();
      }
    }

    public final void finish()
    {
      if (o.this.WP != this)
        return;
      if (!o.e(o.this.WW, o.this.WX, false))
      {
        o.this.WQ = this;
        o.this.WR = this.Xi;
      }
      while (true)
      {
        this.Xi = null;
        o.this.S(false);
        o.this.WK.gR();
        o.this.Wk.hW().sendAccessibilityEvent(32);
        o.this.WI.setHideOnContentScrollEnabled(o.this.Xc);
        o.this.WP = null;
        break;
        this.Xi.a(this);
      }
    }

    public final View getCustomView()
    {
      if (this.Xj != null);
      for (View localView = (View)this.Xj.get(); ; localView = null)
        return localView;
    }

    public final Menu getMenu()
    {
      return this.lo;
    }

    public final MenuInflater getMenuInflater()
    {
      return new g(this.Xh);
    }

    public final CharSequence getSubtitle()
    {
      return o.this.WK.getSubtitle();
    }

    public final CharSequence getTitle()
    {
      return o.this.WK.getTitle();
    }

    public final void invalidate()
    {
      if (o.this.WP != this);
      while (true)
      {
        return;
        this.lo.gx();
        try
        {
          this.Xi.b(this, this.lo);
          this.lo.gy();
        }
        finally
        {
          this.lo.gy();
        }
      }
    }

    public final boolean isTitleOptional()
    {
      return o.this.WK.acR;
    }

    public final void setCustomView(View paramView)
    {
      o.this.WK.setCustomView(paramView);
      this.Xj = new WeakReference(paramView);
    }

    public final void setSubtitle(int paramInt)
    {
      setSubtitle(o.this.mContext.getResources().getString(paramInt));
    }

    public final void setSubtitle(CharSequence paramCharSequence)
    {
      o.this.WK.setSubtitle(paramCharSequence);
    }

    public final void setTitle(int paramInt)
    {
      setTitle(o.this.mContext.getResources().getString(paramInt));
    }

    public final void setTitle(CharSequence paramCharSequence)
    {
      o.this.WK.setTitle(paramCharSequence);
    }

    public final void setTitleOptionalHint(boolean paramBoolean)
    {
      super.setTitleOptionalHint(paramBoolean);
      o.this.WK.setTitleOptional(paramBoolean);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.o
 * JD-Core Version:    0.6.2
 */