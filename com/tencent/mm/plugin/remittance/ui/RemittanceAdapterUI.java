package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.remittance.model.w;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@com.tencent.mm.ui.base.a(7)
public class RemittanceAdapterUI extends WalletBaseUI
{
  public String edV = null;
  protected int gOW;
  protected int obL;
  protected boolean pQP = false;
  protected com.tencent.mm.plugin.wallet.a pQQ = null;

  protected void c(String paramString, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(44824);
    ab.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.gOW + ", name=" + paramString);
    if (paramIntent != null)
    {
      paramIntent = new Intent(paramIntent);
      com.tencent.mm.plugin.wallet.a.a(this.pQQ, paramIntent);
      if (paramIntent.getIntExtra("busi_type", 0) != 1)
        break label148;
      paramIntent.setClass(this, RemittanceBusiUI.class);
    }
    while (true)
    {
      paramIntent.putExtra("receiver_name", paramString);
      paramIntent.putExtra("scene", this.gOW);
      paramIntent.putExtra("pay_scene", paramInt);
      paramIntent.putExtra("pay_channel", this.obL);
      startActivity(paramIntent);
      setResult(-1);
      finish();
      AppMethodBeat.o(44824);
      return;
      paramIntent = new Intent();
      break;
      label148: paramIntent.setClass(this, RemittanceUI.class);
    }
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, final m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(44823);
    if ((paramm instanceof w))
      this.pQP = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof w))
      {
        paramString = (w)paramm;
        paramm = paramString.pPZ;
        this.edV = paramString.username;
        if ((bo.isNullOrNil(this.edV)) && (bo.isNullOrNil(paramm)))
        {
          ab.d("MicroMsg.RemittanceAdapterUI", "Username empty & fishsh. scene=" + this.gOW);
          finish();
          AppMethodBeat.o(44823);
          bool = true;
        }
      }
    while (true)
    {
      return bool;
      if (this.gOW == 1)
      {
        if (paramString.scene == 33)
        {
          this.pQQ = com.tencent.mm.plugin.wallet.a.dq(this.edV, 2);
          this.pQQ.bs(20, getIntent().getStringExtra("receiver_name"));
        }
      }
      else
      {
        label161: paramm = new Intent();
        paramm.putExtra("fee", paramString.kCJ);
        paramm.putExtra("desc", paramString.desc);
        paramm.putExtra("scan_remittance_id", paramString.pPQ);
        paramm.putExtra("receiver_true_name", e.att(paramString.pPP));
        paramm.putExtra("receiver_true_name_busi", paramString.pPw);
        paramm.putExtra("receiver_tips", paramString.pPR);
        paramm.putExtra("rcvr_new_desc", paramString.pPS);
        paramm.putExtra("payer_desc", paramString.pPT);
        paramm.putExtra("rcvr_open_id", paramString.pPZ);
        paramm.putExtra("mch_name", paramString.pPW);
        paramm.putExtra("mch_info", paramString.pQc);
        paramm.putExtra("mch_photo", paramString.pPX);
        paramm.putExtra("mch_type", paramString.pQa);
        paramm.putExtra("mch_time", paramString.pPY);
        if (paramString.pPV == 1)
        {
          paramm.putExtra("busi_type", paramString.pPV);
          paramm.putExtra("rcvr_ticket", paramString.pPU);
          paramm.putExtra("rcvr_open_id", paramString.pPZ);
          paramm.putExtra("get_pay_wifi", paramString.pQb);
          if (paramString.pQd != null)
            paramm.putExtra("BusiRemittanceResp", paramString.pQd);
        }
        g.RQ();
        ad localad = ((j)g.K(j.class)).XM().aoN(this.edV);
        b.U(this.edV, 3);
        if ((localad == null) && (!this.edV.equals("")))
          break label530;
        c(this.edV, paramString.scene, paramm);
      }
      while (true)
      {
        AppMethodBeat.o(44823);
        bool = true;
        break;
        this.pQQ = com.tencent.mm.plugin.wallet.a.dq(this.edV, 3);
        this.pQQ.bs(10, getIntent().getStringExtra("receiver_name"));
        break label161;
        label530: ab.d("MicroMsg.RemittanceAdapterUI", "Receiver in contactStg and try to get contact");
        final long l = bo.anU();
        ao.a.flu.a(this.edV, "", new ao.b.a()
        {
          public final void o(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            AppMethodBeat.i(44818);
            if (paramAnonymousBoolean)
            {
              ab.v("MicroMsg.RemittanceAdapterUI", "getContact suc; cost=" + (bo.anU() - l) + " ms");
              b.U(paramAnonymousString, 3);
              o.acv().pZ(paramAnonymousString);
            }
            while (true)
            {
              RemittanceAdapterUI.this.c(RemittanceAdapterUI.this.edV, paramm.scene, this.pQS);
              AppMethodBeat.o(44818);
              return;
              ab.w("MicroMsg.RemittanceAdapterUI", "getContact failed");
            }
          }
        });
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
        c(null, 31, null);
        AppMethodBeat.o(44823);
        bool = true;
        continue;
        setResult(0);
        h.bQ(this, paramString);
        finish();
        AppMethodBeat.o(44823);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(44823);
      }
    }
  }

  protected void cfy()
  {
    AppMethodBeat.i(44820);
    w localw = new w(this.edV, this.obL);
    localw.eHT = "RemittanceProcess";
    a(localw, true, false);
    AppMethodBeat.o(44820);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(44822);
    if (!this.pQP)
    {
      ab.d("MicroMsg.RemittanceAdapterUI", "back press not lock");
      finish();
      AppMethodBeat.o(44822);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.RemittanceAdapterUI", "back press but lock");
      AppMethodBeat.o(44822);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44819);
    super.onCreate(paramBundle);
    AM(8);
    this.gOW = getIntent().getIntExtra("scene", 0);
    this.edV = getIntent().getStringExtra("receiver_name");
    this.obL = getIntent().getIntExtra("pay_channel", -1);
    this.pQQ = com.tencent.mm.plugin.wallet.a.at(getIntent());
    if (this.obL == -1)
    {
      paramBundle = dOD();
      if (paramBundle != null)
        this.obL = paramBundle.mqu.getInt("pay_channel", -1);
    }
    if (this.gOW == 1)
    {
      this.pQP = true;
      cfy();
      AppMethodBeat.o(44819);
    }
    while (true)
    {
      return;
      if (this.gOW == 3)
      {
        nf(580);
        if (getIntent() == null)
        {
          ab.d("MicroMsg.RemittanceAdapterUI", "func[doCheckPayNetscene] intent null");
          setResult(0);
          finish();
          AppMethodBeat.o(44819);
        }
        else
        {
          paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3, "getTransferMoneyRequest", getIntent().getIntExtra("pay_channel", 0));
          paramBundle.eHT = "RemittanceProcess";
          a(paramBundle, true, false);
          AppMethodBeat.o(44819);
        }
      }
      else if (this.gOW == 2)
      {
        if (bo.isNullOrNil(this.edV))
        {
          ab.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.gOW);
          finish();
          AppMethodBeat.o(44819);
        }
        else
        {
          c(this.edV, 31, null);
          AppMethodBeat.o(44819);
        }
      }
      else if ((this.gOW == 5) || (this.gOW == 6))
      {
        if (bo.isNullOrNil(this.edV))
        {
          ab.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.gOW);
          finish();
          AppMethodBeat.o(44819);
        }
        else
        {
          String str = this.edV;
          ab.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.gOW + ", name=" + str);
          paramBundle = new Intent();
          com.tencent.mm.plugin.wallet.a.a(this.pQQ, paramBundle);
          paramBundle.setClass(this, RemittanceOSRedirect.class);
          paramBundle.putExtra("receiver_name", str);
          paramBundle.putExtra("scene", this.gOW);
          paramBundle.putExtra("pay_scene", 31);
          paramBundle.putExtra("pay_channel", this.obL);
          startActivity(paramBundle);
          setResult(-1);
          finish();
          AppMethodBeat.o(44819);
        }
      }
      else
      {
        c(null, 31, null);
        AppMethodBeat.o(44819);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44821);
    if (this.gOW == 3)
      ng(580);
    super.onDestroy();
    AppMethodBeat.o(44821);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI
 * JD-Core Version:    0.6.2
 */