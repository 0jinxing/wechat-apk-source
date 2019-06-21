package com.google.firebase.iid;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public final class a
{
  public static KeyPair uN()
  {
    AppMethodBeat.i(108713);
    try
    {
      Object localObject = KeyPairGenerator.getInstance("RSA");
      ((KeyPairGenerator)localObject).initialize(2048);
      localObject = ((KeyPairGenerator)localObject).generateKeyPair();
      AppMethodBeat.o(108713);
      return localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      AssertionError localAssertionError = new AssertionError(localNoSuchAlgorithmException);
      AppMethodBeat.o(108713);
      throw localAssertionError;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.a
 * JD-Core Version:    0.6.2
 */