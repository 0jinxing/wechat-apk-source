package com.tencent.mm.plugin.fts.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView.b;
import com.tencent.mm.plugin.websearch.api.e;
import com.tencent.mm.protocal.protobuf.btf;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class FTSMainUI$3
  implements FTSLocalPageRelevantView.b
{
  FTSMainUI$3(FTSMainUI paramFTSMainUI)
  {
  }

  public final void a(btf parambtf, String paramString, int paramInt)
  {
    AppMethodBeat.i(61868);
    String str = this.mJJ.query;
    Object localObject;
    if (parambtf.nbk == 1)
    {
      FTSMainUI.b(this.mJJ, this.mJJ.query);
      this.mJJ.query = parambtf.wVl;
      localObject = new HashMap();
      ((Map)localObject).put("prefixSug", FTSMainUI.m(this.mJJ));
      ((Map)localObject).put("sugId", paramString);
      ((Map)localObject).put("sceneActionType", "6");
      FTSMainUI.a(this.mJJ, (Map)localObject);
    }
    while (true)
    {
      ((e)g.K(e.class)).d(str, paramString, paramInt, parambtf.wVl);
      parambtf = FTSMainUI.k(this.mJJ);
      k.a(str, FTSMainUI.d(this.mJJ).getCount(), FTSMainUI.n(this.mJJ), parambtf, 23);
      FTSMainUI.d(this.mJJ).mIO = true;
      if (!FTSMainUI.d(this.mJJ).mIF)
      {
        FTSMainUI.d(this.mJJ).mIF = true;
        k.a(str, true, FTSMainUI.d(this.mJJ).getCount(), 0, parambtf);
      }
      AppMethodBeat.o(61868);
      return;
      if ((parambtf.nbk == 4) && (!bo.isNullOrNil(parambtf.mZj)))
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("rawUrl", parambtf.mZj);
        ((Intent)localObject).putExtra("convertActivityFromTranslucent", false);
        d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.3
 * JD-Core Version:    0.6.2
 */