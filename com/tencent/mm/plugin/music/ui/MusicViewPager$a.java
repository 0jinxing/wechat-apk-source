package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class MusicViewPager$a extends Scroller
{
  private int duration = 1000;

  public MusicViewPager$a(MusicViewPager paramMusicViewPager, Context paramContext)
  {
    super(paramContext);
  }

  public final void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105140);
    super.startScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.duration);
    AppMethodBeat.o(105140);
  }

  public final void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(105139);
    super.startScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.duration);
    AppMethodBeat.o(105139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicViewPager.a
 * JD-Core Version:    0.6.2
 */