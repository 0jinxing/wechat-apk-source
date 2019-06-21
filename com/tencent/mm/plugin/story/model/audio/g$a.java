package com.tencent.mm.plugin.story.model.audio;

import a.f.b.j;
import a.l;
import android.net.Uri;
import com.google.android.exoplayer2.c.c;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.h.f.a;
import com.google.android.exoplayer2.h.o;
import com.google.android.exoplayer2.h.q;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.source.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/StoryAudioManager$Companion;", "", "()V", "instance", "Lcom/tencent/mm/plugin/story/model/audio/StoryAudioManager;", "getInstance", "()Lcom/tencent/mm/plugin/story/model/audio/StoryAudioManager;", "createSource", "Lcom/google/android/exoplayer2/source/MediaSource;", "cacheInfo", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "userAgent", "", "plugin-story_release"})
public final class g$a
{
  public static i a(AudioCacheInfo paramAudioCacheInfo, String paramString)
  {
    AppMethodBeat.i(109198);
    j.p(paramAudioCacheInfo, "cacheInfo");
    j.p(paramString, "userAgent");
    if (paramAudioCacheInfo.aIM)
    {
      paramAudioCacheInfo = (i)new g(Uri.parse(paramAudioCacheInfo.cachePath), (f.a)new q(), (h)new c());
      AppMethodBeat.o(109198);
    }
    while (true)
    {
      return paramAudioCacheInfo;
      paramAudioCacheInfo = (i)new g(Uri.parse(paramAudioCacheInfo.musicUrl), (f.a)new o(paramString), (h)new c());
      AppMethodBeat.o(109198);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.g.a
 * JD-Core Version:    0.6.2
 */