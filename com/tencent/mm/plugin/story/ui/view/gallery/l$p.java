package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.k.a;
import com.tencent.mm.plugin.story.g.b;
import com.tencent.mm.plugin.story.model.f.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setDataSeed$1", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher$ChatRoomStateListener;", "updateChatRoomState", "", "hasStory", "", "hasUnread", "updateGalleryUserList", "userList", "", "", "unreadList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "updateUserState", "username", "plugin-story_release"})
public final class l$p
  implements k.a
{
  l$p(d paramd)
  {
  }

  public final void L(boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void a(List<String> paramList, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(110819);
    j.p(paramList, "userList");
    j.p(paramArrayList, "unreadList");
    paramArrayList = l.spJ;
    ab.i(l.access$getTAG$cp(), "updateGalleryUserList: " + paramList.size());
    l.a(this.spK, paramList);
    paramArrayList = b.sbw;
    b.dF(paramList);
    this.spT.destroy();
    AppMethodBeat.o(110819);
  }

  public final void bs(String paramString, boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.p
 * JD-Core Version:    0.6.2
 */