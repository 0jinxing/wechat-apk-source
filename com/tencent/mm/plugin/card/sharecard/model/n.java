package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ef;
import com.tencent.mm.protocal.protobuf.byy;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n extends ef
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(88086);
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.xDd.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "card_id";
    locala.columns[1] = "state_flag";
    locala.xDd.put("state_flag", "INTEGER");
    localStringBuilder.append(" state_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "update_time";
    locala.xDd.put("update_time", "LONG");
    localStringBuilder.append(" update_time LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "seq";
    locala.xDd.put("seq", "LONG");
    localStringBuilder.append(" seq LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "retryCount";
    locala.xDd.put("retryCount", "INTEGER");
    localStringBuilder.append(" retryCount INTEGER");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(88086);
  }

  public static n c(byy parambyy)
  {
    AppMethodBeat.i(88085);
    n localn = new n();
    localn.field_card_id = parambyy.cMC;
    localn.field_update_time = parambyy.vWx;
    localn.field_state_flag = parambyy.kfy;
    localn.field_seq = parambyy.wYf;
    localn.field_retryCount = 10;
    AppMethodBeat.o(88085);
    return localn;
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (!(paramObject instanceof n));
    while (true)
    {
      return bool;
      paramObject = (n)paramObject;
      if (this.field_card_id == paramObject.field_card_id)
        bool = true;
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(88084);
    int i;
    if (this.field_card_id == null)
    {
      i = 0;
      AppMethodBeat.o(88084);
    }
    while (true)
    {
      return i;
      i = this.field_card_id.hashCode();
      AppMethodBeat.o(88084);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.n
 * JD-Core Version:    0.6.2
 */