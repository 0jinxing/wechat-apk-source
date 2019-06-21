package com.tencent.mm.modelvoiceaddr.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class VoiceSearchLayout$4
  implements f.b
{
  VoiceSearchLayout$4(VoiceSearchLayout paramVoiceSearchLayout)
  {
  }

  public final void a(String[] paramArrayOfString, long paramLong)
  {
    AppMethodBeat.i(116767);
    try
    {
      ab.d("MicroMsg.VoiceSearchLayout", "dkaddr onRes ");
      if (paramArrayOfString != null)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("dkaddr onRes size:");
        ab.d("MicroMsg.VoiceSearchLayout", paramArrayOfString.length + " " + paramArrayOfString.toString());
        int i = paramArrayOfString.length;
        for (int j = 0; j < i; j++)
          ab.d("MicroMsg.VoiceSearchLayout", "search username  :".concat(String.valueOf(paramArrayOfString[j])));
      }
      this.gcj.reset();
      VoiceSearchLayout.n(this.gcj).a(true, paramArrayOfString, paramLong);
      AppMethodBeat.o(116767);
      return;
    }
    catch (Exception paramArrayOfString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VoiceSearchLayout", paramArrayOfString, "", new Object[0]);
        AppMethodBeat.o(116767);
      }
    }
  }

  public final void amr()
  {
    AppMethodBeat.i(116768);
    this.gcj.reset();
    VoiceSearchLayout.n(this.gcj).a(false, null, -1L);
    AppMethodBeat.o(116768);
  }

  public final void ams()
  {
    AppMethodBeat.i(116766);
    VoiceSearchLayout.k(this.gcj);
    VoiceSearchLayout.l(this.gcj);
    if (VoiceSearchLayout.m(this.gcj) != null)
      VoiceSearchLayout.m(this.gcj).stopTimer();
    AppMethodBeat.o(116766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.4
 * JD-Core Version:    0.6.2
 */