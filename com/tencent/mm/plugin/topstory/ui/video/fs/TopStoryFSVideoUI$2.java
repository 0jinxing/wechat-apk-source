package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.h;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.topstory.ui.widget.b.a;
import com.tencent.mm.protocal.protobuf.abz;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.util.Set;

final class TopStoryFSVideoUI$2
  implements b.a
{
  TopStoryFSVideoUI$2(TopStoryFSVideoUI paramTopStoryFSVideoUI, chw paramchw, int paramInt)
  {
  }

  public final void j(Set<abz> paramSet)
  {
    AppMethodBeat.i(1952);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow commit");
    t.makeText(this.sGF.mController.ylL, 2131304099, 0).show();
    h.a(this.sGF.cFT(), this.sEw, paramSet, this.sGF.sEo.cGR());
    this.sGF.sEn.stopPlay();
    this.sGF.sEo.FK(this.sN);
    this.sGF.sGs.ci(this.sN + this.sGF.sGs.getHeadersCount());
    this.sGF.sDY.a(0, 3, null);
    AppMethodBeat.o(1952);
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(1953);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow dismiss");
    if (TopStoryFSVideoUI.c(this.sGF))
    {
      this.sGF.sEn.cEf();
      TopStoryFSVideoUI.d(this.sGF);
    }
    while (true)
    {
      try
      {
        ((f)this.sGF.sEn.sFu.getControlBar()).aFE();
        AppMethodBeat.o(1953);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(1953);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.2
 * JD-Core Version:    0.6.2
 */