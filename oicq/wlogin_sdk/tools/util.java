package oicq.wlogin_sdk.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.security.Key;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import oicq.wlogin_sdk.request.i;

public class util
{
  public static int BWa = 65535;
  public static int BWb = 128;
  public static int BWc = 0;
  public static int BWd = 1;
  public static int BWe = 2;
  public static int BWf = 3;
  public static int BWg = 4;
  public static int BWh = 5;
  public static int BWi = 6;
  public static int BWj = 7;
  public static int BWk = 8;
  public static int BWl = 9;
  public static int BWm = 10;
  public static int BWn = 11;
  public static int BWo = 12;
  public static int BWp = 13;
  public static int BWq = 14;
  public static int BWr = 1;
  public static b BWs = null;
  public static boolean BWt = false;
  public static int BWu = 5;

  public static void M(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(byte)(paramInt2 >> 0));
  }

  public static void N(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(paramInt2 >> 0));
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(byte)(paramInt2 >> 8));
  }

  public static void O(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(byte)(paramInt2 >> 0));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(byte)(paramInt2 >> 24));
  }

  public static Key RSAPrivKeyFromJNI(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96551);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(96551);
    }
    while (true)
    {
      return paramArrayOfByte;
      byte[] arrayOfByte1 = new byte[26];
      arrayOfByte1[0] = ((byte)48);
      arrayOfByte1[1] = ((byte)-126);
      arrayOfByte1[2] = ((byte)2);
      arrayOfByte1[3] = ((byte)117);
      arrayOfByte1[4] = ((byte)2);
      arrayOfByte1[5] = ((byte)1);
      arrayOfByte1[7] = ((byte)48);
      arrayOfByte1[8] = ((byte)13);
      arrayOfByte1[9] = ((byte)6);
      arrayOfByte1[10] = ((byte)9);
      arrayOfByte1[11] = ((byte)42);
      arrayOfByte1[12] = ((byte)-122);
      arrayOfByte1[13] = ((byte)72);
      arrayOfByte1[14] = ((byte)-122);
      arrayOfByte1[15] = ((byte)-9);
      arrayOfByte1[16] = ((byte)13);
      arrayOfByte1[17] = ((byte)1);
      arrayOfByte1[18] = ((byte)1);
      arrayOfByte1[19] = ((byte)1);
      arrayOfByte1[20] = ((byte)5);
      arrayOfByte1[22] = ((byte)4);
      arrayOfByte1[23] = ((byte)-126);
      arrayOfByte1[24] = ((byte)2);
      arrayOfByte1[25] = ((byte)95);
      int i = paramArrayOfByte.length - 607;
      arrayOfByte1[3] = ((byte)(byte)(arrayOfByte1[3] + i));
      arrayOfByte1[25] = ((byte)(byte)(i + arrayOfByte1[25]));
      byte[] arrayOfByte2 = new byte[paramArrayOfByte.length + 26];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 26);
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, 26, paramArrayOfByte.length);
      try
      {
        paramArrayOfByte = new java/security/spec/PKCS8EncodedKeySpec;
        paramArrayOfByte.<init>(arrayOfByte2);
        paramArrayOfByte = KeyFactory.getInstance("RSA").generatePrivate(paramArrayOfByte);
        AppMethodBeat.o(96551);
      }
      catch (Exception paramArrayOfByte)
      {
        l(paramArrayOfByte);
        paramArrayOfByte = null;
        AppMethodBeat.o(96551);
      }
    }
  }

  public static Key RSAPubKeyFromJNI(byte[] paramArrayOfByte)
  {
    int i = 1;
    AppMethodBeat.i(96550);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(96550);
    }
    while (true)
    {
      return paramArrayOfByte;
      byte[] arrayOfByte1 = new byte[22];
      arrayOfByte1[0] = ((byte)48);
      arrayOfByte1[1] = ((byte)-127);
      arrayOfByte1[2] = ((byte)-97);
      arrayOfByte1[3] = ((byte)48);
      arrayOfByte1[4] = ((byte)13);
      arrayOfByte1[5] = ((byte)6);
      arrayOfByte1[6] = ((byte)9);
      arrayOfByte1[7] = ((byte)42);
      arrayOfByte1[8] = ((byte)-122);
      arrayOfByte1[9] = ((byte)72);
      arrayOfByte1[10] = ((byte)-122);
      arrayOfByte1[11] = ((byte)-9);
      arrayOfByte1[12] = ((byte)13);
      arrayOfByte1[13] = ((byte)1);
      arrayOfByte1[14] = ((byte)1);
      arrayOfByte1[15] = ((byte)1);
      arrayOfByte1[16] = ((byte)5);
      arrayOfByte1[18] = ((byte)3);
      arrayOfByte1[19] = ((byte)-127);
      arrayOfByte1[20] = ((byte)-115);
      byte[] arrayOfByte2 = new byte[paramArrayOfByte.length + 22];
      int j = i;
      if (paramArrayOfByte.length >= 22)
      {
        j = 0;
        label175: if (j >= 22)
          j = i;
      }
      else
      {
        label185: if (j == 0)
          break label240;
        paramArrayOfByte = new X509EncodedKeySpec(paramArrayOfByte);
      }
      try
      {
        paramArrayOfByte = KeyFactory.getInstance("RSA").generatePublic(paramArrayOfByte);
        AppMethodBeat.o(96550);
        continue;
        if (arrayOfByte1[j] != paramArrayOfByte[j])
        {
          j = 0;
          break label185;
        }
        j++;
        break label175;
        label240: System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 22);
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, 22, paramArrayOfByte.length);
        paramArrayOfByte = arrayOfByte2;
      }
      catch (Exception paramArrayOfByte)
      {
        l(paramArrayOfByte);
        paramArrayOfByte = null;
        AppMethodBeat.o(96550);
      }
    }
  }

  public static void a(Context paramContext, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96535);
    byte[] arrayOfByte = jP(paramContext);
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      paramContext = paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
      paramContext.putString("ksid", cO(paramArrayOfByte));
      paramContext.commit();
    }
    AppMethodBeat.o(96535);
  }

  public static void aF(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(96532);
    paramContext = paramContext.getSharedPreferences("WLOGIN_SERVER_INFO", 0).edit();
    paramContext.putInt("network_type", paramInt);
    paramContext.commit();
    AppMethodBeat.o(96532);
  }

  public static int ae(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF;
  }

  public static int af(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] << 8 & 0xFF00) + (paramArrayOfByte[(paramInt + 1)] << 0 & 0xFF);
  }

  public static int ag(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] << 24 & 0xFF000000) + (paramArrayOfByte[(paramInt + 1)] << 16 & 0xFF0000) + (paramArrayOfByte[(paramInt + 2)] << 8 & 0xFF00) + (paramArrayOfByte[(paramInt + 3)] << 0 & 0xFF);
  }

  public static void anG(String paramString)
  {
    AppMethodBeat.i(96544);
    try
    {
      if (BWr >= 2)
      {
        if (BWs != null)
        {
          BWs.t(2, paramString);
          AppMethodBeat.o(96544);
        }
        while (true)
        {
          return;
          if (!BWt)
            break;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("wlogin_sdk");
          paramString.append(emQ());
          AppMethodBeat.o(96544);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(96544);
    }
  }

  private static byte[] awE(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(96525);
    if (paramString == null)
    {
      paramString = new byte[0];
      AppMethodBeat.o(96525);
      return paramString;
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    while (true)
    {
      if (i >= paramString.length() / 2)
      {
        AppMethodBeat.o(96525);
        paramString = arrayOfByte;
        break;
      }
      arrayOfByte[i] = ((byte)(byte)((d((byte)paramString.charAt(i * 2)) << 4) + d((byte)paramString.charAt(i * 2 + 1))));
      i++;
    }
  }

  public static void awF(String paramString)
  {
    AppMethodBeat.i(96543);
    try
    {
      if (BWr > 0)
      {
        if (BWs != null)
        {
          BWs.t(1, paramString);
          AppMethodBeat.o(96543);
        }
        while (true)
        {
          return;
          if (!BWt)
            break;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("wlogin_sdk");
          paramString.append(emQ());
          AppMethodBeat.o(96543);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(96543);
    }
  }

  public static void b(Context paramContext, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96537);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramContext = paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
      paramContext.putString("imei", cO(paramArrayOfByte));
      paramContext.commit();
    }
    AppMethodBeat.o(96537);
  }

  public static void c(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    paramArrayOfByte[(paramInt + 7)] = ((byte)(byte)(int)(paramLong >> 0));
    paramArrayOfByte[(paramInt + 6)] = ((byte)(byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 5)] = ((byte)(byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 4)] = ((byte)(byte)(int)(paramLong >> 24));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(byte)(int)(paramLong >> 32));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(byte)(int)(paramLong >> 40));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(byte)(int)(paramLong >> 48));
    paramArrayOfByte[(paramInt + 0)] = ((byte)(byte)(int)(paramLong >> 56));
  }

  public static byte[] cN(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96522);
    byte[] arrayOfByte1 = SecureRandom.getSeed(16);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramArrayOfByte.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, arrayOfByte1.length, paramArrayOfByte.length);
    paramArrayOfByte = c.cM(arrayOfByte2);
    AppMethodBeat.o(96522);
    return paramArrayOfByte;
  }

  public static String cO(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96524);
    if (paramArrayOfByte == null)
    {
      str = "";
      AppMethodBeat.o(96524);
      return str;
    }
    String str = "";
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfByte.length)
      {
        AppMethodBeat.o(96524);
        break;
      }
      str = new StringBuilder(String.valueOf(str)).append(Integer.toHexString(paramArrayOfByte[i] >> 4 & 0xF)).toString() + Integer.toHexString(paramArrayOfByte[i] & 0xF);
    }
  }

  public static long cP(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    for (long l = 0L; ; l = paramArrayOfByte.length)
      return l;
  }

  public static byte[] cl(Context paramContext, String paramString)
  {
    AppMethodBeat.i(96540);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0).versionName.getBytes();
      AppMethodBeat.o(96540);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = new byte[0];
        AppMethodBeat.o(96540);
      }
    }
  }

  public static byte[] cm(Context paramContext, String paramString)
  {
    AppMethodBeat.i(96541);
    try
    {
      paramString = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      if ((paramString.signatures != null) && (paramString.signatures.length > 0))
      {
        paramContext = paramString.signatures[0];
        if (paramContext != null);
      }
      else
      {
        paramContext = null;
        AppMethodBeat.o(96541);
      }
      while (true)
      {
        return paramContext;
        paramContext = c.cM(paramString.signatures[0].toByteArray());
        AppMethodBeat.o(96541);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        paramContext = new byte[0];
        AppMethodBeat.o(96541);
      }
    }
  }

  private static byte d(byte paramByte)
  {
    byte b;
    if ((paramByte >= 48) && (paramByte <= 57))
    {
      paramByte = (byte)(paramByte - 48);
      b = paramByte;
    }
    while (true)
    {
      return b;
      if ((paramByte >= 97) && (paramByte <= 102))
      {
        paramByte = (byte)(paramByte - 97 + 10);
        b = paramByte;
      }
      else if ((paramByte >= 65) && (paramByte <= 70))
      {
        paramByte = (byte)(paramByte - 65 + 10);
        b = paramByte;
      }
      else
      {
        paramByte = 0;
        b = paramByte;
      }
    }
  }

  public static void d(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    paramArrayOfByte[(paramInt + 3)] = ((byte)(byte)(int)(paramLong >> 0));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 0)] = ((byte)(byte)(int)(paramLong >> 24));
  }

  public static byte[] emL()
  {
    AppMethodBeat.i(96518);
    byte[] arrayOfByte = new String("android").getBytes();
    AppMethodBeat.o(96518);
    return arrayOfByte;
  }

  public static byte[] emM()
  {
    AppMethodBeat.i(96519);
    byte[] arrayOfByte = Build.VERSION.RELEASE.getBytes();
    AppMethodBeat.o(96519);
    return arrayOfByte;
  }

  public static int emN()
  {
    AppMethodBeat.i(96520);
    int i = (int)(Math.random() * 2147483647.0D);
    AppMethodBeat.o(96520);
    return i;
  }

  public static byte[] emO()
  {
    AppMethodBeat.i(96521);
    byte[] arrayOfByte = SecureRandom.getSeed(16);
    AppMethodBeat.o(96521);
    return arrayOfByte;
  }

  public static long emP()
  {
    AppMethodBeat.i(96523);
    long l = i.emE();
    AppMethodBeat.o(96523);
    return l;
  }

  private static String emQ()
  {
    AppMethodBeat.i(96542);
    try
    {
      Object localObject = new java/lang/Throwable;
      ((Throwable)localObject).<init>();
      StackTraceElement localStackTraceElement = localObject.getStackTrace()[2];
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("[");
      localObject = localStackTraceElement.getFileName() + ":" + localStackTraceElement.getLineNumber() + "]";
      AppMethodBeat.o(96542);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = "";
        AppMethodBeat.o(96542);
      }
    }
  }

  public static String emR()
  {
    AppMethodBeat.i(96549);
    String str = new String("2014/02/28 14:20");
    AppMethodBeat.o(96549);
    return str;
  }

  public static boolean isFileExist(String paramString)
  {
    AppMethodBeat.i(96548);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      bool = localFile.exists();
      AppMethodBeat.o(96548);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(96548);
      }
    }
  }

  public static byte[] jH(Context paramContext)
  {
    AppMethodBeat.i(96526);
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext != null)
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext != null)
      {
        paramContext = paramContext.getMacAddress();
        if (paramContext != null)
        {
          paramContext = paramContext.getBytes();
          AppMethodBeat.o(96526);
        }
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = new byte[0];
      AppMethodBeat.o(96526);
    }
  }

  public static byte[] jI(Context paramContext)
  {
    AppMethodBeat.i(96527);
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    if (paramContext != null)
    {
      paramContext = paramContext.getDeviceId();
      if (paramContext != null)
      {
        paramContext = paramContext.getBytes();
        AppMethodBeat.o(96527);
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = new byte[0];
      AppMethodBeat.o(96527);
    }
  }

  public static byte[] jJ(Context paramContext)
  {
    Object localObject1 = null;
    AppMethodBeat.i(96528);
    Object localObject2 = (TelephonyManager)paramContext.getSystemService("phone");
    if (localObject2 != null);
    for (localObject2 = ((TelephonyManager)localObject2).getDeviceId(); ; localObject2 = null)
    {
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      Object localObject3 = localObject1;
      if (paramContext != null)
      {
        paramContext = paramContext.getConnectionInfo();
        localObject3 = localObject1;
        if (paramContext != null)
          localObject3 = paramContext.getMacAddress();
      }
      paramContext = "";
      if (localObject2 != null)
        paramContext = "" + (String)localObject2;
      localObject2 = paramContext;
      if (localObject3 != null)
        localObject2 = paramContext + (String)localObject3;
      if (((String)localObject2).length() <= 0)
      {
        paramContext = new byte[0];
        AppMethodBeat.o(96528);
      }
      while (true)
      {
        return paramContext;
        paramContext = c.cM(((String)localObject2).getBytes());
        AppMethodBeat.o(96528);
      }
    }
  }

  public static byte[] jK(Context paramContext)
  {
    AppMethodBeat.i(96529);
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext.getSimState() == 5)
      {
        paramContext = paramContext.getSimOperatorName().getBytes();
        AppMethodBeat.o(96529);
      }
      while (true)
      {
        return paramContext;
        paramContext = new byte[0];
        AppMethodBeat.o(96529);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        paramContext = new byte[0];
        AppMethodBeat.o(96529);
      }
    }
  }

  public static int jL(Context paramContext)
  {
    AppMethodBeat.i(96530);
    try
    {
      i = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getType();
      if (i == 0)
      {
        AppMethodBeat.o(96530);
        i = 1;
        return i;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        int i = 0;
        continue;
        if (i == 1)
        {
          i = 2;
          AppMethodBeat.o(96530);
        }
        else
        {
          AppMethodBeat.o(96530);
          i = 0;
        }
      }
    }
  }

  public static int jM(Context paramContext)
  {
    AppMethodBeat.i(96531);
    int i = paramContext.getSharedPreferences("WLOGIN_SERVER_INFO", 0).getInt("network_type", 0);
    AppMethodBeat.o(96531);
    return i;
  }

  public static void jN(Context paramContext)
  {
    AppMethodBeat.i(96533);
    paramContext = paramContext.getSharedPreferences("WLOGIN_NET_RETRY_TYPE", 0).edit();
    paramContext.putInt("type", 0);
    paramContext.commit();
    AppMethodBeat.o(96533);
  }

  public static String jO(Context paramContext)
  {
    AppMethodBeat.i(96534);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext.getType() == 0)
      {
        paramContext = paramContext.getExtraInfo();
        if (paramContext != null)
          AppMethodBeat.o(96534);
      }
      else
      {
        while (true)
        {
          return paramContext;
          paramContext = "wifi";
          AppMethodBeat.o(96534);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = "wifi";
        AppMethodBeat.o(96534);
      }
    }
  }

  public static byte[] jP(Context paramContext)
  {
    AppMethodBeat.i(96536);
    byte[] arrayOfByte = new String("").getBytes();
    try
    {
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0);
      paramContext = new java/lang/String;
      paramContext.<init>("");
      paramContext = awE(localSharedPreferences.getString("ksid", paramContext));
      if ((paramContext == null) || (paramContext.length <= 0))
      {
        anG("get_ksid:null");
        AppMethodBeat.o(96536);
        return paramContext;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        paramContext = new StringWriter();
        PrintWriter localPrintWriter = new PrintWriter(paramContext, true);
        localException.printStackTrace(localPrintWriter);
        localPrintWriter.flush();
        paramContext.flush();
        ji("exception", paramContext.toString());
        paramContext = arrayOfByte;
        continue;
        anG("get_ksid:" + cO(paramContext));
      }
    }
  }

  public static byte[] jQ(Context paramContext)
  {
    AppMethodBeat.i(96538);
    byte[] arrayOfByte = new byte[0];
    try
    {
      paramContext = paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0);
      localObject = new java/lang/String;
      ((String)localObject).<init>("");
      paramContext = awE(paramContext.getString("imei", (String)localObject));
      if (paramContext.length <= 0)
      {
        paramContext = new byte[0];
        AppMethodBeat.o(96538);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        Object localObject = new StringWriter();
        PrintWriter localPrintWriter = new PrintWriter((Writer)localObject, true);
        paramContext.printStackTrace(localPrintWriter);
        localPrintWriter.flush();
        ((StringWriter)localObject).flush();
        ji("exception", ((StringWriter)localObject).toString());
        paramContext = arrayOfByte;
        continue;
        anG("get_imei:" + cO(paramContext));
      }
    }
  }

  public static byte[] jR(Context paramContext)
  {
    AppMethodBeat.i(96539);
    paramContext = paramContext.getPackageName().getBytes();
    AppMethodBeat.o(96539);
    return paramContext;
  }

  public static void jh(String paramString1, String paramString2)
  {
    AppMethodBeat.i(96545);
    try
    {
      if (BWr >= 2)
      {
        if (BWs != null)
        {
          BWs.OnLog(2, paramString1, paramString2);
          AppMethodBeat.o(96545);
        }
        while (true)
        {
          return;
          if (!BWt)
            break;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("wlogin_sdk");
          localStringBuilder.append(emQ());
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(String.valueOf(paramString1));
          localStringBuilder.append(":").append(paramString2);
          AppMethodBeat.o(96545);
        }
      }
    }
    catch (Exception paramString1)
    {
      while (true)
        AppMethodBeat.o(96545);
    }
  }

  public static void ji(String paramString1, String paramString2)
  {
    AppMethodBeat.i(96546);
    try
    {
      if (BWr >= 0)
      {
        if (BWs != null)
        {
          BWs.OnLog(0, paramString1, paramString2);
          AppMethodBeat.o(96546);
        }
        while (true)
        {
          return;
          if (!BWt)
            break;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("wlogin_sdk");
          localStringBuilder.append(emQ());
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(String.valueOf(paramString1));
          localStringBuilder.append(":").append(paramString2);
          AppMethodBeat.o(96546);
        }
      }
    }
    catch (Exception paramString1)
    {
      while (true)
        AppMethodBeat.o(96546);
    }
  }

  public static void l(Exception paramException)
  {
    AppMethodBeat.i(96547);
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
    paramException.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    localStringWriter.flush();
    ji("exception:", localStringWriter.toString());
    AppMethodBeat.o(96547);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.tools.util
 * JD-Core Version:    0.6.2
 */