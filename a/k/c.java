package a.k;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"equals", "", "", "other", "ignoreCase", "isSurrogate", "plus", "", "kotlin-stdlib"}, dWr=1)
public class c extends b
{
  public static final boolean a(char paramChar1, char paramChar2, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(56297);
    if (paramChar1 == paramChar2)
    {
      AppMethodBeat.o(56297);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (!paramBoolean)
      {
        AppMethodBeat.o(56297);
        paramBoolean = false;
      }
      else if (Character.toUpperCase(paramChar1) == Character.toUpperCase(paramChar2))
      {
        AppMethodBeat.o(56297);
        paramBoolean = bool;
      }
      else if (Character.toLowerCase(paramChar1) == Character.toLowerCase(paramChar2))
      {
        AppMethodBeat.o(56297);
        paramBoolean = bool;
      }
      else
      {
        AppMethodBeat.o(56297);
        paramBoolean = false;
      }
    }
  }

  public static final boolean isSurrogate(char paramChar)
  {
    if (55296 > paramChar);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      if (57343 < paramChar)
        break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.k.c
 * JD-Core Version:    0.6.2
 */