package com.tencent.mm.plugin.sns.model.a;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.lucky.a.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class f extends c
{
  protected boolean qOB = false;
  protected boolean qOC = false;
  protected boolean qOD = false;
  protected boolean qOE = false;

  public f(c.a parama, a parama1)
  {
    super(parama, parama1);
  }

  private static String l(String paramString, String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    int k;
    if (paramString.contains("?"))
    {
      paramString = "&";
      localStringBuilder.append(paramString);
      int i = 1;
      int j = paramArrayOfString.length;
      k = 0;
      label36: if (k >= j)
        break label82;
      paramString = paramArrayOfString[k];
      if (i == 0)
        break label72;
      i = 0;
    }
    while (true)
    {
      localStringBuilder.append(paramString);
      k++;
      break label36;
      paramString = "?";
      break;
      label72: localStringBuilder.append("&");
    }
    label82: return localStringBuilder.toString();
  }

  public final String Yx(String paramString)
  {
    int i = 2;
    int j = 0;
    Object localObject1 = paramString;
    try
    {
      localObject2 = g.Nu().getValue("SnsCloseDownloadWebp");
      localObject1 = paramString;
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject1 = paramString;
        k = bo.ank((String)localObject2);
        if (k != 0)
        {
          k = 0;
          localObject1 = paramString;
          if (n.LD())
            break label253;
          m = 0;
          label58: localObject1 = paramString;
          if (n.LD())
            break label286;
          n = j;
        }
        while (true)
        {
          localObject1 = paramString;
          if (bo.isNullOrNil(ae.gjl))
          {
            localObject1 = paramString;
            if (bo.isNullOrNil(ae.gjm))
              break label687;
          }
          localObject3 = paramString;
          localObject1 = paramString;
          if (bo.isNullOrNil(ae.gjl))
            break label348;
          localObject1 = paramString;
          localObject2 = paramString.split("(//?)");
          localObject1 = paramString;
          localObject3 = new java/lang/StringBuilder;
          localObject1 = paramString;
          ((StringBuilder)localObject3).<init>();
          localObject1 = paramString;
          ((StringBuilder)localObject3).append(localObject2[0]).append("//").append(ae.gjl);
          for (k = i; ; k++)
          {
            localObject1 = paramString;
            if (k >= localObject2.length)
              break;
            localObject1 = paramString;
            ((StringBuilder)localObject3).append("/").append(localObject2[k]);
          }
          localObject1 = paramString;
          if (Build.VERSION.SDK_INT < 14)
          {
            k = 0;
            break;
          }
          localObject1 = paramString;
          if (q.etn.esF == 2)
          {
            k = 0;
            break;
          }
          localObject1 = paramString;
          if (bo.isNullOrNil(ae.gjm))
            break label896;
          k = 0;
          break;
          label253: localObject1 = paramString;
          if (!af.cnQ())
          {
            m = 0;
            break label58;
          }
          localObject1 = paramString;
          if (bo.isNullOrNil(ae.gjm))
            break label890;
          m = 0;
          break label58;
          label286: n = j;
          localObject1 = paramString;
          if (af.cnP())
          {
            n = j;
            localObject1 = paramString;
            if (bo.isNullOrNil(ae.gjm))
              n = 1;
          }
        }
        localObject1 = paramString;
        Object localObject3 = ((StringBuilder)localObject3).toString();
        localObject1 = localObject3;
        ab.i("MicroMsg.SnsDownloadImageBase", "new url  ".concat(String.valueOf(localObject3)));
        label348: localObject2 = localObject3;
        localObject1 = localObject3;
        if (!bo.isNullOrNil(ae.gjm))
        {
          localObject1 = localObject3;
          paramString = new java/lang/StringBuilder;
          localObject1 = localObject3;
          paramString.<init>("tp=");
          localObject1 = localObject3;
          localObject2 = l((String)localObject3, new String[] { ae.gjm });
          localObject1 = localObject2;
          ab.i("MicroMsg.SnsDownloadImageBase", "(dbg) new url  ".concat(String.valueOf(localObject2)));
        }
        paramString = (String)localObject2;
        localObject1 = localObject2;
        if (this.qOa != null)
        {
          paramString = (String)localObject2;
          localObject1 = localObject2;
          if (this.qOa.qJh.wET != 0)
          {
            localObject1 = localObject2;
            paramString = l((String)localObject2, new String[] { "enc=1" });
            localObject1 = paramString;
            localObject2 = new java/lang/StringBuilder;
            localObject1 = paramString;
            ((StringBuilder)localObject2).<init>("test for enckey ");
            localObject1 = paramString;
            ab.i("MicroMsg.SnsDownloadImageBase", this.qOa.qJh.wEU + " " + this.qOa.qJh.wET + " " + paramString);
            localObject1 = paramString;
            b.kT(136);
            localObject1 = paramString;
            this.qOE = true;
          }
        }
        localObject1 = paramString;
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        try
        {
          Object localObject2;
          int n;
          if (this.qOa != null)
          {
            localObject1 = paramString;
            if (this.qOa.qJh != null)
            {
              localObject1 = this.qOa.qJh;
              if (!this.qOa.qNT)
                continue;
              localObject2 = ((bau)localObject1).wEZ;
              if (!this.qOa.qNT)
                continue;
              k = ((bau)localObject1).wFa;
              localObject1 = paramString;
              if (!TextUtils.isEmpty((CharSequence)localObject2))
                localObject1 = l(paramString, new String[] { "token=".concat(String.valueOf(localObject2)), "idx=".concat(String.valueOf(k)) });
            }
          }
          return localObject1;
          label687: if (m != 0)
          {
            localObject1 = paramString;
            localObject2 = l(paramString, new String[] { "tp=wxpc" });
            localObject1 = localObject2;
            ab.i("MicroMsg.SnsDownloadImageBase", "new url  ".concat(String.valueOf(localObject2)));
            continue;
            localException2 = localException2;
            paramString = (String)localObject1;
            localObject1 = localException2;
            ab.e("MicroMsg.SnsDownloadImageBase", "error get dyna by webp " + ((Exception)localObject1).getMessage());
            localObject1 = paramString;
            continue;
          }
          if (n != 0)
          {
            localObject1 = paramString;
            str = l(paramString, new String[] { "tp=hevc" });
            localObject1 = str;
            ab.i("MicroMsg.SnsDownloadImageBase", "new url  ".concat(String.valueOf(str)));
            continue;
          }
          String str = paramString;
          if (k == 0)
            continue;
          localObject1 = paramString;
          str = l(paramString, new String[] { "tp=webp" });
          localObject1 = str;
          ab.i("MicroMsg.SnsDownloadImageBase", "new url  ".concat(String.valueOf(str)));
          continue;
          str = ((bau)localObject1).wEW;
          continue;
          k = ((bau)localObject1).wEX;
          continue;
        }
        catch (Exception localException1)
        {
          continue;
        }
        label890: int m = 1;
        continue;
        label896: int k = 1;
        continue;
        k = 0;
      }
    }
  }

  // ERROR //
  public final String b(String paramString, bau parambau)
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aload_2
    //   6: ifnonnull +18 -> 24
    //   9: ldc 129
    //   11: ldc 232
    //   13: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 234	com/tencent/mm/plugin/sns/model/a/f:Yx	(Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_1
    //   22: aload_1
    //   23: areturn
    //   24: aload_1
    //   25: astore 5
    //   27: invokestatic 57	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   30: ldc 59
    //   32: invokevirtual 64	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   35: astore 6
    //   37: aload_1
    //   38: astore 5
    //   40: aload 6
    //   42: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   45: ifne +810 -> 855
    //   48: aload_1
    //   49: astore 5
    //   51: aload 6
    //   53: invokestatic 74	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   56: istore 7
    //   58: iload 7
    //   60: ifeq +160 -> 220
    //   63: iconst_0
    //   64: istore 7
    //   66: aload_1
    //   67: astore 5
    //   69: invokestatic 80	com/tencent/mm/compatible/e/n:LD	()Z
    //   72: ifne +202 -> 274
    //   75: iconst_0
    //   76: istore 8
    //   78: aload_1
    //   79: astore 5
    //   81: invokestatic 80	com/tencent/mm/compatible/e/n:LD	()Z
    //   84: ifne +223 -> 307
    //   87: iload 4
    //   89: istore 9
    //   91: aload_1
    //   92: astore 5
    //   94: getstatic 86	com/tencent/mm/platformtools/ae:gjl	Ljava/lang/String;
    //   97: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   100: ifeq +15 -> 115
    //   103: aload_1
    //   104: astore 5
    //   106: getstatic 89	com/tencent/mm/platformtools/ae:gjm	Ljava/lang/String;
    //   109: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   112: ifne +535 -> 647
    //   115: aload_1
    //   116: astore 10
    //   118: aload_1
    //   119: astore 5
    //   121: getstatic 86	com/tencent/mm/platformtools/ae:gjl	Ljava/lang/String;
    //   124: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   127: ifne +244 -> 371
    //   130: aload_1
    //   131: astore 5
    //   133: aload_1
    //   134: ldc 91
    //   136: invokevirtual 95	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   139: astore 10
    //   141: aload_1
    //   142: astore 5
    //   144: new 26	java/lang/StringBuilder
    //   147: astore 6
    //   149: aload_1
    //   150: astore 5
    //   152: aload 6
    //   154: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   157: aload_1
    //   158: astore 5
    //   160: aload 6
    //   162: aload 10
    //   164: iconst_0
    //   165: aaload
    //   166: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: ldc 100
    //   171: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: getstatic 86	com/tencent/mm/platformtools/ae:gjl	Ljava/lang/String;
    //   177: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: iload_3
    //   182: istore 7
    //   184: aload_1
    //   185: astore 5
    //   187: iload 7
    //   189: aload 10
    //   191: arraylength
    //   192: if_icmpge +150 -> 342
    //   195: aload_1
    //   196: astore 5
    //   198: aload 6
    //   200: ldc 102
    //   202: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: aload 10
    //   207: iload 7
    //   209: aaload
    //   210: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: iinc 7 1
    //   217: goto -33 -> 184
    //   220: aload_1
    //   221: astore 5
    //   223: getstatic 108	android/os/Build$VERSION:SDK_INT	I
    //   226: bipush 14
    //   228: if_icmpge +9 -> 237
    //   231: iconst_0
    //   232: istore 7
    //   234: goto -168 -> 66
    //   237: aload_1
    //   238: astore 5
    //   240: getstatic 114	com/tencent/mm/compatible/e/q:etn	Lcom/tencent/mm/compatible/e/k;
    //   243: getfield 119	com/tencent/mm/compatible/e/k:esF	I
    //   246: iconst_2
    //   247: if_icmpne +9 -> 256
    //   250: iconst_0
    //   251: istore 7
    //   253: goto -187 -> 66
    //   256: aload_1
    //   257: astore 5
    //   259: getstatic 89	com/tencent/mm/platformtools/ae:gjm	Ljava/lang/String;
    //   262: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   265: ifne +584 -> 849
    //   268: iconst_0
    //   269: istore 7
    //   271: goto -205 -> 66
    //   274: aload_1
    //   275: astore 5
    //   277: invokestatic 124	com/tencent/mm/plugin/sns/model/af:cnQ	()Z
    //   280: ifne +9 -> 289
    //   283: iconst_0
    //   284: istore 8
    //   286: goto -208 -> 78
    //   289: aload_1
    //   290: astore 5
    //   292: getstatic 89	com/tencent/mm/platformtools/ae:gjm	Ljava/lang/String;
    //   295: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   298: ifne +545 -> 843
    //   301: iconst_0
    //   302: istore 8
    //   304: goto -226 -> 78
    //   307: iload 4
    //   309: istore 9
    //   311: aload_1
    //   312: astore 5
    //   314: invokestatic 127	com/tencent/mm/plugin/sns/model/af:cnP	()Z
    //   317: ifeq -226 -> 91
    //   320: iload 4
    //   322: istore 9
    //   324: aload_1
    //   325: astore 5
    //   327: getstatic 89	com/tencent/mm/platformtools/ae:gjm	Ljava/lang/String;
    //   330: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   333: ifeq -242 -> 91
    //   336: iconst_1
    //   337: istore 9
    //   339: goto -248 -> 91
    //   342: aload_1
    //   343: astore 5
    //   345: aload 6
    //   347: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   350: astore 10
    //   352: aload 10
    //   354: astore 5
    //   356: ldc 129
    //   358: ldc 131
    //   360: aload 10
    //   362: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   365: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   368: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   371: aload 10
    //   373: astore 6
    //   375: aload 10
    //   377: astore 5
    //   379: getstatic 89	com/tencent/mm/platformtools/ae:gjm	Ljava/lang/String;
    //   382: invokestatic 70	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   385: ifne +68 -> 453
    //   388: aload 10
    //   390: astore 5
    //   392: new 26	java/lang/StringBuilder
    //   395: astore_1
    //   396: aload 10
    //   398: astore 5
    //   400: aload_1
    //   401: ldc 146
    //   403: invokespecial 29	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   406: aload 10
    //   408: astore 5
    //   410: aload 10
    //   412: iconst_1
    //   413: anewarray 33	java/lang/String
    //   416: dup
    //   417: iconst_0
    //   418: aload_1
    //   419: getstatic 89	com/tencent/mm/platformtools/ae:gjm	Ljava/lang/String;
    //   422: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   428: aastore
    //   429: invokestatic 148	com/tencent/mm/plugin/sns/model/a/f:l	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   432: astore 6
    //   434: aload 6
    //   436: astore 5
    //   438: ldc 129
    //   440: ldc 150
    //   442: aload 6
    //   444: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   447: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   450: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   453: aload 6
    //   455: astore_1
    //   456: aload 6
    //   458: astore 5
    //   460: aload_2
    //   461: getfield 165	com/tencent/mm/protocal/protobuf/bau:wET	I
    //   464: ifeq +98 -> 562
    //   467: aload 6
    //   469: astore 5
    //   471: aload 6
    //   473: iconst_1
    //   474: anewarray 33	java/lang/String
    //   477: dup
    //   478: iconst_0
    //   479: ldc 167
    //   481: aastore
    //   482: invokestatic 148	com/tencent/mm/plugin/sns/model/a/f:l	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   485: astore_1
    //   486: aload_1
    //   487: astore 5
    //   489: new 26	java/lang/StringBuilder
    //   492: astore 6
    //   494: aload_1
    //   495: astore 5
    //   497: aload 6
    //   499: ldc 169
    //   501: invokespecial 29	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   504: aload_1
    //   505: astore 5
    //   507: ldc 129
    //   509: aload 6
    //   511: aload_2
    //   512: getfield 173	com/tencent/mm/protocal/protobuf/bau:wEU	J
    //   515: invokevirtual 176	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   518: ldc 178
    //   520: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: aload_2
    //   524: getfield 165	com/tencent/mm/protocal/protobuf/bau:wET	I
    //   527: invokevirtual 181	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   530: ldc 178
    //   532: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: aload_1
    //   536: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   542: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   545: aload_1
    //   546: astore 5
    //   548: sipush 136
    //   551: invokestatic 187	com/tencent/mm/plugin/sns/lucky/a/b:kT	(I)V
    //   554: aload_1
    //   555: astore 5
    //   557: aload_0
    //   558: iconst_1
    //   559: putfield 21	com/tencent/mm/plugin/sns/model/a/f:qOE	Z
    //   562: aload_1
    //   563: astore 5
    //   565: aload_0
    //   566: getfield 154	com/tencent/mm/plugin/sns/model/a/f:qOa	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   569: getfield 190	com/tencent/mm/plugin/sns/model/a/a:qNT	Z
    //   572: ifeq +246 -> 818
    //   575: aload_2
    //   576: getfield 193	com/tencent/mm/protocal/protobuf/bau:wEZ	Ljava/lang/String;
    //   579: astore 6
    //   581: aload_0
    //   582: getfield 154	com/tencent/mm/plugin/sns/model/a/f:qOa	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   585: getfield 190	com/tencent/mm/plugin/sns/model/a/a:qNT	Z
    //   588: ifeq +239 -> 827
    //   591: aload_2
    //   592: getfield 196	com/tencent/mm/protocal/protobuf/bau:wFa	I
    //   595: istore 7
    //   597: aload 5
    //   599: astore_1
    //   600: aload 6
    //   602: invokestatic 201	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   605: ifne -583 -> 22
    //   608: aload 5
    //   610: iconst_2
    //   611: anewarray 33	java/lang/String
    //   614: dup
    //   615: iconst_0
    //   616: ldc 203
    //   618: aload 6
    //   620: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   623: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   626: aastore
    //   627: dup
    //   628: iconst_1
    //   629: ldc 205
    //   631: iload 7
    //   633: invokestatic 208	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   636: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   639: aastore
    //   640: invokestatic 148	com/tencent/mm/plugin/sns/model/a/f:l	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   643: astore_1
    //   644: goto -622 -> 22
    //   647: iload 8
    //   649: ifeq +76 -> 725
    //   652: aload_1
    //   653: astore 5
    //   655: aload_1
    //   656: iconst_1
    //   657: anewarray 33	java/lang/String
    //   660: dup
    //   661: iconst_0
    //   662: ldc 210
    //   664: aastore
    //   665: invokestatic 148	com/tencent/mm/plugin/sns/model/a/f:l	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   668: astore 6
    //   670: aload 6
    //   672: astore 5
    //   674: ldc 129
    //   676: ldc 131
    //   678: aload 6
    //   680: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   683: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   686: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   689: goto -236 -> 453
    //   692: astore_1
    //   693: aload_1
    //   694: astore_2
    //   695: aload 5
    //   697: astore_1
    //   698: ldc 129
    //   700: new 26	java/lang/StringBuilder
    //   703: dup
    //   704: ldc 212
    //   706: invokespecial 29	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   709: aload_2
    //   710: invokevirtual 215	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   713: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   719: invokestatic 218	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   722: goto -700 -> 22
    //   725: iload 9
    //   727: ifeq +43 -> 770
    //   730: aload_1
    //   731: astore 5
    //   733: aload_1
    //   734: iconst_1
    //   735: anewarray 33	java/lang/String
    //   738: dup
    //   739: iconst_0
    //   740: ldc 220
    //   742: aastore
    //   743: invokestatic 148	com/tencent/mm/plugin/sns/model/a/f:l	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   746: astore 6
    //   748: aload 6
    //   750: astore 5
    //   752: ldc 129
    //   754: ldc 131
    //   756: aload 6
    //   758: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   761: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   764: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   767: goto -314 -> 453
    //   770: aload_1
    //   771: astore 6
    //   773: iload 7
    //   775: ifeq -322 -> 453
    //   778: aload_1
    //   779: astore 5
    //   781: aload_1
    //   782: iconst_1
    //   783: anewarray 33	java/lang/String
    //   786: dup
    //   787: iconst_0
    //   788: ldc 222
    //   790: aastore
    //   791: invokestatic 148	com/tencent/mm/plugin/sns/model/a/f:l	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   794: astore 6
    //   796: aload 6
    //   798: astore 5
    //   800: ldc 129
    //   802: ldc 131
    //   804: aload 6
    //   806: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   809: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   812: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   815: goto -362 -> 453
    //   818: aload_2
    //   819: getfield 225	com/tencent/mm/protocal/protobuf/bau:wEW	Ljava/lang/String;
    //   822: astore 6
    //   824: goto -243 -> 581
    //   827: aload_2
    //   828: getfield 228	com/tencent/mm/protocal/protobuf/bau:wEX	I
    //   831: istore 7
    //   833: goto -236 -> 597
    //   836: astore_2
    //   837: aload 5
    //   839: astore_1
    //   840: goto -142 -> 698
    //   843: iconst_1
    //   844: istore 8
    //   846: goto -768 -> 78
    //   849: iconst_1
    //   850: istore 7
    //   852: goto -786 -> 66
    //   855: iconst_0
    //   856: istore 7
    //   858: goto -800 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   27	37	692	java/lang/Exception
    //   40	48	692	java/lang/Exception
    //   51	58	692	java/lang/Exception
    //   69	75	692	java/lang/Exception
    //   81	87	692	java/lang/Exception
    //   94	103	692	java/lang/Exception
    //   106	115	692	java/lang/Exception
    //   121	130	692	java/lang/Exception
    //   133	141	692	java/lang/Exception
    //   144	149	692	java/lang/Exception
    //   152	157	692	java/lang/Exception
    //   160	181	692	java/lang/Exception
    //   187	195	692	java/lang/Exception
    //   198	214	692	java/lang/Exception
    //   223	231	692	java/lang/Exception
    //   240	250	692	java/lang/Exception
    //   259	268	692	java/lang/Exception
    //   277	283	692	java/lang/Exception
    //   292	301	692	java/lang/Exception
    //   314	320	692	java/lang/Exception
    //   327	336	692	java/lang/Exception
    //   345	352	692	java/lang/Exception
    //   356	371	692	java/lang/Exception
    //   379	388	692	java/lang/Exception
    //   392	396	692	java/lang/Exception
    //   400	406	692	java/lang/Exception
    //   410	434	692	java/lang/Exception
    //   438	453	692	java/lang/Exception
    //   460	467	692	java/lang/Exception
    //   471	486	692	java/lang/Exception
    //   489	494	692	java/lang/Exception
    //   497	504	692	java/lang/Exception
    //   507	545	692	java/lang/Exception
    //   548	554	692	java/lang/Exception
    //   557	562	692	java/lang/Exception
    //   655	670	692	java/lang/Exception
    //   674	689	692	java/lang/Exception
    //   733	748	692	java/lang/Exception
    //   752	767	692	java/lang/Exception
    //   781	796	692	java/lang/Exception
    //   800	815	692	java/lang/Exception
    //   565	581	836	java/lang/Exception
    //   581	597	836	java/lang/Exception
    //   600	644	836	java/lang/Exception
    //   818	824	836	java/lang/Exception
    //   827	833	836	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.f
 * JD-Core Version:    0.6.2
 */