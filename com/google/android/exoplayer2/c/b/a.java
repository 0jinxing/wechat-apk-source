package com.google.android.exoplayer2.c.b;

import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Stack;

final class a
  implements b
{
  private final byte[] aTA;
  private final Stack<a.a> aTB;
  private final f aTC;
  private c aTD;
  private int aTE;
  private int aTF;
  private long aTG;

  a()
  {
    AppMethodBeat.i(94884);
    this.aTA = new byte[8];
    this.aTB = new Stack();
    this.aTC = new f();
    AppMethodBeat.o(94884);
  }

  private long a(com.google.android.exoplayer2.c.f paramf, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(94887);
    paramf.readFully(this.aTA, 0, paramInt);
    long l = 0L;
    while (i < paramInt)
    {
      l = l << 8 | this.aTA[i] & 0xFF;
      i++;
    }
    AppMethodBeat.o(94887);
    return l;
  }

  public final void a(c paramc)
  {
    this.aTD = paramc;
  }

  public final boolean c(com.google.android.exoplayer2.c.f paramf)
  {
    boolean bool1 = true;
    AppMethodBeat.i(94886);
    boolean bool2;
    if (this.aTD != null)
    {
      bool2 = true;
      com.google.android.exoplayer2.i.a.checkState(bool2);
    }
    while (true)
    {
      if ((!this.aTB.isEmpty()) && (paramf.getPosition() >= ((a.a)this.aTB.peek()).aTH))
      {
        this.aTD.dQ(((a.a)this.aTB.pop()).aTF);
        AppMethodBeat.o(94886);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        bool2 = false;
        break;
        long l1;
        long l2;
        int i;
        if (this.aTE == 0)
        {
          l1 = this.aTC.a(paramf, true, false, 4);
          l2 = l1;
          if (l1 == -2L)
            paramf.qY();
          while (true)
          {
            paramf.b(this.aTA, 0, 4);
            i = f.dR(this.aTA[0]);
            if ((i != -1) && (i <= 4))
            {
              j = (int)f.b(this.aTA, i, false);
              if (this.aTD.dP(j))
              {
                paramf.dG(i);
                l2 = j;
                if (l2 != -1L)
                  break label232;
                AppMethodBeat.o(94886);
                bool2 = false;
                break;
              }
            }
            paramf.dG(1);
          }
          label232: this.aTF = ((int)l2);
          this.aTE = 1;
        }
        if (this.aTE == 1)
        {
          this.aTG = this.aTC.a(paramf, false, true, 8);
          this.aTE = 2;
        }
        int j = this.aTD.dO(this.aTF);
        c localc;
        switch (j)
        {
        default:
          paramf = new o("Invalid element type ".concat(String.valueOf(j)));
          AppMethodBeat.o(94886);
          throw paramf;
        case 1:
          l2 = paramf.getPosition();
          l1 = this.aTG;
          this.aTB.add(new a.a(this.aTF, l1 + l2, (byte)0));
          this.aTD.f(this.aTF, l2, this.aTG);
          this.aTE = 0;
          AppMethodBeat.o(94886);
          bool2 = bool1;
          break;
        case 2:
          if (this.aTG > 8L)
          {
            paramf = new o("Invalid integer size: " + this.aTG);
            AppMethodBeat.o(94886);
            throw paramf;
          }
          this.aTD.h(this.aTF, a(paramf, (int)this.aTG));
          this.aTE = 0;
          AppMethodBeat.o(94886);
          bool2 = bool1;
          break;
        case 5:
          if ((this.aTG != 4L) && (this.aTG != 8L))
          {
            paramf = new o("Invalid float size: " + this.aTG);
            AppMethodBeat.o(94886);
            throw paramf;
          }
          localc = this.aTD;
          j = this.aTF;
          i = (int)this.aTG;
          l2 = a(paramf, i);
          if (i == 4);
          for (double d = Float.intBitsToFloat((int)l2); ; d = Double.longBitsToDouble(l2))
          {
            localc.c(j, d);
            this.aTE = 0;
            AppMethodBeat.o(94886);
            bool2 = bool1;
            break;
          }
        case 3:
          if (this.aTG > 2147483647L)
          {
            paramf = new o("String element size: " + this.aTG);
            AppMethodBeat.o(94886);
            throw paramf;
          }
          localc = this.aTD;
          i = this.aTF;
          j = (int)this.aTG;
          if (j == 0);
          byte[] arrayOfByte;
          for (paramf = ""; ; paramf = new String(arrayOfByte))
          {
            localc.d(i, paramf);
            this.aTE = 0;
            AppMethodBeat.o(94886);
            bool2 = bool1;
            break;
            arrayOfByte = new byte[j];
            paramf.readFully(arrayOfByte, 0, j);
          }
        case 4:
          this.aTD.a(this.aTF, (int)this.aTG, paramf);
          this.aTE = 0;
          AppMethodBeat.o(94886);
          bool2 = bool1;
        case 0:
        }
      }
      paramf.dG((int)this.aTG);
      this.aTE = 0;
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(94885);
    this.aTE = 0;
    this.aTB.clear();
    this.aTC.reset();
    AppMethodBeat.o(94885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.b.a
 * JD-Core Version:    0.6.2
 */