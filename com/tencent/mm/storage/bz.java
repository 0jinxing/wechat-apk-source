package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ex;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class bz extends ex
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(29070);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "openId";
    locala.xDd.put("openId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" openId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "openId";
    locala.columns[1] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "username";
    locala.xDd.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(29070);
  }

  public bz()
  {
  }

  public bz(String paramString1, String paramString2, String paramString3)
  {
    this.field_appId = paramString1;
    this.field_username = paramString2;
    this.field_openId = paramString3;
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bz
 * JD-Core Version:    0.6.2
 */