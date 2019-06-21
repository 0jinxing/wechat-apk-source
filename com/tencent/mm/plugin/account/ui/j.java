package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;

public final class j
  implements f, MobileInputUI.b
{
  protected String elr = null;
  private MobileInputUI gDo;
  protected String gsy = "";
  protected int gsz = 2;

  public final void a(MobileInputUI.a parama)
  {
    AppMethodBeat.i(125112);
    switch (j.2.gDt[parama.ordinal()])
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(125112);
      String str;
      while (true)
      {
        return;
        this.gDo.gDU = av.amP(this.gDo.countryCode);
        this.gDo.gDV = this.gDo.gDH.getText().toString();
        str = this.gDo.gDU + this.gDo.gDV;
        if (this.gDo.guc == null)
          break;
        ab.d("MicroMsg.MobileInputRegLogic", "already checking ");
        AppMethodBeat.o(125112);
      }
      MobileInputUI localMobileInputUI = this.gDo;
      parama = this.gDo;
      this.gDo.getString(2131297061);
      localMobileInputUI.guc = h.b(parama, this.gDo.getString(2131302257), true, new j.1(this));
      parama = new x(str, 1, "", 0, "");
      g.Rg().a(parama, 0);
    }
  }

  public final void a(MobileInputUI paramMobileInputUI)
  {
    AppMethodBeat.i(125109);
    this.gDo = paramMobileInputUI;
    paramMobileInputUI.gDI.requestFocus();
    paramMobileInputUI.showVKB();
    this.elr = paramMobileInputUI.getIntent().getStringExtra("regsetinfo_ticket");
    this.gsy = paramMobileInputUI.getIntent().getStringExtra("regsetinfo_NextStep");
    this.gsz = paramMobileInputUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    String str1 = paramMobileInputUI.getString(2131302312);
    String str2 = str1;
    if (d.vxr)
      str2 = str1 + paramMobileInputUI.getString(2131296513);
    paramMobileInputUI.setMMTitle(str2);
    paramMobileInputUI.grF.setVisibility(0);
    paramMobileInputUI.gDH.setVisibility(0);
    paramMobileInputUI.gDI.requestFocus();
    paramMobileInputUI.gDK.setVisibility(0);
    paramMobileInputUI.gDN.setVisibility(0);
    paramMobileInputUI.gDN.setText(2131301048);
    AppMethodBeat.o(125109);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125113);
    ab.i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gDo.guc != null)
    {
      this.gDo.guc.dismiss();
      this.gDo.guc = null;
    }
    if (paramm.getType() == 132)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (((x)paramm).Ah() == 1)
        {
          paramString = new Intent();
          paramString.putExtra("bindmcontact_mobile", this.gDo.gDU + " " + this.gDo.gDH.getText().toString());
          paramString.putExtra("bindmcontact_shortmobile", this.gDo.gDH.getText().toString());
          paramString.putExtra("country_name", this.gDo.fHE);
          paramString.putExtra("couttry_code", this.gDo.countryCode);
          paramString.putExtra("mobile_verify_purpose", 4);
          paramString.putExtra("regsetinfo_ticket", this.elr);
          paramString.putExtra("regsetinfo_NextStep", this.gsy);
          paramString.putExtra("regsetinfo_NextStyle", this.gsz);
          paramString.setClass(this.gDo, MobileVerifyUI.class);
          this.gDo.startActivity(paramString);
          this.gDo.finish();
        }
        AppMethodBeat.o(125113);
      }
    while (true)
    {
      return;
      if (a.gkF.a(this.gDo, paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(125113);
      }
      else
      {
        Toast.makeText(this.gDo, this.gDo.getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(125113);
        continue;
        AppMethodBeat.o(125113);
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(125110);
    g.Rg().a(132, this);
    AppMethodBeat.o(125110);
  }

  public final void stop()
  {
    AppMethodBeat.i(125111);
    g.Rg().b(132, this);
    AppMethodBeat.o(125111);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.j
 * JD-Core Version:    0.6.2
 */