package com.tencent.tmassistantsdk.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

public class MD5
{
  static final byte[] PADDING = { -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  static final int S11 = 7;
  static final int S12 = 12;
  static final int S13 = 17;
  static final int S14 = 22;
  static final int S21 = 5;
  static final int S22 = 9;
  static final int S23 = 14;
  static final int S24 = 20;
  static final int S31 = 4;
  static final int S32 = 11;
  static final int S33 = 16;
  static final int S34 = 23;
  static final int S41 = 6;
  static final int S42 = 10;
  static final int S43 = 15;
  static final int S44 = 21;
  protected final byte[] buffer;
  protected final long[] count;
  protected final byte[] digest;
  protected final long[] state;

  public MD5()
  {
    AppMethodBeat.i(76258);
    this.state = new long[4];
    this.count = new long[2];
    this.buffer = new byte[64];
    this.digest = new byte[16];
    md5Init();
    AppMethodBeat.o(76258);
  }

  private void Decode(long[] paramArrayOfLong, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(76267);
    int i = 0;
    for (int j = 0; i < paramInt; j++)
    {
      paramArrayOfLong[j] = (b2iu(paramArrayOfByte[i]) | b2iu(paramArrayOfByte[(i + 1)]) << 8 | b2iu(paramArrayOfByte[(i + 2)]) << 16 | b2iu(paramArrayOfByte[(i + 3)]) << 24);
      i += 4;
    }
    AppMethodBeat.o(76267);
  }

  private void Encode(byte[] paramArrayOfByte, long[] paramArrayOfLong, int paramInt)
  {
    int i = 0;
    for (int j = 0; i < paramInt; j++)
    {
      paramArrayOfByte[i] = ((byte)(byte)(int)(paramArrayOfLong[j] & 0xFF));
      paramArrayOfByte[(i + 1)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 8 & 0xFF));
      paramArrayOfByte[(i + 2)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 16 & 0xFF));
      paramArrayOfByte[(i + 3)] = ((byte)(byte)(int)(paramArrayOfLong[j] >>> 24 & 0xFF));
      i += 4;
    }
  }

  private long F(long paramLong1, long paramLong2, long paramLong3)
  {
    return paramLong1 & paramLong2 | (0xFFFFFFFF ^ paramLong1) & paramLong3;
  }

  private long FF(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    AppMethodBeat.i(76259);
    paramLong1 = F(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    paramLong1 = (int)paramLong1 >>> (int)(32L - paramLong6) | i << j;
    AppMethodBeat.o(76259);
    return paramLong1 + paramLong2;
  }

  private long G(long paramLong1, long paramLong2, long paramLong3)
  {
    return paramLong1 & paramLong3 | (0xFFFFFFFF ^ paramLong3) & paramLong2;
  }

  private long GG(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    AppMethodBeat.i(76260);
    paramLong1 = G(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    paramLong1 = (int)paramLong1 >>> (int)(32L - paramLong6) | i << j;
    AppMethodBeat.o(76260);
    return paramLong1 + paramLong2;
  }

  private long H(long paramLong1, long paramLong2, long paramLong3)
  {
    return paramLong1 ^ paramLong2 ^ paramLong3;
  }

  private long HH(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    AppMethodBeat.i(76261);
    paramLong1 = H(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    paramLong1 = (int)paramLong1 >>> (int)(32L - paramLong6) | i << j;
    AppMethodBeat.o(76261);
    return paramLong1 + paramLong2;
  }

  private long I(long paramLong1, long paramLong2, long paramLong3)
  {
    return (0xFFFFFFFF ^ paramLong3 | paramLong1) ^ paramLong2;
  }

  private long II(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    AppMethodBeat.i(76262);
    paramLong1 = I(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    paramLong1 = (int)paramLong1 >>> (int)(32L - paramLong6) | i << j;
    AppMethodBeat.o(76262);
    return paramLong1 + paramLong2;
  }

  public static long b2iu(byte paramByte)
  {
    if (paramByte < 0);
    for (long l = paramByte & 0xFF; ; l = paramByte)
      return l;
  }

  public static String byteHEX(byte paramByte)
  {
    AppMethodBeat.i(76268);
    Object localObject = new char[16];
    Object tmp11_10 = localObject;
    tmp11_10[0] = 48;
    Object tmp16_11 = tmp11_10;
    tmp16_11[1] = 49;
    Object tmp21_16 = tmp16_11;
    tmp21_16[2] = 50;
    Object tmp26_21 = tmp21_16;
    tmp26_21[3] = 51;
    Object tmp31_26 = tmp26_21;
    tmp31_26[4] = 52;
    Object tmp36_31 = tmp31_26;
    tmp36_31[5] = 53;
    Object tmp41_36 = tmp36_31;
    tmp41_36[6] = 54;
    Object tmp47_41 = tmp41_36;
    tmp47_41[7] = 55;
    Object tmp53_47 = tmp47_41;
    tmp53_47[8] = 56;
    Object tmp59_53 = tmp53_47;
    tmp59_53[9] = 57;
    Object tmp65_59 = tmp59_53;
    tmp65_59[10] = 65;
    Object tmp71_65 = tmp65_59;
    tmp71_65[11] = 66;
    Object tmp77_71 = tmp71_65;
    tmp77_71[12] = 67;
    Object tmp83_77 = tmp77_71;
    tmp83_77[13] = 68;
    Object tmp89_83 = tmp83_77;
    tmp89_83[14] = 69;
    Object tmp95_89 = tmp89_83;
    tmp95_89[15] = 70;
    tmp95_89;
    localObject = new String(new char[] { localObject[(paramByte >>> 4 & 0xF)], localObject[(paramByte & 0xF)] });
    AppMethodBeat.o(76268);
    return localObject;
  }

  public static String convertHashToString(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76271);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = "";
      AppMethodBeat.o(76271);
    }
    while (true)
    {
      return paramArrayOfByte;
      String str = "";
      for (int i = 0; i < paramArrayOfByte.length; i++)
        str = str + Integer.toString((paramArrayOfByte[i] & 0xFF) + 256, 16).substring(1);
      paramArrayOfByte = str.toUpperCase();
      AppMethodBeat.o(76271);
    }
  }

  // ERROR //
  public static String fileToMD5(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc 168
    //   6: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 170	java/io/FileInputStream
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: invokespecial 173	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   18: sipush 1024
    //   21: newarray byte
    //   23: astore_0
    //   24: ldc 175
    //   26: invokestatic 181	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   29: astore 4
    //   31: iload_2
    //   32: iconst_m1
    //   33: if_icmpeq +51 -> 84
    //   36: aload_3
    //   37: aload_0
    //   38: invokevirtual 187	java/io/InputStream:read	([B)I
    //   41: istore 5
    //   43: iload 5
    //   45: istore_2
    //   46: iload 5
    //   48: ifle -17 -> 31
    //   51: aload 4
    //   53: aload_0
    //   54: iconst_0
    //   55: iload 5
    //   57: invokevirtual 191	java/security/MessageDigest:update	([BII)V
    //   60: iload 5
    //   62: istore_2
    //   63: goto -32 -> 31
    //   66: astore_0
    //   67: aload_3
    //   68: ifnull +7 -> 75
    //   71: aload_3
    //   72: invokevirtual 194	java/io/InputStream:close	()V
    //   75: ldc 168
    //   77: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: aload_1
    //   81: astore_0
    //   82: aload_0
    //   83: areturn
    //   84: aload 4
    //   86: invokevirtual 197	java/security/MessageDigest:digest	()[B
    //   89: invokestatic 199	com/tencent/tmassistantsdk/util/MD5:convertHashToString	([B)Ljava/lang/String;
    //   92: astore_0
    //   93: aload_3
    //   94: invokevirtual 194	java/io/InputStream:close	()V
    //   97: ldc 168
    //   99: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: goto -20 -> 82
    //   105: astore_0
    //   106: aconst_null
    //   107: astore_3
    //   108: aload_3
    //   109: ifnull +7 -> 116
    //   112: aload_3
    //   113: invokevirtual 194	java/io/InputStream:close	()V
    //   116: ldc 168
    //   118: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: aload_0
    //   122: athrow
    //   123: astore_3
    //   124: goto -27 -> 97
    //   127: astore_0
    //   128: goto -53 -> 75
    //   131: astore_3
    //   132: goto -16 -> 116
    //   135: astore_0
    //   136: goto -28 -> 108
    //   139: astore_0
    //   140: aconst_null
    //   141: astore_3
    //   142: goto -75 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   18	31	66	java/lang/Exception
    //   36	43	66	java/lang/Exception
    //   51	60	66	java/lang/Exception
    //   84	93	66	java/lang/Exception
    //   9	18	105	finally
    //   93	97	123	java/lang/Exception
    //   71	75	127	java/lang/Exception
    //   112	116	131	java/lang/Exception
    //   18	31	135	finally
    //   36	43	135	finally
    //   51	60	135	finally
    //   84	93	135	finally
    //   9	18	139	java/lang/Exception
  }

  private void md5Final()
  {
    AppMethodBeat.i(76265);
    byte[] arrayOfByte = new byte[8];
    Encode(arrayOfByte, this.count, 8);
    int i = (int)(this.count[0] >>> 3) & 0x3F;
    if (i < 56);
    for (i = 56 - i; ; i = 120 - i)
    {
      md5Update(PADDING, i);
      md5Update(arrayOfByte, 8);
      Encode(this.digest, this.state, 16);
      AppMethodBeat.o(76265);
      return;
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

  private void md5Memcpy(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < paramInt3; i++)
      paramArrayOfByte1[(paramInt1 + i)] = ((byte)paramArrayOfByte2[(paramInt2 + i)]);
  }

  private void md5Transform(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76266);
    long l1 = this.state[0];
    long l2 = this.state[1];
    long l3 = this.state[2];
    long l4 = this.state[3];
    long[] arrayOfLong = new long[16];
    Decode(arrayOfLong, paramArrayOfByte, 64);
    l1 = FF(l1, l2, l3, l4, arrayOfLong[0], 7L, 3614090360L);
    l4 = FF(l4, l1, l2, l3, arrayOfLong[1], 12L, 3905402710L);
    l3 = FF(l3, l4, l1, l2, arrayOfLong[2], 17L, 606105819L);
    l2 = FF(l2, l3, l4, l1, arrayOfLong[3], 22L, 3250441966L);
    l1 = FF(l1, l2, l3, l4, arrayOfLong[4], 7L, 4118548399L);
    l4 = FF(l4, l1, l2, l3, arrayOfLong[5], 12L, 1200080426L);
    l3 = FF(l3, l4, l1, l2, arrayOfLong[6], 17L, 2821735955L);
    l2 = FF(l2, l3, l4, l1, arrayOfLong[7], 22L, 4249261313L);
    long l5 = FF(l1, l2, l3, l4, arrayOfLong[8], 7L, 1770035416L);
    l4 = FF(l4, l5, l2, l3, arrayOfLong[9], 12L, 2336552879L);
    l3 = FF(l3, l4, l5, l2, arrayOfLong[10], 17L, 4294925233L);
    l1 = FF(l2, l3, l4, l5, arrayOfLong[11], 22L, 2304563134L);
    l2 = FF(l5, l1, l3, l4, arrayOfLong[12], 7L, 1804603682L);
    l5 = FF(l4, l2, l1, l3, arrayOfLong[13], 12L, 4254626195L);
    l3 = FF(l3, l5, l2, l1, arrayOfLong[14], 17L, 2792965006L);
    l4 = FF(l1, l3, l5, l2, arrayOfLong[15], 22L, 1236535329L);
    l2 = GG(l2, l4, l3, l5, arrayOfLong[1], 5L, 4129170786L);
    l1 = GG(l5, l2, l4, l3, arrayOfLong[6], 9L, 3225465664L);
    l3 = GG(l3, l1, l2, l4, arrayOfLong[11], 14L, 643717713L);
    l5 = GG(l4, l3, l1, l2, arrayOfLong[0], 20L, 3921069994L);
    l4 = GG(l2, l5, l3, l1, arrayOfLong[5], 5L, 3593408605L);
    long l6 = GG(l1, l4, l5, l3, arrayOfLong[10], 9L, 38016083L);
    l1 = GG(l3, l6, l4, l5, arrayOfLong[15], 14L, 3634488961L);
    l2 = GG(l5, l1, l6, l4, arrayOfLong[4], 20L, 3889429448L);
    l4 = GG(l4, l2, l1, l6, arrayOfLong[9], 5L, 568446438L);
    l3 = GG(l6, l4, l2, l1, arrayOfLong[14], 9L, 3275163606L);
    l1 = GG(l1, l3, l4, l2, arrayOfLong[3], 14L, 4107603335L);
    l2 = GG(l2, l1, l3, l4, arrayOfLong[8], 20L, 1163531501L);
    l4 = GG(l4, l2, l1, l3, arrayOfLong[13], 5L, 2850285829L);
    l6 = GG(l3, l4, l2, l1, arrayOfLong[2], 9L, 4243563512L);
    l3 = GG(l1, l6, l4, l2, arrayOfLong[7], 14L, 1735328473L);
    l5 = GG(l2, l3, l6, l4, arrayOfLong[12], 20L, 2368359562L);
    l4 = HH(l4, l5, l3, l6, arrayOfLong[5], 4L, 4294588738L);
    l1 = HH(l6, l4, l5, l3, arrayOfLong[8], 11L, 2272392833L);
    l2 = HH(l3, l1, l4, l5, arrayOfLong[11], 16L, 1839030562L);
    l3 = HH(l5, l2, l1, l4, arrayOfLong[14], 23L, 4259657740L);
    l4 = HH(l4, l3, l2, l1, arrayOfLong[1], 4L, 2763975236L);
    l5 = HH(l1, l4, l3, l2, arrayOfLong[4], 11L, 1272893353L);
    l1 = HH(l2, l5, l4, l3, arrayOfLong[7], 16L, 4139469664L);
    l2 = HH(l3, l1, l5, l4, arrayOfLong[10], 23L, 3200236656L);
    l4 = HH(l4, l2, l1, l5, arrayOfLong[13], 4L, 681279174L);
    l3 = HH(l5, l4, l2, l1, arrayOfLong[0], 11L, 3936430074L);
    l1 = HH(l1, l3, l4, l2, arrayOfLong[3], 16L, 3572445317L);
    l2 = HH(l2, l1, l3, l4, arrayOfLong[6], 23L, 76029189L);
    l4 = HH(l4, l2, l1, l3, arrayOfLong[9], 4L, 3654602809L);
    l5 = HH(l3, l4, l2, l1, arrayOfLong[12], 11L, 3873151461L);
    l3 = HH(l1, l5, l4, l2, arrayOfLong[15], 16L, 530742520L);
    l1 = HH(l2, l3, l5, l4, arrayOfLong[2], 23L, 3299628645L);
    l4 = II(l4, l1, l3, l5, arrayOfLong[0], 6L, 4096336452L);
    l2 = II(l5, l4, l1, l3, arrayOfLong[7], 10L, 1126891415L);
    l3 = II(l3, l2, l4, l1, arrayOfLong[14], 15L, 2878612391L);
    l5 = II(l1, l3, l2, l4, arrayOfLong[5], 21L, 4237533241L);
    l1 = II(l4, l5, l3, l2, arrayOfLong[12], 6L, 1700485571L);
    l6 = II(l2, l1, l5, l3, arrayOfLong[3], 10L, 2399980690L);
    l4 = II(l3, l6, l1, l5, arrayOfLong[10], 15L, 4293915773L);
    l5 = II(l5, l4, l6, l1, arrayOfLong[1], 21L, 2240044497L);
    l2 = II(l1, l5, l4, l6, arrayOfLong[8], 6L, 1873313359L);
    l3 = II(l6, l2, l5, l4, arrayOfLong[15], 10L, 4264355552L);
    l4 = II(l4, l3, l2, l5, arrayOfLong[6], 15L, 2734768916L);
    l1 = II(l5, l4, l3, l2, arrayOfLong[13], 21L, 1309151649L);
    l2 = II(l2, l1, l4, l3, arrayOfLong[4], 6L, 4149444226L);
    l3 = II(l3, l2, l1, l4, arrayOfLong[11], 10L, 3174756917L);
    l4 = II(l4, l3, l2, l1, arrayOfLong[2], 15L, 718787259L);
    l1 = II(l1, l4, l3, l2, arrayOfLong[9], 21L, 3951481745L);
    paramArrayOfByte = this.state;
    paramArrayOfByte[0] += l2;
    paramArrayOfByte = this.state;
    paramArrayOfByte[1] = (l1 + paramArrayOfByte[1]);
    paramArrayOfByte = this.state;
    paramArrayOfByte[2] += l4;
    paramArrayOfByte = this.state;
    paramArrayOfByte[3] += l3;
    AppMethodBeat.o(76266);
  }

  private void md5Update(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(76264);
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
      for (i = j; i + 63 < paramInt; i += 64)
      {
        md5Memcpy(arrayOfByte, paramArrayOfByte, 0, i, 64);
        md5Transform(arrayOfByte);
      }
      int k = 0;
      j = i;
      i = k;
    }
    while (true)
    {
      md5Memcpy(this.buffer, paramArrayOfByte, i, j, paramInt - j);
      AppMethodBeat.o(76264);
      return;
      j = 0;
    }
  }

  // ERROR //
  private boolean md5Update(java.io.InputStream paramInputStream, long paramLong)
  {
    // Byte code:
    //   0: ldc_w 397
    //   3: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: bipush 64
    //   8: newarray byte
    //   10: astore 4
    //   12: aload_0
    //   13: getfield 65	com/tencent/tmassistantsdk/util/MD5:count	[J
    //   16: iconst_0
    //   17: laload
    //   18: iconst_3
    //   19: lushr
    //   20: l2i
    //   21: bipush 63
    //   23: iand
    //   24: istore 5
    //   26: aload_0
    //   27: getfield 65	com/tencent/tmassistantsdk/util/MD5:count	[J
    //   30: astore 6
    //   32: aload 6
    //   34: iconst_0
    //   35: laload
    //   36: lload_2
    //   37: iconst_3
    //   38: lshl
    //   39: ladd
    //   40: lstore 7
    //   42: aload 6
    //   44: iconst_0
    //   45: lload 7
    //   47: lastore
    //   48: lload 7
    //   50: lload_2
    //   51: iconst_3
    //   52: lshl
    //   53: lcmp
    //   54: ifge +19 -> 73
    //   57: aload_0
    //   58: getfield 65	com/tencent/tmassistantsdk/util/MD5:count	[J
    //   61: astore 6
    //   63: aload 6
    //   65: iconst_1
    //   66: aload 6
    //   68: iconst_1
    //   69: laload
    //   70: lconst_1
    //   71: ladd
    //   72: lastore
    //   73: aload_0
    //   74: getfield 65	com/tencent/tmassistantsdk/util/MD5:count	[J
    //   77: astore 6
    //   79: aload 6
    //   81: iconst_1
    //   82: aload 6
    //   84: iconst_1
    //   85: laload
    //   86: lload_2
    //   87: bipush 29
    //   89: lushr
    //   90: ladd
    //   91: lastore
    //   92: bipush 64
    //   94: iload 5
    //   96: isub
    //   97: istore 9
    //   99: lload_2
    //   100: iload 9
    //   102: i2l
    //   103: lcmp
    //   104: iflt +146 -> 250
    //   107: iload 9
    //   109: newarray byte
    //   111: astore 6
    //   113: aload_1
    //   114: aload 6
    //   116: iconst_0
    //   117: iload 9
    //   119: invokevirtual 400	java/io/InputStream:read	([BII)I
    //   122: pop
    //   123: aload_0
    //   124: aload_0
    //   125: getfield 67	com/tencent/tmassistantsdk/util/MD5:buffer	[B
    //   128: aload 6
    //   130: iload 5
    //   132: iconst_0
    //   133: iload 9
    //   135: invokespecial 393	com/tencent/tmassistantsdk/util/MD5:md5Memcpy	([B[BIII)V
    //   138: aload_0
    //   139: aload_0
    //   140: getfield 67	com/tencent/tmassistantsdk/util/MD5:buffer	[B
    //   143: invokespecial 395	com/tencent/tmassistantsdk/util/MD5:md5Transform	([B)V
    //   146: iload 9
    //   148: bipush 63
    //   150: iadd
    //   151: i2l
    //   152: lload_2
    //   153: lcmp
    //   154: ifge +48 -> 202
    //   157: aload_1
    //   158: aload 4
    //   160: invokevirtual 187	java/io/InputStream:read	([B)I
    //   163: pop
    //   164: aload_0
    //   165: aload 4
    //   167: invokespecial 395	com/tencent/tmassistantsdk/util/MD5:md5Transform	([B)V
    //   170: iinc 9 64
    //   173: goto -27 -> 146
    //   176: astore_1
    //   177: iconst_0
    //   178: istore 10
    //   180: ldc_w 397
    //   183: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: iload 10
    //   188: ireturn
    //   189: astore_1
    //   190: iconst_0
    //   191: istore 10
    //   193: ldc_w 397
    //   196: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: goto -13 -> 186
    //   202: iconst_0
    //   203: istore 5
    //   205: lload_2
    //   206: iload 9
    //   208: i2l
    //   209: lsub
    //   210: l2i
    //   211: newarray byte
    //   213: astore 4
    //   215: aload_1
    //   216: aload 4
    //   218: invokevirtual 187	java/io/InputStream:read	([B)I
    //   221: pop
    //   222: aload_0
    //   223: aload_0
    //   224: getfield 67	com/tencent/tmassistantsdk/util/MD5:buffer	[B
    //   227: aload 4
    //   229: iload 5
    //   231: iconst_0
    //   232: aload 4
    //   234: arraylength
    //   235: invokespecial 393	com/tencent/tmassistantsdk/util/MD5:md5Memcpy	([B[BIII)V
    //   238: iconst_1
    //   239: istore 10
    //   241: ldc_w 397
    //   244: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   247: goto -61 -> 186
    //   250: iconst_0
    //   251: istore 9
    //   253: goto -48 -> 205
    //   256: astore_1
    //   257: iconst_0
    //   258: istore 10
    //   260: ldc_w 397
    //   263: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: goto -80 -> 186
    //
    // Exception table:
    //   from	to	target	type
    //   113	123	176	java/lang/Exception
    //   157	164	189	java/lang/Exception
    //   215	222	256	java/lang/Exception
  }

  public static String toMD5(String paramString)
  {
    AppMethodBeat.i(76269);
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO8859_1");
      paramString = arrayOfByte;
      arrayOfByte = new MD5().getMD5(paramString);
      paramString = "";
      for (int i = 0; i < 16; i++)
        paramString = paramString + byteHEX(arrayOfByte[i]);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        paramString = paramString.getBytes();
      AppMethodBeat.o(76269);
    }
    return paramString;
  }

  public byte[] getMD5(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76257);
    md5Init();
    md5Update(new ByteArrayInputStream(paramArrayOfByte), paramArrayOfByte.length);
    md5Final();
    paramArrayOfByte = this.digest;
    AppMethodBeat.o(76257);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.MD5
 * JD-Core Version:    0.6.2
 */