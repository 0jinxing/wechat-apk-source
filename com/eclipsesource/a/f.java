package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Reader;
import java.io.StringReader;

final class f
{
  private int aLA;
  private int aLB;
  private StringBuilder aLC;
  private int aLD;
  private final char[] aLx;
  private int aLy;
  private int aLz;
  private int index;
  private int line;
  private final Reader reader;

  private f(Reader paramReader, int paramInt)
  {
    AppMethodBeat.i(70556);
    this.reader = paramReader;
    this.aLx = new char[paramInt];
    this.line = 1;
    this.aLD = -1;
    AppMethodBeat.o(70556);
  }

  f(String paramString)
  {
    this(new StringReader(paramString), Math.max(10, Math.min(1024, paramString.length())));
    AppMethodBeat.i(70555);
    AppMethodBeat.o(70555);
  }

  private void a(char paramChar)
  {
    AppMethodBeat.i(70564);
    if (!b(paramChar))
    {
      j localj = al("'" + paramChar + "'");
      AppMethodBeat.o(70564);
      throw localj;
    }
    AppMethodBeat.o(70564);
  }

  private j al(String paramString)
  {
    AppMethodBeat.i(70578);
    if (pp())
    {
      paramString = am("Unexpected end of input");
      AppMethodBeat.o(70578);
    }
    while (true)
    {
      return paramString;
      paramString = am("Expected ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(70578);
    }
  }

  private boolean b(char paramChar)
  {
    AppMethodBeat.i(70571);
    boolean bool;
    if (this.aLB != paramChar)
    {
      bool = false;
      AppMethodBeat.o(70571);
    }
    while (true)
    {
      return bool;
      pi();
      bool = true;
      AppMethodBeat.o(70571);
    }
  }

  private b oU()
  {
    AppMethodBeat.i(70558);
    pi();
    Object localObject = new b();
    ph();
    if (b(']'))
      AppMethodBeat.o(70558);
    while (true)
    {
      return localObject;
      do
      {
        ph();
        ((b)localObject).a(oT());
        ph();
      }
      while (b(','));
      if (!b(']'))
      {
        localObject = al("',' or ']'");
        AppMethodBeat.o(70558);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(70558);
    }
  }

  private e oV()
  {
    AppMethodBeat.i(70559);
    pi();
    e locale = new e();
    ph();
    if (b('}'))
      AppMethodBeat.o(70559);
    while (true)
    {
      return locale;
      Object localObject;
      do
      {
        ph();
        localObject = oW();
        ph();
        if (!b(':'))
        {
          localObject = al("':'");
          AppMethodBeat.o(70559);
          throw ((Throwable)localObject);
        }
        ph();
        locale.a((String)localObject, oT());
        ph();
      }
      while (b(','));
      if (!b('}'))
      {
        localObject = al("',' or '}'");
        AppMethodBeat.o(70559);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(70559);
    }
  }

  private String oW()
  {
    AppMethodBeat.i(70560);
    if (this.aLB != 34)
    {
      localObject = al("name");
      AppMethodBeat.o(70560);
      throw ((Throwable)localObject);
    }
    Object localObject = pb();
    AppMethodBeat.o(70560);
    return localObject;
  }

  private h oX()
  {
    AppMethodBeat.i(70561);
    pi();
    a('u');
    a('l');
    a('l');
    h localh = a.aLi;
    AppMethodBeat.o(70561);
    return localh;
  }

  private h oY()
  {
    AppMethodBeat.i(70562);
    pi();
    a('r');
    a('u');
    a('e');
    h localh = a.aLj;
    AppMethodBeat.o(70562);
    return localh;
  }

  private h oZ()
  {
    AppMethodBeat.i(70563);
    pi();
    a('a');
    a('l');
    a('s');
    a('e');
    h localh = a.aLk;
    AppMethodBeat.o(70563);
    return localh;
  }

  private h pa()
  {
    AppMethodBeat.i(70565);
    g localg = new g(pb());
    AppMethodBeat.o(70565);
    return localg;
  }

  private String pb()
  {
    AppMethodBeat.i(70566);
    pi();
    pj();
    while (this.aLB != 34)
      if (this.aLB == 92)
      {
        pk();
        pc();
        pj();
      }
      else
      {
        if (this.aLB < 32)
        {
          localObject = al("valid string character");
          AppMethodBeat.o(70566);
          throw ((Throwable)localObject);
        }
        pi();
      }
    Object localObject = pl();
    pi();
    AppMethodBeat.o(70566);
    return localObject;
  }

  private void pc()
  {
    AppMethodBeat.i(70567);
    pi();
    Object localObject;
    switch (this.aLB)
    {
    default:
      localObject = al("valid escape sequence");
      AppMethodBeat.o(70567);
      throw ((Throwable)localObject);
    case 34:
    case 47:
    case 92:
      this.aLC.append((char)this.aLB);
    case 98:
    case 102:
    case 110:
    case 114:
    case 116:
    case 117:
    }
    while (true)
    {
      pi();
      AppMethodBeat.o(70567);
      return;
      this.aLC.append('\b');
      continue;
      this.aLC.append('\f');
      continue;
      this.aLC.append('\n');
      continue;
      this.aLC.append('\r');
      continue;
      this.aLC.append('\t');
      continue;
      localObject = new char[4];
      for (int i = 0; i < 4; i++)
      {
        pi();
        if (!po())
        {
          localObject = al("hexadecimal digit");
          AppMethodBeat.o(70567);
          throw ((Throwable)localObject);
        }
        localObject[i] = ((char)(char)this.aLB);
      }
      this.aLC.append((char)Integer.parseInt(new String((char[])localObject), 16));
    }
  }

  private h pd()
  {
    AppMethodBeat.i(70568);
    pj();
    b('-');
    int i = this.aLB;
    if (!pg())
    {
      localObject = al("digit");
      AppMethodBeat.o(70568);
      throw ((Throwable)localObject);
    }
    while ((i != 48) && (pg()));
    pe();
    pf();
    Object localObject = new d(pl());
    AppMethodBeat.o(70568);
    return localObject;
  }

  private boolean pe()
  {
    AppMethodBeat.i(70569);
    boolean bool;
    if (!b('.'))
    {
      bool = false;
      AppMethodBeat.o(70569);
    }
    while (true)
    {
      return bool;
      if (!pg())
      {
        j localj = al("digit");
        AppMethodBeat.o(70569);
        throw localj;
      }
      while (pg());
      bool = true;
      AppMethodBeat.o(70569);
    }
  }

  private boolean pf()
  {
    AppMethodBeat.i(70570);
    boolean bool;
    if ((!b('e')) && (!b('E')))
    {
      bool = false;
      AppMethodBeat.o(70570);
    }
    while (true)
    {
      return bool;
      if (!b('+'))
        b('-');
      if (!pg())
      {
        j localj = al("digit");
        AppMethodBeat.o(70570);
        throw localj;
      }
      while (pg());
      bool = true;
      AppMethodBeat.o(70570);
    }
  }

  private boolean pg()
  {
    AppMethodBeat.i(70572);
    boolean bool;
    if (!pn())
    {
      bool = false;
      AppMethodBeat.o(70572);
    }
    while (true)
    {
      return bool;
      pi();
      bool = true;
      AppMethodBeat.o(70572);
    }
  }

  private void pj()
  {
    AppMethodBeat.i(70575);
    if (this.aLC == null)
      this.aLC = new StringBuilder();
    this.aLD = (this.index - 1);
    AppMethodBeat.o(70575);
  }

  private void pk()
  {
    AppMethodBeat.i(70576);
    if (this.aLB == -1);
    for (int i = this.index; ; i = this.index - 1)
    {
      StringBuilder localStringBuilder = this.aLC;
      char[] arrayOfChar = this.aLx;
      int j = this.aLD;
      localStringBuilder.append(arrayOfChar, j, i - j);
      this.aLD = -1;
      AppMethodBeat.o(70576);
      return;
    }
  }

  private String pl()
  {
    AppMethodBeat.i(70577);
    int i;
    Object localObject;
    if (this.aLB == -1)
    {
      i = this.index;
      if (this.aLC.length() <= 0)
        break label94;
      localObject = this.aLC;
      char[] arrayOfChar = this.aLx;
      int j = this.aLD;
      ((StringBuilder)localObject).append(arrayOfChar, j, i - j);
      localObject = this.aLC.toString();
      this.aLC.setLength(0);
    }
    while (true)
    {
      this.aLD = -1;
      AppMethodBeat.o(70577);
      return localObject;
      i = this.index - 1;
      break;
      label94: localObject = new String(this.aLx, this.aLD, i - this.aLD);
    }
  }

  private boolean pm()
  {
    if ((this.aLB == 32) || (this.aLB == 9) || (this.aLB == 10) || (this.aLB == 13));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean pn()
  {
    if ((this.aLB >= 48) && (this.aLB <= 57));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean po()
  {
    if (((this.aLB >= 48) && (this.aLB <= 57)) || ((this.aLB >= 97) && (this.aLB <= 102)) || ((this.aLB >= 65) && (this.aLB <= 70)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final j am(String paramString)
  {
    AppMethodBeat.i(70579);
    int i = this.aLy + this.index;
    int j = this.aLA;
    if (pp());
    for (int k = i; ; k = i - 1)
    {
      paramString = new j(paramString, k, this.line, i - j - 1);
      AppMethodBeat.o(70579);
      return paramString;
    }
  }

  final h oT()
  {
    AppMethodBeat.i(70557);
    Object localObject;
    switch (this.aLB)
    {
    default:
      localObject = al("value");
      AppMethodBeat.o(70557);
      throw ((Throwable)localObject);
    case 110:
      localObject = oX();
      AppMethodBeat.o(70557);
    case 116:
    case 102:
    case 34:
    case 91:
    case 123:
    case 45:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    }
    while (true)
    {
      return localObject;
      localObject = oY();
      AppMethodBeat.o(70557);
      continue;
      localObject = oZ();
      AppMethodBeat.o(70557);
      continue;
      localObject = pa();
      AppMethodBeat.o(70557);
      continue;
      localObject = oU();
      AppMethodBeat.o(70557);
      continue;
      localObject = oV();
      AppMethodBeat.o(70557);
      continue;
      localObject = pd();
      AppMethodBeat.o(70557);
    }
  }

  final void ph()
  {
    AppMethodBeat.i(70573);
    while (pm())
      pi();
    AppMethodBeat.o(70573);
  }

  final void pi()
  {
    AppMethodBeat.i(70574);
    if (this.index == this.aLz)
    {
      if (this.aLD != -1)
      {
        this.aLC.append(this.aLx, this.aLD, this.aLz - this.aLD);
        this.aLD = 0;
      }
      this.aLy += this.aLz;
      this.aLz = this.reader.read(this.aLx, 0, this.aLx.length);
      this.index = 0;
      if (this.aLz == -1)
      {
        this.aLB = -1;
        AppMethodBeat.o(70574);
      }
    }
    while (true)
    {
      return;
      if (this.aLB == 10)
      {
        this.line += 1;
        this.aLA = (this.aLy + this.index);
      }
      char[] arrayOfChar = this.aLx;
      int i = this.index;
      this.index = (i + 1);
      this.aLB = arrayOfChar[i];
      AppMethodBeat.o(70574);
    }
  }

  final boolean pp()
  {
    if (this.aLB == -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.f
 * JD-Core Version:    0.6.2
 */