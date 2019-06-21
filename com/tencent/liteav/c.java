package com.tencent.liteav;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.audio.TXCLiveBGMPlayer;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.e.n;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.TXLivePusher.OnBGMNotify;
import com.tencent.rtmp.TXLog;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public class c extends com.tencent.liteav.basic.module.a
  implements a.b, com.tencent.liteav.audio.d, com.tencent.liteav.basic.d.a, com.tencent.liteav.beauty.e, l, com.tencent.liteav.videoencoder.d
{
  private static final String d;
  private WeakReference<com.tencent.liteav.basic.d.a> A;
  private WeakReference<m> B;
  private boolean C;
  private int D;
  private int E;
  a a;
  com.tencent.liteav.audio.e b;
  TXLivePusher.OnBGMNotify c;
  private k e;
  private com.tencent.liteav.beauty.c f;
  private int g;
  private TXSVideoEncoderParam h;
  private com.tencent.liteav.videoencoder.b i;
  private Context j;
  private f k;
  private int l;
  private int m;
  private int n;
  private float o;
  private int p;
  private float q;
  private TXCloudVideoView r;
  private Surface s;
  private int t;
  private int u;
  private com.tencent.liteav.basic.e.d v;
  private int w;
  private com.tencent.liteav.basic.g.c x;
  private long y;
  private c.a z;

  static
  {
    AppMethodBeat.i(66474);
    d = c.class.getSimpleName();
    AppMethodBeat.o(66474);
  }

  public c(Context paramContext)
  {
    AppMethodBeat.i(66387);
    this.e = null;
    this.f = null;
    this.g = -1;
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.b = null;
    this.c = null;
    this.o = 1.0F;
    this.p = 0;
    this.q = 0.0F;
    this.r = null;
    this.s = null;
    this.t = 0;
    this.u = 0;
    this.v = null;
    this.w = 0;
    this.y = 0L;
    this.z = null;
    this.C = false;
    this.D = -1;
    this.E = -1;
    this.j = paramContext.getApplicationContext();
    this.k = new f();
    this.f = new com.tencent.liteav.beauty.c(this.j, true);
    this.f.a(this);
    this.f.a(this);
    this.h = new TXSVideoEncoderParam();
    this.i = null;
    this.a = new a(this);
    com.tencent.liteav.basic.f.b.a().a(this.j);
    AppMethodBeat.o(66387);
  }

  private int a(int paramInt1, int paramInt2, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(66458);
    if (this.k == null)
    {
      paramInt1 = -5;
      AppMethodBeat.o(66458);
    }
    while (true)
    {
      return paramInt1;
      int i1;
      int i2;
      switch (this.k.k)
      {
      default:
        TXCLog.e(d, "sendCustomYUVData: invalid video_resolution");
        paramInt1 = -1;
        AppMethodBeat.o(66458);
        break;
      case 0:
        i1 = 640;
        i2 = 368;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        while (true)
        {
          if ((i2 <= paramInt1) && (i1 <= paramInt2))
            break label184;
          paramInt1 = -4;
          AppMethodBeat.o(66458);
          break;
          i1 = 960;
          i2 = 544;
          continue;
          i1 = 1280;
          i2 = 720;
          continue;
          i1 = 368;
          i2 = 640;
          continue;
          i1 = 544;
          i2 = 960;
          continue;
          i1 = 720;
          i2 = 1280;
        }
        label184: if (this.k.F)
        {
          t();
          paramInt1 = -1000;
          AppMethodBeat.o(66458);
        }
        else
        {
          b(i2, i1, paramEGLContext);
          paramInt1 = 0;
          AppMethodBeat.o(66458);
        }
        break;
      }
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(66456);
    TXCLog.d(d, "New encode size width = " + paramInt1 + " height = " + paramInt2 + " encType = " + paramInt3);
    t();
    this.g = paramInt3;
    this.i = new com.tencent.liteav.videoencoder.b(this.g);
    TXSVideoEncoderParam localTXSVideoEncoderParam;
    if ((this.k.K & 0x2) == 2)
      if (paramEGLContext != null)
      {
        this.h.width = paramInt1;
        this.h.height = paramInt2;
        this.h.fps = this.k.h;
        this.h.gop = this.k.i;
        localTXSVideoEncoderParam = this.h;
        if (this.k.n != true)
          break label287;
      }
    label287: for (paramInt1 = 3; ; paramInt1 = 1)
    {
      localTXSVideoEncoderParam.encoderProfile = paramInt1;
      this.h.encoderMode = 1;
      this.h.glContext = paramEGLContext;
      this.h.realTime = this.k.I;
      this.i.a(this);
      this.i.a(this);
      this.i.a(this.h);
      this.i.a(this.k.c);
      this.i.setID(getID());
      AppMethodBeat.o(66456);
      return;
      paramEGLContext = this.i.a(paramInt1, paramInt2);
      break;
      if (this.e != null);
      for (paramEGLContext = this.e.f(); ; paramEGLContext = null)
        break;
    }
  }

  private void a(com.tencent.liteav.basic.g.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(66469);
    this.x = paramc;
    if (this.r != null)
    {
      if (this.e != null)
      {
        this.e.a(paramc);
        AppMethodBeat.o(66469);
      }
    }
    else
    {
      if (this.s == null)
        break label191;
      if ((this.v != null) && (this.v.b() != this.s))
      {
        this.v.a();
        this.v = null;
      }
      if ((this.v == null) && (this.e != null) && (this.e.f() != null))
      {
        this.v = new com.tencent.liteav.basic.e.d();
        this.v.a(this.e.f(), this.s);
      }
    }
    while (true)
    {
      if (this.v != null)
        this.v.a(paramc.a, paramc.h, this.w, this.t, this.u, paramc.d, paramc.e, paramBoolean);
      AppMethodBeat.o(66469);
      break;
      label191: if (this.v != null)
      {
        this.v.a();
        this.v = null;
      }
    }
  }

  private void b(int paramInt1, int paramInt2, EGLContext paramEGLContext)
  {
    int i1 = 2;
    int i2 = 1;
    AppMethodBeat.i(66459);
    int i3 = i1;
    switch (this.k.j)
    {
    default:
      i3 = i1;
    case 0:
      if (this.l == 1)
        i3 = i2;
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      i2 = this.k.i;
      if ((this.i == null) || (this.h.width != paramInt1) || (this.h.height != paramInt2) || (this.g != i3) || (this.h.gop != i2))
        a(paramInt1, paramInt2, i3, paramEGLContext);
      AppMethodBeat.o(66459);
      return;
      i3 = 1;
      break;
      i3 = 3;
      break;
    }
  }

  private void b(int paramInt, String paramString)
  {
    AppMethodBeat.i(66430);
    Bundle localBundle = new Bundle();
    localBundle.putLong("EVT_USERID", this.y);
    localBundle.putInt("EVT_ID", paramInt);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    if (paramString != null)
      localBundle.putCharSequence("EVT_MSG", paramString);
    com.tencent.liteav.basic.util.b.a(this.A, paramInt, localBundle);
    AppMethodBeat.o(66430);
  }

  private void c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66466);
    com.tencent.liteav.beauty.c localc;
    Bitmap localBitmap;
    float f1;
    float f2;
    float f3;
    if (this.k.C != -1.0F)
      if (this.f != null)
      {
        localc = this.f;
        localBitmap = this.k.x;
        f1 = this.k.A;
        f2 = this.k.B;
        f3 = this.k.C;
      }
    while (true)
    {
      localc.a(localBitmap, f1, f2, f3);
      do
      {
        AppMethodBeat.o(66466);
        return;
      }
      while ((this.f == null) || (paramInt1 == 0) || (paramInt2 == 0));
      localc = this.f;
      localBitmap = this.k.x;
      f1 = this.k.y / paramInt1;
      f2 = this.k.z / paramInt2;
      if (this.k.x == null)
        f3 = 0.0F;
      else
        f3 = this.k.x.getWidth() / paramInt1;
    }
  }

  private void d(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66468);
    c(paramInt1, paramInt2);
    AppMethodBeat.o(66468);
  }

  private void d(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66457);
    b(paramInt2, paramInt3, null);
    if (this.i != null)
      this.i.a(paramInt1, paramInt2, paramInt3, TXCTimeUtil.getTimeTick());
    AppMethodBeat.o(66457);
  }

  private void k(int paramInt)
  {
    AppMethodBeat.i(66463);
    if ((this.e != null) && (this.e.d()) && (paramInt != this.k.k) && (!this.k.M) && (this.l == 0))
    {
      this.e.a(new c.2(this));
      AppMethodBeat.o(66463);
    }
    while (true)
    {
      return;
      this.k.a();
      if ((this.e != null) && (this.e.d()))
        this.e.a(new c.3(this));
      AppMethodBeat.o(66463);
    }
  }

  private void t()
  {
    AppMethodBeat.i(66461);
    try
    {
      if (this.i != null)
      {
        this.i.a();
        this.i.a(null);
        this.i = null;
      }
      this.h.width = 0;
      this.h.height = 0;
      AppMethodBeat.o(66461);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(66461);
    }
  }

  private void u()
  {
    AppMethodBeat.i(66462);
    if ((this.k.K & 0x1) != 0)
    {
      com.tencent.liteav.audio.b.a().a(true);
      com.tencent.liteav.audio.b.a().c(this.k.r);
      com.tencent.liteav.audio.b.a().a(this.k.q);
    }
    while (true)
    {
      com.tencent.liteav.audio.b.a().a(this.k.s, this.j);
      com.tencent.liteav.audio.b.a().c(this.C);
      TXCLiveBGMPlayer.getInstance().switchAecType(com.tencent.liteav.audio.b.a().f());
      TXCLiveBGMPlayer.getInstance().setPitch(this.q);
      AppMethodBeat.o(66462);
      return;
      com.tencent.liteav.audio.b.a().c(1);
      com.tencent.liteav.audio.b.a().a(this.k.q);
    }
  }

  private void v()
  {
    AppMethodBeat.i(66464);
    if ((this.k.t != null) && (this.e != null))
      this.e.a(new c.4(this));
    AppMethodBeat.o(66464);
  }

  private void w()
  {
    AppMethodBeat.i(66465);
    if (this.e != null)
      this.e.a(new c.5(this));
    AppMethodBeat.o(66465);
  }

  private void x()
  {
    AppMethodBeat.i(66467);
    if (this.f != null)
      if (this.k.I)
      {
        this.f.f(0);
        AppMethodBeat.o(66467);
      }
    while (true)
    {
      return;
      this.f.f(3);
      AppMethodBeat.o(66467);
    }
  }

  public int a(com.tencent.liteav.basic.g.c paramc)
  {
    AppMethodBeat.i(66445);
    if (this.B != null)
    {
      m localm = (m)this.B.get();
      if (localm != null)
        paramc.a = localm.onTextureCustomProcess(paramc.a, paramc.d, paramc.e);
    }
    a(paramc, false);
    int i1 = paramc.a;
    AppMethodBeat.o(66445);
    return i1;
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66439);
    int i1 = a(paramInt2, paramInt3, null);
    if (i1 != 0)
    {
      AppMethodBeat.o(66439);
      paramInt1 = i1;
    }
    while (true)
    {
      return paramInt1;
      if (this.i != null)
        this.i.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3, TXCTimeUtil.getTimeTick());
      paramInt1 = 0;
      AppMethodBeat.o(66439);
    }
  }

  public void a()
  {
    AppMethodBeat.i(66452);
    com.tencent.liteav.audio.b.a().b();
    com.tencent.liteav.audio.b.a().a(null);
    AppMethodBeat.o(66452);
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(66417);
    if (this.f != null)
      this.f.a(paramFloat);
    AppMethodBeat.o(66417);
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(66470);
    if ((this.e != null) && (this.k.D))
      this.e.a(paramFloat1, paramFloat2);
    AppMethodBeat.o(66470);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(66407);
    this.n = paramInt;
    if (this.e == null)
      AppMethodBeat.o(66407);
    while (true)
    {
      return;
      this.e.b(paramInt);
      AppMethodBeat.o(66407);
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66403);
    if (this.v != null)
    {
      this.v.a(new c.7(this, paramInt1, paramInt2));
      AppMethodBeat.o(66403);
    }
    while (true)
    {
      return;
      this.t = paramInt1;
      this.u = paramInt2;
      AppMethodBeat.o(66403);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66398);
    if (this.e == null)
      AppMethodBeat.o(66398);
    while (true)
    {
      return;
      this.e.a(new c.1(this, paramInt2, paramInt3, paramInt1));
      AppMethodBeat.o(66398);
    }
  }

  public void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(66444);
    TXCLog.e(d, "onRecordError code = " + paramInt + ":" + paramString);
    if (paramInt == TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT)
      b(-1302, "打开麦克风失败");
    AppMethodBeat.o(66444);
  }

  public void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(66411);
    if (this.f != null)
      this.f.a(paramBitmap);
    AppMethodBeat.o(66411);
  }

  public void a(final Bitmap paramBitmap, final ByteBuffer paramByteBuffer, final int paramInt1, final int paramInt2)
  {
    AppMethodBeat.i(66450);
    if (this.e != null)
      this.e.a(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(67654);
          try
          {
            int i = paramBitmap.getWidth();
            int j = paramBitmap.getHeight();
            com.tencent.liteav.basic.e.a locala = com.tencent.liteav.basic.util.b.a(i, j, paramInt1, paramInt2);
            c.g(c.this).a(locala);
            c.g(c.this).a(false);
            c.g(c.this).a(paramInt1, paramInt2);
            c.g(c.this).a(0);
            c.g(c.this).a(paramByteBuffer.array(), i, j, 0, 2, 0);
            AppMethodBeat.o(67654);
            return;
          }
          catch (Exception localException)
          {
            while (true)
              AppMethodBeat.o(67654);
          }
        }
      });
    AppMethodBeat.o(66450);
  }

  public void a(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(66453);
    if (this.f != null)
      this.f.a();
    AppMethodBeat.o(66453);
  }

  public void a(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(66448);
    c.a locala = this.z;
    if (locala != null)
      locala.onEncVideoFormat(paramMediaFormat);
    AppMethodBeat.o(66448);
  }

  public void a(Surface paramSurface)
  {
    AppMethodBeat.i(66402);
    if (this.r != null)
    {
      TXCLog.w(d, "camera preview view is not null, can't set surface");
      AppMethodBeat.o(66402);
    }
    while (true)
    {
      return;
      this.s = paramSurface;
      AppMethodBeat.o(66402);
    }
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(66389);
    this.A = new WeakReference(parama);
    AppMethodBeat.o(66389);
  }

  public void a(n paramn)
  {
    AppMethodBeat.i(66404);
    if (this.r != null)
    {
      TXCGLSurfaceView localTXCGLSurfaceView = this.r.getGLSurfaceView();
      if (localTXCGLSurfaceView != null)
        localTXCGLSurfaceView.a(new c.8(this, paramn));
      AppMethodBeat.o(66404);
    }
    while (true)
    {
      return;
      if (this.v != null)
        this.v.a(new c.9(this, paramn));
      AppMethodBeat.o(66404);
    }
  }

  public void a(com.tencent.liteav.basic.g.b paramb, int paramInt)
  {
    AppMethodBeat.i(66447);
    if (paramInt == 0)
    {
      c.a locala = this.z;
      if ((locala != null) && (paramb != null))
        locala.onEncVideo(paramb);
      AppMethodBeat.o(66447);
    }
    while (true)
    {
      return;
      if ((paramInt == 10000004) && (this.g == 1))
      {
        this.k.j = 0;
        b(1103, "硬编码启动失败,采用软编码");
      }
      AppMethodBeat.o(66447);
    }
  }

  public void a(com.tencent.liteav.basic.g.c paramc, long paramLong)
  {
    AppMethodBeat.i(66446);
    d(paramc.a, paramc.d, paramc.e);
    AppMethodBeat.o(66446);
  }

  public void a(c.a parama)
  {
    this.z = parama;
  }

  public void a(f paramf)
  {
    int i1 = 0;
    AppMethodBeat.i(66388);
    int i2 = this.k.k;
    int i3;
    int i4;
    if ((paramf != null) && ((this.k.t != paramf.t) || (this.k.u != paramf.u) || (this.k.v != paramf.v)))
    {
      i3 = 1;
      i4 = i1;
      if (paramf != null)
        if ((this.k.x == paramf.x) && (this.k.y == paramf.y) && (this.k.z == paramf.z) && (this.k.C == paramf.C) && (this.k.A == paramf.A))
        {
          i4 = i1;
          if (this.k.B == paramf.B);
        }
        else
        {
          i4 = 1;
        }
      if (paramf == null)
        break label269;
    }
    while (true)
    {
      try
      {
        this.k = ((f)paramf.clone());
        k(i2);
        if (i())
        {
          u();
          x();
          if (this.e != null)
            this.e.c(this.k.l);
          if (i3 != 0)
            v();
          if (i4 != 0)
            w();
        }
        AppMethodBeat.o(66388);
        return;
        i3 = 0;
      }
      catch (CloneNotSupportedException paramf)
      {
        this.k = new f();
        continue;
      }
      label269: this.k = new f();
    }
  }

  public void a(m paramm)
  {
    AppMethodBeat.i(66391);
    this.B = new WeakReference(paramm);
    AppMethodBeat.o(66391);
  }

  public void a(com.tencent.liteav.videoencoder.b paramb)
  {
    AppMethodBeat.i(66451);
    if (this.e != null)
    {
      this.e.a(new c.12(this, paramb));
      AppMethodBeat.o(66451);
    }
    while (true)
    {
      return;
      if (paramb != null);
      try
      {
        paramb.a();
        paramb.a(null);
        AppMethodBeat.o(66451);
      }
      catch (Exception paramb)
      {
        AppMethodBeat.o(66451);
      }
    }
  }

  public void a(TXLivePusher.OnBGMNotify paramOnBGMNotify)
  {
    AppMethodBeat.i(66438);
    if (paramOnBGMNotify == null)
    {
      this.b = null;
      this.c = null;
      TXCLiveBGMPlayer.getInstance().setOnPlayListener(null);
      AppMethodBeat.o(66438);
    }
    while (true)
    {
      return;
      this.c = paramOnBGMNotify;
      if (this.b == null)
        this.b = new com.tencent.liteav.audio.e()
        {
          public void a()
          {
            AppMethodBeat.i(66381);
            if (c.this.c != null)
              c.this.c.onBGMStart();
            AppMethodBeat.o(66381);
          }

          public void a(int paramAnonymousInt)
          {
            AppMethodBeat.i(66382);
            if (c.this.c != null)
              c.this.c.onBGMComplete(paramAnonymousInt);
            AppMethodBeat.o(66382);
          }

          public void a(long paramAnonymousLong1, long paramAnonymousLong2)
          {
            AppMethodBeat.i(66383);
            if (c.this.c != null)
              c.this.c.onBGMProgress(paramAnonymousLong1, paramAnonymousLong2);
            AppMethodBeat.o(66383);
          }
        };
      TXCLiveBGMPlayer.getInstance().setOnPlayListener(this.b);
      AppMethodBeat.o(66438);
    }
  }

  public void a(TXCloudVideoView paramTXCloudVideoView)
  {
    AppMethodBeat.i(66400);
    if (this.k.F)
    {
      TXCLog.e(d, "enable pure audio push , so can not start preview!");
      AppMethodBeat.o(66400);
      return;
    }
    Object localObject;
    if (paramTXCloudVideoView != null)
    {
      TXCGLSurfaceView localTXCGLSurfaceView = paramTXCloudVideoView.getGLSurfaceView();
      localObject = localTXCGLSurfaceView;
      if (localTXCGLSurfaceView == null)
      {
        localObject = new TXCGLSurfaceView(paramTXCloudVideoView.getContext());
        paramTXCloudVideoView.addVideoView((TXCGLSurfaceView)localObject);
      }
    }
    while (true)
    {
      this.l = 0;
      this.e = new b(this.j, this.k, (com.tencent.liteav.basic.e.l)localObject);
      this.e.a(this);
      this.e.a(this);
      this.e.a();
      this.e.b(this.n);
      this.r = paramTXCloudVideoView;
      if (this.r != null)
        this.r.start(this.k.D, this.k.E, this.e);
      AppMethodBeat.o(66400);
      break;
      localObject = new com.tencent.liteav.basic.e.e();
    }
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(66412);
    if (this.f != null)
      this.f.a(paramString);
    AppMethodBeat.o(66412);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(66401);
    if (this.e == null)
      AppMethodBeat.o(66401);
    while (true)
    {
      return;
      this.e.a(paramBoolean);
      this.e = null;
      if (this.r != null)
      {
        this.r.stop(paramBoolean);
        this.r = null;
      }
      this.s = null;
      if (this.v != null)
      {
        this.v.a();
        this.v = null;
      }
      AppMethodBeat.o(66401);
    }
  }

  public void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66390);
    com.tencent.liteav.audio.b.a().a(paramArrayOfByte);
    AppMethodBeat.o(66390);
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
  }

  public void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66442);
    c.a locala = this.z;
    if (locala != null)
      locala.onRecordPcm(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(66442);
  }

  public void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(66441);
    c.a locala = this.z;
    if (locala != null)
      locala.onRecordRawPcm(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramBoolean);
    AppMethodBeat.o(66441);
  }

  public int b()
  {
    return this.h.width;
  }

  public void b(float paramFloat)
  {
    AppMethodBeat.i(66424);
    this.q = paramFloat;
    TXCLiveBGMPlayer.getInstance().setPitch(paramFloat);
    AppMethodBeat.o(66424);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(66410);
    if (this.f != null)
      this.f.b(paramInt);
    AppMethodBeat.o(66410);
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66423);
    this.D = paramInt1;
    this.E = paramInt2;
    com.tencent.liteav.audio.b.a().a(paramInt1, paramInt2);
    AppMethodBeat.o(66423);
  }

  public void b(com.tencent.liteav.basic.g.c paramc)
  {
    AppMethodBeat.i(66454);
    if ((this.f != null) && (!this.k.F) && (this.e != null))
    {
      if ((this.h.height != paramc.g) || (this.h.width != paramc.f))
        d(paramc.f, paramc.g);
      this.w = paramc.j;
      this.f.a(paramc, paramc.b, 0);
    }
    AppMethodBeat.o(66454);
  }

  public void b(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66443);
    c.a locala = this.z;
    if (locala != null)
      locala.onEncAudio(paramArrayOfByte, paramLong, paramInt1, paramInt2);
    AppMethodBeat.o(66443);
  }

  public boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66409);
    if (this.f != null)
    {
      this.f.c(paramInt1);
      this.f.d(paramInt2);
      this.f.e(paramInt3);
    }
    AppMethodBeat.o(66409);
    return true;
  }

  @TargetApi(18)
  public boolean b(String paramString)
  {
    AppMethodBeat.i(66414);
    boolean bool;
    if (this.f != null)
    {
      bool = this.f.a(paramString, true);
      AppMethodBeat.o(66414);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(66414);
    }
  }

  public boolean b(boolean paramBoolean)
  {
    AppMethodBeat.i(66408);
    if (this.e == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(66408);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = this.e.d(paramBoolean);
      AppMethodBeat.o(66408);
    }
  }

  public int c()
  {
    return this.h.height;
  }

  public int c(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66440);
    int i1 = a(paramInt2, paramInt3, ((EGL10)EGLContext.getEGL()).eglGetCurrentContext());
    if (i1 != 0)
    {
      AppMethodBeat.o(66440);
      paramInt1 = i1;
    }
    while (true)
    {
      return paramInt1;
      if (this.i != null)
        this.i.a(paramInt1, paramInt2, paramInt3, TXCTimeUtil.getTimeTick());
      paramInt1 = 0;
      AppMethodBeat.o(66440);
    }
  }

  public void c(float paramFloat)
  {
    AppMethodBeat.i(66428);
    if (this.e == null)
      AppMethodBeat.o(66428);
    while (true)
    {
      return;
      this.e.a(paramFloat);
      AppMethodBeat.o(66428);
    }
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(66415);
    if (this.f != null)
      this.f.g(paramInt);
    AppMethodBeat.o(66415);
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(66413);
    if (this.f != null)
      this.f.b(paramBoolean);
    AppMethodBeat.o(66413);
  }

  public boolean c(String paramString)
  {
    AppMethodBeat.i(66431);
    boolean bool;
    if (!com.tencent.liteav.audio.b.a().c())
    {
      bool = false;
      AppMethodBeat.o(66431);
    }
    while (true)
    {
      return bool;
      TXCDRApi.txReportDAU(this.j, com.tencent.liteav.basic.datareport.a.aF);
      bool = TXCLiveBGMPlayer.getInstance().startPlay(paramString, com.tencent.liteav.audio.b.a().f());
      AppMethodBeat.o(66431);
    }
  }

  public int d(String paramString)
  {
    AppMethodBeat.i(66437);
    int i1 = (int)TXCLiveBGMPlayer.getInstance().getMusicDuration(paramString);
    AppMethodBeat.o(66437);
    return i1;
  }

  public String d()
  {
    AppMethodBeat.i(66393);
    String str = com.tencent.liteav.audio.b.a().f() + " | " + com.tencent.liteav.audio.b.a().e() + "," + com.tencent.liteav.audio.b.a().d();
    AppMethodBeat.o(66393);
    return str;
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(66416);
    if (this.f != null)
      this.f.h(paramInt);
    AppMethodBeat.o(66416);
  }

  public void d(boolean paramBoolean)
  {
    AppMethodBeat.i(66422);
    this.C = paramBoolean;
    com.tencent.liteav.audio.b.a().c(paramBoolean);
    AppMethodBeat.o(66422);
  }

  public boolean d(float paramFloat)
  {
    AppMethodBeat.i(66435);
    this.o = paramFloat;
    com.tencent.liteav.audio.b.a().a(paramFloat);
    AppMethodBeat.o(66435);
    return true;
  }

  public int e()
  {
    AppMethodBeat.i(66394);
    int i1;
    if (i())
    {
      TXCLog.w(d, "ignore startPush when pushing, status:" + this.m);
      i1 = -2;
      AppMethodBeat.o(66394);
      return i1;
    }
    TXCDRApi.initCrashReport(this.j);
    this.m = 1;
    TXCLog.d(d, "startPusher");
    u();
    com.tencent.liteav.audio.b.a().a(this);
    if (((this.k != null) && (this.k.F)) || (this.l == 1) || (this.e == null) || (this.e.d()))
      com.tencent.liteav.audio.b.a().a(this.j);
    while (true)
    {
      x();
      TXCDRApi.txReportDAU(this.j, com.tencent.liteav.basic.datareport.a.bw);
      i1 = 0;
      AppMethodBeat.o(66394);
      break;
      if (this.e != null)
        this.e.e(true);
    }
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(66418);
    if (this.f != null)
      this.f.i(paramInt);
    AppMethodBeat.o(66418);
  }

  public boolean e(float paramFloat)
  {
    AppMethodBeat.i(66436);
    TXCLiveBGMPlayer.getInstance().setVolume(paramFloat);
    AppMethodBeat.o(66436);
    return true;
  }

  public boolean e(boolean paramBoolean)
  {
    AppMethodBeat.i(66427);
    if (this.e == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(66427);
    }
    while (true)
    {
      return paramBoolean;
      this.e.c(paramBoolean);
      paramBoolean = true;
      AppMethodBeat.o(66427);
    }
  }

  public void f()
  {
    AppMethodBeat.i(66395);
    if (!i())
    {
      TXCLog.w(d, "ignore stopPush when not pushing, status:" + this.m);
      AppMethodBeat.o(66395);
    }
    while (true)
    {
      return;
      TXCLog.d(d, "stopPusher");
      this.m = 0;
      com.tencent.liteav.audio.b.a().b();
      com.tencent.liteav.audio.b.a().a(null);
      s();
      this.q = 0.0F;
      this.k.I = false;
      if (this.a != null)
        this.a.a();
      this.x = null;
      AppMethodBeat.o(66395);
    }
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(66419);
    if (this.f != null)
      this.f.j(paramInt);
    AppMethodBeat.o(66419);
  }

  public void g()
  {
    AppMethodBeat.i(66396);
    if (this.m != 1)
    {
      TXCLog.w(d, "ignore pause push when is not pushing, status:" + this.m);
      AppMethodBeat.o(66396);
    }
    while (true)
    {
      return;
      this.m = 2;
      TXCLog.d(d, "pausePusher");
      if ((this.k.w & 0x1) == 1)
      {
        if ((this.a != null) && (!this.k.F) && (this.e != null))
          this.a.a(this.k.v, this.k.u, this.k.t, this.h.width, this.h.height);
        if (this.e != null)
          this.e.c();
      }
      if ((this.k.w & 0x2) == 2)
        com.tencent.liteav.audio.b.a().c(true);
      AppMethodBeat.o(66396);
    }
  }

  public void g(int paramInt)
  {
    AppMethodBeat.i(66420);
    if (this.f != null)
      this.f.k(paramInt);
    AppMethodBeat.o(66420);
  }

  public void h()
  {
    AppMethodBeat.i(66397);
    if (this.m != 2)
    {
      TXCLog.w(d, "ignore resume push when is not pause, status:" + this.m);
      AppMethodBeat.o(66397);
    }
    while (true)
    {
      return;
      this.m = 1;
      TXCLog.d(d, "resumePusher");
      if ((this.k.w & 0x1) == 1)
      {
        if ((this.a != null) && (!this.k.F))
          this.a.a();
        if (this.e != null)
          this.e.b();
        w();
      }
      if ((this.k.w & 0x2) == 2)
      {
        com.tencent.liteav.audio.b.a().c(this.C);
        if ((this.k.K & 0x1) == 0)
        {
          com.tencent.liteav.audio.b.a().b();
          com.tencent.liteav.audio.b.a().a(this.k.q);
          com.tencent.liteav.audio.b.a().a(this.k.s, this.j);
          com.tencent.liteav.audio.b.a().d(this.p);
          com.tencent.liteav.audio.b.a().a(this.D, this.E);
          com.tencent.liteav.audio.b.a().a(this.o);
          com.tencent.liteav.audio.b.a().c(this.C);
          com.tencent.liteav.audio.b.a().a(this);
          com.tencent.liteav.audio.b.a().a(this.j);
        }
      }
      AppMethodBeat.o(66397);
    }
  }

  public void h(int paramInt)
  {
    AppMethodBeat.i(66421);
    if (this.f != null)
      this.f.l(paramInt);
    AppMethodBeat.o(66421);
  }

  public boolean i()
  {
    if (this.m != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean i(int paramInt)
  {
    AppMethodBeat.i(66426);
    boolean bool;
    if (this.e == null)
    {
      bool = false;
      AppMethodBeat.o(66426);
    }
    while (true)
    {
      return bool;
      bool = this.e.a(paramInt);
      AppMethodBeat.o(66426);
    }
  }

  public void j()
  {
    AppMethodBeat.i(66399);
    if (this.e == null)
      AppMethodBeat.o(66399);
    while (true)
    {
      return;
      this.e.a(new c.6(this));
      AppMethodBeat.o(66399);
    }
  }

  public void j(int paramInt)
  {
    AppMethodBeat.i(66429);
    this.p = paramInt;
    com.tencent.liteav.audio.b.a().d(paramInt);
    TXCDRApi.txReportDAU(this.j, com.tencent.liteav.basic.datareport.a.aE);
    AppMethodBeat.o(66429);
  }

  public void k()
  {
    AppMethodBeat.i(66405);
    if (Build.VERSION.SDK_INT < 21)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("EVT_MSG", "录屏失败,不支持的Android系统版本,需要5.0以上的系统");
      onNotifyEvent(-1309, localBundle);
      TXLog.e(d, "Screen capture need running on Android Lollipop or higher version, current:" + Build.VERSION.SDK_INT);
      AppMethodBeat.o(66405);
    }
    while (true)
    {
      return;
      this.l = 1;
      this.e = new i(this.j, this.k);
      this.e.a(this);
      this.e.a(this);
      this.e.a();
      TXCDRApi.txReportDAU(this.j, com.tencent.liteav.basic.datareport.a.aL);
      AppMethodBeat.o(66405);
    }
  }

  public void l()
  {
    AppMethodBeat.i(66406);
    if (this.e == null)
      AppMethodBeat.o(66406);
    while (true)
    {
      return;
      s();
      this.e.a(false);
      this.e = null;
      AppMethodBeat.o(66406);
    }
  }

  public boolean m()
  {
    return this.C;
  }

  public int n()
  {
    AppMethodBeat.i(66425);
    int i1;
    if (this.e == null)
    {
      i1 = 0;
      AppMethodBeat.o(66425);
    }
    while (true)
    {
      return i1;
      i1 = this.e.e();
      AppMethodBeat.o(66425);
    }
  }

  public boolean o()
  {
    AppMethodBeat.i(66432);
    TXCLiveBGMPlayer.getInstance().stopPlay();
    AppMethodBeat.o(66432);
    return true;
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(66449);
    if (paramBundle != null)
      paramBundle.putLong("EVT_USERID", this.y);
    com.tencent.liteav.basic.util.b.a(this.A, paramInt, paramBundle);
    AppMethodBeat.o(66449);
  }

  public boolean p()
  {
    AppMethodBeat.i(66433);
    TXCLiveBGMPlayer.getInstance().pause();
    AppMethodBeat.o(66433);
    return true;
  }

  public boolean q()
  {
    AppMethodBeat.i(66434);
    TXCLiveBGMPlayer.getInstance().resume();
    AppMethodBeat.o(66434);
    return true;
  }

  public void r()
  {
    AppMethodBeat.i(66455);
    if (this.f != null)
      this.f.a();
    t();
    if (this.B != null)
    {
      m localm = (m)this.B.get();
      if (localm != null)
        localm.onTextureDestoryed();
    }
    AppMethodBeat.o(66455);
  }

  public void s()
  {
    AppMethodBeat.i(66460);
    if (this.i == null)
      AppMethodBeat.o(66460);
    while (true)
    {
      return;
      if (this.e != null)
      {
        this.e.a(new c.13(this));
        AppMethodBeat.o(66460);
      }
      else
      {
        t();
        AppMethodBeat.o(66460);
      }
    }
  }

  public void setID(String paramString)
  {
    AppMethodBeat.i(66392);
    super.setID(paramString);
    if (this.i != null)
      this.i.setID(paramString);
    if (this.f != null)
      this.f.setID(paramString);
    AppMethodBeat.o(66392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.c
 * JD-Core Version:    0.6.2
 */