package com.tencent.mm.plugin.story.h;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cw;
import com.tencent.mm.sdk.e.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfo;", "Lcom/tencent/mm/autogen/table/BaseMMStoryHistoryItem;", "()V", "value", "", "date", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "", "storyCount", "getStoryCount", "()I", "setStoryCount", "(I)V", "storyInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "getStoryInfo", "()Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "setStoryInfo", "(Lcom/tencent/mm/plugin/story/storage/StoryInfo;)V", "getDBInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "toString", "Companion", "plugin-story_release"})
public final class h extends cw
{
  private static final String TAG = "MicroMsg.StoryHistoryInfo";
  private static final c.a ccO;
  public static final h.a sdT;
  public j rXz;

  static
  {
    AppMethodBeat.i(109906);
    sdT = new h.a((byte)0);
    TAG = "MicroMsg.StoryHistoryInfo";
    ccO = cw.Hm();
    AppMethodBeat.o(109906);
  }

  public h()
  {
    AppMethodBeat.i(109905);
    this.rXz = new j();
    AppMethodBeat.o(109905);
  }

  public final c.a Ag()
  {
    AppMethodBeat.i(109903);
    c.a locala = ccO;
    a.f.b.j.o(locala, "StoryHistoryInfo.info");
    AppMethodBeat.o(109903);
    return locala;
  }

  public final String cBQ()
  {
    AppMethodBeat.i(109902);
    String str = this.field_date;
    a.f.b.j.o(str, "field_date");
    AppMethodBeat.o(109902);
    return str;
  }

  public final String toString()
  {
    AppMethodBeat.i(109904);
    StringBuilder localStringBuilder = new StringBuilder("StoryHistoryInfo[localId:");
    Object localObject = this.rXz;
    if (localObject != null);
    for (localObject = Integer.valueOf((int)((j)localObject).xDa); ; localObject = null)
    {
      localObject = ((Integer)localObject).intValue() + " date:" + cBQ() + " count:" + this.field_count + ']';
      AppMethodBeat.o(109904);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.h
 * JD-Core Version:    0.6.2
 */