package com.tencent.mm.platformtools;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.f.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.vfs.e;

public final class q
{
  @Deprecated
  public static void a(String paramString, Context paramContext)
  {
    AppMethodBeat.i(79005);
    a.a(paramString, paramContext);
    AppMethodBeat.o(79005);
  }

  public static boolean a(String paramString, Context paramContext, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(79003);
    if (r.amo(paramString))
      if (!bo.isNullOrNil(paramString))
      {
        String str = a.RL("gif");
        e.tf(e.atb(str));
        if (e.y(paramString, str) >= 0L)
        {
          a.a(str, paramContext);
          Toast.makeText(paramContext, paramContext.getString(paramInt, new Object[] { a.dlz() }), 1).show();
          AppMethodBeat.o(79003);
        }
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(79003);
      bool = false;
      continue;
      bool = a(paramString, paramContext, true, paramInt);
      AppMethodBeat.o(79003);
    }
  }

  // ERROR //
  public static boolean a(String paramString, Context paramContext, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc 80
    //   5: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnull +270 -> 279
    //   12: aload_0
    //   13: ldc 82
    //   15: invokevirtual 88	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   18: ifne +261 -> 279
    //   21: ldc 90
    //   23: invokestatic 42	com/tencent/mm/sdk/f/a:RL	(Ljava/lang/String;)Ljava/lang/String;
    //   26: astore 5
    //   28: aload 5
    //   30: invokestatic 47	com/tencent/mm/vfs/e:atb	(Ljava/lang/String;)Ljava/lang/String;
    //   33: invokestatic 50	com/tencent/mm/vfs/e:tf	(Ljava/lang/String;)Z
    //   36: pop
    //   37: aload_0
    //   38: aload 5
    //   40: invokestatic 54	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   43: lconst_0
    //   44: lcmp
    //   45: ifge +13 -> 58
    //   48: ldc 80
    //   50: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: iload 4
    //   55: istore_2
    //   56: iload_2
    //   57: ireturn
    //   58: aload 5
    //   60: invokestatic 95	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   63: ifeq +102 -> 165
    //   66: aconst_null
    //   67: astore 6
    //   69: aconst_null
    //   70: astore 7
    //   72: aload 6
    //   74: astore 8
    //   76: aload 5
    //   78: invokestatic 101	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$ExifHelper:bJ	(Ljava/lang/String;)I
    //   81: istore 9
    //   83: aload 6
    //   85: astore 8
    //   87: aload 5
    //   89: invokestatic 105	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   92: astore_0
    //   93: aload 7
    //   95: astore 8
    //   97: aload_0
    //   98: ifnull +57 -> 155
    //   101: iload 9
    //   103: i2f
    //   104: fstore 10
    //   106: aload 6
    //   108: astore 8
    //   110: aload_0
    //   111: fload 10
    //   113: invokestatic 111	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   116: astore 7
    //   118: aload 6
    //   120: astore 8
    //   122: getstatic 117	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   125: astore 11
    //   127: aload 6
    //   129: astore 8
    //   131: aload 5
    //   133: iconst_0
    //   134: invokestatic 121	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   137: astore_0
    //   138: aload_0
    //   139: astore 8
    //   141: aload 7
    //   143: aload 11
    //   145: bipush 80
    //   147: aload_0
    //   148: invokevirtual 127	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   151: pop
    //   152: aload_0
    //   153: astore 8
    //   155: aload 8
    //   157: ifnull +8 -> 165
    //   160: aload 8
    //   162: invokevirtual 132	java/io/OutputStream:close	()V
    //   165: aload 5
    //   167: aload_1
    //   168: invokestatic 18	com/tencent/mm/sdk/f/a:a	(Ljava/lang/String;Landroid/content/Context;)V
    //   171: iload_2
    //   172: ifeq +26 -> 198
    //   175: aload_1
    //   176: aload_1
    //   177: iload_3
    //   178: iconst_1
    //   179: anewarray 4	java/lang/Object
    //   182: dup
    //   183: iconst_0
    //   184: invokestatic 58	com/tencent/mm/sdk/f/a:dlz	()Ljava/lang/String;
    //   187: aastore
    //   188: invokevirtual 64	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   191: iconst_1
    //   192: invokestatic 70	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   195: invokevirtual 74	android/widget/Toast:show	()V
    //   198: ldc 80
    //   200: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: iconst_1
    //   204: istore_2
    //   205: goto -149 -> 56
    //   208: astore 7
    //   210: aload 6
    //   212: astore 8
    //   214: ldc 134
    //   216: aload 7
    //   218: ldc 136
    //   220: iconst_0
    //   221: anewarray 4	java/lang/Object
    //   224: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: aload_0
    //   228: astore 7
    //   230: goto -112 -> 118
    //   233: astore_0
    //   234: aconst_null
    //   235: astore_0
    //   236: aload 5
    //   238: invokestatic 145	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   241: pop
    //   242: aload_0
    //   243: ifnull +7 -> 250
    //   246: aload_0
    //   247: invokevirtual 132	java/io/OutputStream:close	()V
    //   250: ldc 80
    //   252: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: iload 4
    //   257: istore_2
    //   258: goto -202 -> 56
    //   261: astore_0
    //   262: aload 8
    //   264: ifnull +8 -> 272
    //   267: aload 8
    //   269: invokevirtual 132	java/io/OutputStream:close	()V
    //   272: ldc 80
    //   274: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   277: aload_0
    //   278: athrow
    //   279: ldc 80
    //   281: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   284: iload 4
    //   286: istore_2
    //   287: goto -231 -> 56
    //   290: astore_0
    //   291: goto -126 -> 165
    //   294: astore_0
    //   295: goto -45 -> 250
    //   298: astore_1
    //   299: goto -27 -> 272
    //   302: astore_1
    //   303: aload_0
    //   304: astore 8
    //   306: aload_1
    //   307: astore_0
    //   308: goto -46 -> 262
    //   311: astore_1
    //   312: goto -76 -> 236
    //
    // Exception table:
    //   from	to	target	type
    //   110	118	208	java/lang/Exception
    //   76	83	233	java/lang/Exception
    //   87	93	233	java/lang/Exception
    //   122	127	233	java/lang/Exception
    //   131	138	233	java/lang/Exception
    //   214	227	233	java/lang/Exception
    //   76	83	261	finally
    //   87	93	261	finally
    //   110	118	261	finally
    //   122	127	261	finally
    //   131	138	261	finally
    //   141	152	261	finally
    //   214	227	261	finally
    //   160	165	290	java/lang/Exception
    //   246	250	294	java/lang/Exception
    //   267	272	298	java/lang/Exception
    //   236	242	302	finally
    //   141	152	311	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.q
 * JD-Core Version:    0.6.2
 */