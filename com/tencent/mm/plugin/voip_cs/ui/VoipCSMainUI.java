package com.tencent.mm.plugin.voip_cs.ui;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.v.c;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.model.an;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip_cs.b.b.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

@com.tencent.mm.ui.base.a(3)
public class VoipCSMainUI extends MMActivity
  implements com.tencent.mm.plugin.voip_cs.b.b, a.a
{
  private String appId;
  public String cEh;
  public String cQL;
  private com.tencent.mm.compatible.util.b cqx;
  private ak fbD;
  public String gEl;
  private TelephonyManager nva;
  PhoneStateListener nvb;
  private n qbK;
  private HeadsetPlugReceiver sRd;
  private BroadcastReceiver sSj;
  private HeadsetPlugReceiver.a sSk;
  public String tdN;
  private com.tencent.mm.plugin.voip_cs.b.a.a tdT;
  private com.tencent.mm.plugin.voip_cs.b.a.b teA;
  private com.tencent.mm.plugin.voip_cs.b.a.c teB;
  private boolean teC;
  public String teD;
  public String teE;
  public String teF;
  public boolean teG;
  private ap teH;
  g.a teI;
  public CharSequence tickerText;
  public CharSequence title;
  public String type;

  public VoipCSMainUI()
  {
    AppMethodBeat.i(135407);
    this.teC = false;
    this.sRd = null;
    this.tdN = "";
    this.appId = "";
    this.gEl = "";
    this.teD = "";
    this.teE = "";
    this.teF = "";
    this.cQL = "";
    this.type = "";
    this.teG = false;
    this.cEh = ah.getContext().getString(2131304395);
    this.tickerText = ah.getContext().getString(2131304395);
    this.title = ah.getContext().getString(2131304389);
    this.teH = new ap(Looper.getMainLooper(), new VoipCSMainUI.18(this), true);
    this.teI = new VoipCSMainUI.2(this);
    this.sSk = new VoipCSMainUI.3(this);
    this.sSj = new VoipCSMainUI.4(this);
    this.nvb = new VoipCSMainUI.5(this);
    this.qbK = new VoipCSMainUI.10(this);
    AppMethodBeat.o(135407);
  }

  private int bHJ()
  {
    int i = 2;
    AppMethodBeat.i(135411);
    if (com.tencent.mm.compatible.b.g.KK().KP())
      i = com.tencent.mm.compatible.b.g.KK().Lc();
    while (true)
    {
      ab.d("MicroMsg.voipcs.VoipCSMainUI", "Current StreamType:%d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(135411);
      return i;
      if (this.tdT.cKq())
        if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM == 2)
          i = 0;
        else
          i = this.teB.cIt();
    }
  }

  private boolean cMA()
  {
    boolean bool1 = false;
    AppMethodBeat.i(135420);
    if (!com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 82, "", ""))
    {
      ab.i("MicroMsg.voipcs.VoipCSMainUI", "has not audio record premission!");
      AppMethodBeat.o(135420);
    }
    while (true)
    {
      return bool1;
      boolean bool2 = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 19, "", "");
      ab.d("MicroMsg.voipcs.VoipCSMainUI", "voipcs checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool2), bo.dpG(), this });
      if (!bool2)
      {
        ab.i("MicroMsg.voipcs.VoipCSMainUI", "has not camera  premission!");
        AppMethodBeat.o(135420);
      }
      else
      {
        AppMethodBeat.o(135420);
        bool1 = true;
      }
    }
  }

  private void cMz()
  {
    AppMethodBeat.i(135409);
    if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM <= 0)
    {
      this.teA.cMp();
      this.teA.cMq();
      com.tencent.mm.plugin.voip_cs.b.c.cMe().init();
      com.tencent.mm.plugin.voip_cs.b.c.cMf().ao(this.tdN, this.appId, this.teF);
    }
    if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM < 2)
      this.tdT.cMo();
    this.teA.cMt();
    AppMethodBeat.o(135409);
  }

  public final void GV(int paramInt)
  {
    AppMethodBeat.i(135417);
    ab.d("MicroMsg.voipcs.VoipCSMainUI", "onExitVoipCS for action:" + paramInt + ",CallingStatus:" + com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM);
    if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM == 0)
    {
      finish();
      AppMethodBeat.o(135417);
    }
    while (true)
    {
      return;
      if (this.teA != null)
        this.teA.GY(paramInt);
      AppMethodBeat.o(135417);
    }
  }

  public final void bGQ()
  {
    AppMethodBeat.i(135422);
    this.teA.bGQ();
    Object localObject;
    int i;
    if ((com.tencent.mm.compatible.b.g.KK().KV()) || (com.tencent.mm.compatible.b.g.KK().KP()))
    {
      this.teB.mr(false);
      localObject = this.teB;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).kzb == null)
        break label227;
      boolean bool = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).kzb.EL();
      com.tencent.mm.plugin.voip_cs.b.c.cMg().tdl = 1;
      if (!bool)
        break label227;
      i = 1;
      label72: com.tencent.mm.plugin.voip_cs.b.c.cMg().tdE = i;
      localObject = this.teB;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).sPL != null)
        break label232;
      com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.sUn = Math.abs(1);
    }
    while (true)
    {
      this.tdT.stopRing();
      localObject = com.tencent.mm.plugin.voip_cs.b.c.cMg();
      if (((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdz != 0)
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdo = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdz);
      localObject = com.tencent.mm.plugin.voip_cs.b.c.cMg();
      ab.d("MicroMsg.VoipCSReportHelper", "markStartTalk");
      if (((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdC == 0)
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdC = ((int)(System.currentTimeMillis() / 1000L));
      localObject = com.tencent.mm.plugin.voip_cs.b.c.cMg();
      ab.d("MicroMsg.VoipCSReportHelper", "markConnect");
      if (((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdB != 0)
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdq = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.d)localObject).tdB);
      AppMethodBeat.o(135422);
      return;
      this.teB.mr(true);
      break;
      label227: i = -1;
      break label72;
      label232: ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).sPL.cIp();
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).sPL.cIp() <= 0)
        com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.sUn = Math.abs(1);
    }
  }

  public final void cMy()
  {
    AppMethodBeat.i(135423);
    ab.d("MicroMsg.voipcs.VoipCSMainUI", "onChannelConnectFailed now finish it!");
    this.teA.GY(5);
    AppMethodBeat.o(135423);
  }

  public final void gF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(135419);
    com.tencent.mm.plugin.voip_cs.b.a.b localb = this.teA;
    if ((localb.tel.equals("")) && (bo.isNullOrNil(paramString2)))
      if (localb.tdU.teG)
      {
        localb.ejp.setText(2131304376);
        if ((!localb.tek.equals("")) || (!bo.isNullOrNil(paramString1)) || ((localb.tdU.gEl != null) && (!localb.tdU.gEl.equals(""))))
          break label132;
        localb.tea.setImageResource(2130838444);
        AppMethodBeat.o(135419);
      }
    while (true)
    {
      return;
      localb.ejp.setText(2131304375);
      break;
      localb.acd(paramString2);
      break;
      label132: SharedPreferences localSharedPreferences = ah.doB();
      if ((!bo.isNullOrNil(paramString1)) && (!localb.tek.equals(paramString1)))
      {
        localb.ace(paramString1);
        localSharedPreferences.edit().putString(localb.cMr(), paramString1).commit();
      }
      if ((!bo.isNullOrNil(paramString2)) && (!localb.tel.equals(paramString2)))
      {
        localb.acd(paramString2);
        localSharedPreferences.edit().putString(localb.cMs(), paramString2).commit();
      }
      AppMethodBeat.o(135419);
    }
  }

  public final int getLayoutId()
  {
    return 2130971029;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(135408);
    ab.i("MicroMsg.voipcs.VoipCSMainUI", "onCreate voipcs....");
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.tdN = getIntent().getStringExtra("voipCSBizId");
    this.appId = getIntent().getStringExtra("voipCSAppId");
    this.cQL = bo.nullAsNil(getIntent().getStringExtra("voipCSScene"));
    this.type = bo.nullAsNil(getIntent().getStringExtra("voipCSType"));
    this.teD = getIntent().getStringExtra("voipCSAllowBackCamera");
    this.teE = getIntent().getStringExtra("voipCSShowOther");
    this.gEl = getIntent().getStringExtra("voipCSAvatarUrl");
    this.teF = getIntent().getStringExtra("voipCSContext");
    this.teG = getIntent().getBooleanExtra("launch_from_appbrand", false);
    getWindow().addFlags(6946944);
    if (Build.VERSION.SDK_INT >= 19)
      getWindow().addFlags(67108864);
    this.fbD = new ak();
    paramBundle = com.tencent.mm.plugin.voip_cs.b.c.cMg();
    ab.d("MicroMsg.VoipCSReportHelper", "reset");
    paramBundle.dataType = 0;
    paramBundle.tcO = 0;
    paramBundle.tcP = 0;
    paramBundle.tcQ = 0;
    paramBundle.videoFps = 0;
    paramBundle.tcR = 0;
    paramBundle.tcS = 0;
    paramBundle.tcT = 0;
    paramBundle.tcU = 0;
    paramBundle.tcV = 0;
    paramBundle.tcW = 0;
    paramBundle.networkType = 0;
    paramBundle.tcX = 0;
    paramBundle.tcY = com.tencent.mm.plugin.voip_cs.b.d.tcM;
    paramBundle.tcZ = 0;
    paramBundle.tda = 0L;
    paramBundle.nwv = 0L;
    paramBundle.tdb = "";
    paramBundle.sTX = 0;
    paramBundle.tde = 0;
    paramBundle.tdf = 0;
    paramBundle.tdg = 0;
    paramBundle.sUr = 0;
    paramBundle.sUq = 0;
    paramBundle.tdh = 0;
    paramBundle.tdi = 0;
    paramBundle.tdj = 0;
    paramBundle.tdk = 0;
    paramBundle.tdl = 0;
    paramBundle.tdm = 0;
    paramBundle.tdn = 0L;
    paramBundle.tdo = 0;
    paramBundle.tdp = 0L;
    paramBundle.tdq = 0L;
    paramBundle.tdr = 0L;
    paramBundle.nxM = 0L;
    paramBundle.tds = 0;
    paramBundle.tdt = 0;
    paramBundle.channelStrategy = 1;
    paramBundle.sVG = 0;
    paramBundle.sUs = 0;
    paramBundle.tdu = 0;
    paramBundle.tdv = 0;
    paramBundle.nxW = "";
    paramBundle.nxV = "";
    paramBundle.tdz = 0;
    paramBundle.tdA = 0;
    paramBundle.tdB = 0;
    paramBundle.tdC = 0;
    paramBundle.tdD = 0;
    this.nva = ((TelephonyManager)ah.getContext().getSystemService("phone"));
    com.tencent.mm.plugin.voip_cs.b.c.cMf().tdN = this.tdN;
    this.teA = new com.tencent.mm.plugin.voip_cs.b.a.b(this);
    this.teB = new com.tencent.mm.plugin.voip_cs.b.a.c();
    this.cqx = new com.tencent.mm.compatible.util.b(ah.getContext());
    this.tdT = com.tencent.mm.plugin.voip_cs.b.a.a.cMm();
    com.tencent.mm.plugin.voip_cs.b.c.cMe().tey = this;
    com.tencent.mm.plugin.voip_cs.b.c.cMf().tdF = this;
    if ((com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM == 0) || (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM == 3))
      com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM = 0;
    com.tencent.mm.booter.a.Ib().Id();
    this.cqx.requestFocus();
    com.tencent.mm.compatible.b.g.KK().KM();
    com.tencent.mm.compatible.b.g.KK().a(this.teI);
    this.sRd = new HeadsetPlugReceiver();
    this.sRd.a(ah.getContext(), this.sSk);
    paramBundle = new IntentFilter();
    paramBundle.addAction("android.intent.action.SCREEN_ON");
    paramBundle.addAction("android.intent.action.SCREEN_OFF");
    paramBundle.addAction("android.intent.action.USER_PRESENT");
    ah.getContext().registerReceiver(this.sSj, paramBundle);
    com.tencent.mm.kernel.g.RO().a(this.qbK);
    int i;
    if (this.teG)
      if (this.cQL.equals("1"))
        if (this.type.equals("video"))
        {
          this.title = ah.getContext().getString(2131304387);
          this.tickerText = ah.getContext().getString(2131304391);
          this.cEh = ah.getContext().getString(2131304391);
          i = this.nva.getCallState();
          if ((i != 2) && (i != 1))
            break label1172;
          ab.i("MicroMsg.voipcs.VoipCSMainUI", "check is phone use now ! TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
          h.a(this, 2131304401, 2131297061, new VoipCSMainUI.1(this));
          i = 1;
          label813: if (i == 0)
            break label1177;
          ab.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in telephone talking!");
          AppMethodBeat.o(135408);
        }
    while (true)
    {
      return;
      this.title = ah.getContext().getString(2131304388);
      this.tickerText = ah.getContext().getString(2131304392);
      this.cEh = ah.getContext().getString(2131304392);
      break;
      if (this.type.equals("video"))
      {
        this.title = ah.getContext().getString(2131304389);
        this.tickerText = ah.getContext().getString(2131304393);
        this.cEh = ah.getContext().getString(2131304393);
        break;
      }
      this.title = ah.getContext().getString(2131304388);
      this.tickerText = ah.getContext().getString(2131304392);
      this.cEh = ah.getContext().getString(2131304392);
      break;
      if (this.cQL.equals("1"))
      {
        if (this.type.equals("video"))
        {
          this.title = ah.getContext().getString(2131304387);
          this.tickerText = ah.getContext().getString(2131304391);
          this.cEh = ah.getContext().getString(2131304391);
          break;
        }
        this.title = ah.getContext().getString(2131304388);
        this.tickerText = ah.getContext().getString(2131304395);
        this.cEh = ah.getContext().getString(2131304395);
        break;
      }
      if (this.type.equals("video"))
      {
        this.title = ah.getContext().getString(2131304389);
        this.tickerText = ah.getContext().getString(2131304395);
        this.cEh = ah.getContext().getString(2131304395);
        break;
      }
      this.title = ah.getContext().getString(2131304388);
      this.tickerText = ah.getContext().getString(2131304394);
      this.cEh = ah.getContext().getString(2131304394);
      break;
      label1172: i = 0;
      break label813;
      label1177: this.nva.listen(this.nvb, 32);
      if (!at.isNetworkConnected(this))
      {
        ab.e("MicroMsg.voipcs.VoipCSMainUI", "isNetworkAvailable false, not connected!cannot start voip cs!");
        h.a(this, 2131304397, 2131304449, new VoipCSMainUI.15(this));
        i = 0;
      }
      while (true)
      {
        if (i != 0)
          break label1305;
        ab.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in  voip talking!");
        AppMethodBeat.o(135408);
        break;
        if ((at.isWifi(this)) || (com.tencent.mm.plugin.voip.model.q.cJV()))
        {
          i = 1;
        }
        else
        {
          ab.i("MicroMsg.voipcs.VoipCSMainUI", "check is not wifi network!");
          h.a(this, 2131304398, 2131304449, new VoipCSMainUI.16(this), new VoipCSMainUI.17(this));
          i = 0;
        }
      }
      label1305: if (com.tencent.mm.plugin.voip.a.d.cLx())
      {
        ab.i("MicroMsg.voipcs.VoipCSMainUI", "check  is voip talking now!");
        h.a(this, 2131300618, 2131297061, new VoipCSMainUI.11(this));
        i = 1;
      }
      while (true)
      {
        if (i == 0)
          break label1480;
        ab.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in other voip talking!");
        AppMethodBeat.o(135408);
        break;
        if (com.tencent.mm.plugin.voip.a.d.cLw())
        {
          ab.i("MicroMsg.voipcs.VoipCSMainUI", "check is ipCall talking now!");
          h.a(this, 2131300619, 2131297061, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(135400);
              paramAnonymousDialogInterface.dismiss();
              VoipCSMainUI.this.GV(0);
              AppMethodBeat.o(135400);
            }
          });
          i = 1;
        }
        else if (com.tencent.mm.r.a.Oo())
        {
          ab.i("MicroMsg.voipcs.VoipCSMainUI", "check is multiTalking  now!");
          h.a(this, 2131300613, 2131297061, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(135401);
              paramAnonymousDialogInterface.dismiss();
              VoipCSMainUI.this.GV(0);
              AppMethodBeat.o(135401);
            }
          });
          i = 1;
        }
        else if (com.tencent.mm.bg.e.akK())
        {
          ab.i("MicroMsg.voipcs.VoipCSMainUI", "check is in talktRoom  now!");
          h.a(this, 2131300614, 2131297061, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(135402);
              paramAnonymousDialogInterface.dismiss();
              VoipCSMainUI.this.GV(0);
              AppMethodBeat.o(135402);
            }
          });
          i = 1;
        }
        else
        {
          i = 0;
        }
      }
      label1480: if (cMA())
        cMz();
      AppMethodBeat.o(135408);
    }
  }

  public void onDestroy()
  {
    int i = 2;
    AppMethodBeat.i(135416);
    ab.i("MicroMsg.voipcs.VoipCSMainUI", "onDestroy voipcs....");
    if (this.cqx != null)
      this.cqx.Mm();
    Object localObject1 = new sh();
    Object localObject2;
    if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdO == -1)
    {
      ((sh)localObject1).cOB.status = 3;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = this.teB;
      localObject2 = com.tencent.mm.plugin.voip_cs.b.c.cMg();
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).sPL == null) || (com.tencent.mm.plugin.voip_cs.b.c.cMg().tdl != 1))
        break label1127;
    }
    label162: label1074: label1084: label1115: label1121: label1127: for (int j = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).sPL.cIt(); ; j = 0)
    {
      float f = com.tencent.mm.compatible.b.g.KK().getStreamMaxVolume(j);
      ((com.tencent.mm.plugin.voip_cs.b.d)localObject2).tdv = ((int)(com.tencent.mm.compatible.b.g.KK().getStreamVolume(j) / f * 100.0F));
      localObject2 = com.tencent.mm.plugin.voip_cs.b.c.cMg();
      label243: label372: com.tencent.mm.plugin.voip_cs.b.a locala;
      byte[] arrayOfByte;
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).kzb != null) && (com.tencent.mm.plugin.voip_cs.b.c.cMg().tdl == 1))
      {
        j = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).kzb.EO();
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject2).sUs = j;
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).kzb != null)
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).kzb.EB();
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).sPL != null)
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).sPL.cIr();
        this.tdT.stopRing();
        if (this.teA != null)
        {
          localObject1 = this.teA;
          if (com.tencent.mm.plugin.voip_cs.b.c.cMg().dataType == 0)
          {
            if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM >= 2)
              break label1074;
            com.tencent.mm.plugin.voip_cs.b.c.cMg().dataType = 1;
          }
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).sWU.cLI();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).sWV.cLI();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).cMu();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).cMx();
          localObject2 = com.tencent.mm.plugin.voip_cs.b.c.cMf();
          ab.i("MicroMsg.voipcs.VoipCSService", "now stop service");
          com.tencent.mm.kernel.g.Rg().b(823, (f)localObject2);
          com.tencent.mm.kernel.g.Rg().b(106, (f)localObject2);
          com.tencent.mm.kernel.g.Rg().b(818, (f)localObject2);
          com.tencent.mm.kernel.g.Rg().b(795, (f)localObject2);
          com.tencent.mm.kernel.g.Rg().b(285, (f)localObject2);
          com.tencent.mm.kernel.g.Rg().b(312, (f)localObject2);
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdM = 3;
          if (((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdO != 823)
          {
            com.tencent.mm.kernel.g.Rg().a(880, (f)localObject2);
            if (((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdH != 0)
              break label1084;
            j = 1;
            ab.i("MicroMsg.voipcs.VoipCSService", "start netscene hangup for username:" + ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdN + ",inviteId：" + com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.nwx + ",csroomId:" + com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.sTZ + ",roomkey:" + com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.nwv + ",reason:" + j);
            localObject1 = new com.tencent.mm.plugin.voip_cs.b.c.a(com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.nwx, com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.sTZ, com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.nwv, ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdN, j);
            com.tencent.mm.kernel.g.Rg().a((m)localObject1, 0);
          }
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdQ.stopTimer();
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdR.stopTimer();
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdG = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdc = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdH = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdI = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdJ = null;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).nwE = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdK = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdM = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdN = "";
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdL = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdO = 0;
          ((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdP = 999;
          localObject1 = com.tencent.mm.plugin.voip_cs.b.c.cMe();
          ab.i("MicroMsg.VoipCSEngine", "now stop engine");
          ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).tew.mx(true);
          localObject2 = com.tencent.mm.plugin.voip_cs.b.c.cMg();
          if ((bo.isNullOrNil(((com.tencent.mm.plugin.voip_cs.b.d)localObject2).nxW)) && (bo.isNullOrNil(((com.tencent.mm.plugin.voip_cs.b.d)localObject2).nxV)))
          {
            locala = com.tencent.mm.plugin.voip_cs.b.c.cMe().tew;
            if (((com.tencent.mm.plugin.voip_cs.b.d)localObject2).tdj != 1)
              break label1115;
            j = 1;
            arrayOfByte = locala.tcD;
            i = locala.tcD.length;
            if (j == 0)
              break label1121;
          }
        }
      }
      for (j = 1; ; j = 0)
      {
        locala.getVoipcsChannelInfo(arrayOfByte, i, j);
        ab.d("MicroMsg.CSV2protocal", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(locala.field_voipcsChannelInfoLength) });
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject2).nxW = new String(locala.tcD, 0, locala.field_voipcsChannelInfoLength);
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject2).nxV = com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.cMb();
        ab.d("MicroMsg.VoipCSReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.d)localObject2).nxW });
        ab.d("MicroMsg.VoipCSReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.d)localObject2).nxV });
        localObject2 = com.tencent.mm.plugin.voip_cs.b.c.cMf();
        com.tencent.mm.kernel.g.Rg().a(312, (f)localObject2);
        localObject2 = new com.tencent.mm.plugin.voip_cs.b.c.e(com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.sTZ, com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.nwv);
        com.tencent.mm.kernel.g.Rg().a((m)localObject2, 0);
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).tew.reset();
        com.tencent.mm.plugin.voip.model.p.cJR().cJT();
        com.tencent.mm.plugin.voip.model.p.cJR().a(null);
        this.teA = null;
        this.teB = null;
        com.tencent.mm.compatible.b.g.KK().setMode(0);
        ah.getContext().unregisterReceiver(this.sSj);
        com.tencent.mm.compatible.b.g.KK().b(this.teI);
        com.tencent.mm.compatible.b.g.KK().KN();
        if (this.sRd != null)
          this.sRd.fa(ah.getContext());
        com.tencent.mm.kernel.g.RO().b(this.qbK);
        if (this.teH != null)
          this.teH.stopTimer();
        ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(44);
        if ((this.nva != null) && (this.nvb != null))
        {
          this.nva.listen(this.nvb, 0);
          this.nvb = null;
        }
        super.onDestroy();
        AppMethodBeat.o(135416);
        return;
        if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdO == 823)
        {
          ((sh)localObject1).cOB.status = 4;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM <= 1)
        {
          ((sh)localObject1).cOB.status = 1;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM < 2)
          break;
        ((sh)localObject1).cOB.status = 2;
        break;
        j = 0;
        break label162;
        com.tencent.mm.plugin.voip_cs.b.c.cMg().dataType = 3;
        break label243;
        j = i;
        if (((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdH == 2)
          break label372;
        if (((com.tencent.mm.plugin.voip_cs.b.e)localObject2).tdH == 3)
        {
          j = 3;
          break label372;
        }
        j = 4;
        break label372;
        j = 0;
        break label655;
      }
    }
  }

  public final void onError(int paramInt)
  {
    AppMethodBeat.i(135418);
    if (this.teA != null)
    {
      ab.d("MicroMsg.voipcs.VoipCSMainUI", "onError for errCode:".concat(String.valueOf(paramInt)));
      this.teA.GY(paramInt);
    }
    AppMethodBeat.o(135418);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(135410);
    if (paramKeyEvent.getKeyCode() == 4)
      AppMethodBeat.o(135410);
    while (true)
    {
      return bool;
      if (paramInt == 25)
      {
        paramInt = bHJ();
        com.tencent.mm.compatible.b.g.KK().iK(paramInt);
        AppMethodBeat.o(135410);
      }
      else if (paramInt == 24)
      {
        paramInt = bHJ();
        com.tencent.mm.compatible.b.g.KK().iJ(paramInt);
        AppMethodBeat.o(135410);
      }
      else
      {
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(135410);
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(135413);
    super.onPause();
    if (!this.tdT.cKq())
      this.tdT.stopRing();
    if ((com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM == 1) || (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM == 2))
    {
      Object localObject = new Intent(ah.getContext(), VoipCSMainUI.class);
      ((Intent)localObject).putExtra("voipCSBizId", this.tdN);
      ((Intent)localObject).putExtra("voipCSAppId", this.appId);
      ((Intent)localObject).putExtra("voipCSScene", this.cQL);
      ((Intent)localObject).putExtra("voipCSType", this.type);
      ((Intent)localObject).putExtra("voipCSAllowBackCamera", this.teD);
      ((Intent)localObject).putExtra("voipCSShowOther", this.teE);
      ((Intent)localObject).putExtra("voipCSAvatarUrl", this.gEl);
      ((Intent)localObject).putExtra("voipCSContext", this.teF);
      ((Intent)localObject).putExtra("launch_from_appbrand", this.teG);
      PendingIntent localPendingIntent = PendingIntent.getActivity(ah.getContext(), 44, (Intent)localObject, 134217728);
      localObject = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(this.tickerText).j(System.currentTimeMillis()).d(this.title).e(this.cEh);
      ((v.c)localObject).EI = localPendingIntent;
      ((v.c)localObject).k(2, true);
      localObject = ((v.c)localObject).build();
      ((Notification)localObject).icon = com.tencent.mm.bo.a.bWV();
      ((Notification)localObject).flags |= 32;
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().a(44, (Notification)localObject, false);
      if ((this.teH != null) && (this.teH.doT()))
        this.teH.ae(5000L, 5000L);
    }
    while (true)
    {
      this.teA.cMu();
      this.teA.cAY = true;
      AppMethodBeat.o(135413);
      return;
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(44);
      if (this.teH != null)
        this.teH.stopTimer();
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(135421);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      ab.e("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs]onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(135421);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(135421);
        break;
      case 82:
        if (paramArrayOfInt[0] == 0)
        {
          ab.d("MicroMsg.voipcs.VoipCSMainUI", "granted record audio!");
          if (com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 19, "", ""))
            cMz();
          AppMethodBeat.o(135421);
        }
        else
        {
          h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131296868), false, new VoipCSMainUI.6(this), new VoipCSMainUI.7(this));
          AppMethodBeat.o(135421);
        }
        break;
      case 19:
        if (paramArrayOfInt[0] != 0)
          break label245;
        cMz();
        AppMethodBeat.o(135421);
      }
    }
    label245: if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
    for (paramInt = 2131301920; ; paramInt = 2131301928)
    {
      h.a(this, getString(paramInt), getString(2131301936), getString(2131300878), getString(2131296868), false, new VoipCSMainUI.8(this), new VoipCSMainUI.9(this));
      break;
    }
  }

  protected void onRestart()
  {
    AppMethodBeat.i(135414);
    ab.i("MicroMsg.voipcs.VoipCSMainUI", "onRestart voipcs....");
    super.onRestart();
    if ((cMA()) && (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM <= 1))
      cMz();
    if (this.teA != null)
      this.teA.cAY = false;
    AppMethodBeat.o(135414);
  }

  public void onResume()
  {
    AppMethodBeat.i(135412);
    ab.i("MicroMsg.voipcs.VoipCSMainUI", "onResume voipcs....");
    super.onResume();
    if (this.teA != null)
    {
      this.teA.cAY = false;
      if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM > 1)
      {
        cMz();
        if ((this.teE != null) && (this.teE.equals("1")))
          this.teA.cMw();
      }
    }
    if (this.teH != null)
      this.teH.stopTimer();
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(44);
    AppMethodBeat.o(135412);
  }

  public void onStop()
  {
    AppMethodBeat.i(135415);
    super.onStop();
    AppMethodBeat.o(135415);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI
 * JD-Core Version:    0.6.2
 */