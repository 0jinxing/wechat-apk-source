package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.network.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;

public class e extends n
  implements com.tencent.liteav.basic.d.a, h.a, f, com.tencent.liteav.renderer.a.a, com.tencent.liteav.renderer.g
{
  private TXLivePlayer.ITXAudioRawDataListener A;
  private String B;
  private boolean C;
  private long D;
  private long E;
  private boolean F;
  private h e;
  private com.tencent.liteav.renderer.a f;
  private TXCStreamDownloader g;
  private Handler h;
  private TextureView i;
  private boolean j;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private boolean o;
  private com.tencent.liteav.a.a p;
  private TXRecordCommon.ITXVideoRecordListener q;
  private d r;
  private int s;
  private int t;
  private com.tencent.liteav.renderer.h u;
  private com.tencent.liteav.renderer.h v;
  private float[] w;
  private float[] x;
  private String y;
  private int z;

  public e(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(66322);
    this.e = null;
    this.f = null;
    this.g = null;
    this.j = false;
    this.k = false;
    this.l = 0;
    this.m = 0;
    this.n = 16;
    this.o = false;
    this.s = 0;
    this.t = 0;
    this.u = null;
    this.v = null;
    this.w = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F };
    this.x = new float[16];
    this.y = "";
    this.B = "";
    this.C = false;
    this.D = 0L;
    this.E = 0L;
    this.F = false;
    this.h = new Handler(Looper.getMainLooper());
    this.f = new com.tencent.liteav.renderer.a();
    this.f.a(this);
    AppMethodBeat.o(66322);
  }

  private int b(String paramString, int paramInt)
  {
    int i1 = 0;
    AppMethodBeat.i(66345);
    if (paramInt == 0)
    {
      this.g = new TXCStreamDownloader(this.b, 1);
      this.g.setID(this.B);
      this.g.setListener(this);
      this.g.setNotifyListener(this);
      this.g.setHeaders(this.a.o);
      if (paramInt == 5)
        i1 = 1;
      if (i1 == 0)
        break label175;
      this.g.setRetryTimes(5);
      this.g.setRetryInterval(1);
    }
    while (true)
    {
      paramInt = this.g.start(paramString, this.a.j, this.a.l, this.a.k);
      AppMethodBeat.o(66345);
      return paramInt;
      if (paramInt == 5)
      {
        this.g = new TXCStreamDownloader(this.b, 4);
        break;
      }
      this.g = new TXCStreamDownloader(this.b, 0);
      break;
      label175: this.g.setRetryTimes(this.a.e);
      this.g.setRetryInterval(this.a.f);
    }
  }

  private void b(String paramString)
  {
    AppMethodBeat.i(66349);
    this.B = String.format("%s-%d", new Object[] { paramString, Long.valueOf(TXCTimeUtil.getTimeTick() % 10000L) });
    if (this.e != null)
      this.e.setID(this.B);
    if (this.f != null)
      this.f.setID(this.B);
    if (this.g != null)
      this.g.setID(this.B);
    if (this.r != null)
      this.r.d(this.B);
    AppMethodBeat.o(66349);
  }

  private void f(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(66343);
    if (this.i != null)
      this.i.setVisibility(0);
    this.e = new h(this.b, 1);
    this.e.a(this);
    this.e.a(this.f);
    this.e.a(this);
    this.e.a(this.a);
    this.e.setID(this.B);
    h localh = this.e;
    if (paramInt == 5);
    while (true)
    {
      localh.a(bool);
      this.e.b(this.j);
      AppMethodBeat.o(66343);
      return;
      bool = false;
    }
  }

  private void i()
  {
    AppMethodBeat.i(66340);
    if (this.p == null)
    {
      this.s = this.f.m();
      this.t = this.f.n();
      com.tencent.liteav.a.a.a locala = k();
      this.p = new com.tencent.liteav.a.a(this.b);
      this.p.a(locala);
      this.p.a(new e.1(this));
    }
    if (this.u == null)
    {
      this.u = new com.tencent.liteav.renderer.h(Boolean.TRUE);
      this.u.b();
      this.u.b(this.s, this.t);
      this.u.a(this.s, this.t);
    }
    if (this.v == null)
    {
      this.v = new com.tencent.liteav.renderer.h(Boolean.FALSE);
      this.v.b();
      this.v.b(this.f.k(), this.f.l());
      this.v.a(this.f.k(), this.f.l());
      Matrix.setIdentityM(this.x, 0);
    }
    AppMethodBeat.o(66340);
  }

  private void j()
  {
    AppMethodBeat.i(66341);
    if (this.u != null)
    {
      this.u.c();
      this.u = null;
    }
    if (this.v != null)
    {
      this.v.c();
      this.v = null;
    }
    AppMethodBeat.o(66341);
  }

  private com.tencent.liteav.a.a.a k()
  {
    AppMethodBeat.i(66342);
    int i1 = 480;
    int i2 = 640;
    int i3 = i2;
    int i4 = i1;
    if (this.s > 0)
    {
      i3 = i2;
      i4 = i1;
      if (this.t > 0)
      {
        i4 = this.s;
        i3 = this.t;
      }
    }
    com.tencent.liteav.a.a.a locala = new com.tencent.liteav.a.a.a();
    locala.a = i4;
    locala.b = i3;
    locala.c = 20;
    double d = i4 * i4;
    locala.d = ((int)(Math.sqrt(i3 * i3 + d * 1.0D) * 1.2D));
    locala.h = this.l;
    locala.i = this.m;
    locala.j = this.n;
    locala.f = com.tencent.liteav.a.a.a(this.b, ".mp4");
    locala.g = com.tencent.liteav.a.a.a(this.b, ".jpg");
    locala.e = this.f.b();
    TXCLog.d("TXCLivePlayer", "record config: ".concat(String.valueOf(locala)));
    AppMethodBeat.o(66342);
    return locala;
  }

  private void l()
  {
    AppMethodBeat.i(66344);
    if (this.e != null)
    {
      this.e.a();
      this.e.a(null);
      this.e.a(null);
      this.e.a(null);
      this.e = null;
    }
    AppMethodBeat.o(66344);
  }

  private void m()
  {
    AppMethodBeat.i(66346);
    if (this.g != null)
    {
      this.g.setListener(null);
      this.g.setNotifyListener(null);
      this.g.stop();
      this.g = null;
    }
    AppMethodBeat.o(66346);
  }

  private void n()
  {
    AppMethodBeat.i(66347);
    this.r = new d(this.b);
    this.r.a(this.y);
    d locald = this.r;
    if (this.z == 5);
    for (boolean bool = true; ; bool = false)
    {
      locald.a(bool);
      this.r.d(this.B);
      this.r.a();
      AppMethodBeat.o(66347);
      return;
    }
  }

  private void o()
  {
    AppMethodBeat.i(66348);
    if (this.r != null)
    {
      this.r.c();
      this.r = null;
    }
    AppMethodBeat.o(66348);
  }

  private void p()
  {
    this.C = false;
  }

  private void q()
  {
    AppMethodBeat.i(66351);
    if (this.D > 0L)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("EVT_PLAY_PROGRESS", (int)(this.D / 1000L));
      localBundle.putInt("EVT_PLAY_PROGRESS_MS", (int)this.D);
      onNotifyEvent(2005, localBundle);
    }
    if ((this.h != null) && (this.C))
      this.h.postDelayed(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(67357);
          if (e.c(e.this))
            e.d(e.this);
          AppMethodBeat.o(67357);
        }
      }
      , 1000L);
    AppMethodBeat.o(66351);
  }

  private void r()
  {
    AppMethodBeat.i(66352);
    this.F = true;
    if (this.h != null)
      this.h.postDelayed(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(66379);
          if (e.e(e.this))
            e.f(e.this);
          AppMethodBeat.o(66379);
        }
      }
      , 2000L);
    AppMethodBeat.o(66352);
  }

  private void s()
  {
    this.F = false;
  }

  private void t()
  {
    AppMethodBeat.i(66353);
    Object localObject = com.tencent.liteav.basic.util.b.a();
    int i1 = localObject[0] / 10;
    int i2 = localObject[1] / 10;
    String str = i1 + "/" + i2 + "%";
    int i3 = TXCStatus.d(this.B, 7102);
    int i4 = TXCStatus.d(this.B, 7101);
    localObject = TXCStatus.c(this.B, 7110);
    i1 = (int)TXCStatus.e(this.B, 6002);
    Bundle localBundle = new Bundle();
    if (this.f != null)
    {
      localBundle.putInt("VIDEO_WIDTH", this.f.m());
      localBundle.putInt("VIDEO_HEIGHT", this.f.n());
    }
    if (this.e != null)
    {
      localBundle.putInt("CACHE_SIZE", (int)this.e.c());
      localBundle.putInt("CODEC_CACHE", (int)this.e.b());
      localBundle.putInt("VIDEO_CACHE_SIZE", (int)this.e.d());
      localBundle.putInt("V_DEC_CACHE_SIZE", this.e.e());
      localBundle.putInt("AV_PLAY_INTERVAL", (int)this.e.f());
      localBundle.putString("AUDIO_PLAY_INFO", this.e.k());
      localBundle.putInt("NET_JITTER", this.e.g());
      localBundle.putInt("AV_RECV_INTERVAL", (int)this.e.h());
      localBundle.putFloat("AUDIO_PLAY_SPEED", this.e.i());
      if (i1 != 0)
        break label475;
    }
    label475: for (i2 = 15; ; i2 = i1)
    {
      localBundle.putInt("VIDEO_GOP", (int)(this.e.j() * 10 / i2 / 10.0F + 0.5D));
      localBundle.putInt("NET_SPEED", i4 + i3);
      localBundle.putInt("VIDEO_FPS", i1);
      localBundle.putInt("VIDEO_BITRATE", i4);
      localBundle.putInt("AUDIO_BITRATE", i3);
      localBundle.putCharSequence("SERVER_IP", (CharSequence)localObject);
      localBundle.putCharSequence("CPU_USAGE", str);
      com.tencent.liteav.basic.util.b.a(this.d, 15001, localBundle);
      if (this.e != null)
        this.e.l();
      if (this.r != null)
        this.r.f();
      if ((this.h != null) && (this.F))
        this.h.postDelayed(new Runnable()
        {
          public void run()
          {
            AppMethodBeat.i(67707);
            if (e.e(e.this))
              e.f(e.this);
            AppMethodBeat.o(67707);
          }
        }
        , 2000L);
      AppMethodBeat.o(66353);
      return;
    }
  }

  public int a(int paramInt, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(66357);
    paramArrayOfFloat = this.p;
    if ((this.o) && (paramArrayOfFloat != null) && (this.u != null))
    {
      int i1 = this.u.d(paramInt);
      paramArrayOfFloat.a(i1, TXCTimeUtil.getTimeTick());
      this.f.a(i1, this.s, this.t, false, 0);
    }
    if (this.o)
      i();
    while (true)
    {
      AppMethodBeat.o(66357);
      return paramInt;
      j();
    }
  }

  public int a(String paramString)
  {
    AppMethodBeat.i(66329);
    int i1;
    if ((c()) && (this.g != null))
    {
      boolean bool = this.g.switchStream(paramString);
      if (this.e != null)
        TXCLog.w("TXCLivePlayer", " stream_switch video cache " + this.e.c() + " audio cache " + this.e.b());
      if (bool)
      {
        this.y = paramString;
        i1 = 0;
        AppMethodBeat.o(66329);
      }
    }
    while (true)
    {
      return i1;
      i1 = -2;
      AppMethodBeat.o(66329);
      continue;
      i1 = -1;
      AppMethodBeat.o(66329);
    }
  }

  public int a(String paramString, int paramInt)
  {
    AppMethodBeat.i(66327);
    if (c())
    {
      TXCLog.w("TXCLivePlayer", "play: ignore start play when is playing");
      paramInt = -2;
      AppMethodBeat.o(66327);
      return paramInt;
    }
    this.y = paramString;
    this.z = paramInt;
    b(paramString);
    this.k = true;
    f(paramInt);
    paramInt = b(paramString, paramInt);
    if (paramInt != 0)
    {
      this.k = false;
      m();
      l();
      if (this.i != null)
        this.i.setVisibility(8);
    }
    while (true)
    {
      AppMethodBeat.o(66327);
      break;
      n();
      r();
      TXCDRApi.txReportDAU(this.b, com.tencent.liteav.basic.datareport.a.bv);
      try
      {
        if (Class.forName("com.tencent.liteav.demo.play.SuperPlayerView") != null)
          TXCDRApi.txReportDAU(this.b, com.tencent.liteav.basic.datareport.a.bG);
      }
      catch (Exception paramString)
      {
      }
    }
  }

  public int a(boolean paramBoolean)
  {
    int i1 = 0;
    AppMethodBeat.i(66328);
    if (!c())
    {
      TXCLog.w("TXCLivePlayer", "play: ignore stop play when not started");
      i1 = -2;
      AppMethodBeat.o(66328);
    }
    while (true)
    {
      return i1;
      TXCLog.v("TXCLivePlayer", "play: stop");
      this.k = false;
      m();
      l();
      if ((this.i != null) && (paramBoolean))
        this.i.setVisibility(8);
      o();
      s();
      p();
      AppMethodBeat.o(66328);
    }
  }

  public void a()
  {
    AppMethodBeat.i(66330);
    a(false);
    AppMethodBeat.o(66330);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(66332);
    if (this.e != null)
      this.e.a(paramInt);
    AppMethodBeat.o(66332);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66325);
    if (this.f != null)
      this.f.c(paramInt1, paramInt2);
    AppMethodBeat.o(66325);
  }

  public void a(long paramLong)
  {
  }

  public void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(66335);
    h.a(paramContext, paramInt);
    AppMethodBeat.o(66335);
  }

  public void a(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(66359);
    j();
    e();
    AppMethodBeat.o(66359);
  }

  public void a(Surface paramSurface)
  {
    AppMethodBeat.i(66324);
    if (this.f != null)
      this.f.a(paramSurface);
    AppMethodBeat.o(66324);
  }

  public void a(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(66361);
    TXCLog.d("TXCLivePlayer", "onPlayAudioInfoChanged, samplerate=" + parama.a + ", channels=" + parama.b + ", bits=" + parama.c);
    this.l = parama.b;
    this.m = parama.a;
    if (parama.c > 1)
      this.n = parama.c;
    if (this.A != null)
      this.A.onAudioInfoChanged(parama.a, parama.b, parama.c);
    AppMethodBeat.o(66361);
  }

  public void a(g paramg)
  {
    AppMethodBeat.i(66326);
    super.a(paramg);
    if (this.e != null)
      this.e.a(paramg);
    AppMethodBeat.o(66326);
  }

  public void a(o paramo)
  {
    AppMethodBeat.i(66339);
    if (this.e != null)
      this.e.a(paramo);
    AppMethodBeat.o(66339);
  }

  public void a(TXLivePlayer.ITXAudioRawDataListener paramITXAudioRawDataListener)
  {
    this.A = paramITXAudioRawDataListener;
  }

  public void a(TXCloudVideoView paramTXCloudVideoView)
  {
    AppMethodBeat.i(66323);
    if ((this.c != null) && (this.c != paramTXCloudVideoView))
    {
      TextureView localTextureView = this.c.getVideoView();
      if (localTextureView != null)
        this.c.removeView(localTextureView);
    }
    super.a(paramTXCloudVideoView);
    if (this.c != null)
    {
      this.i = this.c.getVideoView();
      if (this.i == null)
        this.i = new TextureView(this.c.getContext());
      this.c.addVideoView(this.i);
    }
    if (this.f != null)
      this.f.a(this.i);
    AppMethodBeat.o(66323);
  }

  public void a(TXRecordCommon.ITXVideoRecordListener paramITXVideoRecordListener)
  {
    this.q = paramITXVideoRecordListener;
  }

  public void a(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(66360);
    long l1 = paramLong;
    if (this.p != null)
    {
      l1 = paramLong;
      if (paramLong <= 0L)
        l1 = TXCTimeUtil.getTimeTick();
      this.p.a(paramArrayOfByte, l1);
    }
    if (this.A != null)
      this.A.onPcmDataAvailable(paramArrayOfByte, l1);
    if (this.E <= 0L)
    {
      this.E = l1;
      AppMethodBeat.o(66360);
    }
    while (true)
    {
      return;
      this.D = (l1 - this.E);
      AppMethodBeat.o(66360);
    }
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66338);
    boolean bool;
    if (this.e != null)
    {
      bool = this.e.a(paramArrayOfByte);
      AppMethodBeat.o(66338);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(66338);
    }
  }

  public void b()
  {
    AppMethodBeat.i(66331);
    a(this.y, this.z);
    AppMethodBeat.o(66331);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(66333);
    if (this.e != null)
      this.e.b(paramInt);
    AppMethodBeat.o(66333);
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(66334);
    this.j = paramBoolean;
    if (this.e != null)
      this.e.b(this.j);
    AppMethodBeat.o(66334);
  }

  public int c(int paramInt)
  {
    AppMethodBeat.i(66336);
    if (this.o)
    {
      TXCLog.e("TXCLivePlayer", "startRecord: there is existing uncompleted record task");
      paramInt = -1;
      AppMethodBeat.o(66336);
    }
    while (true)
    {
      return paramInt;
      this.o = true;
      this.f.a(this);
      this.f.a(this);
      TXCDRApi.txReportDAU(this.b, com.tencent.liteav.basic.datareport.a.aA);
      paramInt = 0;
      AppMethodBeat.o(66336);
    }
  }

  public boolean c()
  {
    return this.k;
  }

  public TextureView d()
  {
    return this.i;
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(66358);
    com.tencent.liteav.a.a locala = this.p;
    if ((this.o) && (locala != null) && (this.v != null))
    {
      this.v.a(this.w);
      locala.a(this.v.d(paramInt), TXCTimeUtil.getTimeTick());
      this.v.a(this.x);
      this.v.c(paramInt);
    }
    if (this.o)
    {
      i();
      AppMethodBeat.o(66358);
    }
    while (true)
    {
      return;
      j();
      AppMethodBeat.o(66358);
    }
  }

  public int e()
  {
    int i1 = 0;
    AppMethodBeat.i(66337);
    if (!this.o)
    {
      TXCLog.w("TXCLivePlayer", "stopRecord: no recording task exist");
      i1 = -1;
      AppMethodBeat.o(66337);
    }
    while (true)
    {
      return i1;
      this.o = false;
      if (this.p != null)
      {
        this.p.a();
        this.p = null;
      }
      AppMethodBeat.o(66337);
    }
  }

  public boolean f()
  {
    return true;
  }

  public void g()
  {
    AppMethodBeat.i(66350);
    this.E = 0L;
    if (this.C)
      AppMethodBeat.o(66350);
    while (true)
    {
      return;
      this.C = true;
      if (this.h != null)
        this.h.postDelayed(new e.2(this), 1000L);
      AppMethodBeat.o(66350);
    }
  }

  public void onNotifyEvent(final int paramInt, final Bundle paramBundle)
  {
    AppMethodBeat.i(66356);
    if ((-2302 == paramInt) && (this.e != null))
      this.e.c((int)com.tencent.liteav.basic.f.b.a().a("Audio", "SmoothModeAdjust"));
    if (this.h != null)
      this.h.post(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(67358);
          com.tencent.liteav.basic.util.b.a(e.this.d, paramInt, paramBundle);
          if ((paramInt == 2103) && (e.g(e.this) != null))
            e.g(e.this).m();
          AppMethodBeat.o(67358);
        }
      });
    AppMethodBeat.o(66356);
  }

  public void onPullAudio(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(66354);
    if (!this.k)
      AppMethodBeat.o(66354);
    while (true)
    {
      return;
      if (this.e != null)
        this.e.a(parama);
      AppMethodBeat.o(66354);
    }
  }

  public void onPullNAL(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(66355);
    if (!this.k)
      AppMethodBeat.o(66355);
    while (true)
    {
      return;
      try
      {
        if (this.e != null)
          this.e.a(paramb);
        AppMethodBeat.o(66355);
      }
      catch (Exception paramb)
      {
        AppMethodBeat.o(66355);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.e
 * JD-Core Version:    0.6.2
 */