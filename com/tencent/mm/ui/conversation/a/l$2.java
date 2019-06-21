package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.be;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.t;
import java.lang.ref.WeakReference;

final class l$2
  implements View.OnClickListener
{
  l$2(l paraml, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34677);
    be.ZV().co(this.bVv, this.yhK);
    Context localContext = (Context)this.zwC.vlu.get();
    if (localContext != null)
    {
      aw.ZK();
      if (!c.isSDCardAvailable())
      {
        t.hO(localContext);
        AppMethodBeat.o(34677);
      }
    }
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("intent_set_avatar", true);
      paramView.putExtra("KEnterFromBanner", true);
      d.b(localContext, "setting", ".ui.setting.SettingsPersonalInfoUI", paramView);
      h.pYm.e(11002, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
      AppMethodBeat.o(34677);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.l.2
 * JD-Core Version:    0.6.2
 */