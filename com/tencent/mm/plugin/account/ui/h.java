package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFormInputView;

public final class h
  implements f, MobileInputUI.b
{
  private MobileInputUI gDo;
  private String gDp;
  private String gDq;
  private int gDr = 0;

  private void arc()
  {
    AppMethodBeat.i(125094);
    MobileInputUI localMobileInputUI = this.gDo;
    Object localObject = this.gDo;
    this.gDo.getString(2131297061);
    localMobileInputUI.guc = com.tencent.mm.ui.base.h.b((Context)localObject, this.gDo.getString(2131302257), true, new h.4(this));
    localObject = new com.tencent.mm.modelfriend.a(this.gDo.gDU + this.gDo.gDV, 8, "", 0, "");
    g.Rg().a((m)localObject, 0);
    AppMethodBeat.o(125094);
  }

  public final void a(MobileInputUI.a parama)
  {
    AppMethodBeat.i(125092);
    switch (h.5.gDt[parama.ordinal()])
    {
    default:
      AppMethodBeat.o(125092);
    case 1:
    }
    while (true)
    {
      return;
      this.gDo.gDU = av.amP(this.gDo.countryCode);
      this.gDo.gDV = this.gDo.gDH.getText().toString();
      parama = this.gDo.gDU + this.gDo.gDV;
      if (this.gDo.guc == null)
        break;
      ab.d("MicroMsg.MobileInputForgetPwdLogic", "already checking ");
      AppMethodBeat.o(125092);
    }
    MobileInputUI localMobileInputUI = this.gDo;
    Object localObject = this.gDo;
    this.gDo.getString(2131297061);
    localMobileInputUI.guc = com.tencent.mm.ui.base.h.b((Context)localObject, this.gDo.getString(2131302257), true, new h.1(this));
    localObject = this.gDo.gDH.getText().toString();
    int i;
    if ((this.gDp != null) && (this.gDq != null) && (!((String)localObject).equals(this.gDp)) && (((String)localObject).equals(this.gDq)))
      i = 1;
    while (true)
    {
      parama = new com.tencent.mm.modelfriend.a(parama, 12, "", 0, "");
      parama.lo(this.gDr);
      parama.lp(i);
      g.Rg().a(parama, 0);
      this.gDp = this.gDo.gDH.getText().toString();
      this.gDr += 1;
      break;
      if ((this.gDp != null) && (this.gDq != null) && (!this.gDq.equals(this.gDp)) && (!((String)localObject).equals(this.gDq)))
        i = 2;
      else
        i = 0;
    }
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    AppMethodBeat.i(125089);
    this.gDo = paramMobileInputUI;
    paramMobileInputUI.gDI.requestFocus();
    paramMobileInputUI.showVKB();
    String str1 = paramMobileInputUI.getString(2131302312);
    String str2 = str1;
    if (d.vxr)
      str2 = str1 + paramMobileInputUI.getString(2131296513);
    paramMobileInputUI.setMMTitle(str2);
    paramMobileInputUI.grF.setVisibility(0);
    paramMobileInputUI.gDH.setVisibility(0);
    paramMobileInputUI.gDI.requestFocus();
    paramMobileInputUI.gDN.setText(2131296989);
    paramMobileInputUI.gDN.setVisibility(0);
    AppMethodBeat.o(125089);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(125093);
    ab.i("MicroMsg.MobileInputForgetPwdLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gDo.guc != null)
    {
      this.gDo.guc.dismiss();
      this.gDo.guc = null;
    }
    if (paramInt2 == -75)
    {
      com.tencent.mm.ui.base.h.g(this.gDo, 2131296516, 2131302222);
      AppMethodBeat.o(125093);
    }
    while (true)
    {
      return;
      if ((paramInt2 == -41) || (paramInt2 == -59))
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if (paramString != null)
        {
          paramString.a(this.gDo, null, null);
          AppMethodBeat.o(125093);
        }
        else
        {
          com.tencent.mm.ui.base.h.g(this.gDo, 2131302269, 2131302270);
          AppMethodBeat.o(125093);
        }
      }
      else if (paramm.getType() == 145)
      {
        int i = ((com.tencent.mm.modelfriend.a)paramm).Ah();
        if (i == 12)
        {
          if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
          {
            paramm = ((com.tencent.mm.modelfriend.a)paramm).agi();
            if (!bo.isNullOrNil(paramm))
              this.gDo.gDV = paramm.trim();
            this.gDo.gDV = av.amN(this.gDo.gDV);
            this.gDq = (this.gDo.gDU + this.gDo.gDV);
            paramm = new StringBuilder();
            g.RN();
            paramm = paramm.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",F200_200,");
            g.RN();
            com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F200_200") + ",1");
            paramString = com.tencent.mm.h.a.jY(paramString);
            if (paramString != null)
            {
              paramString.a(this.gDo, new h.2(this), new h.3(this));
              AppMethodBeat.o(125093);
            }
            else
            {
              arc();
              paramString = new StringBuilder();
              g.RN();
              paramString = paramString.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",F200_200,");
              g.RN();
              com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F200_200") + ",2");
              AppMethodBeat.o(125093);
            }
          }
          else if (paramInt2 == -34)
          {
            com.tencent.mm.ui.base.h.b(this.gDo, this.gDo.getString(2131297538), "", true);
            AppMethodBeat.o(125093);
          }
          else
          {
            Toast.makeText(this.gDo, this.gDo.getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          }
        }
        else if ((i == 8) && (paramInt2 == 0))
        {
          paramString = new Intent();
          paramString.putExtra("bindmcontact_mobile", this.gDo.gDU + " " + this.gDo.gDH.getText().toString());
          paramString.putExtra("bindmcontact_shortmobile", this.gDo.gDV);
          paramString.putExtra("country_name", this.gDo.fHE);
          paramString.putExtra("couttry_code", this.gDo.countryCode);
          paramString.putExtra("mobileverify_countdownsec", ((com.tencent.mm.modelfriend.a)paramm).agn());
          paramString.putExtra("mobileverify_countdownstyle", ((com.tencent.mm.modelfriend.a)paramm).ago());
          paramString.putExtra("mobileverify_fb", ((com.tencent.mm.modelfriend.a)paramm).agp());
          paramString.putExtra("mobileverify_reg_qq", ((com.tencent.mm.modelfriend.a)paramm).agq());
          paramString.putExtra("mobile_verify_purpose", 3);
          paramString.setClass(this.gDo, MobileVerifyUI.class);
          this.gDo.startActivity(paramString);
        }
      }
      else
      {
        AppMethodBeat.o(125093);
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(125090);
    g.Rg().a(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",F200_100,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("F200_100") + ",1");
    com.tencent.mm.plugin.b.a.wz("F200_100");
    this.gDr = 0;
    AppMethodBeat.o(125090);
  }

  public final void stop()
  {
    AppMethodBeat.i(125091);
    g.Rg().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",F200_100,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("F200_100") + ",2");
    AppMethodBeat.o(125091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.h
 * JD-Core Version:    0.6.2
 */