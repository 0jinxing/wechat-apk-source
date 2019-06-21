package com.tencent.mm.plugin.downloader.model;

import android.os.Parcelable.Creator;

public final class DownloadChecker
{
  // ERROR //
  public static boolean a(java.lang.String paramString1, java.lang.String paramString2, com.tencent.xweb.WebView paramWebView)
  {
    // Byte code:
    //   0: sipush 2353
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 30	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifne +9 -> 19
    //   13: invokestatic 36	com/tencent/mm/sdk/platformtools/g:dnY	()Z
    //   16: ifeq +13 -> 29
    //   19: sipush 2353
    //   22: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iconst_0
    //   26: istore_3
    //   27: iload_3
    //   28: ireturn
    //   29: invokestatic 45	com/tencent/mm/plugin/game/commlib/a:bDm	()Ljava/util/List;
    //   32: astore 4
    //   34: aload 4
    //   36: invokestatic 49	com/tencent/mm/sdk/platformtools/bo:ek	(Ljava/util/List;)Z
    //   39: ifeq +29 -> 68
    //   42: ldc 51
    //   44: ldc 53
    //   46: iconst_1
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload_0
    //   53: aastore
    //   54: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: sipush 2353
    //   60: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: iconst_0
    //   64: istore_3
    //   65: goto -38 -> 27
    //   68: ldc 51
    //   70: ldc 60
    //   72: iconst_2
    //   73: anewarray 4	java/lang/Object
    //   76: dup
    //   77: iconst_0
    //   78: aload_0
    //   79: aastore
    //   80: dup
    //   81: iconst_1
    //   82: aload 4
    //   84: invokeinterface 66 1 0
    //   89: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   92: aastore
    //   93: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: aload 4
    //   98: invokeinterface 76 1 0
    //   103: astore 5
    //   105: aload 5
    //   107: invokeinterface 81 1 0
    //   112: ifeq +79 -> 191
    //   115: aload 5
    //   117: invokeinterface 85 1 0
    //   122: checkcast 87	java/lang/String
    //   125: astore 6
    //   127: aload 6
    //   129: invokestatic 93	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   132: aload_0
    //   133: invokevirtual 97	java/lang/String:trim	()Ljava/lang/String;
    //   136: invokevirtual 101	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   139: astore 4
    //   141: aload 4
    //   143: invokevirtual 106	java/util/regex/Matcher:find	()Z
    //   146: ifeq -41 -> 105
    //   149: aload 4
    //   151: invokevirtual 109	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   154: astore 4
    //   156: ldc 51
    //   158: ldc 111
    //   160: iconst_1
    //   161: anewarray 4	java/lang/Object
    //   164: dup
    //   165: iconst_0
    //   166: aload 6
    //   168: aastore
    //   169: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload 4
    //   174: invokestatic 30	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   177: ifeq +47 -> 224
    //   180: sipush 2353
    //   183: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: iconst_0
    //   187: istore_3
    //   188: goto -161 -> 27
    //   191: aconst_null
    //   192: astore 4
    //   194: goto -22 -> 172
    //   197: astore 6
    //   199: aconst_null
    //   200: astore 4
    //   202: ldc 51
    //   204: ldc 113
    //   206: iconst_1
    //   207: anewarray 4	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: aload 6
    //   214: invokevirtual 116	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   217: aastore
    //   218: invokestatic 119	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   221: goto -49 -> 172
    //   224: new 121	java/lang/ref/WeakReference
    //   227: dup
    //   228: aload_2
    //   229: invokespecial 125	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   232: astore 6
    //   234: new 127	android/os/Bundle
    //   237: dup
    //   238: invokespecial 130	android/os/Bundle:<init>	()V
    //   241: astore 5
    //   243: aload 5
    //   245: ldc 132
    //   247: aload 4
    //   249: invokevirtual 136	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   252: aload 5
    //   254: ldc 138
    //   256: aload_2
    //   257: invokevirtual 143	com/tencent/xweb/WebView:getUrl	()Ljava/lang/String;
    //   260: invokevirtual 136	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: aload 5
    //   265: ldc 145
    //   267: aload_1
    //   268: invokevirtual 136	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   271: ldc 147
    //   273: aload 5
    //   275: ldc 12
    //   277: new 149	com/tencent/mm/plugin/downloader/model/DownloadChecker$1
    //   280: dup
    //   281: aload 6
    //   283: aload_0
    //   284: invokespecial 152	com/tencent/mm/plugin/downloader/model/DownloadChecker$1:<init>	(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V
    //   287: invokestatic 157	com/tencent/mm/ipcinvoker/f:a	(Ljava/lang/String;Landroid/os/Parcelable;Ljava/lang/Class;Lcom/tencent/mm/ipcinvoker/c;)Z
    //   290: pop
    //   291: sipush 2353
    //   294: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   297: iconst_1
    //   298: istore_3
    //   299: goto -272 -> 27
    //   302: astore 6
    //   304: goto -102 -> 202
    //
    // Exception table:
    //   from	to	target	type
    //   29	57	197	java/lang/Exception
    //   68	105	197	java/lang/Exception
    //   105	156	197	java/lang/Exception
    //   156	172	302	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.DownloadChecker
 * JD-Core Version:    0.6.2
 */