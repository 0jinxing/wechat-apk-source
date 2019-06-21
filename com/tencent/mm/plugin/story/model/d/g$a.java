package com.tencent.mm.plugin.story.model.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.model.q;
import com.tencent.mm.plugin.story.model.q.a;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem$Companion;", "", "()V", "createStoryGalleryItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "extInfo", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfo;", "story", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "storyItemScene", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;", "createStoryGalleryItemForSns", "plugin-story_release"})
public final class g$a
{
  public static g a(f paramf)
  {
    AppMethodBeat.i(109313);
    a.f.b.j.p(paramf, "extInfo");
    com.tencent.mm.plugin.story.h.j localj = new com.tencent.mm.plugin.story.h.j();
    localj.field_storyID = paramf.field_syncId;
    localj.field_createTime = paramf.field_storyPostTime;
    localj.field_userName = paramf.getUserName();
    Object localObject1 = q.rTk;
    localObject1 = q.a.cyq();
    ((cfb)localObject1).jBB = paramf.getUserName();
    ((cfb)localObject1).pcX = paramf.field_storyPostTime;
    Object localObject2 = q.rTk;
    localObject2 = new cek();
    ((cek)localObject2).Id = ("empty_" + cb.aaE());
    ((cek)localObject2).wEH = paramf.cBK();
    ((cek)localObject2).Url = paramf.cBJ();
    if (paramf.field_duration > 0L);
    for (float f = (float)(paramf.field_duration / 1000.0D); ; f = 0.0F)
    {
      ((cek)localObject2).duration = f;
      ((cfb)localObject1).xeA.wbK.add(localObject2);
      localj.c((cfb)localObject1);
      paramf = new g(localj, (cfb)localObject1);
      AppMethodBeat.o(109313);
      return paramf;
    }
  }

  public static g a(com.tencent.mm.plugin.story.h.j paramj, h paramh)
  {
    AppMethodBeat.i(138770);
    a.f.b.j.p(paramj, "story");
    a.f.b.j.p(paramh, "storyItemScene");
    paramj = new g(paramj, paramj.cBR(), paramh);
    AppMethodBeat.o(138770);
    return paramj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.g.a
 * JD-Core Version:    0.6.2
 */