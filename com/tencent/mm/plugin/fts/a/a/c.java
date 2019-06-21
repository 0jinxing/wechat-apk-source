package com.tencent.mm.plugin.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bq;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends bq
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(114237);
    c.a locala = new c.a();
    locala.xDb = new Field[12];
    locala.columns = new String[13];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "featureId";
    locala.xDd.put("featureId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" featureId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "featureId";
    locala.columns[1] = "title";
    locala.xDd.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "titlePY";
    locala.xDd.put("titlePY", "TEXT");
    localStringBuilder.append(" titlePY TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "titleShortPY";
    locala.xDd.put("titleShortPY", "TEXT");
    localStringBuilder.append(" titleShortPY TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "tag";
    locala.xDd.put("tag", "TEXT");
    localStringBuilder.append(" tag TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "actionType";
    locala.xDd.put("actionType", "INTEGER default '0' ");
    localStringBuilder.append(" actionType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "url";
    locala.xDd.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "helpUrl";
    locala.xDd.put("helpUrl", "TEXT");
    localStringBuilder.append(" helpUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "updateUrl";
    locala.xDd.put("updateUrl", "TEXT");
    localStringBuilder.append(" updateUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "androidUrl";
    locala.xDd.put("androidUrl", "TEXT");
    localStringBuilder.append(" androidUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "iconPath";
    locala.xDd.put("iconPath", "TEXT");
    localStringBuilder.append(" iconPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "timestamp";
    locala.xDd.put("timestamp", "LONG default '0' ");
    localStringBuilder.append(" timestamp LONG default '0' ");
    locala.columns[12] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(114237);
  }

  public c()
  {
    this.field_featureId = 0;
    this.field_title = "";
    this.field_titlePY = "";
    this.field_titleShortPY = "";
    this.field_tag = "";
    this.field_actionType = 0;
    this.field_url = "";
    this.field_helpUrl = "";
    this.field_updateUrl = "";
    this.field_androidUrl = "";
    this.field_iconPath = "";
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String toString()
  {
    AppMethodBeat.i(114236);
    String str = "Feature [field_featureId=" + this.field_featureId + ", field_title=" + this.field_title + ", field_titlePY=" + this.field_titlePY + ", field_titleShortPY=" + this.field_titleShortPY + ", field_tag=" + this.field_tag + ", field_actionType=" + this.field_actionType + ", field_url=" + this.field_url + ", field_helpUrl=" + this.field_helpUrl + ", field_updateUrl=" + this.field_updateUrl + ", field_androidUrl=" + this.field_androidUrl + ", field_iconPath=" + this.field_iconPath + "]";
    AppMethodBeat.o(114236);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.c
 * JD-Core Version:    0.6.2
 */