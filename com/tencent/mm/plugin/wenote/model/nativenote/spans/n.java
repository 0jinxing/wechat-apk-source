package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;

public final class n extends e
{
  final boolean uRY;
  public final boolean uRZ;

  public n(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, paramInt2);
    this.uRY = paramBoolean1;
    this.uRZ = paramBoolean2;
  }

  public final boolean a(e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(26958);
    if (parame == null)
      AppMethodBeat.o(26958);
    while (true)
    {
      return bool;
      if (parame.isEmpty())
      {
        int i;
        if ((parame.aqm >= this.aqm) && (parame.Ls < this.Ls))
        {
          i = 1;
          label51: if ((parame.aqm < this.aqm) || (parame.Ls > this.Ls))
            break label108;
        }
        label108: for (int j = 1; ; j = 0)
        {
          if ((i == 0) && ((j == 0) || (!this.uRZ)))
            break label114;
          AppMethodBeat.o(26958);
          bool = true;
          break;
          i = 0;
          break label51;
        }
        label114: AppMethodBeat.o(26958);
      }
      else if (Math.max(this.aqm, parame.aqm) < Math.min(this.Ls, parame.Ls))
      {
        AppMethodBeat.o(26958);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(26958);
      }
    }
  }

  public final int dfF()
  {
    AppMethodBeat.i(26959);
    int i = Math.abs(this.Ls - this.aqm);
    AppMethodBeat.o(26959);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.n
 * JD-Core Version:    0.6.2
 */