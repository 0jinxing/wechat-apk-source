package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bb;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends bb
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(62793);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "md5_lang";
    locala.xDd.put("md5_lang", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5_lang TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.xDc = "md5_lang";
    locala.columns[1] = "md5";
    locala.xDd.put("md5", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.columns[2] = "lang";
    locala.xDd.put("lang", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" lang TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.columns[3] = "desc";
    locala.xDd.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "groupId";
    locala.xDd.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "click_flag";
    locala.xDd.put("click_flag", "INTEGER");
    localStringBuilder.append(" click_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "download_flag";
    locala.xDd.put("download_flag", "INTEGER");
    localStringBuilder.append(" download_flag INTEGER");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(62793);
  }

  public final c.a Ag()
  {
    return null;
  }

  public final String Aq()
  {
    if (this.field_md5 == null);
    for (String str = ""; ; str = this.field_md5)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.b
 * JD-Core Version:    0.6.2
 */