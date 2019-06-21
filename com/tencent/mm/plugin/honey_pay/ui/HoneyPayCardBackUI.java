package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.k;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public class HoneyPayCardBackUI extends HoneyPayBaseUI
{
  private CdnImageView nqV;
  private WalletTextView nqW;
  private TextView nqX;
  private TextView nqY;
  private TextView nqZ;
  private String nra;
  private chl nrb;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41776);
    if ((paramm instanceof k))
    {
      paramString = (k)paramm;
      paramString.a(new HoneyPayCardBackUI.4(this, paramString)).b(new HoneyPayCardBackUI.3(this)).c(new HoneyPayCardBackUI.2(this));
    }
    AppMethodBeat.o(41776);
    return true;
  }

  public final int getLayoutId()
  {
    return 2130969820;
  }

  public final void initView()
  {
    AppMethodBeat.i(41774);
    this.nqV = ((CdnImageView)findViewById(2131824847));
    this.nqW = ((WalletTextView)findViewById(2131824850));
    this.nqX = ((TextView)findViewById(2131824851));
    this.nqY = ((TextView)findViewById(2131824848));
    this.nqZ = ((TextView)findViewById(2131824849));
    this.nqW.setPrefix(ae.dOd());
    AppMethodBeat.o(41774);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41777);
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      ab.i(this.TAG, "unbind success");
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(41777);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41773);
    this.nqT = 2131690168;
    this.yll = true;
    super.onCreate(paramBundle);
    setMMTitle("");
    setBackBtn(new HoneyPayCardBackUI.1(this));
    nf(2851);
    this.nra = getIntent().getStringExtra("key_card_no");
    initView();
    ab.i(this.TAG, "do qry card detail: %s", new Object[] { this.nra });
    paramBundle = new k(this.nra);
    paramBundle.o(this);
    a(paramBundle, true, false);
    AppMethodBeat.o(41773);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41775);
    super.onDestroy();
    ng(2851);
    AppMethodBeat.o(41775);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI
 * JD-Core Version:    0.6.2
 */