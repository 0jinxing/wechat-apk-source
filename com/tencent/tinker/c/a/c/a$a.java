package com.tencent.tinker.c.a.c;

import com.tencent.tinker.a.a.b.b;
import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.a.l;
import com.tencent.tinker.a.a.m;
import com.tencent.tinker.a.a.o;

public final class a$a
{
  private final b AAJ;

  public a$a(a parama, b paramb)
  {
    this.AAJ = paramb;
  }

  private void a(m paramm)
  {
    int i = 0;
    switch (paramm.dRL())
    {
    case 1:
    case 5:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    default:
      throw new j("Unexpected type: " + Integer.toHexString(paramm.dRL()));
    case 0:
      l.a(this.AAJ, 0, paramm.readByte());
    case 2:
    case 4:
    case 6:
    case 3:
    case 16:
    case 17:
    case 23:
    case 24:
    case 25:
    case 27:
    case 26:
    case 28:
    case 29:
    case 30:
    case 31:
    }
    while (true)
    {
      return;
      l.a(this.AAJ, 2, paramm.readShort());
      continue;
      l.a(this.AAJ, 4, paramm.readInt());
      continue;
      l.a(this.AAJ, 6, paramm.readLong());
      continue;
      l.b(this.AAJ, 3, paramm.readChar());
      continue;
      long l = Float.floatToIntBits(paramm.readFloat());
      l.c(this.AAJ, 16, l << 32);
      continue;
      l.c(this.AAJ, 17, Double.doubleToLongBits(paramm.readDouble()));
      continue;
      l.b(this.AAJ, 23, this.AAH.RL(paramm.dRP()));
      continue;
      l.b(this.AAJ, 24, this.AAH.RM(paramm.dRQ()));
      continue;
      l.b(this.AAJ, 25, this.AAH.RO(paramm.dRR()));
      continue;
      l.b(this.AAJ, 27, this.AAH.RO(paramm.dRS()));
      continue;
      l.b(this.AAJ, 26, this.AAH.RP(paramm.dRT()));
      continue;
      id(28, 0);
      c(paramm);
      continue;
      id(29, 0);
      b(paramm);
      continue;
      paramm.dRU();
      id(30, 0);
      continue;
      if (paramm.readBoolean())
        i = 1;
      id(31, i);
    }
  }

  private void id(int paramInt1, int paramInt2)
  {
    this.AAJ.writeByte(paramInt2 << 5 | paramInt1);
  }

  public final void b(m paramm)
  {
    int i = paramm.dRN();
    o.a(this.AAJ, this.AAH.RM(paramm.Ayk));
    o.a(this.AAJ, i);
    for (int j = 0; j < i; j++)
    {
      o.a(this.AAJ, this.AAH.RL(paramm.dRO()));
      a(paramm);
    }
  }

  public final void c(m paramm)
  {
    int i = paramm.dRM();
    o.a(this.AAJ, i);
    for (int j = 0; j < i; j++)
      a(paramm);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.c.a.a
 * JD-Core Version:    0.6.2
 */