package com.tencent.mm.plugin.voip.model;

import android.media.MediaCodec;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class m
{
  public static int kze = 3;
  public static int sPY = 0;
  public static int sPZ = 0;
  volatile com.tencent.mm.audio.b.c kzb;
  public int kzf;
  int kzg;
  private int kzh;
  private final Object kzi;
  public int kzj;
  private int kzk;
  private long kzl;
  private c.a kzo;
  public k sNl;
  c sPL;
  private long sPM;
  private long sPN;
  private int sPO;
  private int sPP;
  private long sPQ;
  private int sPR;
  private int sPS;
  public boolean sPT;
  public boolean sPU;
  public int sPV;
  private int sPW;
  private long sPX;
  m.b sQa;

  public m(k paramk)
  {
    AppMethodBeat.i(4441);
    this.sPL = null;
    this.kzb = null;
    this.kzf = 1;
    this.sNl = null;
    this.kzg = 92;
    this.sPM = 0L;
    this.sPN = 0L;
    this.sPO = 1;
    this.sPP = 0;
    this.kzh = 1;
    this.sPQ = 0L;
    this.sPR = 0;
    this.sPS = 0;
    this.kzi = new Object();
    this.kzj = 0;
    this.sPT = false;
    this.sPU = false;
    this.sPV = 0;
    this.kzk = 1;
    this.sPW = 1;
    this.kzl = 0L;
    this.sPX = 0L;
    this.kzo = new m.1(this);
    this.sNl = paramk;
    AppMethodBeat.o(4441);
  }

  public final int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(4446);
    if (this.kzf != 2)
    {
      paramInt1 = 0;
      AppMethodBeat.o(4446);
    }
    while (true)
    {
      return paramInt1;
      if (this.sNl.cIP())
        break;
      paramInt1 = 0;
      AppMethodBeat.o(4446);
    }
    Object localObject1 = this.sNl.sPp;
    ((v2protocal)localObject1).sVr += 1;
    if (this.sPU)
    {
      ab.i("MicroMsg.Voip.VoipDeviceHandler", "steve: StopHWEnc!!!");
      this.sNl.sPp.sVM = false;
      this.sPT = false;
      this.sPU = false;
      this.sNl.Gi(1);
    }
    int j;
    label608: int k;
    if ((this.sNl.sPp.sVM) && (this.sNl.sPp.sVI != null))
    {
      localObject1 = this.sNl.sPp.sVI;
      if ((((e)localObject1).sNl != null) && (((e)localObject1).sNl.sPp != null))
      {
        Object localObject2;
        if (((e)localObject1).sNl.sPp.setAppCmd(e.EMethodGetQosPara, ((e)localObject1).sOz.s2p, ((e)localObject1).sOz.s2p.length) >= 0)
        {
          localObject2 = ((e)localObject1).sOz;
          ByteBuffer localByteBuffer = ByteBuffer.wrap(((e.a)localObject2).s2p);
          localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
          ((e.a)localObject2).iKbps = localByteBuffer.getShort();
          ((e.a)localObject2).cFps = localByteBuffer.get();
          ((e.a)localObject2).cIPeriod = localByteBuffer.get();
          ((e.a)localObject2).cRSLevel = localByteBuffer.get();
          ((e.a)localObject2).cQPmin = localByteBuffer.get();
          ((e.a)localObject2).cQPmax = localByteBuffer.get();
          ((e.a)localObject2).cHPPMaxLyr = localByteBuffer.get();
          ((e.a)localObject2).cSwitch = localByteBuffer.get();
          ((e.a)localObject2).cResolution = localByteBuffer.get();
          ((e.a)localObject2).cRsvd1 = localByteBuffer.get();
          ((e.a)localObject2).cRsvd2 = localByteBuffer.get();
          ((e.a)localObject2).cSkipFlag = localByteBuffer.get();
          ((e.a)localObject2).cIReqFlag = localByteBuffer.get();
          localObject2 = ((e)localObject1).sOz;
          ab.d("MeidaCodec[HWEnc]", "raw S2P:" + ((e.a)localObject2).s2p);
          ab.d("MeidaCodec[HWEnc]", "-S2P- iKbps:" + ((e.a)localObject2).iKbps + ", fps:" + ((e.a)localObject2).cFps + ", IP:" + ((e.a)localObject2).cIPeriod + ", RS:" + ((e.a)localObject2).cRSLevel + ", QPMin:" + ((e.a)localObject2).cQPmin + ", QPMax:" + ((e.a)localObject2).cQPmax + ", HPP:" + ((e.a)localObject2).cHPPMaxLyr + ", SWitch:" + ((e.a)localObject2).cSwitch + ", Reso:" + ((e.a)localObject2).cResolution + ", Rsvd1:" + ((e.a)localObject2).cRsvd1 + ", Rsvd2:" + ((e.a)localObject2).cRsvd2 + ", Skip:" + ((e.a)localObject2).cSkipFlag + ", IReq:" + ((e.a)localObject2).cIReqFlag);
        }
        int i = ((e)localObject1).sOz.iKbps;
        if (((e)localObject1).sOv != 8)
          break label1151;
        j = 1;
        k = i;
        if (j == 0)
        {
          double d = 1.0D * Math.max(Math.min(((e)localObject1).sNl.sPp.sUK, 30), 0) / 100.0D;
          k = (int)(i * (1.0D + d));
        }
        if (((e)localObject1).m_br_kbps != k)
        {
          ((e)localObject1).SetBitRate(k);
          ab.i("MeidaCodec[HWEnc]", "steve[QoS]: Update BR! frameID: " + e.frameID + ", new_br: " + ((e)localObject1).m_br_kbps + ", tuneBR:" + k + ", tuneRatio:" + ((e)localObject1).sNl.sPp.sUK);
          ((e)localObject1).m_br_kbps = k;
        }
        if ((1 == ((e)localObject1).sOz.cIReqFlag) && (e.frameID > 0))
        {
          if (((e)localObject1).mediaCodec != null)
          {
            ab.v("MeidaCodec[HWEnc]", "steve: Sync frame request soon!");
            localObject2 = new Bundle();
            ((Bundle)localObject2).putInt("request-sync", 0);
            ((e)localObject1).mediaCodec.setParameters((Bundle)localObject2);
          }
          ab.i("MeidaCodec[HWEnc]", "steve[QoS]: Force I Frame! frameID: " + e.frameID);
        }
        if (((e)localObject1).sOz.cFps != ((e)localObject1).m_framerate)
          ((e)localObject1).m_framerate = ((e)localObject1).sOz.cFps;
      }
      boolean bool = this.sNl.sPp.sVI.ENCODING.equalsIgnoreCase("video/avc");
      if ((this.sNl.sPp.sVI.ENCODING.equalsIgnoreCase("video/hevc")) || ((bool) && (1 == (this.sNl.sPp.sVI.sOz.cRsvd1 & 0x1)) && (this.sNl.sPp.sVI.sOz.cResolution >= 6)))
      {
        this.sPT = true;
        label965: long l = System.currentTimeMillis();
        ab.d("MicroMsg.Voip.VoipDeviceHandler", "steve: put video capture in, time:" + l + ", len:" + paramInt1 + ", cnt:" + this.sNl.sPp.sVr + ", mIsHWEncEnable:" + this.sNl.sPp.sVM + ", mIsHWEncUsing:" + this.sPT);
        k = 0;
        if ((!this.sPT) || (this.sNl.sPp.sVI == null))
          break label1199;
        if (1 != this.sPV >> 8)
        {
          this.sPV |= 256;
          this.sNl.sPq.setHWDecMode(this.sPV);
        }
        paramInt1 = this.sNl.sPp.sVI.e(paramArrayOfByte, paramInt3, paramInt4, paramInt2);
        if (paramInt1 < 0)
          break label1173;
        paramInt1 = 1;
      }
    }
    while (true)
    {
      AppMethodBeat.o(4446);
      break;
      label1151: j = 0;
      break label608;
      this.sPT = false;
      break label965;
      this.sPT = false;
      break label965;
      label1173: ab.d("MicroMsg.Voip.VoipDeviceHandler", "StopHWEnc!! hw encoder error: ".concat(String.valueOf(paramInt1)));
      this.sPU = true;
      paramInt1 = k;
      continue;
      label1199: if (this.sPV >> 8 != 0)
      {
        this.sPV &= -257;
        this.sNl.sPq.setHWDecMode(this.sPV);
      }
      paramInt1 = this.sNl.sPp.videoEncodeToSend(paramArrayOfByte, paramInt1, paramInt3, paramInt4, paramInt2);
    }
  }

  public final int cIX()
  {
    if ((this.kzb != null) && (this.sNl.sPp.sVH.sQo == 1));
    for (int i = this.kzb.cpq; ; i = 0)
      return i;
  }

  public final void cIY()
  {
    int i = 0;
    while (true)
    {
      try
      {
        AppMethodBeat.i(4443);
        ab.i("MicroMsg.Voip.VoipDeviceHandler", "stopDev, recorder: %s", new Object[] { this.kzb });
        if (this.kzf == kze)
        {
          a.Loge("MicroMsg.Voip.VoipDeviceHandler", "devcie stoped already.");
          synchronized (this.kzi)
          {
            if (this.kzb != null)
            {
              ab.e("MicroMsg.Voip.VoipDeviceHandler", "status DEV_STOP, but recorder still not null!!");
              this.kzb.EB();
              this.kzb = null;
            }
            AppMethodBeat.o(4443);
            return;
          }
        }
      }
      finally
      {
      }
      a.Logi("MicroMsg.Voip.VoipDeviceHandler", "stop device..");
      this.kzf = kze;
      if (this.sQa != null)
      {
        a.Logd("MicroMsg.Voip.VoipDeviceHandler", "stop videodecode thread..");
        this.sQa.sQd = true;
        d.xDG.remove(this.sQa);
        this.sQa = null;
      }
      this.kzh = 1;
      this.sPR = 0;
      this.kzk = 1;
      this.sPW = 1;
      this.kzl = 0L;
      this.sPX = 0L;
      this.kzg = 92;
      this.sPM = 0L;
      this.sPN = 0L;
      this.sPO = 1;
      this.sPP = 0;
      this.kzj = 0;
      this.sNl.sPp.sUo = cIX();
      this.sNl.sPp.sUp = cIs();
      ??? = this.sNl.sPp;
      int j;
      if ((this.kzb != null) && (this.sNl.sPp.sVH.sQo == 1))
      {
        j = this.kzb.EO();
        ((v2protocal)???).sUs = j;
        ??? = this.sNl.sPp;
        j = i;
        if (this.sPL != null)
        {
          j = i;
          if (this.sNl.sPp.sVH.sQo == 1)
            j = this.sPL.cIt();
        }
        float f = g.KK().getStreamMaxVolume(j);
        ((v2protocal)???).sUz = ((int)(g.KK().getStreamVolume(j) / f * 100.0F));
      }
      synchronized (this.kzi)
      {
        if ((this.sPL != null) && (this.kzb != null))
        {
          m.a locala = new com/tencent/mm/plugin/voip/model/m$a;
          locala.<init>(this, this.sPL, this.kzb);
          d.f(locala, "VoipDeviceHandler_stopDev");
          ab.i("MicroMsg.Voip.VoipDeviceHandler", "do stop record");
          this.sPL = null;
          this.kzb = null;
        }
        AppMethodBeat.o(4443);
        continue;
        j = -2;
      }
    }
  }

  public final void cIZ()
  {
    AppMethodBeat.i(4444);
    ab.c("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord, recorder %s", new Object[] { this.kzb });
    synchronized (this.kzi)
    {
      if (this.kzb != null)
      {
        ab.i("MicroMsg.Voip.VoipDeviceHandler", "do stop record");
        this.kzb.EB();
        this.kzb = null;
      }
      AppMethodBeat.o(4444);
      return;
    }
  }

  public final int cIs()
  {
    AppMethodBeat.i(4442);
    int i;
    if ((this.sPL != null) && (this.sNl.sPp.sVH.sQo == 1))
    {
      i = this.sPL.cIs();
      AppMethodBeat.o(4442);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(4442);
    }
  }

  public final boolean mj(boolean paramBoolean)
  {
    AppMethodBeat.i(4445);
    if (this.sPL != null)
    {
      paramBoolean = this.sPL.mj(paramBoolean);
      AppMethodBeat.o(4445);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(4445);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.m
 * JD-Core Version:    0.6.2
 */