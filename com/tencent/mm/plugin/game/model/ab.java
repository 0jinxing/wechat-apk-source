package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.game.d.at;
import com.tencent.mm.plugin.game.d.bi;
import com.tencent.mm.plugin.game.d.p;
import java.io.IOException;

public final class ab extends x
{
  private bi mXT;

  public ab(a parama)
  {
    AppMethodBeat.i(111370);
    if (parama == null)
    {
      this.mXT = new bi();
      AppMethodBeat.o(111370);
    }
    while (true)
    {
      return;
      this.mXT = ((bi)parama);
      AppMethodBeat.o(111370);
    }
  }

  public ab(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111371);
    this.mXT = new bi();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(111371);
    while (true)
    {
      return;
      try
      {
        this.mXT.parseFrom(paramArrayOfByte);
        AppMethodBeat.o(111371);
      }
      catch (IOException paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.GamePBDataDownloadGuidance", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
        AppMethodBeat.o(111371);
      }
    }
  }

  public final p bEJ()
  {
    if (this.mXT != null);
    for (p localp = this.mXT.nch; ; localp = null)
      return localp;
  }

  public final at bEK()
  {
    if (this.mXT != null);
    for (at localat = this.mXT.nci; ; localat = null)
      return localat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ab
 * JD-Core Version:    0.6.2
 */