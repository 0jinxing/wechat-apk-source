package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import a.y;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.recents.e;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"value", "", "showFooter", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;", "getShowFooter", "(Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;)Z", "setShowFooter", "(Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;Z)V", "show", "showThreeDots", "getShowThreeDots", "setShowThreeDots", "configFooterWording", "", "runOnUiThread", "action", "Lkotlin/Function0;", "setWordingText", "Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter;", "wording", "", "plugin-appbrand-integration_release"})
public final class h
{
  private static void a(e parame, String paramString)
  {
    AppMethodBeat.i(135206);
    j.p(parame, "receiver$0");
    j.p(paramString, "wording");
    parame = parame.apJ.findViewById(2131821327);
    j.o(parame, "this.itemView.findViewBy…ents_list_footer_wording)");
    ((TextView)parame).setText((CharSequence)paramString);
    AppMethodBeat.o(135206);
  }

  public static final void a(g paramg, a.f.a.a<y> parama)
  {
    AppMethodBeat.i(135207);
    j.p(paramg, "receiver$0");
    j.p(parama, "action");
    paramg.activity.runOnUiThread((Runnable)new h.a(parama));
    AppMethodBeat.o(135207);
  }

  public static final void a(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(135203);
    j.p(paramg, "receiver$0");
    paramg.aNL().fh(paramBoolean);
    AppMethodBeat.o(135203);
  }

  public static final void b(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(135204);
    j.p(paramg, "receiver$0");
    if (!paramBoolean)
      h(paramg);
    paramg.aNN().eJ(paramBoolean);
    AppMethodBeat.o(135204);
  }

  public static final void h(g paramg)
  {
    AppMethodBeat.i(135205);
    j.p(paramg, "receiver$0");
    e locale;
    if (paramg.iQk.aND().isEmpty())
    {
      locale = paramg.aNN();
      paramg = com.tencent.mm.bz.a.an(paramg.context, 2131305812);
      j.o(paramg, "ResourceHelper.getString…ommend_null_list_wording)");
      a(locale, paramg);
      AppMethodBeat.o(135205);
    }
    while (true)
    {
      return;
      locale = paramg.aNN();
      paramg = com.tencent.mm.bz.a.an(paramg.context, 2131296702);
      j.o(paramg, "ResourceHelper.getString…ents_list_footer_no_more)");
      a(locale, paramg);
      AppMethodBeat.o(135205);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.h
 * JD-Core Version:    0.6.2
 */