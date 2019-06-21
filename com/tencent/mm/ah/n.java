package com.tencent.mm.ah;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.ArrayList;
import java.util.List;

public final class n
{
  private static List<String> fsk;
  private static int fsl;
  private static n.a fsm;

  static
  {
    AppMethodBeat.i(77953);
    fsk = null;
    fsl = 0;
    fsm = new n.a(new n.b());
    AppMethodBeat.o(77953);
  }

  public static void acp()
  {
    AppMethodBeat.i(77952);
    fsl = 0;
    fsm.stopTimer();
    AppMethodBeat.o(77952);
  }

  public static void x(Runnable paramRunnable)
  {
    AppMethodBeat.i(77951);
    if (!g.RN().QY())
      AppMethodBeat.o(77951);
    while (true)
    {
      return;
      Object localObject = o.act();
      ArrayList localArrayList = new ArrayList();
      localObject = ((i)localObject).fni.a("select username from img_flag where username not in (select username from rcontact ) and username not like \"%@qqim\" and username not like \"%@bottle\";", null, 2);
      while (((Cursor)localObject).moveToNext())
        localArrayList.add(((Cursor)localObject).getString(0));
      ((Cursor)localObject).close();
      fsk = localArrayList;
      if (localArrayList.size() <= 0)
      {
        AppMethodBeat.o(77951);
      }
      else
      {
        fsm.fsn.fso = paramRunnable;
        fsm.ae(10L, 10L);
        AppMethodBeat.o(77951);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.n
 * JD-Core Version:    0.6.2
 */