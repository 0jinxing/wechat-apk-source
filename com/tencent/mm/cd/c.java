package com.tencent.mm.cd;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c
{
  private static int index = 0;
  private static boolean on = false;
  private static g.a ybp = null;
  private static long ybq = 0L;
  private static int ybr = 0;

  static void a(String paramString, Cursor paramCursor, long paramLong)
  {
    AppMethodBeat.i(59036);
    if (!on)
      AppMethodBeat.o(59036);
    while (true)
    {
      return;
      long l = ybp.Mr();
      Object localObject1 = "Thread:[" + Thread.currentThread().getId() + "," + Thread.currentThread().getName() + "]";
      Object localObject2 = (String)localObject1 + "[" + index + "][" + l + "]";
      localObject1 = localObject2;
      if (paramLong != 0L)
        localObject1 = (String)localObject2 + "[INTRANS]";
      localObject2 = localObject1;
      if (paramCursor != null)
      {
        s(paramCursor);
        localObject2 = (String)localObject1 + "[cuCnt:" + ybr + ",cuTime:" + ybq + "]";
      }
      paramString = (String)localObject2 + "[" + paramString + "]--";
      ab.v("MicroMsg.dbtest", paramString + bo.dpG());
      AppMethodBeat.o(59036);
    }
  }

  static void begin()
  {
    AppMethodBeat.i(59034);
    if (!on)
      AppMethodBeat.o(59034);
    while (true)
    {
      return;
      ybp = new g.a();
      index += 1;
      AppMethodBeat.o(59034);
    }
  }

  public static void k(Exception paramException)
  {
    AppMethodBeat.i(59033);
    if (on)
      ab.e("MicroMsg.DKTest", "exception:%s", new Object[] { bo.l(paramException) });
    AppMethodBeat.o(59033);
  }

  private static void s(Cursor paramCursor)
  {
    AppMethodBeat.i(59035);
    if (!on)
      AppMethodBeat.o(59035);
    while (true)
    {
      return;
      if (paramCursor == null)
      {
        AppMethodBeat.o(59035);
      }
      else
      {
        ybr = paramCursor.getCount();
        g.a locala = new g.a();
        for (int i = 0; i < ybr; i++)
          paramCursor.moveToPosition(i);
        paramCursor.moveToPosition(-1);
        ybq = locala.Mr();
        AppMethodBeat.o(59035);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.c
 * JD-Core Version:    0.6.2
 */