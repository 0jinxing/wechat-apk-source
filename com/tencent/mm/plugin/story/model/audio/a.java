package com.tencent.mm.plugin.story.model.audio;

import a.f.a.m;
import a.f.b.j;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/AudioDownloadTask;", "", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "(Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;)V", "TAG", "", "callbacks", "", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "success", "filePath", "", "kotlin.jvm.PlatformType", "", "getInfo", "()Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "mediaId", "task", "Lcom/tencent/mm/cdn/keep_TaskInfo;", "addCallback", "cb", "cancel", "notifyCallbacks", "start", "plugin-story_release"})
public final class a
{
  final String TAG;
  private final String cHr;
  private final List<m<Boolean, String, y>> callbacks;
  private final g rUk;
  private final AudioCacheInfo rUl;

  public a(AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(109184);
    this.rUl = paramAudioCacheInfo;
    this.TAG = "MicroMsg.AudioDownloadTask";
    this.callbacks = Collections.synchronizedList((List)new ArrayList());
    String str = this.rUl.cachePath + "_temp";
    paramAudioCacheInfo = this.rUl.cachePath;
    com.tencent.mm.plugin.story.model.l locall = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aax(str);
    if (paramAudioCacheInfo != null)
    {
      locall = com.tencent.mm.plugin.story.model.l.rTg;
      com.tencent.mm.plugin.story.model.l.aax(paramAudioCacheInfo);
    }
    this.cHr = ("downaudio_" + this.rUl.rTW);
    this.rUk = new g();
    this.rUk.egn = 60;
    this.rUk.ego = 60;
    this.rUk.field_mediaId = this.cHr;
    this.rUk.egm = this.rUl.musicUrl;
    this.rUk.field_fileType = 40001;
    this.rUk.field_fullpath = str;
    this.rUk.egl = ((g.a)new a.1(this, paramAudioCacheInfo, str));
    AppMethodBeat.o(109184);
  }

  private final void s(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(109183);
    ??? = this.callbacks;
    j.o(???, "callbacks");
    synchronized ((Iterable)???)
    {
      Iterator localIterator = ((Iterable)???).iterator();
      if (localIterator.hasNext())
        ((m)localIterator.next()).m(Boolean.valueOf(paramBoolean), paramString);
    }
    paramString = y.AUy;
    this.callbacks.clear();
    AppMethodBeat.o(109183);
  }

  public final void a(m<? super Boolean, ? super String, y> paramm)
  {
    AppMethodBeat.i(109181);
    if (paramm != null)
      this.callbacks.add(paramm);
    AppMethodBeat.o(109181);
  }

  public final void cancel()
  {
    AppMethodBeat.i(109182);
    ab.i(this.TAG, "cancel " + this.cHr);
    f.afx().rO(this.cHr);
    this.callbacks.clear();
    AppMethodBeat.o(109182);
  }

  public final void start()
  {
    AppMethodBeat.i(109180);
    if (!f.afx().d(this.rUk))
      s(false, null);
    AppMethodBeat.o(109180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.a
 * JD-Core Version:    0.6.2
 */