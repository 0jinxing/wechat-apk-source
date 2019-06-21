package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ac;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;

public final class j extends ac
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(105497);
    c.a locala = new c.a();
    locala.xDb = new Field[10];
    locala.columns = new String[11];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userId";
    locala.xDd.put("userId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" userId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "userId";
    locala.columns[1] = "userName";
    locala.xDd.put("userName", "TEXT default '' ");
    localStringBuilder.append(" userName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "userNamePY";
    locala.xDd.put("userNamePY", "TEXT default '' ");
    localStringBuilder.append(" userNamePY TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "brandUserName";
    locala.xDd.put("brandUserName", "TEXT default '' ");
    localStringBuilder.append(" brandUserName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "UserVersion";
    locala.xDd.put("UserVersion", "INTEGER default '-1' ");
    localStringBuilder.append(" UserVersion INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "needToUpdate";
    locala.xDd.put("needToUpdate", "INTEGER default 'true' ");
    localStringBuilder.append(" needToUpdate INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "headImageUrl";
    locala.xDd.put("headImageUrl", "TEXT");
    localStringBuilder.append(" headImageUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "profileUrl";
    locala.xDd.put("profileUrl", "TEXT");
    localStringBuilder.append(" profileUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "bitFlag";
    locala.xDd.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "addMemberUrl";
    locala.xDd.put("addMemberUrl", "TEXT");
    localStringBuilder.append(" addMemberUrl TEXT");
    locala.columns[10] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(105497);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean afh()
  {
    boolean bool = true;
    AppMethodBeat.i(105496);
    if (this.field_needToUpdate)
      AppMethodBeat.o(105496);
    while (true)
    {
      return bool;
      if ((bo.isNullOrNil(this.field_profileUrl)) && (bo.isNullOrNil(this.field_headImageUrl)))
      {
        AppMethodBeat.o(105496);
      }
      else if ((bo.isNullOrNil(this.field_userNamePY)) && (!bo.isNullOrNil(this.field_userName)))
      {
        AppMethodBeat.o(105496);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(105496);
      }
    }
  }

  public final boolean lc(int paramInt)
  {
    if ((this.field_bitFlag & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.j
 * JD-Core Version:    0.6.2
 */