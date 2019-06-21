package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.a;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryLogic$StoryServer;", "", "()V", "timelineRespCount", "", "userRespCounts", "", "", "getHistoryResCount", "userName", "getResPCount", "getUserPageResCount", "plugin-story_release"})
public final class o$a
{
  public int qMA;
  private Map<String, Integer> qMz;

  public o$a()
  {
    AppMethodBeat.i(109134);
    this.qMz = ((Map)new HashMap());
    AppMethodBeat.o(109134);
  }

  public static int aaC(String paramString)
  {
    AppMethodBeat.i(109133);
    j.p(paramString, "userName");
    paramString = a.sdm;
    int i = a.cAS();
    AppMethodBeat.o(109133);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.o.a
 * JD-Core Version:    0.6.2
 */