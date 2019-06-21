package com.tencent.mm.openim.e;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class d extends j<c>
{
  public static final String[] fnj;
  public h fni;

  static
  {
    AppMethodBeat.i(78989);
    fnj = new String[] { j.a(c.ccO, "OpenIMAppIdInfo") };
    AppMethodBeat.o(78989);
  }

  public d(h paramh)
  {
    super(paramh, c.ccO, "OpenIMAppIdInfo", null);
    this.fni = paramh;
  }

  public final boolean a(c paramc)
  {
    AppMethodBeat.i(78986);
    paramc.field_updateTime = bo.anT();
    boolean bool = super.a(paramc);
    AppMethodBeat.o(78986);
    return bool;
  }

  public final List<String> vm(String paramString)
  {
    AppMethodBeat.i(78987);
    LinkedList localLinkedList = new LinkedList();
    paramString = this.fni.a("select distinct appid from OpenIMAppIdInfo where appid=? ", new String[] { paramString }, 2);
    if (paramString.moveToFirst())
      do
      {
        String str = paramString.getString(0);
        if (!bo.isNullOrNil(str))
          localLinkedList.add(str);
      }
      while (paramString.moveToNext());
    paramString.close();
    AppMethodBeat.o(78987);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.e.d
 * JD-Core Version:    0.6.2
 */