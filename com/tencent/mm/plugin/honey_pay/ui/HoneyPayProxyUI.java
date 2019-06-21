package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class HoneyPayProxyUI extends HoneyPayBaseUI
{
  private String nra;
  private boolean nsL;

  protected final void bFY()
  {
  }

  public final boolean bwQ()
  {
    return true;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41931);
    if ((paramm instanceof l))
    {
      paramString = (l)paramm;
      paramString.a(new HoneyPayProxyUI.3(this, paramString)).b(new HoneyPayProxyUI.2(this)).c(new p.a()
      {
        public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
        {
        }
      });
    }
    while (true)
    {
      AppMethodBeat.o(41931);
      return true;
      if ((paramm instanceof com.tencent.mm.plugin.honey_pay.a.m))
      {
        paramString = (com.tencent.mm.plugin.honey_pay.a.m)paramm;
        paramString.a(new HoneyPayProxyUI.6(this, paramString)).b(new HoneyPayProxyUI.5(this)).c(new HoneyPayProxyUI.4(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41929);
    super.onCreate(paramBundle);
    nf(2876);
    nf(2613);
    this.nsL = getIntent().getBooleanExtra("key_is_payer", false);
    this.nra = getIntent().getStringExtra("key_card_no");
    ab.i(this.TAG, "is payer: %s", new Object[] { Boolean.valueOf(this.nsL) });
    if (this.nsL)
    {
      ab.i(this.TAG, "do qry payer detail");
      paramBundle = new l(this.nra);
      paramBundle.o(this);
      a(paramBundle, true, false);
      AppMethodBeat.o(41929);
    }
    while (true)
    {
      return;
      paramBundle = new com.tencent.mm.plugin.honey_pay.a.m(this.nra);
      paramBundle.o(this);
      a(paramBundle, true, false);
      AppMethodBeat.o(41929);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41930);
    super.onDestroy();
    ng(2876);
    ng(2613);
    AppMethodBeat.o(41930);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI
 * JD-Core Version:    0.6.2
 */