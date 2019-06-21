package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;

public final class m
  implements com.tencent.mm.ai.f, MobileVerifyUI.b
{
  f gBT;
  private int gDW;
  private g gDu;
  MobileVerifyUI gEE;
  SecurityImage gue;

  public m(int paramInt)
  {
    AppMethodBeat.i(125238);
    this.gDu = null;
    this.gue = null;
    this.gBT = null;
    this.gDW = paramInt;
    ab.i("MicroMsg.MobileVerifyForgetPwdLogic", "forget pwd, purpose %d", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(125238);
  }

  private void arg()
  {
    AppMethodBeat.i(125242);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_350_auto,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_350_auto") + ",1");
    com.tencent.mm.kernel.g.Rg().a(145, this);
    com.tencent.mm.kernel.g.Rg().a(132, this);
    localObject = null;
    if (this.gDW == 3)
      localObject = new com.tencent.mm.modelfriend.a(this.gEE.cFl, 9, this.gEE.grL.getText().toString().trim(), 0, "");
    while (true)
    {
      if (localObject != null)
      {
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
        MobileVerifyUI localMobileVerifyUI1 = this.gEE;
        MobileVerifyUI localMobileVerifyUI2 = this.gEE;
        this.gEE.getString(2131297061);
        localMobileVerifyUI1.ehJ = h.b(localMobileVerifyUI2, this.gEE.getString(2131297578), true, new m.1(this, (com.tencent.mm.ai.m)localObject));
      }
      AppMethodBeat.o(125242);
      return;
      if (this.gDW == 5)
        localObject = new x(this.gEE.cFl, 21, this.gEE.grL.getText().toString().trim(), 0, "");
    }
  }

  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.gEE = paramMobileVerifyUI;
  }

  public final boolean a(MobileVerifyUI.a parama)
  {
    AppMethodBeat.i(125241);
    switch (m.5.gEI[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(125241);
      return false;
      arg();
      continue;
      parama = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      parama = parama.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_400,");
      com.tencent.mm.kernel.g.RN();
      com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_400") + ",1");
      parama = null;
      if (this.gDW == 3)
        parama = new com.tencent.mm.modelfriend.a(this.gEE.cFl, 8, "", 0, "");
      while (parama != null)
      {
        com.tencent.mm.kernel.g.Rg().a(parama, 0);
        break;
        if (this.gDW == 5)
          parama = new x(this.gEE.cFl, 20, "", 0, "");
      }
      arg();
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125243);
    ab.i("MicroMsg.MobileVerifyForgetPwdLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gEE.ehJ != null)
    {
      this.gEE.ehJ.dismiss();
      this.gEE.ehJ = null;
    }
    if (this.gBT == null)
      this.gBT = new f();
    if (((paramm.getType() == 252) || (paramm.getType() == 701)) && (this.gDu != null))
    {
      com.tencent.mm.kernel.g.Rg().b(701, this);
      com.tencent.mm.kernel.g.Rg().b(252, this);
      this.gBT.guh = ((q)paramm).ajn();
      this.gBT.gug = ((q)paramm).ajo();
      this.gBT.gui = ((q)paramm).ajp();
      this.gBT.gCL = ((q)paramm).getSecCodeType();
      if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
      {
        com.tencent.mm.kernel.g.Rg().a(701, this);
        com.tencent.mm.kernel.g.Rg().a(252, this);
        if (this.gue == null)
        {
          this.gue = SecurityImage.a.a(this.gEE, this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui, new m.2(this), null, new m.3(this), this.gBT);
          AppMethodBeat.o(125243);
        }
      }
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.MobileVerifyForgetPwdLogic", "imgSid:" + this.gBT.guh + " img len" + this.gBT.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
      this.gue.b(this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui);
      AppMethodBeat.o(125243);
      continue;
      this.gDu.a(this.gEE, paramInt1, paramInt2, paramString, paramm);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        boolean bool = true;
        if ((paramm instanceof q))
          bool = ((q)paramm).ajv();
        this.gEE.dq(bool);
      }
      AppMethodBeat.o(125243);
      continue;
      if (paramm.getType() == 145)
      {
        this.gBT.account = ((com.tencent.mm.modelfriend.a)paramm).getUsername();
        this.gBT.gCK = ((com.tencent.mm.modelfriend.a)paramm).agf();
        com.tencent.mm.kernel.g.Rg().b(145, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (this.gDW == 3)
          {
            com.tencent.mm.kernel.g.Rg().a(701, this);
            com.tencent.mm.kernel.g.Rg().a(252, this);
            this.gDu = new g(new m.4(this), ((com.tencent.mm.modelfriend.a)paramm).getUsername(), ((com.tencent.mm.modelfriend.a)paramm).agf(), this.gEE.cFl);
            this.gDu.a(this.gEE);
          }
          AppMethodBeat.o(125243);
        }
        else if (paramInt2 == -51)
        {
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this.gEE, null, null);
            AppMethodBeat.o(125243);
            continue;
          }
          h.g(this.gEE, 2131297583, 2131297589);
          AppMethodBeat.o(125243);
        }
      }
      else if (paramm.getType() == 132)
      {
        com.tencent.mm.kernel.g.Rg().b(132, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (this.gDW == 5)
          {
            paramString = ((x)paramm).agg();
            paramm = new Intent();
            paramm.putExtra("setpwd_ticket", paramString);
            this.gEE.setResult(-1, paramm);
            this.gEE.finish();
          }
          AppMethodBeat.o(125243);
        }
        else if (paramInt2 == -51)
        {
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this.gEE, null, null);
            AppMethodBeat.o(125243);
            continue;
          }
          h.g(this.gEE, 2131297583, 2131297589);
          AppMethodBeat.o(125243);
        }
      }
      else if (this.gEE.j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(125243);
      }
      else if ((paramm.getType() == 252) || (paramm.getType() == 701))
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if ((paramString != null) && (paramString.a(this.gEE, null, null)))
          AppMethodBeat.o(125243);
      }
      else
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
          Toast.makeText(this.gEE, this.gEE.getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(125243);
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(125239);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",F200_300,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F200_300") + ",1");
    com.tencent.mm.plugin.b.a.wz("F200_300");
    AppMethodBeat.o(125239);
  }

  public final void stop()
  {
    AppMethodBeat.i(125240);
    int i = 2;
    if (this.gEE.gFj != -1)
      i = this.gEE.gFj;
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",F200_300,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("F200_300") + "," + i);
    AppMethodBeat.o(125240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.m
 * JD-Core Version:    0.6.2
 */