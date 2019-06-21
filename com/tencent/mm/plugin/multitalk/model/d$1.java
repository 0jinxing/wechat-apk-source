package com.tencent.mm.plugin.multitalk.model;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bs;
import junit.framework.Assert;

final class d$1
  implements com.tencent.pb.talkroom.sdk.e
{
  d$1(d paramd)
  {
  }

  public final int Lw()
  {
    AppMethodBeat.i(53894);
    int i = m.Lw();
    AppMethodBeat.o(53894);
    return i;
  }

  public final int a(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.b paramb)
  {
    AppMethodBeat.i(53897);
    this.oFU.oFS = paramb;
    paramInt1 = this.oFU.oFQ.a(this.oFU.oFT, paramInt1, paramInt2);
    ab.i("MicroMsg.MT.MultiTalkEngine", "isSpeakerOn=%b isHandsFree=%b", new Object[] { Boolean.valueOf(com.tencent.mm.compatible.b.g.KK().KU()), Boolean.valueOf(p.bSf().oGb) });
    if ((com.tencent.mm.compatible.b.g.KK().KU() != p.bSf().oGb) && (p.bSf().nwe.DB()))
      this.oFU.oFQ.io(p.bSf().oGb);
    AppMethodBeat.o(53897);
    return paramInt1;
  }

  public final int a(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.c paramc)
  {
    int i = 1;
    AppMethodBeat.i(53898);
    this.oFU.oFR = paramc;
    this.oFU.kzb = new com.tencent.mm.audio.b.c(paramInt1, 1, 7);
    this.oFU.kzb.gG(paramInt2);
    this.oFU.kzb.br(true);
    this.oFU.kzb.EJ();
    this.oFU.kzb.cpB = -19;
    this.oFU.kzb.v(1, false);
    this.oFU.kzb.bq(true);
    this.oFU.kzb.cpM = this.oFU.cqd;
    if (this.oFU.kzb.EL())
    {
      AppMethodBeat.o(53898);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = -1;
      AppMethodBeat.o(53898);
    }
  }

  public final boolean bRj()
  {
    AppMethodBeat.i(53893);
    int i = m.Lw();
    ab.i("MicroMsg.MT.MultiTalkEngine", "loadVoipCodecLib cpuFlag:".concat(String.valueOf(i)));
    if ((i & 0x400) != 0)
      com.tencent.mm.compatible.loader.d.B(ah.getContext(), "libvoipCodec_v7a.so");
    while (true)
    {
      AppMethodBeat.o(53893);
      return true;
      if ((i & 0x200) != 0)
      {
        com.tencent.mm.compatible.loader.d.B(ah.getContext(), "libvoipCodec.so");
        Assert.assertTrue("Can't remove libvoipCodec.so yet.", false);
      }
      else
      {
        com.tencent.mm.compatible.loader.d.B(ah.getContext(), "libvoipCodec_v5.so");
        Assert.assertTrue("Can't remove libvoipCodec.so yet.", false);
      }
    }
  }

  public final int bRk()
  {
    AppMethodBeat.i(53895);
    Object localObject = com.tencent.mm.kernel.g.RP().Rz().dur();
    q.ku((String)localObject);
    ab.i("MicroMsg.MT.MultiTalkEngine", "MTSDK audioAdapter startRecord setMultiTalkAppCmd info: ".concat(String.valueOf(localObject)));
    localObject = this.oFU;
    byte[] arrayOfByte1 = new byte[1];
    arrayOfByte1[0] = ((byte)0);
    byte[] arrayOfByte2 = new byte[2];
    byte[] arrayOfByte3;
    if (q.etd.eqq >= 0)
    {
      arrayOfByte2[0] = ((byte)(byte)q.etd.eqq);
      ((d)localObject).oFP.setAppCmd(406, arrayOfByte2, 1);
      if (q.etd.eqt < 0)
        break label899;
      arrayOfByte3 = new byte[5];
      if ((q.etd.equ >= 0) && (q.etd.eqv >= 0))
      {
        arrayOfByte3[0] = ((byte)(byte)q.etd.equ);
        arrayOfByte3[1] = ((byte)(byte)q.etd.eqv);
        if (q.etd.eqw < 0)
          break label880;
        arrayOfByte3[2] = ((byte)(byte)q.etd.eqw);
        arrayOfByte3[3] = ((byte)(byte)q.etd.eqt);
        arrayOfByte3[4] = ((byte)(byte)q.etd.eqx);
        ((d)localObject).oFP.setAppCmd(404, arrayOfByte3, 5);
      }
      label203: if (q.etd.eqr < 0)
        break label928;
      arrayOfByte2[0] = ((byte)(byte)q.etd.eqr);
      ((d)localObject).oFP.setAppCmd(408, arrayOfByte2, 1);
    }
    while (true)
    {
      if ((q.etd.eqC[0] > 0) || (q.etd.eqC[1] > 0))
      {
        arrayOfByte2[0] = ((byte)0);
        arrayOfByte2[1] = ((byte)0);
        if ((q.etd.eqC[0] > 0) && (q.etd.eqC[0] < 10000))
          arrayOfByte2[0] = ((byte)(byte)q.etd.eqC[0]);
        if ((q.etd.eqC[1] > 0) && (q.etd.eqC[1] < 10000))
          arrayOfByte2[1] = ((byte)(byte)q.etd.eqC[1]);
        ((d)localObject).oFP.setAppCmd(423, arrayOfByte2, 2);
      }
      if ((q.etd.epT >= 0) || (q.etd.epV >= 0))
      {
        arrayOfByte2[0] = ((byte)-1);
        arrayOfByte2[1] = ((byte)-1);
        if (q.etd.epT >= 0)
          arrayOfByte2[0] = ((byte)(byte)q.etd.epT);
        if (q.etd.epV >= 0)
          arrayOfByte2[1] = ((byte)(byte)q.etd.epV);
        ((d)localObject).oFP.setAppCmd(414, arrayOfByte2, 2);
      }
      if ((q.etd.epU >= 0) || (q.etd.epW >= 0))
      {
        arrayOfByte2[0] = ((byte)-1);
        arrayOfByte2[1] = ((byte)-1);
        if (q.etd.epU >= 0)
          arrayOfByte2[0] = ((byte)(byte)q.etd.epU);
        if (q.etd.epW >= 0)
          arrayOfByte2[1] = ((byte)(byte)q.etd.epW);
        ((d)localObject).oFP.setAppCmd(415, arrayOfByte2, 2);
      }
      if ((q.etd.epX >= 0) || (q.etd.epY >= 0))
      {
        arrayOfByte2[0] = ((byte)-1);
        arrayOfByte2[1] = ((byte)-1);
        if (q.etd.epX >= 0)
          arrayOfByte2[0] = ((byte)(byte)q.etd.epX);
        if (q.etd.epY >= 0)
          arrayOfByte2[1] = ((byte)(byte)q.etd.epY);
        ((d)localObject).oFP.setAppCmd(422, arrayOfByte2, 2);
      }
      if (q.etd.epZ >= 0)
      {
        arrayOfByte2[0] = ((byte)(byte)q.etd.epZ);
        ((d)localObject).oFP.setAppCmd(416, arrayOfByte2, 1);
      }
      if ((q.etd.eqa >= 0) && (q.etd.eqa != 5))
      {
        arrayOfByte2[0] = ((byte)(byte)q.etd.eqa);
        ((d)localObject).oFP.setAppCmd(417, arrayOfByte2, 1);
      }
      if ((q.etd.eqb >= 0) && (q.etd.eqb != 5))
      {
        arrayOfByte2[0] = ((byte)(byte)q.etd.eqb);
        ((d)localObject).oFP.setAppCmd(418, arrayOfByte2, 1);
      }
      if (q.etd.eqc >= 0)
      {
        arrayOfByte2[0] = ((byte)(byte)q.etd.eqc);
        ((d)localObject).oFP.setAppCmd(419, arrayOfByte2, 1);
      }
      if (1 != q.etd.eqA)
        break label974;
      arrayOfByte3 = new byte[30];
      for (int i = 0; i < 15; i++)
      {
        arrayOfByte3[(i * 2)] = ((byte)(byte)(q.etd.eqB[i] & 0xFF));
        arrayOfByte3[(i * 2 + 1)] = ((byte)(byte)(q.etd.eqB[i] >> 8 & 0xFF));
      }
      if (q.etd.eqq != -2)
        break;
      ((d)localObject).oFP.setAppCmd(407, arrayOfByte1, 1);
      break;
      label880: ((d)localObject).oFP.setAppCmd(404, arrayOfByte3, 2);
      break label203;
      label899: if (q.etd.eqt != -2)
        break label203;
      ((d)localObject).oFP.setAppCmd(405, arrayOfByte1, 1);
      break label203;
      label928: if (q.etd.eqr == -2)
        ((d)localObject).oFP.setAppCmd(409, arrayOfByte1, 1);
    }
    ((d)localObject).oFP.setAppCmd(420, arrayOfByte3, 30);
    label974: if (q.etd.eqA == 0)
      ((d)localObject).oFP.setAppCmd(421, arrayOfByte1, 1);
    if (q.etd.eqE > 0)
    {
      arrayOfByte2[0] = ((byte)(byte)q.etd.eqE);
      ((d)localObject).oFP.setAppCmd(424, arrayOfByte2, 1);
    }
    if (q.etd.eqd > 0)
    {
      arrayOfByte2[0] = ((byte)(byte)q.etd.eqd);
      ((d)localObject).oFP.setAppCmd(431, arrayOfByte2, 4);
    }
    if (q.etd.eqM >= 0)
    {
      int j = (byte)q.etd.eqM;
      int k = (byte)q.etd.eqN;
      int m = (byte)q.etd.eqO;
      int n = (byte)q.etd.eqP;
      ((d)localObject).oFP.setAppCmd(426, new byte[] { j, k, m, n }, 4);
    }
    AppMethodBeat.o(53895);
    return 0;
  }

  public final boolean bRl()
  {
    AppMethodBeat.i(53899);
    ab.i("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkPlayer");
    c localc = this.oFU.oFQ;
    synchronized (localc.kzr)
    {
      ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "stopPlay, isStart: %s %s", new Object[] { Boolean.valueOf(localc.cFy), Integer.valueOf(localc.hashCode()) });
      if (localc.cFy)
      {
        com.tencent.mm.plugin.voip.model.c localc1 = localc.kzq;
        if (localc1 != null)
        {
          localc.kzw.evE = SystemClock.elapsedRealtime();
          localc1.cIr();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("stopPlaying cost: ");
          ab.i("MicroMsg.MT.MultiTalkAudioPlayer", localc.kzw.Mr());
          localc1.cIo();
          localc.cFy = false;
          localc.kzq = null;
          com.tencent.mm.compatible.b.g.KK().La();
          com.tencent.mm.compatible.b.g.KK().setMode(0);
        }
        localc.kzs.fa(ah.getContext());
        com.tencent.mm.compatible.b.g.KK().b(localc);
        localc.gar.Mm();
      }
      AppMethodBeat.o(53899);
      return true;
    }
  }

  public final boolean bRm()
  {
    AppMethodBeat.i(53900);
    ab.i("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkRecord");
    try
    {
      if (this.oFU.kzb != null)
      {
        this.oFU.kzb.cpM = null;
        this.oFU.kzb.EB();
      }
      this.oFU.kzb = null;
      bool = true;
      AppMethodBeat.o(53900);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkPlayer :".concat(String.valueOf(localException)));
        boolean bool = false;
        AppMethodBeat.o(53900);
      }
    }
  }

  public final int bRn()
  {
    int i = 0;
    AppMethodBeat.i(53901);
    ab.i("MicroMsg.MT.MultiTalkEngine", "getMultiTalkPlayVolume");
    int j = i;
    if (this.oFU.oFQ != null)
    {
      c localc = this.oFU.oFQ;
      j = i;
      if (localc.kzq != null)
        j = localc.kzq.cIt();
    }
    float f = com.tencent.mm.compatible.b.g.KK().getStreamMaxVolume(j);
    j = (int)(com.tencent.mm.compatible.b.g.KK().getStreamVolume(j) / f * 100.0F);
    AppMethodBeat.o(53901);
    return j;
  }

  public final int bRo()
  {
    AppMethodBeat.i(53902);
    ab.i("MicroMsg.MT.MultiTalkEngine", "getMultiTalkRecordReadNum");
    int i;
    if (this.oFU.kzb != null)
    {
      i = this.oFU.kzb.EO();
      AppMethodBeat.o(53902);
    }
    while (true)
    {
      return i;
      i = -2;
      AppMethodBeat.o(53902);
    }
  }

  public final int bRp()
  {
    AppMethodBeat.i(53903);
    ab.d("MicroMsg.MT.MultiTalkEngine", "getAudioRecorderErrorCode");
    int i;
    if (this.oFU.kzb != null)
    {
      i = this.oFU.kzb.cpq;
      AppMethodBeat.o(53903);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(53903);
    }
  }

  public final int bRq()
  {
    int i = 0;
    AppMethodBeat.i(53904);
    ab.d("MicroMsg.MT.MultiTalkEngine", "getAudioPlayerErrorCode");
    if (this.oFU.oFQ != null)
    {
      c localc = this.oFU.oFQ;
      if (localc.kzq != null)
      {
        i = localc.kzq.cIs();
        AppMethodBeat.o(53904);
      }
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(53904);
      continue;
      AppMethodBeat.o(53904);
    }
  }

  public final boolean d(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53892);
    ab.i("MicroMsg.MT.MultiTalkEngine", "sendMultiTalkReq " + paramInt1 + " cmdid " + paramInt2);
    paramArrayOfByte = new o(paramInt1, paramInt2, paramArrayOfByte);
    com.tencent.mm.kernel.g.Rg().a(paramArrayOfByte, 0);
    AppMethodBeat.o(53892);
    return false;
  }

  public final boolean jk(boolean paramBoolean)
  {
    AppMethodBeat.i(53896);
    ab.i("MicroMsg.MT.MultiTalkEngine", "setMultiTalkSpeaker %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.oFU.oFQ.io(paramBoolean);
    AppMethodBeat.o(53896);
    return true;
  }

  public final boolean y(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(53891);
    switch (paramInt)
    {
    default:
      ab.v(paramString1, paramString2);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(53891);
      return false;
      ab.v(paramString1, paramString2);
      continue;
      ab.d(paramString1, paramString2);
      continue;
      ab.i(paramString1, paramString2);
      continue;
      ab.w(paramString1, paramString2);
      continue;
      ab.e(paramString1, paramString2);
      continue;
      ab.f(paramString1, paramString2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.d.1
 * JD-Core Version:    0.6.2
 */