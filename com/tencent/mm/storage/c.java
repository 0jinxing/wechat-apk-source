package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.d;
import com.tencent.mm.model.c.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends d
  implements Serializable
{
  protected static c.a ccO;
  private Map<String, String> xHN = null;

  static
  {
    AppMethodBeat.i(118211);
    c.a locala = new c.a();
    locala.xDb = new Field[9];
    locala.columns = new String[10];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "layerId";
    locala.xDd.put("layerId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" layerId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "layerId";
    locala.columns[1] = "business";
    locala.xDd.put("business", "TEXT");
    localStringBuilder.append(" business TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "expId";
    locala.xDd.put("expId", "TEXT");
    localStringBuilder.append(" expId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sequence";
    locala.xDd.put("sequence", "LONG");
    localStringBuilder.append(" sequence LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "prioritylevel";
    locala.xDd.put("prioritylevel", "INTEGER default '0' ");
    localStringBuilder.append(" prioritylevel INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "startTime";
    locala.xDd.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "endTime";
    locala.xDd.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "needReport";
    locala.xDd.put("needReport", "INTEGER");
    localStringBuilder.append(" needReport INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "rawXML";
    locala.xDd.put("rawXML", "TEXT default '' ");
    localStringBuilder.append(" rawXML TEXT default '' ");
    locala.columns[9] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(118211);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final Map<String, String> dru()
  {
    AppMethodBeat.i(118210);
    if (this.xHN == null)
      this.xHN = a.pc(this.field_rawXML);
    Map localMap = this.xHN;
    AppMethodBeat.o(118210);
    return localMap;
  }

  public final boolean isValid()
  {
    AppMethodBeat.i(118209);
    long l = bo.anT();
    boolean bool;
    if ((l >= this.field_startTime) && (l <= this.field_endTime))
    {
      bool = true;
      AppMethodBeat.o(118209);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118209);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.c
 * JD-Core Version:    0.6.2
 */