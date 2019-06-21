package com.tencent.mm.plugin.expt.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

public final class b extends j<a>
{
  public static final String[] diI;
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(73614);
    fnj = new String[] { j.a(a.ccO, "ExptKeyMapId") };
    diI = new String[0];
    AppMethodBeat.o(73614);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "ExptKeyMapId", diI);
    this.bSd = parame;
  }

  // ERROR //
  public final int KX(String paramString)
  {
    // Byte code:
    //   0: ldc 53
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/plugin/expt/e/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 29
    //   11: iconst_1
    //   12: anewarray 21	java/lang/String
    //   15: dup
    //   16: iconst_0
    //   17: ldc 55
    //   19: aastore
    //   20: ldc 57
    //   22: iconst_1
    //   23: anewarray 21	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: aload_1
    //   29: aastore
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: invokeinterface 63 8 0
    //   38: astore_2
    //   39: aload_2
    //   40: ifnull +125 -> 165
    //   43: aload_2
    //   44: astore_3
    //   45: aload_2
    //   46: invokeinterface 69 1 0
    //   51: ifeq +114 -> 165
    //   54: aload_2
    //   55: astore_3
    //   56: aload_2
    //   57: iconst_0
    //   58: invokeinterface 73 2 0
    //   63: istore 4
    //   65: iload 4
    //   67: istore 5
    //   69: aload_2
    //   70: ifnull +13 -> 83
    //   73: aload_2
    //   74: invokeinterface 76 1 0
    //   79: iload 4
    //   81: istore 5
    //   83: ldc 53
    //   85: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: iload 5
    //   90: ireturn
    //   91: astore 6
    //   93: aconst_null
    //   94: astore_2
    //   95: aload_2
    //   96: astore_3
    //   97: ldc 78
    //   99: ldc 80
    //   101: iconst_2
    //   102: anewarray 82	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload_1
    //   108: aastore
    //   109: dup
    //   110: iconst_1
    //   111: aload 6
    //   113: invokevirtual 86	java/lang/Exception:toString	()Ljava/lang/String;
    //   116: aastore
    //   117: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aload_2
    //   121: ifnull +9 -> 130
    //   124: aload_2
    //   125: invokeinterface 76 1 0
    //   130: iconst_m1
    //   131: istore 5
    //   133: goto -50 -> 83
    //   136: astore_1
    //   137: aconst_null
    //   138: astore_3
    //   139: aload_3
    //   140: ifnull +9 -> 149
    //   143: aload_3
    //   144: invokeinterface 76 1 0
    //   149: ldc 53
    //   151: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_1
    //   155: athrow
    //   156: astore_1
    //   157: goto -18 -> 139
    //   160: astore 6
    //   162: goto -67 -> 95
    //   165: iconst_m1
    //   166: istore 4
    //   168: goto -103 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   5	39	91	java/lang/Exception
    //   5	39	136	finally
    //   45	54	156	finally
    //   56	65	156	finally
    //   97	120	156	finally
    //   45	54	160	java/lang/Exception
    //   56	65	160	java/lang/Exception
  }

  // ERROR //
  public final a Lc(String paramString)
  {
    // Byte code:
    //   0: ldc 95
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/plugin/expt/e/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 29
    //   11: aconst_null
    //   12: ldc 57
    //   14: iconst_1
    //   15: anewarray 21	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload_1
    //   21: aastore
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokeinterface 63 8 0
    //   30: astore_2
    //   31: aload_2
    //   32: ifnull +148 -> 180
    //   35: aload_2
    //   36: astore_3
    //   37: aload_2
    //   38: invokeinterface 69 1 0
    //   43: ifeq +137 -> 180
    //   46: aload_2
    //   47: astore_3
    //   48: new 23	com/tencent/mm/plugin/expt/e/a
    //   51: astore 4
    //   53: aload_2
    //   54: astore_3
    //   55: aload 4
    //   57: invokespecial 97	com/tencent/mm/plugin/expt/e/a:<init>	()V
    //   60: aload_2
    //   61: astore_3
    //   62: aload 4
    //   64: aload_2
    //   65: invokevirtual 101	com/tencent/mm/plugin/expt/e/a:d	(Landroid/database/Cursor;)V
    //   68: aload 4
    //   70: astore_1
    //   71: aload_1
    //   72: astore_3
    //   73: aload_2
    //   74: ifnull +11 -> 85
    //   77: aload_2
    //   78: invokeinterface 76 1 0
    //   83: aload_1
    //   84: astore_3
    //   85: ldc 95
    //   87: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: aload_3
    //   91: areturn
    //   92: astore 5
    //   94: aconst_null
    //   95: astore_2
    //   96: aconst_null
    //   97: astore 4
    //   99: aload_2
    //   100: astore_3
    //   101: ldc 78
    //   103: ldc 80
    //   105: iconst_2
    //   106: anewarray 82	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload_1
    //   112: aastore
    //   113: dup
    //   114: iconst_1
    //   115: aload 5
    //   117: invokevirtual 86	java/lang/Exception:toString	()Ljava/lang/String;
    //   120: aastore
    //   121: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload 4
    //   126: astore_3
    //   127: aload_2
    //   128: ifnull -43 -> 85
    //   131: aload_2
    //   132: invokeinterface 76 1 0
    //   137: aload 4
    //   139: astore_3
    //   140: goto -55 -> 85
    //   143: astore_1
    //   144: aconst_null
    //   145: astore_3
    //   146: aload_3
    //   147: ifnull +9 -> 156
    //   150: aload_3
    //   151: invokeinterface 76 1 0
    //   156: ldc 95
    //   158: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_1
    //   162: athrow
    //   163: astore_1
    //   164: goto -18 -> 146
    //   167: astore 5
    //   169: aconst_null
    //   170: astore 4
    //   172: goto -73 -> 99
    //   175: astore 5
    //   177: goto -78 -> 99
    //   180: aconst_null
    //   181: astore_1
    //   182: goto -111 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   5	31	92	java/lang/Exception
    //   5	31	143	finally
    //   37	46	163	finally
    //   48	53	163	finally
    //   55	60	163	finally
    //   62	68	163	finally
    //   101	124	163	finally
    //   37	46	167	java/lang/Exception
    //   48	53	167	java/lang/Exception
    //   55	60	167	java/lang/Exception
    //   62	68	175	java/lang/Exception
  }

  // ERROR //
  public final int bC(List<a> paramList)
  {
    // Byte code:
    //   0: ldc2_w 104
    //   3: lstore_2
    //   4: ldc 106
    //   6: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: invokeinterface 112 1 0
    //   15: ifgt +14 -> 29
    //   18: ldc 106
    //   20: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: iconst_0
    //   24: istore 4
    //   26: iload 4
    //   28: ireturn
    //   29: aload_0
    //   30: getfield 48	com/tencent/mm/plugin/expt/e/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   33: instanceof 114
    //   36: ifeq +204 -> 240
    //   39: aload_0
    //   40: getfield 48	com/tencent/mm/plugin/expt/e/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   43: checkcast 114	com/tencent/mm/cd/h
    //   46: astore 5
    //   48: aload 5
    //   50: ldc2_w 104
    //   53: invokevirtual 118	com/tencent/mm/cd/h:iV	(J)J
    //   56: lstore_2
    //   57: aload_1
    //   58: invokeinterface 122 1 0
    //   63: astore 6
    //   65: iconst_0
    //   66: istore 7
    //   68: aload 6
    //   70: invokeinterface 127 1 0
    //   75: ifeq +34 -> 109
    //   78: aload_0
    //   79: aload 6
    //   81: invokeinterface 131 1 0
    //   86: checkcast 23	com/tencent/mm/plugin/expt/e/a
    //   89: iconst_0
    //   90: invokevirtual 134	com/tencent/mm/plugin/expt/e/b:a	(Lcom/tencent/mm/sdk/e/c;Z)Z
    //   93: istore 8
    //   95: iload 8
    //   97: ifeq +9 -> 106
    //   100: iinc 7 1
    //   103: goto -35 -> 68
    //   106: goto -3 -> 103
    //   109: iload 7
    //   111: istore 4
    //   113: aload 5
    //   115: ifnull +14 -> 129
    //   118: aload 5
    //   120: lload_2
    //   121: invokevirtual 138	com/tencent/mm/cd/h:mB	(J)I
    //   124: pop
    //   125: iload 7
    //   127: istore 4
    //   129: ldc 78
    //   131: ldc 140
    //   133: iconst_2
    //   134: anewarray 82	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload_1
    //   140: invokeinterface 112 1 0
    //   145: invokestatic 146	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   148: aastore
    //   149: dup
    //   150: iconst_1
    //   151: iload 4
    //   153: invokestatic 146	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   156: aastore
    //   157: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: ldc 106
    //   162: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: goto -139 -> 26
    //   168: astore 6
    //   170: iconst_0
    //   171: istore 7
    //   173: ldc 78
    //   175: ldc 150
    //   177: iconst_1
    //   178: anewarray 82	java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: aload 6
    //   185: invokevirtual 86	java/lang/Exception:toString	()Ljava/lang/String;
    //   188: aastore
    //   189: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: iload 7
    //   194: istore 4
    //   196: aload 5
    //   198: ifnull -69 -> 129
    //   201: aload 5
    //   203: lload_2
    //   204: invokevirtual 138	com/tencent/mm/cd/h:mB	(J)I
    //   207: pop
    //   208: iload 7
    //   210: istore 4
    //   212: goto -83 -> 129
    //   215: astore_1
    //   216: aload 5
    //   218: ifnull +10 -> 228
    //   221: aload 5
    //   223: lload_2
    //   224: invokevirtual 138	com/tencent/mm/cd/h:mB	(J)I
    //   227: pop
    //   228: ldc 106
    //   230: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   233: aload_1
    //   234: athrow
    //   235: astore 6
    //   237: goto -64 -> 173
    //   240: aconst_null
    //   241: astore 5
    //   243: goto -186 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   57	65	168	java/lang/Exception
    //   57	65	215	finally
    //   68	95	215	finally
    //   173	192	215	finally
    //   68	95	235	java/lang/Exception
  }

  // ERROR //
  public final int bD(List<a> paramList)
  {
    // Byte code:
    //   0: ldc2_w 104
    //   3: lstore_2
    //   4: ldc 154
    //   6: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: invokeinterface 112 1 0
    //   15: ifgt +14 -> 29
    //   18: ldc 154
    //   20: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: iconst_0
    //   24: istore 4
    //   26: iload 4
    //   28: ireturn
    //   29: aload_0
    //   30: getfield 48	com/tencent/mm/plugin/expt/e/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   33: instanceof 114
    //   36: ifeq +213 -> 249
    //   39: aload_0
    //   40: getfield 48	com/tencent/mm/plugin/expt/e/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   43: checkcast 114	com/tencent/mm/cd/h
    //   46: astore 5
    //   48: aload 5
    //   50: ldc2_w 104
    //   53: invokevirtual 118	com/tencent/mm/cd/h:iV	(J)J
    //   56: lstore_2
    //   57: aload_1
    //   58: invokeinterface 122 1 0
    //   63: astore 6
    //   65: iconst_0
    //   66: istore 7
    //   68: aload 6
    //   70: invokeinterface 127 1 0
    //   75: ifeq +43 -> 118
    //   78: aload 6
    //   80: invokeinterface 131 1 0
    //   85: checkcast 23	com/tencent/mm/plugin/expt/e/a
    //   88: astore 8
    //   90: aload_0
    //   91: aload 8
    //   93: getfield 158	com/tencent/mm/plugin/expt/e/a:xDa	J
    //   96: aload 8
    //   98: iconst_0
    //   99: invokevirtual 161	com/tencent/mm/plugin/expt/e/b:a	(JLcom/tencent/mm/sdk/e/c;Z)Z
    //   102: istore 9
    //   104: iload 9
    //   106: ifeq +9 -> 115
    //   109: iinc 7 1
    //   112: goto -44 -> 68
    //   115: goto -3 -> 112
    //   118: iload 7
    //   120: istore 4
    //   122: aload 5
    //   124: ifnull +14 -> 138
    //   127: aload 5
    //   129: lload_2
    //   130: invokevirtual 138	com/tencent/mm/cd/h:mB	(J)I
    //   133: pop
    //   134: iload 7
    //   136: istore 4
    //   138: ldc 78
    //   140: ldc 163
    //   142: iconst_2
    //   143: anewarray 82	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload_1
    //   149: invokeinterface 112 1 0
    //   154: invokestatic 146	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   157: aastore
    //   158: dup
    //   159: iconst_1
    //   160: iload 4
    //   162: invokestatic 146	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: aastore
    //   166: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: ldc 154
    //   171: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: goto -148 -> 26
    //   177: astore 8
    //   179: iconst_0
    //   180: istore 7
    //   182: ldc 78
    //   184: ldc 165
    //   186: iconst_1
    //   187: anewarray 82	java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: aload 8
    //   194: invokevirtual 86	java/lang/Exception:toString	()Ljava/lang/String;
    //   197: aastore
    //   198: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: iload 7
    //   203: istore 4
    //   205: aload 5
    //   207: ifnull -69 -> 138
    //   210: aload 5
    //   212: lload_2
    //   213: invokevirtual 138	com/tencent/mm/cd/h:mB	(J)I
    //   216: pop
    //   217: iload 7
    //   219: istore 4
    //   221: goto -83 -> 138
    //   224: astore_1
    //   225: aload 5
    //   227: ifnull +10 -> 237
    //   230: aload 5
    //   232: lload_2
    //   233: invokevirtual 138	com/tencent/mm/cd/h:mB	(J)I
    //   236: pop
    //   237: ldc 154
    //   239: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: aload_1
    //   243: athrow
    //   244: astore 8
    //   246: goto -64 -> 182
    //   249: aconst_null
    //   250: astore 5
    //   252: goto -195 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   57	65	177	java/lang/Exception
    //   57	65	224	finally
    //   68	104	224	finally
    //   182	201	224	finally
    //   68	104	244	java/lang/Exception
  }

  public final int bE(List<Integer> paramList)
  {
    AppMethodBeat.i(73612);
    int i;
    if ((paramList == null) || (paramList.size() <= 0))
    {
      i = 0;
      AppMethodBeat.o(73612);
      return i;
    }
    int j = 0;
    int k = 0;
    long l = -1L;
    h localh;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(-1L);
    }
    while (true)
    {
      try
      {
        Iterator localIterator = paramList.iterator();
        j = k;
        if (localIterator.hasNext())
        {
          j = k;
          i = ((Integer)localIterator.next()).intValue();
          j = k;
          i = this.bSd.delete("ExptKeyMapId", "exptId=?", new String[] { String.valueOf(i) });
          if (i > 0)
          {
            k++;
            continue;
          }
          continue;
        }
        i = k;
        if (localh != null)
        {
          localh.mB(l);
          i = k;
        }
        ab.i("MicroMsg.ExptKeyMapIdStorage", "deleteExptKeyMapIdById exptIds size[%d] ret[%d]", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(i) });
        AppMethodBeat.o(73612);
        break;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ExptKeyMapIdStorage", "delete expt by id id [%s] ret[%d]", new Object[] { localException.toString(), Integer.valueOf(j) });
        i = j;
        if (localh == null)
          continue;
        localh.mB(l);
        i = j;
        continue;
      }
      finally
      {
        if (localh != null)
          localh.mB(l);
        AppMethodBeat.o(73612);
      }
      localh = null;
    }
  }

  public final int brt()
  {
    int i = 0;
    AppMethodBeat.i(73613);
    try
    {
      int j = this.bSd.delete("ExptKeyMapId", null, null);
      i = j;
      AppMethodBeat.o(73613);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.ExptKeyMapIdStorage", "delete all expt error[%s]", new Object[] { localException.toString() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.e.b
 * JD-Core Version:    0.6.2
 */