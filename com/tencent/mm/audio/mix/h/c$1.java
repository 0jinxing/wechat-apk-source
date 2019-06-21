package com.tencent.mm.audio.mix.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class c$1 extends ThreadLocal<MessageDigest>
{
  private static MessageDigest zN()
  {
    AppMethodBeat.i(137219);
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      AppMethodBeat.o(137219);
      return localMessageDigest;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      RuntimeException localRuntimeException = new RuntimeException("Initialize MD5 failed.", localNoSuchAlgorithmException);
      AppMethodBeat.o(137219);
      throw localRuntimeException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.h.c.1
 * JD-Core Version:    0.6.2
 */