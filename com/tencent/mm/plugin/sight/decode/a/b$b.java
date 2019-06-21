package com.tencent.mm.plugin.sight.decode.a;

import android.view.Surface;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class b$b
  implements Runnable
{
  volatile boolean ovl = false;
  b.c qyb;

  private b$b(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70237);
    if ((b.r(this.qxW) != null) && (b.r(this.qxW).cli() != null) && (b.r(this.qxW).cli().getVisibility() == 0))
      b.h(this.qxW).post(new b.b.1(this));
    if (b.e(this.qxW) < 0)
    {
      ab.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id, path %s", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()), b.a(this.qxW) });
      AppMethodBeat.o(70237);
    }
    while (true)
    {
      return;
      if (!this.ovl)
        break;
      ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at beg", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()) });
      AppMethodBeat.o(70237);
    }
    if (b.s(this.qxW) == 0L)
    {
      if (b.t(this.qxW) != null)
      {
        b.t(this.qxW).type = 1;
        b.t(this.qxW).run();
      }
      b.a(this.qxW, System.currentTimeMillis());
    }
    int i = 0;
    int j = i;
    if (b.u(this.qxW) != -1.0D)
    {
      if (this.qxW.qxJ)
        break label623;
      j = i;
      if (SightVideoJNI.seekStream(b.u(this.qxW), b.e(this.qxW)) > 0)
      {
        if (b.t(this.qxW) == null)
          b.a(this.qxW, new b.i(this.qxW, (byte)0));
        b.t(this.qxW).type = 4;
        b.t(this.qxW).qxP = b.u(this.qxW);
        b.t(this.qxW).run();
        j = 1;
      }
    }
    label350: float f1 = (float)(System.currentTimeMillis() - b.s(this.qxW));
    float f2;
    label370: float f3;
    double d;
    if (j != 0)
    {
      f2 = 0.0F;
      f3 = f2;
      if (this.qxW.qxJ)
      {
        f3 = f2;
        if (b.v(this.qxW))
        {
          b.a(this.qxW, false);
          f3 = f2;
          if (b.t(this.qxW) != null)
          {
            d = b.t(this.qxW).clk() / 1000.0D;
            f3 = f2;
            if (SightVideoJNI.seekStream(d, b.e(this.qxW)) > 0)
            {
              f3 = 0.0F;
              ab.i("MicroMsg.SightPlayController", "seek to " + d + " modify time : 0.0");
            }
          }
        }
      }
      if (b.w(this.qxW))
        ab.i("MicroMsg.SightPlayController", "#0x%x video %d id passedTime:  %s  seek  %s", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(b.e(this.qxW)), Float.valueOf(f1), Float.valueOf(f3) });
      b.a(this.qxW, System.currentTimeMillis());
      if (f3 < 2.0F)
        break label811;
      b.x(this.qxW);
    }
    while (true)
    {
      if (!b.c(this.qxW))
        break label835;
      ab.e("MicroMsg.SightPlayController", "match tolerate bad seek times %d", new Object[] { Integer.valueOf(b.y(this.qxW)) });
      this.qxW.clear();
      AppMethodBeat.o(70237);
      break;
      label623: if (b.t(this.qxW) != null)
      {
        b.t(this.qxW).type = 4;
        b.t(this.qxW).qxP = b.u(this.qxW);
        b.t(this.qxW).run();
        b.h(this.qxW).postDelayed(new b.b.2(this), 100L);
        j = i;
        break label350;
      }
      j = i;
      if (SightVideoJNI.seekStream(b.u(this.qxW), b.e(this.qxW)) <= 0)
        break label350;
      if (b.t(this.qxW) == null)
        b.a(this.qxW, new b.i(this.qxW, (byte)0));
      b.t(this.qxW).type = 4;
      b.t(this.qxW).qxP = b.u(this.qxW);
      b.t(this.qxW).run();
      j = 1;
      break label350;
      f2 = f1 / this.qxW.qxq + 0.5F;
      break label370;
      label811: b.b(this.qxW, Math.max(0, b.y(this.qxW) - 1));
    }
    label835: int k = 0;
    i = 0;
    int m = 0;
    if (1 == b.d(this.qxW))
      if ((b.n(this.qxW) != null) && (!b.n(this.qxW).isValid()))
      {
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error, surface is not valid", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()) });
        this.ovl = true;
        if (this.qyb == null)
          break label1381;
        this.qyb.ovl = true;
        j = 0;
        i = m;
        label936: if (b.t(this.qxW) == null)
          break label2125;
        ab.d("MicroMsg.SightPlayController", "voice time is" + b.t(this.qxW).clk() / 1000.0D);
      }
    label1710: label2125: 
    while (true)
    {
      if (1 == i)
        b.h(this.qxW).post(new b.b.4(this));
      if (this.ovl)
      {
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at end", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()) });
        if (b.t(this.qxW) != null)
        {
          b.t(this.qxW).type = 0;
          b.t(this.qxW).run();
        }
        AppMethodBeat.o(70237);
        break;
        j = SightVideoJNI.drawSurfaceFrame(b.e(this.qxW), b.n(this.qxW), (int)f3, b.p(this.qxW), b.z(this.qxW));
        if (b.A(this.qxW) != null)
        {
          d = SightVideoJNI.getVideoPlayTime(b.e(this.qxW));
          i = (int)d;
          if (i != (int)this.qxW.qxM)
            b.A(this.qxW).b(this.qxW, i);
          this.qxW.qxM = d;
        }
        if (j == 0)
        {
          b.a(this.qxW, -1.0D);
          k = 0;
          i = j;
          j = k;
          break label936;
        }
        if (1 == j)
        {
          b.a(this.qxW, -1.0D);
          k = 1;
          b.a(this.qxW, 0L);
          b.B(this.qxW);
          i = j;
          j = k;
          break label936;
        }
        if (-7 == j)
        {
          ab.w("MicroMsg.SightPlayController", "surface is null, continue");
          k = 0;
          i = j;
          j = k;
          break label936;
        }
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error:%d", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(j) });
        this.ovl = true;
        if (this.qyb != null)
          this.qyb.ovl = true;
        this.qxW.T(null);
        i = j;
        if (b.b(this.qxW) != null)
        {
          b.b(this.qxW).c(this.qxW, -1);
          i = j;
        }
        label1381: j = 0;
        break label936;
        m = SightVideoJNI.drawFrame(b.e(this.qxW), b.C(this.qxW), (int)f3, null, false, b.z(this.qxW));
        if (b.A(this.qxW) != null)
        {
          d = SightVideoJNI.getVideoPlayTime(b.e(this.qxW));
          j = (int)d;
          if (j != (int)this.qxW.qxM)
            b.A(this.qxW).b(this.qxW, j);
          this.qxW.qxM = d;
          if (b.w(this.qxW))
            ab.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
        }
        while (true)
        {
          if (m != 0)
            break label1710;
          b.a(this.qxW, -1.0D);
          i = m;
          j = k;
          break;
          if (b.w(this.qxW))
          {
            d = SightVideoJNI.getVideoPlayTime(b.e(this.qxW));
            if (b.w(this.qxW))
              ab.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
          }
          else if (b.w(this.qxW))
          {
            ab.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
          }
        }
        if (1 == m)
        {
          b.a(this.qxW, -1.0D);
          j = 1;
          b.a(this.qxW, 0L);
          b.B(this.qxW);
          i = m;
          continue;
        }
        b.a(this.qxW, -1.0D);
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw bitmap match error:%d", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
        this.ovl = true;
        if (this.qyb != null)
          this.qyb.ovl = true;
        b.h(this.qxW).post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(70234);
            b.b.this.qxW.U(null);
            AppMethodBeat.o(70234);
          }
        });
        i = m;
        j = k;
        if (b.b(this.qxW) == null)
          continue;
        b.b(this.qxW).c(this.qxW, -1);
        i = m;
        j = k;
        continue;
      }
      long l;
      if (1 == b.d(this.qxW))
      {
        l = this.qxW.qxq - (System.currentTimeMillis() - b.s(this.qxW));
        if (b.s(this.qxW) == 0L)
          o.i(this, this.qxW.qxq * 5);
      }
      while (true)
      {
        if (b.t(this.qxW) != null)
          ab.d("MicroMsg.SightPlayController", "voice time is" + b.t(this.qxW).clk() / 1000.0D);
        AppMethodBeat.o(70237);
        break;
        if (l > 0L)
        {
          o.i(this, l);
        }
        else
        {
          o.i(this, 0L);
          continue;
          if ((j != 0) && (b.r(this.qxW) != null))
          {
            j = b.r(this.qxW).clh();
            b.h(this.qxW).post(new b.b.5(this));
            this.qyb.qyd = i;
            b.h(this.qxW).postDelayed(this.qyb, j);
          }
          else
          {
            this.qyb.qyd = i;
            b.h(this.qxW).post(this.qyb);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.b
 * JD-Core Version:    0.6.2
 */