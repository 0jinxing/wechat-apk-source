package oicq.wlogin_sdk.request;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.Key;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.sharemem.WloginSimpleInfo;
import oicq.wlogin_sdk.tools.util;

public final class c
{
  TreeMap<Long, WloginAllSigInfo> BUm;
  Context _context;

  public c(Context paramContext)
  {
    AppMethodBeat.i(96415);
    this.BUm = new TreeMap();
    this._context = paramContext;
    AppMethodBeat.o(96415);
  }

  // ERROR //
  private static int a(Context paramContext, String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 39
    //   4: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 41	oicq/wlogin_sdk/request/a
    //   10: astore 4
    //   12: aload 4
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial 44	oicq/wlogin_sdk/request/a:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   19: aload 4
    //   21: invokevirtual 48	oicq/wlogin_sdk/request/a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore_3
    //   25: new 50	java/lang/StringBuilder
    //   28: astore_0
    //   29: aload_0
    //   30: ldc 52
    //   32: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: aload_3
    //   36: aload_0
    //   37: aload_1
    //   38: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc 61
    //   43: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: aload_1
    //   47: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc 63
    //   52: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokevirtual 72	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   61: aload_3
    //   62: aload_1
    //   63: iconst_1
    //   64: anewarray 74	java/lang/String
    //   67: dup
    //   68: iconst_0
    //   69: ldc 76
    //   71: aastore
    //   72: ldc 78
    //   74: aconst_null
    //   75: aconst_null
    //   76: aconst_null
    //   77: aconst_null
    //   78: invokevirtual 82	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   81: astore_0
    //   82: aload_0
    //   83: invokeinterface 88 1 0
    //   88: ifne +59 -> 147
    //   91: new 50	java/lang/StringBuilder
    //   94: astore 5
    //   96: aload 5
    //   98: ldc 90
    //   100: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   103: aload_3
    //   104: aload 5
    //   106: aload_1
    //   107: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: ldc 92
    //   112: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: aload_1
    //   116: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: ldc 94
    //   121: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: iconst_2
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: iconst_1
    //   141: newarray byte
    //   143: aastore
    //   144: invokevirtual 103	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: new 50	java/lang/StringBuilder
    //   150: astore 5
    //   152: aload 5
    //   154: ldc 105
    //   156: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   159: aload_3
    //   160: aload 5
    //   162: aload_1
    //   163: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: ldc 107
    //   168: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload_1
    //   172: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: ldc 109
    //   177: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: iconst_1
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload_2
    //   190: aastore
    //   191: invokevirtual 103	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_0
    //   195: invokeinterface 112 1 0
    //   200: aload 4
    //   202: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   205: ldc 39
    //   207: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: iconst_0
    //   211: istore 6
    //   213: iload 6
    //   215: ireturn
    //   216: astore_0
    //   217: aload_3
    //   218: astore_1
    //   219: aload_0
    //   220: astore_2
    //   221: aload_2
    //   222: invokestatic 119	oicq/wlogin_sdk/tools/util:l	(Ljava/lang/Exception;)V
    //   225: aload_1
    //   226: ifnull +7 -> 233
    //   229: aload_1
    //   230: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   233: ldc 39
    //   235: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: sipush -1022
    //   241: istore 6
    //   243: goto -30 -> 213
    //   246: astore_0
    //   247: aload_0
    //   248: invokestatic 119	oicq/wlogin_sdk/tools/util:l	(Ljava/lang/Exception;)V
    //   251: aload 4
    //   253: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   256: ldc 39
    //   258: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: sipush -1022
    //   264: istore 6
    //   266: goto -53 -> 213
    //   269: astore_0
    //   270: aload_0
    //   271: invokestatic 119	oicq/wlogin_sdk/tools/util:l	(Ljava/lang/Exception;)V
    //   274: aload 4
    //   276: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   279: ldc 39
    //   281: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   284: sipush -1022
    //   287: istore 6
    //   289: goto -76 -> 213
    //   292: astore_1
    //   293: aload_1
    //   294: invokestatic 119	oicq/wlogin_sdk/tools/util:l	(Ljava/lang/Exception;)V
    //   297: aload_0
    //   298: invokeinterface 112 1 0
    //   303: aload 4
    //   305: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   308: ldc 39
    //   310: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   313: sipush -1022
    //   316: istore 6
    //   318: goto -105 -> 213
    //   321: astore_1
    //   322: aload_1
    //   323: invokestatic 119	oicq/wlogin_sdk/tools/util:l	(Ljava/lang/Exception;)V
    //   326: aload_0
    //   327: invokeinterface 112 1 0
    //   332: aload 4
    //   334: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   337: ldc 39
    //   339: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   342: sipush -1022
    //   345: istore 6
    //   347: goto -134 -> 213
    //   350: astore_1
    //   351: aload 4
    //   353: astore_0
    //   354: aload_1
    //   355: astore_2
    //   356: aload_0
    //   357: astore_1
    //   358: goto -137 -> 221
    //
    // Exception table:
    //   from	to	target	type
    //   7	19	216	java/lang/Exception
    //   25	61	246	android/database/SQLException
    //   61	82	269	android/database/SQLException
    //   91	147	292	android/database/SQLException
    //   147	194	321	android/database/SQLException
    //   19	25	350	java/lang/Exception
  }

  private int a(TreeMap paramTreeMap, String paramString)
  {
    try
    {
      AppMethodBeat.i(96420);
      int i = 0;
      if (paramString == "tk_file")
        i = b(paramTreeMap, paramString);
      AppMethodBeat.o(96420);
      return i;
    }
    finally
    {
    }
    throw paramTreeMap;
  }

  private int b(TreeMap paramTreeMap, String paramString)
  {
    try
    {
      AppMethodBeat.i(96421);
      try
      {
        Object localObject1 = new javax/crypto/spec/SecretKeySpec;
        ((SecretKeySpec)localObject1).<init>(i.BUO, "DESede");
        Object localObject2 = Cipher.getInstance("DESede");
        ((Cipher)localObject2).init(1, (Key)localObject1);
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        localObject1 = new javax/crypto/CipherOutputStream;
        ((CipherOutputStream)localObject1).<init>(localByteArrayOutputStream, (Cipher)localObject2);
        localObject2 = new java/io/ObjectOutputStream;
        ((ObjectOutputStream)localObject2).<init>((OutputStream)localObject1);
        ((ObjectOutputStream)localObject2).writeObject(paramTreeMap);
        ((ObjectOutputStream)localObject2).close();
        i = a(this._context, paramString, localByteArrayOutputStream.toByteArray());
        AppMethodBeat.o(96421);
        return i;
      }
      catch (Exception localException)
      {
        while (true)
        {
          paramTreeMap = new java/io/StringWriter;
          paramTreeMap.<init>();
          paramString = new java/io/PrintWriter;
          paramString.<init>(paramTreeMap, true);
          localException.printStackTrace(paramString);
          paramString.flush();
          paramTreeMap.flush();
          util.ji("exception", paramTreeMap.toString());
          int i = -1022;
        }
      }
    }
    finally
    {
    }
    throw paramTreeMap;
  }

  // ERROR //
  private static TreeMap cj(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 200
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aload_1
    //   7: invokestatic 204	oicq/wlogin_sdk/request/c:ck	(Landroid/content/Context;Ljava/lang/String;)[B
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull +626 -> 638
    //   15: new 129	javax/crypto/spec/SecretKeySpec
    //   18: astore_1
    //   19: aload_1
    //   20: getstatic 135	oicq/wlogin_sdk/request/i:BUO	[B
    //   23: ldc 137
    //   25: invokespecial 140	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   28: ldc 137
    //   30: invokestatic 146	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   33: astore_3
    //   34: aload_3
    //   35: iconst_2
    //   36: aload_1
    //   37: invokevirtual 150	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   40: new 206	java/io/ByteArrayInputStream
    //   43: astore 4
    //   45: aload 4
    //   47: aload_2
    //   48: invokespecial 209	java/io/ByteArrayInputStream:<init>	([B)V
    //   51: new 211	javax/crypto/CipherInputStream
    //   54: astore_1
    //   55: aload_1
    //   56: aload 4
    //   58: aload_3
    //   59: invokespecial 214	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   62: new 216	java/io/ObjectInputStream
    //   65: astore_3
    //   66: aload_3
    //   67: aload_1
    //   68: invokespecial 219	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   71: aload_3
    //   72: invokevirtual 223	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   75: checkcast 23	java/util/TreeMap
    //   78: astore_1
    //   79: aload_1
    //   80: ifnull +553 -> 633
    //   83: aload_3
    //   84: invokevirtual 224	java/io/ObjectInputStream:close	()V
    //   87: ldc 200
    //   89: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_1
    //   93: astore_0
    //   94: aload_0
    //   95: areturn
    //   96: astore_3
    //   97: aconst_null
    //   98: astore_1
    //   99: new 176	java/io/StringWriter
    //   102: dup
    //   103: invokespecial 177	java/io/StringWriter:<init>	()V
    //   106: astore 4
    //   108: new 179	java/io/PrintWriter
    //   111: dup
    //   112: aload 4
    //   114: iconst_1
    //   115: invokespecial 182	java/io/PrintWriter:<init>	(Ljava/io/Writer;Z)V
    //   118: astore 5
    //   120: aload_3
    //   121: aload 5
    //   123: invokevirtual 186	java/lang/Exception:printStackTrace	(Ljava/io/PrintWriter;)V
    //   126: aload 5
    //   128: invokevirtual 189	java/io/PrintWriter:flush	()V
    //   131: aload 4
    //   133: invokevirtual 190	java/io/StringWriter:flush	()V
    //   136: ldc 192
    //   138: aload 4
    //   140: invokevirtual 193	java/io/StringWriter:toString	()Ljava/lang/String;
    //   143: invokestatic 197	oicq/wlogin_sdk/tools/util:ji	(Ljava/lang/String;Ljava/lang/String;)V
    //   146: aload_1
    //   147: astore_3
    //   148: aload_0
    //   149: invokestatic 228	oicq/wlogin_sdk/tools/util:jJ	(Landroid/content/Context;)[B
    //   152: astore 4
    //   154: aload_3
    //   155: astore_1
    //   156: aload 4
    //   158: ifnull +108 -> 266
    //   161: aload_3
    //   162: astore_1
    //   163: aload 4
    //   165: arraylength
    //   166: ifle +100 -> 266
    //   169: new 129	javax/crypto/spec/SecretKeySpec
    //   172: astore_1
    //   173: aload_1
    //   174: aload 4
    //   176: ldc 137
    //   178: invokespecial 140	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   181: ldc 137
    //   183: invokestatic 146	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   186: astore 4
    //   188: aload 4
    //   190: iconst_2
    //   191: aload_1
    //   192: invokevirtual 150	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   195: new 206	java/io/ByteArrayInputStream
    //   198: astore 5
    //   200: aload 5
    //   202: aload_2
    //   203: invokespecial 209	java/io/ByteArrayInputStream:<init>	([B)V
    //   206: new 211	javax/crypto/CipherInputStream
    //   209: astore_1
    //   210: aload_1
    //   211: aload 5
    //   213: aload 4
    //   215: invokespecial 214	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   218: new 216	java/io/ObjectInputStream
    //   221: astore 5
    //   223: aload 5
    //   225: aload_1
    //   226: invokespecial 219	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   229: aload 5
    //   231: invokevirtual 223	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   234: checkcast 23	java/util/TreeMap
    //   237: astore 4
    //   239: aload 4
    //   241: astore_1
    //   242: aload 4
    //   244: ifnull +22 -> 266
    //   247: aload 5
    //   249: invokevirtual 224	java/io/ObjectInputStream:close	()V
    //   252: ldc 200
    //   254: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: aload 4
    //   259: astore_0
    //   260: goto -166 -> 94
    //   263: astore_1
    //   264: aload_3
    //   265: astore_1
    //   266: aload_0
    //   267: invokestatic 231	oicq/wlogin_sdk/tools/util:jI	(Landroid/content/Context;)[B
    //   270: astore 4
    //   272: aload_1
    //   273: astore_3
    //   274: aload 4
    //   276: ifnull +107 -> 383
    //   279: aload_1
    //   280: astore_3
    //   281: aload 4
    //   283: arraylength
    //   284: ifle +99 -> 383
    //   287: new 129	javax/crypto/spec/SecretKeySpec
    //   290: astore_3
    //   291: aload_3
    //   292: aload 4
    //   294: invokestatic 237	oicq/wlogin_sdk/tools/c:cM	([B)[B
    //   297: ldc 137
    //   299: invokespecial 140	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   302: ldc 137
    //   304: invokestatic 146	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   307: astore 4
    //   309: aload 4
    //   311: iconst_2
    //   312: aload_3
    //   313: invokevirtual 150	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   316: new 206	java/io/ByteArrayInputStream
    //   319: astore 5
    //   321: aload 5
    //   323: aload_2
    //   324: invokespecial 209	java/io/ByteArrayInputStream:<init>	([B)V
    //   327: new 211	javax/crypto/CipherInputStream
    //   330: astore_3
    //   331: aload_3
    //   332: aload 5
    //   334: aload 4
    //   336: invokespecial 214	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   339: new 216	java/io/ObjectInputStream
    //   342: astore 4
    //   344: aload 4
    //   346: aload_3
    //   347: invokespecial 219	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   350: aload 4
    //   352: invokevirtual 223	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   355: checkcast 23	java/util/TreeMap
    //   358: astore_3
    //   359: aload_3
    //   360: astore_1
    //   361: aload_3
    //   362: ifnull +19 -> 381
    //   365: aload 4
    //   367: invokevirtual 224	java/io/ObjectInputStream:close	()V
    //   370: ldc 200
    //   372: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   375: aload_3
    //   376: astore_0
    //   377: goto -283 -> 94
    //   380: astore_3
    //   381: aload_1
    //   382: astore_3
    //   383: aload_0
    //   384: invokestatic 240	oicq/wlogin_sdk/tools/util:jH	(Landroid/content/Context;)[B
    //   387: astore_1
    //   388: aload_3
    //   389: astore_0
    //   390: aload_1
    //   391: ifnull +105 -> 496
    //   394: aload_3
    //   395: astore_0
    //   396: aload_1
    //   397: arraylength
    //   398: ifle +98 -> 496
    //   401: new 129	javax/crypto/spec/SecretKeySpec
    //   404: astore 4
    //   406: aload 4
    //   408: aload_1
    //   409: invokestatic 237	oicq/wlogin_sdk/tools/c:cM	([B)[B
    //   412: ldc 137
    //   414: invokespecial 140	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   417: ldc 137
    //   419: invokestatic 146	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   422: astore_0
    //   423: aload_0
    //   424: iconst_2
    //   425: aload 4
    //   427: invokevirtual 150	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   430: new 206	java/io/ByteArrayInputStream
    //   433: astore 4
    //   435: aload 4
    //   437: aload_2
    //   438: invokespecial 209	java/io/ByteArrayInputStream:<init>	([B)V
    //   441: new 211	javax/crypto/CipherInputStream
    //   444: astore_1
    //   445: aload_1
    //   446: aload 4
    //   448: aload_0
    //   449: invokespecial 214	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   452: new 216	java/io/ObjectInputStream
    //   455: astore 4
    //   457: aload 4
    //   459: aload_1
    //   460: invokespecial 219	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   463: aload 4
    //   465: invokevirtual 223	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   468: checkcast 23	java/util/TreeMap
    //   471: astore_1
    //   472: aload_1
    //   473: astore_0
    //   474: aload_1
    //   475: ifnull +21 -> 496
    //   478: aload 4
    //   480: invokevirtual 224	java/io/ObjectInputStream:close	()V
    //   483: ldc 200
    //   485: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   488: aload_1
    //   489: astore_0
    //   490: goto -396 -> 94
    //   493: astore_0
    //   494: aload_3
    //   495: astore_0
    //   496: new 129	javax/crypto/spec/SecretKeySpec
    //   499: astore_3
    //   500: new 74	java/lang/String
    //   503: astore_1
    //   504: aload_1
    //   505: ldc 242
    //   507: invokespecial 243	java/lang/String:<init>	(Ljava/lang/String;)V
    //   510: aload_3
    //   511: aload_1
    //   512: invokevirtual 246	java/lang/String:getBytes	()[B
    //   515: ldc 137
    //   517: invokespecial 140	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   520: ldc 137
    //   522: invokestatic 146	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   525: astore_1
    //   526: aload_1
    //   527: iconst_2
    //   528: aload_3
    //   529: invokevirtual 150	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   532: new 206	java/io/ByteArrayInputStream
    //   535: astore 4
    //   537: aload 4
    //   539: aload_2
    //   540: invokespecial 209	java/io/ByteArrayInputStream:<init>	([B)V
    //   543: new 211	javax/crypto/CipherInputStream
    //   546: astore_3
    //   547: aload_3
    //   548: aload 4
    //   550: aload_1
    //   551: invokespecial 214	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   554: new 216	java/io/ObjectInputStream
    //   557: astore 4
    //   559: aload 4
    //   561: aload_3
    //   562: invokespecial 219	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   565: aload 4
    //   567: invokevirtual 223	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   570: checkcast 23	java/util/TreeMap
    //   573: astore_1
    //   574: aload_1
    //   575: astore_0
    //   576: aload_1
    //   577: ifnull +19 -> 596
    //   580: aload 4
    //   582: invokevirtual 224	java/io/ObjectInputStream:close	()V
    //   585: ldc 200
    //   587: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   590: aload_1
    //   591: astore_0
    //   592: goto -498 -> 94
    //   595: astore_1
    //   596: ldc 200
    //   598: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   601: goto -507 -> 94
    //   604: astore_0
    //   605: aload_1
    //   606: astore_0
    //   607: goto -11 -> 596
    //   610: astore_0
    //   611: aload_1
    //   612: astore_0
    //   613: goto -117 -> 496
    //   616: astore_1
    //   617: aload_3
    //   618: astore_1
    //   619: goto -238 -> 381
    //   622: astore_1
    //   623: aload 4
    //   625: astore_1
    //   626: goto -360 -> 266
    //   629: astore_3
    //   630: goto -531 -> 99
    //   633: aload_1
    //   634: astore_3
    //   635: goto -487 -> 148
    //   638: aconst_null
    //   639: astore_0
    //   640: goto -44 -> 596
    //
    // Exception table:
    //   from	to	target	type
    //   15	79	96	java/lang/Exception
    //   148	154	263	java/lang/Exception
    //   163	239	263	java/lang/Exception
    //   266	272	380	java/lang/Exception
    //   281	359	380	java/lang/Exception
    //   383	388	493	java/lang/Exception
    //   396	472	493	java/lang/Exception
    //   496	574	595	java/lang/Exception
    //   580	585	604	java/lang/Exception
    //   478	483	610	java/lang/Exception
    //   365	370	616	java/lang/Exception
    //   247	252	622	java/lang/Exception
    //   83	87	629	java/lang/Exception
  }

  // ERROR //
  private static byte[] ck(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 247
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 253	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   8: astore_2
    //   9: new 41	oicq/wlogin_sdk/request/a
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial 44	oicq/wlogin_sdk/request/a:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   19: aload_3
    //   20: invokevirtual 256	oicq/wlogin_sdk/request/a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore 4
    //   25: new 50	java/lang/StringBuilder
    //   28: astore_0
    //   29: aload_0
    //   30: ldc_w 258
    //   33: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   36: aload 4
    //   38: aload_0
    //   39: aload_1
    //   40: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: ldc_w 260
    //   46: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: aconst_null
    //   53: invokevirtual 264	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore 5
    //   58: aload_2
    //   59: astore_0
    //   60: aload 5
    //   62: invokeinterface 268 1 0
    //   67: ifeq +20 -> 87
    //   70: aload_2
    //   71: astore_0
    //   72: aload 5
    //   74: iconst_0
    //   75: invokeinterface 272 2 0
    //   80: ifle +7 -> 87
    //   83: getstatic 275	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   86: astore_0
    //   87: aload 5
    //   89: ifnull +20 -> 109
    //   92: aload 5
    //   94: invokeinterface 278 1 0
    //   99: ifne +10 -> 109
    //   102: aload 5
    //   104: invokeinterface 112 1 0
    //   109: aload_0
    //   110: invokevirtual 281	java/lang/Boolean:booleanValue	()Z
    //   113: ifne +41 -> 154
    //   116: aload_3
    //   117: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   120: ldc 247
    //   122: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: aconst_null
    //   126: astore_0
    //   127: aload_0
    //   128: areturn
    //   129: astore_1
    //   130: aconst_null
    //   131: astore_0
    //   132: aload_1
    //   133: invokestatic 119	oicq/wlogin_sdk/tools/util:l	(Ljava/lang/Exception;)V
    //   136: aload_0
    //   137: ifnull +7 -> 144
    //   140: aload_0
    //   141: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   144: ldc 247
    //   146: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aconst_null
    //   150: astore_0
    //   151: goto -24 -> 127
    //   154: aload 4
    //   156: aload_1
    //   157: iconst_1
    //   158: anewarray 74	java/lang/String
    //   161: dup
    //   162: iconst_0
    //   163: aload_1
    //   164: aastore
    //   165: ldc 78
    //   167: aconst_null
    //   168: aconst_null
    //   169: aconst_null
    //   170: aconst_null
    //   171: invokevirtual 82	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   174: astore_1
    //   175: aload_1
    //   176: invokeinterface 88 1 0
    //   181: ifne +67 -> 248
    //   184: aload_1
    //   185: invokeinterface 112 1 0
    //   190: aload_3
    //   191: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   194: ldc 247
    //   196: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: aconst_null
    //   200: astore_0
    //   201: goto -74 -> 127
    //   204: astore_0
    //   205: aconst_null
    //   206: astore_1
    //   207: aload_0
    //   208: astore 5
    //   210: aload 5
    //   212: invokestatic 119	oicq/wlogin_sdk/tools/util:l	(Ljava/lang/Exception;)V
    //   215: aload_1
    //   216: ifnull +18 -> 234
    //   219: aload_1
    //   220: invokeinterface 278 1 0
    //   225: ifne +9 -> 234
    //   228: aload_1
    //   229: invokeinterface 112 1 0
    //   234: aload_3
    //   235: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   238: ldc 247
    //   240: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: aconst_null
    //   244: astore_0
    //   245: goto -118 -> 127
    //   248: aload_1
    //   249: invokeinterface 284 1 0
    //   254: pop
    //   255: aload_1
    //   256: iconst_0
    //   257: invokeinterface 288 2 0
    //   262: astore_0
    //   263: aload_1
    //   264: invokeinterface 112 1 0
    //   269: aload_3
    //   270: invokevirtual 113	oicq/wlogin_sdk/request/a:close	()V
    //   273: ldc 247
    //   275: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   278: goto -151 -> 127
    //   281: astore_1
    //   282: aload 5
    //   284: astore_0
    //   285: aload_1
    //   286: astore 5
    //   288: aload_0
    //   289: astore_1
    //   290: goto -80 -> 210
    //   293: astore_1
    //   294: aload_3
    //   295: astore_0
    //   296: goto -164 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   9	19	129	java/lang/Exception
    //   25	58	204	android/database/SQLException
    //   60	70	281	android/database/SQLException
    //   72	87	281	android/database/SQLException
    //   92	109	281	android/database/SQLException
    //   109	120	281	android/database/SQLException
    //   154	175	281	android/database/SQLException
    //   19	25	293	java/lang/Exception
  }

  private WloginAllSigInfo of(long paramLong)
  {
    try
    {
      AppMethodBeat.i(96417);
      util.jh("get_all_siginfo", "uin=".concat(String.valueOf(paramLong)));
      Object localObject1 = this.BUm;
      Object localObject3 = new java/lang/Long;
      ((Long)localObject3).<init>(paramLong);
      localObject1 = (WloginAllSigInfo)((TreeMap)localObject1).get(localObject3);
      if (localObject1 != null)
        AppMethodBeat.o(96417);
      while (true)
      {
        return localObject1;
        if (this._context == null)
        {
          AppMethodBeat.o(96417);
          localObject1 = null;
        }
        else
        {
          localObject1 = cj(this._context, "tk_file");
          if (localObject1 == null)
          {
            AppMethodBeat.o(96417);
            localObject1 = null;
          }
          else
          {
            localObject3 = new java/lang/Long;
            ((Long)localObject3).<init>(paramLong);
            WloginAllSigInfo localWloginAllSigInfo = (WloginAllSigInfo)((TreeMap)localObject1).get(localObject3);
            if (localWloginAllSigInfo == null)
            {
              util.jh("get_all_siginfo", "null");
              AppMethodBeat.o(96417);
              localObject1 = null;
            }
            else
            {
              localObject3 = this.BUm;
              localObject1 = new java/lang/Long;
              ((Long)localObject1).<init>(paramLong);
              ((TreeMap)localObject3).put(localObject1, localWloginAllSigInfo);
              localObject1 = localWloginAllSigInfo.get_clone();
              AppMethodBeat.o(96417);
            }
          }
        }
      }
    }
    finally
    {
    }
  }

  public final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, byte[] paramArrayOfByte10, byte[] paramArrayOfByte11, byte[] paramArrayOfByte12, byte[] paramArrayOfByte13, byte[] paramArrayOfByte14, byte[] paramArrayOfByte15, byte[] paramArrayOfByte16, byte[][] paramArrayOfByte)
  {
    label387: 
    while (true)
    {
      try
      {
        AppMethodBeat.i(96416);
        localObject1 = this.BUm;
        Object localObject2 = new java/lang/Long;
        ((Long)localObject2).<init>(paramLong1);
        localObject2 = (WloginAllSigInfo)((TreeMap)localObject1).get(localObject2);
        if (localObject2 != null)
          break label387;
        localObject2 = new oicq/wlogin_sdk/request/WloginAllSigInfo;
        ((WloginAllSigInfo)localObject2).<init>();
        localObject1 = ((WloginAllSigInfo)localObject2)._tk_map;
        Object localObject3 = new java/lang/Long;
        ((Long)localObject3).<init>(paramLong2);
        localObject1 = (WloginSigInfo)((TreeMap)localObject1).get(localObject3);
        if ((localObject1 != null) && (((WloginSigInfo)localObject1)._en_A1 != null))
        {
          localObject1 = (byte[])((WloginSigInfo)localObject1)._en_A1.clone();
          localObject3 = new oicq/wlogin_sdk/sharemem/WloginSimpleInfo;
          ((WloginSimpleInfo)localObject3).<init>(paramLong1, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3, paramArrayOfByte4);
          ((WloginAllSigInfo)localObject2)._useInfo = ((WloginSimpleInfo)localObject3);
          int i = ((WloginAllSigInfo)localObject2).put_siginfo(paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramArrayOfByte5, paramArrayOfByte6, paramArrayOfByte7, paramArrayOfByte8, paramArrayOfByte9, paramArrayOfByte10, paramArrayOfByte11, paramArrayOfByte12, paramArrayOfByte13, paramArrayOfByte14, paramArrayOfByte15, paramArrayOfByte16, paramArrayOfByte);
          util.awF("before put_siginfo, ret=".concat(String.valueOf(i)));
          if (this._context != null)
          {
            paramArrayOfByte2 = cj(this._context, "tk_file");
            paramArrayOfByte1 = paramArrayOfByte2;
            if (paramArrayOfByte2 == null)
            {
              paramArrayOfByte1 = new java/util/TreeMap;
              paramArrayOfByte1.<init>();
            }
            util.awF("after loadTKTreeMap");
            paramArrayOfByte2 = new java/lang/Long;
            paramArrayOfByte2.<init>(paramLong1);
            paramArrayOfByte1.put(paramArrayOfByte2, ((WloginAllSigInfo)localObject2).get_clone());
            i = a(paramArrayOfByte1, "tk_file");
            util.awF("after refreshTKTreeMap, ret=".concat(String.valueOf(i)));
          }
          if (i != 0)
          {
            paramArrayOfByte2 = ((WloginAllSigInfo)localObject2)._tk_map;
            paramArrayOfByte1 = new java/lang/Long;
            paramArrayOfByte1.<init>(paramLong2);
            paramArrayOfByte1 = (WloginSigInfo)paramArrayOfByte2.get(paramArrayOfByte1);
            if (paramArrayOfByte1 != null)
              paramArrayOfByte1._en_A1 = ((byte[])((byte[])localObject1).clone());
          }
          paramArrayOfByte1 = this.BUm;
          paramArrayOfByte2 = new java/lang/Long;
          paramArrayOfByte2.<init>(paramLong1);
          paramArrayOfByte1.put(paramArrayOfByte2, localObject2);
          AppMethodBeat.o(96416);
          return i;
        }
      }
      finally
      {
      }
      Object localObject1 = new byte[0];
    }
  }

  public final void i(Long paramLong)
  {
    try
    {
      AppMethodBeat.i(96419);
      this.BUm.remove(paramLong);
      TreeMap localTreeMap;
      if (this._context != null)
      {
        localTreeMap = cj(this._context, "tk_file");
        if (localTreeMap == null)
          AppMethodBeat.o(96419);
      }
      while (true)
      {
        return;
        localTreeMap.remove(paramLong);
        a(localTreeMap, "tk_file");
        AppMethodBeat.o(96419);
      }
    }
    finally
    {
    }
    throw paramLong;
  }

  public final WloginSigInfo og(long paramLong)
  {
    try
    {
      AppMethodBeat.i(96418);
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("uin=");
      util.jh("get_siginfo", paramLong + "appid=522017402");
      localObject1 = of(paramLong);
      if (localObject1 == null)
      {
        AppMethodBeat.o(96418);
        localObject1 = null;
      }
      while (true)
      {
        return localObject1;
        localObject1 = (WloginSigInfo)((WloginAllSigInfo)localObject1)._tk_map.get(Long.valueOf(522017402L));
        if (localObject1 == null)
        {
          AppMethodBeat.o(96418);
          localObject1 = null;
        }
        else
        {
          AppMethodBeat.o(96418);
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.request.c
 * JD-Core Version:    0.6.2
 */