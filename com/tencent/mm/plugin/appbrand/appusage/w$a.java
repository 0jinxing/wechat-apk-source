package com.tencent.mm.plugin.appbrand.appusage;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.m;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

final class w$a extends m
{
  static final c.a fjX;
  static final String[] gSr;

  static
  {
    AppMethodBeat.i(129673);
    gSr = new String[] { "brandId", "versionType", "scene" };
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "recordId";
    locala.xDd.put("recordId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" recordId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "recordId";
    locala.columns[1] = "brandId";
    locala.xDd.put("brandId", "TEXT");
    localStringBuilder.append(" brandId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "versionType";
    locala.xDd.put("versionType", "INTEGER");
    localStringBuilder.append(" versionType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "updateTime";
    locala.xDd.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "scene";
    locala.xDd.put("scene", "INTEGER");
    localStringBuilder.append(" scene INTEGER");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(129673);
  }

  public final c.a Ag()
  {
    return fjX;
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(129672);
    this.xDa = 0L;
    ContentValues localContentValues = super.Hl();
    int i = w.A(this.field_brandId, this.field_versionType, this.field_scene);
    this.field_recordId = i;
    localContentValues.put("recordId", Integer.valueOf(i));
    AppMethodBeat.o(129672);
    return localContentValues;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.w.a
 * JD-Core Version:    0.6.2
 */