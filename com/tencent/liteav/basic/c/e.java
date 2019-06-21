package com.tencent.liteav.basic.c;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e
{
  private static e l;
  private Context a;
  private String b;
  private String c;
  private String d = "TXUgcSDK.licence";
  private String e = "tmp.licence";
  private String f = "YTFaceSDK.licence";
  private String g = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4teqkW/TUruU89ElNVd\nKrpSL+HCITruyb6BS9mW6M4mqmxDhazDmQgMKNfsA0d2kxFucCsXTyesFNajaisk\nrAzVJpNGO75bQFap4jYzJYskIuas6fgIS7zSmGXgRcp6i0ZBH3pkVCXcgfLfsVCO\n+sN01jFhFgOC0LY2f1pJ+3jqktAlMIxy8Q9t7XwwL5/n8/Sledp7TwuRdnl2OPl3\nycCTRkXtOIoRNB9vgd9XooTKiEdCXC7W9ryvtwCiAB82vEfHWXXgzhsPC13URuFy\n1JqbWJtTCCcfsCVxuBplhVJAQ7JsF5SMntdJDkp7rJLhprgsaim2CRjcVseNmw97\nbwIDAQAB";
  private String h;
  private String i;
  private String j;
  private boolean k = false;
  private boolean m = false;
  private int n = -1;

  private int a(f paramf)
  {
    int i1 = -10;
    AppMethodBeat.i(66103);
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      TXCLog.e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
      AppMethodBeat.o(66103);
    }
    while (true)
    {
      return i1;
      Object localObject = this.a.getExternalFilesDir(null);
      if (localObject == null)
      {
        TXCLog.e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
        AppMethodBeat.o(66103);
      }
      else
      {
        localObject = ((File)localObject).getAbsolutePath() + File.separator + this.d;
        if (!b((String)localObject))
        {
          i1 = -7;
          AppMethodBeat.o(66103);
        }
        else
        {
          localObject = com.tencent.liteav.basic.util.a.b((String)localObject);
          if (TextUtils.isEmpty((CharSequence)localObject))
          {
            TXCLog.e("LicenceCheck", "checkSdcardLicence, licenceSdcardStr is empty");
            i1 = -8;
            AppMethodBeat.o(66103);
          }
          else
          {
            i1 = a((String)localObject, paramf);
            AppMethodBeat.o(66103);
          }
        }
      }
    }
  }

  public static e a()
  {
    AppMethodBeat.i(66098);
    if (l == null)
      l = new e();
    e locale = l;
    AppMethodBeat.o(66098);
    return locale;
  }

  private static String a(Context paramContext)
  {
    AppMethodBeat.i(66119);
    int i1 = Process.myPid();
    Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
    while (localIterator.hasNext())
    {
      paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      if (paramContext.pid == i1)
      {
        paramContext = paramContext.processName;
        AppMethodBeat.o(66119);
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(66119);
    }
  }

  private void a(int paramInt)
  {
    AppMethodBeat.i(66116);
    TXCDRApi.txReportDAU(this.a, com.tencent.liteav.basic.datareport.a.aO, paramInt, "");
    AppMethodBeat.o(66116);
  }

  private void a(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(66115);
    int i1 = paramJSONObject.optInt("feature");
    if (i1 <= 1)
      if (!TextUtils.isEmpty(paramString))
      {
        this.n = 5;
        TXCLog.i("LicenceCheck", "parseVersionType, licence is old, mLicenceVersionType = " + this.n);
        AppMethodBeat.o(66115);
      }
    while (true)
    {
      return;
      this.n = 3;
      break;
      this.n = (i1 & 0xF);
      TXCLog.i("LicenceCheck", "parseVersionType, mLicenceVersionType = " + this.n);
      AppMethodBeat.o(66115);
    }
  }

  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, PublicKey paramPublicKey)
  {
    AppMethodBeat.i(66122);
    Signature localSignature = Signature.getInstance("SHA256WithRSA");
    localSignature.initVerify(paramPublicKey);
    localSignature.update(paramArrayOfByte1);
    boolean bool = localSignature.verify(paramArrayOfByte2);
    AppMethodBeat.o(66122);
    return bool;
  }

  private int b(f paramf)
  {
    AppMethodBeat.i(66104);
    int i1;
    if (!d())
    {
      i1 = -6;
      AppMethodBeat.o(66104);
    }
    while (true)
    {
      return i1;
      String str = com.tencent.liteav.basic.util.a.b(this.a, this.d);
      if (TextUtils.isEmpty(str))
      {
        TXCLog.e("LicenceCheck", "checkAssetLicence, licenceSdcardStr is empty");
        i1 = -8;
        AppMethodBeat.o(66104);
      }
      else
      {
        i1 = a(str, paramf);
        AppMethodBeat.o(66104);
      }
    }
  }

  private int b(f paramf, Context paramContext)
  {
    int i1 = 0;
    AppMethodBeat.i(66102);
    if (this.m)
      AppMethodBeat.o(66102);
    while (true)
    {
      return i1;
      if (this.a == null)
        this.a = paramContext;
      if (b(paramf) == 0)
      {
        this.m = true;
        AppMethodBeat.o(66102);
      }
      else
      {
        int i2 = a(paramf);
        if (i2 == 0)
        {
          this.m = true;
          AppMethodBeat.o(66102);
        }
        else
        {
          AppMethodBeat.o(66102);
          i1 = i2;
        }
      }
    }
  }

  private int b(String paramString, f paramf)
  {
    int i1 = -1;
    AppMethodBeat.i(66113);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      int i2 = localJSONObject.optInt("appId");
      this.i = localJSONObject.getString("encryptedLicense");
      this.j = localJSONObject.getString("signature");
      TXCLog.i("LicenceCheck", "appid:".concat(String.valueOf(i2)));
      paramString = new java/lang/StringBuilder;
      paramString.<init>("encryptedLicense:");
      TXCLog.i("LicenceCheck", this.i);
      paramString = new java/lang/StringBuilder;
      paramString.<init>("signature:");
      TXCLog.i("LicenceCheck", this.j);
      i1 = c(paramf);
      AppMethodBeat.o(66113);
      return i1;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        this.i = null;
        this.j = null;
        a(-1);
        AppMethodBeat.o(66113);
      }
    }
  }

  private boolean b(String paramString)
  {
    AppMethodBeat.i(66108);
    boolean bool = com.tencent.liteav.basic.util.a.a(paramString);
    AppMethodBeat.o(66108);
    return bool;
  }

  private int c(f paramf)
  {
    int i1 = 0;
    AppMethodBeat.i(66114);
    int i2;
    Object localObject1;
    try
    {
      PublicKey localPublicKey = a(this.g);
      bool = a(Base64.decode(this.i, 0), Base64.decode(this.j, 0), localPublicKey);
      if (!bool)
      {
        a(-2);
        TXCLog.e("LicenceCheck", "verifyLicence, signature not pass!");
        i2 = -2;
        AppMethodBeat.o(66114);
        return i2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        TXCLog.e("LicenceCheck", "verifyLicence, exception is : ".concat(String.valueOf(localException)));
        boolean bool = false;
        continue;
        localObject1 = f();
        if (!TextUtils.isEmpty((CharSequence)localObject1))
          break;
        a(-3);
        TXCLog.e("LicenceCheck", "verifyLicence, decodeValue is empty!");
        i2 = -3;
        AppMethodBeat.o(66114);
      }
      if (paramf != null)
        paramf.a = ((String)localObject1);
    }
    while (true)
    {
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        paramf = ((JSONObject)localObject2).getString("pituLicense");
        localObject2 = ((JSONObject)localObject2).optJSONArray("appData");
        if (localObject2 == null)
        {
          TXCLog.e("LicenceCheck", "verifyLicence, appDataArray is null!");
          a(-1);
          AppMethodBeat.o(66114);
          i2 = -1;
          break;
        }
        i3 = 0;
        i2 = 0;
        if (i3 >= ((JSONArray)localObject2).length())
          break label501;
        localObject1 = ((JSONArray)localObject2).getJSONObject(i3);
        String str = ((JSONObject)localObject1).optString("packageName");
        TXCLog.i("LicenceCheck", "verifyLicence, packageName:".concat(String.valueOf(str)));
        if (!str.equals(this.a.getPackageName()))
        {
          TXCLog.e("LicenceCheck", "verifyLicence, packageName not match!");
          i2 = 0;
          i3++;
          continue;
        }
        i4 = 1;
        i2 = 1;
        if (d(((JSONObject)localObject1).optString("endDate")))
          continue;
        i2 = 1;
        a((JSONObject)localObject1, paramf);
        i3 = i4;
        if (i3 == 0)
        {
          a(-4);
          AppMethodBeat.o(66114);
          i2 = -4;
          break;
        }
        if (i2 == 0)
        {
          a(-5);
          AppMethodBeat.o(66114);
          i2 = -5;
          break;
        }
        if (!TextUtils.isEmpty(paramf))
        {
          localObject1 = Base64.decode(paramf, 0);
          str = this.a.getExternalFilesDir(null).getAbsolutePath();
          localObject2 = new java/io/File;
          paramf = new java/lang/StringBuilder;
          paramf.<init>();
          ((File)localObject2).<init>(str + File.separator + this.f);
          com.tencent.liteav.basic.util.a.a(((File)localObject2).getAbsolutePath(), (byte[])localObject1);
          TXCCommonUtil.setPituLicencePath(((File)localObject2).getAbsolutePath());
        }
        TXCDRApi.txReportDAU(this.a, com.tencent.liteav.basic.datareport.a.aN);
        AppMethodBeat.o(66114);
        i2 = i1;
      }
      catch (JSONException paramf)
      {
        TXCLog.e("LicenceCheck", "verifyLicence, json format error ! exception = ".concat(String.valueOf(paramf)));
        a(-1);
        AppMethodBeat.o(66114);
        i2 = -1;
      }
      break;
      label501: int i4 = 0;
      int i3 = i2;
      i2 = i4;
    }
  }

  private int c(String paramString, f paramf)
  {
    int i1 = -4;
    AppMethodBeat.i(66118);
    paramString = e(paramString);
    if (TextUtils.isEmpty(paramString))
    {
      TXCLog.e("LicenceCheck", "verifyOldLicence, decryptStr is empty");
      i1 = -3;
      AppMethodBeat.o(66118);
    }
    while (true)
    {
      return i1;
      if (paramf != null)
        paramf.a = paramString;
      try
      {
        paramf = new org/json/JSONObject;
        paramf.<init>(paramString);
        if (!paramf.getString("packagename").equals(a(this.a)))
        {
          TXCLog.e("LicenceCheck", "packagename not match!");
          a(-4);
          AppMethodBeat.o(66118);
          continue;
        }
        boolean bool = d(paramf.getString("enddate"));
        if (!bool)
          break label157;
        i1 = -5;
        AppMethodBeat.o(66118);
      }
      catch (JSONException paramString)
      {
        TXCLog.e("LicenceCheck", "verifyOldLicence, json format error !");
        a(-1);
        AppMethodBeat.o(66118);
        i1 = -1;
      }
      continue;
      label157: this.n = 5;
      TXCDRApi.txReportDAU(this.a, com.tencent.liteav.basic.datareport.a.aN);
      i1 = 0;
      AppMethodBeat.o(66118);
    }
  }

  private static long c(String paramString)
  {
    AppMethodBeat.i(66110);
    try
    {
      SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
      localSimpleDateFormat.<init>("yyyy-MM-dd");
      l1 = localSimpleDateFormat.parse(paramString).getTime();
      AppMethodBeat.o(66110);
      return l1;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        long l1 = -1L;
        AppMethodBeat.o(66110);
      }
    }
  }

  private boolean c()
  {
    boolean bool = false;
    AppMethodBeat.i(66106);
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      TXCLog.e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
      AppMethodBeat.o(66106);
    }
    while (true)
    {
      return bool;
      if (this.a.getExternalFilesDir(null) == null)
      {
        TXCLog.e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
        AppMethodBeat.o(66106);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(66106);
      }
    }
  }

  private boolean d()
  {
    AppMethodBeat.i(66107);
    boolean bool = com.tencent.liteav.basic.util.a.a(this.a, this.d);
    AppMethodBeat.o(66107);
    return bool;
  }

  private boolean d(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(66117);
    long l1 = c(paramString);
    if (l1 < 0L)
    {
      TXCLog.e("LicenceCheck", "checkEndDate, end date millis < 0!");
      AppMethodBeat.o(66117);
    }
    while (true)
    {
      return bool;
      if (l1 < System.currentTimeMillis())
      {
        TXCLog.e("LicenceCheck", "checkEndDate, end date expire!");
        AppMethodBeat.o(66117);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(66117);
      }
    }
  }

  private String e(String paramString)
  {
    AppMethodBeat.i(66120);
    try
    {
      byte[] arrayOfByte = Base64.decode("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKfMXaF6wx9lev2U\nIzkk6ydI2sdaSQAD2ZvDBLq+5Fm6nGwSSWawl03D4vHcWIUa3wnz6f19/y8wzrj4\nnTfcEnT94SPdB6GhGsqPwbwRp9MHAqd/2gWZxSb005il2yiOZafk6X4NGKCn2tGd\nyNaCF+m9rLykuLdZHB0Z53ivgseNAgMBAAECgYAvXI2pAH+Goxwd6uwuOu9svTGT\nRzaHnI6VWmxBUZQeh3+TOW4iYAG03291GN6bY0RFCOWouSGH7lzK9NFbbPCAQ/hx\ncO48PqioHoq7K8sqzd3XaYBv39HrRnM8JvZsqv0PLJwX/LGm2y/MRaKAC6bcHtse\npgh+NNmUxXNRcTMRAQJBANezmenBcR8HTcY5YaEk3SQRzOo+QhIXuuD4T/FESpVJ\nmVQGxJjLsEBua1j38WG2QuepE5JiVbkQ0jQSvhUiZK0CQQDHJa+vWu6l72lQAvIx\nwmRISorvLb/tnu5bH0Ele42oX+w4p/tm03awdVjhVANnpDjYS2H6EzrF/pfis7k9\nV2phAkB4E4gz47bYYhV+qsTZkw70HGCpab0YG1OyFylRkwW983nCl/3rXUChrZZe\nsbATCAZYtfuqOsmju2R5DpH4a+wFAkBmHlcWbmSNxlSUaM5U4b+WqlLQDv+qE6Na\nKo63b8HWI0n4S3tI4QqttZ7b/L66OKXFk/Ir0AyFVuX/o/VLFTZBAkAdSTEkGwE5\nGQmhxu95sKxmdlUY6Q0Gwwpi06C1BPBrj2VkGXpBP0twhPVAq/3xVjjb+2KXVTUW\nIpRLc06M4vhv", 0);
      arrayOfByte = g.b(Base64.decode(paramString, 0), arrayOfByte);
      paramString = new java/lang/String;
      paramString.<init>(arrayOfByte);
      AppMethodBeat.o(66120);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        TXCLog.e("LicenceCheck", "decryptLicenceStr, exception is : ".concat(String.valueOf(paramString)));
        paramString = null;
      }
    }
  }

  private void e()
  {
    AppMethodBeat.i(66109);
    File localFile1 = new File(this.a.getExternalFilesDir(null).getAbsolutePath() + File.separator + this.d);
    if (localFile1.exists())
      TXCLog.i("LicenceCheck", "delete dst file:".concat(String.valueOf(localFile1.delete())));
    File localFile2 = new File(this.h + File.separator + this.e);
    if (localFile2.exists())
      TXCLog.i("LicenceCheck", "rename file:".concat(String.valueOf(localFile2.renameTo(localFile1))));
    this.m = true;
    AppMethodBeat.o(66109);
  }

  private String f()
  {
    AppMethodBeat.i(66112);
    Object localObject1;
    if (TextUtils.isEmpty(this.c))
    {
      TXCLog.e("LicenceCheck", "decodeLicence, mKey is empty!!!");
      localObject1 = "";
      AppMethodBeat.o(66112);
    }
    while (true)
    {
      return localObject1;
      byte[] arrayOfByte = this.c.getBytes();
      localObject1 = new SecretKeySpec(arrayOfByte, "AES");
      Object localObject3 = new byte[16];
      for (int i1 = 0; (i1 < arrayOfByte.length) && (i1 < 16); i1++)
        localObject3[i1] = ((byte)arrayOfByte[i1]);
      IvParameterSpec localIvParameterSpec = new IvParameterSpec((byte[])localObject3);
      arrayOfByte = Base64.decode(this.i, 0);
      try
      {
        localObject3 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        ((Cipher)localObject3).init(2, (Key)localObject1, localIvParameterSpec);
        arrayOfByte = ((Cipher)localObject3).doFinal(arrayOfByte);
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>(arrayOfByte, "UTF-8");
        TXCLog.i("LicenceCheck", "decodeLicence : ".concat(String.valueOf(localObject1)));
        AppMethodBeat.o(66112);
      }
      catch (Exception localException)
      {
        while (true)
          Object localObject2 = null;
      }
    }
  }

  private String g()
  {
    AppMethodBeat.i(66121);
    String str = com.tencent.liteav.basic.util.a.b(new File(this.h + File.separator + this.e).getAbsolutePath());
    AppMethodBeat.o(66121);
    return str;
  }

  public int a(f paramf, Context paramContext)
  {
    AppMethodBeat.i(66101);
    int i1 = b(paramf, paramContext);
    if (i1 != 0)
      b();
    AppMethodBeat.o(66101);
    return i1;
  }

  public int a(String paramString, f paramf)
  {
    AppMethodBeat.i(66105);
    try
    {
      new JSONObject(paramString);
      i1 = b(paramString, paramf);
      AppMethodBeat.o(66105);
      return i1;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        int i1 = c(paramString, paramf);
        AppMethodBeat.o(66105);
      }
    }
  }

  public PublicKey a(String paramString)
  {
    AppMethodBeat.i(66111);
    paramString = new X509EncodedKeySpec(Base64.decode(paramString, 0));
    paramString = KeyFactory.getInstance("RSA").generatePublic(paramString);
    AppMethodBeat.o(66111);
    return paramString;
  }

  public void a(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(66099);
    this.a = paramContext.getApplicationContext();
    this.b = paramString1;
    this.c = paramString2;
    if ((this.a != null) && (c()))
    {
      this.h = this.a.getExternalFilesDir(null).getAbsolutePath();
      if (!b(this.h + File.separator + this.d))
      {
        TXCLog.d("LicenceCheck", "setLicense, sdcard file not exist, to download");
        b();
      }
    }
    AppMethodBeat.o(66099);
  }

  public void b()
  {
    AppMethodBeat.i(66100);
    if (TextUtils.isEmpty(this.b))
    {
      TXCLog.e("LicenceCheck", "downloadLicense, mUrl is empty, ignore!");
      AppMethodBeat.o(66100);
    }
    while (true)
    {
      return;
      if (this.k)
      {
        TXCLog.i("LicenceCheck", "downloadLicense, in downloading, ignore");
        AppMethodBeat.o(66100);
      }
      else
      {
        b local1 = new b()
        {
          public void a()
          {
            AppMethodBeat.i(66129);
            TXCLog.i("LicenceCheck", "downloadLicense, onProcessEnd");
            e.a(e.this, false);
            AppMethodBeat.o(66129);
          }

          public void a(int paramAnonymousInt)
          {
            AppMethodBeat.i(66128);
            TXCLog.i("LicenceCheck", "downloadLicense, onProgressUpdate");
            AppMethodBeat.o(66128);
          }

          public void a(File paramAnonymousFile)
          {
            AppMethodBeat.i(66126);
            TXCLog.i("LicenceCheck", "downloadLicense, onSaveSuccess");
            paramAnonymousFile = e.a(e.this);
            if (TextUtils.isEmpty(paramAnonymousFile))
            {
              TXCLog.e("LicenceCheck", "downloadLicense, readDownloadTempLicence is empty!");
              e.a(e.this, false);
              AppMethodBeat.o(66126);
            }
            while (true)
            {
              return;
              if (e.a(e.this, paramAnonymousFile, null) == 0)
                e.b(e.this);
              AppMethodBeat.o(66126);
            }
          }

          public void a(File paramAnonymousFile, Exception paramAnonymousException)
          {
            AppMethodBeat.i(66127);
            TXCLog.i("LicenceCheck", "downloadLicense, onSaveFailed");
            AppMethodBeat.o(66127);
          }
        };
        if (this.a == null)
        {
          TXCLog.e("LicenceCheck", "context is NULL !!! Please set context in method:setLicense(Context context, String url, String key)");
          AppMethodBeat.o(66100);
        }
        else
        {
          File localFile = this.a.getExternalFilesDir(null);
          if (localFile == null)
          {
            TXCLog.e("LicenceCheck", "Please check permission WRITE_EXTERNAL_STORAGE permission has been set !!!");
            AppMethodBeat.o(66100);
          }
          else
          {
            this.h = localFile.getAbsolutePath();
            new Thread(new c(this.a, this.b, this.h, this.e, local1, false)).start();
            this.k = true;
            AppMethodBeat.o(66100);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.c.e
 * JD-Core Version:    0.6.2
 */