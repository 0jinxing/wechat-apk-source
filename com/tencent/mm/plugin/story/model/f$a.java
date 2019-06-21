package com.tencent.mm.plugin.story.model;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.h.g;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryAvatarLogic$Companion;", "", "()V", "AVATAR_FLAG_DEFAULT", "", "AVATAR_FLAG_READ", "AVATAR_FLAG_UNREAD", "isStoryUnread", "", "userName", "", "updateStoryStatus", "", "storyId", "", "plugin-story_release"})
public final class f$a
{
  public static boolean isStoryUnread(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(109022);
    if (paramString == null)
      AppMethodBeat.o(109022);
    while (true)
    {
      return bool;
      if (!n.isShowStoryCheck())
      {
        AppMethodBeat.o(109022);
      }
      else
      {
        j.a locala = j.rST;
        paramString = j.a.cxU().aap(paramString);
        if ((paramString.isValid()) && (paramString.cBN()))
        {
          bool = true;
          AppMethodBeat.o(109022);
        }
        else
        {
          AppMethodBeat.o(109022);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.a
 * JD-Core Version:    0.6.2
 */