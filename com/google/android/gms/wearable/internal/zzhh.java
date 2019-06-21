package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

final class zzhh
  implements Callable<Boolean>
{
  zzhh(zzhg paramzzhg, ParcelFileDescriptor paramParcelFileDescriptor, byte[] paramArrayOfByte)
  {
  }

  // ERROR //
  private final Boolean zzd()
  {
    // Byte code:
    //   0: ldc 26
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 34
    //   7: iconst_3
    //   8: invokestatic 40	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   11: ifeq +38 -> 49
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/wearable/internal/zzhh:zzfg	Landroid/os/ParcelFileDescriptor;
    //   18: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   21: astore_1
    //   22: new 48	java/lang/StringBuilder
    //   25: dup
    //   26: aload_1
    //   27: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   30: invokevirtual 52	java/lang/String:length	()I
    //   33: bipush 36
    //   35: iadd
    //   36: invokespecial 54	java/lang/StringBuilder:<init>	(I)V
    //   39: ldc 56
    //   41: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_1
    //   45: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: new 62	android/os/ParcelFileDescriptor$AutoCloseOutputStream
    //   52: dup
    //   53: aload_0
    //   54: getfield 15	com/google/android/gms/wearable/internal/zzhh:zzfg	Landroid/os/ParcelFileDescriptor;
    //   57: invokespecial 65	android/os/ParcelFileDescriptor$AutoCloseOutputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   60: astore_2
    //   61: aload_2
    //   62: aload_0
    //   63: getfield 17	com/google/android/gms/wearable/internal/zzhh:zzee	[B
    //   66: invokevirtual 69	android/os/ParcelFileDescriptor$AutoCloseOutputStream:write	([B)V
    //   69: aload_2
    //   70: invokevirtual 72	android/os/ParcelFileDescriptor$AutoCloseOutputStream:flush	()V
    //   73: ldc 34
    //   75: iconst_3
    //   76: invokestatic 40	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   79: ifeq +44 -> 123
    //   82: aload_0
    //   83: getfield 15	com/google/android/gms/wearable/internal/zzhh:zzfg	Landroid/os/ParcelFileDescriptor;
    //   86: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   89: astore_3
    //   90: aload_3
    //   91: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   94: invokevirtual 52	java/lang/String:length	()I
    //   97: istore 4
    //   99: new 48	java/lang/StringBuilder
    //   102: astore_1
    //   103: aload_1
    //   104: iload 4
    //   106: bipush 27
    //   108: iadd
    //   109: invokespecial 54	java/lang/StringBuilder:<init>	(I)V
    //   112: aload_1
    //   113: ldc 74
    //   115: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: aload_3
    //   119: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: getstatic 80	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   126: astore_1
    //   127: ldc 34
    //   129: iconst_3
    //   130: invokestatic 40	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   133: ifeq +47 -> 180
    //   136: aload_0
    //   137: getfield 15	com/google/android/gms/wearable/internal/zzhh:zzfg	Landroid/os/ParcelFileDescriptor;
    //   140: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   143: astore_3
    //   144: aload_3
    //   145: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   148: invokevirtual 52	java/lang/String:length	()I
    //   151: istore 4
    //   153: new 48	java/lang/StringBuilder
    //   156: astore 5
    //   158: aload 5
    //   160: iload 4
    //   162: bipush 24
    //   164: iadd
    //   165: invokespecial 54	java/lang/StringBuilder:<init>	(I)V
    //   168: aload 5
    //   170: ldc 82
    //   172: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload_3
    //   176: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: aload_2
    //   181: invokevirtual 85	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
    //   184: ldc 26
    //   186: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   189: aload_1
    //   190: areturn
    //   191: astore_1
    //   192: aload_0
    //   193: getfield 15	com/google/android/gms/wearable/internal/zzhh:zzfg	Landroid/os/ParcelFileDescriptor;
    //   196: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   199: astore_3
    //   200: aload_3
    //   201: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   204: invokevirtual 52	java/lang/String:length	()I
    //   207: istore 4
    //   209: new 48	java/lang/StringBuilder
    //   212: astore_1
    //   213: aload_1
    //   214: iload 4
    //   216: bipush 36
    //   218: iadd
    //   219: invokespecial 54	java/lang/StringBuilder:<init>	(I)V
    //   222: aload_1
    //   223: ldc 90
    //   225: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload_3
    //   229: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: ldc 34
    //   235: iconst_3
    //   236: invokestatic 40	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   239: ifeq +44 -> 283
    //   242: aload_0
    //   243: getfield 15	com/google/android/gms/wearable/internal/zzhh:zzfg	Landroid/os/ParcelFileDescriptor;
    //   246: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   249: astore_3
    //   250: aload_3
    //   251: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   254: invokevirtual 52	java/lang/String:length	()I
    //   257: istore 4
    //   259: new 48	java/lang/StringBuilder
    //   262: astore_1
    //   263: aload_1
    //   264: iload 4
    //   266: bipush 24
    //   268: iadd
    //   269: invokespecial 54	java/lang/StringBuilder:<init>	(I)V
    //   272: aload_1
    //   273: ldc 82
    //   275: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: aload_3
    //   279: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload_2
    //   284: invokevirtual 85	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
    //   287: getstatic 93	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   290: astore_1
    //   291: ldc 26
    //   293: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   296: goto -107 -> 189
    //   299: astore_1
    //   300: ldc 34
    //   302: iconst_3
    //   303: invokestatic 40	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   306: ifeq +47 -> 353
    //   309: aload_0
    //   310: getfield 15	com/google/android/gms/wearable/internal/zzhh:zzfg	Landroid/os/ParcelFileDescriptor;
    //   313: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   316: astore_3
    //   317: aload_3
    //   318: invokestatic 46	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   321: invokevirtual 52	java/lang/String:length	()I
    //   324: istore 4
    //   326: new 48	java/lang/StringBuilder
    //   329: astore 5
    //   331: aload 5
    //   333: iload 4
    //   335: bipush 24
    //   337: iadd
    //   338: invokespecial 54	java/lang/StringBuilder:<init>	(I)V
    //   341: aload 5
    //   343: ldc 82
    //   345: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: aload_3
    //   349: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: pop
    //   353: aload_2
    //   354: invokevirtual 85	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
    //   357: ldc 26
    //   359: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   362: aload_1
    //   363: athrow
    //   364: astore_2
    //   365: goto -8 -> 357
    //   368: astore_1
    //   369: goto -82 -> 287
    //   372: astore_2
    //   373: goto -189 -> 184
    //
    // Exception table:
    //   from	to	target	type
    //   61	123	191	java/io/IOException
    //   123	127	191	java/io/IOException
    //   61	123	299	finally
    //   123	127	299	finally
    //   192	233	299	finally
    //   300	353	364	java/io/IOException
    //   353	357	364	java/io/IOException
    //   233	283	368	java/io/IOException
    //   283	287	368	java/io/IOException
    //   127	180	372	java/io/IOException
    //   180	184	372	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhh
 * JD-Core Version:    0.6.2
 */