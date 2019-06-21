package com.tencent.mm.plugin.appbrand.launching.b;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;

final class f extends a
{
  final void a(String paramString, Uri paramUri, a.a parama)
  {
    int i = 1;
    AppMethodBeat.i(132040);
    if (paramUri == null)
    {
      paramString = "";
      switch (f.1.ijn[parama.ordinal()])
      {
      default:
        AppBrand404PageUI.show(2131296614);
        AppMethodBeat.o(132040);
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      return;
      paramString = paramUri.getQueryParameter("appid");
      break;
      if ((paramUri != null) && (paramUri.getBooleanQueryParameter("debug", false)))
      {
        j = 1;
        label90: AppBrand404PageUI.show(2131296824);
        if (j == 0)
          break label127;
      }
      label127: for (int j = i; ; j = 0)
      {
        c.K(paramString, 2, j + 1);
        AppMethodBeat.o(132040);
        break;
        j = 0;
        break label90;
      }
      AppBrand404PageUI.show(2131296794);
      c.K("", 3, 2);
      AppMethodBeat.o(132040);
      continue;
      AppBrand404PageUI.show(2131296795);
      c.K("", 4, 2);
      AppMethodBeat.o(132040);
      continue;
      AppMethodBeat.o(132040);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.b.f
 * JD-Core Version:    0.6.2
 */