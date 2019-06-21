package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.i.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;

public class AppUpdaterUI extends MMBaseActivity
{
  private static AppUpdaterUI xvH = null;
  private com.tencent.mm.ui.widget.a.c gud;
  private Button jAH;
  private DialogInterface.OnClickListener xvD;
  private Button xvG;
  private j xvI;
  private g xvJ;
  private DialogInterface.OnClickListener xvK;

  public AppUpdaterUI()
  {
    AppMethodBeat.i(28830);
    this.gud = null;
    this.xvJ = new AppUpdaterUI.1(this);
    this.xvK = new AppUpdaterUI.9(this);
    this.xvD = new AppUpdaterUI.10(this);
    AppMethodBeat.o(28830);
  }

  public static AppUpdaterUI dnh()
  {
    return xvH;
  }

  public static void dni()
  {
    AppMethodBeat.i(28831);
    if (xvH != null)
      xvH.dnj();
    AppMethodBeat.o(28831);
  }

  private void dnj()
  {
    AppMethodBeat.i(28834);
    if ((this.gud != null) && (this.gud.isShowing()))
      this.gud.dismiss();
    finish();
    AppMethodBeat.o(28834);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(28832);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.AppUpdaterUI", "onCreate");
    com.tencent.mm.sandbox.c.l(hashCode(), this);
    MMActivity.initLanguage(this);
    if ((AppInstallerUI.dng() != null) && (!AppInstallerUI.dng().isFinishing()))
    {
      ab.d("MicroMsg.AppUpdaterUI", "AppInstallerUI is there, finish self");
      finish();
      AppMethodBeat.o(28832);
    }
    while (true)
    {
      return;
      if ((xvH != null) && (!xvH.isFinishing()) && (xvH != this))
      {
        ab.d("MicroMsg.AppUpdaterUI", "duplicate instance, finish self");
        ab.d("MicroMsg.AppUpdaterUI", "we already got one instance, does it gonna leak?");
        finish();
        AppMethodBeat.o(28832);
      }
      else
      {
        xvH = this;
        setContentView(2130969389);
        this.xvI = j.a.xxg;
        if (!this.xvI.aK(getIntent()))
        {
          ab.e("MicroMsg.AppUpdaterUI", "updaterManager.handleCommand return false");
          dnj();
          AppMethodBeat.o(28832);
        }
        else
        {
          if ((this.xvI.xvw != 999) || (this.xvI.xvX == null) || (this.xvI.xvX.length <= 0))
            break;
          ab.d("MicroMsg.AppUpdaterUI", "into emergency status");
          new ak().postDelayed(new AppUpdaterUI.7(this), 100L);
          AppMethodBeat.o(28832);
        }
      }
    }
    ab.d("MicroMsg.AppUpdaterUI", "showUpdateDlg, downloadUrls = " + this.xvI.xvX);
    Object localObject = new c.a(this);
    ((c.a)localObject).PV(2131300006);
    ((c.a)localObject).rc(true);
    ((c.a)localObject).f(new AppUpdaterUI.8(this));
    if ((this.xvI.xwU) && (this.xvI.xwT != null))
    {
      paramBundle = getString(2131300008, new Object[] { this.xvI.desc, getString(2131304166), bo.ga(this.xvI.xwT.size) });
      label375: if (this.xvI.xvw == 1)
        break label606;
    }
    label606: for (int i = 2131304158; ; i = 2131304161)
    {
      ((c.a)localObject).asE(paramBundle);
      ((c.a)localObject).Qc(2131304170).a(false, this.xvD);
      ((c.a)localObject).Qd(i);
      this.gud = ((c.a)localObject).aMb();
      this.gud.setCanceledOnTouchOutside(false);
      this.xvG = this.gud.getButton(-1);
      this.jAH = this.gud.getButton(-2);
      this.gud.show();
      if (this.xvI.rlf == 1)
        i.aq(this, 5);
      if (this.xvI.xwY)
        h.pYm.a(614L, 60L, 1L, false);
      localObject = this.xvI;
      paramBundle = this.xvJ;
      if ((paramBundle != null) && (!((j)localObject).xwP.contains(paramBundle)))
        ((j)localObject).xwP.add(paramBundle);
      AppMethodBeat.o(28832);
      break;
      ab.d("MicroMsg.AppUpdaterUI", "had try to download full pack.");
      paramBundle = getString(2131300008, new Object[] { this.xvI.desc, getString(2131304162), bo.ga(this.xvI.size) });
      break label375;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(28833);
    ab.d("MicroMsg.AppUpdaterUI", "onDestroy");
    com.tencent.mm.sandbox.c.m(hashCode(), this);
    if (this.xvI != null)
    {
      j localj = this.xvI;
      g localg = this.xvJ;
      localj.xwP.remove(localg);
    }
    if (xvH == this)
      xvH = null;
    super.onDestroy();
    AppMethodBeat.o(28833);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI
 * JD-Core Version:    0.6.2
 */