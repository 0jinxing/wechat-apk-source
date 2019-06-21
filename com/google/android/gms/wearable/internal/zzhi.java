package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;

final class zzhi
  implements Runnable
{
  zzhi(zzhg paramzzhg, Uri paramUri, BaseImplementation.ResultHolder paramResultHolder, boolean paramBoolean, String paramString)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 40
    //   2: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 48
    //   7: iconst_2
    //   8: invokestatic 54	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   11: pop
    //   12: ldc 56
    //   14: aload_0
    //   15: getfield 22	com/google/android/gms/wearable/internal/zzhi:zzco	Landroid/net/Uri;
    //   18: invokevirtual 62	android/net/Uri:getScheme	()Ljava/lang/String;
    //   21: invokevirtual 68	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   24: ifne +29 -> 53
    //   27: aload_0
    //   28: getfield 24	com/google/android/gms/wearable/internal/zzhi:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   31: new 70	com/google/android/gms/common/api/Status
    //   34: dup
    //   35: bipush 10
    //   37: ldc 72
    //   39: invokespecial 75	com/google/android/gms/common/api/Status:<init>	(ILjava/lang/String;)V
    //   42: invokeinterface 81 2 0
    //   47: ldc 40
    //   49: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: return
    //   53: new 86	java/io/File
    //   56: dup
    //   57: aload_0
    //   58: getfield 22	com/google/android/gms/wearable/internal/zzhi:zzco	Landroid/net/Uri;
    //   61: invokevirtual 89	android/net/Uri:getPath	()Ljava/lang/String;
    //   64: invokespecial 92	java/io/File:<init>	(Ljava/lang/String;)V
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 26	com/google/android/gms/wearable/internal/zzhi:zzcp	Z
    //   72: ifeq +64 -> 136
    //   75: ldc 93
    //   77: istore_2
    //   78: aload_1
    //   79: iload_2
    //   80: ldc 94
    //   82: ior
    //   83: invokestatic 100	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   86: astore_3
    //   87: aload_0
    //   88: getfield 20	com/google/android/gms/wearable/internal/zzhi:zzfi	Lcom/google/android/gms/wearable/internal/zzhg;
    //   91: invokevirtual 106	com/google/android/gms/wearable/internal/zzhg:getService	()Landroid/os/IInterface;
    //   94: checkcast 108	com/google/android/gms/wearable/internal/zzep
    //   97: astore 4
    //   99: new 110	com/google/android/gms/wearable/internal/zzhf
    //   102: astore_1
    //   103: aload_1
    //   104: aload_0
    //   105: getfield 24	com/google/android/gms/wearable/internal/zzhi:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   108: invokespecial 113	com/google/android/gms/wearable/internal/zzhf:<init>	(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V
    //   111: aload 4
    //   113: aload_1
    //   114: aload_0
    //   115: getfield 28	com/google/android/gms/wearable/internal/zzhi:zzcs	Ljava/lang/String;
    //   118: aload_3
    //   119: invokeinterface 117 4 0
    //   124: aload_3
    //   125: invokevirtual 120	android/os/ParcelFileDescriptor:close	()V
    //   128: ldc 40
    //   130: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: goto -81 -> 52
    //   136: iconst_0
    //   137: istore_2
    //   138: goto -60 -> 78
    //   141: astore_3
    //   142: aload_1
    //   143: invokestatic 124	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   146: astore_3
    //   147: new 126	java/lang/StringBuilder
    //   150: dup
    //   151: aload_3
    //   152: invokestatic 124	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   155: invokevirtual 130	java/lang/String:length	()I
    //   158: bipush 49
    //   160: iadd
    //   161: invokespecial 132	java/lang/StringBuilder:<init>	(I)V
    //   164: ldc 134
    //   166: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: aload_3
    //   170: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload_0
    //   175: getfield 24	com/google/android/gms/wearable/internal/zzhi:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   178: new 70	com/google/android/gms/common/api/Status
    //   181: dup
    //   182: bipush 13
    //   184: invokespecial 139	com/google/android/gms/common/api/Status:<init>	(I)V
    //   187: invokeinterface 81 2 0
    //   192: ldc 40
    //   194: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: goto -145 -> 52
    //   200: astore_3
    //   201: ldc 40
    //   203: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: goto -154 -> 52
    //   209: astore_1
    //   210: aload_0
    //   211: getfield 24	com/google/android/gms/wearable/internal/zzhi:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   214: astore_1
    //   215: new 70	com/google/android/gms/common/api/Status
    //   218: astore 4
    //   220: aload 4
    //   222: bipush 8
    //   224: invokespecial 139	com/google/android/gms/common/api/Status:<init>	(I)V
    //   227: aload_1
    //   228: aload 4
    //   230: invokeinterface 81 2 0
    //   235: aload_3
    //   236: invokevirtual 120	android/os/ParcelFileDescriptor:close	()V
    //   239: ldc 40
    //   241: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: goto -192 -> 52
    //   247: astore_3
    //   248: ldc 40
    //   250: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   253: goto -201 -> 52
    //   256: astore_1
    //   257: aload_3
    //   258: invokevirtual 120	android/os/ParcelFileDescriptor:close	()V
    //   261: ldc 40
    //   263: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_1
    //   267: athrow
    //   268: astore_3
    //   269: goto -8 -> 261
    //
    // Exception table:
    //   from	to	target	type
    //   78	87	141	java/io/FileNotFoundException
    //   124	128	200	java/io/IOException
    //   87	124	209	android/os/RemoteException
    //   235	239	247	java/io/IOException
    //   87	124	256	finally
    //   210	235	256	finally
    //   257	261	268	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhi
 * JD-Core Version:    0.6.2
 */