package com.tencent.tinker.a.b.a;

import com.tencent.tinker.a.a.j;

public final class f extends e
{
  private final h Azd;
  private final c Aze;
  private final boolean Azf;

  public f(h paramh, c paramc)
  {
    super(null);
    this.Azd = paramh;
    this.Aze = paramc;
    this.Azf = true;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong)
  {
    paramInt1 = paramInt5;
    if (this.Azf)
      paramInt1 = this.Aze.RD(paramInt5);
    short s1;
    switch (paramInt2)
    {
    default:
      throw new IllegalStateException("unexpected opcode: " + com.tencent.tinker.a.b.b.a.RG(paramInt2));
    case -1:
    case 0:
    case 14:
      s1 = (short)paramInt2;
      this.Azd.c(s1);
    case 40:
    case 41:
    case 42:
    case 36:
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    }
    while (true)
    {
      return;
      if (this.Azf)
      {
        paramInt1 -= this.Azd.akp;
        if (paramInt1 != (byte)paramInt1)
        {
          if (paramInt1 != (short)paramInt1)
          {
            this.Azd.a((short)42, (short)paramInt1, (short)(paramInt1 >> 16));
          }
          else
          {
            s1 = (short)paramInt1;
            this.Azd.c((short)41, s1);
          }
        }
        else
          this.Azd.c(b.ia(paramInt2, paramInt1 & 0xFF));
      }
      else
      {
        paramInt1 -= this.Azd.akp;
        if (paramInt1 != (byte)paramInt1)
          throw new j("Target out of range: " + com.tencent.tinker.a.b.b.a.RH(paramInt1) + ", perhaps you need to enable force jumbo mode.");
        this.Azd.c(b.ia(paramInt2, paramInt1 & 0xFF));
        continue;
        short s2;
        if (this.Azf)
        {
          paramInt1 -= this.Azd.akp;
          if (paramInt1 != (short)paramInt1)
          {
            this.Azd.a((short)42, (short)paramInt1, (short)(paramInt1 >> 16));
          }
          else
          {
            s2 = (short)paramInt1;
            s1 = (short)paramInt2;
            this.Azd.c(s1, s2);
          }
        }
        else
        {
          s2 = b.ic(paramInt1, this.Azd.akp);
          s1 = (short)paramInt2;
          this.Azd.c(s1, s2);
          continue;
          paramInt1 -= this.Azd.akp;
          s1 = (short)paramInt2;
          this.Azd.a(s1, (short)paramInt1, (short)(paramInt1 >> 16));
          continue;
          s1 = (short)paramInt3;
          this.Azd.a(b.ia(paramInt2, b.ib(0, 0)), s1, b.O(0, 0, 0, 0));
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6)
  {
    paramInt1 = paramInt5;
    if (this.Azf)
      paramInt1 = this.Aze.RD(paramInt5);
    h localh;
    switch (paramInt2)
    {
    case 14:
    case 32:
    case 33:
    case 35:
    case 37:
    case 40:
    case 41:
    case 42:
    case 45:
    case 46:
    case 47:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 62:
    case 63:
    case 64:
    case 65:
    case 66:
    case 67:
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
    default:
      throw new IllegalStateException("unexpected opcode: " + com.tencent.tinker.a.b.b.a.RG(paramInt2));
    case 18:
      paramInt1 = (short)paramInt2;
      localh = this.Azd;
      if ((paramLong < -8L) || (paramLong > 7L))
        throw new j("Literal out of range: " + com.tencent.tinker.a.b.b.a.nF(paramLong));
      localh.c(b.ia(paramInt1, b.ib(paramInt6, (int)paramLong & 0xF)));
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
    case 56:
    case 57:
    case 58:
    case 59:
    case 60:
    case 61:
    case 19:
    case 22:
    case 21:
    case 25:
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
    case 20:
    case 23:
    case 38:
    case 43:
    case 44:
    case 27:
    case 24:
    case 36:
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    }
    while (true)
    {
      return;
      this.Azd.c(b.ia(paramInt2, paramInt6));
      continue;
      short s1 = b.ic(paramInt1, this.Azd.akp);
      this.Azd.c(b.ia(paramInt2, paramInt6), s1);
      continue;
      this.Azd.c(b.ia(paramInt2, paramInt6), b.nE(paramLong));
      continue;
      if (paramInt2 == 21);
      for (paramInt1 = 16; ; paramInt1 = 48)
      {
        s1 = (short)(int)(paramLong >> paramInt1);
        this.Azd.c(b.ia(paramInt2, paramInt6), s1);
        break;
      }
      if (this.Azf)
      {
        if (paramInt3 > 65535)
        {
          this.Azd.a(b.ia(27, paramInt6), (short)paramInt3, (short)(paramInt3 >> 16));
        }
        else
        {
          s1 = (short)paramInt3;
          this.Azd.c(b.ia(paramInt2, paramInt6), s1);
        }
      }
      else
      {
        if (paramInt3 > 65535)
          throw new j("string index out of bound: " + com.tencent.tinker.a.b.b.a.RE(paramInt3) + ", perhaps you need to enable force jumbo mode.");
        s1 = (short)paramInt3;
        this.Azd.c(b.ia(paramInt2, paramInt6), s1);
        continue;
        s1 = (short)paramInt3;
        this.Azd.c(b.ia(paramInt2, paramInt6), s1);
        continue;
        if (paramLong != (int)paramLong)
          throw new j("Literal out of range: " + com.tencent.tinker.a.b.b.a.nF(paramLong));
        paramInt1 = (int)paramLong;
        this.Azd.a(b.ia(paramInt2, paramInt6), (short)paramInt1, (short)(paramInt1 >> 16));
        continue;
        switch (paramInt2)
        {
        default:
        case 43:
        case 44:
        }
        while (true)
        {
          paramInt1 -= this.Azd.akp;
          this.Azd.a(b.ia(paramInt2, paramInt6), (short)paramInt1, (short)(paramInt1 >> 16));
          break;
          localh = this.Azd;
          localh.hZ(paramInt1, localh.akp);
        }
        this.Azd.a(b.ia(paramInt2, paramInt6), (short)paramInt3, (short)(paramInt3 >> 16));
        continue;
        localh = this.Azd;
        short s2 = b.ia(paramInt2, paramInt6);
        s1 = (short)(int)paramLong;
        short s3 = (short)(int)(paramLong >> 16);
        short s4 = (short)(int)(paramLong >> 32);
        short s5 = (short)(int)(paramLong >> 48);
        localh.c(s2);
        localh.c(s1);
        localh.c(s3);
        localh.c(s4);
        localh.c(s5);
        continue;
        s1 = (short)paramInt3;
        this.Azd.a(b.ia(paramInt2, b.ib(0, 1)), s1, b.O(paramInt6, 0, 0, 0));
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7)
  {
    paramInt1 = paramInt5;
    if (this.Azf)
      paramInt1 = this.Aze.RD(paramInt5);
    switch (paramInt2)
    {
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 34:
    case 37:
    case 38:
    case 39:
    case 40:
    case 41:
    case 42:
    case 43:
    case 44:
    case 45:
    case 46:
    case 47:
    case 48:
    case 49:
    case 56:
    case 57:
    case 58:
    case 59:
    case 60:
    case 61:
    case 62:
    case 63:
    case 64:
    case 65:
    case 66:
    case 67:
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
    case 115:
    case 116:
    case 117:
    case 118:
    case 119:
    case 120:
    case 121:
    case 122:
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
    default:
      throw new IllegalStateException("unexpected opcode: " + com.tencent.tinker.a.b.b.a.RG(paramInt2));
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
      paramInt1 = (short)paramInt2;
      this.Azd.c(b.ia(paramInt1, b.ib(paramInt6, paramInt7)));
    case 2:
    case 5:
    case 8:
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
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 208:
    case 209:
    case 210:
    case 211:
    case 212:
    case 213:
    case 214:
    case 215:
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
    case 3:
    case 6:
    case 9:
    case 36:
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    }
    while (true)
    {
      return;
      this.Azd.c(b.ia(paramInt2, paramInt6), b.RA(paramInt7));
      continue;
      h localh = this.Azd;
      short s = b.ia(paramInt2, paramInt6);
      if (paramLong != (byte)(int)paramLong)
        throw new j("Literal out of range: " + com.tencent.tinker.a.b.b.a.nF(paramLong));
      localh.c(s, b.ia(paramInt7, (int)paramLong & 0xFF));
      continue;
      s = b.ic(paramInt1, this.Azd.akp);
      this.Azd.c(b.ia(paramInt2, b.ib(paramInt6, paramInt7)), s);
      continue;
      this.Azd.c(b.ia(paramInt2, b.ib(paramInt6, paramInt7)), b.nE(paramLong));
      continue;
      s = (short)paramInt3;
      this.Azd.c(b.ia(paramInt2, b.ib(paramInt6, paramInt7)), s);
      continue;
      s = (short)paramInt2;
      this.Azd.a(s, b.Rz(paramInt6), b.RA(paramInt7));
      continue;
      s = (short)paramInt3;
      this.Azd.a(b.ia(paramInt2, b.ib(0, 2)), s, b.O(paramInt6, paramInt7, 0, 0));
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8)
  {
    switch (paramInt2)
    {
    case 37:
    case 38:
    case 39:
    case 40:
    case 41:
    case 42:
    case 43:
    case 44:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    case 58:
    case 59:
    case 60:
    case 61:
    case 62:
    case 63:
    case 64:
    case 65:
    case 66:
    case 67:
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
    case 115:
    case 116:
    case 117:
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
    default:
      throw new IllegalStateException("unexpected opcode: " + com.tencent.tinker.a.b.b.a.RG(paramInt2));
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
      this.Azd.c(b.ia(paramInt2, paramInt6), b.ia(paramInt7, paramInt8));
    case 36:
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    }
    while (true)
    {
      return;
      short s = (short)paramInt3;
      this.Azd.a(b.ia(paramInt2, b.ib(0, 3)), s, b.O(paramInt6, paramInt7, paramInt8, 0));
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    switch (paramInt2)
    {
    default:
      throw new IllegalStateException("unexpected opcode: " + com.tencent.tinker.a.b.b.a.RG(paramInt2));
    case 36:
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    }
    short s = (short)paramInt3;
    this.Azd.a(b.ia(paramInt2, b.ib(0, 4)), s, b.O(paramInt6, paramInt7, paramInt8, paramInt9));
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    switch (paramInt2)
    {
    default:
      throw new IllegalStateException("unexpected opcode: " + com.tencent.tinker.a.b.b.a.RG(paramInt2));
    case 36:
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    }
    short s = (short)paramInt3;
    this.Azd.a(b.ia(paramInt2, b.ib(paramInt10, 5)), s, b.O(paramInt6, paramInt7, paramInt8, paramInt9));
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    int i = 0;
    paramInt1 = 0;
    int j = this.Azd.dSb();
    short s = (short)paramInt2;
    this.Azd.c(s);
    this.Azd.c(b.Rx(paramArrayOfInt.length));
    this.Azd.writeInt(paramInt3);
    if (this.Azf)
    {
      paramInt2 = paramArrayOfInt.length;
      while (paramInt1 < paramInt2)
      {
        paramInt3 = paramArrayOfInt[paramInt1];
        paramInt3 = this.Aze.RD(paramInt3);
        this.Azd.writeInt(paramInt3 - j);
        paramInt1++;
      }
    }
    paramInt2 = paramArrayOfInt.length;
    for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
    {
      paramInt3 = paramArrayOfInt[paramInt1];
      this.Azd.writeInt(paramInt3 - j);
    }
  }

  public final void a(int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4)
  {
    int i = 0;
    int j = 0;
    paramInt1 = 0;
    short s = (short)paramInt2;
    this.Azd.c(s);
    s = (short)paramInt4;
    this.Azd.c(s);
    this.Azd.writeInt(paramInt3);
    h localh;
    switch (paramInt4)
    {
    case 3:
    case 5:
    case 6:
    case 7:
    default:
      throw new j("bogus element_width: " + com.tencent.tinker.a.b.b.a.RF(paramInt4));
    case 1:
      localh = this.Azd;
      paramObject = (byte[])paramObject;
      paramInt4 = paramObject.length;
      paramInt3 = 0;
      paramInt2 = 1;
      paramInt1 = 0;
      if (paramInt3 < paramInt4)
      {
        i = paramObject[paramInt3];
        if (paramInt2 != 0)
          paramInt1 = i & 0xFF;
        for (paramInt2 = 0; ; paramInt2 = 1)
        {
          paramInt3++;
          break;
          paramInt1 |= i << 8;
          localh.c((short)paramInt1);
        }
      }
      if (paramInt2 == 0)
        localh.c((short)paramInt1);
      break;
    case 2:
    case 4:
    case 8:
    }
    while (true)
    {
      return;
      localh = this.Azd;
      paramObject = (short[])paramObject;
      paramInt2 = paramObject.length;
      while (paramInt1 < paramInt2)
      {
        localh.c(paramObject[paramInt1]);
        paramInt1++;
      }
      continue;
      localh = this.Azd;
      paramObject = (int[])paramObject;
      paramInt2 = paramObject.length;
      for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
        localh.writeInt(paramObject[paramInt1]);
      continue;
      localh = this.Azd;
      paramObject = (long[])paramObject;
      paramInt2 = paramObject.length;
      for (paramInt1 = j; paramInt1 < paramInt2; paramInt1++)
      {
        long l = paramObject[paramInt1];
        localh.c((short)(int)l);
        localh.c((short)(int)(l >> 16));
        localh.c((short)(int)(l >> 32));
        localh.c((short)(int)(l >> 48));
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = 0;
    int j = 0;
    int k = this.Azd.dSb();
    short s = (short)paramInt2;
    this.Azd.c(s);
    this.Azd.c(b.Rx(paramArrayOfInt2.length));
    paramInt2 = paramArrayOfInt1.length;
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      int m = paramArrayOfInt1[paramInt1];
      this.Azd.writeInt(m);
    }
    if (this.Azf)
    {
      paramInt2 = paramArrayOfInt2.length;
      for (paramInt1 = j; paramInt1 < paramInt2; paramInt1++)
      {
        j = paramArrayOfInt2[paramInt1];
        j = this.Aze.RD(j);
        this.Azd.writeInt(j - k);
      }
    }
    paramInt2 = paramArrayOfInt2.length;
    for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
    {
      j = paramArrayOfInt2[paramInt1];
      this.Azd.writeInt(j - k);
    }
  }

  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7)
  {
    switch (paramInt2)
    {
    default:
      throw new IllegalStateException("unexpected opcode: " + com.tencent.tinker.a.b.b.a.RG(paramInt2));
    case 37:
    case 116:
    case 117:
    case 118:
    case 119:
    case 120:
    }
    short s = (short)paramInt3;
    this.Azd.a(b.ia(paramInt2, paramInt7), s, b.Rz(paramInt6));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.b.a.f
 * JD-Core Version:    0.6.2
 */