package com.tencent.mm.plugin.story.model.d;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.api.o;
import com.tencent.mm.plugin.story.api.o.a;
import com.tencent.mm.plugin.story.api.o.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/gallery/StoryDataSeedFactory;", "Lcom/tencent/mm/plugin/story/api/StoryDataSeed$IFactory;", "()V", "createAllFriendDataSeed", "", "userList", "", "", "filterList", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createFavDataSeed", "dateList", "username", "genKey", "plugin-story_release"})
public final class d
  implements o.b
{
  public static final d rVX;

  static
  {
    AppMethodBeat.i(109307);
    rVX = new d();
    AppMethodBeat.o(109307);
  }

  public final long c(List<String> paramList, Map<String, ? extends ArrayList<Long>> paramMap)
  {
    AppMethodBeat.i(138769);
    j.p(paramList, "userList");
    j.p(paramMap, "filterList");
    paramList = new a(cb.aaE(), paramList, paramMap);
    o.a.cxg().a(paramList.key, (o)paramList);
    long l = paramList.key;
    AppMethodBeat.o(138769);
    return l;
  }

  public final long i(List<String> paramList, String paramString)
  {
    AppMethodBeat.i(109306);
    j.p(paramList, "dateList");
    j.p(paramString, "username");
    paramList = new c(cb.aaE(), paramList, paramString);
    o.a.cxg().a(paramList.key, (o)paramList);
    long l = paramList.key;
    AppMethodBeat.o(109306);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.d
 * JD-Core Version:    0.6.2
 */