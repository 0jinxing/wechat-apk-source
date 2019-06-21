package com.tencent.mm.plugin.welab.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends j<com.tencent.mm.plugin.welab.d.a.a>
{
  private e bSd;

  public a(e parame)
  {
    super(parame, com.tencent.mm.plugin.welab.d.a.a.ccO, "LabAppInfo", null);
    this.bSd = parame;
  }

  private boolean d(com.tencent.mm.plugin.welab.d.a.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(80582);
    com.tencent.mm.plugin.welab.d.a.a locala = new com.tencent.mm.plugin.welab.d.a.a();
    locala.field_LabsAppId = parama.field_LabsAppId;
    b(locala, new String[0]);
    if ((parama.field_expId == locala.field_expId) && (parama.field_sequence < locala.field_sequence))
    {
      ab.i("LabAppInfoStorage", "sequence old origin.seq " + locala.field_sequence + " old.seq " + parama.field_sequence);
      AppMethodBeat.o(80582);
    }
    while (true)
    {
      return bool;
      bool = super.a(parama);
      AppMethodBeat.o(80582);
    }
  }

  public final void c(com.tencent.mm.plugin.welab.d.a.a parama)
  {
    AppMethodBeat.i(80581);
    if (!d(parama))
      b(parama);
    AppMethodBeat.o(80581);
  }

  public final List<com.tencent.mm.plugin.welab.d.a.a> dds()
  {
    AppMethodBeat.i(80579);
    Cursor localCursor = baR();
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      com.tencent.mm.plugin.welab.d.a.a locala = new com.tencent.mm.plugin.welab.d.a.a();
      locala.d(localCursor);
      localArrayList.add(locala);
    }
    localCursor.close();
    AppMethodBeat.o(80579);
    return localArrayList;
  }

  public final void ee(List<com.tencent.mm.plugin.welab.d.a.a> paramList)
  {
    AppMethodBeat.i(80580);
    h localh = null;
    if ((this.bSd instanceof h))
      localh = (h)this.bSd;
    for (long l = localh.iV(-1L); ; l = 0L)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
        c((com.tencent.mm.plugin.welab.d.a.a)paramList.next());
      if (localh != null)
        localh.mB(l);
      AppMethodBeat.o(80580);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.d.a
 * JD-Core Version:    0.6.2
 */