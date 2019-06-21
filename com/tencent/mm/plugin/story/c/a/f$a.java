package com.tencent.mm.plugin.story.c.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryProcessElementConfig$StoryProcessType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FORWARD", "BACKGROUND", "plugin-story_release"})
public enum f$a
{
  public final int value;

  static
  {
    AppMethodBeat.i(108981);
    a locala1 = new a("FORWARD", 0, 0);
    rRD = locala1;
    a locala2 = new a("BACKGROUND", 1, 1);
    rRE = locala2;
    rRF = new a[] { locala1, locala2 };
    AppMethodBeat.o(108981);
  }

  private f$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.f.a
 * JD-Core Version:    0.6.2
 */