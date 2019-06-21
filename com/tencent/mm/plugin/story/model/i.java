package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryConstants;", "", "()V", "Companion", "plugin-story_release"})
public final class i
{
  private static String rSr;
  private static final String rSs;
  private static final String rSt;
  private static final String rSu;
  public static final i.a rSv;

  static
  {
    AppMethodBeat.i(109041);
    rSv = new i.a((byte)0);
    StringBuilder localStringBuilder = new StringBuilder();
    e locale = g.RP();
    j.o(locale, "MMKernel.storage()");
    rSr = locale.getAccPath() + "story/";
    rSs = rSr + "temp/";
    rSt = rSr + "mix/";
    rSu = rSr + "audio/";
    AppMethodBeat.o(109041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.i
 * JD-Core Version:    0.6.2
 */