package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;

final class zzhj
  implements Runnable
{
  zzhj(zzhg paramzzhg, Uri paramUri, BaseImplementation.ResultHolder paramResultHolder, String paramString, long paramLong1, long paramLong2)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 43
    //   2: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 51
    //   7: iconst_2
    //   8: invokestatic 57	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   11: pop
    //   12: ldc 59
    //   14: aload_0
    //   15: getfield 23	com/google/android/gms/wearable/internal/zzhj:zzco	Landroid/net/Uri;
    //   18: invokevirtual 65	android/net/Uri:getScheme	()Ljava/lang/String;
    //   21: invokevirtual 71	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   24: ifne +29 -> 53
    //   27: aload_0
    //   28: getfield 25	com/google/android/gms/wearable/internal/zzhj:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   31: new 73	com/google/android/gms/common/api/Status
    //   34: dup
    //   35: bipush 10
    //   37: ldc 75
    //   39: invokespecial 78	com/google/android/gms/common/api/Status:<init>	(ILjava/lang/String;)V
    //   42: invokeinterface 84 2 0
    //   47: ldc 43
    //   49: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: return
    //   53: new 89	java/io/File
    //   56: dup
    //   57: aload_0
    //   58: getfield 23	com/google/android/gms/wearable/internal/zzhj:zzco	Landroid/net/Uri;
    //   61: invokevirtual 92	android/net/Uri:getPath	()Ljava/lang/String;
    //   64: invokespecial 95	java/io/File:<init>	(Ljava/lang/String;)V
    //   67: astore_1
    //   68: aload_1
    //   69: ldc 96
    //   71: invokestatic 102	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   74: astore_2
    //   75: aload_0
    //   76: getfield 21	com/google/android/gms/wearable/internal/zzhj:zzfi	Lcom/google/android/gms/wearable/internal/zzhg;
    //   79: invokevirtual 108	com/google/android/gms/wearable/internal/zzhg:getService	()Landroid/os/IInterface;
    //   82: checkcast 110	com/google/android/gms/wearable/internal/zzep
    //   85: astore_1
    //   86: new 112	com/google/android/gms/wearable/internal/zzhc
    //   89: astore_3
    //   90: aload_3
    //   91: aload_0
    //   92: getfield 25	com/google/android/gms/wearable/internal/zzhj:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   95: invokespecial 115	com/google/android/gms/wearable/internal/zzhc:<init>	(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V
    //   98: aload_1
    //   99: aload_3
    //   100: aload_0
    //   101: getfield 27	com/google/android/gms/wearable/internal/zzhj:zzcs	Ljava/lang/String;
    //   104: aload_2
    //   105: aload_0
    //   106: getfield 29	com/google/android/gms/wearable/internal/zzhj:zzcq	J
    //   109: aload_0
    //   110: getfield 31	com/google/android/gms/wearable/internal/zzhj:zzcr	J
    //   113: invokeinterface 119 8 0
    //   118: aload_2
    //   119: invokevirtual 122	android/os/ParcelFileDescriptor:close	()V
    //   122: ldc 43
    //   124: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: goto -75 -> 52
    //   130: astore_2
    //   131: aload_1
    //   132: invokestatic 126	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   135: astore_2
    //   136: new 128	java/lang/StringBuilder
    //   139: dup
    //   140: aload_2
    //   141: invokestatic 126	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   144: invokevirtual 132	java/lang/String:length	()I
    //   147: bipush 46
    //   149: iadd
    //   150: invokespecial 134	java/lang/StringBuilder:<init>	(I)V
    //   153: ldc 136
    //   155: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: aload_2
    //   159: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload_0
    //   164: getfield 25	com/google/android/gms/wearable/internal/zzhj:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   167: new 73	com/google/android/gms/common/api/Status
    //   170: dup
    //   171: bipush 13
    //   173: invokespecial 141	com/google/android/gms/common/api/Status:<init>	(I)V
    //   176: invokeinterface 84 2 0
    //   181: ldc 43
    //   183: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: goto -134 -> 52
    //   189: astore_2
    //   190: ldc 43
    //   192: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: goto -143 -> 52
    //   198: astore_1
    //   199: aload_0
    //   200: getfield 25	com/google/android/gms/wearable/internal/zzhj:zzfh	Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    //   203: astore_3
    //   204: new 73	com/google/android/gms/common/api/Status
    //   207: astore_1
    //   208: aload_1
    //   209: bipush 8
    //   211: invokespecial 141	com/google/android/gms/common/api/Status:<init>	(I)V
    //   214: aload_3
    //   215: aload_1
    //   216: invokeinterface 84 2 0
    //   221: aload_2
    //   222: invokevirtual 122	android/os/ParcelFileDescriptor:close	()V
    //   225: ldc 43
    //   227: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: goto -178 -> 52
    //   233: astore_2
    //   234: ldc 43
    //   236: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: goto -187 -> 52
    //   242: astore_1
    //   243: aload_2
    //   244: invokevirtual 122	android/os/ParcelFileDescriptor:close	()V
    //   247: ldc 43
    //   249: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: aload_1
    //   253: athrow
    //   254: astore_2
    //   255: goto -8 -> 247
    //
    // Exception table:
    //   from	to	target	type
    //   68	75	130	java/io/FileNotFoundException
    //   118	122	189	java/io/IOException
    //   75	118	198	android/os/RemoteException
    //   221	225	233	java/io/IOException
    //   75	118	242	finally
    //   199	221	242	finally
    //   243	247	254	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhj
 * JD-Core Version:    0.6.2
 */