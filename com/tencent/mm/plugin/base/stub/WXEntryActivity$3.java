package com.tencent.mm.plugin.base.stub;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WXEntryActivity$3
  implements View.OnClickListener
{
  WXEntryActivity$3(WXEntryActivity paramWXEntryActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18192);
    WXEntryActivity.c(this.jEd);
    this.jEd.finish();
    AppMethodBeat.o(18192);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity.3
 * JD-Core Version:    0.6.2
 */