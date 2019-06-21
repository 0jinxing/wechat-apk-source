package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.e.w;
import com.tencent.mm.plugin.freewifi.e.f;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.e;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FreeWifiFrontPageUI extends MMActivity
{
  protected int cdf;
  protected String className;
  protected String csB;
  protected String cuH;
  protected int cvd;
  private final com.tencent.mm.at.a.a.c fGS;
  private ak fbD;
  protected Intent intent;
  protected String jUg;
  protected int mwG;
  protected String mwH;
  protected TextView myB;
  protected TextView myC;
  protected TextView myD;
  protected ImageView myQ;
  protected TextView myR;
  protected TextView myS;
  protected Button myT;
  protected Button myU;
  protected Dialog myV;
  protected View myW;
  protected String myX;
  protected String myY;
  protected String myZ;
  private boolean myf;
  protected String mza;
  protected com.tencent.mm.plugin.freewifi.e.a mzb;
  private Lock mzc;
  private FreeWifiFrontPageUI.d mzd;
  protected String ssid;

  public FreeWifiFrontPageUI()
  {
    AppMethodBeat.i(20974);
    this.myf = true;
    this.fbD = new FreeWifiFrontPageUI.1(this);
    c.a locala = new c.a();
    locala.ePF = true;
    locala.ePG = true;
    locala.ePT = 2130838837;
    locala.eQf = true;
    locala.eQg = 0.0F;
    this.fGS = locala.ahG();
    AppMethodBeat.o(20974);
  }

  private static Dialog b(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(20983);
    View localView = View.inflate(paramContext, 2130969597, null);
    paramContext = new com.tencent.mm.ui.base.i(paramContext, 2131493258);
    paramContext.setCancelable(true);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    AppMethodBeat.o(20983);
    return paramContext;
  }

  private FreeWifiFrontPageUI.d bzI()
  {
    AppMethodBeat.i(20975);
    try
    {
      this.mzc.lock();
      FreeWifiFrontPageUI.d locald = this.mzd;
      return locald;
    }
    finally
    {
      this.mzc.unlock();
      AppMethodBeat.o(20975);
    }
  }

  private void bzJ()
  {
    AppMethodBeat.i(20980);
    l.w(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    FreeWifiFrontPageUI.d locald = bzI();
    ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, class=%s, desc=User click the connect button and starts the connect wifi process. uiState=%s", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), this.className, locald.name() });
    if ((bzI() == FreeWifiFrontPageUI.d.mzi) || (bzI() == FreeWifiFrontPageUI.d.mzk))
    {
      boolean bool = this.intent.getBooleanExtra("ConstantsFreeWifi.FREE_WIFI_SHOULD_BIND_PHONE", false);
      int i = m.byt();
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, class=%s, desc=It makes a decision whether to bind phone number. shoudBindPhone=%b, userPhoneState=%d(0 means no phone number. 1 means having a china phone number. 2 means having a foreign number.)", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), this.className, Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((bool) && (i == 1) && (this.mwG != 33))
      {
        com.tencent.mm.ui.base.h.a(this, 2131300033, 2131300034, new FreeWifiFrontPageUI.8(this), null);
        AppMethodBeat.o(20980);
      }
    }
    while (true)
    {
      return;
      this.mzd = FreeWifiFrontPageUI.d.mzj;
      bzL();
      this.mzb.connect();
      AppMethodBeat.o(20980);
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(20988);
    l.x(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Object localObject = k.byo();
    ((k.a)localObject).cuH = this.cuH;
    ((k.a)localObject).kBq = m.V(this.intent);
    ((k.a)localObject).muf = k.b.muD.muQ;
    ((k.a)localObject).mug = k.b.muD.name;
    ((k.a)localObject).cIb = m.Y(this.intent);
    ((k.a)localObject).mue = m.X(this.intent);
    ((k.a)localObject).result = 0;
    ((k.a)localObject).ehr = "";
    ((k.a)localObject).byq().b(this.intent, true).byp();
    localObject = new Intent();
    com.tencent.mm.plugin.freewifi.g.gkE.h((Intent)localObject, this);
    finish();
    AppMethodBeat.o(20988);
  }

  public final void a(FreeWifiFrontPageUI.d paramd, Object paramObject)
  {
    AppMethodBeat.i(20976);
    try
    {
      this.mzc.lock();
      this.mzd = paramd;
      Message localMessage = Message.obtain();
      FreeWifiFrontPageUI.c localc = new com/tencent/mm/plugin/freewifi/ui/FreeWifiFrontPageUI$c;
      localc.<init>(paramd, paramObject);
      localMessage.obj = localc;
      this.fbD.sendMessage(localMessage);
      return;
    }
    finally
    {
      this.mzc.unlock();
      AppMethodBeat.o(20976);
    }
    throw paramd;
  }

  protected final void bS(final Object paramObject)
  {
    AppMethodBeat.i(20984);
    if (!(paramObject instanceof FreeWifiFrontPageUI.a))
    {
      AppMethodBeat.o(20984);
      return;
    }
    FreeWifiFrontPageUI.a locala = (FreeWifiFrontPageUI.a)paramObject;
    ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, desc=Connect failed. errcode=%s", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), FreeWifiFrontPageUI.a.a(locala) });
    if (this.myV != null)
      this.myV.dismiss();
    this.myB.setVisibility(0);
    if (!m.isEmpty(FreeWifiFrontPageUI.a.b(locala)));
    for (paramObject = FreeWifiFrontPageUI.a.b(locala); ; paramObject = getString(FreeWifiFrontPageUI.a.c(locala)))
    {
      this.myB.setText(paramObject);
      this.myB.setVisibility(0);
      this.myC.setVisibility(0);
      this.myD.setVisibility(0);
      paramObject = getString(2131300054) + ": " + FreeWifiFrontPageUI.a.a(locala);
      this.myD.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(20968);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("free_wifi_show_detail_error", 1);
          paramAnonymousView.putExtra("free_wifi_error_ui_error_msg", FreeWifiFrontPageUI.this.getString(2131300037));
          paramAnonymousView.putExtra("free_wifi_error_ui_error_msg_detail1", paramObject);
          paramAnonymousView.setClass(FreeWifiFrontPageUI.this, FreeWifiErrorUI.class);
          FreeWifiFrontPageUI.this.startActivity(paramAnonymousView);
          AppMethodBeat.o(20968);
        }
      });
      this.myT.setVisibility(0);
      this.myT.setText(2131300074);
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toFail, desc=connect failed.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
      AppMethodBeat.o(20984);
      break;
      if (FreeWifiFrontPageUI.a.c(locala) == 0)
        FreeWifiFrontPageUI.a.d(locala);
    }
  }

  protected final void bT(Object paramObject)
  {
    AppMethodBeat.i(20985);
    if (!(paramObject instanceof FreeWifiFrontPageUI.b))
      AppMethodBeat.o(20985);
    Object localObject;
    while (true)
    {
      return;
      localObject = ((FreeWifiFrontPageUI.b)paramObject).mzh;
      if ((this.mwG != 31) && (this.myV != null))
        this.myV.dismiss();
      this.myT.setText(2131298429);
      this.myT.setClickable(false);
      paramObject = getIntent();
      paramObject.putExtra("free_wifi_appid", ((gj)localObject).vEn);
      paramObject.putExtra("free_wifi_app_nickname", ((gj)localObject).jCH);
      paramObject.putExtra("free_wifi_app_username", ((gj)localObject).jBB);
      paramObject.putExtra("free_wifi_signature", ((gj)localObject).guQ);
      paramObject.putExtra("free_wifi_finish_actioncode", ((gj)localObject).vID);
      paramObject.putExtra("free_wifi_finish_url", ((gj)localObject).vIE);
      paramObject.putExtra(e.e.yfW, ((gj)localObject).mAk);
      if (((gj)localObject).vID != 2)
        break label481;
      if (bo.isNullOrNil(((gj)localObject).jBB))
        break;
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", ((gj)localObject).jBB);
      com.tencent.mm.bp.d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      d.IF();
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=toSuccess, desc=connect succeeded.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
      localObject = k.byo();
      ((k.a)localObject).cuH = this.cuH;
      ((k.a)localObject).kBq = m.V(paramObject);
      ((k.a)localObject).muf = k.b.muF.muQ;
      ((k.a)localObject).mug = k.b.muF.name;
      ((k.a)localObject).cIb = m.Y(paramObject);
      ((k.a)localObject).mue = m.X(paramObject);
      ((k.a)localObject).result = 0;
      ((k.a)localObject).ehr = "";
      ((k.a)localObject).byq().b(paramObject, true).byp();
      AppMethodBeat.o(20985);
    }
    paramObject.setClass(this, FreeWifiSuccUI.class);
    while (true)
    {
      localObject = k.byo();
      ((k.a)localObject).cuH = this.cuH;
      ((k.a)localObject).kBq = m.V(paramObject);
      ((k.a)localObject).muf = k.b.muE.muQ;
      ((k.a)localObject).mug = k.b.muE.name;
      ((k.a)localObject).cIb = m.Y(paramObject);
      ((k.a)localObject).mue = m.X(paramObject);
      ((k.a)localObject).result = 0;
      ((k.a)localObject).ehr = "";
      ((k.a)localObject).byq().b(paramObject, true).byp();
      finish();
      startActivity(paramObject);
      d.IF();
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=toSuccess, desc=connect succeeded.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
      AppMethodBeat.o(20985);
      break;
      label481: if (m.isEmpty(((gj)localObject).vIF))
      {
        paramObject.setClass(this, FreeWifiSuccUI.class);
      }
      else
      {
        paramObject.putExtra("free_wifi_qinghuai_url", ((gj)localObject).vIF);
        paramObject.setClass(this, FreeWifiSuccWebViewUI.class);
      }
    }
  }

  protected final void bzK()
  {
    AppMethodBeat.i(20981);
    this.myB.setVisibility(4);
    if (this.mwG == 31)
    {
      this.myT.setVisibility(8);
      if ((m.Y(getIntent()) == 10) && (!m.isEmpty(com.tencent.mm.compatible.e.q.eth.etR)) && (!m.isEmpty(com.tencent.mm.compatible.e.q.bB(this.mController.ylL))))
        this.myT.setText(String.format(getString(2131300035), new Object[] { com.tencent.mm.compatible.e.q.bB(this.mController.ylL) }));
      if (!bo.isNullOrNil(this.myZ))
        break label304;
      if (this.mwG != 33)
        break label287;
      this.myS.setText(getString(2131298431) + ": " + this.ssid);
    }
    while (true)
    {
      if (!bo.isNullOrNil(this.csB))
      {
        if (!bo.isNullOrNil(this.mwH))
          this.myR.setText(this.mwH);
        if (!bo.isNullOrNil(this.myX))
          o.ahp().a(this.myX, this.myQ, this.fGS);
      }
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnectStart, desc=it initializes the connect front page.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
      AppMethodBeat.o(20981);
      return;
      this.myT.setVisibility(0);
      this.myT.setText(2131298435);
      break;
      label287: this.myS.setText(getString(2131298431));
      continue;
      label304: this.myS.setText(this.myZ);
    }
  }

  protected final void bzL()
  {
    AppMethodBeat.i(20982);
    this.myB.setVisibility(4);
    this.myC.setVisibility(4);
    this.myD.setVisibility(4);
    this.myT.setText(2131298432);
    this.myV = b(this.mController.ylL, new FreeWifiFrontPageUI.9(this));
    ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
    this.myV.show();
    AppMethodBeat.o(20982);
  }

  public void finish()
  {
    AppMethodBeat.i(20986);
    super.finish();
    k.a locala = k.byo();
    locala.cuH = this.cuH;
    locala.kBq = m.V(this.intent);
    locala.muf = k.b.muC.muQ;
    locala.mug = k.b.muC.name;
    locala.cIb = m.Y(this.intent);
    locala.mue = m.X(this.intent);
    locala.result = 0;
    locala.ehr = "";
    locala.byq().b(this.intent, true).byp();
    AppMethodBeat.o(20986);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969591;
  }

  public final void initView()
  {
    AppMethodBeat.i(20978);
    setBackBtn(new FreeWifiFrontPageUI.4(this));
    if (this.myV != null)
      this.myV.dismiss();
    this.mzc = new ReentrantLock();
    this.className = getClass().getSimpleName();
    this.intent = getIntent();
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.jUg = getIntent().getStringExtra("free_wifi_url");
    this.cuH = getIntent().getStringExtra("free_wifi_ap_key");
    this.cvd = getIntent().getIntExtra("free_wifi_source", 1);
    this.cdf = getIntent().getIntExtra("free_wifi_channel_id", 0);
    this.mwG = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    this.csB = getIntent().getStringExtra("free_wifi_appid");
    this.myX = getIntent().getStringExtra("free_wifi_head_img_url");
    this.myY = getIntent().getStringExtra("free_wifi_welcome_msg");
    this.myZ = getIntent().getStringExtra("free_wifi_welcome_sub_title");
    this.mza = getIntent().getStringExtra("free_wifi_privacy_url");
    this.mwH = getIntent().getStringExtra("free_wifi_app_nickname");
    ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=%s.initView, desc=Initializing the view. ssid=%s, fullUrl=%s, apKey=%s, source=%d, channel=%d, protocolNumber=%d, appid=%s, headImgUrl=%s, welcomeMsg=%s, privacyUrl=%s", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), this.className, this.ssid, this.jUg, this.cuH, Integer.valueOf(this.cvd), Integer.valueOf(this.cdf), Integer.valueOf(this.mwG), this.csB, this.myX, this.myY, this.mza });
    this.myW = findViewById(2131824137);
    this.myQ = ((ImageView)findViewById(2131824129));
    this.myR = ((TextView)findViewById(2131824130));
    this.myS = ((TextView)findViewById(2131824131));
    this.myB = ((TextView)findViewById(2131824132));
    this.myC = ((TextView)findViewById(2131824133));
    this.myD = ((TextView)findViewById(2131824134));
    this.myT = ((Button)findViewById(2131824135));
    this.myT.setOnClickListener(new FreeWifiFrontPageUI.5(this));
    this.myU = ((Button)findViewById(2131824136));
    this.myU.setOnClickListener(new FreeWifiFrontPageUI.6(this));
    if (bo.isNullOrNil(this.ssid))
    {
      this.myS.setText(getString(2131300076));
      this.myT.setVisibility(4);
    }
    setMMTitle(getString(2131300078));
    a(FreeWifiFrontPageUI.d.mzi, null);
    AppMethodBeat.o(20978);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20977);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(20977);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(20989);
    super.onDestroy();
    com.tencent.mm.plugin.freewifi.model.j.byZ().release();
    AppMethodBeat.o(20989);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(20987);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(20987);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(20987);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(20990);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(20990);
      return;
    }
    ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 77:
    }
    while (true)
    {
      AppMethodBeat.o(20990);
      break;
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == -1))
      {
        this.myf = false;
        com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new FreeWifiFrontPageUI.11(this), new FreeWifiFrontPageUI.2(this));
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(20979);
    super.onResume();
    int i;
    if (this.myf)
    {
      boolean bool = b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 77, null, null);
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "summerper checkPermission checkLocation [%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        i = 0;
    }
    while (i == 0)
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "check permission not passed!");
      AppMethodBeat.o(20979);
      return;
      if (!b.o(this, "android.permission.ACCESS_COARSE_LOCATION"))
      {
        i = 0;
      }
      else if (!com.tencent.mm.modelgeo.d.agA())
      {
        com.tencent.mm.ui.base.h.a(this, getString(2131300421), getString(2131297061), getString(2131300878), getString(2131296868), false, new FreeWifiFrontPageUI.7(this), null);
        i = 0;
      }
      else
      {
        i = 1;
      }
    }
    switch (this.mwG)
    {
    default:
    case 4:
    case 1:
    case 31:
    case 32:
    case 33:
    }
    while (true)
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=%s.onCreate, desc=it goes into connect frontpage. apKey=%s", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), this.className, this.cuH });
      l.v(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      AppMethodBeat.o(20979);
      break;
      this.mzb = new f(this);
      continue;
      this.mzb = new com.tencent.mm.plugin.freewifi.e.g(this);
      continue;
      this.mzb = new com.tencent.mm.plugin.freewifi.e.h(this);
      this.myW.setVisibility(0);
      bzJ();
      continue;
      this.mzb = new com.tencent.mm.plugin.freewifi.e.j(this);
      this.myW.setVisibility(0);
      continue;
      this.mzb = new com.tencent.mm.plugin.freewifi.e.i(this);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI
 * JD-Core Version:    0.6.2
 */