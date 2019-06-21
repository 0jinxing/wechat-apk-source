package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class ap
{
  public String cvZ;
  public String fWW;
  public boolean fWX;
  public long time;
  public boolean xXK;
  public String xXL;

  public ap(String paramString)
  {
    AppMethodBeat.i(62699);
    this.cvZ = "-1";
    this.xXL = "";
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. content is null.");
      AppMethodBeat.o(62699);
      return;
    }
    while (true)
    {
      try
      {
        if (paramString.endsWith("\n"))
        {
          localObject = paramString.substring(0, paramString.length() - 1);
          localObject = ((String)localObject).split(":", 6);
          if ((localObject.length != 4) || (!ad.mR(localObject[0])))
            break label268;
          i = 1;
          if (localObject.length > i)
            this.fWW = localObject[i];
          if (localObject.length > i + 1)
            this.time = bo.getLong(localObject[(i + 1)], 0L);
          if (localObject.length > i + 2)
            this.fWX = localObject[(i + 2)].equals("1");
          if (localObject.length > i + 3)
            this.cvZ = localObject[(i + 3)];
          if (localObject.length > i + 4)
            this.xXL = localObject[(i + 4)].replace("*#*", ":");
          if (localObject.length > i + 5)
            this.xXK = localObject[(i + 5)].equals("1");
          AppMethodBeat.o(62699);
          break;
        }
        this.xXL = paramString.replace(":", "*#*");
        Object localObject = paramString;
        continue;
      }
      catch (Exception localException)
      {
        this.time = 0L;
        ab.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. Content:%s Excpetion:%s", new Object[] { paramString, bo.l(localException) });
        AppMethodBeat.o(62699);
      }
      break;
      label268: int i = 0;
    }
  }

  public static String a(String paramString1, long paramLong, boolean paramBoolean1, String paramString2, boolean paramBoolean2, String paramString3)
  {
    int i = 1;
    AppMethodBeat.i(62697);
    paramString3 = paramString3.replace(":", "*#*");
    paramString1 = new StringBuilder().append(paramString1).append(":").append(paramLong).append(":");
    if (paramBoolean1)
    {
      j = 1;
      paramString1 = paramString1.append(j).append(":").append(paramString2).append(":").append(paramString3).append(":");
      if (!paramBoolean2)
        break label121;
    }
    label121: for (int j = i; ; j = 0)
    {
      paramString1 = j + "\n";
      AppMethodBeat.o(62697);
      return paramString1;
      j = 0;
      break;
    }
  }

  public static ap aps(String paramString)
  {
    AppMethodBeat.i(62700);
    paramString = new ap(paramString);
    AppMethodBeat.o(62700);
    return paramString;
  }

  public final String dsX()
  {
    int i = 1;
    AppMethodBeat.i(62698);
    Object localObject = new StringBuilder().append(this.fWW).append(":").append(this.time).append(":");
    if (this.fWX)
    {
      j = 1;
      localObject = ((StringBuilder)localObject).append(j).append(":").append(this.cvZ).append(":").append(this.xXL).append(":");
      if (!this.xXK)
        break label118;
    }
    label118: for (int j = i; ; j = 0)
    {
      localObject = j + "\n";
      AppMethodBeat.o(62698);
      return localObject;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ap
 * JD-Core Version:    0.6.2
 */