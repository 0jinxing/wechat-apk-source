package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dk;
import com.tencent.mm.protocal.protobuf.ok;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ak extends dk
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(87927);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "cardUserId";
    locala.xDd.put("cardUserId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" cardUserId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "cardUserId";
    locala.columns[1] = "retryCount";
    locala.xDd.put("retryCount", "INTEGER");
    localStringBuilder.append(" retryCount INTEGER");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(87927);
  }

  public static ak b(ok paramok)
  {
    AppMethodBeat.i(87926);
    ak localak = new ak();
    localak.field_cardUserId = paramok.vUK;
    AppMethodBeat.o(87926);
    return localak;
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (!(paramObject instanceof ak));
    while (true)
    {
      return bool;
      paramObject = (ak)paramObject;
      if (this.field_cardUserId == paramObject.field_cardUserId)
        bool = true;
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(87925);
    int i;
    if (this.field_cardUserId == null)
    {
      i = 0;
      AppMethodBeat.o(87925);
    }
    while (true)
    {
      return i;
      i = this.field_cardUserId.hashCode();
      AppMethodBeat.o(87925);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ak
 * JD-Core Version:    0.6.2
 */