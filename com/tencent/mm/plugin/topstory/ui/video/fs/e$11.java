package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.a;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.protocal.protobuf.bzs;

final class e$11
  implements View.OnClickListener
{
  e$11(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1896);
    b localb = this.sFU.getFSVideoUIComponent();
    e.f(this.sFU).cFP();
    localb.a((bzs)paramView.getTag());
    AppMethodBeat.o(1896);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.11
 * JD-Core Version:    0.6.2
 */