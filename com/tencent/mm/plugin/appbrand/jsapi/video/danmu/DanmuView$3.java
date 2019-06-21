package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class DanmuView$3
  implements Runnable
{
  public DanmuView$3(DanmuView paramDanmuView, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126601);
    List localList = DanmuView.a(this.ibn);
    int i = 0;
    try
    {
      while (true)
      {
        if (i < DanmuView.a(this.ibn).size())
        {
          if (this.ibo.aGc() <= ((d)DanmuView.a(this.ibn).get(i)).aGc())
            DanmuView.a(this.ibn).add(i, this.ibo);
        }
        else
          return;
        i++;
      }
    }
    finally
    {
      AppMethodBeat.o(126601);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.3
 * JD-Core Version:    0.6.2
 */