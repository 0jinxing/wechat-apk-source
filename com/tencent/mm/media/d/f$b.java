package com.tencent.mm.media.d;

import a.l;
import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class f$b
  implements Runnable
{
  f$b(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(12957);
    try
    {
      String str = this.eVQ.TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("finishEncode, isEnd:");
      ab.i(str, this.eVQ.eTf);
      if (this.eVQ.eTf)
        AppMethodBeat.o(12957);
      while (true)
      {
        return;
        this.eVQ.eTf = true;
        this.eVQ.eVq.signalEndOfInputStream();
        AppMethodBeat.o(12957);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e(this.eVQ.TAG, "release encoder error " + localException.getMessage());
        AppMethodBeat.o(12957);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.f.b
 * JD-Core Version:    0.6.2
 */