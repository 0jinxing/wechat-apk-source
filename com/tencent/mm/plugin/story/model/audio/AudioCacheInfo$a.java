package com.tencent.mm.plugin.story.model.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.ui.view.editor.item.d;
import com.tencent.mm.protocal.protobuf.bql;
import com.tencent.mm.protocal.protobuf.bqm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "SOURCE_TYPE_NORMAL", "", "getSOURCE_TYPE_NORMAL", "()I", "SOURCE_TYPE_SEARCH", "getSOURCE_TYPE_SEARCH", "TAG", "", "getTAG", "()Ljava/lang/String;", "VIEW_TYPE_LOADING", "getVIEW_TYPE_LOADING", "VIEW_TYPE_NORMAL", "getVIEW_TYPE_NORMAL", "VIEW_TYPE_SEARCH_ENTRANCE", "getVIEW_TYPE_SEARCH_ENTRANCE", "VIEW_TYPE_SEARCH_LOADING", "getVIEW_TYPE_SEARCH_LOADING", "VIEW_TYPE_SEARCH_RESULT", "getVIEW_TYPE_SEARCH_RESULT", "createFromMusicInfo", "info", "Lcom/tencent/mm/protocal/protobuf/RecommendedMusicInfo;", "type", "createLoadingInfo", "createSearchEntranceInfo", "createSearchLoadingInfo", "plugin-story_release"})
public final class AudioCacheInfo$a
{
  public static AudioCacheInfo a(bql parambql, int paramInt)
  {
    AppMethodBeat.i(109172);
    a.f.b.j.p(parambql, "info");
    AudioCacheInfo localAudioCacheInfo = new AudioCacheInfo();
    localAudioCacheInfo.rTW = parambql.wSJ;
    localAudioCacheInfo.musicUrl = parambql.wSP;
    Object localObject1 = new ArrayList();
    Object localObject2 = parambql.wST;
    a.f.b.j.o(localObject2, "info.lyrics");
    localObject2 = ((Iterable)localObject2).iterator();
    for (int i = 0; ((Iterator)localObject2).hasNext(); i++)
    {
      Object localObject3 = ((Iterator)localObject2).next();
      if (i < 0)
        a.a.j.dWs();
      localObject3 = (bqm)localObject3;
      Object localObject4 = AudioCacheInfo.rUj;
      localObject4 = ((bqm)localObject3).wSV;
      a.f.b.j.o(localObject4, "it.lyrics_content");
      localObject4 = new d((String)localObject4, ((bqm)localObject3).wSU, ((bqm)localObject3).wSU);
      if ((i > 0) && (i < parambql.wST.size()))
        ((d)((ArrayList)localObject1).get(i - 1)).snc = ((bqm)localObject3).wSU;
      ((ArrayList)localObject1).add(localObject4);
    }
    localAudioCacheInfo.rTY.addAll((Collection)parambql.wSS);
    localAudioCacheInfo.rTX = ((ArrayList)localObject1);
    localObject1 = com.tencent.mm.plugin.story.model.l.aaw(parambql.wSJ + '_' + cb.aaE());
    localAudioCacheInfo.cachePath = ((String)localObject1);
    if (e.asZ((String)localObject1) > 0L);
    for (boolean bool = true; ; bool = false)
    {
      localAudioCacheInfo.aIM = bool;
      localAudioCacheInfo.rTZ = false;
      parambql = parambql.wSR;
      a.f.b.j.o(parambql, "info.song_name");
      a.f.b.j.p(parambql, "<set-?>");
      localAudioCacheInfo.rUa = parambql;
      localAudioCacheInfo.type = paramInt;
      ab.i(AudioCacheInfo.access$getTAG$cp(), "LogStory: " + localAudioCacheInfo.rTW + ' ' + localAudioCacheInfo.rTX);
      AppMethodBeat.o(109172);
      return localAudioCacheInfo;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.AudioCacheInfo.a
 * JD-Core Version:    0.6.2
 */