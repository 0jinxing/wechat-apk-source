package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.sdk.platformtools.ab;

final class i$2
  implements j.a
{
  i$2(i parami)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(25293);
    ab.e("MicroMsg.VoiceRemindRecorder", "Record Failed file:" + i.a(this.stm));
    i.abn(i.a(this.stm));
    if (this.stm.stg != null)
      this.stm.stg.onError();
    AppMethodBeat.o(25293);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.i.2
 * JD-Core Version:    0.6.2
 */