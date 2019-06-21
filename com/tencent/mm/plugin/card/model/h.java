package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class h extends j<g>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(87838);
    fnj = new String[] { j.a(g.ccO, "CardMsgInfo") };
    AppMethodBeat.o(87838);
  }

  public h(e parame)
  {
    super(parame, g.ccO, "CardMsgInfo", null);
    this.bSd = parame;
  }

  public final Cursor baR()
  {
    AppMethodBeat.i(87835);
    Cursor localCursor = this.bSd.rawQuery("select * from CardMsgInfo order by time desc", null);
    AppMethodBeat.o(87835);
    return localCursor;
  }

  public final int baS()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(87836);
    Cursor localCursor = this.bSd.a(" select count(*) from CardMsgInfo where read_state = ? ", new String[] { "1" }, 2);
    if (localCursor == null)
      AppMethodBeat.o(87836);
    while (true)
    {
      return j;
      j = i;
      if (localCursor.moveToFirst())
        j = localCursor.getInt(0);
      localCursor.close();
      AppMethodBeat.o(87836);
    }
  }

  public final boolean baT()
  {
    AppMethodBeat.i(87837);
    boolean bool = this.bSd.hY("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
    AppMethodBeat.o(87837);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.h
 * JD-Core Version:    0.6.2
 */