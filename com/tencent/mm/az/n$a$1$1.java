package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bhp;

final class n$a$1$1
  implements Runnable
{
  n$a$1$1(n.a.1 param1, j.b paramb, int paramInt, bhp parambhp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(993);
    n localn = this.fLU.fLQ;
    int i = this.fLR.getCmdId();
    int j = this.fLS;
    String str1;
    if (this.fLT == null)
    {
      str1 = "";
      if (this.fLT != null)
        break label78;
    }
    label78: for (String str2 = ""; ; str2 = this.fLT.ncM)
    {
      localn.c(i, j, str1, str2);
      AppMethodBeat.o(993);
      return;
      str1 = this.fLT.Title;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.n.a.1.1
 * JD-Core Version:    0.6.2
 */