package com.tencent.tinker.a.b.a;

import com.tencent.tinker.a.a.j;

public final class d
{
  private final g Azb;

  public d(g paramg)
  {
    this.Azb = paramg;
  }

  public final void a(e parame)
  {
    Object localObject = this.Azb;
    ((a)localObject).AyY.mSize = 0;
    ((a)localObject).akp = 0;
    while (true)
    {
      localObject = this.Azb;
      if (((a)localObject).akp < ((g)localObject).Azg.length);
      int j;
      int k;
      for (int i = 1; i != 0; i = 0)
      {
        j = this.Azb.akp;
        k = this.Azb.read();
        m = k & 0xFF;
        if (m != 0)
        {
          i = m;
          if (m != 255);
        }
        else
        {
          i = k;
        }
        switch (i)
        {
        default:
          throw new IllegalStateException("Unknown opcode: " + com.tencent.tinker.a.b.b.a.RE(i));
        case -1:
        case 40:
        case 0:
        case 14:
        case 18:
        case 10:
        case 11:
        case 12:
        case 13:
        case 15:
        case 16:
        case 17:
        case 29:
        case 30:
        case 39:
        case 1:
        case 4:
        case 7:
        case 33:
        case 123:
        case 124:
        case 125:
        case 126:
        case 127:
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
        case 176:
        case 177:
        case 178:
        case 179:
        case 180:
        case 181:
        case 182:
        case 183:
        case 184:
        case 185:
        case 186:
        case 187:
        case 188:
        case 189:
        case 190:
        case 191:
        case 192:
        case 193:
        case 194:
        case 195:
        case 196:
        case 197:
        case 198:
        case 199:
        case 200:
        case 201:
        case 202:
        case 203:
        case 204:
        case 205:
        case 206:
        case 207:
        case 41:
        case 26:
        case 28:
        case 31:
        case 34:
        case 96:
        case 97:
        case 98:
        case 99:
        case 100:
        case 101:
        case 102:
        case 103:
        case 104:
        case 105:
        case 106:
        case 107:
        case 108:
        case 109:
        case 21:
        case 25:
        case 19:
        case 22:
        case 56:
        case 57:
        case 58:
        case 59:
        case 60:
        case 61:
        case 216:
        case 217:
        case 218:
        case 219:
        case 220:
        case 221:
        case 222:
        case 223:
        case 224:
        case 225:
        case 226:
        case 32:
        case 35:
        case 82:
        case 83:
        case 84:
        case 85:
        case 86:
        case 87:
        case 88:
        case 89:
        case 90:
        case 91:
        case 92:
        case 93:
        case 94:
        case 95:
        case 208:
        case 209:
        case 210:
        case 211:
        case 212:
        case 213:
        case 214:
        case 215:
        case 50:
        case 51:
        case 52:
        case 53:
        case 54:
        case 55:
        case 2:
        case 5:
        case 8:
        case 45:
        case 46:
        case 47:
        case 48:
        case 49:
        case 68:
        case 69:
        case 70:
        case 71:
        case 72:
        case 73:
        case 74:
        case 75:
        case 76:
        case 77:
        case 78:
        case 79:
        case 80:
        case 81:
        case 144:
        case 145:
        case 146:
        case 147:
        case 148:
        case 149:
        case 150:
        case 151:
        case 152:
        case 153:
        case 154:
        case 155:
        case 156:
        case 157:
        case 158:
        case 159:
        case 160:
        case 161:
        case 162:
        case 163:
        case 164:
        case 165:
        case 166:
        case 167:
        case 168:
        case 169:
        case 170:
        case 171:
        case 172:
        case 173:
        case 174:
        case 175:
        case 42:
        case 27:
        case 20:
        case 23:
        case 38:
        case 43:
        case 44:
        case 3:
        case 6:
        case 9:
        case 36:
        case 110:
        case 111:
        case 112:
        case 113:
        case 114:
        case 37:
        case 116:
        case 117:
        case 118:
        case 119:
        case 120:
        case 24:
        case 768:
        case 256:
        case 512:
        }
      }
      parame.a(j, k, 0, 1, 0, 0L);
      continue;
      parame.a(j, k & 0xFF, 0, 1, j + (byte)b.Ry(k), 0L);
      continue;
      parame.a(j, k & 0xFF, 0, 1, 0, b.Ry(k));
      continue;
      parame.a(j, k & 0xFF, 0, 1, 0, (k >> 12 & 0xF) << 28 >> 28, k >> 8 & 0xF);
      continue;
      parame.a(j, k & 0xFF, 0, 1, 0, 0L, b.Ry(k));
      continue;
      parame.a(j, k & 0xFF, 0, 1, 0, 0L, k >> 8 & 0xF, k >> 12 & 0xF);
      continue;
      i = b.Ry(k);
      parame.a(j, k & 0xFF, 0, 1, j + (short)this.Azb.read(), i);
      continue;
      i = k & 0xFF;
      int m = b.Ry(k);
      parame.a(j, i, this.Azb.read(), b.RB(i), 0, 0L, m);
      continue;
      m = k & 0xFF;
      int n = b.Ry(k);
      long l = (short)this.Azb.read();
      if (m == 21);
      for (i = 16; ; i = 48)
      {
        parame.a(j, m, 0, 1, 0, l << i, n);
        break;
      }
      i = b.Ry(k);
      parame.a(j, k & 0xFF, 0, 1, 0, (short)this.Azb.read(), i);
      continue;
      i = b.Ry(k);
      parame.a(j, k & 0xFF, 0, 1, j + (short)this.Azb.read(), 0L, i);
      continue;
      m = b.Ry(k);
      i = this.Azb.read();
      parame.a(j, k & 0xFF, 0, 1, 0, (byte)b.Ry(i), m, i & 0xFF);
      continue;
      i = k & 0xFF;
      parame.a(j, i, this.Azb.read(), b.RB(i), 0, 0L, k >> 8 & 0xF, k >> 12 & 0xF);
      continue;
      parame.a(j, k & 0xFF, 0, 1, 0, (short)this.Azb.read(), k >> 8 & 0xF, k >> 12 & 0xF);
      continue;
      parame.a(j, k & 0xFF, 0, 1, j + (short)this.Azb.read(), 0L, k >> 8 & 0xF, k >> 12 & 0xF);
      continue;
      parame.a(j, k & 0xFF, 0, 1, 0, 0L, b.Ry(k), this.Azb.read());
      continue;
      m = b.Ry(k);
      i = this.Azb.read();
      parame.a(j, k & 0xFF, 0, 1, 0, 0L, m, i & 0xFF, b.Ry(i));
      continue;
      i = b.Ry(k);
      parame.a(j, k & 0xFF, 0, 1, j + this.Azb.readInt(), i);
      continue;
      i = k & 0xFF;
      m = b.Ry(k);
      parame.a(j, i, this.Azb.readInt(), b.RB(i), 0, 0L, m);
      continue;
      i = b.Ry(k);
      parame.a(j, k & 0xFF, 0, 1, 0, this.Azb.readInt(), i);
      continue;
      i = k & 0xFF;
      m = b.Ry(k);
      n = j + this.Azb.readInt();
      switch (i)
      {
      default:
      case 43:
      case 44:
      }
      while (true)
      {
        parame.a(j, i, 0, 1, n, 0L, m);
        break;
        this.Azb.hZ(n + 1, j);
      }
      i = b.Ry(k);
      n = this.Azb.read();
      m = this.Azb.read();
      parame.a(j, k & 0xFF, 0, 1, 0, i, n, m);
      continue;
      m = k & 0xFF;
      int i1 = k >> 12 & 0xF;
      n = this.Azb.read();
      int i2 = this.Azb.read();
      int i3 = i2 & 0xF;
      int i4 = i2 >> 4 & 0xF;
      i = i2 >> 8 & 0xF;
      int i5 = i2 >> 12 & 0xF;
      i2 = b.RB(m);
      switch (i1)
      {
      default:
        throw new j("bogus registerCount: " + new String(new char[] { Character.forDigit(i1 & 0xF, 16) }));
      case 0:
        parame.a(j, m, n, i2, 0, 0L);
        break;
      case 1:
        parame.a(j, m, n, i2, 0, 0L, i3);
        break;
      case 2:
        parame.a(j, m, n, i2, 0, 0L, i3, i4);
        break;
      case 3:
        parame.a(j, m, n, i2, 0, 0L, i3, i4, i);
        break;
      case 4:
        parame.a(j, m, n, i2, 0, 0L, i3, i4, i, i5);
        break;
      case 5:
        parame.a(j, m, n, i2, 0, 0L, i3, i4, i, i5, k >> 8 & 0xF);
        continue;
        i = k & 0xFF;
        m = b.Ry(k);
        n = this.Azb.read();
        i1 = this.Azb.read();
        parame.b(j, i, n, b.RB(i), 0, 0L, i1, m);
        continue;
        i = b.Ry(k);
        parame.a(j, k & 0xFF, 0, 1, 0, this.Azb.readLong(), i);
        continue;
        i = this.Azb.read();
        i3 = this.Azb.readInt();
        switch (i)
        {
        case 3:
        case 5:
        case 6:
        case 7:
        default:
          throw new j("bogus element_width: " + com.tencent.tinker.a.b.b.a.RF(i));
        case 1:
          localObject = new byte[i3];
          i = 0;
          n = 0;
          m = 1;
          if (n < i3)
          {
            i1 = i;
            if (m != 0)
              i1 = this.Azb.read();
            localObject[n] = ((byte)(byte)(i1 & 0xFF));
            n++;
            if (m == 0);
            for (i = 1; ; i = 0)
            {
              i1 >>= 8;
              m = i;
              i = i1;
              break;
            }
          }
          parame.a(j, k, localObject, localObject.length, 1);
          break;
        case 2:
          localObject = new short[i3];
          for (i = 0; i < i3; i++)
            localObject[i] = ((short)(short)this.Azb.read());
          parame.a(j, k, localObject, localObject.length, 2);
          break;
        case 4:
          localObject = new int[i3];
          for (i = 0; i < i3; i++)
            localObject[i] = this.Azb.readInt();
          parame.a(j, k, localObject, localObject.length, 4);
          break;
        case 8:
          localObject = new long[i3];
          for (i = 0; i < i3; i++)
            localObject[i] = this.Azb.readLong();
          parame.a(j, k, localObject, localObject.length, 8);
          continue;
          m = this.Azb.dSb();
          n = this.Azb.read();
          i1 = this.Azb.readInt();
          localObject = new int[n];
          for (i = 0; i < n; i++)
            localObject[i] = (this.Azb.readInt() + m);
          parame.a(j, k, i1, (int[])localObject);
          continue;
          n = this.Azb.dSb();
          m = this.Azb.read();
          localObject = new int[m];
          int[] arrayOfInt = new int[m];
          for (i = 0; i < m; i++)
            localObject[i] = this.Azb.readInt();
          for (i = 0; i < m; i++)
            arrayOfInt[i] = (this.Azb.readInt() + n);
          parame.a(j, k, (int[])localObject, arrayOfInt);
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.b.a.d
 * JD-Core Version:    0.6.2
 */