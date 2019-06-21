package com.tencent.mm.plugin.voip.model;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.g.a.uh;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.vj;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.ui.VoipScoreDialog;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.plugin.voip.video.k.a;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.MMTextureView;
import java.util.Map;
import java.util.Timer;

public final class VoipMgr
  implements g.a, p.a, u, com.tencent.mm.plugin.voip.ui.c, com.tencent.mm.plugin.voip.video.g, k.a, SensorController.a
{
  static int idk = 0;
  static int[] sSf = new int[2];
  com.tencent.mm.compatible.util.b cqx;
  String edV;
  ak iGP;
  private boolean mIsMute;
  private int mUIType;
  SensorController mfW;
  private long mui;
  TelephonyManager nva;
  PhoneStateListener nvb;
  com.tencent.mm.sdk.b.c nvc;
  private long nxl;
  private boolean oue;
  long sQP;
  long sQQ;
  private com.tencent.mm.sdk.platformtools.ap sRA;
  private al sRB;
  private boolean sRC;
  private boolean sRD;
  private int sRE;
  private boolean sRF;
  boolean sRG;
  private com.tencent.mm.plugin.voip.widget.b sRH;
  private boolean sRI;
  private boolean sRJ;
  public String sRK;
  boolean sRL;
  public com.tencent.mm.plugin.voip.video.e sRM;
  public int sRN;
  public int sRO;
  private long sRP;
  private boolean sRQ;
  private long sRR;
  private long sRS;
  int sRT;
  boolean sRU;
  boolean sRV;
  private int sRW;
  private byte[] sRX;
  private boolean sRY;
  int sRZ;
  com.tencent.mm.plugin.voip.a.c sRc;
  HeadsetPlugReceiver sRd;
  volatile com.tencent.mm.plugin.voip.ui.b sRe;
  private com.tencent.mm.plugin.voip.video.a sRf;
  private CaptureView sRg;
  private VoipMgr.a sRh;
  private boolean sRi;
  private boolean sRj;
  private Object sRk;
  ad sRl;
  boolean sRm;
  boolean sRn;
  boolean sRo;
  private int sRp;
  private boolean sRq;
  int sRr;
  private long sRs;
  private boolean sRt;
  boolean sRu;
  private boolean sRv;
  private boolean sRw;
  private int sRx;
  private int sRy;
  com.tencent.mm.plugin.voip.video.k sRz;
  boolean sSa;
  VoipMgr.NetChangedBroadcastReceiver sSb;
  PhoneStateListener sSc;
  al sSd;
  ak sSe;
  TelephonyManager sSg;
  private long sSh;
  private boolean sSi;
  BroadcastReceiver sSj;
  HeadsetPlugReceiver.a sSk;
  int sSl;
  com.tencent.mm.sdk.b.c sSm;

  public VoipMgr()
  {
    AppMethodBeat.i(4485);
    this.sRh = null;
    this.sRi = false;
    this.sRj = false;
    this.sRk = new Object();
    this.sRo = false;
    this.sRp = 4096;
    this.sRq = false;
    this.sRr = 1;
    this.mIsMute = false;
    this.sRs = -1L;
    this.sRt = false;
    this.sRu = false;
    this.sRv = false;
    this.oue = false;
    this.sRw = false;
    this.sRx = 0;
    this.sRy = 0;
    this.sRz = new com.tencent.mm.plugin.voip.video.k();
    this.sRA = null;
    this.sRC = false;
    this.sRD = false;
    this.sRE = 0;
    this.sRF = false;
    this.sRG = false;
    this.sRI = false;
    this.sRJ = false;
    this.sRK = null;
    this.sRL = false;
    this.sRM = null;
    this.sRN = -1;
    this.sRO = 0;
    this.sRP = -1L;
    this.sRQ = false;
    this.sRR = 0L;
    this.sRS = -1L;
    this.sQP = 0L;
    this.sQQ = 0L;
    this.sRT = 0;
    this.sRU = false;
    this.sRV = false;
    this.sRW = 0;
    this.sRX = null;
    this.sRY = true;
    this.sRZ = 0;
    this.sSa = false;
    this.sSd = new al("getSignalStrength");
    this.sSe = new ak(this.sSd.oAl.getLooper());
    this.sSg = null;
    this.mui = 0L;
    this.sSh = 0L;
    this.sSi = false;
    this.sSj = new VoipMgr.1(this);
    this.nvc = new com.tencent.mm.sdk.b.c()
    {
    };
    this.sSk = new VoipMgr.15(this);
    this.sSl = 0;
    this.nxl = 0L;
    this.nvb = new VoipMgr.4(this);
    this.sSm = new VoipMgr.13(this);
    AppMethodBeat.o(4485);
  }

  private void Go(int paramInt)
  {
    AppMethodBeat.i(4489);
    this.sRr = paramInt;
    if (this.sRe != null)
      this.sRe.GC(this.sRr);
    AppMethodBeat.o(4489);
  }

  private void Gq(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(4509);
    ab.i("MicroMsg.Voip.VoipMgr", "hangupTalkingOrCancelInvite");
    if (true == cJJ())
      this.sRp = paramInt;
    Object localObject = ah.getContext();
    String str2;
    if (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState))
    {
      localObject = ((Context)localObject).getString(2131304361, new Object[] { fQ(bo.fp(this.sRs)) });
      String str1 = this.sRl.field_username;
      if (!this.sRn)
        break label256;
      str2 = bi.xZc;
      label93: if (this.sRm)
        i = 1;
      q.a(str1, str2, i, 6, (String)localObject);
      if ((!this.sRm) || (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState)))
        break label264;
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      if ((this.sRm) && (!com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState)))
      {
        ab.i("MicroMsg.Voip.VoipMgr", "hangupVoipButton OnClick call cancelCall");
        com.tencent.mm.plugin.voip.b.cIj().sSP.cKj();
      }
      ab.i("MicroMsg.Voip.VoipMgr", "hangupVoipButton OnClick call hangUp");
      com.tencent.mm.plugin.voip.b.cIj().sSP.cKm();
      if (4096 != this.sRp)
        break label317;
      oE(paramInt);
      cJz();
      AppMethodBeat.o(4509);
    }
    while (true)
    {
      return;
      if (this.sRm)
      {
        localObject = ((Context)localObject).getString(2131304356);
        break;
      }
      localObject = ((Context)localObject).getString(2131304355);
      break;
      label256: str2 = bi.xZb;
      break label93;
      label264: com.tencent.mm.sdk.g.d.post(new VoipMgr.18(this), "VoipMgr_play_end_sound");
      this.sRi = true;
      this.sRj = true;
      com.tencent.mm.plugin.voip.b.cIj().sSP.cKm();
      if (4096 == this.sRp)
      {
        oE(paramInt);
        cJz();
      }
      label317: AppMethodBeat.o(4509);
    }
  }

  private boolean Gr(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(4515);
    if (4111 == paramInt)
      AppMethodBeat.o(4515);
    while (true)
    {
      return bool;
      if ((4101 == paramInt) && ((com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState)) || (this.sRm)))
      {
        AppMethodBeat.o(4515);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(4515);
      }
    }
  }

  private static void Gs(int paramInt)
  {
    AppMethodBeat.i(4516);
    vj localvj = new vj();
    localvj.cSr.cuy = paramInt;
    com.tencent.mm.sdk.b.a.xxA.m(localvj);
    AppMethodBeat.o(4516);
  }

  private void P(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(4491);
    ab.b("MicroMsg.Voip.VoipMgr", "enableSpeaker: %s, ignoreBluetooth: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    this.sRt = paramBoolean1;
    this.sRu = paramBoolean1;
    ab.d("MicroMsg.Voip.VoipMgr", "MMCore.getAudioManager() " + com.tencent.mm.compatible.b.g.KK().KT());
    boolean bool = paramBoolean1;
    if (!paramBoolean2)
    {
      bool = paramBoolean1;
      if (com.tencent.mm.compatible.b.g.KK().KP())
        bool = false;
    }
    if (com.tencent.mm.compatible.e.q.etd.epG)
    {
      com.tencent.mm.compatible.e.q.etd.dump();
      if (com.tencent.mm.compatible.e.q.etd.epH > 0)
        com.tencent.mm.plugin.voip.b.cIj().mj(bool);
    }
    if ((com.tencent.mm.compatible.e.q.etd.eqj >= 0) || (com.tencent.mm.compatible.e.q.etd.eqk >= 0))
      com.tencent.mm.plugin.voip.b.cIj().mj(bool);
    int i = com.tencent.mm.plugin.voip.b.cIj().sSP.cIt();
    com.tencent.mm.compatible.b.g.KK().b(bool, i, paramBoolean2);
    com.tencent.mm.plugin.voip.b.cIj().mp(bool);
    this.sRv = bool;
    AppMethodBeat.o(4491);
  }

  private void cJF()
  {
    AppMethodBeat.i(4533);
    if ((com.tencent.mm.compatible.util.d.iW(28)) && (this.sRn) && (this.sRf != null) && (!this.sRf.bPu()) && (this.sRe != null))
    {
      ab.i("MicroMsg.Voip.VoipMgr", "video call accept, not previewing, api level: %s", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      this.sRf.cLD();
      this.sRe.cKT();
      int i = 320;
      int j = 240;
      int k = j;
      int m = i;
      if (this.sRf == null)
      {
        k = j;
        m = i;
        if (com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState))
        {
          this.sRg = new CaptureView(ah.getContext());
          k = j;
          m = i;
          if (v2protocal.sTV)
          {
            ab.i("MicroMsg.Voip.VoipMgr", "steve: 640 capture!");
            m = 640;
            k = 480;
          }
        }
      }
      this.sRf = new com.tencent.mm.plugin.voip.video.a(m, k);
      this.sRf.a(this, true);
      this.sRf.a(this.sRg);
      this.sRf.cLC();
    }
    AppMethodBeat.o(4533);
  }

  private void cJH()
  {
    AppMethodBeat.i(4537);
    synchronized (this.sRk)
    {
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      cJI();
      com.tencent.mm.compatible.b.g.KK().setMode(0);
      if (this.cqx != null)
        this.cqx.Mm();
      AppMethodBeat.o(4537);
      return;
    }
  }

  private void cJI()
  {
    AppMethodBeat.i(4538);
    ab.b("MicroMsg.Voip.VoipMgr", "uninitCaptureRender", new Object[0]);
    if (this.sRf != null)
      cJO();
    try
    {
      this.sRf.cLD();
      this.sRf = null;
      AppMethodBeat.o(4538);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.d("MicroMsg.Voip.VoipMgr", "stop capture error:" + localException.toString());
    }
  }

  private boolean cJJ()
  {
    boolean bool = false;
    AppMethodBeat.i(4541);
    if (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState))
    {
      SharedPreferences localSharedPreferences = getContext().getSharedPreferences("voip_plugin_prefs", 0);
      if (!localSharedPreferences.getBoolean("voip_shortcut_has_added", false))
      {
        bool = e(localSharedPreferences);
        AppMethodBeat.o(4541);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(4541);
    }
  }

  private void cJK()
  {
    AppMethodBeat.i(4545);
    Context localContext = getContext();
    View localView = View.inflate(localContext, 2130970090, null);
    CheckBox localCheckBox = (CheckBox)localView.findViewById(2131825970);
    localCheckBox.setChecked(false);
    TextView localTextView = (TextView)localView.findViewById(2131825969);
    if (1 == bo.getInt(com.tencent.mm.m.g.Nu().getValue("VOIPCallType"), 0))
      localTextView.setText(2131304344);
    while (true)
    {
      com.tencent.mm.ui.base.h.a(localContext, false, localContext.getString(2131297061), localView, localContext.getString(2131297088), localContext.getString(2131296990), new VoipMgr.5(this), new VoipMgr.6(this, localCheckBox));
      AppMethodBeat.o(4545);
      return;
      localTextView.setText(2131304345);
    }
  }

  private void cJO()
  {
    AppMethodBeat.i(4551);
    if (this.sRz != null)
      this.sRz.a(this);
    if (this.sRA != null)
    {
      ab.d("MicroMsg.Voip.VoipMgr", "stop face detect timer");
      this.sRA.stopTimer();
    }
    if ((this.sRB != null) && (this.sRB.oAl.getLooper() != null))
    {
      ab.d("MicroMsg.Voip.VoipMgr", "quit face detect thread");
      this.sRB.oAl.getLooper().quit();
    }
    AppMethodBeat.o(4551);
  }

  private void cJj()
  {
    AppMethodBeat.i(4488);
    boolean bool1 = com.tencent.mm.compatible.b.g.KK().KV();
    boolean bool2 = this.sRL;
    boolean bool3 = com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState);
    boolean bool4 = com.tencent.mm.plugin.voip.b.cIj().sSP.cKq();
    boolean bool5 = this.sRu;
    boolean bool6;
    if (2 == this.mUIType)
    {
      bool6 = true;
      ab.i("MicroMsg.Voip.VoipMgr", "setSpeakerAfterBluetoothDisconnected, isCheckBluetoothEnd: %s, isVideoState: %s, isRingStop: %s, mBTRecoverSpeakerOn: %s, isMini: %s, isHeadsetPlugged: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6), Boolean.valueOf(bool1) });
      if (!this.sRL)
      {
        if (!com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState))
          break label222;
        if (com.tencent.mm.plugin.voip.b.cIj().sSP.cKq())
          break label191;
        mr(false);
        this.sRr = 2;
      }
    }
    while (true)
    {
      Go(this.sRr);
      this.sRL = true;
      com.tencent.mm.plugin.voip.b.cIj().jj(false);
      AppMethodBeat.o(4488);
      return;
      bool6 = false;
      break;
      label191: if (!bool1)
      {
        P(true, true);
        this.sRr = 1;
      }
      else
      {
        mr(false);
        this.sRr = 2;
        continue;
        label222: if (com.tencent.mm.plugin.voip.b.cIj().sSP.cKq())
          break label247;
        mr(false);
        this.sRr = 2;
      }
    }
    label247: if (((this.sRu) || (2 == this.mUIType)) && (!bool1))
    {
      P(true, true);
      this.sRr = 1;
    }
    while (true)
    {
      this.sRu = false;
      break;
      if (bool1)
        this.sRr = 3;
      else
        this.sRr = 2;
    }
  }

  private boolean cJx()
  {
    boolean bool = false;
    AppMethodBeat.i(4512);
    if (!this.sRc.GQ(4101))
    {
      AppMethodBeat.o(4512);
      return bool;
    }
    oE(4101);
    Object localObject1;
    int i;
    int j;
    label115: com.tencent.mm.plugin.report.service.h localh;
    Object localObject2;
    if ((261 == this.sRc.mState) || (7 == this.sRc.mState))
    {
      com.tencent.mm.plugin.voip.b.cIj().Gh(1);
      localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
      long l = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv;
      i = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu;
      if (this.sRm)
      {
        j = 1;
        ((com.tencent.mm.plugin.report.service.h)localObject1).e(11046, new Object[] { Integer.valueOf(2), Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j) });
        localh = com.tencent.mm.plugin.report.service.h.pYm;
        i = 11080;
        localObject2 = new Object[3];
        localObject2[0] = Integer.valueOf(2);
        localObject2[1] = Integer.valueOf(0);
        j = 2;
        localObject1 = localObject2;
      }
    }
    while (true)
    {
      int k = 0;
      while (true)
      {
        localObject1[j] = Integer.valueOf(k);
        localh.e(i, (Object[])localObject2);
        do
        {
          com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIP();
          com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIQ();
          this.sRn = false;
          AppMethodBeat.o(4512);
          bool = true;
          break;
          j = 0;
          break label115;
        }
        while ((1 != this.sRc.mState) && (3 != this.sRc.mState));
        com.tencent.mm.plugin.voip.b.cIj().Gh(1);
        localh = com.tencent.mm.plugin.report.service.h.pYm;
        i = 11046;
        localObject1 = new Object[5];
        localObject1[0] = Integer.valueOf(1);
        localObject1[1] = Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv);
        localObject1[2] = Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu);
        localObject1[3] = Integer.valueOf(0);
        j = 4;
        if (!this.sRm)
          break label399;
        k = 1;
        localObject2 = localObject1;
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
      label399: localObject2 = localObject1;
      Object localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }

  private void cJz()
  {
    AppMethodBeat.i(4520);
    ab.d("MicroMsg.Voip.VoipMgr", "delayFinish");
    this.sRK = null;
    if (this.iGP != null)
      this.iGP.postDelayed(new VoipMgr.20(this), 2000L);
    AppMethodBeat.o(4520);
  }

  private boolean e(SharedPreferences paramSharedPreferences)
  {
    boolean bool1 = true;
    AppMethodBeat.i(4542);
    String str = com.tencent.mm.m.g.Nu().getValue("VOIPShortcutAutoadd");
    ab.i("MicroMsg.Voip.VoipMgr", "voip shortcut autoAdd is %s", new Object[] { str });
    if ((str != null) && (str.equals("0")) && (bo.fp(this.sRs) > 30L))
    {
      int i = paramSharedPreferences.getInt("voip_shortcut_prompt_times", 0);
      boolean bool2 = paramSharedPreferences.getBoolean("voip_shortcut_never_show_anymore", false);
      if ((i >= 3) || (bool2))
        break label178;
      cJK();
      paramSharedPreferences.edit().putInt("voip_shortcut_prompt_times", i + 1).commit();
      AppMethodBeat.o(4542);
    }
    while (true)
    {
      return bool1;
      if ((str != null) && (str.equals("1")) && (bo.fp(this.sRs) > 15L))
      {
        f(paramSharedPreferences);
        AppMethodBeat.o(4542);
        bool1 = false;
      }
      else
      {
        label178: AppMethodBeat.o(4542);
        bool1 = false;
      }
    }
  }

  private void f(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(4543);
    Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    localIntent1.putExtra("duplicate", false);
    Intent localIntent2 = new Intent("com.tencent.mm.action.BIZSHORTCUT");
    localIntent2.addFlags(67108864);
    if (1 == bo.getInt(com.tencent.mm.m.g.Nu().getValue("VOIPCallType"), 0))
    {
      localIntent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", getContext().getString(2131296932));
      localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(getContext(), 2130840609));
      localIntent1.putExtra("shortcut_icon_resource_id", 2130840609);
    }
    while (true)
    {
      localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
      com.tencent.mm.plugin.base.model.b.r(getContext(), localIntent1);
      paramSharedPreferences.edit().putBoolean("voip_shortcut_has_added", true).commit();
      AppMethodBeat.o(4543);
      return;
      localIntent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", getContext().getString(2131296934));
      localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(getContext(), 2130840645));
      localIntent1.putExtra("shortcut_icon_resource_id", 2130840645);
    }
  }

  private static String fQ(long paramLong)
  {
    AppMethodBeat.i(4535);
    String str = String.format("%02d:%02d", new Object[] { Long.valueOf(paramLong / 60L), Long.valueOf(paramLong % 60L) });
    AppMethodBeat.o(4535);
    return str;
  }

  private void mr(boolean paramBoolean)
  {
    AppMethodBeat.i(4490);
    P(paramBoolean, this.sRU);
    AppMethodBeat.o(4490);
  }

  private void mt(boolean paramBoolean)
  {
    AppMethodBeat.i(4505);
    if (this.sRn)
    {
      ab.i("MicroMsg.Voip.VoipMgr", "setCameraCaptureBind,  isFace: %s", new Object[] { Boolean.valueOf(paramBoolean) });
      int i = 320;
      int j = 240;
      if (v2protocal.sTV)
      {
        ab.i("MicroMsg.Voip.VoipMgr", "steve: 640 capture!");
        i = 640;
        j = 480;
      }
      if (this.sRf == null)
        this.sRf = new com.tencent.mm.plugin.voip.video.a(i, j);
      if (this.sRf.a(this, paramBoolean) != 1)
        break label175;
    }
    label175: for (paramBoolean = true; ; paramBoolean = false)
    {
      this.sRY = paramBoolean;
      if ((this.sRY) && (this.sRg != null))
      {
        this.sRf.a(this.sRg);
        com.tencent.mm.plugin.voip.b.cIj().Gw(this.sRf.cLG());
        if (this.iGP != null)
          this.iGP.postDelayed(new VoipMgr.17(this), 50L);
      }
      AppMethodBeat.o(4505);
      return;
    }
  }

  private void oE(int paramInt)
  {
    AppMethodBeat.i(4514);
    ab.b("MicroMsg.Voip.VoipMgr", "swtchState, action: %s, currentState: %s", new Object[] { com.tencent.mm.plugin.voip.a.b.GK(paramInt), com.tencent.mm.plugin.voip.a.b.GK(this.sRc.mState) });
    if ((4101 == paramInt) && (com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState)))
    {
      cJI();
      this.sRn = false;
    }
    if ((Gr(paramInt)) && (1 == this.mUIType) && (1 == this.sRr))
    {
      this.sRJ = true;
      mr(false);
      Go(2);
    }
    this.sRc.GR(paramInt);
    if (this.iGP != null)
      this.iGP.post(new VoipMgr.19(this, paramInt));
    switch (this.sRc.mState)
    {
    case 260:
    case 261:
    default:
    case 258:
    case 259:
    case 262:
    }
    while (true)
    {
      AppMethodBeat.o(4514);
      while (true)
      {
        return;
        Gs(5);
        AppMethodBeat.o(4514);
      }
      Gs(6);
    }
  }

  final void Gp(int paramInt)
  {
    AppMethodBeat.i(4503);
    if (paramInt == 5)
    {
      idk += sSf[0];
      this.sSl += 1;
      ab.i("MicroMsg.Voip.VoipMgr", "mSignalStrength 4G" + sSf[0] + " and index is " + this.sSl);
      AppMethodBeat.o(4503);
    }
    while (true)
    {
      return;
      if (paramInt == 4)
      {
        WifiManager localWifiManager = (WifiManager)ah.getContext().getApplicationContext().getSystemService("wifi");
        idk += localWifiManager.getConnectionInfo().getRssi();
        sSf[1] = localWifiManager.getConnectionInfo().getRssi();
        this.sSl += 1;
        ab.i("MicroMsg.Voip.VoipMgr", "mSignalStrength WIFI " + localWifiManager.getConnectionInfo().getRssi() + " and index is " + this.sSl);
      }
      AppMethodBeat.o(4503);
    }
  }

  public final void Gt(int paramInt)
  {
    AppMethodBeat.i(4526);
    ab.i("MicroMsg.Voip.VoipMgr", "remote voip mode changed, cmd:%d", new Object[] { Integer.valueOf(paramInt) });
    if ((1 == paramInt) || (3 == paramInt) || (5 == paramInt) || (6 == paramInt) || (7 == paramInt))
    {
      oE(4101);
      com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIP();
      com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIQ();
    }
    AppMethodBeat.o(4526);
  }

  public final void Gu(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(4531);
    ab.i("MicroMsg.Voip.VoipMgr", "onSessionBeingCalled, callType: ".concat(String.valueOf(paramInt)));
    if (!this.sRc.GQ(4110))
    {
      AppMethodBeat.o(4531);
      return;
    }
    r localr = com.tencent.mm.plugin.voip.b.cIj();
    if (paramInt == 1);
    for (boolean bool2 = true; ; bool2 = false)
    {
      if (paramInt == 1)
        bool1 = true;
      localr.R(bool2, bool1);
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      if ((paramInt == 1) && (com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState)))
        oE(4101);
      oE(4110);
      AppMethodBeat.o(4531);
      break;
    }
  }

  public final void a(com.tencent.mm.plugin.voip.ui.b paramb)
  {
    AppMethodBeat.i(4506);
    ab.i("MicroMsg.Voip.VoipMgr", "onVoipUIDestroy");
    if (this.sRe == paramb)
    {
      ab.d("MicroMsg.Voip.VoipMgr", "same VoipUI, clear it");
      this.sRe = null;
    }
    if (this.iGP != null)
      this.iGP = null;
    AppMethodBeat.o(4506);
  }

  public final void a(com.tencent.mm.plugin.voip.ui.b paramb, int paramInt)
  {
    AppMethodBeat.i(4502);
    ab.i("MicroMsg.Voip.VoipMgr", "onVoipUICreated, uiType: %s, captureRender: %s", new Object[] { Integer.valueOf(paramInt), this.sRf });
    if ((1 == paramInt) && (this.sRe != null))
      this.sRe.uninit();
    this.sRe = paramb;
    this.mUIType = paramInt;
    if ((this.sRf == null) && (com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState)))
      this.sRg = new CaptureView(ah.getContext());
    if (this.sRn)
    {
      this.sRe.setCaptureView(this.sRg);
      if (com.tencent.mm.compatible.e.q.etc.eqU == 0)
        if ((this.sRf != null) && (!this.sRf.cLE()))
          break label304;
    }
    label304: for (boolean bool = true; ; bool = false)
    {
      mt(bool);
      this.sRe.fY(-1, this.sRc.mState);
      this.sRe.setConnectSec(this.sRs);
      this.sRe.GC(this.sRr);
      this.sRe.setMute(this.mIsMute);
      ab.i("MicroMsg.Voip.VoipMgr", "steve: voipMgr decMode:%d, beautyCmd:%d", new Object[] { Integer.valueOf(this.sRN), Integer.valueOf(this.sRO) });
      if (this.sRN != -1)
      {
        this.sRe.setHWDecMode(this.sRN);
        ab.i("MicroMsg.Voip.VoipMgr", "steve: voipMgr setHWDecMode,decMode:%d", new Object[] { Integer.valueOf(this.sRN) });
      }
      this.sRe.setVoipBeauty(this.sRO);
      AppMethodBeat.o(4502);
      return;
    }
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(4536);
    if (this.sRw)
      AppMethodBeat.o(4536);
    while (true)
    {
      return;
      if (this.sRf != null)
        break;
      ab.e("MicroMsg.Voip.VoipMgr", "onFrameDataReady, captureRender is null!");
      AppMethodBeat.o(4536);
    }
    int i;
    label60: int j;
    label75: int k;
    Object localObject1;
    label171: boolean bool;
    if (this.sRf.cLE())
    {
      i = OpenGlRender.FLAG_Mirror;
      if (!this.sRf.cLF())
        break label320;
      j = OpenGlRender.FLAG_Angle270;
      if (this.sRe != null)
      {
        k = paramInt3 + paramInt4;
        localObject1 = null;
        if (this.sRf.cLE())
        {
          if ((OpenGlRender.getGLVersion() != 1) && (this.sRe.cKU() != null) && (this.sRe.cKU().length == paramInt1 * paramInt2 * 4))
            break label341;
          if ((OpenGlRender.getGLVersion() != 2) || (this.sRX == null) || (this.sRO == 0))
            break label328;
          localObject1 = this.sRX;
          k = 4;
        }
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          k = paramInt3 + paramInt4;
          localObject2 = paramArrayOfByte;
        }
        localObject1 = com.tencent.mm.plugin.voip.b.cIj();
        int m = localObject2.length;
        k = ((r)localObject1).sSP.sNl.sPr.b((byte[])localObject2, m, k, paramInt1, paramInt2);
        this.sRe.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3 + paramInt4, i, j, k);
      }
      if (i != OpenGlRender.FLAG_Mirror)
        break label364;
      bool = true;
      label263: this.sRD = bool;
      if (j != OpenGlRender.FLAG_Angle270)
        break label370;
    }
    label320: label328: label341: label364: label370: for (paramInt3 = 270; ; paramInt3 = 90)
    {
      this.sRE = paramInt3;
      paramArrayOfByte = this.sRz;
      paramArrayOfByte.tbA = paramInt2;
      paramArrayOfByte.tbz = paramInt1;
      AppMethodBeat.o(4536);
      break;
      i = 0;
      break label60;
      j = OpenGlRender.FLAG_Angle90;
      break label75;
      k = paramInt3 + paramInt4;
      localObject1 = paramArrayOfByte;
      break label171;
      localObject1 = this.sRe.cKU();
      k = 4;
      this.sRX = ((byte[])localObject1);
      break label171;
      bool = false;
      break label263;
    }
  }

  public final void a(int[] paramArrayOfInt, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(4552);
    if ((!this.sRY) && (this.sRn))
    {
      mt(true);
      this.sRY = true;
    }
    al.d(new VoipMgr.11(this, paramArrayOfInt, paramBoolean, paramInt));
    AppMethodBeat.o(4552);
  }

  public final void b(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4527);
    if (this.sRe != null)
      this.sRe.c(paramInt1, paramInt2, paramArrayOfInt);
    AppMethodBeat.o(4527);
  }

  public final void b(MMTextureView paramMMTextureView)
  {
    AppMethodBeat.i(4510);
    if (this.sRM != null)
    {
      com.tencent.mm.plugin.voip.video.e locale = this.sRM;
      ab.i("DecodeTextureView", "steve: init hwview, recreateView: ".concat(String.valueOf(paramMMTextureView)));
      locale.mdt = paramMMTextureView;
      locale.mdt.setSurfaceTextureListener(locale);
      if ((locale.sZW != null) && (locale.sZW != paramMMTextureView.getSurfaceTexture()))
      {
        ab.i("DecodeTextureView", "using saved st=" + locale.sZW);
        paramMMTextureView.setSurfaceTexture(locale.sZW);
      }
    }
    AppMethodBeat.o(4510);
  }

  public final void bGL()
  {
    AppMethodBeat.i(4518);
    ab.i("MicroMsg.Voip.VoipMgr", "on accept");
    com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
    oE(4100);
    AppMethodBeat.o(4518);
  }

  public final void bGR()
  {
    AppMethodBeat.i(4540);
    ab.i("MicroMsg.Voip.VoipMgr", "onResumeGoodNetStatus");
    if (this.sRe != null)
      this.sRe.bIK();
    AppMethodBeat.o(4540);
  }

  public final void bSo()
  {
    AppMethodBeat.i(4550);
    if ((true == this.oue) || (this.sRe == null) || (this.sRe.cKS() == null))
    {
      ab.d("MicroMsg.Voip.VoipMgr", "onCameraError, already show");
      AppMethodBeat.o(4550);
    }
    while (true)
    {
      return;
      if (this.sRf.bPu())
      {
        AppMethodBeat.o(4550);
      }
      else if ((Build.MANUFACTURER.equalsIgnoreCase("meizu")) && (!com.tencent.mm.compatible.f.b.Mj()))
      {
        ab.d("MicroMsg.Voip.VoipMgr", "onCameraError, meizu machine");
        AppMethodBeat.o(4550);
      }
      else if ((com.tencent.mm.compatible.util.d.iW(28)) && (((KeyguardManager)ah.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()))
      {
        ab.i("MicroMsg.Voip.VoipMgr", "api level: %s, in keyguard, ignore", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        AppMethodBeat.o(4550);
      }
      else
      {
        ab.d("MicroMsg.Voip.VoipMgr", "onCameraError, show dialog");
        Object localObject = com.tencent.mm.plugin.report.service.h.pYm;
        if (this.sRn);
        for (int i = 0; ; i = 1)
        {
          ((com.tencent.mm.plugin.report.service.h)localObject).e(11306, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
          localObject = com.tencent.mm.ui.base.h.g(this.sRe.cKS(), 2131304446, 2131297061);
          if (localObject != null)
            break label254;
          ab.e("MicroMsg.Voip.VoipMgr", "new dialog failed");
          AppMethodBeat.o(4550);
          break;
        }
        label254: ((com.tencent.mm.ui.widget.a.c)localObject).setCancelable(false);
        ((com.tencent.mm.ui.widget.a.c)localObject).setCanceledOnTouchOutside(false);
        ((com.tencent.mm.ui.widget.a.c)localObject).show();
        this.oue = true;
        AppMethodBeat.o(4550);
      }
    }
  }

  public final void cJA()
  {
    AppMethodBeat.i(4522);
    ab.i("MicroMsg.Voip.VoipMgr", "onNoResp");
    oE(4105);
    String str1 = this.sRl.field_username;
    String str2;
    if (this.sRn)
    {
      str2 = bi.xZc;
      if (!this.sRm)
        break label181;
    }
    label181: for (int i = 1; ; i = 0)
    {
      q.a(str1, str2, i, 4, ah.getContext().getString(2131304368));
      com.tencent.mm.plugin.report.service.h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIK()), Integer.valueOf(6), Integer.valueOf(at.getNetWorkType(getContext())) });
      cJz();
      AppMethodBeat.o(4522);
      return;
      str2 = bi.xZb;
      break;
    }
  }

  public final void cJB()
  {
    int i = 0;
    AppMethodBeat.i(4524);
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
    int j = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu;
    long l1 = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv;
    long l2 = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIK();
    if (this.sRm)
    {
      k = 0;
      localh.a(11522, true, true, new Object[] { Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(k), Integer.valueOf(1) });
      j = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu;
      l2 = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv;
      if (!this.sRm)
        break label201;
    }
    label201: for (int k = i; ; k = 1)
    {
      com.tencent.mm.plugin.voip.a.a.c(j, l2, k, 3);
      this.sSe.post(new VoipMgr.2(this));
      AppMethodBeat.o(4524);
      return;
      k = 1;
      break;
    }
  }

  public final void cJC()
  {
    int i = 0;
    AppMethodBeat.i(4525);
    ab.i("MicroMsg.Voip.VoipMgr", "onShutDown");
    String str1;
    String str3;
    label97: label107: int k;
    label133: label161: long l;
    if (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState))
    {
      str1 = ah.getContext().getString(2131304361, new Object[] { fQ(bo.fp(this.sRs)) });
      if ((this.sRm) || (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState)))
      {
        String str2 = this.sRl.field_username;
        if (!this.sRn)
          break label253;
        str3 = bi.xZc;
        if (!this.sRm)
          break label261;
        j = 1;
        q.a(str2, str3, j, 6, str1);
      }
      if (!this.sRn)
        break label267;
      com.tencent.mm.plugin.voip.b.cIj().Gx(0);
      this.sRj = com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState);
      if (!cJJ())
        break label277;
      this.sRp = 4106;
      com.tencent.mm.plugin.voip.b.cIj().cKe();
      if (!this.sRV)
      {
        k = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu;
        l = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv;
        if (!this.sRm)
          break label291;
      }
    }
    label261: label267: label277: label291: for (int j = i; ; j = 1)
    {
      com.tencent.mm.plugin.voip.a.a.c(k, l, j, 4);
      this.sRV = true;
      AppMethodBeat.o(4525);
      return;
      str1 = ah.getContext().getString(2131304357);
      break;
      label253: str3 = bi.xZb;
      break label97;
      j = 0;
      break label107;
      com.tencent.mm.plugin.voip.b.cIj().Gx(1);
      break label133;
      oE(4106);
      cJz();
      break label161;
    }
  }

  public final void cJD()
  {
    AppMethodBeat.i(4528);
    if (this.sRe != null)
      this.sRe.cJD();
    AppMethodBeat.o(4528);
  }

  public final void cJE()
  {
    boolean bool1 = false;
    AppMethodBeat.i(4532);
    ab.d("MicroMsg.Voip.VoipMgr", "onPretreatmentForStartDev");
    label66: boolean bool2;
    if ((com.tencent.mm.compatible.b.g.KK().KV()) || (com.tencent.mm.compatible.b.g.KK().KP()))
    {
      mr(false);
      if (Looper.myLooper() != Looper.getMainLooper())
      {
        al.d(new VoipMgr.3(this));
        AppMethodBeat.o(4532);
      }
    }
    else if (1 == this.sRr)
    {
      bool2 = true;
      label77: if (!this.sRJ)
        break label99;
      bool2 = bool1;
    }
    while (true)
    {
      mr(bool2);
      break;
      bool2 = false;
      break label77;
      label99: if (this.sRn)
      {
        bool2 = true;
        continue;
        cJF();
        AppMethodBeat.o(4532);
        break label66;
      }
    }
  }

  public final long cJG()
  {
    AppMethodBeat.i(4534);
    ab.c("MicroMsg.Voip.VoipMgr", "totalDeviceNearTime: %s", new Object[] { Long.valueOf(this.sRR) });
    long l = this.sRR / 1000L;
    AppMethodBeat.o(4534);
    return l;
  }

  public final void cJL()
  {
    AppMethodBeat.i(4547);
    if ((256 != this.sRc.mState) && (257 != this.sRc.mState))
      AppMethodBeat.o(4547);
    while (true)
    {
      return;
      if ((com.tencent.mm.kernel.g.RP().Ry().getInt(327945, 0) == 0) && (this.sRe.cKS() != null))
      {
        com.tencent.mm.kernel.g.RP().Ry().setInt(327945, 1);
        com.tencent.mm.ui.widget.a.c localc = com.tencent.mm.ui.base.h.a(this.sRe.cKS(), 2131304426, 2131297061, new VoipMgr.8(this));
        localc.setCancelable(false);
        localc.setCanceledOnTouchOutside(false);
        localc.show();
        AppMethodBeat.o(4547);
      }
      else
      {
        com.tencent.mm.plugin.voip.a.d.fh(ah.getContext());
        cJN();
        AppMethodBeat.o(4547);
      }
    }
  }

  public final void cJM()
  {
    AppMethodBeat.i(4548);
    boolean bool;
    if (!this.sRC)
    {
      bool = true;
      this.sRC = bool;
      if (!this.sRC)
        break label46;
      this.sRA.stopTimer();
      AppMethodBeat.o(4548);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label46: if (this.sRA == null)
      {
        this.sRB = new al("faceDetect");
        this.sRA = new com.tencent.mm.sdk.platformtools.ap(this.sRB.oAl.getLooper(), new VoipMgr.10(this), true);
      }
      this.sRA.ae(2000L, 2000L);
      this.sRC = false;
      AppMethodBeat.o(4548);
    }
  }

  public final void cJN()
  {
    AppMethodBeat.i(4549);
    com.tencent.mm.plugin.voip.b.cIj().sSV = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu;
    String str1 = this.sRl.field_username;
    String str2;
    if (this.sRn)
    {
      str2 = bi.xZc;
      if (!this.sRm)
        break label129;
    }
    label129: for (int i = 1; ; i = 0)
    {
      q.a(str1, str2, i, 6, ah.getContext().getString(2131304364));
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      oE(4108);
      if (this.iGP != null)
        this.iGP.postDelayed(new VoipMgr.9(this), 2000L);
      AppMethodBeat.o(4549);
      return;
      str2 = bi.xZb;
      break;
    }
  }

  public final boolean cJk()
  {
    AppMethodBeat.i(4494);
    boolean bool;
    if (!this.sRc.GQ(4103))
    {
      bool = false;
      AppMethodBeat.o(4494);
    }
    while (true)
    {
      return bool;
      Gq(4103);
      com.tencent.mm.plugin.voip.b.cIj().cKe();
      bool = true;
      AppMethodBeat.o(4494);
    }
  }

  public final boolean cJl()
  {
    boolean bool = false;
    AppMethodBeat.i(4495);
    if (!this.sRc.GQ(4101))
    {
      AppMethodBeat.o(4495);
      return bool;
    }
    com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
    com.tencent.mm.plugin.voip.b.cIj().Gh(1);
    com.tencent.mm.plugin.voip.b.cIj().R(true, this.sRn);
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
    long l = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv;
    int i = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu;
    if (this.sRm);
    for (int j = 1; ; j = 0)
    {
      localh.e(11046, new Object[] { Integer.valueOf(1), Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j) });
      com.tencent.mm.plugin.report.service.h.pYm.e(11080, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0) });
      oE(4111);
      oE(4101);
      oE(4100);
      AppMethodBeat.o(4495);
      bool = true;
      break;
    }
  }

  public final boolean cJm()
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(4496);
    if (!this.sRc.GQ(4099))
    {
      AppMethodBeat.o(4496);
      return bool;
    }
    String str1 = this.sRl.field_username;
    if (this.sRn);
    for (String str2 = bi.xZc; ; str2 = bi.xZb)
    {
      if (this.sRm)
        i = 1;
      q.a(str1, str2, i, 6, ah.getContext().getString(2131304365));
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      com.tencent.mm.plugin.voip.b.cIj().sSP.cKl();
      oE(4099);
      cJz();
      AppMethodBeat.o(4496);
      bool = true;
      break;
    }
  }

  public final boolean cJn()
  {
    boolean bool = false;
    AppMethodBeat.i(4497);
    if (!this.sRc.GQ(4100))
    {
      AppMethodBeat.o(4497);
      return bool;
    }
    if ((com.tencent.mm.compatible.e.q.etc.eqU == 1) && (this.sRn))
      mt(true);
    if (((!this.sRY) || (com.tencent.mm.compatible.e.q.etc.eqU == 1) || (com.tencent.mm.compatible.e.q.etc.eqV == 1)) && (this.sRn))
      if ((this.sRf != null) && (!this.sRf.cLE()))
        break label162;
    label162: for (bool = true; ; bool = false)
    {
      mt(bool);
      this.sRY = true;
      ab.i("MicroMsg.Voip.VoipMgr", "onAcceptVideoInvite");
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      com.tencent.mm.plugin.voip.b.cIj().R(false, this.sRn);
      oE(4100);
      AppMethodBeat.o(4497);
      bool = true;
      break;
    }
  }

  public final void cJo()
  {
    this.sRY = false;
  }

  public final boolean cJp()
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(4498);
    if (!this.sRc.GQ(4099))
    {
      AppMethodBeat.o(4498);
      return bool;
    }
    ab.i("MicroMsg.Voip.VoipMgr", "onRejectVoiceInvite");
    String str1 = this.sRl.field_username;
    if (this.sRn);
    for (String str2 = bi.xZc; ; str2 = bi.xZb)
    {
      if (this.sRm)
        i = 1;
      q.a(str1, str2, i, 6, ah.getContext().getString(2131304365));
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      com.tencent.mm.plugin.voip.b.cIj().sSP.cKl();
      oE(4099);
      cJz();
      AppMethodBeat.o(4498);
      bool = true;
      break;
    }
  }

  public final boolean cJq()
  {
    boolean bool = true;
    AppMethodBeat.i(4499);
    if (!this.sRc.GQ(4100))
    {
      bool = false;
      AppMethodBeat.o(4499);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Voip.VoipMgr", "onAcceptVoiceInvite");
      com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
      com.tencent.mm.plugin.voip.b.cIj().R(true, this.sRn);
      oE(4111);
      oE(4100);
      AppMethodBeat.o(4499);
    }
  }

  public final boolean cJr()
  {
    AppMethodBeat.i(4500);
    boolean bool;
    if (!this.sRc.GQ(4098))
    {
      bool = false;
      AppMethodBeat.o(4500);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Voip.VoipMgr", "onCancelVideoInvite");
      Gq(4098);
      com.tencent.mm.plugin.voip.b.cIj().cKe();
      bool = true;
      AppMethodBeat.o(4500);
    }
  }

  public final boolean cJs()
  {
    AppMethodBeat.i(4501);
    boolean bool;
    if (!this.sRc.GQ(4098))
    {
      bool = false;
      AppMethodBeat.o(4501);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Voip.VoipMgr", "onCancelVoiceInvite");
      Gq(4098);
      com.tencent.mm.plugin.voip.b.cIj().cKe();
      bool = true;
      AppMethodBeat.o(4501);
    }
  }

  public final void cJt()
  {
    AppMethodBeat.i(4504);
    ab.i("MicroMsg.Voip.VoipMgr", "it is init voip report");
    this.sSb = new VoipMgr.NetChangedBroadcastReceiver(this);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    ah.getContext().registerReceiver(this.sSb, localIntentFilter);
    this.sSg = ((TelephonyManager)ah.getContext().getSystemService("phone"));
    this.sRZ = com.tencent.mm.plugin.voip.a.a.getNetType(getContext());
    this.sSc = new VoipMgr.16(this);
    this.sSg.listen(this.sSc, 256);
    AppMethodBeat.o(4504);
  }

  public final void cJu()
  {
    AppMethodBeat.i(4507);
    ab.i("MicroMsg.Voip.VoipMgr", "onSwitchCamera");
    if (this.sRf != null)
      this.sRf.cLB();
    com.tencent.mm.plugin.report.service.h.pYm.e(11079, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(4507);
  }

  public final void cJv()
  {
    AppMethodBeat.i(4508);
    if (true != this.sRf.cLE())
      cJu();
    AppMethodBeat.o(4508);
  }

  public final boolean cJw()
  {
    boolean bool = true;
    AppMethodBeat.i(4511);
    if (com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu == 0)
    {
      this.sRq = true;
      AppMethodBeat.o(4511);
    }
    while (true)
    {
      return bool;
      bool = cJx();
      AppMethodBeat.o(4511);
    }
  }

  public final void cJy()
  {
    AppMethodBeat.i(4513);
    ab.i("MicroMsg.Voip.VoipMgr", "onRoomReady");
    if ((this.sRq) && (com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu != 0))
    {
      this.sRq = false;
      cJx();
    }
    if (this.sRm)
      oE(4097);
    AppMethodBeat.o(4513);
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(4487);
    ab.i("MicroMsg.Voip.VoipMgr", "onBluetoothHeadsetStateChange status: %d, mBTRecoverSpeakerOn: %b, isHeadsetPlugged: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.sRu), Boolean.valueOf(com.tencent.mm.compatible.b.g.KK().KV()) });
    switch (paramInt)
    {
    default:
    case 3:
    case 4:
    case 1:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(4487);
      while (true)
      {
        return;
        com.tencent.mm.compatible.b.g.KK().KM();
        this.sRL = false;
        AppMethodBeat.o(4487);
        continue;
        com.tencent.mm.compatible.b.g.KK().KN();
        com.tencent.mm.compatible.b.g.KK().KL();
        cJj();
        AppMethodBeat.o(4487);
        continue;
        if (!com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState))
          if (1 != this.sRr)
            break label230;
        label230: for (boolean bool = true; ; bool = false)
        {
          this.sRu = bool;
          paramInt = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIt();
          com.tencent.mm.compatible.b.g.KK().b(false, paramInt, false);
          com.tencent.mm.plugin.voip.b.cIj().mj(false);
          com.tencent.mm.plugin.voip.b.cIj().mp(false);
          Go(4);
          this.sRL = false;
          com.tencent.mm.plugin.voip.b.cIj().jj(true);
          AppMethodBeat.o(4487);
          break;
        }
        if (this.sSi)
          break;
        com.tencent.mm.compatible.b.g.KK().KN();
        cJj();
        this.sRU = true;
        AppMethodBeat.o(4487);
      }
      com.tencent.mm.compatible.b.g.KK().KM();
    }
  }

  final Context getContext()
  {
    AppMethodBeat.i(4544);
    Context localContext1 = null;
    if (this.sRe != null)
      localContext1 = this.sRe.cKS();
    Context localContext2 = localContext1;
    if (localContext1 == null)
      localContext2 = ah.getContext();
    AppMethodBeat.o(4544);
    return localContext2;
  }

  public final void he(boolean paramBoolean)
  {
    AppMethodBeat.i(4486);
    ab.i("MicroMsg.Voip.VoipMgr", "onSensorEvent, isON: %s, lastIsDeviceNear: %s, deviceSwitchNearScreenTick: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.sRQ), Long.valueOf(this.sRP) });
    if (this.sRc == null)
    {
      ab.i("MicroMsg.Voip.VoipMgr", "onSensorEvent, not create stateMachine yet, ignore");
      AppMethodBeat.o(4486);
    }
    while (true)
    {
      return;
      if ((Math.abs(bo.yz() - this.sRS) < 500L) && (this.sRS != -1L))
      {
        ab.d("MicroMsg.Voip.VoipMgr", "onSensorEvent time interval too small");
        AppMethodBeat.o(4486);
      }
      else
      {
        if ((com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState)) && ((this.sRQ != paramBoolean) || (this.sRP == -1L)))
        {
          if ((!this.sRQ) && (paramBoolean) && (!com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState)) && (this.mUIType != 2) && (this.sRP != -1L))
          {
            long l = bo.az(this.sRP);
            ab.i("MicroMsg.Voip.VoipMgr", "accumulate near screen time: %s", new Object[] { Long.valueOf(l) });
            this.sRR = (l + this.sRR);
          }
          this.sRP = bo.yz();
          this.sRQ = paramBoolean;
        }
        if (this.sRe == null)
        {
          ab.i("MicroMsg.Voip.VoipMgr", "onSensorEvent, voipUI is null, ignore");
          AppMethodBeat.o(4486);
        }
        else
        {
          if (((this.sRm) || (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState))) && (!com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState)) && (this.mUIType != 2))
          {
            ab.d("MicroMsg.Voip.VoipMgr", "onSensorEvent, isOn: ".concat(String.valueOf(paramBoolean)));
            this.sRe.setScreenEnable(paramBoolean);
            this.sRS = bo.yz();
          }
          AppMethodBeat.o(4486);
        }
      }
    }
  }

  public final void ig(boolean paramBoolean)
  {
    int i = 2;
    AppMethodBeat.i(4539);
    ab.i("MicroMsg.Voip.VoipMgr", "onBadNetStatus");
    if (this.sRe != null)
      this.sRe.my(paramBoolean);
    long l;
    if ((!com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState)) && (!this.sRv))
    {
      l = System.currentTimeMillis();
      if (l - this.nxl > 30000L)
      {
        this.nxl = l;
        com.tencent.mm.plugin.voip.b.cIj().sSP.cKp();
      }
    }
    Object localObject = new StringBuilder("report the bad net toast room key is ").append(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv).append("and in the side");
    if (paramBoolean);
    for (int j = 1; ; j = 2)
    {
      ab.i("MicroMsg.Voip.VoipMgr", j);
      localObject = com.tencent.mm.plugin.report.service.h.pYm;
      l = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv;
      j = i;
      if (paramBoolean)
        j = 1;
      ((com.tencent.mm.plugin.report.service.h)localObject).a(17151, true, true, new Object[] { Long.valueOf(l), Integer.valueOf(j) });
      AppMethodBeat.o(4539);
      return;
    }
  }

  public final void jg(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(4493);
    Object localObject;
    if (paramBoolean)
    {
      localObject = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPr;
      if (((m)localObject).kzb != null)
        ((m)localObject).kzb.bs(true);
      com.tencent.mm.plugin.voip.b.cIj().Gh(9);
      com.tencent.mm.plugin.voip.b.cIj().mo(true);
    }
    while (true)
    {
      this.mIsMute = paramBoolean;
      localObject = com.tencent.mm.plugin.report.service.h.pYm;
      if (paramBoolean)
        i = 2;
      ((com.tencent.mm.plugin.report.service.h)localObject).e(11080, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(i) });
      AppMethodBeat.o(4493);
      return;
      localObject = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPr;
      if (((m)localObject).kzb != null)
        ((m)localObject).kzb.bs(false);
      com.tencent.mm.plugin.voip.b.cIj().Gh(8);
      com.tencent.mm.plugin.voip.b.cIj().mo(false);
    }
  }

  public final void ms(boolean paramBoolean)
  {
    AppMethodBeat.i(4492);
    ab.d("MicroMsg.Voip.VoipMgr", "onSpeakerStateChanged, isSpeakerOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject;
    if (!com.tencent.mm.plugin.voip.b.cIj().sSP.cKq())
    {
      localObject = com.tencent.mm.plugin.voip.b.cIj().sSP;
      if (((s)localObject).sTj != null)
        ((s)localObject).sTj.mE(paramBoolean);
      if (!paramBoolean)
        break label128;
      i = 1;
      label66: Go(i);
      localObject = com.tencent.mm.plugin.report.service.h.pYm;
      if (!paramBoolean)
        break label133;
    }
    label128: label133: for (int i = 1; ; i = 2)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject).e(11080, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Integer.valueOf(0) });
      AppMethodBeat.o(4492);
      return;
      mr(paramBoolean);
      break;
      i = 2;
      break label66;
    }
  }

  final void mu(boolean paramBoolean)
  {
    AppMethodBeat.i(4521);
    ab.i("MicroMsg.Voip.VoipMgr", "finish");
    this.sRG = false;
    this.sRI = false;
    if (this.sRx != -1)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(11700, new Object[] { Integer.valueOf(this.sRx), Long.valueOf(bo.fp(this.sRs)) });
      this.sRx = -1;
    }
    try
    {
      ah.getContext().unregisterReceiver(this.sSj);
      label84: com.tencent.mm.sdk.b.a.xxA.d(this.nvc);
      com.tencent.mm.sdk.b.a.xxA.d(this.sSm);
      if (this.sRe != null)
      {
        this.sRe.uninit();
        this.sRe = null;
      }
      this.sRg = null;
      this.sRM = null;
      com.tencent.mm.compatible.b.g.KK().b(this);
      com.tencent.mm.compatible.b.g.KK().KN();
      label198: Object localObject1;
      Object localObject2;
      label242: long l2;
      label295: label634: int j;
      if (com.tencent.mm.plugin.voip.b.cIj() != null)
      {
        com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
        if (paramBoolean)
        {
          com.tencent.mm.plugin.voip.b.cIj().sSP.cKo();
          if (!this.sRn)
            break label863;
          com.tencent.mm.plugin.voip.b.cIj().b(false, true, this.edV);
          localObject1 = com.tencent.mm.plugin.voip.b.cIj();
          localObject2 = ah.getContext();
          localObject1 = ((r)localObject1).sSP;
          if ((localObject2 == ((s)localObject1).sNl.jiq) && (this == ((s)localObject1).sNl.sPq))
            break label878;
          com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", "cannot detach other's ui.");
        }
      }
      else
      {
        localObject2 = com.tencent.mm.plugin.voip.b.cIj();
        ((r)localObject2).sSQ = null;
        ((r)localObject2).sSY = null;
        ((r)localObject2).sSZ = false;
        ((r)localObject2).sTe = false;
        if (!this.sRi)
          break label911;
        this.sRh = new VoipMgr.a(this);
        com.tencent.mm.sdk.g.d.post(this.sRh, "VoipMgr_clean");
        if ((this.nva != null) && (this.nvb != null))
        {
          this.nva.listen(this.nvb, 0);
          this.nvb = null;
        }
        if (this.sRd != null)
          this.sRd.fa(ah.getContext());
        this.nva = null;
        com.tencent.mm.booter.a.Ib().Ic();
        p.cJR().cJT();
        p.cJR().a(null);
        ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
        if (this.mfW != null)
        {
          ab.d("MicroMsg.Voip.VoipMgr", "removeSensorCallBack");
          this.mfW.dps();
          this.mfW = null;
          this.sRQ = false;
          this.sRR = 0L;
          this.sRP = -1L;
        }
        this.sRS = -1L;
        com.tencent.mm.plugin.voip.b.cIj().cKe();
        ab.i("MicroMsg.Voip.VoipMgr", "finish, isFinishFromShutdown: %s", new Object[] { Boolean.valueOf(this.sRj) });
        if (this.sRj)
        {
          localObject2 = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPB;
          com.tencent.mm.kernel.g.RQ();
          long l1 = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVG, Long.valueOf(-1L))).longValue();
          if (l1 <= 0L)
            break label918;
          l2 = l1;
          label530: ((VoipScoreState)localObject2).sSO = l2;
          l2 = bf.aaa();
          ab.i("MicroMsg.VoipScoreState", "needShowScoreDialog, current:%s, lastShowScoreTime:%s, scoreIntervalDay:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(((VoipScoreState)localObject2).sSN) });
          if ((bo.isNullOrNil(((VoipScoreState)localObject2).sSM)) || (((VoipScoreState)localObject2).sSN <= 0) || ((l1 > 0L) && (l2 - l1 <= ((VoipScoreState)localObject2).sSN * 86400000L)))
            break label924;
          ab.i("MicroMsg.VoipScoreState", "needShowScoreDialog, exceed limit");
          i = 1;
          if (i != 0)
          {
            com.tencent.mm.plugin.voip.b.cIj();
            VoipScoreState.cJX();
            localObject2 = new Intent(getContext(), VoipScoreDialog.class);
            ((Intent)localObject2).putExtra("key_score_state", com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPB);
            if (!(getContext() instanceof Activity))
              ((Intent)localObject2).addFlags(268435456);
            getContext().startActivity((Intent)localObject2);
          }
        }
        com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPB = new VoipScoreState();
        localObject2 = new ui();
        ((ui)localObject2).cQx.cAd = 11;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if (!this.sRV)
        {
          j = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu;
          l2 = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv;
          if (!this.sRm)
            break label930;
        }
      }
      label911: label918: label924: label930: for (int i = 0; ; i = 1)
      {
        com.tencent.mm.plugin.voip.a.a.c(j, l2, i, 4);
        this.sRV = true;
        this.sRX = null;
        ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
        AppMethodBeat.o(4521);
        return;
        com.tencent.mm.plugin.voip.b.cIj().sSP.cKm();
        break;
        label863: com.tencent.mm.plugin.voip.b.cIj().b(false, false, this.edV);
        break label198;
        label878: ((s)localObject1).sNl.jiq = null;
        ((s)localObject1).sNl.sPq = u.sTD;
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", "detach ui........");
        com.tencent.mm.plugin.voip.a.a.flushLogFile();
        break label242;
        cJH();
        break label295;
        l2 = 0L;
        break label530;
        i = 0;
        break label634;
      }
    }
    catch (Exception localException)
    {
      break label84;
    }
  }

  public final boolean mv(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(4546);
    if ((this.sRI) && (!paramBoolean))
    {
      ab.i("MicroMsg.Voip.VoipMgr", "has phone call  cannot mini!");
      AppMethodBeat.o(4546);
    }
    for (paramBoolean = bool; ; paramBoolean = true)
    {
      return paramBoolean;
      ab.b("MicroMsg.Voip.VoipMgr", "miniOnlyHidenVoip: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      ab.i("MicroMsg.Voip.VoipMgr", "onMinimizeVoip, async to minimize");
      if (this.sRe != null)
      {
        this.sRe.uninit();
        this.sRe = null;
      }
      if (this.iGP != null)
        this.iGP.post(new VoipMgr.7(this, paramBoolean));
      AppMethodBeat.o(4546);
    }
  }

  public final void onConnected()
  {
    AppMethodBeat.i(4523);
    oE(4102);
    this.sRs = bo.anT();
    if (this.sRe != null)
      this.sRe.setConnectSec(this.sRs);
    boolean bool1 = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIM();
    boolean bool2 = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIL();
    if ((this.sRn) && (this.sRm) && (!bool2) && (!bool1))
      com.tencent.mm.plugin.voip.b.cIj().Gh(1);
    if (!com.tencent.mm.plugin.voip.a.b.GO(this.sRc.mState))
      com.tencent.mm.plugin.report.service.h.pYm.e(11080, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
    bo.z(ah.getContext(), true);
    Object localObject = com.tencent.mm.plugin.voip.b.cIj();
    int i = com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.sUk;
    localObject = ((r)localObject).sSP;
    ((s)localObject).bJj = null;
    ((s)localObject).sTq = null;
    ((s)localObject).sTo = 0;
    if (i > 0)
      s.sTm = i;
    ((s)localObject).bJj = ((WifiManager)ah.getContext().getApplicationContext().getSystemService("wifi"));
    ((s)localObject).sTp = new Timer();
    ((s)localObject).sTp.schedule(new s.6((s)localObject), 0L, s.sTm * 1000);
    TelephonyManager localTelephonyManager = (TelephonyManager)ah.getContext().getSystemService("phone");
    if (localTelephonyManager != null)
      localTelephonyManager.listen(new s.5((s)localObject, localTelephonyManager), 256);
    p.cJR().cJS();
    p.cJR().a(this);
    AppMethodBeat.o(4523);
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(4517);
    String str1;
    if (this.sRn)
    {
      com.tencent.mm.plugin.voip.b.cIj().Gx(0);
      str1 = paramString;
      if (paramInt == 241)
      {
        str1 = paramString;
        if (bo.isNullOrNil(paramString))
          str1 = getContext().getString(2131304453);
      }
      if (this.sRe != null)
        this.sRe.br(paramInt, str1);
      oE(4109);
      ab.i("MicroMsg.Voip.VoipMgr", "onError, errCode: %s, roomId: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu) });
      paramString = ah.getContext();
      ab.d("MicroMsg.Voip.VoipMgr", "getErrorMsgContent, errorCode".concat(String.valueOf(paramInt)));
      if (paramInt != 235)
        break label344;
      paramString = paramString.getString(2131304367);
      label150: if ((com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu == 0) || (com.tencent.mm.plugin.voip.b.cIj().sSU.get(Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu)) != null))
        break label439;
      str2 = this.sRl.field_username;
      if (!this.sRn)
        break label427;
      str1 = bi.xZc;
      if (!this.sRm)
        break label434;
      paramInt = 1;
      if (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState))
        paramString = ah.getContext().getString(2131304362, new Object[] { fQ(bo.fp(this.sRs)) });
      l = q.a(str2, str1, paramInt, 6, paramString, true);
      com.tencent.mm.plugin.voip.b.cIj().sSU.put(Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu), Long.valueOf(l));
    }
    label344: 
    while (com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu != 0)
      while (true)
      {
        long l;
        com.tencent.mm.plugin.voip.b.cIj().cKe();
        cJz();
        AppMethodBeat.o(4517);
        return;
        com.tencent.mm.plugin.voip.b.cIj().Gx(1);
        break;
        if (paramInt == 233)
        {
          paramString = paramString.getString(2131304358);
          break label150;
        }
        if (paramInt == 237)
        {
          paramString = paramString.getString(2131304367);
          break label150;
        }
        if (paramInt == 236)
        {
          paramString = paramString.getString(2131304358);
          break label150;
        }
        if (paramInt == 211)
        {
          paramString = paramString.getString(2131304366);
          break label150;
        }
        paramString = paramString.getString(2131304357);
        break label150;
        str1 = bi.xZb;
        continue;
        paramInt = 0;
      }
    label427: label434: label439: String str2 = this.sRl.field_username;
    if (this.sRn)
    {
      str1 = bi.xZc;
      label477: if (!this.sRm)
        break label548;
    }
    label548: for (paramInt = 1; ; paramInt = 0)
    {
      if (com.tencent.mm.plugin.voip.a.b.GN(this.sRc.mState))
        paramString = ah.getContext().getString(2131304362, new Object[] { fQ(bo.fp(this.sRs)) });
      q.a(str2, str1, paramInt, 6, paramString, true);
      break;
      str1 = bi.xZb;
      break label477;
    }
  }

  public final void onReject()
  {
    AppMethodBeat.i(4519);
    ab.i("MicroMsg.Voip.VoipMgr", "onReject");
    oE(4099);
    String str1 = this.sRl.field_username;
    String str2;
    if (this.sRn)
    {
      str2 = bi.xZc;
      if (!this.sRm)
        break label86;
    }
    label86: for (int i = 1; ; i = 0)
    {
      q.a(str1, str2, i, 6, ah.getContext().getString(2131304369));
      cJz();
      AppMethodBeat.o(4519);
      return;
      str2 = bi.xZb;
      break;
    }
  }

  public final void setHWDecMode(int paramInt)
  {
    AppMethodBeat.i(4530);
    this.sRN = paramInt;
    if (this.sRe != null)
      this.sRe.setHWDecMode(paramInt);
    AppMethodBeat.o(4530);
  }

  public final void setVoipBeauty(int paramInt)
  {
    AppMethodBeat.i(4529);
    ab.i("MicroMsg.Voip.VoipMgr", "setVoipBeauty, isON: " + paramInt + "，mVoipUI: " + this.sRe);
    if (this.sRe != null)
      this.sRe.setVoipBeauty(paramInt);
    if ((paramInt != 0) && (this.sRO != paramInt))
      com.tencent.mm.plugin.report.service.h.pYm.k(914L, 20L, 1L);
    this.sRO = paramInt;
    AppMethodBeat.o(4529);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr
 * JD-Core Version:    0.6.2
 */