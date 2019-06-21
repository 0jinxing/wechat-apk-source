package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.h.g;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$VideoTaskCallTask;", "Lcom/tencent/mm/cdn/keep_TaskInfo$TaskCallback;", "()V", "callback", "", "mediaId", "", "startRet", "progressInfo", "Lcom/tencent/mm/cdn/keep_ProgressInfo;", "sceneResult", "Lcom/tencent/mm/cdn/keep_SceneResult;", "onlyCheckExist", "", "decodePrepareResponse", "", "inbuf", "getCdnAuthInfo", "", "buff", "Ljava/io/ByteArrayOutputStream;", "plugin-story_release"})
final class n$e
  implements g.a
{
  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(110879);
    if ((paramd != null) && (paramd.field_retCode == -21112))
    {
      ab.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreload, mediaId:" + paramString + ", video source change!");
      paramc = n.sqi;
      n.abe(paramString);
      AppMethodBeat.o(110879);
      return 0;
    }
    Object localObject1;
    int j;
    if ((paramc != null) && (paramc.field_toltalLength > 0))
    {
      paramd = n.sqi;
      localObject1 = (i)n.cCS().get(paramString);
      paramd = n.sqi;
      paramBoolean = a.a.j.a((Iterable)n.cCT(), paramString);
      int i = (int)(paramc.field_finishedLength / paramc.field_toltalLength * 100.0F);
      paramd = n.sqi;
      paramd = (Integer)n.cCU().get(paramString);
      if (paramd == null)
        break label564;
      j = paramd.intValue();
      label167: paramd = hashCode() + " onPreload, mediaId:" + paramString + ", startRet:" + paramInt + ", preloadOffset:" + paramc.field_finishedLength + ", totalLength: " + paramc.field_toltalLength + " desiredPreloadPercent:" + j + ", preloadPercent:" + i + " isFinish:" + paramBoolean;
      paramInt = 0;
      if ((j <= 0) || (i < j))
        break label573;
      paramd = paramd + " exceed:true ";
      paramInt = 1;
    }
    label564: label573: 
    while (true)
    {
      if (localObject1 != null)
      {
        Object localObject2 = s.rTV;
        localObject2 = s.a((i)localObject1);
        ((com.tencent.mm.plugin.story.h.n)localObject2).field_cacheSize = paramc.field_finishedLength;
        ((com.tencent.mm.plugin.story.h.n)localObject2).field_totalSize = paramc.field_toltalLength;
        paramc = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxX().b((com.tencent.mm.plugin.story.h.n)localObject2);
        paramc = com.tencent.mm.plugin.story.model.j.rST;
        f localf = j.a.cxU().aap(((i)localObject1).username);
        paramc = paramd;
        if (localf.field_syncId == ((i)localObject1).rUJ)
        {
          paramc = paramd;
          if (localf.isValid())
          {
            long l = ((i)localObject1).rUJ;
            localObject1 = ((i)localObject1).rWj.Id;
            a.f.b.j.o(localObject1, "videoItem.media.Id");
            paramc = paramd;
            if (localf.b(l, (String)localObject1, ((com.tencent.mm.plugin.story.h.n)localObject2).field_cacheSize))
            {
              paramc = paramd + " * ext pre update * ";
              paramd = com.tencent.mm.plugin.story.model.j.rST;
              j.a.cxU().a((int)localf.xDa, localf);
            }
          }
        }
        if ((paramInt != 0) && (paramString != null))
        {
          paramd = n.sqi;
          n.cCT().add(paramString);
        }
        paramd = paramc + "update cacheSize done";
      }
      while (true)
      {
        paramString = new StringBuilder().append(paramd).append(", currentSpeed:");
        paramc = n.sqi;
        ab.i("MicroMsg.StoryVideoPreloadMgr", n.cCR());
        AppMethodBeat.o(110879);
        break;
        j = 0;
        break label167;
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.n.e
 * JD-Core Version:    0.6.2
 */