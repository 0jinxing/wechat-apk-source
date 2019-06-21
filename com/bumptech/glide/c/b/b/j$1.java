package com.bumptech.glide.c.b.b;

import com.bumptech.glide.h.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class j$1
  implements a.a<j.a>
{
  j$1(j paramj)
  {
  }

  private static j.a na()
  {
    AppMethodBeat.i(91996);
    try
    {
      j.a locala = new j.a(MessageDigest.getInstance("SHA-256"));
      AppMethodBeat.o(91996);
      return locala;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      RuntimeException localRuntimeException = new RuntimeException(localNoSuchAlgorithmException);
      AppMethodBeat.o(91996);
      throw localRuntimeException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.j.1
 * JD-Core Version:    0.6.2
 */