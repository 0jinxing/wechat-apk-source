package com.tencent.mm.ui.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.f.a;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class a
{
  b Vj = null;
  public ActionBar mActionBar;
  public final Activity mActivity;
  public MenuInflater mY;

  public a(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }

  private b startSupportActionMode(b.a parama)
  {
    if (this.Vj != null)
      this.Vj.finish();
    a locala = new a(parama);
    parama = getSupportActionBar();
    if (parama != null)
      this.Vj = parama.a(locala);
    return this.Vj;
  }

  abstract ActionBar dzl();

  public final ActionBar getSupportActionBar()
  {
    if (this.mActionBar == null)
      this.mActionBar = dzl();
    return this.mActionBar;
  }

  @TargetApi(11)
  public final ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    f.a locala = new f.a(this.mActivity, paramCallback);
    paramCallback = startSupportActionMode(locala);
    if (paramCallback != null);
    for (paramCallback = locala.b(paramCallback); ; paramCallback = null)
      return paramCallback;
  }

  final class a
    implements b.a
  {
    private b.a VE;

    public a(b.a arg2)
    {
      Object localObject;
      this.VE = localObject;
    }

    public final void a(b paramb)
    {
      AppMethodBeat.i(106148);
      this.VE.a(paramb);
      a.this.Vj = null;
      AppMethodBeat.o(106148);
    }

    public final boolean a(b paramb, Menu paramMenu)
    {
      AppMethodBeat.i(106145);
      boolean bool = this.VE.a(paramb, paramMenu);
      AppMethodBeat.o(106145);
      return bool;
    }

    public final boolean a(b paramb, MenuItem paramMenuItem)
    {
      AppMethodBeat.i(106147);
      boolean bool = this.VE.a(paramb, paramMenuItem);
      AppMethodBeat.o(106147);
      return bool;
    }

    public final boolean b(b paramb, Menu paramMenu)
    {
      AppMethodBeat.i(106146);
      boolean bool = this.VE.b(paramb, paramMenu);
      AppMethodBeat.o(106146);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.a
 * JD-Core Version:    0.6.2
 */