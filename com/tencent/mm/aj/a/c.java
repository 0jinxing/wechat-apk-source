package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.i;
import com.tencent.mm.g.c.aa;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c extends aa
{
  protected static c.a ccO;
  private Map<String, j> fxs;
  private List<String> fxt;

  static
  {
    AppMethodBeat.i(105495);
    c.a locala = new c.a();
    locala.xDb = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bizChatLocalId";
    locala.xDd.put("bizChatLocalId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" bizChatLocalId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "bizChatLocalId";
    locala.columns[1] = "bizChatServId";
    locala.xDd.put("bizChatServId", "TEXT");
    localStringBuilder.append(" bizChatServId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "brandUserName";
    locala.xDd.put("brandUserName", "TEXT default '' ");
    localStringBuilder.append(" brandUserName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "chatType";
    locala.xDd.put("chatType", "INTEGER");
    localStringBuilder.append(" chatType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "headImageUrl";
    locala.xDd.put("headImageUrl", "TEXT");
    localStringBuilder.append(" headImageUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "chatName";
    locala.xDd.put("chatName", "TEXT default '' ");
    localStringBuilder.append(" chatName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "chatNamePY";
    locala.xDd.put("chatNamePY", "TEXT default '' ");
    localStringBuilder.append(" chatNamePY TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "chatVersion";
    locala.xDd.put("chatVersion", "INTEGER default '-1' ");
    localStringBuilder.append(" chatVersion INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "needToUpdate";
    locala.xDd.put("needToUpdate", "INTEGER default 'true' ");
    localStringBuilder.append(" needToUpdate INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "bitFlag";
    locala.xDd.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "maxMemberCnt";
    locala.xDd.put("maxMemberCnt", "INTEGER default '0' ");
    localStringBuilder.append(" maxMemberCnt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "ownerUserId";
    locala.xDd.put("ownerUserId", "TEXT");
    localStringBuilder.append(" ownerUserId TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "userList";
    locala.xDd.put("userList", "TEXT");
    localStringBuilder.append(" userList TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "addMemberUrl";
    locala.xDd.put("addMemberUrl", "TEXT");
    localStringBuilder.append(" addMemberUrl TEXT");
    locala.columns[14] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(105495);
  }

  public c()
  {
    AppMethodBeat.i(105488);
    this.fxs = new HashMap();
    AppMethodBeat.o(105488);
  }

  private void rp(String paramString)
  {
    AppMethodBeat.i(105492);
    paramString = ((i)g.K(i.class)).cH(paramString);
    if (paramString != null)
      this.fxs.put(paramString.field_userId, paramString);
    AppMethodBeat.o(105492);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final List<String> afg()
  {
    AppMethodBeat.i(105489);
    Object localObject;
    if (this.fxt != null)
    {
      localObject = this.fxt;
      AppMethodBeat.o(105489);
    }
    while (true)
    {
      return localObject;
      localObject = this.field_userList;
      if (bo.isNullOrNil((String)localObject))
      {
        localObject = new LinkedList();
        AppMethodBeat.o(105489);
      }
      else
      {
        this.fxt = bo.P(((String)localObject).split(";"));
        localObject = this.fxt;
        AppMethodBeat.o(105489);
      }
    }
  }

  public final boolean afh()
  {
    boolean bool = true;
    AppMethodBeat.i(105494);
    if (this.field_needToUpdate)
      AppMethodBeat.o(105494);
    while (true)
    {
      return bool;
      if ((isGroup()) && (bo.isNullOrNil(this.field_userList)))
      {
        AppMethodBeat.o(105494);
      }
      else if ((bo.isNullOrNil(this.field_chatNamePY)) && (!bo.isNullOrNil(this.field_chatName)))
      {
        AppMethodBeat.o(105494);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(105494);
      }
    }
  }

  public final boolean isGroup()
  {
    AppMethodBeat.i(105493);
    boolean bool;
    if (this.field_bizChatServId == null)
    {
      bool = false;
      AppMethodBeat.o(105493);
    }
    while (true)
    {
      return bool;
      bool = this.field_bizChatServId.endsWith("@qy_g");
      AppMethodBeat.o(105493);
    }
  }

  public final boolean lc(int paramInt)
  {
    if ((this.field_bitFlag & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String mJ(String paramString)
  {
    AppMethodBeat.i(105490);
    paramString = ro(paramString);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(105490);
    }
    while (true)
    {
      return paramString;
      paramString = bo.bc(paramString.field_userName, "");
      AppMethodBeat.o(105490);
    }
  }

  public final j ro(String paramString)
  {
    AppMethodBeat.i(105491);
    if ((!this.fxs.containsKey(paramString)) || (this.fxs.get(paramString) == null))
    {
      long l = System.currentTimeMillis();
      rp(paramString);
      ab.d("MicroMsg.BaseBizChatInfo", "willen get userInfo use time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    if (this.fxs.containsKey(paramString))
    {
      paramString = (j)this.fxs.get(paramString);
      AppMethodBeat.o(105491);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(105491);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.c
 * JD-Core Version:    0.6.2
 */