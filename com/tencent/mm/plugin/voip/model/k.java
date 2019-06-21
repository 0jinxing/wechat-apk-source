package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.bf;
import com.tencent.mm.protocal.protobuf.ccx;
import com.tencent.mm.protocal.protobuf.cmm;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.protocal.protobuf.con;
import com.tencent.mm.protocal.protobuf.cpm;
import com.tencent.mm.protocal.protobuf.cps;
import com.tencent.mm.protocal.protobuf.cpu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public final class k
{
  public boolean cJn;
  public Context jiq;
  ak mHandler;
  public int mStatus;
  public boolean sOL;
  public boolean sOM;
  public boolean sON;
  public boolean sOO;
  public boolean sOP;
  public boolean sOQ;
  public boolean sOR;
  public boolean sOS;
  public ccx sOT;
  public int sOU;
  public long sOV;
  public long sOW;
  public int sOX;
  public int sOY;
  public boolean sOZ;
  public boolean sPA;
  public VoipScoreState sPB;
  public int sPC;
  public ap sPD;
  Timer sPE;
  int sPF;
  private ap sPG;
  private a sPH;
  public boolean sPa;
  public boolean sPb;
  public int sPc;
  private int sPd;
  private int sPe;
  private int sPf;
  private int sPg;
  private int sPh;
  public boolean sPi;
  private boolean sPj;
  private int sPk;
  private boolean sPl;
  private int sPm;
  private int sPn;
  private int sPo;
  public v2protocal sPp;
  public u sPq;
  public m sPr;
  public t sPs;
  public byte[] sPt;
  public cpm sPu;
  public boolean sPv;
  public boolean sPw;
  public int sPx;
  public int sPy;
  public int sPz;

  protected k()
  {
    AppMethodBeat.i(4400);
    this.mStatus = 1;
    this.sOL = false;
    this.sOM = false;
    this.sON = false;
    this.sOO = false;
    this.cJn = false;
    this.sOP = false;
    this.sOQ = false;
    this.sOR = false;
    this.sOS = false;
    this.sOT = new ccx();
    this.sOU = 0;
    this.sOV = 0L;
    this.sOW = 0L;
    this.sOX = 0;
    this.sOY = 0;
    this.sOZ = false;
    this.sPa = false;
    this.sPb = false;
    this.sPc = 10;
    this.sPd = -1;
    this.sPe = -1;
    this.sPf = -1;
    this.sPg = -1;
    this.sPh = -1;
    this.sPi = false;
    this.sPj = false;
    this.sPk = 1;
    this.sPl = false;
    this.sPm = 1;
    this.sPn = -1;
    this.sPo = -1;
    this.jiq = null;
    this.sPq = u.sTD;
    this.sPt = null;
    this.sPu = null;
    this.sPv = false;
    this.sPw = false;
    this.sPx = 0;
    this.sPy = 0;
    this.sPz = 0;
    this.sPA = false;
    this.sPC = 0;
    this.sPD = new ap(Looper.getMainLooper(), new k.1(this), true);
    this.mHandler = new k.3(this, Looper.getMainLooper());
    this.sPE = null;
    this.sPF = 0;
    this.sPG = new ap(Looper.getMainLooper(), new k.8(this), false);
    this.sPH = null;
    this.sPp = new v2protocal(this.mHandler);
    this.sPr = new m(this);
    this.sPs = new t(this);
    this.sPz = 0;
    this.sPB = new VoipScoreState();
    AppMethodBeat.o(4400);
  }

  private void cIN()
  {
    AppMethodBeat.i(4415);
    com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "DeviceInfo.mAudioInfo.aecMode:" + q.etd.eqq);
    if (q.etd.epS == 1)
      this.sPp.setAppCmd(410);
    byte[] arrayOfByte = new byte[2];
    label123: Object localObject;
    int i;
    int j;
    if (q.etd.eqq >= 0)
    {
      arrayOfByte[0] = ((byte)(byte)q.etd.eqq);
      this.sPp.setAppCmd(406, arrayOfByte, 1);
      if (q.etd.eqr < 0)
        break label881;
      arrayOfByte[0] = ((byte)(byte)q.etd.eqr);
      this.sPp.setAppCmd(408, arrayOfByte, 1);
      localObject = com.tencent.mm.model.c.c.abi().ll("100447");
      if (((com.tencent.mm.storage.c)localObject).isValid())
      {
        i = bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("SetVoipRnnNsOn"), 0);
        if (1 == i)
        {
          j = (byte)i;
          this.sPp.setAppCmd(432, new byte[] { j }, 1);
        }
      }
      if (q.etd.eqt < 0)
        break label922;
      localObject = new byte[5];
      if ((q.etd.equ >= 0) && (q.etd.eqv >= 0))
      {
        localObject[0] = ((byte)(byte)q.etd.equ);
        localObject[1] = ((byte)(byte)q.etd.eqv);
        if (q.etd.eqw < 0)
          break label906;
        localObject[2] = ((byte)(byte)q.etd.eqw);
        localObject[3] = ((byte)(byte)q.etd.eqt);
        localObject[4] = ((byte)(byte)q.etd.eqx);
        this.sPp.setAppCmd(404, (byte[])localObject, 5);
      }
    }
    while (true)
    {
      if ((q.etd.epT >= 0) || (q.etd.epV >= 0))
      {
        arrayOfByte[0] = ((byte)-1);
        arrayOfByte[1] = ((byte)-1);
        if (q.etd.epT >= 0)
          arrayOfByte[0] = ((byte)(byte)q.etd.epT);
        if (q.etd.epV >= 0)
          arrayOfByte[1] = ((byte)(byte)q.etd.epV);
        this.sPp.setAppCmd(414, arrayOfByte, 2);
      }
      if ((q.etd.epU >= 0) || (q.etd.epW >= 0))
      {
        arrayOfByte[0] = ((byte)-1);
        arrayOfByte[1] = ((byte)-1);
        if (q.etd.epU >= 0)
          arrayOfByte[0] = ((byte)(byte)q.etd.epU);
        if (q.etd.epW >= 0)
          arrayOfByte[1] = ((byte)(byte)q.etd.epW);
        this.sPp.setAppCmd(415, arrayOfByte, 2);
      }
      if ((q.etd.epX >= 0) || (q.etd.epY >= 0))
      {
        arrayOfByte[0] = ((byte)-1);
        arrayOfByte[1] = ((byte)-1);
        if (q.etd.epX >= 0)
          arrayOfByte[0] = ((byte)(byte)q.etd.epX);
        if (q.etd.epY >= 0)
          arrayOfByte[1] = ((byte)(byte)q.etd.epY);
        this.sPp.setAppCmd(422, arrayOfByte, 2);
      }
      if (q.etd.epZ >= 0)
      {
        arrayOfByte[0] = ((byte)(byte)q.etd.epZ);
        this.sPp.setAppCmd(416, arrayOfByte, 1);
      }
      if (q.etd.eqd >= 0)
      {
        arrayOfByte[0] = ((byte)(byte)q.etd.eqd);
        this.sPp.setAppCmd(431, arrayOfByte, 4);
      }
      if ((q.etd.eqa >= 0) && ((this.sPp.sUM != 0) || (q.etd.eqa != 5)))
      {
        arrayOfByte[0] = ((byte)(byte)q.etd.eqa);
        this.sPp.setAppCmd(417, arrayOfByte, 1);
      }
      if ((q.etd.eqb >= 0) && ((this.sPp.sUM != 0) || (q.etd.eqb != 5)))
      {
        arrayOfByte[0] = ((byte)(byte)q.etd.eqb);
        this.sPp.setAppCmd(418, arrayOfByte, 1);
      }
      if (q.etd.eqc >= 0)
      {
        arrayOfByte[0] = ((byte)(byte)q.etd.eqc);
        this.sPp.setAppCmd(419, arrayOfByte, 1);
      }
      if ((this.sPp.sUM == 1) && ((q.etd.eqa == 5) || (q.etd.eqb == 5)))
        this.sPp.sUy = 5;
      if (1 != q.etd.eqA)
        break label961;
      localObject = new byte[30];
      for (i = 0; i < 15; i++)
      {
        localObject[(i * 2)] = ((byte)(byte)(q.etd.eqB[i] & 0xFF));
        localObject[(i * 2 + 1)] = ((byte)(byte)(q.etd.eqB[i] >> 8 & 0xFF));
      }
      if (q.etd.eqq != -2)
        break;
      this.sPp.setAppCmd(407);
      break;
      label881: if (q.etd.eqr != -2)
        break label123;
      this.sPp.setAppCmd(409);
      break label123;
      label906: this.sPp.setAppCmd(404, (byte[])localObject, 2);
      continue;
      label922: if (q.etd.eqt == -2)
        this.sPp.setAppCmd(405);
    }
    this.sPp.setAppCmd(420, (byte[])localObject, 30);
    label961: if (q.etd.eqA == 0)
      this.sPp.setAppCmd(421);
    if ((q.etd.eqC[0] > 0) || (q.etd.eqC[1] > 0))
    {
      arrayOfByte[0] = ((byte)0);
      arrayOfByte[1] = ((byte)0);
      if ((q.etd.eqC[0] > 0) && (q.etd.eqC[0] < 10000))
        arrayOfByte[0] = ((byte)(byte)q.etd.eqC[0]);
      if ((q.etd.eqC[1] > 0) && (q.etd.eqC[1] < 10000))
        arrayOfByte[1] = ((byte)(byte)q.etd.eqC[1]);
      this.sPp.setAppCmd(423, arrayOfByte, 2);
    }
    if (q.etd.eqE > 0)
    {
      arrayOfByte[0] = ((byte)(byte)q.etd.eqE);
      this.sPp.setAppCmd(424, arrayOfByte, 1);
    }
    if (q.etd.eqM >= 0)
    {
      int k = (byte)q.etd.eqM;
      int m = (byte)q.etd.eqN;
      j = (byte)q.etd.eqO;
      int n = (byte)q.etd.eqP;
      this.sPp.setAppCmd(426, new byte[] { k, m, j, n }, 4);
    }
    AppMethodBeat.o(4415);
  }

  private void cIS()
  {
    AppMethodBeat.i(4424);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(4396);
        if ((k.this.mStatus != 2) && (k.this.mStatus != 3) && (k.this.mStatus != 4))
        {
          com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "startConnectRelay status fail, status:" + k.this.mStatus);
          AppMethodBeat.o(4396);
        }
        while (true)
        {
          return;
          if (k.this.sOL)
          {
            com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "can not startConnectRelay again");
            AppMethodBeat.o(4396);
          }
          else
          {
            com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel relay");
            int i = (k.this.sPp.sUO >> 2 & 0x3) >> 1 & 0x1 & ((k.this.sPp.sUO & 0x3) >> 1 & 0x1);
            v2protocal localv2protocal = k.this.sPp;
            int j = k.this.sPp.sTY;
            long l1 = k.this.sPp.nwu;
            int k = k.this.sPp.nwC;
            long l2 = k.this.sPp.nwv;
            byte[] arrayOfByte1 = k.this.sPp.sUa;
            int m = k.this.sPp.channelStrategy;
            int n = k.this.sPp.sUf;
            int i1 = k.this.sPp.sUg;
            int i2 = k.this.sPp.sUd;
            int i3;
            label274: byte[] arrayOfByte2;
            int i4;
            int i5;
            int i6;
            byte[] arrayOfByte3;
            int i7;
            int i8;
            if (k.this.sPp.sUe == null)
            {
              i3 = 0;
              arrayOfByte2 = k.this.sPp.sUe;
              i4 = k.this.sPp.sUh;
              i5 = k.this.sPp.sTX;
              i6 = k.this.sPp.sUY;
              arrayOfByte3 = k.this.sPp.sUZ;
              i7 = k.this.sPp.sVa;
              i8 = k.this.sPp.sUi;
              if (k.this.sPp.sUj != null)
                break label587;
            }
            label587: for (int i9 = 0; ; i9 = k.this.sPp.sUj.length)
            {
              i9 = localv2protocal.setConfigInfo(j, l1, k, l2, arrayOfByte1, m, n, i1, i2, i3, arrayOfByte2, i4, i, i5, i6, arrayOfByte3, i7, i8, i9, k.this.sPp.sUj, k.this.sPp.sVb);
              i3 = i9;
              if (i9 == 0)
                i3 = k.this.sPp.connectToPeerRelay();
              com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "zhengxue[Logic], mARQFlag: " + i + ",  NetType: " + k.this.sPp.sTX + ", EncryptStrategy: " + k.this.sPp.sUY);
              if (i3 >= 0)
                break label603;
              com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "v2protocal setConfigInfo or connectToPeerRelay failed, ret:".concat(String.valueOf(i3)));
              k.this.sPp.sVH.sQe = 14;
              k.this.v(1, -9002, "");
              AppMethodBeat.o(4396);
              break;
              i3 = k.this.sPp.sUe.length;
              break label274;
            }
            label603: k.this.sOL = true;
            k.this.sPp.sVH.sQl = ((byte)1);
            k.this.sPp.sVH.sQt = 1;
            AppMethodBeat.o(4396);
          }
        }
      }
    });
    AppMethodBeat.o(4424);
  }

  public final void Gd(int paramInt)
  {
    AppMethodBeat.i(4404);
    this.sPp.sUm = Math.abs(paramInt);
    AppMethodBeat.o(4404);
  }

  public final void Ge(int paramInt)
  {
    AppMethodBeat.i(4405);
    this.sPp.sUn = Math.abs(paramInt);
    AppMethodBeat.o(4405);
  }

  public final void Gf(int paramInt)
  {
    this.sPp.sUq = paramInt;
  }

  public final void Gg(int paramInt)
  {
    AppMethodBeat.i(4411);
    if ((8 == paramInt) || (9 == paramInt))
      this.sPh = paramInt;
    while (true)
    {
      if ((1 == paramInt) || (3 == paramInt))
        Gh(2);
      this.sPq.Gt(paramInt);
      AppMethodBeat.o(4411);
      return;
      this.sPf = paramInt;
      this.sPd = paramInt;
    }
  }

  public final void Gh(int paramInt)
  {
    AppMethodBeat.i(4412);
    if ((8 == paramInt) || (9 == paramInt))
      this.sPg = paramInt;
    while (true)
    {
      this.sPs.GB(paramInt);
      AppMethodBeat.o(4412);
      return;
      this.sPd = paramInt;
      this.sPe = paramInt;
    }
  }

  public final void Gi(int paramInt)
  {
    AppMethodBeat.i(4422);
    try
    {
      cmm localcmm = new com/tencent/mm/protocal/protobuf/cmm;
      localcmm.<init>();
      localcmm.xko = paramInt;
      if (1 == paramInt)
      {
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:send maxsizeformat: !!6");
        ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
        localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        localByteBuffer.putInt(6);
        com.tencent.mm.bt.b localb = new com/tencent/mm/bt/b;
        localb.<init>(localByteBuffer.array());
        localcmm.xkp = localb;
        this.sPp.setAppCmd(32, localByteBuffer.array(), 4);
      }
      while (true)
      {
        this.sPp.SendRUDP(localcmm.toByteArray(), localcmm.toByteArray().length);
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: send RUDP data to close remote HW encoding!Type:".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(4422);
        return;
        localcmm.xkp = null;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "onVoipSendCloseHWEncCmd Error");
        AppMethodBeat.o(4422);
      }
    }
  }

  public final void Gj(int paramInt)
  {
    AppMethodBeat.i(4423);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "zhengxue: audio device occupied stat sync stat " + paramInt + " app 1");
    try
    {
      Object localObject = new byte[4];
      localObject[0] = ((byte)(byte)paramInt);
      this.sPp.setJNIAppCmd(2, (byte[])localObject, 4);
      con localcon = new com/tencent/mm/protocal/protobuf/con;
      localcon.<init>();
      localcon.xmt = paramInt;
      localcon.xmu = 1;
      cmm localcmm = new com/tencent/mm/protocal/protobuf/cmm;
      localcmm.<init>();
      localcmm.xko = 4;
      localObject = new com/tencent/mm/bt/b;
      ((com.tencent.mm.bt.b)localObject).<init>(localcon.toByteArray(), 0, 1);
      localcmm.xkp = ((com.tencent.mm.bt.b)localObject);
      this.sPp.SendRUDP(localcmm.toByteArray(), localcmm.toByteArray().length);
      AppMethodBeat.o(4423);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "onAudioDevOccupiedStat Error");
        AppMethodBeat.o(4423);
      }
    }
  }

  public final void Gk(int paramInt)
  {
    this.sPp.sVa = paramInt;
  }

  public final void Gl(int paramInt)
  {
    this.sPp.sUT = paramInt;
  }

  public final void Gm(int paramInt)
  {
    this.sPp.sVH.sQk = ((byte)1);
    this.sPp.channelStrategy = paramInt;
  }

  public final void Gn(int paramInt)
  {
    this.sPp.sUh = paramInt;
  }

  public final void a(a parama)
  {
    if (parama != null)
      this.sPH = parama;
  }

  public final void a(cok paramcok1, cok paramcok2, cok paramcok3, LinkedList<cps> paramLinkedList)
  {
    AppMethodBeat.i(4428);
    String str = Proxy.getDefaultHost();
    int i = Proxy.getDefaultPort();
    cpu localcpu;
    if ((str != null) && (str.length() > 0) && (i > 0))
      localcpu = new cpu();
    while (true)
    {
      try
      {
        localcpu.xnK = 1;
        localcpu.xnL = i;
        localcpu.xnM = 0;
        localcpu.userName = "";
        localcpu.gDC = "";
        localcpu.xnL = com.tencent.mm.plugin.voip.a.a.Pz(InetAddress.getByName(str).getHostAddress());
        return;
      }
      catch (UnknownHostException localUnknownHostException)
      {
        ab.printErrStackTrace("MicroMsg.Voip.VoipContext", localUnknownHostException, "", new Object[0]);
        if (this.sPp.a(paramcok1, paramcok2, paramcok3, localcpu, paramLinkedList) != 0)
        {
          ab.i("MicroMsg.Voip.VoipContext", "setIp fail!");
          AppMethodBeat.o(4428);
          continue;
        }
      }
      finally
      {
        if (this.sPp.a(paramcok1, paramcok2, paramcok3, localcpu, paramLinkedList) != 0)
          ab.i("MicroMsg.Voip.VoipContext", "setIp fail!");
        AppMethodBeat.o(4428);
      }
      AppMethodBeat.o(4428);
      continue;
      localcpu = new cpu();
      localcpu.xnK = 0;
      localcpu.xnL = 0;
      localcpu.xnM = 0;
      localcpu.userName = "";
      localcpu.gDC = "";
      if (this.sPp.a(paramcok1, paramcok2, paramcok3, localcpu, paramLinkedList) != 0)
        ab.i("MicroMsg.Voip.VoipContext", "setIp fail!");
      AppMethodBeat.o(4428);
    }
  }

  public final void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    this.sPp.sUd = paramInt1;
    this.sPp.sUe = paramArrayOfByte1;
    this.sPp.sUY = paramInt2;
    this.sPp.sUZ = paramArrayOfByte2;
  }

  public final boolean a(cpm paramcpm)
  {
    this.sPu = paramcpm;
    this.sPp.nMl = this.sPu.xmT;
    this.sPp.nwu = this.sPu.wem;
    this.sPp.nwv = this.sPu.wen;
    this.sPp.nwC = 1;
    this.sPp.sTY = 0;
    this.mStatus = 3;
    return true;
  }

  public final int am(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(4418);
    if (paramInt < 0)
    {
      paramInt = -1;
      AppMethodBeat.o(4418);
    }
    while (true)
    {
      return paramInt;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:DisableCodec: targetCodec = " + paramInt + ", local=" + paramBoolean + ", remote =true");
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      localByteBuffer.putInt(paramInt);
      if (paramBoolean);
      try
      {
        if (this.sPp != null)
        {
          cmm localcmm = new com/tencent/mm/protocal/protobuf/cmm;
          localcmm.<init>();
          localcmm.xko = 5;
          com.tencent.mm.bt.b localb = new com/tencent/mm/bt/b;
          localb.<init>(localByteBuffer.array());
          localcmm.xkp = localb;
          com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:disable local target codec: ".concat(String.valueOf(paramInt)));
          this.sPp.SendRUDP(localcmm.toByteArray(), localcmm.toByteArray().length);
        }
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:disable remote target codec: ".concat(String.valueOf(paramInt)));
        this.sPp.setAppCmd(35, localByteBuffer.array(), 4);
        paramInt = 1;
        AppMethodBeat.o(4418);
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "DisableCodec Error");
      }
    }
  }

  public final void b(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.sPp.sVf = paramInt;
    this.sPp.sVg = paramArrayOfByte1;
    this.sPp.sVh = paramArrayOfByte2;
  }

  public final void bo(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4427);
    ab.i("MicroMsg.Voip.VoipContext", "updateRemotePid");
    this.sPp.sVH.sQj = ((byte)1);
    this.sPp.sVH.sQi = ((byte)1);
    this.sPp.sUa = paramArrayOfByte;
    AppMethodBeat.o(4427);
  }

  public final void bp(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4429);
    ab.i("MicroMsg.Voip.VoipContext", "updateRemoteCapInfo, isGotCapInfo: %s", new Object[] { Byte.valueOf(this.sPp.sVH.sQn) });
    if ((this.sPp.sVH.sQn == 1) || (paramArrayOfByte == null))
      AppMethodBeat.o(4429);
    while (true)
    {
      return;
      this.sPp.sVH.sQn = ((byte)1);
      this.sPp.sUb = paramArrayOfByte;
      int i = this.sPp.exchangeCabInfo(this.sPp.sUb, this.sPp.sUb.length);
      if (i < 0)
      {
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "protocal exchangecabinfo failed ret:".concat(String.valueOf(i)));
        this.sPp.sVH.sQe = 15;
        v(1, -9003, "");
      }
      AppMethodBeat.o(4429);
    }
  }

  public final void bq(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4430);
    this.sPp.sUc = paramArrayOfByte;
    cIU();
    AppMethodBeat.o(4430);
  }

  public final void cIE()
  {
    int i = 0;
    AppMethodBeat.i(4402);
    if ((this.sOL == true) && (this.sOU == 0))
    {
      this.sOU = 1;
      if (this.sPp.field_speedTestInfoLength >= 8)
        break label122;
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! bufsize=" + this.sPp.field_speedTestInfoLength);
      AppMethodBeat.o(4402);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "StartVoipSpeedTest fail for status is wrong: isChannelStartConnect=" + this.sOL + " ,mSpeedTestStatus=" + this.sOU);
      AppMethodBeat.o(4402);
      continue;
      label122: int j = this.sPp.sVF[1];
      if (j + 2 > this.sPp.field_speedTestInfoLength)
      {
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + j + ", bufsize=" + this.sPp.field_speedTestInfoLength);
        AppMethodBeat.o(4402);
      }
      else
      {
        int k = this.sPp.sVF[(j + 2 + 1)];
        if (j + 6 + k != this.sPp.field_speedTestInfoLength)
        {
          com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + j + ", C2SRttCnt=" + k + ", bufsize=" + this.sPp.field_speedTestInfoLength);
          AppMethodBeat.o(4402);
        }
        else
        {
          this.sOV = this.sPp.nwv;
          this.sOX = this.sPp.netType;
          this.sOY = this.sPp.nwu;
          this.sOT.wem = this.sPp.nwu;
          this.sOT.xcr = this.sPp.sUl;
          this.sOT.vZF = this.sPp.netType;
          Object localObject1 = this.sOT;
          if (this.sOL == true)
          {
            k = 1;
            ((ccx)localObject1).xcs = k;
            localObject1 = this.sOT;
            if (this.sON != true)
              break label482;
          }
          label482: for (k = 1; ; k = 0)
          {
            ((ccx)localObject1).xct = k;
            this.sOT.xcu = this.sPp.sVF[0];
            this.sOT.xcv = this.sPp.sVF[1];
            j = 0;
            for (k = 2; j < this.sOT.xcv; k++)
            {
              this.sOT.xcw.add(Integer.valueOf(this.sPp.sVF[k]));
              j++;
            }
            k = 0;
            break;
          }
          localObject1 = this.sOT;
          Object localObject2 = this.sPp.sVF;
          j = k + 1;
          ((ccx)localObject1).xcx = localObject2[k];
          localObject2 = this.sOT;
          localObject1 = this.sPp.sVF;
          k = j + 1;
          ((ccx)localObject2).xcy = localObject1[j];
          j = i;
          while (j < this.sOT.xcy)
          {
            this.sOT.xcz.add(Integer.valueOf(this.sPp.sVF[k]));
            j++;
            k++;
          }
          this.sOT.xcA = this.sPp.sVF[k];
          this.sOT.xcB = this.sPp.sVF[(k + 1)];
          new com.tencent.mm.plugin.voip.model.a.k(this.sOT).cKw();
          AppMethodBeat.o(4402);
        }
      }
    }
  }

  public final void cIF()
  {
    AppMethodBeat.i(4403);
    if (this.sOU == 0)
      AppMethodBeat.o(4403);
    while (true)
    {
      return;
      if (this.sOU == 1)
      {
        this.sOU = 0;
        this.sPp.sVp = 0L;
        AppMethodBeat.o(4403);
      }
      else
      {
        this.sOU = 0;
        v2protocal localv2protocal = this.sPp;
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "v2protocal StopVoipSpeedTest!");
        localv2protocal.StopSpeedTest();
        localv2protocal.sVp = 0L;
        AppMethodBeat.o(4403);
      }
    }
  }

  public final void cIG()
  {
    AppMethodBeat.i(4406);
    this.sPp.sUo = this.sPr.cIX();
    this.sPp.sUp = this.sPr.cIs();
    AppMethodBeat.o(4406);
  }

  public final int cIH()
  {
    int i = 2;
    if (this.mStatus == 1)
      i = 0;
    while (true)
    {
      return i;
      if ((this.mStatus == 2) || (this.mStatus == 3))
        i = 1;
      else if (this.mStatus != 4)
        i = 3;
    }
  }

  public final boolean cII()
  {
    if (this.mStatus == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cIJ()
  {
    boolean bool = false;
    AppMethodBeat.i(4409);
    ab.d("MicroMsg.Voip.VoipContext", "isWorking, status: %d", new Object[] { Integer.valueOf(this.mStatus) });
    if (this.mStatus == 1)
      AppMethodBeat.o(4409);
    while (true)
    {
      return bool;
      AppMethodBeat.o(4409);
      bool = true;
    }
  }

  public final long cIK()
  {
    return this.sPp.sUl;
  }

  public final boolean cIL()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.sPb)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      switch (this.sPd)
      {
      case 1:
      case 2:
      case 3:
      default:
      case -1:
      case 0:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      do
      {
        do
        {
          do
          {
            bool2 = true;
            break;
            bool2 = true;
            break;
          }
          while (4 == this.sPe);
          bool2 = bool1;
          break;
        }
        while ((4 == this.sPe) || (-1 == this.sPe));
        bool2 = bool1;
        break;
        bool2 = bool1;
        if (5 == this.sPe)
          break;
        bool2 = bool1;
        if (6 == this.sPe)
          break;
      }
      while (7 != this.sPe);
      bool2 = bool1;
    }
  }

  public final boolean cIM()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.sPb)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      switch (this.sPd)
      {
      case 1:
      case 2:
      case 3:
      default:
      case -1:
      case 0:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      do
      {
        do
        {
          do
          {
            bool2 = true;
            break;
            bool2 = true;
            break;
          }
          while (4 == this.sPe);
          bool2 = bool1;
          break;
        }
        while ((4 == this.sPf) || (this.sPf == 0) || (-1 == this.sPf));
        bool2 = bool1;
        break;
        bool2 = bool1;
        if (5 == this.sPf)
          break;
        bool2 = bool1;
        if (6 == this.sPf)
          break;
      }
      while (7 != this.sPf);
      bool2 = bool1;
    }
  }

  public final void cIO()
  {
    AppMethodBeat.i(4416);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "tryStartTalk: try start talk");
    if ((this.sOP != true) || (this.sON != true))
    {
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "tryStartTalk: fail isCanSendData " + this.sOP + ", isChannelConnectedSuccess " + this.sON);
      AppMethodBeat.o(4416);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "Voip tryStartTalk, channel setActive");
      this.sPp.setActive();
      if (this.sOS != true)
        break;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "tryStartTalk: engine already started, isEngineStarted " + this.sOS);
      AppMethodBeat.o(4416);
    }
    this.sPp.setSvrConfig(205, 0, 0, this.sPp.sVb, 0, 0, 0);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "bothSideGeneralSwitch = " + this.sPp.sVb + " SwitchFlag = " + this.sPp.sUi);
    label221: label243: Object localObject1;
    label296: int i;
    int j;
    label660: int k;
    int m;
    label1429: label1460: label1471: boolean bool;
    if (this.sPp.startEngine() == 0)
    {
      this.sPp.sVH.sQE = 0;
      cIN();
      if ((cIL()) || (cIM()))
        break label1834;
      cIR();
      this.sPq.cJE();
      localObject1 = this.sPr;
      if (((m)localObject1).kzf != 2)
        break label1890;
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipDeviceHandler", "dev start already...");
      localObject2 = this.sPp.sVH;
      if (((n)localObject2).beginTime != 0L)
        break label2267;
      ((n)localObject2).sQx = 0;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipDailReport", "devin:beginTime:" + ((n)localObject2).beginTime + ", CurrentTime: " + System.currentTimeMillis());
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipDailReport", "devin:endNewDial:" + ((n)localObject2).sQx);
      this.sPq.onConnected();
      this.mStatus = 5;
      localObject2 = this.sPp.sVH;
      ((n)localObject2).sQF = System.currentTimeMillis();
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipDailReport", "devin:beginTalk:" + ((n)localObject2).sQF);
      this.sPp.setSvrConfig(202, this.sPp.sUE, this.sPp.sUF, 0, 0, 0, 0);
      this.sPp.setSvrConfig(203, 0, 0, this.sPp.sUJ, 0, 0, 0);
      this.sPp.setSvrConfig(206, 0, 0, this.sPp.sUN, 0, 0, 0);
      this.sPp.setSvrConfig(103, this.sPp.sUG, this.sPp.sUH, this.sPp.sUI, this.sPp.sUL, 0, 0);
      this.sPp.setSvrConfig(205, 0, 0, this.sPp.sVb, 0, 0, 0);
      this.sPp.setSvrConfig(207, 0, 0, this.sPp.sUi, 0, 0, 0);
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "bothSideGeneralSwitch = " + this.sPp.sVb + " SwitchFlag = " + this.sPp.sUi);
      i = this.sPp.sUO >> 2 & 0x3;
      j = this.sPp.sUO & 0x3;
      if (this.sPp.nwC != 0)
        break label2283;
      i = (i << 2) + j;
      this.sPp.setSvrConfig(502, 0, 0, i, 0, 0, 0);
      this.sPp.setSvrConfig(503, 0, 0, this.sPp.sUP, this.sPp.sUQ, this.sPp.sUR, this.sPp.sUS);
      if ((this.sPp.sVg != null) && (this.sPp.sVh != null))
      {
        this.sPp.setSvrConfig(504, 0, 0, this.sPp.sVf, 0, 0, 0);
        this.sPp.setSvrConfig(505, 0, 0, this.sPp.sVg[0], this.sPp.sVg[1], this.sPp.sVg[2], this.sPp.sVg[3]);
        this.sPp.setSvrConfig(506, 0, 0, this.sPp.sVh[0], this.sPp.sVh[1], 0, 0);
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "FECSvrCtr = " + this.sPp.sVf + ",FECKeyPara1 = " + this.sPp.sVg[0] + "," + this.sPp.sVg[1] + "," + this.sPp.sVg[2] + "," + this.sPp.sVg[3] + ",FECKeyPara2 = " + this.sPp.sVh[0] + "," + this.sPp.sVh[1]);
      }
      j = this.sPp.sUT;
      k = this.sPp.sUT;
      m = this.sPp.sUT;
      this.sPp.setSvrConfig(507, 0, 0, (j & 0x4) >> 2, (k & 0x2) >> 1, m & 0x1, 0);
      this.sPp.setjbmbitraterssvrparam();
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "zhengxue[Logic] setSvrConfig brefore onStartTalk: audioTsdfBeyond3G = " + this.sPp.sUE + ",audioTsdEdge = " + this.sPp.sUF + ",passthroughQosAlgorithm = " + this.sPp.sUG + ",fastPlayRepair = " + this.sPp.sUH + ", audioDTX = " + this.sPp.sUJ + ", mARQFlag = " + i + ", mQosStrategy = " + this.sPp.sUT + ", mSvrCfgListV = " + this.sPp.sUI + ", maxBRForRelay = " + this.sPp.sUL);
      localObject2 = new byte[2];
      localObject2[0] = ((byte)(byte)q.etc.eru);
      localObject2[1] = ((byte)-1);
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "steve: Model Name: " + Build.MODEL);
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "steve: Image Enhancement for Android Capture!!, mode: " + localObject2[0]);
      this.sPp.setAppCmd(15, (byte[])localObject2, 1);
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "anlin: ClientVersion: " + com.tencent.mm.protocal.d.vxo);
      localObject2 = ByteBuffer.allocate(4);
      ((ByteBuffer)localObject2).order(ByteOrder.LITTLE_ENDIAN).putInt(com.tencent.mm.protocal.d.vxo);
      localObject2 = ((ByteBuffer)localObject2).array();
      this.sPp.setAppCmd(505, (byte[])localObject2, 4);
      if ((this.sPp.sUi & 0x2) == 0)
        am(16, true);
      localObject2 = new byte[4];
      this.sPp.setAppCmd(26, (byte[])localObject2, 4);
      localObject2 = ByteBuffer.wrap((byte[])localObject2);
      ((ByteBuffer)localObject2).order(ByteOrder.LITTLE_ENDIAN);
      m = ((ByteBuffer)localObject2).getInt();
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "steve: iHW: ".concat(String.valueOf(m)));
      if (((this.sPp.sUI & 0x4) == 0) && (q.etc.erw <= 0))
        break label2293;
      i = 1;
      if ((i == 0) && (this.sPp.sVM))
      {
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:Server Disable HW enc/dec!!");
        if ((m & 0x4) == 0)
          break label2298;
        i = 1;
        if ((m & 0x8) == 0)
          break label2303;
        j = 1;
        if ((i != 0) || (j != 0))
        {
          this.sPr.sPU = true;
          mq(false);
        }
        this.sPp.sVM = false;
      }
      if (this.sPp.sVM)
      {
        localObject1 = this.sPp;
        k = q.etc.erw;
        bool = false;
        if ((m & 0x4) == 0)
          break label2309;
        i = 1;
        label1536: if ((m & 0x8) == 0)
          break label2314;
        j = 1;
        label1547: if ((i != 0) || (j != 0))
          if (i == 0)
            break label2320;
      }
    }
    label2309: label2314: label2320: for (Object localObject2 = "video/hevc"; ; localObject2 = "video/avc")
    {
      ((v2protocal)localObject1).sVI = new e(((v2protocal)localObject1).width, ((v2protocal)localObject1).height, ((v2protocal)localObject1).sVK, ((v2protocal)localObject1).bitrate, k, (String)localObject2);
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "steve : create HW encoder successfully:".concat(String.valueOf(localObject2)));
      if (v2protocal.sVL != null)
      {
        v2protocal.sVJ = new d(v2protocal.sVL);
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip", "steve : create HW decoder successfully!");
      }
      bool = true;
      if ((((v2protocal)localObject1).sVI == null) || (v2protocal.sVJ == null))
      {
        ((v2protocal)localObject1).sVM = false;
        bool = false;
      }
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve: HW encoder/decoder init ret: " + bool + ", iHW:" + m);
      if (!this.sPp.sVM)
      {
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve: HW dec/enc NOT supported for both sides,end HWEnc!!");
        this.sPr.sPU = true;
        mq(false);
      }
      if (this.sPp.sVI != null)
        this.sPp.sVI.sNl = this;
      if (v2protocal.sVJ != null)
        v2protocal.sVJ.a(this);
      this.sOS = true;
      this.sPA = false;
      localObject2 = this.sPB;
      ((VoipScoreState)localObject2).nxT = bf.aaa();
      ab.i("MicroMsg.VoipScoreState", "markStartTalk, startTalkTime:%s", new Object[] { Long.valueOf(((VoipScoreState)localObject2).nxT) });
      AppMethodBeat.o(4416);
      break;
      this.sOS = false;
      this.sPp.sVH.sQE = 1;
      break label221;
      label1834: if (this.sPE != null)
      {
        cIR();
        break label243;
      }
      this.sPE = new Timer();
      this.sPF = 0;
      localObject2 = new k.5(this);
      this.sPE.schedule((TimerTask)localObject2, 200L, 200L);
      break label243;
      label1890: com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipDeviceHandler", "start device......");
      ((m)localObject1).kzf = 2;
      ((m)localObject1).sPU = false;
      ((m)localObject1).sPV = 0;
      if (((m)localObject1).sQa != null)
      {
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipDeviceHandler", "stop videodecode thread..");
        ((m)localObject1).sQa.sQd = true;
        com.tencent.mm.sdk.g.d.xDG.remove(((m)localObject1).sQa);
        ((m)localObject1).sQa = null;
      }
      ((m)localObject1).sQa = new m.b((m)localObject1);
      com.tencent.mm.sdk.g.d.post(((m)localObject1).sQa, "VoipDeviceHandler_decode");
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipDeviceHandler", "start video decode thread..");
      q.etd.dump();
      ((m)localObject1).sPL = new c();
      localObject2 = new a();
      i = ((m)localObject1).sNl.sPp.a((a)localObject2);
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipDeviceHandler", "  VoipDeivceHandler.GetAudioDeviceFmt, play samplerate:" + ((a)localObject2).pug + ", framelen: " + ((a)localObject2).sNh + ", ret:" + i);
      ((m)localObject1).sPL.G(((a)localObject2).pug, ((a)localObject2).channels, ((a)localObject2).sNh, 0);
      ((m)localObject1).kzg = ((m)localObject1).sPL.x(((m)localObject1).sNl.jiq, true);
      if (((m)localObject1).sPL.sNk == true)
      {
        i = 1;
        label2126: int n = (byte)i;
        ((m)localObject1).sNl.sPp.setAppCmd(502, new byte[] { n }, 1);
        if (((m)localObject1).kzg <= 10)
        {
          if (((m)localObject1).kzg <= 0)
            ((m)localObject1).kzj = 1;
          ((m)localObject1).kzg = 92;
        }
        if ((!g.KK().KV()) && (!g.KK().KP()))
          break label2257;
        com.tencent.mm.plugin.voip.b.cIj().jj(true);
      }
      while (true)
      {
        ((m)localObject1).sPL.sNt = new m.2((m)localObject1);
        if (((m)localObject1).sPL.cIp() <= 0)
          ((m)localObject1).kzj = 1;
        com.tencent.mm.sdk.g.d.f(new m.3((m)localObject1), "voip_start_record");
        break;
        i = 0;
        break label2126;
        label2257: com.tencent.mm.plugin.voip.b.cIj().jj(false);
      }
      label2267: ((n)localObject2).sQx = ((int)(System.currentTimeMillis() - ((n)localObject2).beginTime));
      break label296;
      label2283: i = (j << 2) + i;
      break label660;
      label2293: i = 0;
      break label1429;
      label2298: i = 0;
      break label1460;
      label2303: j = 0;
      break label1471;
      i = 0;
      break label1536;
      j = 0;
      break label1547;
    }
  }

  public final boolean cIP()
  {
    AppMethodBeat.i(4419);
    boolean bool = cIL();
    int i = 0;
    if (bool)
      i = 1;
    if ((this.sPn == -1) || (this.sPn != i))
    {
      this.sPn = i;
      if (!bool)
        break label71;
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "setAppCmd: set start video Out.......!");
      this.sPp.setAppCmd(203);
    }
    while (true)
    {
      AppMethodBeat.o(4419);
      return bool;
      label71: com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video Out.......!");
      this.sPp.setAppCmd(202);
    }
  }

  public final boolean cIQ()
  {
    AppMethodBeat.i(4420);
    boolean bool = cIM();
    int i = 0;
    if (bool)
      i = 1;
    if ((this.sPo == -1) || (this.sPo != i))
    {
      this.sPo = i;
      if (!bool)
        break label71;
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "setAppCmd: set start video In.......!");
      this.sPp.setAppCmd(201);
    }
    while (true)
    {
      AppMethodBeat.o(4420);
      return bool;
      label71: com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video In.......!");
      this.sPp.setAppCmd(200);
    }
  }

  final void cIR()
  {
    AppMethodBeat.i(4421);
    if (this.mStatus == 5)
    {
      setStatus(6);
      this.sPp.sVH.cJa();
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "talking  now .......!");
      this.mHandler.post(new k.4(this));
    }
    AppMethodBeat.o(4421);
  }

  public final void cIT()
  {
    AppMethodBeat.i(4425);
    boolean bool;
    if (!bo.cb(this.sPp.sUa))
    {
      bool = true;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "channel:try start connect, hasRemotePid:" + bool + ",mStatus:" + this.mStatus + ",isPreConnect:" + this.sOR + ",isRemoteAccepted:" + this.sOO + ",isLocalAccept:" + this.cJn);
      this.sPp.sVH.sQq = 7;
      if ((!bool) || ((this.mStatus != 4) && (this.mStatus != 5) && (this.mStatus != 6) && ((this.mStatus != 2) || (this.sOR != true)) && ((this.mStatus != 3) || (this.sOR != true))))
        break label309;
      if ((this.mStatus == 2) || (this.mStatus == 3) || (this.mStatus == 4) || (this.mStatus == 5) || (this.mStatus == 6))
        break label246;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "startConnect status fail, status:" + this.mStatus);
      AppMethodBeat.o(4425);
    }
    label309: 
    while (true)
    {
      return;
      bool = false;
      break;
      label246: if ((!this.sOO) && (!this.cJn))
      {
        if ((this.sOR) && (!this.sOL))
        {
          cIS();
          AppMethodBeat.o(4425);
        }
      }
      else
      {
        if (!this.sOL)
          cIS();
        al.d(new k.7(this));
        AppMethodBeat.o(4425);
      }
    }
  }

  public final void cIU()
  {
    AppMethodBeat.i(4426);
    if ((this.sOM) && (!bo.cb(this.sPp.sUc)))
    {
      int i = this.sPp.handleCommand(this.sPp.sUc, this.sPp.sUc.length);
      if (i < 0)
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "v2protocal handlecommand failed ret:".concat(String.valueOf(i)));
      this.sPp.sUc = null;
    }
    AppMethodBeat.o(4426);
  }

  public final void cIV()
  {
    AppMethodBeat.i(4431);
    ab.i("MicroMsg.Voip.VoipContext", "stop repeat voip sync");
    this.sPD.stopTimer();
    AppMethodBeat.o(4431);
  }

  public final int cIt()
  {
    AppMethodBeat.i(4410);
    m localm = this.sPr;
    int i;
    if (localm.sPL != null)
    {
      i = localm.sPL.cIt();
      AppMethodBeat.o(4410);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(4410);
    }
  }

  public final void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.sPp.sUO = paramInt1;
    this.sPp.sUP = paramInt2;
    this.sPp.sUQ = paramInt3;
    this.sPp.sUR = paramInt4;
    this.sPp.sUS = paramInt5;
  }

  public final int mo(boolean paramBoolean)
  {
    AppMethodBeat.i(4413);
    if (paramBoolean);
    for (int i = this.sPp.setAppCmd(412); ; i = this.sPp.setAppCmd(413))
    {
      if (i < 0)
        com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.Voip.VoipContext", "voipContext tryMuteMicrophone ret:".concat(String.valueOf(i)));
      AppMethodBeat.o(4413);
      return i;
    }
  }

  public final int mp(boolean paramBoolean)
  {
    AppMethodBeat.i(4414);
    if (paramBoolean);
    for (int i = this.sPp.setAppCmd(401); ; i = this.sPp.setAppCmd(402))
    {
      if (i < 0)
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "voipContext trySwitchSpeakerPhone ret:".concat(String.valueOf(i)));
      AppMethodBeat.o(4414);
      return i;
    }
  }

  public final void mq(boolean paramBoolean)
  {
    AppMethodBeat.i(4417);
    if (paramBoolean)
      Gi(2);
    if (this.sPp != null)
    {
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:closeRemoteHWEnc: Set P2S HW Flag False!!");
      am(8, false);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      localByteBuffer.putInt(6);
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:closeRemoteHWEnc:reset maxsizeformat: 6");
      this.sPp.setAppCmd(30, localByteBuffer.array(), 4);
    }
    AppMethodBeat.o(4417);
  }

  public final void reset()
  {
    AppMethodBeat.i(4401);
    ab.i("MicroMsg.Voip.VoipContext", "reset");
    this.sPq.cJD();
    if (this.sPp.cKK())
      this.sPp.mx(false);
    this.sPp.reset();
    this.sPd = -1;
    this.sPe = -1;
    this.sPf = -1;
    this.sPg = -1;
    this.sPh = -1;
    this.sPr.cIY();
    this.sPp.sUs = 0;
    this.sPG.stopTimer();
    this.sPs.cKs();
    this.sPD.stopTimer();
    this.sOL = false;
    this.sON = false;
    this.sOM = false;
    this.sOO = false;
    this.cJn = false;
    this.sOP = false;
    this.sPt = null;
    this.sPu = null;
    this.sOZ = false;
    this.sPa = false;
    this.sPb = false;
    this.sPi = false;
    this.sPj = false;
    this.sPl = false;
    this.sPk = 1;
    this.sPm = 1;
    this.sPv = false;
    this.sPn = -1;
    this.sPo = -1;
    this.sOQ = false;
    this.sOR = false;
    this.sOP = false;
    this.sOL = false;
    this.sOS = false;
    this.sPc = 10;
    this.mStatus = 1;
    this.sPz = 0;
    this.sPC = 0;
    this.sPA = false;
    AppMethodBeat.o(4401);
  }

  public final void setStatus(int paramInt)
  {
    AppMethodBeat.i(4408);
    if (paramInt == this.mStatus)
      AppMethodBeat.o(4408);
    while (true)
    {
      return;
      if (paramInt == 4)
        this.sPG.ae(60000L, 60000L);
      this.mStatus = paramInt;
      AppMethodBeat.o(4408);
    }
  }

  public final void shutdown()
  {
    AppMethodBeat.i(4407);
    cIV();
    this.mHandler.post(new k.2(this));
    AppMethodBeat.o(4407);
  }

  public final void v(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(4432);
    cIV();
    if (this.sPH != null)
      this.sPH.v(paramInt1, paramInt2, paramString);
    AppMethodBeat.o(4432);
  }

  public static abstract interface a
  {
    public abstract void v(int paramInt1, int paramInt2, String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.k
 * JD-Core Version:    0.6.2
 */