package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.u;

public class NewTaskUI extends MMBaseActivity
  implements f
{
  static NewTaskUI zGD;
  private ProgressDialog ehJ;
  private c gAY;
  private SecurityImage gue;
  private g zGE;

  public NewTaskUI()
  {
    AppMethodBeat.i(34922);
    this.gue = null;
    this.zGE = new g();
    this.ehJ = null;
    this.gAY = new NewTaskUI.1(this);
    AppMethodBeat.o(34922);
  }

  public static NewTaskUI dJR()
  {
    return zGD;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34923);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.NewTaskUI", "onCreate :%d", new Object[] { Integer.valueOf(hashCode()) });
    setContentView(2130968794);
    aw.Rg().a(701, this);
    aw.Rg().a(252, this);
    zGD = this;
    paramBundle = new q(0, "", "", "");
    aw.Rg().a(paramBundle, 0);
    getString(2131297061);
    this.ehJ = h.b(this, getString(2131301031), true, new NewTaskUI.2(this, paramBundle));
    AppMethodBeat.o(34923);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34926);
    ab.i("MicroMsg.NewTaskUI", "onDestroy :%d", new Object[] { Integer.valueOf(hashCode()) });
    if (equals(zGD))
      zGD = null;
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    if (this.gue != null)
      this.gue.dismiss();
    aw.Rg().b(701, this);
    aw.Rg().b(252, this);
    super.onDestroy();
    AppMethodBeat.o(34926);
  }

  public void onPause()
  {
    AppMethodBeat.i(34925);
    super.onPause();
    a.xxA.d(this.gAY);
    AppMethodBeat.o(34925);
  }

  public void onResume()
  {
    AppMethodBeat.i(34924);
    a.xxA.c(this.gAY);
    super.onResume();
    AppMethodBeat.o(34924);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(34927);
    ab.i("MicroMsg.NewTaskUI", "onSceneEnd :%d  [%d,%d,%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    if ((paramInt1 == 4) && (paramInt2 == -3))
    {
      ab.i("MicroMsg.NewTaskUI", "summerauth MM_ERR_PASSWORD need kick out acc ready[%b]", new Object[] { Boolean.valueOf(aw.RK()) });
      if (u.a(zGD, paramInt1, paramInt2, new Intent().setClass(zGD, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
        AppMethodBeat.o(34927);
    }
    while (true)
    {
      return;
      if ((paramInt1 != 4) || ((paramInt2 != -6) && (paramInt2 != -311) && (paramInt2 != -310)))
      {
        zGD = null;
        finish();
        AppMethodBeat.o(34927);
      }
      else
      {
        if ((paramm instanceof q))
        {
          paramString = (q)paramm;
          this.zGE.gCL = paramString.getSecCodeType();
          this.zGE.gug = paramString.ajo();
          this.zGE.guh = paramString.ajn();
          this.zGE.gui = paramString.ajp();
          ab.i("MicroMsg.NewTaskUI", "onSceneEnd dkwt imgSid:" + this.zGE.guh + " img len" + this.zGE.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
        }
        if (this.gue == null)
        {
          this.gue = SecurityImage.a.a(this, this.zGE.gCL, this.zGE.gug, this.zGE.guh, this.zGE.gui, new NewTaskUI.3(this), new NewTaskUI.4(this), new NewTaskUI.5(this), this.zGE);
          AppMethodBeat.o(34927);
        }
        else
        {
          ab.d("MicroMsg.NewTaskUI", "imgSid:" + this.zGE.guh + " img len" + this.zGE.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
          this.gue.b(this.zGE.gCL, this.zGE.gug, this.zGE.guh, this.zGE.gui);
          AppMethodBeat.o(34927);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.NewTaskUI
 * JD-Core Version:    0.6.2
 */