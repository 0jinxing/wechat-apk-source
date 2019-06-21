package com.tencent.mm.ui.b;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.x;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends a
  implements h.a, o.a
{
  public ViewGroup SW;
  private boolean Vo;
  private h lo;
  a yrc;
  boolean yrd;
  private final Runnable yre;

  public b(Activity paramActivity, a parama)
  {
    super(paramActivity);
    AppMethodBeat.i(106150);
    this.yre = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(106149);
        b localb = b.this;
        Object localObject = localb.mActivity;
        ActionBar localActionBar = localb.getSupportActionBar();
        if (localActionBar != null)
          localObject = localActionBar.getThemedContext();
        localObject = new h((Context)localObject);
        ((h)localObject).a(localb);
        if (b.this.yrc != null)
        {
          b.this.yrc.d((Menu)localObject);
          b.this.yrc.c((Menu)localObject);
          b.a(b.this, (h)localObject);
        }
        while (true)
        {
          ((h)localObject).p(true);
          b.this.yrd = false;
          AppMethodBeat.o(106149);
          return;
          b.a(b.this, null);
        }
      }
    };
    this.yrc = parama;
    AppMethodBeat.o(106150);
  }

  private void fr()
  {
    AppMethodBeat.i(106152);
    if (!this.Vo)
    {
      this.Vo = true;
      supportInvalidateOptionsMenu();
    }
    AppMethodBeat.o(106152);
  }

  public final void a(h paramh, boolean paramBoolean)
  {
  }

  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(106153);
    boolean bool;
    if (this.yrc != null)
    {
      bool = this.yrc.h(paramMenuItem);
      AppMethodBeat.o(106153);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106153);
    }
  }

  public final void b(h paramh)
  {
    AppMethodBeat.i(106154);
    x localx;
    if (this.mActionBar != null)
    {
      localx = ((d)this.mActionBar).Wk;
      if ((localx != null) && (localx.gV()))
        if (!localx.isOverflowMenuShowing())
        {
          if (localx.getVisibility() != 0)
            break label74;
          localx.showOverflowMenu();
          AppMethodBeat.o(106154);
        }
    }
    while (true)
    {
      return;
      localx.hideOverflowMenu();
      label74: AppMethodBeat.o(106154);
      continue;
      paramh.close();
      AppMethodBeat.o(106154);
    }
  }

  public final boolean d(h paramh)
  {
    return false;
  }

  public final ActionBar dzl()
  {
    AppMethodBeat.i(106151);
    fr();
    if (this.mActionBar == null)
      this.mActionBar = new d(this.mActivity, this.SW);
    ActionBar localActionBar = this.mActionBar;
    AppMethodBeat.o(106151);
    return localActionBar;
  }

  public final void supportInvalidateOptionsMenu()
  {
    AppMethodBeat.i(106155);
    if (!this.yrd)
    {
      this.yrd = true;
      this.yre.run();
    }
    AppMethodBeat.o(106155);
  }

  public static abstract interface a
  {
    public abstract boolean c(Menu paramMenu);

    public abstract boolean d(Menu paramMenu);

    public abstract boolean h(MenuItem paramMenuItem);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.b
 * JD-Core Version:    0.6.2
 */