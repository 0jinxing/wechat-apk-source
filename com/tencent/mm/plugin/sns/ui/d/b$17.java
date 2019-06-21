package com.tencent.mm.plugin.sns.ui.d;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.au.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$17
  implements View.OnClickListener
{
  b$17(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40265);
    if ((paramView.getTag() instanceof String))
    {
      paramView = (String)paramView.getTag();
      ab.d("MicroMsg.TimelineClickListener", "localId ".concat(String.valueOf(paramView)));
      aj.Da(v.Zn(paramView));
      aj.CY(v.Zn(paramView));
      af.cnB().cmp();
      this.rKt.crE();
      if (this.rKt.rKo != null)
        this.rKt.rKo.cud();
    }
    AppMethodBeat.o(40265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.17
 * JD-Core Version:    0.6.2
 */