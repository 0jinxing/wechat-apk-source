package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.eu;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class bv extends eu
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(60239);
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "encryptUsername";
    locala.xDd.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" encryptUsername TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "encryptUsername";
    locala.columns[1] = "conRemark";
    locala.xDd.put("conRemark", "TEXT default '' ");
    localStringBuilder.append(" conRemark TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "contactLabels";
    locala.xDd.put("contactLabels", "TEXT default '' ");
    localStringBuilder.append(" contactLabels TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "conDescription";
    locala.xDd.put("conDescription", "TEXT default '' ");
    localStringBuilder.append(" conDescription TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "conPhone";
    locala.xDd.put("conPhone", "TEXT default '' ");
    localStringBuilder.append(" conPhone TEXT default '' ");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(60239);
  }

  public bv()
  {
    AppMethodBeat.i(60237);
    this.field_encryptUsername = "";
    this.field_conRemark = "";
    AppMethodBeat.o(60237);
  }

  public bv(String paramString)
  {
    this();
    AppMethodBeat.i(60235);
    this.field_conRemark = "";
    String str = paramString;
    if (paramString == null)
      str = "";
    this.field_encryptUsername = str;
    AppMethodBeat.o(60235);
  }

  public bv(String paramString1, String paramString2)
  {
    this();
    AppMethodBeat.i(60236);
    String str = paramString1;
    if (paramString1 == null)
      str = "";
    this.field_encryptUsername = str;
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = "";
    this.field_conRemark = paramString1;
    AppMethodBeat.o(60236);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String Hr()
  {
    return this.field_conRemark;
  }

  public final String Hv()
  {
    return this.field_encryptUsername;
  }

  protected final Object clone()
  {
    AppMethodBeat.i(60238);
    Object localObject = super.clone();
    AppMethodBeat.o(60238);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bv
 * JD-Core Version:    0.6.2
 */