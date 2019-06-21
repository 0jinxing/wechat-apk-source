package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.remittance.model.z;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

@com.tencent.mm.ui.base.a(19)
public class RemittanceOSUI extends RemittanceBaseUI
  implements d.a
{
  private c omX;
  private int pWq;
  private String pWr;
  private String pWs;
  private String pWt;
  private String pWu;
  private boolean pWv;

  public RemittanceOSUI()
  {
    AppMethodBeat.i(45097);
    this.pWv = false;
    this.omX = new RemittanceOSUI.1(this);
    AppMethodBeat.o(45097);
  }

  protected final void VV(String paramString)
  {
    AppMethodBeat.i(45102);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent, 3);
    this.pWv = true;
    AppMethodBeat.o(45102);
  }

  protected final void VW(String paramString)
  {
    AppMethodBeat.i(45103);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent, 3);
    this.pWv = true;
    AppMethodBeat.o(45103);
  }

  public final void a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, fw paramfw)
  {
    AppMethodBeat.i(45101);
    paramString3 = r.YB();
    paramString2 = paramString3;
    if (bo.isNullOrNil(paramString3))
      paramString2 = r.Yz();
    g.RQ();
    paramString4 = ((j)g.K(j.class)).XM().aoO(this.edV);
    paramString3 = this.edV;
    if ((int)paramString4.ewQ != 0)
      paramString3 = paramString4.Oj();
    paramString1 = new z(this.pQV, paramString2, this.edV, paramString3, paramString1, this.pWq);
    paramString1.eHT = "RemittanceProcess";
    a(paramString1, true, true);
    com.tencent.mm.plugin.report.service.h.pYm.e(13337, new Object[] { Integer.valueOf(1), Double.valueOf(this.pQV) });
    AppMethodBeat.o(45101);
  }

  public final void b(int paramInt1, int paramInt2, final String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(45109);
    super.b(paramInt1, paramInt2, paramString, paramm, paramBoolean);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof z)))
    {
      paramString = (z)paramm;
      if (paramString.pPl <= 0)
        break label251;
      if (paramString.pQB != 0)
        break label172;
      com.tencent.mm.ui.base.h.d(this, getString(2131302454, new Object[] { Integer.valueOf(paramString.pPl) }), getString(2131297031), getString(2131302383), getString(2131302442), new RemittanceOSUI.2(this, paramString), new RemittanceOSUI.3(this, paramString));
      paramInt1 = 1;
    }
    while (true)
    {
      if (paramInt1 == 0)
      {
        paramString = ((z)paramm).pPf;
        paramm = new Intent();
        paramm.putExtra("rawUrl", paramString);
        paramm.putExtra("showShare", false);
        com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramm, 3);
      }
      AppMethodBeat.o(45109);
      return;
      label172: if (paramString.pQB == 1)
      {
        com.tencent.mm.ui.base.h.d(this, getString(2131302454, new Object[] { Integer.valueOf(paramString.pPl) }), getString(2131297031), getString(2131302383), getString(2131302442), new RemittanceOSUI.4(this, paramString), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(45096);
            RemittanceOSUI.this.VW(paramString.pQA);
            AppMethodBeat.o(45096);
          }
        });
        paramInt1 = 1;
      }
      else
      {
        paramInt1 = 0;
        continue;
        label251: paramInt1 = 0;
      }
    }
  }

  public final void cfB()
  {
    AppMethodBeat.i(45098);
    com.tencent.mm.plugin.report.service.h.pYm.e(13337, new Object[] { Integer.valueOf(2) });
    AppMethodBeat.o(45098);
  }

  public final void cfC()
  {
    AppMethodBeat.i(45099);
    t.makeText(this.mController.ylL, getString(2131302443, new Object[] { this.pWr }), 0).show();
    AppMethodBeat.o(45099);
  }

  public final void cfG()
  {
    AppMethodBeat.i(45104);
    if (!bo.isNullOrNil(this.pWt))
    {
      e.a((TextView)findViewById(2131821634), "", this.pWt, this.pWu);
      AppMethodBeat.o(45104);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.RemittanceOSUI", "no bulletin data");
      AppMethodBeat.o(45104);
    }
  }

  public final void cfz()
  {
  }

  public final int getLayoutId()
  {
    return 2130970514;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45108);
    ab.d("MicroMsg.RemittanceOSUI", "reqcode=" + paramInt1 + ", resultCode=" + paramInt2 + ", username=" + this.edV);
    this.pWv = false;
    if ((paramInt1 == 3) && (paramInt2 == -1))
      finish();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(45108);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45100);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.xxA.b(this.omX);
    this.Ahr.nf(1622);
    this.Ahr.nf(1574);
    initView();
    this.kGa.setTitleText("");
    o.acd().a(this);
    this.pWq = getIntent().getIntExtra("os_currency", 0);
    this.pWr = getIntent().getStringExtra("os_currencyuint");
    this.pWs = getIntent().getStringExtra("os_currencywording");
    this.pWt = getIntent().getStringExtra("os_notice");
    this.pWu = getIntent().getStringExtra("os_notice_url");
    this.kGa.setTitleText(this.pWr);
    cfG();
    AppMethodBeat.o(45100);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45107);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.omX);
    o.acd().b(this);
    this.Ahr.ng(1622);
    this.Ahr.ng(1574);
    AppMethodBeat.o(45107);
  }

  public void onPause()
  {
    AppMethodBeat.i(45106);
    super.onPause();
    AppMethodBeat.o(45106);
  }

  public void onResume()
  {
    AppMethodBeat.i(45105);
    super.onResume();
    AppMethodBeat.o(45105);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void qj(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceOSUI
 * JD-Core Version:    0.6.2
 */