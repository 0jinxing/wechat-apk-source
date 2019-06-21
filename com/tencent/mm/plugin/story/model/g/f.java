package com.tencent.mm.plugin.story.model.g;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/upload/UploadUtil;", "", "()V", "markStoryError", "", "storyInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "errType", "", "errMsg", "", "block", "Lkotlin/Function0;", "plugin-story_release"})
public final class f
{
  public static final f rXY;

  static
  {
    AppMethodBeat.i(109484);
    rXY = new f();
    AppMethodBeat.o(109484);
  }

  public static void a(com.tencent.mm.plugin.story.h.j paramj, int paramInt, String paramString, a.f.a.a<y> parama)
  {
    AppMethodBeat.i(109483);
    a.f.b.j.p(paramj, "storyInfo");
    a.f.b.j.p(paramString, "errMsg");
    a.f.b.j.p(parama, "block");
    ab.i("MicroMsg.StoryPostTask", "processError localId " + (int)paramj.xDa + " processError " + paramInt + " errMsg: " + paramString);
    ab.d("MicroMsg.StoryPostTask", "post error ".concat(String.valueOf(paramInt)));
    paramj.cqY();
    paramString = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxT().a((int)paramj.xDa, paramj);
    paramj = com.tencent.mm.plugin.story.h.a.sdm;
    if (paramInt == com.tencent.mm.plugin.story.h.a.cBd())
      ab.e("MicroMsg.StoryPostTask", "upload find timeLine is null delete this item");
    while (true)
    {
      parama.invoke();
      AppMethodBeat.o(109483);
      return;
      paramj = com.tencent.mm.plugin.story.h.a.sdm;
      if (paramInt == com.tencent.mm.plugin.story.h.a.cBe())
      {
        ab.e("MicroMsg.StoryPostTask", "parser protobuf error");
      }
      else
      {
        paramj = com.tencent.mm.plugin.story.h.a.sdm;
        if (paramInt == com.tencent.mm.plugin.story.h.a.cBf())
        {
          ab.e("MicroMsg.StoryPostTask", "local id is not in db");
        }
        else
        {
          paramj = com.tencent.mm.plugin.story.h.a.sdm;
          if (paramInt == com.tencent.mm.plugin.story.h.a.cBg())
          {
            ab.e("MicroMsg.StoryPostTask", "arg is error");
          }
          else
          {
            paramj = com.tencent.mm.plugin.story.h.a.sdm;
            if (paramInt == com.tencent.mm.plugin.story.h.a.cBh())
            {
              ab.e("MicroMsg.StoryPostTask", "pullTimeLineXml  error");
            }
            else
            {
              paramj = com.tencent.mm.plugin.story.h.a.sdm;
              if (paramInt == com.tencent.mm.plugin.story.h.a.cBi())
                ab.e("MicroMsg.StoryPostTask", "errtle  error");
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.g.f
 * JD-Core Version:    0.6.2
 */