package com.tencent.liteav.videoencoder;

import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.b.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.egl.EGLContext;

public class b extends com.tencent.liteav.basic.module.a
{
  private static Integer r;
  private static final String u;
  private static int v;
  private c a;
  private d b;
  private WeakReference<com.tencent.liteav.basic.d.a> c;
  private int d;
  private int e;
  private int f;
  private Timer g;
  private TimerTask h;
  private LinkedList<Runnable> i;
  private TXSVideoEncoderParam j;
  private float k;
  private float l;
  private float m;
  private int n;
  private int o;
  private com.tencent.liteav.basic.e.b p;
  private com.tencent.liteav.basic.util.c q;
  private boolean s;
  private k t;

  static
  {
    AppMethodBeat.i(67435);
    r = Integer.valueOf(1);
    u = b.class.getSimpleName();
    v = 0;
    AppMethodBeat.o(67435);
  }

  public b(int paramInt)
  {
    AppMethodBeat.i(67414);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = 0;
    this.e = 2;
    this.f = 1;
    this.g = null;
    this.h = null;
    this.i = new LinkedList();
    this.k = 0.0F;
    this.l = 0.0F;
    this.m = 0.0F;
    this.n = 0;
    this.o = 0;
    this.e = paramInt;
    AppMethodBeat.o(67414);
  }

  private void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(67429);
    if (this.c == null)
      AppMethodBeat.o(67429);
    while (true)
    {
      return;
      com.tencent.liteav.basic.d.a locala = (com.tencent.liteav.basic.d.a)this.c.get();
      if (locala == null)
      {
        AppMethodBeat.o(67429);
      }
      else
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("EVT_ID", paramInt);
        localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        localBundle.putCharSequence("EVT_MSG", paramString);
        locala.onNotifyEvent(paramInt, localBundle);
        AppMethodBeat.o(67429);
      }
    }
  }

  private void a(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(67430);
    if (this.c == null)
      AppMethodBeat.o(67430);
    while (true)
    {
      return;
      com.tencent.liteav.basic.d.a locala = (com.tencent.liteav.basic.d.a)this.c.get();
      if (locala == null)
      {
        AppMethodBeat.o(67430);
      }
      else
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("EVT_ID", paramInt1);
        localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        localBundle.putCharSequence("EVT_MSG", paramString);
        localBundle.putInt("EVT_PARAM1", paramInt2);
        locala.onNotifyEvent(paramInt1, localBundle);
        AppMethodBeat.o(67430);
      }
    }
  }

  private boolean a(Queue<Runnable> paramQueue)
  {
    AppMethodBeat.i(67419);
    while (true)
    {
      try
      {
        if (paramQueue.isEmpty())
        {
          AppMethodBeat.o(67419);
          bool = false;
          return bool;
        }
        Runnable localRunnable = (Runnable)paramQueue.poll();
        if (localRunnable == null)
        {
          AppMethodBeat.o(67419);
          bool = false;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(67419);
      }
      localObject.run();
      boolean bool = true;
      AppMethodBeat.o(67419);
    }
  }

  private void c()
  {
    AppMethodBeat.i(67427);
    if (this.h == null)
      this.h = new b.a(this);
    this.g = new Timer();
    this.g.schedule(this.h, 1000L, 1000L);
    AppMethodBeat.o(67427);
  }

  private void d()
  {
    AppMethodBeat.i(67428);
    if (this.g != null)
    {
      this.g.cancel();
      this.g = null;
    }
    if (this.h != null)
      this.h = null;
    AppMethodBeat.o(67428);
  }

  private void e()
  {
    AppMethodBeat.i(67431);
    a(new b.6(this));
    TXCLog.w("TXCVideoEncoder", "switchSWToHW");
    AppMethodBeat.o(67431);
  }

  public int a(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    AppMethodBeat.i(67415);
    this.j = paramTXSVideoEncoderParam;
    int i1;
    if (paramTXSVideoEncoderParam.enableBlackList)
    {
      i1 = com.tencent.liteav.basic.f.b.a().c();
      if ((this.e != 1) || (i1 == 0))
        break label161;
      this.a = new a();
      this.f = 1;
      a(1008, "启动硬编", 1);
      label62: setStatusValue(4004, Long.valueOf(this.f));
      if (this.a == null)
        break label252;
      if (this.b != null)
        this.a.setListener(this.b);
      if (this.d != 0)
        this.a.setBitrate(this.d);
      this.a.setID(getID());
      int i2 = this.a.start(paramTXSVideoEncoderParam);
      i1 = i2;
      if (i2 == 0)
        break label256;
      AppMethodBeat.o(67415);
      i1 = i2;
    }
    while (true)
    {
      return i1;
      i1 = 2;
      break;
      label161: if ((this.e == 3) && (paramTXSVideoEncoderParam.width == 720) && (paramTXSVideoEncoderParam.height == 1280) && (i1 != 0))
      {
        this.a = new a();
        this.f = 1;
        a(1008, "启动硬编", 1);
        break label62;
      }
      this.a = new TXCSWVideoEncoder();
      this.f = 2;
      a(1008, "启动软编", 2);
      break label62;
      label252: i1 = 10000002;
      label256: if (this.e == 3)
      {
        this.k = 0.0F;
        this.l = 0.0F;
        this.m = 0.0F;
        this.n = 0;
        this.o = com.tencent.liteav.basic.f.b.a().f();
        c();
      }
      AppMethodBeat.o(67415);
    }
  }

  public long a(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67422);
    long l1 = 10000002L;
    while (a(this.i));
    if (this.a != null)
      l1 = this.a.pushVideoFrame(paramInt1, paramInt2, paramInt3, paramLong);
    AppMethodBeat.o(67422);
    return l1;
  }

  public long a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67420);
    if (this.p == null)
    {
      paramLong = -1L;
      AppMethodBeat.o(67420);
    }
    while (true)
    {
      return paramLong;
      this.q.b(new b.2(this, paramInt2, paramInt3, paramInt1, paramArrayOfByte, paramLong));
      paramLong = 0L;
      AppMethodBeat.o(67420);
    }
  }

  public EGLContext a(int paramInt1, int paramInt2)
  {
    EGLContext localEGLContext1 = null;
    AppMethodBeat.i(67417);
    if (!this.s)
      this.s = true;
    while (true)
    {
      synchronized (r)
      {
        com.tencent.liteav.basic.util.c localc = new com/tencent/liteav/basic/util/c;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("CVGLThread");
        Integer localInteger = r;
        r = Integer.valueOf(r.intValue() + 1);
        localc.<init>(localInteger);
        this.q = localc;
        ??? = new boolean[1];
        this.q.a(new b.1(this, paramInt1, paramInt2, (boolean[])???));
        if (???[0] != 0)
        {
          localEGLContext1 = this.p.c();
          AppMethodBeat.o(67417);
          return localEGLContext1;
        }
      }
      AppMethodBeat.o(67417);
      continue;
      if (this.p != null)
      {
        EGLContext localEGLContext2 = this.p.c();
        AppMethodBeat.o(67417);
      }
      else
      {
        AppMethodBeat.o(67417);
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(67421);
    if (this.q != null)
    {
      com.tencent.liteav.basic.e.b localb = this.p;
      this.q.b(new b.3(this, localb));
      this.q = null;
      this.p = null;
    }
    while (true)
    {
      if (this.e == 3)
      {
        this.k = 0.0F;
        this.l = 0.0F;
        this.m = 0.0F;
        this.n = 0;
        d();
      }
      this.b = null;
      this.d = 0;
      AppMethodBeat.o(67421);
      return;
      this.i.clear();
      if (this.a != null)
        this.a.stop();
    }
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(67425);
    this.d = paramInt;
    a(new b.5(this));
    AppMethodBeat.o(67425);
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(67423);
    this.c = new WeakReference(parama);
    AppMethodBeat.o(67423);
  }

  public void a(d paramd)
  {
    AppMethodBeat.i(67424);
    this.b = paramd;
    a(new b.4(this));
    AppMethodBeat.o(67424);
  }

  protected void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(67418);
    synchronized (this.i)
    {
      this.i.add(paramRunnable);
      AppMethodBeat.o(67418);
      return;
    }
  }

  public long b()
  {
    AppMethodBeat.i(67426);
    long l1 = 0L;
    if (this.a != null)
      l1 = this.a.getRealFPS();
    AppMethodBeat.o(67426);
    return l1;
  }

  public void setID(String paramString)
  {
    AppMethodBeat.i(67416);
    super.setID(paramString);
    if (this.a != null)
      this.a.setID(paramString);
    setStatusValue(4004, Long.valueOf(this.f));
    AppMethodBeat.o(67416);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.b
 * JD-Core Version:    0.6.2
 */