package com.tenpay.ndk;

import android.content.Context;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.security.MessageDigest;

public class CertUtil
{
  public static final String TAG;
  private static CertUtil instance;
  private String cert_dir;
  private String cert_id = null;
  private byte[] certid_buf = null;
  private byte[] cipher_buf = null;
  private byte[] csr_buf = null;
  private String deskey = null;
  private String iccid = null;
  private String imei = null;
  private String imsi = null;
  private String login_ip = null;
  private Context mContext = null;
  private String mac = null;
  private String plain_buf = null;
  private byte[] plain_buf2 = null;
  private String priv_dir;
  private String publ_dir;
  private String qq_id = null;
  private byte[] sig_buf = null;
  private String sig_raw_buf = null;
  private String sm4Key = null;
  private String softid = null;
  private String svr_cert = null;
  private String token = null;
  private byte[] token_buf = null;
  private String token_dir;
  private int token_len = 0;
  private int useSM4 = 0;

  static
  {
    AppMethodBeat.i(49565);
    TAG = CertUtil.class.getSimpleName();
    instance = null;
    AppMethodBeat.o(49565);
  }

  private void checkDir(String paramString)
  {
    AppMethodBeat.i(49544);
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      paramString.mkdirs();
      AppMethodBeat.o(49544);
    }
    while (true)
    {
      return;
      if (!paramString.isDirectory())
      {
        paramString.delete();
        paramString.mkdirs();
      }
      AppMethodBeat.o(49544);
    }
  }

  private boolean create_dir(String paramString)
  {
    AppMethodBeat.i(49545);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      if (!localFile.exists())
      {
        boolean bool1 = localFile.mkdirs();
        bool2 = bool1;
        if (bool1);
      }
      while (true)
      {
        AppMethodBeat.o(49545);
        return bool2;
        bool2 = true;
      }
    }
    catch (Exception paramString)
    {
      while (true)
        boolean bool2 = false;
    }
  }

  private boolean del_all_files(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(49546);
    File localFile = new File(paramString);
    if (!localFile.exists())
      AppMethodBeat.o(49546);
    while (true)
    {
      return bool;
      if (localFile.isDirectory())
        break;
      AppMethodBeat.o(49546);
    }
    String[] arrayOfString = localFile.list();
    int i = 0;
    bool = false;
    label56: if (i < arrayOfString.length)
      if (paramString.endsWith(File.separator))
      {
        localFile = new File(paramString + arrayOfString[i]);
        label104: if (!localFile.isFile())
          break label161;
        localFile.delete();
      }
    while (true)
    {
      i++;
      break label56;
      localFile = new File(paramString + File.separator + arrayOfString[i]);
      break label104;
      label161: if (localFile.isDirectory())
      {
        del_all_files(paramString + File.separator + arrayOfString[i]);
        del_dir(paramString + File.separator + arrayOfString[i], true);
        bool = true;
        continue;
        AppMethodBeat.o(49546);
        break;
      }
    }
  }

  private void del_dir(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(49547);
    try
    {
      del_all_files(paramString);
      if (paramBoolean)
      {
        String str = paramString.toString();
        paramString = new java/io/File;
        paramString.<init>(str);
        paramString.delete();
      }
      AppMethodBeat.o(49547);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(49547);
    }
  }

  private native boolean encrypt();

  private native boolean genCertApplyCsr();

  private native boolean genCertApplyCsrNew(int paramInt);

  private native boolean genQrcode();

  private String getCertDir()
  {
    AppMethodBeat.i(49541);
    String str = this.mContext.getFilesDir().getParentFile().getAbsolutePath() + "/cert";
    AppMethodBeat.o(49541);
    return str;
  }

  private native boolean getCertid();

  public static CertUtil getInstance()
  {
    AppMethodBeat.i(49539);
    if (instance == null);
    try
    {
      CertUtil localCertUtil = new com/tenpay/ndk/CertUtil;
      localCertUtil.<init>();
      instance = localCertUtil;
      localCertUtil = instance;
      AppMethodBeat.o(49539);
      return localCertUtil;
    }
    finally
    {
      AppMethodBeat.o(49539);
    }
  }

  private native boolean getToken();

  private native int getTokenCount();

  private String hexdigest(String paramString)
  {
    AppMethodBeat.i(49550);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(49550);
    }
    while (true)
    {
      return paramString;
      char[] arrayOfChar = new char[16];
      char[] tmp25_24 = arrayOfChar;
      tmp25_24[0] = 48;
      char[] tmp30_25 = tmp25_24;
      tmp30_25[1] = 49;
      char[] tmp35_30 = tmp30_25;
      tmp35_30[2] = 50;
      char[] tmp40_35 = tmp35_30;
      tmp40_35[3] = 51;
      char[] tmp45_40 = tmp40_35;
      tmp45_40[4] = 52;
      char[] tmp50_45 = tmp45_40;
      tmp50_45[5] = 53;
      char[] tmp55_50 = tmp50_45;
      tmp55_50[6] = 54;
      char[] tmp61_55 = tmp55_50;
      tmp61_55[7] = 55;
      char[] tmp67_61 = tmp61_55;
      tmp67_61[8] = 56;
      char[] tmp73_67 = tmp67_61;
      tmp73_67[9] = 57;
      char[] tmp79_73 = tmp73_67;
      tmp79_73[10] = 65;
      char[] tmp85_79 = tmp79_73;
      tmp85_79[11] = 66;
      char[] tmp91_85 = tmp85_79;
      tmp91_85[12] = 67;
      char[] tmp97_91 = tmp91_85;
      tmp97_91[13] = 68;
      char[] tmp103_97 = tmp97_91;
      tmp103_97[14] = 69;
      char[] tmp109_103 = tmp103_97;
      tmp109_103[15] = 70;
      tmp109_103;
      try
      {
        Object localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString.getBytes());
        paramString = ((MessageDigest)localObject).digest();
        localObject = new char[32];
        int i = 0;
        int m;
        for (int j = 0; i < 16; j = m + 1)
        {
          int k = paramString[i];
          m = j + 1;
          localObject[j] = ((char)arrayOfChar[(k >>> 4 & 0xF)]);
          localObject[m] = ((char)arrayOfChar[(k & 0xF)]);
          i++;
        }
        paramString = new java/lang/String;
        paramString.<init>((char[])localObject);
        AppMethodBeat.o(49550);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = null;
      }
    }
  }

  private native boolean importCert();

  private native boolean isCertExist();

  private boolean isNotEmptyDir(String paramString)
  {
    AppMethodBeat.i(49548);
    boolean bool = true;
    paramString = new File(paramString);
    if ((!paramString.exists()) || (!paramString.isDirectory()) || (paramString.listFiles() == null))
      bool = false;
    AppMethodBeat.o(49548);
    return bool;
  }

  private boolean isNullOrEmpty(String paramString)
  {
    AppMethodBeat.i(49551);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = true;
      AppMethodBeat.o(49551);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49551);
    }
  }

  private boolean isValidDir(String paramString)
  {
    AppMethodBeat.i(49549);
    boolean bool = true;
    paramString = new File(paramString);
    if ((!paramString.exists()) || (!paramString.isDirectory()))
      bool = false;
    AppMethodBeat.o(49549);
    return bool;
  }

  private void setAndCheckDir(String paramString)
  {
    AppMethodBeat.i(49542);
    String str = getCertDir();
    paramString = str + "/" + hexdigest(new StringBuilder().append(paramString).append(this.imei).toString());
    this.cert_dir = (paramString + "/cert");
    this.priv_dir = (paramString + "/priv");
    this.publ_dir = (paramString + "/publ");
    this.token_dir = (paramString + "/auth");
    checkDir(str);
    checkDir(this.token_dir);
    AppMethodBeat.o(49542);
  }

  private void setDir(String paramString)
  {
    AppMethodBeat.i(49543);
    paramString = getCertDir() + "/" + hexdigest(new StringBuilder().append(paramString).append(this.imei).toString());
    this.cert_dir = (paramString + "/cert");
    this.priv_dir = (paramString + "/priv");
    this.publ_dir = (paramString + "/publ");
    this.token_dir = (paramString + "/auth");
    AppMethodBeat.o(49543);
  }

  private native boolean setToken();

  private native boolean usrSig();

  public void clearAllCert()
  {
    try
    {
      AppMethodBeat.i(49556);
      del_dir(getCertDir(), true);
      AppMethodBeat.o(49556);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void clearCert(String paramString)
  {
    try
    {
      AppMethodBeat.i(49557);
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      localStringBuilder1 = localStringBuilder1.append(getCertDir()).append("/");
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>();
      del_dir(hexdigest(localStringBuilder2.append(paramString).append(this.imei).toString()), true);
      AppMethodBeat.o(49557);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public void clearToken(String paramString)
  {
    try
    {
      AppMethodBeat.i(49563);
      if (isNullOrEmpty(paramString))
        AppMethodBeat.o(49563);
      while (true)
      {
        return;
        setDir(paramString);
        del_dir(this.token_dir, true);
        AppMethodBeat.o(49563);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public String encrypt(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    while (true)
    {
      try
      {
        AppMethodBeat.i(49558);
        if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2)))
        {
          AppMethodBeat.o(49558);
          paramString1 = localObject2;
          return paramString1;
        }
        setAndCheckDir(paramString1);
        if ((!isNotEmptyDir(this.cert_dir)) || (!isNotEmptyDir(this.publ_dir)) || (!isNotEmptyDir(this.priv_dir)))
        {
          AppMethodBeat.o(49558);
          paramString1 = localObject2;
          continue;
        }
      }
      finally
      {
      }
      this.cert_id = paramString1;
      this.plain_buf = paramString2;
      this.cipher_buf = null;
      paramString1 = localObject1;
      if (encrypt())
      {
        paramString2 = this.cipher_buf;
        paramString1 = localObject1;
        if (paramString2 == null);
      }
      try
      {
        paramString1 = new java/lang/String;
        paramString1.<init>(this.cipher_buf, "UTF-8");
        AppMethodBeat.o(49558);
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(49558);
        paramString1 = localObject2;
      }
    }
  }

  public byte[] genQrcode(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    while (true)
    {
      try
      {
        AppMethodBeat.i(49560);
        if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2)) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
        {
          AppMethodBeat.o(49560);
          paramString1 = localObject2;
          return paramString1;
        }
        setAndCheckDir(paramString1);
        if ((!isNotEmptyDir(this.cert_dir)) || (!isNotEmptyDir(this.publ_dir)) || (!isNotEmptyDir(this.priv_dir)))
        {
          AppMethodBeat.o(49560);
          paramString1 = localObject2;
          continue;
        }
      }
      finally
      {
      }
      this.cert_id = paramString1;
      this.plain_buf2 = paramArrayOfByte;
      this.cipher_buf = null;
      this.token = paramString2;
      paramString1 = localObject1;
      if (genQrcode())
      {
        paramArrayOfByte = this.cipher_buf;
        paramString1 = localObject1;
        if (paramArrayOfByte == null);
      }
      try
      {
        paramString1 = this.cipher_buf;
        AppMethodBeat.o(49560);
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(49560);
        paramString1 = localObject2;
      }
    }
  }

  public String genUserSig(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    while (true)
    {
      try
      {
        AppMethodBeat.i(49559);
        if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2)))
        {
          AppMethodBeat.o(49559);
          paramString1 = localObject2;
          return paramString1;
        }
        setAndCheckDir(paramString1);
        if ((!isNotEmptyDir(this.cert_dir)) || (!isNotEmptyDir(this.publ_dir)) || (!isNotEmptyDir(this.priv_dir)))
        {
          AppMethodBeat.o(49559);
          paramString1 = localObject2;
          continue;
        }
      }
      finally
      {
      }
      if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() <= 0) || (paramString2.length() <= 0))
      {
        AppMethodBeat.o(49559);
        paramString1 = localObject2;
      }
      else
      {
        this.cert_id = paramString1;
        this.sig_raw_buf = paramString2;
        this.sig_buf = null;
        paramString1 = localObject1;
        if (usrSig())
        {
          paramString2 = this.sig_buf;
          paramString1 = localObject1;
          if (paramString2 == null);
        }
        try
        {
          paramString1 = new java/lang/String;
          paramString1.<init>(this.sig_buf, "UTF-8");
          AppMethodBeat.o(49559);
        }
        catch (Exception paramString1)
        {
          AppMethodBeat.o(49559);
          paramString1 = localObject2;
        }
      }
    }
  }

  public String getCertApplyCSR(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      AppMethodBeat.i(49552);
      this.qq_id = paramString;
      this.csr_buf = null;
      paramString = localObject2;
      if (genCertApplyCsr())
      {
        byte[] arrayOfByte = this.csr_buf;
        paramString = localObject2;
        if (arrayOfByte == null);
      }
      try
      {
        paramString = new java/lang/String;
        paramString.<init>(this.csr_buf, "ASCII");
        AppMethodBeat.o(49552);
        return paramString;
      }
      catch (Exception paramString)
      {
        while (true)
        {
          AppMethodBeat.o(49552);
          paramString = localObject1;
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public String getCertApplyCSR(String paramString, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      AppMethodBeat.i(49553);
      this.qq_id = paramString;
      this.csr_buf = null;
      paramString = localObject2;
      if (genCertApplyCsrNew(paramInt))
      {
        byte[] arrayOfByte = this.csr_buf;
        paramString = localObject2;
        if (arrayOfByte == null);
      }
      try
      {
        paramString = new java/lang/String;
        paramString.<init>(this.csr_buf, "ASCII");
        AppMethodBeat.o(49553);
        return paramString;
      }
      catch (Exception paramString)
      {
        while (true)
        {
          AppMethodBeat.o(49553);
          paramString = localObject1;
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public native int getLastError();

  public String getToken(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    while (true)
    {
      try
      {
        AppMethodBeat.i(49562);
        if (isNullOrEmpty(paramString))
        {
          AppMethodBeat.o(49562);
          paramString = localObject2;
          return paramString;
        }
        setAndCheckDir(paramString);
        if (!isNotEmptyDir(this.token_dir))
        {
          AppMethodBeat.o(49562);
          paramString = localObject2;
          continue;
        }
      }
      finally
      {
      }
      this.cert_id = paramString;
      paramString = localObject1;
      if (getToken())
      {
        byte[] arrayOfByte = this.token_buf;
        paramString = localObject1;
        if (arrayOfByte == null);
      }
      try
      {
        paramString = new java/lang/String;
        paramString.<init>(this.token_buf, "UTF-8");
        AppMethodBeat.o(49562);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49562);
        paramString = localObject2;
      }
    }
  }

  public int getTokenCount(String paramString)
  {
    try
    {
      AppMethodBeat.i(49564);
      int i;
      if (isNullOrEmpty(paramString))
      {
        i = 0;
        AppMethodBeat.o(49564);
      }
      while (true)
      {
        return i;
        setDir(paramString);
        this.cert_id = paramString;
        i = getTokenCount();
        AppMethodBeat.o(49564);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  // ERROR //
  public boolean importCert(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 335
    //   5: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_2
    //   9: invokevirtual 254	java/lang/String:length	()I
    //   12: ifgt +15 -> 27
    //   15: iconst_0
    //   16: istore_3
    //   17: ldc_w 335
    //   20: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_3
    //   26: ireturn
    //   27: new 146	java/lang/String
    //   30: astore 4
    //   32: aload 4
    //   34: aload_2
    //   35: invokevirtual 231	java/lang/String:getBytes	()[B
    //   38: ldc_w 321
    //   41: invokespecial 307	java/lang/String:<init>	([BLjava/lang/String;)V
    //   44: aload_0
    //   45: aload 4
    //   47: putfield 70	com/tenpay/ndk/CertUtil:svr_cert	Ljava/lang/String;
    //   50: aload_0
    //   51: aload_1
    //   52: invokevirtual 337	com/tenpay/ndk/CertUtil:clearCert	(Ljava/lang/String;)V
    //   55: aload_0
    //   56: aload_1
    //   57: invokespecial 298	com/tenpay/ndk/CertUtil:setAndCheckDir	(Ljava/lang/String;)V
    //   60: aload_0
    //   61: aload_0
    //   62: getfield 266	com/tenpay/ndk/CertUtil:cert_dir	Ljava/lang/String;
    //   65: invokespecial 339	com/tenpay/ndk/CertUtil:create_dir	(Ljava/lang/String;)Z
    //   68: pop
    //   69: aload_0
    //   70: aload_0
    //   71: getfield 270	com/tenpay/ndk/CertUtil:priv_dir	Ljava/lang/String;
    //   74: invokespecial 339	com/tenpay/ndk/CertUtil:create_dir	(Ljava/lang/String;)Z
    //   77: pop
    //   78: aload_0
    //   79: aload_0
    //   80: getfield 274	com/tenpay/ndk/CertUtil:publ_dir	Ljava/lang/String;
    //   83: invokespecial 339	com/tenpay/ndk/CertUtil:create_dir	(Ljava/lang/String;)Z
    //   86: pop
    //   87: aload_0
    //   88: invokespecial 341	com/tenpay/ndk/CertUtil:importCert	()Z
    //   91: istore_3
    //   92: ldc_w 335
    //   95: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: goto -75 -> 23
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: astore_2
    //   107: goto -57 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   2	15	101	finally
    //   17	23	101	finally
    //   27	50	101	finally
    //   50	98	101	finally
    //   27	50	106	java/lang/Exception
  }

  public void init(Context paramContext)
  {
    AppMethodBeat.i(49540);
    this.mContext = paramContext.getApplicationContext();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    try
    {
      this.imsi = localTelephonyManager.getSubscriberId();
      this.iccid = localTelephonyManager.getSimSerialNumber();
      this.imei = localTelephonyManager.getDeviceId();
      this.softid = Settings.System.getString(paramContext.getContentResolver(), "android_id");
      label63: this.deskey = this.imei;
      AppMethodBeat.o(49540);
      return;
    }
    catch (Exception paramContext)
    {
      break label63;
    }
  }

  public boolean isCertExist(String paramString)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(49555);
        if (isNullOrEmpty(paramString))
        {
          AppMethodBeat.o(49555);
          return bool;
        }
        setDir(paramString);
        if ((isNotEmptyDir(this.cert_dir)) && (isNotEmptyDir(this.publ_dir)) && (isNotEmptyDir(this.priv_dir)))
        {
          this.cert_id = paramString;
          bool = isCertExist();
          AppMethodBeat.o(49555);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(49555);
    }
  }

  public boolean setTokens(String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    int i = 0;
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(49561);
        if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2)))
        {
          AppMethodBeat.o(49561);
          paramBoolean = bool;
          return paramBoolean;
        }
        if ((paramBoolean) && (paramString3 != null) && (paramString3.length() != 16))
        {
          AppMethodBeat.o(49561);
          paramBoolean = bool;
          continue;
        }
      }
      finally
      {
      }
      setAndCheckDir(paramString1);
      if (!isValidDir(this.cert_dir))
      {
        AppMethodBeat.o(49561);
        paramBoolean = bool;
      }
      else if (!isValidDir(this.token_dir))
      {
        AppMethodBeat.o(49561);
        paramBoolean = bool;
      }
      else
      {
        if (paramBoolean)
          i = 1;
        this.useSM4 = i;
        this.sm4Key = paramString3;
        this.cert_id = paramString1;
        this.token = paramString2;
        this.token_len = this.token.length();
        paramBoolean = setToken();
        AppMethodBeat.o(49561);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tenpay.ndk.CertUtil
 * JD-Core Version:    0.6.2
 */