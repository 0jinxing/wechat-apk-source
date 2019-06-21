package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ei;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class r extends ei
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(62888);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.xDd.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "key";
    locala.columns[1] = "position";
    locala.xDd.put("position", "INTEGER");
    localStringBuilder.append(" position INTEGER");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(62888);
  }

  public r()
  {
  }

  public r(int paramInt, String paramString)
  {
    this.field_position = paramInt;
    this.field_key = paramString;
  }

  public final c.a Ag()
  {
    return null;
  }

  public final String toString()
  {
    AppMethodBeat.i(62887);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("index:").append(this.field_position);
    ((StringBuilder)localObject).append("key  :").append(this.field_key);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(62887);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.r
 * JD-Core Version:    0.6.2
 */