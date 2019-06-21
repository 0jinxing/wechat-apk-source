package com.tencent.mm.compatible.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public final class p
{
  private RandomAccessFile esR;
  private RandomAccessFile esS;
  private a esT;
  private ArrayList<a> esU;
  private long pid = 0L;

  public p()
  {
  }

  public p(long paramLong)
  {
    this.pid = paramLong;
  }

  // ERROR //
  private void LG()
  {
    // Byte code:
    //   0: ldc 29
    //   2: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 37	com/tencent/mm/compatible/e/p:esS	Ljava/io/RandomAccessFile;
    //   9: ifnull +157 -> 166
    //   12: aload_0
    //   13: getfield 37	com/tencent/mm/compatible/e/p:esS	Ljava/io/RandomAccessFile;
    //   16: lconst_0
    //   17: invokevirtual 42	java/io/RandomAccessFile:seek	(J)V
    //   20: aload_0
    //   21: getfield 37	com/tencent/mm/compatible/e/p:esS	Ljava/io/RandomAccessFile;
    //   24: invokevirtual 46	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   27: astore_1
    //   28: aload_0
    //   29: getfield 48	com/tencent/mm/compatible/e/p:esR	Ljava/io/RandomAccessFile;
    //   32: ifnull +571 -> 603
    //   35: aload_0
    //   36: getfield 48	com/tencent/mm/compatible/e/p:esR	Ljava/io/RandomAccessFile;
    //   39: lconst_0
    //   40: invokevirtual 42	java/io/RandomAccessFile:seek	(J)V
    //   43: iconst_m1
    //   44: istore_2
    //   45: aload_0
    //   46: getfield 48	com/tencent/mm/compatible/e/p:esR	Ljava/io/RandomAccessFile;
    //   49: invokevirtual 46	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   52: astore_3
    //   53: aload_3
    //   54: ifnull +670 -> 724
    //   57: aload_3
    //   58: invokevirtual 54	java/lang/String:length	()I
    //   61: ifle +663 -> 724
    //   64: aload_3
    //   65: ldc 56
    //   67: invokevirtual 60	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   70: astore 4
    //   72: aload 4
    //   74: iconst_0
    //   75: aaload
    //   76: ldc 62
    //   78: invokevirtual 66	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   81: iconst_m1
    //   82: if_icmpeq +59 -> 141
    //   85: iload_2
    //   86: iconst_m1
    //   87: if_icmpne +553 -> 640
    //   90: aload_0
    //   91: getfield 68	com/tencent/mm/compatible/e/p:esT	Lcom/tencent/mm/compatible/e/p$a;
    //   94: ifnonnull +24 -> 118
    //   97: new 6	com/tencent/mm/compatible/e/p$a
    //   100: astore 5
    //   102: aload 5
    //   104: aload_0
    //   105: aload_0
    //   106: getfield 23	com/tencent/mm/compatible/e/p:pid	J
    //   109: invokespecial 71	com/tencent/mm/compatible/e/p$a:<init>	(Lcom/tencent/mm/compatible/e/p;J)V
    //   112: aload_0
    //   113: aload 5
    //   115: putfield 68	com/tencent/mm/compatible/e/p:esT	Lcom/tencent/mm/compatible/e/p$a;
    //   118: aload_0
    //   119: getfield 68	com/tencent/mm/compatible/e/p:esT	Lcom/tencent/mm/compatible/e/p$a;
    //   122: astore 5
    //   124: aload 5
    //   126: getfield 74	com/tencent/mm/compatible/e/p$a:esX	J
    //   129: lconst_0
    //   130: lcmp
    //   131: ifgt +40 -> 171
    //   134: aload 5
    //   136: aload 4
    //   138: invokevirtual 77	com/tencent/mm/compatible/e/p$a:i	([Ljava/lang/String;)V
    //   141: aload_3
    //   142: ifnonnull +603 -> 745
    //   145: ldc 29
    //   147: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: return
    //   151: astore_1
    //   152: ldc 82
    //   154: ldc 84
    //   156: aload_1
    //   157: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   160: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   163: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: aconst_null
    //   167: astore_1
    //   168: goto -140 -> 28
    //   171: aload_1
    //   172: ifnull +439 -> 611
    //   175: aload_1
    //   176: invokevirtual 54	java/lang/String:length	()I
    //   179: ifle +432 -> 611
    //   182: aload_1
    //   183: ldc 56
    //   185: invokevirtual 60	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   188: astore 6
    //   190: aload 6
    //   192: ifnull +419 -> 611
    //   195: aload 6
    //   197: arraylength
    //   198: ifle +413 -> 611
    //   201: aload 6
    //   203: iconst_0
    //   204: aaload
    //   205: ifnull +406 -> 611
    //   208: aload 6
    //   210: iconst_0
    //   211: aaload
    //   212: bipush 10
    //   214: invokestatic 104	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   217: aload 5
    //   219: getfield 74	com/tencent/mm/compatible/e/p$a:esX	J
    //   222: lcmp
    //   223: ifne +388 -> 611
    //   226: aload 6
    //   228: bipush 13
    //   230: aaload
    //   231: bipush 10
    //   233: invokestatic 104	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   236: lstore 7
    //   238: aload 6
    //   240: bipush 14
    //   242: aaload
    //   243: bipush 10
    //   245: invokestatic 104	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   248: lstore 9
    //   250: aload 6
    //   252: bipush 15
    //   254: aaload
    //   255: bipush 10
    //   257: invokestatic 104	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   260: lstore 11
    //   262: aload 6
    //   264: bipush 16
    //   266: aaload
    //   267: bipush 10
    //   269: invokestatic 104	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   272: lstore 13
    //   274: lload 7
    //   276: lload 9
    //   278: ladd
    //   279: lload 11
    //   281: ladd
    //   282: lload 13
    //   284: ladd
    //   285: lstore 15
    //   287: aload 4
    //   289: iconst_4
    //   290: aaload
    //   291: bipush 10
    //   293: invokestatic 104	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   296: lstore 17
    //   298: lconst_0
    //   299: lstore 19
    //   301: iconst_1
    //   302: istore 21
    //   304: aload 4
    //   306: arraylength
    //   307: istore 22
    //   309: iconst_0
    //   310: istore 23
    //   312: iload 23
    //   314: iload 22
    //   316: if_icmpge +39 -> 355
    //   319: aload 4
    //   321: iload 23
    //   323: aaload
    //   324: astore 6
    //   326: iload 21
    //   328: ifeq +12 -> 340
    //   331: iconst_0
    //   332: istore 21
    //   334: iinc 23 1
    //   337: goto -25 -> 312
    //   340: lload 19
    //   342: aload 6
    //   344: bipush 10
    //   346: invokestatic 104	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   349: ladd
    //   350: lstore 19
    //   352: goto -18 -> 334
    //   355: lload 17
    //   357: aload 5
    //   359: getfield 107	com/tencent/mm/compatible/e/p$a:mLastIdle	J
    //   362: lsub
    //   363: lstore 24
    //   365: lload 19
    //   367: aload 5
    //   369: getfield 110	com/tencent/mm/compatible/e/p$a:esW	J
    //   372: lsub
    //   373: lstore 26
    //   375: lload 15
    //   377: aload 5
    //   379: getfield 113	com/tencent/mm/compatible/e/p$a:esY	J
    //   382: lsub
    //   383: lstore 28
    //   385: aload 5
    //   387: lload 26
    //   389: lload 24
    //   391: lsub
    //   392: l2f
    //   393: lload 26
    //   395: l2f
    //   396: fdiv
    //   397: ldc 114
    //   399: fmul
    //   400: f2i
    //   401: putfield 118	com/tencent/mm/compatible/e/p$a:esV	I
    //   404: aload 5
    //   406: lload 28
    //   408: l2f
    //   409: lload 26
    //   411: l2f
    //   412: fdiv
    //   413: ldc 114
    //   415: fmul
    //   416: f2i
    //   417: putfield 121	com/tencent/mm/compatible/e/p$a:esZ	I
    //   420: aload 5
    //   422: lload 19
    //   424: putfield 110	com/tencent/mm/compatible/e/p$a:esW	J
    //   427: aload 5
    //   429: lload 17
    //   431: putfield 107	com/tencent/mm/compatible/e/p$a:mLastIdle	J
    //   434: aload 5
    //   436: lload 15
    //   438: putfield 113	com/tencent/mm/compatible/e/p$a:esY	J
    //   441: ldc 82
    //   443: ldc 123
    //   445: bipush 14
    //   447: anewarray 4	java/lang/Object
    //   450: dup
    //   451: iconst_0
    //   452: aload 5
    //   454: invokevirtual 126	java/lang/Object:hashCode	()I
    //   457: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   460: aastore
    //   461: dup
    //   462: iconst_1
    //   463: lload 19
    //   465: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   468: aastore
    //   469: dup
    //   470: iconst_2
    //   471: lload 17
    //   473: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   476: aastore
    //   477: dup
    //   478: iconst_3
    //   479: aload 5
    //   481: getfield 118	com/tencent/mm/compatible/e/p$a:esV	I
    //   484: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   487: aastore
    //   488: dup
    //   489: iconst_4
    //   490: aload 5
    //   492: getfield 74	com/tencent/mm/compatible/e/p$a:esX	J
    //   495: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   498: aastore
    //   499: dup
    //   500: iconst_5
    //   501: lload 15
    //   503: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   506: aastore
    //   507: dup
    //   508: bipush 6
    //   510: aload 5
    //   512: getfield 121	com/tencent/mm/compatible/e/p$a:esZ	I
    //   515: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   518: aastore
    //   519: dup
    //   520: bipush 7
    //   522: lload 7
    //   524: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   527: aastore
    //   528: dup
    //   529: bipush 8
    //   531: lload 9
    //   533: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   536: aastore
    //   537: dup
    //   538: bipush 9
    //   540: lload 11
    //   542: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   545: aastore
    //   546: dup
    //   547: bipush 10
    //   549: lload 13
    //   551: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   554: aastore
    //   555: dup
    //   556: bipush 11
    //   558: lload 26
    //   560: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   563: aastore
    //   564: dup
    //   565: bipush 12
    //   567: lload 24
    //   569: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   572: aastore
    //   573: dup
    //   574: bipush 13
    //   576: lload 28
    //   578: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   581: aastore
    //   582: invokestatic 137	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   585: goto -444 -> 141
    //   588: astore_1
    //   589: ldc 82
    //   591: ldc 139
    //   593: aload_1
    //   594: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   597: invokevirtual 92	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   600: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   603: ldc 29
    //   605: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   608: goto -458 -> 150
    //   611: ldc 82
    //   613: ldc 141
    //   615: iconst_2
    //   616: anewarray 4	java/lang/Object
    //   619: dup
    //   620: iconst_0
    //   621: aload 5
    //   623: getfield 74	com/tencent/mm/compatible/e/p$a:esX	J
    //   626: invokestatic 134	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   629: aastore
    //   630: dup
    //   631: iconst_1
    //   632: aload_1
    //   633: aastore
    //   634: invokestatic 143	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   637: goto -496 -> 141
    //   640: aload_0
    //   641: getfield 145	com/tencent/mm/compatible/e/p:esU	Ljava/util/ArrayList;
    //   644: ifnonnull +19 -> 663
    //   647: new 147	java/util/ArrayList
    //   650: astore 5
    //   652: aload 5
    //   654: invokespecial 148	java/util/ArrayList:<init>	()V
    //   657: aload_0
    //   658: aload 5
    //   660: putfield 145	com/tencent/mm/compatible/e/p:esU	Ljava/util/ArrayList;
    //   663: iload_2
    //   664: aload_0
    //   665: getfield 145	com/tencent/mm/compatible/e/p:esU	Ljava/util/ArrayList;
    //   668: invokevirtual 151	java/util/ArrayList:size	()I
    //   671: if_icmpge +22 -> 693
    //   674: aload_0
    //   675: getfield 145	com/tencent/mm/compatible/e/p:esU	Ljava/util/ArrayList;
    //   678: iload_2
    //   679: invokevirtual 155	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   682: checkcast 6	com/tencent/mm/compatible/e/p$a
    //   685: aload 4
    //   687: invokevirtual 77	com/tencent/mm/compatible/e/p$a:i	([Ljava/lang/String;)V
    //   690: goto -549 -> 141
    //   693: new 6	com/tencent/mm/compatible/e/p$a
    //   696: astore 5
    //   698: aload 5
    //   700: aload_0
    //   701: invokespecial 158	com/tencent/mm/compatible/e/p$a:<init>	(Lcom/tencent/mm/compatible/e/p;)V
    //   704: aload 5
    //   706: aload 4
    //   708: invokevirtual 77	com/tencent/mm/compatible/e/p$a:i	([Ljava/lang/String;)V
    //   711: aload_0
    //   712: getfield 145	com/tencent/mm/compatible/e/p:esU	Ljava/util/ArrayList;
    //   715: aload 5
    //   717: invokevirtual 162	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   720: pop
    //   721: goto -580 -> 141
    //   724: ldc 82
    //   726: ldc 164
    //   728: iconst_1
    //   729: anewarray 4	java/lang/Object
    //   732: dup
    //   733: iconst_0
    //   734: iload_2
    //   735: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   738: aastore
    //   739: invokestatic 143	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   742: goto -601 -> 141
    //   745: iinc 2 1
    //   748: goto -703 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   12	28	151	java/io/IOException
    //   35	43	588	java/io/IOException
    //   45	53	588	java/io/IOException
    //   57	85	588	java/io/IOException
    //   90	118	588	java/io/IOException
    //   118	141	588	java/io/IOException
    //   175	190	588	java/io/IOException
    //   195	201	588	java/io/IOException
    //   208	274	588	java/io/IOException
    //   287	298	588	java/io/IOException
    //   304	309	588	java/io/IOException
    //   340	352	588	java/io/IOException
    //   355	585	588	java/io/IOException
    //   611	637	588	java/io/IOException
    //   640	663	588	java/io/IOException
    //   663	690	588	java/io/IOException
    //   693	721	588	java/io/IOException
    //   724	742	588	java/io/IOException
  }

  private void update()
  {
    AppMethodBeat.i(92958);
    while (true)
    {
      try
      {
        Object localObject = new java/io/RandomAccessFile;
        ((RandomAccessFile)localObject).<init>("/proc/stat", "r");
        this.esR = ((RandomAccessFile)localObject);
        if (this.pid > 0L)
        {
          RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("/proc/");
          localRandomAccessFile.<init>(this.pid + "/stat", "r");
          this.esS = localRandomAccessFile;
        }
        LG();
        if (this.esR != null)
          this.esR.close();
        if (this.esS != null)
          this.esS.close();
        AppMethodBeat.o(92958);
        return;
      }
      catch (Exception localException1)
      {
        ab.printErrStackTrace(" MicroMsg.CpuUsage", localException1, "update e:", new Object[0]);
        if (this.esR == null);
      }
      try
      {
        this.esR.close();
        label137: this.esR = null;
        if (this.esS != null);
        try
        {
          this.esS.close();
          label156: this.esS = null;
          AppMethodBeat.o(92958);
        }
        catch (Exception localException2)
        {
          break label156;
        }
      }
      catch (Exception localException3)
      {
        break label137;
      }
    }
  }

  public final int LH()
  {
    AppMethodBeat.i(92960);
    int i;
    if (bo.ek(this.esU))
    {
      i = 1;
      AppMethodBeat.o(92960);
    }
    while (true)
    {
      return i;
      i = this.esU.size();
      AppMethodBeat.o(92960);
    }
  }

  public final int LI()
  {
    AppMethodBeat.i(92961);
    update();
    int i = 0;
    if (this.esT != null)
      i = this.esT.esV;
    AppMethodBeat.o(92961);
    return i;
  }

  public final int LJ()
  {
    AppMethodBeat.i(92962);
    int i = 0;
    if (this.esT != null)
      i = this.esT.esZ;
    int j = i;
    if (this.esU != null)
    {
      j = i;
      if (this.esU.size() > 1)
        j = i * this.esU.size();
    }
    AppMethodBeat.o(92962);
    return j;
  }

  public final String toString()
  {
    AppMethodBeat.i(92963);
    update();
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.esT != null)
    {
      localStringBuffer.append("Cpu Total : ");
      localStringBuffer.append(this.esT.esV);
      localStringBuffer.append("%");
      if (this.pid > 0L)
      {
        localStringBuffer.append("pid(");
        localStringBuffer.append(this.pid + ") :");
        localStringBuffer.append(this.esT.esZ);
        localStringBuffer.append("%");
      }
    }
    if (this.esU != null)
      for (int i = 0; i < this.esU.size(); i++)
      {
        localObject = (a)this.esU.get(i);
        localStringBuffer.append(" Cpu Core(" + i + ") : ");
        localStringBuffer.append(((a)localObject).esV);
        localStringBuffer.append("%");
      }
    Object localObject = localStringBuffer.toString();
    AppMethodBeat.o(92963);
    return localObject;
  }

  public final class a
  {
    int esV;
    long esW;
    long esX;
    long esY;
    int esZ;
    long mLastIdle;

    public a()
    {
      this.esV = 0;
      this.esW = 0L;
      this.mLastIdle = 0L;
      this.esX = 0L;
      this.esY = 0L;
      this.esZ = 0;
    }

    public a(long arg2)
    {
      Object localObject;
      this.esX = localObject;
    }

    public final void i(String[] paramArrayOfString)
    {
      AppMethodBeat.i(92957);
      long l1 = Long.parseLong(paramArrayOfString[4], 10);
      long l2 = 0L;
      int i = 1;
      int j = paramArrayOfString.length;
      int k = 0;
      if (k < j)
      {
        String str = paramArrayOfString[k];
        if (i != 0)
          i = 0;
        while (true)
        {
          k++;
          break;
          l2 += Long.parseLong(str, 10);
        }
      }
      long l3 = this.mLastIdle;
      long l4 = l2 - this.esW;
      this.esV = ((int)((float)(l4 - (l1 - l3)) / (float)l4 * 100.0F));
      this.esW = l2;
      this.mLastIdle = l1;
      ab.i(" MicroMsg.CpuUsage", "CpuUsageInfo(" + hashCode() + ") CPU total=" + l2 + "; idle=" + l1 + "; usage=" + this.esV);
      AppMethodBeat.o(92957);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.p
 * JD-Core Version:    0.6.2
 */