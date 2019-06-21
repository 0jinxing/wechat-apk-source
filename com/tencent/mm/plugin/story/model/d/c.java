package com.tencent.mm.plugin.story.model.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.o;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/gallery/FavStoryDataSeed;", "Lcom/tencent/mm/plugin/story/api/StoryDataSeed;", "key", "", "dateList", "", "", "username", "(JLjava/util/List;Ljava/lang/String;)V", "getDateList", "()Ljava/util/List;", "getUsername", "()Ljava/lang/String;", "plugin-story_release"})
public final class c extends o
{
  final List<String> rVW;
  public final String username;

  public c(long paramLong, List<String> paramList, String paramString)
  {
    super(paramLong);
    AppMethodBeat.i(109304);
    this.rVW = paramList;
    this.username = paramString;
    AppMethodBeat.o(109304);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.c
 * JD-Core Version:    0.6.2
 */