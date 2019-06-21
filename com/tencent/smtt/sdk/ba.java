package com.tencent.smtt.sdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;

class ba
{
  private DexLoader a;
  private Object b;

  public ba(DexLoader paramDexLoader, Context paramContext)
  {
    AppMethodBeat.i(64533);
    this.a = null;
    this.b = null;
    this.a = paramDexLoader;
    this.b = this.a.newInstance("com.tencent.tbs.player.TbsMediaPlayerProxy", new Class[] { Context.class }, new Object[] { paramContext });
    AppMethodBeat.o(64533);
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(64537);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setVolume", new Class[] { Float.TYPE }, new Object[] { Float.valueOf(paramFloat) });
    AppMethodBeat.o(64537);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(64539);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "subtitle", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(64539);
  }

  public void a(long paramLong)
  {
    AppMethodBeat.i(64543);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "seek", new Class[] { Long.TYPE }, new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(64543);
  }

  public void a(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(64534);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setSurfaceTexture", new Class[] { SurfaceTexture.class }, new Object[] { paramSurfaceTexture });
    AppMethodBeat.o(64534);
  }

  public void a(TbsMediaPlayer.TbsMediaPlayerListener paramTbsMediaPlayerListener)
  {
    AppMethodBeat.i(64535);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setPlayerListener", new Class[] { Object.class }, new Object[] { paramTbsMediaPlayerListener });
    AppMethodBeat.o(64535);
  }

  public void a(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(64538);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "startPlay", new Class[] { String.class, Bundle.class }, new Object[] { paramString, paramBundle });
    AppMethodBeat.o(64538);
  }

  public boolean a()
  {
    if (this.b != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public float b()
  {
    AppMethodBeat.i(64536);
    Float localFloat = (Float)this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "getVolume", new Class[0], new Object[0]);
    float f;
    if (localFloat != null)
    {
      f = localFloat.floatValue();
      AppMethodBeat.o(64536);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(64536);
    }
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(64540);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "audio", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(64540);
  }

  public void c()
  {
    AppMethodBeat.i(64541);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "pause", new Class[0], new Object[0]);
    AppMethodBeat.o(64541);
  }

  public void d()
  {
    AppMethodBeat.i(64542);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "play", new Class[0], new Object[0]);
    AppMethodBeat.o(64542);
  }

  public void e()
  {
    AppMethodBeat.i(64544);
    this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "close", new Class[0], new Object[0]);
    AppMethodBeat.o(64544);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ba
 * JD-Core Version:    0.6.2
 */