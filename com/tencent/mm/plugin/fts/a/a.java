package com.tencent.mm.plugin.fts.a;

import android.database.Cursor;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.fts.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class a
  implements i
{
  private boolean aGx;
  private volatile boolean bZq;
  private f<String, String> mBS;
  public volatile h mBT;
  protected SQLiteStatement mBU;
  private SQLiteStatement mBV;
  private SQLiteStatement mBW;
  private SQLiteStatement mBX;
  private SQLiteStatement mBY;
  public SQLiteStatement mBZ;
  private SQLiteStatement mCa;
  protected SQLiteStatement mCb;

  public a()
  {
    ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "Create %s", new Object[] { getName() });
  }

  private static String cj(String paramString, int paramInt)
  {
    return paramString + "​" + paramInt;
  }

  public final void G(String paramString, long paramLong)
  {
    this.mCa.bindLong(1, paramLong);
    this.mCa.bindString(2, paramString);
    this.mCa.execute();
  }

  public final void K(long paramLong1, long paramLong2)
  {
    this.mBT.K(paramLong1, paramLong2);
  }

  public final void MY(String paramString)
  {
    HashSet localHashSet = new HashSet();
    Object localObject = this.mBS.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (str.startsWith(paramString))
        localHashSet.add(str);
    }
    paramString = localHashSet.iterator();
    while (paramString.hasNext())
    {
      localObject = (String)paramString.next();
      this.mBS.remove(localObject);
    }
  }

  protected abstract void Po();

  protected boolean Pp()
  {
    return false;
  }

  protected boolean Pq()
  {
    this.mBT = null;
    this.mBU.close();
    this.mBV.close();
    this.mBW.close();
    this.mBX.close();
    this.mBY.close();
    this.mCb.close();
    if (this.mBS != null)
      this.mBS.clear();
    return true;
  }

  public final Cursor a(com.tencent.mm.plugin.fts.a.a.g paramg, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = paramg.bAl();
    label72: label101: StringBuilder localStringBuilder;
    if (paramBoolean1)
    {
      paramg = String.format(", MMHighlight(%s, %d, type, subtype)", new Object[] { bAg(), Integer.valueOf(paramg.mEc.size()) });
      if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length <= 0))
        break label238;
      paramArrayOfInt2 = " AND subtype IN " + d.t(paramArrayOfInt2);
      if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length <= 0))
        break label244;
      paramArrayOfInt1 = " AND type IN " + d.t(paramArrayOfInt1);
      localStringBuilder = new StringBuilder("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp");
      if (!paramBoolean2)
        break label250;
    }
    label238: label244: label250: for (String str2 = ", content"; ; str2 = "")
    {
      paramg = String.format(str2 + paramg + " FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + paramArrayOfInt1 + "" + " AND status >= 0" + paramArrayOfInt2 + ";", new Object[] { bAf(), bAf(), bAg(), bAf(), bAg(), bAg(), str1 });
      return this.mBT.rawQuery(paramg, null);
      paramg = "";
      break;
      paramArrayOfInt2 = "";
      break label72;
      paramArrayOfInt1 = "";
      break label101;
    }
  }

  public final Cursor a(int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    if ((!paramBoolean1) && (!paramBoolean2) && (!paramBoolean3) && (!paramBoolean4) && (!paramBoolean5))
      paramArrayOfInt = com.tencent.mm.cd.d.dvo();
    while (true)
    {
      return paramArrayOfInt;
      if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
      {
        paramArrayOfInt = com.tencent.mm.cd.d.dvo();
      }
      else
      {
        Object localObject = new StringBuilder(64);
        if (paramBoolean1)
          ((StringBuilder)localObject).append("docid,");
        if (paramBoolean2)
          ((StringBuilder)localObject).append("entity_id,");
        if (paramBoolean3)
          ((StringBuilder)localObject).append("aux_index,");
        if (paramBoolean4)
          ((StringBuilder)localObject).append("timestamp,");
        if (paramBoolean5)
          ((StringBuilder)localObject).append("status,");
        ((StringBuilder)localObject).setLength(((StringBuilder)localObject).length() - 1);
        localObject = ((StringBuilder)localObject).toString();
        paramArrayOfInt = String.format("SELECT %s FROM %s WHERE type IN " + d.t(paramArrayOfInt) + ";", new Object[] { localObject, bAf() });
        paramArrayOfInt = this.mBT.rawQuery(paramArrayOfInt, null);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, long paramLong1, String paramString1, long paramLong2, String paramString2)
  {
    paramString2 = d.Na(paramString2);
    if (bo.isNullOrNil(paramString2));
    while (true)
    {
      return;
      boolean bool = this.mBT.inTransaction();
      if (!bool)
        this.mBT.beginTransaction();
      try
      {
        this.mBU.bindString(1, paramString2);
        this.mBU.execute();
        this.mBV.bindLong(1, paramInt1);
        this.mBV.bindLong(2, paramInt2);
        this.mBV.bindLong(3, paramLong1);
        this.mBV.bindString(4, paramString1);
        this.mBV.bindLong(5, paramLong2);
        this.mBV.execute();
        if (!bool)
          this.mBT.commit();
        if (bAh())
          this.mBS.put(cj(paramString1, paramInt2), paramString2);
      }
      catch (SQLiteException paramString2)
      {
        ab.e("MicroMsg.FTS.BaseFTS5NativeStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), paramString1, Long.valueOf(paramLong2) }));
        paramString1 = this.mCb.simpleQueryForString();
        if ((paramString1 != null) && (paramString1.length() > 0))
          ab.e("MicroMsg.FTS.BaseFTS5NativeStorage", ">> ".concat(String.valueOf(paramString1)));
      }
    }
    throw paramString2;
  }

  public final void b(int[] paramArrayOfInt, String paramString)
  {
    ArrayList localArrayList = new ArrayList(16);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.t(paramArrayOfInt) + " AND aux_index=?;", new Object[] { bAf() });
    paramArrayOfInt = this.mBT.rawQuery(paramArrayOfInt, new String[] { paramString });
    while (paramArrayOfInt.moveToNext())
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    paramArrayOfInt.close();
    bV(localArrayList);
  }

  public final String bAf()
  {
    return "FTS5Meta" + getTableName();
  }

  public final String bAg()
  {
    return "FTS5Index" + getTableName();
  }

  protected boolean bAh()
  {
    return false;
  }

  public final void bV(List<Long> paramList)
  {
    boolean bool = this.mBT.inTransaction();
    if (!bool)
      this.mBT.beginTransaction();
    Iterator localIterator = paramList.iterator();
    long l;
    while (localIterator.hasNext())
    {
      l = ((Long)localIterator.next()).longValue();
      this.mBW.bindLong(1, l);
      this.mBW.execute();
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      l = ((Long)paramList.next()).longValue();
      this.mBX.bindLong(1, l);
      this.mBX.execute();
    }
    if (!bool)
      commit();
  }

  public final void beginTransaction()
  {
    this.mBT.beginTransaction();
  }

  protected String bvr()
  {
    return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", new Object[] { bAf() });
  }

  public final List<Long> c(int[] paramArrayOfInt, String paramString)
  {
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE aux_index=? AND type IN " + d.t(paramArrayOfInt) + ";", new Object[] { bAf() });
    paramArrayOfInt = this.mBT.rawQuery(paramArrayOfInt, new String[] { paramString });
    paramString = new ArrayList();
    while (paramArrayOfInt.moveToNext())
      paramString.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    paramArrayOfInt.close();
    l(paramString, 1);
    return paramString;
  }

  public final void c(int[] paramArrayOfInt, long paramLong)
  {
    ArrayList localArrayList = new ArrayList(16);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.t(paramArrayOfInt) + " AND entity_id=?;", new Object[] { bAf() });
    paramArrayOfInt = this.mBT.rawQuery(paramArrayOfInt, new String[] { Long.toString(paramLong) });
    while (paramArrayOfInt.moveToNext())
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    paramArrayOfInt.close();
    bV(localArrayList);
  }

  public final String ck(String paramString, int paramInt)
  {
    Object localObject;
    if (bAh())
    {
      localObject = cj(paramString, paramInt);
      if (this.mBS.aj(localObject))
      {
        ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "hit lru insert content map");
        paramString = (String)this.mBS.get(localObject);
      }
    }
    while (true)
    {
      return paramString;
      localObject = String.format("SELECT content FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index=? AND subtype=?", new Object[] { bAf(), bAg(), bAf(), bAg() });
      localObject = this.mBT.rawQuery((String)localObject, new String[] { paramString, String.valueOf(paramInt) });
      paramString = null;
      if (((Cursor)localObject).moveToFirst())
        paramString = ((Cursor)localObject).getString(0);
      ((Cursor)localObject).close();
    }
  }

  public final void commit()
  {
    this.mBT.commit();
  }

  public final void create()
  {
    try
    {
      ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "OnCreate %s | isCreated =%b", new Object[] { getName(), Boolean.valueOf(this.bZq) });
      int i;
      if (!this.bZq)
      {
        if (((n)com.tencent.mm.kernel.g.M(n.class)).isFTSContextReady())
          break label85;
        ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "Create Fail!");
        i = 0;
        if (i != 0)
        {
          ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "SetCreated");
          this.bZq = true;
        }
      }
      return;
      label85: this.mBT = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB();
      ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "Create Success!");
      String str1 = bAg();
      Object localObject1 = bAf();
      ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "indexTableName=%s | metaTableName=%s | TableName=%s", new Object[] { str1, localObject1, getTableName() });
      if ((this.mBT.MT(str1)) && (this.mBT.MT((String)localObject1)) && (!Pp()))
        ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "Table Exist, Not Need To Create");
      while (true)
      {
        String str2 = String.format("INSERT INTO %s (content) VALUES (?);", new Object[] { str1 });
        this.mBU = this.mBT.compileStatement(str2);
        str2 = String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?);", new Object[] { localObject1 });
        this.mBV = this.mBT.compileStatement(str2);
        str1 = String.format("DELETE FROM %s WHERE rowid=?;", new Object[] { str1 });
        this.mBW = this.mBT.compileStatement(str1);
        str1 = String.format("DELETE FROM %s WHERE docid=?;", new Object[] { localObject1 });
        this.mBX = this.mBT.compileStatement(str1);
        str1 = String.format("UPDATE %s SET status=? WHERE docid=?;", new Object[] { localObject1 });
        this.mBY = this.mBT.compileStatement(str1);
        str1 = String.format("UPDATE %s SET status=? WHERE aux_index=? AND status=?", new Object[] { localObject1 });
        this.mBZ = this.mBT.compileStatement(str1);
        localObject1 = String.format("UPDATE %s SET timestamp=? WHERE aux_index=?", new Object[] { localObject1 });
        this.mCa = this.mBT.compileStatement((String)localObject1);
        this.mCb = this.mBT.compileStatement("SELECT mm_last_error();");
        localObject1 = new com/tencent/mm/a/h;
        ((com.tencent.mm.a.h)localObject1).<init>(100);
        this.mBS = ((f)localObject1);
        Po();
        i = 1;
        break;
        ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "Table Not Exist, Need To Create");
        str2 = String.format("DROP TABLE IF EXISTS %s;", new Object[] { str1 });
        String str3 = String.format("DROP TABLE IF EXISTS %s;", new Object[] { localObject1 });
        this.mBT.execSQL(str2);
        this.mBT.execSQL(str3);
        str2 = String.format("CREATE VIRTUAL TABLE %s USING fts5(content, tokenize='mmSimple', prefix='1 2 3 4 5');", new Object[] { bAg() });
        this.mBT.execSQL(str2);
        str2 = bvr();
        this.mBT.execSQL(str2);
        str2 = String.format("CREATE INDEX IF NOT EXISTS %s_typeId ON %s(type, entity_id);", new Object[] { localObject1, localObject1 });
        this.mBT.execSQL(str2);
        str2 = String.format("CREATE INDEX IF NOT EXISTS %s_entity_id_subtype ON %s(entity_id, subtype);", new Object[] { localObject1, localObject1 });
        this.mBT.execSQL(str2);
        str2 = String.format("CREATE INDEX IF NOT EXISTS %s_aux_index_subtype ON %s(aux_index, subtype);", new Object[] { localObject1, localObject1 });
        this.mBT.execSQL(str2);
        str2 = String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", new Object[] { localObject1, localObject1 });
        this.mBT.execSQL(str2);
      }
    }
    finally
    {
    }
  }

  public final void destroy()
  {
    ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "OnDestroy %s | isDestroyed %b | isCreated %b", new Object[] { getName(), Boolean.valueOf(this.aGx), Boolean.valueOf(this.bZq) });
    if ((!this.aGx) && (this.bZq) && (Pq()))
    {
      ab.i("MicroMsg.FTS.BaseFTS5NativeStorage", "SetDestroyed");
      this.aGx = true;
    }
  }

  public final boolean ei(int paramInt1, int paramInt2)
  {
    return this.mBT.ei(paramInt1, paramInt2);
  }

  public final List<b> g(int[] paramArrayOfInt, int paramInt)
  {
    paramArrayOfInt = String.format("SELECT docid, type, subtype, aux_index FROM %s WHERE type IN " + d.t(paramArrayOfInt) + ";", new Object[] { bAf() });
    Cursor localCursor = this.mBT.rawQuery(paramArrayOfInt, null);
    paramArrayOfInt = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      b localb = new b();
      localb.h(localCursor);
      paramArrayOfInt.add(localb);
      localArrayList.add(Long.valueOf(localb.mDv));
    }
    localCursor.close();
    l(localArrayList, paramInt);
    return paramArrayOfInt;
  }

  public final void g(Long paramLong)
  {
    boolean bool = this.mBT.inTransaction();
    if (!bool)
      this.mBT.beginTransaction();
    this.mBW.bindLong(1, paramLong.longValue());
    this.mBW.execute();
    this.mBX.bindLong(1, paramLong.longValue());
    this.mBX.execute();
    if (!bool)
      commit();
  }

  protected String getTableName()
  {
    return "Common";
  }

  public final void l(List<Long> paramList, int paramInt)
  {
    boolean bool = this.mBT.inTransaction();
    if (!bool)
      this.mBT.beginTransaction();
    this.mBY.bindLong(1, paramInt);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      long l = ((Long)paramList.next()).longValue();
      this.mBY.bindLong(2, l);
      this.mBY.execute();
    }
    if (!bool)
      this.mBT.commit();
  }

  public final void s(int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList(2048);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.t(paramArrayOfInt) + ";", new Object[] { bAf() });
    paramArrayOfInt = this.mBT.rawQuery(paramArrayOfInt, null);
    while (paramArrayOfInt.moveToNext())
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    paramArrayOfInt.close();
    bV(localArrayList);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a
 * JD-Core Version:    0.6.2
 */