package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ez;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g extends ez
{
  protected static c.a ccO;
  int bJt = -1;

  static
  {
    AppMethodBeat.i(25284);
    c.a locala = new c.a();
    locala.xDb = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "filename";
    locala.xDd.put("filename", "TEXT");
    localStringBuilder.append(" filename TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "user";
    locala.xDd.put("user", "TEXT");
    localStringBuilder.append(" user TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "msgid";
    locala.xDd.put("msgid", "LONG");
    localStringBuilder.append(" msgid LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "offset";
    locala.xDd.put("offset", "INTEGER");
    localStringBuilder.append(" offset INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "filenowsize";
    locala.xDd.put("filenowsize", "INTEGER");
    localStringBuilder.append(" filenowsize INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "totallen";
    locala.xDd.put("totallen", "INTEGER");
    localStringBuilder.append(" totallen INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "createtime";
    locala.xDd.put("createtime", "LONG");
    localStringBuilder.append(" createtime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "lastmodifytime";
    locala.xDd.put("lastmodifytime", "LONG");
    localStringBuilder.append(" lastmodifytime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "clientid";
    locala.xDd.put("clientid", "TEXT");
    localStringBuilder.append(" clientid TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "voicelenght";
    locala.xDd.put("voicelenght", "INTEGER");
    localStringBuilder.append(" voicelenght INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "msglocalid";
    locala.xDd.put("msglocalid", "INTEGER");
    localStringBuilder.append(" msglocalid INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "human";
    locala.xDd.put("human", "TEXT");
    localStringBuilder.append(" human TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "voiceformat";
    locala.xDd.put("voiceformat", "INTEGER");
    localStringBuilder.append(" voiceformat INTEGER");
    localStringBuilder.append(", ");
    locala.columns[14] = "nettimes";
    locala.xDd.put("nettimes", "INTEGER");
    localStringBuilder.append(" nettimes INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "reserved1";
    locala.xDd.put("reserved1", "INTEGER");
    localStringBuilder.append(" reserved1 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[16] = "reserved2";
    locala.xDd.put("reserved2", "TEXT");
    localStringBuilder.append(" reserved2 TEXT");
    locala.columns[17] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(25284);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean ame()
  {
    boolean bool1 = true;
    if (this.field_status > 1)
    {
      bool2 = bool1;
      if (this.field_status <= 3);
    }
    else
    {
      if (this.field_status != 8)
        break label33;
    }
    label33: for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.g
 * JD-Core Version:    0.6.2
 */