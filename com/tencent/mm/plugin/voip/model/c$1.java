package com.tencent.mm.plugin.voip.model;

import android.media.AudioTrack;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4321);
    Process.setThreadPriority(-19);
    ab.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer enter  to start....");
    int i = 0;
    while ((this.sNS.sNi) && (this.sNS.aQf != null))
    {
      int j;
      long l;
      try
      {
        j = this.sNS.aQf.getPlaybackHeadPosition();
        l = System.currentTimeMillis();
        c.d(this.sNS, c.j(this.sNS) - j);
        if (c.k(this.sNS) == 1)
        {
          c.e(this.sNS, j);
          c.a(this.sNS, l);
          c.b(this.sNS, l);
          c.l(this.sNS);
          c.c(this.sNS, l);
          if ((j != 0) && (this.sNS.sNk))
            c.t(this.sNS);
          if (this.sNS.sNt == null)
            break label1220;
          c.h(this.sNS, c.u(this.sNS) + this.sNS.fZP);
          if (c.a(this.sNS) != 0)
            break label568;
          j = this.sNS.sNt.N(c.v(this.sNS), this.sNS.fZP);
          if (j >= 0)
            break label822;
          a.GG(5);
          ab.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  pDevCallBack.PlayDevDataCallBack ret :".concat(String.valueOf(j)));
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.w("MicroMsg.Voip.AudioPlayer", "getPlaybackHeadPosition: ", new Object[] { localException });
          c.i(this.sNS);
          j = 0;
          continue;
          int k = j - c.m(this.sNS);
          if (k > c.n(this.sNS))
          {
            c.f(this.sNS, k);
            label308: c.c(this.sNS, l);
            if (c.o(this.sNS) != 0)
              break label464;
            c.g(this.sNS, c.p(this.sNS) + c.q(this.sNS));
          }
          while (true)
          {
            if (c.p(this.sNS) < c.s(this.sNS))
              c.g(this.sNS, c.s(this.sNS));
            if (c.p(this.sNS) < c.q(this.sNS))
              c.g(this.sNS, c.q(this.sNS));
            if (k <= 0)
              break;
            c.e(this.sNS, j);
            break;
            c.f(this.sNS, (int)(c.n(this.sNS) * 49999.0F / 50000.0F + k / 50000.0F));
            break label308;
            label464: if (l > c.r(this.sNS) + 5000L)
            {
              c.b(this.sNS, l);
              if (c.n(this.sNS) < c.p(this.sNS) >> 1)
                c.g(this.sNS, c.p(this.sNS) - (c.q(this.sNS) >> 2));
              if (c.n(this.sNS) > c.p(this.sNS))
                c.g(this.sNS, c.n(this.sNS));
            }
          }
          label568: System.currentTimeMillis();
          if (c.b(this.sNS) >= this.sNS.fZP)
            synchronized (c.f(this.sNS))
            {
              System.arraycopy(c.g(this.sNS), 0, c.v(this.sNS), 0, this.sNS.fZP);
              j = c.b(this.sNS) - this.sNS.fZP;
              System.arraycopy(c.g(this.sNS), this.sNS.fZP, c.w(this.sNS), 0, j);
              System.arraycopy(c.w(this.sNS), 0, c.g(this.sNS), 0, j);
              c.b(this.sNS, c.b(this.sNS) - this.sNS.fZP);
              j = 0;
            }
          if ((c.o(this.sNS) >= c.x(this.sNS) * 5 / 1000) || (c.y(this.sNS) != 0))
            break;
          c.i(this.sNS, 1);
          j = this.sNS.sNt.N(c.v(this.sNS), this.sNS.fZP);
          c.i(this.sNS, 0);
        }
        a.GG(2);
      }
      continue;
      label822: if (c.z(this.sNS))
      {
        ab.d("MicroMsg.Voip.AudioPlayer", "isSwitching " + c.z(this.sNS));
        a.GG(10);
      }
      else
      {
        c.a(this.sNS, l);
        if (c.A(this.sNS) >= this.sNS.fZP)
        {
          if (!c.z(this.sNS))
          {
            j = this.sNS.aQf.write(c.v(this.sNS), 0, this.sNS.fZP);
            if (j < 0)
            {
              c.j(this.sNS, j);
              ab.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  audioTrack.write ret :".concat(String.valueOf(j)));
            }
            c.k(this.sNS, c.j(this.sNS) + (this.sNS.fZP >> 1));
          }
        }
        else
        {
          System.arraycopy(c.v(this.sNS), 0, c.B(this.sNS), i, c.A(this.sNS) - i);
          j = this.sNS.aQf.write(c.B(this.sNS), 0, c.B(this.sNS).length);
          if (j < 0)
          {
            c.j(this.sNS, j);
            ab.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  audioTrack.write ret :".concat(String.valueOf(j)));
          }
          c.k(this.sNS, c.j(this.sNS) + (c.B(this.sNS).length >> 1));
          i = c.A(this.sNS) - i;
          j = this.sNS.fZP - i;
          while (j >= c.A(this.sNS))
          {
            this.sNS.aQf.write(c.v(this.sNS), i, c.A(this.sNS));
            i += c.A(this.sNS);
            j -= c.A(this.sNS);
            c.k(this.sNS, c.j(this.sNS) + (c.A(this.sNS) >> 1));
          }
          System.arraycopy(c.v(this.sNS), i, c.B(this.sNS), 0, j);
          i = j;
          continue;
          label1220: a.GG(10);
        }
      }
    }
    AppMethodBeat.o(4321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.c.1
 * JD-Core Version:    0.6.2
 */