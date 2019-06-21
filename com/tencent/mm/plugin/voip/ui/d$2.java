package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;

final class d$2
  implements View.OnClickListener
{
  d$2(d paramd, Intent paramIntent)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4972);
    this.val$intent.addFlags(268435456);
    ah.getContext().startActivity(this.val$intent);
    paramView.setOnClickListener(null);
    d.a(this.sZc, new ap(new d.2.1(this), false));
    d.a(this.sZc).ae(2000L, 2000L);
    AppMethodBeat.o(4972);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.d.2
 * JD-Core Version:    0.6.2
 */