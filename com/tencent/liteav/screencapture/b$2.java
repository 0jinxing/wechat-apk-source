package com.tencent.liteav.screencapture;

import android.media.projection.MediaProjection.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;

class b$2 extends MediaProjection.Callback
{
  b$2(b paramb)
  {
  }

  public void onStop()
  {
    AppMethodBeat.i(66769);
    if (!b.e(this.a))
      AppMethodBeat.o(66769);
    while (true)
    {
      return;
      b.a(this.a, false);
      AppMethodBeat.o(66769);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.b.2
 * JD-Core Version:    0.6.2
 */