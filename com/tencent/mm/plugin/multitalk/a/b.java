package com.tencent.mm.plugin.multitalk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.da;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends da
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(54110);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "memberUuid";
    locala.xDd.put("memberUuid", "LONG");
    localStringBuilder.append(" memberUuid LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "wxGroupId";
    locala.xDd.put("wxGroupId", "TEXT");
    localStringBuilder.append(" wxGroupId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "userName";
    locala.xDd.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "inviteUserName";
    locala.xDd.put("inviteUserName", "TEXT");
    localStringBuilder.append(" inviteUserName TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "memberId";
    locala.xDd.put("memberId", "LONG");
    localStringBuilder.append(" memberId LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "createTime";
    locala.xDd.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(54110);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.a.b
 * JD-Core Version:    0.6.2
 */