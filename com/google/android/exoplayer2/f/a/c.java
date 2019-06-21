package com.google.android.exoplayer2.f.a;

import com.google.android.exoplayer2.f.h;
import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c extends d
{
  private List<com.google.android.exoplayer2.f.a> blA;
  private final k blO;
  private final int blP;
  private final c.a[] blQ;
  private c.a blR;
  private c.b blS;
  private int blT;
  private final l blu;
  private List<com.google.android.exoplayer2.f.a> blz;

  public c(int paramInt)
  {
    AppMethodBeat.i(95595);
    this.blu = new l();
    this.blO = new k();
    int i = paramInt;
    if (paramInt == -1)
      i = 1;
    this.blP = i;
    this.blQ = new c.a[8];
    for (paramInt = 0; paramInt < 8; paramInt++)
      this.blQ[paramInt] = new c.a();
    this.blR = this.blQ[0];
    sO();
    AppMethodBeat.o(95595);
  }

  private void eA(int paramInt)
  {
    AppMethodBeat.i(95606);
    this.blR.append((char)(paramInt & 0xFF));
    AppMethodBeat.o(95606);
  }

  private void eB(int paramInt)
  {
    AppMethodBeat.i(95607);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(95607);
    case 32:
    case 33:
    case 37:
    case 42:
    case 44:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 57:
    case 58:
    case 60:
    case 61:
    case 63:
    case 118:
    case 119:
    case 120:
    case 121:
    case 122:
    case 123:
    case 124:
    case 125:
    case 126:
    case 127:
    }
    while (true)
    {
      return;
      this.blR.append(' ');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append(' ');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('…');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('Š');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('Œ');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('█');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('‘');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('’');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('“');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('”');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('•');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('™');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('š');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('œ');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('℠');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('Ÿ');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('⅛');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('⅜');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('⅝');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('⅞');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('│');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('┐');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('└');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('─');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('┘');
      AppMethodBeat.o(95607);
      continue;
      this.blR.append('┌');
      AppMethodBeat.o(95607);
    }
  }

  private void eC(int paramInt)
  {
    AppMethodBeat.i(95608);
    if (paramInt == 160)
    {
      this.blR.append('㏄');
      AppMethodBeat.o(95608);
    }
    while (true)
    {
      return;
      this.blR.append('_');
      AppMethodBeat.o(95608);
    }
  }

  private void ev(int paramInt)
  {
    AppMethodBeat.i(95601);
    switch (paramInt)
    {
    default:
      if ((paramInt >= 17) && (paramInt <= 23))
      {
        this.blO.ee(8);
        AppMethodBeat.o(95601);
      }
      break;
    case 0:
    case 3:
    case 8:
    case 12:
    case 13:
    case 14:
    }
    while (true)
    {
      return;
      AppMethodBeat.o(95601);
      continue;
      this.blz = sN();
      AppMethodBeat.o(95601);
      continue;
      this.blR.sR();
      AppMethodBeat.o(95601);
      continue;
      sO();
      AppMethodBeat.o(95601);
      continue;
      this.blR.append('\n');
      AppMethodBeat.o(95601);
      continue;
      AppMethodBeat.o(95601);
      continue;
      if ((paramInt >= 24) && (paramInt <= 31))
      {
        this.blO.ee(16);
        AppMethodBeat.o(95601);
      }
      else
      {
        AppMethodBeat.o(95601);
      }
    }
  }

  private void ew(int paramInt)
  {
    AppMethodBeat.i(95602);
    switch (paramInt)
    {
    case 147:
    case 148:
    case 149:
    case 150:
    default:
      AppMethodBeat.o(95602);
    case 128:
    case 129:
    case 130:
    case 131:
    case 132:
    case 133:
    case 134:
    case 135:
    case 136:
    case 137:
    case 138:
    case 139:
    case 140:
    case 141:
    case 142:
    case 143:
    case 144:
    case 145:
    case 146:
    case 151:
    case 152:
    case 153:
    case 154:
    case 155:
    case 156:
    case 157:
    case 158:
    case 159:
    }
    while (true)
    {
      return;
      paramInt -= 128;
      if (this.blT == paramInt)
        break;
      this.blT = paramInt;
      this.blR = this.blQ[paramInt];
      AppMethodBeat.o(95602);
      continue;
      for (paramInt = 1; paramInt <= 8; paramInt++)
        if (this.blO.rl())
          this.blQ[(8 - paramInt)].clear();
      AppMethodBeat.o(95602);
      continue;
      for (paramInt = 1; paramInt <= 8; paramInt++)
        if (this.blO.rl())
          this.blQ[(8 - paramInt)].aIB = true;
      AppMethodBeat.o(95602);
      continue;
      for (paramInt = 1; paramInt <= 8; paramInt++)
        if (this.blO.rl())
          this.blQ[(8 - paramInt)].aIB = false;
      AppMethodBeat.o(95602);
      continue;
      paramInt = 1;
      c.a locala;
      boolean bool1;
      if (paramInt <= 8)
      {
        if (this.blO.rl())
        {
          locala = this.blQ[(8 - paramInt)];
          if (locala.aIB)
            break label370;
        }
        label370: for (bool1 = true; ; bool1 = false)
        {
          locala.aIB = bool1;
          paramInt++;
          break;
        }
      }
      AppMethodBeat.o(95602);
      continue;
      for (paramInt = 1; paramInt <= 8; paramInt++)
        if (this.blO.rl())
          this.blQ[(8 - paramInt)].reset();
      AppMethodBeat.o(95602);
      continue;
      this.blO.ee(8);
      AppMethodBeat.o(95602);
      continue;
      AppMethodBeat.o(95602);
      continue;
      sO();
      AppMethodBeat.o(95602);
      continue;
      if (!this.blR.bmf)
      {
        this.blO.ee(16);
        AppMethodBeat.o(95602);
      }
      else
      {
        this.blO.ed(4);
        this.blO.ed(2);
        this.blO.ed(2);
        boolean bool2 = this.blO.rl();
        bool1 = this.blO.rl();
        this.blO.ed(3);
        this.blO.ed(3);
        this.blR.h(bool2, bool1);
        AppMethodBeat.o(95602);
        continue;
        if (!this.blR.bmf)
        {
          this.blO.ee(24);
          AppMethodBeat.o(95602);
        }
        else
        {
          paramInt = this.blO.ed(2);
          paramInt = c.a.m(this.blO.ed(2), this.blO.ed(2), this.blO.ed(2), paramInt);
          int i = this.blO.ed(2);
          i = c.a.m(this.blO.ed(2), this.blO.ed(2), this.blO.ed(2), i);
          this.blO.ee(2);
          c.a.s(this.blO.ed(2), this.blO.ed(2), this.blO.ed(2));
          this.blR.bf(paramInt, i);
          AppMethodBeat.o(95602);
          continue;
          if (!this.blR.bmf)
          {
            this.blO.ee(16);
            AppMethodBeat.o(95602);
          }
          else
          {
            this.blO.ee(4);
            paramInt = this.blO.ed(4);
            this.blO.ee(2);
            this.blO.ed(6);
            locala = this.blR;
            if (locala.row != paramInt)
              locala.append('\n');
            locala.row = paramInt;
            AppMethodBeat.o(95602);
            continue;
            if (!this.blR.bmf)
            {
              this.blO.ee(32);
              AppMethodBeat.o(95602);
            }
            else
            {
              paramInt = this.blO.ed(2);
              i = c.a.m(this.blO.ed(2), this.blO.ed(2), this.blO.ed(2), paramInt);
              this.blO.ed(2);
              c.a.s(this.blO.ed(2), this.blO.ed(2), this.blO.ed(2));
              this.blO.rl();
              this.blO.rl();
              this.blO.ed(2);
              this.blO.ed(2);
              paramInt = this.blO.ed(2);
              this.blO.ee(8);
              this.blR.be(i, paramInt);
              AppMethodBeat.o(95602);
              continue;
              paramInt -= 152;
              locala = this.blQ[paramInt];
              this.blO.ee(2);
              bool1 = this.blO.rl();
              bool2 = this.blO.rl();
              this.blO.rl();
              int j = this.blO.ed(3);
              boolean bool3 = this.blO.rl();
              int k = this.blO.ed(7);
              int m = this.blO.ed(8);
              int n = this.blO.ed(4);
              int i1 = this.blO.ed(4);
              this.blO.ee(2);
              this.blO.ed(6);
              this.blO.ee(2);
              int i2 = this.blO.ed(3);
              i = this.blO.ed(3);
              locala.bmf = true;
              locala.aIB = bool1;
              locala.bmk = bool2;
              locala.priority = j;
              locala.bmg = bool3;
              locala.bmh = k;
              locala.bmi = m;
              locala.bmj = n;
              if (locala.rowCount != i1 + 1)
              {
                locala.rowCount = (i1 + 1);
                while (((bool2) && (locala.blI.size() >= locala.rowCount)) || (locala.blI.size() >= 15))
                  locala.blI.remove(0);
              }
              if ((i2 != 0) && (locala.bmm != i2))
              {
                locala.bmm = i2;
                j = i2 - 1;
                locala.be(c.a.bmb[j], c.a.blX[j]);
              }
              if ((i != 0) && (locala.bmn != i))
              {
                locala.bmn = i;
                locala.h(false, false);
                locala.bf(c.a.blU, c.a.bme[(i - 1)]);
              }
              if (this.blT == paramInt)
                break;
              this.blT = paramInt;
              this.blR = this.blQ[paramInt];
              AppMethodBeat.o(95602);
            }
          }
        }
      }
    }
  }

  private void ex(int paramInt)
  {
    AppMethodBeat.i(95603);
    if (paramInt > 7)
      if (paramInt <= 15)
      {
        this.blO.ee(8);
        AppMethodBeat.o(95603);
      }
    while (true)
    {
      return;
      if (paramInt <= 23)
      {
        this.blO.ee(16);
        AppMethodBeat.o(95603);
      }
      else
      {
        if (paramInt <= 31)
          this.blO.ee(24);
        AppMethodBeat.o(95603);
      }
    }
  }

  private void ey(int paramInt)
  {
    AppMethodBeat.i(95604);
    if (paramInt <= 135)
    {
      this.blO.ee(32);
      AppMethodBeat.o(95604);
    }
    while (true)
    {
      return;
      if (paramInt <= 143)
      {
        this.blO.ee(40);
        AppMethodBeat.o(95604);
      }
      else
      {
        if (paramInt <= 159)
        {
          this.blO.ee(2);
          paramInt = this.blO.ed(6);
          this.blO.ee(paramInt * 8);
        }
        AppMethodBeat.o(95604);
      }
    }
  }

  private void ez(int paramInt)
  {
    AppMethodBeat.i(95605);
    if (paramInt == 127)
    {
      this.blR.append('♫');
      AppMethodBeat.o(95605);
    }
    while (true)
    {
      return;
      this.blR.append((char)(paramInt & 0xFF));
      AppMethodBeat.o(95605);
    }
  }

  private List<com.google.android.exoplayer2.f.a> sN()
  {
    AppMethodBeat.i(95609);
    Object localObject = new ArrayList();
    for (int i = 0; i < 8; i++)
      if ((!this.blQ[i].isEmpty()) && (this.blQ[i].aIB))
        ((List)localObject).add(this.blQ[i].sX());
    Collections.sort((List)localObject);
    localObject = Collections.unmodifiableList((List)localObject);
    AppMethodBeat.o(95609);
    return localObject;
  }

  private void sO()
  {
    AppMethodBeat.i(95610);
    for (int i = 0; i < 8; i++)
      this.blQ[i].reset();
    AppMethodBeat.o(95610);
  }

  private void sV()
  {
    AppMethodBeat.i(95599);
    if (this.blS == null)
      AppMethodBeat.o(95599);
    while (true)
    {
      return;
      sW();
      this.blS = null;
      AppMethodBeat.o(95599);
    }
  }

  private void sW()
  {
    AppMethodBeat.i(95600);
    if (this.blS.currentIndex != this.blS.bmt * 2 - 1)
    {
      new StringBuilder("DtvCcPacket ended prematurely; size is ").append(this.blS.bmt * 2 - 1).append(", but current index is ").append(this.blS.currentIndex).append(" (sequence number ").append(this.blS.bms).append("); ignoring packet");
      AppMethodBeat.o(95600);
    }
    while (true)
    {
      return;
      this.blO.n(this.blS.bmu, this.blS.currentIndex);
      int i = this.blO.ed(3);
      int j = this.blO.ed(5);
      int k = i;
      if (i == 7)
      {
        this.blO.ee(2);
        k = i + this.blO.ed(6);
      }
      if (j == 0)
      {
        if (k != 0)
          new StringBuilder("serviceNumber is non-zero (").append(k).append(") when blockSize is 0");
        AppMethodBeat.o(95600);
      }
      else if (k != this.blP)
      {
        AppMethodBeat.o(95600);
      }
      else
      {
        k = 0;
        while (this.blO.tx() > 0)
        {
          i = this.blO.ed(8);
          if (i != 16)
          {
            if (i <= 31)
            {
              ev(i);
            }
            else if (i <= 127)
            {
              ez(i);
              k = 1;
            }
            else if (i <= 159)
            {
              ew(i);
              k = 1;
            }
            else if (i <= 255)
            {
              eA(i);
              k = 1;
            }
          }
          else
          {
            i = this.blO.ed(8);
            if (i <= 31)
            {
              ex(i);
            }
            else if (i <= 127)
            {
              eB(i);
              k = 1;
            }
            else if (i <= 159)
            {
              ey(i);
            }
            else if (i <= 255)
            {
              eC(i);
              k = 1;
            }
          }
        }
        if (k != 0)
          this.blz = sN();
        AppMethodBeat.o(95600);
      }
    }
  }

  protected final void a(h paramh)
  {
    AppMethodBeat.i(95598);
    this.blu.n(paramh.aEY.array(), paramh.aEY.limit());
    if (this.blu.tB() >= 3)
    {
      int i = this.blu.readUnsignedByte() & 0x7;
      int j = i & 0x3;
      if ((i & 0x4) == 4);
      int k;
      int m;
      Object localObject;
      for (i = 1; ; i = 0)
      {
        k = (byte)this.blu.readUnsignedByte();
        m = (byte)this.blu.readUnsignedByte();
        if (((j != 2) && (j != 3)) || (i == 0))
          break;
        if (j != 3)
          break label208;
        sV();
        j = k & 0x3F;
        i = j;
        if (j == 0)
          i = 64;
        this.blS = new c.b((k & 0xC0) >> 6, i);
        paramh = this.blS.bmu;
        localObject = this.blS;
        i = ((c.b)localObject).currentIndex;
        ((c.b)localObject).currentIndex = (i + 1);
        paramh[i] = ((byte)m);
        label175: if (this.blS.currentIndex != this.blS.bmt * 2 - 1)
          break label296;
        sV();
        break;
      }
      label208: if (j == 2);
      for (boolean bool = true; ; bool = false)
      {
        com.google.android.exoplayer2.i.a.checkArgument(bool);
        if (this.blS == null)
          break;
        paramh = this.blS.bmu;
        localObject = this.blS;
        i = ((c.b)localObject).currentIndex;
        ((c.b)localObject).currentIndex = (i + 1);
        paramh[i] = ((byte)k);
        localObject = this.blS.bmu;
        paramh = this.blS;
        i = paramh.currentIndex;
        paramh.currentIndex = (i + 1);
        localObject[i] = ((byte)m);
        break label175;
        label296: break;
      }
    }
    AppMethodBeat.o(95598);
  }

  public final void flush()
  {
    AppMethodBeat.i(95596);
    super.flush();
    this.blz = null;
    this.blA = null;
    this.blT = 0;
    this.blR = this.blQ[this.blT];
    sO();
    this.blS = null;
    AppMethodBeat.o(95596);
  }

  protected final boolean sL()
  {
    if (this.blz != this.blA);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final com.google.android.exoplayer2.f.d sM()
  {
    AppMethodBeat.i(95597);
    this.blA = this.blz;
    f localf = new f(this.blz);
    AppMethodBeat.o(95597);
    return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.a.c
 * JD-Core Version:    0.6.2
 */