package com.tencent.d.d.a;

import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public final class a
{
  public static boolean atP(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(114501);
    boolean bool2;
    if (!new File(paramString).exists())
    {
      AppMethodBeat.o(114501);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        bool2 = com.tencent.d.d.b.a.atP(paramString);
        if (!bool2)
        {
          "BootScriptChecker found no-elf file : ".concat(String.valueOf(paramString));
          h.dQG();
        }
        AppMethodBeat.o(114501);
      }
      catch (IOException paramString)
      {
        h.w(paramString);
        AppMethodBeat.o(114501);
        bool2 = bool1;
      }
    }
  }

  public static boolean atQ(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(114502);
    File localFile = new File(paramString);
    if ((!localFile.exists()) || (localFile.length() > 51200L))
      AppMethodBeat.o(114502);
    while (true)
    {
      return bool;
      try
      {
        String str = new java/lang/String;
        str.<init>(com.tencent.d.d.b.a.atR(localFile.getAbsolutePath()));
        bool = str.contains("applypatch ");
        new StringBuilder("BootScriptChecker script (").append(paramString).append(") content : \n").append(str);
        h.dQH();
        if (!bool)
        {
          "BootScriptChecker found unofficial file : ".concat(String.valueOf(paramString));
          h.dQG();
        }
        AppMethodBeat.o(114502);
      }
      catch (Exception paramString)
      {
        h.w(paramString);
        AppMethodBeat.o(114502);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.a.a
 * JD-Core Version:    0.6.2
 */