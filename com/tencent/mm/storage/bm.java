package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dc;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class bm extends dc
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(80286);
    c.a locala = new c.a();
    locala.xDb = new Field[13];
    locala.columns = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "tipId";
    locala.xDd.put("tipId", "INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(" tipId INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "tipId";
    locala.columns[1] = "tipVersion";
    locala.xDd.put("tipVersion", "INTEGER");
    localStringBuilder.append(" tipVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "tipkey";
    locala.xDd.put("tipkey", "TEXT");
    localStringBuilder.append(" tipkey TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "tipType";
    locala.xDd.put("tipType", "INTEGER");
    localStringBuilder.append(" tipType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "isExit";
    locala.xDd.put("isExit", "INTEGER");
    localStringBuilder.append(" isExit INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "hadRead";
    locala.xDd.put("hadRead", "INTEGER");
    localStringBuilder.append(" hadRead INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "isReject";
    locala.xDd.put("isReject", "INTEGER");
    localStringBuilder.append(" isReject INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "beginShowTime";
    locala.xDd.put("beginShowTime", "LONG");
    localStringBuilder.append(" beginShowTime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "disappearTime";
    locala.xDd.put("disappearTime", "LONG");
    localStringBuilder.append(" disappearTime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "overdueTime";
    locala.xDd.put("overdueTime", "LONG");
    localStringBuilder.append(" overdueTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "tipsShowInfo";
    locala.xDd.put("tipsShowInfo", "BLOB");
    localStringBuilder.append(" tipsShowInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[11] = "extInfo";
    locala.xDd.put("extInfo", "TEXT");
    localStringBuilder.append(" extInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "pagestaytime";
    locala.xDd.put("pagestaytime", "LONG");
    localStringBuilder.append(" pagestaytime LONG");
    locala.columns[13] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(80286);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bm
 * JD-Core Version:    0.6.2
 */