package com.tencent.mm.plugin.story.model.audio;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/StoryAudioManager;", "", "()V", "TAG", "", "audioTaskMap", "", "", "kotlin.jvm.PlatformType", "Lcom/tencent/mm/plugin/story/model/audio/AudioDownloadTask;", "", "cacheAudio", "", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "callback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "success", "filePath", "cancelAll", "cancelCache", "Companion", "plugin-story_release"})
public final class g
{
  private static final g rUF;
  public static final g.a rUG;
  private final String TAG;
  private final Map<Integer, a> rUE;

  static
  {
    AppMethodBeat.i(109204);
    rUG = new g.a((byte)0);
    rUF = new g();
    AppMethodBeat.o(109204);
  }

  public g()
  {
    AppMethodBeat.i(109203);
    this.TAG = "MicroMsg.StoryAudioManager";
    this.rUE = Collections.synchronizedMap((Map)new HashMap());
    AppMethodBeat.o(109203);
  }

  public final void a(AudioCacheInfo paramAudioCacheInfo, m<? super Boolean, ? super String, y> paramm)
  {
    AppMethodBeat.i(109200);
    j.p(paramAudioCacheInfo, "info");
    ab.i(this.TAG, "cache audio " + paramAudioCacheInfo.rTW);
    a locala = (a)this.rUE.get(Integer.valueOf(paramAudioCacheInfo.rTW));
    if (locala == null)
      if (!e.ct(paramAudioCacheInfo.cachePath))
      {
        locala = new a(paramAudioCacheInfo);
        locala.a((m)new g.b(this, paramAudioCacheInfo, paramm));
        locala.start();
        paramm = this.rUE;
        j.o(paramm, "audioTaskMap");
        paramm.put(Integer.valueOf(paramAudioCacheInfo.rTW), locala);
        AppMethodBeat.o(109200);
      }
    while (true)
    {
      return;
      paramm.m(Boolean.TRUE, paramAudioCacheInfo.cachePath);
      AppMethodBeat.o(109200);
      continue;
      locala.a(paramm);
      AppMethodBeat.o(109200);
    }
  }

  public final void cancelAll()
  {
    AppMethodBeat.i(109202);
    synchronized ((Iterable)this.rUE.values())
    {
      Iterator localIterator = ???.iterator();
      if (localIterator.hasNext())
        ((a)localIterator.next()).cancel();
    }
    y localy = y.AUy;
    this.rUE.clear();
    AppMethodBeat.o(109202);
  }

  public final void cancelCache(AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(109201);
    if (paramAudioCacheInfo != null)
    {
      paramAudioCacheInfo = (a)this.rUE.remove(Integer.valueOf(paramAudioCacheInfo.rTW));
      if (paramAudioCacheInfo != null)
      {
        paramAudioCacheInfo.cancel();
        AppMethodBeat.o(109201);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109201);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.g
 * JD-Core Version:    0.6.2
 */