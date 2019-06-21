package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.model.a.c;
import com.tencent.mm.protocal.protobuf.cpm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bs;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public final class s
  implements k.a
{
  private static int hGc = -1;
  private static int sTl = -1;
  static int sTm = 20;
  WifiManager bJj;
  public k sNl;
  private Object sTi;
  com.tencent.mm.plugin.voip.video.i sTj;
  private int sTk;
  public String sTn;
  int sTo;
  Timer sTp;
  WifiInfo sTq;
  private ap sTr;
  private byte[] sTs;
  ap sTt;
  private ap sTu;
  private ap sTv;

  public s()
  {
    AppMethodBeat.i(4649);
    this.sTi = new Object();
    this.sTk = 0;
    this.sTp = null;
    this.sTr = new ap(Looper.getMainLooper(), new s.1(this), false);
    this.sTs = new byte[500];
    this.sTt = new ap(Looper.getMainLooper(), new s.2(this), true);
    this.sTu = new ap(Looper.getMainLooper(), new s.3(this), true);
    this.sTv = new ap(Looper.getMainLooper(), new s.4(this), true);
    this.sNl = l.cIW();
    this.sNl.a(this);
    this.sTj = new com.tencent.mm.plugin.voip.video.i(ah.getContext());
    AppMethodBeat.o(4649);
  }

  public static void a(int paramInt1, long paramLong, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
  {
    AppMethodBeat.i(4668);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipServiceEx", "doAck roomId " + paramInt1 + "  roomKey " + paramLong + " status " + paramInt2);
    if ((paramInt1 != 0) && (paramLong != 0L))
      new com.tencent.mm.plugin.voip.model.a.a(paramInt1, paramLong, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramString).cKw();
    AppMethodBeat.o(4668);
  }

  private void cKf()
  {
    AppMethodBeat.i(4653);
    ab.d("MicroMsg.Voip.VoipServiceEx", "reset");
    this.sTu.stopTimer();
    this.sTr.stopTimer();
    this.sTt.stopTimer();
    this.sTv.stopTimer();
    this.sTk = 0;
    AppMethodBeat.o(4653);
  }

  public static boolean cKh()
  {
    AppMethodBeat.i(4656);
    boolean bool;
    if (((TelephonyManager)ah.getContext().getSystemService("phone")).getCallState() != 0)
    {
      bool = true;
      AppMethodBeat.o(4656);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4656);
    }
  }

  public final void Gh(int paramInt)
  {
    AppMethodBeat.i(4670);
    this.sNl.Gh(paramInt);
    AppMethodBeat.o(4670);
  }

  public final void Gw(int paramInt)
  {
    AppMethodBeat.i(4654);
    this.sNl.Gd(paramInt);
    AppMethodBeat.o(4654);
  }

  public final void Gx(int paramInt)
  {
    AppMethodBeat.i(4675);
    if (this.sTj != null)
      this.sTj.Gx(paramInt);
    AppMethodBeat.o(4675);
  }

  public final void Gy(int paramInt)
  {
    AppMethodBeat.i(4679);
    this.sTk = paramInt;
    if (!this.sTv.doT())
      this.sTv.stopTimer();
    this.sTv.ae(70000L, 70000L);
    AppMethodBeat.o(4679);
  }

  public final int R(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = -1;
    AppMethodBeat.i(4663);
    cKr();
    if (!this.sTv.doT())
      this.sTv.stopTimer();
    this.sNl.sPp.sVH.cJd();
    ab.i("MicroMsg.Voip.VoipServiceEx", "accept onlyAudio:".concat(String.valueOf(paramBoolean1)));
    if (!this.sNl.cII())
    {
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to accept with calling, status =" + this.sNl.mStatus);
      AppMethodBeat.o(4663);
    }
    while (true)
    {
      return i;
      if (this.sNl.sPp.nwu == 0)
      {
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to accept with roomid = 0. ");
        AppMethodBeat.o(4663);
      }
      else
      {
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.Mq() + "accept invite, roomid:" + this.sNl.sPp.nwu);
        this.sTu.ae(50000L, 50000L);
        this.sNl.sPp.sVH.cJe();
        new com.tencent.mm.plugin.voip.model.a.b(1, this.sNl.sPp.netType, this.sNl.sPp.nwu, this.sNl.sPp.field_peerId, this.sNl.sPp.field_capInfo, this.sNl.sPp.nwv, paramBoolean1, paramBoolean2).cKw();
        this.sNl.setStatus(4);
        this.sNl.sPr.kzf = 1;
        this.sNl.cJn = true;
        i = 0;
        AppMethodBeat.o(4663);
      }
    }
  }

  public final boolean a(cpm paramcpm)
  {
    int i = 1;
    boolean bool = false;
    AppMethodBeat.i(4662);
    if (this.sNl.cIJ())
    {
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to setInviteContent during calling, status =" + this.sNl.mStatus);
      AppMethodBeat.o(4662);
    }
    while (true)
    {
      return bool;
      if (paramcpm == null)
      {
        AppMethodBeat.o(4662);
      }
      else
      {
        this.sNl.sPp.sVH.sQp = paramcpm.xmL;
        ab.d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + this.sNl.sPp.sVH.sQp);
        if (this.sNl.sPp.cKK())
        {
          com.tencent.mm.plugin.voip.a.a.Logw("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.Mq() + "v2protocal already init.");
          this.sNl.sPp.mx(false);
          this.sNl.sPp.reset();
        }
        this.sNl.a(paramcpm);
        if ((com.tencent.mm.plugin.voip.a.d.cLw()) || (com.tencent.mm.r.a.Oo()) || (com.tencent.mm.plugin.voip.a.d.cLz()))
        {
          ab.e("MicroMsg.Voip.VoipServiceEx", "setInviteContent, reject, pstn/multitak/f2f talking");
          if (com.tencent.mm.plugin.voip.a.d.cLw())
          {
            a(paramcpm.wem, paramcpm.wen, 2, null, null, paramcpm.xmT);
            AppMethodBeat.o(4662);
          }
          else
          {
            cKl();
            label262: String str;
            if (paramcpm.xmL == 0)
            {
              str = paramcpm.xmT;
              if (i == 0)
                break label303;
            }
            label303: for (paramcpm = bi.xZc; ; paramcpm = bi.xZb)
            {
              q.a(str, paramcpm, 0, 6, ah.getContext().getString(2131304365));
              break;
              i = 0;
              break label262;
            }
          }
        }
        else if (this.sNl.sPp.cEb() < 0)
        {
          com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
          AppMethodBeat.o(4662);
        }
        else
        {
          if (v2protocal.sVJ != null)
            v2protocal.sVJ.a(this.sNl);
          h.pYm.a(11524, true, true, new Object[] { Integer.valueOf(paramcpm.wem), Long.valueOf(paramcpm.wen), Integer.valueOf(paramcpm.xmL), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
          this.sNl.sPq.cJy();
          AppMethodBeat.o(4662);
          bool = true;
        }
      }
    }
  }

  public final boolean cIJ()
  {
    AppMethodBeat.i(4655);
    boolean bool;
    if (this.sNl.cIJ())
    {
      bool = true;
      AppMethodBeat.o(4655);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4655);
    }
  }

  public final int cIt()
  {
    AppMethodBeat.i(138372);
    int i = this.sNl.cIt();
    AppMethodBeat.o(138372);
    return i;
  }

  public final boolean cKg()
  {
    if (this.sNl.sPp.nwu != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cKi()
  {
    AppMethodBeat.i(4657);
    if (this.sNl.cIJ())
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "checkStartup failed, stauts = " + this.sNl.mStatus);
    com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "checkStartup...devicekey = " + bs.dut());
    this.sNl.cIF();
    cKf();
    com.tencent.mm.compatible.e.q.ku(com.tencent.mm.kernel.g.RP().Rz().dur());
    AppMethodBeat.o(4657);
  }

  public final int cKj()
  {
    int i = 2;
    AppMethodBeat.i(4660);
    ab.i("MicroMsg.Voip.VoipServiceEx", "cancelCall, roomId:" + this.sNl.sPp.nwu);
    if ((this.sNl.sPp.nwu == 0) && (this.sNl.sPp.nwx == 0))
    {
      reset();
      i = -1;
      AppMethodBeat.o(4660);
      return i;
    }
    this.sNl.sPp.sVH.sQe = this.sNl.cIH();
    this.sNl.sPp.sVH.sQq = 3;
    if (this.sNl.mStatus < 6)
      this.sNl.sPp.sVH.sQs = 1;
    h localh = h.pYm;
    int j = com.tencent.mm.plugin.voip.b.cIj().cJZ();
    long l1 = com.tencent.mm.plugin.voip.b.cIj().cKa();
    long l2 = com.tencent.mm.plugin.voip.b.cIj().cIK();
    if (this.sNl.mStatus == 5);
    while (true)
    {
      localh.a(11521, true, true, new Object[] { Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()) });
      i = cKk();
      AppMethodBeat.o(4660);
      break;
      i = 1;
    }
  }

  public final int cKk()
  {
    int i = -1;
    AppMethodBeat.i(4661);
    if (!this.sNl.cIJ())
    {
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call ,as not in calling.");
      AppMethodBeat.o(4661);
    }
    while (true)
    {
      return i;
      ab.i("MicroMsg.Voip.VoipServiceEx", "cancelCallEx, roomId:%d, msgID:%d, inviteId:%d", new Object[] { Integer.valueOf(this.sNl.sPp.nwu), Integer.valueOf(this.sNl.sPp.sTW), Integer.valueOf(this.sNl.sPp.nwx) });
      synchronized (this.sTi)
      {
        if ((this.sNl.sPp.nwu == 0) && (this.sNl.sPp.nwx == 0))
        {
          com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call with roomid = 0 and inviteId = 0 ");
          AppMethodBeat.o(4661);
          continue;
        }
        if (this.sNl.sPp.cKK())
        {
          localObject2 = this.sNl.sPp.mx(true);
          if (((String)localObject2).length() > 0)
          {
            localObject3 = new com/tencent/mm/plugin/voip/model/a/c;
            ((c)localObject3).<init>(this.sNl.sPp.nwu, this.sNl.sPp.nwv, this.sNl.sPp.nMl, (String)localObject2, this.sNl.sPp.nwx);
            ((c)localObject3).cKw();
          }
        }
        Object localObject2 = this.sNl.sPp.sVH;
        ((n)localObject2).sQz = ((int)(System.currentTimeMillis() - ((n)localObject2).sQJ));
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("devin:cancelInvite:");
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.VoipDailReport", ((n)localObject2).sQz);
        if ((this.sNl.sPp.sUo == 0) && (this.sNl.sPp.sUp == 0))
          this.sNl.cIG();
        this.sNl.Gf(this.sTj.cLN());
        this.sNl.sPp.sVH.sQO = this.sNl.sPq.cJG();
        if (com.tencent.mm.plugin.voip.b.cIj().sSQ != null)
        {
          this.sNl.sPp.sVH.sQR = com.tencent.mm.plugin.voip.b.cIj().sSQ.sRT;
          this.sNl.sPp.sVH.sQP = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQP / 1000L);
          this.sNl.sPp.sVH.sQQ = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQQ / 1000L);
        }
        String str1 = v2protocal.cKO();
        localObject3 = this.sNl.sPp.cKP();
        localObject2 = this.sNl.sPp.cKR();
        String str2 = this.sNl.sPp.cKG();
        String str3 = this.sNl.sPp.cKI();
        String[] arrayOfString = this.sNl.sPp.cKQ();
        if (((String)localObject3).length() > 0)
        {
          com.tencent.mm.plugin.voip.model.a.l locall = new com/tencent/mm/plugin/voip/model/a/l;
          locall.<init>(str1, (String)localObject3, str2, (String)localObject2, str3, arrayOfString);
          locall.cKw();
        }
        this.sNl.cIE();
        reset();
        this.sNl.sPp.nwu = 0;
        this.sNl.sPp.nwx = 0;
        AppMethodBeat.o(4661);
        i = 0;
      }
    }
  }

  public final int cKl()
  {
    int i = -1;
    AppMethodBeat.i(4664);
    ab.i("MicroMsg.Voip.VoipServiceEx", "reject");
    if (!this.sNl.cII())
    {
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to reject with calling, status =" + this.sNl.mStatus);
      AppMethodBeat.o(4664);
    }
    while (true)
    {
      return i;
      synchronized (this.sTi)
      {
        if (this.sNl.sPp.nwu == 0)
        {
          com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
          AppMethodBeat.o(4664);
          continue;
        }
        this.sNl.sPp.sVH.cJe();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(" reject, status:");
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", this.sNl.mStatus + " roomid:" + this.sNl.sPp.nwu);
        localObject2 = new com/tencent/mm/plugin/voip/model/a/b;
        i = this.sNl.sPp.netType;
        int j = this.sNl.sPp.nwu;
        long l = this.sNl.sPp.nwv;
        ((com.tencent.mm.plugin.voip.model.a.b)localObject2).<init>(2, i, j, new byte[0], new byte[0], l, false, false);
        ((com.tencent.mm.plugin.voip.model.a.b)localObject2).cKw();
        if ((this.sNl.sPp.sUo == 0) && (this.sNl.sPp.sUp == 0))
          this.sNl.cIG();
        this.sNl.Gf(this.sTj.cLN());
        this.sNl.sPp.sVH.sQO = this.sNl.sPq.cJG();
        if (com.tencent.mm.plugin.voip.b.cIj().sSQ != null)
        {
          this.sNl.sPp.sVH.sQR = com.tencent.mm.plugin.voip.b.cIj().sSQ.sRT;
          this.sNl.sPp.sVH.sQP = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQP / 1000L);
          this.sNl.sPp.sVH.sQQ = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQQ / 1000L);
        }
        if (this.sNl.sPp.cKK())
          this.sNl.sPp.mx(true);
        String str1 = v2protocal.cKO();
        String str2 = this.sNl.sPp.cKP();
        localObject2 = this.sNl.sPp.cKR();
        String str3 = this.sNl.sPp.cKG();
        String str4 = this.sNl.sPp.cKI();
        String[] arrayOfString = this.sNl.sPp.cKQ();
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", "devin: statreport");
        if (str2.length() > 0)
        {
          com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() > 0");
          com.tencent.mm.plugin.voip.model.a.l locall = new com/tencent/mm/plugin/voip/model/a/l;
          locall.<init>(str1, str2, str3, (String)localObject2, str4, arrayOfString);
          locall.cKw();
          this.sNl.cIE();
          reset();
          this.sNl.sPp.nwu = 0;
          AppMethodBeat.o(4664);
          i = 0;
          continue;
        }
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() <= 0");
      }
    }
  }

  public final int cKm()
  {
    AppMethodBeat.i(4665);
    ab.i("MicroMsg.Voip.VoipServiceEx", "hangUp");
    int i;
    if (this.sNl.sPp.nwu == 0)
    {
      this.sNl.sPr.cIY();
      reset();
      i = 0;
      AppMethodBeat.o(4665);
    }
    while (true)
    {
      return i;
      this.sNl.sPp.sVH.sQe = this.sNl.cIH();
      i = cKn();
      AppMethodBeat.o(4665);
    }
  }

  public final int cKn()
  {
    AppMethodBeat.i(4666);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipServiceEx", "hangUp,status:" + this.sNl.mStatus + " roomid:" + this.sNl.sPp.nwu + ",threadid = " + Thread.currentThread().getId());
    this.sNl.sPr.cIY();
    if (this.sNl.sPp.sVH.sQo == 1)
    {
      ??? = this.sNl.sPp.sVH;
      if (((n)???).sQF != 0L)
        break label601;
      ((n)???).sQy = 0;
    }
    while (true)
    {
      if (((n)???).sQy < 0)
      {
        ((n)???).sQy = 0;
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.VoipDailReport", "devin:endTalk, iCallTime Err, rest 0");
      }
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipDailReport", "devin:endTalk:" + ((n)???).sQy);
      synchronized (this.sTi)
      {
        int i = this.sNl.sPp.sVH.sQq;
        if ((this.sNl.sPp.nwu != 0) || (8 == i) || (9 == i) || (10 == i) || (11 == i) || (12 == i) || (99 == i))
        {
          this.sNl.sPq.cJD();
          com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipServiceEx", "steve:hangUp, uninitGLRender before protocalUninit first!!");
          if (this.sNl.sPp.cKK())
          {
            str1 = this.sNl.sPp.mx(true);
            if (str1.length() > 0)
            {
              localObject2 = new com/tencent/mm/plugin/voip/model/a/i;
              ((com.tencent.mm.plugin.voip.model.a.i)localObject2).<init>(this.sNl.sPp.nwu, this.sNl.sPp.nwv, str1);
              ((com.tencent.mm.plugin.voip.model.a.i)localObject2).cKw();
              com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "devin: shutdown cgi ");
            }
          }
          this.sNl.sPp.sVH.sQO = this.sNl.sPq.cJG();
          if (com.tencent.mm.plugin.voip.b.cIj().sSQ != null)
          {
            this.sNl.sPp.sVH.sQR = com.tencent.mm.plugin.voip.b.cIj().sSQ.sRT;
            this.sNl.sPp.sVH.sQP = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQP / 1000L);
            this.sNl.sPp.sVH.sQQ = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQQ / 1000L);
          }
          this.sNl.Gf(this.sTj.cLN());
          String str2 = v2protocal.cKO();
          String str3 = this.sNl.sPp.cKP();
          Object localObject2 = this.sNl.sPp.cKR();
          String str4 = this.sNl.sPp.cKG();
          String str1 = this.sNl.sPp.cKI();
          String[] arrayOfString = this.sNl.sPp.cKQ();
          if (str3.length() > 0)
          {
            com.tencent.mm.plugin.voip.model.a.l locall = new com/tencent/mm/plugin/voip/model/a/l;
            locall.<init>(str2, str3, str4, (String)localObject2, str1, arrayOfString);
            locall.cKw();
            com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "devin: statreport cgi ");
          }
          this.sNl.cIE();
          reset();
          this.sNl.sPp.nwu = 0;
          com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", "hangUp over");
          AppMethodBeat.o(4666);
          return 0;
          label601: ((n)???).sQy = ((int)((System.currentTimeMillis() - ((n)???).sQF) / 1000L));
          continue;
        }
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "call hangUp roomId == 0 ");
      }
    }
  }

  public final int cKo()
  {
    int i = -1;
    AppMethodBeat.i(4667);
    ab.i("MicroMsg.Voip.VoipServiceEx", "ignoreInvite");
    if (!this.sNl.cII())
    {
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to ignore with calling, status =" + this.sNl.mStatus);
      AppMethodBeat.o(4667);
    }
    while (true)
    {
      return i;
      synchronized (this.sTi)
      {
        if (this.sNl.sPp.nwu == 0)
        {
          com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
          AppMethodBeat.o(4667);
          continue;
        }
        com.tencent.mm.plugin.voip.model.a.b localb = new com/tencent/mm/plugin/voip/model/a/b;
        i = this.sNl.sPp.netType;
        int j = this.sNl.sPp.nwu;
        long l = this.sNl.sPp.nwv;
        localb.<init>(3, i, j, new byte[0], new byte[0], l, false, false);
        localb.cKw();
        reset();
        this.sNl.sPp.nwu = 0;
        AppMethodBeat.o(4667);
        i = 0;
      }
    }
  }

  public final void cKp()
  {
    AppMethodBeat.i(4676);
    if (this.sTj != null)
      this.sTj.r(2131232110, 0, false);
    AppMethodBeat.o(4676);
  }

  public final boolean cKq()
  {
    AppMethodBeat.i(4678);
    boolean bool;
    if (this.sTj != null)
    {
      bool = this.sTj.DB();
      AppMethodBeat.o(4678);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(4678);
    }
  }

  public final void cKr()
  {
    AppMethodBeat.i(4680);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
    this.sTr.stopTimer();
    this.sTr.ae(60000L, 60000L);
    AppMethodBeat.o(4680);
  }

  public final int dp(String paramString, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(4659);
    ab.i("MicroMsg.Voip.VoipServiceEx", "call username:%s, callType:%d, inviteType:%d", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
    if (bo.isNullOrNil(paramString))
    {
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed call without valid username.");
      AppMethodBeat.o(4659);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if (this.sNl.cIJ())
      {
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed call withing calling.");
        AppMethodBeat.o(4659);
        paramInt = i;
      }
      else
      {
        this.sNl.sPp.sTY = 1;
        this.sNl.sPp.nMl = paramString;
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.Mq() + "call username:" + paramString);
        if (this.sNl.sPp.cKK())
        {
          com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.Mq() + "v2protocal already init.");
          this.sNl.sPp.mx(false);
          this.sNl.sPp.reset();
        }
        if (this.sNl.sPp.cEb() < 0)
        {
          com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
          AppMethodBeat.o(4659);
          paramInt = i;
        }
        else
        {
          if (this.sNl.sPp.sVI != null)
            this.sNl.sPp.sVI.sNl = this.sNl;
          if (v2protocal.sVJ != null)
            v2protocal.sVJ.a(this.sNl);
          this.sTu.ae(50000L, 50000L);
          this.sNl.sPp.nwx = ((int)System.currentTimeMillis());
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(paramString);
          new com.tencent.mm.plugin.voip.model.a.g(localArrayList, this.sNl.sPp.field_peerId, this.sNl.sPp.field_capInfo, this.sNl.sPp.netType, paramInt, this.sNl.sPp.nwx).cKw();
          this.sNl.setStatus(2);
          this.sNl.sPr.kzf = 1;
          this.sTr.ae(60000L, 60000L);
          this.sNl.sPp.sVH.sQJ = System.currentTimeMillis();
          this.sNl.sPp.sVH.beginTime = System.currentTimeMillis();
          this.sNl.sPp.sVH.sQp = paramInt;
          ab.d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + this.sNl.sPp.sVH.sQp);
          AppMethodBeat.o(4659);
          paramInt = 0;
        }
      }
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(4651);
    stop();
    super.finalize();
    AppMethodBeat.o(4651);
  }

  public final boolean mj(boolean paramBoolean)
  {
    AppMethodBeat.i(4672);
    paramBoolean = this.sNl.sPr.mj(paramBoolean);
    AppMethodBeat.o(4672);
    return paramBoolean;
  }

  public final int mo(boolean paramBoolean)
  {
    AppMethodBeat.i(4673);
    int i = this.sNl.mo(paramBoolean);
    AppMethodBeat.o(4673);
    return i;
  }

  public final int mp(boolean paramBoolean)
  {
    AppMethodBeat.i(4674);
    int i = this.sNl.mp(paramBoolean);
    AppMethodBeat.o(4674);
    return i;
  }

  public final void reset()
  {
    AppMethodBeat.i(4652);
    ab.d("MicroMsg.Voip.VoipServiceEx", "reset");
    this.sNl.reset();
    this.sTu.stopTimer();
    this.sTr.stopTimer();
    this.sTt.stopTimer();
    this.sTv.stopTimer();
    if (this.sTp != null)
    {
      this.sTp.cancel();
      this.sTp = null;
    }
    this.sTk = 0;
    com.tencent.mm.plugin.voip.b.cIj().sRK = null;
    AppMethodBeat.o(4652);
  }

  public final int setNetSignalValue(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4669);
    paramInt1 = this.sNl.sPp.setNetSignalValue(paramInt1, paramInt2);
    AppMethodBeat.o(4669);
    return paramInt1;
  }

  public final void stop()
  {
    AppMethodBeat.i(4650);
    ab.i("MicroMsg.Voip.VoipServiceEx", "stop");
    reset();
    this.sNl.a(null);
    AppMethodBeat.o(4650);
  }

  public final void stopRing()
  {
    AppMethodBeat.i(4677);
    if (this.sTj != null)
      this.sTj.stop();
    AppMethodBeat.o(4677);
  }

  public final void v(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(4658);
    ab.i("MicroMsg.Voip.VoipServiceEx", "onFinishVoIP finishType: ".concat(String.valueOf(paramInt1)));
    switch (paramInt1)
    {
    case 2:
    case 3:
    default:
    case 4:
    case 5:
    case 6:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(4658);
      while (true)
      {
        return;
        cKn();
        this.sNl.sPq.onReject();
        AppMethodBeat.o(4658);
        continue;
        cKn();
        this.sNl.sPq.cJA();
        AppMethodBeat.o(4658);
        continue;
        cKn();
        this.sNl.sPq.cJC();
        AppMethodBeat.o(4658);
      }
      cKn();
      this.sNl.sPq.onError(paramInt2, paramString);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.s
 * JD-Core Version:    0.6.2
 */