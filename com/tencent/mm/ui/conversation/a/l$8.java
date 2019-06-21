package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.be;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;

final class l$8
  implements View.OnClickListener
{
  l$8(l paraml, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34683);
    be.ZV().co(this.bVv, this.yhK);
    Context localContext = (Context)this.zwC.vlu.get();
    aw.ZK();
    paramView = (String)c.Ry().get(68377, null);
    aw.ZK();
    c.Ry().set(68377, "");
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_timeline_NeedFirstLoadint", true);
    if (!bo.isNullOrNil(paramView));
    for (boolean bool1 = false; ; bool1 = true)
    {
      boolean bool2 = bool1;
      if (n.qFz != null)
      {
        bool2 = bool1;
        if (n.qFz.baS() > 0)
          bool2 = false;
      }
      localIntent.putExtra("sns_resume_state", bool2);
      com.tencent.mm.bp.d.b(localContext, "sns", ".ui.SnsTimeLineUI", localIntent);
      h.pYm.e(11002, new Object[] { Integer.valueOf(8), Integer.valueOf(1) });
      AppMethodBeat.o(34683);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.l.8
 * JD-Core Version:    0.6.2
 */