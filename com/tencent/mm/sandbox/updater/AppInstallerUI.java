package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c.a;

public class AppInstallerUI extends MMBaseActivity
{
  private static AppInstallerUI xvC = null;
  private String cvZ;
  private String desc;
  private com.tencent.mm.ui.widget.a.c gud;
  private int rlf;
  private com.tencent.mm.ui.widget.a.c xvB;
  private DialogInterface.OnClickListener xvD;

  public AppInstallerUI()
  {
    AppMethodBeat.i(28802);
    this.gud = null;
    this.xvB = null;
    this.xvD = new AppInstallerUI.2(this);
    AppMethodBeat.o(28802);
  }

  public static AppInstallerUI dng()
  {
    return xvC;
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(28803);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.AppInstallerUI", "onCreate");
    com.tencent.mm.sandbox.c.l(hashCode(), this);
    MMActivity.initLanguage(this);
    if ((AppUpdaterUI.dnh() != null) && (!AppUpdaterUI.dnh().isFinishing()))
    {
      ab.d("MicroMsg.AppInstallerUI", "AppUpdaterUI is there, finish self");
      finish();
      AppMethodBeat.o(28803);
    }
    while (true)
    {
      return;
      if ((xvC != null) && (!xvC.isFinishing()) && (xvC != this))
      {
        ab.d("MicroMsg.AppInstallerUI", "duplicate instance, finish self");
        finish();
        AppMethodBeat.o(28803);
      }
      else
      {
        xvC = this;
        this.cvZ = i.dhU();
        if ((bo.isNullOrNil(this.cvZ)) || (com.tencent.mm.sandbox.monitor.c.RP(this.cvZ) == null))
        {
          finish();
          AppMethodBeat.o(28803);
        }
        else
        {
          this.desc = i.dnt();
          this.rlf = i.dnu();
          setContentView(2130969389);
          paramBundle = new c.a(this);
          paramBundle.PV(2131300006);
          paramBundle.rc(true);
          paramBundle.f(new AppInstallerUI.1(this));
          paramBundle.asE(getString(2131300009, new Object[] { this.desc }));
          paramBundle.Qc(2131300625).a(false, this.xvD);
          paramBundle.Qd(2131304158).b(null);
          this.gud = paramBundle.aMb();
          this.gud.setCanceledOnTouchOutside(false);
          this.gud.show();
          h.pYm.a(405L, 71L, 1L, true);
          if (this.rlf == 2)
            i.d(this, 2, i.dnv() + 1);
          AppMethodBeat.o(28803);
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(28804);
    ab.d("MicroMsg.AppInstallerUI", "onDestroy");
    if ((this.gud != null) && (this.gud.isShowing()))
      this.gud.dismiss();
    if ((this.xvB != null) && (this.xvB.isShowing()))
      this.xvB.dismiss();
    if (xvC == this)
      xvC = null;
    com.tencent.mm.sandbox.c.m(hashCode(), this);
    super.onDestroy();
    AppMethodBeat.o(28804);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppInstallerUI
 * JD-Core Version:    0.6.2
 */