package com.tencent.mm.storage;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.model.ag;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class v extends j<u>
  implements g.a, ag
{
  public static final String[] diI;
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(1077);
    fnj = new String[] { j.a(u.ccO, "chatroom") };
    diI = new String[] { "CREATE INDEX IF NOT EXISTS serverChatRoomUserIndex ON chatroom ( chatroomname )" };
    AppMethodBeat.o(1077);
  }

  public v(e parame)
  {
    super(parame, u.ccO, "chatroom", diI);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    return 0;
  }

  public final String mJ(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1072);
    boolean bool;
    Cursor localCursor;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = "select displayname from chatroom where chatroomname='" + bo.vA(paramString) + "'";
      localCursor = this.bSd.a(paramString, null, 2);
      if (!localCursor.moveToFirst())
        break label124;
      paramString = new u();
      paramString.d(localCursor);
    }
    while (true)
    {
      localCursor.close();
      if (paramString == null)
      {
        AppMethodBeat.o(1072);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        bool = false;
        break;
        paramString = paramString.field_displayname;
        AppMethodBeat.o(1072);
      }
      label124: paramString = null;
    }
  }

  public final void n(String paramString, long paramLong)
  {
    AppMethodBeat.i(1068);
    paramString = "update chatroom set modifytime = " + paramLong + " where chatroomname = '" + bo.vA(paramString) + "'";
    this.bSd.hY("chatroom", paramString);
    AppMethodBeat.o(1068);
  }

  public final u oa(String paramString)
  {
    AppMethodBeat.i(1066);
    u localu = new u();
    localu.field_chatroomname = paramString;
    if (super.b(localu, new String[] { "chatroomname" }))
    {
      AppMethodBeat.o(1066);
      paramString = localu;
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(1066);
    }
  }

  public final u ob(String paramString)
  {
    AppMethodBeat.i(1067);
    u localu = new u();
    localu.field_chatroomname = paramString;
    if (super.b(localu, new String[] { "chatroomname" }))
      AppMethodBeat.o(1067);
    while (true)
    {
      return localu;
      AppMethodBeat.o(1067);
    }
  }

  public final String oc(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1069);
    if (paramString.length() > 0);
    Cursor localCursor;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "select roomowner from chatroom where chatroomname='" + bo.vA(paramString) + "'";
      localCursor = this.bSd.a(paramString, null, 2);
      if (localCursor != null)
        break;
      ab.e("MicroMsg.ChatroomStorage", "getChatroomOwner fail, cursor is null");
      AppMethodBeat.o(1069);
      paramString = localObject;
      return paramString;
    }
    if (localCursor.moveToFirst())
    {
      paramString = new u();
      paramString.d(localCursor);
    }
    while (true)
    {
      localCursor.close();
      if (paramString == null)
      {
        AppMethodBeat.o(1069);
        paramString = localObject;
        break;
      }
      paramString = paramString.field_roomowner;
      AppMethodBeat.o(1069);
      break;
      paramString = null;
    }
  }

  public final String od(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1070);
    boolean bool;
    Cursor localCursor;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = "select memberlist from chatroom where chatroomname='" + bo.vA(paramString) + "'";
      localCursor = this.bSd.a(paramString, null, 2);
      if (!localCursor.moveToFirst())
        break label124;
      paramString = new u();
      paramString.d(localCursor);
    }
    while (true)
    {
      localCursor.close();
      if (paramString == null)
      {
        AppMethodBeat.o(1070);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        bool = false;
        break;
        paramString = paramString.field_memberlist;
        AppMethodBeat.o(1070);
      }
      label124: paramString = null;
    }
  }

  public final List<String> oe(String paramString)
  {
    AppMethodBeat.i(1073);
    Object localObject = od(paramString);
    if (localObject == null)
    {
      paramString = null;
      AppMethodBeat.o(1073);
    }
    while (true)
    {
      return paramString;
      paramString = new LinkedList();
      if (!((String)localObject).equals(""))
      {
        localObject = ((String)localObject).split(";");
        for (int i = 0; i < localObject.length; i++)
          paramString.add(localObject[i]);
      }
      AppMethodBeat.o(1073);
    }
  }

  public final boolean of(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1074);
    paramString = "select * from chatroom where chatroomname='" + bo.vA(paramString) + "'";
    Cursor localCursor = this.bSd.a(paramString, null, 2);
    paramString = localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new u();
      paramString.d(localCursor);
    }
    localCursor.close();
    boolean bool;
    if ((paramString != null) && ((paramString.field_roomflag & 0x1) == 0))
    {
      bool = true;
      AppMethodBeat.o(1074);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1074);
    }
  }

  public final boolean og(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(1075);
    if (paramString.length() > 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (this.bSd.delete("chatroom", "chatroomname=?", new String[] { paramString }) != 0)
        break label60;
      AppMethodBeat.o(1075);
    }
    for (boolean bool2 = bool1; ; bool2 = true)
    {
      return bool2;
      bool2 = false;
      break;
      label60: anF(paramString);
      AppMethodBeat.o(1075);
    }
  }

  public final int oh(String paramString)
  {
    u localu = null;
    int i = 0;
    AppMethodBeat.i(1071);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(1071);
    while (true)
    {
      return i;
      long l = System.currentTimeMillis();
      try
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("select memberCount from chatroom where chatroomname='");
        localObject = bo.vA(paramString) + "'";
        localObject = this.bSd.a((String)localObject, null, 2);
        if (((Cursor)localObject).moveToFirst())
        {
          localu = new com/tencent/mm/storage/u;
          localu.<init>();
          localu.d((Cursor)localObject);
        }
        ((Cursor)localObject).close();
        if (localu == null)
        {
          ab.i("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(1071);
        }
        else
        {
          if (localu.field_memberCount < 0)
          {
            i = od(paramString).split(";").length;
            localu.field_memberCount = i;
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("update chatroom set memberCount = ");
            localObject = i + " where chatroomname = '" + bo.vA(paramString) + "'";
            this.bSd.hY("chatroom", (String)localObject);
            ab.i("MicroMsg.ChatroomStorage", "[getMemberCount] init field_memberCount! username:%s count:%s", new Object[] { paramString, Integer.valueOf(i) });
          }
          i = localu.field_memberCount;
          ab.i("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(1071);
        }
      }
      finally
      {
        ab.i("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(1071);
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.v
 * JD-Core Version:    0.6.2
 */