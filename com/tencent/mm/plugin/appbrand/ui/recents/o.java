package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.l;
import com.tencent.mm.plugin.appbrand.appusage.q;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.plugin.appbrand.ui.a.a;
import com.tencent.mm.ui.MMActivity;

public final class o extends a
{
  private int huR = 0;
  private int iOK;
  private String iOL;

  public o(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }

  public final void N(Intent paramIntent)
  {
    AppMethodBeat.i(133501);
    this.iOK = paramIntent.getIntExtra("extra_enter_scene", 1);
    this.iOL = paramIntent.getStringExtra("extra_enter_scene_note");
    AppMethodBeat.o(133501);
  }

  public final void eE(boolean paramBoolean)
  {
    AppMethodBeat.i(133500);
    if (paramBoolean)
    {
      localObject1 = AppBrandLauncherRecentsList.class;
      localObject2 = ((MMActivity)getBaseContext()).getSupportFragmentManager().findFragmentById(16908290);
      if ((localObject2 == null) || (!((Class)localObject1).isInstance(localObject2)))
        break label52;
      AppMethodBeat.o(133500);
    }
    while (true)
    {
      return;
      localObject1 = AppBrandLauncherBlankPage.class;
      break;
      label52: if ((!((MMActivity)getBaseContext()).isFinishing()) && (!((MMActivity)getBaseContext()).uiu))
        break label86;
      AppMethodBeat.o(133500);
    }
    label86: Object localObject2 = ((MMActivity)getBaseContext()).getSupportFragmentManager().beginTransaction();
    if (paramBoolean);
    for (Object localObject1 = new AppBrandLauncherRecentsList((MMActivity)getBaseContext() instanceof AppBrandLauncherUI); ; localObject1 = AppBrandLauncherBlankPage.cO(getString(2131296613), getString(2131296701)))
    {
      ((AppBrandLauncherUI.Fragment)localObject1).setScene(this.iOK);
      ((AppBrandLauncherUI.Fragment)localObject1).iGQ = this.iOL;
      ((m)localObject2).b(16908290, (Fragment)localObject1);
      ((m)localObject2).commit();
      AppMethodBeat.o(133500);
      break;
    }
  }

  public final void onActivityDidResume()
  {
    AppMethodBeat.i(133502);
    boolean bool;
    if (((MMActivity)getBaseContext() instanceof AppBrandLauncherUI))
      if ((!com.tencent.mm.plugin.appbrand.appusage.i.axe()) && (!com.tencent.mm.plugin.appbrand.appusage.i.axf()) && (!q.axm()))
      {
        l.axj();
        if (!l.enabled());
      }
      else
      {
        bool = true;
        eE(bool);
        AppMethodBeat.o(133502);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      ((MMActivity)getBaseContext()).setMMTitle(2131296700);
      int i = this.huR + 1;
      this.huR = i;
      if (i == 1)
        eE(true);
      AppMethodBeat.o(133502);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.o
 * JD-Core Version:    0.6.2
 */