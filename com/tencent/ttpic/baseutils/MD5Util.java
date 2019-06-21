package com.tencent.ttpic.baseutils;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class MD5Util
{
  private static final String[] strDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

  // ERROR //
  public static String GetMD5Code(String paramString)
  {
    // Byte code:
    //   0: ldc 53
    //   2: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 10	java/lang/String
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: invokespecial 62	java/lang/String:<init>	(Ljava/lang/String;)V
    //   14: ldc 64
    //   16: invokestatic 70	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   19: aload_0
    //   20: invokevirtual 74	java/lang/String:getBytes	()[B
    //   23: invokevirtual 78	java/security/MessageDigest:digest	([B)[B
    //   26: invokestatic 82	com/tencent/ttpic/baseutils/MD5Util:byteToString	([B)Ljava/lang/String;
    //   29: astore_0
    //   30: ldc 53
    //   32: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: aload_0
    //   36: areturn
    //   37: astore_2
    //   38: aconst_null
    //   39: astore_0
    //   40: aload_2
    //   41: invokestatic 90	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   44: goto -14 -> 30
    //   47: astore_2
    //   48: aload_1
    //   49: astore_0
    //   50: goto -10 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   5	14	37	java/security/NoSuchAlgorithmException
    //   14	30	47	java/security/NoSuchAlgorithmException
  }

  private static String byteToArrayString(byte paramByte)
  {
    AppMethodBeat.i(49787);
    int i = paramByte;
    if (paramByte < 0)
      i = paramByte + 256;
    paramByte = i / 16;
    String str = strDigits[paramByte] + strDigits[(i % 16)];
    AppMethodBeat.o(49787);
    return str;
  }

  private static String byteToNum(byte paramByte)
  {
    AppMethodBeat.i(49788);
    int i = paramByte;
    if (paramByte < 0)
      i = paramByte + 256;
    AppMethodBeat.o(49788);
    return String.valueOf(i);
  }

  private static String byteToString(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(49789);
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramArrayOfByte.length; i++)
      localStringBuffer.append(byteToArrayString(paramArrayOfByte[i]));
    paramArrayOfByte = localStringBuffer.toString();
    AppMethodBeat.o(49789);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.MD5Util
 * JD-Core Version:    0.6.2
 */