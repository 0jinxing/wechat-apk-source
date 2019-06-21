package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class SnsUploadConfigView$1
  implements View.OnClickListener
{
  SnsUploadConfigView$1(SnsUploadConfigView paramSnsUploadConfigView, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39690);
    if ((!SnsUploadConfigView.a(this.rCy)) && (SnsUploadConfigView.b(this.rCy)))
    {
      h.g(this.val$context, 2131303802, 2131297061);
      AppMethodBeat.o(39690);
      return;
    }
    paramView = this.rCy;
    if (SnsUploadConfigView.a(this.rCy));
    for (boolean bool = false; ; bool = true)
    {
      SnsUploadConfigView.a(paramView, bool);
      SnsUploadConfigView.c(this.rCy);
      AppMethodBeat.o(39690);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.1
 * JD-Core Version:    0.6.2
 */