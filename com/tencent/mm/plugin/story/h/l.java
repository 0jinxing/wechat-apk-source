package com.tencent.mm.plugin.story.h;

import a.f.a.m;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.es;
import com.tencent.mm.sdk.e.c.a;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryRoomInfo;", "Lcom/tencent/mm/autogen/table/BaseStoryRoomInfo;", "()V", "value", "", "extBuf", "getExtBuf", "()[B", "setExtBuf", "([B)V", "", "", "newStoryList", "getNewStoryList", "()Ljava/util/List;", "setNewStoryList", "(Ljava/util/List;)V", "", "nextSyncTime", "getNextSyncTime", "()J", "setNextSyncTime", "(J)V", "roomName", "getRoomName", "()Ljava/lang/String;", "setRoomName", "(Ljava/lang/String;)V", "getDBInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "Companion", "plugin-story_release"})
public final class l extends es
{
  private static final String TAG = "MicroMsg.StoryExtInfo";
  private static final c.a ccO;
  private static final m<Long, Long, Boolean> sdI;
  public static final a sel;

  static
  {
    AppMethodBeat.i(109970);
    sel = new a((byte)0);
    TAG = "MicroMsg.StoryExtInfo";
    ccO = es.Hm();
    sdI = (m)l.b.sem;
    AppMethodBeat.o(109970);
  }

  public l()
  {
    AppMethodBeat.i(109969);
    j.p("", "value");
    this.field_roomname = "";
    AppMethodBeat.o(109969);
  }

  public final c.a Ag()
  {
    AppMethodBeat.i(109968);
    c.a locala = ccO;
    j.o(locala, "StoryRoomInfo.info");
    AppMethodBeat.o(109968);
    return locala;
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryRoomInfo$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "compareUnsignedLong", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "i", "j", "", "getCompareUnsignedLong", "()Lkotlin/jvm/functions/Function2;", "info", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "kotlin.jvm.PlatformType", "getInfo", "()Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "plugin-story_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.l
 * JD-Core Version:    0.6.2
 */