package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.h;
import com.tencent.mm.plugin.topstory.ui.widget.b.a;
import com.tencent.mm.protocal.protobuf.abz;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.util.Set;

final class TopStoryBaseVideoUI$5
  implements b.a
{
  TopStoryBaseVideoUI$5(TopStoryBaseVideoUI paramTopStoryBaseVideoUI, chw paramchw, int paramInt)
  {
  }

  public final void j(Set<abz> paramSet)
  {
    AppMethodBeat.i(1722);
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow commit");
    t.makeText(this.sEv.mController.ylL, 2131304099, 0).show();
    h.a(this.sEv.cFT(), this.sEw, paramSet, this.sEv.sEo.cGR());
    this.sEv.sEn.stopPlay();
    this.sEv.sEo.FK(this.sN);
    if (this.sEv.sEt)
    {
      this.sEv.sEd.ci(this.sN + this.sEv.sEd.getHeadersCount());
      this.sEv.sDZ.aop.notifyChanged();
      this.sEv.sEb.a(0, 3, null);
      AppMethodBeat.o(1722);
    }
    while (true)
    {
      return;
      this.sEv.sDZ.ci(this.sN + this.sEv.sDZ.getHeadersCount());
      this.sEv.sEd.aop.notifyChanged();
      AppMethodBeat.o(1722);
    }
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(1723);
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow dismiss");
    if (TopStoryBaseVideoUI.a(this.sEv))
    {
      this.sEv.sEn.cEf();
      TopStoryBaseVideoUI.b(this.sEv);
      if (!this.sEv.sEt);
    }
    while (true)
    {
      try
      {
        ((com.tencent.mm.plugin.topstory.ui.video.fs.f)this.sEv.sEn.sFu.getControlBar()).aFE();
        AppMethodBeat.o(1723);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(1723);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.5
 * JD-Core Version:    0.6.2
 */