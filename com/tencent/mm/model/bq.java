package com.tencent.mm.model;

import android.database.Cursor;
import android.database.MergeCursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bq
{
  private e bSd;
  private bd fnq;

  public bq(e parame, bd parambd)
  {
    this.bSd = parame;
    this.fnq = parambd;
  }

  private static String a(String paramString, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<String> paramArrayList3)
  {
    AppMethodBeat.i(16344);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" and (username in (");
    localStringBuffer.append("select chatroomname from chatroom where ");
    if ((paramArrayList2 != null) && (paramArrayList2.size() != 0))
    {
      paramArrayList2 = paramArrayList2.iterator();
      while (paramArrayList2.hasNext())
      {
        String str = (String)paramArrayList2.next();
        localStringBuffer.append("chatroomname != '" + str + "' and ");
      }
    }
    localStringBuffer.append("(memberlist like '%" + paramString + "%'");
    paramString = paramArrayList1.iterator();
    while (paramString.hasNext())
    {
      paramArrayList1 = (String)paramString.next();
      localStringBuffer.append(" or memberlist like '%" + paramArrayList1 + "%'");
    }
    if ((paramArrayList3 != null) && (paramArrayList3.size() != 0))
    {
      paramString = paramArrayList3.iterator();
      while (paramString.hasNext())
      {
        paramArrayList1 = (String)paramString.next();
        localStringBuffer.append(" or chatroomname = '" + paramArrayList1 + "'");
      }
    }
    localStringBuffer.append(")))");
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(16344);
    return paramString;
  }

  public final Cursor a(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(16340);
    paramString1 = a(paramString1, paramString2, paramList1, true, 2, paramList2);
    AppMethodBeat.o(16340);
    return paramString1;
  }

  public final Cursor a(String paramString1, String paramString2, List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(16339);
    paramString1 = a(paramString1, paramString2, paramList, paramBoolean, 1, null);
    AppMethodBeat.o(16339);
    return paramString1;
  }

  public final Cursor a(String paramString1, String paramString2, List<String> paramList1, boolean paramBoolean, int paramInt, List<String> paramList2)
  {
    AppMethodBeat.i(16342);
    Object localObject = "select * ,rowid from rcontact ";
    if (paramInt == 2)
      localObject = "select 2, *,rowid from rcontact ";
    paramString2 = (String)localObject + this.fnq.e(paramString2, null, paramList1) + this.fnq.aoV(paramString1) + this.fnq.aet();
    ab.v("Micro.SimpleSearchConversationModel", paramString2);
    paramString2 = this.bSd.rawQuery(paramString2, null);
    ArrayList localArrayList;
    if (paramBoolean)
    {
      localArrayList = new ArrayList();
      localObject = new ArrayList();
      while (paramString2.moveToNext())
      {
        String str = paramString2.getString(paramString2.getColumnIndex("username"));
        if (!t.kH(str))
          localArrayList.add(str);
        else
          ((ArrayList)localObject).add(str);
      }
      if ((paramList2 != null) && (paramList2.size() != 0))
        localArrayList.addAll(paramList2);
      if (localArrayList.size() == 0);
    }
    for (paramString1 = new MergeCursor(new Cursor[] { paramString2, a(paramString1, localArrayList, (ArrayList)localObject, null, paramList1) }); ; paramString1 = paramString2)
    {
      AppMethodBeat.o(16342);
      return paramString1;
    }
  }

  public final Cursor a(String paramString, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<String> paramArrayList3, List<String> paramList)
  {
    AppMethodBeat.i(16343);
    paramString = "select * ,rowid from rcontact " + this.fnq.e("@all.contact.android", "", paramList) + a(paramString, paramArrayList1, paramArrayList2, paramArrayList3) + this.fnq.aet();
    ab.v("Micro.SimpleSearchConversationModel", "roomsSql ".concat(String.valueOf(paramString)));
    paramString = this.bSd.rawQuery(paramString, null);
    AppMethodBeat.o(16343);
    return paramString;
  }

  public final Cursor b(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(16341);
    paramString1 = a(paramString1, paramString2, paramList1, true, 2, paramList2);
    AppMethodBeat.o(16341);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bq
 * JD-Core Version:    0.6.2
 */