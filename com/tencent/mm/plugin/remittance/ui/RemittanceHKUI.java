package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.plugin.remittance.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class RemittanceHKUI extends RemittanceBaseUI
{
  private int pWj;
  private String pWk;
  private String pWl;
  private String pWm;

  public final void a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, fw paramfw)
  {
    AppMethodBeat.i(45076);
    ab.d("MicroMsg.RemittanceHKUI", "do scene gen pay");
    paramInt = 0;
    if (this.pQY == 33)
      paramInt = 1;
    a(new com.tencent.mm.plugin.remittance.model.q(Math.round(this.pQV * 100.0D), this.edV, this.kux, this.pRu, this.eeO, this.pRb, this.pWj, paramInt), true, false);
    AppMethodBeat.o(45076);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(45080);
    if ((paramm instanceof com.tencent.mm.plugin.remittance.model.q))
    {
      paramm = (com.tencent.mm.plugin.remittance.model.q)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (!bo.isNullOrNil(paramm.pPf))
        {
          e.a(this.mController.ylL, paramm.pPf, false, 4);
          AppMethodBeat.o(45080);
        }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.RemittanceHKUI", "empty payurl");
      AppMethodBeat.o(45080);
      continue;
      h.b(this.mController.ylL, paramString, "", false);
      AppMethodBeat.o(45080);
      continue;
      super.b(paramInt1, paramInt2, paramString, paramm, paramBoolean);
      AppMethodBeat.o(45080);
    }
  }

  public final void cfA()
  {
    AppMethodBeat.i(45079);
    ab.d("MicroMsg.RemittanceHKUI", "do scene cancel");
    if (this.pQY == 33);
    for (int i = 1; ; i = 0)
    {
      a(new p(this.edV, this.pRb, this.pWj, ()this.pQV * 100L, i), false, false);
      AppMethodBeat.o(45079);
      return;
    }
  }

  public final void cfC()
  {
    AppMethodBeat.i(45077);
    t.makeText(this.mController.ylL, getString(2131302443, new Object[] { this.pWk }), 0).show();
    AppMethodBeat.o(45077);
  }

  public final void cfG()
  {
    AppMethodBeat.i(45078);
    if (!bo.isNullOrNil(this.pWl))
    {
      TextView localTextView = (TextView)findViewById(2131821634);
      localTextView.setText(this.pWl);
      localTextView.setOnClickListener(new RemittanceHKUI.1(this));
    }
    AppMethodBeat.o(45078);
  }

  protected final void cfM()
  {
  }

  public final void cfz()
  {
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45081);
    if ((paramInt1 == 4) && (paramInt2 == -1))
      finish();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(45081);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45074);
    super.onCreate(paramBundle);
    nf(1529);
    nf(1257);
    this.pWj = getIntent().getIntExtra("hk_currency", 0);
    this.pWk = getIntent().getStringExtra("hk_currencyuint");
    this.pWl = getIntent().getStringExtra("hk_notice");
    this.pWm = getIntent().getStringExtra("hk_notice_url");
    this.kGa.setTitleText(this.pWk);
    this.pRk.setText(this.pWk);
    AppMethodBeat.o(45074);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45075);
    super.onDestroy();
    ng(1529);
    ng(1257);
    AppMethodBeat.o(45075);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceHKUI
 * JD-Core Version:    0.6.2
 */