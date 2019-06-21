package oicq.wlogin_sdk.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

public final class c
{
  static final byte[] PADDING = arrayOfByte;
  private byte[] buffer;
  private long[] count;
  private byte[] digest;
  private long[] state;

  static
  {
    byte[] arrayOfByte = new byte[64];
    arrayOfByte[0] = ((byte)-128);
  }

  public c()
  {
    AppMethodBeat.i(96506);
    this.state = new long[4];
    this.count = new long[2];
    this.buffer = new byte[64];
    this.digest = new byte[16];
    md5Init();
    AppMethodBeat.o(96506);
  }

  private static void Encode(byte[] paramArrayOfByte, long[] paramArrayOfLong, int paramInt)
  {
    int i = 0;
    for (int j = 0; ; j++)
    {
      if (i >= paramInt)
        return;
      paramArrayOfByte[i] = ((byte)(byte)(int)(paramArrayOfLong[j] & 0xFF));
      paramArrayOfByte[(i + 1)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 8 & 0xFF));
      paramArrayOfByte[(i + 2)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 16 & 0xFF));
      paramArrayOfByte[(i + 3)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 24 & 0xFF));
      i += 4;
    }
  }

  private static long FF(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = (paramLong2 & paramLong3 | (0xFFFFFFFF ^ paramLong2) & paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }

  private static long GG(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = (paramLong2 & paramLong4 | (0xFFFFFFFF ^ paramLong4) & paramLong3) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }

  private static long HH(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = (paramLong2 ^ paramLong3 ^ paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }

  private static long II(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = ((0xFFFFFFFF ^ paramLong4 | paramLong2) ^ paramLong3) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }

  private static void a(long[] paramArrayOfLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96510);
    int i = 0;
    for (int j = 0; ; j++)
    {
      if (i >= 64)
      {
        AppMethodBeat.o(96510);
        return;
      }
      paramArrayOfLong[j] = (b2iu(paramArrayOfByte[i]) | b2iu(paramArrayOfByte[(i + 1)]) << 8 | b2iu(paramArrayOfByte[(i + 2)]) << 16 | b2iu(paramArrayOfByte[(i + 3)]) << 24);
      i += 4;
    }
  }

  public static byte[] awD(String paramString)
  {
    AppMethodBeat.i(96512);
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO8859_1");
      paramString = arrayOfByte;
      paramString = new c().getMD5(paramString);
      AppMethodBeat.o(96512);
      return paramString;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        paramString = paramString.getBytes();
    }
  }

  private static long b2iu(byte paramByte)
  {
    int i = paramByte;
    if (paramByte < 0)
      i = paramByte & 0xFF;
    return i;
  }

  public static byte[] cM(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96511);
    paramArrayOfByte = new c().getMD5(paramArrayOfByte);
    AppMethodBeat.o(96511);
    return paramArrayOfByte;
  }

  private byte[] getMD5(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96505);
    md5Init();
    md5Update(new ByteArrayInputStream(paramArrayOfByte), paramArrayOfByte.length);
    paramArrayOfByte = new byte[8];
    Encode(paramArrayOfByte, this.count, 8);
    int i = (int)(this.count[0] >>> 3) & 0x3F;
    if (i < 56);
    for (i = 56 - i; ; i = 120 - i)
    {
      md5Update(PADDING, i);
      md5Update(paramArrayOfByte, 8);
      Encode(this.digest, this.state, 16);
      paramArrayOfByte = this.digest;
      AppMethodBeat.o(96505);
      return paramArrayOfByte;
    }
  }

  private void md5Init()
  {
    this.count[0] = 0L;
    this.count[1] = 0L;
    this.state[0] = 1732584193L;
    this.state[1] = 4023233417L;
    this.state[2] = 2562383102L;
    this.state[3] = 271733878L;
  }

  private static void md5Memcpy(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; ; i++)
    {
      if (i >= paramInt3)
        return;
      paramArrayOfByte1[(paramInt1 + i)] = ((byte)paramArrayOfByte2[(paramInt2 + i)]);
    }
  }

  private void md5Transform(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96509);
    long l1 = this.state[0];
    long l2 = this.state[1];
    long l3 = this.state[2];
    long l4 = this.state[3];
    long[] arrayOfLong = new long[16];
    a(arrayOfLong, paramArrayOfByte);
    l1 = FF(l1, l2, l3, l4, arrayOfLong[0], 7L, 3614090360L);
    l4 = FF(l4, l1, l2, l3, arrayOfLong[1], 12L, 3905402710L);
    l3 = FF(l3, l4, l1, l2, arrayOfLong[2], 17L, 606105819L);
    l2 = FF(l2, l3, l4, l1, arrayOfLong[3], 22L, 3250441966L);
    l1 = FF(l1, l2, l3, l4, arrayOfLong[4], 7L, 4118548399L);
    l4 = FF(l4, l1, l2, l3, arrayOfLong[5], 12L, 1200080426L);
    long l5 = FF(l3, l4, l1, l2, arrayOfLong[6], 17L, 2821735955L);
    l2 = FF(l2, l5, l4, l1, arrayOfLong[7], 22L, 4249261313L);
    l3 = FF(l1, l2, l5, l4, arrayOfLong[8], 7L, 1770035416L);
    long l6 = FF(l4, l3, l2, l5, arrayOfLong[9], 12L, 2336552879L);
    l1 = FF(l5, l6, l3, l2, arrayOfLong[10], 17L, 4294925233L);
    l4 = FF(l2, l1, l6, l3, arrayOfLong[11], 22L, 2304563134L);
    l5 = FF(l3, l4, l1, l6, arrayOfLong[12], 7L, 1804603682L);
    l2 = FF(l6, l5, l4, l1, arrayOfLong[13], 12L, 4254626195L);
    l6 = FF(l1, l2, l5, l4, arrayOfLong[14], 17L, 2792965006L);
    l3 = FF(l4, l6, l2, l5, arrayOfLong[15], 22L, 1236535329L);
    l5 = GG(l5, l3, l6, l2, arrayOfLong[1], 5L, 4129170786L);
    l1 = GG(l2, l5, l3, l6, arrayOfLong[6], 9L, 3225465664L);
    l4 = GG(l6, l1, l5, l3, arrayOfLong[11], 14L, 643717713L);
    l3 = GG(l3, l4, l1, l5, arrayOfLong[0], 20L, 3921069994L);
    l2 = GG(l5, l3, l4, l1, arrayOfLong[5], 5L, 3593408605L);
    l1 = GG(l1, l2, l3, l4, arrayOfLong[10], 9L, 38016083L);
    l4 = GG(l4, l1, l2, l3, arrayOfLong[15], 14L, 3634488961L);
    l3 = GG(l3, l4, l1, l2, arrayOfLong[4], 20L, 3889429448L);
    l2 = GG(l2, l3, l4, l1, arrayOfLong[9], 5L, 568446438L);
    l1 = GG(l1, l2, l3, l4, arrayOfLong[14], 9L, 3275163606L);
    l4 = GG(l4, l1, l2, l3, arrayOfLong[3], 14L, 4107603335L);
    l3 = GG(l3, l4, l1, l2, arrayOfLong[8], 20L, 1163531501L);
    l2 = GG(l2, l3, l4, l1, arrayOfLong[13], 5L, 2850285829L);
    l5 = GG(l1, l2, l3, l4, arrayOfLong[2], 9L, 4243563512L);
    l4 = GG(l4, l5, l2, l3, arrayOfLong[7], 14L, 1735328473L);
    l3 = GG(l3, l4, l5, l2, arrayOfLong[12], 20L, 2368359562L);
    l1 = HH(l2, l3, l4, l5, arrayOfLong[5], 4L, 4294588738L);
    l6 = HH(l5, l1, l3, l4, arrayOfLong[8], 11L, 2272392833L);
    l2 = HH(l4, l6, l1, l3, arrayOfLong[11], 16L, 1839030562L);
    l5 = HH(l3, l2, l6, l1, arrayOfLong[14], 23L, 4259657740L);
    l4 = HH(l1, l5, l2, l6, arrayOfLong[1], 4L, 2763975236L);
    l3 = HH(l6, l4, l5, l2, arrayOfLong[4], 11L, 1272893353L);
    l1 = HH(l2, l3, l4, l5, arrayOfLong[7], 16L, 4139469664L);
    l5 = HH(l5, l1, l3, l4, arrayOfLong[10], 23L, 3200236656L);
    l2 = HH(l4, l5, l1, l3, arrayOfLong[13], 4L, 681279174L);
    l3 = HH(l3, l2, l5, l1, arrayOfLong[0], 11L, 3936430074L);
    l1 = HH(l1, l3, l2, l5, arrayOfLong[3], 16L, 3572445317L);
    l4 = HH(l5, l1, l3, l2, arrayOfLong[6], 23L, 76029189L);
    l2 = HH(l2, l4, l1, l3, arrayOfLong[9], 4L, 3654602809L);
    l3 = HH(l3, l2, l4, l1, arrayOfLong[12], 11L, 3873151461L);
    l1 = HH(l1, l3, l2, l4, arrayOfLong[15], 16L, 530742520L);
    l4 = HH(l4, l1, l3, l2, arrayOfLong[2], 23L, 3299628645L);
    l5 = II(l2, l4, l1, l3, arrayOfLong[0], 6L, 4096336452L);
    l2 = II(l3, l5, l4, l1, arrayOfLong[7], 10L, 1126891415L);
    l6 = II(l1, l2, l5, l4, arrayOfLong[14], 15L, 2878612391L);
    l1 = II(l4, l6, l2, l5, arrayOfLong[5], 21L, 4237533241L);
    l3 = II(l5, l1, l6, l2, arrayOfLong[12], 6L, 1700485571L);
    l4 = II(l2, l3, l1, l6, arrayOfLong[3], 10L, 2399980690L);
    l2 = II(l6, l4, l3, l1, arrayOfLong[10], 15L, 4293915773L);
    l5 = II(l1, l2, l4, l3, arrayOfLong[1], 21L, 2240044497L);
    l3 = II(l3, l5, l2, l4, arrayOfLong[8], 6L, 1873313359L);
    l1 = II(l4, l3, l5, l2, arrayOfLong[15], 10L, 4264355552L);
    l4 = II(l2, l1, l3, l5, arrayOfLong[6], 15L, 2734768916L);
    l2 = II(l5, l4, l1, l3, arrayOfLong[13], 21L, 1309151649L);
    l3 = II(l3, l2, l4, l1, arrayOfLong[4], 6L, 4149444226L);
    l1 = II(l1, l3, l2, l4, arrayOfLong[11], 10L, 3174756917L);
    l4 = II(l4, l1, l3, l2, arrayOfLong[2], 15L, 718787259L);
    l2 = II(l2, l4, l1, l3, arrayOfLong[9], 21L, 3951481745L);
    paramArrayOfByte = this.state;
    paramArrayOfByte[0] += l3;
    paramArrayOfByte = this.state;
    paramArrayOfByte[1] = (l2 + paramArrayOfByte[1]);
    paramArrayOfByte = this.state;
    paramArrayOfByte[2] += l4;
    paramArrayOfByte = this.state;
    paramArrayOfByte[3] += l1;
    AppMethodBeat.o(96509);
  }

  private void md5Update(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(96508);
    byte[] arrayOfByte = new byte[64];
    int i = (int)(this.count[0] >>> 3) & 0x3F;
    long[] arrayOfLong = this.count;
    long l = arrayOfLong[0] + (paramInt << 3);
    arrayOfLong[0] = l;
    if (l < paramInt << 3)
    {
      arrayOfLong = this.count;
      arrayOfLong[1] += 1L;
    }
    arrayOfLong = this.count;
    arrayOfLong[1] += (paramInt >>> 29);
    int j = 64 - i;
    if (paramInt >= j)
    {
      md5Memcpy(this.buffer, paramArrayOfByte, i, 0, j);
      md5Transform(this.buffer);
      if (j + 63 >= paramInt)
        i = 0;
    }
    while (true)
    {
      md5Memcpy(this.buffer, paramArrayOfByte, i, j, paramInt - j);
      AppMethodBeat.o(96508);
      return;
      md5Memcpy(arrayOfByte, paramArrayOfByte, 0, j, 64);
      md5Transform(arrayOfByte);
      j += 64;
      break;
      j = 0;
    }
  }

  // ERROR //
  private boolean md5Update(java.io.InputStream paramInputStream, long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc_w 287
    //   6: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: bipush 64
    //   11: newarray byte
    //   13: astore 5
    //   15: aload_0
    //   16: getfield 30	oicq/wlogin_sdk/tools/c:count	[J
    //   19: iconst_0
    //   20: laload
    //   21: iconst_3
    //   22: lushr
    //   23: l2i
    //   24: bipush 63
    //   26: iand
    //   27: istore 6
    //   29: aload_0
    //   30: getfield 30	oicq/wlogin_sdk/tools/c:count	[J
    //   33: astore 7
    //   35: aload 7
    //   37: iconst_0
    //   38: laload
    //   39: lload_2
    //   40: iconst_3
    //   41: lshl
    //   42: ladd
    //   43: lstore 8
    //   45: aload 7
    //   47: iconst_0
    //   48: lload 8
    //   50: lastore
    //   51: lload 8
    //   53: lload_2
    //   54: iconst_3
    //   55: lshl
    //   56: lcmp
    //   57: ifge +19 -> 76
    //   60: aload_0
    //   61: getfield 30	oicq/wlogin_sdk/tools/c:count	[J
    //   64: astore 7
    //   66: aload 7
    //   68: iconst_1
    //   69: aload 7
    //   71: iconst_1
    //   72: laload
    //   73: lconst_1
    //   74: ladd
    //   75: lastore
    //   76: aload_0
    //   77: getfield 30	oicq/wlogin_sdk/tools/c:count	[J
    //   80: astore 7
    //   82: aload 7
    //   84: iconst_1
    //   85: aload 7
    //   87: iconst_1
    //   88: laload
    //   89: lload_2
    //   90: bipush 29
    //   92: lushr
    //   93: ladd
    //   94: lastore
    //   95: bipush 64
    //   97: iload 6
    //   99: isub
    //   100: istore 10
    //   102: lload_2
    //   103: iload 10
    //   105: i2l
    //   106: lcmp
    //   107: iflt +138 -> 245
    //   110: iload 10
    //   112: newarray byte
    //   114: astore 7
    //   116: aload_1
    //   117: aload 7
    //   119: iconst_0
    //   120: iload 10
    //   122: invokevirtual 293	java/io/InputStream:read	([BII)I
    //   125: pop
    //   126: aload_0
    //   127: getfield 32	oicq/wlogin_sdk/tools/c:buffer	[B
    //   130: aload 7
    //   132: iload 6
    //   134: iconst_0
    //   135: iload 10
    //   137: invokestatic 282	oicq/wlogin_sdk/tools/c:md5Memcpy	([B[BIII)V
    //   140: aload_0
    //   141: aload_0
    //   142: getfield 32	oicq/wlogin_sdk/tools/c:buffer	[B
    //   145: invokespecial 284	oicq/wlogin_sdk/tools/c:md5Transform	([B)V
    //   148: iload 10
    //   150: bipush 63
    //   152: iadd
    //   153: i2l
    //   154: lload_2
    //   155: lcmp
    //   156: iflt +60 -> 216
    //   159: iconst_0
    //   160: istore 6
    //   162: lload_2
    //   163: iload 10
    //   165: i2l
    //   166: lsub
    //   167: l2i
    //   168: newarray byte
    //   170: astore 5
    //   172: aload_1
    //   173: aload 5
    //   175: invokevirtual 296	java/io/InputStream:read	([B)I
    //   178: pop
    //   179: aload_0
    //   180: getfield 32	oicq/wlogin_sdk/tools/c:buffer	[B
    //   183: aload 5
    //   185: iload 6
    //   187: iconst_0
    //   188: aload 5
    //   190: arraylength
    //   191: invokestatic 282	oicq/wlogin_sdk/tools/c:md5Memcpy	([B[BIII)V
    //   194: ldc_w 287
    //   197: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: iconst_1
    //   201: istore 4
    //   203: iload 4
    //   205: ireturn
    //   206: astore_1
    //   207: ldc_w 287
    //   210: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: goto -10 -> 203
    //   216: aload_1
    //   217: aload 5
    //   219: invokevirtual 296	java/io/InputStream:read	([B)I
    //   222: pop
    //   223: aload_0
    //   224: aload 5
    //   226: invokespecial 284	oicq/wlogin_sdk/tools/c:md5Transform	([B)V
    //   229: iinc 10 64
    //   232: goto -84 -> 148
    //   235: astore_1
    //   236: ldc_w 287
    //   239: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: goto -39 -> 203
    //   245: iconst_0
    //   246: istore 10
    //   248: goto -86 -> 162
    //   251: astore_1
    //   252: ldc_w 287
    //   255: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   258: goto -55 -> 203
    //
    // Exception table:
    //   from	to	target	type
    //   116	126	206	java/lang/Exception
    //   216	223	235	java/lang/Exception
    //   172	179	251	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.tools.c
 * JD-Core Version:    0.6.2
 */