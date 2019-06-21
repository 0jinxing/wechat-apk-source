package com.tencent.mm.plugin.story.g;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryBrowseDetailIDKeyStat$State;", "", "s", "", "(Ljava/lang/String;II)V", "getS", "()I", "SHOW", "PLAY", "WAIT", "plugin-story_release"})
public enum b$b
{
  private final int s;

  static
  {
    AppMethodBeat.i(109765);
    b localb1 = new b("SHOW", 0, 1);
    sbD = localb1;
    b localb2 = new b("PLAY", 1, 2);
    sbE = localb2;
    b localb3 = new b("WAIT", 2, 3);
    sbF = localb3;
    sbG = new b[] { localb1, localb2, localb3 };
    AppMethodBeat.o(109765);
  }

  private b$b(int paramInt)
  {
    this.s = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.b.b
 * JD-Core Version:    0.6.2
 */