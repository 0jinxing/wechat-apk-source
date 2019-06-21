package com.tencent.mm.audio.b;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bf.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.BlockingQueue;

final class b$2
  implements c.a
{
  b$2(b paramb)
  {
  }

  private static byte[] v(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt % 4;
    int j = paramInt;
    if (i != 0)
      j = paramInt - i;
    if (j <= 0);
    byte[] arrayOfByte;
    for (paramArrayOfByte = null; ; paramArrayOfByte = arrayOfByte)
    {
      return paramArrayOfByte;
      arrayOfByte = new byte[j / 2];
      for (paramInt = 0; paramInt < j / 2; paramInt += 2)
      {
        arrayOfByte[paramInt] = ((byte)paramArrayOfByte[(paramInt * 2)]);
        arrayOfByte[(paramInt + 1)] = ((byte)paramArrayOfByte[(paramInt * 2 + 1)]);
      }
    }
  }

  private void w(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(116477);
    for (int i = 0; i < paramInt / 2; i++)
    {
      int j = (short)(paramArrayOfByte[(i * 2)] & 0xFF | paramArrayOfByte[(i * 2 + 1)] << 8);
      if (j > b.u(this.cpi))
        b.b(this.cpi, j);
    }
    AppMethodBeat.o(116477);
  }

  public final void bN(int paramInt1, int paramInt2)
  {
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(116476);
    ab.i("MicroMsg.MMAudioRecorder", "onRecPcmDataReady, markStop: %s", new Object[] { Boolean.valueOf(b.c(this.cpi)) });
    if ((b.d(this.cpi) == b.b.cpo) && (!b.c(this.cpi)))
    {
      ab.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
      AppMethodBeat.o(116476);
    }
    while (true)
    {
      return;
      synchronized (b.EI())
      {
        if (b.c(this.cpi))
        {
          if (b.e(this.cpi) != null)
          {
            ab.i("MicroMsg.MMAudioRecorder", "do stop pcm recorder, last frame data: %s, read: %s", new Object[] { paramArrayOfByte, Integer.valueOf(paramInt) });
            b.e(this.cpi).EB();
            b.e(this.cpi).cpM = null;
            b.f(this.cpi);
            bool1 = true;
            b.g(this.cpi);
          }
        }
        else
        {
          long l = bo.gb(b.h(this.cpi));
          if ((b.i(this.cpi) <= 0L) || (l <= b.i(this.cpi)))
            break label274;
          ab.w("MicroMsg.MMAudioRecorder", "Stop now ! expire duration ms:".concat(String.valueOf(l)));
          new ak(Looper.getMainLooper()).post(new b.2.1(this));
          AppMethodBeat.o(116476);
          continue;
        }
        ab.i("MicroMsg.MMAudioRecorder", "stop now, but recorder is null");
        bool1 = bool2;
      }
      label274: ab.d("MicroMsg.MMAudioRecorder", "read :" + paramInt + " time: " + b.j(this.cpi).Mr() + " dataReadedCnt: " + b.k(this.cpi));
      if (paramInt < 0)
      {
        if (b.d(this.cpi) == b.b.cpo)
        {
          ab.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
          AppMethodBeat.o(116476);
        }
        else
        {
          new ak(Looper.getMainLooper()).post(new b.2.2(this));
          AppMethodBeat.o(116476);
        }
      }
      else
      {
        b.a(this.cpi, b.k(this.cpi) + paramInt);
        Object localObject2;
        Object localObject3;
        synchronized (b.l(this.cpi))
        {
          if ((b.m(this.cpi) == null) && ((b.n(this.cpi) == com.tencent.mm.compatible.b.c.a.eoQ) || (b.n(this.cpi) == com.tencent.mm.compatible.b.c.a.eoS)) && (b.o(this.cpi) != null) && (b.p(this.cpi)))
          {
            localObject2 = this.cpi;
            localObject3 = new com/tencent/mm/bf/c;
            ((com.tencent.mm.bf.c)localObject3).<init>();
            b.a((b)localObject2, (com.tencent.mm.bf.c)localObject3);
            localObject2 = b.m(this.cpi);
            j = b.q(this.cpi);
            ab.i("MicroMsg.SpeexEncoderWorker", "init ");
            ((com.tencent.mm.bf.c)localObject2).fQA.clear();
            localObject3 = new com/tencent/mm/bf/d$b;
            ((d.b)localObject3).<init>();
            ((d.b)localObject3).fNY = com.tencent.mm.bf.d.getPrefix();
            ((d.b)localObject3).sampleRate = j;
            ((d.b)localObject3).fQw = 1;
            ((d.b)localObject3).aTg = 16;
            ((com.tencent.mm.bf.c)localObject2).mFileName = String.format("%s%d_%d_%d_%d", new Object[] { ((d.b)localObject3).fNY, Integer.valueOf(((d.b)localObject3).sampleRate), Integer.valueOf(((d.b)localObject3).fQw), Integer.valueOf(((d.b)localObject3).aTg), Long.valueOf(System.currentTimeMillis()) });
          }
          if (b.m(this.cpi) != null)
          {
            localObject2 = b.m(this.cpi);
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("push into queue queueLen:");
            ab.d("MicroMsg.SpeexEncoderWorker", ((com.tencent.mm.bf.c)localObject2).fQA.size());
            if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
            {
              localObject2 = ((com.tencent.mm.bf.c)localObject2).fQA;
              localObject3 = new com/tencent/mm/audio/b/g$a;
              ((g.a)localObject3).<init>(paramArrayOfByte, paramArrayOfByte.length);
              ((BlockingQueue)localObject2).add(localObject3);
            }
          }
          if (b.n(this.cpi) != com.tencent.mm.compatible.b.c.a.eoS)
            break label1048;
          if (b.r(this.cpi) == null)
          {
            localObject3 = this.cpi;
            localObject2 = new com/tencent/mm/audio/d/c;
            ((com.tencent.mm.audio.d.c)localObject2).<init>(b.q(this.cpi), b.s(this.cpi));
            b.a((b)localObject3, (com.tencent.mm.audio.d.c)localObject2);
            b.r(this.cpi).eo(b.t(this.cpi));
          }
          w(paramArrayOfByte, paramInt);
          localObject2 = b.r(this.cpi);
          if (((com.tencent.mm.audio.d.c)localObject2).crn == null)
          {
            j = -1;
            label836: if (paramArrayOfByte != null)
              break label936;
            label840: ab.d("MicroMsg.SilkWriter", "pushBuf queueLen:%d bufLen:%d len:%d, lastFrame: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt), Boolean.valueOf(bool1) });
            if (paramInt <= 0);
          }
        }
        try
        {
          if (((com.tencent.mm.audio.d.c)localObject2).cro)
            ab.e("MicroMsg.SilkWriter", "already stop");
          while (true)
          {
            AppMethodBeat.o(116476);
            break;
            j = ((com.tencent.mm.audio.d.c)localObject2).crn.size();
            break label836;
            label936: i = paramArrayOfByte.length;
            break label840;
            if (((com.tencent.mm.audio.d.c)localObject2).cru == null)
            {
              localObject3 = new com/tencent/mm/audio/d/c$a;
              ((com.tencent.mm.audio.d.c.a)localObject3).<init>((com.tencent.mm.audio.d.c)localObject2, (byte)0);
              ((com.tencent.mm.audio.d.c)localObject2).cru = ((com.tencent.mm.audio.d.c.a)localObject3);
              com.tencent.mm.sdk.g.d.post(((com.tencent.mm.audio.d.c)localObject2).cru, "SilkWriter_run");
            }
            if (((com.tencent.mm.audio.d.c)localObject2).crn != null)
            {
              localObject2 = ((com.tencent.mm.audio.d.c)localObject2).crn;
              localObject3 = new com/tencent/mm/audio/b/g$a;
              ((g.a)localObject3).<init>(paramArrayOfByte, paramInt, bool1);
              ((BlockingQueue)localObject2).add(localObject3);
            }
          }
          paramArrayOfByte = finally;
          throw paramArrayOfByte;
        }
        finally
        {
          AppMethodBeat.o(116476);
        }
        label1048: ??? = paramArrayOfByte;
        int j = paramInt;
        if (b.q(this.cpi) == 16000)
        {
          ??? = v(paramArrayOfByte, paramInt);
          j = ???.length;
        }
        w((byte[])???, j);
        AppMethodBeat.o(116476);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.b.2
 * JD-Core Version:    0.6.2
 */