package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.a;
import android.support.v4.view.b.b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import java.util.ArrayList;

public final class j
  implements android.support.v4.b.a.b
{
  static String abW;
  static String abX;
  static String abY;
  static String abZ;
  private int Dj = 16;
  private CharSequence IT;
  private final int ZM;
  private final int ZN;
  final int ZO;
  private CharSequence ZP;
  private char ZQ;
  private int ZR = 4096;
  private char ZS;
  private int ZT = 4096;
  private Drawable ZU;
  private int ZV = 0;
  private MenuItem.OnMenuItemClickListener ZW;
  private CharSequence ZX;
  private CharSequence ZY;
  private PorterDuff.Mode ZZ = null;
  private boolean aaa = false;
  private boolean aab = false;
  private u abN;
  private Runnable abO;
  private boolean abP = false;
  private int abQ = 0;
  private View abR;
  public android.support.v4.view.b abS;
  private MenuItem.OnActionExpandListener abT;
  private boolean abU = false;
  ContextMenu.ContextMenuInfo abV;
  private ColorStateList lE = null;
  h lo;
  private final int mId;
  private Intent mIntent;

  j(h paramh, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.lo = paramh;
    this.mId = paramInt2;
    this.ZM = paramInt1;
    this.ZN = paramInt3;
    this.ZO = paramInt4;
    this.IT = paramCharSequence;
    this.abQ = paramInt5;
  }

  private void W(boolean paramBoolean)
  {
    int i = this.Dj;
    int j = this.Dj;
    if (paramBoolean);
    for (int k = 2; ; k = 0)
    {
      this.Dj = (k | j & 0xFFFFFFFD);
      if (i != this.Dj)
        this.lo.p(false);
      return;
    }
  }

  private android.support.v4.b.a.b aT(View paramView)
  {
    this.abR = paramView;
    this.abS = null;
    if ((paramView != null) && (paramView.getId() == -1) && (this.mId > 0))
      paramView.setId(this.mId);
    this.lo.gA();
    return this;
  }

  private Drawable i(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      localDrawable = paramDrawable;
      if (this.abP)
        if (!this.aaa)
        {
          localDrawable = paramDrawable;
          if (!this.aab);
        }
        else
        {
          localDrawable = a.f(paramDrawable).mutate();
          if (this.aaa)
            a.a(localDrawable, this.lE);
          if (this.aab)
            a.a(localDrawable, this.ZZ);
          this.abP = false;
        }
    }
    return localDrawable;
  }

  public final void V(boolean paramBoolean)
  {
    int i = this.Dj;
    if (paramBoolean);
    for (int j = 4; ; j = 0)
    {
      this.Dj = (j | i & 0xFFFFFFFB);
      return;
    }
  }

  final boolean X(boolean paramBoolean)
  {
    boolean bool = false;
    int i = this.Dj;
    int j = this.Dj;
    if (paramBoolean);
    for (int k = 0; ; k = 8)
    {
      this.Dj = (k | j & 0xFFFFFFF7);
      paramBoolean = bool;
      if (i != this.Dj)
        paramBoolean = true;
      return paramBoolean;
    }
  }

  public final void Y(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.Dj |= 32; ; this.Dj &= -33)
      return;
  }

  public final void Z(boolean paramBoolean)
  {
    this.abU = paramBoolean;
    this.lo.p(false);
  }

  public final android.support.v4.b.a.b a(android.support.v4.view.b paramb)
  {
    if (this.abS != null)
    {
      android.support.v4.view.b localb = this.abS;
      localb.LH = null;
      localb.LG = null;
    }
    this.abR = null;
    this.abS = paramb;
    this.lo.p(true);
    if (this.abS != null)
      this.abS.a(new b.b()
      {
        public final void en()
        {
          j.this.lo.gz();
        }
      });
    return this;
  }

  final CharSequence a(p.a parama)
  {
    if (parama.br());
    for (parama = getTitleCondensed(); ; parama = getTitle())
      return parama;
  }

  public final void b(u paramu)
  {
    this.abN = paramu;
    paramu.setHeaderTitle(getTitle());
  }

  public final boolean collapseActionView()
  {
    boolean bool = false;
    if ((this.abQ & 0x8) == 0);
    while (true)
    {
      return bool;
      if (this.abR == null)
        bool = true;
      else if ((this.abT == null) || (this.abT.onMenuItemActionCollapse(this)))
        bool = this.lo.h(this);
    }
  }

  public final android.support.v4.view.b dG()
  {
    return this.abS;
  }

  public final boolean expandActionView()
  {
    boolean bool = false;
    if (!gN());
    while (true)
    {
      return bool;
      if ((this.abT == null) || (this.abT.onMenuItemActionExpand(this)))
        bool = this.lo.g(this);
    }
  }

  public final boolean gF()
  {
    boolean bool1 = true;
    boolean bool2;
    if ((this.ZW != null) && (this.ZW.onMenuItemClick(this)))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (!this.lo.d(this.lo, this))
        if (this.abO != null)
        {
          this.abO.run();
          bool2 = bool1;
        }
        else if (this.mIntent != null)
        {
          try
          {
            this.lo.mContext.startActivity(this.mIntent);
            bool2 = bool1;
          }
          catch (ActivityNotFoundException localActivityNotFoundException)
          {
          }
        }
        else if (this.abS != null)
        {
          bool2 = bool1;
          if (this.abS.onPerformDefaultAction());
        }
        else
        {
          bool2 = false;
        }
    }
  }

  final char gG()
  {
    char c1;
    if (this.lo.gv())
      c1 = this.ZS;
    for (char c2 = c1; ; c2 = c1)
    {
      return c2;
      c1 = this.ZQ;
    }
  }

  final boolean gH()
  {
    if ((this.lo.gw()) && (gG() != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean gI()
  {
    if ((this.Dj & 0x4) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean gJ()
  {
    if ((this.Dj & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean gK()
  {
    boolean bool = true;
    if ((this.abQ & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean gL()
  {
    if ((this.abQ & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean gM()
  {
    if ((this.abQ & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean gN()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((this.abQ & 0x8) != 0)
    {
      if ((this.abR == null) && (this.abS != null))
        this.abR = this.abS.onCreateActionView(this);
      bool2 = bool1;
      if (this.abR != null)
        bool2 = true;
    }
    return bool2;
  }

  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }

  public final View getActionView()
  {
    View localView;
    if (this.abR != null)
      localView = this.abR;
    while (true)
    {
      return localView;
      if (this.abS != null)
      {
        this.abR = this.abS.onCreateActionView(this);
        localView = this.abR;
      }
      else
      {
        localView = null;
      }
    }
  }

  public final int getAlphabeticModifiers()
  {
    return this.ZT;
  }

  public final char getAlphabeticShortcut()
  {
    return this.ZS;
  }

  public final CharSequence getContentDescription()
  {
    return this.ZX;
  }

  public final int getGroupId()
  {
    return this.ZM;
  }

  public final Drawable getIcon()
  {
    Drawable localDrawable;
    if (this.ZU != null)
      localDrawable = i(this.ZU);
    while (true)
    {
      return localDrawable;
      if (this.ZV != 0)
      {
        localDrawable = android.support.v7.c.a.b.g(this.lo.mContext, this.ZV);
        this.ZV = 0;
        this.ZU = localDrawable;
        localDrawable = i(localDrawable);
      }
      else
      {
        localDrawable = null;
      }
    }
  }

  public final ColorStateList getIconTintList()
  {
    return this.lE;
  }

  public final PorterDuff.Mode getIconTintMode()
  {
    return this.ZZ;
  }

  public final Intent getIntent()
  {
    return this.mIntent;
  }

  @ViewDebug.CapturedViewProperty
  public final int getItemId()
  {
    return this.mId;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.abV;
  }

  public final int getNumericModifiers()
  {
    return this.ZR;
  }

  public final char getNumericShortcut()
  {
    return this.ZQ;
  }

  public final int getOrder()
  {
    return this.ZN;
  }

  public final SubMenu getSubMenu()
  {
    return this.abN;
  }

  @ViewDebug.CapturedViewProperty
  public final CharSequence getTitle()
  {
    return this.IT;
  }

  public final CharSequence getTitleCondensed()
  {
    if (this.ZP != null);
    for (CharSequence localCharSequence = this.ZP; ; localCharSequence = this.IT)
    {
      Object localObject = localCharSequence;
      if (Build.VERSION.SDK_INT < 18)
      {
        localObject = localCharSequence;
        if (localCharSequence != null)
        {
          localObject = localCharSequence;
          if (!(localCharSequence instanceof String))
            localObject = localCharSequence.toString();
        }
      }
      return localObject;
    }
  }

  public final CharSequence getTooltipText()
  {
    return this.ZY;
  }

  public final boolean hasSubMenu()
  {
    if (this.abN != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final android.support.v4.b.a.b i(CharSequence paramCharSequence)
  {
    this.ZX = paramCharSequence;
    this.lo.p(false);
    return this;
  }

  public final boolean isActionViewExpanded()
  {
    return this.abU;
  }

  public final boolean isCheckable()
  {
    boolean bool = true;
    if ((this.Dj & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean isChecked()
  {
    if ((this.Dj & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isEnabled()
  {
    if ((this.Dj & 0x10) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isVisible()
  {
    boolean bool = true;
    if ((this.abS != null) && (this.abS.overridesItemVisibility()))
      if (((this.Dj & 0x8) != 0) || (!this.abS.isVisible()));
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if ((this.Dj & 0x8) != 0)
        bool = false;
    }
  }

  public final android.support.v4.b.a.b j(CharSequence paramCharSequence)
  {
    this.ZY = paramCharSequence;
    this.lo.p(false);
    return this;
  }

  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.ZS == paramChar);
    while (true)
    {
      return this;
      this.ZS = Character.toLowerCase(paramChar);
      this.lo.p(false);
    }
  }

  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    if ((this.ZS == paramChar) && (this.ZT == paramInt));
    while (true)
    {
      return this;
      this.ZS = Character.toLowerCase(paramChar);
      this.ZT = KeyEvent.normalizeMetaState(paramInt);
      this.lo.p(false);
    }
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i = this.Dj;
    int j = this.Dj;
    if (paramBoolean);
    for (int k = 1; ; k = 0)
    {
      this.Dj = (k | j & 0xFFFFFFFE);
      if (i != this.Dj)
        this.lo.p(false);
      return this;
    }
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    if ((this.Dj & 0x4) != 0)
    {
      h localh = this.lo;
      int i = getGroupId();
      int j = localh.mItems.size();
      localh.gx();
      int k = 0;
      if (k < j)
      {
        j localj = (j)localh.mItems.get(k);
        if ((localj.getGroupId() == i) && (localj.gI()) && (localj.isCheckable()))
          if (localj != this)
            break label103;
        label103: for (paramBoolean = true; ; paramBoolean = false)
        {
          localj.W(paramBoolean);
          k++;
          break;
        }
      }
      localh.gy();
    }
    while (true)
    {
      return this;
      W(paramBoolean);
    }
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.Dj |= 16; ; this.Dj &= -17)
    {
      this.lo.p(false);
      return this;
    }
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.ZU = null;
    this.ZV = paramInt;
    this.abP = true;
    this.lo.p(false);
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.ZV = 0;
    this.ZU = paramDrawable;
    this.abP = true;
    this.lo.p(false);
    return this;
  }

  public final MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.lE = paramColorStateList;
    this.aaa = true;
    this.abP = true;
    this.lo.p(false);
    return this;
  }

  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.ZZ = paramMode;
    this.aab = true;
    this.abP = true;
    this.lo.p(false);
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    this.mIntent = paramIntent;
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    if (this.ZQ == paramChar);
    while (true)
    {
      return this;
      this.ZQ = ((char)paramChar);
      this.lo.p(false);
    }
  }

  public final MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    if ((this.ZQ == paramChar) && (this.ZR == paramInt));
    while (true)
    {
      return this;
      this.ZQ = ((char)paramChar);
      this.ZR = KeyEvent.normalizeMetaState(paramInt);
      this.lo.p(false);
    }
  }

  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    this.abT = paramOnActionExpandListener;
    return this;
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.ZW = paramOnMenuItemClickListener;
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.ZQ = ((char)paramChar1);
    this.ZS = Character.toLowerCase(paramChar2);
    this.lo.p(false);
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.ZQ = ((char)paramChar1);
    this.ZR = KeyEvent.normalizeMetaState(paramInt1);
    this.ZS = Character.toLowerCase(paramChar2);
    this.ZT = KeyEvent.normalizeMetaState(paramInt2);
    this.lo.p(false);
    return this;
  }

  public final void setShowAsAction(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    default:
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    case 0:
    case 1:
    case 2:
    }
    this.abQ = paramInt;
    this.lo.gA();
  }

  public final MenuItem setTitle(int paramInt)
  {
    return setTitle(this.lo.mContext.getString(paramInt));
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.IT = paramCharSequence;
    this.lo.p(false);
    if (this.abN != null)
      this.abN.setHeaderTitle(paramCharSequence);
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.ZP = paramCharSequence;
    this.lo.p(false);
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    if (X(paramBoolean))
      this.lo.gz();
    return this;
  }

  public final String toString()
  {
    if (this.IT != null);
    for (String str = this.IT.toString(); ; str = null)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.j
 * JD-Core Version:    0.6.2
 */