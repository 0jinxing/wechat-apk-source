package com.tencent.soter.core.d;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.b.a;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.e;
import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.g;
import com.tencent.soter.core.c.h;
import com.tencent.soter.core.c.i;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.UnrecoverableEntryException;

public class c extends b
  implements com.tencent.soter.core.c.b
{
  private static boolean AuF = false;
  protected String Avy = "SoterKeyStore";

  public c(String paramString)
  {
    this.Avy = paramString;
  }

  @SuppressLint({"PrivateApi"})
  public static void bLV()
  {
    AppMethodBeat.i(73053);
    try
    {
      Method localMethod = Class.forName("android.security.keystore.SoterKeyStoreProvider").getMethod("install", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(null, new Object[0]);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        d.i("Soter.SoterCoreBeforeTreble", "soter: no SoterProvider found", new Object[0]);
        AuF = true;
        AppMethodBeat.o(73053);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      while (true)
      {
        d.i("Soter.SoterCoreBeforeTreble", "soter: function not found", new Object[0]);
        AuF = true;
        AppMethodBeat.o(73053);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
      {
        d.i("Soter.SoterCoreBeforeTreble", "soter: cannot access", new Object[0]);
        AuF = true;
        AppMethodBeat.o(73053);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      while (true)
      {
        d.i("Soter.SoterCoreBeforeTreble", "soter: InvocationTargetException", new Object[0]);
        AuF = true;
        AppMethodBeat.o(73053);
      }
    }
    finally
    {
      AuF = true;
      AppMethodBeat.o(73053);
    }
  }

  public final f atZ(String paramString)
  {
    AppMethodBeat.i(73061);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
      paramString = new f(1, "no authKeyName");
      AppMethodBeat.o(73061);
    }
    while (true)
    {
      return paramString;
      if (dQN())
        try
        {
          if (!dQQ())
          {
            paramString = new com/tencent/soter/core/c/f;
            paramString.<init>(3, "app secure key not exist");
            AppMethodBeat.o(73061);
          }
          else
          {
            KeyStore.getInstance(this.Avy).load(null);
            KeyPairGenerator localKeyPairGenerator = KeyPairGenerator.getInstance("RSA", this.Avy);
            try
            {
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localKeyPairGenerator.initialize(a.eP(paramString + String.format(".addcounter.auto_signed_when_get_pubkey(%s).secmsg_and_counter_signed_when_sign", new Object[] { e.dQW().Avi }), 4).W(new String[] { "SHA-256" }).dQV().X(new String[] { "PSS" }).dQU());
              long l = System.nanoTime();
              localKeyPairGenerator.generateKeyPair();
              d.i("Soter.SoterCoreBeforeTreble", "soter: generate successfully, cost: %d ms", new Object[] { Long.valueOf(g.nC(l)) });
              paramString = new com/tencent/soter/core/c/f;
              paramString.<init>(0);
              AppMethodBeat.o(73061);
            }
            catch (Exception localException)
            {
              paramString = new java/lang/StringBuilder;
              paramString.<init>("soter: cause exception. maybe reflection exception: ");
              d.e("Soter.SoterCoreBeforeTreble", localException.toString(), new Object[0]);
              paramString = new f(5, localException.toString());
              AppMethodBeat.o(73061);
            }
          }
        }
        catch (Exception paramString)
        {
          d.e("Soter.SoterCoreBeforeTreble", "soter: generate auth key failed: " + paramString.toString(), new Object[0]);
          paramString = new f(5, paramString.toString());
          AppMethodBeat.o(73061);
        }
        catch (OutOfMemoryError paramString)
        {
          d.a("Soter.SoterCoreBeforeTreble", paramString, "soter: out of memory when generate AuthKey!! maybe no attk inside");
          h.dQX();
        }
    }
    while (true)
    {
      paramString = new f(2);
      AppMethodBeat.o(73061);
      break;
      d.e("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
    }
  }

  public final boolean aua(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(73063);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.SoterCoreBeforeTreble", "soter: authkey name not correct", new Object[0]);
      AppMethodBeat.o(73063);
    }
    while (true)
    {
      return bool;
      try
      {
        KeyStore localKeyStore = KeyStore.getInstance(this.Avy);
        localKeyStore.load(null);
        if (localKeyStore.getCertificate(paramString) != null)
        {
          AppMethodBeat.o(73063);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(73063);
        }
      }
      catch (Exception paramString)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: hasAppGlobalSecureKey exception: " + paramString.toString(), new Object[0]);
        AppMethodBeat.o(73063);
      }
    }
  }

  public final boolean aub(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(73064);
    d.i("Soter.SoterCoreBeforeTreble", String.format("soter: checking key valid: auth key name: %s, autoDelIfNotValid: %b ", new Object[] { paramString, Boolean.TRUE }), new Object[0]);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.SoterCoreBeforeTreble", "soter: checking key valid: authkey name not correct", new Object[0]);
      AppMethodBeat.o(73064);
    }
    while (true)
    {
      return bool;
      try
      {
        auf(paramString);
        d.i("Soter.SoterCoreBeforeTreble", "soter: key valid", new Object[0]);
        AppMethodBeat.o(73064);
        bool = true;
      }
      catch (UnrecoverableEntryException localUnrecoverableEntryException)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: key invalid.", new Object[0]);
        cn(paramString, false);
        AppMethodBeat.o(73064);
      }
      catch (Exception paramString)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: occurs other exceptions: %s", new Object[] { paramString.toString() });
        d.a("Soter.SoterCoreBeforeTreble", paramString, "soter: occurs other exceptions");
        AppMethodBeat.o(73064);
      }
      catch (OutOfMemoryError paramString)
      {
        d.a("Soter.SoterCoreBeforeTreble", paramString, "soter: out of memory when isAuthKeyValid!! maybe no attk inside");
        h.dQX();
        AppMethodBeat.o(73064);
      }
      catch (InvalidKeyException localInvalidKeyException)
      {
        label91: break label91;
      }
    }
  }

  public final i auc(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(73065);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
      AppMethodBeat.o(73065);
      paramString = localObject1;
      return paramString;
    }
    if (dQN());
    while (true)
    {
      try
      {
        while (true)
        {
          Object localObject2 = KeyStore.getInstance(this.Avy);
          ((KeyStore)localObject2).load(null);
          try
          {
            paramString = ((KeyStore)localObject2).getKey(paramString, "from_soter_ui".toCharArray());
            if (paramString != null)
            {
              paramString = cp(paramString.getEncoded());
              AppMethodBeat.o(73065);
              break;
            }
            d.e("Soter.SoterCoreBeforeTreble", "soter: key can not be retrieved", new Object[0]);
            AppMethodBeat.o(73065);
            paramString = localObject1;
          }
          catch (ClassCastException paramString)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("soter: cast error: ");
            d.e("Soter.SoterCoreBeforeTreble", paramString.toString(), new Object[0]);
            AppMethodBeat.o(73065);
            paramString = localObject1;
          }
        }
      }
      catch (Exception paramString)
      {
        d.a("Soter.SoterCoreBeforeTreble", paramString, "soter: error in get auth key model");
        AppMethodBeat.o(73065);
        paramString = localObject1;
      }
      catch (OutOfMemoryError paramString)
      {
        d.a("Soter.SoterCoreBeforeTreble", paramString, "soter: out of memory when getAuthKeyModel!! maybe no attk inside");
        h.dQX();
        continue;
      }
      d.e("Soter.SoterCoreBeforeTreble", "soter: not support soter " + this.Avy, new Object[0]);
    }
  }

  public final Signature aud(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(73066);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
      AppMethodBeat.o(73066);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (dQN());
      try
      {
        paramString = auf(paramString);
        AppMethodBeat.o(73066);
      }
      catch (UnrecoverableEntryException paramString)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: key invalid. Advice remove the key", new Object[0]);
        AppMethodBeat.o(73066);
        paramString = localObject;
      }
      catch (Exception paramString)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: exception when getSignatureResult: " + paramString.toString(), new Object[0]);
        d.a("Soter.SoterCoreBeforeTreble", paramString, "soter: exception when getSignatureResult");
        AppMethodBeat.o(73066);
        paramString = localObject;
      }
      catch (OutOfMemoryError paramString)
      {
        d.a("Soter.SoterCoreBeforeTreble", paramString, "soter: out of memory when getAuthInitAndSign!! maybe no attk inside");
        h.dQX();
        AppMethodBeat.o(73066);
        paramString = localObject;
        continue;
        d.e("Soter.SoterCoreBeforeTreble", "soter: not support soter" + this.Avy, new Object[0]);
        AppMethodBeat.o(73066);
        paramString = localObject;
      }
      catch (InvalidKeyException paramString)
      {
        label59: break label59;
      }
    }
  }

  public Signature auf(String paramString)
  {
    AppMethodBeat.i(73067);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
      AppMethodBeat.o(73067);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Signature localSignature = Signature.getInstance("SHA256withRSA/PSS", "AndroidKeyStoreBCWorkaround");
      KeyStore localKeyStore = KeyStore.getInstance(this.Avy);
      localKeyStore.load(null);
      paramString = (KeyStore.PrivateKeyEntry)localKeyStore.getEntry(paramString, null);
      if (paramString != null)
      {
        localSignature.initSign(paramString.getPrivateKey());
        AppMethodBeat.o(73067);
        paramString = localSignature;
      }
      else
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: entry not exists", new Object[0]);
        AppMethodBeat.o(73067);
        paramString = null;
      }
    }
  }

  public final f cn(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(73062);
    if (g.isNullOrNil(paramString))
    {
      d.e("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
      paramString = new f(1, "no authKeyName");
      AppMethodBeat.o(73062);
    }
    while (true)
    {
      return paramString;
      d.i("Soter.SoterCoreBeforeTreble", "soter: start remove key: ".concat(String.valueOf(paramString)), new Object[0]);
      if (dQN())
      {
        try
        {
          KeyStore localKeyStore = KeyStore.getInstance(this.Avy);
          localKeyStore.load(null);
          localKeyStore.deleteEntry(paramString);
          if (paramBoolean)
          {
            d.i("Soter.SoterCoreBeforeTreble", "soter: auto delete ask", new Object[0]);
            if (dQQ())
              dQP();
          }
          paramString = new com/tencent/soter/core/c/f;
          paramString.<init>(0);
          AppMethodBeat.o(73062);
        }
        catch (Exception paramString)
        {
          d.e("Soter.SoterCoreBeforeTreble", "soter: removeAuthKey " + paramString.toString(), new Object[0]);
          paramString = new f(6, paramString.toString());
          AppMethodBeat.o(73062);
        }
      }
      else
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
        paramString = new f(2);
        AppMethodBeat.o(73062);
      }
    }
  }

  public final boolean dQN()
  {
    boolean bool = false;
    AppMethodBeat.i(73055);
    if (!AuF)
      bLV();
    if (h.dQY())
    {
      d.w("Soter.SoterCoreBeforeTreble", "hy: the device has already triggered OOM. mark as not support", new Object[0]);
      AppMethodBeat.o(73055);
    }
    while (true)
    {
      return bool;
      Provider[] arrayOfProvider = Security.getProviders();
      if (arrayOfProvider == null)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: no provider supported", new Object[0]);
        AppMethodBeat.o(73055);
      }
      else
      {
        int i = arrayOfProvider.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label137;
          String str = arrayOfProvider[j].getName();
          if ((str != null) && (str.startsWith("SoterKeyStore")))
          {
            d.i("Soter.SoterCoreBeforeTreble", "soter: found soter provider", new Object[0]);
            bool = true;
            AppMethodBeat.o(73055);
            break;
          }
        }
        label137: d.i("Soter.SoterCoreBeforeTreble", "soter: soter provider not found", new Object[0]);
        AppMethodBeat.o(73055);
      }
    }
  }

  public f dQO()
  {
    AppMethodBeat.i(73056);
    d.i("Soter.SoterCoreBeforeTreble", "soter: start generate ask", new Object[0]);
    if (dQN())
      try
      {
        KeyStore.getInstance(this.Avy).load(null);
        Object localObject = KeyPairGenerator.getInstance("RSA", "SoterKeyStore");
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((KeyPairGenerator)localObject).initialize(a.eP(e.dQW().Avi + ".addcounter.auto_signed_when_get_pubkey_attk", 4).W(new String[] { "SHA-256" }).X(new String[] { "PSS" }).dQU());
        long l = System.nanoTime();
        ((KeyPairGenerator)localObject).generateKeyPair();
        d.i("Soter.SoterCoreBeforeTreble", "soter: generate successfully. cost: %d ms", new Object[] { Long.valueOf(g.nC(l)) });
        localObject = new com/tencent/soter/core/c/f;
        ((f)localObject).<init>(0);
        AppMethodBeat.o(73056);
        return localObject;
      }
      catch (Exception localException)
      {
        while (true)
        {
          d.e("Soter.SoterCoreBeforeTreble", "soter: generateAppGlobalSecureKey " + localException.toString(), new Object[0]);
          d.a("Soter.SoterCoreBeforeTreble", localException, "soter: generateAppGlobalSecureKey error");
          f localf1 = new f(4, localException.toString());
          AppMethodBeat.o(73056);
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        d.a("Soter.SoterCoreBeforeTreble", localOutOfMemoryError, "soter: out of memory when generate ASK!! maybe no attk inside");
        h.dQX();
      }
    while (true)
    {
      f localf2 = new f(2);
      AppMethodBeat.o(73056);
      break;
      d.e("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
    }
  }

  public final f dQP()
  {
    AppMethodBeat.i(73057);
    d.i("Soter.SoterCoreBeforeTreble", "soter: start remove app global secure key", new Object[0]);
    if (dQN());
    while (true)
    {
      try
      {
        Object localObject = KeyStore.getInstance(this.Avy);
        ((KeyStore)localObject).load(null);
        ((KeyStore)localObject).deleteEntry(e.dQW().Avi);
        localObject = new com/tencent/soter/core/c/f;
        ((f)localObject).<init>(0);
        AppMethodBeat.o(73057);
        return localObject;
      }
      catch (Exception localException)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: removeAppGlobalSecureKey " + localException.toString(), new Object[0]);
        localf = new f(5, localException.toString());
        AppMethodBeat.o(73057);
        continue;
      }
      d.e("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
      f localf = new f(2);
      AppMethodBeat.o(73057);
    }
  }

  public final boolean dQQ()
  {
    AppMethodBeat.i(73058);
    try
    {
      KeyStore localKeyStore = KeyStore.getInstance(this.Avy);
      localKeyStore.load(null);
      if (localKeyStore.getCertificate(e.dQW().Avi) != null)
      {
        bool = true;
        AppMethodBeat.o(73058);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(73058);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        d.e("Soter.SoterCoreBeforeTreble", "soter: hasAppGlobalSecureKey exception: " + localException.toString(), new Object[0]);
        AppMethodBeat.o(73058);
        boolean bool = false;
      }
    }
  }

  public final boolean dQR()
  {
    AppMethodBeat.i(73059);
    boolean bool;
    if ((dQQ()) && (dQS() != null))
    {
      bool = true;
      AppMethodBeat.o(73059);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(73059);
    }
  }

  public i dQS()
  {
    Object localObject1 = null;
    AppMethodBeat.i(73060);
    d.i("Soter.SoterCoreBeforeTreble", "soter: start get app global secure key pub", new Object[0]);
    if (dQN());
    while (true)
    {
      try
      {
        Object localObject2 = KeyStore.getInstance(this.Avy);
        ((KeyStore)localObject2).load(null);
        try
        {
          localObject2 = ((KeyStore)localObject2).getKey(e.dQW().Avi, "from_soter_ui".toCharArray());
          if (localObject2 != null)
          {
            localObject2 = cp(((Key)localObject2).getEncoded());
            localObject1 = localObject2;
            AppMethodBeat.o(73060);
            return localObject1;
          }
          d.e("Soter.SoterCoreBeforeTreble", "soter: key can not be retrieved", new Object[0]);
          AppMethodBeat.o(73060);
          continue;
        }
        catch (ClassCastException localClassCastException)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("soter: cast error: ");
          d.e("Soter.SoterCoreBeforeTreble", localClassCastException.toString(), new Object[0]);
          AppMethodBeat.o(73060);
          continue;
        }
      }
      catch (Exception localException)
      {
        d.a("Soter.SoterCoreBeforeTreble", localException, "soter: error when get ask");
        AppMethodBeat.o(73060);
        continue;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        d.a("Soter.SoterCoreBeforeTreble", localOutOfMemoryError, "soter: out of memory when getting ask!! maybe no attk inside");
        h.dQX();
        continue;
      }
      d.e("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
    }
  }

  public final SoterSessionResult iC(String paramString1, String paramString2)
  {
    return null;
  }

  public final boolean iV(Context paramContext)
  {
    AppMethodBeat.i(73054);
    bLV();
    AppMethodBeat.o(73054);
    return true;
  }

  public final byte[] nB(long paramLong)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.d.c
 * JD-Core Version:    0.6.2
 */