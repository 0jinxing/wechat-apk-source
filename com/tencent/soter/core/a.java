package com.tencent.soter.core;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.h;
import com.tencent.soter.core.c.i;
import com.tencent.soter.core.c.j;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;

public final class a
  implements com.tencent.soter.core.c.b
{
  private static boolean AuF;
  private static com.tencent.soter.core.d.b AuG;

  static
  {
    boolean bool = true;
    AppMethodBeat.i(72894);
    AuF = false;
    com.tencent.soter.core.c.d.i("Soter.SoterCore", "soter: SoterCore is call static block to init SoterCore IMPL", new Object[0]);
    AuG = dQM();
    if (AuG == null);
    while (true)
    {
      com.tencent.soter.core.c.d.i("Soter.SoterCore", "soter: SoterCore is call static block to init SoterCore IMPL, IMPL is null[%b]", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(72894);
      return;
      bool = false;
    }
  }

  public static boolean aC(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(72892);
    boolean bool;
    if ((!BiometricManagerCompat.from(paramContext, Integer.valueOf(paramInt)).isCurrentFailTimeAvailable()) && (!BiometricManagerCompat.from(paramContext, Integer.valueOf(paramInt)).isCurrentTweenTimeAvailable(paramContext)))
    {
      bool = true;
      AppMethodBeat.o(72892);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72892);
    }
  }

  public static f atZ(String paramString)
  {
    AppMethodBeat.i(72878);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: generateAuthKey IMPL is null, not support soter", new Object[0]);
      paramString = new f(2);
      AppMethodBeat.o(72878);
    }
    while (true)
    {
      return paramString;
      paramString = AuG.atZ(paramString);
      AppMethodBeat.o(72878);
    }
  }

  public static boolean aua(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(72880);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: hasAuthKey IMPL is null, not support soter", new Object[0]);
      AppMethodBeat.o(72880);
    }
    while (true)
    {
      return bool;
      bool = AuG.aua(paramString);
      AppMethodBeat.o(72880);
    }
  }

  public static boolean aub(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(72881);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: isAuthKeyValid IMPL is null, not support soter", new Object[0]);
      AppMethodBeat.o(72881);
    }
    while (true)
    {
      return bool;
      bool = AuG.aub(paramString);
      AppMethodBeat.o(72881);
    }
  }

  public static i auc(String paramString)
  {
    AppMethodBeat.i(72882);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: getAuthKeyModel IMPL is null, not support soter", new Object[0]);
      paramString = null;
      AppMethodBeat.o(72882);
    }
    while (true)
    {
      return paramString;
      paramString = AuG.auc(paramString);
      AppMethodBeat.o(72882);
    }
  }

  public static Signature aud(String paramString)
  {
    AppMethodBeat.i(72883);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: getAuthInitAndSign IMPL is null, not support soter", new Object[0]);
      paramString = null;
      AppMethodBeat.o(72883);
    }
    while (true)
    {
      return paramString;
      paramString = AuG.aud(paramString);
      AppMethodBeat.o(72883);
    }
  }

  public static void bLV()
  {
    AppMethodBeat.i(72867);
    com.tencent.soter.core.d.c.bLV();
    AppMethodBeat.o(72867);
  }

  public static f cn(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(72879);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: removeAuthKey IMPL is null, not support soter", new Object[0]);
      paramString = new f(2);
      AppMethodBeat.o(72879);
    }
    while (true)
    {
      return paramString;
      paramString = AuG.cn(paramString, paramBoolean);
      AppMethodBeat.o(72879);
    }
  }

  public static j co(byte[] paramArrayOfByte)
  {
    j localj = null;
    AppMethodBeat.i(72886);
    int i;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      i = 1;
      if (i == 0)
        break label47;
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "origin is null or nil. abort", new Object[0]);
      AppMethodBeat.o(72886);
      paramArrayOfByte = localj;
    }
    while (true)
    {
      return paramArrayOfByte;
      i = 0;
      break;
      label47: if (paramArrayOfByte.length < 4)
      {
        com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: length not correct 1", new Object[0]);
        AppMethodBeat.o(72886);
        paramArrayOfByte = localj;
      }
      else
      {
        byte[] arrayOfByte = new byte[4];
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, 4);
        int j = 0;
        i = 0;
        while (j < 4)
        {
          i += ((arrayOfByte[j] & 0xFF) << j * 8);
          j++;
        }
        com.tencent.soter.core.c.d.d("Soter", "parsed raw length: ".concat(String.valueOf(i)), new Object[0]);
        if (i > 1048576)
        {
          com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: too large signature result!", new Object[0]);
          AppMethodBeat.o(72886);
          paramArrayOfByte = localj;
        }
        else
        {
          arrayOfByte = new byte[i];
          if (paramArrayOfByte.length <= i + 4)
          {
            com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: length not correct 2", new Object[0]);
            AppMethodBeat.o(72886);
            paramArrayOfByte = localj;
          }
          else
          {
            System.arraycopy(paramArrayOfByte, 4, arrayOfByte, 0, i);
            localj = j.aue(new String(arrayOfByte));
            j = paramArrayOfByte.length - (i + 4);
            com.tencent.soter.core.c.d.d("Soter.SoterCore", "soter: signature length: ".concat(String.valueOf(j)), new Object[0]);
            arrayOfByte = new byte[j];
            System.arraycopy(paramArrayOfByte, i + 4, arrayOfByte, 0, j);
            if (localj != null)
              localj.signature = Base64.encodeToString(arrayOfByte, 2);
            AppMethodBeat.o(72886);
            paramArrayOfByte = localj;
          }
        }
      }
    }
  }

  public static void dQK()
  {
    boolean bool = true;
    AppMethodBeat.i(72869);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.i("Soter.SoterCore", "soter: SoterCore IMPL is null then call getProviderSoterCore to init", new Object[0]);
      AuG = dQM();
      if (AuG != null)
        break label60;
    }
    while (true)
    {
      com.tencent.soter.core.c.d.i("Soter.SoterCore", "soter: SoterCore IMPL is null[%b], after call getProviderSoterCore to init", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(72869);
      return;
      label60: bool = false;
    }
  }

  public static int dQL()
  {
    int i = 0;
    AppMethodBeat.i(72870);
    if (AuG == null)
      AppMethodBeat.o(72870);
    while (true)
    {
      return i;
      if ((AuG instanceof com.tencent.soter.core.d.d))
      {
        com.tencent.soter.core.c.d.d("Soter.SoterCore", "getSoterCoreType is TREBLE", new Object[0]);
        i = 1;
        AppMethodBeat.o(72870);
      }
      else
      {
        com.tencent.soter.core.c.d.d("Soter.SoterCore", "getSoterCoreType is not TREBLE", new Object[0]);
        AppMethodBeat.o(72870);
      }
    }
  }

  private static com.tencent.soter.core.d.b dQM()
  {
    Object localObject = null;
    AppMethodBeat.i(72871);
    com.tencent.soter.core.d.c.bLV();
    if (h.dQY())
      AppMethodBeat.o(72871);
    while (true)
    {
      return localObject;
      Provider[] arrayOfProvider = Security.getProviders();
      if (arrayOfProvider == null)
      {
        AppMethodBeat.o(72871);
      }
      else
      {
        int i = arrayOfProvider.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label126;
          String str = arrayOfProvider[j].getName();
          if ((str != null) && (str.startsWith("SoterKeyStore")))
          {
            if (str.split("\\.").length > 1)
            {
              localObject = new com.tencent.soter.core.d.a(str);
              AppMethodBeat.o(72871);
              break;
            }
            localObject = new com.tencent.soter.core.d.c(str);
            AppMethodBeat.o(72871);
            break;
          }
        }
        label126: AppMethodBeat.o(72871);
      }
    }
  }

  public static boolean dQN()
  {
    boolean bool = false;
    AppMethodBeat.i(72872);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: isNativeSupportSoter IMPL is null, not support soter", new Object[0]);
      AppMethodBeat.o(72872);
    }
    while (true)
    {
      return bool;
      bool = AuG.dQN();
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: isNativeSupportSoter return[" + bool + "]", new Object[0]);
      AppMethodBeat.o(72872);
    }
  }

  public static f dQO()
  {
    AppMethodBeat.i(72873);
    f localf;
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: generateAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
      localf = new f(2);
      AppMethodBeat.o(72873);
    }
    while (true)
    {
      return localf;
      localf = AuG.dQO();
      AppMethodBeat.o(72873);
    }
  }

  public static f dQP()
  {
    AppMethodBeat.i(72874);
    f localf;
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: removeAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
      localf = new f(2);
      AppMethodBeat.o(72874);
    }
    while (true)
    {
      return localf;
      localf = AuG.dQP();
      AppMethodBeat.o(72874);
    }
  }

  public static boolean dQQ()
  {
    boolean bool = false;
    AppMethodBeat.i(72875);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: hasAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
      AppMethodBeat.o(72875);
    }
    while (true)
    {
      return bool;
      bool = AuG.dQQ();
      AppMethodBeat.o(72875);
    }
  }

  public static boolean dQR()
  {
    boolean bool = false;
    AppMethodBeat.i(72876);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: isAppGlobalSecureKeyValid IMPL is null, not support soter", new Object[0]);
      AppMethodBeat.o(72876);
    }
    while (true)
    {
      return bool;
      bool = AuG.dQR();
      AppMethodBeat.o(72876);
    }
  }

  public static i dQS()
  {
    AppMethodBeat.i(72877);
    i locali;
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: getAppGlobalSecureKeyModel IMPL is null, not support soter", new Object[0]);
      locali = null;
      AppMethodBeat.o(72877);
    }
    while (true)
    {
      return locali;
      locali = AuG.dQS();
      AppMethodBeat.o(72877);
    }
  }

  public static String dQT()
  {
    AppMethodBeat.i(72893);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("<deviceinfo>");
    ((StringBuilder)localObject).append("<MANUFACTURER name=\"");
    ((StringBuilder)localObject).append(Build.MANUFACTURER);
    ((StringBuilder)localObject).append("\">");
    ((StringBuilder)localObject).append("<MODEL name=\"");
    ((StringBuilder)localObject).append(Build.MODEL);
    ((StringBuilder)localObject).append("\">");
    ((StringBuilder)localObject).append("<VERSION_RELEASE name=\"");
    ((StringBuilder)localObject).append(Build.VERSION.RELEASE);
    ((StringBuilder)localObject).append("\">");
    ((StringBuilder)localObject).append("<VERSION_INCREMENTAL name=\"");
    ((StringBuilder)localObject).append(Build.VERSION.INCREMENTAL);
    ((StringBuilder)localObject).append("\">");
    ((StringBuilder)localObject).append("<DISPLAY name=\"");
    ((StringBuilder)localObject).append(Build.DISPLAY);
    ((StringBuilder)localObject).append("\">");
    ((StringBuilder)localObject).append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
    com.tencent.soter.core.c.d.d("Soter.SoterCore", "soter: getFingerprint  " + ((StringBuilder)localObject).toString(), new Object[0]);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(72893);
    return localObject;
  }

  public static SoterSessionResult iC(String paramString1, String paramString2)
  {
    AppMethodBeat.i(72884);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: initSigh IMPL is null, not support soter", new Object[0]);
      paramString1 = null;
      AppMethodBeat.o(72884);
    }
    while (true)
    {
      return paramString1;
      paramString1 = AuG.iC(paramString1, paramString2);
      AppMethodBeat.o(72884);
    }
  }

  public static void iO(Context paramContext)
  {
    AppMethodBeat.i(72868);
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.i("Soter.SoterCore", "soter: SoterCore IMPL is null then call tryToInitSoterTreble to init", new Object[0]);
      com.tencent.soter.core.d.d locald = new com.tencent.soter.core.d.d();
      AuG = locald;
      if (!locald.iV(paramContext))
      {
        AuG = null;
        com.tencent.soter.core.c.d.i("Soter.SoterCore", "soter: SoterCore IMPL is null after call tryToInitSoterTreble to init", new Object[0]);
      }
    }
    AppMethodBeat.o(72868);
  }

  public static boolean iP(Context paramContext)
  {
    AppMethodBeat.i(72887);
    boolean bool = com.tencent.soter.core.a.a.iU(paramContext).isHardwareDetected();
    com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: isSupportFingerprint return[" + bool + "]", new Object[0]);
    AppMethodBeat.o(72887);
    return bool;
  }

  public static boolean iQ(Context paramContext)
  {
    AppMethodBeat.i(72888);
    boolean bool = BiometricManagerCompat.from(paramContext, Integer.valueOf(2)).isHardwareDetected();
    com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: isSupportBiometric type[2] return[" + bool + "]", new Object[0]);
    AppMethodBeat.o(72888);
    return bool;
  }

  public static boolean iR(Context paramContext)
  {
    AppMethodBeat.i(72889);
    boolean bool = com.tencent.soter.core.a.a.iU(paramContext).hasEnrolledFingerprints();
    AppMethodBeat.o(72889);
    return bool;
  }

  public static boolean iS(Context paramContext)
  {
    AppMethodBeat.i(72890);
    boolean bool = BiometricManagerCompat.from(paramContext, Integer.valueOf(2)).hasEnrolledBiometric();
    AppMethodBeat.o(72890);
    return bool;
  }

  public static boolean iT(Context paramContext)
  {
    AppMethodBeat.i(72891);
    boolean bool;
    if ((!com.tencent.soter.core.a.c.isCurrentFailTimeAvailable(paramContext)) && (!com.tencent.soter.core.a.c.isCurrentTweenTimeAvailable(paramContext)))
    {
      bool = true;
      AppMethodBeat.o(72891);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72891);
    }
  }

  public static byte[] nB(long paramLong)
  {
    AppMethodBeat.i(72885);
    byte[] arrayOfByte;
    if (AuG == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCore", "soter: finishSign IMPL is null, not support soter", new Object[0]);
      arrayOfByte = new byte[0];
      AppMethodBeat.o(72885);
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = AuG.nB(paramLong);
      AppMethodBeat.o(72885);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.a
 * JD-Core Version:    0.6.2
 */