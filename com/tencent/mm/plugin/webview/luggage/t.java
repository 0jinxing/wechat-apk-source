package com.tencent.mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.e.c;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.bag.h.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class t
  implements h.a
{
  public final Bundle T(Bundle paramBundle)
  {
    AppMethodBeat.i(6241);
    try
    {
      paramBundle = (Bundle)f.a("com.tencent.mm", paramBundle, t.a.class);
      AppMethodBeat.o(6241);
      return paramBundle;
    }
    catch (c paramBundle)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUIBagIPCDelegate", "doBagLogic exp=%s", new Object[] { paramBundle.getLocalizedMessage() });
        paramBundle = null;
        AppMethodBeat.o(6241);
      }
    }
  }

  public final void y(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(6242);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (true)
    {
      if (i < 4);
      try
      {
        localArrayList.add(String.valueOf(paramArrayOfObject[i]));
        i++;
        continue;
        paramArrayOfObject = h.pYm;
        h.g(11576, localArrayList);
        AppMethodBeat.o(6242);
        return;
      }
      catch (Exception paramArrayOfObject)
      {
        while (true)
        {
          ab.w("MicroMsg.WebViewUIBagIPCDelegate", "kvReport, ex = " + paramArrayOfObject.getMessage());
          AppMethodBeat.o(6242);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.t
 * JD-Core Version:    0.6.2
 */