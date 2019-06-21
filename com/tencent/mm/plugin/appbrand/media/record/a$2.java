package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements b.a
{
  public final void onError()
  {
    AppMethodBeat.i(105583);
    ab.e("MicroMsg.Record.AudioRecorder", "onError");
    a.pg(-1);
    AppMethodBeat.o(105583);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.a.2
 * JD-Core Version:    0.6.2
 */