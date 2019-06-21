package com.tencent.mm.plugin.wallet_ecard.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_ecard.a.g;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import org.xwalk.core.Log;

public class WalletECardLogoutUI extends WalletECardBaseUI
{
  private TextView gnj;
  private TextView iDT;
  private View iWz;
  private CdnImageView ntk;
  private String tDT;
  private TextView tQJ;
  private LinearLayout tQK;
  private Button tQL;
  private String tlg;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48154);
    boolean bool;
    if ((paramm instanceof g))
    {
      paramString = (g)paramm;
      paramString.a(new WalletECardLogoutUI.4(this, paramString)).b(new WalletECardLogoutUI.3(this)).c(new p.a()
      {
        public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
        {
        }
      });
      bool = true;
      AppMethodBeat.o(48154);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48154);
    }
  }

  public final int getLayoutId()
  {
    return 2130969313;
  }

  public final void initView()
  {
    AppMethodBeat.i(48152);
    this.iDT = ((TextView)findViewById(2131823374));
    this.tQJ = ((TextView)findViewById(2131823375));
    this.tQK = ((LinearLayout)findViewById(2131823376));
    this.gnj = ((TextView)findViewById(2131823378));
    this.ntk = ((CdnImageView)findViewById(2131823373));
    this.iWz = findViewById(2131823379);
    this.tQL = ((Button)findViewById(2131823377));
    this.tQL.setOnClickListener(new WalletECardLogoutUI.1(this));
    AppMethodBeat.o(48152);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48151);
    super.onCreate(paramBundle);
    nf(2931);
    initView();
    setMMTitle(2131298986);
    Log.i("MicroMsg.WalletECardLogoutUI", "do qry logout desc");
    paramBundle = new g();
    paramBundle.o(this);
    a(paramBundle, true, false);
    AppMethodBeat.o(48151);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48153);
    super.onDestroy();
    ng(2931);
    AppMethodBeat.o(48153);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI
 * JD-Core Version:    0.6.2
 */