package com.tencent.mm.plugin.account.security.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.j;
import java.util.LinkedList;
import java.util.List;

public final class e extends j<d>
{
  public static final String[] fnj;
  h gzi;

  static
  {
    AppMethodBeat.i(69841);
    fnj = new String[] { j.a(d.ccO, "SafeDeviceInfo") };
    AppMethodBeat.o(69841);
  }

  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.ccO, "SafeDeviceInfo", null);
    AppMethodBeat.i(69836);
    this.gzi = null;
    if ((parame instanceof h))
      this.gzi = ((h)parame);
    AppMethodBeat.o(69836);
  }

  public final boolean a(d paramd)
  {
    AppMethodBeat.i(69837);
    boolean bool = super.b(paramd);
    AppMethodBeat.o(69837);
    return bool;
  }

  public final List<d> aqD()
  {
    AppMethodBeat.i(69838);
    LinkedList localLinkedList = new LinkedList();
    if (getCount() > 0)
    {
      Cursor localCursor = super.baR();
      while (localCursor.moveToNext())
      {
        d locald = new d();
        locald.d(localCursor);
        localLinkedList.add(locald);
      }
      localCursor.close();
    }
    AppMethodBeat.o(69838);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.a.e
 * JD-Core Version:    0.6.2
 */