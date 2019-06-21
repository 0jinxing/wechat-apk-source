package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class n extends c
{
  final int a(char paramChar, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(57223);
    if (paramChar == '\r')
      paramStringBuilder.append('\000');
    while (true)
    {
      AppMethodBeat.o(57223);
      return 1;
      if (paramChar == '*')
        paramStringBuilder.append('\001');
      else if (paramChar == '>')
        paramStringBuilder.append('\002');
      else if (paramChar == ' ')
        paramStringBuilder.append('\003');
      else if ((paramChar >= '0') && (paramChar <= '9'))
        paramStringBuilder.append((char)(paramChar - '0' + 4));
      else if ((paramChar >= 'A') && (paramChar <= 'Z'))
        paramStringBuilder.append((char)(paramChar - 'A' + 14));
      else
        j.h(paramChar);
    }
  }

  public final void a(h paramh)
  {
    AppMethodBeat.i(57222);
    StringBuilder localStringBuilder = new StringBuilder();
    while (paramh.vy())
    {
      char c = paramh.vx();
      paramh.pos += 1;
      a(c, localStringBuilder);
      if (localStringBuilder.length() % 3 == 0)
      {
        a(paramh, localStringBuilder);
        int i = j.b(paramh.bzH, paramh.pos, 3);
        if (i != 3)
          paramh.bzM = i;
      }
    }
    b(paramh, localStringBuilder);
    AppMethodBeat.o(57222);
  }

  final void b(h paramh, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(57224);
    paramh.vB();
    int i = paramh.bzN.bzW - paramh.bzL.length();
    int j = paramStringBuilder.length();
    paramh.pos -= j;
    if ((paramh.vA() > 1) || (i > 1) || (paramh.vA() != i))
      paramh.d('þ');
    if (paramh.bzM < 0)
      paramh.bzM = 0;
    AppMethodBeat.o(57224);
  }

  public final int vu()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.n
 * JD-Core Version:    0.6.2
 */