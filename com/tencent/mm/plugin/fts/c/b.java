package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.a.c;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b extends a
{
  private SQLiteStatement mHh;

  public final void Po()
  {
    AppMethodBeat.i(136821);
    if (Pp())
    {
      localObject = String.format("DROP TABLE IF EXISTS %s", new Object[] { "Feature" });
      this.mBT.execSQL((String)localObject);
      K(-101L, 2L);
    }
    if (!this.mBT.MT("Feature"))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("CREATE TABLE IF NOT EXISTS Feature ( ");
      ((StringBuilder)localObject).append(c.ccO.sql);
      ((StringBuilder)localObject).append(");");
      localObject = ((StringBuilder)localObject).toString();
      this.mBT.execSQL((String)localObject);
    }
    Object localObject = String.format("INSERT INTO %s (featureId, title, titlePY, titleShortPY, tag, actionType, url, helpUrl, updateUrl, androidUrl, iconPath, timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", new Object[] { "Feature" });
    this.mHh = this.mBT.compileStatement((String)localObject);
    AppMethodBeat.o(136821);
  }

  public final boolean Pp()
  {
    AppMethodBeat.i(136822);
    boolean bool;
    if (!ei(-101, 2))
    {
      bool = true;
      AppMethodBeat.o(136822);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136822);
    }
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136826);
    super.Pq();
    this.mHh.close();
    AppMethodBeat.o(136826);
    return true;
  }

  public final List<b.a> bAI()
  {
    AppMethodBeat.i(136823);
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Object localObject = String.format("SELECT entity_id, timestamp FROM %s", new Object[] { bAf() });
    localObject = this.mBT.rawQuery((String)localObject, null);
    while (((Cursor)localObject).moveToNext())
    {
      int i = ((Cursor)localObject).getInt(0);
      if (localHashSet.add(Integer.valueOf(i)))
      {
        b.a locala = new b.a();
        locala.mHi = i;
        locala.timestamp = ((Cursor)localObject).getLong(1);
        localArrayList.add(locala);
      }
    }
    ((Cursor)localObject).close();
    AppMethodBeat.o(136823);
    return localArrayList;
  }

  public final boolean bAh()
  {
    return true;
  }

  public final boolean bZ(List<c> paramList)
  {
    AppMethodBeat.i(136824);
    boolean bool = this.mBT.inTransaction();
    if (!bool)
      this.mBT.beginTransaction();
    this.mBT.execSQL("Delete from Feature");
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      c localc = (c)paramList.next();
      try
      {
        this.mHh.bindLong(1, localc.field_featureId);
        this.mHh.bindString(2, localc.field_title);
        this.mHh.bindString(3, localc.field_titlePY);
        this.mHh.bindString(4, localc.field_titleShortPY);
        this.mHh.bindString(5, localc.field_tag);
        this.mHh.bindLong(6, localc.field_actionType);
        this.mHh.bindString(7, localc.field_url);
        this.mHh.bindString(8, localc.field_helpUrl);
        this.mHh.bindString(9, localc.field_updateUrl);
        this.mHh.bindString(10, localc.field_androidUrl);
        this.mHh.bindString(11, localc.field_iconPath);
        this.mHh.bindLong(12, localc.field_timestamp);
        ab.d("MicroMsg.FTS.FTS5FeatureStorage", "insertFeatureItem rowid=%d timestamp=%d", new Object[] { Long.valueOf(this.mHh.executeInsert()), Long.valueOf(localc.field_timestamp) });
      }
      catch (Exception localException)
      {
      }
    }
    if (!bool)
      this.mBT.commit();
    AppMethodBeat.o(136824);
    return true;
  }

  public final String getName()
  {
    return "FTS5FeatureStorage";
  }

  public final int getPriority()
  {
    return 17;
  }

  public final String getTableName()
  {
    return "Feature";
  }

  public final int getType()
  {
    return 17;
  }

  public final c wa(int paramInt)
  {
    c localc = null;
    AppMethodBeat.i(136825);
    Object localObject2 = "Select * from Feature where featureId = ".concat(String.valueOf(paramInt));
    localObject2 = this.mBT.rawQuery((String)localObject2, null);
    try
    {
      boolean bool = ((Cursor)localObject2).moveToFirst();
      if (!bool);
      while (true)
      {
        return localc;
        localc = new com/tencent/mm/plugin/fts/a/a/c;
        localc.<init>();
        localc.d((Cursor)localObject2);
        ((Cursor)localObject2).close();
        AppMethodBeat.o(136825);
      }
    }
    finally
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(136825);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c.b
 * JD-Core Version:    0.6.2
 */