package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.a.k;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public final class e extends a
{
  public SQLiteStatement mHm;
  public SQLiteStatement mHn;
  private SQLiteStatement mHo;

  public static boolean Ns(String paramString)
  {
    AppMethodBeat.i(136841);
    long l = System.currentTimeMillis();
    boolean bool;
    if (((j)g.K(j.class)).bOr().Rt(paramString) < l - 5184000000L)
    {
      bool = true;
      AppMethodBeat.o(136841);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136841);
    }
  }

  public final void Nr(String paramString)
  {
    AppMethodBeat.i(136839);
    this.mHo.bindLong(1, 1L);
    this.mHo.bindString(2, paramString);
    this.mHo.execute();
    AppMethodBeat.o(136839);
  }

  public final void Po()
  {
    AppMethodBeat.i(136838);
    if (Pp())
      this.mBT.K(-100L, 3L);
    this.mBT.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_query ON %s(query);", new Object[] { bAf(), bAf() }));
    this.mBT.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_score ON %s(score);", new Object[] { bAf(), bAf() }));
    String str = String.format("INSERT INTO %s (content) VALUES (?);", new Object[] { bAg() });
    this.mHm = this.mBT.compileStatement(str);
    str = String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, query, score, scene, meta_content) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?, ?, ?, ?);", new Object[] { bAf() });
    this.mHn = this.mBT.compileStatement(str);
    str = String.format("UPDATE %s SET status=? WHERE aux_index=?", new Object[] { bAf() });
    this.mHo = this.mBT.compileStatement(str);
    AppMethodBeat.o(136838);
  }

  public final boolean Pp()
  {
    AppMethodBeat.i(136844);
    boolean bool;
    if (!ei(-100, 3))
    {
      bool = true;
      AppMethodBeat.o(136844);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136844);
    }
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136842);
    super.Pq();
    this.mHm.close();
    this.mHn.close();
    this.mHo.close();
    AppMethodBeat.o(136842);
    return true;
  }

  public final int bAJ()
  {
    AppMethodBeat.i(136840);
    Object localObject1 = String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE status > 0;", new Object[] { bAf() });
    Object localObject2 = this.mBT.rawQuery((String)localObject1, null);
    localObject1 = new ArrayList();
    Object localObject3;
    while (((Cursor)localObject2).moveToNext())
    {
      localObject3 = new k();
      ((k)localObject3).d((Cursor)localObject2);
      ((List)localObject1).add(localObject3);
    }
    ((Cursor)localObject2).close();
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    LinkedList localLinkedList3 = new LinkedList();
    Iterator localIterator = ((List)localObject1).iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      bool = false;
      if (localk.type == 262144)
        localObject2 = ((n)g.M(n.class)).getFTSIndexStorage(17);
      while (true)
      {
        localObject1 = null;
        if (!bool)
          localObject1 = ((i)localObject2).ck(localk.mDx, localk.mDw);
        if (bo.isNullOrNil((String)localObject1))
          break label441;
        if (!localk.query.equals("​chatroom_tophits"))
          break label381;
        String[] arrayOfString = c.a.mCA.split(localk.mEC);
        localObject2 = "";
        int i = arrayOfString.length;
        j = 0;
        while (j < i)
        {
          String str = arrayOfString[j];
          localObject3 = localObject2;
          if (((String)localObject1).indexOf(str) >= 0)
            localObject3 = (String)localObject2 + str + "​";
          j++;
          localObject2 = localObject3;
        }
        localObject2 = ((n)g.M(n.class)).getFTSIndexStorage(3);
        bool = Ns(localk.mDx);
      }
      label441: if (!localk.mEC.equals(localObject2))
      {
        localk.mEC = ((String)localObject2);
        localLinkedList2.add(Long.valueOf(localk.mEz));
        localLinkedList3.add(localk);
      }
      else
      {
        localLinkedList1.add(Long.valueOf(localk.mEz));
        continue;
        label381: if (!localk.mEC.equals(localObject1))
        {
          localk.mEC = ((String)localObject1);
          localLinkedList2.add(Long.valueOf(localk.mEz));
          localLinkedList3.add(localk);
        }
        else
        {
          localLinkedList1.add(Long.valueOf(localk.mEz));
          continue;
          localLinkedList2.add(Long.valueOf(localk.mEz));
        }
      }
    }
    ab.i("MicroMsg.FTS.FTS5TopHitsStorage", "updateTopHitsDirty deleteDocIdList=%d needToInsertTopHitListSize=%d normalDocIdList=%d", new Object[] { Integer.valueOf(localLinkedList2.size()), Integer.valueOf(localLinkedList3.size()), Integer.valueOf(localLinkedList1.size()) });
    if (localLinkedList2.size() > 0)
      bV(localLinkedList2);
    if (localLinkedList3.size() > 0)
    {
      bool = this.mBT.inTransaction();
      if (!bool)
        this.mBT.beginTransaction();
      localObject2 = localLinkedList3.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (k)((Iterator)localObject2).next();
        if (!bo.isNullOrNil(((k)localObject1).mEC))
        {
          this.mHm.bindString(1, ((k)localObject1).mEC);
          this.mHm.execute();
          this.mHn.bindLong(1, ((k)localObject1).type);
          this.mHn.bindLong(2, ((k)localObject1).mDw);
          this.mHn.bindLong(3, ((k)localObject1).mEB);
          this.mHn.bindString(4, ((k)localObject1).mDx);
          this.mHn.bindLong(5, ((k)localObject1).timestamp);
          this.mHn.bindString(6, ((k)localObject1).query);
          this.mHn.bindLong(7, ((k)localObject1).mEA);
          this.mHn.bindLong(8, ((k)localObject1).fob);
          this.mHn.bindString(9, ((k)localObject1).mEC);
          this.mHn.execute();
        }
      }
      if (!bool)
        commit();
    }
    if (localLinkedList1.size() > 0)
      l(localLinkedList1, 0);
    int j = localLinkedList2.size();
    AppMethodBeat.o(136840);
    return j;
  }

  public final String bvr()
  {
    AppMethodBeat.i(136843);
    String str = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, query TEXT COLLATE NOCASE, score INT, scene INT, meta_content TEXT);", new Object[] { bAf() });
    AppMethodBeat.o(136843);
    return str;
  }

  public final String getName()
  {
    return "FTS5TopHitsStorage";
  }

  public final int getPriority()
  {
    return 768;
  }

  public final String getTableName()
  {
    return "TopHits";
  }

  public final int getType()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c.e
 * JD-Core Version:    0.6.2
 */