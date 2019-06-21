package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Play.TXAudioJitterBufferReportInfo;
import com.tencent.liteav.audio.impl.Play.TXCAudioBasePlayController;
import com.tencent.liteav.audio.impl.Play.d;
import com.tencent.liteav.audio.impl.TXCTraeJNI;
import com.tencent.liteav.audio.impl.e;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
  implements e
{
  public static final int a;
  public static float b;
  public static boolean c;
  public static float d;
  public static float e;
  public static boolean f;
  private static final String g;
  private TXCAudioBasePlayController h = null;
  private c i;
  private int j = a;
  private float k = b;
  private boolean l = c;
  private float m = d;
  private float n = e;
  private boolean o = false;
  private boolean p = false;
  private boolean q = f;
  private int r = 0;
  private Context s;

  static
  {
    AppMethodBeat.i(66541);
    g = "AudioCenter:" + a.class.getSimpleName();
    a = TXEAudioDef.TXE_AEC_NONE;
    b = 5.0F;
    c = true;
    d = 5.0F;
    e = 1.0F;
    f = false;
    AppMethodBeat.o(66541);
  }

  private void a(int paramInt, Context paramContext)
  {
    AppMethodBeat.i(66521);
    if ((paramInt == TXEAudioDef.TXE_AEC_TRAE) && (!TXCTraeJNI.nativeCheckTraeEngine(paramContext)))
    {
      TXCLog.e(g, "set aec type failed, check trae library failed!!");
      AppMethodBeat.o(66521);
    }
    while (true)
    {
      return;
      TXCLog.i(g, "set aec type to " + paramInt + ", cur type " + this.j);
      this.j = paramInt;
      AppMethodBeat.o(66521);
    }
  }

  public static void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(66536);
    TXCAudioBasePlayController.setAudioMode(paramContext, paramInt);
    AppMethodBeat.o(66536);
  }

  public int a()
  {
    try
    {
      AppMethodBeat.i(66519);
      int i1 = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      this.i = null;
      this.k = b;
      this.l = c;
      this.m = d;
      this.n = e;
      this.o = false;
      this.p = false;
      this.q = f;
      this.r = 0;
      this.s = null;
      if (this.h != null)
      {
        i1 = this.h.stopPlay();
        this.h = null;
      }
      com.tencent.liteav.audio.impl.c.a().b(this);
      AppMethodBeat.o(66519);
      return i1;
    }
    finally
    {
    }
  }

  public int a(Context paramContext)
  {
    while (true)
    {
      Object localObject;
      try
      {
        AppMethodBeat.i(66518);
        if (paramContext == null)
        {
          TXCLog.e(g, "invalid param, start play failed!");
          i1 = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
          AppMethodBeat.o(66518);
          return i1;
        }
        if (com.tencent.liteav.audio.impl.b.c(this.j) != TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK)
        {
          localObject = g;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("start player failed, with aec type ");
          TXCLog.w((String)localObject, this.j + ", invalid aec recorder has started!");
        }
        if ((this.h != null) && (this.h.isPlaying()))
        {
          TXCLog.e(g, "play has started, can not start again!");
          i1 = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
          AppMethodBeat.o(66518);
          continue;
        }
      }
      finally
      {
      }
      this.s = paramContext;
      com.tencent.liteav.audio.impl.a.a().a(paramContext);
      com.tencent.liteav.audio.impl.c.a().a(this.s);
      com.tencent.liteav.audio.impl.c.a().a(this);
      if (this.h == null)
      {
        if (this.j != TXEAudioDef.TXE_AEC_TRAE)
          break label294;
        localObject = new com/tencent/liteav/audio/impl/Play/c;
        ((com.tencent.liteav.audio.impl.Play.c)localObject).<init>(paramContext.getApplicationContext());
      }
      for (this.h = ((TXCAudioBasePlayController)localObject); ; this.h = ((TXCAudioBasePlayController)localObject))
      {
        if (this.h == null)
          break label314;
        a(this.j, this.s);
        a(this.i);
        a(this.k);
        a(this.l);
        b(this.m);
        c(this.n);
        c(this.o);
        b(this.p);
        a(this.r);
        d(this.q);
        i1 = this.h.startPlay();
        AppMethodBeat.o(66518);
        break;
        label294: localObject = new com/tencent/liteav/audio/impl/Play/b;
        ((com.tencent.liteav.audio.impl.Play.b)localObject).<init>(paramContext.getApplicationContext());
      }
      label314: TXCLog.e(g, "start play failed! controller is null!");
      int i1 = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
      AppMethodBeat.o(66518);
    }
  }

  public int a(com.tencent.liteav.basic.g.a parama)
  {
    try
    {
      AppMethodBeat.i(66522);
      int i1;
      if (this.h == null)
      {
        TXCLog.e(g, "play audio failed, controller not created yet!");
        i1 = TXEAudioDef.TXE_AUDIO_PLAY_ERR_INVALID_STATE;
        AppMethodBeat.o(66522);
      }
      while (true)
      {
        return i1;
        i1 = this.h.playData(parama);
        AppMethodBeat.o(66522);
      }
    }
    finally
    {
    }
    throw parama;
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(66524);
    this.k = paramFloat;
    if (this.h != null)
      this.h.setCacheTime(paramFloat);
    AppMethodBeat.o(66524);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(66537);
    this.r = paramInt;
    if (this.h != null)
      this.h.setSmootheMode(this.r);
    AppMethodBeat.o(66537);
  }

  public void a(c paramc)
  {
    AppMethodBeat.i(66523);
    this.i = paramc;
    if (this.h != null)
      this.h.setListener(paramc);
    AppMethodBeat.o(66523);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(66525);
    this.l = paramBoolean;
    if (this.h != null)
      this.h.enableAutojustCache(paramBoolean);
    AppMethodBeat.o(66525);
  }

  public void a(boolean paramBoolean, Context paramContext)
  {
    AppMethodBeat.i(66520);
    if (!paramBoolean)
    {
      a(TXEAudioDef.TXE_AEC_NONE, paramContext);
      AppMethodBeat.o(66520);
    }
    while (true)
    {
      return;
      if (com.tencent.liteav.basic.f.b.a().g())
      {
        a(TXEAudioDef.TXE_AEC_SYSTEM, paramContext);
        AppMethodBeat.o(66520);
      }
      else
      {
        com.tencent.liteav.audio.impl.a.a(com.tencent.liteav.basic.f.b.a().b());
        a(TXEAudioDef.TXE_AEC_TRAE, paramContext);
        AppMethodBeat.o(66520);
      }
    }
  }

  public long b()
  {
    try
    {
      AppMethodBeat.i(66528);
      long l1;
      if (this.h != null)
      {
        l1 = this.h.getCacheDuration();
        AppMethodBeat.o(66528);
      }
      while (true)
      {
        return l1;
        l1 = 0L;
        AppMethodBeat.o(66528);
      }
    }
    finally
    {
    }
  }

  public void b(float paramFloat)
  {
    AppMethodBeat.i(66526);
    this.m = paramFloat;
    if (this.h != null)
      this.h.setAutoAdjustMaxCache(paramFloat);
    AppMethodBeat.o(66526);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(66540);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(66540);
      while (true)
      {
        return;
        if (this.h == null)
          break;
        this.h.setMute(true);
        AppMethodBeat.o(66540);
        continue;
        if (this.h == null)
          break;
        this.h.setMute(true);
        AppMethodBeat.o(66540);
      }
      if (this.h != null)
        this.h.setMute(this.q);
    }
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(66533);
    this.p = paramBoolean;
    if (this.h != null)
      this.h.enableHWAcceleration(paramBoolean);
    AppMethodBeat.o(66533);
  }

  public long c()
  {
    try
    {
      AppMethodBeat.i(66529);
      long l1;
      if (this.h != null)
      {
        l1 = this.h.getCurPts();
        AppMethodBeat.o(66529);
      }
      while (true)
      {
        return l1;
        l1 = 0L;
        AppMethodBeat.o(66529);
      }
    }
    finally
    {
    }
  }

  public void c(float paramFloat)
  {
    AppMethodBeat.i(66527);
    this.n = paramFloat;
    if (this.h != null)
      this.h.setAutoAdjustMinCache(paramFloat);
    AppMethodBeat.o(66527);
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(66534);
    this.o = paramBoolean;
    if (this.h != null)
      this.h.enableRealTimePlay(paramBoolean);
    AppMethodBeat.o(66534);
  }

  public int d()
  {
    try
    {
      AppMethodBeat.i(66530);
      int i1;
      if (this.h != null)
      {
        i1 = this.h.getRecvJitter();
        AppMethodBeat.o(66530);
      }
      while (true)
      {
        return i1;
        i1 = 0;
        AppMethodBeat.o(66530);
      }
    }
    finally
    {
    }
  }

  public void d(boolean paramBoolean)
  {
    AppMethodBeat.i(66535);
    this.q = paramBoolean;
    if (this.h != null)
      this.h.setMute(paramBoolean);
    AppMethodBeat.o(66535);
  }

  public long e()
  {
    try
    {
      AppMethodBeat.i(66531);
      long l1;
      if (this.h != null)
      {
        l1 = this.h.getCurRecvTS();
        AppMethodBeat.o(66531);
      }
      while (true)
      {
        return l1;
        l1 = 0L;
        AppMethodBeat.o(66531);
      }
    }
    finally
    {
    }
  }

  public float f()
  {
    try
    {
      AppMethodBeat.i(66532);
      float f1;
      if (this.h != null)
      {
        f1 = this.h.getCacheThreshold();
        AppMethodBeat.o(66532);
      }
      while (true)
      {
        return f1;
        f1 = 0.0F;
        AppMethodBeat.o(66532);
      }
    }
    finally
    {
    }
  }

  public int g()
  {
    AppMethodBeat.i(66538);
    int i1;
    if (d.a().d())
      if (this.j == TXEAudioDef.TXE_AEC_TRAE)
      {
        TXCLog.e(g, "audio track has start, but aec type is trae!!" + this.j);
        i1 = TXEAudioDef.TXE_AEC_NONE;
        AppMethodBeat.o(66538);
      }
    while (true)
    {
      return i1;
      i1 = this.j;
      AppMethodBeat.o(66538);
      continue;
      if (TXCTraeJNI.nativeTraeIsPlaying())
      {
        if (this.j != TXEAudioDef.TXE_AEC_TRAE)
        {
          TXCLog.e(g, "trae engine has start, but aec type is not trae!!" + this.j);
          i1 = TXEAudioDef.TXE_AEC_TRAE;
          AppMethodBeat.o(66538);
        }
        else
        {
          i1 = this.j;
          AppMethodBeat.o(66538);
        }
      }
      else
      {
        i1 = TXEAudioDef.TXE_AEC_NONE;
        AppMethodBeat.o(66538);
      }
    }
  }

  public TXAudioJitterBufferReportInfo h()
  {
    AppMethodBeat.i(66539);
    TXAudioJitterBufferReportInfo localTXAudioJitterBufferReportInfo;
    if (this.h != null)
    {
      localTXAudioJitterBufferReportInfo = this.h.getReportInfo();
      AppMethodBeat.o(66539);
    }
    while (true)
    {
      return localTXAudioJitterBufferReportInfo;
      localTXAudioJitterBufferReportInfo = null;
      AppMethodBeat.o(66539);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.a
 * JD-Core Version:    0.6.2
 */