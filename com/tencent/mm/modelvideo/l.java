package com.tencent.mm.modelvideo;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import java.util.LinkedList;
import java.util.List;

public final class l extends com.tencent.mm.sdk.e.j<j>
{
  public static final String[] fnj;
  e bSd;

  static
  {
    AppMethodBeat.i(50732);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(j.ccO, "SightDraftInfo") };
    AppMethodBeat.o(50732);
  }

  public l(e parame)
  {
    super(parame, j.ccO, "SightDraftInfo", null);
    this.bSd = parame;
  }

  public final List<j> alf()
  {
    AppMethodBeat.i(50730);
    LinkedList localLinkedList = new LinkedList();
    Object localObject = "SELECT * FROM SightDraftInfo WHERE fileStatus = ?  ORDER BY localId DESC " + new StringBuilder(" LIMIT 5").toString();
    Cursor localCursor = this.bSd.a((String)localObject, new String[] { "7" }, 2);
    if (localCursor == null)
      AppMethodBeat.o(50730);
    while (true)
    {
      return localLinkedList;
      while (localCursor.moveToNext())
      {
        localObject = new j();
        ((j)localObject).d(localCursor);
        localLinkedList.add(localObject);
      }
      localCursor.close();
      AppMethodBeat.o(50730);
    }
  }

  public final Cursor alg()
  {
    AppMethodBeat.i(50731);
    Cursor localCursor = this.bSd.rawQuery("SELECT * FROM SightDraftInfo WHERE fileStatus = ?  ORDER BY localId DESC ", new String[] { "1" });
    AppMethodBeat.o(50731);
    return localCursor;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.l
 * JD-Core Version:    0.6.2
 */