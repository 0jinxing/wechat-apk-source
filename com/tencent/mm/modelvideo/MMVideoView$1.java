package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class MMVideoView$1
  implements ap.a
{
  MMVideoView$1(MMVideoView paramMMVideoView)
  {
  }

  public final boolean BI()
  {
    boolean bool1 = false;
    AppMethodBeat.i(50629);
    boolean bool2;
    if (MMVideoView.a(this.fVe) == null)
    {
      AppMethodBeat.o(50629);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      boolean bool3 = this.fVe.isPlaying();
      if (bool3)
        MMVideoView.b(this.fVe);
      try
      {
        int i = MMVideoView.c(this.fVe).getCurrentPosition() / 1000;
        MMVideoView.a(this.fVe, i);
        bool2 = this.fVe.mm(i);
        ab.d(MMVideoView.f(this.fVe), "%s check timer[%b] isplay[%b]", new Object[] { MMVideoView.g(this.fVe), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        MMVideoView.akZ();
        if ((bool2) && (bool3))
        {
          AppMethodBeat.o(50629);
          bool2 = true;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e(MMVideoView.d(this.fVe), "%s online video timer check error [%s] ", new Object[] { MMVideoView.e(this.fVe), localException.toString() });
          bool2 = false;
        }
        AppMethodBeat.o(50629);
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.MMVideoView.1
 * JD-Core Version:    0.6.2
 */