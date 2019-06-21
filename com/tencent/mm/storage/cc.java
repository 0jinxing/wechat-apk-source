package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fa;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;

public final class cc extends fa
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(116823);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.xDd.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "msgId";
    locala.columns[1] = "cmsgId";
    locala.xDd.put("cmsgId", "TEXT");
    localStringBuilder.append(" cmsgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "content";
    locala.xDd.put("content", "TEXT default '' ");
    localStringBuilder.append(" content TEXT default '' ");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(116823);
  }

  public final c.a Ag()
  {
    return null;
  }

  public final void aqa(String paramString)
  {
    AppMethodBeat.i(116822);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(116822);
    while (true)
    {
      return;
      this.field_cmsgId = paramString;
      AppMethodBeat.o(116822);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cc
 * JD-Core Version:    0.6.2
 */