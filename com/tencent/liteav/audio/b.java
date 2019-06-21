package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecordController;
import com.tencent.liteav.audio.impl.Record.f;
import com.tencent.liteav.audio.impl.Record.g;
import com.tencent.liteav.audio.impl.TXCTraeJNI;
import com.tencent.liteav.audio.impl.e;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class b
  implements e
{
  public static final int a;
  public static final int b;
  public static final int c;
  public static final int d;
  public static final int e;
  public static final int f;
  static b g;
  private static final String h;
  private WeakReference<d> i;
  private int j = a;
  private int k = b;
  private int l = com.tencent.liteav.basic.a.a.h;
  private int m = d;
  private boolean n = false;
  private int o = e;
  private boolean p = false;
  private boolean q = false;
  private Context r;
  private float s = 1.0F;
  private int t = -1;
  private int u = -1;
  private com.tencent.liteav.audio.impl.Record.c v = null;

  static
  {
    AppMethodBeat.i(66743);
    h = "AudioCenter:" + b.class.getSimpleName();
    a = com.tencent.liteav.basic.a.a.e;
    b = com.tencent.liteav.basic.a.a.f;
    c = com.tencent.liteav.basic.a.a.h;
    d = TXEAudioDef.TXE_REVERB_TYPE_0;
    e = TXEAudioDef.TXE_AEC_NONE;
    f = TXEAudioDef.TXE_AUDIO_TYPE_AAC;
    g = new b();
    AppMethodBeat.o(66743);
  }

  public static b a()
  {
    return g;
  }

  private void a(int paramInt, Context paramContext)
  {
    AppMethodBeat.i(66735);
    if ((paramInt == TXEAudioDef.TXE_AEC_TRAE) && (!TXCTraeJNI.nativeCheckTraeEngine(paramContext)))
    {
      TXCLog.e(h, "set aec type failed, check trae library failed!!");
      AppMethodBeat.o(66735);
    }
    while (true)
    {
      return;
      if (this.o != paramInt)
      {
        if ((this.v != null) && (this.v.isRecording()))
        {
          this.v.stopRecord();
          this.v = null;
          this.o = paramInt;
          a(this.r);
        }
        this.o = paramInt;
      }
      if (this.v != null)
        this.v.setAECType(paramInt);
      AppMethodBeat.o(66735);
    }
  }

  private void g()
  {
    AppMethodBeat.i(66741);
    if (this.i != null)
      a((d)this.i.get());
    a(this.q);
    a(this.j);
    c(this.k);
    d(this.m);
    a(this.o, this.r);
    b(this.p);
    c(this.n);
    a(this.s);
    a(this.t, this.u);
    AppMethodBeat.o(66741);
  }

  public int a(Context paramContext)
  {
    AppMethodBeat.i(66726);
    int i1;
    if (paramContext == null)
    {
      TXCLog.e(h, "invalid param, start record failed!");
      i1 = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
      AppMethodBeat.o(66726);
    }
    while (true)
    {
      return i1;
      this.r = paramContext.getApplicationContext();
      com.tencent.liteav.audio.impl.a.a().a(this.r);
      com.tencent.liteav.audio.impl.c.a().a(this.r);
      com.tencent.liteav.audio.impl.c.a().a(this);
      if (com.tencent.liteav.audio.impl.b.b(this.o) != TXEAudioDef.TXE_AUDIO_RECORD_ERR_OK)
        TXCLog.w(h, "start recorder failed, with aec type " + this.o + ", invalid aec player has started!");
      if ((this.v != null) && (this.v.isRecording()))
      {
        TXCLog.e(h, "record has started, can not start again!");
        i1 = TXEAudioDef.TXE_AUDIO_RECORD_ERR_REPEAT_OPTION;
        AppMethodBeat.o(66726);
      }
      else
      {
        if (this.v == null)
          if (this.o != TXEAudioDef.TXE_AEC_TRAE)
            break label202;
        label202: for (this.v = new g(); ; this.v = new TXCAudioSysRecordController())
        {
          if (this.v == null)
            break label216;
          g();
          i1 = this.v.startRecord(this.r);
          AppMethodBeat.o(66726);
          break;
        }
        label216: TXCLog.e(h, "start Record failed! controller is null!");
        i1 = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
        AppMethodBeat.o(66726);
      }
    }
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(66737);
    TXCLog.i(h, "setVolume: ".concat(String.valueOf(paramFloat)));
    this.s = paramFloat;
    if (this.v != null)
      this.v.setVolume(paramFloat);
    AppMethodBeat.o(66737);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(66731);
    TXCLog.i(h, "setSampleRate: ".concat(String.valueOf(paramInt)));
    this.j = paramInt;
    if (this.v != null)
      this.v.setSamplerate(paramInt);
    AppMethodBeat.o(66731);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66738);
    TXCLog.i(h, "setChangerType: " + paramInt1 + " " + paramInt2);
    this.t = paramInt1;
    this.u = paramInt2;
    if (this.v != null)
      this.v.setChangerType(paramInt1, paramInt2);
    AppMethodBeat.o(66738);
  }

  public void a(d paramd)
  {
    AppMethodBeat.i(66730);
    this.i = new WeakReference(paramd);
    if (this.v != null)
      this.v.setListener(paramd);
    AppMethodBeat.o(66730);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(66729);
    this.q = paramBoolean;
    if (this.v != null)
      this.v.setIsCustomRecord(paramBoolean);
    AppMethodBeat.o(66729);
  }

  public void a(boolean paramBoolean, Context paramContext)
  {
    AppMethodBeat.i(66734);
    if (!paramBoolean)
    {
      a(TXEAudioDef.TXE_AEC_NONE, paramContext);
      AppMethodBeat.o(66734);
    }
    while (true)
    {
      return;
      if (com.tencent.liteav.basic.f.b.a().g())
      {
        a(TXEAudioDef.TXE_AEC_SYSTEM, paramContext);
        AppMethodBeat.o(66734);
      }
      else
      {
        com.tencent.liteav.audio.impl.a.a(com.tencent.liteav.basic.f.b.a().b());
        a(TXEAudioDef.TXE_AEC_TRAE, paramContext);
        AppMethodBeat.o(66734);
      }
    }
  }

  public void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66739);
    if (this.v != null)
      this.v.sendCustomPCMData(paramArrayOfByte);
    AppMethodBeat.o(66739);
  }

  public int b()
  {
    AppMethodBeat.i(66727);
    int i1 = TXEAudioDef.TXE_AUDIO_RECORD_ERR_OK;
    if (this.v != null)
    {
      i1 = this.v.stopRecord();
      this.v = null;
    }
    this.i = null;
    this.j = a;
    this.k = b;
    this.l = com.tencent.liteav.basic.a.a.h;
    this.m = d;
    this.n = false;
    this.o = e;
    this.p = false;
    this.q = false;
    this.r = null;
    this.s = 1.0F;
    this.t = -1;
    this.u = -1;
    g();
    com.tencent.liteav.audio.impl.c.a().b(this);
    AppMethodBeat.o(66727);
    return i1;
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(66742);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(66742);
      while (true)
      {
        return;
        if (this.v == null)
          break;
        this.v.setMute(true);
        AppMethodBeat.o(66742);
        continue;
        if (this.v == null)
          break;
        this.v.setMute(true);
        AppMethodBeat.o(66742);
      }
      if (this.v != null)
        this.v.setMute(this.n);
    }
  }

  public void b(boolean paramBoolean)
  {
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(66732);
    TXCLog.i(h, "setChannels: ".concat(String.valueOf(paramInt)));
    this.k = paramInt;
    if (this.v != null)
      this.v.setChannels(paramInt);
    AppMethodBeat.o(66732);
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(66736);
    TXCLog.i(h, "setMute: ".concat(String.valueOf(paramBoolean)));
    this.n = paramBoolean;
    if (this.v != null)
      this.v.setMute(paramBoolean);
    AppMethodBeat.o(66736);
  }

  public boolean c()
  {
    AppMethodBeat.i(66728);
    boolean bool;
    if (this.v != null)
    {
      bool = this.v.isRecording();
      AppMethodBeat.o(66728);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(66728);
    }
  }

  public int d()
  {
    return this.k;
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(66733);
    TXCLog.i(h, "setReverbType: ".concat(String.valueOf(paramInt)));
    this.m = paramInt;
    if (this.v != null)
      this.v.setReverbType(paramInt);
    AppMethodBeat.o(66733);
  }

  public int e()
  {
    return this.j;
  }

  public int f()
  {
    AppMethodBeat.i(66740);
    int i1;
    if (f.a().c())
      if (this.o == TXEAudioDef.TXE_AEC_TRAE)
      {
        TXCLog.e(h, "audio mic has start, but aec type is trae!!" + this.o);
        i1 = TXEAudioDef.TXE_AEC_NONE;
        AppMethodBeat.o(66740);
      }
    while (true)
    {
      return i1;
      i1 = this.o;
      AppMethodBeat.o(66740);
      continue;
      if (TXCTraeJNI.nativeTraeIsRecording())
      {
        if (this.o != TXEAudioDef.TXE_AEC_TRAE)
        {
          TXCLog.e(h, "trae engine has start, but aec type is not trae!!" + this.o);
          i1 = TXEAudioDef.TXE_AEC_TRAE;
          AppMethodBeat.o(66740);
        }
        else
        {
          i1 = this.o;
          AppMethodBeat.o(66740);
        }
      }
      else
      {
        i1 = TXEAudioDef.TXE_AEC_NONE;
        AppMethodBeat.o(66740);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.b
 * JD-Core Version:    0.6.2
 */