package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.app.Activity;
import android.content.Intent;
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
import com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI;
import com.tencent.mm.plugin.wallet_payu.remittance.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@a(7)
public class PayURemittanceAdapterUI extends RemittanceAdapterUI
{
  public final void c(String paramString, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(48541);
    ab.i("MicroMsg.PayURemittanceAdapterUI", "startRemittanceUI scene=" + this.gOW + ", name=" + paramString);
    if (paramIntent != null);
    for (paramIntent = new Intent(paramIntent); ; paramIntent = new Intent())
    {
      paramIntent.putExtra("receiver_name", paramString);
      paramIntent.putExtra("scene", this.gOW);
      paramIntent.putExtra("pay_scene", paramInt);
      startActivity(paramIntent);
      setResult(-1);
      finish();
      AppMethodBeat.o(48541);
      return;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, final m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48540);
    super.c(paramInt1, paramInt2, paramString, paramm);
    if ((paramm instanceof d))
      this.pQP = false;
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof d)))
    {
      paramString = (d)paramm;
      this.edV = paramString.username;
      if (bo.isNullOrNil(this.edV))
      {
        ab.d("MicroMsg.PayURemittanceAdapterUI", "Username empty & fishsh. scene=" + this.gOW);
        finish();
        AppMethodBeat.o(48540);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      paramm = new Intent();
      paramm.putExtra("fee", paramString.kCJ);
      paramm.putExtra("desc", paramString.desc);
      paramm.putExtra("scan_remittance_id", paramString.pPQ);
      paramm.putExtra("receiver_true_name", e.att(paramString.pPP));
      g.RQ();
      if (((j)g.K(j.class)).XM().aoN(this.edV) != null)
        c(this.edV, paramString.scene, paramm);
      while (true)
      {
        AppMethodBeat.o(48540);
        bool = true;
        break;
        ab.d("MicroMsg.PayURemittanceAdapterUI", "Receiver in contactStg and try to get contact");
        final long l = bo.anU();
        ao.a.flu.a(this.edV, "", new ao.b.a()
        {
          public final void o(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            AppMethodBeat.i(48538);
            if (paramAnonymousBoolean)
            {
              ab.v("MicroMsg.PayURemittanceAdapterUI", "getContact suc; cost=" + (bo.anU() - l) + " ms");
              b.U(paramAnonymousString, 3);
              o.acv().pZ(paramAnonymousString);
            }
            while (true)
            {
              PayURemittanceAdapterUI.this.c(PayURemittanceAdapterUI.a(PayURemittanceAdapterUI.this), paramm.scene, this.pQS);
              AppMethodBeat.o(48538);
              return;
              ab.w("MicroMsg.PayURemittanceAdapterUI", "getContact failed");
            }
          }
        });
      }
      AppMethodBeat.o(48540);
    }
  }

  public final void cfy()
  {
    AppMethodBeat.i(48539);
    a(new d(this.edV), false, false);
    AppMethodBeat.o(48539);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceAdapterUI
 * JD-Core Version:    0.6.2
 */