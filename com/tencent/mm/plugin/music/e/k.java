package com.tencent.mm.plugin.music.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends h
{
  static k oLY;
  public a oLX = null;
  private com.tencent.mm.plugin.music.h.a oLZ;

  private k(a parama)
  {
    this.oLX = parama;
  }

  public static void a(a parama)
  {
    try
    {
      AppMethodBeat.i(137534);
      if (oLY != null)
      {
        ab.e("MicroMsg.Music.MusicPlayerManager", "music player mgr is init, don't it again");
        oLY.oLX = parama;
        parama.a(oLY);
        parama.init();
        AppMethodBeat.o(137534);
      }
      while (true)
      {
        return;
        k localk = new com/tencent/mm/plugin/music/e/k;
        localk.<init>(parama);
        oLY = localk;
        parama.a(oLY);
        parama.init();
        AppMethodBeat.o(137534);
      }
    }
    finally
    {
    }
    throw parama;
  }

  public static k bUf()
  {
    AppMethodBeat.i(137535);
    if (oLY == null)
    {
      localObject = new NullPointerException("must init MusicPlayerManager with your impl logic first!!!");
      AppMethodBeat.o(137535);
      throw ((Throwable)localObject);
    }
    if (oLY.oLX == null)
      oLY.oLX = new i();
    Object localObject = oLY;
    AppMethodBeat.o(137535);
    return localObject;
  }

  public static void bUg()
  {
    try
    {
      AppMethodBeat.i(137536);
      if (oLY != null)
        oLY.finish();
      AppMethodBeat.o(137536);
      return;
    }
    finally
    {
    }
  }

  public static com.tencent.mm.plugin.music.h.a bUh()
  {
    AppMethodBeat.i(137546);
    if (bUf().oLZ == null)
      bUf().oLZ = new com.tencent.mm.plugin.music.h.a();
    com.tencent.mm.plugin.music.h.a locala = bUf().oLZ;
    AppMethodBeat.o(137546);
    return locala;
  }

  public final void aic()
  {
    AppMethodBeat.i(137540);
    super.aic();
    AppMethodBeat.o(137540);
  }

  public final e bTQ()
  {
    AppMethodBeat.i(137545);
    e locale = this.oLX.bTQ();
    AppMethodBeat.o(137545);
    return locale;
  }

  public final com.tencent.mm.plugin.music.f.a.d bTS()
  {
    AppMethodBeat.i(137539);
    com.tencent.mm.plugin.music.f.a.d locald = super.bTS();
    AppMethodBeat.o(137539);
    return locald;
  }

  public final void finish()
  {
    AppMethodBeat.i(137542);
    super.finish();
    this.oLX.release();
    this.oLZ = null;
    AppMethodBeat.o(137542);
  }

  public final void ju(boolean paramBoolean)
  {
    AppMethodBeat.i(137543);
    super.ju(paramBoolean);
    AppMethodBeat.o(137543);
  }

  public final void p(e parame)
  {
    AppMethodBeat.i(137537);
    if (parame != null)
      ab.i("MicroMsg.Music.MusicPlayerManager", "MusicType %d", new Object[] { Integer.valueOf(parame.fJS) });
    ab.i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusic");
    t(this.oLX.i(parame));
    AppMethodBeat.o(137537);
  }

  public final void release()
  {
    AppMethodBeat.i(137541);
    ab.i("MicroMsg.Music.MusicPlayerManager", "release");
    super.release();
    AppMethodBeat.o(137541);
  }

  final void t(e parame)
  {
    AppMethodBeat.i(137538);
    com.tencent.mm.plugin.music.h.d.M(parame);
    if (this.oLX.g(parame))
    {
      q(parame);
      AppMethodBeat.o(137538);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.Music.MusicPlayerManager", "prepare is fail, not to play or wait for callback onStart");
      AppMethodBeat.o(137538);
    }
  }

  public final void zI(int paramInt)
  {
    AppMethodBeat.i(137544);
    super.zI(paramInt);
    AppMethodBeat.o(137544);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.e.k
 * JD-Core Version:    0.6.2
 */