package com.tencent.toybrick.b;

import android.support.v7.widget.RecyclerView.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.c.b;
import com.tencent.toybrick.c.c;
import com.tencent.toybrick.c.d;
import com.tencent.toybrick.c.e;

public final class a
{
  private static RecyclerView.n AFN;

  static
  {
    AppMethodBeat.i(113179);
    RecyclerView.n localn = new RecyclerView.n();
    AFN = localn;
    localn.aF(d.AFW, 10);
    AFN.aF(e.AFW, 10);
    AFN.aF(com.tencent.toybrick.c.a.AFW, 10);
    AFN.aF(b.AFW, 10);
    AFN.aF(c.AFW, 10);
    AppMethodBeat.o(113179);
  }

  public static RecyclerView.n dSx()
  {
    return AFN;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.b.a
 * JD-Core Version:    0.6.2
 */