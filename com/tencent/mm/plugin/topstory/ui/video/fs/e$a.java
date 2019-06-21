package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.c;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.sdk.platformtools.ab;

final class e$a
  implements c
{
  private float sFW;

  e$a(e parame)
  {
    AppMethodBeat.i(1901);
    this.sFW = com.tencent.mm.bz.a.ge(parame.getContext());
    AppMethodBeat.o(1901);
  }

  public final void FF(int paramInt)
  {
    AppMethodBeat.i(1906);
    e.e(this.sFU).cHf();
    e.X(this.sFU).setVisibility(8);
    this.sFU.seekTo(paramInt);
    AppMethodBeat.o(1906);
  }

  public final void aFi()
  {
    AppMethodBeat.i(1902);
    ab.d("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSingleTap");
    int i;
    if (e.U(this.sFU))
      if (e.e(this.sFU).getVisibility() == 0)
      {
        i = 1;
        if (i == 0)
          break label66;
        e.e(this.sFU).setVisibility(8);
        AppMethodBeat.o(1902);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label66: e.e(this.sFU).show();
      if (this.sFU.getFSItemUIComponent() != null)
      {
        this.sFU.getFSItemUIComponent().cFO();
        this.sFU.getFSItemUIComponent().cFN();
      }
      AppMethodBeat.o(1902);
    }
  }

  public final void aFj()
  {
    AppMethodBeat.i(1903);
    ab.d("MicroMsg.TopStory.TopStoryFSVideoContainer", "onDoubleTap");
    AppMethodBeat.o(1903);
  }

  public final void aFk()
  {
    AppMethodBeat.i(1904);
    e.V(this.sFU).setVisibility(0);
    e.e(this.sFU).cHe();
    AppMethodBeat.o(1904);
  }

  public final int be(float paramFloat)
  {
    AppMethodBeat.i(1905);
    paramFloat /= this.sFW;
    int i = this.sFU.getFSVideoUIComponent().cFV().getVideoDurationSec();
    int j = getCurrentPosition();
    int k = (int)(paramFloat * i) + j;
    if (k < 0)
      j = 0;
    while (true)
    {
      String str = com.tencent.mm.plugin.websearch.ui.a.fQ(i * 1000L);
      e.W(this.sFU).setText(com.tencent.mm.plugin.websearch.ui.a.fQ(j * 1000L) + "/" + str);
      AppMethodBeat.o(1905);
      return j;
      j = k;
      if (k > i)
        j = i;
    }
  }

  public final boolean cGl()
  {
    AppMethodBeat.i(1907);
    boolean bool;
    if (e.Y(this.sFU))
    {
      bool = false;
      AppMethodBeat.o(1907);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(1907);
    }
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(1908);
    int i = this.sFU.getFSVideoUIComponent().cFV().getCurrPosSec();
    AppMethodBeat.o(1908);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.a
 * JD-Core Version:    0.6.2
 */