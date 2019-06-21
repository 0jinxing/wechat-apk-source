package com.tencent.mm.plugin.sns.ui.d;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class b$24$1
  implements Runnable
{
  b$24$1(b.24 param24, bau parambau, aj paramaj, n paramn, TimeLineObject paramTimeLineObject, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40278);
    if (af.cnC().u(this.qIs))
    {
      this.rKB.qzM.bf(null, false);
      g localg = af.cnC();
      n localn = this.rKv;
      bau localbau = this.qIs;
      com.tencent.mm.plugin.sight.decode.a.a locala = this.rKB.qzM;
      int i = this.rKE.rKt.activity.hashCode();
      int j = this.rKB.position;
      az localaz = az.dtl();
      localaz.oyB = this.rKC.pcX;
      localg.a(localn, localbau, locala, i, j, localaz, this.rKD);
      this.rKB.raP.setVisibility(0);
      this.rKB.rnu.setVisibility(8);
      this.rKB.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.rKE.rKt.activity, 2131231923));
    }
    AppMethodBeat.o(40278);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.24.1
 * JD-Core Version:    0.6.2
 */