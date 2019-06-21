package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class ag
{
  protected static char[] caT;
  protected static ThreadLocal<MessageDigest> cok;

  static
  {
    AppMethodBeat.i(52057);
    caT = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    cok = new ThreadLocal()
    {
      private static MessageDigest zN()
      {
        AppMethodBeat.i(52051);
        try
        {
          MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
          AppMethodBeat.o(52051);
          return localMessageDigest;
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
        {
          RuntimeException localRuntimeException = new RuntimeException("Initialize MD5 failed.", localNoSuchAlgorithmException);
          AppMethodBeat.o(52051);
          throw localRuntimeException;
        }
      }
    };
    AppMethodBeat.o(52057);
  }

  private static String V(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(52055);
    StringBuffer localStringBuffer = new StringBuffer(paramInt * 2);
    for (int i = 0; i < paramInt + 0; i++)
      a(paramArrayOfByte[i], localStringBuffer);
    paramArrayOfByte = localStringBuffer.toString();
    AppMethodBeat.o(52055);
    return paramArrayOfByte;
  }

  private static void a(byte paramByte, StringBuffer paramStringBuffer)
  {
    AppMethodBeat.i(52056);
    char c1 = caT[((paramByte & 0xF0) >> 4)];
    char c2 = caT[(paramByte & 0xF)];
    paramStringBuffer.append(c1);
    paramStringBuffer.append(c2);
    AppMethodBeat.o(52056);
  }

  public static String ck(String paramString)
  {
    AppMethodBeat.i(52053);
    paramString = w(paramString.getBytes());
    AppMethodBeat.o(52053);
    return paramString;
  }

  public static String w(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(52054);
    paramArrayOfByte = ((MessageDigest)cok.get()).digest(paramArrayOfByte);
    paramArrayOfByte = V(paramArrayOfByte, paramArrayOfByte.length);
    AppMethodBeat.o(52054);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ag
 * JD-Core Version:    0.6.2
 */