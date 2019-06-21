package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v7.a.a.a;
import android.support.v7.c.a.b;
import android.support.v7.view.menu.a;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.TextView;

public final class bd
  implements x
{
  CharSequence IT;
  private CharSequence IU;
  Window.Callback Wm;
  private ActionMenuPresenter acx;
  private Drawable auA;
  private int aur;
  private View aus;
  private Drawable aut;
  private Drawable auu;
  private boolean auv;
  private CharSequence auw;
  boolean aux;
  private int auy = 0;
  private int auz = 0;
  Toolbar oM;
  private Drawable rP;
  private View sQ;

  public bd(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, (byte)0);
  }

  private bd(Toolbar paramToolbar, boolean paramBoolean, byte paramByte)
  {
    this.oM = paramToolbar;
    this.IT = paramToolbar.getTitle();
    this.IU = paramToolbar.getSubtitle();
    boolean bool;
    if (this.IT != null)
    {
      bool = true;
      this.auv = bool;
      this.auu = paramToolbar.getNavigationIcon();
      paramToolbar = bc.a(paramToolbar.getContext(), null, a.a.ActionBar, 2130772135, 0);
      this.auA = paramToolbar.getDrawable(28);
      if (!paramBoolean)
        break label570;
      Object localObject1 = paramToolbar.getText(1);
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        this.auv = true;
        o((CharSequence)localObject1);
      }
      localObject1 = paramToolbar.getText(4);
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        this.IU = ((CharSequence)localObject1);
        if ((this.aur & 0x8) != 0)
          this.oM.setSubtitle((CharSequence)localObject1);
      }
      localObject1 = paramToolbar.getDrawable(8);
      if (localObject1 != null)
        setLogo((Drawable)localObject1);
      localObject1 = paramToolbar.getDrawable(7);
      if (localObject1 != null)
        setIcon((Drawable)localObject1);
      if ((this.auu == null) && (this.auA != null))
      {
        this.auu = this.auA;
        ls();
      }
      setDisplayOptions(paramToolbar.getInt(3, 0));
      paramByte = paramToolbar.getResourceId(13, 0);
      if (paramByte != 0)
      {
        setCustomView(LayoutInflater.from(this.oM.getContext()).inflate(paramByte, this.oM, false));
        setDisplayOptions(this.aur | 0x10);
      }
      paramByte = paramToolbar.getLayoutDimension(0, 0);
      if (paramByte > 0)
      {
        localObject1 = this.oM.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject1).height = paramByte;
        this.oM.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      int i = paramToolbar.getDimensionPixelOffset(20, -1);
      paramByte = paramToolbar.getDimensionPixelOffset(21, -1);
      if ((i >= 0) || (paramByte >= 0))
      {
        localObject1 = this.oM;
        i = Math.max(i, 0);
        paramByte = Math.max(paramByte, 0);
        ((Toolbar)localObject1).lq();
        ((Toolbar)localObject1).atX.aI(i, paramByte);
      }
      paramByte = paramToolbar.getResourceId(5, 0);
      Object localObject2;
      if (paramByte != 0)
      {
        localObject1 = this.oM;
        localObject2 = this.oM.getContext();
        ((Toolbar)localObject1).atP = paramByte;
        if (((Toolbar)localObject1).atH != null)
          ((Toolbar)localObject1).atH.setTextAppearance((Context)localObject2, paramByte);
      }
      paramByte = paramToolbar.getResourceId(6, 0);
      if (paramByte != 0)
      {
        localObject2 = this.oM;
        localObject1 = this.oM.getContext();
        ((Toolbar)localObject2).atQ = paramByte;
        if (((Toolbar)localObject2).atI != null)
          ((Toolbar)localObject2).atI.setTextAppearance((Context)localObject1, paramByte);
      }
      paramByte = paramToolbar.getResourceId(27, 0);
      if (paramByte != 0)
        this.oM.setPopupTheme(paramByte);
    }
    while (true)
    {
      paramToolbar.atG.recycle();
      if (2131296258 != this.auz)
      {
        this.auz = 2131296258;
        if (TextUtils.isEmpty(this.oM.getNavigationContentDescription()))
          setNavigationContentDescription(this.auz);
      }
      this.auw = this.oM.getNavigationContentDescription();
      this.oM.setNavigationOnClickListener(new View.OnClickListener()
      {
        final a auB = new a(bd.this.oM.getContext(), bd.this.IT);

        public final void onClick(View paramAnonymousView)
        {
          if ((bd.this.Wm != null) && (bd.this.aux))
            bd.this.Wm.onMenuItemSelected(0, this.auB);
        }
      });
      return;
      bool = false;
      break;
      label570: paramByte = 11;
      if (this.oM.getNavigationIcon() != null)
      {
        paramByte = 15;
        this.auA = this.oM.getNavigationIcon();
      }
      this.aur = paramByte;
    }
  }

  private void lr()
  {
    Drawable localDrawable = null;
    if ((this.aur & 0x2) != 0)
    {
      if ((this.aur & 0x1) == 0)
        break label49;
      if (this.aut == null)
        break label41;
      localDrawable = this.aut;
    }
    while (true)
    {
      this.oM.setLogo(localDrawable);
      return;
      label41: localDrawable = this.rP;
      continue;
      label49: localDrawable = this.rP;
    }
  }

  private void ls()
  {
    Drawable localDrawable;
    if ((this.aur & 0x4) != 0)
    {
      Toolbar localToolbar = this.oM;
      if (this.auu != null)
      {
        localDrawable = this.auu;
        localToolbar.setNavigationIcon(localDrawable);
      }
    }
    while (true)
    {
      return;
      localDrawable = this.auA;
      break;
      this.oM.setNavigationIcon(null);
    }
  }

  private void lt()
  {
    if ((this.aur & 0x4) != 0)
    {
      if (!TextUtils.isEmpty(this.auw))
        break label31;
      this.oM.setNavigationContentDescription(this.auz);
    }
    while (true)
    {
      return;
      label31: this.oM.setNavigationContentDescription(this.auw);
    }
  }

  private void o(CharSequence paramCharSequence)
  {
    this.IT = paramCharSequence;
    if ((this.aur & 0x8) != 0)
      this.oM.setTitle(paramCharSequence);
  }

  private void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    this.auw = paramCharSequence;
    lt();
  }

  public final void a(o.a parama, h.a parama1)
  {
    Toolbar localToolbar = this.oM;
    localToolbar.adY = parama;
    localToolbar.adZ = parama1;
    if (localToolbar.acw != null)
      localToolbar.acw.a(parama, parama1);
  }

  public final void a(au paramau)
  {
    if ((this.aus != null) && (this.aus.getParent() == this.oM))
      this.oM.removeView(this.aus);
    this.aus = paramau;
    if ((paramau != null) && (this.auy == 2))
    {
      this.oM.addView(this.aus, 0);
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)this.aus.getLayoutParams();
      localLayoutParams.width = -2;
      localLayoutParams.height = -2;
      localLayoutParams.gravity = 8388691;
      paramau.setAllowCollapse(true);
    }
  }

  public final void a(Menu paramMenu, o.a parama)
  {
    if (this.acx == null)
    {
      this.acx = new ActionMenuPresenter(this.oM.getContext());
      this.acx.mId = 2131820547;
    }
    this.acx.lL = parama;
    parama = this.oM;
    h localh1 = (h)paramMenu;
    paramMenu = this.acx;
    if ((localh1 != null) || (parama.acw != null))
    {
      parama.lm();
      h localh2 = parama.acw.lo;
      if (localh2 != localh1)
      {
        if (localh2 != null)
        {
          localh2.b(parama.auj);
          localh2.b(parama.auk);
        }
        if (parama.auk == null)
          parama.auk = new Toolbar.a(parama);
        paramMenu.adG = true;
        if (localh1 == null)
          break label185;
        localh1.a(paramMenu, parama.acv);
        localh1.a(parama.auk, parama.acv);
      }
    }
    while (true)
    {
      parama.acw.setPopupTheme(parama.adW);
      parama.acw.setPresenter(paramMenu);
      parama.auj = paramMenu;
      return;
      label185: paramMenu.a(parama.acv, null);
      parama.auk.a(parama.acv, null);
      paramMenu.n(true);
      parama.auk.n(true);
    }
  }

  public final w c(final int paramInt, long paramLong)
  {
    w localw = s.ab(this.oM);
    if (paramInt == 0);
    for (float f = 1.0F; ; f = 0.0F)
      return localw.t(f).l(paramLong).a(new y()
      {
        private boolean xH = false;

        public final void aA(View paramAnonymousView)
        {
          if (!this.xH)
            bd.this.oM.setVisibility(paramInt);
        }

        public final void aB(View paramAnonymousView)
        {
          this.xH = true;
        }

        public final void az(View paramAnonymousView)
        {
          bd.this.oM.setVisibility(0);
        }
      });
  }

  public final void collapseActionView()
  {
    this.oM.collapseActionView();
  }

  public final void dismissPopupMenus()
  {
    Toolbar localToolbar = this.oM;
    if (localToolbar.acw != null)
      localToolbar.acw.dismissPopupMenus();
  }

  public final boolean gV()
  {
    Toolbar localToolbar = this.oM;
    if ((localToolbar.getVisibility() == 0) && (localToolbar.acw != null) && (localToolbar.acw.ady));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean gW()
  {
    boolean bool = true;
    Object localObject = this.oM;
    int i;
    if (((Toolbar)localObject).acw != null)
    {
      localObject = ((Toolbar)localObject).acw;
      if (((ActionMenuView)localObject).adX != null)
      {
        localObject = ((ActionMenuView)localObject).adX;
        if ((((ActionMenuPresenter)localObject).adM != null) || (((ActionMenuPresenter)localObject).isOverflowMenuShowing()))
        {
          i = 1;
          if (i == 0)
            break label64;
          i = 1;
          label53: if (i == 0)
            break label69;
        }
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label64: i = 0;
      break label53;
      label69: bool = false;
    }
  }

  public final void gX()
  {
    this.aux = true;
  }

  public final Context getContext()
  {
    return this.oM.getContext();
  }

  public final View getCustomView()
  {
    return this.sQ;
  }

  public final int getDisplayOptions()
  {
    return this.aur;
  }

  public final int getHeight()
  {
    return this.oM.getHeight();
  }

  public final Menu getMenu()
  {
    return this.oM.getMenu();
  }

  public final int getNavigationMode()
  {
    return this.auy;
  }

  public final CharSequence getTitle()
  {
    return this.oM.getTitle();
  }

  public final int getVisibility()
  {
    return this.oM.getVisibility();
  }

  public final ViewGroup hW()
  {
    return this.oM;
  }

  public final boolean hasExpandedActionView()
  {
    Toolbar localToolbar = this.oM;
    if ((localToolbar.auk != null) && (localToolbar.auk.aun != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean hideOverflowMenu()
  {
    boolean bool = true;
    Object localObject = this.oM;
    int i;
    if (((Toolbar)localObject).acw != null)
    {
      localObject = ((Toolbar)localObject).acw;
      if ((((ActionMenuView)localObject).adX != null) && (((ActionMenuView)localObject).adX.hideOverflowMenu()))
      {
        i = 1;
        if (i == 0)
          break label49;
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label49: bool = false;
    }
  }

  public final boolean isOverflowMenuShowing()
  {
    return this.oM.isOverflowMenuShowing();
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    s.a(this.oM, paramDrawable);
  }

  public final void setCollapsible(boolean paramBoolean)
  {
    this.oM.setCollapsible(paramBoolean);
  }

  public final void setCustomView(View paramView)
  {
    if ((this.sQ != null) && ((this.aur & 0x10) != 0))
      this.oM.removeView(this.sQ);
    this.sQ = paramView;
    if ((paramView != null) && ((this.aur & 0x10) != 0))
      this.oM.addView(this.sQ);
  }

  public final void setDisplayOptions(int paramInt)
  {
    int i = this.aur ^ paramInt;
    this.aur = paramInt;
    if (i != 0)
    {
      if ((i & 0x4) != 0)
      {
        if ((paramInt & 0x4) != 0)
          lt();
        ls();
      }
      if ((i & 0x3) != 0)
        lr();
      if ((i & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0)
          break label115;
        this.oM.setTitle(this.IT);
        this.oM.setSubtitle(this.IU);
      }
      if (((i & 0x10) != 0) && (this.sQ != null))
      {
        if ((paramInt & 0x10) == 0)
          break label134;
        this.oM.addView(this.sQ);
      }
    }
    while (true)
    {
      return;
      label115: this.oM.setTitle(null);
      this.oM.setSubtitle(null);
      break;
      label134: this.oM.removeView(this.sQ);
    }
  }

  public final void setIcon(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = b.g(this.oM.getContext(), paramInt); ; localDrawable = null)
    {
      setIcon(localDrawable);
      return;
    }
  }

  public final void setIcon(Drawable paramDrawable)
  {
    this.rP = paramDrawable;
    lr();
  }

  public final void setLogo(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = b.g(this.oM.getContext(), paramInt); ; localDrawable = null)
    {
      setLogo(localDrawable);
      return;
    }
  }

  public final void setLogo(Drawable paramDrawable)
  {
    this.aut = paramDrawable;
    lr();
  }

  public final void setNavigationContentDescription(int paramInt)
  {
    if (paramInt == 0);
    for (Object localObject = null; ; localObject = this.oM.getContext().getString(paramInt))
    {
      setNavigationContentDescription((CharSequence)localObject);
      return;
    }
  }

  public final void setVisibility(int paramInt)
  {
    this.oM.setVisibility(paramInt);
  }

  public final void setWindowCallback(Window.Callback paramCallback)
  {
    this.Wm = paramCallback;
  }

  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    if (!this.auv)
      o(paramCharSequence);
  }

  public final boolean showOverflowMenu()
  {
    return this.oM.showOverflowMenu();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bd
 * JD-Core Version:    0.6.2
 */