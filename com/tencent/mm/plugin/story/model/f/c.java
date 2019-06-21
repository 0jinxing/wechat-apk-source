package com.tencent.mm.plugin.story.model.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/sync/StoryCommentReply;", "", "storyOwner", "", "storyIds", "Ljava/util/HashMap;", "", "", "(Ljava/lang/String;Ljava/util/HashMap;)V", "getStoryIds", "()Ljava/util/HashMap;", "getStoryOwner", "()Ljava/lang/String;", "toString", "plugin-story_release"})
public final class c
{
  private final String rVl;
  final HashMap<Long, Integer> rXi;

  private c(String paramString, HashMap<Long, Integer> paramHashMap)
  {
    AppMethodBeat.i(138795);
    this.rVl = paramString;
    this.rXi = paramHashMap;
    AppMethodBeat.o(138795);
  }

  public final String toString()
  {
    AppMethodBeat.i(138794);
    String str = "StoryCommentReply[" + this.rVl + " : " + this.rXi + ']';
    AppMethodBeat.o(138794);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.c
 * JD-Core Version:    0.6.2
 */