package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cu;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n extends cu
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(46784);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "title";
    locala.xDd.put("title", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" title TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "title";
    locala.columns[1] = "loan_jump_url";
    locala.xDd.put("loan_jump_url", "TEXT");
    localStringBuilder.append(" loan_jump_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "red_dot_index";
    locala.xDd.put("red_dot_index", "INTEGER");
    localStringBuilder.append(" red_dot_index INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "is_show_entry";
    locala.xDd.put("is_show_entry", "INTEGER");
    localStringBuilder.append(" is_show_entry INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "tips";
    locala.xDd.put("tips", "TEXT");
    localStringBuilder.append(" tips TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "is_overdue";
    locala.xDd.put("is_overdue", "INTEGER");
    localStringBuilder.append(" is_overdue INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "available_otb";
    locala.xDd.put("available_otb", "TEXT");
    localStringBuilder.append(" available_otb TEXT");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46784);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.n
 * JD-Core Version:    0.6.2
 */