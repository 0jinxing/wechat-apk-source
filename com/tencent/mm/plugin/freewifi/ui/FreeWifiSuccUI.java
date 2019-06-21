package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.w;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.model.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.e;

public class FreeWifiSuccUI extends MMActivity
  implements f
{
  private String cBb;
  private String csB;
  private Button ixU;
  private CheckBox koj;
  private String mAa;
  private View mAf;
  private TextView mAg;
  private View mAh;
  private TextView mAi;
  private View mAj;
  private int mAk;
  private boolean mAl = false;
  private boolean mAm = false;
  private String mwH;
  private TextView mzS;
  private int mzZ;
  private String signature;

  private void bzT()
  {
    AppMethodBeat.i(21095);
    if (this.mAm)
      AppMethodBeat.o(21095);
    while (true)
    {
      return;
      this.mAm = true;
      if ((this.mAl) && (!bo.isNullOrNil(this.csB)) && ((!t.mZ(this.cBb)) || (!t.mY(this.cBb))))
      {
        aw.Rg().a(1703, this);
        i locali = new i(this.csB, getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_channel_id", 0), com.tencent.mm.plugin.freewifi.m.V(getIntent()));
        aw.Rg().a(locali, 0);
      }
      l.b(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), this.mAl);
      AppMethodBeat.o(21095);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(21091);
    super.finish();
    bzT();
    AppMethodBeat.o(21091);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969599;
  }

  public final void initView()
  {
    AppMethodBeat.i(21094);
    setMMTitle(2131300078);
    pP(false);
    this.mAf = findViewById(2131824157);
    this.mAg = ((TextView)findViewById(2131824159));
    this.koj = ((CheckBox)findViewById(2131824160));
    this.mAh = findViewById(2131824161);
    this.mAi = ((TextView)findViewById(2131824162));
    this.mAj = findViewById(2131824163);
    this.mzS = ((TextView)findViewById(2131824164));
    this.ixU = ((Button)findViewById(2131824166));
    this.ixU.setOnClickListener(new FreeWifiSuccUI.1(this));
    if ((bo.isNullOrNil(this.csB)) || (bo.isNullOrNil(this.cBb)) || (bo.isNullOrNil(this.mwH)))
    {
      this.mAf.setVisibility(8);
      this.mAh.setVisibility(8);
      this.mAj.setVisibility(8);
    }
    while (true)
    {
      if (com.tencent.mm.plugin.freewifi.m.Y(getIntent()) == 10)
      {
        final String str = com.tencent.mm.compatible.e.q.eth.etR;
        if ((!com.tencent.mm.plugin.freewifi.m.isEmpty(str)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(com.tencent.mm.compatible.e.q.bB(this.mController.ylL))))
        {
          Button localButton = (Button)findViewById(2131824167);
          localButton.setText(String.format(getString(2131300077), new Object[] { com.tencent.mm.compatible.e.q.bB(this.mController.ylL) }));
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(21088);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", str);
              com.tencent.mm.bp.d.b(FreeWifiSuccUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
              AppMethodBeat.o(21088);
            }
          });
          localButton.setVisibility(0);
        }
      }
      AppMethodBeat.o(21094);
      return;
      if ((!t.mZ(this.cBb)) || (!t.mY(this.cBb)))
        break;
      l.a(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), true);
      this.mAf.setVisibility(8);
      this.mAh.setVisibility(8);
      this.mAj.setVisibility(0);
      this.mzS.setText(this.mwH);
      this.mAj.setOnClickListener(new FreeWifiSuccUI.2(this));
    }
    l.a(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), false);
    this.mAj.setVisibility(8);
    this.mAf.setVisibility(0);
    if (bo.isNullOrNil(this.signature))
    {
      this.mAh.setVisibility(8);
      findViewById(2131824158).setBackgroundColor(getResources().getColor(2131690691));
      label489: this.mAg.setText(getString(2131300057, new Object[] { this.mwH }));
      if (this.mAk != 1)
        break label575;
      this.koj.setChecked(true);
    }
    for (this.mAl = true; ; this.mAl = false)
    {
      this.koj.setOnCheckedChangeListener(new FreeWifiSuccUI.3(this));
      break;
      this.mAh.setVisibility(0);
      this.mAi.setText(this.signature);
      break label489;
      label575: this.koj.setChecked(false);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21089);
    super.onCreate(paramBundle);
    this.csB = getIntent().getStringExtra("free_wifi_appid");
    this.mwH = getIntent().getStringExtra("free_wifi_app_nickname");
    this.cBb = getIntent().getStringExtra("free_wifi_app_username");
    this.mzZ = getIntent().getIntExtra("free_wifi_finish_actioncode", 0);
    this.mAa = getIntent().getStringExtra("free_wifi_finish_url");
    this.mAk = getIntent().getIntExtra(e.e.yfW, 0);
    this.signature = getIntent().getStringExtra("free_wifi_signature");
    ab.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "get from intent, appid = %s, appNickName = %s, appUserName = %s, finishActionCode = %d, finishUrl = %s, signature = %s", new Object[] { this.csB, this.mwH, this.cBb, Integer.valueOf(this.mzZ), this.mAa, this.signature });
    paramBundle = k.byo();
    String str = com.tencent.mm.plugin.freewifi.m.Mz("MicroMsg.FreeWifi.FreeWifiSuccUI");
    paramBundle.ssid = at.gE(ah.getContext());
    paramBundle.bssid = at.gF(ah.getContext());
    paramBundle.cuI = str;
    paramBundle.cuH = getIntent().getStringExtra("free_wifi_ap_key");
    paramBundle.mud = this.csB;
    paramBundle.kBq = com.tencent.mm.plugin.freewifi.m.V(getIntent());
    paramBundle.mue = com.tencent.mm.plugin.freewifi.m.X(getIntent());
    paramBundle.muf = k.b.mur.muQ;
    paramBundle.mug = k.b.mur.name;
    paramBundle.cIb = com.tencent.mm.plugin.freewifi.m.Y(getIntent());
    paramBundle.muh = this.cBb;
    paramBundle.byq().byp();
    AppMethodBeat.o(21089);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(21092);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      bool = true;
      AppMethodBeat.o(21092);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(21092);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(21090);
    super.onResume();
    initView();
    AppMethodBeat.o(21090);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(21093);
    ab.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "onSceneEnd, scnee type = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    aw.Rg().b(1703, this);
    AppMethodBeat.o(21093);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiSuccUI
 * JD-Core Version:    0.6.2
 */