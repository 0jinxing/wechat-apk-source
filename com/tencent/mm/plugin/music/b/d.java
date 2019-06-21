package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.d.a;
import com.tencent.mm.audio.mix.e.g;
import com.tencent.mm.audio.mix.jni.SilkResampleJni;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d
{
  private static d oJt = null;

  private d()
  {
    AppMethodBeat.i(137262);
    f.bSz();
    AppMethodBeat.o(137262);
  }

  public static void init()
  {
    try
    {
      AppMethodBeat.i(137263);
      if (oJt != null)
        AppMethodBeat.o(137263);
      while (true)
      {
        return;
        ab.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
        d locald = new com/tencent/mm/plugin/music/b/d;
        locald.<init>();
        oJt = locald;
        AppMethodBeat.o(137263);
      }
    }
    finally
    {
    }
  }

  public static void release()
  {
    try
    {
      AppMethodBeat.i(137264);
      ab.i("MicroMsg.Audio.AudioPlayerCoreService", "release");
      f localf = f.bSA();
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "release, clear all cache");
      localf.bSB();
      localf.bSK();
      Object localObject2 = localf.oJP;
      ((com.tencent.mm.audio.mix.f.c)localObject2).cnp.Du();
      localObject2 = ((com.tencent.mm.audio.mix.f.c)localObject2).cno;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "stopAll");
      ((com.tencent.mm.audio.mix.f.d)localObject2).cnB.DT();
      ((com.tencent.mm.audio.mix.f.d)localObject2).Ep();
      ((com.tencent.mm.audio.mix.f.d)localObject2).El();
      localObject2 = localf.oJP;
      Object localObject3 = ((com.tencent.mm.audio.mix.f.c)localObject2).cnp;
      ((a)localObject3).Du();
      ((a)localObject3).clearCache();
      ((a)localObject3).clB = null;
      Object localObject4 = ((com.tencent.mm.audio.mix.f.c)localObject2).cno;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "release");
      ((com.tencent.mm.audio.mix.f.d)localObject4).cnu.set(false);
      ((com.tencent.mm.audio.mix.f.d)localObject4).Ep();
      ((com.tencent.mm.audio.mix.f.d)localObject4).El();
      localObject3 = ((com.tencent.mm.audio.mix.f.d)localObject4).cnB;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "onRelease");
      ((com.tencent.mm.audio.mix.e.c)localObject3).Eb();
      ((com.tencent.mm.audio.mix.e.c)localObject3).clearCache();
      ((com.tencent.mm.audio.mix.f.d)localObject4).cnp = null;
      ((com.tencent.mm.audio.mix.f.d)localObject4).clearCache();
      SilkResampleJni.clearResampleAll();
      g.Eg();
      ((com.tencent.mm.audio.mix.f.c)localObject2).clearCache();
      localObject3 = localf.oJP;
      localObject2 = ((com.tencent.mm.audio.mix.f.c)localObject3).appId;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmDataTrackTaskController", "cleanAllCache appId:%s", new Object[] { localObject2 });
      localObject4 = new com/tencent/mm/audio/mix/b/a/b;
      ((com.tencent.mm.audio.mix.b.a.b)localObject4).<init>((String)localObject2);
      com.tencent.mm.audio.mix.b.a.d.a((com.tencent.mm.audio.mix.b.a.f)localObject4, "AudioPcmDataTrackCleanTask");
      ((com.tencent.mm.audio.mix.f.c)localObject3).cnq.clear();
      localf.oJP.a(null);
      localf.oJP.a(null);
      oJt = null;
      AppMethodBeat.o(137264);
      return;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.d
 * JD-Core Version:    0.6.2
 */