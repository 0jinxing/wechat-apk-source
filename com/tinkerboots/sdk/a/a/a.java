package com.tinkerboots.sdk.a.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tinkerboots.sdk.b.c;
import com.tinkerboots.sdk.b.d;
import java.util.Map;

public class a
  implements b
{
  public void L(Map<String, String> paramMap)
  {
  }

  public boolean bGs()
  {
    boolean bool = false;
    AppMethodBeat.i(65530);
    Context localContext = c.getContext();
    com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.iX(localContext);
    if (!com.tinkerboots.sdk.b.a.isConnected(localContext))
    {
      com.tencent.tinker.lib.util.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, not connect to internet", new Object[0]);
      AppMethodBeat.o(65530);
    }
    while (true)
    {
      return bool;
      if (com.tencent.tinker.lib.util.b.iZ(localContext))
      {
        com.tencent.tinker.lib.util.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, tinker service is running", new Object[0]);
        AppMethodBeat.o(65530);
      }
      else if (!locala.rNw)
      {
        com.tencent.tinker.lib.util.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, only request on the main process", new Object[0]);
        AppMethodBeat.o(65530);
      }
      else if (d.dWn())
      {
        com.tencent.tinker.lib.util.a.e("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, is in ignore channel, current channel:%s", new Object[] { d.dWm() });
        AppMethodBeat.o(65530);
      }
      else
      {
        AppMethodBeat.o(65530);
        bool = true;
      }
    }
  }

  public void bGt()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.a.a.a
 * JD-Core Version:    0.6.2
 */