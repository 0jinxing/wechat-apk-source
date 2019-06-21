package a.i.b.a.c.i.b;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class e extends m<Character>
{
  public e(char paramChar)
  {
    super(Character.valueOf(paramChar));
    AppMethodBeat.i(122077);
    AppMethodBeat.o(122077);
  }

  public final String toString()
  {
    AppMethodBeat.i(122076);
    int i = ((Character)getValue()).charValue();
    char c = ((Character)getValue()).charValue();
    int j;
    switch (c)
    {
    case '\013':
    default:
      j = (byte)Character.getType(c);
      if ((j != 0) && (j != 13) && (j != 14) && (j != 15) && (j != 16) && (j != 18) && (j != 19))
      {
        j = 1;
        if (j == 0)
          break label215;
      }
      break;
    case '\b':
    case '\t':
    case '\n':
    case '\f':
    case '\r':
    }
    label215: for (String str = Character.toString(c); ; str = "?")
    {
      j.o(str, "if (isPrintableUnicode(c…cter.toString(c) else \"?\"");
      while (true)
      {
        str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[] { Integer.valueOf(i), str }, 2));
        j.o(str, "java.lang.String.format(this, *args)");
        AppMethodBeat.o(122076);
        return str;
        str = "\\b";
        continue;
        str = "\\t";
        continue;
        str = "\\n";
        continue;
        str = "\\f";
        continue;
        str = "\\r";
      }
      j = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.e
 * JD-Core Version:    0.6.2
 */