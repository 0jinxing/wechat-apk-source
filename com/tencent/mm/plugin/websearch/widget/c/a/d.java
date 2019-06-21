package com.tencent.mm.plugin.websearch.widget.c.a;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.widget.c.c;
import com.tencent.mm.sdk.platformtools.ah;

public final class d
  implements a
{
  public final boolean adV(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(91470);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(91470);
    while (true)
    {
      return bool;
      if ((paramString.startsWith("http://")) || (paramString.startsWith("https://")))
      {
        bool = true;
        AppMethodBeat.o(91470);
      }
      else
      {
        AppMethodBeat.o(91470);
      }
    }
  }

  public final boolean adW(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(91472);
    if (!adV(paramString))
    {
      bool = false;
      AppMethodBeat.o(91472);
    }
    while (true)
    {
      return bool;
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramString);
      localIntent.putExtra("useJs", true);
      com.tencent.mm.bp.d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(91472);
    }
  }

  public final boolean lO(long paramLong)
  {
    AppMethodBeat.i(91471);
    boolean bool = c.H(paramLong, 0);
    AppMethodBeat.o(91471);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.c.a.d
 * JD-Core Version:    0.6.2
 */