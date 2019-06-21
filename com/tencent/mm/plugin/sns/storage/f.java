package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends j<e>
{
  public static final String[] diI;
  public static final String[] fnj;
  private static final String rfa;
  private com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(37834);
    fnj = new String[] { j.a(e.ccO, "adsnsinfo") };
    diI = new String[] { "CREATE INDEX IF NOT EXISTS serverAdSnsNameIndex ON AdSnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverAdSnsTimeHeadIndex ON AdSnsInfo ( head )", "DROP INDEX IF EXISTS serverAdSnsTimeIndex", "DROP INDEX IF EXISTS serverAdSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex1 ON AdSnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex2 ON AdSnsInfo ( sourceType,type,userName)" };
    rfa = String.format("select  %s %s,rowid from AdSnsInfo ", new Object[] { "snsId", "createTime" });
    AppMethodBeat.o(37834);
  }

  public f(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.ccO, "adsnsinfo", diI);
    this.bSd = parame;
  }

  private int a(e parame)
  {
    AppMethodBeat.i(37830);
    ab.d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert");
    int i;
    if (parame == null)
    {
      i = -1;
      AppMethodBeat.o(37830);
    }
    while (true)
    {
      return i;
      parame = parame.Hl();
      i = (int)this.bSd.insert("AdSnsInfo", "", parame);
      ab.d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert result".concat(String.valueOf(i)));
      AppMethodBeat.o(37830);
    }
  }

  public final e DG(int paramInt)
  {
    AppMethodBeat.i(37826);
    e locale = new e();
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.rowid=".concat(String.valueOf(paramInt));
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      locale.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(37826);
    }
    while (true)
    {
      return locale;
      ((Cursor)localObject).close();
      AppMethodBeat.o(37826);
      locale = null;
    }
  }

  public final boolean a(long paramLong, e parame)
  {
    AppMethodBeat.i(37827);
    boolean bool;
    if (kv(paramLong))
    {
      bool = b(paramLong, parame);
      AppMethodBeat.o(37827);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.AdSnsInfoStorage", "added PcId ".concat(String.valueOf(paramLong)));
      if (a(parame) != -1)
      {
        bool = true;
        AppMethodBeat.o(37827);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(37827);
      }
    }
  }

  public final boolean b(long paramLong, e parame)
  {
    boolean bool = true;
    AppMethodBeat.i(37828);
    parame = parame.Hl();
    parame.remove("rowid");
    if (this.bSd.update("AdSnsInfo", parame, "snsId=?", new String[] { String.valueOf(paramLong) }) > 0)
      AppMethodBeat.o(37828);
    while (true)
    {
      return bool;
      AppMethodBeat.o(37828);
      bool = false;
    }
  }

  public final boolean delete(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(37831);
    int i = this.bSd.delete("AdSnsInfo", "snsId=?", new String[] { String.valueOf(paramLong) });
    ab.i("MicroMsg.AdSnsInfoStorage", "del msg " + paramLong + " res " + i);
    if (i > 0)
      AppMethodBeat.o(37831);
    while (true)
    {
      return bool;
      AppMethodBeat.o(37831);
      bool = false;
    }
  }

  public final Cursor fq(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37832);
    Object localObject = "select *,rowid from AdSnsInfo  where createTime > " + paramInt2 + " and createTime <= " + paramInt1 + " and " + o.rfz;
    localObject = (String)localObject + " order by  createTime desc";
    ab.d("MicroMsg.AdSnsInfoStorage", "getAdInTime ".concat(String.valueOf(localObject)));
    localObject = this.bSd.a((String)localObject, null, 2);
    AppMethodBeat.o(37832);
    return localObject;
  }

  public final e ku(long paramLong)
  {
    AppMethodBeat.i(37825);
    e locale = new e();
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=".concat(String.valueOf(paramLong));
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      locale.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(37825);
    }
    while (true)
    {
      return locale;
      ((Cursor)localObject).close();
      AppMethodBeat.o(37825);
      locale = null;
    }
  }

  public final boolean kv(long paramLong)
  {
    AppMethodBeat.i(37829);
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=".concat(String.valueOf(paramLong));
    localObject = this.bSd.a((String)localObject, null, 2);
    boolean bool = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    AppMethodBeat.o(37829);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.f
 * JD-Core Version:    0.6.2
 */