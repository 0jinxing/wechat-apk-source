package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.protocal.protobuf.tr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class j$17$1
  implements Runnable
{
  j$17$1(j.17 param17, tr paramtr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135541);
    j.j(this.kBd.kAJ);
    Object localObject1 = j.k(this.kBd.kAJ);
    Object localObject2 = this.kBc;
    if (localObject2 != null)
    {
      ((c)localObject1).mSampleRate = ((tr)localObject2).waN;
      ((c)localObject1).mChannels = ((tr)localObject2).waP;
      ((c)localObject1).kzn = ((tr)localObject2).waO;
    }
    localObject2 = j.k(this.kBd.kAJ);
    if (((c)localObject2).kzf == 2)
      ab.e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "dev start already...");
    while (true)
    {
      j.a(this.kBd.kAJ, this.kBd.kAR);
      AppMethodBeat.o(135541);
      return;
      localObject1 = ((c)localObject2).kza;
      g.KK().a((g.a)localObject1);
      ((d)localObject1).kzt = g.KK().KV();
      ((d)localObject1).kzu = g.KK().KP();
      ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b %s", new Object[] { Boolean.valueOf(((d)localObject1).kzt), Boolean.valueOf(((d)localObject1).kzu), Integer.valueOf(localObject1.hashCode()) });
      ((d)localObject1).gar.requestFocus();
      ((d)localObject1).kzs.a(ah.getContext(), (HeadsetPlugReceiver.a)localObject1);
      int i;
      Object localObject3;
      label337: Object localObject5;
      if ((((d)localObject1).kzt) || (((d)localObject1).kzu))
      {
        if (((d)localObject1).kzu)
        {
          i = g.KK().KM();
          if (i != 0)
          {
            ab.e("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "hy: start bluetooth failed %d", new Object[] { Integer.valueOf(i) });
            g.KK().KN();
          }
        }
        ab.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "start device......");
        ((c)localObject2).kzf = 2;
        q.etd.dump();
        localObject3 = new byte[1];
        localObject3[0] = ((byte)0);
        localObject1 = new byte[2];
        ab.i("MicroMsg.OpenVoice.OpenVoiceAudioCompatHelper", "hy: audio info dump begin");
        q.etd.dump();
        if (q.etd.eqq < 0)
          break label1103;
        localObject1[0] = ((byte)(byte)q.etd.eqq);
        localObject4 = j.kzW;
        j.f(406, (byte[])localObject1, 1);
        if (q.etd.eqt < 0)
          break label1150;
        localObject4 = new byte[5];
        if ((q.etd.equ >= 0) && (q.etd.eqv >= 0))
        {
          localObject4[0] = ((byte)(byte)q.etd.equ);
          localObject4[1] = ((byte)(byte)q.etd.eqv);
          if (q.etd.eqw < 0)
            break label1132;
          localObject4[2] = ((byte)(byte)q.etd.eqw);
          localObject4[3] = ((byte)(byte)q.etd.eqt);
          localObject4[4] = ((byte)(byte)q.etd.eqx);
          localObject5 = j.kzW;
          j.f(404, (byte[])localObject4, 5);
        }
        label453: if (q.etd.eqr < 0)
          break label1179;
        localObject1[0] = ((byte)(byte)q.etd.eqr);
        localObject4 = j.kzW;
        j.f(408, (byte[])localObject1, 1);
      }
      while (true)
      {
        if ((q.etd.eqC[0] > 0) || (q.etd.eqC[1] > 0))
        {
          localObject1[0] = ((byte)0);
          localObject1[1] = ((byte)0);
          if ((q.etd.eqC[0] > 0) && (q.etd.eqC[0] < 10000))
            localObject1[0] = ((byte)(byte)q.etd.eqC[0]);
          if ((q.etd.eqC[1] > 0) && (q.etd.eqC[1] < 10000))
            localObject1[1] = ((byte)(byte)q.etd.eqC[1]);
          localObject4 = j.kzW;
          j.f(423, (byte[])localObject1, 2);
        }
        if ((q.etd.epT >= 0) || (q.etd.epV >= 0))
        {
          localObject1[0] = ((byte)-1);
          localObject1[1] = ((byte)-1);
          if (q.etd.epT >= 0)
            localObject1[0] = ((byte)(byte)q.etd.epT);
          if (q.etd.epV >= 0)
            localObject1[1] = ((byte)(byte)q.etd.epV);
          localObject4 = j.kzW;
          j.f(414, (byte[])localObject1, 2);
        }
        if ((q.etd.epU >= 0) || (q.etd.epW >= 0))
        {
          localObject1[0] = ((byte)-1);
          localObject1[1] = ((byte)-1);
          if (q.etd.epU >= 0)
            localObject1[0] = ((byte)(byte)q.etd.epU);
          if (q.etd.epW >= 0)
            localObject1[1] = ((byte)(byte)q.etd.epW);
          localObject4 = j.kzW;
          j.f(415, (byte[])localObject1, 2);
        }
        if ((q.etd.epX >= 0) || (q.etd.epY >= 0))
        {
          localObject1[0] = ((byte)-1);
          localObject1[1] = ((byte)-1);
          if (q.etd.epX >= 0)
            localObject1[0] = ((byte)(byte)q.etd.epX);
          if (q.etd.epY >= 0)
            localObject1[1] = ((byte)(byte)q.etd.epY);
          localObject4 = j.kzW;
          j.f(422, (byte[])localObject1, 2);
        }
        if (q.etd.epZ >= 0)
        {
          localObject1[0] = ((byte)(byte)q.etd.epZ);
          localObject4 = j.kzW;
          j.f(416, (byte[])localObject1, 1);
        }
        if ((q.etd.eqa >= 0) && (q.etd.eqa != 5))
        {
          localObject1[0] = ((byte)(byte)q.etd.eqa);
          localObject4 = j.kzW;
          j.f(417, (byte[])localObject1, 1);
        }
        if ((q.etd.eqb >= 0) && (q.etd.eqb != 5))
        {
          localObject1[0] = ((byte)(byte)q.etd.eqb);
          localObject4 = j.kzW;
          j.f(418, (byte[])localObject1, 1);
        }
        if (q.etd.eqc >= 0)
        {
          localObject1[0] = ((byte)(byte)q.etd.eqc);
          localObject4 = j.kzW;
          j.f(419, (byte[])localObject1, 1);
        }
        if (1 != q.etd.eqA)
          break label1224;
        localObject5 = new byte[30];
        for (i = 0; i < 15; i++)
        {
          localObject5[(i * 2)] = ((byte)(byte)(q.etd.eqB[i] & 0xFF));
          localObject5[(i * 2 + 1)] = ((byte)(byte)(q.etd.eqB[i] >> 8 & 0xFF));
        }
        ((d)localObject1).kzx &= ((d)localObject1).fR(true);
        break;
        label1103: if (q.etd.eqq != -2)
          break label337;
        localObject4 = j.kzW;
        j.f(407, (byte[])localObject3, 1);
        break label337;
        label1132: localObject5 = j.kzW;
        j.f(404, (byte[])localObject4, 2);
        break label453;
        label1150: if (q.etd.eqt != -2)
          break label453;
        localObject4 = j.kzW;
        j.f(405, (byte[])localObject3, 1);
        break label453;
        label1179: if (q.etd.eqr == -2)
        {
          localObject4 = j.kzW;
          j.f(409, (byte[])localObject3, 1);
        }
      }
      Object localObject4 = j.kzW;
      j.f(420, (byte[])localObject5, 30);
      label1224: if (q.etd.eqA == 0)
      {
        localObject4 = j.kzW;
        j.f(421, (byte[])localObject3, 1);
      }
      if (q.etd.eqE > 0)
      {
        localObject1[0] = ((byte)(byte)q.etd.eqE);
        localObject3 = j.kzW;
        j.f(424, (byte[])localObject1, 1);
      }
      if (q.etd.eqd > 0)
      {
        localObject1[0] = ((byte)(byte)q.etd.eqd);
        localObject3 = j.kzW;
        j.f(431, (byte[])localObject1, 4);
      }
      if (q.etd.eqM >= 0)
      {
        int j = (byte)q.etd.eqM;
        int k = (byte)q.etd.eqN;
        int m = (byte)q.etd.eqO;
        int n = (byte)q.etd.eqP;
        localObject1 = j.kzW;
        j.f(426, new byte[] { j, k, m, n }, 4);
      }
      if (((c)localObject2).kzg <= 10)
      {
        if (((c)localObject2).kzg <= 0)
          ((c)localObject2).kzj = 1;
        ((c)localObject2).kzg = 92;
      }
      ((c)localObject2).kzb = new com.tencent.mm.audio.b.c(((c)localObject2).mSampleRate, ((c)localObject2).mChannels, 1);
      ((c)localObject2).kzb.gG(((c)localObject2).kzn);
      ((c)localObject2).kzb.br(true);
      ((c)localObject2).kzb.EJ();
      ((c)localObject2).kzb.cpB = -19;
      ((c)localObject2).kzb.v(1, false);
      ((c)localObject2).kzb.bq(true);
      localObject1 = j.kzW;
      j.f(401, new byte[1], 1);
      ((c)localObject2).kzb.cpM = ((c)localObject2).kzo;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.17.1
 * JD-Core Version:    0.6.2
 */