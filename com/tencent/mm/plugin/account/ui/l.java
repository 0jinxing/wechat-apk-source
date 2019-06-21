package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.bx;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.platformtools.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

public final class l
  implements com.tencent.mm.ai.f, MobileInputUI.b
{
  String account;
  private String cOG;
  private String gCZ;
  private boolean gCm = true;
  private String gDC;
  MobileInputUI gDo;
  SecurityImage gue = null;
  private String gzO;

  private void ard()
  {
    AppMethodBeat.i(125149);
    if (this.gDo.flQ == 6)
    {
      this.gDo.gDJ.reset();
      this.gDo.gDR.setText(2131301027);
      this.gDo.gCV.setVisibility(8);
      this.gDo.gDJ.setVisibility(0);
      this.gDo.gDJ.getContentEditText().requestFocus();
      this.gDo.gDJ.setSendSmsBtnClickListener(new l.9(this));
      this.gDo.gDR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(125142);
          l.this.gDo.gCr[1] = 2;
          l.this.gDo.flQ = 7;
          l.this.gDo.gDJ.reset();
          com.tencent.mm.kernel.g.Rg().b(145, l.this);
          l.a(l.this);
          AppMethodBeat.o(125142);
        }
      });
      AppMethodBeat.o(125149);
    }
    while (true)
    {
      return;
      if (this.gDo.flQ == 7)
      {
        this.gDo.gDR.setText(2131301028);
        this.gDo.gCV.setVisibility(0);
        this.gDo.gBJ.requestFocus();
        this.gDo.gDJ.setVisibility(8);
        this.gDo.gDR.setOnClickListener(new l.11(this));
      }
      AppMethodBeat.o(125149);
    }
  }

  private void bk(String paramString1, String paramString2)
  {
    AppMethodBeat.i(125153);
    if (bo.isNullOrNil(paramString1))
    {
      com.tencent.mm.ui.base.h.g(this.gDo, 2131304239, 2131301017);
      AppMethodBeat.o(125153);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString2))
      {
        com.tencent.mm.ui.base.h.g(this.gDo, 2131304235, 2131301017);
        AppMethodBeat.o(125153);
      }
      else
      {
        this.gDo.gBJ.setText(paramString2);
        this.gDo.aqX();
        paramString2 = new q(paramString1, paramString2, null, 1);
        com.tencent.mm.kernel.g.Rg().a(paramString2, 0);
        paramString1 = this.gDo;
        MobileInputUI localMobileInputUI = this.gDo;
        this.gDo.getString(2131297061);
        paramString1.guc = com.tencent.mm.ui.base.h.b(localMobileInputUI, this.gDo.getString(2131301031), true, new l.14(this, paramString2));
        AppMethodBeat.o(125153);
      }
    }
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(125155);
    if (com.tencent.mm.plugin.account.a.a.gkF.a(this.gDo, paramInt1, paramInt2, paramString))
    {
      AppMethodBeat.o(125155);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramInt1 == 4);
      switch (paramInt2)
      {
      default:
        AppMethodBeat.o(125155);
        break;
      case -1:
        if (com.tencent.mm.kernel.g.Rg().acS() == 5)
        {
          com.tencent.mm.ui.base.h.g(this.gDo, 2131301656, 2131301655);
          AppMethodBeat.o(125155);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(125155);
        }
        break;
      case -3:
        com.tencent.mm.ui.base.h.g(this.gDo, 2131299241, 2131301017);
        AppMethodBeat.o(125155);
        bool = true;
        break;
      case -9:
        com.tencent.mm.ui.base.h.g(this.gDo, 2131301016, 2131301017);
        AppMethodBeat.o(125155);
        bool = true;
        break;
      case -100:
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.kernel.a.hold();
        MobileInputUI localMobileInputUI = this.gDo;
        com.tencent.mm.kernel.g.RN();
        if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
        for (paramString = com.tencent.mm.bz.a.an(this.gDo, 2131301294); ; paramString = com.tencent.mm.kernel.a.QH())
        {
          com.tencent.mm.ui.base.h.a(localMobileInputUI, paramString, this.gDo.getString(2131297061), new l.6(this), new l.7(this));
          AppMethodBeat.o(125155);
          bool = true;
          break;
          com.tencent.mm.kernel.g.RN();
        }
      case -140:
        if (!bo.isNullOrNil(this.cOG))
          z.o(this.gDo, paramString, this.cOG);
        AppMethodBeat.o(125155);
        bool = true;
        break;
      case -34:
        Toast.makeText(this.gDo, 2131297538, 0).show();
        AppMethodBeat.o(125155);
        bool = true;
        break;
      case -32:
        com.tencent.mm.ui.base.h.a(this.gDo, 2131297585, 2131297589, null);
        AppMethodBeat.o(125155);
        bool = true;
        break;
      case -33:
        com.tencent.mm.ui.base.h.a(this.gDo, 2131297583, 2131297589, null);
        AppMethodBeat.o(125155);
        bool = true;
      }
    }
  }

  public final void a(MobileInputUI.a parama)
  {
    AppMethodBeat.i(125152);
    switch (l.8.gDt[parama.ordinal()])
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(125152);
      while (true)
      {
        return;
        this.gDo.aqX();
        this.gDo.gDU = com.tencent.mm.sdk.platformtools.av.amP(this.gDo.countryCode);
        this.gDo.gDV = this.gDo.gDI.getText().toString();
        if ((bo.isNullOrNil(this.gDo.gDU)) || (bo.isNullOrNil(this.gDo.gDV)))
        {
          AppMethodBeat.o(125152);
        }
        else if (this.gDo.flQ == 7)
        {
          if (!bo.isNullOrNil(this.gDC))
          {
            bk(this.account, this.gDC);
            AppMethodBeat.o(125152);
          }
          else
          {
            bk(this.account, this.gDo.gBJ.getText().toString());
            AppMethodBeat.o(125152);
          }
        }
        else
        {
          if (this.gDo.flQ != 6)
            break;
          parama = this.gDo.gDJ.getText().toString().trim();
          if (!bo.isNullOrNil(parama))
            break label249;
          com.tencent.mm.ui.base.h.g(this.gDo, 2131304238, 2131301017);
          AppMethodBeat.o(125152);
        }
      }
      label249: this.gDo.aqX();
      com.tencent.mm.modelfriend.a locala = new com.tencent.mm.modelfriend.a(this.account, 17, parama, 0, "");
      com.tencent.mm.kernel.g.Rg().a(locala, 0);
      MobileInputUI localMobileInputUI = this.gDo;
      parama = this.gDo;
      this.gDo.getString(2131297061);
      localMobileInputUI.guc = com.tencent.mm.ui.base.h.b(parama, this.gDo.getString(2131297578), true, new l.12(this, locala));
    }
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    AppMethodBeat.i(125148);
    this.gDo = paramMobileInputUI;
    paramMobileInputUI.gDP.setVisibility(0);
    this.account = paramMobileInputUI.getIntent().getStringExtra("binded_mobile");
    if (bo.isNullOrNil(this.account))
      this.account = com.tencent.mm.sdk.platformtools.av.amN(paramMobileInputUI.gDU + paramMobileInputUI.gDV);
    paramMobileInputUI.gDI.setTextColor(paramMobileInputUI.getResources().getColor(2131690164));
    paramMobileInputUI.gDI.setEnabled(false);
    paramMobileInputUI.gDI.setFocusable(false);
    paramMobileInputUI.gDH.setFocusable(false);
    paramMobileInputUI.gDH.setText(com.tencent.mm.sdk.platformtools.av.amN(this.account));
    paramMobileInputUI.gDH.setVisibility(0);
    ard();
    paramMobileInputUI.gDR.setVisibility(0);
    paramMobileInputUI.gDN.setText(2131301024);
    paramMobileInputUI.gDN.setVisibility(0);
    paramMobileInputUI.gDN.setEnabled(true);
    this.gCZ = com.tencent.mm.model.av.fly.T("login_weixin_username", "");
    this.gzO = paramMobileInputUI.getIntent().getStringExtra("auth_ticket");
    if (!bo.isNullOrNil(this.gzO))
      new ak().postDelayed(new l.1(this), 500L);
    AppMethodBeat.o(125148);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, final com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125154);
    ab.i("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gDo.guc != null)
    {
      this.gDo.guc.dismiss();
      this.gDo.guc = null;
    }
    if (paramm.getType() == 145)
    {
      i = ((com.tencent.mm.modelfriend.a)paramm).Ah();
      if (i == 16)
        if (paramInt2 == -41)
        {
          this.gDo.gDJ.reset();
          com.tencent.mm.ui.base.h.g(this.gDo, 2131302269, 2131302270);
          AppMethodBeat.o(125154);
        }
    }
    label332: Object localObject;
    while (true)
    {
      return;
      if (paramInt2 == -75)
      {
        this.gDo.gDJ.reset();
        com.tencent.mm.ui.base.h.b(this.gDo, this.gDo.getString(2131296515), "", true);
        AppMethodBeat.o(125154);
      }
      else if (paramInt2 == -106)
      {
        this.gDo.gDJ.reset();
        z.f(this.gDo, paramString, 32045);
        AppMethodBeat.o(125154);
        continue;
        if (i == 17)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            new g(new l.15(this), ((com.tencent.mm.modelfriend.a)paramm).getUsername(), ((com.tencent.mm.modelfriend.a)paramm).agf(), this.account).a(this.gDo);
            AppMethodBeat.o(125154);
            continue;
          }
          if (j(paramInt1, paramInt2, paramString))
          {
            AppMethodBeat.o(125154);
            continue;
          }
          paramm = com.tencent.mm.h.a.jY(paramString);
          if (paramm != null)
            paramm.a(this.gDo, null, null);
        }
      }
      else
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if ((paramString == null) || (this.gDo == null) || (!paramString.a(this.gDo, null, null)))
          break label1422;
        AppMethodBeat.o(125154);
        continue;
        if ((paramm.getType() != 252) && (paramm.getType() != 701))
          break label1324;
        this.cOG = ((q)paramm).ajm();
        localObject = new f();
        ((f)localObject).guh = ((q)paramm).ajn();
        ((f)localObject).gug = ((q)paramm).ajo();
        ((f)localObject).gui = ((q)paramm).ajp();
        ((f)localObject).gCL = ((q)paramm).getSecCodeType();
        ((f)localObject).account = ((q)paramm).account;
        ((f)localObject).guf = this.gDo.gBJ.getText().toString();
        if (paramInt2 == -75)
        {
          z.cu(this.gDo);
          AppMethodBeat.o(125154);
        }
        else if (paramInt2 == -106)
        {
          z.f(this.gDo, paramString, 32045);
          AppMethodBeat.o(125154);
        }
        else if (paramInt2 == -217)
        {
          z.a(this.gDo, e.a((q)paramm), paramInt2);
          AppMethodBeat.o(125154);
        }
        else if (paramInt2 == -205)
        {
          this.gzO = ((q)paramm).agh();
          paramString = ((q)paramm).ajq();
          paramm = ((q)paramm).ajt();
          ab.i("MicroMsg.MobileInputIndepPassLoginLogic", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bo.anv(this.gzO), paramm });
          f.a((f)localObject);
          localObject = new Intent();
          ((Intent)localObject).putExtra("auth_ticket", this.gzO);
          ((Intent)localObject).putExtra("binded_mobile", paramString);
          ((Intent)localObject).putExtra("close_safe_device_style", paramm);
          ((Intent)localObject).putExtra("from_source", 6);
          com.tencent.mm.plugin.account.a.a.gkE.g(this.gDo, (Intent)localObject);
          AppMethodBeat.o(125154);
        }
        else
        {
          if (paramInt2 != -140)
            break;
          if (!bo.isNullOrNil(this.cOG))
            z.o(this.gDo, paramString, this.cOG);
          AppMethodBeat.o(125154);
        }
      }
    }
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      com.tencent.mm.kernel.g.Rg().a(new bk(new l.16(this)), 0);
    for (int i = 1; ; i = 0)
    {
      if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
      {
        if (this.gue == null)
        {
          this.gue = SecurityImage.a.a(this.gDo, ((f)localObject).gCL, ((f)localObject).gug, ((f)localObject).guh, ((f)localObject).gui, new l.2(this, (f)localObject), null, new l.3(this), (SecurityImage.b)localObject);
          AppMethodBeat.o(125154);
          break;
        }
        ab.d("MicroMsg.MobileInputIndepPassLoginLogic", "imgSid:" + ((f)localObject).guh + " img len" + ((f)localObject).gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
        this.gue.b(((f)localObject).gCL, ((f)localObject).gug, ((f)localObject).guh, ((f)localObject).gui);
        AppMethodBeat.o(125154);
        break;
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.kernel.a.unhold();
        com.tencent.mm.plugin.account.friend.a.l.apX();
        ab.i("MicroMsg.MobileInputIndepPassLoginLogic", "login username %s", new Object[] { ((f)localObject).account });
        z.vx(((f)localObject).account);
        paramString = com.tencent.mm.model.av.fly.T("login_weixin_username", "");
        w.cm(this.gDo);
        if (this.gDo.gDa)
        {
          bx.fnB.an(this.gCZ, paramString);
          bx.fnB.g(com.tencent.mm.model.r.Yz(), com.tencent.mm.model.r.Zg());
          com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(9), bx.fnB.aau() });
        }
        z.showAddrBookUploadConfirm(this.gDo, new l.4(this), false, 2);
        if (this.gDo.flQ == 6)
        {
          this.gCm = ((q)paramm).ajv();
          com.tencent.mm.kernel.g.Rg().a(255, this);
          paramm = new com.tencent.mm.modelsimple.r(1);
          com.tencent.mm.kernel.g.Rg().a(paramm, 0);
          paramString = this.gDo;
          localObject = this.gDo;
          this.gDo.getString(2131297061);
          paramString.guc = com.tencent.mm.ui.base.h.b((Context)localObject, this.gDo.getString(2131296965), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              AppMethodBeat.i(125137);
              com.tencent.mm.kernel.g.Rg().c(paramm);
              com.tencent.mm.kernel.g.Rg().b(255, l.this);
              AppMethodBeat.o(125137);
            }
          });
        }
        AppMethodBeat.o(125154);
        break;
      }
      if (j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(125154);
        break;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label332;
      Toast.makeText(this.gDo, this.gDo.getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      break label332;
      label1324: if (paramm.getType() != 255)
        break label332;
      com.tencent.mm.kernel.g.Rg().b(255, this);
      if ((paramInt2 == -3) && (paramInt1 == 4))
      {
        paramm = this.gDo;
        boolean bool = this.gCm;
        paramString = new Intent(paramm, RegByMobileSetPwdUI.class);
        paramString.putExtra("kintent_hint", paramm.getString(2131303155));
        paramString.putExtra("kintent_cancelable", bool);
        paramm.startActivity(paramString);
      }
      AppMethodBeat.o(125154);
      break;
      label1422: AppMethodBeat.o(125154);
      break;
    }
  }

  public final void start()
  {
    AppMethodBeat.i(125150);
    com.tencent.mm.kernel.g.Rg().a(252, this);
    com.tencent.mm.kernel.g.Rg().a(701, this);
    com.tencent.mm.kernel.g.Rg().a(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L200_100,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L200_100") + ",1");
    com.tencent.mm.plugin.b.a.wz("L200_100");
    AppMethodBeat.o(125150);
  }

  public final void stop()
  {
    AppMethodBeat.i(125151);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    com.tencent.mm.kernel.g.Rg().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L200_100,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L200_100") + ",2");
    AppMethodBeat.o(125151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.l
 * JD-Core Version:    0.6.2
 */