package com.tencent.mm.plugin.story.model.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cdv;
import com.tencent.mm.protocal.protobuf.cdw;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "", "commentDetail", "Lcom/tencent/mm/protocal/protobuf/StoryCommentDetail;", "(Lcom/tencent/mm/protocal/protobuf/StoryCommentDetail;)V", "commentOp", "Lcom/tencent/mm/protocal/protobuf/StoryCommentOp;", "(Lcom/tencent/mm/protocal/protobuf/StoryCommentOp;)V", "()V", "color", "", "getColor", "()I", "setColor", "(I)V", "commentId", "getCommentId", "setCommentId", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "createTime", "getCreateTime", "setCreateTime", "fromUser", "getFromUser", "setFromUser", "isBubble", "", "()Z", "setBubble", "(Z)V", "isEnhance", "setEnhance", "isSelf", "setSelf", "isStoryDeprecated", "setStoryDeprecated", "isUnread", "setUnread", "localId", "getLocalId", "setLocalId", "needShake", "getNeedShake", "setNeedShake", "replyCommentId", "getReplyCommentId", "setReplyCommentId", "state", "getState", "setState", "storyId", "", "getStoryId", "()J", "setStoryId", "(J)V", "storyOwner", "getStoryOwner", "setStoryOwner", "thumbUrl", "getThumbUrl", "setThumbUrl", "toUser", "getToUser", "setToUser", "toString", "plugin-story_release"})
public final class a
{
  public String cEV = "";
  private int color = -1;
  public String content = "";
  private String czD = "";
  public int fDG;
  public long rUJ;
  public int rVd;
  public boolean rVh;
  public boolean rVi;
  public boolean rVj;
  public boolean rVk;
  String rVl = "";
  public int rVm;
  public boolean rVn;
  public String toUser = "";

  public a()
  {
  }

  public a(cdv paramcdv)
  {
    this();
    AppMethodBeat.i(109260);
    this.rUJ = paramcdv.vQE;
    this.fDG = paramcdv.pcX;
    this.rVd = paramcdv.wZG;
    String str = paramcdv.ndG;
    Object localObject = str;
    if (str == null)
      localObject = "";
    this.cEV = ((String)localObject);
    str = paramcdv.ncM;
    localObject = str;
    if (str == null)
      localObject = "";
    this.content = ((String)localObject);
    localObject = (CharSequence)paramcdv.ncM;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      bool2 = true;
      this.rVi = bool2;
      if (paramcdv.xdB != 1)
        break label177;
    }
    label177: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.rVk = bool2;
      str = paramcdv.ndF;
      localObject = str;
      if (str == null)
        localObject = "";
      this.toUser = ((String)localObject);
      this.rVm = paramcdv.wZF;
      AppMethodBeat.o(109260);
      return;
      bool2 = false;
      break;
    }
  }

  public a(cdw paramcdw)
  {
    this();
    AppMethodBeat.i(109261);
    this.rUJ = paramcdw.rUJ;
    String str = paramcdw.cEV;
    Object localObject = str;
    if (str == null)
      localObject = "";
    this.cEV = ((String)localObject);
    str = paramcdw.content;
    localObject = str;
    if (str == null)
      localObject = "";
    this.content = ((String)localObject);
    this.fDG = paramcdw.fDG;
    localObject = (CharSequence)paramcdw.content;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0));
    for (boolean bool = true; ; bool = false)
    {
      this.rVi = bool;
      str = paramcdw.toUser;
      localObject = str;
      if (str == null)
        localObject = "";
      this.toUser = ((String)localObject);
      str = paramcdw.rVl;
      localObject = str;
      if (str == null)
        localObject = "";
      this.rVl = ((String)localObject);
      this.rVm = paramcdw.rVm;
      this.rVn = false;
      AppMethodBeat.o(109261);
      return;
    }
  }

  public final void aaG(String paramString)
  {
    AppMethodBeat.i(138750);
    j.p(paramString, "<set-?>");
    this.rVl = paramString;
    AppMethodBeat.o(138750);
  }

  public final String toString()
  {
    AppMethodBeat.i(109259);
    String str = "StoryCommentItem(fromUser='" + this.cEV + "', content='" + this.content + "', createTime=" + this.fDG + ", commentId=" + this.rVd + ", isUnread=" + this.rVh + " )";
    AppMethodBeat.o(109259);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.b.a
 * JD-Core Version:    0.6.2
 */