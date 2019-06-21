package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class b
{
  private static HashMap<String, WeakReference<Bitmap>> qxK = new HashMap();
  private static Map<String, Integer> qxO = new ConcurrentHashMap();
  private boolean fNO = false;
  boolean fVc = true;
  String ien = "";
  private ak lda = new ak(Looper.getMainLooper());
  private Surface mSurface;
  int position;
  boolean qxI = true;
  public boolean qxJ = false;
  public boolean qxL = false;
  double qxM = -1.0D;
  boolean qxN = false;
  double qxP = -1.0D;
  private boolean qxQ = false;
  boolean qxR = false;
  private int qxl = 0;
  private int qxm = 0;
  String qxn = "";
  int qxo = -1;
  protected int qxq = 41;
  private Bitmap qxr;
  private Bitmap qxs;
  private Bitmap qxt;
  WeakReference<View> qxu;
  WeakReference<TextView> qxv;
  private long qxw;
  private WeakReference<View> qxx;
  private Animation qxy;
  private Animation qxz;
  volatile b.h rci;
  private volatile b rcj;
  volatile b.i rck;
  private volatile c rcl;
  private b.k rcm;
  private b.j rcn;
  private d rco;
  private b.a rcp;
  b.e rcq;
  b.f rcr;
  b.g rcs;

  public b(View paramView)
  {
    this.qxx = new WeakReference(paramView);
    ab.i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", new Object[] { Integer.valueOf(0) });
  }

  private void CE(int paramInt)
  {
    com.tencent.mm.modelvideo.o.i(new b.1(this, paramInt), 0L);
  }

  public static boolean WS(String paramString)
  {
    boolean bool;
    if (bo.isNullOrNil(paramString))
      bool = false;
    while (true)
    {
      return bool;
      paramString = (Integer)qxO.get(paramString);
      if ((paramString != null) && (2 == paramString.intValue()))
        bool = false;
      else
        bool = true;
    }
  }

  public abstract void U(Bitmap paramBitmap);

  protected int ckZ()
  {
    return -1;
  }

  public final boolean cla()
  {
    boolean bool = true;
    if (1 == this.qxm)
      if ((this.rcj == null) || (this.rcj.ovl));
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if ((this.rcl == null) || (this.rcl.ovl) || (this.rcj == null) || (this.rcj.ovl))
        bool = false;
    }
  }

  final boolean clb()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.qxL)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (Build.VERSION.SDK_INT >= 11)
      {
        bool2 = bool1;
        if (this.qxl >= 3)
        {
          ab.v("MicroMsg.SightPlayController", "match not check bad fps, but now is bad fps");
          this.qxl = 0;
          bool2 = bool1;
        }
      }
      else
      {
        bool2 = bool1;
        if (this.qxl >= 3)
          bool2 = true;
      }
    }
  }

  protected final void clc()
  {
    int i = Math.max(1, (int)SightVideoJNI.getVideoRate(this.qxo));
    this.qxq = (1000 / i);
    ab.d("MicroMsg.SightPlayController", "#0x%x update video rate to %d fps, delay %d ms", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(this.qxq) });
  }

  public final c cld()
  {
    if (this.rcp == null)
      this.rcp = new b.a(this);
    return this.rcp;
  }

  public final void clear()
  {
    ab.i("MicroMsg.SightPlayController", "#0x%x do clear, remove render job, video id %d, runing %B", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.qxo), Boolean.valueOf(cla()) });
    kz(true);
    this.qxw = 0L;
    CE(this.qxo);
    this.qxo = -1;
    this.ien = "";
    this.qxn = "ERROR#PATH";
    this.qxt = null;
    this.qxM = 0.0D;
    this.qxN = false;
    com.tencent.mm.memory.o.fdT.f(this.qxr);
    this.qxr = null;
  }

  public final void cpV()
  {
    ab.v("MicroMsg.SightPlayController", "draw surface thumb, thumb is null ? %B", new Object[] { Boolean.TRUE });
    com.tencent.mm.modelvideo.o.y(this.rcm);
    if (this.rcm == null)
      this.rcm = new b.k(this, (byte)0);
    this.rcm.qyh = new WeakReference(null);
    com.tencent.mm.modelvideo.o.i(this.rcm, 0L);
  }

  public abstract void dH(int paramInt1, int paramInt2);

  public final void kz(boolean paramBoolean)
  {
    if (this.rci != null)
    {
      com.tencent.mm.modelvideo.o.y(this.rci);
      this.rci.ovl = true;
    }
    if (this.rcl != null)
    {
      this.lda.removeCallbacks(this.rcl);
      this.rcl.ovl = true;
    }
    if (this.rcj != null)
    {
      com.tencent.mm.modelvideo.o.y(this.rcj);
      this.rcj.ovl = true;
    }
    b.i locali;
    if (this.rck != null)
    {
      locali = this.rck;
      if (!paramBoolean)
        break label105;
    }
    label105: for (int i = 0; ; i = 2)
    {
      locali.type = i;
      com.tencent.mm.modelvideo.o.i(this.rck, 0L);
      return;
    }
  }

  public final void restart()
  {
    ab.i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.qxI), this.ien, Integer.valueOf(this.qxo) });
    if (!this.qxI)
      clear();
    while (true)
    {
      return;
      if (cla())
      {
        ab.w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.ien });
      }
      else
      {
        if (this.qxo < 0);
        for (boolean bool = true; ; bool = false)
        {
          kz(bool);
          this.qxw = 0L;
          if (!clb())
            break label156;
          ab.e("MicroMsg.SightPlayController", "#0x%x is bad fps, do nothing when restart", new Object[] { Integer.valueOf(hashCode()) });
          break;
        }
        label156: if (this.qxo < 0)
        {
          ab.w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.ien });
          if (!bo.isNullOrNil(this.ien))
            if (!WS(this.ien))
            {
              ab.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
              clear();
            }
            else
            {
              this.rci = new b.h(this, (byte)0);
              com.tencent.mm.modelvideo.o.i(this.rci, 0L);
            }
        }
        else if (1 == this.qxm)
        {
          this.rcj = new b((byte)0);
          this.rcl = null;
          com.tencent.mm.modelvideo.o.i(this.rcj, 0L);
        }
        else
        {
          this.rcj = new b((byte)0);
          this.rcl = new c();
          this.rcj.rcu = this.rcl;
          this.rcl.rcw = this.rcj;
          com.tencent.mm.modelvideo.o.i(this.rcj, 0L);
        }
      }
    }
  }

  final class b
    implements Runnable
  {
    volatile boolean ovl = false;
    b.c rcu;

    private b()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(37420);
      if ((b.q(b.this) != null) && (b.q(b.this).cli() != null) && (b.q(b.this).cli().getVisibility() == 0))
        b.g(b.this).post(new b.b.1(this));
      if (b.e(b.this) < 0)
      {
        ab.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id, path %s", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), b.a(b.this) });
        AppMethodBeat.o(37420);
      }
      while (true)
      {
        return;
        if (!this.ovl)
          break;
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at beg", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
        AppMethodBeat.o(37420);
      }
      if (b.r(b.this) == 0L)
      {
        if (b.s(b.this) != null)
        {
          b.s(b.this).type = 1;
          b.s(b.this).run();
        }
        b.a(b.this, System.currentTimeMillis());
      }
      int i = 0;
      int j = i;
      if (b.t(b.this) != -1.0D)
      {
        if (b.this.qxJ)
          break label623;
        j = i;
        if (SightVideoJNI.seekStream(b.t(b.this), b.e(b.this)) > 0)
        {
          if (b.s(b.this) == null)
            b.a(b.this, new b.i(b.this, (byte)0));
          b.s(b.this).type = 4;
          b.s(b.this).qxP = b.t(b.this);
          b.s(b.this).run();
          j = 1;
        }
      }
      label350: float f1 = (float)(System.currentTimeMillis() - b.r(b.this));
      float f2;
      label370: float f3;
      double d;
      if (j != 0)
      {
        f2 = 0.0F;
        f3 = f2;
        if (b.this.qxJ)
        {
          f3 = f2;
          if (b.u(b.this))
          {
            b.a(b.this, false);
            f3 = f2;
            if (b.s(b.this) != null)
            {
              d = b.s(b.this).clk() / 1000.0D;
              f3 = f2;
              if (SightVideoJNI.seekStream(d, b.e(b.this)) > 0)
              {
                f3 = 0.0F;
                ab.i("MicroMsg.SightPlayController", "seek to " + d + " modify time : 0.0");
              }
            }
          }
        }
        if (b.v(b.this))
          ab.i("MicroMsg.SightPlayController", "#0x%x video %d id passedTime:  %s  seek  %s", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(b.e(b.this)), Float.valueOf(f1), Float.valueOf(f3) });
        b.a(b.this, System.currentTimeMillis());
        if (f3 < 2.0F)
          break label811;
        b.w(b.this);
      }
      while (true)
      {
        if (!b.c(b.this))
          break label835;
        ab.e("MicroMsg.SightPlayController", "match tolerate bad seek times %d", new Object[] { Integer.valueOf(b.x(b.this)) });
        b.this.clear();
        AppMethodBeat.o(37420);
        break;
        label623: if (b.s(b.this) != null)
        {
          b.s(b.this).type = 4;
          b.s(b.this).qxP = b.t(b.this);
          b.s(b.this).run();
          b.g(b.this).postDelayed(new b.b.2(this), 100L);
          j = i;
          break label350;
        }
        j = i;
        if (SightVideoJNI.seekStream(b.t(b.this), b.e(b.this)) <= 0)
          break label350;
        if (b.s(b.this) == null)
          b.a(b.this, new b.i(b.this, (byte)0));
        b.s(b.this).type = 4;
        b.s(b.this).qxP = b.t(b.this);
        b.s(b.this).run();
        j = 1;
        break label350;
        f2 = f1 / b.this.qxq + 0.5F;
        break label370;
        label811: b.c(b.this, Math.max(0, b.x(b.this) - 1));
      }
      label835: int k = 0;
      i = 0;
      int m = 0;
      if (1 == b.d(b.this))
        if ((b.m(b.this) != null) && (!b.m(b.this).isValid()))
        {
          ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error, surface is not valid", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
          this.ovl = true;
          if (this.rcu == null)
            break label1371;
          this.rcu.ovl = true;
          j = 0;
          i = m;
          label936: if (b.s(b.this) == null)
            break label2106;
          ab.d("MicroMsg.SightPlayController", "voice time is" + b.s(b.this).clk() / 1000.0D);
        }
      label1696: label2106: 
      while (true)
      {
        if (1 == i)
          b.g(b.this).post(new b.b.4(this));
        if (this.ovl)
        {
          ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at end", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
          if (b.s(b.this) != null)
          {
            b.s(b.this).type = 0;
            b.s(b.this).run();
          }
          AppMethodBeat.o(37420);
          break;
          j = SightVideoJNI.drawSurfaceFrame(b.e(b.this), b.m(b.this), (int)f3, b.o(b.this), b.y(b.this));
          if (b.z(b.this) != null)
          {
            d = SightVideoJNI.getVideoPlayTime(b.e(b.this));
            i = (int)d;
            if (i != (int)b.this.qxM)
              b.z(b.this).ks(i);
            b.this.qxM = d;
          }
          if (j == 0)
          {
            b.a(b.this, -1.0D);
            k = 0;
            i = j;
            j = k;
            break label936;
          }
          if (1 == j)
          {
            b.a(b.this, -1.0D);
            k = 1;
            b.a(b.this, 0L);
            b.A(b.this);
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
          ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error:%d", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(j) });
          this.ovl = true;
          if (this.rcu != null)
            this.rcu.ovl = true;
          b.this.cpV();
          i = j;
          if (b.b(b.this) != null)
          {
            b.b(b.this).Ds(-1);
            i = j;
          }
          label1371: j = 0;
          break label936;
          m = SightVideoJNI.drawFrame(b.e(b.this), b.B(b.this), (int)f3, null, false, b.y(b.this));
          if (b.z(b.this) != null)
          {
            d = SightVideoJNI.getVideoPlayTime(b.e(b.this));
            j = (int)d;
            if (j != (int)b.this.qxM)
              b.z(b.this).ks(j);
            b.this.qxM = d;
            if (b.v(b.this))
              ab.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
          }
          while (true)
          {
            if (m != 0)
              break label1696;
            b.a(b.this, -1.0D);
            i = m;
            j = k;
            break;
            if (b.v(b.this))
            {
              d = SightVideoJNI.getVideoPlayTime(b.e(b.this));
              if (b.v(b.this))
                ab.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
            }
            else if (b.v(b.this))
            {
              ab.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
            }
          }
          if (1 == m)
          {
            b.a(b.this, -1.0D);
            j = 1;
            b.a(b.this, 0L);
            b.A(b.this);
            i = m;
            continue;
          }
          b.a(b.this, -1.0D);
          ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw bitmap match error:%d", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
          this.ovl = true;
          if (this.rcu != null)
            this.rcu.ovl = true;
          b.g(b.this).post(new b.b.3(this));
          i = m;
          j = k;
          if (b.b(b.this) == null)
            continue;
          b.b(b.this).Ds(-1);
          i = m;
          j = k;
          continue;
        }
        long l;
        if (1 == b.d(b.this))
        {
          l = b.this.qxq - (System.currentTimeMillis() - b.r(b.this));
          if (b.r(b.this) == 0L)
            com.tencent.mm.modelvideo.o.i(this, b.this.qxq * 5);
        }
        while (true)
        {
          if (b.s(b.this) != null)
            ab.d("MicroMsg.SightPlayController", "voice time is" + b.s(b.this).clk() / 1000.0D);
          AppMethodBeat.o(37420);
          break;
          if (l > 0L)
          {
            com.tencent.mm.modelvideo.o.i(this, l);
          }
          else
          {
            com.tencent.mm.modelvideo.o.i(this, 0L);
            continue;
            if ((j != 0) && (b.q(b.this) != null))
            {
              j = b.q(b.this).clh();
              b.g(b.this).post(new b.b.5(this));
              this.rcu.qyd = i;
              b.g(b.this).postDelayed(this.rcu, j);
            }
            else
            {
              this.rcu.qyd = i;
              b.g(b.this).post(this.rcu);
            }
          }
        }
      }
    }
  }

  final class c
    implements Runnable
  {
    volatile boolean ovl;
    int qyd;
    b.b rcw;

    public c()
    {
      AppMethodBeat.i(37421);
      this.ovl = false;
      ab.i("MicroMsg.SightPlayController", "make sure drawJob alive");
      AppMethodBeat.o(37421);
    }

    public final void run()
    {
      AppMethodBeat.i(37422);
      if (this.ovl)
      {
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
        AppMethodBeat.o(37422);
      }
      while (true)
      {
        return;
        b.this.U(b.B(b.this));
        if (b.r(b.this) == 0L)
        {
          com.tencent.mm.modelvideo.o.i(this.rcw, 0L);
          AppMethodBeat.o(37422);
        }
        else
        {
          long l = b.this.qxq - (System.currentTimeMillis() - b.r(b.this));
          if (l > 0L)
          {
            com.tencent.mm.modelvideo.o.i(this.rcw, l);
            AppMethodBeat.o(37422);
          }
          else
          {
            com.tencent.mm.modelvideo.o.i(this.rcw, 0L);
            AppMethodBeat.o(37422);
          }
        }
      }
    }
  }

  final class d
    implements Runnable
  {
    private d()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(37423);
      if (b.k(b.this).get() == null)
        AppMethodBeat.o(37423);
      while (true)
      {
        return;
        ((View)b.k(b.this).get()).startAnimation(b.l(b.this));
        AppMethodBeat.o(37423);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b
 * JD-Core Version:    0.6.2
 */