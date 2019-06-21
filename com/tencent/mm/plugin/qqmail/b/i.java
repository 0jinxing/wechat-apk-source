package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.io.IOException;

public final class i
{
  public k ptG;

  public i(String paramString)
  {
    AppMethodBeat.i(67928);
    this.ptG = new k(paramString, 10);
    AppMethodBeat.o(67928);
  }

  public static String cR(String paramString, int paramInt)
  {
    AppMethodBeat.i(67930);
    if ((paramString == null) || (paramString.length() == 0));
    for (paramString = g.RP().Ry().get(9, null); ; paramString = paramString + "_" + paramInt)
    {
      AppMethodBeat.o(67930);
      return paramString;
    }
  }

  public final j cQ(String paramString, int paramInt)
  {
    AppMethodBeat.i(67929);
    byte[] arrayOfByte = k.readFromFile(this.ptG.ptQ + cR(paramString, paramInt));
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      AppMethodBeat.o(67929);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = new com/tencent/mm/plugin/qqmail/b/j;
        paramString.<init>();
        paramString = (j)paramString.parseFrom(arrayOfByte);
        AppMethodBeat.o(67929);
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace("MicroMsg.DraftBoxMgr", paramString, "", new Object[0]);
        AppMethodBeat.o(67929);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.i
 * JD-Core Version:    0.6.2
 */