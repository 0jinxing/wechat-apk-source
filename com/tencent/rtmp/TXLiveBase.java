package com.tencent.rtmp;

import android.content.Context;
import com.tencent.liteav.basic.c.e;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.b;
import com.tencent.liteav.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TXLiveBase
{
  private static final String FILE_MD5_FFMPEG = "___md5_libtxffmpeg_md5__________";
  private static final String FILE_MD5_LITEAV = "___md5_libliteavsdk_md5_________";
  private static final String FILE_MD5_SATURN = "___md5_libsaturn_md5____________";
  private static final String FILE_MD5_TRAE = "___md5_libtraeimp_md5___________";
  private static final String TAG = "TXLiveBase";
  private static TXLiveBase instance;
  private static ITXLiveBaseListener listener;

  static
  {
    AppMethodBeat.i(65607);
    listener = null;
    instance = new TXLiveBase();
    AppMethodBeat.o(65607);
  }

  private static String getFileMD5(String paramString1, String paramString2)
  {
    FileInputStream localFileInputStream = null;
    String str1 = null;
    String str2 = null;
    byte[] arrayOfByte = null;
    AppMethodBeat.i(65606);
    File localFile = new File(paramString1, paramString2);
    if ((!localFile.exists()) || (!localFile.isFile()))
    {
      AppMethodBeat.o(65606);
      paramString1 = arrayOfByte;
    }
    while (true)
    {
      return paramString1;
      arrayOfByte = new byte[1024];
      paramString2 = localFileInputStream;
      try
      {
        paramString1 = MessageDigest.getInstance("MD5");
        paramString2 = paramString1;
        str1 = paramString1;
        str2 = paramString1;
        localFileInputStream = new java/io/FileInputStream;
        paramString2 = paramString1;
        str1 = paramString1;
        str2 = paramString1;
        localFileInputStream.<init>(localFile);
        while (true)
        {
          paramString2 = paramString1;
          str1 = paramString1;
          str2 = paramString1;
          int i = localFileInputStream.read(arrayOfByte, 0, 1024);
          if (i == -1)
            break;
          paramString2 = paramString1;
          str1 = paramString1;
          str2 = paramString1;
          paramString1.update(arrayOfByte, 0, i);
        }
      }
      catch (NoSuchAlgorithmException paramString1)
      {
        paramString1 = paramString2;
        while (true)
        {
          paramString1 = new BigInteger(1, paramString1.digest()).toString(16);
          AppMethodBeat.o(65606);
          break;
          paramString2 = paramString1;
          str1 = paramString1;
          str2 = paramString1;
          localFileInputStream.close();
        }
      }
      catch (FileNotFoundException paramString1)
      {
        while (true)
          paramString1 = str1;
      }
      catch (IOException paramString1)
      {
        while (true)
          paramString1 = str2;
      }
    }
  }

  public static TXLiveBase getInstance()
  {
    return instance;
  }

  public static String getPituSDKVersion()
  {
    AppMethodBeat.i(65604);
    String str = p.a();
    AppMethodBeat.o(65604);
    return str;
  }

  public static String getSDKVersionStr()
  {
    AppMethodBeat.i(65602);
    String str = TXCCommonUtil.getSDKVersionStr();
    AppMethodBeat.o(65602);
    return str;
  }

  public static boolean isLibraryPathValid(String paramString)
  {
    AppMethodBeat.i(65601);
    String str1 = getFileMD5(paramString, "libliteavsdk.so");
    String str2 = getFileMD5(paramString, "libsaturn.so");
    String str3 = getFileMD5(paramString, "libtxffmpeg.so");
    paramString = getFileMD5(paramString, "libtraeimp-rtmp-armeabi.so");
    new StringBuilder("MD5-Check libliteavsdk = ").append(str1).append(" FILE_MD5_LITEAV = ___md5_libliteavsdk_md5_________");
    new StringBuilder("MD5-Check libsaturn = ").append(str2).append(" FILE_MD5_SATURN = ___md5_libsaturn_md5____________");
    new StringBuilder("MD5-Check libtxffmpeg = ").append(str3).append(" FILE_MD5_FFMPEG = ___md5_libtxffmpeg_md5__________");
    new StringBuilder("MD5-Check libtraeimpl = ").append(paramString).append(" FILE_MD5_TRAE = ___md5_libtraeimp_md5___________");
    boolean bool;
    if ((str1 != null) && (str1.equalsIgnoreCase("___md5_libliteavsdk_md5_________")) && (str2 != null) && (str2.equalsIgnoreCase("___md5_libsaturn_md5____________")) && (str3 != null) && (str3.equalsIgnoreCase("___md5_libtxffmpeg_md5__________")) && (paramString != null) && (paramString.equalsIgnoreCase("___md5_libtraeimp_md5___________")))
    {
      bool = true;
      AppMethodBeat.o(65601);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65601);
    }
  }

  public static void setAppID(String paramString)
  {
    AppMethodBeat.i(65605);
    TXCCommonUtil.setAppID(paramString);
    AppMethodBeat.o(65605);
  }

  public static void setAppVersion(String paramString)
  {
    AppMethodBeat.i(65599);
    TXCDRApi.txSetAppVersion(paramString);
    TXCCommonUtil.setAppVersion(paramString);
    AppMethodBeat.o(65599);
  }

  public static void setConsoleEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(65598);
    TXCLog.setConsoleEnabled(paramBoolean);
    AppMethodBeat.o(65598);
  }

  public static void setLibraryPath(String paramString)
  {
    AppMethodBeat.i(65600);
    b.b(paramString);
    AppMethodBeat.o(65600);
  }

  public static void setListener(ITXLiveBaseListener paramITXLiveBaseListener)
  {
    AppMethodBeat.i(65596);
    TXCLog.setListener(new TXLiveBase.a(null));
    listener = paramITXLiveBaseListener;
    AppMethodBeat.o(65596);
  }

  public static void setLogLevel(int paramInt)
  {
    AppMethodBeat.i(65597);
    TXCLog.setLevel(paramInt);
    AppMethodBeat.o(65597);
  }

  public static void setPituLicencePath(String paramString)
  {
    AppMethodBeat.i(65603);
    TXCCommonUtil.setPituLicencePath(paramString);
    AppMethodBeat.o(65603);
  }

  public void setLicence(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(65595);
    e.a().a(paramContext, paramString1, paramString2);
    AppMethodBeat.o(65595);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLiveBase
 * JD-Core Version:    0.6.2
 */