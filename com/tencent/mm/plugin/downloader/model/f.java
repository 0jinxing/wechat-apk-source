package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;

public final class f
{
  // ERROR //
  public static String Iy(String paramString)
  {
    // Byte code:
    //   0: sipush 2450
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aconst_null
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: aload_1
    //   11: astore_3
    //   12: new 16	java/net/URL
    //   15: astore 4
    //   17: aload_1
    //   18: astore_3
    //   19: aload 4
    //   21: aload_0
    //   22: invokespecial 20	java/net/URL:<init>	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: astore_3
    //   27: aload 4
    //   29: invokevirtual 24	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   32: checkcast 26	java/net/HttpURLConnection
    //   35: astore_0
    //   36: aload_0
    //   37: ifnull +69 -> 106
    //   40: aload_0
    //   41: sipush 1000
    //   44: invokevirtual 29	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   47: aload_0
    //   48: iconst_0
    //   49: invokevirtual 33	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   52: aload_0
    //   53: invokevirtual 37	java/net/HttpURLConnection:getResponseCode	()I
    //   56: istore 5
    //   58: aload_0
    //   59: ldc 39
    //   61: invokevirtual 42	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore_3
    //   65: ldc 44
    //   67: ldc 46
    //   69: iconst_2
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: iload 5
    //   77: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: aload_3
    //   84: aastore
    //   85: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload_0
    //   89: ifnull +7 -> 96
    //   92: aload_0
    //   93: invokevirtual 61	java/net/HttpURLConnection:disconnect	()V
    //   96: sipush 2450
    //   99: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_3
    //   103: astore_0
    //   104: aload_0
    //   105: areturn
    //   106: aload_0
    //   107: ifnull +7 -> 114
    //   110: aload_0
    //   111: invokevirtual 61	java/net/HttpURLConnection:disconnect	()V
    //   114: ldc 66
    //   116: astore_0
    //   117: sipush 2450
    //   120: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: goto -19 -> 104
    //   126: astore_1
    //   127: aload_2
    //   128: astore_0
    //   129: aload_0
    //   130: astore_3
    //   131: ldc 44
    //   133: ldc 68
    //   135: iconst_1
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_1
    //   142: invokevirtual 72	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   145: aastore
    //   146: invokestatic 75	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_0
    //   150: ifnull -36 -> 114
    //   153: aload_0
    //   154: invokevirtual 61	java/net/HttpURLConnection:disconnect	()V
    //   157: goto -43 -> 114
    //   160: astore_0
    //   161: aload_3
    //   162: ifnull +7 -> 169
    //   165: aload_3
    //   166: invokevirtual 61	java/net/HttpURLConnection:disconnect	()V
    //   169: sipush 2450
    //   172: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_0
    //   176: athrow
    //   177: astore_1
    //   178: aload_0
    //   179: astore_3
    //   180: aload_1
    //   181: astore_0
    //   182: goto -21 -> 161
    //   185: astore_1
    //   186: goto -57 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   12	17	126	java/lang/Exception
    //   19	25	126	java/lang/Exception
    //   27	36	126	java/lang/Exception
    //   12	17	160	finally
    //   19	25	160	finally
    //   27	36	160	finally
    //   131	149	160	finally
    //   40	88	177	finally
    //   40	88	185	java/lang/Exception
  }

  public static a c(e parame)
  {
    AppMethodBeat.i(2451);
    a locala = new a();
    locala.field_downloadUrl = parame.gUx;
    locala.field_secondaryUrl = parame.kMZ;
    locala.field_fileSize = parame.mFileSize;
    locala.field_downloadUrlHashCode = parame.gUx.hashCode();
    locala.field_fileName = parame.mFileName;
    locala.field_fileType = parame.kNb;
    locala.field_md5 = parame.kNa;
    locala.field_appId = parame.mAppId;
    locala.field_autoInstall = parame.kNc;
    locala.field_showNotification = parame.hzG;
    locala.field_packageName = parame.mPackageName;
    locala.field_autoDownload = parame.kNe;
    locala.field_scene = parame.gOW;
    locala.field_downloadInWifi = parame.hyG;
    locala.field_fromWeApp = parame.kNh;
    locala.field_extInfo = parame.hxK;
    locala.field_isSecondDownload = parame.kNi;
    locala.field_fromDownloadApp = parame.kNj;
    locala.field_reserveInWifi = parame.hyG;
    AppMethodBeat.o(2451);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.f
 * JD-Core Version:    0.6.2
 */