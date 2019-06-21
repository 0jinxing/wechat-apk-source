package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.en;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class t extends en
{
  protected static c.a ccO;
  public int rfJ;

  static
  {
    AppMethodBeat.i(38004);
    c.a locala = new c.a();
    locala.xDb = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "tagId";
    locala.xDd.put("tagId", "LONG default '0' ");
    localStringBuilder.append(" tagId LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "tagName";
    locala.xDd.put("tagName", "TEXT default '' ");
    localStringBuilder.append(" tagName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "count";
    locala.xDd.put("count", "INTEGER default '0' ");
    localStringBuilder.append(" count INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "memberList";
    locala.xDd.put("memberList", "TEXT default '' ");
    localStringBuilder.append(" memberList TEXT default '' ");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(38004);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(38003);
    super.d(paramCursor);
    this.rfJ = ((int)this.xDa);
    AppMethodBeat.o(38003);
  }

  public final void jdMethod_do(List<bts> paramList)
  {
    AppMethodBeat.i(38002);
    this.field_memberList = "";
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (bts)localIterator.next();
      this.field_memberList = (this.field_memberList + paramList.wVI + ",");
    }
    AppMethodBeat.o(38002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.t
 * JD-Core Version:    0.6.2
 */