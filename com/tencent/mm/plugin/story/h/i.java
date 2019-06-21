package com.tencent.mm.plugin.story.h;

import a.l;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cw;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfoStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfo;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "getDb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "deleteByDate", "", "date", "", "getStoryHistoryByDate", "isDateExist", "onNotifyChange", "", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "replaceHistoryInfoByDate", "storyHistoryInfo", "set", "info", "Companion", "plugin-story_release"})
public final class i extends com.tencent.mm.sdk.e.j<h>
  implements k.a
{
  private static final String TAG = "MicroMsg.StoryHistoryInfoStorage";
  private static final String[] fnj;
  public static final String sdP = "MMStoryHistoryItem";
  private static final String sdR = "select * from MMStoryHistoryItem ";
  public static final i.a sdU;
  public final e bSd;

  static
  {
    AppMethodBeat.i(109912);
    sdU = new i.a((byte)0);
    TAG = "MicroMsg.StoryHistoryInfoStorage";
    sdP = "MMStoryHistoryItem";
    h.a locala = h.sdT;
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(h.cBF(), sdP) };
    sdR = "select * from " + sdP + ' ';
    AppMethodBeat.o(109912);
  }

  public i(e parame)
  {
    super(parame, h.cBF(), sdP, cw.diI);
    AppMethodBeat.i(109911);
    this.bSd = parame;
    AppMethodBeat.o(109911);
  }

  private boolean aaY(String paramString)
  {
    AppMethodBeat.i(109908);
    a.f.b.j.p(paramString, "date");
    paramString = sdR + " WHERE " + sdP + ".date = '" + paramString + '\'';
    paramString = this.bSd.rawQuery(paramString, null);
    a.f.b.j.o(paramString, "cu");
    int i = paramString.getCount();
    paramString.close();
    boolean bool;
    if (i > 0)
    {
      bool = true;
      AppMethodBeat.o(109908);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109908);
    }
  }

  private boolean b(h paramh)
  {
    AppMethodBeat.i(109910);
    a.f.b.j.p(paramh, "info");
    boolean bool = super.a((c)paramh);
    AppMethodBeat.o(109910);
    return bool;
  }

  public final void a(String paramString, m paramm)
  {
  }

  public final boolean a(h paramh)
  {
    AppMethodBeat.i(109907);
    a.f.b.j.p(paramh, "storyHistoryInfo");
    boolean bool;
    if (aaY(paramh.cBQ()))
    {
      bool = c((c)paramh, new String[] { "date" });
      AppMethodBeat.o(109907);
    }
    while (true)
    {
      return bool;
      bool = b(paramh);
      AppMethodBeat.o(109907);
    }
  }

  public final h aaZ(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(109909);
    a.f.b.j.p(paramString, "date");
    paramString = sdR + " WHERE " + sdP + ".date = '" + paramString + '\'';
    Cursor localCursor = this.bSd.rawQuery(paramString, null);
    if (localCursor.moveToFirst())
    {
      paramString = new h();
      paramString.d(localCursor);
      localCursor.close();
      AppMethodBeat.o(109909);
    }
    while (true)
    {
      return paramString;
      localCursor.close();
      AppMethodBeat.o(109909);
      paramString = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.i
 * JD-Core Version:    0.6.2
 */