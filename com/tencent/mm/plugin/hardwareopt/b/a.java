package com.tencent.mm.plugin.hardwareopt.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.asz;

public class a
{
  private static volatile a nqq = null;
  private asz nqr = null;

  public static a bFS()
  {
    AppMethodBeat.i(59273);
    if (nqq == null);
    while (true)
    {
      try
      {
        if (nqq == null)
        {
          locala1 = new com/tencent/mm/plugin/hardwareopt/b/a;
          locala1.<init>();
          nqq = locala1;
        }
        a locala1 = nqq;
        return locala1;
      }
      finally
      {
        AppMethodBeat.o(59273);
      }
      a locala2 = nqq;
      AppMethodBeat.o(59273);
    }
  }

  public final asz bFT()
  {
    AppMethodBeat.i(59274);
    if (this.nqr == null)
      this.nqr = new asz();
    asz localasz = this.nqr;
    AppMethodBeat.o(59274);
    return localasz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardwareopt.b.a
 * JD-Core Version:    0.6.2
 */