package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.b;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$VideoPreloadTaskCallback;", "Lcom/tencent/mm/cdn/keep_TaskInfo$TaskPreloadCallback;", "startTick", "", "(J)V", "onPreloadCompleted", "", "mediaId", "", "sceneResult", "Lcom/tencent/mm/cdn/keep_SceneResult;", "plugin-story_release"})
final class n$d
  implements g.b
{
  private final long eyR;

  public n$d(long paramLong)
  {
    this.eyR = paramLong;
  }

  public final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(110878);
    ab.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + paramString + ", sceneResult:" + paramd);
    if ((paramd != null) && (paramd.field_retCode == -21112))
    {
      ab.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + paramString + ", video source change!");
      paramd = n.sqi;
      n.abe(paramString);
      AppMethodBeat.o(110878);
    }
    while (true)
    {
      return;
      if ((paramString != null) && (paramd != null))
      {
        Object localObject = n.sqi;
        if (n.cCS().containsKey(paramString))
        {
          localObject = n.sqi;
          localObject = (i)n.cCS().get(paramString);
          if (localObject != null)
          {
            if ((paramd.field_recvedBytes > 0) && (paramd.field_fileLength > 0))
            {
              s locals = s.rTV;
              localObject = s.a((i)localObject);
              ((com.tencent.mm.plugin.story.h.n)localObject).field_cacheSize = paramd.field_recvedBytes;
              ((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize = paramd.field_fileLength;
              paramd = j.rST;
              j.a.cxX().b((com.tencent.mm.plugin.story.h.n)localObject);
              paramd = n.sqi;
              n.cCT().add(paramString);
              ab.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted update cacheSize:" + ((com.tencent.mm.plugin.story.h.n)localObject).field_cacheSize + ", totalSize:" + ((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize + ", preloadCost:" + bo.az(this.eyR));
              b.a((a)new n.d.a(paramString));
              AppMethodBeat.o(110878);
              continue;
            }
            ab.e("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted error, recvedBytes:" + paramd.field_recvedBytes + ", fileLength:" + paramd.field_fileLength);
          }
        }
      }
      else
      {
        AppMethodBeat.o(110878);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.n.d
 * JD-Core Version:    0.6.2
 */