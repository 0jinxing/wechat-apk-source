package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

final class StartUnbindQQ$2
  implements View.OnClickListener
{
  StartUnbindQQ$2(StartUnbindQQ paramStartUnbindQQ)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13763);
    if (StartUnbindQQ.a(this.guq) == null)
    {
      StartUnbindQQ.a(this.guq, h.a(this.guq, this.guq.getString(2131303008), null, new StartUnbindQQ.2.1(this), new StartUnbindQQ.2.2(this)));
      AppMethodBeat.o(13763);
    }
    while (true)
    {
      return;
      StartUnbindQQ.a(this.guq).show();
      AppMethodBeat.o(13763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ.2
 * JD-Core Version:    0.6.2
 */