package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;

final class SnsUploadConfigView$8
  implements View.OnClickListener
{
  SnsUploadConfigView$8(SnsUploadConfigView paramSnsUploadConfigView, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool = true;
    AppMethodBeat.i(39695);
    if ((!SnsUploadConfigView.d(this.rCy)) && (SnsUploadConfigView.b(this.rCy)))
    {
      h.g(this.val$context, 2131303804, 2131297061);
      AppMethodBeat.o(39695);
    }
    while (true)
    {
      return;
      g.RQ();
      if (g.RP().Ry().getBoolean(ac.a.xLk, true))
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xLk, Boolean.FALSE);
        h.a(this.val$context, 2131303791, 2131297061, new SnsUploadConfigView.8.1(this));
        AppMethodBeat.o(39695);
      }
      else
      {
        paramView = this.rCy;
        if (SnsUploadConfigView.d(this.rCy))
          bool = false;
        SnsUploadConfigView.b(paramView, bool);
        SnsUploadConfigView.e(this.rCy);
        AppMethodBeat.o(39695);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.8
 * JD-Core Version:    0.6.2
 */