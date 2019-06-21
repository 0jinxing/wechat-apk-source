package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo.a;
import com.tencent.mm.plugin.story.ui.a.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$initAudioSearchPanel$1", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$AudioSearchCallback;", "onPauseAudio", "", "onSearchAudioCancel", "onSearchAudioFinish", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "onSearchAudioSelected", "plugin-story_release"})
public final class EditorAudioView$b
  implements EditorAudioSearchView.a
{
  public final void b(AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(110514);
    if (paramAudioCacheInfo != null)
    {
      Object localObject = new ArrayList();
      AudioCacheInfo.a locala = AudioCacheInfo.rUj;
      paramAudioCacheInfo.type = AudioCacheInfo.cyJ();
      locala = AudioCacheInfo.rUj;
      paramAudioCacheInfo.cvd = AudioCacheInfo.cyP();
      ((ArrayList)localObject).add(paramAudioCacheInfo);
      paramAudioCacheInfo = EditorAudioView.c(this.sli);
      localObject = (List)localObject;
      j.p(localObject, "audios");
      paramAudioCacheInfo.sfu.addAll(0, (Collection)localObject);
      paramAudioCacheInfo.notifyDataSetChanged();
      EditorAudioView.d(this.sli).smoothScrollToPosition(0);
      this.sli.Fj(0);
      EditorAudioView.b(this.sli, false);
      EditorAudioView.c(this.sli, true);
      EditorAudioView.d(this.sli, true);
    }
    AppMethodBeat.o(110514);
  }

  public final void c(AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(110515);
    if (paramAudioCacheInfo != null)
    {
      int i = paramAudioCacheInfo.type;
      Object localObject = AudioCacheInfo.rUj;
      if (i != AudioCacheInfo.cyL())
        break label58;
      localObject = this.sli.getCallback();
      if (localObject == null)
        break label58;
      ((EditorAudioView.a)localObject).d(paramAudioCacheInfo);
      AppMethodBeat.o(110515);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110515);
      continue;
      label58: AppMethodBeat.o(110515);
    }
  }

  public final void cCv()
  {
    AppMethodBeat.i(110513);
    EditorAudioView.a locala = this.sli.getCallback();
    if (locala != null)
    {
      locala.pauseAudio();
      AppMethodBeat.o(110513);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110513);
    }
  }

  public final void cCw()
  {
    AppMethodBeat.i(110516);
    EditorAudioView.c(this.sli, true);
    EditorAudioView.b(this.sli, false);
    AppMethodBeat.o(110516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioView.b
 * JD-Core Version:    0.6.2
 */