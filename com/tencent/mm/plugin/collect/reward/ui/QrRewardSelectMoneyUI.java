package com.tencent.mm.plugin.collect.reward.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(2)
public class QrRewardSelectMoneyUI extends QrRewardBaseUI
{
  private int cIb;
  private String hAh;
  private String kDS;
  private String kDU;
  private String kDW;
  private String kDX;
  private String kDY;
  private String kDZ;
  private List<Integer> kEJ;
  private ImageView kEK;
  private TextView kEL;
  private TextView kEM;
  private TextView kEN;
  private TextView kEO;
  private MMGridView kEP;
  private TextView kEQ;
  private QrRewardSelectMoneyUI.a kER;
  private String kES;
  private String kET;
  private String kEa;
  private int kEb;

  public QrRewardSelectMoneyUI()
  {
    AppMethodBeat.i(41141);
    this.kEJ = new ArrayList();
    AppMethodBeat.o(41141);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41144);
    if ((paramm instanceof f))
    {
      paramString = (f)paramm;
      paramString.a(new QrRewardSelectMoneyUI.5(this, paramString)).b(new QrRewardSelectMoneyUI.4(this, paramString)).c(new QrRewardSelectMoneyUI.3(this, paramString));
      AM(0);
    }
    AppMethodBeat.o(41144);
    return true;
  }

  public boolean convertActivityFromTranslucent()
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130970434;
  }

  public final void initView()
  {
    AppMethodBeat.i(41143);
    this.kEK = ((ImageView)findViewById(2131826766));
    this.kEL = ((TextView)findViewById(2131826772));
    this.kEM = ((TextView)findViewById(2131826767));
    this.kEN = ((TextView)findViewById(2131826768));
    this.kEO = ((TextView)findViewById(2131826769));
    this.kEP = ((MMGridView)findViewById(2131826770));
    this.kEQ = ((TextView)findViewById(2131826771));
    this.kER = new QrRewardSelectMoneyUI.a(this, (byte)0);
    this.kEP.setAdapter(this.kER);
    this.kEP.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(41131);
        paramAnonymousInt = ((Integer)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt)).intValue();
        QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, paramAnonymousInt, 1);
        AppMethodBeat.o(41131);
      }
    });
    this.kEQ.setOnClickListener(new QrRewardSelectMoneyUI.2(this));
    AppMethodBeat.o(41143);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41146);
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1)
        break label42;
      ab.i("MicroMsg.QrRewardSelectMoneyUI", "pay succ");
      finish();
      AppMethodBeat.o(41146);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      label42: AppMethodBeat.o(41146);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41142);
    super.onCreate(paramBundle);
    nf(1516);
    setMMTitle(2131302068);
    AM(4);
    this.kES = getIntent().getStringExtra("key_qrcode_url");
    this.cIb = getIntent().getIntExtra("key_channel", 0);
    this.hAh = getIntent().getStringExtra("key_web_url");
    ab.i("MicroMsg.QrRewardSelectMoneyUI", "do scan code");
    a(new f(this.kES, this.cIb, this.hAh), true, true);
    initView();
    int i = getIntent().getIntExtra("key_scene", 0);
    ab.d("MicroMsg.QrRewardSelectMoneyUI", "scene: %s", new Object[] { Integer.valueOf(i) });
    h.pYm.e(14721, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
    AppMethodBeat.o(41142);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41145);
    super.onDestroy();
    ng(1516);
    AppMethodBeat.o(41145);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI
 * JD-Core Version:    0.6.2
 */