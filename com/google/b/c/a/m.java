package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class m extends c
{
  final int a(char paramChar, StringBuilder paramStringBuilder)
  {
    int i = 1;
    AppMethodBeat.i(57171);
    if (paramChar == ' ')
    {
      paramStringBuilder.append('\003');
      AppMethodBeat.o(57171);
    }
    while (true)
    {
      return i;
      if ((paramChar >= '0') && (paramChar <= '9'))
      {
        paramStringBuilder.append((char)(paramChar - '0' + 4));
        AppMethodBeat.o(57171);
      }
      else if ((paramChar >= 'a') && (paramChar <= 'z'))
      {
        paramStringBuilder.append((char)(paramChar - 'a' + 14));
        AppMethodBeat.o(57171);
      }
      else if ((paramChar >= 0) && (paramChar <= '\037'))
      {
        paramStringBuilder.append('\000');
        paramStringBuilder.append(paramChar);
        AppMethodBeat.o(57171);
        i = 2;
      }
      else if ((paramChar >= '!') && (paramChar <= '/'))
      {
        paramStringBuilder.append('\001');
        paramStringBuilder.append((char)(paramChar - '!'));
        AppMethodBeat.o(57171);
        i = 2;
      }
      else if ((paramChar >= ':') && (paramChar <= '@'))
      {
        paramStringBuilder.append('\001');
        paramStringBuilder.append((char)(paramChar - ':' + 15));
        AppMethodBeat.o(57171);
        i = 2;
      }
      else if ((paramChar >= '[') && (paramChar <= '_'))
      {
        paramStringBuilder.append('\001');
        paramStringBuilder.append((char)(paramChar - '[' + 22));
        AppMethodBeat.o(57171);
        i = 2;
      }
      else if (paramChar == '`')
      {
        paramStringBuilder.append('\002');
        paramStringBuilder.append((char)(paramChar - '`'));
        AppMethodBeat.o(57171);
        i = 2;
      }
      else if ((paramChar >= 'A') && (paramChar <= 'Z'))
      {
        paramStringBuilder.append('\002');
        paramStringBuilder.append((char)(paramChar - 'A' + 1));
        AppMethodBeat.o(57171);
        i = 2;
      }
      else if ((paramChar >= '{') && (paramChar <= ''))
      {
        paramStringBuilder.append('\002');
        paramStringBuilder.append((char)(paramChar - '{' + 27));
        AppMethodBeat.o(57171);
        i = 2;
      }
      else if (paramChar >= '')
      {
        paramStringBuilder.append("\001\036");
        i = a((char)(paramChar - ''), paramStringBuilder) + 2;
        AppMethodBeat.o(57171);
      }
      else
      {
        j.h(paramChar);
        i = -1;
        AppMethodBeat.o(57171);
      }
    }
  }

  public final int vu()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.m
 * JD-Core Version:    0.6.2
 */