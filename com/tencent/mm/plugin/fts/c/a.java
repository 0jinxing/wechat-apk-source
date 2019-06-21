package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.g.c;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.Iterator;
import java.util.List;

public final class a extends com.tencent.mm.plugin.fts.a.a
{
  public SQLiteStatement mHa;
  public SQLiteStatement mHb;
  private SQLiteStatement mHc;
  public SQLiteStatement mHd;
  public SQLiteStatement mHe;
  private SQLiteStatement mHf;
  public SQLiteStatement mHg;

  public final void No(String paramString)
  {
    AppMethodBeat.i(136813);
    this.mHf.bindString(1, paramString);
    this.mHf.execute();
    AppMethodBeat.o(136813);
  }

  public final Cursor Np(String paramString)
  {
    AppMethodBeat.i(136814);
    paramString = this.mBT.rawQuery("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers WHERE member=?;", new String[] { paramString });
    AppMethodBeat.o(136814);
    return paramString;
  }

  public final void Nq(String paramString)
  {
    AppMethodBeat.i(136816);
    this.mHc.bindString(1, paramString);
    this.mHc.execute();
    AppMethodBeat.o(136816);
  }

  public final void Po()
  {
    AppMethodBeat.i(136810);
    if (Pp())
      this.mBT.K(-102L, 4L);
    this.mBT.execSQL("CREATE TABLE IF NOT EXISTS FTS5ChatRoomMembers (chatroom TEXT, member TEXT);");
    this.mBT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_chatroom ON FTS5ChatRoomMembers(chatroom);");
    this.mBT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_member ON FTS5ChatRoomMembers(member);");
    this.mBT.execSQL("CREATE TABLE IF NOT EXISTS FTS5ContactLabels (user TEXT, label_id INTEGER);");
    this.mBT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_user ON FTS5ContactLabels(user);");
    this.mBT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_label ON FTS5ContactLabels(label_id);");
    this.mHa = this.mBT.compileStatement("INSERT INTO FTS5ChatRoomMembers (chatroom, member) VALUES (?, ?);");
    this.mHb = this.mBT.compileStatement("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=? AND member=?;");
    this.mHc = this.mBT.compileStatement("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=?;");
    this.mHd = this.mBT.compileStatement("INSERT INTO FTS5ContactLabels (user, label_id) VALUES (?, ?);");
    this.mHe = this.mBT.compileStatement("DELETE FROM FTS5ContactLabels WHERE user=? AND label_id=?;");
    this.mHf = this.mBT.compileStatement("DELETE FROM FTS5ContactLabels WHERE user=?;");
    this.mHg = this.mBT.compileStatement("SELECT changes();");
    AppMethodBeat.o(136810);
  }

  public final boolean Pp()
  {
    AppMethodBeat.i(136818);
    boolean bool;
    if (!ei(-102, 4))
    {
      bool = true;
      AppMethodBeat.o(136818);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136818);
    }
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136811);
    super.Pq();
    this.mHa.close();
    this.mHb.close();
    this.mHc.close();
    this.mHd.close();
    this.mHe.close();
    this.mHf.close();
    this.mHg.close();
    AppMethodBeat.o(136811);
    return true;
  }

  public final Cursor a(g paramg, String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(136819);
    String str = paramg.bAl();
    if (bo.isNullOrNil(paramString))
    {
      paramg = "";
      if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length <= 0))
        break label196;
      paramString = " AND type IN " + d.t(paramArrayOfInt1);
      label50: if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length <= 0))
        break label202;
    }
    label196: label202: for (paramArrayOfInt1 = " AND subtype IN " + d.t(paramArrayOfInt2); ; paramArrayOfInt1 = "")
    {
      paramg = String.format("SELECT aux_index, type, subtype FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + paramg + paramString + paramArrayOfInt1 + " AND status >= 0 ORDER BY subtype;", new Object[] { bAf(), bAg(), bAf(), bAg(), bAg(), str });
      paramg = this.mBT.rawQuery(paramg, null);
      AppMethodBeat.o(136819);
      return paramg;
      paramg = String.format(" AND aux_index = '%s'", new Object[] { paramString });
      break;
      paramString = "";
      break label50;
    }
  }

  public final boolean b(g paramg)
  {
    AppMethodBeat.i(136820);
    String str1 = bAf();
    String str2 = bAg();
    String str3 = bAf();
    String str4 = bAg();
    String str5 = bAg();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramg.mEc.size(); i++)
    {
      localStringBuffer.append("(");
      localStringBuffer.append(((g.c)paramg.mEc.get(i)).bAn());
      localStringBuffer.append(")");
      if (i != paramg.mEc.size() - 1)
        localStringBuffer.append(" OR ");
    }
    paramg = String.format("SELECT 1 FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type=131072 LIMIT 1;", new Object[] { str1, str2, str3, str4, str5, localStringBuffer.toString() });
    paramg = this.mBT.rawQuery(paramg, null);
    boolean bool = paramg.moveToNext();
    paramg.close();
    AppMethodBeat.o(136820);
    return bool;
  }

  public final boolean bAh()
  {
    return true;
  }

  public final String bvr()
  {
    AppMethodBeat.i(136817);
    String str = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", new Object[] { bAf() });
    AppMethodBeat.o(136817);
    return str;
  }

  public final String getName()
  {
    return "FTS5ContactStorage";
  }

  public final int getPriority()
  {
    return 3;
  }

  public final String getTableName()
  {
    return "Contact";
  }

  public final int getType()
  {
    return 3;
  }

  public final void k(String paramString, List<Long> paramList)
  {
    AppMethodBeat.i(136812);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(136812);
    while (true)
    {
      return;
      boolean bool = this.mBT.inTransaction();
      if (!bool)
        this.mBT.beginTransaction();
      this.mHd.bindString(1, paramString);
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        long l = ((Long)paramString.next()).longValue();
        this.mHd.bindLong(2, l);
        this.mHd.execute();
      }
      if (!bool)
        this.mBT.commit();
      AppMethodBeat.o(136812);
    }
  }

  public final void k(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(136815);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(136815);
    while (true)
    {
      return;
      boolean bool = this.mBT.inTransaction();
      if (!bool)
        this.mBT.beginTransaction();
      this.mHa.bindString(1, paramString);
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        paramString = paramArrayOfString[j];
        this.mHa.bindString(2, paramString);
        this.mHa.execute();
      }
      if (!bool)
        this.mBT.commit();
      AppMethodBeat.o(136815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c.a
 * JD-Core Version:    0.6.2
 */