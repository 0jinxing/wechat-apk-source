package com.tencent.mm.cd;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.Queue;
import junit.framework.Assert;

public final class g
  implements e
{
  private static String ybL = "";
  public int field_MARK_CURSOR_CHECK_IGNORE;
  public boolean vcA;
  public h ybK;
  public Map<String, i> ybM;
  public Queue<a> ybN;
  public f ybk;

  public final Cursor a(String paramString, String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(59099);
    paramString = rawQuery(paramString, paramArrayOfString);
    AppMethodBeat.o(59099);
    return paramString;
  }

  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    AppMethodBeat.i(59097);
    paramString1 = query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(59097);
    return paramString1;
  }

  public final int aqv(String paramString)
  {
    Object localObject1 = null;
    f localf = null;
    int i = 0;
    AppMethodBeat.i(59090);
    if (!this.vcA)
    {
      i = -4;
      AppMethodBeat.o(59090);
    }
    while (true)
    {
      return i;
      if ((this.ybK == null) || (this.ybK.inTransaction()))
      {
        ab.d("MicroMsg.MemoryStorage", "copy table but diskDB inTransaction");
        i = -3;
        AppMethodBeat.o(59090);
      }
      else
      {
        try
        {
          if (f.a(this.ybk, paramString))
          {
            this.ybk.execSQL("drop table ".concat(String.valueOf(paramString)));
            ab.i("MicroMsg.MemoryStorage", "table %s is in Memory DB,drop! ", new Object[] { paramString });
          }
          Object localObject2 = this.ybK;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(" select sql from sqlite_master where tbl_name=\"");
          localObject2 = ((h)localObject2).a(paramString + "\" and type = \"table\"", null, 0);
          if (localObject2 != null)
          {
            localObject1 = localf;
            if (((Cursor)localObject2).getCount() == 1)
            {
              ((Cursor)localObject2).moveToFirst();
              localObject1 = ((Cursor)localObject2).getString(0);
            }
            ((Cursor)localObject2).close();
          }
          if (localObject1 == null)
          {
            ab.w("MicroMsg.MemoryStorage", "diskDB has not this table !");
            i = -1;
            AppMethodBeat.o(59090);
          }
          else
          {
            this.ybk.execSQL((String)localObject1);
            localf = this.ybk;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("insert into ");
            localf.execSQL(paramString + " select * from old." + paramString);
            ab.d("MicroMsg.MemoryStorage", "copy table %s success", new Object[] { paramString });
            AppMethodBeat.o(59090);
          }
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.MemoryStorage", paramString, "copy table failed with exception.\n", new Object[0]);
          i = -2;
          AppMethodBeat.o(59090);
        }
      }
    }
  }

  public final void closeDB()
  {
    AppMethodBeat.i(59088);
    ybL = bo.dpG().toString();
    if (this.ybk != null)
    {
      this.ybk.close();
      this.ybk = null;
    }
    AppMethodBeat.o(59088);
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59091);
    Assert.assertTrue("Not Attach Mem Storage:".concat(String.valueOf(paramString1)), this.ybM.containsKey(paramString1));
    int i;
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      i locali = (i)this.ybM.get(paramString1);
      i.a locala = new i.a();
      locala.xBj = 5;
      locala.ycf = paramString2;
      locala.T(paramArrayOfString);
      locali.b(locala);
      i = this.ybk.delete(paramString1, paramString2, paramArrayOfString);
      AppMethodBeat.o(59091);
    }
    while (true)
    {
      return i;
      ab.w("MicroMsg.MemoryStorage", "memoryDB already close delete [%s] [%s]", new Object[] { paramString1, ybL });
      if ((this.ybK != null) && (this.ybK.isOpen()))
      {
        i = this.ybK.delete(paramString1, paramString2, paramArrayOfString);
        AppMethodBeat.o(59091);
      }
      else
      {
        i = -1;
        AppMethodBeat.o(59091);
      }
    }
  }

  public final boolean dpU()
  {
    boolean bool = false;
    AppMethodBeat.i(59089);
    if ((this.ybk == null) || (!this.ybk.isOpen()))
    {
      ab.e("MicroMsg.MemoryStorage", "memory db is close [%s]", new Object[] { ybL });
      AppMethodBeat.o(59089);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(59089);
    }
  }

  public final boolean hY(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(59092);
    Assert.assertTrue("Not Attach Mem Storage:".concat(String.valueOf(paramString1)), this.ybM.containsKey(paramString1));
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      paramString1 = (i)this.ybM.get(paramString1);
      i.a locala = new i.a();
      locala.xBj = 1;
      locala.sql = paramString2;
      paramString1.b(locala);
      this.ybk.execSQL(paramString2);
      AppMethodBeat.o(59092);
      bool = true;
    }
    while (true)
    {
      return bool;
      ab.w("MicroMsg.MemoryStorage", "memoryDB already close execSQL [%s] [%s]", new Object[] { paramString1, ybL });
      if ((this.ybK != null) && (this.ybK.isOpen()))
      {
        this.ybK.hY(paramString2, paramString1);
        AppMethodBeat.o(59092);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(59092);
      }
    }
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(59093);
    Assert.assertTrue("Not Attach Mem Storage:".concat(String.valueOf(paramString1)), this.ybM.containsKey(paramString1));
    long l;
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      i locali = (i)this.ybM.get(paramString1);
      i.a locala = new i.a();
      locala.xBj = 2;
      locala.xDc = paramString2;
      locala.values = new ContentValues(paramContentValues);
      locali.b(locala);
      l = this.ybk.insert(paramString1, paramString2, paramContentValues);
      AppMethodBeat.o(59093);
    }
    while (true)
    {
      return l;
      ab.w("MicroMsg.MemoryStorage", "memoryDB already close insert [%s] [%s]", new Object[] { paramString1, ybL });
      if ((this.ybK != null) && (this.ybK.isOpen()))
      {
        l = this.ybK.insert(paramString1, paramString2, paramContentValues);
        AppMethodBeat.o(59093);
      }
      else
      {
        l = -1L;
        AppMethodBeat.o(59093);
      }
    }
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(59096);
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      paramString1 = this.ybk.a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, 0);
      AppMethodBeat.o(59096);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.MemoryStorage", "memoryDB already close query [%s] [%s]", new Object[] { paramString1, ybL });
      paramString1 = d.dvo();
      AppMethodBeat.o(59096);
    }
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59098);
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      paramString = this.ybk.a(paramString, paramArrayOfString, 0);
      AppMethodBeat.o(59098);
    }
    while (true)
    {
      return paramString;
      ab.w("MicroMsg.MemoryStorage", "memoryDB already close rawQuery [%s] [%s]", new Object[] { paramString, ybL });
      paramString = d.dvo();
      AppMethodBeat.o(59098);
    }
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(59094);
    Assert.assertTrue("Not Attach Mem Storage:".concat(String.valueOf(paramString1)), this.ybM.containsKey(paramString1));
    long l;
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      i locali = (i)this.ybM.get(paramString1);
      i.a locala = new i.a();
      locala.xBj = 4;
      locala.xDc = paramString2;
      locala.values = new ContentValues(paramContentValues);
      locali.b(locala);
      l = this.ybk.replace(paramString1, paramString2, paramContentValues);
      AppMethodBeat.o(59094);
    }
    while (true)
    {
      return l;
      ab.w("MicroMsg.MemoryStorage", "memoryDB already close replace [%s] [%s]", new Object[] { paramString1, ybL });
      if ((this.ybK != null) && (this.ybK.isOpen()))
      {
        l = this.ybK.replace(paramString1, paramString2, paramContentValues);
        AppMethodBeat.o(59094);
      }
      else
      {
        l = -1L;
        AppMethodBeat.o(59094);
      }
    }
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59095);
    Assert.assertTrue("Not Attach Mem Storage:".concat(String.valueOf(paramString1)), this.ybM.containsKey(paramString1));
    int i;
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      i locali = (i)this.ybM.get(paramString1);
      i.a locala = new i.a();
      locala.xBj = 3;
      locala.ycf = paramString2;
      locala.values = new ContentValues(paramContentValues);
      locala.T(paramArrayOfString);
      locali.b(locala);
      i = this.ybk.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
      AppMethodBeat.o(59095);
    }
    while (true)
    {
      return i;
      ab.w("MicroMsg.MemoryStorage", "memoryDB already close update [%s] [%s]", new Object[] { paramString1, ybL });
      if ((this.ybK != null) && (this.ybK.isOpen()))
      {
        i = this.ybK.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
        AppMethodBeat.o(59095);
      }
      else
      {
        i = -1;
        AppMethodBeat.o(59095);
      }
    }
  }

  public static abstract interface a
  {
    public abstract int a(g paramg);

    public abstract String getTableName();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.g
 * JD-Core Version:    0.6.2
 */