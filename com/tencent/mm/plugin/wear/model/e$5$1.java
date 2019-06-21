package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ls;
import com.tencent.mm.g.a.ls.a;
import com.tencent.mm.protocal.protobuf.ctv;
import java.util.ArrayList;

final class e$5$1
  implements Runnable
{
  e$5$1(e.5 param5, ls paramls)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26303);
    a.cUn().tXv.ads(this.tXW.cHA.talker);
    Object localObject1 = a.cUn().tXv.adr(this.tXW.cHA.talker);
    Object localObject2 = new ArrayList();
    ((ArrayList)localObject2).add(Integer.valueOf(((f)localObject1).id));
    a.cUn().tXz.a(new com.tencent.mm.plugin.wear.model.f.i((ArrayList)localObject2));
    int i;
    if (this.tXW.cHA.talker.equals("gh_43f2581f6fd6"))
    {
      localObject1 = a.cUn().tXt.tXK.tYz;
      if (localObject1 != null)
      {
        localObject2 = a.cUn().tXw;
        if ((localObject1 != null) && (((b)localObject2).tXD) && (b.adq(((ctv)localObject1).xqs)))
        {
          i = 1;
          if (i == 0)
            break label171;
          a.cUn();
          b.a((ctv)localObject1);
          AppMethodBeat.o(26303);
        }
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label171: a.cUn().tXw.connect();
      AppMethodBeat.o(26303);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.5.1
 * JD-Core Version:    0.6.2
 */