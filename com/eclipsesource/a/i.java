package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;

class i
{
  private static final char[] HEX_DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final char[] aLE = { 92, 34 };
  private static final char[] aLF = { 92, 92 };
  private static final char[] aLG = { 92, 110 };
  private static final char[] aLH = { 92, 114 };
  private static final char[] aLI = { 92, 116 };
  private static final char[] aLJ = { 92, 117, 50, 48, 50, 56 };
  private static final char[] aLK = { 92, 117, 50, 48, 50, 57 };
  protected final Writer writer;

  i(Writer paramWriter)
  {
    this.writer = paramWriter;
  }

  private void aq(String paramString)
  {
    AppMethodBeat.i(70595);
    int i = paramString.length();
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      char[] arrayOfChar = c(paramString.charAt(j));
      m = k;
      if (arrayOfChar != null)
      {
        this.writer.write(paramString, k, j - k);
        this.writer.write(arrayOfChar);
        m = j + 1;
      }
      j++;
    }
    this.writer.write(paramString, k, i - k);
    AppMethodBeat.o(70595);
  }

  private static char[] c(char paramChar)
  {
    Object localObject1 = null;
    Object localObject2;
    if (paramChar > '\\')
    {
      localObject2 = localObject1;
      if (paramChar >= ' ')
      {
        if (paramChar <= ' ')
          break label28;
        localObject2 = localObject1;
      }
    }
    while (true)
    {
      return localObject2;
      label28: if (paramChar == ' ')
      {
        localObject2 = aLJ;
      }
      else
      {
        localObject2 = aLK;
        continue;
        if (paramChar == '\\')
        {
          localObject2 = aLF;
        }
        else
        {
          localObject2 = localObject1;
          if (paramChar <= '"')
            if (paramChar == '"')
            {
              localObject2 = aLE;
            }
            else
            {
              localObject2 = localObject1;
              if (paramChar <= '\037')
                if (paramChar == '\n')
                {
                  localObject2 = aLG;
                }
                else if (paramChar == '\r')
                {
                  localObject2 = aLH;
                }
                else if (paramChar == '\t')
                {
                  localObject2 = aLI;
                }
                else
                {
                  localObject2 = new char[6];
                  localObject2[0] = ((char)92);
                  localObject2[1] = ((char)117);
                  localObject2[2] = ((char)48);
                  localObject2[3] = ((char)48);
                  localObject2[4] = ((char)HEX_DIGITS[(paramChar >> '\004' & 0xF)]);
                  localObject2[5] = ((char)HEX_DIGITS[(paramChar & 0xF)]);
                }
            }
        }
      }
    }
  }

  protected final void an(String paramString)
  {
    AppMethodBeat.i(70584);
    this.writer.write(paramString);
    AppMethodBeat.o(70584);
  }

  protected final void ao(String paramString)
  {
    AppMethodBeat.i(70585);
    this.writer.write(paramString);
    AppMethodBeat.o(70585);
  }

  protected final void ap(String paramString)
  {
    AppMethodBeat.i(70592);
    this.writer.write(34);
    aq(paramString);
    this.writer.write(34);
    AppMethodBeat.o(70592);
  }

  protected void pr()
  {
    AppMethodBeat.i(70587);
    this.writer.write(91);
    AppMethodBeat.o(70587);
  }

  protected void ps()
  {
    AppMethodBeat.i(70588);
    this.writer.write(93);
    AppMethodBeat.o(70588);
  }

  protected void pt()
  {
    AppMethodBeat.i(70589);
    this.writer.write(44);
    AppMethodBeat.o(70589);
  }

  protected void pu()
  {
    AppMethodBeat.i(70590);
    this.writer.write(123);
    AppMethodBeat.o(70590);
  }

  protected void pv()
  {
    AppMethodBeat.i(70591);
    this.writer.write(125);
    AppMethodBeat.o(70591);
  }

  protected void pw()
  {
    AppMethodBeat.i(70593);
    this.writer.write(58);
    AppMethodBeat.o(70593);
  }

  protected void px()
  {
    AppMethodBeat.i(70594);
    this.writer.write(44);
    AppMethodBeat.o(70594);
  }

  protected final void writeString(String paramString)
  {
    AppMethodBeat.i(70586);
    this.writer.write(34);
    aq(paramString);
    this.writer.write(34);
    AppMethodBeat.o(70586);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.i
 * JD-Core Version:    0.6.2
 */