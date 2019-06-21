package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$1
  implements b.a
{
  j$1(j paramj)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(116529);
    j.a(this.crj).Mm();
    if (j.b(this.crj) != null)
      j.b(this.crj).onError();
    try
    {
      j.c(this.crj).release();
      j.d(this.crj);
      AppMethodBeat.o(116529);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SimpleVoiceRecorder", "setErrorListener File[" + this.crj.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        AppMethodBeat.o(116529);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.j.1
 * JD-Core Version:    0.6.2
 */