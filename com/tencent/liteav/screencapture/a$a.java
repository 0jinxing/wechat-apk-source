package com.tencent.liteav.screencapture;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.e.h;
import com.tencent.liteav.basic.e.i;
import com.tencent.liteav.basic.e.j;
import com.tencent.liteav.basic.e.k;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a$a extends Handler
{
  public int a;
  public int[] b;
  public Surface c;
  public SurfaceTexture d;
  public int e;
  public int f;
  public int g;
  protected boolean h;
  protected long i;
  protected long j;
  protected com.tencent.liteav.basic.e.b k;
  protected h l;
  float[] m;

  public a$a(a parama1, Looper paramLooper, a parama2)
  {
    super(paramLooper);
    AppMethodBeat.i(66790);
    this.a = 0;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = 720;
    this.f = 1280;
    this.g = 25;
    this.h = false;
    this.i = 0L;
    this.j = 0L;
    this.k = null;
    this.l = null;
    this.m = new float[16];
    AppMethodBeat.o(66790);
  }

  protected void a(Message paramMessage)
  {
    AppMethodBeat.i(66792);
    this.i = 0L;
    this.j = 0L;
    if (!a())
    {
      b();
      this.n.b();
      this.n.a(20000003, null);
      AppMethodBeat.o(66792);
    }
    while (true)
    {
      return;
      this.n.a(0, this.k.c());
      AppMethodBeat.o(66792);
    }
  }

  protected boolean a()
  {
    boolean bool = false;
    AppMethodBeat.i(66796);
    TXCLog.d("ScreenCapture", String.format("init egl size[%d/%d]", new Object[] { Integer.valueOf(this.e), Integer.valueOf(this.f) }));
    this.k = com.tencent.liteav.basic.e.b.a(null, null, null, this.e, this.f);
    if (this.k == null)
      AppMethodBeat.o(66796);
    while (true)
    {
      return bool;
      this.l = new h();
      if (!this.l.a())
      {
        AppMethodBeat.o(66796);
      }
      else
      {
        this.l.a(true);
        this.l.a(this.e, this.f);
        this.l.a(k.e, k.a(j.a, false, false));
        d();
        AppMethodBeat.o(66796);
        bool = true;
      }
    }
  }

  protected void b()
  {
    AppMethodBeat.i(66797);
    c();
    if (this.l != null)
    {
      this.l.d();
      this.l = null;
    }
    if (this.k != null)
    {
      this.k.b();
      this.k = null;
    }
    AppMethodBeat.o(66797);
  }

  protected void b(Message paramMessage)
  {
    AppMethodBeat.i(66793);
    paramMessage = this.n.c();
    if (paramMessage != null)
      paramMessage.a(a.c(this.n));
    b();
    AppMethodBeat.o(66793);
  }

  protected void c()
  {
    AppMethodBeat.i(66798);
    if (this.d != null)
    {
      this.d.setOnFrameAvailableListener(null);
      this.d.release();
      this.h = false;
      this.d = null;
    }
    b.a().a(this.c);
    if (this.c != null)
    {
      this.c.release();
      this.c = null;
    }
    if (this.b != null)
    {
      GLES20.glDeleteTextures(1, this.b, 0);
      this.b = null;
    }
    AppMethodBeat.o(66798);
  }

  protected void c(Message paramMessage)
  {
    AppMethodBeat.i(66794);
    this.n.a(102, 5L);
    if (!this.n.i)
      AppMethodBeat.o(66794);
    while (true)
    {
      return;
      if (!this.h)
      {
        this.i = 0L;
        this.j = System.nanoTime();
        AppMethodBeat.o(66794);
        continue;
      }
      long l1 = System.nanoTime();
      if (l1 < this.j + this.i * 1000L * 1000L * 1000L / this.g)
      {
        AppMethodBeat.o(66794);
        continue;
      }
      if (this.j == 0L)
        this.j = l1;
      while (true)
      {
        this.i += 1L;
        if ((this.d != null) && (this.b != null))
          break label176;
        AppMethodBeat.o(66794);
        break;
        if (l1 > this.j + 1000000000L)
        {
          this.i = 0L;
          this.j = l1;
        }
      }
      label176: this.d.getTransformMatrix(this.m);
      try
      {
        this.d.updateTexImage();
        this.l.a(this.m);
        GLES20.glViewport(0, 0, this.e, this.f);
        int i1 = this.l.b(this.b[0]);
        this.n.a(0, i1, this.e, this.f, TXCTimeUtil.getTimeTick());
        AppMethodBeat.o(66794);
      }
      catch (Exception paramMessage)
      {
        while (true)
          TXCLog.e("ScreenCapture", "onMsgRend Exception " + paramMessage.getMessage());
      }
    }
  }

  protected void d()
  {
    AppMethodBeat.i(66799);
    this.b = new int[1];
    this.b[0] = i.b();
    if (this.b[0] <= 0)
    {
      this.b = null;
      AppMethodBeat.o(66799);
    }
    while (true)
    {
      return;
      this.d = new SurfaceTexture(this.b[0]);
      this.c = new Surface(this.d);
      this.d.setDefaultBufferSize(this.e, this.f);
      this.d.setOnFrameAvailableListener(new a.a.1(this));
      b.a().a(this.c, this.e, this.f);
      AppMethodBeat.o(66799);
    }
  }

  protected void d(Message paramMessage)
  {
    if (paramMessage == null)
      return;
    if (paramMessage.arg1 <= 0);
    for (int i1 = 1; ; i1 = paramMessage.arg1)
    {
      this.g = i1;
      this.i = 0L;
      this.j = 0L;
      break;
    }
  }

  protected void e(Message paramMessage)
  {
    AppMethodBeat.i(66795);
    if (paramMessage == null)
      AppMethodBeat.o(66795);
    while (true)
    {
      return;
      this.e = paramMessage.arg1;
      this.f = paramMessage.arg2;
      c();
      this.l.a(this.e, this.f);
      d();
      TXCLog.d("ScreenCapture", String.format("set screen capture size[%d/%d]", new Object[] { Integer.valueOf(a.a(this.n)), Integer.valueOf(a.b(this.n)) }));
      AppMethodBeat.o(66795);
    }
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(66791);
    if (paramMessage == null)
      AppMethodBeat.o(66791);
    while (true)
    {
      return;
      if ((this.a == this.n.e) || (101 == paramMessage.what))
        break;
      AppMethodBeat.o(66791);
    }
    switch (paramMessage.what)
    {
    case 104:
    default:
    case 100:
    case 102:
    case 101:
    case 103:
    case 105:
    }
    while (true)
    {
      if ((paramMessage != null) && (paramMessage.obj != null))
        ((Runnable)paramMessage.obj).run();
      AppMethodBeat.o(66791);
      break;
      a(paramMessage);
      continue;
      try
      {
        c(paramMessage);
      }
      catch (Exception localException)
      {
      }
      continue;
      b(paramMessage);
      continue;
      d(paramMessage);
      continue;
      e(paramMessage);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.a.a
 * JD-Core Version:    0.6.2
 */