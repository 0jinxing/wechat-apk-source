package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.protobuf.oi;

final class e$6
  implements q.a
{
  e$6(e parame, int paramInt, String paramString)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(88343);
    if (paramBoolean)
    {
      this.kjI.kjA = paramString;
      if (this.val$requestCode == 0)
      {
        if (this.kjI.kjE != null)
          this.kjI.kjE.GQ(this.eiH);
        com.tencent.mm.plugin.report.service.h.pYm.e(11582, new Object[] { "OperGift", Integer.valueOf(1), Integer.valueOf(this.kjI.kaS.aZV().iAd), this.kjI.kaS.baa(), this.kjI.kaS.aZZ(), this.kjI.kjz });
        com.tencent.mm.ui.base.h.bQ(this.kjI.kjd, this.kjI.kjd.getResources().getString(2131297877));
        AppMethodBeat.o(88343);
      }
    }
    while (true)
    {
      return;
      if (this.val$requestCode == 1)
      {
        paramString = this.kjI;
        paramString.kaS.aZX().wYl = (paramString.getString(2131297983) + paramString.kjy.getTitle());
        l.a(paramString.kaS, paramString.kjz, paramString.kjF.kiP, 2);
        l.dw(paramString.kjA, paramString.kjz);
        com.tencent.mm.ui.base.h.bQ(this.kjI.kjd, this.kjI.kjd.getResources().getString(2131297877));
        AppMethodBeat.o(88343);
      }
      else
      {
        if (this.val$requestCode == 4)
        {
          paramString = this.kjI;
          if (TextUtils.isEmpty(paramString.kaS.bab()))
            paramString.kaS.Gi(r.Yz());
          paramString.kaS.aZX().wYl = (paramString.getString(2131297944) + paramString.kjy.getTitle());
          l.a(paramString.kaS, paramString.kjz, paramString.kjF.kiP, 23);
          l.dw(paramString.kjA, paramString.kjz);
          com.tencent.mm.plugin.report.service.h.pYm.e(11582, new Object[] { "OpeRecommendCard", Integer.valueOf(this.kjI.kjF.emC), Integer.valueOf(this.kjI.kaS.aZV().iAd), this.kjI.kaS.baa(), this.kjI.kaS.aZZ(), this.kjI.kjz });
          com.tencent.mm.ui.base.h.bQ(this.kjI.kjd, this.kjI.kjd.getResources().getString(2131297877));
        }
        AppMethodBeat.o(88343);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e.6
 * JD-Core Version:    0.6.2
 */