package com.google.android.gms.iid;

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

final class zzn
{
  private static zzo zzd(SharedPreferences paramSharedPreferences, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(57587);
    String str1 = paramSharedPreferences.getString(zzak.zzh(paramString, "|P|"), null);
    String str2 = paramSharedPreferences.getString(zzak.zzh(paramString, "|K|"), null);
    if ((str1 == null) || (str2 == null))
    {
      AppMethodBeat.o(57587);
      paramSharedPreferences = localObject;
    }
    while (true)
    {
      return paramSharedPreferences;
      paramSharedPreferences = new zzo(zzg(str1, str2), zze(paramSharedPreferences, paramString));
      AppMethodBeat.o(57587);
    }
  }

  // ERROR //
  private static zzo zzd(File paramFile)
  {
    // Byte code:
    //   0: ldc 55
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 57	java/io/FileInputStream
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 60	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   13: astore_1
    //   14: new 62	java/util/Properties
    //   17: astore_0
    //   18: aload_0
    //   19: invokespecial 63	java/util/Properties:<init>	()V
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 67	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   27: aload_0
    //   28: ldc 69
    //   30: invokevirtual 73	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_2
    //   34: aload_0
    //   35: ldc 75
    //   37: invokevirtual 73	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   40: astore_3
    //   41: aload_2
    //   42: ifnull +7 -> 49
    //   45: aload_3
    //   46: ifnonnull +17 -> 63
    //   49: aconst_null
    //   50: aload_1
    //   51: invokestatic 78	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   54: ldc 55
    //   56: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: aconst_null
    //   60: astore_0
    //   61: aload_0
    //   62: areturn
    //   63: aload_2
    //   64: aload_3
    //   65: invokestatic 42	com/google/android/gms/iid/zzn:zzg	(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPair;
    //   68: astore_3
    //   69: aload_0
    //   70: ldc 80
    //   72: invokevirtual 73	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   75: invokestatic 86	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   78: lstore 4
    //   80: new 38	com/google/android/gms/iid/zzo
    //   83: dup
    //   84: aload_3
    //   85: lload 4
    //   87: invokespecial 49	com/google/android/gms/iid/zzo:<init>	(Ljava/security/KeyPair;J)V
    //   90: astore_0
    //   91: aconst_null
    //   92: aload_1
    //   93: invokestatic 78	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   96: ldc 55
    //   98: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: goto -40 -> 61
    //   104: astore_3
    //   105: new 88	com/google/android/gms/iid/zzp
    //   108: astore_0
    //   109: aload_0
    //   110: aload_3
    //   111: invokespecial 91	com/google/android/gms/iid/zzp:<init>	(Ljava/lang/Exception;)V
    //   114: ldc 55
    //   116: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: aload_0
    //   120: athrow
    //   121: astore_3
    //   122: ldc 55
    //   124: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: aload_3
    //   128: athrow
    //   129: astore_0
    //   130: aload_3
    //   131: aload_1
    //   132: invokestatic 78	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   135: ldc 55
    //   137: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: aload_0
    //   141: athrow
    //   142: astore_0
    //   143: aconst_null
    //   144: astore_3
    //   145: goto -15 -> 130
    //
    // Exception table:
    //   from	to	target	type
    //   69	80	104	java/lang/NumberFormatException
    //   14	41	121	java/lang/Throwable
    //   63	69	121	java/lang/Throwable
    //   69	80	121	java/lang/Throwable
    //   80	91	121	java/lang/Throwable
    //   105	121	121	java/lang/Throwable
    //   122	129	129	finally
    //   14	41	142	finally
    //   63	69	142	finally
    //   69	80	142	finally
    //   80	91	142	finally
    //   105	121	142	finally
  }

  private static void zzd(Context paramContext, String paramString, zzo paramzzo)
  {
    Object localObject = null;
    AppMethodBeat.i(57583);
    try
    {
      Log.isLoggable("InstanceID", 3);
      paramContext = zzj(paramContext, paramString);
      paramContext.createNewFile();
      paramString = new java/util/Properties;
      paramString.<init>();
      paramString.setProperty("pub", zzo.zzd(paramzzo));
      paramString.setProperty("pri", zzo.zze(paramzzo));
      paramString.setProperty("cre", String.valueOf(zzo.zzf(paramzzo)));
      paramzzo = new java/io/FileOutputStream;
      paramzzo.<init>(paramContext);
      paramContext = localObject;
      try
      {
        paramString.store(paramzzo, null);
        zzd(null, paramzzo);
        AppMethodBeat.o(57583);
        return;
      }
      catch (Throwable paramString)
      {
        paramContext = paramString;
        AppMethodBeat.o(57583);
        paramContext = paramString;
        throw paramString;
      }
      finally
      {
        zzd(paramContext, paramzzo);
        AppMethodBeat.o(57583);
      }
    }
    catch (IOException paramContext)
    {
      while (true)
      {
        paramContext = String.valueOf(paramContext);
        new StringBuilder(String.valueOf(paramContext).length() + 21).append("Failed to write key: ").append(paramContext);
        AppMethodBeat.o(57583);
      }
    }
  }

  private static long zze(SharedPreferences paramSharedPreferences, String paramString)
  {
    AppMethodBeat.i(57589);
    paramSharedPreferences = paramSharedPreferences.getString(zzak.zzh(paramString, "cre"), null);
    if (paramSharedPreferences != null);
    while (true)
    {
      try
      {
        l = Long.parseLong(paramSharedPreferences);
        AppMethodBeat.o(57589);
        return l;
      }
      catch (NumberFormatException paramSharedPreferences)
      {
      }
      long l = 0L;
      AppMethodBeat.o(57589);
    }
  }

  private final void zze(Context paramContext, String paramString, zzo paramzzo)
  {
    AppMethodBeat.i(57588);
    paramContext = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    try
    {
      boolean bool = paramzzo.equals(zzd(paramContext, paramString));
      if (bool)
      {
        AppMethodBeat.o(57588);
        return;
      }
    }
    catch (zzp localzzp)
    {
      while (true)
      {
        Log.isLoggable("InstanceID", 3);
        paramContext = paramContext.edit();
        paramContext.putString(zzak.zzh(paramString, "|P|"), zzo.zzd(paramzzo));
        paramContext.putString(zzak.zzh(paramString, "|K|"), zzo.zze(paramzzo));
        paramContext.putString(zzak.zzh(paramString, "cre"), String.valueOf(zzo.zzf(paramzzo)));
        paramContext.commit();
        AppMethodBeat.o(57588);
      }
    }
  }

  // ERROR //
  private static java.security.KeyPair zzg(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 206
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: bipush 8
    //   8: invokestatic 212	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   11: astore_2
    //   12: aload_1
    //   13: bipush 8
    //   15: invokestatic 212	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   18: astore_0
    //   19: ldc 214
    //   21: invokestatic 220	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   24: astore_1
    //   25: new 222	java/security/spec/X509EncodedKeySpec
    //   28: astore_3
    //   29: aload_3
    //   30: aload_2
    //   31: invokespecial 225	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   34: aload_1
    //   35: aload_3
    //   36: invokevirtual 229	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   39: astore_3
    //   40: new 231	java/security/spec/PKCS8EncodedKeySpec
    //   43: astore_2
    //   44: aload_2
    //   45: aload_0
    //   46: invokespecial 232	java/security/spec/PKCS8EncodedKeySpec:<init>	([B)V
    //   49: new 234	java/security/KeyPair
    //   52: dup
    //   53: aload_3
    //   54: aload_1
    //   55: aload_2
    //   56: invokevirtual 238	java/security/KeyFactory:generatePrivate	(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   59: invokespecial 241	java/security/KeyPair:<init>	(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    //   62: astore_0
    //   63: ldc 206
    //   65: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: aload_0
    //   69: areturn
    //   70: astore_0
    //   71: new 88	com/google/android/gms/iid/zzp
    //   74: dup
    //   75: aload_0
    //   76: invokespecial 91	com/google/android/gms/iid/zzp:<init>	(Ljava/lang/Exception;)V
    //   79: astore_0
    //   80: ldc 206
    //   82: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: aload_0
    //   86: athrow
    //   87: astore_0
    //   88: aload_0
    //   89: invokestatic 145	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: astore_1
    //   93: new 147	java/lang/StringBuilder
    //   96: dup
    //   97: aload_1
    //   98: invokestatic 145	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   101: invokevirtual 151	java/lang/String:length	()I
    //   104: bipush 19
    //   106: iadd
    //   107: invokespecial 153	java/lang/StringBuilder:<init>	(I)V
    //   110: ldc 243
    //   112: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: aload_1
    //   116: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: new 88	com/google/android/gms/iid/zzp
    //   123: dup
    //   124: aload_0
    //   125: invokespecial 91	com/google/android/gms/iid/zzp:<init>	(Ljava/lang/Exception;)V
    //   128: astore_0
    //   129: ldc 206
    //   131: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   134: aload_0
    //   135: athrow
    //   136: astore_0
    //   137: goto -49 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   5	19	70	java/lang/IllegalArgumentException
    //   19	63	87	java/security/NoSuchAlgorithmException
    //   19	63	136	java/security/spec/InvalidKeySpecException
  }

  static void zzg(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57578);
    paramContext = zzj(paramContext, paramString);
    if (paramContext.exists())
      paramContext.delete();
    AppMethodBeat.o(57578);
  }

  // ERROR //
  private final zzo zzh(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 253
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: invokespecial 256	com/google/android/gms/iid/zzn:zzi	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/iid/zzo;
    //   11: astore_3
    //   12: aload_3
    //   13: ifnull +19 -> 32
    //   16: aload_0
    //   17: aload_1
    //   18: aload_2
    //   19: aload_3
    //   20: invokespecial 258	com/google/android/gms/iid/zzn:zze	(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/iid/zzo;)V
    //   23: ldc 253
    //   25: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aload_3
    //   29: astore_1
    //   30: aload_1
    //   31: areturn
    //   32: aconst_null
    //   33: astore_3
    //   34: aload_1
    //   35: ldc 174
    //   37: iconst_0
    //   38: invokevirtual 180	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   41: aload_2
    //   42: invokestatic 182	com/google/android/gms/iid/zzn:zzd	(Landroid/content/SharedPreferences;Ljava/lang/String;)Lcom/google/android/gms/iid/zzo;
    //   45: astore 4
    //   47: aload 4
    //   49: ifnull +25 -> 74
    //   52: aload_1
    //   53: aload_2
    //   54: aload 4
    //   56: invokestatic 260	com/google/android/gms/iid/zzn:zzd	(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/iid/zzo;)V
    //   59: ldc 253
    //   61: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: aload 4
    //   66: astore_1
    //   67: goto -37 -> 30
    //   70: astore_3
    //   71: goto -37 -> 34
    //   74: aload_3
    //   75: ifnull +10 -> 85
    //   78: ldc 253
    //   80: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_3
    //   84: athrow
    //   85: ldc 253
    //   87: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: aconst_null
    //   91: astore_1
    //   92: goto -62 -> 30
    //   95: astore_3
    //   96: goto -22 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   5	12	70	com/google/android/gms/iid/zzp
    //   16	23	70	com/google/android/gms/iid/zzp
    //   34	47	95	com/google/android/gms/iid/zzp
    //   52	59	95	com/google/android/gms/iid/zzp
  }

  private final zzo zzi(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57582);
    paramString = zzj(paramContext, paramString);
    if (!paramString.exists())
    {
      paramContext = null;
      AppMethodBeat.o(57582);
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = zzd(paramString);
        AppMethodBeat.o(57582);
      }
      catch (IOException paramContext)
      {
        if (Log.isLoggable("InstanceID", 3))
        {
          paramContext = String.valueOf(paramContext);
          new StringBuilder(String.valueOf(paramContext).length() + 40).append("Failed to read key from file, retrying: ").append(paramContext);
        }
        try
        {
          paramContext = zzd(paramString);
          AppMethodBeat.o(57582);
        }
        catch (IOException paramString)
        {
          paramContext = String.valueOf(paramString);
          new StringBuilder(String.valueOf(paramContext).length() + 45).append("IID file exists, but failed to read from it: ").append(paramContext);
          paramContext = new zzp(paramString);
          AppMethodBeat.o(57582);
        }
      }
    }
    throw paramContext;
  }

  static void zzi(Context paramContext)
  {
    AppMethodBeat.i(57579);
    for (paramContext : zzj(paramContext).listFiles())
      if (paramContext.getName().startsWith("com.google.InstanceId"))
        paramContext.delete();
    AppMethodBeat.o(57579);
  }

  private static File zzj(Context paramContext)
  {
    AppMethodBeat.i(57584);
    File localFile = b.Q(paramContext);
    if ((localFile != null) && (localFile.isDirectory()))
    {
      AppMethodBeat.o(57584);
      paramContext = localFile;
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getFilesDir();
      AppMethodBeat.o(57584);
    }
  }

  private static File zzj(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57585);
    if (TextUtils.isEmpty(paramString))
      paramString = "com.google.InstanceId.properties";
    while (true)
    {
      paramContext = new File(zzj(paramContext), paramString);
      AppMethodBeat.o(57585);
      return paramContext;
      try
      {
        String str = Base64.encodeToString(paramString.getBytes("UTF-8"), 11);
        int i = String.valueOf(str).length();
        paramString = new java/lang/StringBuilder;
        paramString.<init>(i + 33);
        paramString = "com.google.InstanceId_" + str + ".properties";
      }
      catch (UnsupportedEncodingException paramContext)
      {
        paramContext = new AssertionError(paramContext);
        AppMethodBeat.o(57585);
      }
    }
    throw paramContext;
  }

  final zzo zze(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57576);
    zzo localzzo = zzh(paramContext, paramString);
    if (localzzo != null)
    {
      AppMethodBeat.o(57576);
      paramContext = localzzo;
    }
    while (true)
    {
      return paramContext;
      paramContext = zzf(paramContext, paramString);
      AppMethodBeat.o(57576);
    }
  }

  final zzo zzf(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57577);
    zzo localzzo1 = new zzo(zzd.zzk(), System.currentTimeMillis());
    try
    {
      zzo localzzo2 = zzh(paramContext, paramString);
      if (localzzo2 != null)
      {
        Log.isLoggable("InstanceID", 3);
        AppMethodBeat.o(57577);
        paramContext = localzzo2;
        return paramContext;
      }
    }
    catch (zzp localzzp)
    {
      while (true)
      {
        Log.isLoggable("InstanceID", 3);
        zzd(paramContext, paramString, localzzo1);
        zze(paramContext, paramString, localzzo1);
        AppMethodBeat.o(57577);
        paramContext = localzzo1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzn
 * JD-Core Version:    0.6.2
 */