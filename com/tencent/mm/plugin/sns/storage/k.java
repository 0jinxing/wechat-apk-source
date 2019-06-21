package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.ej;
import com.tencent.mm.plugin.sns.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class k extends com.tencent.mm.sdk.e.j<j>
  implements d
{
  public static final String[] fnj;
  public h fni;

  static
  {
    AppMethodBeat.i(37854);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(j.ccO, "SnsComment") };
    AppMethodBeat.o(37854);
  }

  public k(h paramh)
  {
    super(paramh, j.ccO, "SnsComment", ej.diI);
    this.fni = paramh;
  }

  public static String cqE()
  {
    return "select *, rowid from SnsComment";
  }

  public final Cursor DH(int paramInt)
  {
    AppMethodBeat.i(37844);
    Object localObject = "select *, rowid from SnsComment where isSend = 0 order by createTime desc LIMIT ".concat(String.valueOf(paramInt));
    ab.v("MicroMsg.SnsCommentStorage", "getCursor sql:".concat(String.valueOf(localObject)));
    localObject = this.fni.a((String)localObject, null, 0);
    AppMethodBeat.o(37844);
    return localObject;
  }

  public final boolean a(long paramLong, String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(37846);
    boolean bool;
    if (bo.isNullOrNil(paramString2))
    {
      paramString1 = "select count(*) from SnsComment where snsID = " + paramLong + " and createTime = " + paramInt + " and talker = '" + paramString1 + "'";
      paramString1 = rawQuery(paramString1, new String[0]);
      if (paramString1 == null)
        break label152;
      paramString1.moveToFirst();
      paramInt = paramString1.getInt(0);
      paramString1.close();
      if (paramInt <= 0)
        break label141;
      bool = true;
      AppMethodBeat.o(37846);
    }
    while (true)
    {
      return bool;
      paramString1 = "select count(*) from SnsComment where snsID = " + paramLong + " and clientId = '" + paramString2 + "'";
      break;
      label141: AppMethodBeat.o(37846);
      bool = false;
      continue;
      label152: AppMethodBeat.o(37846);
      bool = false;
    }
  }

  public final int baS()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(37843);
    Cursor localCursor = this.fni.a(" select count(*) from SnsComment where isRead = ? and isSilence != ? ", new String[] { "0", "1" }, 2);
    if (localCursor == null)
      AppMethodBeat.o(37843);
    while (true)
    {
      return j;
      j = i;
      if (localCursor.moveToFirst())
        j = localCursor.getInt(0);
      localCursor.close();
      AppMethodBeat.o(37843);
    }
  }

  public final boolean baT()
  {
    AppMethodBeat.i(37851);
    boolean bool = this.fni.hY("SnsComment", " update SnsComment set isRead = 1 where isRead = 0");
    AppMethodBeat.o(37851);
    return bool;
  }

  public final Cursor cqF()
  {
    AppMethodBeat.i(37845);
    Cursor localCursor = this.fni.a("select *, rowid from SnsComment where isRead = ?  and isSilence != ?  order by createTime desc", new String[] { "0", "1" }, 0);
    AppMethodBeat.o(37845);
    return localCursor;
  }

  public final int cqG()
  {
    int i = 0;
    AppMethodBeat.i(37847);
    Cursor localCursor = rawQuery("select count(*) from SnsComment where isSend = 0", new String[0]);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
      AppMethodBeat.o(37847);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(37847);
    }
  }

  public final void cqH()
  {
    AppMethodBeat.i(37853);
    this.fni.aqx("SnsComment");
    AppMethodBeat.o(37853);
  }

  public final j f(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(37848);
    Object localObject1 = "";
    if (paramInt == 9)
      localObject1 = "" + "(2)";
    Object localObject2 = localObject1;
    if (paramInt == 10)
      localObject2 = (String)localObject1 + "(8,16)";
    localObject2 = rawQuery("select *, rowid from SnsComment where snsID = " + paramLong1 + " and commentSvrID = " + paramLong2 + " and type in " + (String)localObject2, new String[0]);
    if (localObject2 != null)
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new j();
        ((j)localObject1).d((Cursor)localObject2);
        ((Cursor)localObject2).close();
      }
    while (true)
    {
      AppMethodBeat.o(37848);
      return localObject1;
      localObject1 = null;
      break;
      localObject1 = null;
    }
  }

  public final boolean g(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(37850);
    String str1 = "";
    if (paramInt == 9)
      str1 = "" + "(2)";
    String str2 = str1;
    if (paramInt == 10)
      str2 = str1 + "(8,16)";
    str1 = "delete from SnsComment where snsID = " + paramLong1 + " and commentSvrID = " + paramLong2 + " and type in " + str2;
    boolean bool = this.fni.hY("SnsComment", str1);
    AppMethodBeat.o(37850);
    return bool;
  }

  public final boolean ky(long paramLong)
  {
    AppMethodBeat.i(37849);
    String str = "delete from SnsComment where snsID = ".concat(String.valueOf(paramLong));
    boolean bool = this.fni.hY("SnsComment", str);
    AppMethodBeat.o(37849);
    return bool;
  }

  public final boolean y(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(37852);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      String str = " update SnsComment set isSilence = " + i + " where isSilence != " + i + " and  snsID = " + paramLong;
      ab.i("MicroMsg.SnsCommentStorage", "updateIsSilence ".concat(String.valueOf(str)));
      paramBoolean = this.fni.hY("SnsComment", str);
      AppMethodBeat.o(37852);
      return paramBoolean;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.k
 * JD-Core Version:    0.6.2
 */