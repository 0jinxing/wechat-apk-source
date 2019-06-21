package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@Deprecated
@TargetApi(18)
public final class o
  implements e
{
  boolean cFy;
  MediaMuxer owN;
  int owO;
  int owP;
  long owQ;

  public final boolean bPO()
  {
    return false;
  }

  public final void d(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(76661);
    try
    {
      if ((this.owN != null) && (this.owO == -1))
      {
        this.owO = this.owN.addTrack(paramMediaFormat);
        ab.i("MicroMsg.MMSightSystemMediaMuxer", "addX264Track, x264TrackIndex: %s", new Object[] { Integer.valueOf(this.owO) });
        if ((!this.cFy) && (this.owO != -1) && (this.owP != -1))
        {
          ab.i("MicroMsg.MMSightSystemMediaMuxer", "start!");
          this.owN.start();
          this.cFy = true;
        }
      }
      AppMethodBeat.o(76661);
      return;
    }
    catch (Exception paramMediaFormat)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightSystemMediaMuxer", "addX264Track error: %s", new Object[] { paramMediaFormat.getMessage() });
        AppMethodBeat.o(76661);
      }
    }
  }

  public final void e(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(76662);
    try
    {
      if ((this.owN != null) && (this.owP == -1))
      {
        this.owP = this.owN.addTrack(paramMediaFormat);
        ab.i("MicroMsg.MMSightSystemMediaMuxer", "addAACTrack, aacTrackIndex: %s", new Object[] { Integer.valueOf(this.owP) });
        if ((!this.cFy) && (this.owP != -1) && (this.owO != -1))
        {
          ab.i("MicroMsg.MMSightSystemMediaMuxer", "start!");
          this.owN.start();
          this.cFy = true;
        }
      }
      AppMethodBeat.o(76662);
      return;
    }
    catch (Exception paramMediaFormat)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightSystemMediaMuxer", "addAACTrack error: %s", new Object[] { paramMediaFormat.getMessage() });
        AppMethodBeat.o(76662);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.o
 * JD-Core Version:    0.6.2
 */