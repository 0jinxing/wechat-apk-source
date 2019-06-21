package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.c.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class ExdeviceConnectedRouterActivateStateUI extends MMActivity
{
  private String appId;
  private String ceI;
  private String cws;
  private final int lAu;
  private ExdeviceConnectedRouterStateView lAv;
  private TextView lAw;
  private TextView lAx;
  private b<a> lAy;
  private String lqT;
  private String ssid;

  public ExdeviceConnectedRouterActivateStateUI()
  {
    AppMethodBeat.i(19921);
    this.lAu = 90000;
    this.lAy = new ExdeviceConnectedRouterActivateStateUI.1(this);
    AppMethodBeat.o(19921);
  }

  private void bpI()
  {
    AppMethodBeat.i(19927);
    finish();
    Intent localIntent = new Intent();
    localIntent.putExtra("From_fail_notify", true);
    ab.d("MicroMsg.ConnectedRouterActivateStateUi", "startMainUI");
    d.f(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    AppMethodBeat.o(19927);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969417;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(19922);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.ConnectedRouterActivateStateUi", "create activity");
    setMMTitle(2131299308);
    setBackBtn(new ExdeviceConnectedRouterActivateStateUI.2(this));
    this.lAv = ((ExdeviceConnectedRouterStateView)findViewById(2131823649));
    this.lAw = ((TextView)findViewById(2131823650));
    this.lAx = ((TextView)findViewById(2131823651));
    try
    {
      paramBundle = Uri.parse(getIntent().getStringExtra("key_connected_router"));
      this.ceI = paramBundle.getQueryParameter("deviceid");
      this.cws = paramBundle.getQueryParameter("devicetype");
      this.lqT = paramBundle.getQueryParameter("clientinfo");
      this.appId = paramBundle.getQueryParameter("appid");
      if ((bo.isNullOrNil(this.ceI)) || (bo.isNullOrNil(this.cws)) || (bo.isNullOrNil(this.lqT)) || (bo.isNullOrNil(this.appId)))
      {
        ab.e("MicroMsg.ConnectedRouterActivateStateUi", "loss param %s", new Object[] { paramBundle.toString() });
        finish();
      }
      this.ssid = paramBundle.getQueryParameter("ssid");
      ab.d("MicroMsg.ConnectedRouterActivateStateUi", "uri: %s, deviceid: %s, devicetype: %s, clientinfo: %s. ssid: %s", new Object[] { paramBundle.toString(), this.ceI, this.cws, this.lqT, this.ssid });
      if (this.ssid == null)
        this.ssid = "";
      uQ(1);
      aw.Rg().a(new a(this.ceI, this.cws, this.lqT, this.appId, this.lAy), 0);
      AppMethodBeat.o(19922);
      return;
    }
    catch (Exception paramBundle)
    {
      while (true)
        ab.d("MicroMsg.ConnectedRouterActivateStateUi", paramBundle.toString());
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(19925);
    super.onDestroy();
    AppMethodBeat.o(19925);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(19926);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bpI();
      bool = true;
      AppMethodBeat.o(19926);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(19926);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(19923);
    super.onResume();
    AppMethodBeat.o(19923);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void uQ(int paramInt)
  {
    AppMethodBeat.i(19924);
    this.lAv.setOnClickListener(null);
    ab.d("MicroMsg.ConnectedRouterActivateStateUi", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 3:
    case 4:
    case 5:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(19924);
      while (true)
      {
        return;
        this.lAv.setImageResource(2131231157);
        this.lAv.setState(3);
        this.lAv.lAB = 2;
        this.lAw.setText(2131299303);
        this.lAx.setText(getString(2131299304, new Object[] { this.ssid }));
        AppMethodBeat.o(19924);
        continue;
        this.lAv.setImageResource(2131231157);
        this.lAv.setState(3);
        this.lAv.lAB = 2;
        this.lAw.setText(2131299303);
        this.lAx.setText(getString(2131299305));
        AppMethodBeat.o(19924);
        continue;
        this.lAv.setImageResource(2131231157);
        this.lAv.setState(3);
        this.lAv.lAB = 2;
        this.lAw.setText(2131299303);
        this.lAx.setText(getString(2131299307));
        AppMethodBeat.o(19924);
        continue;
        this.lAv.setImageResource(2131231159);
        this.lAv.setState(2);
        this.lAw.setText(getString(2131299306, new Object[] { this.ssid }));
        addTextOptionMenu(0, getString(2131299301), new ExdeviceConnectedRouterActivateStateUI.3(this));
        AppMethodBeat.o(19924);
      }
      this.lAv.setImageResource(2131231158);
      this.lAv.setState(1);
      this.lAw.setText(2131299302);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI
 * JD-Core Version:    0.6.2
 */