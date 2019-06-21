package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bc;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e extends bc
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(62846);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "groupID";
    locala.xDd.put("groupID", "TEXT");
    localStringBuilder.append(" groupID TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "desc";
    locala.xDd.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(62846);
  }

  public e()
  {
  }

  public e(String paramString1, String paramString2)
  {
    this.field_groupID = paramString1;
    this.field_desc = paramString2;
  }

  public final c.a Ag()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.e
 * JD-Core Version:    0.6.2
 */