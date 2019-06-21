package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.au.b;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.d;
import java.util.ArrayList;
import java.util.List;

public final class i
  implements f, MobileInputUI.b
{
  ba gBm;
  MobileInputUI gDo;
  private g gDu;
  private SecurityImage gue;

  public i()
  {
    AppMethodBeat.i(125101);
    this.gue = null;
    this.gDu = null;
    this.gBm = new ba();
    AppMethodBeat.o(125101);
  }

  public final void a(MobileInputUI.a parama)
  {
    AppMethodBeat.i(125105);
    switch (i.7.gDt[parama.ordinal()])
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(125105);
      return;
      this.gDo.gDU = av.amP(this.gDo.countryCode);
      this.gDo.gDV = this.gDo.gDI.getText().toString();
      parama = av.amN(this.gDo.gDU + this.gDo.gDV);
      MobileInputUI localMobileInputUI1 = this.gDo;
      MobileInputUI localMobileInputUI2 = this.gDo;
      this.gDo.getString(2131297061);
      localMobileInputUI1.guc = h.b(localMobileInputUI2, this.gDo.getString(2131302257), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
        }
      });
      parama = new com.tencent.mm.modelfriend.a(parama, 13, "", 0, "");
      com.tencent.mm.kernel.g.Rg().a(parama, 0);
    }
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    AppMethodBeat.i(125102);
    this.gDo = paramMobileInputUI;
    paramMobileInputUI.grF.setVisibility(0);
    paramMobileInputUI.gDH.setVisibility(0);
    paramMobileInputUI.gDI.requestFocus();
    paramMobileInputUI.gDN.setText(2131296989);
    paramMobileInputUI.gDN.setVisibility(0);
    paramMobileInputUI.gDP.setVisibility(0);
    paramMobileInputUI = new ArrayList();
    Object localObject = new com.tencent.mm.ui.base.m(this.gDo, 2001, 0);
    ((com.tencent.mm.ui.base.m)localObject).setTitle(2131301007);
    paramMobileInputUI.add(localObject);
    com.tencent.mm.ui.base.m localm = new com.tencent.mm.ui.base.m(this.gDo, 2002, 0);
    if (b.ahL())
    {
      localm.setTitle(2131301003);
      paramMobileInputUI.add(localm);
    }
    if (paramMobileInputUI.size() > 1)
    {
      localObject = new d(this.gDo, 1, false);
      ((d)localObject).rBl = new i.1(this, paramMobileInputUI);
      ((d)localObject).rBm = new i.2(this);
      ((d)localObject).zQf = new i.3(this);
      this.gDo.gDR.setText(2131301008);
      this.gDo.gDR.setOnClickListener(new i.4(this, (d)localObject, paramMobileInputUI, localm));
    }
    while (true)
    {
      this.gDo.gDR.setVisibility(0);
      AppMethodBeat.o(125102);
      return;
      this.gDo.gDR.setText(2131301007);
      this.gDo.gDR.setOnClickListener(new i.5(this));
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125106);
    ab.i("MicroMsg.MobileInputLoginLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gDo.guc != null)
    {
      this.gDo.guc.dismiss();
      this.gDo.guc = null;
    }
    if (((paramm.getType() == 252) || (paramm.getType() == 701)) && (this.gDu != null))
    {
      this.gDu.gDc = this.gDo.gDc;
      this.gDu.a(this.gDo, paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(125106);
    }
    while (true)
    {
      return;
      if ((paramm.getType() == 145) && (((com.tencent.mm.modelfriend.a)paramm).Ah() == 13))
      {
        if (paramInt2 == -41)
        {
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this.gDo, null, null);
            AppMethodBeat.o(125106);
          }
          else
          {
            h.g(this.gDo, 2131302269, 2131302270);
            AppMethodBeat.o(125106);
          }
        }
        else if (paramInt2 == -1)
        {
          Toast.makeText(this.gDo, this.gDo.getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(125106);
        }
        else if (paramInt2 == -34)
        {
          h.b(this.gDo, this.gDo.getString(2131297538), "", true);
          AppMethodBeat.o(125106);
        }
        else
        {
          this.gDo.aqX();
          paramString = new Intent(this.gDo, MobileInputUI.class);
          paramString.putExtra("mobile_input_purpose", -1);
          paramString.putExtra("mobile_auth_type", 7);
          paramString.putExtra("from_switch_account", this.gDo.gDa);
          paramString.putExtra("couttry_code", this.gDo.countryCode);
          paramString.putExtra("input_mobile_number", this.gDo.gDV);
          this.gDo.startActivity(paramString);
          AppMethodBeat.o(125106);
        }
      }
      else
        AppMethodBeat.o(125106);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(125103);
    com.tencent.mm.kernel.g.Rg().a(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L200_100,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L200_100") + ",1");
    com.tencent.mm.plugin.b.a.wz("L200_100");
    AppMethodBeat.o(125103);
  }

  public final void stop()
  {
    AppMethodBeat.i(125104);
    com.tencent.mm.kernel.g.Rg().b(145, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L200_100,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L200_100") + ",2");
    AppMethodBeat.o(125104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.i
 * JD-Core Version:    0.6.2
 */