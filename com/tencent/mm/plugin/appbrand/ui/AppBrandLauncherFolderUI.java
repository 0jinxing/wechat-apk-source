package com.tencent.mm.plugin.appbrand.ui;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.appbrand.ui.a.a;
import com.tencent.mm.plugin.appbrand.ui.collection.e;
import com.tencent.mm.plugin.appbrand.ui.recents.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/plugin/appbrand/ui/launcher/IFolderActivityContext;", "()V", "mFolderContextImpl", "Lcom/tencent/mm/plugin/appbrand/ui/launcher/FolderActivityContextWithLifecycle;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showListPage", "showList", "Companion", "plugin-appbrand-integration_release"})
@i
public final class AppBrandLauncherFolderUI extends MMActivity
  implements com.tencent.mm.plugin.appbrand.ui.a.b
{
  public static final AppBrandLauncherFolderUI.a iGG;
  private a iGF;

  static
  {
    AppMethodBeat.i(134994);
    iGG = new AppBrandLauncherFolderUI.a((byte)0);
    AppMethodBeat.o(134994);
  }

  public static final void o(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(134995);
    AppBrandLauncherFolderUI.a.o(paramContext, paramIntent);
    AppMethodBeat.o(134995);
  }

  public static final void p(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(134996);
    AppBrandLauncherFolderUI.a.p(paramContext, paramIntent);
    AppMethodBeat.o(134996);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(134993);
    boolean bool;
    if (isFinishing())
    {
      bool = false;
      AppMethodBeat.o(134993);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(134993);
    }
  }

  public final void eE(boolean paramBoolean)
  {
    AppMethodBeat.i(134992);
    a locala = this.iGF;
    if (locala != null)
    {
      locala.eE(paramBoolean);
      AppMethodBeat.o(134992);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134992);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(134991);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(134991);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.ui.base.b.aE(getClass()))
        super.overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
      int i = getIntent().getIntExtra("KEY_MODE", 0);
      switch (i)
      {
      default:
        ab.e("MicroMsg.AppBrandLauncherFolderUI", "onCreate with invalid mode(" + i + ')');
        finish();
        xE(-855310);
        getContentView().setBackgroundColor(dyd());
        setBackBtn((MenuItem.OnMenuItemClickListener)new AppBrandLauncherFolderUI.b(this));
        setTitleBarDoubleClickListener((Runnable)new AppBrandLauncherFolderUI.c(this));
        paramBundle = getLifecycle();
        a locala = this.iGF;
        if (locala == null)
          j.dWJ();
        paramBundle.addObserver((LifecycleObserver)locala);
        AppMethodBeat.o(134991);
      case 1:
      case 2:
      }
    }
    for (paramBundle = (a)new o((MMActivity)this); ; paramBundle = (a)new e((MMActivity)this))
    {
      this.iGF = paramBundle;
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI
 * JD-Core Version:    0.6.2
 */