package com.tencent.mm.sandbox.updater;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AppUpdaterUI$1
  implements g
{
  AppUpdaterUI$1(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(28813);
    if (AppUpdaterUI.b(this.xvL) != null)
      AppUpdaterUI.b(this.xvL).dismiss();
    if (this.xvL.isFinishing())
      AppMethodBeat.o(28813);
    while (true)
    {
      return;
      ab.d("MicroMsg.AppUpdaterUI", paramString);
      if (paramString != null)
      {
        AppUpdaterUI.a(this.xvL, paramString);
        AppUpdaterUI.a(this.xvL).setEnabled(false);
      }
      AppMethodBeat.o(28813);
    }
  }

  public final void a(com.tencent.mm.sandbox.monitor.c paramc)
  {
    AppMethodBeat.i(28814);
    if (this.xvL.isFinishing())
      AppMethodBeat.o(28814);
    while (true)
    {
      return;
      if ((paramc instanceof c))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 67L, 1L, true);
        ab.e("MicroMsg.AppUpdaterUI", "download package from cdn error. switch to webserver");
        if (AppUpdaterUI.b(this.xvL) != null)
          AppUpdaterUI.b(this.xvL).setMessage(this.xvL.getString(2131300008, new Object[] { AppUpdaterUI.e(this.xvL).desc, this.xvL.getString(2131304162), bo.ga(AppUpdaterUI.e(this.xvL).size) }));
        if (AppUpdaterUI.e(this.xvL).xwU)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(405L, 68L, 1L, true);
          AppUpdaterUI.a(this.xvL, paramc);
        }
        AppMethodBeat.o(28814);
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 69L, 1L, true);
        com.tencent.mm.ui.base.h.a(this.xvL, 2131304163, 2131297061, new AppUpdaterUI.1.1(this), new AppUpdaterUI.1.2(this));
        AppMethodBeat.o(28814);
      }
    }
  }

  public final void cpu()
  {
    AppMethodBeat.i(28812);
    if (this.xvL.isFinishing())
      AppMethodBeat.o(28812);
    while (true)
    {
      return;
      AppUpdaterUI.a(this.xvL).setText(2131304165);
      AppUpdaterUI.a(this.xvL).setEnabled(false);
      AppMethodBeat.o(28812);
    }
  }

  public final void dN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(28809);
    long l;
    if (paramInt1 <= 0)
    {
      l = 0L;
      paramInt1 = (int)l;
      if (paramInt1 != 100)
        break label60;
      AppUpdaterUI.a(this.xvL).setText(this.xvL.getString(2131304167));
      AppMethodBeat.o(28809);
    }
    while (true)
    {
      return;
      l = paramInt2 * 100L / paramInt1;
      break;
      label60: AppUpdaterUI.a(this.xvL).setText(this.xvL.getString(2131304165) + paramInt1 + "%");
      AppMethodBeat.o(28809);
    }
  }

  public final void dnk()
  {
    AppMethodBeat.i(28810);
    ab.e("MicroMsg.AppUpdaterUI", "no sdcard.");
    if (AppUpdaterUI.b(this.xvL) != null)
      AppUpdaterUI.b(this.xvL).dismiss();
    if (this.xvL.isFinishing())
      AppMethodBeat.o(28810);
    while (true)
    {
      return;
      AppUpdaterUI.c(this.xvL);
      AppMethodBeat.o(28810);
    }
  }

  public final void dnl()
  {
    AppMethodBeat.i(28811);
    if (AppUpdaterUI.b(this.xvL) != null)
      AppUpdaterUI.b(this.xvL).dismiss();
    if (this.xvL.isFinishing())
      AppMethodBeat.o(28811);
    while (true)
    {
      return;
      AppUpdaterUI.d(this.xvL);
      AppMethodBeat.o(28811);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.1
 * JD-Core Version:    0.6.2
 */