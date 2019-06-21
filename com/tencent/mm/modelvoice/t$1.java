package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.audio.b.b;
import com.tencent.mm.audio.b.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class t$1
  implements b.a
{
  t$1(t paramt)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(116658);
    if (t.a(this.gau) != null)
      t.a(this.gau).onError();
    try
    {
      t.b(this.gau).release();
      t.c(this.gau);
      AppMethodBeat.o(116658);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("VoiceRecorder", "setErrorListener File[" + this.gau.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        AppMethodBeat.o(116658);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.t.1
 * JD-Core Version:    0.6.2
 */