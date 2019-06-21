package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fg;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ad extends fg
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(46916);
    c.a locala = new c.a();
    locala.xDb = new Field[9];
    locala.columns = new String[10];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "pref_key";
    locala.xDd.put("pref_key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" pref_key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "pref_key";
    locala.columns[1] = "pref_title";
    locala.xDd.put("pref_title", "TEXT");
    localStringBuilder.append(" pref_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "pref_url";
    locala.xDd.put("pref_url", "TEXT");
    localStringBuilder.append(" pref_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "is_show";
    locala.xDd.put("is_show", "INTEGER default '1' ");
    localStringBuilder.append(" is_show INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "pref_desc";
    locala.xDd.put("pref_desc", "TEXT");
    localStringBuilder.append(" pref_desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "logo_url";
    locala.xDd.put("logo_url", "TEXT");
    localStringBuilder.append(" logo_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "jump_type";
    locala.xDd.put("jump_type", "INTEGER");
    localStringBuilder.append(" jump_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "tinyapp_username";
    locala.xDd.put("tinyapp_username", "TEXT");
    localStringBuilder.append(" tinyapp_username TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "tinyapp_path";
    locala.xDd.put("tinyapp_path", "TEXT");
    localStringBuilder.append(" tinyapp_path TEXT");
    locala.columns[9] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46916);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ad
 * JD-Core Version:    0.6.2
 */