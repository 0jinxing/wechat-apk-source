package com.tencent.mm.plugin.expt.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.expt.d.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends j<a>
{
  public static final String[] diI;
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(73631);
    fnj = new String[] { j.a(a.ccO, "ExptItem") };
    diI = new String[0];
    AppMethodBeat.o(73631);
  }

  public d(e parame)
  {
    super(parame, a.ccO, "ExptItem", diI);
    this.bSd = parame;
  }

  private boolean a(a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(73627);
    if (parama == null)
      AppMethodBeat.o(73627);
    while (true)
    {
      return bool;
      try
      {
        bool = super.a(parama);
        ab.d("MicroMsg.ExptStorage", "replace expt ret[%b] item[%s]", new Object[] { Boolean.valueOf(bool), parama.toString() });
        AppMethodBeat.o(73627);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.ExptStorage", "replace expt error [%s]", new Object[] { localException.toString() });
          bool = false;
        }
      }
    }
  }

  private boolean ve(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(73626);
    try
    {
      paramInt = this.bSd.delete("ExptItem", "exptId=?", new String[] { String.valueOf(paramInt) });
      if (paramInt > 0)
      {
        AppMethodBeat.o(73626);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ExptStorage", "delete expt by id [%s]", new Object[] { localException.toString() });
        paramInt = 0;
        continue;
        AppMethodBeat.o(73626);
        bool = false;
      }
    }
  }

  public final int bB(List<Integer> paramList)
  {
    long l = -1L;
    int i = 0;
    int j = 0;
    AppMethodBeat.i(73629);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      AppMethodBeat.o(73629);
      return j;
    }
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
        paramList = paramList.iterator();
        j = i;
        if (paramList.hasNext())
        {
          boolean bool = ve(((Integer)paramList.next()).intValue());
          if (bool)
          {
            j++;
            continue;
          }
          continue;
        }
        if (localh != null)
          localh.mB(l);
        AppMethodBeat.o(73629);
        break;
      }
      finally
      {
        if (localh != null)
          localh.mB(l);
        AppMethodBeat.o(73629);
      }
      localh = null;
    }
  }

  public final List<a> bH(List<a> paramList)
  {
    long l = -1L;
    h localh = null;
    AppMethodBeat.i(73628);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      AppMethodBeat.o(73628);
      paramList = localh;
      return paramList;
    }
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(-1L);
    }
    while (true)
    {
      LinkedList localLinkedList;
      try
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        paramList = paramList.iterator();
        if (paramList.hasNext())
        {
          a locala = (a)paramList.next();
          if (!a(locala))
            continue;
          localLinkedList.add(locala);
          continue;
        }
      }
      finally
      {
        if (localh != null)
          localh.mB(l);
        AppMethodBeat.o(73628);
      }
      if (localh != null)
        localh.mB(l);
      AppMethodBeat.o(73628);
      paramList = localLinkedList;
      break;
      localh = null;
    }
  }

  public final int brt()
  {
    int i = 0;
    AppMethodBeat.i(73630);
    try
    {
      int j = this.bSd.delete("ExptItem", null, null);
      i = j;
      AppMethodBeat.o(73630);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.ExptStorage", "delete all expt error[%s]", new Object[] { localException.toString() });
    }
  }

  // ERROR //
  public final List<a> brw()
  {
    // Byte code:
    //   0: ldc 164
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/plugin/expt/e/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 166
    //   11: aconst_null
    //   12: invokeinterface 170 3 0
    //   17: astore_1
    //   18: aload_1
    //   19: ifnull +188 -> 207
    //   22: aload_1
    //   23: astore_2
    //   24: new 148	java/util/LinkedList
    //   27: astore_3
    //   28: aload_1
    //   29: astore_2
    //   30: aload_3
    //   31: invokespecial 150	java/util/LinkedList:<init>	()V
    //   34: aload_1
    //   35: astore_2
    //   36: aload_1
    //   37: invokeinterface 175 1 0
    //   42: ifeq +83 -> 125
    //   45: aload_1
    //   46: astore_2
    //   47: new 23	com/tencent/mm/plugin/expt/d/a
    //   50: astore 4
    //   52: aload_1
    //   53: astore_2
    //   54: aload 4
    //   56: invokespecial 176	com/tencent/mm/plugin/expt/d/a:<init>	()V
    //   59: aload_1
    //   60: astore_2
    //   61: aload 4
    //   63: aload_1
    //   64: invokevirtual 179	com/tencent/mm/plugin/expt/d/a:d	(Landroid/database/Cursor;)V
    //   67: aload_1
    //   68: astore_2
    //   69: aload_3
    //   70: aload 4
    //   72: invokeinterface 156 2 0
    //   77: pop
    //   78: goto -44 -> 34
    //   81: astore 4
    //   83: aload_1
    //   84: astore_2
    //   85: ldc 57
    //   87: ldc 181
    //   89: iconst_1
    //   90: anewarray 61	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload 4
    //   97: invokevirtual 80	java/lang/Exception:toString	()Ljava/lang/String;
    //   100: aastore
    //   101: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: aload_3
    //   105: astore_2
    //   106: aload_1
    //   107: ifnull +11 -> 118
    //   110: aload_1
    //   111: invokeinterface 184 1 0
    //   116: aload_3
    //   117: astore_2
    //   118: ldc 164
    //   120: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: aload_2
    //   124: areturn
    //   125: aload_1
    //   126: astore_2
    //   127: ldc 57
    //   129: ldc 186
    //   131: iconst_1
    //   132: anewarray 61	java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: aload_3
    //   138: invokeinterface 110 1 0
    //   143: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   146: aastore
    //   147: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload_3
    //   151: astore_2
    //   152: aload_1
    //   153: ifnull -35 -> 118
    //   156: aload_1
    //   157: invokeinterface 184 1 0
    //   162: aload_3
    //   163: astore_2
    //   164: goto -46 -> 118
    //   167: astore_3
    //   168: aconst_null
    //   169: astore_2
    //   170: aload_2
    //   171: ifnull +9 -> 180
    //   174: aload_2
    //   175: invokeinterface 184 1 0
    //   180: ldc 164
    //   182: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: aload_3
    //   186: athrow
    //   187: astore_3
    //   188: goto -18 -> 170
    //   191: astore 4
    //   193: aconst_null
    //   194: astore_1
    //   195: aconst_null
    //   196: astore_3
    //   197: goto -114 -> 83
    //   200: astore 4
    //   202: aconst_null
    //   203: astore_3
    //   204: goto -121 -> 83
    //   207: aconst_null
    //   208: astore_3
    //   209: goto -59 -> 150
    //
    // Exception table:
    //   from	to	target	type
    //   36	45	81	java/lang/Exception
    //   47	52	81	java/lang/Exception
    //   54	59	81	java/lang/Exception
    //   61	67	81	java/lang/Exception
    //   69	78	81	java/lang/Exception
    //   127	150	81	java/lang/Exception
    //   5	18	167	finally
    //   24	28	187	finally
    //   30	34	187	finally
    //   36	45	187	finally
    //   47	52	187	finally
    //   54	59	187	finally
    //   61	67	187	finally
    //   69	78	187	finally
    //   85	104	187	finally
    //   127	150	187	finally
    //   5	18	191	java/lang/Exception
    //   24	28	200	java/lang/Exception
    //   30	34	200	java/lang/Exception
  }

  // ERROR //
  public final java.util.ArrayList<Integer> brx()
  {
    // Byte code:
    //   0: ldc 193
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/plugin/expt/e/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 195
    //   11: aconst_null
    //   12: invokeinterface 170 3 0
    //   17: astore_1
    //   18: aload_1
    //   19: ifnull +98 -> 117
    //   22: aload_1
    //   23: astore_2
    //   24: new 197	java/util/ArrayList
    //   27: astore_3
    //   28: aload_1
    //   29: astore_2
    //   30: aload_3
    //   31: invokespecial 198	java/util/ArrayList:<init>	()V
    //   34: aload_3
    //   35: astore 4
    //   37: aload_1
    //   38: astore_2
    //   39: aload_1
    //   40: invokeinterface 175 1 0
    //   45: ifeq +75 -> 120
    //   48: aload_1
    //   49: astore_2
    //   50: aload_3
    //   51: aload_1
    //   52: iconst_0
    //   53: invokeinterface 202 2 0
    //   58: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   61: invokevirtual 203	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   64: pop
    //   65: goto -31 -> 34
    //   68: astore 5
    //   70: aload_3
    //   71: astore 4
    //   73: aload_1
    //   74: astore_2
    //   75: ldc 57
    //   77: ldc 205
    //   79: iconst_1
    //   80: anewarray 61	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload 5
    //   87: invokevirtual 80	java/lang/Exception:toString	()Ljava/lang/String;
    //   90: aastore
    //   91: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload 4
    //   96: astore_2
    //   97: aload_1
    //   98: ifnull +12 -> 110
    //   101: aload_1
    //   102: invokeinterface 184 1 0
    //   107: aload 4
    //   109: astore_2
    //   110: ldc 193
    //   112: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: aload_2
    //   116: areturn
    //   117: aconst_null
    //   118: astore 4
    //   120: aload 4
    //   122: astore_2
    //   123: aload_1
    //   124: ifnull -14 -> 110
    //   127: aload_1
    //   128: invokeinterface 184 1 0
    //   133: aload 4
    //   135: astore_2
    //   136: goto -26 -> 110
    //   139: astore 4
    //   141: aconst_null
    //   142: astore_2
    //   143: aload_2
    //   144: ifnull +9 -> 153
    //   147: aload_2
    //   148: invokeinterface 184 1 0
    //   153: ldc 193
    //   155: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: aload 4
    //   160: athrow
    //   161: astore 4
    //   163: goto -20 -> 143
    //   166: astore 5
    //   168: aconst_null
    //   169: astore_1
    //   170: aconst_null
    //   171: astore 4
    //   173: goto -100 -> 73
    //   176: astore 5
    //   178: aconst_null
    //   179: astore 4
    //   181: goto -108 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   39	48	68	java/lang/Exception
    //   50	65	68	java/lang/Exception
    //   5	18	139	finally
    //   24	28	161	finally
    //   30	34	161	finally
    //   39	48	161	finally
    //   50	65	161	finally
    //   75	94	161	finally
    //   5	18	166	java/lang/Exception
    //   24	28	176	java/lang/Exception
    //   30	34	176	java/lang/Exception
  }

  // ERROR //
  public final a vd(int paramInt)
  {
    // Byte code:
    //   0: ldc 209
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/plugin/expt/e/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 29
    //   11: aconst_null
    //   12: ldc 88
    //   14: iconst_1
    //   15: anewarray 21	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: iload_1
    //   21: invokestatic 91	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   24: aastore
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokeinterface 213 8 0
    //   33: astore_2
    //   34: aload_2
    //   35: ifnull +146 -> 181
    //   38: aload_2
    //   39: astore_3
    //   40: aload_2
    //   41: invokeinterface 216 1 0
    //   46: ifeq +135 -> 181
    //   49: aload_2
    //   50: astore_3
    //   51: new 23	com/tencent/mm/plugin/expt/d/a
    //   54: astore 4
    //   56: aload_2
    //   57: astore_3
    //   58: aload 4
    //   60: invokespecial 176	com/tencent/mm/plugin/expt/d/a:<init>	()V
    //   63: aload_2
    //   64: astore_3
    //   65: aload 4
    //   67: aload_2
    //   68: invokevirtual 179	com/tencent/mm/plugin/expt/d/a:d	(Landroid/database/Cursor;)V
    //   71: aload 4
    //   73: astore_3
    //   74: aload_2
    //   75: ifnull +12 -> 87
    //   78: aload_2
    //   79: invokeinterface 184 1 0
    //   84: aload 4
    //   86: astore_3
    //   87: ldc 209
    //   89: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_3
    //   93: areturn
    //   94: astore 5
    //   96: aconst_null
    //   97: astore_2
    //   98: aconst_null
    //   99: astore 4
    //   101: aload_2
    //   102: astore_3
    //   103: ldc 57
    //   105: ldc 218
    //   107: iconst_1
    //   108: anewarray 61	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload 5
    //   115: invokevirtual 80	java/lang/Exception:toString	()Ljava/lang/String;
    //   118: aastore
    //   119: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: aload 4
    //   124: astore_3
    //   125: aload_2
    //   126: ifnull -39 -> 87
    //   129: aload_2
    //   130: invokeinterface 184 1 0
    //   135: aload 4
    //   137: astore_3
    //   138: goto -51 -> 87
    //   141: astore 4
    //   143: aconst_null
    //   144: astore_3
    //   145: aload_3
    //   146: ifnull +9 -> 155
    //   149: aload_3
    //   150: invokeinterface 184 1 0
    //   155: ldc 209
    //   157: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: aload 4
    //   162: athrow
    //   163: astore 4
    //   165: goto -20 -> 145
    //   168: astore 5
    //   170: aconst_null
    //   171: astore 4
    //   173: goto -72 -> 101
    //   176: astore 5
    //   178: goto -77 -> 101
    //   181: aconst_null
    //   182: astore 4
    //   184: goto -113 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   5	34	94	java/lang/Exception
    //   5	34	141	finally
    //   40	49	163	finally
    //   51	56	163	finally
    //   58	63	163	finally
    //   65	71	163	finally
    //   103	122	163	finally
    //   40	49	168	java/lang/Exception
    //   51	56	168	java/lang/Exception
    //   58	63	168	java/lang/Exception
    //   65	71	176	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.e.d
 * JD-Core Version:    0.6.2
 */