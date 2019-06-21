package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e
{
  public static e kTK;
  public boolean kTL;
  private Pattern kTM;

  public e()
  {
    AppMethodBeat.i(52860);
    this.kTL = false;
    this.kTM = Pattern.compile("_\\d");
    AppMethodBeat.o(52860);
  }

  public static e bjJ()
  {
    AppMethodBeat.i(52861);
    if (kTK == null);
    try
    {
      e locale = new com/tencent/mm/plugin/emoji/e/e;
      locale.<init>();
      kTK = locale;
      locale = kTK;
      AppMethodBeat.o(52861);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(52861);
    }
  }

  public final void Jb(String paramString)
  {
    AppMethodBeat.i(52862);
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
    {
      paramString = paramString.listFiles();
      if ((paramString != null) && (paramString.length > 0))
      {
        int i = paramString.length;
        int j = 0;
        if (j < i)
        {
          Object localObject = paramString[j];
          if (this.kTL)
          {
            if (localObject.isDirectory())
              Jb(localObject.getPath());
            while (true)
            {
              j++;
              break;
              String str = localObject.getName();
              if ((this.kTM.matcher(str).find()) || (str.startsWith("temp")))
                localObject.delete();
            }
          }
          ab.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "stop run");
          AppMethodBeat.o(52862);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(52862);
    }
  }

  public final void Jc(String paramString)
  {
    AppMethodBeat.i(52863);
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
    {
      File[] arrayOfFile = paramString.listFiles();
      if ((arrayOfFile != null) && (arrayOfFile.length > 0))
      {
        int i = arrayOfFile.length;
        int j = 0;
        if (j < i)
        {
          paramString = arrayOfFile[j];
          if (paramString.isDirectory())
            Jc(paramString.getPath());
          while (true)
          {
            j++;
            break;
            paramString.getName();
            paramString.delete();
          }
        }
      }
    }
    AppMethodBeat.o(52863);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.e
 * JD-Core Version:    0.6.2
 */