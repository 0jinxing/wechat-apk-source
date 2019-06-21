package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b
  implements g
{
  public final void a(h paramh)
  {
    int i = 0;
    AppMethodBeat.i(57319);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('\000');
    while (paramh.vy())
    {
      localStringBuilder.append(paramh.vx());
      paramh.pos += 1;
      j = j.b(paramh.bzH, paramh.pos, 5);
      if (j != 5)
        paramh.bzM = j;
    }
    int k = localStringBuilder.length() - 1;
    int j = paramh.bzL.length() + k + 1;
    paramh.fF(j);
    if (paramh.bzN.bzW - j > 0)
    {
      j = 1;
      if ((paramh.vy()) || (j != 0))
      {
        if (k > 249)
          break label219;
        localStringBuilder.setCharAt(0, (char)k);
      }
      label145: k = localStringBuilder.length();
      j = i;
      label154: if (j >= k)
        break label297;
      i = localStringBuilder.charAt(j) + ((paramh.bzL.length() + 1) * 149 % 255 + 1);
      if (i > 255)
        break label284;
      i = (char)i;
    }
    for (int m = i; ; m = i)
    {
      paramh.d(m);
      j++;
      break label154;
      j = 0;
      break;
      label219: if (k <= 1555)
      {
        localStringBuilder.setCharAt(0, (char)(k / 250 + 249));
        localStringBuilder.insert(1, (char)(k % 250));
        break label145;
      }
      paramh = new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(k)));
      AppMethodBeat.o(57319);
      throw paramh;
      label284: i = (char)(i - 256);
    }
    label297: AppMethodBeat.o(57319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.b
 * JD-Core Version:    0.6.2
 */