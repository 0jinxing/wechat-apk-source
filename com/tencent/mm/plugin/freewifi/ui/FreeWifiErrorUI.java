package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiErrorUI extends MMActivity
{
  private ImageView myL;
  private TextView myM;
  private TextView myN;
  private TextView myO;

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969590;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20958);
    super.onCreate(paramBundle);
    setMMTitle(2131300078);
    this.myL = ((ImageView)findViewById(2131824125));
    if (getIntent().getIntExtra("free_wifi_show_detail_error", 0) == 1)
      this.myL.setImageResource(2130838835);
    this.myM = ((TextView)findViewById(2131824126));
    this.myN = ((TextView)findViewById(2131824127));
    this.myO = ((TextView)findViewById(2131824128));
    String str1 = getIntent().getStringExtra("free_wifi_error_ui_error_msg");
    paramBundle = getIntent().getStringExtra("free_wifi_error_ui_error_msg_detail1");
    String str2 = getIntent().getStringExtra("free_wifi_error_ui_error_msg_detail12");
    if (!m.isEmpty(str1))
      this.myM.setText(str1);
    if (!m.isEmpty(paramBundle))
      this.myN.setText(paramBundle);
    if (!m.isEmpty(str2))
      this.myO.setText(str2);
    setBackBtn(new FreeWifiErrorUI.1(this));
    AppMethodBeat.o(20958);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiErrorUI
 * JD-Core Version:    0.6.2
 */