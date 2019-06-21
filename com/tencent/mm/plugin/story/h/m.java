package com.tencent.mm.plugin.story.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.es;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryRoomInfoStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/plugin/story/storage/StoryRoomInfo;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "Lcom/tencent/mm/plugin/story/storage/IStoryStorage;", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "getDb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "droptable", "", "dumpinfo", "", "get", "roomName", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "set", "", "info", "Companion", "plugin-story_release"})
public final class m extends com.tencent.mm.sdk.e.j<l>
  implements k.a
{
  private static final String TAG = "MicroMsg.StoryRoomInfoStorage";
  private static final String[] fnj;
  private static final String sdP = "StoryRoomInfo";
  private static final String sdR = "select * from StoryRoomInfo";
  public static final m.a sen;
  private final e bSd;

  static
  {
    AppMethodBeat.i(109974);
    sen = new m.a((byte)0);
    TAG = "MicroMsg.StoryRoomInfoStorage";
    sdP = "StoryRoomInfo";
    l.a locala = l.sel;
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(l.cBF(), sdP) };
    sdR = "select * from " + sdP;
    AppMethodBeat.o(109974);
  }

  public m(e parame)
  {
    super(parame, l.cBF(), sdP, es.diI);
    AppMethodBeat.i(109973);
    this.bSd = parame;
    AppMethodBeat.o(109973);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
  }

  public final l abc(String paramString)
  {
    AppMethodBeat.i(109971);
    a.f.b.j.p(paramString, "roomName");
    l locall = new l();
    locall.field_roomname = paramString;
    super.b((c)locall, new String[0]);
    AppMethodBeat.o(109971);
    return locall;
  }

  public final void cqH()
  {
    AppMethodBeat.i(109972);
    int i = this.bSd.delete(sdP, null, null);
    ab.i(TAG, "dropTable ".concat(String.valueOf(i)));
    AppMethodBeat.o(109972);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.m
 * JD-Core Version:    0.6.2
 */