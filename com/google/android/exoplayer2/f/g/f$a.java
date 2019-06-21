package com.google.android.exoplayer2.f.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class f$a
{
  private static final String[] boG = new String[0];
  public final String boH;
  public final String[] boI;
  public final String name;
  public final int position;

  private f$a(String paramString1, int paramInt, String paramString2, String[] paramArrayOfString)
  {
    this.position = paramInt;
    this.name = paramString1;
    this.boH = paramString2;
    this.boI = paramArrayOfString;
  }

  public static a k(String paramString, int paramInt)
  {
    AppMethodBeat.i(95729);
    Object localObject = paramString.trim();
    if (((String)localObject).isEmpty())
    {
      paramString = null;
      AppMethodBeat.o(95729);
      return paramString;
    }
    int i = ((String)localObject).indexOf(" ");
    label41: String str;
    if (i == -1)
    {
      paramString = "";
      localObject = ((String)localObject).split("\\.");
      str = localObject[0];
      if (localObject.length <= 1)
        break label110;
    }
    label110: for (localObject = (String[])Arrays.copyOfRange((Object[])localObject, 1, localObject.length); ; localObject = boG)
    {
      paramString = new a(str, paramInt, paramString, (String[])localObject);
      AppMethodBeat.o(95729);
      break;
      paramString = ((String)localObject).substring(i).trim();
      localObject = ((String)localObject).substring(0, i);
      break label41;
    }
  }

  public static a te()
  {
    AppMethodBeat.i(95730);
    a locala = new a("", 0, "", new String[0]);
    AppMethodBeat.o(95730);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.f.a
 * JD-Core Version:    0.6.2
 */