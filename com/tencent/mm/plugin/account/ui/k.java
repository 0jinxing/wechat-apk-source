package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.plugin.account.model.j;
import com.tencent.mm.plugin.account.model.j.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.crs;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public final class k
  implements f, MobileInputUI.b
{
  private MobileInputUI gDo;
  private String gDp;
  private String gDq;
  private int gDr = 0;
  private String gDy;
  int gDz = 1;

  private void arc()
  {
    AppMethodBeat.i(125131);
    MobileInputUI localMobileInputUI = this.gDo;
    Object localObject = this.gDo;
    this.gDo.getString(2131297061);
    localMobileInputUI.guc = h.b((Context)localObject, this.gDo.getString(2131302257), true, new k.10(this));
    localObject = new com.tencent.mm.modelfriend.a(this.gDo.gDU + this.gDo.gDV, 14, "", 0, "");
    ((com.tencent.mm.modelfriend.a)localObject).rV(this.gDy);
    g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    AppMethodBeat.o(125131);
  }

  public final void a(MobileInputUI.a parama)
  {
    AppMethodBeat.i(125129);
    switch (k.2.gDt[parama.ordinal()])
    {
    default:
      AppMethodBeat.o(125129);
      return;
    case 1:
    }
    this.gDo.aqX();
    switch (this.gDz)
    {
    default:
      this.gDo.gDU = av.amP(this.gDo.countryCode);
      this.gDo.gDV = this.gDo.gDH.getText().toString();
      parama = this.gDo.gDU + this.gDo.gDV;
      if (com.tencent.mm.plugin.account.a.b.a.O(this.gDo, this.gDo.gBJ.getText().toString()))
      {
        if ((this.gDo.guc == null) || (!this.gDo.guc.isShowing()))
          break label288;
        ab.d("MicroMsg.MobileInputRegLogic", "already checking ");
      }
      break;
    case 2:
    case 1:
    }
    while (true)
    {
      this.gDz = 0;
      break;
      arc();
      continue;
      parama = this.gDo.getString(2131305909, new Object[] { aa.dor(), com.tencent.mm.au.b.m(this.gDo, this.gDo.countryCode, this.gDo.getString(2131298789)), "reg", Integer.valueOf(1), Integer.valueOf(0) });
      com.tencent.mm.plugin.account.a.b.a.b(this.gDo, parama, 32047, false);
    }
    label288: Object localObject = this.gDo;
    MobileInputUI localMobileInputUI = this.gDo;
    this.gDo.getString(2131297061);
    ((MobileInputUI)localObject).guc = h.b(localMobileInputUI, this.gDo.getString(2131302257), true, new k.7(this));
    localObject = this.gDo.gDH.getText().toString();
    if ((this.gDp != null) && (this.gDq != null) && (!((String)localObject).equals(this.gDp)) && (((String)localObject).equals(this.gDq)))
    {
      i = 1;
      label387: parama = new com.tencent.mm.modelfriend.a(parama, 12, "", 0, "");
      parama.lo(this.gDr);
      parama.lp(i);
      if (com.tencent.mm.plugin.normsg.a.b.oTO.TL("ie_reg_eu"))
        com.tencent.mm.plugin.normsg.a.b.oTO.TK("ie_reg_eu");
      localObject = new crs();
      ((crs)localObject).xpk = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.TM("ie_reg_eu"));
      ((crs)localObject).xpl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.TP("ce_reg_eu"));
      if (com.tencent.mm.au.b.sP(this.gDo.countryCode))
        break label623;
    }
    label623: for (int i = 6; ; i = 4)
    {
      ((crs)localObject).xpm = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.Am(i));
      parama.a((crs)localObject);
      g.Rg().a(parama, 0);
      this.gDp = this.gDo.gDH.getText().toString();
      this.gDr += 1;
      break;
      if ((this.gDp != null) && (this.gDq != null) && (!this.gDq.equals(this.gDp)) && (!((String)localObject).equals(this.gDq)))
      {
        i = 2;
        break label387;
      }
      i = 0;
      break label387;
    }
  }

  public final void a(final MobileInputUI paramMobileInputUI)
  {
    AppMethodBeat.i(125126);
    this.gDo = paramMobileInputUI;
    String str1 = "";
    if (d.vxr)
      str1 = "" + paramMobileInputUI.getString(2131296513);
    paramMobileInputUI.setMMTitle(str1);
    paramMobileInputUI.showOptionMenu(false);
    paramMobileInputUI.gDO.setVisibility(0);
    paramMobileInputUI.gDO.setVisibility(0);
    paramMobileInputUI.grF.setVisibility(0);
    paramMobileInputUI.gDH.setVisibility(0);
    paramMobileInputUI.gDI.requestFocus();
    paramMobileInputUI.gDK.setVisibility(0);
    paramMobileInputUI.gCV.setVisibility(0);
    paramMobileInputUI.gDS.setVisibility(8);
    paramMobileInputUI.gDN.setVisibility(0);
    paramMobileInputUI.gDN.setText(2131301048);
    if (paramMobileInputUI.gDM != null)
      paramMobileInputUI.gDM.setOnClickListener(new k.1(this, paramMobileInputUI));
    str1 = paramMobileInputUI.getString(2131300942);
    Object localObject1;
    String str2;
    String str3;
    Object localObject2;
    if (aa.doo())
    {
      localObject1 = paramMobileInputUI.getString(2131300943);
      str2 = paramMobileInputUI.getString(2131302021);
      str3 = paramMobileInputUI.getString(2131296519);
      localObject2 = Spannable.Factory.getInstance().newSpannable(str1 + "  " + (String)localObject1 + str3 + str2);
      ((Spannable)localObject2).setSpan(new k.3(this, paramMobileInputUI), str1.length() + "  ".length(), str1.length() + ((String)localObject1).length() + "  ".length(), 33);
      ((Spannable)localObject2).setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(125118);
          bo.M(paramMobileInputUI, ah.getResources().getString(2131305909, new Object[] { aa.gw(paramMobileInputUI), aa.doq(), "setting", Integer.valueOf(1), Integer.valueOf(0) }));
          AppMethodBeat.o(125118);
        }

        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          AppMethodBeat.i(125119);
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(2131690208));
          paramAnonymousTextPaint.setUnderlineText(true);
          AppMethodBeat.o(125119);
        }
      }
      , str1.length() + "  ".length() + ((String)localObject1).length() + str3.length(), str1.length() + ((String)localObject1).length() + "  ".length() + str3.length() + str2.length(), 33);
      paramMobileInputUI.gDL.setText((CharSequence)localObject2);
    }
    while (true)
    {
      paramMobileInputUI.gDL.setMovementMethod(LinkMovementMethod.getInstance());
      AppMethodBeat.o(125126);
      return;
      str2 = paramMobileInputUI.getString(2131300947);
      localObject2 = paramMobileInputUI.getString(2131300945);
      str3 = paramMobileInputUI.getString(2131296519);
      localObject1 = Spannable.Factory.getInstance().newSpannable(str1 + "  " + str2 + str3 + (String)localObject2);
      ((Spannable)localObject1).setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(125120);
          bo.M(paramMobileInputUI.mController.ylL, paramMobileInputUI.getString(2131304194));
          AppMethodBeat.o(125120);
        }

        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          AppMethodBeat.i(125121);
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(2131690208));
          paramAnonymousTextPaint.setUnderlineText(true);
          AppMethodBeat.o(125121);
        }
      }
      , str1.length() + "  ".length(), str1.length() + "  ".length() + str2.length(), 33);
      ((Spannable)localObject1).setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(125122);
          bo.M(paramMobileInputUI, ah.getResources().getString(2131305909, new Object[] { aa.gw(paramMobileInputUI), aa.doq(), "setting", Integer.valueOf(1), Integer.valueOf(0) }));
          AppMethodBeat.o(125122);
        }

        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          AppMethodBeat.i(125123);
          paramAnonymousTextPaint.setColor(paramMobileInputUI.getResources().getColor(2131690208));
          paramAnonymousTextPaint.setUnderlineText(true);
          AppMethodBeat.o(125123);
        }
      }
      , str1.length() + str2.length() + "  ".length() + str3.length(), str1.length() + str2.length() + "  ".length() + str3.length() + ((String)localObject2).length(), 33);
      paramMobileInputUI.gDL.setText((CharSequence)localObject1);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125130);
    ab.i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gDo.guc != null)
    {
      this.gDo.guc.dismiss();
      this.gDo.guc = null;
    }
    if (paramInt2 == -75)
    {
      h.g(this.gDo, 2131296516, 2131302222);
      AppMethodBeat.o(125130);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 145)
      {
        if ((paramInt2 == -41) || (paramInt2 == -59))
        {
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this.gDo, null, null);
            AppMethodBeat.o(125130);
          }
          else
          {
            h.g(this.gDo, 2131302269, 2131302270);
            AppMethodBeat.o(125130);
          }
        }
        else
        {
          int i = ((com.tencent.mm.modelfriend.a)paramm).Ah();
          if (i == 12)
          {
            this.gDo.gDV = av.amN(this.gDo.gDV);
            this.gDq = (this.gDo.gDU + this.gDo.gDV);
            this.gDy = ((com.tencent.mm.modelfriend.a)paramm).agt();
            if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
            {
              paramm = ((com.tencent.mm.modelfriend.a)paramm).agi();
              if (!bo.isNullOrNil(paramm))
                this.gDo.gDV = paramm.trim();
              paramm = new StringBuilder();
              g.RN();
              paramm = paramm.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_200,");
              g.RN();
              com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R200_200") + ",1");
              paramString = com.tencent.mm.h.a.jY(paramString);
              if (paramString != null)
              {
                paramString.a(this.gDo, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                    AppMethodBeat.i(125124);
                    k.a(k.this);
                    AppMethodBeat.o(125124);
                  }
                }
                , new k.9(this));
                AppMethodBeat.o(125130);
              }
              else
              {
                arc();
                paramString = new StringBuilder();
                g.RN();
                paramString = paramString.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_200,");
                g.RN();
                com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R200_200") + ",2");
                AppMethodBeat.o(125130);
              }
            }
            else if (paramInt2 == -355)
            {
              z.f(this.gDo, paramString, 32046);
              AppMethodBeat.o(125130);
            }
            else if (paramInt2 == -34)
            {
              h.b(this.gDo, this.gDo.getString(2131297538), "", true);
              AppMethodBeat.o(125130);
            }
          }
          else
          {
            Object localObject;
            if (i == 14)
            {
              if ((paramInt2 != 0) && (paramString != null))
                break label1055;
              if (((com.tencent.mm.modelfriend.a)paramm).agj() != 1)
                break label787;
              String str = this.gDo.gDU + this.gDo.gDV;
              localObject = ((com.tencent.mm.modelfriend.a)paramm).agl();
              paramm = ((com.tencent.mm.modelfriend.a)paramm).agk();
              Intent localIntent = new Intent(this.gDo, RegByMobileSendSmsUI.class);
              localIntent.putExtra("from_mobile", str);
              localIntent.putExtra("to_mobile", (String)localObject);
              localIntent.putExtra("verify_code", paramm);
              localIntent.putExtra("key_reg_style", 2);
              localIntent.putExtra("kintent_password", this.gDo.gBJ.getText().toString());
              localIntent.putExtra("regsession_id", this.gDy);
              this.gDo.startActivity(localIntent);
            }
            label787: label1055: 
            do
            {
              while (true)
              {
                paramString = com.tencent.mm.h.a.jY(paramString);
                if ((paramString == null) || (this.gDo == null) || (!paramString.a(this.gDo, null, null)))
                  break label1118;
                AppMethodBeat.o(125130);
                break;
                com.tencent.mm.plugin.b.a.wA("R200_300");
                localObject = new Intent();
                ((Intent)localObject).putExtra("bindmcontact_mobile", this.gDo.gDU + " " + this.gDo.gDH.getText().toString());
                ((Intent)localObject).putExtra("bindmcontact_shortmobile", this.gDo.gDV);
                ((Intent)localObject).putExtra("country_name", this.gDo.fHE);
                ((Intent)localObject).putExtra("couttry_code", this.gDo.countryCode);
                ((Intent)localObject).putExtra("mobileverify_countdownsec", ((com.tencent.mm.modelfriend.a)paramm).agn());
                ((Intent)localObject).putExtra("mobileverify_countdownstyle", ((com.tencent.mm.modelfriend.a)paramm).ago());
                ((Intent)localObject).putExtra("mobileverify_fb", ((com.tencent.mm.modelfriend.a)paramm).agp());
                ((Intent)localObject).putExtra("mobileverify_reg_qq", ((com.tencent.mm.modelfriend.a)paramm).agq());
                ((Intent)localObject).putExtra("key_reg_style", 2);
                ((Intent)localObject).putExtra("kintent_password", this.gDo.gBJ.getText().toString());
                ((Intent)localObject).putExtra("mobile_verify_purpose", 2);
                ((Intent)localObject).putExtra("regsession_id", this.gDy);
                ((Intent)localObject).setClass(this.gDo, MobileVerifyUI.class);
                this.gDo.startActivity((Intent)localObject);
                j.a(j.a.gyY);
              }
              if (paramInt2 == -34)
              {
                h.b(this.gDo, this.gDo.getString(2131297538), "", true);
                AppMethodBeat.o(125130);
                break;
              }
            }
            while (!com.tencent.mm.plugin.account.a.a.gkF.a(this.gDo, paramInt1, paramInt2, paramString));
            AppMethodBeat.o(125130);
          }
        }
      }
      else
        label1118: AppMethodBeat.o(125130);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(125127);
    g.Rg().a(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_100,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R200_100") + ",1");
    com.tencent.mm.plugin.b.a.wz("R200_100");
    this.gDr = 0;
    AppMethodBeat.o(125127);
  }

  public final void stop()
  {
    AppMethodBeat.i(125128);
    g.Rg().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_100,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R200_100") + ",2");
    AppMethodBeat.o(125128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.k
 * JD-Core Version:    0.6.2
 */