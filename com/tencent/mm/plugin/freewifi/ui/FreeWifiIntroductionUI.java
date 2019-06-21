package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiIntroductionUI extends MMActivity
{
  private int cvd;
  private Button mxV;
  private Button mzt;
  private Button mzu;
  private CheckBox mzv;

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969592;
  }

  public final void initView()
  {
    AppMethodBeat.i(21004);
    this.mzt = ((Button)findViewById(2131824142));
    this.mzv = ((CheckBox)findViewById(2131824140));
    this.mxV = ((Button)findViewById(2131824143));
    this.mzu = ((Button)findViewById(2131824141));
    this.cvd = getIntent().getIntExtra("free_wifi_source", 1);
    if (this.cvd == 3)
    {
      setMMTitle(2131301439);
      ((TextView)findViewById(2131824139)).setText(2131301437);
      ((TextView)findViewById(2131824138)).setText(2131301436);
      this.mxV.setVisibility(8);
    }
    while (true)
    {
      setBackBtn(new FreeWifiIntroductionUI.1(this));
      this.mzt.setOnClickListener(new FreeWifiIntroductionUI.2(this));
      this.mzv.setOnCheckedChangeListener(new FreeWifiIntroductionUI.3(this));
      this.mzu.setOnClickListener(new FreeWifiIntroductionUI.4(this));
      this.mxV.setOnClickListener(new FreeWifiIntroductionUI.5(this));
      AppMethodBeat.o(21004);
      return;
      setMMTitle(2131300078);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21003);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(21003);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiIntroductionUI
 * JD-Core Version:    0.6.2
 */