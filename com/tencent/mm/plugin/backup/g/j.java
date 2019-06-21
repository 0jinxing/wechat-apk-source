package com.tencent.mm.plugin.backup.g;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Queue;

public final class j
{
  private static int jxV = 60000;
  private j.a jtM;
  long jxW;
  long jxX;
  long jxY;
  long jxZ;
  long jya;
  int jyb;
  Queue<Long> jyc;
  ap jyd;

  public j(j.a parama)
  {
    AppMethodBeat.i(17677);
    this.jxW = 0L;
    this.jyb = 0;
    this.jyc = new LinkedList();
    this.jyd = new ap(Looper.getMainLooper(), new j.1(this), true);
    this.jtM = parama;
    AppMethodBeat.o(17677);
  }

  static String gz(long paramLong)
  {
    AppMethodBeat.i(17678);
    String str;
    if (paramLong >> 30 > 0L)
    {
      str = bo.c(paramLong, 100.0D);
      AppMethodBeat.o(17678);
    }
    while (true)
    {
      return str;
      if (paramLong >> 20 > 0L)
      {
        str = bo.b(paramLong, 100.0D);
        AppMethodBeat.o(17678);
      }
      else if (paramLong >> 9 > 0L)
      {
        int i = Math.round((float)paramLong / 1024.0F);
        str = i + " KB";
        AppMethodBeat.o(17678);
      }
      else
      {
        str = paramLong + " B";
        AppMethodBeat.o(17678);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.j
 * JD-Core Version:    0.6.2
 */