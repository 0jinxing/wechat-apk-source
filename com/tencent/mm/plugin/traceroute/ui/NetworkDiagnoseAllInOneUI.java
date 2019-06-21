package com.tencent.mm.plugin.traceroute.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kr;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class NetworkDiagnoseAllInOneUI extends MMActivity
  implements View.OnClickListener
{
  private ImageView cAw;
  private b.a ecy;
  private Button grC;
  private ap gyS;
  private boolean nPX;
  private com.tencent.mm.modelgeo.d nQL;
  private int sIN;
  private TextView sIO;
  private TextView sIP;
  private TextView sIQ;
  private TextView sIR;
  private com.tencent.mm.ui.base.p sIS;
  private int sIT;
  private String sIU;
  private c<kr> sIV;
  private boolean sIW;
  private boolean sIX;
  private boolean sIY;

  private void ard()
  {
    AppMethodBeat.i(26004);
    ab.i("MicroMsg.NetworkDiagnoseAllInOneUI", "refreshUI, state:%d", new Object[] { Integer.valueOf(this.sIN) });
    switch (this.sIN)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 4:
    case 5:
    case 3:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(26004);
      while (true)
      {
        return;
        this.cAw.setImageResource(2131231712);
        this.sIQ.setText(getString(2131298885, new Object[] { Integer.valueOf(this.sIT) }));
        this.sIR.setText(2131298877);
        this.grC.setVisibility(4);
        this.sIP.setVisibility(4);
        AppMethodBeat.o(26004);
        continue;
        this.cAw.setImageResource(2131231712);
        this.sIQ.setText(2131298889);
        this.sIR.setText(2131298880);
        this.grC.setVisibility(0);
        this.sIP.setVisibility(4);
        AppMethodBeat.o(26004);
        continue;
        this.cAw.setImageResource(2131231710);
        this.sIQ.setText(2131298888);
        this.sIR.setText(2131298878);
        this.grC.setVisibility(0);
        this.grC.setText(2131298874);
        this.sIP.setVisibility(0);
        AppMethodBeat.o(26004);
        continue;
        this.cAw.setImageResource(2131231710);
        this.sIQ.setText(2131298886);
        this.sIR.setText(2131298878);
        this.grC.setVisibility(0);
        this.grC.setText(2131298874);
        this.sIP.setVisibility(0);
        AppMethodBeat.o(26004);
        continue;
        Intent localIntent = new Intent();
        localIntent.putExtra("title", 2131301654);
        localIntent.putExtra("rawUrl", getString(2131301651));
        localIntent.putExtra("showShare", false);
        com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
        mg(false);
        finish();
        AppMethodBeat.o(26004);
      }
      this.cAw.setImageResource(2131231711);
      this.sIQ.setText(2131298887);
      this.sIR.setText(2131298879);
      this.grC.setVisibility(0);
      this.grC.setText(2131298873);
      this.sIP.setVisibility(4);
    }
  }

  private void beo()
  {
    AppMethodBeat.i(26005);
    if (this.nQL == null)
      this.nQL = com.tencent.mm.modelgeo.d.agz();
    this.nQL.a(this.ecy, true);
    AppMethodBeat.o(26005);
  }

  private void mg(boolean paramBoolean)
  {
    AppMethodBeat.i(26006);
    if (bo.isNullOrNil(this.sIU))
      AppMethodBeat.o(26006);
    while (true)
    {
      return;
      ab.i("MicroMsg.NetworkDiagnoseAllInOneUI", "submit action, bSendLoaction:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
      {
        if (b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 71, "", ""))
        {
          getString(2131297061);
          this.sIS = com.tencent.mm.ui.base.h.b(this, getString(2131298891), true, null);
          this.grC.setEnabled(false);
          beo();
        }
        AppMethodBeat.o(26006);
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.X(14533, "," + this.sIU);
        AppMethodBeat.o(26006);
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(26003);
    super.finish();
    overridePendingTransition(2131034130, 2131034227);
    AppMethodBeat.o(26003);
  }

  public final int getLayoutId()
  {
    return 2130970296;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(26007);
    if (((this.sIN == 5) || (this.sIN == 4)) && (paramView == this.grC))
    {
      mg(true);
      AppMethodBeat.o(26007);
    }
    while (true)
    {
      return;
      mg(false);
      finish();
      AppMethodBeat.o(26007);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26002);
    super.onCreate(paramBundle);
    overridePendingTransition(2131034229, 2131034130);
    setMMTitle("");
    getSupportActionBar().hide();
    paramBundle = getIntent();
    this.sIN = paramBundle.getIntExtra("diagnose_state", 0);
    this.sIT = paramBundle.getIntExtra("diagnose_percent", 1);
    this.sIU = paramBundle.getStringExtra("diagnose_kvInfo");
    ab.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get state: %d percent: %d, kv: %s", new Object[] { Integer.valueOf(this.sIN), Integer.valueOf(this.sIT), this.sIU });
    if (this.sIN == 0)
    {
      this.sIN = 1;
      ab.i("MicroMsg.NetworkDiagnoseAllInOneUI", "start diagnose");
      aw.Rg().a(new bk(new NetworkDiagnoseAllInOneUI.4(this)), 0);
    }
    this.grC = ((Button)findViewById(2131826325));
    this.sIO = ((TextView)findViewById(2131826321));
    this.sIP = ((TextView)findViewById(2131826326));
    this.cAw = ((ImageView)findViewById(2131826322));
    this.sIQ = ((TextView)findViewById(2131826323));
    this.sIR = ((TextView)findViewById(2131826324));
    this.sIO.setOnClickListener(this);
    this.grC.setOnClickListener(this);
    this.sIP.setOnClickListener(this);
    ard();
    this.sIV = new NetworkDiagnoseAllInOneUI.1(this);
    a.xxA.b(this.sIV);
    this.ecy = new NetworkDiagnoseAllInOneUI.2(this);
    this.gyS = new ap(new NetworkDiagnoseAllInOneUI.3(this), true);
    if ((this.sIN == 0) || (this.sIN == 1))
      this.gyS.ae(1000L, 1000L);
    AppMethodBeat.o(26002);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26008);
    super.onDestroy();
    a.xxA.d(this.sIV);
    if (this.nQL != null)
    {
      this.nQL.c(this.ecy);
      this.nQL = null;
    }
    if (this.gyS != null)
    {
      this.gyS.stopTimer();
      this.gyS = null;
    }
    AppMethodBeat.o(26008);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(26009);
    ab.i("MicroMsg.NetworkDiagnoseAllInOneUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 71:
    }
    while (true)
    {
      AppMethodBeat.o(26009);
      while (true)
      {
        return;
        if (paramArrayOfInt[0] != 0)
          break;
        mg(true);
        AppMethodBeat.o(26009);
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131301921), false, new NetworkDiagnoseAllInOneUI.5(this), new NetworkDiagnoseAllInOneUI.6(this));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI
 * JD-Core Version:    0.6.2
 */