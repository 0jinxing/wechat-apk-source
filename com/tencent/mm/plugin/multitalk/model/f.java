package com.tencent.mm.plugin.multitalk.model;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.v.c;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ey;
import com.tencent.mm.g.a.nw;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.y;
import com.tencent.mm.storage.z;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.am;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;

public final class f
  implements ServiceConnection, com.tencent.pb.talkroom.sdk.a
{
  public boolean eif;
  private com.tencent.mm.compatible.util.b gar;
  private boolean nvf;
  public com.tencent.mm.plugin.voip.video.i nwe;
  c oGA;
  private boolean oGa;
  public boolean oGb;
  boolean oGc;
  private int oGd;
  public boolean oGe;
  public HashSet<String> oGf;
  public com.tencent.mm.plugin.multitalk.ui.widget.e oGg;
  public MultiTalkGroup oGh;
  private l oGi;
  private long oGj;
  public int oGk;
  private int oGl;
  private int oGm;
  private boolean oGn;
  private long oGo;
  private long oGp;
  public b oGq;
  private Timer oGr;
  private j.a oGs;
  public boolean oGt;
  MultiTalkGroup oGu;
  long oGv;
  private boolean oGw;
  com.tencent.mm.sdk.platformtools.ap oGx;
  private com.tencent.mm.sdk.platformtools.ak oGy;
  BroadcastReceiver oGz;

  public f()
  {
    AppMethodBeat.i(53955);
    this.oGe = true;
    this.oGf = new HashSet();
    this.oGg = com.tencent.mm.plugin.multitalk.ui.widget.e.oIC;
    this.oGh = null;
    this.oGj = 0L;
    this.oGk = 0;
    this.oGl = 0;
    this.oGm = 2;
    this.oGn = false;
    this.oGo = 0L;
    this.oGp = 30000L;
    this.oGu = null;
    this.oGv = 0L;
    this.oGw = false;
    this.oGx = new com.tencent.mm.sdk.platformtools.ap(Looper.getMainLooper(), new ap.a()
    {
      public final boolean BI()
      {
        boolean bool = false;
        AppMethodBeat.i(53949);
        ab.v("MicroMsg.MT.MultiTalkManager", "voip repeat check is foreground");
        if (f.a(f.this) == null)
        {
          f.b(f.this);
          f.c(f.this).stopTimer();
          AppMethodBeat.o(53949);
        }
        while (true)
        {
          return bool;
          if (f.eB(ah.getContext()))
          {
            f.this.b(f.a(f.this));
            f.d(f.this);
            f.b(f.this);
            f.c(f.this).stopTimer();
            com.tencent.mm.plugin.report.service.h.pYm.a(500L, 7L, 1L, false);
            AppMethodBeat.o(53949);
          }
          else if (System.currentTimeMillis() - f.e(f.this) < 60000L)
          {
            bool = true;
            AppMethodBeat.o(53949);
          }
          else
          {
            f.d(f.this);
            f.b(f.this);
            f.c(f.this).stopTimer();
            AppMethodBeat.o(53949);
          }
        }
      }
    }
    , true);
    this.oGy = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
    this.oGz = new f.2(this);
    this.oGA = new f.4(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.oGA);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.PHONE_STATE");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE_2");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE2");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE_EXT");
    localIntentFilter.addAction("android.intent.action.DUAL_PHONE_STATE");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    ah.getContext().registerReceiver(this.oGz, localIntentFilter);
    this.nwe = new com.tencent.mm.plugin.voip.video.i(ah.getContext());
    this.gar = new com.tencent.mm.compatible.util.b(ah.getContext());
    this.oGt = false;
    AppMethodBeat.o(53955);
  }

  public static void Si(String paramString)
  {
    AppMethodBeat.i(53968);
    ab.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
    bi localbi = new bi();
    localbi.setType(64);
    localbi.eJ(System.currentTimeMillis());
    localbi.setStatus(6);
    localbi.setContent(ah.getContext().getString(2131301573));
    if (n.ms(paramString))
    {
      localbi.ju(paramString);
      localbi.setContent(localbi.field_content);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
    }
    AppMethodBeat.o(53968);
  }

  private static void a(MultiTalkGroup paramMultiTalkGroup, com.tencent.mm.plugin.multitalk.ui.widget.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(53969);
    ab.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
    if ((parame == com.tencent.mm.plugin.multitalk.ui.widget.e.oID) && (paramBoolean))
    {
      parame = new bi();
      parame.setType(64);
      parame.eJ(System.currentTimeMillis());
      parame.setStatus(6);
      parame.setContent(ah.getContext().getString(2131301573));
      if (n.ms(paramMultiTalkGroup.Aqe))
      {
        parame.ju(paramMultiTalkGroup.Aqe);
        parame.setContent(parame.field_content);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(parame);
      }
    }
    AppMethodBeat.o(53969);
  }

  private boolean a(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(53962);
    boolean bool;
    if (!bRd())
    {
      ab.i("MicroMsg.MT.MultiTalkManager", "first time update multitalk group: %s", new Object[] { j.h(paramMultiTalkGroup) });
      this.oGh = paramMultiTalkGroup;
      this.oGk = 0;
      this.oGd = 1;
      this.oGf.clear();
      bRI();
      sort();
      AppMethodBeat.o(53962);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (j.a(paramMultiTalkGroup, this.oGh))
      {
        ab.i("MicroMsg.MT.MultiTalkManager", "update multitalk group: %s", new Object[] { j.h(paramMultiTalkGroup) });
        MultiTalkGroup localMultiTalkGroup = this.oGh;
        HashMap localHashMap = new HashMap();
        Iterator localIterator = paramMultiTalkGroup.Aqg.iterator();
        Object localObject;
        while (localIterator.hasNext())
        {
          localObject = (MultiTalkGroupMember)localIterator.next();
          localHashMap.put(((MultiTalkGroupMember)localObject).Aqh, localObject);
        }
        localIterator = localMultiTalkGroup.Aqg.iterator();
        while (localIterator.hasNext())
        {
          localObject = (MultiTalkGroupMember)localIterator.next();
          if ((!r.Yz().equals(((MultiTalkGroupMember)localObject).Aqh)) && (r.Yz().equals(((MultiTalkGroupMember)localObject).Aqi)) && (((MultiTalkGroupMember)localObject).status == 1) && ((!localHashMap.containsKey(((MultiTalkGroupMember)localObject).Aqh)) || (((MultiTalkGroupMember)localHashMap.get(((MultiTalkGroupMember)localObject).Aqh)).status == 20)))
          {
            localObject = ((MultiTalkGroupMember)localObject).Aqh;
            localObject = ah.getContext().getString(2131301567, new Object[] { s.mJ((String)localObject) });
            localObject = com.tencent.mm.pluginsdk.ui.e.j.b(ah.getContext(), (CharSequence)localObject);
            Toast.makeText(ah.getContext(), (CharSequence)localObject, 0).show();
          }
        }
        this.oGh = paramMultiTalkGroup;
        bRI();
        sort();
        AppMethodBeat.o(53962);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.MT.MultiTalkManager", "updateCurrentMultiTalkGroup: not same multitalk\ncurrentGroup=%s\nchangeGroup=%s", new Object[] { j.h(this.oGh), j.h(paramMultiTalkGroup) });
        AppMethodBeat.o(53962);
        bool = false;
      }
    }
  }

  private void aKY()
  {
    AppMethodBeat.i(53996);
    if (this.oGr != null)
    {
      this.oGr.cancel();
      this.oGr = null;
    }
    AppMethodBeat.o(53996);
  }

  private void arh()
  {
    AppMethodBeat.i(53995);
    ab.i("MicroMsg.MT.MultiTalkManager", "startTimeCount");
    if (this.oGr != null)
    {
      this.oGr.cancel();
      AppMethodBeat.o(53995);
    }
    while (true)
    {
      return;
      this.oGj = System.currentTimeMillis();
      this.oGk = 0;
      this.oGr = new Timer();
      f.3 local3 = new f.3(this);
      this.oGr.schedule(local3, 1000L, 1000L);
      AppMethodBeat.o(53995);
    }
  }

  private void b(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    boolean bool = true;
    AppMethodBeat.i(53994);
    Object localObject = this.oGg;
    this.oGg = parame;
    if (localObject != parame)
      if (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.oIG)
      {
        localObject = new nw();
        ((nw)localObject).cKn.type = 1;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        e.a(j.k(this.oGh), getTotalTime(), j.l(this.oGh));
        p.bSf().stopRing();
        if ((com.tencent.mm.compatible.b.g.KK().KV()) || (com.tencent.mm.compatible.b.g.KK().KP()))
          break label128;
      }
    while (true)
    {
      jo(bool);
      if (this.oGq != null)
        this.oGq.a(parame);
      AppMethodBeat.o(53994);
      return;
      label128: bool = false;
    }
  }

  private void bRI()
  {
    AppMethodBeat.i(53964);
    Iterator localIterator = this.oGh.Aqg.iterator();
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if ((localMultiTalkGroupMember.status != 10) && (this.oGf.remove(localMultiTalkGroupMember.Aqh)))
        ab.i("MicroMsg.MT.MultiTalkManager", "remove video user according group %s", new Object[] { localMultiTalkGroupMember.Aqh });
    }
    AppMethodBeat.o(53964);
  }

  private void bRJ()
  {
    AppMethodBeat.i(53973);
    if (this.oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oIE);
    while (true)
    {
      boolean bool = false;
      for (f localf = this; ; localf = this)
      {
        localf.oGb = bool;
        this.eif = false;
        this.oGs = j.bRX();
        AppMethodBeat.o(53973);
        return;
        if ((com.tencent.mm.compatible.b.g.KK().KV()) || (com.tencent.mm.compatible.b.g.KK().KP()))
          break;
        bool = true;
      }
    }
  }

  private void bRK()
  {
    AppMethodBeat.i(53977);
    Object localObject;
    if (j.i(this.oGh))
    {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.oIG);
      if (this.oGq == null)
        break label73;
      this.oGq.bNY();
      localObject = j.bRX();
      if (localObject != this.oGs)
        this.oGs = ((j.a)localObject);
      AppMethodBeat.o(53977);
    }
    while (true)
    {
      return;
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.oIF);
      break;
      label73: localObject = new Intent();
      com.tencent.mm.bp.d.b(ah.getContext(), "multitalk", ".ui.MultiTalkMainUI", (Intent)localObject);
      AppMethodBeat.o(53977);
    }
  }

  private void bRO()
  {
    AppMethodBeat.i(53988);
    try
    {
      ab.i("MicroMsg.MT.MultiTalkManager", "unBindSmallServiceIfNeed");
      if ((com.tencent.mm.compatible.util.d.iW(26)) && (this.oGw))
      {
        ah.getContext().unbindService(this);
        this.oGw = false;
      }
      AppMethodBeat.o(53988);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MT.MultiTalkManager", localException, "unBind VoipSmallService error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(53988);
      }
    }
  }

  private static boolean bRR()
  {
    AppMethodBeat.i(53999);
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)ah.getContext().getSystemService("phone");
      if (localTelephonyManager != null)
      {
        i = localTelephonyManager.getCallState();
        switch (i)
        {
        default:
          bool = false;
        case 0:
        case 1:
        case 2:
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          int i;
          ab.i("MicroMsg.MT.MultiTalkManager", "TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(53999);
          return bool;
          bool = false;
          continue;
          bool = true;
          continue;
          localException1 = localException1;
          bool = false;
          ab.e("MicroMsg.MT.MultiTalkManager", "get callState error , errMsg is %s", new Object[] { localException1.getLocalizedMessage() });
          continue;
        }
        catch (Exception localException2)
        {
          continue;
        }
        boolean bool = false;
      }
    }
  }

  private void c(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(53972);
    ab.c("MicroMsg.MT.MultiTalkManager", "enterNewMultiTalk", new Object[0]);
    if (a(paramMultiTalkGroup))
    {
      this.oGa = false;
      bRJ();
      arh();
      paramMultiTalkGroup = new Intent();
      com.tencent.mm.bp.d.b(ah.getContext(), "multitalk", ".ui.MultiTalkMainUI", paramMultiTalkGroup);
    }
    AppMethodBeat.o(53972);
  }

  private static boolean eA(Context paramContext)
  {
    AppMethodBeat.i(54000);
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    boolean bool;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      ab.d("MicroMsg.MT.MultiTalkManager", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        ab.i("MicroMsg.MT.MultiTalkManager", "is in backGround.");
        AppMethodBeat.o(54000);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      if (((KeyguardManager)ah.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode())
      {
        AppMethodBeat.o(54000);
        bool = false;
      }
      else
      {
        ab.i("MicroMsg.MT.MultiTalkManager", "is in foreGround.");
        AppMethodBeat.o(54000);
        bool = true;
      }
    }
  }

  private void jh(boolean paramBoolean)
  {
    AppMethodBeat.i(53981);
    ab.i("MicroMsg.MT.MultiTalkManager", "onSpeakerStateChange %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.oGb = paramBoolean;
    if (this.oGq != null)
      this.oGq.jh(this.oGb);
    AppMethodBeat.o(53981);
  }

  private void sort()
  {
    AppMethodBeat.i(53963);
    ab.v("MicroMsg.MT.MultiTalkManager", "before sort: %s", new Object[] { this.oGh.Aqg });
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.oGh.Aqg.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if (!localMultiTalkGroupMember.Aqh.equals(r.Yz()))
        localLinkedList.add(localMultiTalkGroupMember);
      else
        localObject = localMultiTalkGroupMember;
    }
    Collections.sort(localLinkedList, new f.1(this));
    Collections.sort(localLinkedList, new f.7(this));
    Collections.sort(localLinkedList, new f.8(this));
    if (localObject != null)
      localLinkedList.add(localObject);
    this.oGh.Aqg = localLinkedList;
    ab.v("MicroMsg.MT.MultiTalkManager", "after sort: %s", new Object[] { this.oGh.Aqg });
    AppMethodBeat.o(53963);
  }

  public final boolean Sj(String paramString)
  {
    AppMethodBeat.i(53993);
    boolean bool;
    if (bRH())
    {
      ab.i("MicroMsg.MT.MultiTalkManager", "ownerUserName : ".concat(String.valueOf(paramString)));
      bool = p.bSe().oFP.Sj(paramString);
      ab.i("MicroMsg.MT.MultiTalkManager", "result of subscribeLargeVideo: ".concat(String.valueOf(bool)));
      AppMethodBeat.o(53993);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53993);
    }
  }

  public final void b(Activity paramActivity, String paramString1, String paramString2)
  {
    AppMethodBeat.i(53965);
    boolean bool1 = this.eif;
    boolean bool2 = this.oGb;
    boolean bool3 = this.oGe;
    Object localObject = this.oGg.toString();
    boolean bool4;
    if (this.oGh == null)
    {
      bool4 = true;
      ab.i("MicroMsg.MT.MultiTalkManager", "createMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), localObject, Boolean.valueOf(bool4) });
      e.bRt();
      if (!bRR())
        break label125;
      com.tencent.mm.ui.base.h.g(paramActivity, 2131300615, 2131297061);
      AppMethodBeat.o(53965);
    }
    while (true)
    {
      return;
      bool4 = false;
      break;
      label125: if (com.tencent.mm.plugin.voip.a.d.cLw())
      {
        com.tencent.mm.ui.base.h.g(paramActivity, 2131300619, 2131297061);
        AppMethodBeat.o(53965);
      }
      else if (com.tencent.mm.plugin.voip.a.d.cLx())
      {
        com.tencent.mm.ui.base.h.g(paramActivity, 2131300618, 2131297061);
        AppMethodBeat.o(53965);
      }
      else if (com.tencent.mm.bg.e.akK())
      {
        com.tencent.mm.ui.base.h.g(paramActivity, 2131300614, 2131297061);
        AppMethodBeat.o(53965);
      }
      else if (com.tencent.mm.plugin.voip.a.d.cLy())
      {
        com.tencent.mm.ui.base.h.g(paramActivity, 2131300617, 2131297061);
        AppMethodBeat.o(53965);
      }
      else if (bRd())
      {
        com.tencent.mm.bg.e.a(paramActivity, 2131301542, null);
        AppMethodBeat.o(53965);
      }
      else
      {
        if ((!this.oGn) || (System.currentTimeMillis() - this.oGo >= this.oGp))
          break label295;
        com.tencent.mm.bg.e.a(paramActivity, 2131301559, null);
        AppMethodBeat.o(53965);
      }
    }
    label295: this.oGn = false;
    paramActivity = bo.P(paramString1.split(","));
    MultiTalkGroup localMultiTalkGroup = new MultiTalkGroup();
    localMultiTalkGroup.Aqd = p.bSe().oFP.dPQ();
    localMultiTalkGroup.Aqe = paramString2;
    localObject = paramActivity.iterator();
    if (((Iterator)localObject).hasNext())
    {
      paramString1 = (String)((Iterator)localObject).next();
      MultiTalkGroupMember localMultiTalkGroupMember = new MultiTalkGroupMember();
      localMultiTalkGroupMember.Aqh = paramString1;
      if (paramString1.equals(r.Yz()));
      for (localMultiTalkGroupMember.status = 10; ; localMultiTalkGroupMember.status = 1)
      {
        localMultiTalkGroup.Aqg.add(localMultiTalkGroupMember);
        break;
      }
    }
    p.bSe().oFP.bR(bo.h((Integer)com.tencent.mm.kernel.g.RP().eJH.get(1)), r.Yz());
    if (p.bSe().oFP.f(localMultiTalkGroup.Aqd, paramString2, paramActivity))
      e.bRr();
    while (true)
    {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.oIE);
      c(localMultiTalkGroup);
      AppMethodBeat.o(53965);
      break;
      e.bRs();
    }
  }

  public final void b(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(53971);
    boolean bool1 = this.eif;
    boolean bool2 = this.oGb;
    boolean bool3 = this.oGe;
    Object localObject = this.oGg.toString();
    boolean bool4;
    if (this.oGh == null)
    {
      bool4 = true;
      ab.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), localObject, Boolean.valueOf(bool4) });
      e.bRu();
      if ((com.tencent.mm.m.f.ME()) || (eA(ah.getContext())))
        break label183;
      ab.i("MicroMsg.MT.MultiTalkManager", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
      if ((this.oGu == null) && (this.oGx.doT()))
      {
        this.oGu = paramMultiTalkGroup;
        this.oGx.ae(2000L, 2000L);
        this.oGv = System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.h.pYm.a(500L, 6L, 1L, false);
      }
      AppMethodBeat.o(53971);
    }
    while (true)
    {
      return;
      bool4 = false;
      break;
      label183: String str = j.m(paramMultiTalkGroup);
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
      if (com.tencent.mm.m.g.Nu().getInt("MultitalkBlockReceiver", 0) == 0);
      for (int i = 1; ; i = 0)
      {
        if ((i != 0) && (localObject != null) && (!((ad)localObject).Oa()))
          break label292;
        ab.i("MicroMsg.MT.MultiTalkManager", "not open multitalk receiver or black user");
        al.n(new f.11(this, paramMultiTalkGroup), 1000L);
        e.aR(3, j.l(paramMultiTalkGroup));
        AppMethodBeat.o(53971);
        break;
      }
      label292: if ((!bRd()) && (!com.tencent.mm.plugin.voip.a.d.cLx()) && (!com.tencent.mm.plugin.voip.a.d.cLw()) && (!com.tencent.mm.bg.e.akK()))
        if (((TelephonyManager)ah.getContext().getSystemService("phone")).getCallState() == 0)
          break label463;
      label463: for (i = 1; ; i = 0)
      {
        if ((i == 0) && (!com.tencent.mm.plugin.voip.a.d.cLy()) && (com.tencent.mm.n.a.jh(((com.tencent.mm.g.c.ap)localObject).field_type)))
          break label469;
        ab.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: exit multitalk: %s", new Object[] { j.h(paramMultiTalkGroup) });
        if (!n.mr(paramMultiTalkGroup.Aqe))
        {
          ab.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramMultiTalkGroup.Aqe });
          ao.a.flu.a(paramMultiTalkGroup.Aqe, "", new f.12(this));
        }
        al.n(new f.13(this, paramMultiTalkGroup), 1000L);
        e.aR(3, j.l(paramMultiTalkGroup));
        AppMethodBeat.o(53971);
        break;
      }
      label469: if (!n.mr(paramMultiTalkGroup.Aqe))
      {
        ab.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramMultiTalkGroup.Aqe });
        ao.a.flu.a(paramMultiTalkGroup.Aqe, "", null);
      }
      ab.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: %s", new Object[] { j.h(paramMultiTalkGroup) });
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.oID);
      e.aR(1, j.l(paramMultiTalkGroup));
      if (!com.tencent.mm.n.a.jh(((com.tencent.mm.g.c.ap)localObject).field_type))
      {
        ab.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk nofriend do not show invitingUI  inviter=%s,currentuser=%s", new Object[] { str, r.Yz() });
        if (a(paramMultiTalkGroup))
        {
          this.oGa = false;
          bRJ();
          arh();
          AppMethodBeat.o(53971);
        }
      }
      else
      {
        ab.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk friend show invitingUI inviter=%s,currentuser=%s", new Object[] { str, r.Yz() });
        c(paramMultiTalkGroup);
        AppMethodBeat.o(53971);
      }
    }
  }

  public final void bGT()
  {
    AppMethodBeat.i(53987);
    this.nvf = false;
    com.tencent.mm.plugin.voip.b.cIk().dismiss();
    ((NotificationManager)ah.getContext().getSystemService("notification")).cancel(43);
    bRO();
    AppMethodBeat.o(53987);
  }

  public final boolean bRF()
  {
    AppMethodBeat.i(53956);
    j.bRW();
    boolean bool = j.zg(this.oGd);
    AppMethodBeat.o(53956);
    return bool;
  }

  public final boolean bRG()
  {
    AppMethodBeat.i(53957);
    j.bRW();
    boolean bool = j.zh(this.oGd);
    AppMethodBeat.o(53957);
    return bool;
  }

  public final boolean bRH()
  {
    AppMethodBeat.i(53959);
    if ((this.oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oIF) || (this.oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oIG));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkStarting %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(53959);
      return bool;
    }
  }

  public final void bRL()
  {
    AppMethodBeat.i(53979);
    ab.i("MicroMsg.MT.MultiTalkManager", "onMultiTalkReady");
    AppMethodBeat.o(53979);
  }

  public final void bRM()
  {
    AppMethodBeat.i(53982);
    ab.i("MicroMsg.MT.MultiTalkManager", "onSwitchMultiTalkVideoSuss currentVideoAction %d", new Object[] { Integer.valueOf(this.oGd) });
    AppMethodBeat.o(53982);
  }

  public final void bRN()
  {
    AppMethodBeat.i(53983);
    ab.i("MicroMsg.MT.MultiTalkManager", "onSubscribeLargeVideoSuss ");
    AppMethodBeat.o(53983);
  }

  public final void bRP()
  {
    AppMethodBeat.i(53989);
    ab.i("MicroMsg.MT.MultiTalkManager", "try to startNetworkReceiver");
    if (this.oGq == null)
    {
      ab.e("MicroMsg.MT.MultiTalkManager", "ui callback is null");
      AppMethodBeat.o(53989);
    }
    while (true)
    {
      return;
      if (this.oGf.size() == 0)
      {
        ab.i("MicroMsg.MT.MultiTalkManager", "currentVideoUserSet.size() is 0,just return.");
        AppMethodBeat.o(53989);
      }
      else
      {
        if (this.oGi == null)
        {
          ab.i("MicroMsg.MT.MultiTalkManager", "startNetworkReceiver: networkReceiver is null %d", new Object[] { Integer.valueOf(this.oGf.size()) });
          this.oGi = new l(this.oGq);
          this.oGi.zi(this.oGf.size());
        }
        if (!this.oGi.running)
          this.oGi.start();
        AppMethodBeat.o(53989);
      }
    }
  }

  public final void bRQ()
  {
    AppMethodBeat.i(53990);
    ab.i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkReceiver");
    if (this.oGi != null)
    {
      this.oGi.stop();
      this.oGi = null;
    }
    AppMethodBeat.o(53990);
  }

  public final boolean bRc()
  {
    AppMethodBeat.i(53960);
    if (this.oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oIG);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkTalking %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(53960);
      return bool;
    }
  }

  public final boolean bRd()
  {
    AppMethodBeat.i(53958);
    if ((this.oGg != com.tencent.mm.plugin.multitalk.ui.widget.e.oIC) && (this.oGh != null));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkConnecting %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(53958);
      return bool;
    }
  }

  public final void c(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(53967);
    if (!n.mr(paramString1))
    {
      ab.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramString1 });
      ao.a.flu.a(paramString1, "", new ao.b.a()
      {
        public final void o(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
        }
      });
    }
    bi localbi = new bi();
    localbi.setType(64);
    localbi.eJ(System.currentTimeMillis());
    localbi.setStatus(6);
    localbi.hO(2);
    String str = s.mJ(paramString2);
    Object localObject = paramString2;
    if (str != null)
      if (!str.equals(""))
        break label400;
    label391: label400: for (localObject = paramString2; ; localObject = str)
    {
      paramString2 = (String)localObject + ah.getContext().getString(2131301571);
      localbi.setContent(paramString2);
      if (n.ms(paramString1))
      {
        localbi.ju(paramString1);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aoZ(paramString1);
        if (localObject != null)
        {
          if (paramBoolean1)
            ((com.tencent.mm.storage.ak)localObject).hM(((at)localObject).field_unReadCount + 1);
          ((com.tencent.mm.storage.ak)localObject).setContent(paramString2);
          if (((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().a((com.tencent.mm.storage.ak)localObject, paramString1) == -1)
            ab.e("MicroMsg.MT.MultiTalkManager", "update cvs fail!!! for :".concat(String.valueOf(paramString1)));
          if (!paramBoolean2)
            break label391;
          ((aq)((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification()).a(localbi);
          AppMethodBeat.o(53967);
        }
      }
      while (true)
      {
        return;
        localObject = new com.tencent.mm.storage.ak();
        ((com.tencent.mm.storage.ak)localObject).setUsername(paramString1);
        if (paramBoolean1)
          ((com.tencent.mm.storage.ak)localObject).hM(1);
        ((com.tencent.mm.storage.ak)localObject).setContent(paramString2);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().d((com.tencent.mm.storage.ak)localObject);
        if (paramBoolean2)
          ((aq)((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification()).a(localbi);
        AppMethodBeat.o(53967);
      }
    }
  }

  public final void cr(List<a.am> paramList)
  {
    AppMethodBeat.i(53985);
    if (bRd())
    {
      this.oGf.clear();
      ab.d("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange: %s", new Object[] { paramList });
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        a.am localam = (a.am)paramList.next();
        if ((localam.Aoq == 2) || (localam.Aoq == 3))
          this.oGf.add(localam.Aop);
      }
      this.oGf.remove(r.Yz());
      ab.i("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange %s", new Object[] { this.oGf });
      if (this.oGi != null)
        this.oGi.zi(this.oGf.size());
      if (this.oGq != null)
        this.oGq.bRg();
    }
    AppMethodBeat.o(53985);
  }

  public final void d(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(53974);
    e.aR(2, j.l(paramMultiTalkGroup));
    a(paramMultiTalkGroup, com.tencent.mm.plugin.multitalk.ui.widget.e.oID, true);
    AppMethodBeat.o(53974);
  }

  public final void e(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(53975);
    ab.i("MicroMsg.MT.MultiTalkManager", "onCreateMultiTalk: %s", new Object[] { j.h(paramMultiTalkGroup) });
    e.jl(true);
    if (a(paramMultiTalkGroup))
      bRK();
    AppMethodBeat.o(53975);
  }

  public final void f(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(53976);
    ab.i("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk: %s", new Object[] { j.h(paramMultiTalkGroup) });
    nw localnw = new nw();
    localnw.cKn.type = 1;
    com.tencent.mm.sdk.b.a.xxA.m(localnw);
    e.jm(true);
    if (this.oGg != com.tencent.mm.plugin.multitalk.ui.widget.e.oID)
    {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.oIF);
      c(paramMultiTalkGroup);
    }
    if ((bRd()) && (a(paramMultiTalkGroup)))
      bRK();
    AppMethodBeat.o(53976);
  }

  public final void g(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(53978);
    ab.i("MicroMsg.MT.MultiTalkManager", "onMemberChange: %s", new Object[] { j.h(paramMultiTalkGroup) });
    if ((bRd()) && (a(paramMultiTalkGroup)))
      if (!j.j(this.oGh))
        if (this.oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oID)
        {
          h(false, true, false);
          AppMethodBeat.o(53978);
        }
    while (true)
    {
      return;
      h(false, false, false);
      AppMethodBeat.o(53978);
      continue;
      if ((this.oGg != com.tencent.mm.plugin.multitalk.ui.widget.e.oIG) && (j.i(paramMultiTalkGroup)))
        b(com.tencent.mm.plugin.multitalk.ui.widget.e.oIG);
      if ((this.oGq != null) && (j.c(this.oGg)))
        this.oGq.bRf();
      AppMethodBeat.o(53978);
    }
  }

  public final long getTotalTime()
  {
    AppMethodBeat.i(53961);
    long l1 = System.currentTimeMillis();
    long l2 = this.oGj;
    AppMethodBeat.o(53961);
    return l1 - l2;
  }

  public final void h(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 4;
    AppMethodBeat.i(53966);
    ab.i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: isReject %b isMissCall %b isPhoneCall %b isNetworkError %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.FALSE, Boolean.valueOf(paramBoolean3) });
    p.bSf().stopRing();
    Object localObject;
    boolean bool;
    long l;
    if (bRd())
    {
      localObject = new nw();
      ((nw)localObject).cKn.type = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = j.l(this.oGh);
      e.Sh((String)localObject);
      if (this.oGg != com.tencent.mm.plugin.multitalk.ui.widget.e.oIG)
      {
        bool = j.k(this.oGh);
        l = getTotalTime();
        if (bool)
          if (!paramBoolean2);
      }
    }
    while (true)
    {
      e.a(bool, l, (String)localObject, i);
      label147: localObject = this.oGg;
      if (this.oGq != null)
        this.oGq.bRe();
      this.oGg = com.tencent.mm.plugin.multitalk.ui.widget.e.oIC;
      bRQ();
      bGT();
      aKY();
      p.bSd().reset();
      p.bSg().bRZ();
      if (this.oGh != null)
      {
        a(this.oGh, (com.tencent.mm.plugin.multitalk.ui.widget.e)localObject, paramBoolean2);
        String str = this.oGh.Aqc;
        localObject = str;
        if (bo.isNullOrNil(str))
          localObject = this.oGh.Aqd;
        p.bSe().oFP.Sa((String)localObject);
        this.oGh = null;
      }
      this.oGd = 0;
      this.oGb = true;
      this.eif = false;
      this.oGe = true;
      this.oGj = 0L;
      this.oGk = 0;
      this.oGf.clear();
      this.oGl = 0;
      localObject = new ey();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      while (true)
      {
        bRO();
        AppMethodBeat.o(53966);
        return;
        if (paramBoolean1)
        {
          i = 1;
          break;
        }
        if (paramBoolean3)
        {
          i = 5;
          break;
        }
        i = 2;
        break;
        if (paramBoolean2)
        {
          if (l >= 45L)
          {
            i = 6;
            break;
          }
          i = 8;
          break;
        }
        if (paramBoolean1)
        {
          i = 7;
          break;
        }
        if (!paramBoolean3)
          break label486;
        i = 10;
        break;
        e.zd(this.oGk);
        e.q(this.oGk, (String)localObject);
        break label147;
        bRQ();
        bGT();
        aKY();
        this.oGh = null;
        this.oGd = 0;
        this.oGj = 0L;
        this.oGk = 0;
        this.oGf.clear();
        this.oGg = com.tencent.mm.plugin.multitalk.ui.widget.e.oIC;
        this.oGl = 0;
      }
      label486: i = 0;
    }
  }

  public final void jg(boolean paramBoolean)
  {
    AppMethodBeat.i(53980);
    this.eif = paramBoolean;
    if (this.oGq != null)
      this.oGq.jg(this.eif);
    AppMethodBeat.o(53980);
  }

  public final void ji(boolean paramBoolean)
  {
    AppMethodBeat.i(54001);
    if ((p.bSf().bRH()) && (this.oGq != null))
    {
      ab.i("MicroMsg.MT.MultiTalkManager", "setHandFreeEnable: %s", new Object[] { Boolean.valueOf(paramBoolean) });
      this.oGq.ji(paramBoolean);
    }
    AppMethodBeat.o(54001);
  }

  public final void jn(boolean paramBoolean)
  {
    AppMethodBeat.i(53986);
    if (bRd())
      if (this.nvf)
        AppMethodBeat.o(53986);
    while (true)
    {
      return;
      this.nvf = true;
      e.f(j.bRU(), p.bSf().bRF(), paramBoolean);
      Toast.makeText(ah.getContext(), 2131301555, 0).show();
      Object localObject1 = ah.getContext().getString(2131301521);
      String str = ah.getContext().getString(2131301560);
      Object localObject2 = new Intent();
      ((Intent)localObject2).setClass(ah.getContext(), MultiTalkMainUI.class);
      localObject2 = PendingIntent.getActivity(ah.getContext(), 43, (Intent)localObject2, 134217728);
      int i = 2130839733;
      if (com.tencent.mm.compatible.util.d.fP(19))
        i = 2130839731;
      localObject1 = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(str).j(System.currentTimeMillis()).d((CharSequence)localObject1).e(str);
      ((v.c)localObject1).EI = ((PendingIntent)localObject2);
      localObject1 = com.tencent.mm.plugin.voip.a.d.c((v.c)localObject1);
      ((Notification)localObject1).icon = i;
      ((Notification)localObject1).flags |= 32;
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().a(43, (Notification)localObject1, false);
      if (this.oGq != null)
        this.oGq.bGZ();
      al.d(new f.14(this, (Notification)localObject1));
      AppMethodBeat.o(53986);
    }
  }

  public final void jo(boolean paramBoolean)
  {
    AppMethodBeat.i(53991);
    p.bSe().oFP.jo(paramBoolean);
    jh(paramBoolean);
    AppMethodBeat.o(53991);
  }

  public final void jp(boolean paramBoolean)
  {
    AppMethodBeat.i(53997);
    if (this.oGa)
      AppMethodBeat.o(53997);
    while (true)
    {
      return;
      this.nwe.ao(1, paramBoolean);
      this.gar.requestFocus();
      this.oGa = true;
      AppMethodBeat.o(53997);
    }
  }

  public final void jq(boolean paramBoolean)
  {
    AppMethodBeat.i(54002);
    ab.c("MicroMsg.MT.MultiTalkManager", "setHandsFreeUIStatus: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.oGc = paramBoolean;
    AppMethodBeat.o(54002);
  }

  public final void k(int paramInt, Object paramObject)
  {
    int i = 2131301538;
    AppMethodBeat.i(53970);
    ab.i("MicroMsg.MT.MultiTalkManager", "onErr: %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUV, Integer.valueOf(-1));
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUW, Long.valueOf(-1L));
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case -600:
    case -100:
    case -200:
    case -300:
    case -400:
    case -500:
    case -700:
    case -800:
    case -900:
    case -1000:
    case -1100:
    case -1200:
    case -1300:
    case -14256:
    case -1400:
    case -14255:
    case -1700:
    case -401:
    }
    while (true)
    {
      if (this.oGq != null)
        this.oGq.onError(paramInt);
      if ((paramInt != -800) && (paramInt != -500) && (paramInt != -1700))
      {
        Toast.makeText(ah.getContext(), ah.getContext().getString(j), 0).show();
        h(false, false, true);
      }
      AppMethodBeat.o(53970);
      return;
      e.jl(false);
      j = 2131301527;
      continue;
      e.jm(false);
      j = 2131301534;
      continue;
      j = 2131301535;
      continue;
      j = 2131301536;
      continue;
      j = 2131301537;
      continue;
      j = 2131301539;
      continue;
      j = 2131301540;
      continue;
      j = 2131301541;
      continue;
      j = 2131301528;
      continue;
      j = 2131301529;
      continue;
      j = 2131301530;
      continue;
      i = 2131301531;
      this.oGn = true;
      this.oGo = System.currentTimeMillis();
      j = i;
      if (paramObject != null)
      {
        paramObject = (a.z)paramObject;
        j = i;
        if (paramObject != null)
        {
          ab.i("MicroMsg.MT.MultiTalkManager", "ErrorCode : -1300, now try set retrySeconds:" + paramObject.AnW);
          j = i;
          if (paramObject.AnW != 0)
          {
            this.oGp = (paramObject.AnW * 1000);
            j = i;
            continue;
            ab.i("MicroMsg.MT.MultiTalkManager", "14256,other device has handle this!");
            i = 2131301533;
            j = i;
            if (paramObject != null)
            {
              j = i;
              if ((a.aa)paramObject != null)
              {
                com.tencent.wecall.talkroom.model.a.dSR().ru(false);
                j = i;
                continue;
                j = 2131301532;
                continue;
                MultiTalkGroup localMultiTalkGroup = this.oGh;
                if (this.oGh != null);
                for (String str = this.oGh.Aqe; ; str = "")
                {
                  ab.i("MicroMsg.MT.MultiTalkManager", "onErr:MULTITALK_E_Talk_Enter_BannerClear  %d, currentMultiTalkGroup=%s,wxGroupId=%s", new Object[] { Integer.valueOf(paramInt), localMultiTalkGroup, str });
                  if (paramObject != null)
                  {
                    paramObject = (a.aa)paramObject;
                    if (paramObject != null)
                    {
                      ab.i("MicroMsg.MT.MultiTalkManager", "ErrorCode :-14255,now exitMultiTalk for groupId : " + paramObject.groupId);
                      if (paramObject.Amz != null)
                      {
                        p.bSh().Sc(paramObject.Amz.AoT);
                        ab.i("MicroMsg.MT.MultiTalkManager", "cleanBanner for wxGroupId :" + paramObject.Amz.AoT);
                      }
                      if (!p.bSe().oFP.Sa(paramObject.groupId))
                        ab.i("MicroMsg.MT.MultiTalkManager", "exit fail!!,now cleanBanner for groupId :" + paramObject.groupId);
                    }
                  }
                  j = 2131301569;
                  break;
                }
                ab.i("MicroMsg.MT.MultiTalkManager", "onErr, MULTITALK_ERRORCODE_SWITCHVIDEO_FAIL_DISABLE, disableTime: %s", new Object[] { paramObject });
                Toast.makeText(ah.getContext(), ah.getContext().getString(2131301524), 0).show();
                if (paramObject != null)
                {
                  j = ((Integer)paramObject).intValue();
                  if (j > 0)
                  {
                    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUV, Integer.valueOf(j));
                    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUW, Long.valueOf(bo.yz()));
                  }
                }
                j = 2131301524;
                continue;
                ab.i("MicroMsg.MT.MultiTalkManager", "onErr, MULTITALK_ERRORCODE_ENGINE_NETWORK_FAIL");
                j = 2131301557;
              }
            }
          }
        }
      }
    }
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
  }

  public final void stopRing()
  {
    AppMethodBeat.i(53998);
    com.tencent.mm.sdk.g.d.post(new f.5(this), "MultiTalkManager_stop_ring");
    AppMethodBeat.o(53998);
  }

  public final void ze(int paramInt)
  {
    AppMethodBeat.i(53984);
    ab.i("MicroMsg.MT.MultiTalkManager", "onNotifyLargeVideoSubscribersChange largeVideoSubscribersCnt: ".concat(String.valueOf(paramInt)));
    if (paramInt > 0)
    {
      this.oGt = true;
      AppMethodBeat.o(53984);
    }
    while (true)
    {
      return;
      this.oGt = false;
      AppMethodBeat.o(53984);
    }
  }

  public final boolean zf(int paramInt)
  {
    AppMethodBeat.i(53992);
    boolean bool;
    if (bRH())
    {
      ab.i("MicroMsg.MT.MultiTalkManager", "try switch to action : ".concat(String.valueOf(paramInt)));
      bool = p.bSe().oFP.zf(paramInt);
      ab.i("MicroMsg.MT.MultiTalkManager", "switchMultiTalkVideo %b", new Object[] { Boolean.valueOf(bool) });
      int i = this.oGd;
      this.oGd = paramInt;
      if (bRG())
      {
        bRP();
        if ((this.oGq != null) && (i != this.oGd))
          this.oGq.eB(i, this.oGd);
        AppMethodBeat.o(53992);
      }
    }
    while (true)
    {
      return bool;
      bRQ();
      break;
      AppMethodBeat.o(53992);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f
 * JD-Core Version:    0.6.2
 */