package com.tencent.mm.plugin.boots.b.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class a extends j<com.tencent.mm.plugin.boots.a.a>
  implements g.a
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(90537);
    fnj = new String[] { j.a(com.tencent.mm.plugin.boots.a.a.ccO, "ActiveInfo") };
    AppMethodBeat.o(90537);
  }

  public a(e parame)
  {
    super(parame, com.tencent.mm.plugin.boots.a.a.ccO, "ActiveInfo", null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final List<com.tencent.mm.plugin.boots.a.a> aVJ()
  {
    AppMethodBeat.i(90536);
    ArrayList localArrayList = new ArrayList();
    long l = bo.dpC();
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      Cursor localCursor = this.bSd.a("select * from ActiveInfo where useTime >= ?", new String[] { String.valueOf(l - 86400000L) }, 2);
      if (localCursor != null)
      {
        localObject2 = localCursor;
        localObject1 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localCursor;
            localObject1 = localCursor;
            com.tencent.mm.plugin.boots.a.a locala = new com/tencent/mm/plugin/boots/a/a;
            localObject2 = localCursor;
            localObject1 = localCursor;
            locala.<init>();
            localObject2 = localCursor;
            localObject1 = localCursor;
            locala.d(localCursor);
            localObject2 = localCursor;
            localObject1 = localCursor;
            localArrayList.add(locala);
            localObject2 = localCursor;
            localObject1 = localCursor;
            bool = localCursor.moveToNext();
          }
          while (bool);
        }
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.printErrStackTrace("MicroMsg.Tinker.ActiveInfoStorage", localException, "getDayActiveFeature failed.", new Object[0]);
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(90536);
    }
  }

  public final String getTableName()
  {
    return "ActiveInfo";
  }

  // ERROR //
  public final int rU(int paramInt)
  {
    // Byte code:
    //   0: ldc 118
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 24	com/tencent/mm/plugin/boots/a/a
    //   8: dup
    //   9: invokespecial 83	com/tencent/mm/plugin/boots/a/a:<init>	()V
    //   12: astore_2
    //   13: aload_0
    //   14: getfield 47	com/tencent/mm/plugin/boots/b/a/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   17: ldc 30
    //   19: aconst_null
    //   20: ldc 120
    //   22: iconst_1
    //   23: anewarray 22	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: iload_1
    //   29: invokestatic 123	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   32: aastore
    //   33: aconst_null
    //   34: aconst_null
    //   35: aconst_null
    //   36: invokeinterface 127 8 0
    //   41: astore_3
    //   42: aload_3
    //   43: ifnull +142 -> 185
    //   46: aload_3
    //   47: astore 4
    //   49: aload_3
    //   50: invokeinterface 82 1 0
    //   55: ifeq +130 -> 185
    //   58: aload_3
    //   59: astore 4
    //   61: aload_2
    //   62: aload_3
    //   63: invokevirtual 87	com/tencent/mm/plugin/boots/a/a:d	(Landroid/database/Cursor;)V
    //   66: iconst_0
    //   67: istore 5
    //   69: iload 5
    //   71: istore 6
    //   73: aload_3
    //   74: ifnull +13 -> 87
    //   77: aload_3
    //   78: invokeinterface 99 1 0
    //   83: iload 5
    //   85: istore 6
    //   87: aload_2
    //   88: getfield 131	com/tencent/mm/plugin/boots/a/a:field_useTime	J
    //   91: invokestatic 63	com/tencent/mm/sdk/platformtools/bo:dpC	()J
    //   94: ldc2_w 66
    //   97: lsub
    //   98: lcmp
    //   99: iflt +169 -> 268
    //   102: aload_2
    //   103: getfield 131	com/tencent/mm/plugin/boots/a/a:field_useTime	J
    //   106: invokestatic 63	com/tencent/mm/sdk/platformtools/bo:dpC	()J
    //   109: lcmp
    //   110: ifgt +158 -> 268
    //   113: aload_2
    //   114: getfield 135	com/tencent/mm/plugin/boots/a/a:field_dau	I
    //   117: iconst_1
    //   118: iadd
    //   119: istore 5
    //   121: aload_2
    //   122: invokestatic 140	java/lang/System:currentTimeMillis	()J
    //   125: putfield 131	com/tencent/mm/plugin/boots/a/a:field_useTime	J
    //   128: aload_2
    //   129: iload 5
    //   131: putfield 135	com/tencent/mm/plugin/boots/a/a:field_dau	I
    //   134: aload_2
    //   135: iconst_1
    //   136: putfield 143	com/tencent/mm/plugin/boots/a/a:field_mau	I
    //   139: iload 6
    //   141: ifeq +170 -> 311
    //   144: aload_0
    //   145: getfield 47	com/tencent/mm/plugin/boots/b/a/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   148: ldc 30
    //   150: ldc 145
    //   152: aload_2
    //   153: invokevirtual 149	com/tencent/mm/plugin/boots/a/a:Hl	()Landroid/content/ContentValues;
    //   156: invokeinterface 153 4 0
    //   161: lstore 7
    //   163: lload 7
    //   165: lconst_0
    //   166: lcmp
    //   167: ifge +10 -> 177
    //   170: ldc 101
    //   172: ldc 155
    //   174: invokestatic 159	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   177: ldc 118
    //   179: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: iload 5
    //   184: ireturn
    //   185: iconst_1
    //   186: istore 6
    //   188: iconst_1
    //   189: istore 5
    //   191: aload_3
    //   192: astore 4
    //   194: aload_2
    //   195: iload_1
    //   196: putfield 162	com/tencent/mm/plugin/boots/a/a:field_key	I
    //   199: goto -130 -> 69
    //   202: astore 9
    //   204: iload 6
    //   206: istore 5
    //   208: aload_3
    //   209: astore 4
    //   211: ldc 101
    //   213: aload 9
    //   215: ldc 164
    //   217: iconst_0
    //   218: anewarray 105	java/lang/Object
    //   221: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: iload 5
    //   226: istore 6
    //   228: aload_3
    //   229: ifnull -142 -> 87
    //   232: aload_3
    //   233: invokeinterface 99 1 0
    //   238: iload 5
    //   240: istore 6
    //   242: goto -155 -> 87
    //   245: astore_3
    //   246: aconst_null
    //   247: astore 4
    //   249: aload 4
    //   251: ifnull +10 -> 261
    //   254: aload 4
    //   256: invokeinterface 99 1 0
    //   261: ldc 118
    //   263: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_3
    //   267: athrow
    //   268: aload_2
    //   269: getfield 131	com/tencent/mm/plugin/boots/a/a:field_useTime	J
    //   272: invokestatic 63	com/tencent/mm/sdk/platformtools/bo:dpC	()J
    //   275: ldc2_w 66
    //   278: lsub
    //   279: lcmp
    //   280: iflt +25 -> 305
    //   283: aload_2
    //   284: getfield 135	com/tencent/mm/plugin/boots/a/a:field_dau	I
    //   287: ifle +12 -> 299
    //   290: aload_2
    //   291: getfield 135	com/tencent/mm/plugin/boots/a/a:field_dau	I
    //   294: istore 5
    //   296: goto -175 -> 121
    //   299: iconst_1
    //   300: istore 5
    //   302: goto -181 -> 121
    //   305: iconst_1
    //   306: istore 5
    //   308: goto -187 -> 121
    //   311: aload_0
    //   312: getfield 47	com/tencent/mm/plugin/boots/b/a/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   315: ldc 30
    //   317: aload_2
    //   318: invokevirtual 149	com/tencent/mm/plugin/boots/a/a:Hl	()Landroid/content/ContentValues;
    //   321: ldc 120
    //   323: iconst_1
    //   324: anewarray 22	java/lang/String
    //   327: dup
    //   328: iconst_0
    //   329: iload_1
    //   330: invokestatic 123	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   333: aastore
    //   334: invokeinterface 168 5 0
    //   339: i2l
    //   340: lstore 7
    //   342: goto -179 -> 163
    //   345: astore_3
    //   346: goto -97 -> 249
    //   349: astore 9
    //   351: iconst_0
    //   352: istore 5
    //   354: aconst_null
    //   355: astore_3
    //   356: goto -148 -> 208
    //   359: astore 9
    //   361: iconst_0
    //   362: istore 5
    //   364: goto -156 -> 208
    //
    // Exception table:
    //   from	to	target	type
    //   194	199	202	java/lang/Exception
    //   13	42	245	finally
    //   49	58	345	finally
    //   61	66	345	finally
    //   194	199	345	finally
    //   211	224	345	finally
    //   13	42	349	java/lang/Exception
    //   49	58	359	java/lang/Exception
    //   61	66	359	java/lang/Exception
  }

  // ERROR //
  public final com.tencent.mm.plugin.boots.a.a rV(int paramInt)
  {
    // Byte code:
    //   0: ldc 171
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 24	com/tencent/mm/plugin/boots/a/a
    //   8: dup
    //   9: invokespecial 83	com/tencent/mm/plugin/boots/a/a:<init>	()V
    //   12: astore_2
    //   13: aload_0
    //   14: getfield 47	com/tencent/mm/plugin/boots/b/a/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   17: ldc 30
    //   19: aconst_null
    //   20: ldc 173
    //   22: iconst_1
    //   23: anewarray 22	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: iload_1
    //   29: invokestatic 123	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   32: aastore
    //   33: aconst_null
    //   34: aconst_null
    //   35: aconst_null
    //   36: invokeinterface 127 8 0
    //   41: astore_3
    //   42: aload_3
    //   43: ifnull +23 -> 66
    //   46: aload_3
    //   47: astore 4
    //   49: aload_3
    //   50: invokeinterface 82 1 0
    //   55: ifeq +11 -> 66
    //   58: aload_3
    //   59: astore 4
    //   61: aload_2
    //   62: aload_3
    //   63: invokevirtual 87	com/tencent/mm/plugin/boots/a/a:d	(Landroid/database/Cursor;)V
    //   66: aload_3
    //   67: ifnull +9 -> 76
    //   70: aload_3
    //   71: invokeinterface 99 1 0
    //   76: ldc 171
    //   78: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_2
    //   82: areturn
    //   83: astore 5
    //   85: aconst_null
    //   86: astore_3
    //   87: aload_3
    //   88: astore 4
    //   90: ldc 101
    //   92: aload 5
    //   94: ldc 175
    //   96: iconst_1
    //   97: anewarray 105	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: iload_1
    //   103: invokestatic 180	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   106: aastore
    //   107: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_3
    //   111: ifnull -35 -> 76
    //   114: aload_3
    //   115: invokeinterface 99 1 0
    //   120: goto -44 -> 76
    //   123: astore_3
    //   124: aconst_null
    //   125: astore 4
    //   127: aload 4
    //   129: ifnull +10 -> 139
    //   132: aload 4
    //   134: invokeinterface 99 1 0
    //   139: ldc 171
    //   141: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: aload_3
    //   145: athrow
    //   146: astore_3
    //   147: goto -20 -> 127
    //   150: astore 5
    //   152: goto -65 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   13	42	83	java/lang/Exception
    //   13	42	123	finally
    //   49	58	146	finally
    //   61	66	146	finally
    //   90	110	146	finally
    //   49	58	150	java/lang/Exception
    //   61	66	150	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.boots.b.a.a
 * JD-Core Version:    0.6.2
 */