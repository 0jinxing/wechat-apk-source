package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.remittance.model.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class RemittanceOSRedirect extends WalletBaseUI
{
  public String edV = "";
  private int gOW;

  public final void b(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(45089);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof y))
      {
        paramString = (y)paramm;
        ab.i("MicroMsg.RemittanceOSRedirect", "indexScene  %s", new Object[] { paramString.pQy });
        paramm = getIntent();
        if (paramString.kCv == 1)
        {
          com.tencent.mm.pluginsdk.wallet.h.a(this, 2, this.edV, 11, null);
          finish();
          AppMethodBeat.o(45089);
        }
      }
    while (true)
    {
      return;
      paramm.setClass(this, RemittanceOSUI.class);
      paramm.putExtra("os_currency", paramString.kCv);
      paramm.putExtra("os_currencyuint", paramString.pQy);
      paramm.putExtra("os_currencywording", paramString.pQz);
      paramm.putExtra("os_notice", paramString.kCx);
      paramm.putExtra("os_notice_url", paramString.kCy);
      startActivity(paramm);
      break;
      if ((paramm instanceof com.tencent.mm.plugin.remittance.model.r))
      {
        paramString = (com.tencent.mm.plugin.remittance.model.r)paramm;
        paramm = new Intent();
        paramm.setClass(this, RemittanceHKUI.class);
        this.edV = paramString.pPg;
        if (bo.isNullOrNil(this.edV))
        {
          ab.e("MicroMsg.RemittanceOSRedirect", "empty username");
          finish();
        }
        paramm.putExtra("scene", this.gOW);
        paramm.putExtra("fee", paramString.cSh / 100.0D);
        paramm.putExtra("desc", paramString.desc);
        paramm.putExtra("scan_remittance_id", paramString.pPi);
        paramm.putExtra("receiver_name", paramString.pPg);
        paramm.putExtra("receiver_true_name", paramString.kCz);
        paramm.putExtra("receiver_nick_name", paramString.pPh);
        paramm.putExtra("hk_currency", paramString.kCv);
        paramm.putExtra("hk_currencyuint", paramString.kCw);
        paramm.putExtra("hk_notice", paramString.kCx);
        paramm.putExtra("hk_notice_url", paramString.kCy);
        paramInt2 = paramString.kCA;
        paramInt1 = 32;
        ab.i("MicroMsg.RemittanceOSRedirect", "setAmount: %d", new Object[] { Integer.valueOf(paramInt2) });
        if (paramInt2 == 1)
          paramInt1 = 33;
        paramm.putExtra("pay_scene", paramInt1);
        g.RQ();
        if (((j)g.K(j.class)).XM().aoN(this.edV) != null)
        {
          startActivity(paramm);
          finish();
          AppMethodBeat.o(45089);
        }
        else
        {
          ab.d("MicroMsg.RemittanceOSRedirect", "Receiver in contactStg and try to get contact");
          final long l = bo.anU();
          ao.a.flu.a(this.edV, "", new ao.b.a()
          {
            public final void o(String paramAnonymousString, boolean paramAnonymousBoolean)
            {
              AppMethodBeat.i(45085);
              if (paramAnonymousBoolean)
              {
                ab.v("MicroMsg.RemittanceOSRedirect", "getContact suc; cost=" + (bo.anU() - l) + " ms");
                b.U(paramAnonymousString, 3);
                o.acv().pZ(paramAnonymousString);
              }
              while (true)
              {
                RemittanceOSRedirect.this.startActivity(this.val$intent);
                RemittanceOSRedirect.this.finish();
                AppMethodBeat.o(45085);
                return;
                ab.w("MicroMsg.RemittanceOSRedirect", "getContact failed");
              }
            }
          });
          AppMethodBeat.o(45089);
          continue;
          if ((paramm instanceof y))
          {
            ab.i("MicroMsg.RemittanceOSRedirect", "indexScene  errMsg %s", new Object[] { paramString });
            com.tencent.mm.ui.base.h.a(this, paramString, "", new RemittanceOSRedirect.2(this));
            AppMethodBeat.o(45089);
          }
          else if ((paramm instanceof com.tencent.mm.plugin.remittance.model.r))
          {
            com.tencent.mm.ui.base.h.a(this, paramString, "", new RemittanceOSRedirect.3(this));
          }
        }
      }
      else
      {
        AppMethodBeat.o(45089);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return true;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45088);
    super.onCreate(paramBundle);
    setTitleVisibility(8);
    this.gOW = getIntent().getIntExtra("scene", 0);
    this.edV = getIntent().getStringExtra("receiver_name");
    if (this.gOW == 0)
    {
      ab.e("MicroMsg.RemittanceOSRedirect", "error scene: %s", new Object[] { Integer.valueOf(this.gOW) });
      finish();
      AppMethodBeat.o(45088);
    }
    while (true)
    {
      return;
      if (this.gOW == 5)
      {
        this.Ahr.nf(1574);
        a(new y(com.tencent.mm.model.r.YG()), true, true);
        AppMethodBeat.o(45088);
      }
      else
      {
        if (this.gOW == 6)
        {
          this.Ahr.nf(1301);
          a(new com.tencent.mm.plugin.remittance.model.r(this.edV), true, false);
        }
        AppMethodBeat.o(45088);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45090);
    super.onDestroy();
    if (this.gOW == 5)
    {
      ng(1574);
      AppMethodBeat.o(45090);
    }
    while (true)
    {
      return;
      if (this.gOW == 6)
        ng(1301);
      AppMethodBeat.o(45090);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect
 * JD-Core Version:    0.6.2
 */