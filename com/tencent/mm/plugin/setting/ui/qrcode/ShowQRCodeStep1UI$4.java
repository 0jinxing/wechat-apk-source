package com.tencent.mm.plugin.setting.ui.qrcode;

import com.tencent.mm.ui.base.h.c;

final class ShowQRCodeStep1UI$4
  implements h.c
{
  ShowQRCodeStep1UI$4(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  // ERROR //
  public final void iE(int paramInt)
  {
    // Byte code:
    //   0: ldc 23
    //   2: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iload_1
    //   6: tableswitch	default:+22 -> 28, 0:+28->34, 1:+43->49
    //   29: fload 184
    //   31: nop
    //   32: lload_1
    //   33: return
    //   34: aload_0
    //   35: getfield 14	com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$4:qkF	Lcom/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI;
    //   38: invokevirtual 34	com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI:cit	()V
    //   41: ldc 23
    //   43: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: goto -13 -> 33
    //   49: aload_0
    //   50: getfield 14	com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$4:qkF	Lcom/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI;
    //   53: astore_2
    //   54: aload_2
    //   55: getfield 38	com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI:qkE	[B
    //   58: astore_3
    //   59: aload_3
    //   60: ifnull -32 -> 28
    //   63: aload_3
    //   64: arraylength
    //   65: ifle -37 -> 28
    //   68: new 40	java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   75: invokestatic 47	com/tencent/mm/pluginsdk/ui/tools/n:dly	()Ljava/lang/String;
    //   78: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc 53
    //   83: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokestatic 59	java/lang/System:currentTimeMillis	()J
    //   89: invokevirtual 62	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   92: ldc 64
    //   94: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: astore 4
    //   102: new 69	java/io/FileOutputStream
    //   105: astore 5
    //   107: aload 5
    //   109: aload 4
    //   111: invokespecial 72	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   114: aload 5
    //   116: astore 6
    //   118: aload 5
    //   120: aload_3
    //   121: invokevirtual 76	java/io/FileOutputStream:write	([B)V
    //   124: aload 5
    //   126: astore 6
    //   128: aload_2
    //   129: aload_2
    //   130: ldc 77
    //   132: iconst_1
    //   133: anewarray 4	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: aload 4
    //   140: aastore
    //   141: invokevirtual 81	com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   144: iconst_1
    //   145: invokestatic 87	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   148: invokevirtual 90	android/widget/Toast:show	()V
    //   151: aload 5
    //   153: astore 6
    //   155: aload 4
    //   157: aload_2
    //   158: invokestatic 94	com/tencent/mm/pluginsdk/ui/tools/n:a	(Ljava/lang/String;Landroid/content/Context;)V
    //   161: aload 5
    //   163: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   166: ldc 23
    //   168: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: goto -138 -> 33
    //   174: astore 6
    //   176: ldc 23
    //   178: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: goto -148 -> 33
    //   184: astore_2
    //   185: aconst_null
    //   186: astore 5
    //   188: aload 5
    //   190: astore 6
    //   192: ldc 99
    //   194: aload_2
    //   195: ldc 101
    //   197: iconst_0
    //   198: anewarray 4	java/lang/Object
    //   201: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: aload 5
    //   206: ifnull +8 -> 214
    //   209: aload 5
    //   211: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   214: ldc 23
    //   216: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: goto -186 -> 33
    //   222: astore 6
    //   224: ldc 23
    //   226: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: goto -196 -> 33
    //   232: astore 5
    //   234: aconst_null
    //   235: astore 6
    //   237: aload 6
    //   239: ifnull +8 -> 247
    //   242: aload 6
    //   244: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   247: ldc 23
    //   249: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: aload 5
    //   254: athrow
    //   255: astore 6
    //   257: goto -10 -> 247
    //   260: astore 5
    //   262: goto -25 -> 237
    //   265: astore_2
    //   266: goto -78 -> 188
    //
    // Exception table:
    //   from	to	target	type
    //   161	166	174	java/lang/Exception
    //   102	114	184	java/lang/Exception
    //   209	214	222	java/lang/Exception
    //   102	114	232	finally
    //   242	247	255	java/lang/Exception
    //   118	124	260	finally
    //   128	151	260	finally
    //   155	161	260	finally
    //   192	204	260	finally
    //   118	124	265	java/lang/Exception
    //   128	151	265	java/lang/Exception
    //   155	161	265	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI.4
 * JD-Core Version:    0.6.2
 */