package com.tencent.mm.plugin.story.h;

import a.l;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.et;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryVideoCacheStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/plugin/story/storage/StoryVideoCache;", "Lcom/tencent/mm/plugin/story/storage/IStoryStorage;", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "getDb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "deleteByStoryId", "", "storyId", "", "droptable", "dumpinfo", "", "getAllData", "", "getByStoryId", "insert", "", "item", "update", "Companion", "plugin-story_release"})
public final class o extends com.tencent.mm.sdk.e.j<n>
{
  private static final String TAG = "MicroMsg.StoryVideoCacheStorage";
  private static final String[] sdG;
  public static final o.a sep;
  public final e bSd;

  static
  {
    AppMethodBeat.i(109985);
    sep = new o.a((byte)0);
    n.a locala = n.seo;
    sdG = new String[] { com.tencent.mm.sdk.e.j.a(n.cBF(), "StoryVideoCacheInfo") };
    TAG = "MicroMsg.StoryVideoCacheStorage";
    AppMethodBeat.o(109985);
  }

  public o(e parame)
  {
    super(parame, n.cBF(), "StoryVideoCacheInfo", et.diI);
    AppMethodBeat.i(109984);
    this.bSd = parame;
    AppMethodBeat.o(109984);
  }

  public final boolean a(n paramn)
  {
    AppMethodBeat.i(109979);
    a.f.b.j.p(paramn, "item");
    boolean bool = super.b((c)paramn);
    AppMethodBeat.o(109979);
    return bool;
  }

  public final boolean b(n paramn)
  {
    AppMethodBeat.i(109981);
    a.f.b.j.p(paramn, "item");
    boolean bool = super.c((c)paramn, new String[0]);
    AppMethodBeat.o(109981);
    return bool;
  }

  public final void cqH()
  {
    AppMethodBeat.i(109983);
    int i = this.bSd.delete("StoryVideoCacheInfo", null, null);
    ab.i(TAG, "dropTable ".concat(String.valueOf(i)));
    AppMethodBeat.o(109983);
  }

  public final n lz(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(109982);
    if (paramLong == 0L)
    {
      ab.i(TAG, "Test get mediaId error " + paramLong + ' ' + bo.dpG());
      AppMethodBeat.o(109982);
      localObject2 = localObject3;
    }
    while (true)
    {
      return localObject2;
      localObject3 = "select * from StoryVideoCacheInfo  where storyId = '" + paramLong + "' ";
      localObject3 = this.bSd.rawQuery((String)localObject3, null);
      if (localObject3 != null)
      {
        localObject2 = localObject1;
        if (((Cursor)localObject3).moveToFirst())
        {
          localObject2 = new n();
          ((n)localObject2).d((Cursor)localObject3);
        }
        ((Cursor)localObject3).close();
      }
      AppMethodBeat.o(109982);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.o
 * JD-Core Version:    0.6.2
 */