package com.tencent.mm.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout.a;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class d extends ActionBar
  implements ActionBarOverlayLayout.a
{
  private static final Interpolator WF;
  private static final Interpolator WG;
  private static final boolean yrg;
  private Context WH;
  private ActionBarContainer WJ;
  private ActionBarContextView WK;
  private View WL;
  private boolean WO;
  b WQ;
  b.a WR;
  private int WT;
  private boolean WV;
  private boolean WW;
  private boolean WX;
  private boolean WY;
  private boolean WZ;
  android.support.v7.widget.x Wk;
  private boolean Wo;
  private ArrayList<Object> Wp;
  private android.support.v7.view.h Xa;
  private boolean Xb;
  final android.support.v4.view.x Xd;
  final android.support.v4.view.x Xe;
  final z Xf;
  private Activity mActivity;
  private Context mContext;
  a yrh;

  static
  {
    AppMethodBeat.i(106217);
    WF = new AccelerateInterpolator();
    WG = new DecelerateInterpolator();
    if (Build.VERSION.SDK_INT >= 14);
    for (boolean bool = true; ; bool = false)
    {
      yrg = bool;
      AppMethodBeat.o(106217);
      return;
    }
  }

  public d(Activity paramActivity, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(106178);
    this.Wp = new ArrayList();
    this.WT = 0;
    this.WV = true;
    this.WZ = true;
    this.Xd = new y()
    {
      public final void aA(View paramAnonymousView)
      {
        AppMethodBeat.i(106158);
        if ((d.a(d.this)) && (d.b(d.this) != null))
        {
          s.d(d.b(d.this), 0.0F);
          s.d(d.c(d.this), 0.0F);
        }
        d.c(d.this).setVisibility(8);
        d.c(d.this).setTransitioning(false);
        d.d(d.this);
        paramAnonymousView = d.this;
        if (paramAnonymousView.WR != null)
        {
          paramAnonymousView.WR.a(paramAnonymousView.WQ);
          paramAnonymousView.WQ = null;
          paramAnonymousView.WR = null;
        }
        AppMethodBeat.o(106158);
      }
    };
    this.Xe = new y()
    {
      public final void aA(View paramAnonymousView)
      {
        AppMethodBeat.i(106159);
        d.d(d.this);
        d.c(d.this).requestLayout();
        AppMethodBeat.o(106159);
      }
    };
    this.Xf = new z()
    {
      public final void es()
      {
        AppMethodBeat.i(106160);
        ((View)d.c(d.this).getParent()).invalidate();
        AppMethodBeat.o(106160);
      }
    };
    this.mActivity = paramActivity;
    paramActivity = paramViewGroup.findViewById(2131820941);
    if ((paramActivity instanceof android.support.v7.widget.x));
    for (paramActivity = (android.support.v7.widget.x)paramActivity; ; paramActivity = ((Toolbar)paramActivity).getWrapper())
    {
      this.Wk = paramActivity;
      this.WK = ((ActionBarContextView)paramViewGroup.findViewById(2131820942));
      this.WJ = ((ActionBarContainer)paramViewGroup.findViewById(2131820940));
      if ((this.Wk != null) && (this.WK != null) && (this.WJ != null))
        break label247;
      paramActivity = new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      AppMethodBeat.o(106178);
      throw paramActivity;
      if (!(paramActivity instanceof Toolbar))
        break;
    }
    if ("Can't make a decor toolbar out of ".concat(String.valueOf(paramActivity)) != null);
    for (paramActivity = paramActivity.getClass().getSimpleName(); ; paramActivity = "null")
    {
      paramActivity = new IllegalStateException(paramActivity);
      AppMethodBeat.o(106178);
      throw paramActivity;
    }
    label247: this.mContext = this.Wk.getContext();
    if ((this.Wk.getDisplayOptions() & 0x4) != 0);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.WO = true;
      android.support.v7.view.a.X(this.mContext).ga();
      paramActivity = this.mContext.obtainStyledAttributes(null, a.a.ActionBar, 2130772135, 0);
      paramActivity.getBoolean(19, false);
      i = paramActivity.getDimensionPixelSize(26, 0);
      if (i != 0)
        setElevation(i);
      paramActivity.recycle();
      this.WL = null;
      AppMethodBeat.o(106178);
      return;
    }
  }

  private void P(boolean paramBoolean)
  {
    AppMethodBeat.i(106203);
    if (e(this.WW, this.WX, this.WY))
    {
      if (this.WZ)
        break label63;
      this.WZ = true;
      Q(paramBoolean);
      AppMethodBeat.o(106203);
    }
    while (true)
    {
      return;
      if (this.WZ)
      {
        this.WZ = false;
        R(paramBoolean);
      }
      label63: AppMethodBeat.o(106203);
    }
  }

  private void Q(boolean paramBoolean)
  {
    AppMethodBeat.i(106204);
    if (this.Xa != null)
      this.Xa.cancel();
    this.WJ.setVisibility(0);
    if ((this.WT == 0) && (yrg) && ((this.Xb) || (paramBoolean)))
    {
      s.d(this.WJ, 0.0F);
      float f1 = -this.WJ.getHeight();
      float f2 = f1;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp83_81 = localObject;
        tmp83_81[0] = 0;
        Object tmp87_83 = tmp83_81;
        tmp87_83[1] = 0;
        tmp87_83;
        this.WJ.getLocationInWindow((int[])localObject);
        f2 = f1 - localObject[1];
      }
      s.d(this.WJ, f2);
      android.support.v7.view.h localh = new android.support.v7.view.h();
      Object localObject = s.ab(this.WJ).u(0.0F);
      ((w)localObject).a(this.Xf);
      localh.a((w)localObject);
      if ((this.WV) && (this.WL != null))
      {
        s.d(this.WL, f2);
        localh.a(s.ab(this.WL).u(0.0F));
      }
      localh.d(WG);
      localh.gg();
      localh.b(this.Xe);
      this.Xa = localh;
      localh.start();
      AppMethodBeat.o(106204);
    }
    while (true)
    {
      return;
      s.e(this.WJ, 1.0F);
      s.d(this.WJ, 0.0F);
      if ((this.WV) && (this.WL != null))
        s.d(this.WL, 0.0F);
      this.Xe.aA(null);
      AppMethodBeat.o(106204);
    }
  }

  private void R(boolean paramBoolean)
  {
    AppMethodBeat.i(106205);
    if (this.Xa != null)
      this.Xa.cancel();
    if ((this.WT == 0) && (yrg) && ((this.Xb) || (paramBoolean)))
    {
      s.e(this.WJ, 1.0F);
      this.WJ.setTransitioning(true);
      android.support.v7.view.h localh = new android.support.v7.view.h();
      float f1 = -this.WJ.getHeight();
      float f2 = f1;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp92_90 = localObject;
        tmp92_90[0] = 0;
        Object tmp96_92 = tmp92_90;
        tmp96_92[1] = 0;
        tmp96_92;
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
      AppMethodBeat.o(106205);
    }
    while (true)
    {
      return;
      this.Xd.aA(null);
      AppMethodBeat.o(106205);
    }
  }

  private static boolean e(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
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
    AppMethodBeat.i(106198);
    if (!this.WY)
    {
      this.WY = true;
      P(false);
    }
    AppMethodBeat.o(106198);
  }

  private void fH()
  {
    AppMethodBeat.i(106201);
    if (this.WY)
    {
      this.WY = false;
      P(false);
    }
    AppMethodBeat.o(106201);
  }

  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106190);
    int i = this.Wk.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0)
      this.WO = true;
    this.Wk.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
    AppMethodBeat.o(106190);
  }

  public final void K(boolean paramBoolean)
  {
    AppMethodBeat.i(106215);
    if (!this.WO)
      setDisplayHomeAsUpEnabled(paramBoolean);
    AppMethodBeat.o(106215);
  }

  public final void L(boolean paramBoolean)
  {
    AppMethodBeat.i(106181);
    this.Xb = paramBoolean;
    if ((!paramBoolean) && (this.Xa != null))
      this.Xa.cancel();
    AppMethodBeat.o(106181);
  }

  public final void M(boolean paramBoolean)
  {
    AppMethodBeat.i(106182);
    if (paramBoolean == this.Wo)
      AppMethodBeat.o(106182);
    while (true)
    {
      return;
      this.Wo = paramBoolean;
      int i = this.Wp.size();
      for (int j = 0; j < i; j++)
        this.Wp.get(j);
      AppMethodBeat.o(106182);
    }
  }

  public final void O(boolean paramBoolean)
  {
    this.WV = paramBoolean;
  }

  public final void S(boolean paramBoolean)
  {
    AppMethodBeat.i(106207);
    w localw1;
    w localw2;
    if (paramBoolean)
    {
      fF();
      if (!paramBoolean)
        break label81;
      localw1 = this.Wk.c(8, 100L);
      localw2 = this.WK.c(0, 200L);
    }
    while (true)
    {
      android.support.v7.view.h localh = new android.support.v7.view.h();
      localh.a(localw1, localw2);
      localh.start();
      AppMethodBeat.o(106207);
      return;
      fH();
      break;
      label81: localw2 = this.Wk.c(0, 200L);
      localw1 = this.WK.c(8, 100L);
    }
  }

  public final b a(b.a parama)
  {
    AppMethodBeat.i(106195);
    if (this.yrh != null)
      this.yrh.finish();
    this.WK.gS();
    parama = new a(this.WK.getContext(), parama);
    if (parama.fK())
    {
      parama.invalidate();
      this.WK.c(parama);
      S(true);
      this.WK.sendAccessibilityEvent(32);
      this.yrh = parama;
      AppMethodBeat.o(106195);
    }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(106195);
    }
  }

  public final boolean collapseActionView()
  {
    AppMethodBeat.i(106211);
    boolean bool;
    if ((this.Wk != null) && (this.Wk.hasExpandedActionView()))
    {
      this.Wk.collapseActionView();
      bool = true;
      AppMethodBeat.o(106211);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106211);
    }
  }

  public final void fG()
  {
    AppMethodBeat.i(106199);
    if (this.WX)
    {
      this.WX = false;
      P(true);
    }
    AppMethodBeat.o(106199);
  }

  public final void fI()
  {
    AppMethodBeat.i(106202);
    if (!this.WX)
    {
      this.WX = true;
      P(true);
    }
    AppMethodBeat.o(106202);
  }

  public final void fJ()
  {
    AppMethodBeat.i(106210);
    if (this.Xa != null)
    {
      this.Xa.cancel();
      this.Xa = null;
    }
    AppMethodBeat.o(106210);
  }

  public final void fa()
  {
    AppMethodBeat.i(106213);
    this.Wk.setIcon(2130840857);
    AppMethodBeat.o(106213);
  }

  public final void fb()
  {
    AppMethodBeat.i(106184);
    setDisplayOptions(0, 2);
    AppMethodBeat.o(106184);
  }

  public final void fc()
  {
    AppMethodBeat.i(106186);
    setDisplayOptions(0, 8);
    AppMethodBeat.o(106186);
  }

  public final void fd()
  {
    AppMethodBeat.i(106187);
    setDisplayOptions(16, 16);
    AppMethodBeat.o(106187);
  }

  public final void fe()
  {
  }

  public final View getCustomView()
  {
    AppMethodBeat.i(106192);
    View localView = this.Wk.getCustomView();
    AppMethodBeat.o(106192);
    return localView;
  }

  public final int getDisplayOptions()
  {
    AppMethodBeat.i(106194);
    int i = this.Wk.getDisplayOptions();
    AppMethodBeat.o(106194);
    return i;
  }

  public final int getHeight()
  {
    AppMethodBeat.i(106196);
    int i = this.WJ.getHeight();
    AppMethodBeat.o(106196);
    return i;
  }

  public final Context getThemedContext()
  {
    AppMethodBeat.i(106208);
    Object localObject;
    int i;
    if (this.WH == null)
    {
      localObject = new TypedValue();
      this.mContext.getTheme().resolveAttribute(2130772138, (TypedValue)localObject, true);
      i = ((TypedValue)localObject).resourceId;
      if (i == 0)
        break label75;
    }
    label75: for (this.WH = new ContextThemeWrapper(this.mContext, i); ; this.WH = this.mContext)
    {
      localObject = this.WH;
      AppMethodBeat.o(106208);
      return localObject;
    }
  }

  public final CharSequence getTitle()
  {
    AppMethodBeat.i(106193);
    CharSequence localCharSequence = this.Wk.getTitle();
    AppMethodBeat.o(106193);
    return localCharSequence;
  }

  public final void hide()
  {
    AppMethodBeat.i(106200);
    if (!this.WW)
    {
      this.WW = true;
      P(false);
    }
    AppMethodBeat.o(106200);
  }

  public final boolean isShowing()
  {
    AppMethodBeat.i(106206);
    int i = this.WJ.getHeight();
    boolean bool;
    if ((this.WZ) && ((i == 0) || (i > 0)))
    {
      bool = true;
      AppMethodBeat.o(106206);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106206);
    }
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(106180);
    paramConfiguration = this.Wk.hW().getLayoutParams();
    if (paramConfiguration != null)
      paramConfiguration.height = com.tencent.mm.compatible.util.a.bG(this.mActivity);
    this.Wk.hW().setLayoutParams(paramConfiguration);
    AppMethodBeat.o(106180);
  }

  public final void onWindowVisibilityChanged(int paramInt)
  {
    this.WT = paramInt;
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(106191);
    this.WJ.setPrimaryBackground(paramDrawable);
    AppMethodBeat.o(106191);
  }

  public final void setCustomView(int paramInt)
  {
    AppMethodBeat.i(106183);
    setCustomView(LayoutInflater.from(getThemedContext()).inflate(paramInt, this.Wk.hW(), false));
    AppMethodBeat.o(106183);
  }

  public final void setCustomView(View paramView)
  {
    AppMethodBeat.i(106212);
    this.Wk.setCustomView(paramView);
    AppMethodBeat.o(106212);
  }

  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(106185);
    if (paramBoolean);
    for (int i = 4; ; i = 0)
    {
      setDisplayOptions(i, 4);
      AppMethodBeat.o(106185);
      return;
    }
  }

  public final void setDisplayOptions(int paramInt)
  {
    AppMethodBeat.i(106189);
    if ((paramInt & 0x4) != 0)
      this.WO = true;
    this.Wk.setDisplayOptions(paramInt);
    AppMethodBeat.o(106189);
  }

  public final void setElevation(float paramFloat)
  {
    AppMethodBeat.i(106179);
    s.h(this.WJ, paramFloat);
    AppMethodBeat.o(106179);
  }

  public final void setHomeActionContentDescription(int paramInt)
  {
    AppMethodBeat.i(106209);
    this.Wk.setNavigationContentDescription(paramInt);
    AppMethodBeat.o(106209);
  }

  public final void setLogo(Drawable paramDrawable)
  {
    AppMethodBeat.i(106214);
    this.Wk.setLogo(paramDrawable);
    AppMethodBeat.o(106214);
  }

  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(106188);
    this.Wk.setWindowTitle(paramCharSequence);
    AppMethodBeat.o(106188);
  }

  public final void show()
  {
    AppMethodBeat.i(106197);
    if (this.WW)
    {
      this.WW = false;
      P(false);
    }
    AppMethodBeat.o(106197);
  }

  public final class a extends b
    implements h.a
  {
    private final Context Xh;
    private b.a Xi;
    private WeakReference<View> Xj;
    private final android.support.v7.view.menu.h lo;

    public a(Context parama, b.a arg3)
    {
      AppMethodBeat.i(106161);
      this.Xh = parama;
      Object localObject;
      this.Xi = localObject;
      this$1 = new android.support.v7.view.menu.h(parama);
      d.this.abx = 1;
      this.lo = d.this;
      this.lo.a(this);
      AppMethodBeat.o(106161);
    }

    public final boolean a(android.support.v7.view.menu.h paramh, MenuItem paramMenuItem)
    {
      AppMethodBeat.i(106176);
      boolean bool;
      if (this.Xi != null)
      {
        bool = this.Xi.a(this, paramMenuItem);
        AppMethodBeat.o(106176);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(106176);
      }
    }

    public final void b(android.support.v7.view.menu.h paramh)
    {
      AppMethodBeat.i(106177);
      if (this.Xi == null)
        AppMethodBeat.o(106177);
      while (true)
      {
        return;
        invalidate();
        d.g(d.this).showOverflowMenu();
        AppMethodBeat.o(106177);
      }
    }

    public final boolean fK()
    {
      AppMethodBeat.i(106165);
      this.lo.gx();
      try
      {
        boolean bool = this.Xi.a(this, this.lo);
        return bool;
      }
      finally
      {
        this.lo.gy();
        AppMethodBeat.o(106165);
      }
    }

    public final void finish()
    {
      AppMethodBeat.i(106163);
      if (d.this.yrh != this)
      {
        AppMethodBeat.o(106163);
        return;
      }
      if (!d.ah(d.e(d.this), d.f(d.this)))
      {
        d.this.WQ = this;
        d.this.WR = this.Xi;
      }
      while (true)
      {
        this.Xi = null;
        d.this.S(false);
        d.g(d.this).gR();
        d.h(d.this).hW().sendAccessibilityEvent(32);
        d.this.yrh = null;
        AppMethodBeat.o(106163);
        break;
        this.Xi.a(this);
      }
    }

    public final View getCustomView()
    {
      AppMethodBeat.i(106175);
      View localView;
      if (this.Xj != null)
      {
        localView = (View)this.Xj.get();
        AppMethodBeat.o(106175);
      }
      while (true)
      {
        return localView;
        localView = null;
        AppMethodBeat.o(106175);
      }
    }

    public final Menu getMenu()
    {
      return this.lo;
    }

    public final MenuInflater getMenuInflater()
    {
      AppMethodBeat.i(106162);
      g localg = new g(this.Xh);
      AppMethodBeat.o(106162);
      return localg;
    }

    public final CharSequence getSubtitle()
    {
      AppMethodBeat.i(106172);
      CharSequence localCharSequence = d.g(d.this).getSubtitle();
      AppMethodBeat.o(106172);
      return localCharSequence;
    }

    public final CharSequence getTitle()
    {
      AppMethodBeat.i(106171);
      CharSequence localCharSequence = d.g(d.this).getTitle();
      AppMethodBeat.o(106171);
      return localCharSequence;
    }

    public final void invalidate()
    {
      AppMethodBeat.i(106164);
      if (d.this.yrh != this)
        AppMethodBeat.o(106164);
      while (true)
      {
        return;
        this.lo.gx();
        try
        {
          this.Xi.b(this, this.lo);
          this.lo.gy();
          AppMethodBeat.o(106164);
        }
        finally
        {
          this.lo.gy();
          AppMethodBeat.o(106164);
        }
      }
    }

    public final boolean isTitleOptional()
    {
      AppMethodBeat.i(106174);
      boolean bool = d.g(d.this).acR;
      AppMethodBeat.o(106174);
      return bool;
    }

    public final void setCustomView(View paramView)
    {
      AppMethodBeat.i(106166);
      d.g(d.this).setCustomView(paramView);
      this.Xj = new WeakReference(paramView);
      AppMethodBeat.o(106166);
    }

    public final void setSubtitle(int paramInt)
    {
      AppMethodBeat.i(106170);
      setSubtitle(d.i(d.this).getResources().getString(paramInt));
      AppMethodBeat.o(106170);
    }

    public final void setSubtitle(CharSequence paramCharSequence)
    {
      AppMethodBeat.i(106167);
      d.g(d.this).setSubtitle(paramCharSequence);
      AppMethodBeat.o(106167);
    }

    public final void setTitle(int paramInt)
    {
      AppMethodBeat.i(106169);
      setTitle(d.i(d.this).getResources().getString(paramInt));
      AppMethodBeat.o(106169);
    }

    public final void setTitle(CharSequence paramCharSequence)
    {
      AppMethodBeat.i(106168);
      d.g(d.this).setTitle(paramCharSequence);
      AppMethodBeat.o(106168);
    }

    public final void setTitleOptionalHint(boolean paramBoolean)
    {
      AppMethodBeat.i(106173);
      super.setTitleOptionalHint(paramBoolean);
      d.g(d.this).setTitleOptional(paramBoolean);
      AppMethodBeat.o(106173);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.d
 * JD-Core Version:    0.6.2
 */