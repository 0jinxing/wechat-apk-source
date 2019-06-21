package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ak;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k extends ak
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(87842);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "code_id";
    locala.xDd.put("code_id", "TEXT");
    localStringBuilder.append(" code_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "card_id";
    locala.xDd.put("card_id", "TEXT");
    localStringBuilder.append(" card_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "code";
    locala.xDd.put("code", "TEXT");
    localStringBuilder.append(" code TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(87842);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.k
 * JD-Core Version:    0.6.2
 */