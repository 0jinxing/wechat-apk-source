package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.k;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

final class e$c extends com.tencent.mm.plugin.fts.a.a.a
{
  private HashMap<String, String> mCH;
  private l mGT;
  private String query;
  private int scene;

  private e$c(e parame)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136780);
    com.tencent.mm.plugin.fts.c.e locale = this.mGS.mGO;
    Object localObject1 = this.query;
    l locall = this.mGT;
    int i = this.scene;
    Object localObject2 = this.mCH;
    Object localObject3 = ((String)localObject1).trim();
    ((HashMap)localObject2).remove(locall.mDx);
    boolean bool = locale.mBT.inTransaction();
    if (!bool)
      locale.mBT.beginTransaction();
    long l = System.currentTimeMillis();
    if (((locall.type == 131072) || (locall.type == 131075)) && (com.tencent.mm.plugin.fts.c.e.Ns(locall.mDx)))
    {
      ab.i("MicroMsg.FTS.FTS5TopHitsStorage", "last contact msg time older than 60 days");
      AppMethodBeat.o(136780);
      return true;
    }
    Object localObject4 = locall.mDx;
    int j = locall.mDw;
    localObject1 = String.format("SELECT docid, score FROM %s WHERE query=? AND aux_index=? AND subtype = ? AND scene=?;", new Object[] { locale.bAf() });
    localObject1 = locale.mBT.rawQuery((String)localObject1, new String[] { localObject3, localObject4, String.valueOf(j), String.valueOf(i) });
    int k;
    if (((Cursor)localObject1).moveToNext())
    {
      j = ((Cursor)localObject1).getInt(0);
      k = ((Cursor)localObject1).getInt(1);
    }
    while (true)
    {
      ((Cursor)localObject1).close();
      localObject1 = "";
      localObject4 = ((HashMap)localObject2).entrySet().iterator();
      label241: Object localObject5;
      if (((Iterator)localObject4).hasNext())
      {
        localObject5 = (Map.Entry)((Iterator)localObject4).next();
        if (((String)((Map.Entry)localObject5).getValue()).equals("​chatroom_tophits"))
          break label1353;
        localObject1 = (String)localObject1 + "'" + (String)((Map.Entry)localObject5).getKey() + "',";
      }
      label415: label1350: label1353: 
      while (true)
      {
        break label241;
        if (((String)localObject1).length() > 0)
        {
          localObject1 = "AND aux_index IN (" + ((String)localObject1).substring(0, ((String)localObject1).length() - 1) + ")";
          localObject1 = String.format("UPDATE %s SET score=CASE WHEN score > 6 THEN 6 WHEN score > 2 THEN (score - 1) ELSE score END WHERE scene = %d %s;", new Object[] { locale.bAf(), Integer.valueOf(i), localObject1 });
          locale.mBT.execSQL((String)localObject1);
        }
        localObject1 = "";
        localObject2 = ((HashMap)localObject2).entrySet().iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)localObject2).next();
          if (!((String)((Map.Entry)localObject4).getValue()).equals("​chatroom_tophits"))
            break label1350;
          localObject1 = (String)localObject1 + "'" + (String)((Map.Entry)localObject4).getKey() + "',";
        }
        while (true)
        {
          break label415;
          if (((String)localObject1).length() > 0)
          {
            localObject1 = "AND aux_index IN(" + ((String)localObject1).substring(0, ((String)localObject1).length() - 1) + ")";
            localObject1 = String.format("UPDATE %s SET score=CASE WHEN score = 1 THEN 0 WHEN score < 5 THEN (score - 1) ELSE 4 END WHERE query = ? AND scene = %d %s;", new Object[] { locale.bAf(), Integer.valueOf(i), localObject1 });
            locale.mBT.execSQL((String)localObject1, new String[] { "​chatroom_tophits" });
          }
          if ((j >= 0) && (k >= 0))
            if (k > 6)
            {
              k++;
              label603: localObject1 = String.format("UPDATE %s SET score=?, timestamp=? WHERE docid=?", new Object[] { locale.bAf() });
              locale.mBT.execSQL((String)localObject1, new String[] { String.valueOf(k), String.valueOf(l), String.valueOf(j) });
            }
          while (true)
          {
            if (!bool)
              locale.mBT.commit();
            localObject2 = c.a.mCE.split((CharSequence)localObject3);
            if ((localObject2.length <= 1) || (locall.type != 131075) || (locall.mDw != 38))
              break;
            localObject1 = new HashSet();
            localObject3 = new k();
            localObject4 = String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE aux_index=? AND query=?;", new Object[] { locale.bAf() });
            localObject4 = locale.mBT.rawQuery((String)localObject4, new String[] { locall.mDx, "​chatroom_tophits" });
            if (!((Cursor)localObject4).moveToNext())
              break label976;
            ((k)localObject3).d((Cursor)localObject4);
            localObject5 = c.a.mCA.split(((k)localObject3).mEC);
            k = localObject5.length;
            for (j = 0; j < k; j++)
              ((HashSet)localObject1).add(localObject5[j]);
            k += 3;
            break label603;
            locale.mHm.bindString(1, locall.content);
            locale.mHm.execute();
            locale.mHn.bindLong(1, locall.type);
            locale.mHn.bindLong(2, locall.mDw);
            locale.mHn.bindLong(3, locall.mEB);
            locale.mHn.bindString(4, locall.mDx);
            locale.mHn.bindLong(5, l);
            locale.mHn.bindString(6, (String)localObject3);
            locale.mHn.bindLong(7, 3L);
            locale.mHn.bindLong(8, i);
            locale.mHn.bindString(9, locall.content);
            locale.mHn.execute();
          }
          label976: ((Cursor)localObject4).close();
          for (j = 0; (j < locall.mEI.size()) && (j < localObject2.length); j++)
          {
            localObject4 = (f)locall.mEI.get(j);
            if (((HashSet)localObject1).add(((f)localObject4).content))
              ((k)localObject3).mEC = (((k)localObject3).mEC + ((f)localObject4).content + "​");
          }
          ab.i("MicroMsg.FTS.FTS5TopHitsStorage", "update tophits content=%s", new Object[] { ((k)localObject3).mEC });
          if (((k)localObject3).mEz > 0L)
            locale.g(Long.valueOf(((k)localObject3).mEz));
          ((k)localObject3).mEz = 0L;
          ((k)localObject3).query = "​chatroom_tophits";
          ((k)localObject3).mEA += 1L;
          ((k)localObject3).fob = i;
          ((k)localObject3).mDx = locall.mDx;
          ((k)localObject3).mEB = locall.mEB;
          ((k)localObject3).type = locall.type;
          ((k)localObject3).mDw = locall.mDw;
          ((k)localObject3).timestamp = l;
          locale.mHm.bindString(1, ((k)localObject3).mEC);
          locale.mHm.execute();
          locale.mHn.bindLong(1, ((k)localObject3).type);
          locale.mHn.bindLong(2, ((k)localObject3).mDw);
          locale.mHn.bindLong(3, ((k)localObject3).mEB);
          locale.mHn.bindString(4, ((k)localObject3).mDx);
          locale.mHn.bindLong(5, ((k)localObject3).timestamp);
          locale.mHn.bindString(6, ((k)localObject3).query);
          locale.mHn.bindLong(7, ((k)localObject3).mEA);
          locale.mHn.bindLong(8, ((k)localObject3).fob);
          locale.mHn.bindString(9, ((k)localObject3).mEC);
          locale.mHn.execute();
          break;
        }
      }
      k = -1;
      j = -1;
    }
  }

  public final String getName()
  {
    return "UpdateTopHitsWithQueryTask";
  }

  public final String toString()
  {
    AppMethodBeat.i(136781);
    String str = String.format("%s : query=%s scene=%d", new Object[] { super.toString(), this.query, Integer.valueOf(this.scene) });
    AppMethodBeat.o(136781);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.e.c
 * JD-Core Version:    0.6.2
 */