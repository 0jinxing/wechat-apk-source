package com.tencent.mm.plugin.game.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import java.util.LinkedList;

public final class r extends j<n>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(111334);
    fnj = new String[] { j.a(n.ccO, "GameRawMessage") };
    AppMethodBeat.o(111334);
  }

  public r(e parame)
  {
    super(parame, n.ccO, "GameRawMessage", null);
  }

  public static String v(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(111333);
    String str = "" + "(";
    for (int i = 0; i < 5; i++)
      str = str + "msgType=" + paramArrayOfInt[i] + " or ";
    paramArrayOfInt = str + "msgType=" + paramArrayOfInt[5];
    paramArrayOfInt = paramArrayOfInt + ")";
    AppMethodBeat.o(111333);
    return paramArrayOfInt;
  }

  public final LinkedList<n> b(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(111328);
    Object localObject1;
    Object localObject2;
    label24: Object localObject3;
    if (paramLong == 0L)
    {
      localObject1 = "9223372036854775807";
      if (paramInt2 != 0)
        break label154;
      localObject2 = "(isRead=1 or isRead=0) ";
      localObject3 = "";
      if (paramInt1 != 65536)
        localObject3 = "msgType=" + paramInt1 + " and ";
      localObject1 = String.format("select * from GameRawMessage where " + (String)localObject3 + "msgId<%s and " + (String)localObject2 + "order by createTime desc limit %s", new Object[] { localObject1, String.valueOf(paramInt3) });
      localObject2 = new LinkedList();
      localObject3 = rawQuery((String)localObject1, new String[0]);
      if (localObject3 != null)
        break label191;
      AppMethodBeat.o(111328);
    }
    while (true)
    {
      return localObject2;
      localObject1 = String.valueOf(paramLong);
      break;
      label154: if (paramInt2 == 1)
      {
        localObject2 = "isRead=0 ";
        break label24;
      }
      if (paramInt2 == 2)
      {
        localObject2 = "isRead=1 ";
        break label24;
      }
      localObject2 = null;
      AppMethodBeat.o(111328);
      continue;
      label191: if (((Cursor)localObject3).moveToFirst())
        do
        {
          localObject1 = new n();
          ((n)localObject1).d((Cursor)localObject3);
          ((LinkedList)localObject2).add(localObject1);
        }
        while (((Cursor)localObject3).moveToNext());
      ((Cursor)localObject3).close();
      AppMethodBeat.o(111328);
    }
  }

  public final void bEu()
  {
    AppMethodBeat.i(111330);
    hY("GameRawMessage", "update GameRawMessage set isHidden = 0 where isHidden = 1");
    AppMethodBeat.o(111330);
  }

  public final void bEv()
  {
    AppMethodBeat.i(111331);
    String str = v(new int[] { 2, 5, 6, 10, 11, 100 });
    hY("GameRawMessage", "update GameRawMessage set isRead=1 where isRead=0 and " + str + " and isHidden = 0");
    AppMethodBeat.o(111331);
  }

  public final int bEw()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(111332);
    Object localObject = v(new int[] { 2, 5, 6, 10, 11, 100 });
    localObject = rawQuery("select count(*) from GameRawMessage where " + (String)localObject + " and isRead=0 and showInMsgList = 1 and isHidden = 0", new String[0]);
    if (localObject == null)
      AppMethodBeat.o(111332);
    while (true)
    {
      return j;
      j = i;
      if (((Cursor)localObject).moveToFirst())
        j = ((Cursor)localObject).getInt(0);
      ((Cursor)localObject).close();
      AppMethodBeat.o(111332);
    }
  }

  public final boolean d(long[] paramArrayOfLong)
  {
    boolean bool = false;
    AppMethodBeat.i(111329);
    if (paramArrayOfLong.length != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("msgId in (");
      for (int i = 0; i < paramArrayOfLong.length; i++)
      {
        localStringBuilder.append(paramArrayOfLong[i]);
        if (i != paramArrayOfLong.length - 1)
          localStringBuilder.append(",");
      }
      localStringBuilder.append(")");
      bool = hY("GameRawMessage", String.format("update GameRawMessage set isRead=1 where %s", new Object[] { localStringBuilder.toString() }));
      AppMethodBeat.o(111329);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(111329);
    }
  }

  public final n iP(long paramLong)
  {
    AppMethodBeat.i(111327);
    n localn = new n();
    localn.field_msgId = paramLong;
    if (b(localn, new String[0]))
      AppMethodBeat.o(111327);
    while (true)
    {
      return localn;
      localn = null;
      AppMethodBeat.o(111327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.r
 * JD-Core Version:    0.6.2
 */