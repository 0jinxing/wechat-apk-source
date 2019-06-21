package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.n.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class br
{
  private e bSd;
  private be fnr;

  public br(e parame, be parambe)
  {
    this.bSd = parame;
    this.fnr = parambe;
  }

  private String oI(String paramString)
  {
    AppMethodBeat.i(16346);
    Object localObject1 = new ArrayList();
    Object localObject2 = "select username from rcontact where (username like '%" + paramString + "%' or nickname like '%" + paramString + "%' or alias like '%" + paramString + "%' or pyInitial like '%" + paramString + "%' or quanPin like '%" + paramString + "%' or conRemark like '%" + paramString + "%' )and username not like '%@%' and type & " + a.NW() + "=0 ";
    Object localObject3 = this.bSd.a((String)localObject2, null, 2);
    ab.v("Micro.SimpleSearchConversationModel", "contactsql %s", new Object[] { localObject2 });
    while (((Cursor)localObject3).moveToNext())
    {
      localObject2 = ((Cursor)localObject3).getString(((Cursor)localObject3).getColumnIndex("username"));
      if (!((String)localObject2).endsWith("@chatroom"))
        ((ArrayList)localObject1).add(localObject2);
    }
    ((Cursor)localObject3).close();
    if (((ArrayList)localObject1).size() != 0)
    {
      localObject3 = new StringBuffer();
      ((StringBuffer)localObject3).append(" ( rconversation.username in ( select chatroomname from chatroom where ");
      ((StringBuffer)localObject3).append("memberlist like '%" + paramString + "%'");
      localObject2 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        ((StringBuffer)localObject3).append(" or memberlist like '%" + (String)localObject1 + "%'");
      }
      ((StringBuffer)localObject3).append("))");
    }
    for (localObject1 = "" + ((StringBuffer)localObject3).toString() + " or "; ; localObject1 = "")
    {
      paramString = " and ( rconversation.username like '%" + paramString + "%' or " + (String)localObject1 + "rconversation.content like '%" + paramString + "%' or rcontact.nickname like '%" + paramString + "%' or rcontact.alias like '%" + paramString + "%' or rcontact.pyInitial like '%" + paramString + "%' or rcontact.quanPin like '%" + paramString + "%' or rcontact.conRemark like '%" + paramString + "%'  ) ";
      AppMethodBeat.o(16346);
      return paramString;
    }
  }

  public final Cursor b(String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(16345);
    String str1 = " ";
    String str2 = str1;
    if (paramString2 != null)
    {
      str2 = str1;
      if (paramString2.length() > 0)
        str2 = " and rconversation.username = rcontact.username ";
    }
    str1 = "select 1,unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rcontact.nickname from rconversation," + "rcontact" + " " + " where rconversation.username = rcontact.username" + str2 + bo.nullAsNil(paramString1);
    str2 = "";
    paramString1 = str2;
    if (paramList != null)
    {
      paramString1 = str2;
      if (paramList.size() > 0)
      {
        paramList = paramList.iterator();
        for (paramString1 = ""; paramList.hasNext(); paramString1 = paramString1 + " and rconversation.username != '" + str2 + "'")
          str2 = (String)paramList.next();
      }
    }
    paramList = str1 + paramString1;
    paramString1 = paramList;
    if (paramString2 != null)
    {
      paramString1 = paramList;
      if (paramString2.length() > 0)
        paramString1 = paramList + oI(paramString2);
    }
    paramString1 = paramString1 + " order by ";
    paramString1 = paramString1 + "rconversation.username like '%@chatroom' asc, ";
    paramString1 = paramString1 + "flag desc, conversationTime desc";
    ab.v("Micro.SimpleSearchConversationModel", "convsql %s", new Object[] { paramString1 });
    paramString1 = this.bSd.rawQuery(paramString1, null);
    AppMethodBeat.o(16345);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.br
 * JD-Core Version:    0.6.2
 */