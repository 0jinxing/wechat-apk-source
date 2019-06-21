package com.tencent.mm.plugin.story.model.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.b.a;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;", "", "()V", "commentList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "getCommentList", "()Ljava/util/LinkedList;", "commentType", "", "getCommentType", "()I", "setCommentType", "(I)V", "commentUser", "", "getCommentUser", "()Ljava/lang/String;", "setCommentUser", "(Ljava/lang/String;)V", "isUnread", "", "()Z", "setUnread", "(Z)V", "storyId", "", "getStoryId", "()J", "setStoryId", "(J)V", "storyOwner", "getStoryOwner", "setStoryOwner", "equals", "other", "toString", "plugin-story_release"})
public final class f
{
  public long rUJ;
  private String rVY;
  public boolean rVh;
  public String rVl;
  int rqw;
  public final LinkedList<a> rrj;

  public f()
  {
    AppMethodBeat.i(109311);
    this.rVl = "";
    this.rrj = new LinkedList();
    AppMethodBeat.o(109311);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(109310);
    boolean bool;
    if (!(paramObject instanceof f))
    {
      AppMethodBeat.o(109310);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((f)this == paramObject)
      {
        AppMethodBeat.o(109310);
        bool = true;
      }
      else if ((this.rUJ == ((f)paramObject).rUJ) && (this.rrj.size() == ((f)paramObject).rrj.size()))
      {
        AppMethodBeat.o(109310);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(109310);
        bool = false;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(109309);
    String str = "StoryGalleryComment(fromUser='" + this.rVl + "', storyId=" + this.rUJ + ", commentType=" + this.rqw + ", commentUser=" + this.rVY + ", isUnread=" + this.rVh + ", commentList=" + this.rrj + ')';
    AppMethodBeat.o(109309);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.f
 * JD-Core Version:    0.6.2
 */