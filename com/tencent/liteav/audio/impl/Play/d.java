package com.tencent.liteav.audio.impl.Play;

import android.content.Context;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class d
{
  static d a;
  private static final String b;
  private d.a c;
  private boolean d = false;
  private volatile boolean e = false;
  private Context f = null;
  private int g = TXEAudioDef.TXE_AUDIO_MODE_SPEAKER;
  private volatile boolean h = false;
  private int i = com.tencent.liteav.basic.a.a.e;
  private int j = com.tencent.liteav.basic.a.a.g;
  private int k = com.tencent.liteav.basic.a.a.h;

  static
  {
    AppMethodBeat.i(66627);
    b = "AudioCenter:" + d.class.getSimpleName();
    a = new d();
    AppMethodBeat.o(66627);
  }

  public static d a()
  {
    return a;
  }

  public void a(Context paramContext, int paramInt)
  {
    try
    {
      AppMethodBeat.i(66626);
      this.f = paramContext;
      this.g = paramInt;
      if (this.h)
        com.tencent.liteav.audio.impl.a.a().a(paramInt);
      AppMethodBeat.o(66626);
      return;
    }
    finally
    {
    }
    throw paramContext;
  }

  public void b()
  {
    AppMethodBeat.i(66624);
    TXCLog.w(b, "mult-track-player start!");
    if (this.e)
    {
      TXCLog.e(b, "mult-track-player can not start because of has started!");
      AppMethodBeat.o(66624);
    }
    while (true)
    {
      return;
      if ((this.i == 0) || (this.j == 0))
      {
        TXCLog.e(b, "strat mult-track-player failed with invalid audio info , samplerate:" + this.i + ", channels:" + this.j);
        AppMethodBeat.o(66624);
      }
      else
      {
        this.e = true;
        if (this.c == null)
        {
          this.c = new d.1(this, "AUDIO_TRACK");
          this.c.start();
        }
        TXCLog.w(b, "mult-track-player thread start finish!");
        AppMethodBeat.o(66624);
      }
    }
  }

  public void c()
  {
    AppMethodBeat.i(66625);
    TXCLog.w(b, "mult-track-player stop!");
    if (!this.e)
    {
      TXCLog.w(b, "mult-track-player can not stop because of not started yet!");
      AppMethodBeat.o(66625);
    }
    while (true)
    {
      return;
      if (this.c != null)
      {
        this.c.b();
        this.c = null;
      }
      this.g = TXEAudioDef.TXE_AUDIO_MODE_SPEAKER;
      this.f = null;
      this.h = false;
      this.e = false;
      TXCLog.w(b, "mult-track-player stop finish!");
      AppMethodBeat.o(66625);
    }
  }

  public boolean d()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Play.d
 * JD-Core Version:    0.6.2
 */