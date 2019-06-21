package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

public final class e
{
  int mcA;
  e.a mcE;
  String mct;
  float mcu;
  int mcz;
  int orientation;

  public e(String paramString, float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(705);
    this.mct = paramString;
    this.mcu = paramFloat;
    this.orientation = paramInt1;
    this.mcz = paramInt2;
    this.mcA = paramInt3;
    ab.i("MicroMsg.FaceCheckVideoRecordMgr", "create FaceCheckVideoRecordMgr, reductionRatio: %s, orientation: %s, cameraFrameWidth: %s, cameraFrameHeight: %s", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(705);
  }

  // ERROR //
  static void R(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: sipush 706
    //   3: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 70	java/io/File
    //   9: dup
    //   10: aload_1
    //   11: invokespecial 73	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore_3
    //   15: new 70	java/io/File
    //   18: dup
    //   19: aload_2
    //   20: invokespecial 73	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: astore_1
    //   24: aload_3
    //   25: invokevirtual 77	java/io/File:exists	()Z
    //   28: ifeq +289 -> 317
    //   31: aload_3
    //   32: invokevirtual 80	java/io/File:isFile	()Z
    //   35: ifeq +282 -> 317
    //   38: aload_1
    //   39: invokevirtual 84	java/io/File:getParentFile	()Ljava/io/File;
    //   42: invokevirtual 77	java/io/File:exists	()Z
    //   45: ifne +11 -> 56
    //   48: aload_1
    //   49: invokevirtual 84	java/io/File:getParentFile	()Ljava/io/File;
    //   52: invokevirtual 87	java/io/File:mkdirs	()Z
    //   55: pop
    //   56: aload_1
    //   57: invokevirtual 90	java/io/File:createNewFile	()Z
    //   60: pop
    //   61: new 92	java/io/FileInputStream
    //   64: astore 4
    //   66: aload 4
    //   68: aload_3
    //   69: invokespecial 95	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   72: new 97	java/io/FileOutputStream
    //   75: astore_2
    //   76: aload_2
    //   77: aload_1
    //   78: invokespecial 98	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   81: aload_0
    //   82: ldc 100
    //   84: invokevirtual 106	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   87: astore_1
    //   88: new 108	javax/crypto/spec/SecretKeySpec
    //   91: astore_3
    //   92: aload_3
    //   93: aload_1
    //   94: ldc 110
    //   96: invokespecial 113	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   99: aload_3
    //   100: invokeinterface 119 1 0
    //   105: astore_1
    //   106: new 108	javax/crypto/spec/SecretKeySpec
    //   109: astore_3
    //   110: aload_3
    //   111: aload_1
    //   112: ldc 110
    //   114: invokespecial 113	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   117: ldc 121
    //   119: invokestatic 127	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   122: astore_1
    //   123: new 129	javax/crypto/spec/IvParameterSpec
    //   126: astore 5
    //   128: aload 5
    //   130: aload_0
    //   131: invokevirtual 131	java/lang/String:getBytes	()[B
    //   134: invokespecial 134	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   137: aload_1
    //   138: iconst_1
    //   139: aload_3
    //   140: aload 5
    //   142: invokevirtual 138	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   145: new 140	javax/crypto/CipherInputStream
    //   148: astore_0
    //   149: aload_0
    //   150: aload 4
    //   152: aload_1
    //   153: invokespecial 143	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   156: aload_2
    //   157: astore_3
    //   158: aload 4
    //   160: astore 5
    //   162: aload_0
    //   163: astore 6
    //   165: sipush 1024
    //   168: newarray byte
    //   170: astore_1
    //   171: aload_2
    //   172: astore_3
    //   173: aload 4
    //   175: astore 5
    //   177: aload_0
    //   178: astore 6
    //   180: aload_0
    //   181: aload_1
    //   182: invokevirtual 147	javax/crypto/CipherInputStream:read	([B)I
    //   185: istore 7
    //   187: iload 7
    //   189: iconst_m1
    //   190: if_icmpeq +107 -> 297
    //   193: aload_2
    //   194: astore_3
    //   195: aload 4
    //   197: astore 5
    //   199: aload_0
    //   200: astore 6
    //   202: aload_2
    //   203: aload_1
    //   204: iconst_0
    //   205: iload 7
    //   207: invokevirtual 153	java/io/OutputStream:write	([BII)V
    //   210: aload_2
    //   211: astore_3
    //   212: aload 4
    //   214: astore 5
    //   216: aload_0
    //   217: astore 6
    //   219: aload_2
    //   220: invokevirtual 156	java/io/OutputStream:flush	()V
    //   223: goto -52 -> 171
    //   226: astore_1
    //   227: aload_2
    //   228: astore_3
    //   229: aload 4
    //   231: astore 5
    //   233: aload_0
    //   234: astore 6
    //   236: sipush 706
    //   239: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: aload_2
    //   243: astore_3
    //   244: aload 4
    //   246: astore 5
    //   248: aload_0
    //   249: astore 6
    //   251: aload_1
    //   252: athrow
    //   253: astore_0
    //   254: aload 6
    //   256: astore_2
    //   257: aload 5
    //   259: astore 4
    //   261: aload_3
    //   262: astore_1
    //   263: aload_1
    //   264: ifnull +7 -> 271
    //   267: aload_1
    //   268: invokevirtual 159	java/io/OutputStream:close	()V
    //   271: aload_2
    //   272: ifnull +7 -> 279
    //   275: aload_2
    //   276: invokevirtual 160	javax/crypto/CipherInputStream:close	()V
    //   279: aload 4
    //   281: ifnull +8 -> 289
    //   284: aload 4
    //   286: invokevirtual 163	java/io/InputStream:close	()V
    //   289: sipush 706
    //   292: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: aload_0
    //   296: athrow
    //   297: aload_2
    //   298: invokevirtual 159	java/io/OutputStream:close	()V
    //   301: aload_0
    //   302: invokevirtual 160	javax/crypto/CipherInputStream:close	()V
    //   305: aload 4
    //   307: invokevirtual 163	java/io/InputStream:close	()V
    //   310: sipush 706
    //   313: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   316: return
    //   317: sipush 706
    //   320: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   323: goto -7 -> 316
    //   326: astore_0
    //   327: aconst_null
    //   328: astore_1
    //   329: aconst_null
    //   330: astore 4
    //   332: aconst_null
    //   333: astore_2
    //   334: goto -71 -> 263
    //   337: astore_0
    //   338: aconst_null
    //   339: astore_1
    //   340: aconst_null
    //   341: astore_2
    //   342: goto -79 -> 263
    //   345: astore_0
    //   346: aconst_null
    //   347: astore_3
    //   348: aload_2
    //   349: astore_1
    //   350: aload_3
    //   351: astore_2
    //   352: goto -89 -> 263
    //   355: astore_1
    //   356: aconst_null
    //   357: astore_2
    //   358: aconst_null
    //   359: astore 4
    //   361: aconst_null
    //   362: astore_0
    //   363: goto -136 -> 227
    //   366: astore_1
    //   367: aconst_null
    //   368: astore_2
    //   369: aconst_null
    //   370: astore_0
    //   371: goto -144 -> 227
    //   374: astore_1
    //   375: aconst_null
    //   376: astore_0
    //   377: goto -150 -> 227
    //
    // Exception table:
    //   from	to	target	type
    //   165	171	226	java/lang/Exception
    //   180	187	226	java/lang/Exception
    //   202	210	226	java/lang/Exception
    //   219	223	226	java/lang/Exception
    //   165	171	253	finally
    //   180	187	253	finally
    //   202	210	253	finally
    //   219	223	253	finally
    //   236	242	253	finally
    //   251	253	253	finally
    //   61	72	326	finally
    //   72	81	337	finally
    //   81	156	345	finally
    //   61	72	355	java/lang/Exception
    //   72	81	366	java/lang/Exception
    //   81	156	374	java/lang/Exception
  }

  final class b
    implements g.a
  {
    private String fileName;
    private String mct;

    private b(String paramString1, String arg3)
    {
      Object localObject;
      this.mct = localObject;
      this.fileName = paramString1;
    }

    public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
    {
      AppMethodBeat.i(704);
      ab.i("MicroMsg.FaceCheckVideoRecordMgr", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
      if ((paramd != null) && (paramd.field_retCode == 0))
      {
        ab.i("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video done. now upload");
        paramString = e.this;
        String str = this.fileName;
        paramc = paramd.field_fileId;
        paramd = paramd.field_aesKey;
        if (paramString.mcE != null)
          paramString.mcE.Q(str, paramc, paramd);
        AppMethodBeat.o(704);
      }
      while (true)
      {
        return 0;
        if (paramd != null)
        {
          ab.w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
          com.tencent.mm.a.e.deleteFile(this.fileName);
          h.pYm.a(917L, 51L, 1L, false);
          if (e.this.mcE != null)
            e.this.mcE.onError();
          AppMethodBeat.o(704);
        }
        else
        {
          if (paramInt == 0)
            break;
          ab.w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
          h.pYm.a(917L, 51L, 1L, false);
          com.tencent.mm.a.e.deleteFile(this.fileName);
          if (e.this.mcE != null)
            e.this.mcE.onError();
          AppMethodBeat.o(704);
        }
      }
    }

    public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
    {
    }

    public final byte[] l(String paramString, byte[] paramArrayOfByte)
    {
      return new byte[0];
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.e
 * JD-Core Version:    0.6.2
 */