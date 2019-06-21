package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;

public class FreeWifiPcUI extends MMActivity
{
  private String appId;
  private String cxb;
  private Button grC;
  private String mwH;
  private Button myU;
  private TextView mzS;
  private int mzT;
  private p mzU = null;
  private String mza;

  private void goBack()
  {
    AppMethodBeat.i(21068);
    Intent localIntent = new Intent();
    g.gkE.h(localIntent, this);
    finish();
    AppMethodBeat.o(21068);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969596;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21066);
    super.onCreate(paramBundle);
    setMMTitle(2131300078);
    setBackBtn(new FreeWifiPcUI.1(this));
    this.appId = getIntent().getStringExtra("free_wifi_appid");
    this.mzT = getIntent().getIntExtra("ConstantsFreeWifi.FREE_WIFI_PC_ENCRYPTED_SHOPID", 0);
    this.cxb = getIntent().getStringExtra("ConstantsFreeWifi.FREE_WIFI_PC_TICKET");
    this.mwH = getIntent().getStringExtra("free_wifi_app_nickname");
    this.mza = getIntent().getStringExtra("free_wifi_privacy_url");
    this.mzS = ((TextView)findViewById(2131824150));
    this.grC = ((Button)findViewById(2131824151));
    this.mzS.setText("由" + this.mwH + "提供");
    this.grC.setOnClickListener(new FreeWifiPcUI.2(this));
    this.myU = ((Button)findViewById(2131824152));
    this.myU.setOnClickListener(new FreeWifiPcUI.3(this));
    AppMethodBeat.o(21066);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(21067);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(21067);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(21067);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiPcUI
 * JD-Core Version:    0.6.2
 */