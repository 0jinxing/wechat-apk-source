package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.model.av;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI;
import com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI;
import com.tencent.mm.plugin.account.model.j;
import com.tencent.mm.plugin.account.model.j.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import java.util.Map;

public final class o
  implements f, MobileVerifyUI.b
{
  String elr;
  ba gBm;
  g gDu;
  MobileVerifyUI gEE;
  String gEK;
  private boolean gEL;

  public o()
  {
    AppMethodBeat.i(125263);
    this.gDu = null;
    this.gEL = true;
    this.gBm = new ba();
    AppMethodBeat.o(125263);
  }

  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.gEE = paramMobileVerifyUI;
  }

  public final boolean a(MobileVerifyUI.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(125266);
    switch (o.8.gEI[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(125266);
      while (true)
      {
        return bool;
        h.d(this.gEE, this.gEE.getString(2131301473), "", this.gEE.getString(2131301474), this.gEE.getString(2131301475), new o.9(this), new o.10(this));
        AppMethodBeat.o(125266);
        bool = true;
      }
      com.tencent.mm.kernel.g.Rg().a(145, this);
      parama = new com.tencent.mm.modelfriend.a(this.gEE.cFl, 15, this.gEE.grL.getText().toString().trim(), 0, "");
      parama.rV(this.gEE.gDy);
      com.tencent.mm.kernel.g.Rg().a(parama, 0);
      Object localObject = this.gEE;
      MobileVerifyUI localMobileVerifyUI = this.gEE;
      this.gEE.getString(2131297061);
      ((MobileVerifyUI)localObject).ehJ = h.b(localMobileVerifyUI, this.gEE.getString(2131297578), true, new o.11(this, parama));
      continue;
      com.tencent.mm.kernel.g.Rg().a(145, this);
      parama = new com.tencent.mm.modelfriend.a(this.gEE.cFl, 14, "", 0, "");
      parama.rV(this.gEE.gDy);
      com.tencent.mm.kernel.g.Rg().a(parama, 0);
      j.a(j.a.gyY);
      continue;
      parama = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      parama = parama.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_350_auto,");
      com.tencent.mm.kernel.g.RN();
      com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_350_auto") + ",1");
      com.tencent.mm.kernel.g.Rg().a(145, this);
      localObject = new com.tencent.mm.modelfriend.a(this.gEE.cFl, 15, this.gEE.grL.getText().toString().trim(), 0, "");
      ((com.tencent.mm.modelfriend.a)localObject).rV(this.gEE.gDy);
      com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      localMobileVerifyUI = this.gEE;
      parama = this.gEE;
      this.gEE.getString(2131297061);
      localMobileVerifyUI.ehJ = h.b(parama, this.gEE.getString(2131297578), true, new o.1(this, (com.tencent.mm.modelfriend.a)localObject));
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, final String paramString, final com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125267);
    ab.i("MicroMsg.MobileVerifyRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gEE.ehJ != null)
    {
      this.gEE.ehJ.dismiss();
      this.gEE.ehJ = null;
    }
    if (paramm.getType() == 255)
    {
      com.tencent.mm.kernel.g.Rg().b(255, this);
      if ((paramInt2 == -3) && (paramInt1 == 4))
        this.gEE.dq(this.gEL);
      AppMethodBeat.o(125267);
    }
    Object localObject1;
    int i;
    Object localObject2;
    while (true)
    {
      return;
      if (((paramm.getType() == 701) || (paramm.getType() == 701)) && (this.gDu != null))
      {
        com.tencent.mm.kernel.g.Rg().b(701, this);
        com.tencent.mm.kernel.g.Rg().b(252, this);
        this.gDu.a(this.gEE, paramInt1, paramInt2, paramString, paramm);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if ((paramm instanceof q))
            this.gEL = ((q)paramm).ajv();
          com.tencent.mm.kernel.g.Rg().a(255, this);
          paramm = new r(1);
          com.tencent.mm.kernel.g.Rg().a(paramm, 0);
          localObject1 = this.gEE;
          paramString = this.gEE;
          this.gEE.getString(2131297061);
          ((MobileVerifyUI)localObject1).ehJ = h.b(paramString, this.gEE.getString(2131296965), true, new o.12(this, paramm));
        }
        AppMethodBeat.o(125267);
      }
      else if (paramm.getType() == 145)
      {
        com.tencent.mm.kernel.g.Rg().b(145, this);
        i = ((com.tencent.mm.modelfriend.a)paramm).Ah();
        if (i != 15)
        {
          AppMethodBeat.o(125267);
        }
        else if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (i == 15)
          {
            if (this.gEE.gEs == 1)
            {
              this.gEK = ((com.tencent.mm.modelfriend.a)paramm).agg();
              com.tencent.mm.kernel.g.Rg().a(126, this);
              localObject1 = new s("", this.gEE.gEk, this.gEE.bCu, 0, "", this.gEE.cFl, "", "", this.gEK, this.gEE.fPA, "", "", "", true, this.gEE.gFf.booleanValue());
              ((s)localObject1).ts(this.gEE.gDy);
              ((s)localObject1).tt(this.gEE.gFm);
              com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
              paramString = this.gEE;
              paramm = this.gEE;
              this.gEE.getString(2131297061);
              paramString.ehJ = h.b(paramm, this.gEE.getString(2131302326), true, new o.7(this, (s)localObject1));
              AppMethodBeat.o(125267);
            }
            else
            {
              paramString = new Intent();
              paramString.putExtra("regsetinfo_ticket", ((com.tencent.mm.modelfriend.a)paramm).agg());
              paramString.putExtra("regsetinfo_user", this.gEE.cFl);
              paramString.putExtra("regsession_id", this.gEE.gDy);
              paramString.putExtra("reg_3d_app_ticket", this.gEE.gFm);
              paramString.putExtra("reg_3d_app_type", this.gEE.gEu);
              paramString.putExtra("regsetinfo_ismobile", 4);
              paramString.putExtra("regsetinfo_NextControl", ((com.tencent.mm.modelfriend.a)paramm).agm());
              paramString.putExtra("key_reg_style", this.gEE.gEs);
              paramString.setClass(this.gEE, RegSetInfoUI.class);
              this.gEE.startActivity(paramString);
              j.a(j.a.gyZ);
            }
          }
          else
            AppMethodBeat.o(125267);
        }
        else if (paramInt2 == -35)
        {
          paramString = com.tencent.mm.h.a.jY(paramString);
          this.gBm.daR = this.gEE.gEu;
          this.gBm.cVS = 7L;
          this.gBm.ajK();
          if (paramString != null)
          {
            paramString.a(this.gEE, new o.13(this, paramm), new o.14(this));
            AppMethodBeat.o(125267);
          }
          else
          {
            h.a(this.gEE, this.gEE.getString(2131297520), null, new o.15(this, paramm), new o.16(this));
            AppMethodBeat.o(125267);
          }
        }
        else if (paramInt2 == -212)
        {
          paramString = new Intent(this.gEE, MobileLoginOrForceReg.class);
          paramString.putExtra("ticket", ((com.tencent.mm.modelfriend.a)paramm).agg());
          paramString.putExtra("moble", this.gEE.cFl);
          paramString.putExtra("regsession_id", this.gEE.gDy);
          paramString.putExtra("reg_3d_app_ticket", this.gEE.gFm);
          paramString.putExtra("reg_3d_app_type", this.gEE.gEu);
          paramString.putExtra("next_controll", ((com.tencent.mm.modelfriend.a)paramm).agm());
          paramString.putExtra("username", ((com.tencent.mm.modelfriend.a)paramm).getUsername());
          paramString.putExtra("password", ((com.tencent.mm.modelfriend.a)paramm).agf());
          paramString.putExtra("nickname", ((com.tencent.mm.modelfriend.a)paramm).ags());
          paramString.putExtra("avatar_url", ((com.tencent.mm.modelfriend.a)paramm).agr());
          paramString.putExtra("key_reg_style", this.gEE.gEs);
          if (this.gEE.gEs == 1)
          {
            paramString.putExtra("kintent_nickname", this.gEE.bCu);
            paramString.putExtra("kintent_password", this.gEE.gEk);
            paramString.putExtra("kintent_hasavatar", this.gEE.gFf);
          }
          this.gEE.startActivity(paramString);
          AppMethodBeat.o(125267);
        }
        else
        {
          if (paramInt2 != -51)
            break label2223;
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this.gEE, null, null);
            AppMethodBeat.o(125267);
          }
          else
          {
            h.g(this.gEE, 2131297583, 2131297589);
            AppMethodBeat.o(125267);
          }
        }
      }
      else
      {
        if (paramm.getType() != 126)
          break label2223;
        if ((paramInt2 != -6) && (paramInt2 != -311) && (paramInt2 != -310))
          break;
        localObject2 = this.gEE.gFf;
        paramString = this.gEE.gEk;
        localObject1 = this.gEE.bCu;
        if (this.gEE.gue == null)
        {
          this.gEE.gue = SecurityImage.a.a(this.gEE, 0, ((s)paramm).ajo(), ((s)paramm).ajn(), "", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(125252);
              com.tencent.mm.kernel.g.Rg().a(126, o.this);
              paramAnonymousDialogInterface = new s("", paramString, this.gEx, 0, "", o.this.gEE.cFl, "", "", o.this.gEK, o.this.gEE.fPA, "", ((s)paramm).ajn(), o.this.gEE.gue.getSecImgCode(), true, this.gEy.booleanValue());
              paramAnonymousDialogInterface.ts(o.this.gEE.gDy);
              paramAnonymousDialogInterface.tt(o.this.gEE.gFm);
              com.tencent.mm.kernel.g.Rg().a(paramAnonymousDialogInterface, 0);
              MobileVerifyUI localMobileVerifyUI1 = o.this.gEE;
              MobileVerifyUI localMobileVerifyUI2 = o.this.gEE;
              o.this.gEE.getString(2131297061);
              localMobileVerifyUI1.ehJ = h.b(localMobileVerifyUI2, o.this.gEE.getString(2131302326), true, new o.2.1(this, paramAnonymousDialogInterface));
              AppMethodBeat.o(125252);
            }
          }
          , null, new o.3(this), new o.4(this, paramString, (String)localObject1, paramm, (Boolean)localObject2));
          AppMethodBeat.o(125267);
        }
        else
        {
          this.gEE.gue.b(0, ((s)paramm).ajo(), ((s)paramm).ajn(), "");
          AppMethodBeat.o(125267);
        }
      }
    }
    String str1;
    Object localObject3;
    int j;
    String str2;
    int k;
    String str3;
    boolean bool1;
    boolean bool2;
    Object localObject4;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      str1 = this.gEE.cFl;
      localObject3 = this.gEE.gFf;
      this.gBm.daR = this.gEE.gEu;
      this.gBm.cVS = 6L;
      this.gBm.ajK();
      j = ((s)paramm).ajx();
      str2 = ((s)paramm).ajy();
      k = ((s)paramm).ajz();
      str3 = ((s)paramm).ajA();
      localObject1 = null;
      localObject2 = null;
      bool1 = false;
      bool2 = false;
      Map localMap = br.z(str3, "wording");
      if (localMap == null)
        break label2354;
      localObject4 = (String)localMap.get(".wording.switch");
      if (!bo.isNullOrNil((String)localObject4))
        break label1858;
      bool2 = true;
      label1498: bool1 = bool2;
      if (!bool2)
        break label2354;
      localObject4 = (String)localMap.get(".wording.title");
      if (!bo.isNullOrNil((String)localObject4))
        localObject1 = localObject4;
      localObject4 = (String)localMap.get(".wording.desc");
      if (bo.isNullOrNil((String)localObject4))
        break label2351;
      localObject2 = localObject4;
    }
    while (true)
    {
      ab.i("MicroMsg.MobileVerifyRegLogic", "hasSetAvatar , %s", new Object[] { localObject3 });
      ab.i("MicroMsg.MobileVerifyRegLogic", "styleId , %s", new Object[] { Integer.valueOf(j) });
      ab.i("MicroMsg.MobileVerifyRegLogic", "nextStep , %s", new Object[] { str2 });
      ab.i("MicroMsg.MobileVerifyRegLogic", "nextStyle , %s", new Object[] { Integer.valueOf(k) });
      ab.i("MicroMsg.MobileVerifyRegLogic", "mShowStyleContactUploadWordings , %s", new Object[] { str3 });
      com.tencent.mm.kernel.a.unhold();
      com.tencent.mm.kernel.a.cm(true);
      if (((Boolean)localObject3).booleanValue())
      {
        localObject4 = com.tencent.mm.compatible.util.e.euY + "temp.avatar";
        localObject3 = com.tencent.mm.compatible.util.e.euY + "temp.avatar.hd";
        com.tencent.mm.vfs.e.aQ((String)localObject4, (String)localObject3);
        com.tencent.mm.vfs.e.deleteFile((String)localObject4);
        d.c((String)localObject3, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject4);
        new com.tencent.mm.ah.m(this.gEE, com.tencent.mm.compatible.util.e.euY + "temp.avatar").a(new o.5(this, paramm, str1, str2, bool2, (String)localObject1, (String)localObject2, k), new o.6(this, paramm, str1, str2, bool2, (String)localObject1, (String)localObject2, k));
      }
      while (true)
      {
        localObject1 = com.tencent.mm.h.a.jY(paramString);
        if (localObject1 == null)
          break label2223;
        ((com.tencent.mm.h.a)localObject1).a(this.gEE, null, null);
        AppMethodBeat.o(125267);
        break;
        label1858: i = bo.ank((String)localObject4);
        if (i == 0)
        {
          bool2 = false;
          break label1498;
        }
        if (i != 1)
          break label1498;
        bool2 = true;
        break label1498;
        this.elr = ((s)paramm).ajw();
        av.fly.ak("login_user_name", str1);
        if ((str2 != null) && (str2.contains("0")))
        {
          com.tencent.mm.plugin.b.a.wA("R300_100_phone");
          if (!bool2);
          for (localObject1 = new Intent(this.gEE, FindMContactIntroUI.class); ; localObject1 = localObject4)
          {
            ((Intent)localObject1).addFlags(67108864);
            ((Intent)localObject1).putExtra("regsetinfo_ticket", this.elr);
            ((Intent)localObject1).putExtra("regsetinfo_NextStep", str2);
            ((Intent)localObject1).putExtra("regsetinfo_NextStyle", k);
            localObject2 = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gEE);
            ((Intent)localObject2).addFlags(67108864);
            ((Intent)localObject2).putExtra("LauncherUI.enter_from_reg", true);
            MMWizardActivity.b(this.gEE, (Intent)localObject1, (Intent)localObject2);
            this.gEE.finish();
            break;
            localObject4 = new Intent(this.gEE, FindMContactAlertUI.class);
            ((Intent)localObject4).putExtra("alert_title", (String)localObject1);
            ((Intent)localObject4).putExtra("alert_message", (String)localObject2);
          }
        }
        localObject1 = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gEE);
        ((Intent)localObject1).addFlags(67108864);
        ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
        this.gEE.startActivity((Intent)localObject1);
        localObject1 = new StringBuilder();
        com.tencent.mm.kernel.g.RN();
        localObject1 = ((StringBuilder)localObject1).append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gEE.getClass().getName()).append(",R200_900_phone,");
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_900_phone") + ",4");
        this.gEE.finish();
      }
      label2223: if (this.gEE.j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(125267);
        break;
      }
      if ((paramm.getType() == 252) || (paramm.getType() == 701))
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if ((paramString != null) && (paramString.a(this.gEE, null, null)))
        {
          AppMethodBeat.o(125267);
          break;
        }
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
        Toast.makeText(this.gEE, this.gEE.getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(125267);
      break;
      label2351: continue;
      label2354: localObject1 = null;
      bool2 = bool1;
    }
  }

  public final void start()
  {
    AppMethodBeat.i(125264);
    com.tencent.mm.kernel.g.Rg().a(126, this);
    AppMethodBeat.o(125264);
  }

  public final void stop()
  {
    AppMethodBeat.i(125265);
    com.tencent.mm.kernel.g.Rg().b(126, this);
    AppMethodBeat.o(125265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.o
 * JD-Core Version:    0.6.2
 */