package com.tencent.mm.plugin.topstory.ui.video.list;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.c;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.sdk.platformtools.ab;

final class f$a
  implements c
{
  private float sFW;

  f$a(f paramf)
  {
    AppMethodBeat.i(2053);
    this.sFW = com.tencent.mm.bz.a.ge(paramf.getContext());
    AppMethodBeat.o(2053);
  }

  public final void FF(int paramInt)
  {
    AppMethodBeat.i(2058);
    f.g(this.sGV).cHf();
    f.Q(this.sGV).setVisibility(8);
    this.sGV.seekTo(paramInt);
    AppMethodBeat.o(2058);
  }

  public final void aFi()
  {
    AppMethodBeat.i(2054);
    ab.d("MicroMsg.TopStory.TopStoryListVideoContainer", "onSingleTap");
    int i;
    if (f.N(this.sGV))
      if (f.g(this.sGV).getVisibility() == 0)
      {
        i = 1;
        if (i == 0)
          break label66;
        f.g(this.sGV).setVisibility(8);
        AppMethodBeat.o(2054);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label66: f.g(this.sGV).show();
      if (this.sGV.getListItemUIComponent() != null)
      {
        this.sGV.getListItemUIComponent().cFO();
        this.sGV.getListItemUIComponent().cFN();
      }
      AppMethodBeat.o(2054);
    }
  }

  public final void aFj()
  {
    AppMethodBeat.i(2055);
    ab.d("MicroMsg.TopStory.TopStoryListVideoContainer", "onDoubleTap");
    AppMethodBeat.o(2055);
  }

  public final void aFk()
  {
    AppMethodBeat.i(2056);
    f.O(this.sGV).setVisibility(0);
    f.g(this.sGV).cHe();
    AppMethodBeat.o(2056);
  }

  public final int be(float paramFloat)
  {
    AppMethodBeat.i(2057);
    paramFloat /= this.sFW;
    int i = this.sGV.getListVideoUIComponent().cFV().getVideoDurationSec();
    int j = getCurrentPosition();
    int k = (int)(paramFloat * i) + j;
    if (k < 0)
      j = 0;
    while (true)
    {
      String str = com.tencent.mm.plugin.websearch.ui.a.fQ(i * 1000L);
      f.P(this.sGV).setText(com.tencent.mm.plugin.websearch.ui.a.fQ(j * 1000L) + "/" + str);
      AppMethodBeat.o(2057);
      return j;
      j = k;
      if (k > i)
        j = i;
    }
  }

  public final boolean cGl()
  {
    AppMethodBeat.i(2059);
    boolean bool;
    if (f.R(this.sGV))
    {
      bool = false;
      AppMethodBeat.o(2059);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(2059);
    }
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(2060);
    int i = this.sGV.getListVideoUIComponent().cFV().getCurrPosSec();
    AppMethodBeat.o(2060);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.a
 * JD-Core Version:    0.6.2
 */