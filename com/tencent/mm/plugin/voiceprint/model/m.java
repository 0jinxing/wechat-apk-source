package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import java.io.File;

public final class m
{
  public static String by(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(26113);
    String str = ac.eSj;
    ab.i("MicroMsg.VoicePrintLogic", "dbCachePath ".concat(String.valueOf(str)));
    if (str.endsWith(File.separator))
    {
      paramString = str + paramString;
      ab.i("MicroMsg.VoicePrintLogic", "genpath ".concat(String.valueOf(paramString)));
      if (!bo.isNullOrNil(paramString))
        break label112;
      paramString = null;
      AppMethodBeat.o(26113);
    }
    while (true)
    {
      return paramString;
      paramString = str + File.separator + paramString;
      break;
      label112: if (paramBoolean)
        AppMethodBeat.o(26113);
      else if (new File(paramString).exists())
        AppMethodBeat.o(26113);
      else
        AppMethodBeat.o(26113);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.m
 * JD-Core Version:    0.6.2
 */