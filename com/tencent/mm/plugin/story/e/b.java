package com.tencent.mm.plugin.story.e;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/data/StoryTimeUtil;", "", "()V", "Companion", "plugin-story_release"})
public final class b
{
  private static final String TAG = "MicroMsg.StoryTimeUtil";
  private static final long rRK = 1000L;
  private static final long rRL = 60000L;
  private static final long rRM = 3600000L;
  private static final long rRN = 86400000L;
  public static final b.a rRO;

  static
  {
    AppMethodBeat.i(108992);
    rRO = new b.a((byte)0);
    TAG = "MicroMsg.StoryTimeUtil";
    rRK = 1000L;
    rRL = rRK * 60L;
    rRM = rRL * 60L;
    rRN = 24L * rRM;
    AppMethodBeat.o(108992);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.e.b
 * JD-Core Version:    0.6.2
 */