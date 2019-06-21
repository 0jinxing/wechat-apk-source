package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.appbrand.compat.a.a.a;
import com.tencent.mm.protocal.protobuf.aqu;

final class a$1
  implements w.a
{
  a$1(a parama, a.a parama1)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    boolean bool1 = true;
    AppMethodBeat.i(17015);
    if (paramm.getType() != 1926)
    {
      AppMethodBeat.o(17015);
      return 0;
    }
    boolean bool2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (aqu)paramb.fsH.fsP;
      if ((paramString != null) && (paramString.wuH))
        bool2 = true;
    }
    while (true)
    {
      if (this.heO != null)
        this.heO.q(bool1, bool2);
      AppMethodBeat.o(17015);
      break;
      bool2 = false;
      continue;
      bool2 = false;
      bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.compat.a.1
 * JD-Core Version:    0.6.2
 */