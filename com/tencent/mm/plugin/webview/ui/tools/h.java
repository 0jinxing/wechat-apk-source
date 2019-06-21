package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.model.aq.j;
import com.tencent.mm.plugin.webview.model.aq.k;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qqvideo.proxy.api.IUtils;
import java.util.ArrayList;
import java.util.List;

public final class h extends a
  implements IUtils
{
  public h(WebViewUI paramWebViewUI)
  {
    super(paramWebViewUI);
  }

  public final void httpproxyReport(String[] paramArrayOfString)
  {
    AppMethodBeat.i(7589);
    Object localObject = cZv().ulI.cYd();
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramArrayOfString = cZv().ulI.cYd();
      localObject = cZv().icy;
      if ((paramArrayOfString.unk != null) && (paramArrayOfString.unk.size() != 0) && (localObject != null))
        break label149;
      AppMethodBeat.o(7589);
    }
    while (true)
    {
      return;
      if (((aq.k)localObject).unk == null)
        ((aq.k)localObject).unk = new ArrayList();
      while (true)
      {
        for (int i = 0; i < paramArrayOfString.length; i++)
        {
          ab.i("MicroMsg.WebviewReporter", "WebViewVideoProxyReporter report info = %s", new Object[] { paramArrayOfString[i] });
          ((aq.k)localObject).unk.add(paramArrayOfString[i]);
        }
        break;
        ((aq.k)localObject).unk.clear();
      }
      label149: g.a((d)localObject, 12033, paramArrayOfString.unk);
      paramArrayOfString.unk.clear();
      AppMethodBeat.o(7589);
    }
  }

  public final void idKeyReport(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(7590);
    ab.i("MicroMsg.WebViewUI.UtilsImpl", "idkey report, id = %s, key = %s, value = %s", new Object[] { paramString1, paramString2, paramString3 });
    if ((!bo.isNullOrNil(paramString1)) && (!bo.isNullOrNil(paramString2)) && (!bo.isNullOrNil(paramString3)))
    {
      int i = bo.getInt(paramString1, 0);
      int j = bo.getInt(paramString2, 0);
      int k = bo.getInt(paramString3, 0);
      com.tencent.mm.plugin.report.service.h.pYm.a(i, j, k, false);
    }
    AppMethodBeat.o(7590);
  }

  public final void javaUtilLog(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(7588);
    switch (paramInt)
    {
    default:
    case 3:
    case 6:
    case 4:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(7588);
      while (true)
      {
        return;
        ab.d(paramString1, paramString2);
        AppMethodBeat.o(7588);
        continue;
        ab.e(paramString1, paramString2);
        AppMethodBeat.o(7588);
        continue;
        ab.i(paramString1, paramString2);
        AppMethodBeat.o(7588);
        continue;
        ab.v(paramString1, paramString2);
        AppMethodBeat.o(7588);
      }
      ab.w(paramString1, paramString2);
    }
  }

  public final void kvReport(String[] paramArrayOfString)
  {
    AppMethodBeat.i(7591);
    Object localObject = cZv().ulI.cYe();
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramArrayOfString = cZv().ulI.cYe();
      localObject = cZv().icy;
      if ((paramArrayOfString.unk != null) && (paramArrayOfString.unk.size() != 0) && (localObject != null))
        break label149;
      AppMethodBeat.o(7591);
    }
    while (true)
    {
      return;
      if (((aq.j)localObject).unk == null)
        ((aq.j)localObject).unk = new ArrayList();
      while (true)
      {
        for (int i = 0; i < paramArrayOfString.length; i++)
        {
          ab.i("MicroMsg.WebviewReporter", "WebViewVideoDownloadReporter report info = %s", new Object[] { paramArrayOfString[i] });
          ((aq.j)localObject).unk.add(paramArrayOfString[i]);
        }
        break;
        ((aq.j)localObject).unk.clear();
      }
      label149: g.a((d)localObject, 12666, paramArrayOfString.unk);
      paramArrayOfString.unk.clear();
      AppMethodBeat.o(7591);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.h
 * JD-Core Version:    0.6.2
 */