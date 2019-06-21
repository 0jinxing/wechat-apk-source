package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.c;
import com.tencent.liteav.audio.impl.Play.TXAudioJitterBufferReportInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.renderer.e;
import com.tencent.liteav.renderer.f;
import com.tencent.liteav.videodecoder.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class h extends com.tencent.liteav.basic.module.a
  implements c, com.tencent.liteav.basic.b.b, com.tencent.liteav.basic.d.a, f, d
{
  private Context a;
  private g b;
  private com.tencent.liteav.videodecoder.b c;
  private e d;
  private com.tencent.liteav.basic.b.a e;
  private com.tencent.liteav.audio.a f;
  private com.tencent.liteav.basic.d.a g;
  private boolean h;
  private int i;
  private long j;
  private byte[] k;
  private o l;
  private int m;
  private boolean n;
  private String o;
  private final float p;
  private final float q;
  private final float r;
  private final float s;
  private boolean t;
  private h.a u;

  public h(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(67721);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = 0;
    this.j = 0L;
    this.k = null;
    this.l = null;
    this.n = false;
    this.p = com.tencent.liteav.basic.a.a.o;
    this.q = com.tencent.liteav.basic.a.a.p;
    this.r = com.tencent.liteav.basic.a.a.q;
    this.s = 0.3F;
    this.t = false;
    this.u = null;
    this.a = paramContext;
    this.m = paramInt;
    com.tencent.liteav.basic.f.b.a().a(this.a);
    AppMethodBeat.o(67721);
  }

  private void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(67749);
    com.tencent.liteav.basic.d.a locala = this.g;
    if (locala != null)
    {
      Bundle localBundle = new Bundle();
      new StringBuilder("TXCRenderAndDec notifyEvent: mUserID  ").append(this.j);
      localBundle.putLong("EVT_USERID", this.j);
      localBundle.putInt("EVT_ID", paramInt);
      localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
      if (paramString != null)
        localBundle.putCharSequence("EVT_MSG", paramString);
      locala.onNotifyEvent(paramInt, localBundle);
    }
    AppMethodBeat.o(67749);
  }

  public static void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(67733);
    com.tencent.liteav.audio.a.a(paramContext, paramInt);
    AppMethodBeat.o(67733);
  }

  private void c(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67745);
    com.tencent.liteav.videodecoder.b localb = this.c;
    if (localb != null)
    {
      localb.a(this.b.i);
      if (paramSurfaceTexture != null)
        if (this.h)
          break label58;
    }
    label58: for (boolean bool = true; ; bool = false)
    {
      localb.a(paramSurfaceTexture, null, null, bool);
      localb.b();
      AppMethodBeat.o(67745);
      return;
    }
  }

  private void c(boolean paramBoolean)
  {
    AppMethodBeat.i(67748);
    float f1;
    float f3;
    if (paramBoolean)
    {
      f1 = this.b.c;
      float f2 = this.b.b;
      f3 = f1;
      if (f1 > this.q)
        f3 = this.q;
      f1 = f2;
      if (f2 > this.r)
        f1 = this.r;
      if (f3 < f1)
        break label333;
      f3 = this.q;
      f1 = this.r;
    }
    label318: label333: 
    while (true)
    {
      this.b.g = true;
      this.b.a = f3;
      this.b.c = f3;
      this.b.b = f1;
      if (this.f != null)
      {
        this.f.a(true, this.a);
        this.f.c(true);
      }
      if (this.e != null)
        this.e.b(paramBoolean);
      AppMethodBeat.o(67748);
      return;
      TXCLog.e("TXCRenderAndDec", "setupRealTimePlayParams current cache time : min-cache[" + this.b.c + "], max-cache[" + this.b.b + "], org-cache[" + this.b.a + "]");
      if (this.f != null)
      {
        if ((this.b == null) || (!this.b.h))
          break label318;
        this.f.a(true, this.a);
      }
      while (true)
      {
        this.f.c(false);
        if ((this.b.a <= this.b.b) && (this.b.a >= this.b.c))
          break;
        this.b.a = this.b.b;
        break;
        this.f.a(false, this.a);
      }
    }
  }

  private void q()
  {
    AppMethodBeat.i(67746);
    if (this.d != null);
    for (SurfaceTexture localSurfaceTexture = this.d.a(); ; localSurfaceTexture = null)
    {
      c(localSurfaceTexture);
      AppMethodBeat.o(67746);
      return;
    }
  }

  private void r()
  {
    AppMethodBeat.i(67747);
    c(this.h);
    if (this.f != null)
    {
      this.f.a(this.b.a);
      this.f.a(this.b.g);
      this.f.c(this.b.c);
      this.f.b(this.b.b);
      setStatusValue(2012, Long.valueOf(()(this.b.c * 1000.0F)));
      setStatusValue(2013, Long.valueOf(()(this.b.b * 1000.0F)));
      setStatusValue(2015, Long.valueOf(0L));
    }
    if (this.e != null)
      this.e.a(this.b.c);
    if ((this.c != null) && (this.c.a()) && (this.b.c < 0.3F) && (this.b.b < 0.3F))
    {
      this.b.i = false;
      this.c.c();
      q();
    }
    if (this.d != null)
      this.d.a(this.b.d);
    AppMethodBeat.o(67747);
  }

  private void s()
  {
    AppMethodBeat.i(67750);
    com.tencent.liteav.videodecoder.b localb = this.c;
    if (localb != null)
    {
      TXCLog.w("TXCRenderAndDec", "switch to soft decoder when hw error");
      localb.c();
      this.b.i = false;
      c(this.h);
      q();
    }
    AppMethodBeat.o(67750);
  }

  public void a()
  {
    AppMethodBeat.i(67726);
    this.h = false;
    this.i = 0;
    if (this.c != null)
    {
      this.c.a(null);
      this.c.a(null);
      this.c.c();
    }
    if (this.f != null)
    {
      this.f.a(null);
      this.f.a();
    }
    if (this.e != null)
    {
      this.e.a(null);
      this.e.b();
    }
    if (this.d != null)
    {
      this.d.j();
      this.d.a(null);
    }
    AppMethodBeat.o(67726);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(67729);
    if (this.d != null)
      this.d.b(paramInt);
    AppMethodBeat.o(67729);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67762);
    if (this.d != null)
      this.d.b(paramInt1, paramInt2);
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("EVT_MSG", "分辨率改变");
    localBundle.putInt("EVT_PARAM1", paramInt1);
    localBundle.putInt("EVT_PARAM2", paramInt2);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    onNotifyEvent(2009, localBundle);
    AppMethodBeat.o(67762);
  }

  public void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(67761);
    int i1 = 0;
    int i2 = 0;
    int i3 = i1;
    if (this.l != null)
    {
      i3 = i1;
      if (this.k == null);
    }
    try
    {
      byte[] arrayOfByte = this.k;
      this.k = null;
      i3 = i2;
      if (this.l != null)
      {
        i3 = i2;
        if (arrayOfByte != null)
        {
          i3 = i2;
          if (this.c != null)
          {
            if (arrayOfByte.length > paramInt1 * paramInt2 * 3 / 2)
              break label179;
            this.c.a(arrayOfByte, paramLong1, arrayOfByte.length);
            this.l.onVideoRawDataAvailable(arrayOfByte, paramInt1, paramInt2, (int)paramLong2);
          }
        }
      }
      for (i3 = 1; ; i3 = i2)
      {
        if (i3 == 0)
        {
          if ((paramLong1 > 0L) && (this.d != null))
            this.d.a(paramLong1, paramInt1, paramInt2);
          if (this.e != null)
            this.e.a(paramLong2);
        }
        AppMethodBeat.o(67761);
        return;
        label179: TXCLog.e("TXCRenderAndDec", "raw data buffer length is too large");
      }
    }
    finally
    {
      AppMethodBeat.o(67761);
    }
  }

  public void a(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67753);
    c(paramSurfaceTexture);
    AppMethodBeat.o(67753);
  }

  public void a(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(67760);
    if (this.d != null)
    {
      this.d.a(paramSurfaceTexture, paramInt1, paramInt2);
      if (this.u != null)
        this.u.a(paramLong1);
      if (this.e != null)
        this.e.a(paramLong1);
    }
    AppMethodBeat.o(67760);
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    this.g = parama;
  }

  public void a(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(67727);
    if (this.f != null)
    {
      this.f.a(parama);
      AppMethodBeat.o(67727);
    }
    while (true)
    {
      return;
      TXCLog.w("TXCRenderAndDec", "decAudio fail which audio play hasn't been created!");
      AppMethodBeat.o(67727);
    }
  }

  public void a(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67728);
    try
    {
      if (this.e != null)
        this.e.a(paramb);
      AppMethodBeat.o(67728);
      return;
    }
    catch (Exception paramb)
    {
      while (true)
        AppMethodBeat.o(67728);
    }
  }

  public void a(g paramg)
  {
    AppMethodBeat.i(67723);
    this.b = paramg;
    r();
    AppMethodBeat.o(67723);
  }

  public void a(h.a parama)
  {
    this.u = parama;
  }

  public void a(o paramo)
  {
    try
    {
      this.l = paramo;
      return;
    }
    finally
    {
    }
    throw paramo;
  }

  public void a(e parame)
  {
    AppMethodBeat.i(67722);
    this.d = parame;
    if ((this.d != null) && (this.g != null))
      this.d.a(this);
    if ((this.d != null) && (this.b != null))
      this.d.a(this.b.d);
    AppMethodBeat.o(67722);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(67725);
    this.h = paramBoolean;
    this.n = true;
    if (this.d != null)
    {
      this.d.a(this);
      this.d.i();
      this.d.setID(getID());
    }
    this.c = new com.tencent.liteav.videodecoder.b();
    this.c.a(this.j);
    this.c.a(this);
    this.c.a(this);
    this.f = new com.tencent.liteav.audio.a();
    this.f.a(this);
    c(this.h);
    this.f.a(this.i);
    this.f.a(this.a);
    this.e = new com.tencent.liteav.basic.b.a();
    this.e.a(this);
    this.e.a();
    q();
    r();
    AppMethodBeat.o(67725);
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    try
    {
      this.k = paramArrayOfByte;
      return true;
    }
    finally
    {
    }
    throw paramArrayOfByte;
  }

  public long b()
  {
    AppMethodBeat.i(67734);
    long l1;
    if (this.f != null)
    {
      l1 = this.f.b();
      AppMethodBeat.o(67734);
    }
    while (true)
    {
      return l1;
      l1 = 0L;
      AppMethodBeat.o(67734);
    }
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(67730);
    if (this.d != null)
      this.d.c(paramInt);
    AppMethodBeat.o(67730);
  }

  public void b(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67754);
    try
    {
      TXCLog.w("TXCRenderAndDec", "play:stop decode when surface texture release");
      if (this.c != null)
        this.c.c();
      if (this.u != null)
        this.u.a(paramSurfaceTexture);
      AppMethodBeat.o(67754);
      return;
    }
    catch (Exception paramSurfaceTexture)
    {
      while (true)
        AppMethodBeat.o(67754);
    }
  }

  public void b(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67757);
    try
    {
      if (this.c != null)
      {
        this.c.a(paramb);
        AppMethodBeat.o(67757);
      }
      while (true)
      {
        return;
        if (this.e != null)
          this.e.a(paramb.g);
        AppMethodBeat.o(67757);
      }
    }
    catch (Exception paramb)
    {
      while (true)
        AppMethodBeat.o(67757);
    }
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(67731);
    if (this.f != null)
      this.f.d(paramBoolean);
    AppMethodBeat.o(67731);
  }

  public long c()
  {
    AppMethodBeat.i(67735);
    long l1;
    if (this.e != null)
    {
      l1 = this.e.d();
      AppMethodBeat.o(67735);
    }
    while (true)
    {
      return l1;
      l1 = 0L;
      AppMethodBeat.o(67735);
    }
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(67732);
    this.i = paramInt;
    if (this.f != null)
      this.f.a(this.i);
    AppMethodBeat.o(67732);
  }

  public void c(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67758);
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("EVT_GET_MSG", paramb.a);
    onNotifyEvent(2012, localBundle);
    AppMethodBeat.o(67758);
  }

  public long d()
  {
    AppMethodBeat.i(67736);
    long l1;
    if (this.e != null)
    {
      l1 = this.e.e();
      AppMethodBeat.o(67736);
    }
    while (true)
    {
      return l1;
      l1 = 0L;
      AppMethodBeat.o(67736);
    }
  }

  public int e()
  {
    AppMethodBeat.i(67737);
    int i1;
    if (this.c != null)
    {
      i1 = this.c.d();
      AppMethodBeat.o(67737);
    }
    while (true)
    {
      return i1;
      i1 = 0;
      AppMethodBeat.o(67737);
    }
  }

  public long f()
  {
    AppMethodBeat.i(67738);
    long l1;
    if ((this.e != null) && (this.f != null))
    {
      l1 = this.f.c() - this.e.f();
      AppMethodBeat.o(67738);
    }
    while (true)
    {
      return l1;
      l1 = 0L;
      AppMethodBeat.o(67738);
    }
  }

  public int g()
  {
    AppMethodBeat.i(67739);
    int i1;
    if (this.f != null)
    {
      i1 = this.f.d();
      AppMethodBeat.o(67739);
    }
    while (true)
    {
      return i1;
      i1 = 0;
      AppMethodBeat.o(67739);
    }
  }

  public long h()
  {
    AppMethodBeat.i(67740);
    long l1;
    if ((this.f != null) && (this.e != null))
    {
      l1 = this.f.e() - this.e.g();
      AppMethodBeat.o(67740);
    }
    while (true)
    {
      return l1;
      l1 = 0L;
      AppMethodBeat.o(67740);
    }
  }

  public float i()
  {
    AppMethodBeat.i(67741);
    float f1;
    if (this.f != null)
    {
      f1 = this.f.f();
      AppMethodBeat.o(67741);
    }
    while (true)
    {
      return f1;
      f1 = 0.0F;
      AppMethodBeat.o(67741);
    }
  }

  public int j()
  {
    AppMethodBeat.i(67742);
    int i1;
    if (this.e != null)
    {
      i1 = this.e.h();
      AppMethodBeat.o(67742);
    }
    while (true)
    {
      return i1;
      i1 = 0;
      AppMethodBeat.o(67742);
    }
  }

  public String k()
  {
    AppMethodBeat.i(67743);
    if (this.f != null);
    for (int i1 = this.f.g(); ; i1 = TXEAudioDef.TXE_AEC_NONE)
    {
      String str = i1 + " | " + this.o;
      AppMethodBeat.o(67743);
      return str;
    }
  }

  public void l()
  {
    long l1 = 0L;
    AppMethodBeat.i(67744);
    TXAudioJitterBufferReportInfo localTXAudioJitterBufferReportInfo;
    long l2;
    long l3;
    if (this.f != null)
    {
      localTXAudioJitterBufferReportInfo = this.f.h();
      if (localTXAudioJitterBufferReportInfo != null)
      {
        if (localTXAudioJitterBufferReportInfo.mLoadCnt != 0)
          break label335;
        l2 = 0L;
        if (localTXAudioJitterBufferReportInfo.mTimeTotalCacheTimeCnt != 0L)
          break label350;
        l3 = 0L;
        label49: if (localTXAudioJitterBufferReportInfo.mTimeTotalJittCnt != 0)
          break label364;
      }
    }
    label335: label350: label364: for (int i1 = 0; ; i1 = localTXAudioJitterBufferReportInfo.mTimeTotalJitt / localTXAudioJitterBufferReportInfo.mTimeTotalJittCnt)
    {
      long l4 = i1;
      setStatusValue(2001, Long.valueOf(l2));
      setStatusValue(2002, Long.valueOf(localTXAudioJitterBufferReportInfo.mLoadCnt));
      setStatusValue(2003, Long.valueOf(localTXAudioJitterBufferReportInfo.mLoadMaxTime));
      setStatusValue(2004, Long.valueOf(localTXAudioJitterBufferReportInfo.mSpeedCnt));
      setStatusValue(2005, Long.valueOf(localTXAudioJitterBufferReportInfo.mNoDataCnt));
      setStatusValue(2007, Long.valueOf(localTXAudioJitterBufferReportInfo.mAvgCacheTime));
      setStatusValue(2008, Long.valueOf(localTXAudioJitterBufferReportInfo.mIsRealTime));
      setStatusValue(2010, Long.valueOf(l3));
      setStatusValue(2011, Long.valueOf(l4));
      setStatusValue(2014, Long.valueOf(localTXAudioJitterBufferReportInfo.mTimeDropCnt));
      if (this.e != null)
      {
        setStatusValue(2006, Long.valueOf(d()));
        setStatusValue(6007, Long.valueOf(this.e.k()));
        setStatusValue(6008, Long.valueOf(this.e.j()));
        setStatusValue(6009, Long.valueOf(this.e.i()));
      }
      if (this.c != null)
      {
        l2 = l1;
        if (this.c.a() == true)
          l2 = 1L;
        setStatusValue(5002, Long.valueOf(l2));
      }
      AppMethodBeat.o(67744);
      return;
      l2 = localTXAudioJitterBufferReportInfo.mLoadTime / localTXAudioJitterBufferReportInfo.mLoadCnt;
      break;
      l3 = localTXAudioJitterBufferReportInfo.mTimeTotalCacheTime / localTXAudioJitterBufferReportInfo.mTimeTotalCacheTimeCnt;
      break label49;
    }
  }

  public void m()
  {
    AppMethodBeat.i(67751);
    com.tencent.liteav.videodecoder.b localb = this.c;
    if ((localb != null) && (localb.e()))
      localb.b(true);
    AppMethodBeat.o(67751);
  }

  public long n()
  {
    AppMethodBeat.i(67755);
    try
    {
      if (this.f != null)
      {
        l1 = this.f.b();
        AppMethodBeat.o(67755);
        return l1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l1 = 0L;
        AppMethodBeat.o(67755);
      }
    }
  }

  public long o()
  {
    AppMethodBeat.i(67756);
    try
    {
      if (this.f != null)
      {
        l1 = this.f.c();
        AppMethodBeat.o(67756);
        return l1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l1 = 0L;
        AppMethodBeat.o(67756);
      }
    }
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(67752);
    if (paramInt == 2106)
      s();
    while (true)
    {
      com.tencent.liteav.basic.d.a locala = this.g;
      if (locala != null)
        locala.onNotifyEvent(paramInt, paramBundle);
      AppMethodBeat.o(67752);
      return;
      if ((paramInt == 2003) && (this.n))
      {
        a(2004, "视频播放开始");
        this.n = false;
      }
    }
  }

  public void onPlayAudioInfoChanged(com.tencent.liteav.basic.g.a parama1, com.tencent.liteav.basic.g.a parama2)
  {
    AppMethodBeat.i(67763);
    if (this.u != null)
      this.u.a(parama2);
    if ((parama1 != null) && (parama2 != null))
      this.o = (parama1.a + "," + parama1.b + " | " + parama2.a + "," + parama2.b);
    AppMethodBeat.o(67763);
  }

  public void onPlayError(int paramInt, String paramString)
  {
  }

  public void onPlayJitterStateNotify(int paramInt)
  {
    AppMethodBeat.i(67765);
    if (paramInt == TXEAudioDef.TXE_AUDIO_JITTER_STATE_LOADING)
    {
      if ((this.e != null) && (!this.h))
        this.e.a(true);
      a(2007, "视频缓冲中...");
      AppMethodBeat.o(67765);
    }
    while (true)
    {
      return;
      if (paramInt == TXEAudioDef.TXE_AUDIO_JITTER_STATE_FIRST_LAODING)
      {
        a(2007, "视频缓冲中...");
        AppMethodBeat.o(67765);
      }
      else if (paramInt == TXEAudioDef.TXE_AUDIO_JITTER_STATE_PLAYING)
      {
        if (this.e != null)
          this.e.a(false);
        a(2004, "视频播放开始");
        AppMethodBeat.o(67765);
      }
      else
      {
        if (paramInt == TXEAudioDef.TXE_AUDIO_JITTER_STATE_FIRST_PLAY)
        {
          if (this.e != null)
            this.e.a(false);
          if (this.n)
          {
            a(2004, "视频播放开始");
            this.n = false;
          }
        }
        AppMethodBeat.o(67765);
      }
    }
  }

  public void onPlayPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(67764);
    if (this.u != null)
      this.u.a(paramArrayOfByte, paramLong);
    AppMethodBeat.o(67764);
  }

  public int p()
  {
    AppMethodBeat.i(67759);
    try
    {
      if (this.c != null)
      {
        i1 = this.c.d();
        AppMethodBeat.o(67759);
        return i1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i1 = 0;
        AppMethodBeat.o(67759);
      }
    }
  }

  public void setID(String paramString)
  {
    AppMethodBeat.i(67724);
    super.setID(paramString);
    if (this.d != null)
      this.d.setID(getID());
    AppMethodBeat.o(67724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.h
 * JD-Core Version:    0.6.2
 */