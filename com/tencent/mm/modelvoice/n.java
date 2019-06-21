package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;

public final class n
{
  public String fWW;
  public boolean fWX;
  public long time;

  public n(String paramString)
  {
    AppMethodBeat.i(55838);
    String str = paramString;
    try
    {
      if (paramString.endsWith("\n"))
        str = paramString.substring(0, paramString.length() - 1);
      paramString = str.split(":");
      if ((paramString.length == 4) && (ad.mR(paramString[0])))
      {
        i = 1;
        if (paramString.length > i)
          this.fWW = paramString[i];
        if (paramString.length > i + 1)
          this.time = bo.getLong(paramString[(i + 1)], 0L);
        if (paramString.length > i + 2)
          this.fWX = paramString[(i + 2)].equals("1");
        AppMethodBeat.o(55838);
        return;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        if (this.fWW == null)
          this.fWW = "";
        this.fWX = false;
        this.time = 0L;
        ab.e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
        AppMethodBeat.o(55838);
        continue;
        int i = 0;
      }
    }
  }

  public static String d(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(55837);
    paramString = new StringBuilder().append(paramString).append(":").append(paramLong).append(":");
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      paramString = i + "\n";
      AppMethodBeat.o(55837);
      return paramString;
    }
  }

  public final String alt()
  {
    return this.fWW;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.n
 * JD-Core Version:    0.6.2
 */