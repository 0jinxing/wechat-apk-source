package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a
  implements g
{
  public final void a(h paramh)
  {
    AppMethodBeat.i(57206);
    String str = paramh.bzH;
    int i = paramh.pos;
    int j = str.length();
    int m;
    if (i < j)
    {
      k = str.charAt(i);
      m = 0;
      int n = k;
      while (true)
      {
        k = m;
        if (!j.isDigit(n))
          break;
        k = m;
        if (i >= j)
          break;
        k = m + 1;
        int i1 = i + 1;
        i = i1;
        m = k;
        if (i1 < j)
        {
          int i2 = str.charAt(i1);
          i = i1;
          m = k;
          n = i2;
        }
      }
    }
    int k = 0;
    char c2;
    char c1;
    if (k >= 2)
    {
      c2 = paramh.bzH.charAt(paramh.pos);
      c1 = paramh.bzH.charAt(paramh.pos + 1);
      if ((j.isDigit(c2)) && (j.isDigit(c1)))
      {
        paramh.d((char)((c2 - '0') * 10 + (c1 - '0') + 130));
        paramh.pos += 2;
        AppMethodBeat.o(57206);
      }
    }
    while (true)
    {
      return;
      paramh = new IllegalArgumentException("not digits: " + c2 + c1);
      AppMethodBeat.o(57206);
      throw paramh;
      c1 = paramh.vx();
      m = j.b(paramh.bzH, paramh.pos, 0);
      if (m != 0)
      {
        switch (m)
        {
        default:
          paramh = new IllegalStateException("Illegal mode: ".concat(String.valueOf(m)));
          AppMethodBeat.o(57206);
          throw paramh;
        case 5:
          paramh.d('ç');
          paramh.bzM = 5;
          AppMethodBeat.o(57206);
          break;
        case 1:
          paramh.d('æ');
          paramh.bzM = 1;
          AppMethodBeat.o(57206);
          break;
        case 3:
          paramh.d('î');
          paramh.bzM = 3;
          AppMethodBeat.o(57206);
          break;
        case 2:
          paramh.d('ï');
          paramh.bzM = 2;
          AppMethodBeat.o(57206);
          break;
        case 4:
          paramh.d('ð');
          paramh.bzM = 4;
          AppMethodBeat.o(57206);
          break;
        }
      }
      else if (j.e(c1))
      {
        paramh.d('ë');
        paramh.d((char)(c1 - '' + 1));
        paramh.pos += 1;
        AppMethodBeat.o(57206);
      }
      else
      {
        paramh.d((char)(c1 + '\001'));
        paramh.pos += 1;
        AppMethodBeat.o(57206);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.a
 * JD-Core Version:    0.6.2
 */