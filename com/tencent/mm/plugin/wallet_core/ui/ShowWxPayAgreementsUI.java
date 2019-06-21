package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.p;

@a(3)
public class ShowWxPayAgreementsUI extends MMActivity
{
  private String content;
  private MMWebView tDY;
  private TextView tDZ;
  private TextView tEa;
  private int type;

  public void finish()
  {
    AppMethodBeat.i(47136);
    ab.i("MicroMsg.ShowWxPayAgreementsUI", "onRefreshed");
    super.finish();
    overridePendingTransition(2131034130, 2131034227);
    AppMethodBeat.o(47136);
  }

  public final int getLayoutId()
  {
    return 2130970680;
  }

  public final void initView()
  {
    AppMethodBeat.i(47135);
    h.pYm.e(15236, new Object[] { Integer.valueOf(1) });
    getSupportActionBar().hide();
    overridePendingTransition(2131034229, 2131034130);
    this.type = getIntent().getIntExtra("agreement_type", 0);
    this.tDY = MMWebView.a.g(this, this.mController.contentView);
    this.tDY.getSettings().setJavaScriptEnabled(true);
    this.tDZ = ((TextView)findViewById(2131827553));
    this.tEa = ((TextView)findViewById(2131827554));
    this.content = getIntent().getStringExtra("agreement_content");
    this.tEa.setOnClickListener(new ShowWxPayAgreementsUI.1(this));
    this.tDZ.setOnClickListener(new ShowWxPayAgreementsUI.2(this));
    this.tDY.setWebViewClient(new g(this));
    this.tDY.loadData(this.content, "text/html; charset=UTF-8", null);
    AppMethodBeat.o(47135);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47134);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(47134);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47139);
    boolean bool;
    if (paramInt == 4)
    {
      bool = true;
      AppMethodBeat.o(47139);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(47139);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(47138);
    super.onPause();
    AppMethodBeat.o(47138);
  }

  public void onResume()
  {
    AppMethodBeat.i(47137);
    super.onResume();
    AppMethodBeat.o(47137);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI
 * JD-Core Version:    0.6.2
 */