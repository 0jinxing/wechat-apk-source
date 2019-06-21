package com.tencent.mm.platformtools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsimple.q.a;
import com.tencent.mm.protocal.j.d;
import com.tencent.mm.protocal.j.e;
import com.tencent.mm.protocal.protobuf.bag;
import com.tencent.mm.protocal.protobuf.bah;
import com.tencent.mm.protocal.protobuf.bzr;
import com.tencent.mm.protocal.protobuf.cfi;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.protobuf.fv;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
{
  public static q.a a(com.tencent.mm.modelsimple.q paramq)
  {
    AppMethodBeat.i(79001);
    Bundle localBundle = new Bundle();
    localBundle.putInt("kscene_type", 73);
    paramq = a(paramq, localBundle);
    AppMethodBeat.o(79001);
    return paramq;
  }

  private static q.a a(com.tencent.mm.modelsimple.q paramq, Bundle paramBundle)
  {
    AppMethodBeat.i(79002);
    if (paramq == null)
    {
      AppMethodBeat.o(79002);
      paramq = null;
    }
    while (true)
    {
      return paramq;
      if (((j.e)paramq.ftU.ZS()).vxV.xid == null)
      {
        AppMethodBeat.o(79002);
        paramq = null;
      }
      else
      {
        Object localObject = ((j.e)paramq.ftU.ZS()).vxV.xid.vHR;
        if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
        {
          q.a locala = new q.a();
          Iterator localIterator = ((bzr)localObject).wYM.iterator();
          while (localIterator.hasNext())
          {
            localObject = (cfi)localIterator.next();
            if (((cfi)localObject).pXC == 19)
              locala.cxb = ((cfi)localObject).xeN;
            else if (((cfi)localObject).pXC == 20)
              locala.fPp = ((cfi)localObject).xeN;
            else if (((cfi)localObject).pXC == 21)
              locala.cEh = ((cfi)localObject).xeN;
          }
          locala.fPq = paramBundle;
          locala.type = 0;
          if (!bo.isNullOrNil(locala.cxb))
          {
            locala.username = ((j.d)paramq.ftU.acF()).vxS.wEb.jBB;
            AppMethodBeat.o(79002);
            paramq = locala;
          }
        }
        else
        {
          AppMethodBeat.o(79002);
          paramq = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.e
 * JD-Core Version:    0.6.2
 */