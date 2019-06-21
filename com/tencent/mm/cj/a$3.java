package com.tencent.mm.cj;

import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.svg.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xwalk.core.WebViewExtensionListener;

final class a$3 extends WebViewExtensionListener
{
  public final int getHostByName(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(80380);
    int i;
    if (!b.PL().le("com.tencent.mm"))
    {
      AppMethodBeat.o(80380);
      i = 0;
    }
    while (true)
    {
      return i;
      paramString = (Bundle)XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), a.a.class);
      if ((paramList != null) && (paramString != null))
      {
        paramList.clear();
        ArrayList localArrayList = paramString.getStringArrayList("ipList");
        i = paramString.getInt("result");
        paramList.addAll(localArrayList);
        AppMethodBeat.o(80380);
      }
      else
      {
        AppMethodBeat.o(80380);
        i = 0;
      }
    }
  }

  public final Object onMiscCallBack(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80379);
    if ("AddFilterResources".equals(paramString))
      e.a((Resources)paramArrayOfObject[0], (Map)paramArrayOfObject[1]);
    AppMethodBeat.o(80379);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cj.a.3
 * JD-Core Version:    0.6.2
 */