package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class i$1
  implements n.c
{
  i$1(i parami)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(113738);
    paraml.a(1, this.nRu.getString(2131297049), 0);
    if (this.nRu.type == 1)
      paraml.a(3, this.nRu.getString(2131301955), 0);
    while (true)
    {
      dq localdq = new dq();
      localdq.cxc.cvx = this.nRu.cvx;
      com.tencent.mm.sdk.b.a.xxA.m(localdq);
      if ((localdq.cxd.cwB) || (g.o(ah.getContext(), 4L)))
        paraml.a(6, this.nRu.getString(2131298929), 0);
      AppMethodBeat.o(113738);
      return;
      if ((this.nRu.type == 2) && (this.nRu.activity.getIntent().getBooleanExtra("kFavCanDel", true)))
      {
        paraml.a(7, this.nRu.getString(2131299723), 0);
        paraml.a(5, this.nRu.getString(2131299613), 0);
        paraml.a(4, this.nRu.getString(2131296881), 0);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.i.1
 * JD-Core Version:    0.6.2
 */