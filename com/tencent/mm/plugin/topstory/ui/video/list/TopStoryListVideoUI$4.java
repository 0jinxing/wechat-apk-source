package com.tencent.mm.plugin.topstory.ui.video.list;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.c.f;
import com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog;
import com.tencent.mm.plugin.topstory.ui.widget.c.a;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;

final class TopStoryListVideoUI$4
  implements c.a
{
  TopStoryListVideoUI$4(TopStoryListVideoUI paramTopStoryListVideoUI, chw paramchw)
  {
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(2104);
    this.sHq.sGC.a(paramf, new TopStoryListVideoUI.4.1(this), (int)TopStoryListVideoUI.k(this.sHq).xgG, this.sEw.xgW);
    if (this.sHq.sEn.cGZ())
      this.sHq.sEn.cpN();
    AppMethodBeat.o(2104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.4
 * JD-Core Version:    0.6.2
 */