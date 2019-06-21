package com.tencent.mm.plugin.fts.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.u;
import com.tencent.mm.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.b.n;

final class FTSAddWw$5
  implements f
{
  FTSAddWw$5(FTSAddWw paramFTSAddWw)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(61757);
    g.Rg().b(372, this);
    FTSAddWw.d(this.mIg);
    if ((paramInt1 != 0) || (paramInt2 != 0))
      switch (paramInt2)
      {
      default:
        FTSAddWw.e(this.mIg).setText(2131301725);
        label68: FTSAddWw.a(this.mIg, -1);
        FTSAddWw.f(this.mIg);
        paramString = new u();
        paramString.eP(FTSAddWw.a(this.mIg));
        paramString.cXR = 0L;
        paramString.cXS = 2L;
        paramString.ajK();
      case -4:
      case -24:
      }
    while (true)
    {
      FTSAddWw.g(this.mIg);
      AppMethodBeat.o(61757);
      return;
      if (paramInt1 == 4)
        break;
      FTSAddWw.e(this.mIg).setText(this.mIg.getString(2131302815));
      break label68;
      paramString = a.jY(paramString);
      if (paramString != null)
      {
        FTSAddWw.e(this.mIg).setText(paramString.desc);
        break label68;
      }
      FTSAddWw.e(this.mIg).setText(2131301725);
      break label68;
      FTSAddWw.a(this.mIg, ((n)paramm).gfg);
      FTSAddWw.a(this.mIg, 1);
      paramString = new u();
      paramString.eP(FTSAddWw.a(this.mIg));
      paramString.cXR = 0L;
      paramString.cXS = 1L;
      paramString.ajK();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddWw.5
 * JD-Core Version:    0.6.2
 */