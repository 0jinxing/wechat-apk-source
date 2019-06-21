package com.tencent.mm.openim.e;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class f extends j<e>
{
  public static final String[] fnj;
  public h fni;

  static
  {
    AppMethodBeat.i(78994);
    fnj = new String[] { j.a(e.ccO, "OpenIMWordingInfo") };
    AppMethodBeat.o(78994);
  }

  public f(h paramh)
  {
    super(paramh, e.ccO, "OpenIMWordingInfo", null);
    this.fni = paramh;
  }

  public final List<String> B(int paramInt, String paramString)
  {
    AppMethodBeat.i(78992);
    LinkedList localLinkedList = new LinkedList();
    String str = " select wordingId from OpenIMWordingInfo where language='" + paramString + "' order by updateTime limit " + paramInt;
    ab.d("MicroMsg.Openim.OpenIMWordingInfoStg", "getLastWording sql:%s", new Object[] { str });
    Cursor localCursor = this.fni.a(str, null, 2);
    if (localCursor.moveToFirst())
      do
      {
        str = localCursor.getString(0);
        if (!bo.isNullOrNil(str))
          localLinkedList.add(str);
      }
      while (localCursor.moveToNext());
    ab.d("MicroMsg.Openim.OpenIMWordingInfoStg", "getLastWording result cnt: %d, language:%s", new Object[] { Integer.valueOf(localLinkedList.size()), paramString });
    localCursor.close();
    AppMethodBeat.o(78992);
    return localLinkedList;
  }

  public final boolean a(e parame)
  {
    AppMethodBeat.i(78991);
    parame.field_updateTime = bo.anT();
    boolean bool = super.a(parame);
    AppMethodBeat.o(78991);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.e.f
 * JD-Core Version:    0.6.2
 */