package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(3)
public class WalletCheckPwdNewUI extends WalletBaseUI
{
  private ImageView aqI;
  private WalletCheckPwdNewUI.a tGS;
  TextView tGT;
  private TextView tGU;
  private LinearLayout tGV;
  private ImageView tGW;
  private TextView tGX;
  private LinearLayout tGY;
  private LinearLayout tGZ;
  private TextView tHa;
  private ScrollView tHb;
  private EditHintPasswdView tsd;

  public final void AM(int paramInt)
  {
    AppMethodBeat.i(47325);
    this.mController.contentView.setVisibility(paramInt);
    AppMethodBeat.o(47325);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47330);
    ab.i("MicroMsg.WalletCheckPwdNewUI", "controller ret: %s", new Object[] { Boolean.FALSE });
    AppMethodBeat.o(47330);
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971083;
  }

  public final void initView()
  {
    AppMethodBeat.i(47326);
    this.aqI = ((ImageView)findViewById(2131828753));
    this.tGT = ((TextView)findViewById(2131824899));
    this.tGU = ((TextView)findViewById(2131828754));
    this.tGV = ((LinearLayout)findViewById(2131828752));
    this.tsd = ((EditHintPasswdView)findViewById(2131824902));
    this.tGW = ((ImageView)findViewById(2131828756));
    this.tGX = ((TextView)findViewById(2131828757));
    this.tGY = ((LinearLayout)findViewById(2131828755));
    this.tGZ = ((LinearLayout)findViewById(2131828751));
    this.tHa = ((TextView)findViewById(2131828758));
    this.tHb = ((ScrollView)findViewById(2131828750));
    this.aqI.setOnClickListener(new WalletCheckPwdNewUI.2(this));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.tsd);
    this.tsd.setOnInputValidListener(new WalletCheckPwdNewUI.3(this));
    e(this.tsd, 0, false);
    dOC();
    AppMethodBeat.o(47326);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47324);
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("scene", -1);
    ab.i("MicroMsg.WalletCheckPwdNewUI", "scene: %s", new Object[] { Integer.valueOf(i) });
    if (i == 3);
    for (this.tGS = new f(this); ; this.tGS = new a(this))
    {
      xE(getResources().getColor(2131689495));
      this.mController.hideTitleView();
      dyb();
      initView();
      this.tGS.onCreate();
      setBackBtn(new WalletCheckPwdNewUI.1(this));
      AppMethodBeat.o(47324);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47329);
    super.onDestroy();
    AppMethodBeat.o(47329);
  }

  public void onPause()
  {
    AppMethodBeat.i(47328);
    super.onPause();
    AppMethodBeat.o(47328);
  }

  public void onResume()
  {
    AppMethodBeat.i(47327);
    super.onResume();
    AppMethodBeat.o(47327);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI
 * JD-Core Version:    0.6.2
 */