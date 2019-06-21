package com.tencent.mm.plugin.story.h;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ep;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryCommentSync;", "Lcom/tencent/mm/autogen/table/BaseStoryCommentSync;", "()V", "fromUser", "", "getFromUser", "()Ljava/lang/String;", "setFromUser", "(Ljava/lang/String;)V", "storyOwner", "getStoryOwner", "setStoryOwner", "addUnreadFlag", "", "checkUnreadFlag", "", "getDBInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "isUnread", "removeUnreadFlag", "Companion", "plugin-story_release"})
public final class c extends ep
{
  private static final com.tencent.mm.sdk.e.c.a ccO;
  public static final c.a sdE;
  public String cEV = "";
  public String rVl = "";

  static
  {
    AppMethodBeat.i(109860);
    sdE = new c.a((byte)0);
    ccO = ep.Hm();
    AppMethodBeat.o(109860);
  }

  public final com.tencent.mm.sdk.e.c.a Ag()
  {
    AppMethodBeat.i(109859);
    com.tencent.mm.sdk.e.c.a locala = ccO;
    j.o(locala, "info");
    AppMethodBeat.o(109859);
    return locala;
  }

  public final void aaG(String paramString)
  {
    AppMethodBeat.i(138841);
    j.p(paramString, "<set-?>");
    this.rVl = paramString;
    AppMethodBeat.o(138841);
  }

  public final void aaS(String paramString)
  {
    AppMethodBeat.i(138840);
    j.p(paramString, "<set-?>");
    this.cEV = paramString;
    AppMethodBeat.o(138840);
  }

  public final void cBE()
  {
    AppMethodBeat.i(138842);
    int i = this.field_commentFlag;
    a.b localb = a.b.sdo;
    this.field_commentFlag = (i & (a.b.cBt() ^ 0xFFFFFFFF));
    AppMethodBeat.o(138842);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.c
 * JD-Core Version:    0.6.2
 */