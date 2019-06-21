package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.pluginsdk.g.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class l
{
  private final boolean cuA;
  private final int cut;
  private final int cuu;
  private final int cuv;
  private final boolean cuw;
  final String filePath;
  volatile int state;
  private final String url;
  final String vdC;
  private final String vdF;
  private final int vdG;
  private final byte[] vdH;
  private final String vdI;
  private final long vdK;
  private final String vdL;
  private final int vdM;
  private final int vdN;
  volatile String veM;
  volatile String veN;
  final boolean vei;
  final boolean vej;

  l(int paramInt1, int paramInt2, String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2, int paramInt3, boolean paramBoolean3, boolean paramBoolean4, byte[] paramArrayOfByte, String paramString3, String paramString4, long paramLong, String paramString5, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(79550);
    this.state = -1;
    this.veM = null;
    this.veN = null;
    this.vdC = i.gN(paramInt1, paramInt2);
    this.cut = paramInt1;
    this.cuu = paramInt2;
    this.filePath = paramString1;
    this.vej = paramBoolean1;
    this.vei = paramBoolean2;
    this.vdF = paramString2;
    this.vdG = paramInt3;
    this.vdH = paramArrayOfByte;
    this.vdI = paramString3;
    this.cuA = paramBoolean3;
    this.cuw = paramBoolean4;
    this.vdL = paramString4;
    this.vdK = paramLong;
    this.url = paramString5;
    this.vdM = paramInt4;
    this.vdN = paramInt5;
    this.cuv = paramInt6;
    AppMethodBeat.o(79550);
  }

  private String dio()
  {
    AppMethodBeat.i(79554);
    String str1;
    if (bo.isNullOrNil(this.veM))
    {
      str1 = null;
      AppMethodBeat.o(79554);
    }
    while (true)
    {
      return str1;
      String str2 = this.vdC;
      String str3 = dip();
      String str4 = this.vdI;
      if (this.vdH == null);
      for (str1 = "null"; ; str1 = String.valueOf(this.vdH.length))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, originalMd5 = %s, eccSig.size = %s", new Object[] { str2, str3, str4, str1 });
        if ((bo.isNullOrNil(this.vdI)) || (!bo.nullAsNil(g.cz(this.veM)).equals(this.vdI)))
          break label176;
        ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, md5 ok", new Object[] { this.vdC, dip() });
        if (this.state == 4)
          j.z(this.vdK, 23L);
        str1 = this.veM;
        AppMethodBeat.o(79554);
        break;
      }
      label176: if (this.state == 4)
        j.z(this.vdK, 24L);
      if ((!bo.cb(this.vdH)) && (UtilsJni.doEcdsaSHAVerify(i.vem, a.aji(this.veM), this.vdH) > 0))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, ecc check ok", new Object[] { this.vdC, dip() });
        if (this.state == 4)
          j.z(this.vdK, 25L);
        str1 = this.veM;
        AppMethodBeat.o(79554);
      }
      else
      {
        if (this.state == 4)
          j.z(this.vdK, 26L);
        str1 = null;
        AppMethodBeat.o(79554);
      }
    }
  }

  // ERROR //
  final l dil()
  {
    // Byte code:
    //   0: ldc 178
    //   2: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 110
    //   7: ldc 180
    //   9: iconst_5
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_0
    //   16: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: aload_0
    //   23: invokevirtual 106	com/tencent/mm/pluginsdk/g/a/a/l:dip	()Ljava/lang/String;
    //   26: aastore
    //   27: dup
    //   28: iconst_2
    //   29: aload_0
    //   30: getfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   33: aastore
    //   34: dup
    //   35: iconst_3
    //   36: aload_0
    //   37: getfield 48	com/tencent/mm/pluginsdk/g/a/a/l:veN	Ljava/lang/String;
    //   40: aastore
    //   41: dup
    //   42: iconst_4
    //   43: aload_0
    //   44: getfield 68	com/tencent/mm/pluginsdk/g/a/a/l:vdF	Ljava/lang/String;
    //   47: invokestatic 103	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   50: invokestatic 185	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   53: aastore
    //   54: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: iconst_1
    //   58: aload_0
    //   59: getfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   62: if_icmpeq +10 -> 72
    //   65: ldc 178
    //   67: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   70: aload_0
    //   71: areturn
    //   72: aload_0
    //   73: getfield 68	com/tencent/mm/pluginsdk/g/a/a/l:vdF	Ljava/lang/String;
    //   76: invokestatic 103	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   79: ifeq +60 -> 139
    //   82: ldc 110
    //   84: ldc 187
    //   86: iconst_1
    //   87: anewarray 4	java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload_0
    //   93: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   96: aastore
    //   97: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: aload_0
    //   101: aconst_null
    //   102: putfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   105: aload_0
    //   106: bipush 8
    //   108: putfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   111: aload_0
    //   112: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   115: ldc2_w 188
    //   118: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   121: aload_0
    //   122: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   125: ldc2_w 190
    //   128: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   131: ldc 178
    //   133: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: goto -66 -> 70
    //   139: aload_0
    //   140: getfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   143: astore_1
    //   144: aload_0
    //   145: getfield 48	com/tencent/mm/pluginsdk/g/a/a/l:veN	Ljava/lang/String;
    //   148: astore_2
    //   149: aload_0
    //   150: getfield 68	com/tencent/mm/pluginsdk/g/a/a/l:vdF	Ljava/lang/String;
    //   153: astore_3
    //   154: new 193	java/io/File
    //   157: astore 4
    //   159: aload 4
    //   161: aload_1
    //   162: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   165: aload 4
    //   167: invokevirtual 200	java/io/File:exists	()Z
    //   170: ifeq +11 -> 181
    //   173: aload 4
    //   175: invokevirtual 203	java/io/File:isFile	()Z
    //   178: ifne +97 -> 275
    //   181: ldc 110
    //   183: ldc 205
    //   185: iconst_1
    //   186: anewarray 4	java/lang/Object
    //   189: dup
    //   190: iconst_0
    //   191: aload_1
    //   192: aastore
    //   193: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   196: iconst_0
    //   197: istore 5
    //   199: ldc 110
    //   201: ldc 207
    //   203: iconst_2
    //   204: anewarray 4	java/lang/Object
    //   207: dup
    //   208: iconst_0
    //   209: aload_0
    //   210: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   213: aastore
    //   214: dup
    //   215: iconst_1
    //   216: iload 5
    //   218: invokestatic 185	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   221: aastore
    //   222: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: ldc 110
    //   227: ldc 209
    //   229: iconst_2
    //   230: anewarray 4	java/lang/Object
    //   233: dup
    //   234: iconst_0
    //   235: aload_0
    //   236: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   239: aastore
    //   240: dup
    //   241: iconst_1
    //   242: iload 5
    //   244: invokestatic 185	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   247: aastore
    //   248: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: iload 5
    //   253: ifne +284 -> 537
    //   256: aload_0
    //   257: aconst_null
    //   258: putfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   261: aload_0
    //   262: bipush 8
    //   264: putfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   267: ldc 178
    //   269: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   272: goto -202 -> 70
    //   275: new 193	java/io/File
    //   278: astore 4
    //   280: aload 4
    //   282: aload_2
    //   283: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   286: aload 4
    //   288: invokevirtual 213	java/io/File:getParentFile	()Ljava/io/File;
    //   291: invokevirtual 216	java/io/File:mkdirs	()Z
    //   294: pop
    //   295: aload 4
    //   297: invokevirtual 219	java/io/File:delete	()Z
    //   300: pop
    //   301: aload_1
    //   302: invokestatic 161	com/tencent/mm/pluginsdk/g/a/d/a:aji	(Ljava/lang/String;)[B
    //   305: astore_1
    //   306: aload_1
    //   307: invokestatic 152	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   310: ifeq +46 -> 356
    //   313: ldc 110
    //   315: ldc 221
    //   317: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: aload_0
    //   321: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   324: ldc2_w 225
    //   327: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   330: aload_0
    //   331: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   334: ldc2_w 190
    //   337: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   340: aload_0
    //   341: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   344: ldc2_w 227
    //   347: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   350: iconst_0
    //   351: istore 5
    //   353: goto -154 -> 199
    //   356: aload_1
    //   357: aload_3
    //   358: invokevirtual 232	java/lang/String:getBytes	()[B
    //   361: invokestatic 238	com/tencent/mm/protocal/MMProtocalJni:aesDecrypt	([B[B)[B
    //   364: astore_3
    //   365: aload_3
    //   366: invokestatic 152	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   369: ifeq +46 -> 415
    //   372: ldc 110
    //   374: ldc 240
    //   376: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   379: aload_0
    //   380: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   383: ldc2_w 241
    //   386: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   389: aload_0
    //   390: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   393: ldc2_w 190
    //   396: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   399: aload_0
    //   400: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   403: ldc2_w 227
    //   406: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   409: iconst_0
    //   410: istore 5
    //   412: goto -213 -> 199
    //   415: aload_2
    //   416: aload_3
    //   417: invokestatic 246	com/tencent/mm/pluginsdk/g/a/d/a:D	(Ljava/lang/String;[B)Z
    //   420: istore 6
    //   422: iload 6
    //   424: istore 5
    //   426: iload 6
    //   428: ifne -229 -> 199
    //   431: ldc 110
    //   433: ldc 248
    //   435: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   438: aload_0
    //   439: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   442: ldc2_w 249
    //   445: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   448: aload_0
    //   449: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   452: ldc2_w 190
    //   455: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   458: aload_0
    //   459: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   462: ldc2_w 227
    //   465: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   468: iload 6
    //   470: istore 5
    //   472: goto -273 -> 199
    //   475: astore_2
    //   476: iconst_0
    //   477: istore 5
    //   479: ldc 110
    //   481: aload_2
    //   482: ldc 252
    //   484: iconst_0
    //   485: anewarray 4	java/lang/Object
    //   488: invokestatic 256	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   491: ldc 110
    //   493: ldc_w 258
    //   496: iconst_2
    //   497: anewarray 4	java/lang/Object
    //   500: dup
    //   501: iconst_0
    //   502: aload_0
    //   503: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   506: aastore
    //   507: dup
    //   508: iconst_1
    //   509: aload_2
    //   510: aastore
    //   511: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   514: aload_0
    //   515: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   518: ldc2_w 190
    //   521: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   524: aload_0
    //   525: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   528: ldc2_w 227
    //   531: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   534: goto -309 -> 225
    //   537: aload_0
    //   538: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   541: ldc2_w 259
    //   544: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   547: aload_0
    //   548: aload_0
    //   549: getfield 48	com/tencent/mm/pluginsdk/g/a/a/l:veN	Ljava/lang/String;
    //   552: putfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   555: aload_0
    //   556: getfield 66	com/tencent/mm/pluginsdk/g/a/a/l:vei	Z
    //   559: ifeq +43 -> 602
    //   562: aload_0
    //   563: new 262	java/lang/StringBuilder
    //   566: dup
    //   567: invokespecial 263	java/lang/StringBuilder:<init>	()V
    //   570: aload_0
    //   571: getfield 62	com/tencent/mm/pluginsdk/g/a/a/l:filePath	Ljava/lang/String;
    //   574: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: ldc_w 269
    //   580: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   583: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   586: putfield 48	com/tencent/mm/pluginsdk/g/a/a/l:veN	Ljava/lang/String;
    //   589: aload_0
    //   590: iconst_2
    //   591: putfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   594: ldc 178
    //   596: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   599: goto -529 -> 70
    //   602: aload_0
    //   603: iconst_4
    //   604: putfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   607: ldc 178
    //   609: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   612: goto -542 -> 70
    //   615: astore_2
    //   616: goto -137 -> 479
    //
    // Exception table:
    //   from	to	target	type
    //   139	181	475	java/lang/Exception
    //   181	196	475	java/lang/Exception
    //   275	350	475	java/lang/Exception
    //   356	409	475	java/lang/Exception
    //   415	422	475	java/lang/Exception
    //   431	468	475	java/lang/Exception
    //   199	225	615	java/lang/Exception
  }

  // ERROR //
  final l dim()
  {
    // Byte code:
    //   0: ldc_w 274
    //   3: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 110
    //   8: ldc_w 276
    //   11: iconst_4
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_0
    //   18: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: aload_0
    //   25: invokevirtual 106	com/tencent/mm/pluginsdk/g/a/a/l:dip	()Ljava/lang/String;
    //   28: aastore
    //   29: dup
    //   30: iconst_2
    //   31: aload_0
    //   32: getfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   35: aastore
    //   36: dup
    //   37: iconst_3
    //   38: aload_0
    //   39: getfield 48	com/tencent/mm/pluginsdk/g/a/a/l:veN	Ljava/lang/String;
    //   42: aastore
    //   43: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: iconst_2
    //   47: aload_0
    //   48: getfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   51: if_icmpeq +53 -> 104
    //   54: bipush 8
    //   56: aload_0
    //   57: getfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   60: if_icmpne +36 -> 96
    //   63: aload_0
    //   64: getfield 64	com/tencent/mm/pluginsdk/g/a/a/l:vej	Z
    //   67: ifeq +29 -> 96
    //   70: aload_0
    //   71: getfield 58	com/tencent/mm/pluginsdk/g/a/a/l:cut	I
    //   74: aload_0
    //   75: getfield 60	com/tencent/mm/pluginsdk/g/a/a/l:cuu	I
    //   78: aload_0
    //   79: getfield 70	com/tencent/mm/pluginsdk/g/a/a/l:vdG	I
    //   82: aload_0
    //   83: getfield 76	com/tencent/mm/pluginsdk/g/a/a/l:cuA	Z
    //   86: iconst_0
    //   87: iconst_0
    //   88: iconst_0
    //   89: aload_0
    //   90: getfield 80	com/tencent/mm/pluginsdk/g/a/a/l:vdL	Ljava/lang/String;
    //   93: invokestatic 280	com/tencent/mm/pluginsdk/g/a/a/j:a	(IIIZZZZLjava/lang/String;)V
    //   96: ldc_w 274
    //   99: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_0
    //   103: areturn
    //   104: aload_0
    //   105: getfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   108: astore_1
    //   109: aload_0
    //   110: getfield 48	com/tencent/mm/pluginsdk/g/a/a/l:veN	Ljava/lang/String;
    //   113: astore_2
    //   114: new 193	java/io/File
    //   117: astore_3
    //   118: aload_3
    //   119: aload_1
    //   120: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   123: aload_3
    //   124: invokevirtual 200	java/io/File:exists	()Z
    //   127: ifeq +10 -> 137
    //   130: aload_3
    //   131: invokevirtual 203	java/io/File:isFile	()Z
    //   134: ifne +112 -> 246
    //   137: ldc 110
    //   139: ldc 205
    //   141: iconst_1
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload_1
    //   148: aastore
    //   149: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: iconst_0
    //   153: istore 4
    //   155: ldc 110
    //   157: ldc_w 282
    //   160: iconst_2
    //   161: anewarray 4	java/lang/Object
    //   164: dup
    //   165: iconst_0
    //   166: aload_0
    //   167: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   170: aastore
    //   171: dup
    //   172: iconst_1
    //   173: iload 4
    //   175: invokestatic 185	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   178: aastore
    //   179: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: ldc 110
    //   184: ldc_w 284
    //   187: iconst_2
    //   188: anewarray 4	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload_0
    //   194: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   197: aastore
    //   198: dup
    //   199: iconst_1
    //   200: iload 4
    //   202: invokestatic 185	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   205: aastore
    //   206: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: iload 4
    //   211: ifeq +130 -> 341
    //   214: aload_0
    //   215: aload_0
    //   216: getfield 48	com/tencent/mm/pluginsdk/g/a/a/l:veN	Ljava/lang/String;
    //   219: putfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   222: aload_0
    //   223: iconst_4
    //   224: putfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   227: aload_0
    //   228: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   231: ldc2_w 285
    //   234: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   237: ldc_w 274
    //   240: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: goto -141 -> 102
    //   246: new 193	java/io/File
    //   249: astore_3
    //   250: aload_3
    //   251: aload_2
    //   252: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   255: aload_3
    //   256: invokevirtual 219	java/io/File:delete	()Z
    //   259: pop
    //   260: aload_1
    //   261: invokestatic 161	com/tencent/mm/pluginsdk/g/a/d/a:aji	(Ljava/lang/String;)[B
    //   264: invokestatic 292	com/tencent/mm/a/r:B	([B)[B
    //   267: astore_1
    //   268: aload_1
    //   269: invokestatic 152	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   272: ifeq +17 -> 289
    //   275: ldc 110
    //   277: ldc_w 294
    //   280: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: iconst_0
    //   284: istore 4
    //   286: goto -131 -> 155
    //   289: aload_2
    //   290: aload_1
    //   291: invokestatic 246	com/tencent/mm/pluginsdk/g/a/d/a:D	(Ljava/lang/String;[B)Z
    //   294: istore 4
    //   296: goto -141 -> 155
    //   299: astore_2
    //   300: iconst_0
    //   301: istore 4
    //   303: ldc 110
    //   305: aload_2
    //   306: ldc 252
    //   308: iconst_0
    //   309: anewarray 4	java/lang/Object
    //   312: invokestatic 256	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   315: ldc 110
    //   317: ldc_w 296
    //   320: iconst_2
    //   321: anewarray 4	java/lang/Object
    //   324: dup
    //   325: iconst_0
    //   326: aload_0
    //   327: getfield 56	com/tencent/mm/pluginsdk/g/a/a/l:vdC	Ljava/lang/String;
    //   330: aastore
    //   331: dup
    //   332: iconst_1
    //   333: aload_2
    //   334: aastore
    //   335: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   338: goto -156 -> 182
    //   341: aload_0
    //   342: aconst_null
    //   343: putfield 46	com/tencent/mm/pluginsdk/g/a/a/l:veM	Ljava/lang/String;
    //   346: aload_0
    //   347: bipush 8
    //   349: putfield 44	com/tencent/mm/pluginsdk/g/a/a/l:state	I
    //   352: aload_0
    //   353: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   356: ldc2_w 297
    //   359: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   362: aload_0
    //   363: getfield 82	com/tencent/mm/pluginsdk/g/a/a/l:vdK	J
    //   366: ldc2_w 299
    //   369: invokestatic 142	com/tencent/mm/pluginsdk/g/a/a/j:z	(JJ)V
    //   372: aload_0
    //   373: getfield 64	com/tencent/mm/pluginsdk/g/a/a/l:vej	Z
    //   376: ifeq +38 -> 414
    //   379: aload_0
    //   380: getfield 58	com/tencent/mm/pluginsdk/g/a/a/l:cut	I
    //   383: aload_0
    //   384: getfield 60	com/tencent/mm/pluginsdk/g/a/a/l:cuu	I
    //   387: aload_0
    //   388: getfield 70	com/tencent/mm/pluginsdk/g/a/a/l:vdG	I
    //   391: aload_0
    //   392: getfield 76	com/tencent/mm/pluginsdk/g/a/a/l:cuA	Z
    //   395: iconst_1
    //   396: iconst_0
    //   397: iconst_0
    //   398: aload_0
    //   399: getfield 80	com/tencent/mm/pluginsdk/g/a/a/l:vdL	Ljava/lang/String;
    //   402: invokestatic 280	com/tencent/mm/pluginsdk/g/a/a/j:a	(IIIZZZZLjava/lang/String;)V
    //   405: ldc_w 274
    //   408: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -309 -> 102
    //   414: aload_0
    //   415: getfield 66	com/tencent/mm/pluginsdk/g/a/a/l:vei	Z
    //   418: ifeq -13 -> 405
    //   421: aload_0
    //   422: getfield 78	com/tencent/mm/pluginsdk/g/a/a/l:cuw	Z
    //   425: ifeq -20 -> 405
    //   428: aload_0
    //   429: getfield 58	com/tencent/mm/pluginsdk/g/a/a/l:cut	I
    //   432: istore 5
    //   434: aload_0
    //   435: getfield 60	com/tencent/mm/pluginsdk/g/a/a/l:cuu	I
    //   438: istore 6
    //   440: aload_0
    //   441: getfield 84	com/tencent/mm/pluginsdk/g/a/a/l:url	Ljava/lang/String;
    //   444: astore_1
    //   445: aload_0
    //   446: getfield 90	com/tencent/mm/pluginsdk/g/a/a/l:cuv	I
    //   449: istore 7
    //   451: aload_0
    //   452: getfield 86	com/tencent/mm/pluginsdk/g/a/a/l:vdM	I
    //   455: aload_0
    //   456: getfield 88	com/tencent/mm/pluginsdk/g/a/a/l:vdN	I
    //   459: if_icmple +31 -> 490
    //   462: getstatic 306	com/tencent/mm/pluginsdk/g/a/a/j$a:veE	Lcom/tencent/mm/pluginsdk/g/a/a/j$a;
    //   465: astore_2
    //   466: iload 5
    //   468: iload 6
    //   470: aload_1
    //   471: iload 7
    //   473: aload_2
    //   474: iconst_0
    //   475: aload_0
    //   476: getfield 76	com/tencent/mm/pluginsdk/g/a/a/l:cuA	Z
    //   479: iconst_0
    //   480: aload_0
    //   481: getfield 80	com/tencent/mm/pluginsdk/g/a/a/l:vdL	Ljava/lang/String;
    //   484: invokestatic 309	com/tencent/mm/pluginsdk/g/a/a/j:a	(IILjava/lang/String;ILcom/tencent/mm/pluginsdk/g/a/a/j$a;ZZZLjava/lang/String;)V
    //   487: goto -82 -> 405
    //   490: getstatic 312	com/tencent/mm/pluginsdk/g/a/a/j$a:veC	Lcom/tencent/mm/pluginsdk/g/a/a/j$a;
    //   493: astore_2
    //   494: goto -28 -> 466
    //   497: astore_2
    //   498: goto -195 -> 303
    //
    // Exception table:
    //   from	to	target	type
    //   104	137	299	java/lang/Exception
    //   137	152	299	java/lang/Exception
    //   246	283	299	java/lang/Exception
    //   289	296	299	java/lang/Exception
    //   155	182	497	java/lang/Exception
  }

  final String din()
  {
    AppMethodBeat.i(79553);
    ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSum(), state " + dip(), new Object[] { this.vdC });
    if (16 == this.state)
    {
      localObject = this.veM;
      AppMethodBeat.o(79553);
    }
    while (true)
    {
      return localObject;
      if ((4 == this.state) || (32 == this.state))
        break;
      localObject = null;
      AppMethodBeat.o(79553);
    }
    String str1 = dio();
    ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl return = %s", new Object[] { this.vdC, str1 });
    if (this.state == 4)
    {
      if ((bo.isNullOrNil(str1)) && (!this.vei))
      {
        j.z(this.vdK, 58L);
        j.z(this.vdK, 45L);
      }
      if (!bo.isNullOrNil(str1))
        break label296;
      if (!this.vej)
        break label213;
      j.a(this.cut, this.cuu, this.vdG, this.cuA, true, true, false, this.vdL);
    }
    label213: 
    do
      while (true)
      {
        AppMethodBeat.o(79553);
        localObject = str1;
        break;
        if ((this.vei) && (this.cuw))
        {
          i = this.cut;
          j = this.cuu;
          str2 = this.url;
          k = this.cuv;
          if (this.vdM > this.vdN);
          for (localObject = j.a.veE; ; localObject = j.a.veC)
          {
            j.a(i, j, str2, k, (j.a)localObject, false, this.cuA, true, this.vdL);
            break;
          }
          if (!this.vej)
            break label332;
          j.a(this.cut, this.cuu, this.vdG, this.cuA, true, true, true, this.vdL);
        }
      }
    while ((!this.vei) || (!this.cuw));
    label296: label332: int j = this.cut;
    int i = this.cuu;
    String str2 = this.url;
    int k = this.cuv;
    if (this.vdM > this.vdN);
    for (Object localObject = j.a.veE; ; localObject = j.a.veC)
    {
      j.a(j, i, str2, k, (j.a)localObject, true, this.cuA, true, this.vdL);
      break;
    }
  }

  final String dip()
  {
    AppMethodBeat.i(79555);
    String str;
    switch (this.state)
    {
    default:
      str = this.state;
      AppMethodBeat.o(79555);
    case 1:
    case 2:
    case 4:
    case 8:
    case 16:
    case 32:
    }
    while (true)
    {
      return str;
      str = "state_decrypt";
      AppMethodBeat.o(79555);
      continue;
      str = "state_decompress";
      AppMethodBeat.o(79555);
      continue;
      str = "state_check_sum";
      AppMethodBeat.o(79555);
      continue;
      str = "state_file_invalid";
      AppMethodBeat.o(79555);
      continue;
      str = "state_file_valid";
      AppMethodBeat.o(79555);
      continue;
      str = "state_pre_verify_check_sum";
      AppMethodBeat.o(79555);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.l
 * JD-Core Version:    0.6.2
 */