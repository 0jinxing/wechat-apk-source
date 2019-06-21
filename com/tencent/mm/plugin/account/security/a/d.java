package com.tencent.mm.plugin.account.security.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dz;
import com.tencent.mm.protocal.protobuf.aza;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class d extends dz
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(69835);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "uid";
    locala.xDd.put("uid", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" uid TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "uid";
    locala.columns[1] = "name";
    locala.xDd.put("name", "TEXT default '' ");
    localStringBuilder.append(" name TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "devicetype";
    locala.xDd.put("devicetype", "TEXT default '' ");
    localStringBuilder.append(" devicetype TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "createtime";
    locala.xDd.put("createtime", "LONG default '0' ");
    localStringBuilder.append(" createtime LONG default '0' ");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(69835);
  }

  public d()
  {
    this.field_uid = "0";
    this.field_name = "";
    this.field_devicetype = "";
    this.field_createtime = 0L;
  }

  public d(aza paramaza)
  {
    AppMethodBeat.i(69834);
    this.field_uid = paramaza.eCq;
    this.field_devicetype = paramaza.devicetype;
    this.field_name = paramaza.devicename;
    this.field_createtime = paramaza.wCN;
    AppMethodBeat.o(69834);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.a.d
 * JD-Core Version:    0.6.2
 */