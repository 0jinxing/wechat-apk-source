package com.tencent.mm.plugin.mmsight.segment.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$2
  implements ap.a
{
  c$2(c paramc)
  {
  }

  public final boolean BI()
  {
    boolean bool1 = false;
    AppMethodBeat.i(3725);
    if (this.oAp.released)
      AppMethodBeat.o(3725);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = this.oAp.isPlaying();
        if (!bool2)
        {
          AppMethodBeat.o(3725);
          bool1 = true;
        }
        else
        {
          int i = this.oAp.getCurrentPosition();
          if (this.oAp.ozL != null)
            this.oAp.ozL.yY(i);
          ab.d("MicroMsg.SectionRepeatMediaPlayer", "position[%d] repeat[%d, %d] duration[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(this.oAp.oAd), Integer.valueOf(this.oAp.oAe), Integer.valueOf(this.oAp.getDuration()) });
          int j = this.oAp.oAe;
          if (i < j)
          {
            AppMethodBeat.o(3725);
            bool1 = true;
          }
          else
          {
            ab.i("MicroMsg.SectionRepeatMediaPlayer", "reach repeat end time, seek to %s", new Object[] { Integer.valueOf(this.oAp.oAe) });
            this.oAp.seekTo(this.oAp.oAd);
            AppMethodBeat.o(3725);
          }
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        ab.e("MicroMsg.SectionRepeatMediaPlayer", "MediaPlayer may be released. %s", new Object[] { localIllegalStateException.getMessage() });
        if (!this.oAp.released)
        {
          AppMethodBeat.o(3725);
          bool1 = true;
        }
        else
        {
          AppMethodBeat.o(3725);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.c.2
 * JD-Core Version:    0.6.2
 */