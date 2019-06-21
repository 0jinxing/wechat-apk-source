package com.tencent.soter.core.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.e;
import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.g;
import com.tencent.soter.core.c.h;
import com.tencent.soter.core.c.i;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.Certificate;

public final class a extends c
{
  public a(String paramString)
  {
    super(paramString);
  }

  public final Signature auf(String paramString)
  {
    AppMethodBeat.i(73052);
    d.d("Monday", "CertSoterCore initAuthKeySignature", new Object[0]);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.CertSoterCore", "soter: auth key name is null or nil. abort.", new Object[0]);
      AppMethodBeat.o(73052);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Signature localSignature = Signature.getInstance("SHA256withRSA/PSS");
      KeyStore localKeyStore = KeyStore.getInstance(this.Avy);
      localKeyStore.load(null);
      paramString = localKeyStore.getKey(paramString, null);
      if (paramString != null)
      {
        localSignature.initSign((PrivateKey)paramString);
        AppMethodBeat.o(73052);
        paramString = localSignature;
      }
      else
      {
        d.e("Soter.CertSoterCore", "soter: entry not exists", new Object[0]);
        AppMethodBeat.o(73052);
        paramString = null;
      }
    }
  }

  public final f dQO()
  {
    AppMethodBeat.i(73050);
    d.i("Soter.CertSoterCore", "soter: start generate ask", new Object[0]);
    if (dQN())
      try
      {
        Object localObject = KeyPairGenerator.getInstance("RSA", this.Avy);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((KeyPairGenerator)localObject).initialize(com.tencent.soter.core.b.a.eP(e.dQW().Avi + ".addcounter.auto_signed_when_get_pubkey_attk", 16).W(new String[] { "SHA-256" }).X(new String[] { "PSS" }).dQU());
        long l = System.nanoTime();
        ((KeyPairGenerator)localObject).generateKeyPair();
        d.i("Soter.CertSoterCore", "soter: generate successfully. cost: %d ms", new Object[] { Long.valueOf(g.nC(l)) });
        localObject = new com/tencent/soter/core/c/f;
        ((f)localObject).<init>(0);
        AppMethodBeat.o(73050);
        return localObject;
      }
      catch (Exception localException)
      {
        while (true)
        {
          d.e("Soter.CertSoterCore", "soter: generateAppGlobalSecureKey " + localException.toString(), new Object[0]);
          d.a("Soter.CertSoterCore", localException, "soter: generateAppGlobalSecureKey error");
          f localf1 = new f(4, localException.toString());
          AppMethodBeat.o(73050);
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        d.a("Soter.CertSoterCore", localOutOfMemoryError, "soter: out of memory when generate ASK!! maybe no attk inside");
        h.dQX();
      }
    while (true)
    {
      f localf2 = new f(2);
      AppMethodBeat.o(73050);
      break;
      d.e("Soter.CertSoterCore", "soter: not support soter", new Object[0]);
    }
  }

  public final i dQS()
  {
    AppMethodBeat.i(73051);
    d.i("Soter.CertSoterCore", "soter: start get app global secure key pub", new Object[0]);
    if (dQN());
    while (true)
    {
      try
      {
        Object localObject1 = KeyStore.getInstance(this.Avy);
        ((KeyStore)localObject1).load(null);
        try
        {
          localObject4 = ((KeyStore)localObject1).getCertificateChain(e.dQW().Avi);
          if (localObject4 != null)
          {
            localObject1 = new com/tencent/soter/core/c/i;
            ((i)localObject1).<init>((Certificate[])localObject4);
            AppMethodBeat.o(73051);
            return localObject1;
          }
          d.e("Soter.CertSoterCore", "soter: key can not be retrieved", new Object[0]);
          AppMethodBeat.o(73051);
          localObject1 = null;
          continue;
        }
        catch (ClassCastException localClassCastException)
        {
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("soter: cast error: ");
          d.e("Soter.CertSoterCore", localClassCastException.toString(), new Object[0]);
          AppMethodBeat.o(73051);
          Object localObject2 = null;
          continue;
        }
      }
      catch (Exception localException)
      {
        d.a("Soter.CertSoterCore", localException, "soter: error when get ask");
        AppMethodBeat.o(73051);
        Object localObject3 = null;
        continue;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        d.a("Soter.CertSoterCore", localOutOfMemoryError, "soter: out of memory when getting ask!! maybe no attk inside");
        h.dQX();
        continue;
      }
      d.e("Soter.CertSoterCore", "soter: not support soter", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.d.a
 * JD-Core Version:    0.6.2
 */