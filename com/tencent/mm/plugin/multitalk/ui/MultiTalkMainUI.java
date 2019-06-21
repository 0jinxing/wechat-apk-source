package com.tencent.mm.plugin.multitalk.ui;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.multitalk.model.f.6;
import com.tencent.mm.plugin.multitalk.model.j;
import com.tencent.mm.plugin.multitalk.model.j.a;
import com.tencent.mm.plugin.multitalk.model.n;
import com.tencent.mm.plugin.multitalk.model.p;
import com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkVideoView;
import com.tencent.mm.plugin.multitalk.ui.widget.f.a;
import com.tencent.mm.plugin.multitalk.ui.widget.f.b;
import com.tencent.mm.plugin.voip.ui.MMCheckBox;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.wecall.talkroom.model.TalkRoom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MultiTalkMainUI extends MMActivity
  implements ServiceConnection, com.tencent.mm.plugin.multitalk.model.b
{
  protected ak lda;
  private com.tencent.mm.plugin.multitalk.ui.widget.c oHG;
  private com.tencent.mm.plugin.multitalk.ui.widget.f oHH;
  private boolean oHI;
  private Notification oHJ;
  private boolean oHK;
  private boolean oHL;
  boolean oHM;
  private MultiTalkMainUI.ScreenActionReceiver oHN;
  private Runnable oHO;
  private boolean oHP;
  private BroadcastReceiver oHQ;
  ak oHR;

  public MultiTalkMainUI()
  {
    AppMethodBeat.i(54129);
    this.oHK = true;
    this.oHL = false;
    this.oHM = false;
    this.oHO = new MultiTalkMainUI.1(this);
    this.oHQ = new MultiTalkMainUI.5(this);
    this.oHR = new MultiTalkMainUI.10(this);
    AppMethodBeat.o(54129);
  }

  private static int bHJ()
  {
    AppMethodBeat.i(54136);
    int i;
    if (g.KK().KP())
    {
      i = g.KK().Lc();
      AppMethodBeat.o(54136);
    }
    while (true)
    {
      return i;
      if (!p.bSf().nwe.DB())
      {
        i = 3;
        AppMethodBeat.o(54136);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(54136);
      }
    }
  }

  public final int Sg(String paramString)
  {
    AppMethodBeat.i(54151);
    paramString = this.oHH.Sq(paramString);
    int i;
    if (paramString == null)
    {
      i = -1;
      AppMethodBeat.o(54151);
    }
    while (true)
    {
      return i;
      i = ((f.a)paramString.getTag()).oJe.getPosition();
      AppMethodBeat.o(54151);
    }
  }

  public final void a(j.a parama)
  {
    AppMethodBeat.i(54153);
    if (parama == j.a.oGT)
    {
      p.bSd().R(this);
      AppMethodBeat.o(54153);
    }
    while (true)
    {
      return;
      if (parama == j.a.oGU)
      {
        p.bSd().Q(this);
        AppMethodBeat.o(54153);
      }
      else
      {
        if (parama == j.a.oGV)
          com.tencent.mm.bg.e.a(this, 2131304445, null);
        AppMethodBeat.o(54153);
      }
    }
  }

  public final void a(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    AppMethodBeat.i(54152);
    if (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.oIG)
    {
      parame = this.oHH;
      if (parame.oJb > 0L)
        parame.oJb = System.currentTimeMillis();
    }
    AppMethodBeat.o(54152);
  }

  public final void a(String paramString, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54150);
    this.oHH.a(paramString, paramBitmap, paramInt1, paramInt2);
    AppMethodBeat.o(54150);
  }

  public final void a(String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(54149);
    if (p.bSf().bRH())
      this.oHH.a(paramString, paramArrayOfInt, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(54149);
  }

  public final void bGZ()
  {
    AppMethodBeat.i(54141);
    kc localkc = new kc();
    localkc.cFw.action = 0;
    com.tencent.mm.sdk.b.a.xxA.m(localkc);
    this.oHH.jt(true);
    p.bSf().oGq = null;
    p.bSf().stopRing();
    finish();
    AppMethodBeat.o(54141);
  }

  public final void bHa()
  {
    AppMethodBeat.i(54154);
    Object localObject1 = this.oHH;
    Object localObject2 = ((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject1).enf;
    long l = p.bSf().oGk;
    ((TextView)localObject2).setText(String.format("%02d:%02d", new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) }));
    Object localObject3 = p.bSf();
    Object localObject4 = ((com.tencent.mm.plugin.multitalk.model.f)localObject3).oGh.Aqc;
    localObject2 = localObject4;
    if (bo.isNullOrNil((String)localObject4))
      localObject2 = ((com.tencent.mm.plugin.multitalk.model.f)localObject3).oGh.Aqd;
    List localList = p.bSe().oFP.atK((String)localObject2);
    Object localObject5 = p.bSf().oGf;
    if (localList != null)
    {
      localObject2 = ((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject1).oIU.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (f.a)((RelativeLayout)((Iterator)localObject2).next()).getTag();
        localObject3 = ((f.a)localObject4).oJe.getUsername();
        if (((!r.Yz().equals(localObject3)) || (!((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject1).bRh())) && (localList.contains(localObject3)) && (!((HashSet)localObject5).contains(localObject3)))
        {
          ((f.a)localObject4).oJf.setVisibility(0);
          ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "displayVoiceTalkingIcon, %s show", new Object[] { localObject3 });
        }
        else
        {
          ((f.a)localObject4).oJf.setVisibility(8);
          ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "displayVoiceTalkingIcon, %s hide", new Object[] { localObject3 });
        }
      }
    }
    localObject3 = p.bSf();
    localObject4 = ((com.tencent.mm.plugin.multitalk.model.f)localObject3).oGh.Aqc;
    localObject2 = localObject4;
    if (bo.isNullOrNil((String)localObject4))
      localObject2 = ((com.tencent.mm.plugin.multitalk.model.f)localObject3).oGh.Aqd;
    if (n.oHu == null)
      n.oHu = new n();
    localObject3 = n.oHu;
    localObject4 = new ArrayList();
    ((n)localObject3).oHv = com.tencent.wecall.talkroom.model.c.dTg().auE((String)localObject2);
    if (((n)localObject3).oHv != null)
    {
      localObject2 = ((n)localObject3).oHv.dTa().iterator();
      label512: label516: 
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (a.av)((Iterator)localObject2).next();
        int i = ((a.av)localObject3).kyZ;
        if (i >= 0)
        {
          localObject5 = new byte[4];
          if (p.bSe().oFP.setAppCmd(10, (byte[])localObject5, i) < 0)
          {
            ab.d("MicroMsg.Multitalk.VoipNetStatusChecker", "get netStatus failed memberId :%d", new Object[] { Integer.valueOf(i) });
            i = -1;
            label445: if ((i == -1) || (i >= 5))
              break label512;
          }
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label516;
            ((List)localObject4).add(((a.av)localObject3).Aop);
            break;
            i = bo.bf((byte[])localObject5);
            ab.d("MicroMsg.Multitalk.VoipNetStatusChecker", "netStatus: %d", new Object[] { Integer.valueOf(i) });
            break label445;
          }
        }
      }
    }
    localObject1 = ((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject1).oIU.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (f.a)((RelativeLayout)((Iterator)localObject1).next()).getTag();
      if (((List)localObject4).contains(((f.a)localObject2).oJe.getUsername()))
        ((f.a)localObject2).oJg.setVisibility(0);
      else
        ((f.a)localObject2).oJg.setVisibility(8);
    }
    AppMethodBeat.o(54154);
  }

  public final void bNY()
  {
    AppMethodBeat.i(54140);
    this.oHG.bSm();
    this.oHH.o(p.bSf().oGh);
    AppMethodBeat.o(54140);
  }

  public final void bRe()
  {
    AppMethodBeat.i(54142);
    g.KK().KN();
    com.tencent.mm.sdk.g.d.post(new f.6(p.bSf()), "MultiTalkManager_play_end_sound");
    kc localkc = new kc();
    localkc.cFw.action = 0;
    com.tencent.mm.sdk.b.a.xxA.m(localkc);
    this.lda.post(new MultiTalkMainUI.4(this));
    p.bSf().oGq = null;
    p.bSf().stopRing();
    finish();
    AppMethodBeat.o(54142);
  }

  public final void bRf()
  {
    AppMethodBeat.i(54139);
    switch (MultiTalkMainUI.2.oHT[p.bSf().oGg.ordinal()])
    {
    default:
    case 2:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(54139);
      while (true)
      {
        return;
        this.oHH.o(p.bSf().oGh);
        AppMethodBeat.o(54139);
      }
      this.oHG.n(p.bSf().oGh);
    }
  }

  public final void bRg()
  {
    AppMethodBeat.i(54144);
    ab.i("MicroMsg.MT.MultiTalkMainUI", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + p.bSf().oGf.size());
    if (p.bSf().bRH())
    {
      if (p.bSf().oGf.size() <= 0)
        break label113;
      j.bRW();
      p.bSf().bRP();
    }
    while (true)
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.oHH;
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(p.bSf().oGf);
      if (p.bSf().bRG())
        localf.d(localHashSet);
      AppMethodBeat.o(54144);
      return;
      label113: p.bSf().bRQ();
    }
  }

  public final boolean bRh()
  {
    AppMethodBeat.i(54155);
    boolean bool;
    if (this.oHH != null)
    {
      bool = this.oHH.bRh();
      AppMethodBeat.o(54155);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54155);
    }
  }

  public final void bSk()
  {
    AppMethodBeat.i(54137);
    this.oHP = true;
    Intent localIntent = new Intent(this, MultiTalkAddMembersUI.class);
    ArrayList localArrayList = new ArrayList();
    if (p.bSf().oGh != null)
    {
      Iterator localIterator = p.bSf().oGh.Aqg.iterator();
      while (localIterator.hasNext())
      {
        MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
        if ((localMultiTalkGroupMember.status == 10) || (localMultiTalkGroupMember.status == 1))
          localArrayList.add(localMultiTalkGroupMember.Aqh);
      }
      localIntent.putExtra("titile", getString(2131301522));
      localIntent.putExtra("chatroomName", p.bSf().oGh.Aqe);
      localIntent.putExtra("always_select_contact", bo.c(localArrayList, ","));
      localIntent.putExtra("key_need_gallery", false);
      startActivityForResult(localIntent, 1);
    }
    AppMethodBeat.o(54137);
  }

  public final ViewGroup bSl()
  {
    AppMethodBeat.i(54157);
    ViewGroup localViewGroup = (ViewGroup)findViewById(2131826214);
    AppMethodBeat.o(54157);
    return localViewGroup;
  }

  public final void eB(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54147);
    com.tencent.mm.plugin.multitalk.ui.widget.f localf;
    Object localObject;
    if (p.bSf().bRH())
    {
      localf = this.oHH;
      localObject = localf.Sq(r.Yz());
      if (localObject != null)
      {
        localObject = (f.a)((RelativeLayout)localObject).getTag();
        if (!j.zg(paramInt2))
        {
          if (j.zg(paramInt1))
          {
            localf.oIP.setChecked(false);
            ((f.a)localObject).oJe.bSr();
            localf.oIO.setVisibility(8);
            if ((localf.oIZ.equals(r.Yz())) && (localf.oIJ.getVisibility() == 0))
            {
              localf.oIZ = "";
              localf.oII.setVisibility(0);
              localf.oIJ.setVisibility(8);
            }
          }
          localf.js(false);
        }
      }
    }
    label268: label275: 
    while (true)
    {
      localObject = new HashSet();
      ((HashSet)localObject).addAll(p.bSf().oGf);
      if (!j.zh(paramInt2))
      {
        if (!j.zh(paramInt1))
          break label268;
        localf.bSn();
        AppMethodBeat.o(54147);
      }
      while (true)
      {
        return;
        if ((!j.zg(paramInt2)) || (j.zg(paramInt1)))
          break label275;
        localf.oIP.setChecked(true);
        ((f.a)localObject).oJe.bSs();
        ((f.a)localObject).oJh.setVisibility(8);
        al.n(new f.b(localf, (f.a)localObject), 1500L);
        localf.oIO.setVisibility(0);
        break;
        if ((j.zh(paramInt2)) && (!j.zh(paramInt1)))
          localf.d((HashSet)localObject);
        AppMethodBeat.o(54147);
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970266;
  }

  public final void jg(boolean paramBoolean)
  {
    AppMethodBeat.i(54145);
    if (p.bSf().bRH())
      this.oHH.oIQ.setChecked(paramBoolean);
    AppMethodBeat.o(54145);
  }

  public final void jh(boolean paramBoolean)
  {
    AppMethodBeat.i(54146);
    if (p.bSf().bRH())
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.oHH;
      localf.oIR.setChecked(paramBoolean);
      localf.bSp();
    }
    AppMethodBeat.o(54146);
  }

  public final void ji(boolean paramBoolean)
  {
    AppMethodBeat.i(54148);
    if (p.bSf().bRH())
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.oHH;
      if (localf.oIR != null)
        localf.oIR.setEnabled(paramBoolean);
    }
    AppMethodBeat.o(54148);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(54138);
    ab.i("MicroMsg.MT.MultiTalkMainUI", "onActivityResult " + paramInt1 + " resultCode " + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.oHP = false;
    ArrayList localArrayList;
    if ((paramInt2 == -1) && (paramInt1 == 1))
    {
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      ab.i("MicroMsg.MT.MultiTalkMainUI", "add member ".concat(String.valueOf(paramIntent)));
      localArrayList = bo.P(paramIntent.split(","));
      if (localArrayList == null)
        AppMethodBeat.o(54138);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.multitalk.model.f localf = p.bSf();
      if (localf.bRd())
      {
        String str = localf.oGh.Aqc;
        paramIntent = str;
        if (bo.isNullOrNil(str))
          paramIntent = localf.oGh.Aqd;
        p.bSe().oFP.B(paramIntent, localArrayList);
      }
      AppMethodBeat.o(54138);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(54130);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    g.KK().KM();
    int i = getIntent().getIntExtra("enterMainUiSource", 0);
    if ((i == 1) || (i == 2))
    {
      overridePendingTransition(2131034216, 2131034130);
      getWindow().addFlags(6815872);
      if (Build.VERSION.SDK_INT >= 21)
        getWindow().addFlags(67108864);
      p.bSf().bGT();
      if (p.bSf().bRd())
        break label140;
      finish();
      if (i == 2)
        getIntent().getStringExtra("enterMainUiWxGroupId");
      AppMethodBeat.o(54130);
    }
    while (true)
    {
      return;
      overridePendingTransition(2131034267, 2131034268);
      break;
      label140: this.oHG = new com.tencent.mm.plugin.multitalk.ui.widget.c(this);
      this.oHH = new com.tencent.mm.plugin.multitalk.ui.widget.f(this);
      p.bSf().jo(p.bSf().oGb);
      p.bSf().oGq = this;
      paramBundle = new IntentFilter();
      paramBundle.addAction("android.intent.action.SCREEN_OFF");
      registerReceiver(this.oHQ, paramBundle);
      this.oHL = true;
      this.lda = new ak();
      if (!com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 82, "", ""))
        ab.i("MicroMsg.MT.MultiTalkMainUI", "has not audio record permission!");
      if (com.tencent.mm.compatible.util.d.iW(26))
      {
        ab.i("MicroMsg.MT.MultiTalkMainUI", "initScreenObserver");
        this.oHN = new MultiTalkMainUI.ScreenActionReceiver(this);
        paramBundle = new IntentFilter();
        paramBundle.addAction("android.intent.action.SCREEN_OFF");
        paramBundle.addAction("android.intent.action.SCREEN_ON");
        ah.getContext().registerReceiver(this.oHN, paramBundle);
      }
      this.oHJ = ((Notification)getIntent().getParcelableExtra("notification"));
      AppMethodBeat.o(54130);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54133);
    if (this.oHP)
      p.bSf().jn(false);
    if (this.oHL)
      unregisterReceiver(this.oHQ);
    this.oHR.removeCallbacksAndMessages(null);
    this.oHR.sendEmptyMessage(1);
    ab.i("MicroMsg.MT.MultiTalkMainUI", "unbindVoiceServiceIfNeed");
    try
    {
      if ((com.tencent.mm.compatible.util.d.iW(26)) && (this.oHM))
      {
        ah.getContext().unbindService(this);
        this.oHM = false;
      }
      if (com.tencent.mm.compatible.util.d.iW(26))
      {
        ab.i("MicroMsg.MT.MultiTalkMainUI", "unInitScreenObserver");
        if (this.oHN == null);
      }
    }
    catch (Exception localException1)
    {
      try
      {
        ah.getContext().unregisterReceiver(this.oHN);
        this.oHN = null;
        super.onDestroy();
        AppMethodBeat.o(54133);
        return;
        localException1 = localException1;
        ab.printErrStackTrace("MicroMsg.MT.MultiTalkMainUI", localException1, "unbindVoiceServiceIfNeed error: %s", new Object[] { localException1.getMessage() });
      }
      catch (Exception localException2)
      {
        while (true)
          ab.i("MicroMsg.MT.MultiTalkMainUI", "unregisterBatteryChange err:%s", new Object[] { localException2.getMessage() });
      }
    }
  }

  public final void onError(int paramInt)
  {
    AppMethodBeat.i(54143);
    if (paramInt == -1700)
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.oHH;
      ab.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSwitchVideoDisabled");
      localf.js(false);
      p.bSf().zf(1);
      localf.oIP.setChecked(false);
    }
    AppMethodBeat.o(54143);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(54135);
    boolean bool;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      h.a(this, 2131301542, 2131301521, 2131296526, 2131296868, new MultiTalkMainUI.3(this), null);
      AppMethodBeat.o(54135);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (p.bSf().oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oID)
      {
        if ((paramInt == 25) || (paramInt == 24))
        {
          p.bSf().stopRing();
          this.oHK = false;
          AppMethodBeat.o(54135);
          bool = true;
        }
      }
      else if (paramInt == 25)
      {
        g.KK().iK(bHJ());
        AppMethodBeat.o(54135);
        bool = true;
      }
      else if (paramInt == 24)
      {
        g.KK().iJ(bHJ());
        AppMethodBeat.o(54135);
        bool = true;
      }
      else
      {
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(54135);
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(54132);
    KeyguardManager localKeyguardManager = (KeyguardManager)ah.getContext().getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)ah.getContext().getSystemService("power");
    boolean bool1 = localKeyguardManager.inKeyguardRestrictedInputMode();
    boolean bool2 = hasWindowFocus();
    boolean bool3 = localPowerManager.isScreenOn();
    if (((bool2) || (!bool1)) && (bool3));
    for (bool3 = true; ; bool3 = false)
    {
      this.oHI = bool3;
      ab.i("MicroMsg.MT.MultiTalkMainUI", "onPause, screenOn: %b", new Object[] { Boolean.valueOf(this.oHI) });
      if (p.bSf().bRH())
      {
        p.bSf().bRQ();
        this.oHH.js(true);
      }
      super.onPause();
      AppMethodBeat.o(54132);
      return;
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(54156);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      ab.e("MicroMsg.MT.MultiTalkMainUI", "[multitalk]onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(54156);
      return;
    }
    ab.d("MicroMsg.MT.MultiTalkMainUI", "[multitalk] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 82:
    case 22:
    }
    while (true)
    {
      AppMethodBeat.o(54156);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        ab.d("MicroMsg.MT.MultiTalkMainUI", "granted record audio!");
        AppMethodBeat.o(54156);
        break;
      }
      h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131296868), false, new MultiTalkMainUI.6(this), new MultiTalkMainUI.7(this));
      AppMethodBeat.o(54156);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        ab.d("MicroMsg.MT.MultiTalkMainUI", "granted record camera!");
        AppMethodBeat.o(54156);
        break;
      }
      h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new MultiTalkMainUI.8(this), new MultiTalkMainUI.9(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(54131);
    ab.i("MicroMsg.MT.MultiTalkMainUI", "onResume");
    super.onResume();
    switch (MultiTalkMainUI.2.oHT[p.bSf().oGg.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      if (p.bSf().bRH())
      {
        if (p.bSf().bRF())
          this.oHH.jr(true);
        this.lda.postDelayed(this.oHO, 2000L);
      }
      AppMethodBeat.o(54131);
      return;
      this.oHH.oIL.setVisibility(8);
      this.oHG.n(p.bSf().oGh);
      if (at.is4G(this))
        p.bSd().R(this);
      while (this.oHK)
      {
        p.bSf().jp(false);
        break;
        if ((at.is2G(this)) || (at.is3G(this)))
          p.bSd().Q(this);
      }
      this.oHG.bSm();
      this.oHH.o(p.bSf().oGh);
      if (at.is4G(this))
        p.bSd().R(this);
      while (true)
      {
        p.bSf().jp(true);
        break;
        if ((at.is2G(this)) || (at.is3G(this)))
          p.bSd().Q(this);
      }
      this.oHG.bSm();
      this.oHH.o(p.bSf().oGh);
    }
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
  }

  public void onStop()
  {
    AppMethodBeat.i(54134);
    if ((!this.oHP) && (this.oHI))
      p.bSf().jn(false);
    super.onStop();
    AppMethodBeat.o(54134);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI
 * JD-Core Version:    0.6.2
 */