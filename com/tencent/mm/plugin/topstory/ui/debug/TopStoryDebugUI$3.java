package com.tencent.mm.plugin.topstory.ui.debug;

import android.os.Process;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.ao;
import com.tencent.mm.vfs.e;

final class TopStoryDebugUI$3
  implements View.OnClickListener
{
  TopStoryDebugUI$3(TopStoryDebugUI paramTopStoryDebugUI, ao paramao)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1550);
    e.N(this.sBE.aLD(), true);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(1550);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI.3
 * JD-Core Version:    0.6.2
 */