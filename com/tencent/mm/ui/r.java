package com.tencent.mm.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.view.g;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.b.a;
import com.tencent.mm.ui.b.b;
import com.tencent.mm.ui.b.b.a;

public final class r extends q
  implements b.a
{
  private ActionBar mActionBar;
  public MMFragment ymV = null;
  public b ymW;

  protected final String bJj()
  {
    AppMethodBeat.i(106030);
    String str;
    if (this.ymV != null)
    {
      str = this.ymV.getIdentityString();
      AppMethodBeat.o(106030);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(106030);
    }
  }

  public final boolean c(Menu paramMenu)
  {
    AppMethodBeat.i(106037);
    if (this.ymV != null)
      this.ymV.onPrepareOptionsMenu(paramMenu);
    AppMethodBeat.o(106037);
    return true;
  }

  public final boolean d(Menu paramMenu)
  {
    AppMethodBeat.i(106038);
    MMFragment localMMFragment = this.ymV;
    b localb = this.ymW;
    ActionBar localActionBar;
    if (localb.mY == null)
    {
      localActionBar = localb.getSupportActionBar();
      if (localActionBar == null)
        break label65;
    }
    label65: for (localb.mY = new g(localActionBar.getThemedContext()); ; localb.mY = new g(localb.mActivity))
    {
      localMMFragment.onCreateOptionsMenu(paramMenu, localb.mY);
      AppMethodBeat.o(106038);
      return true;
    }
  }

  protected final void dealContentView(View paramView)
  {
    AppMethodBeat.i(106029);
    if (this.ymV != null)
      this.ymV.dealContentView(paramView);
    AppMethodBeat.o(106029);
  }

  protected final boolean dxT()
  {
    return false;
  }

  protected final String getClassName()
  {
    AppMethodBeat.i(106034);
    String str = this.ymV.getClass().getName();
    AppMethodBeat.o(106034);
    return str;
  }

  protected final int getLayoutId()
  {
    AppMethodBeat.i(106028);
    int i;
    if (this.ymV != null)
    {
      i = this.ymV.getLayoutId();
      AppMethodBeat.o(106028);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(106028);
    }
  }

  protected final View getLayoutView()
  {
    AppMethodBeat.i(106031);
    View localView;
    if (this.ymV != null)
    {
      localView = this.ymV.getLayoutView();
      AppMethodBeat.o(106031);
    }
    while (true)
    {
      return localView;
      localView = null;
      AppMethodBeat.o(106031);
    }
  }

  public final ActionBar getSupportActionBar()
  {
    AppMethodBeat.i(106035);
    if (this.mActionBar == null)
      this.mActionBar = this.ymW.dzl();
    ActionBar localActionBar = this.mActionBar;
    AppMethodBeat.o(106035);
    return localActionBar;
  }

  public final boolean h(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(106039);
    boolean bool = super.onOptionsItemSelected(paramMenuItem);
    AppMethodBeat.o(106039);
    return bool;
  }

  public final boolean interceptSupportInvalidateOptionsMenu()
  {
    return true;
  }

  protected final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(106033);
    if (this.ymV != null)
      this.ymV.onCreateBeforeSetContentView();
    AppMethodBeat.o(106033);
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(106032);
    if (this.ymV != null)
      this.ymV.onKeyboardStateChanged();
    AppMethodBeat.o(106032);
  }

  public final ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    AppMethodBeat.i(106027);
    paramCallback = this.ymW.startActionMode(paramCallback);
    AppMethodBeat.o(106027);
    return paramCallback;
  }

  public final void supportInvalidateOptionsMenu()
  {
    AppMethodBeat.i(106036);
    this.ymW.supportInvalidateOptionsMenu();
    AppMethodBeat.o(106036);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.r
 * JD-Core Version:    0.6.2
 */