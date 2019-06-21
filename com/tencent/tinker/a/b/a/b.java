package com.tencent.tinker.a.b.a;

import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.b.b.a;

public final class b
{
  public static short O(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 & 0xFFFFFFF0) != 0)
      throw new IllegalArgumentException("bogus nibble0");
    if ((paramInt2 & 0xFFFFFFF0) != 0)
      throw new IllegalArgumentException("bogus nibble1");
    if ((paramInt3 & 0xFFFFFFF0) != 0)
      throw new IllegalArgumentException("bogus nibble2");
    if ((paramInt4 & 0xFFFFFFF0) != 0)
      throw new IllegalArgumentException("bogus nibble3");
    return (short)(paramInt2 << 4 | paramInt1 | paramInt3 << 8 | paramInt4 << 12);
  }

  public static short RA(int paramInt)
  {
    if ((0xFFFF0000 & paramInt) != 0)
      throw new j("Register B out of range: " + a.nF(paramInt));
    return (short)paramInt;
  }

  public static int RB(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 0;
    case 26:
    case 27:
    case 28:
    case 31:
    case 32:
    case 34:
    case 35:
    case 36:
    case 37:
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
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    case 116:
    case 117:
    case 118:
    case 119:
    case 120:
    case -1:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
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
    case 29:
    case 30:
    case 33:
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
    case 208:
    case 209:
    case 210:
    case 211:
    case 212:
    case 213:
    case 214:
    case 215:
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
    case 256:
    case 512:
    case 768:
    }
    while (true)
    {
      return paramInt;
      paramInt = 3;
      continue;
      paramInt = 2;
      continue;
      paramInt = 5;
      continue;
      paramInt = 4;
      continue;
      paramInt = 1;
    }
  }

  public static short Rx(int paramInt)
  {
    if ((0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("bogus unsigned code unit");
    return (short)paramInt;
  }

  public static int Ry(int paramInt)
  {
    return paramInt >> 8 & 0xFF;
  }

  public static short Rz(int paramInt)
  {
    if ((0xFFFF0000 & paramInt) != 0)
      throw new j("Register A out of range: " + a.nF(paramInt));
    return (short)paramInt;
  }

  public static short ia(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0xFFFFFF00) != 0)
      throw new IllegalArgumentException("bogus lowByte");
    if ((paramInt2 & 0xFFFFFF00) != 0)
      throw new IllegalArgumentException("bogus highByte");
    return (short)(paramInt2 << 8 | paramInt1);
  }

  public static int ib(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0xFFFFFFF0) != 0)
      throw new IllegalArgumentException("bogus lowNibble");
    if ((paramInt2 & 0xFFFFFFF0) != 0)
      throw new IllegalArgumentException("bogus highNibble");
    return paramInt2 << 4 | paramInt1;
  }

  public static short ic(int paramInt1, int paramInt2)
  {
    paramInt1 -= paramInt2;
    if (paramInt1 != (short)paramInt1)
      throw new j("Target out of range: " + a.RH(paramInt1) + ", perhaps you need to enable force jumbo mode.");
    return (short)paramInt1;
  }

  public static short nE(long paramLong)
  {
    if (paramLong != (short)(int)paramLong)
      throw new j("Literal out of range: " + a.nF(paramLong));
    return (short)(int)paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.b.a.b
 * JD-Core Version:    0.6.2
 */