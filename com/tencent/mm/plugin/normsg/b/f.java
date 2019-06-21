package com.tencent.mm.plugin.normsg.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

public final class f
{
  private static String[] oVc;
  private static String[] oVd;
  private static String[] oVe;
  public static boolean oVf;
  public static boolean oVg;
  public static boolean oVh;

  // ERROR //
  static
  {
    // Byte code:
    //   0: sipush 10440
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iconst_2
    //   7: anewarray 26	java/lang/String
    //   10: dup
    //   11: iconst_0
    //   12: new 28	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   19: invokestatic 37	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   22: invokevirtual 43	android/content/Context:getFilesDir	()Ljava/io/File;
    //   25: invokevirtual 49	java/io/File:getParent	()Ljava/lang/String;
    //   28: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: ldc 55
    //   33: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokestatic 62	com/tencent/mm/plugin/normsg/b/f:decodeString	(Ljava/lang/String;)Ljava/lang/String;
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: new 28	java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   52: invokestatic 37	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   55: invokevirtual 43	android/content/Context:getFilesDir	()Ljava/io/File;
    //   58: invokevirtual 49	java/io/File:getParent	()Ljava/lang/String;
    //   61: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: ldc 64
    //   66: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: invokestatic 62	com/tencent/mm/plugin/normsg/b/f:decodeString	(Ljava/lang/String;)Ljava/lang/String;
    //   75: aastore
    //   76: putstatic 66	com/tencent/mm/plugin/normsg/b/f:oVc	[Ljava/lang/String;
    //   79: iconst_1
    //   80: anewarray 26	java/lang/String
    //   83: dup
    //   84: iconst_0
    //   85: new 28	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   92: invokestatic 37	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   95: invokevirtual 43	android/content/Context:getFilesDir	()Ljava/io/File;
    //   98: invokevirtual 49	java/io/File:getParent	()Ljava/lang/String;
    //   101: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: ldc 68
    //   106: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokestatic 62	com/tencent/mm/plugin/normsg/b/f:decodeString	(Ljava/lang/String;)Ljava/lang/String;
    //   115: aastore
    //   116: putstatic 70	com/tencent/mm/plugin/normsg/b/f:oVd	[Ljava/lang/String;
    //   119: iconst_3
    //   120: anewarray 26	java/lang/String
    //   123: dup
    //   124: iconst_0
    //   125: new 28	java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   132: invokestatic 37	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   135: invokevirtual 43	android/content/Context:getFilesDir	()Ljava/io/File;
    //   138: invokevirtual 49	java/io/File:getParent	()Ljava/lang/String;
    //   141: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: ldc 72
    //   146: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 62	com/tencent/mm/plugin/normsg/b/f:decodeString	(Ljava/lang/String;)Ljava/lang/String;
    //   155: aastore
    //   156: dup
    //   157: iconst_1
    //   158: new 28	java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   165: invokestatic 37	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   168: invokevirtual 43	android/content/Context:getFilesDir	()Ljava/io/File;
    //   171: invokevirtual 49	java/io/File:getParent	()Ljava/lang/String;
    //   174: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: ldc 74
    //   179: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   185: invokestatic 62	com/tencent/mm/plugin/normsg/b/f:decodeString	(Ljava/lang/String;)Ljava/lang/String;
    //   188: aastore
    //   189: dup
    //   190: iconst_2
    //   191: new 28	java/lang/StringBuilder
    //   194: dup
    //   195: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   198: invokestatic 37	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   201: invokevirtual 43	android/content/Context:getFilesDir	()Ljava/io/File;
    //   204: invokevirtual 49	java/io/File:getParent	()Ljava/lang/String;
    //   207: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: ldc 76
    //   212: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   218: invokestatic 62	com/tencent/mm/plugin/normsg/b/f:decodeString	(Ljava/lang/String;)Ljava/lang/String;
    //   221: aastore
    //   222: putstatic 78	com/tencent/mm/plugin/normsg/b/f:oVe	[Ljava/lang/String;
    //   225: iconst_0
    //   226: putstatic 80	com/tencent/mm/plugin/normsg/b/f:oVf	Z
    //   229: iconst_0
    //   230: putstatic 82	com/tencent/mm/plugin/normsg/b/f:oVg	Z
    //   233: iconst_0
    //   234: putstatic 84	com/tencent/mm/plugin/normsg/b/f:oVh	Z
    //   237: getstatic 66	com/tencent/mm/plugin/normsg/b/f:oVc	[Ljava/lang/String;
    //   240: astore_0
    //   241: aload_0
    //   242: arraylength
    //   243: istore_1
    //   244: iconst_0
    //   245: istore_2
    //   246: iload_2
    //   247: iload_1
    //   248: if_icmpge +23 -> 271
    //   251: new 45	java/io/File
    //   254: dup
    //   255: aload_0
    //   256: iload_2
    //   257: aaload
    //   258: invokespecial 87	java/io/File:<init>	(Ljava/lang/String;)V
    //   261: invokevirtual 91	java/io/File:exists	()Z
    //   264: ifeq +151 -> 415
    //   267: iconst_1
    //   268: putstatic 80	com/tencent/mm/plugin/normsg/b/f:oVf	Z
    //   271: new 45	java/io/File
    //   274: dup
    //   275: ldc 93
    //   277: invokespecial 87	java/io/File:<init>	(Ljava/lang/String;)V
    //   280: astore_3
    //   281: aload_3
    //   282: invokevirtual 91	java/io/File:exists	()Z
    //   285: ifeq +89 -> 374
    //   288: aload_3
    //   289: invokevirtual 96	java/io/File:canRead	()Z
    //   292: ifeq +82 -> 374
    //   295: aload_3
    //   296: invokevirtual 100	java/io/File:length	()J
    //   299: lconst_0
    //   300: lcmp
    //   301: ifle +73 -> 374
    //   304: aload_3
    //   305: invokevirtual 100	java/io/File:length	()J
    //   308: l2i
    //   309: newarray byte
    //   311: astore 4
    //   313: new 102	java/io/FileInputStream
    //   316: astore_0
    //   317: aload_0
    //   318: aload_3
    //   319: invokespecial 105	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   322: aload_0
    //   323: aload 4
    //   325: invokevirtual 111	java/io/InputStream:read	([B)I
    //   328: pop
    //   329: aload_0
    //   330: invokevirtual 114	java/io/InputStream:close	()V
    //   333: new 26	java/lang/String
    //   336: dup
    //   337: aload 4
    //   339: invokespecial 117	java/lang/String:<init>	([B)V
    //   342: astore_0
    //   343: getstatic 70	com/tencent/mm/plugin/normsg/b/f:oVd	[Ljava/lang/String;
    //   346: astore 4
    //   348: aload 4
    //   350: arraylength
    //   351: istore_1
    //   352: iconst_0
    //   353: istore_2
    //   354: iload_2
    //   355: iload_1
    //   356: if_icmpge +18 -> 374
    //   359: aload_0
    //   360: aload 4
    //   362: iload_2
    //   363: aaload
    //   364: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   367: ifeq +94 -> 461
    //   370: iconst_1
    //   371: putstatic 82	com/tencent/mm/plugin/normsg/b/f:oVg	Z
    //   374: getstatic 78	com/tencent/mm/plugin/normsg/b/f:oVe	[Ljava/lang/String;
    //   377: astore_0
    //   378: aload_0
    //   379: arraylength
    //   380: istore_1
    //   381: iconst_0
    //   382: istore_2
    //   383: iload_2
    //   384: iload_1
    //   385: if_icmpge +88 -> 473
    //   388: new 45	java/io/File
    //   391: dup
    //   392: aload_0
    //   393: iload_2
    //   394: aaload
    //   395: invokespecial 87	java/io/File:<init>	(Ljava/lang/String;)V
    //   398: invokevirtual 91	java/io/File:exists	()Z
    //   401: ifeq +66 -> 467
    //   404: iconst_1
    //   405: putstatic 84	com/tencent/mm/plugin/normsg/b/f:oVh	Z
    //   408: sipush 10440
    //   411: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   414: return
    //   415: iinc 2 1
    //   418: goto -172 -> 246
    //   421: astore_0
    //   422: aconst_null
    //   423: astore_0
    //   424: aload_0
    //   425: ifnull -92 -> 333
    //   428: aload_0
    //   429: invokevirtual 114	java/io/InputStream:close	()V
    //   432: goto -99 -> 333
    //   435: astore_0
    //   436: goto -103 -> 333
    //   439: astore_0
    //   440: aconst_null
    //   441: astore 4
    //   443: aload 4
    //   445: ifnull +8 -> 453
    //   448: aload 4
    //   450: invokevirtual 114	java/io/InputStream:close	()V
    //   453: sipush 10440
    //   456: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   459: aload_0
    //   460: athrow
    //   461: iinc 2 1
    //   464: goto -110 -> 354
    //   467: iinc 2 1
    //   470: goto -87 -> 383
    //   473: sipush 10440
    //   476: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   479: goto -65 -> 414
    //   482: astore_0
    //   483: goto -150 -> 333
    //   486: astore 4
    //   488: goto -35 -> 453
    //   491: astore_3
    //   492: aload_0
    //   493: astore 4
    //   495: aload_3
    //   496: astore_0
    //   497: goto -54 -> 443
    //   500: astore_3
    //   501: goto -77 -> 424
    //
    // Exception table:
    //   from	to	target	type
    //   313	322	421	java/lang/Throwable
    //   428	432	435	java/io/IOException
    //   313	322	439	finally
    //   329	333	482	java/io/IOException
    //   448	453	486	java/io/IOException
    //   322	329	491	finally
    //   322	329	500	java/lang/Throwable
  }

  private static String decodeString(String paramString)
  {
    AppMethodBeat.i(10439);
    String[] arrayOfString = new String[3];
    arrayOfString[0] = ah.getContext().getFilesDir().getParent();
    arrayOfString[1] = paramString;
    arrayOfString[2] = f.class.toString();
    paramString = new StringBuilder(arrayOfString[1].substring(arrayOfString[0].length() + 1)).reverse().toString();
    AppMethodBeat.o(10439);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.f
 * JD-Core Version:    0.6.2
 */