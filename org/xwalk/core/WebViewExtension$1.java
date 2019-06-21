package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class WebViewExtension$1 extends WebViewExtensionInterface
{
  public final int getHostByName(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(85526);
    int i;
    if (WebViewExtension.access$000() != null)
    {
      i = WebViewExtension.access$000().getHostByName(paramString, paramList);
      AppMethodBeat.o(85526);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(85526);
    }
  }

  public final Object onMiscCallBack(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85525);
    if (WebViewExtension.access$000() != null)
    {
      paramString = WebViewExtension.access$000().onMiscCallBack(paramString, paramArrayOfObject);
      AppMethodBeat.o(85525);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(85525);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.WebViewExtension.1
 * JD-Core Version:    0.6.2
 */