package com.tencent.mm.plugin.forcenotify.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bs;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.storage.ad;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends bs
{
  public static c.a ccO;
  public ad ehM = null;

  static
  {
    AppMethodBeat.i(51017);
    c.a locala = new c.a();
    locala.xDb = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "ForcePushId";
    locala.xDd.put("ForcePushId", "TEXT");
    localStringBuilder.append(" ForcePushId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "CreateTime";
    locala.xDd.put("CreateTime", "LONG");
    localStringBuilder.append(" CreateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "ExpiredTime";
    locala.xDd.put("ExpiredTime", "LONG");
    localStringBuilder.append(" ExpiredTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "Description";
    locala.xDd.put("Description", "TEXT");
    localStringBuilder.append(" Description TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "UserIcon";
    locala.xDd.put("UserIcon", "TEXT");
    localStringBuilder.append(" UserIcon TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "UserName";
    locala.xDd.put("UserName", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" UserName TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "UserName";
    locala.columns[6] = "Extinfo";
    locala.xDd.put("Extinfo", "TEXT");
    localStringBuilder.append(" Extinfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "Status";
    locala.xDd.put("Status", "INTEGER default '0' ");
    localStringBuilder.append(" Status INTEGER default '0' ");
    locala.columns[8] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(51017);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean bxX()
  {
    AppMethodBeat.i(51015);
    boolean bool;
    if (cb.aaD() >= this.field_ExpiredTime)
    {
      bool = true;
      AppMethodBeat.o(51015);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51015);
    }
  }

  public final boolean isEnable()
  {
    boolean bool = true;
    if (this.field_Status == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(51016);
    String str = this.field_ForcePushId + " " + this.field_UserName + " " + this.field_CreateTime + " " + this.field_ExpiredTime + " " + this.field_Status;
    AppMethodBeat.o(51016);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.c.b
 * JD-Core Version:    0.6.2
 */