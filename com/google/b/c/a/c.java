package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

class c
  implements g
{
  private int a(h paramh, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, int paramInt)
  {
    AppMethodBeat.i(57290);
    int i = paramStringBuilder1.length();
    paramStringBuilder1.delete(i - paramInt, i);
    paramh.pos -= 1;
    paramInt = a(paramh.vx(), paramStringBuilder2);
    paramh.bzN = null;
    AppMethodBeat.o(57290);
    return paramInt;
  }

  static void a(h paramh, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(57291);
    int i = paramStringBuilder.charAt(0) * 'ـ' + paramStringBuilder.charAt(1) * '(' + paramStringBuilder.charAt(2) + 1;
    paramh.bi(new String(new char[] { (char)(i / 256), (char)(i % 256) }));
    paramStringBuilder.delete(0, 3);
    AppMethodBeat.o(57291);
  }

  int a(char paramChar, StringBuilder paramStringBuilder)
  {
    int i = 1;
    AppMethodBeat.i(57293);
    if (paramChar == ' ')
    {
      paramStringBuilder.append('\003');
      AppMethodBeat.o(57293);
    }
    while (true)
    {
      return i;
      if ((paramChar >= '0') && (paramChar <= '9'))
      {
        paramStringBuilder.append((char)(paramChar - '0' + 4));
        AppMethodBeat.o(57293);
      }
      else if ((paramChar >= 'A') && (paramChar <= 'Z'))
      {
        paramStringBuilder.append((char)(paramChar - 'A' + 14));
        AppMethodBeat.o(57293);
      }
      else if ((paramChar >= 0) && (paramChar <= '\037'))
      {
        paramStringBuilder.append('\000');
        paramStringBuilder.append(paramChar);
        AppMethodBeat.o(57293);
        i = 2;
      }
      else if ((paramChar >= '!') && (paramChar <= '/'))
      {
        paramStringBuilder.append('\001');
        paramStringBuilder.append((char)(paramChar - '!'));
        AppMethodBeat.o(57293);
        i = 2;
      }
      else if ((paramChar >= ':') && (paramChar <= '@'))
      {
        paramStringBuilder.append('\001');
        paramStringBuilder.append((char)(paramChar - ':' + 15));
        AppMethodBeat.o(57293);
        i = 2;
      }
      else if ((paramChar >= '[') && (paramChar <= '_'))
      {
        paramStringBuilder.append('\001');
        paramStringBuilder.append((char)(paramChar - '[' + 22));
        AppMethodBeat.o(57293);
        i = 2;
      }
      else if ((paramChar >= '`') && (paramChar <= ''))
      {
        paramStringBuilder.append('\002');
        paramStringBuilder.append((char)(paramChar - '`'));
        AppMethodBeat.o(57293);
        i = 2;
      }
      else
      {
        if (paramChar < '')
          break;
        paramStringBuilder.append("\001\036");
        i = a((char)(paramChar - ''), paramStringBuilder) + 2;
        AppMethodBeat.o(57293);
      }
    }
    paramStringBuilder = new IllegalArgumentException("Illegal character: ".concat(String.valueOf(paramChar)));
    AppMethodBeat.o(57293);
    throw paramStringBuilder;
  }

  public void a(h paramh)
  {
    AppMethodBeat.i(57289);
    StringBuilder localStringBuilder1 = new StringBuilder();
    while (paramh.vy())
    {
      char c = paramh.vx();
      paramh.pos += 1;
      int i = a(c, localStringBuilder1);
      int j = (localStringBuilder1.length() / 3 << 1) + paramh.bzL.length();
      paramh.fF(j);
      int k = paramh.bzN.bzW - j;
      if (!paramh.vy())
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        j = i;
        if (localStringBuilder1.length() % 3 == 2)
          if (k >= 2)
          {
            j = i;
            if (k <= 2)
              break label137;
          }
        label137: for (j = a(paramh, localStringBuilder1, localStringBuilder2, i); (localStringBuilder1.length() % 3 == 1) && (((j <= 3) && (k != 1)) || (j > 3)); j = a(paramh, localStringBuilder1, localStringBuilder2, j));
      }
      if (localStringBuilder1.length() % 3 == 0)
      {
        j = j.b(paramh.bzH, paramh.pos, vu());
        if (j != vu())
          paramh.bzM = j;
      }
    }
    b(paramh, localStringBuilder1);
    AppMethodBeat.o(57289);
  }

  void b(h paramh, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(57292);
    int i = paramStringBuilder.length() / 3;
    int j = paramStringBuilder.length() % 3;
    i = (i << 1) + paramh.bzL.length();
    paramh.fF(i);
    i = paramh.bzN.bzW - i;
    if (j == 2)
    {
      paramStringBuilder.append('\000');
      while (paramStringBuilder.length() >= 3)
        a(paramh, paramStringBuilder);
      if (paramh.vy())
        paramh.d('þ');
    }
    while (true)
    {
      paramh.bzM = 0;
      AppMethodBeat.o(57292);
      return;
      if ((i == 1) && (j == 1))
      {
        while (paramStringBuilder.length() >= 3)
          a(paramh, paramStringBuilder);
        if (paramh.vy())
          paramh.d('þ');
        paramh.pos -= 1;
      }
      else
      {
        if (j != 0)
          break;
        while (paramStringBuilder.length() >= 3)
          a(paramh, paramStringBuilder);
        if ((i > 0) || (paramh.vy()))
          paramh.d('þ');
      }
    }
    paramh = new IllegalStateException("Unexpected case. Please report!");
    AppMethodBeat.o(57292);
    throw paramh;
  }

  public int vu()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.c
 * JD-Core Version:    0.6.2
 */