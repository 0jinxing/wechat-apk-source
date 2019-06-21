package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.ai.h.c;
import com.tencent.mm.ai.h.d;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.af;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.chatting.c.as;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class d
  implements h.a, h.b, h.c, h.d, g.a, af, com.tencent.mm.modelvoice.c, SensorController.a
{
  private static SensorController mfW;
  public com.tencent.mm.ui.chatting.d.a cgL;
  public Context context;
  private int coq;
  private boolean cos;
  boolean isRecording;
  public com.tencent.mm.ai.h mfO;
  public boolean mfP;
  private boolean mfR;
  private bf mfS;
  long mfT;
  private List<bi> yGN;
  public long yGO;
  private o yGP;
  as yGQ;
  public o yGR;
  public boolean yGS;
  public boolean yGT;
  public boolean yGU;
  private long yGV;
  private long yGW;
  public boolean yGX;
  private boolean yGY;
  public com.tencent.mm.sdk.b.c yGZ;
  private ak yHa;
  private ak yHb;

  public d(com.tencent.mm.ui.chatting.d.a parama, as paramas, String paramString)
  {
    AppMethodBeat.i(30411);
    this.isRecording = false;
    this.yGO = -1L;
    this.mfT = -1L;
    this.yGT = true;
    this.yGU = false;
    this.cos = false;
    this.yGV = 0L;
    this.yGW = 0L;
    this.yGX = false;
    this.yGY = false;
    this.yGZ = new d.1(this);
    this.yHa = new d.2(this, Looper.getMainLooper());
    this.yHb = new d.3(this, Looper.getMainLooper());
    this.mfR = false;
    this.context = parama.yTx.getContext();
    this.cgL = parama;
    this.yGQ = paramas;
    if (mfW == null)
      mfW = new SensorController(this.context.getApplicationContext());
    if (this.mfS == null)
      this.mfS = new bf(this.context.getApplicationContext());
    aqZ(paramString);
    com.tencent.mm.sdk.b.a.xxA.c(this.yGZ);
    aw.Cc().a(this);
    AppMethodBeat.o(30411);
  }

  private void aWv()
  {
    AppMethodBeat.i(30426);
    al.d(new d.5(this));
    AppMethodBeat.o(30426);
  }

  private void dBy()
  {
    AppMethodBeat.i(30420);
    int i = this.yGN.size();
    int j = 0;
    int k = -1;
    if (j < i)
    {
      if (((bi)this.yGN.get(j)).field_msgId != this.yGO)
        break label109;
      k = j;
    }
    label109: 
    while (true)
    {
      j++;
      break;
      if (k != -1)
        this.yGN.remove(k);
      ab.d("MicroMsg.AutoPlay", "remove voice msg : size = " + this.yGN.size());
      AppMethodBeat.o(30420);
      return;
    }
  }

  private boolean isScreenEnable()
  {
    AppMethodBeat.i(30434);
    boolean bool;
    if (this.cgL != null)
    {
      bool = this.cgL.yTx.getController().ylz;
      AppMethodBeat.o(30434);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30434);
    }
  }

  private void setScreenEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(30433);
    if (this.cgL != null)
      this.cgL.yTx.getController().setScreenEnable(paramBoolean);
    AppMethodBeat.o(30433);
  }

  public final void EA()
  {
    AppMethodBeat.i(30428);
    ab.v("MicroMsg.AutoPlay", "voice play completion isSpeakerOn %b, %d, %d", new Object[] { Boolean.valueOf(this.mfP), Long.valueOf(this.yGO), Long.valueOf(this.yGW) });
    com.tencent.mm.plugin.report.service.h.pYm.e(15160, new Object[] { Long.valueOf(this.yGO), Long.valueOf(this.yGW), Long.valueOf(this.yGW), Integer.valueOf(0) });
    if (this.context != null)
    {
      ab.i("MicroMsg.AutoPlay", "stop play complete");
      aj.amB("keep_app_silent");
      this.yGQ.releaseWakeLock();
      dBy();
      if ((this.yGN.isEmpty()) && (this.cos))
      {
        g.KK().KN();
        this.cos = false;
      }
      g.KK().b(this);
      if (this.yGN.isEmpty())
      {
        mfW.dps();
        this.mfS.dpt();
      }
      aWv();
      this.yGO = -1L;
      dBC();
      this.yGQ.releaseWakeLock();
      qn(false);
    }
    AppMethodBeat.o(30428);
  }

  public final void J(bi parambi)
  {
    AppMethodBeat.i(30418);
    if ((this.yGT) && (this.yGN.isEmpty()))
      AppMethodBeat.o(30418);
    while (true)
    {
      return;
      if ((parambi == null) || (!parambi.drD()) || (parambi.field_isSend == 1))
      {
        AppMethodBeat.o(30418);
      }
      else if ((parambi.field_talker == null) || (!parambi.field_talker.equals(this.cgL.getTalkerUserName())))
      {
        AppMethodBeat.o(30418);
      }
      else if ((!aw.Rg().foreground) || (!this.cgL.caA))
      {
        AppMethodBeat.o(30418);
      }
      else if (com.tencent.mm.modelvoice.q.L(parambi))
      {
        ab.e("MicroMsg.AutoPlay", "should not in this route");
        AppMethodBeat.o(30418);
      }
      else
      {
        au(parambi);
        if ((!this.isRecording) && (!this.mfO.isPlaying()) && (bo.cv(this.context)))
          qn(true);
        AppMethodBeat.o(30418);
      }
    }
  }

  public final void Od(int paramInt)
  {
    AppMethodBeat.i(30414);
    while (true)
    {
      if (this.context == null)
      {
        ab.e("MicroMsg.AutoPlay", "context is null");
        AppMethodBeat.o(30414);
      }
      bi localbi;
      while (true)
      {
        return;
        if (this.cgL == null)
        {
          ab.e("MicroMsg.AutoPlay", "add next failed: null mChattingContext");
          AppMethodBeat.o(30414);
        }
        else
        {
          int i = ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).getCount();
          ab.d("MicroMsg.AutoPlay", "position : " + paramInt + "adapter getCount = " + i);
          if ((paramInt < 0) || (paramInt >= i))
          {
            AppMethodBeat.o(30414);
          }
          else
          {
            localbi = ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ou(paramInt);
            if (localbi != null)
              break;
            AppMethodBeat.o(30414);
          }
        }
      }
      if ((localbi.drD()) && (localbi.field_isSend == 0) && (!com.tencent.mm.modelvoice.q.K(localbi)) && (!com.tencent.mm.modelvoice.q.L(localbi)))
        au(localbi);
      paramInt++;
    }
  }

  public final void Zs()
  {
    AppMethodBeat.i(30436);
    ab.i("MicroMsg.AutoPlay", "phone or record stop, resume and do nothing");
    this.yGY = false;
    AppMethodBeat.o(30436);
  }

  public final void Zt()
  {
    AppMethodBeat.i(30437);
    ab.i("MicroMsg.AutoPlay", "phone comming or record start, stop play");
    this.yGY = true;
    dBB();
    dBw();
    try
    {
      if (mfW != null)
        mfW.dps();
      if (this.mfS != null)
        this.mfS.dpt();
      AppMethodBeat.o(30437);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AutoPlay", localException, "reset sensor error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(30437);
      }
    }
  }

  public final void a(int paramInt, bi parambi)
  {
    AppMethodBeat.i(30416);
    if (parambi == null)
      AppMethodBeat.o(30416);
    while (true)
    {
      return;
      dBw();
      aw.ZK();
      Boolean localBoolean = (Boolean)com.tencent.mm.model.c.Ry().get(4115, null);
      if ((localBoolean == null) || (!localBoolean.booleanValue()))
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(4115, Boolean.TRUE);
        dBC();
        this.yGR = com.tencent.mm.ui.base.t.a(this.cgL.yTx.getActivity(), this.context.getString(2131298186), 4000L);
      }
      if ((this.mfO.isPlaying()) && (parambi.field_msgId == this.yGO))
      {
        dBB();
        AppMethodBeat.o(30416);
      }
      else
      {
        au(parambi);
        if ((parambi.field_isSend == 0) && (!com.tencent.mm.modelvoice.q.K(parambi)))
          Od(paramInt + 1);
        qn(true);
        AppMethodBeat.o(30416);
      }
    }
  }

  public final void aqZ(String paramString)
  {
    AppMethodBeat.i(30412);
    ab.i("MicroMsg.AutoPlay", "changeTalker, isResumeFromDisableScreen: %b", new Object[] { Boolean.valueOf(this.yGU) });
    if ((this.yGU) || (this.context == null))
      AppMethodBeat.o(30412);
    while (true)
    {
      return;
      this.yGN = new LinkedList();
      this.isRecording = false;
      this.yGO = -1L;
      this.mfP = false;
      this.mfT = -1L;
      this.yGS = false;
      this.coq = 0;
      if (com.tencent.mm.model.t.nv(paramString))
      {
        this.coq = 1;
        this.mfO = new com.tencent.mm.audio.a.a(this.context, 1);
        AppMethodBeat.o(30412);
      }
      else
      {
        this.coq = 0;
        this.mfO = new com.tencent.mm.audio.a.a(this.context, 0);
        AppMethodBeat.o(30412);
      }
    }
  }

  public final void au(bi parambi)
  {
    AppMethodBeat.i(30415);
    if (parambi == null)
      AppMethodBeat.o(30415);
    while (true)
    {
      return;
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        if (this.yGN.size() > 0)
        {
          this.yGN.clear();
          com.tencent.mm.ui.base.t.hO(this.context);
        }
        AppMethodBeat.o(30415);
      }
      else
      {
        int i = this.yGN.size();
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label120;
          if (((bi)this.yGN.get(j)).field_msgId == parambi.field_msgId)
          {
            AppMethodBeat.o(30415);
            break;
          }
        }
        label120: if ((this.yGS) || (this.yGN.size() == 0))
          this.yGN.add(parambi);
        ab.d("MicroMsg.AutoPlay", "add voice msg :" + this.yGN.size());
        AppMethodBeat.o(30415);
      }
    }
  }

  public final void b(int paramInt, bi parambi)
  {
    AppMethodBeat.i(30417);
    if (parambi == null)
      AppMethodBeat.o(30417);
    while (true)
    {
      return;
      dBw();
      aw.ZK();
      Boolean localBoolean = (Boolean)com.tencent.mm.model.c.Ry().get(4115, null);
      if ((localBoolean == null) || (!localBoolean.booleanValue()))
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(4115, Boolean.TRUE);
        dBC();
        this.yGR = com.tencent.mm.ui.base.t.a(this.cgL.yTx.getActivity(), this.context.getString(2131298186), 4000L);
      }
      if ((this.mfO.isPlaying()) && (parambi.field_msgId == this.yGO))
      {
        dBB();
        AppMethodBeat.o(30417);
      }
      else
      {
        au(parambi);
        if ((parambi.field_isSend == 0) && (!com.tencent.mm.modelvoice.q.K(parambi)))
          Od(paramInt + 1);
        qn(true);
        AppMethodBeat.o(30417);
      }
    }
  }

  public final void cC(boolean paramBoolean)
  {
    AppMethodBeat.i(30430);
    ab.w("MicroMsg.AutoPlay", "voice play pause. %b", new Object[] { Boolean.valueOf(paramBoolean) });
    onStop();
    AppMethodBeat.o(30430);
  }

  public final void dBA()
  {
    AppMethodBeat.i(30423);
    if ((this.mfO != null) && (this.mfO.isPlaying()))
    {
      ab.i("MicroMsg.AutoPlay", "switchSpeaker, isSpeakerOn: %b, isPlaying: %b", new Object[] { Boolean.valueOf(this.mfP), Boolean.valueOf(this.mfO.isPlaying()) });
      this.mfO.bo(this.mfP);
    }
    AppMethodBeat.o(30423);
  }

  public final void dBB()
  {
    AppMethodBeat.i(30425);
    ab.i("MicroMsg.AutoPlay", "stop play");
    aj.amB("keep_app_silent");
    this.mfO.bm(true);
    this.mfO.stop();
    AppMethodBeat.o(30425);
  }

  public final void dBC()
  {
    AppMethodBeat.i(30435);
    if (this.yGR != null)
      this.yGR.dismiss();
    AppMethodBeat.o(30435);
  }

  public final void dBw()
  {
    AppMethodBeat.i(30413);
    if (1 == ab.getLogLevel())
      ab.d("MicroMsg.AutoPlay", "clear play list, stack: %s", new Object[] { bo.dpG() });
    if (this.yGP != null)
      this.yGP.dismiss();
    this.yGN.clear();
    AppMethodBeat.o(30413);
  }

  public final void dBx()
  {
    AppMethodBeat.i(30419);
    this.isRecording = false;
    qn(true);
    AppMethodBeat.o(30419);
  }

  public final void dBz()
  {
    AppMethodBeat.i(30422);
    label493: 
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("realPlayNext play next: size = ");
      ab.d("MicroMsg.AutoPlay", this.yGN.size());
      if (this.yGN.size() <= 0)
      {
        this.yHa.sendEmptyMessageDelayed(0, 1000L);
        AppMethodBeat.o(30422);
      }
      while (true)
      {
        return;
        long l = ((bi)this.yGN.get(0)).field_createTime;
        int i = this.yGN.size();
        int j = 1;
        int k = 0;
        while (j < i)
        {
          if (l <= ((bi)this.yGN.get(j)).field_createTime)
            break label893;
          l = ((bi)this.yGN.get(j)).field_createTime;
          k = j;
          j++;
        }
        localbi = (bi)this.yGN.get(k);
        if (localbi == null)
          break label777;
        if ((localbi == null) || ((!localbi.drD()) && (!localbi.dtB()) && (!localbi.dtC()) && (!localbi.dtD())))
          break;
        bool1 = true;
        Assert.assertTrue(bool1);
        ab.i("MicroMsg.AutoPlay", "start play msg: %d", new Object[] { Long.valueOf(localbi.field_msgId) });
        if (!mfW.aGA)
        {
          mfW.a(this);
          localObject1 = new com/tencent/mm/ui/chatting/d$4;
          ((d.4)localObject1).<init>(this);
          if (!this.mfS.aj((Runnable)localObject1))
            break label365;
          this.mfT = 0L;
        }
        aw.ZK();
        if ((com.tencent.mm.model.c.isSDCardAvailable()) || (bo.isNullOrNil(localbi.field_imgPath)))
          break label375;
        this.yGN.clear();
        com.tencent.mm.ui.base.t.hO(this.context);
        AppMethodBeat.o(30422);
      }
    }
    catch (Exception localException)
    {
      label365: label375: label893: 
      while (true)
      {
        bi localbi;
        ab.printErrStackTrace("MicroMsg.AutoPlay", localException, "", new Object[0]);
        AppMethodBeat.o(30422);
        continue;
        boolean bool1 = false;
        continue;
        this.mfT = -1L;
        continue;
        aw.ZK();
        Object localObject2;
        if ((com.tencent.mm.model.c.isSDCardAvailable()) && (this.yGQ.mfQ))
        {
          if (this.yGP != null)
            this.yGP.dismiss();
          boolean bool2 = g.KK().KV();
          bool1 = g.KK().KP();
          ab.i("MicroMsg.AutoPlay", "alvinluo isHeadsetPluged: %b, isBluetoothOn: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
          if ((!bool2) && (bool1))
            this.yGP = com.tencent.mm.ui.base.t.a(this.cgL.yTx.getActivity(), 2131232026, this.context.getString(2131298038));
        }
        else
        {
          aj.amA("keep_app_silent");
          com.tencent.mm.modelvoice.q.M(localbi);
          this.mfO.stop(true);
          this.yGQ.acquireWakeLock();
          if ((g.KK().KV()) || (g.KK().KP()))
          {
            ab.i("MicroMsg.AutoPlay", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(g.KK().KV()), Boolean.valueOf(g.KK().KP()) });
            this.mfP = false;
          }
          localObject2 = localbi.field_imgPath;
          if (this.coq != 1)
            break label819;
          localObject2 = com.tencent.mm.plugin.subapp.c.h.by((String)localObject2, false);
          ab.i("MicroMsg.AutoPlay", "startplay");
          bool1 = com.tencent.mm.modelvoice.q.uU(localbi.field_imgPath);
          if (!bool1)
            com.tencent.mm.plugin.report.service.h.pYm.a(111L, 175L, 1L, false);
          if ((!bool1) || (!this.mfO.a((String)localObject2, this.mfP, true, -1)))
            break label833;
          localObject2 = this.mfO;
          if (this.yGN.size() <= 1)
            break label827;
          bool1 = true;
          ((com.tencent.mm.ai.h)localObject2).bp(bool1);
          this.mfO.a(this);
          this.mfO.a(this);
          this.mfO.a(this);
          this.mfO.a(this);
          this.yGO = localbi.field_msgId;
          localObject2 = new com/tencent/mm/modelvoice/n;
          ((n)localObject2).<init>(localbi.field_content);
          this.yGW = ((n)localObject2).time;
          this.yGV = System.currentTimeMillis();
        }
        while (true)
        {
          aWv();
          this.yGU = false;
          AppMethodBeat.o(30422);
          break;
          this.yGP = com.tencent.mm.ui.base.t.a(this.cgL.yTx.getActivity(), 2131232039, this.context.getString(2131298039));
          break label493;
          localObject2 = com.tencent.mm.modelvoice.q.getFullPath((String)localObject2);
          break label601;
          bool1 = false;
          break label683;
          this.yGO = -1L;
          if (this.cos)
          {
            g.KK().KN();
            this.cos = false;
          }
          g.KK().b(this);
          dBw();
          Toast.makeText(this.context, this.context.getString(2131298205), 0).show();
        }
      }
    }
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(30438);
    ab.i("MicroMsg.AutoPlay", "onBluetoothHeadsetStateChange, status: %d, isRequestStartBluetooth: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.cos) });
    switch (paramInt)
    {
    case 3:
    default:
    case 1:
    case 2:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(30438);
      while (true)
      {
        return;
        if (!this.yHb.hasMessages(0))
          break;
        this.yHb.removeMessages(0);
        this.yHb.sendEmptyMessage(0);
        AppMethodBeat.o(30438);
        continue;
        if (this.yHb.hasMessages(0))
          this.yHb.removeMessages(0);
        if (!this.cos)
          break;
        g.KK().KN();
        this.cos = false;
        AppMethodBeat.o(30438);
      }
      g.KK().KM();
    }
  }

  public final void he(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(30432);
    ab.i("MicroMsg.AutoPlay", "onSensorEvent, isON:" + paramBoolean + "  hasSkip:" + this.mfR + " tick:" + bo.az(this.mfT) + "  lt:" + this.mfT);
    if (this.mfR)
      if (!paramBoolean)
      {
        paramBoolean = bool;
        this.mfR = paramBoolean;
        AppMethodBeat.o(30432);
      }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      if (this.context == null)
      {
        mfW.dps();
        AppMethodBeat.o(30432);
      }
      else
      {
        ab.i("MicroMsg.AutoPlay", "isScreenOn: %s", new Object[] { Boolean.valueOf(isScreenEnable()) });
        if ((!paramBoolean) && (this.mfT != -1L) && (bo.az(this.mfT) > 400L))
        {
          this.mfR = true;
          AppMethodBeat.o(30432);
        }
        else
        {
          this.mfR = false;
          if (this.mfO.Ex())
          {
            AppMethodBeat.o(30432);
          }
          else if (aw.ZL().KP())
          {
            dBC();
            ab.d("MicroMsg.AutoPlay", "onSensorEvent, connecting bluetooth, omit sensor event");
            AppMethodBeat.o(30432);
          }
          else
          {
            if (this.yGQ.mfQ)
            {
              this.mfP = false;
              if (this.yGO != -1L)
                setScreenEnable(paramBoolean);
              for (this.yGU = paramBoolean; ; this.yGU = true)
              {
                dBA();
                AppMethodBeat.o(30432);
                break;
                setScreenEnable(true);
              }
            }
            if (this.yGO != -1L)
            {
              if (isScreenEnable() == paramBoolean)
              {
                AppMethodBeat.o(30432);
              }
              else
              {
                setScreenEnable(paramBoolean);
                this.yGU = paramBoolean;
                new ap(new d.6(this, paramBoolean), false).ae(50L, 50L);
              }
            }
            else
            {
              ab.i("MicroMsg.AutoPlay", "onSensorEvent, isResumeFromDisableScreen:%b", new Object[] { Boolean.valueOf(this.yGU) });
              AppMethodBeat.o(30432);
            }
          }
        }
      }
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(30427);
    boolean bool = this.mfO.isPlaying();
    AppMethodBeat.o(30427);
    return bool;
  }

  public final void onError()
  {
    AppMethodBeat.i(30429);
    ab.e("MicroMsg.AutoPlay", "voice play error");
    dBB();
    qn(true);
    AppMethodBeat.o(30429);
  }

  public final void onStop()
  {
    int i = 2;
    AppMethodBeat.i(30431);
    ab.w("MicroMsg.AutoPlay", "voice play stop. %d, %d, %d, %b, %b, %s", new Object[] { Long.valueOf(this.yGO), Long.valueOf(this.yGW), Long.valueOf(bo.gb(this.yGV)), Boolean.valueOf(this.yGY), Boolean.valueOf(this.yGX), bo.dpG() });
    com.tencent.mm.plugin.report.service.h localh;
    long l1;
    long l2;
    long l3;
    if (this.yGO > 0L)
    {
      localh = com.tencent.mm.plugin.report.service.h.pYm;
      l1 = this.yGO;
      l2 = this.yGW;
      l3 = bo.gb(this.yGV);
      if (this.yGY)
        break label273;
      if (!this.yGX);
    }
    label273: for (i = 1; ; i = 3)
    {
      localh.e(15160, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(i) });
      this.yGY = false;
      this.yGX = false;
      this.yGQ.releaseWakeLock();
      dBy();
      if (this.cos)
      {
        g.KK().KN();
        this.cos = false;
      }
      g.KK().b(this);
      if (this.yGN.isEmpty())
      {
        mfW.dps();
        this.mfS.dpt();
      }
      aWv();
      this.yGO = -1L;
      dBC();
      this.yGU = false;
      setScreenEnable(true);
      AppMethodBeat.o(30431);
      return;
    }
  }

  public final void qn(boolean paramBoolean)
  {
    AppMethodBeat.i(30421);
    ab.i("MicroMsg.AutoPlay", "play next: size: %s needAudioFocus: %s", new Object[] { Integer.valueOf(this.yGN.size()), Boolean.valueOf(paramBoolean) });
    if (this.yGN.size() <= 0)
    {
      this.yHa.sendEmptyMessageDelayed(0, 1000L);
      AppMethodBeat.o(30421);
    }
    while (true)
    {
      return;
      if (!g.KK().KV())
      {
        g.KK();
        if (g.KS())
        {
          g.KK().a(this);
          int i = g.KK().KM();
          this.cos = true;
          if ((i != -1) && (i != 0))
          {
            ab.i("MicroMsg.AutoPlay", "play next: ret = ".concat(String.valueOf(i)));
            this.yHb.sendEmptyMessageDelayed(0, 1000L);
            AppMethodBeat.o(30421);
          }
        }
      }
      else
      {
        if (this.mfO != null)
        {
          this.mfO.bm(paramBoolean);
          this.mfO.bl(paramBoolean);
        }
        dBz();
        AppMethodBeat.o(30421);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(30424);
    ab.i("MicroMsg.AutoPlay", "alvinluo AutoPlay release");
    if (this.mfS != null)
      this.mfS.dpt();
    AppMethodBeat.o(30424);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.d
 * JD-Core Version:    0.6.2
 */