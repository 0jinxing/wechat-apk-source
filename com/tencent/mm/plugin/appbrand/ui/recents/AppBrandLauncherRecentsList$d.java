package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import java.util.HashMap;
import java.util.Map;

final class AppBrandLauncherRecentsList$d extends u<AppBrandRecentTaskInfo, AppBrandLauncherRecentsList.e>
{
  final Map<String, String> iNm;

  private AppBrandLauncherRecentsList$d(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
    AppMethodBeat.i(133373);
    this.iNm = new HashMap();
    AppMethodBeat.o(133373);
  }

  private void a(AppBrandLauncherRecentsList.e parame)
  {
    AppMethodBeat.i(133374);
    AppBrandLauncherRecentsList.d(this.iMV);
    if (LoadMoreRecyclerView.bo(parame.apJ) == AppBrandLauncherRecentsList.b(this.iMV).getItemCount() - 1)
    {
      parame.goc.setVisibility(8);
      if (!AppBrandLauncherRecentsList.C(this.iMV))
        break label106;
      TextView localTextView = parame.iNq;
      AppBrandLauncherRecentsList.d(this.iMV);
      localTextView.setText(String.valueOf(LoadMoreRecyclerView.bo(parame.apJ)));
      parame.iNq.setVisibility(0);
      AppMethodBeat.o(133374);
    }
    while (true)
    {
      return;
      parame.goc.setVisibility(0);
      break;
      label106: parame.iNq.setVisibility(8);
      AppMethodBeat.o(133374);
    }
  }

  private static void a(AppBrandLauncherRecentsList.e parame, String paramString)
  {
    AppMethodBeat.i(133376);
    parame.iNn.setText(paramString);
    AppMethodBeat.o(133376);
  }

  private void a(AppBrandLauncherRecentsList.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(133375);
    parame = parame.iNs;
    if ((AppBrandLauncherRecentsList.n(this.iMV)) && (paramBoolean));
    for (int i = 0; ; i = 8)
    {
      parame.setVisibility(i);
      AppMethodBeat.o(133375);
      return;
    }
  }

  final void b(AppBrandLauncherRecentsList.e parame, String paramString)
  {
    AppMethodBeat.i(133377);
    AppBrandLauncherRecentsList.D(this.iMV);
    parame = b.abR().a(parame.iNr, paramString, a.abQ(), f.fqH);
    this.iNm.put(paramString, parame);
    AppMethodBeat.o(133377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.d
 * JD-Core Version:    0.6.2
 */