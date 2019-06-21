package com.tencent.mm.plugin.brandservice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;

final class SearchOrRecommendBizUI$1
  implements com.tencent.mm.ai.f
{
  SearchOrRecommendBizUI$1(SearchOrRecommendBizUI paramSearchOrRecommendBizUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(14041);
    if (paramm == null)
    {
      ab.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "NetScene is null.");
      AppMethodBeat.o(14041);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 456)
        break;
      ab.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "The NetScene is not a RecommendGroupNetScene.");
      AppMethodBeat.o(14041);
    }
    g.Rg().b(456, this);
    ab.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "errType(%d) , errCode(%d) , errMsg(%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = com.tencent.mm.plugin.brandservice.b.f.aVW();
      if (SearchOrRecommendBizUI.a(this.jME) != null)
        break label173;
      paramString = null;
      label116: if ((paramString != null) && (paramm != null) && (paramm.size() > 0))
        if (paramString.getCount() != 0)
          break label190;
    }
    label173: label190: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      paramString.jMx = paramm;
      if (paramInt1 != 0)
        al.d(new SearchOrRecommendBizUI.1.1(this, paramString));
      AppMethodBeat.o(14041);
      break;
      paramString = (f)SearchOrRecommendBizUI.a(this.jME).getAdapter();
      break label116;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI.1
 * JD-Core Version:    0.6.2
 */