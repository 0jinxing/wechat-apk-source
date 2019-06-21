package com.tencent.mm.plugin.collect.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.model.j;
import com.tencent.mm.protocal.protobuf.dg;
import com.tencent.mm.protocal.protobuf.os;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class CollectBillUI$1
  implements f
{
  CollectBillUI$1(CollectBillUI paramCollectBillUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41211);
    if ((paramm instanceof j))
    {
      paramString = (j)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = paramString.kCi.vVS;
        if ((paramString == null) || (paramString.isEmpty()))
        {
          CollectBillUI.a(this.kFX).setVisibility(8);
          AppMethodBeat.o(41211);
        }
      }
    }
    while (true)
    {
      return;
      paramString = paramString.iterator();
      while (true)
        if (paramString.hasNext())
        {
          paramm = (dg)paramString.next();
          if ((paramm.type == 1) && (!bo.isNullOrNil(paramm.cEh)))
          {
            ab.i("MicroMsg.CollectBillUI", "show notice");
            CollectBillUI.a(this.kFX).setText(paramm.cEh);
            CollectBillUI.a(this.kFX).setOnClickListener(new CollectBillUI.1.1(this, paramm));
            CollectBillUI.a(this.kFX).setVisibility(0);
            AppMethodBeat.o(41211);
            break;
          }
        }
      CollectBillUI.a(this.kFX).setVisibility(8);
      AppMethodBeat.o(41211);
      continue;
      ab.e("MicroMsg.CollectBillUI", "net error: %s", new Object[] { paramString });
      CollectBillUI.a(this.kFX).setVisibility(8);
      AppMethodBeat.o(41211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillUI.1
 * JD-Core Version:    0.6.2
 */