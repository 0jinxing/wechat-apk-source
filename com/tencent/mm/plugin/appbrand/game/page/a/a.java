package com.tencent.mm.plugin.appbrand.game.page.a;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.a;
import com.tencent.mm.plugin.appbrand.game.page.f;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.b.c;
import com.tencent.mm.plugin.appbrand.page.b.c.b;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.ui.n;

public final class a
  implements c
{
  private final f htg;
  private c.b hth = null;

  public a(f paramf)
  {
    this.htg = paramf;
  }

  private void dP(boolean paramBoolean)
  {
    AppMethodBeat.i(130283);
    if (!(this.htg.mContext instanceof Activity))
      AppMethodBeat.o(130283);
    while (true)
    {
      return;
      Window localWindow = ((Activity)this.htg.mContext).getWindow();
      if (paramBoolean)
      {
        n.c(localWindow, true);
        AppMethodBeat.o(130283);
      }
      else
      {
        n.c(localWindow, false);
        AppMethodBeat.o(130283);
      }
    }
  }

  public final void aAS()
  {
    AppMethodBeat.i(130282);
    c.b localb;
    if (this.hth == null)
    {
      if (this.htg.getRuntime().getAppConfig().heX.hfi)
      {
        localb = c.b.ivu;
        this.hth = localb;
      }
    }
    else
      switch (a.1.hti[this.hth.ordinal()])
      {
      default:
        AppMethodBeat.o(130282);
      case 1:
      case 2:
      }
    while (true)
    {
      return;
      localb = c.b.ivv;
      break;
      aBr();
      AppMethodBeat.o(130282);
      continue;
      aBs();
      AppMethodBeat.o(130282);
    }
  }

  public final void aBr()
  {
    AppMethodBeat.i(130280);
    this.hth = c.b.ivu;
    dP(false);
    if ((Build.VERSION.SDK_INT >= 21) && ((this.htg.mContext instanceof Activity)))
    {
      Window localWindow = ((Activity)this.htg.mContext).getWindow();
      if (localWindow != null)
      {
        localWindow.addFlags(-2147483648);
        localWindow.setStatusBarColor(0);
      }
    }
    AppMethodBeat.o(130280);
  }

  public final void aBs()
  {
    AppMethodBeat.i(130281);
    this.hth = c.b.ivv;
    dP(true);
    AppMethodBeat.o(130281);
  }

  public final c.b aBt()
  {
    return this.hth;
  }

  public final void onOrientationChanged(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.a.a
 * JD-Core Version:    0.6.2
 */