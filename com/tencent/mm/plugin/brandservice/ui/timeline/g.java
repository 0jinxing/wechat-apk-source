package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.a.n.a;

public final class g
  implements n.a
{
  private n jOM;
  public long jON = 0L;
  private BaseAdapter jOO;

  public g(BaseAdapter paramBaseAdapter)
  {
    this.jOO = paramBaseAdapter;
  }

  public final n aWG()
  {
    AppMethodBeat.i(14229);
    if (this.jOM == null)
      this.jOM = new n();
    n localn = this.jOM;
    AppMethodBeat.o(14229);
    return localn;
  }

  public final void bI(String paramString, int paramInt)
  {
    AppMethodBeat.i(14232);
    this.jOO.notifyDataSetChanged();
    AppMethodBeat.o(14232);
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(14230);
    boolean bool;
    if ((this.jOM != null) && (this.jOM.buH()))
    {
      bool = true;
      AppMethodBeat.o(14230);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14230);
    }
  }

  public final void onFinish()
  {
    AppMethodBeat.i(14233);
    this.jON = 0L;
    this.jOO.notifyDataSetChanged();
    AppMethodBeat.o(14233);
  }

  public final void onPause()
  {
    AppMethodBeat.i(14234);
    this.jON = 0L;
    this.jOO.notifyDataSetChanged();
    AppMethodBeat.o(14234);
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(14231);
    if (isPlaying())
      aWG().stopPlay();
    AppMethodBeat.o(14231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.g
 * JD-Core Version:    0.6.2
 */