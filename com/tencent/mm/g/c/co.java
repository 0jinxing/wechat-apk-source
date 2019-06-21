package com.tencent.mm.g.c;

import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class co extends c
{
  private static final int dGp = "logId".hashCode();
  private static final int dGq = "liftTime".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private boolean dGn = true;
  private boolean dGo = true;
  public long field_liftTime;
  public int field_logId;

  public static c.a Hm()
  {
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "logId";
    locala.xDd.put("logId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" logId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "logId";
    locala.columns[1] = "liftTime";
    locala.xDd.put("liftTime", "LONG");
    localStringBuilder.append(" liftTime LONG");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.co
 * JD-Core Version:    0.6.2
 */