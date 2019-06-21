package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.content.b;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

final class af
{
  private static ag a(SharedPreferences paramSharedPreferences, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(108808);
    String str1 = paramSharedPreferences.getString(p.o(paramString, "|P|"), null);
    String str2 = paramSharedPreferences.getString(p.o(paramString, "|K|"), null);
    if ((str1 == null) || (str2 == null))
    {
      AppMethodBeat.o(108808);
      paramSharedPreferences = localObject;
    }
    while (true)
    {
      return paramSharedPreferences;
      paramSharedPreferences = new ag(r(str1, str2), b(paramSharedPreferences, paramString));
      AppMethodBeat.o(108808);
    }
  }

  private static void a(Context paramContext, String paramString, ag paramag)
  {
    Object localObject = null;
    AppMethodBeat.i(108804);
    try
    {
      Log.isLoggable("FirebaseInstanceId", 3);
      paramContext = n(paramContext, paramString);
      paramContext.createNewFile();
      paramString = new java/util/Properties;
      paramString.<init>();
      paramString.setProperty("pub", paramag.zzq());
      paramString.setProperty("pri", paramag.uW());
      paramString.setProperty("cre", String.valueOf(paramag.bwN));
      paramag = new java/io/FileOutputStream;
      paramag.<init>(paramContext);
      paramContext = localObject;
      try
      {
        paramString.store(paramag, null);
        a(null, paramag);
        AppMethodBeat.o(108804);
        return;
      }
      catch (Throwable paramString)
      {
        paramContext = paramString;
        AppMethodBeat.o(108804);
        paramContext = paramString;
        throw paramString;
      }
      finally
      {
        a(paramContext, paramag);
        AppMethodBeat.o(108804);
      }
    }
    catch (IOException paramContext)
    {
      while (true)
      {
        paramContext = String.valueOf(paramContext);
        new StringBuilder(String.valueOf(paramContext).length() + 21).append("Failed to write key: ").append(paramContext);
        AppMethodBeat.o(108804);
      }
    }
  }

  static File aq(Context paramContext)
  {
    AppMethodBeat.i(108805);
    File localFile = b.Q(paramContext);
    if ((localFile != null) && (localFile.isDirectory()))
    {
      AppMethodBeat.o(108805);
      paramContext = localFile;
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getFilesDir();
      AppMethodBeat.o(108805);
    }
  }

  private static long b(SharedPreferences paramSharedPreferences, String paramString)
  {
    AppMethodBeat.i(108810);
    paramSharedPreferences = paramSharedPreferences.getString(p.o(paramString, "cre"), null);
    if (paramSharedPreferences != null);
    while (true)
    {
      try
      {
        l = Long.parseLong(paramSharedPreferences);
        AppMethodBeat.o(108810);
        return l;
      }
      catch (NumberFormatException paramSharedPreferences)
      {
      }
      long l = 0L;
      AppMethodBeat.o(108810);
    }
  }

  private static void b(Context paramContext, String paramString, ag paramag)
  {
    AppMethodBeat.i(108809);
    paramContext = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    try
    {
      boolean bool = paramag.equals(a(paramContext, paramString));
      if (bool)
      {
        AppMethodBeat.o(108809);
        return;
      }
    }
    catch (ah localah)
    {
      while (true)
      {
        Log.isLoggable("FirebaseInstanceId", 3);
        paramContext = paramContext.edit();
        paramContext.putString(p.o(paramString, "|P|"), paramag.zzq());
        paramContext.putString(p.o(paramString, "|K|"), paramag.uW());
        paramContext.putString(p.o(paramString, "cre"), String.valueOf(paramag.bwN));
        paramContext.commit();
        AppMethodBeat.o(108809);
      }
    }
  }

  static ag k(Context paramContext, String paramString)
  {
    AppMethodBeat.i(108800);
    ag localag1 = new ag(a.uN(), System.currentTimeMillis());
    try
    {
      ag localag2 = l(paramContext, paramString);
      if (localag2 != null)
      {
        Log.isLoggable("FirebaseInstanceId", 3);
        AppMethodBeat.o(108800);
        paramContext = localag2;
        return paramContext;
      }
    }
    catch (ah localah)
    {
      while (true)
      {
        Log.isLoggable("FirebaseInstanceId", 3);
        a(paramContext, paramString, localag1);
        b(paramContext, paramString, localag1);
        AppMethodBeat.o(108800);
        paramContext = localag1;
      }
    }
  }

  // ERROR //
  static ag l(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 223
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aload_1
    //   7: invokestatic 226	com/google/firebase/iid/af:m	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/firebase/iid/ag;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull +18 -> 30
    //   15: aload_0
    //   16: aload_1
    //   17: aload_2
    //   18: invokestatic 222	com/google/firebase/iid/af:b	(Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/iid/ag;)V
    //   21: ldc 223
    //   23: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_2
    //   27: astore_0
    //   28: aload_0
    //   29: areturn
    //   30: aconst_null
    //   31: astore_2
    //   32: aload_0
    //   33: ldc 177
    //   35: iconst_0
    //   36: invokevirtual 181	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   39: aload_1
    //   40: invokestatic 183	com/google/firebase/iid/af:a	(Landroid/content/SharedPreferences;Ljava/lang/String;)Lcom/google/firebase/iid/ag;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnull +23 -> 68
    //   48: aload_0
    //   49: aload_1
    //   50: aload_3
    //   51: invokestatic 220	com/google/firebase/iid/af:a	(Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/iid/ag;)V
    //   54: ldc 223
    //   56: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: aload_3
    //   60: astore_0
    //   61: goto -33 -> 28
    //   64: astore_2
    //   65: goto -33 -> 32
    //   68: aload_2
    //   69: astore_0
    //   70: aload_0
    //   71: ifnull +10 -> 81
    //   74: ldc 223
    //   76: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: aload_0
    //   80: athrow
    //   81: ldc 223
    //   83: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: aconst_null
    //   87: astore_0
    //   88: goto -60 -> 28
    //   91: astore_0
    //   92: goto -22 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   5	11	64	com/google/firebase/iid/ah
    //   15	21	64	com/google/firebase/iid/ah
    //   32	44	91	com/google/firebase/iid/ah
    //   48	54	91	com/google/firebase/iid/ah
  }

  private static ag m(Context paramContext, String paramString)
  {
    AppMethodBeat.i(108803);
    paramString = n(paramContext, paramString);
    if (!paramString.exists())
    {
      paramContext = null;
      AppMethodBeat.o(108803);
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = q(paramString);
        AppMethodBeat.o(108803);
      }
      catch (IOException paramContext)
      {
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          paramContext = String.valueOf(paramContext);
          new StringBuilder(String.valueOf(paramContext).length() + 40).append("Failed to read key from file, retrying: ").append(paramContext);
        }
        try
        {
          paramContext = q(paramString);
          AppMethodBeat.o(108803);
        }
        catch (IOException paramString)
        {
          paramContext = String.valueOf(paramString);
          new StringBuilder(String.valueOf(paramContext).length() + 45).append("IID file exists, but failed to read from it: ").append(paramContext);
          paramContext = new ah(paramString);
          AppMethodBeat.o(108803);
        }
      }
    }
    throw paramContext;
  }

  private static File n(Context paramContext, String paramString)
  {
    AppMethodBeat.i(108806);
    if (TextUtils.isEmpty(paramString))
      paramString = "com.google.InstanceId.properties";
    while (true)
    {
      paramContext = new File(aq(paramContext), paramString);
      AppMethodBeat.o(108806);
      return paramContext;
      try
      {
        paramString = Base64.encodeToString(paramString.getBytes("UTF-8"), 11);
        int i = String.valueOf(paramString).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 33);
        paramString = "com.google.InstanceId_" + paramString + ".properties";
      }
      catch (UnsupportedEncodingException paramContext)
      {
        paramContext = new AssertionError(paramContext);
        AppMethodBeat.o(108806);
      }
    }
    throw paramContext;
  }

  // ERROR //
  private static ag q(File paramFile)
  {
    // Byte code:
    //   0: ldc_w 282
    //   3: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 135	java/io/FileInputStream
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 283	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   14: astore_1
    //   15: new 74	java/util/Properties
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial 75	java/util/Properties:<init>	()V
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 287	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   28: aload_0
    //   29: ldc 77
    //   31: invokevirtual 291	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   34: astore_2
    //   35: aload_0
    //   36: ldc 87
    //   38: invokevirtual 291	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   41: astore_3
    //   42: aload_2
    //   43: ifnull +7 -> 50
    //   46: aload_3
    //   47: ifnonnull +18 -> 65
    //   50: aconst_null
    //   51: aload_1
    //   52: invokestatic 293	com/google/firebase/iid/af:a	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   55: ldc_w 282
    //   58: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: aconst_null
    //   62: astore_0
    //   63: aload_0
    //   64: areturn
    //   65: aload_2
    //   66: aload_3
    //   67: invokestatic 41	com/google/firebase/iid/af:r	(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPair;
    //   70: astore_3
    //   71: aload_0
    //   72: ldc 92
    //   74: invokevirtual 291	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   77: invokestatic 172	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   80: lstore 4
    //   82: new 37	com/google/firebase/iid/ag
    //   85: dup
    //   86: aload_3
    //   87: lload 4
    //   89: invokespecial 48	com/google/firebase/iid/ag:<init>	(Ljava/security/KeyPair;J)V
    //   92: astore_0
    //   93: aconst_null
    //   94: aload_1
    //   95: invokestatic 293	com/google/firebase/iid/af:a	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   98: ldc_w 282
    //   101: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: goto -41 -> 63
    //   107: astore_3
    //   108: new 174	com/google/firebase/iid/ah
    //   111: astore_0
    //   112: aload_0
    //   113: aload_3
    //   114: invokespecial 241	com/google/firebase/iid/ah:<init>	(Ljava/lang/Exception;)V
    //   117: ldc_w 282
    //   120: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: aload_0
    //   124: athrow
    //   125: astore_3
    //   126: ldc_w 282
    //   129: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload_3
    //   133: athrow
    //   134: astore_0
    //   135: aload_3
    //   136: aload_1
    //   137: invokestatic 293	com/google/firebase/iid/af:a	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   140: ldc_w 282
    //   143: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: aload_0
    //   147: athrow
    //   148: astore_0
    //   149: aconst_null
    //   150: astore_3
    //   151: goto -16 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   71	82	107	java/lang/NumberFormatException
    //   15	42	125	java/lang/Throwable
    //   65	71	125	java/lang/Throwable
    //   71	82	125	java/lang/Throwable
    //   82	93	125	java/lang/Throwable
    //   108	125	125	java/lang/Throwable
    //   126	134	134	finally
    //   15	42	148	finally
    //   65	71	148	finally
    //   71	82	148	finally
    //   82	93	148	finally
    //   108	125	148	finally
  }

  // ERROR //
  private static java.security.KeyPair r(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 300
    //   3: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: bipush 8
    //   9: invokestatic 304	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   12: astore_2
    //   13: aload_1
    //   14: bipush 8
    //   16: invokestatic 304	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   19: astore_0
    //   20: ldc_w 306
    //   23: invokestatic 312	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   26: astore_1
    //   27: new 314	java/security/spec/X509EncodedKeySpec
    //   30: astore_3
    //   31: aload_3
    //   32: aload_2
    //   33: invokespecial 317	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   36: aload_1
    //   37: aload_3
    //   38: invokevirtual 321	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   41: astore_3
    //   42: new 323	java/security/spec/PKCS8EncodedKeySpec
    //   45: astore_2
    //   46: aload_2
    //   47: aload_0
    //   48: invokespecial 324	java/security/spec/PKCS8EncodedKeySpec:<init>	([B)V
    //   51: new 326	java/security/KeyPair
    //   54: dup
    //   55: aload_3
    //   56: aload_1
    //   57: aload_2
    //   58: invokevirtual 330	java/security/KeyFactory:generatePrivate	(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   61: invokespecial 333	java/security/KeyPair:<init>	(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    //   64: astore_0
    //   65: ldc_w 300
    //   68: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: aload_0
    //   72: areturn
    //   73: astore_0
    //   74: new 174	com/google/firebase/iid/ah
    //   77: dup
    //   78: aload_0
    //   79: invokespecial 241	com/google/firebase/iid/ah:<init>	(Ljava/lang/Exception;)V
    //   82: astore_0
    //   83: ldc_w 300
    //   86: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: aload_0
    //   90: athrow
    //   91: astore_0
    //   92: aload_0
    //   93: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   96: astore_1
    //   97: new 119	java/lang/StringBuilder
    //   100: dup
    //   101: aload_1
    //   102: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   105: invokevirtual 123	java/lang/String:length	()I
    //   108: bipush 19
    //   110: iadd
    //   111: invokespecial 125	java/lang/StringBuilder:<init>	(I)V
    //   114: ldc_w 335
    //   117: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload_1
    //   121: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: new 174	com/google/firebase/iid/ah
    //   128: dup
    //   129: aload_0
    //   130: invokespecial 241	com/google/firebase/iid/ah:<init>	(Ljava/lang/Exception;)V
    //   133: astore_0
    //   134: ldc_w 300
    //   137: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: aload_0
    //   141: athrow
    //   142: astore_0
    //   143: goto -51 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   6	20	73	java/lang/IllegalArgumentException
    //   20	65	91	java/security/NoSuchAlgorithmException
    //   20	65	142	java/security/spec/InvalidKeySpecException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.af
 * JD-Core Version:    0.6.2
 */