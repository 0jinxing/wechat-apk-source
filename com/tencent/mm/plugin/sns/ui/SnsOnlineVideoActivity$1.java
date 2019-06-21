package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsOnlineVideoActivity$1
  implements View.OnClickListener
{
  SnsOnlineVideoActivity$1(SnsOnlineVideoActivity paramSnsOnlineVideoActivity)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(39142);
    paramView = this.rvf;
    if (SnsOnlineVideoActivity.a(this.rvf));
    for (int i = 8; ; i = 0)
    {
      paramView.setTitleVisibility(i);
      paramView = this.rvf;
      if (!SnsOnlineVideoActivity.a(this.rvf))
        bool = true;
      SnsOnlineVideoActivity.a(paramView, bool);
      AppMethodBeat.o(39142);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.1
 * JD-Core Version:    0.6.2
 */