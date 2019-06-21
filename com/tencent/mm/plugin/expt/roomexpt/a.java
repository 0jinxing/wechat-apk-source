package com.tencent.mm.plugin.expt.roomexpt;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ac;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.text.SimpleDateFormat;

public final class a
  implements c, d
{
  private static final float[] lOi = { 0.0F, 0.3F, 0.45F, 0.55F, 0.67F, 0.75F, 0.85F, 1.0F };
  private static final float[] lOj = { 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.2F, 0.3F, 0.4F };
  private static final float[] lOk = { 0.0F, 0.1F, 0.2F, 0.3F, 0.4F, 0.5F, 0.6F, 0.7F, 0.8F, 0.9F, 1.0F };
  private static final int[] lOl = { 15, 35, 83, 140, 209, 297, 417, 599, 926, 1720 };
  private static final float[] lOm = { 0.0F, 0.3F, 0.5F, 0.6F, 0.7F, 0.7F, 0.8F, 0.8F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 1.0F };
  private static final float[] lOn = { 0.0F, 0.3F, 0.45F, 0.55F, 0.6F, 0.7F, 0.7F, 0.8F, 0.8F, 0.8F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 1.0F };
  private static final float[] lOo = { 0.1F, 0.2F, 0.3F, 0.4F, 0.5F, 0.6F, 0.7F, 0.8F, 0.9F, 1.0F };
  private static final int[] lOp = { 2400, 7500, 13000, 21500, 41000, 65000, 116000, 215000, 455000 };
  private static final float[] lOq = { 0.0F, 0.35F, 0.5F, 0.6F, 0.7F, 0.7F, 0.8F, 0.8F, 0.8F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 1.0F };
  private static a lOs;
  private SimpleDateFormat lOr = null;
  public b lOt;
  private ac lOu;
  private String[] lOv;
  private boolean lOw = false;
  int lOx = 0;

  private static float a(float[] paramArrayOfFloat, int[] paramArrayOfInt, long paramLong)
  {
    float f = 0.0F;
    AppMethodBeat.i(73571);
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length <= 0))
      AppMethodBeat.o(73571);
    while (true)
    {
      return f;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
        break;
      AppMethodBeat.o(73571);
    }
    int i = paramArrayOfFloat.length;
    int j = Math.min(paramArrayOfFloat.length, paramArrayOfInt.length);
    int k = 0;
    label58: if (k < j)
      if (paramLong >= paramArrayOfInt[k]);
    while (true)
    {
      f = paramArrayOfFloat[k];
      AppMethodBeat.o(73571);
      break;
      k++;
      break label58;
      k = i - 1;
    }
  }

  private static float b(float paramFloat, int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(73572);
    if (paramInt1 <= 0)
      AppMethodBeat.o(73572);
    while (true)
    {
      return f2;
      int i;
      if (paramInt2 == 1)
      {
        i = 1;
        label32: if (i == 0)
          break label122;
      }
      try
      {
        f2 = c(lOj, paramInt1);
        for (f2 = (paramFloat / paramInt1 + paramFloat / 7.0F) / 2.0F - f2; ; f2 += (paramFloat / paramInt1 + paramFloat / 7.0F) / 2.0F)
        {
          f1 = f2;
          ab.d("MicroMsg.ChatRoomExptService", "calc finish score result[%f] day[%d] isMute[%d] score[%f]", new Object[] { Float.valueOf(f2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Float.valueOf(paramFloat) });
          AppMethodBeat.o(73572);
          break;
          i = 0;
          break label32;
          label122: f2 = c(lOi, paramInt1);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.ChatRoomExptService", "calc finish score error[%s]", new Object[] { localException.toString() });
          f2 = f1;
        }
      }
    }
  }

  public static a brg()
  {
    AppMethodBeat.i(73564);
    if (lOs == null)
      lOs = new a();
    a locala = lOs;
    AppMethodBeat.o(73564);
    return locala;
  }

  private void brh()
  {
    AppMethodBeat.i(73565);
    if (this.lOu == null)
      AppMethodBeat.o(73565);
    while (true)
    {
      return;
      String str = this.lOu.Fj();
      g.RP().Ry().set(ac.a.xVo, str);
      ab.i("MicroMsg.ChatRoomExptService", "save expt info[%s]", new Object[] { this.lOu.Fk() });
      AppMethodBeat.o(73565);
    }
  }

  private static float c(float[] paramArrayOfFloat, int paramInt)
  {
    float f;
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length <= 0))
      f = 0.0F;
    while (true)
    {
      return f;
      if (paramInt >= paramArrayOfFloat.length)
        f = paramArrayOfFloat[(paramArrayOfFloat.length - 1)];
      else if (paramInt <= 0)
        f = paramArrayOfFloat[0];
      else
        f = paramArrayOfFloat[paramInt];
    }
  }

  public final void a(String paramString1, String paramString2, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(73569);
    com.tencent.mm.plugin.expt.a.a locala = (com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class);
    a.a locala1 = a.a.lFG;
    boolean bool;
    int i;
    if (this.lOu != null)
    {
      bool = this.lOu.cYq;
      if (locala.a(locala1, bool))
        break label73;
      i = 0;
      label55: if (i != 0)
        break label238;
      AppMethodBeat.o(73569);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label73: h.pYm.k(869L, 1L, 1L);
      long l = this.lOu.cYn;
      if (l >= 3L)
      {
        ab.d("MicroMsg.ChatRoomExptService", "room expt already finish");
        i = 0;
        break label55;
      }
      if (l == 0L)
      {
        i = 1;
        label126: if (!paramBoolean)
          break label192;
      }
      label192: for (l = 1L | l; ; l = 0x2 | l)
      {
        this.lOu.cYn = l;
        if (l < 3L)
          break label203;
        ab.d("MicroMsg.ChatRoomExptService", "user already enter mute room and unmute room, don't expt");
        h.pYm.k(869L, 2L, 1L);
        brh();
        i = 0;
        break;
        i = 0;
        break label126;
      }
      label203: if (i != 0)
      {
        if (this.lOu.cYo <= 0L)
          this.lOu.Fq();
        brh();
      }
      i = 1;
      break label55;
      label238: g.RS().aa(new a.4(this, paramLong, paramInt2, paramString1, paramInt1, paramBoolean, paramString2));
      AppMethodBeat.o(73569);
    }
  }

  public final void aE(final String paramString, final boolean paramBoolean)
  {
    AppMethodBeat.i(73568);
    ab.d("MicroMsg.ChatRoomExptService", "enter chat room [%s] isMute[%b]", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (this.lOx > 0)
    {
      this.lOx -= 1;
      g.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(73561);
          a.aF(paramString, paramBoolean);
          AppMethodBeat.o(73561);
        }
      });
      AppMethodBeat.o(73568);
    }
    while (true)
    {
      return;
      if ((this.lOv == null) || (this.lOv.length <= 0))
      {
        ab.d("MicroMsg.ChatRoomExptService", "roomname list is null");
        AppMethodBeat.o(73568);
      }
      else if (this.lOu == null)
      {
        AppMethodBeat.o(73568);
      }
      else if (this.lOu.cYn >= 5L)
      {
        ab.d("MicroMsg.ChatRoomExptService", "exptInfo is finish [%d]", new Object[] { Long.valueOf(this.lOu.cYn) });
        AppMethodBeat.o(73568);
      }
      else
      {
        g.RS().aa(new a.3(this, paramString, paramBoolean));
        AppMethodBeat.o(73568);
      }
    }
  }

  // ERROR //
  final java.util.List<c> bri()
  {
    // Byte code:
    //   0: ldc_w 481
    //   3: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   10: ifnonnull +21 -> 31
    //   13: ldc 191
    //   15: ldc_w 483
    //   18: invokestatic 486	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aconst_null
    //   22: astore_1
    //   23: ldc_w 481
    //   26: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_1
    //   30: areturn
    //   31: aload_0
    //   32: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   35: getfield 421	com/tencent/mm/g/b/a/ac:cYn	J
    //   38: ldc2_w 422
    //   41: lcmp
    //   42: iflt +39 -> 81
    //   45: ldc 191
    //   47: ldc_w 488
    //   50: iconst_1
    //   51: anewarray 4	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload_0
    //   57: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   60: getfield 421	com/tencent/mm/g/b/a/ac:cYn	J
    //   63: invokestatic 477	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   66: aastore
    //   67: invokestatic 359	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: aconst_null
    //   71: astore_1
    //   72: ldc_w 481
    //   75: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: goto -49 -> 29
    //   81: ldc_w 402
    //   84: invokestatic 406	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   87: checkcast 402	com/tencent/mm/plugin/expt/a/a
    //   90: astore_2
    //   91: getstatic 412	com/tencent/mm/plugin/expt/a/a$a:lFG	Lcom/tencent/mm/plugin/expt/a/a$a;
    //   94: astore_1
    //   95: aload_0
    //   96: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   99: ifnull +41 -> 140
    //   102: aload_0
    //   103: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   106: getfield 415	com/tencent/mm/g/b/a/ac:cYq	Z
    //   109: istore_3
    //   110: aload_2
    //   111: aload_1
    //   112: iload_3
    //   113: invokeinterface 418 3 0
    //   118: ifne +27 -> 145
    //   121: ldc 191
    //   123: ldc_w 490
    //   126: invokestatic 492	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: aconst_null
    //   130: astore_1
    //   131: ldc_w 481
    //   134: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   137: goto -108 -> 29
    //   140: iconst_0
    //   141: istore_3
    //   142: goto -32 -> 110
    //   145: aload_0
    //   146: getfield 315	com/tencent/mm/plugin/expt/roomexpt/a:lOv	[Ljava/lang/String;
    //   149: ifnull +30 -> 179
    //   152: aload_0
    //   153: getfield 315	com/tencent/mm/plugin/expt/roomexpt/a:lOv	[Ljava/lang/String;
    //   156: arraylength
    //   157: ifle +22 -> 179
    //   160: ldc 191
    //   162: ldc_w 494
    //   165: invokestatic 492	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: aconst_null
    //   169: astore_1
    //   170: ldc_w 481
    //   173: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: goto -147 -> 29
    //   179: aload_0
    //   180: getfield 83	com/tencent/mm/plugin/expt/roomexpt/a:lOw	Z
    //   183: ifeq +22 -> 205
    //   186: ldc 191
    //   188: ldc_w 496
    //   191: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: aconst_null
    //   195: astore_1
    //   196: ldc_w 481
    //   199: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -173 -> 29
    //   205: invokestatic 499	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   208: lstore 4
    //   210: aload_0
    //   211: iconst_1
    //   212: putfield 83	com/tencent/mm/plugin/expt/roomexpt/a:lOw	Z
    //   215: getstatic 278	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   218: ldc2_w 281
    //   221: ldc2_w 500
    //   224: lconst_1
    //   225: invokevirtual 286	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   228: aload_0
    //   229: getfield 394	com/tencent/mm/plugin/expt/roomexpt/a:lOt	Lcom/tencent/mm/plugin/expt/roomexpt/b;
    //   232: invokevirtual 507	com/tencent/mm/plugin/expt/roomexpt/b:brm	()Landroid/database/Cursor;
    //   235: astore_2
    //   236: fconst_0
    //   237: fstore 6
    //   239: fconst_0
    //   240: fstore 7
    //   242: new 509	java/util/ArrayList
    //   245: astore 8
    //   247: aload 8
    //   249: invokespecial 510	java/util/ArrayList:<init>	()V
    //   252: aload_2
    //   253: ifnull +630 -> 883
    //   256: fload 7
    //   258: fstore 6
    //   260: aload_2
    //   261: invokeinterface 515 1 0
    //   266: ifeq +617 -> 883
    //   269: aload_2
    //   270: invokeinterface 519 1 0
    //   275: iconst_5
    //   276: if_icmpge +206 -> 482
    //   279: ldc 191
    //   281: ldc_w 521
    //   284: invokestatic 486	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   287: aload 8
    //   289: invokestatic 527	java/util/Collections:sort	(Ljava/util/List;)V
    //   292: fconst_0
    //   293: fstore 6
    //   295: aload 8
    //   297: invokeinterface 532 1 0
    //   302: ifle +16 -> 318
    //   305: fload 7
    //   307: aload 8
    //   309: invokeinterface 532 1 0
    //   314: i2f
    //   315: fdiv
    //   316: fstore 6
    //   318: fload 6
    //   320: fconst_0
    //   321: invokestatic 536	java/lang/Math:max	(FF)F
    //   324: fstore 7
    //   326: new 538	com/tencent/mm/g/b/a/g
    //   329: astore 9
    //   331: aload 9
    //   333: invokespecial 539	com/tencent/mm/g/b/a/g:<init>	()V
    //   336: aconst_null
    //   337: astore_1
    //   338: aload 8
    //   340: invokeinterface 532 1 0
    //   345: iconst_5
    //   346: invokestatic 103	java/lang/Math:min	(II)I
    //   349: istore 10
    //   351: iconst_0
    //   352: istore 11
    //   354: iload 11
    //   356: iload 10
    //   358: if_icmpge +289 -> 647
    //   361: aload 8
    //   363: iload 11
    //   365: invokeinterface 543 2 0
    //   370: checkcast 545	com/tencent/mm/plugin/expt/roomexpt/c
    //   373: astore 12
    //   375: aload_1
    //   376: astore 13
    //   378: aload 12
    //   380: getfield 548	com/tencent/mm/plugin/expt/roomexpt/c:lOE	F
    //   383: fload 7
    //   385: fcmpl
    //   386: ifle +87 -> 473
    //   389: aload_1
    //   390: ifnull +189 -> 579
    //   393: aload_1
    //   394: ldc_w 550
    //   397: invokevirtual 225	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   400: aload 12
    //   402: getfield 553	com/tencent/mm/plugin/expt/roomexpt/c:cuP	Ljava/lang/String;
    //   405: invokevirtual 225	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   408: pop
    //   409: aload 9
    //   411: aload 12
    //   413: getfield 553	com/tencent/mm/plugin/expt/roomexpt/c:cuP	Ljava/lang/String;
    //   416: invokevirtual 557	com/tencent/mm/g/b/a/g:es	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/g;
    //   419: astore 13
    //   421: new 173	java/lang/StringBuilder
    //   424: astore 14
    //   426: aload 14
    //   428: invokespecial 174	java/lang/StringBuilder:<init>	()V
    //   431: aload 13
    //   433: aload 14
    //   435: aload 12
    //   437: getfield 548	com/tencent/mm/plugin/expt/roomexpt/c:lOE	F
    //   440: invokevirtual 178	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   443: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   446: invokevirtual 560	com/tencent/mm/g/b/a/g:et	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/g;
    //   449: astore 13
    //   451: aload 13
    //   453: aload_0
    //   454: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   457: getfield 421	com/tencent/mm/g/b/a/ac:cYn	J
    //   460: l2i
    //   461: putfield 563	com/tencent/mm/g/b/a/g:cVd	I
    //   464: aload 13
    //   466: invokevirtual 564	com/tencent/mm/g/b/a/g:ajK	()Z
    //   469: pop
    //   470: aload_1
    //   471: astore 13
    //   473: iinc 11 1
    //   476: aload 13
    //   478: astore_1
    //   479: goto -125 -> 354
    //   482: aload_2
    //   483: iconst_0
    //   484: invokeinterface 565 2 0
    //   489: astore 9
    //   491: aload_2
    //   492: iconst_1
    //   493: invokeinterface 565 2 0
    //   498: astore 13
    //   500: aload_2
    //   501: iconst_2
    //   502: invokeinterface 569 2 0
    //   507: istore 10
    //   509: aload_2
    //   510: iconst_3
    //   511: invokeinterface 569 2 0
    //   516: istore 11
    //   518: aload_2
    //   519: iconst_4
    //   520: invokeinterface 573 2 0
    //   525: iload 11
    //   527: iload 10
    //   529: invokestatic 575	com/tencent/mm/plugin/expt/roomexpt/a:b	(FII)F
    //   532: fstore 6
    //   534: new 545	com/tencent/mm/plugin/expt/roomexpt/c
    //   537: astore_1
    //   538: aload_1
    //   539: invokespecial 576	com/tencent/mm/plugin/expt/roomexpt/c:<init>	()V
    //   542: aload_1
    //   543: aload 9
    //   545: putfield 553	com/tencent/mm/plugin/expt/roomexpt/c:cuP	Ljava/lang/String;
    //   548: aload_1
    //   549: aload 13
    //   551: putfield 579	com/tencent/mm/plugin/expt/roomexpt/c:nickname	Ljava/lang/String;
    //   554: aload_1
    //   555: fload 6
    //   557: putfield 548	com/tencent/mm/plugin/expt/roomexpt/c:lOE	F
    //   560: aload 8
    //   562: aload_1
    //   563: invokeinterface 583 2 0
    //   568: pop
    //   569: fload 7
    //   571: fload 6
    //   573: fadd
    //   574: fstore 7
    //   576: goto -320 -> 256
    //   579: new 219	java/lang/StringBuffer
    //   582: astore_1
    //   583: aload_1
    //   584: invokespecial 220	java/lang/StringBuffer:<init>	()V
    //   587: aload_1
    //   588: aload 12
    //   590: getfield 553	com/tencent/mm/plugin/expt/roomexpt/c:cuP	Ljava/lang/String;
    //   593: invokevirtual 225	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   596: pop
    //   597: goto -188 -> 409
    //   600: astore 13
    //   602: aload_2
    //   603: astore_1
    //   604: ldc 191
    //   606: aload 13
    //   608: ldc_w 585
    //   611: iconst_0
    //   612: anewarray 4	java/lang/Object
    //   615: invokestatic 589	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   618: aload_1
    //   619: ifnull +9 -> 628
    //   622: aload_1
    //   623: invokeinterface 592 1 0
    //   628: ldc 191
    //   630: ldc_w 594
    //   633: invokestatic 486	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   636: aconst_null
    //   637: astore_1
    //   638: ldc_w 481
    //   641: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   644: goto -615 -> 29
    //   647: aload_1
    //   648: ifnull +142 -> 790
    //   651: aload_0
    //   652: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   655: aload_1
    //   656: invokevirtual 265	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   659: invokevirtual 598	com/tencent/mm/g/b/a/ac:eX	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/ac;
    //   662: pop
    //   663: aload_0
    //   664: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   667: ldc2_w 599
    //   670: putfield 421	com/tencent/mm/g/b/a/ac:cYn	J
    //   673: aload_0
    //   674: aload_0
    //   675: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   678: getfield 603	com/tencent/mm/g/b/a/ac:cYp	Ljava/lang/String;
    //   681: ldc_w 550
    //   684: invokevirtual 609	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   687: putfield 315	com/tencent/mm/plugin/expt/roomexpt/a:lOv	[Ljava/lang/String;
    //   690: getstatic 278	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   693: ldc2_w 281
    //   696: ldc2_w 610
    //   699: lconst_1
    //   700: invokevirtual 286	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   703: aload_0
    //   704: invokespecial 363	com/tencent/mm/plugin/expt/roomexpt/a:brh	()V
    //   707: aload_0
    //   708: iconst_0
    //   709: putfield 83	com/tencent/mm/plugin/expt/roomexpt/a:lOw	Z
    //   712: aload_0
    //   713: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   716: invokevirtual 357	com/tencent/mm/g/b/a/ac:Fk	()Ljava/lang/String;
    //   719: astore 13
    //   721: aload_0
    //   722: getfield 315	com/tencent/mm/plugin/expt/roomexpt/a:lOv	[Ljava/lang/String;
    //   725: ifnull +126 -> 851
    //   728: aload_0
    //   729: getfield 315	com/tencent/mm/plugin/expt/roomexpt/a:lOv	[Ljava/lang/String;
    //   732: invokestatic 616	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   735: astore_1
    //   736: ldc 191
    //   738: ldc_w 618
    //   741: iconst_3
    //   742: anewarray 4	java/lang/Object
    //   745: dup
    //   746: iconst_0
    //   747: aload 13
    //   749: aastore
    //   750: dup
    //   751: iconst_1
    //   752: aload_1
    //   753: aastore
    //   754: dup
    //   755: iconst_2
    //   756: lload 4
    //   758: invokestatic 622	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   761: invokestatic 477	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   764: aastore
    //   765: invokestatic 359	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   768: aload_2
    //   769: ifnull +9 -> 778
    //   772: aload_2
    //   773: invokeinterface 592 1 0
    //   778: ldc_w 481
    //   781: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   784: aload 8
    //   786: astore_1
    //   787: goto -758 -> 29
    //   790: aload_0
    //   791: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   794: ldc2_w 469
    //   797: putfield 421	com/tencent/mm/g/b/a/ac:cYn	J
    //   800: aload_0
    //   801: getfield 106	com/tencent/mm/plugin/expt/roomexpt/a:lOu	Lcom/tencent/mm/g/b/a/ac;
    //   804: ldc_w 624
    //   807: invokevirtual 598	com/tencent/mm/g/b/a/ac:eX	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/ac;
    //   810: pop
    //   811: aload_0
    //   812: aconst_null
    //   813: putfield 315	com/tencent/mm/plugin/expt/roomexpt/a:lOv	[Ljava/lang/String;
    //   816: getstatic 278	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   819: ldc2_w 281
    //   822: ldc2_w 625
    //   825: lconst_1
    //   826: invokevirtual 286	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   829: goto -126 -> 703
    //   832: astore_1
    //   833: aload_2
    //   834: ifnull +9 -> 843
    //   837: aload_2
    //   838: invokeinterface 592 1 0
    //   843: ldc_w 481
    //   846: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   849: aload_1
    //   850: athrow
    //   851: ldc_w 628
    //   854: astore_1
    //   855: goto -119 -> 736
    //   858: astore_1
    //   859: aconst_null
    //   860: astore_2
    //   861: goto -28 -> 833
    //   864: astore_2
    //   865: aload_1
    //   866: astore 13
    //   868: aload_2
    //   869: astore_1
    //   870: aload 13
    //   872: astore_2
    //   873: goto -40 -> 833
    //   876: astore 13
    //   878: aconst_null
    //   879: astore_1
    //   880: goto -276 -> 604
    //   883: fload 6
    //   885: fstore 7
    //   887: goto -600 -> 287
    //
    // Exception table:
    //   from	to	target	type
    //   242	252	600	java/lang/Exception
    //   260	287	600	java/lang/Exception
    //   287	292	600	java/lang/Exception
    //   295	318	600	java/lang/Exception
    //   318	336	600	java/lang/Exception
    //   338	351	600	java/lang/Exception
    //   361	375	600	java/lang/Exception
    //   378	389	600	java/lang/Exception
    //   393	409	600	java/lang/Exception
    //   409	470	600	java/lang/Exception
    //   482	569	600	java/lang/Exception
    //   579	597	600	java/lang/Exception
    //   651	703	600	java/lang/Exception
    //   703	736	600	java/lang/Exception
    //   736	768	600	java/lang/Exception
    //   790	829	600	java/lang/Exception
    //   242	252	832	finally
    //   260	287	832	finally
    //   287	292	832	finally
    //   295	318	832	finally
    //   318	336	832	finally
    //   338	351	832	finally
    //   361	375	832	finally
    //   378	389	832	finally
    //   393	409	832	finally
    //   409	470	832	finally
    //   482	569	832	finally
    //   579	597	832	finally
    //   651	703	832	finally
    //   703	736	832	finally
    //   736	768	832	finally
    //   790	829	832	finally
    //   215	236	858	finally
    //   604	618	864	finally
    //   215	236	876	java/lang/Exception
  }

  protected final void brj()
  {
    AppMethodBeat.i(73574);
    b localb = this.lOt;
    try
    {
      localb.bSd.delete("RoomMuteExpt", null, null);
      brk();
      AppMethodBeat.o(73574);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ChatRoomExptStorage", localException, "deleteAll", new Object[0]);
    }
  }

  protected final void brk()
  {
    AppMethodBeat.i(73575);
    if (this.lOu != null)
    {
      this.lOu = new ac();
      this.lOu.cYq = true;
      brh();
    }
    this.lOv = null;
    AppMethodBeat.o(73575);
  }

  protected final String brl()
  {
    AppMethodBeat.i(73576);
    String str;
    if (this.lOu != null)
    {
      str = this.lOu.Fk();
      AppMethodBeat.o(73576);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(73576);
    }
  }

  public final void gS(boolean paramBoolean)
  {
    AppMethodBeat.i(73567);
    com.tencent.mm.sdk.g.d.post(new a.1(this, paramBoolean), "click_room_mute_msg");
    AppMethodBeat.o(73567);
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(73570);
    if (this.lOu == null)
    {
      paramc = (String)g.RP().Ry().get(ac.a.xVo, "");
      if (!bo.isNullOrNil(paramc))
        break label94;
      this.lOu = new ac();
      this.lOu.cYq = false;
    }
    while (true)
    {
      ab.i("MicroMsg.ChatRoomExptService", "load expt roomnameList[%s] info[%s]", new Object[] { this.lOv, this.lOu.Fk() });
      AppMethodBeat.o(73570);
      return;
      label94: this.lOu = new ac(paramc);
      if (!bo.isNullOrNil(this.lOu.cYp))
        this.lOv = this.lOu.cYp.split(";");
    }
  }

  public final void onAccountRelease()
  {
    this.lOu = null;
    this.lOt = null;
  }

  public final void v(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(73566);
    paramIntent.setClass(paramContext, RoomExptDebugUI.class);
    paramContext.startActivity(paramIntent);
    AppMethodBeat.o(73566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.a
 * JD-Core Version:    0.6.2
 */