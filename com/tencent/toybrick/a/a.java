package com.tencent.toybrick.a;

import android.support.v7.h.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.c.g;
import java.util.List;

public final class a extends c.a
{
  private List<g> AFL;
  private List<g> AFM;

  public a(List<g> paramList1, List<g> paramList2)
  {
    this.AFL = paramList1;
    this.AFM = paramList2;
  }

  public final boolean J(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113177);
    g localg1 = (g)this.AFL.get(paramInt1);
    g localg2 = (g)this.AFM.get(paramInt2);
    boolean bool;
    if ((localg1 == null) || (localg2 == null))
    {
      AppMethodBeat.o(113177);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (localg1.hashCode() == localg2.hashCode())
      {
        bool = true;
        AppMethodBeat.o(113177);
      }
      else
      {
        AppMethodBeat.o(113177);
        bool = false;
      }
    }
  }

  public final boolean K(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113178);
    g localg1 = (g)this.AFL.get(paramInt1);
    g localg2 = (g)this.AFM.get(paramInt2);
    boolean bool;
    if ((localg1 == null) || (localg2 == null))
    {
      bool = false;
      AppMethodBeat.o(113178);
    }
    while (true)
    {
      return bool;
      bool = localg1.equals(localg2);
      AppMethodBeat.o(113178);
    }
  }

  public final int fV()
  {
    AppMethodBeat.i(113175);
    int i;
    if (this.AFL == null)
    {
      i = 0;
      AppMethodBeat.o(113175);
    }
    while (true)
    {
      return i;
      i = this.AFL.size();
      AppMethodBeat.o(113175);
    }
  }

  public final int fW()
  {
    AppMethodBeat.i(113176);
    int i;
    if (this.AFM == null)
    {
      i = 0;
      AppMethodBeat.o(113176);
    }
    while (true)
    {
      return i;
      i = this.AFM.size();
      AppMethodBeat.o(113176);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.a.a
 * JD-Core Version:    0.6.2
 */