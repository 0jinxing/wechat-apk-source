package com.tencent.mm.plugin.story.h;

import a.l;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ep;
import com.tencent.mm.sdk.e.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryCommentStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/autogen/table/BaseStoryCommentSync;", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "CON_UNREAD", "", "commentFlagSet", "Ljava/util/ArrayList;", "", "getDb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "buildLimitString", "data", "", "col", "reverse", "", "getAllData", "Lcom/tencent/mm/plugin/story/storage/StoryCommentSync;", "getAllUnreadSync", "getByStoryId", "storyId", "", "getORIntRange", "Companion", "plugin-story_release"})
public final class b extends com.tencent.mm.sdk.e.j<ep>
{
  private static final String TAG = "MicroMsg.StoryCommentStorage";
  private static final String[] fnj;
  public static final String sdC = "select * from StoryCommentSync";
  public static final b.a sdD;
  public final e bSd;
  private final ArrayList<Integer> sdA;
  public String sdB;

  static
  {
    AppMethodBeat.i(109858);
    sdD = new b.a((byte)0);
    TAG = "MicroMsg.StoryCommentStorage";
    c.a locala = c.sdE;
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(c.cBF(), "StoryCommentSync") };
    sdC = "select * from StoryCommentSync";
    AppMethodBeat.o(109858);
  }

  public b(e parame)
  {
    super(parame, c.cBF(), "StoryCommentSync", ep.diI);
    AppMethodBeat.i(109857);
    this.bSd = parame;
    parame = a.b.sdo;
    parame = Arrays.asList(new Integer[] { Integer.valueOf(a.b.cBt()) });
    a.f.b.j.o(parame, "Arrays.asList(ConstantsS…COMMENT_SYNC_FLAG_UNREAD)");
    a.f.b.j.p(parame, "data");
    Object localObject2 = new ArrayList((Collection)parame);
    parame = new HashSet();
    localObject1 = new ArrayList();
    Iterator localIterator1 = ((ArrayList)localObject2).iterator();
    int i;
    while (localIterator1.hasNext())
    {
      Integer localInteger = (Integer)localIterator1.next();
      localObject2 = new ArrayList();
      localIterator2 = parame.iterator();
      while (localIterator2.hasNext())
      {
        i = ((Integer)localIterator2.next()).intValue();
        a.f.b.j.o(localInteger, "i");
        ((ArrayList)localObject2).add(Integer.valueOf(i | localInteger.intValue()));
      }
      parame.addAll((Collection)new HashSet((Collection)localObject2));
      parame.add(localInteger);
    }
    parame.add(Integer.valueOf(0));
    ((ArrayList)localObject1).addAll((Collection)parame);
    this.sdA = ((ArrayList)localObject1);
    this.sdB = "";
    parame = new ArrayList();
    Iterator localIterator2 = this.sdA.iterator();
    while (localIterator2.hasNext())
    {
      localObject2 = (Integer)localIterator2.next();
      i = ((Integer)localObject2).intValue();
      localObject1 = a.b.sdo;
      if ((i & a.b.cBt()) != 0)
        parame.add(localObject2);
    }
    localObject1 = k.sek;
    this.sdB = k.a.f((List)parame, "commentFlag");
    AppMethodBeat.o(109857);
  }

  public final List<c> cBC()
  {
    AppMethodBeat.i(109856);
    Object localObject1 = sdC;
    Object localObject2 = new ArrayList();
    localObject1 = this.bSd.rawQuery((String)localObject1, null);
    if (localObject1 != null)
    {
      while (((Cursor)localObject1).moveToNext())
      {
        c localc = new c();
        localc.d((Cursor)localObject1);
        ((ArrayList)localObject2).add(localc);
      }
      ((Cursor)localObject1).close();
    }
    localObject2 = (List)localObject2;
    AppMethodBeat.o(109856);
    return localObject2;
  }

  public final c lr(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(109855);
    Object localObject3 = "select * from StoryCommentSync  where storyId = " + paramLong + ' ';
    localObject3 = this.bSd.rawQuery((String)localObject3, null);
    if (localObject3 != null)
    {
      localObject1 = localObject2;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject1 = new c();
        ((c)localObject1).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
    }
    AppMethodBeat.o(109855);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.b
 * JD-Core Version:    0.6.2
 */