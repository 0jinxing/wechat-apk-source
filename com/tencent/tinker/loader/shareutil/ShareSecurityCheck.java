package com.tencent.tinker.loader.shareutil;

import android.content.Context;
import android.content.pm.Signature;
import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.File;
import java.security.cert.Certificate;
import java.util.HashMap;

public class ShareSecurityCheck
{
  private static String AFf = null;
  public final HashMap<String, String> AFg;
  private final HashMap<String, String> AFh;
  private final Context mContext;

  public ShareSecurityCheck(Context paramContext)
  {
    this.mContext = paramContext;
    this.AFg = new HashMap();
    this.AFh = new HashMap();
    if (AFf == null)
    {
      paramContext = this.mContext;
      try
      {
        paramContext = SharePatchFileUtil.cq(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0].toByteArray());
        AFf = paramContext;
        if (paramContext == null)
        {
          paramContext = new com/tencent/tinker/loader/TinkerRuntimeException;
          paramContext.<init>("get public key md5 is null");
          throw paramContext;
        }
      }
      catch (Exception paramContext)
      {
        TinkerRuntimeException localTinkerRuntimeException = new com/tencent/tinker/loader/TinkerRuntimeException;
        localTinkerRuntimeException.<init>("ShareSecurityCheck init public key fail", paramContext);
        throw localTinkerRuntimeException;
      }
      finally
      {
        SharePatchFileUtil.ah(null);
      }
      SharePatchFileUtil.ah(null);
    }
  }

  private static boolean a(File paramFile, Certificate[] paramArrayOfCertificate)
  {
    int i;
    if (paramArrayOfCertificate.length > 0)
    {
      i = paramArrayOfCertificate.length - 1;
      if (i < 0);
    }
    while (true)
    {
      try
      {
        bool = AFf.equals(SharePatchFileUtil.cq(paramArrayOfCertificate[i].getEncoded()));
        if (bool)
        {
          bool = true;
          return bool;
        }
      }
      catch (Exception localException)
      {
        paramFile.getAbsolutePath();
        i--;
      }
      break;
      boolean bool = false;
    }
  }

  // ERROR //
  public final boolean aw(File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 107	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ap	(Ljava/io/File;)Z
    //   4: ifne +7 -> 11
    //   7: iconst_0
    //   8: istore_2
    //   9: iload_2
    //   10: ireturn
    //   11: new 109	java/util/jar/JarFile
    //   14: astore_3
    //   15: aload_3
    //   16: aload_1
    //   17: invokespecial 112	java/util/jar/JarFile:<init>	(Ljava/io/File;)V
    //   20: aload_3
    //   21: invokevirtual 116	java/util/jar/JarFile:entries	()Ljava/util/Enumeration;
    //   24: astore 4
    //   26: aload 4
    //   28: invokeinterface 122 1 0
    //   33: ifeq +105 -> 138
    //   36: aload 4
    //   38: invokeinterface 126 1 0
    //   43: checkcast 128	java/util/jar/JarEntry
    //   46: astore 5
    //   48: aload 5
    //   50: ifnull -24 -> 26
    //   53: aload 5
    //   55: invokevirtual 131	java/util/jar/JarEntry:getName	()Ljava/lang/String;
    //   58: astore 6
    //   60: aload 6
    //   62: ldc 133
    //   64: invokevirtual 137	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   67: ifne -41 -> 26
    //   70: aload 6
    //   72: ldc 139
    //   74: invokevirtual 142	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   77: ifeq -51 -> 26
    //   80: aload_0
    //   81: getfield 30	com/tencent/tinker/loader/shareutil/ShareSecurityCheck:AFg	Ljava/util/HashMap;
    //   84: aload 6
    //   86: aload_3
    //   87: aload 5
    //   89: invokestatic 145	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/jar/JarFile;Ljava/util/jar/JarEntry;)Ljava/lang/String;
    //   92: invokevirtual 149	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: pop
    //   96: aload 5
    //   98: invokevirtual 153	java/util/jar/JarEntry:getCertificates	()[Ljava/security/cert/Certificate;
    //   101: astore 5
    //   103: aload 5
    //   105: ifnull +14 -> 119
    //   108: aload_1
    //   109: aload 5
    //   111: invokestatic 155	com/tencent/tinker/loader/shareutil/ShareSecurityCheck:a	(Ljava/io/File;[Ljava/security/cert/Certificate;)Z
    //   114: istore_2
    //   115: iload_2
    //   116: ifne -90 -> 26
    //   119: aload_3
    //   120: invokevirtual 158	java/util/jar/JarFile:close	()V
    //   123: iconst_0
    //   124: istore_2
    //   125: goto -116 -> 9
    //   128: astore 4
    //   130: aload_1
    //   131: invokevirtual 100	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   134: pop
    //   135: goto -12 -> 123
    //   138: aload_3
    //   139: invokevirtual 158	java/util/jar/JarFile:close	()V
    //   142: iconst_1
    //   143: istore_2
    //   144: goto -135 -> 9
    //   147: astore 4
    //   149: aload_1
    //   150: invokevirtual 100	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   153: pop
    //   154: goto -12 -> 142
    //   157: astore_3
    //   158: aconst_null
    //   159: astore 4
    //   161: new 68	com/tencent/tinker/loader/TinkerRuntimeException
    //   164: astore 5
    //   166: aload 5
    //   168: ldc 160
    //   170: iconst_2
    //   171: anewarray 4	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: aload_1
    //   177: invokevirtual 100	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   180: aastore
    //   181: dup
    //   182: iconst_1
    //   183: aload_1
    //   184: invokevirtual 164	java/io/File:length	()J
    //   187: invokestatic 170	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   190: aastore
    //   191: invokestatic 174	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   194: aload_3
    //   195: invokespecial 78	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   198: aload 5
    //   200: athrow
    //   201: astore 5
    //   203: aload 4
    //   205: astore_3
    //   206: aload 5
    //   208: astore 4
    //   210: aload_3
    //   211: ifnull +7 -> 218
    //   214: aload_3
    //   215: invokevirtual 158	java/util/jar/JarFile:close	()V
    //   218: aload 4
    //   220: athrow
    //   221: astore_3
    //   222: aload_1
    //   223: invokevirtual 100	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   226: pop
    //   227: goto -9 -> 218
    //   230: astore 4
    //   232: aconst_null
    //   233: astore_3
    //   234: goto -24 -> 210
    //   237: astore 4
    //   239: goto -29 -> 210
    //   242: astore 5
    //   244: aload_3
    //   245: astore 4
    //   247: aload 5
    //   249: astore_3
    //   250: goto -89 -> 161
    //
    // Exception table:
    //   from	to	target	type
    //   119	123	128	java/io/IOException
    //   138	142	147	java/io/IOException
    //   11	20	157	java/lang/Exception
    //   161	201	201	finally
    //   214	218	221	java/io/IOException
    //   11	20	230	finally
    //   20	26	237	finally
    //   26	48	237	finally
    //   53	103	237	finally
    //   108	115	237	finally
    //   20	26	242	java/lang/Exception
    //   26	48	242	java/lang/Exception
    //   53	103	242	java/lang/Exception
    //   108	115	242	java/lang/Exception
  }

  public final HashMap<String, String> dSo()
  {
    Object localObject;
    if (!this.AFh.isEmpty())
      localObject = this.AFh;
    while (true)
    {
      return localObject;
      localObject = (String)this.AFg.get("assets/package_meta.txt");
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        for (String[] arrayOfString : ((String)localObject).split("\n"))
          if ((arrayOfString != null) && (arrayOfString.length() > 0) && (!arrayOfString.startsWith("#")))
          {
            arrayOfString = arrayOfString.split("=", 2);
            if ((arrayOfString != null) && (arrayOfString.length >= 2))
              this.AFh.put(arrayOfString[0].trim(), arrayOfString[1].trim());
          }
        localObject = this.AFh;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareSecurityCheck
 * JD-Core Version:    0.6.2
 */