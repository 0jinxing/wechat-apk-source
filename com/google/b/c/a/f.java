package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class f
  implements g
{
  private static String q(CharSequence paramCharSequence)
  {
    int i = 0;
    AppMethodBeat.i(57295);
    int j = paramCharSequence.length() + 0;
    if (j == 0)
    {
      paramCharSequence = new IllegalStateException("StringBuilder must not be empty");
      AppMethodBeat.o(57295);
      throw paramCharSequence;
    }
    int k = paramCharSequence.charAt(0);
    int m;
    if (j >= 2)
    {
      m = paramCharSequence.charAt(1);
      if (j < 3)
        break label197;
    }
    label197: for (int n = paramCharSequence.charAt(2); ; n = 0)
    {
      if (j >= 4)
        i = paramCharSequence.charAt(3);
      m = i + ((n << 6) + ((m << 12) + (k << 18)));
      char c1 = (char)(m >> 16 & 0xFF);
      char c2 = (char)(m >> 8 & 0xFF);
      char c3 = (char)(m & 0xFF);
      paramCharSequence = new StringBuilder(3);
      paramCharSequence.append(c1);
      if (j >= 2)
        paramCharSequence.append(c2);
      if (j >= 3)
        paramCharSequence.append(c3);
      paramCharSequence = paramCharSequence.toString();
      AppMethodBeat.o(57295);
      return paramCharSequence;
      m = 0;
      break;
    }
  }

  public final void a(h paramh)
  {
    int i = 1;
    AppMethodBeat.i(57294);
    Object localObject = new StringBuilder();
    char c;
    if (paramh.vy())
    {
      c = paramh.vx();
      if ((c < ' ') || (c > '?'))
        break label134;
      ((StringBuilder)localObject).append(c);
    }
    int j;
    label134: int k;
    while (true)
    {
      paramh.pos += 1;
      if (((StringBuilder)localObject).length() < 4)
        break;
      paramh.bi(q((CharSequence)localObject));
      ((StringBuilder)localObject).delete(0, 4);
      if (j.b(paramh.bzH, paramh.pos, 4) == 4)
        break;
      paramh.bzM = 0;
      ((StringBuilder)localObject).append('\037');
      try
      {
        j = ((CharSequence)localObject).length();
        if (j == 0);
        while (true)
        {
          return;
          if ((c >= '@') && (c <= '^'))
          {
            ((StringBuilder)localObject).append((char)(c - '@'));
            break;
          }
          j.h(c);
          break;
          if (j != 1)
            break label231;
          paramh.vB();
          k = paramh.bzN.bzW;
          int m = paramh.bzL.length();
          int n = paramh.vA();
          if ((n != 0) || (k - m > 2))
            break label231;
          paramh.bzM = 0;
          AppMethodBeat.o(57294);
        }
        label231: if (j > 4)
        {
          localObject = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject).<init>("Count must not exceed 4");
          AppMethodBeat.o(57294);
          throw ((Throwable)localObject);
        }
      }
      finally
      {
        paramh.bzM = 0;
        AppMethodBeat.o(57294);
      }
    }
    j--;
    String str = q(localCharSequence);
    if (!paramh.vy())
    {
      k = 1;
      label285: if ((k == 0) || (j > 2))
        break label401;
      k = i;
      label299: i = k;
      if (j <= 2)
      {
        paramh.fF(paramh.bzL.length() + j);
        i = k;
        if (paramh.bzN.bzW - paramh.bzL.length() >= 3)
        {
          paramh.fF(paramh.bzL.length() + str.length());
          i = 0;
        }
      }
      if (i == 0)
        break label407;
      paramh.bzN = null;
      paramh.pos -= j;
    }
    while (true)
    {
      paramh.bzM = 0;
      AppMethodBeat.o(57294);
      break;
      k = 0;
      break label285;
      label401: k = 0;
      break label299;
      label407: paramh.bi(str);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.f
 * JD-Core Version:    0.6.2
 */