package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.c;
import com.tencent.mm.plugin.honey_pay.a.d;
import com.tencent.mm.plugin.honey_pay.a.g;
import com.tencent.mm.plugin.honey_pay.a.n;
import com.tencent.mm.plugin.wallet_core.c.w;
import com.tencent.mm.protocal.protobuf.ako;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.a;
import java.io.IOException;

public class HoneyPayCheckPwdUI extends HoneyPayBaseUI
{
  private int gOW;
  private TextView iDT;
  private String igi;
  private TextView kEq;
  private EditHintPasswdView nrZ;
  private String nra;
  private chl nrb;
  private String nsa;
  private String nsb;
  private long nsc;
  private int nsd;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41854);
    ab.d("MicroMsg.HoneyPayCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof w))
    {
      paramm = (w)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (this.gOW == 1)
        {
          paramString = paramm.tuu;
          ab.i("MicroMsg.HoneyPayCheckPwdUI", "do give card");
          dOG();
          paramString = new c(paramString, this.nsc, this.igi, this.nsa, this.nsd, this.nsb);
          paramString.o(this);
          a(paramString, false, false);
        }
    }
    while (true)
    {
      AppMethodBeat.o(41854);
      while (true)
      {
        return true;
        if (this.gOW == 2)
        {
          paramString = paramm.tuu;
          ab.i("MicroMsg.HoneyPayCheckPwdUI", "do modify quota");
          dOG();
          paramString = new com.tencent.mm.plugin.honey_pay.a.h(this.nsc, paramString, this.nra);
          paramString.o(this);
          a(paramString, false, false);
          break;
        }
        if (this.gOW != 3)
          break;
        paramString = paramm.tuu;
        ab.i("MicroMsg.HoneyPayCheckPwdUI", "do unbind: %s", new Object[] { this.nra });
        dOG();
        paramString = new n(this.nra, paramString);
        paramString.o(this);
        a(paramString, false, false);
        break;
        if (this.nrZ != null)
          this.nrZ.cey();
        bgk();
        if ((!paramm.AfO) && (!bo.isNullOrNil(paramString)))
        {
          ab.i("MicroMsg.HoneyPayCheckPwdUI", "show normal error msg");
          com.tencent.mm.ui.base.h.a(this.mController.ylL, paramString, null, false, new HoneyPayCheckPwdUI.10(this));
        }
        AppMethodBeat.o(41854);
      }
      if ((paramm instanceof c))
      {
        paramString = (c)paramm;
        bgk();
        paramString.a(new HoneyPayCheckPwdUI.13(this, paramString)).b(new HoneyPayCheckPwdUI.12(this)).c(new HoneyPayCheckPwdUI.11(this));
      }
      else if ((paramm instanceof com.tencent.mm.plugin.honey_pay.a.h))
      {
        bgk();
        paramString = (com.tencent.mm.plugin.honey_pay.a.h)paramm;
        paramString.a(new HoneyPayCheckPwdUI.16(this, paramString)).b(new p.a()
        {
          public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            AppMethodBeat.i(41848);
            if (HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this) != null)
              HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this).cey();
            com.tencent.mm.plugin.report.service.h.pYm.k(875L, 9L, 1L);
            AppMethodBeat.o(41848);
          }
        }).c(new HoneyPayCheckPwdUI.14(this));
      }
      else if ((paramm instanceof d))
      {
        paramString = (d)paramm;
        paramString.a(new HoneyPayCheckPwdUI.3(this, paramString)).b(new HoneyPayCheckPwdUI.2(this, paramString)).c(new p.a()
        {
          public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            AppMethodBeat.i(41850);
            if (HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this) != null)
              HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this).cey();
            HoneyPayCheckPwdUI.this.bgk();
            AppMethodBeat.o(41850);
          }
        });
      }
      else if ((paramm instanceof g))
      {
        paramString = (g)paramm;
        this.nrb = paramString.nqD.woi;
        paramString.a(new HoneyPayCheckPwdUI.6(this)).b(new HoneyPayCheckPwdUI.5(this)).c(new HoneyPayCheckPwdUI.4(this));
      }
      else if ((paramm instanceof n))
      {
        bgk();
        ((n)paramm).a(new HoneyPayCheckPwdUI.9(this)).b(new HoneyPayCheckPwdUI.8(this)).c(new p.a()
        {
          public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            AppMethodBeat.i(41841);
            if (HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this) != null)
              HoneyPayCheckPwdUI.e(HoneyPayCheckPwdUI.this).cey();
            com.tencent.mm.plugin.report.service.h.pYm.k(875L, 7L, 1L);
            AppMethodBeat.o(41841);
          }
        });
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969829;
  }

  public final void initView()
  {
    AppMethodBeat.i(41852);
    this.nrZ = ((EditHintPasswdView)findViewById(2131824902));
    a.a(this.nrZ);
    this.nrZ.setOnInputValidListener(new HoneyPayCheckPwdUI.1(this));
    e(this.nrZ, 0, false);
    this.iDT = ((TextView)findViewById(2131824899));
    this.kEq = ((TextView)findViewById(2131824900));
    if (this.gOW == 1)
      this.iDT.setText(2131300543);
    while (true)
    {
      this.kEq.setText(2131300545);
      AppMethodBeat.o(41852);
      return;
      if (this.gOW == 2)
        this.iDT.setText(2131300544);
      else
        this.iDT.setText(2131300546);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41851);
    super.onCreate(paramBundle);
    this.igi = getIntent().getStringExtra("key_username");
    this.nsa = getIntent().getStringExtra("key_take_message");
    this.nsc = getIntent().getLongExtra("key_credit_line", 0L);
    this.gOW = getIntent().getIntExtra("key_scene", 0);
    this.nra = getIntent().getStringExtra("key_card_no");
    this.nsb = getIntent().getStringExtra("key_wishing");
    if (this.gOW == 1)
    {
      this.nsd = getIntent().getIntExtra("key_cardtype", 0);
      if (this.nsd == 0)
      {
        ab.w("MicroMsg.HoneyPayCheckPwdUI", "error card type: %s", new Object[] { Integer.valueOf(this.nsd) });
        finish();
      }
    }
    chl localchl;
    if (this.gOW == 3)
      localchl = new chl();
    try
    {
      paramBundle = getIntent().getByteArrayExtra("key_toke_mess");
      if ((paramBundle == null) || (paramBundle.length == 0))
      {
        ab.w("MicroMsg.HoneyPayCheckPwdUI", "toke mess is null when unbind !!!");
        finish();
      }
      localchl.parseFrom(paramBundle);
      this.nrb = localchl;
      setMMTitle("");
      nf(2662);
      nf(2865);
      nf(2630);
      nf(2815);
      nf(2659);
      initView();
      AppMethodBeat.o(41851);
      return;
    }
    catch (IOException paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.HoneyPayCheckPwdUI", paramBundle, "", new Object[0]);
        finish();
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41853);
    super.onDestroy();
    ng(2662);
    ng(2865);
    ng(2630);
    ng(2815);
    ng(2659);
    AppMethodBeat.o(41853);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(41855);
    super.wU(paramInt);
    if (this.nrZ != null)
      this.nrZ.cey();
    AppMethodBeat.o(41855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI
 * JD-Core Version:    0.6.2
 */