package com.tencent.mm.cj;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class a$a
  implements i<IPCString, Bundle>
{
  private static Bundle e(IPCString paramIPCString)
  {
    AppMethodBeat.i(80382);
    Bundle localBundle = new Bundle();
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (!bo.isNullOrNil(paramIPCString.value))
      {
        i = g.RO().eJo.ftA.getHostByName(paramIPCString.value, localArrayList);
        localBundle.putStringArrayList("ipList", localArrayList);
        localBundle.putInt("result", i);
        AppMethodBeat.o(80382);
        return localBundle;
      }
    }
    catch (Exception paramIPCString)
    {
      while (true)
      {
        ab.printErrStackTrace("GetHostByNameTask", paramIPCString, "GetHostByNameTask", new Object[0]);
        AppMethodBeat.o(80382);
        continue;
        int i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cj.a.a
 * JD-Core Version:    0.6.2
 */