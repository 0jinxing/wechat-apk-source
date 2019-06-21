package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.tv;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ai extends j<af>
  implements g.a
{
  public static final String[] fnj;
  private e bSd;
  private HashMap<String, int[]> xXd;
  public HashMap<Integer, ArrayList<String>> xXe;

  static
  {
    AppMethodBeat.i(29061);
    fnj = new String[] { j.a(af.ccO, "ContactLabel") };
    AppMethodBeat.o(29061);
  }

  public ai(e parame)
  {
    this(parame, af.ccO, "ContactLabel");
  }

  private ai(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    AppMethodBeat.i(29030);
    this.xXd = null;
    this.xXe = null;
    this.bSd = parame;
    parame.hY("ContactLabel", "CREATE INDEX IF NOT EXISTS  contact_label_createtime_index ON ContactLabel ( createTime )");
    AppMethodBeat.o(29030);
  }

  private static String a(String paramString, af paramaf)
  {
    AppMethodBeat.i(29052);
    if (paramaf != null)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramaf);
      paramString = x(paramString, localArrayList);
      AppMethodBeat.o(29052);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(29052);
    }
  }

  private boolean a(boolean paramBoolean, af paramaf)
  {
    AppMethodBeat.i(29039);
    boolean bool = super.b(paramaf);
    if ((bool) && (paramBoolean))
      anF(a("insert", paramaf));
    AppMethodBeat.o(29039);
    return bool;
  }

  private boolean a(boolean paramBoolean, af paramaf, String[] paramArrayOfString)
  {
    AppMethodBeat.i(29041);
    boolean bool = super.a(paramaf, paramArrayOfString);
    if ((bool) && (paramBoolean))
    {
      anF(a("delete", paramaf));
      dsp();
    }
    ahw();
    AppMethodBeat.o(29041);
    return bool;
  }

  private ai.a b(af paramaf)
  {
    AppMethodBeat.i(29050);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = paramaf.field_labelID;
    try
    {
      localObject3 = this.bSd.a("select * from ContactLabel where labelID=?", new String[] { localObject3 }, 2);
      if (localObject3 != null)
      {
        localObject2 = localObject3;
        localObject1 = localObject3;
        if (((Cursor)localObject3).moveToFirst())
        {
          localObject2 = localObject3;
          localObject1 = localObject3;
          String str = bo.bc(((Cursor)localObject3).getString(((Cursor)localObject3).getColumnIndex("labelName")), "");
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (paramaf.field_labelName.equalsIgnoreCase(str))
          {
            localObject2 = localObject3;
            localObject1 = localObject3;
            paramaf = ai.a.xXg;
            if (localObject3 != null)
              ((Cursor)localObject3).close();
            AppMethodBeat.o(29050);
          }
        }
      }
      while (true)
      {
        return paramaf;
        localObject2 = localObject3;
        localObject1 = localObject3;
        paramaf = ai.a.xXh;
        if (localObject3 != null)
          ((Cursor)localObject3).close();
        AppMethodBeat.o(29050);
        continue;
        if (localObject3 != null)
          ((Cursor)localObject3).close();
        paramaf = ai.a.xXi;
        AppMethodBeat.o(29050);
      }
    }
    catch (Exception paramaf)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.w("MicroMsg.Label.ContactLabelStorage", "cpan[checkEqualsName] exception %s", new Object[] { paramaf.toString() });
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(29050);
    }
    throw paramaf;
  }

  // ERROR //
  private String c(af paramaf)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: sipush 29051
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 113	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   15: aload_1
    //   16: getfield 159	com/tencent/mm/storage/af:field_labelName	Ljava/lang/String;
    //   19: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   25: astore_3
    //   26: aload_0
    //   27: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   30: ldc 196
    //   32: iconst_2
    //   33: anewarray 28	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: aload_3
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: ldc 198
    //   44: aastore
    //   45: iconst_2
    //   46: invokeinterface 131 4 0
    //   51: astore 4
    //   53: aload 4
    //   55: ifnull +154 -> 209
    //   58: aload 4
    //   60: astore_3
    //   61: aload 4
    //   63: invokeinterface 137 1 0
    //   68: ifeq +141 -> 209
    //   71: aload 4
    //   73: astore_3
    //   74: aload 4
    //   76: aload 4
    //   78: ldc 139
    //   80: invokeinterface 143 2 0
    //   85: invokeinterface 147 2 0
    //   90: ldc 149
    //   92: invokestatic 155	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: astore 5
    //   97: aload 4
    //   99: astore_3
    //   100: aload_1
    //   101: getfield 159	com/tencent/mm/storage/af:field_labelName	Ljava/lang/String;
    //   104: aload 5
    //   106: invokevirtual 163	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   109: istore 6
    //   111: aload 4
    //   113: astore_3
    //   114: new 113	java/lang/StringBuilder
    //   117: astore 7
    //   119: aload 4
    //   121: astore_3
    //   122: aload 7
    //   124: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   127: aload 4
    //   129: astore_3
    //   130: ldc 178
    //   132: ldc 200
    //   134: iconst_2
    //   135: anewarray 182	java/lang/Object
    //   138: dup
    //   139: iconst_0
    //   140: aload 7
    //   142: aload_1
    //   143: getfield 159	com/tencent/mm/storage/af:field_labelName	Ljava/lang/String;
    //   146: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: aastore
    //   153: dup
    //   154: iconst_1
    //   155: aload 5
    //   157: invokestatic 204	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   160: aastore
    //   161: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: iload 6
    //   166: ifeq +43 -> 209
    //   169: aload 4
    //   171: astore_3
    //   172: aload 4
    //   174: aload 4
    //   176: ldc 208
    //   178: invokeinterface 143 2 0
    //   183: invokeinterface 147 2 0
    //   188: astore_1
    //   189: aload 4
    //   191: ifnull +10 -> 201
    //   194: aload 4
    //   196: invokeinterface 170 1 0
    //   201: sipush 29051
    //   204: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload_1
    //   208: areturn
    //   209: aload 4
    //   211: ifnull +10 -> 221
    //   214: aload 4
    //   216: invokeinterface 170 1 0
    //   221: sipush 29051
    //   224: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: aload_2
    //   228: astore_1
    //   229: goto -22 -> 207
    //   232: astore_1
    //   233: aconst_null
    //   234: astore 4
    //   236: aload 4
    //   238: astore_3
    //   239: ldc 178
    //   241: ldc 180
    //   243: iconst_1
    //   244: anewarray 182	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload_1
    //   250: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   253: aastore
    //   254: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: aload 4
    //   259: ifnull -38 -> 221
    //   262: aload 4
    //   264: invokeinterface 170 1 0
    //   269: goto -48 -> 221
    //   272: astore_1
    //   273: aconst_null
    //   274: astore_3
    //   275: aload_3
    //   276: ifnull +9 -> 285
    //   279: aload_3
    //   280: invokeinterface 170 1 0
    //   285: sipush 29051
    //   288: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: aload_1
    //   292: athrow
    //   293: astore_1
    //   294: goto -19 -> 275
    //   297: astore_1
    //   298: goto -62 -> 236
    //
    // Exception table:
    //   from	to	target	type
    //   26	53	232	java/lang/Exception
    //   26	53	272	finally
    //   61	71	293	finally
    //   74	97	293	finally
    //   100	111	293	finally
    //   114	119	293	finally
    //   122	127	293	finally
    //   130	164	293	finally
    //   172	189	293	finally
    //   239	257	293	finally
    //   61	71	297	java/lang/Exception
    //   74	97	297	java/lang/Exception
    //   100	111	297	java/lang/Exception
    //   114	119	297	java/lang/Exception
    //   122	127	297	java/lang/Exception
    //   130	164	297	java/lang/Exception
    //   172	189	297	java/lang/Exception
  }

  private static void dsp()
  {
    AppMethodBeat.i(29054);
    ab.i("MicroMsg.Label.ContactLabelStorage", "cpan[publishUpdateSearchIndexEvent]");
    tv localtv = new tv();
    localtv.cPX.cvc = 3000L;
    com.tencent.mm.sdk.b.a.xxA.m(localtv);
    AppMethodBeat.o(29054);
  }

  private static String x(String paramString, List<af> paramList)
  {
    AppMethodBeat.i(29053);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" ");
    if ((paramList != null) && (paramList.size() > 0))
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        paramString = (af)paramList.get(j);
        if (paramString != null)
        {
          localStringBuilder.append(paramString.field_labelID);
          if (j < i - 1)
            localStringBuilder.append(" ");
        }
      }
      ab.i("MicroMsg.Label.ContactLabelStorage", "cpan[genNotifyString] event:%s", new Object[] { localStringBuilder.toString() });
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(29053);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(29053);
    }
  }

  // ERROR //
  public final String PD(String paramString)
  {
    // Byte code:
    //   0: sipush 29046
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   10: ldc 36
    //   12: iconst_1
    //   13: anewarray 28	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc 139
    //   20: aastore
    //   21: ldc_w 256
    //   24: iconst_1
    //   25: anewarray 28	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: aload_1
    //   31: aastore
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: iconst_2
    //   36: invokeinterface 259 9 0
    //   41: astore_2
    //   42: aload_2
    //   43: ifnull +72 -> 115
    //   46: aload_2
    //   47: astore_1
    //   48: aload_2
    //   49: invokeinterface 137 1 0
    //   54: ifeq +61 -> 115
    //   57: aload_2
    //   58: astore_1
    //   59: aload_2
    //   60: aload_2
    //   61: ldc 139
    //   63: invokeinterface 143 2 0
    //   68: invokeinterface 147 2 0
    //   73: astore_3
    //   74: aload_2
    //   75: astore_1
    //   76: ldc 178
    //   78: ldc_w 261
    //   81: iconst_1
    //   82: anewarray 182	java/lang/Object
    //   85: dup
    //   86: iconst_0
    //   87: aload_3
    //   88: invokestatic 204	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   91: aastore
    //   92: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokeinterface 170 1 0
    //   105: sipush 29046
    //   108: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_3
    //   112: astore_1
    //   113: aload_1
    //   114: areturn
    //   115: aload_2
    //   116: ifnull +9 -> 125
    //   119: aload_2
    //   120: invokeinterface 170 1 0
    //   125: sipush 29046
    //   128: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: aconst_null
    //   132: astore_1
    //   133: goto -20 -> 113
    //   136: astore_3
    //   137: aconst_null
    //   138: astore_2
    //   139: aload_2
    //   140: astore_1
    //   141: ldc 178
    //   143: ldc_w 263
    //   146: iconst_1
    //   147: anewarray 182	java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: aload_3
    //   153: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   156: aastore
    //   157: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload_2
    //   161: ifnull -36 -> 125
    //   164: aload_2
    //   165: invokeinterface 170 1 0
    //   170: goto -45 -> 125
    //   173: astore_2
    //   174: aconst_null
    //   175: astore_1
    //   176: aload_1
    //   177: ifnull +9 -> 186
    //   180: aload_1
    //   181: invokeinterface 170 1 0
    //   186: sipush 29046
    //   189: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: aload_2
    //   193: athrow
    //   194: astore_2
    //   195: goto -19 -> 176
    //   198: astore_3
    //   199: goto -60 -> 139
    //
    // Exception table:
    //   from	to	target	type
    //   6	42	136	java/lang/Exception
    //   6	42	173	finally
    //   48	57	194	finally
    //   59	74	194	finally
    //   76	95	194	finally
    //   141	160	194	finally
    //   48	57	198	java/lang/Exception
    //   59	74	198	java/lang/Exception
    //   76	95	198	java/lang/Exception
  }

  // ERROR //
  public final String PE(String paramString)
  {
    // Byte code:
    //   0: sipush 29047
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   10: ldc 36
    //   12: iconst_1
    //   13: anewarray 28	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc 208
    //   20: aastore
    //   21: ldc_w 266
    //   24: iconst_1
    //   25: anewarray 28	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: aload_1
    //   31: aastore
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: iconst_2
    //   36: invokeinterface 259 9 0
    //   41: astore_2
    //   42: aload_2
    //   43: ifnull +72 -> 115
    //   46: aload_2
    //   47: astore_1
    //   48: aload_2
    //   49: invokeinterface 137 1 0
    //   54: ifeq +61 -> 115
    //   57: aload_2
    //   58: astore_1
    //   59: aload_2
    //   60: aload_2
    //   61: ldc 208
    //   63: invokeinterface 143 2 0
    //   68: invokeinterface 147 2 0
    //   73: astore_3
    //   74: aload_2
    //   75: astore_1
    //   76: ldc 178
    //   78: ldc_w 268
    //   81: iconst_1
    //   82: anewarray 182	java/lang/Object
    //   85: dup
    //   86: iconst_0
    //   87: aload_3
    //   88: invokestatic 204	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   91: aastore
    //   92: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokeinterface 170 1 0
    //   105: sipush 29047
    //   108: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_3
    //   112: astore_1
    //   113: aload_1
    //   114: areturn
    //   115: aload_2
    //   116: ifnull +9 -> 125
    //   119: aload_2
    //   120: invokeinterface 170 1 0
    //   125: sipush 29047
    //   128: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: aconst_null
    //   132: astore_1
    //   133: goto -20 -> 113
    //   136: astore_3
    //   137: aconst_null
    //   138: astore_2
    //   139: aload_2
    //   140: astore_1
    //   141: ldc 178
    //   143: ldc_w 270
    //   146: iconst_1
    //   147: anewarray 182	java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: aload_3
    //   153: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   156: aastore
    //   157: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload_2
    //   161: ifnull -36 -> 125
    //   164: aload_2
    //   165: invokeinterface 170 1 0
    //   170: goto -45 -> 125
    //   173: astore_2
    //   174: aconst_null
    //   175: astore_1
    //   176: aload_1
    //   177: ifnull +9 -> 186
    //   180: aload_1
    //   181: invokeinterface 170 1 0
    //   186: sipush 29047
    //   189: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: aload_2
    //   193: athrow
    //   194: astore_2
    //   195: goto -19 -> 176
    //   198: astore_3
    //   199: goto -60 -> 139
    //
    // Exception table:
    //   from	to	target	type
    //   6	42	136	java/lang/Exception
    //   6	42	173	finally
    //   48	57	194	finally
    //   59	74	194	finally
    //   76	95	194	finally
    //   141	160	194	finally
    //   48	57	198	java/lang/Exception
    //   59	74	198	java/lang/Exception
    //   76	95	198	java/lang/Exception
  }

  // ERROR //
  public final ArrayList<String> R(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: sipush 29037
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnull +8 -> 15
    //   10: aload_1
    //   11: arraylength
    //   12: ifgt +13 -> 25
    //   15: sipush 29037
    //   18: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aconst_null
    //   22: astore_1
    //   23: aload_1
    //   24: areturn
    //   25: aload_1
    //   26: arraylength
    //   27: istore_2
    //   28: new 113	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   35: astore_3
    //   36: aload_3
    //   37: ldc_w 274
    //   40: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_3
    //   45: ldc_w 276
    //   48: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: iconst_0
    //   53: istore 4
    //   55: iload 4
    //   57: iload_2
    //   58: if_icmpge +56 -> 114
    //   61: aload_3
    //   62: new 113	java/lang/StringBuilder
    //   65: dup
    //   66: ldc_w 278
    //   69: invokespecial 280	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_1
    //   73: iload 4
    //   75: aaload
    //   76: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: ldc_w 278
    //   82: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: iload 4
    //   94: iload_2
    //   95: iconst_1
    //   96: isub
    //   97: if_icmpge +11 -> 108
    //   100: aload_3
    //   101: ldc_w 282
    //   104: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: iinc 4 1
    //   111: goto -56 -> 55
    //   114: aload_3
    //   115: ldc_w 284
    //   118: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload_3
    //   123: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: astore_1
    //   127: ldc 178
    //   129: ldc_w 286
    //   132: iconst_1
    //   133: anewarray 182	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: aload_1
    //   139: aastore
    //   140: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload_0
    //   144: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   147: aload_1
    //   148: aconst_null
    //   149: iconst_2
    //   150: invokeinterface 131 4 0
    //   155: astore_3
    //   156: aload_3
    //   157: astore_1
    //   158: aload_3
    //   159: ldc 139
    //   161: invokeinterface 143 2 0
    //   166: istore 4
    //   168: aload_3
    //   169: astore_1
    //   170: aload_3
    //   171: invokeinterface 137 1 0
    //   176: ifeq +91 -> 267
    //   179: aload_3
    //   180: astore_1
    //   181: new 71	java/util/ArrayList
    //   184: astore 5
    //   186: aload_3
    //   187: astore_1
    //   188: aload 5
    //   190: invokespecial 73	java/util/ArrayList:<init>	()V
    //   193: aload_3
    //   194: astore_1
    //   195: aload 5
    //   197: aload_3
    //   198: iload 4
    //   200: invokeinterface 147 2 0
    //   205: invokevirtual 290	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   208: pop
    //   209: aload_3
    //   210: astore_1
    //   211: aload_3
    //   212: invokeinterface 293 1 0
    //   217: ifne -24 -> 193
    //   220: aload_3
    //   221: astore_1
    //   222: ldc 178
    //   224: ldc_w 295
    //   227: iconst_1
    //   228: anewarray 182	java/lang/Object
    //   231: dup
    //   232: iconst_0
    //   233: aload 5
    //   235: invokevirtual 296	java/util/ArrayList:size	()I
    //   238: invokestatic 301	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   241: aastore
    //   242: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   245: aload_3
    //   246: ifnull +9 -> 255
    //   249: aload_3
    //   250: invokeinterface 170 1 0
    //   255: sipush 29037
    //   258: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: aload 5
    //   263: astore_1
    //   264: goto -241 -> 23
    //   267: aload_3
    //   268: ifnull +9 -> 277
    //   271: aload_3
    //   272: invokeinterface 170 1 0
    //   277: sipush 29037
    //   280: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: aconst_null
    //   284: astore_1
    //   285: goto -262 -> 23
    //   288: astore 5
    //   290: aconst_null
    //   291: astore_3
    //   292: aload_3
    //   293: astore_1
    //   294: ldc 178
    //   296: ldc_w 303
    //   299: iconst_1
    //   300: anewarray 182	java/lang/Object
    //   303: dup
    //   304: iconst_0
    //   305: aload 5
    //   307: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   310: aastore
    //   311: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   314: aload_3
    //   315: ifnull -38 -> 277
    //   318: aload_3
    //   319: invokeinterface 170 1 0
    //   324: goto -47 -> 277
    //   327: astore_3
    //   328: aconst_null
    //   329: astore_1
    //   330: aload_1
    //   331: ifnull +9 -> 340
    //   334: aload_1
    //   335: invokeinterface 170 1 0
    //   340: sipush 29037
    //   343: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   346: aload_3
    //   347: athrow
    //   348: astore_3
    //   349: goto -19 -> 330
    //   352: astore 5
    //   354: goto -62 -> 292
    //
    // Exception table:
    //   from	to	target	type
    //   143	156	288	java/lang/Exception
    //   143	156	327	finally
    //   158	168	348	finally
    //   170	179	348	finally
    //   181	186	348	finally
    //   188	193	348	finally
    //   195	209	348	finally
    //   211	220	348	finally
    //   222	245	348	finally
    //   294	314	348	finally
    //   158	168	352	java/lang/Exception
    //   170	179	352	java/lang/Exception
    //   181	186	352	java/lang/Exception
    //   188	193	352	java/lang/Exception
    //   195	209	352	java/lang/Exception
    //   211	220	352	java/lang/Exception
    //   222	245	352	java/lang/Exception
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean a(af paramaf, String[] paramArrayOfString)
  {
    AppMethodBeat.i(29042);
    boolean bool = a(true, paramaf, paramArrayOfString);
    AppMethodBeat.o(29042);
    return bool;
  }

  public final void ahw()
  {
    AppMethodBeat.i(29033);
    ab.v("MicroMsg.Label.ContactLabelStorage", "cleanCache %s", new Object[] { bo.dpG() });
    this.xXd = null;
    this.xXe = null;
    AppMethodBeat.o(29033);
  }

  // ERROR //
  public final ArrayList<String> ai(ArrayList<String> paramArrayList)
  {
    // Byte code:
    //   0: sipush 29038
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnull +10 -> 17
    //   10: aload_1
    //   11: invokevirtual 296	java/util/ArrayList:size	()I
    //   14: ifgt +13 -> 27
    //   17: sipush 29038
    //   20: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_1
    //   26: areturn
    //   27: aload_1
    //   28: invokevirtual 296	java/util/ArrayList:size	()I
    //   31: istore_2
    //   32: new 113	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   39: astore_3
    //   40: aload_3
    //   41: ldc_w 325
    //   44: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_3
    //   49: ldc_w 276
    //   52: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: iconst_0
    //   57: istore 4
    //   59: iload 4
    //   61: iload_2
    //   62: if_icmpge +61 -> 123
    //   65: aload_3
    //   66: new 113	java/lang/StringBuilder
    //   69: dup
    //   70: ldc_w 327
    //   73: invokespecial 280	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   76: aload_1
    //   77: iload 4
    //   79: invokevirtual 328	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   82: checkcast 28	java/lang/String
    //   85: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc_w 327
    //   91: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: iload 4
    //   103: iload_2
    //   104: iconst_1
    //   105: isub
    //   106: if_icmpge +11 -> 117
    //   109: aload_3
    //   110: ldc_w 282
    //   113: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: iinc 4 1
    //   120: goto -61 -> 59
    //   123: aload_3
    //   124: ldc_w 284
    //   127: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload_3
    //   132: ldc_w 330
    //   135: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload_3
    //   140: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: astore_1
    //   144: ldc 178
    //   146: ldc_w 332
    //   149: iconst_1
    //   150: anewarray 182	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload_1
    //   156: aastore
    //   157: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload_0
    //   161: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   164: aload_1
    //   165: aconst_null
    //   166: iconst_2
    //   167: invokeinterface 131 4 0
    //   172: astore_3
    //   173: aload_3
    //   174: astore_1
    //   175: aload_3
    //   176: ldc 208
    //   178: invokeinterface 143 2 0
    //   183: istore 4
    //   185: aload_3
    //   186: astore_1
    //   187: aload_3
    //   188: invokeinterface 137 1 0
    //   193: ifeq +91 -> 284
    //   196: aload_3
    //   197: astore_1
    //   198: new 71	java/util/ArrayList
    //   201: astore 5
    //   203: aload_3
    //   204: astore_1
    //   205: aload 5
    //   207: invokespecial 73	java/util/ArrayList:<init>	()V
    //   210: aload_3
    //   211: astore_1
    //   212: aload 5
    //   214: aload_3
    //   215: iload 4
    //   217: invokeinterface 147 2 0
    //   222: invokevirtual 290	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   225: pop
    //   226: aload_3
    //   227: astore_1
    //   228: aload_3
    //   229: invokeinterface 293 1 0
    //   234: ifne -24 -> 210
    //   237: aload_3
    //   238: astore_1
    //   239: ldc 178
    //   241: ldc_w 334
    //   244: iconst_1
    //   245: anewarray 182	java/lang/Object
    //   248: dup
    //   249: iconst_0
    //   250: aload 5
    //   252: invokevirtual 296	java/util/ArrayList:size	()I
    //   255: invokestatic 301	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   258: aastore
    //   259: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   262: aload_3
    //   263: ifnull +9 -> 272
    //   266: aload_3
    //   267: invokeinterface 170 1 0
    //   272: sipush 29038
    //   275: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   278: aload 5
    //   280: astore_1
    //   281: goto -256 -> 25
    //   284: aload_3
    //   285: ifnull +9 -> 294
    //   288: aload_3
    //   289: invokeinterface 170 1 0
    //   294: sipush 29038
    //   297: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: aconst_null
    //   301: astore_1
    //   302: goto -277 -> 25
    //   305: astore 5
    //   307: aconst_null
    //   308: astore_3
    //   309: aload_3
    //   310: astore_1
    //   311: ldc 178
    //   313: ldc_w 336
    //   316: iconst_1
    //   317: anewarray 182	java/lang/Object
    //   320: dup
    //   321: iconst_0
    //   322: aload 5
    //   324: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   327: aastore
    //   328: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: aload_3
    //   332: ifnull -38 -> 294
    //   335: aload_3
    //   336: invokeinterface 170 1 0
    //   341: goto -47 -> 294
    //   344: astore_1
    //   345: aconst_null
    //   346: astore_3
    //   347: aload_1
    //   348: astore 5
    //   350: aload_3
    //   351: ifnull +9 -> 360
    //   354: aload_3
    //   355: invokeinterface 170 1 0
    //   360: sipush 29038
    //   363: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   366: aload 5
    //   368: athrow
    //   369: astore 5
    //   371: aload_1
    //   372: astore_3
    //   373: goto -23 -> 350
    //   376: astore 5
    //   378: goto -69 -> 309
    //
    // Exception table:
    //   from	to	target	type
    //   160	173	305	java/lang/Exception
    //   160	173	344	finally
    //   175	185	369	finally
    //   187	196	369	finally
    //   198	203	369	finally
    //   205	210	369	finally
    //   212	226	369	finally
    //   228	237	369	finally
    //   239	262	369	finally
    //   311	331	369	finally
    //   175	185	376	java/lang/Exception
    //   187	196	376	java/lang/Exception
    //   198	203	376	java/lang/Exception
    //   205	210	376	java/lang/Exception
    //   212	226	376	java/lang/Exception
    //   228	237	376	java/lang/Exception
    //   239	262	376	java/lang/Exception
  }

  public final ArrayList<String> aoD(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(29035);
    long l = bo.anU();
    int j = bo.getInt(paramString, -1);
    if (j == -1)
    {
      ab.e("MicroMsg.Label.ContactLabelStorage", "getUserNameListById  failed id:%s", new Object[] { paramString });
      paramString = null;
      AppMethodBeat.o(29035);
      return paramString;
    }
    dso();
    ArrayList localArrayList = (ArrayList)this.xXe.get(Integer.valueOf(j));
    l = bo.gb(l);
    if (localArrayList == null);
    while (true)
    {
      ab.i("MicroMsg.Label.ContactLabelStorage", "getUserNameListById time:%s id:%s count:%s stack:%s", new Object[] { Long.valueOf(l), paramString, Integer.valueOf(i), bo.dpG() });
      AppMethodBeat.o(29035);
      paramString = localArrayList;
      break;
      i = localArrayList.size();
    }
  }

  // ERROR //
  public final af aoE(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: sipush 29048
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   12: ldc 36
    //   14: bipush 6
    //   16: anewarray 28	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: ldc 208
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: ldc_w 376
    //   29: aastore
    //   30: dup
    //   31: iconst_2
    //   32: ldc_w 378
    //   35: aastore
    //   36: dup
    //   37: iconst_3
    //   38: ldc 139
    //   40: aastore
    //   41: dup
    //   42: iconst_4
    //   43: ldc_w 380
    //   46: aastore
    //   47: dup
    //   48: iconst_5
    //   49: ldc_w 382
    //   52: aastore
    //   53: ldc_w 266
    //   56: iconst_1
    //   57: anewarray 28	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: aastore
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: iconst_2
    //   68: invokeinterface 259 9 0
    //   73: astore_3
    //   74: aload_3
    //   75: ifnull +53 -> 128
    //   78: aload_3
    //   79: astore_1
    //   80: aload_3
    //   81: invokeinterface 137 1 0
    //   86: ifeq +42 -> 128
    //   89: aload_3
    //   90: astore_1
    //   91: new 30	com/tencent/mm/storage/af
    //   94: astore_2
    //   95: aload_3
    //   96: astore_1
    //   97: aload_2
    //   98: invokespecial 383	com/tencent/mm/storage/af:<init>	()V
    //   101: aload_3
    //   102: astore_1
    //   103: aload_2
    //   104: aload_3
    //   105: invokevirtual 386	com/tencent/mm/storage/af:d	(Landroid/database/Cursor;)V
    //   108: aload_3
    //   109: ifnull +9 -> 118
    //   112: aload_3
    //   113: invokeinterface 170 1 0
    //   118: sipush 29048
    //   121: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_2
    //   125: astore_1
    //   126: aload_1
    //   127: areturn
    //   128: aload_3
    //   129: ifnull +9 -> 138
    //   132: aload_3
    //   133: invokeinterface 170 1 0
    //   138: sipush 29048
    //   141: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: aconst_null
    //   145: astore_1
    //   146: goto -20 -> 126
    //   149: astore_2
    //   150: aconst_null
    //   151: astore_3
    //   152: aload_3
    //   153: astore_1
    //   154: ldc 178
    //   156: ldc_w 270
    //   159: iconst_1
    //   160: anewarray 182	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_2
    //   166: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   169: aastore
    //   170: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: aload_3
    //   174: ifnull -36 -> 138
    //   177: aload_3
    //   178: invokeinterface 170 1 0
    //   183: goto -45 -> 138
    //   186: astore_3
    //   187: aload_2
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull +9 -> 199
    //   193: aload_1
    //   194: invokeinterface 170 1 0
    //   199: sipush 29048
    //   202: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   205: aload_3
    //   206: athrow
    //   207: astore_3
    //   208: goto -19 -> 189
    //   211: astore_2
    //   212: goto -60 -> 152
    //
    // Exception table:
    //   from	to	target	type
    //   8	74	149	java/lang/Exception
    //   8	74	186	finally
    //   80	89	207	finally
    //   91	95	207	finally
    //   97	101	207	finally
    //   103	108	207	finally
    //   154	173	207	finally
    //   80	89	211	java/lang/Exception
    //   91	95	211	java/lang/Exception
    //   97	101	211	java/lang/Exception
    //   103	108	211	java/lang/Exception
  }

  // ERROR //
  public final af aoF(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: sipush 29049
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   12: ldc 36
    //   14: bipush 6
    //   16: anewarray 28	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: ldc 208
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: ldc_w 376
    //   29: aastore
    //   30: dup
    //   31: iconst_2
    //   32: ldc_w 378
    //   35: aastore
    //   36: dup
    //   37: iconst_3
    //   38: ldc 139
    //   40: aastore
    //   41: dup
    //   42: iconst_4
    //   43: ldc_w 380
    //   46: aastore
    //   47: dup
    //   48: iconst_5
    //   49: ldc_w 382
    //   52: aastore
    //   53: ldc_w 256
    //   56: iconst_1
    //   57: anewarray 28	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: aastore
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: iconst_2
    //   68: invokeinterface 259 9 0
    //   73: astore_3
    //   74: aload_3
    //   75: ifnull +53 -> 128
    //   78: aload_3
    //   79: astore_1
    //   80: aload_3
    //   81: invokeinterface 137 1 0
    //   86: ifeq +42 -> 128
    //   89: aload_3
    //   90: astore_1
    //   91: new 30	com/tencent/mm/storage/af
    //   94: astore_2
    //   95: aload_3
    //   96: astore_1
    //   97: aload_2
    //   98: invokespecial 383	com/tencent/mm/storage/af:<init>	()V
    //   101: aload_3
    //   102: astore_1
    //   103: aload_2
    //   104: aload_3
    //   105: invokevirtual 386	com/tencent/mm/storage/af:d	(Landroid/database/Cursor;)V
    //   108: aload_3
    //   109: ifnull +9 -> 118
    //   112: aload_3
    //   113: invokeinterface 170 1 0
    //   118: sipush 29049
    //   121: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_2
    //   125: astore_1
    //   126: aload_1
    //   127: areturn
    //   128: aload_3
    //   129: ifnull +9 -> 138
    //   132: aload_3
    //   133: invokeinterface 170 1 0
    //   138: sipush 29049
    //   141: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: aconst_null
    //   145: astore_1
    //   146: goto -20 -> 126
    //   149: astore_2
    //   150: aconst_null
    //   151: astore_3
    //   152: aload_3
    //   153: astore_1
    //   154: ldc 178
    //   156: ldc_w 389
    //   159: iconst_1
    //   160: anewarray 182	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_2
    //   166: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   169: aastore
    //   170: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: aload_3
    //   174: ifnull -36 -> 138
    //   177: aload_3
    //   178: invokeinterface 170 1 0
    //   183: goto -45 -> 138
    //   186: astore_3
    //   187: aload_2
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull +9 -> 199
    //   193: aload_1
    //   194: invokeinterface 170 1 0
    //   199: sipush 29049
    //   202: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   205: aload_3
    //   206: athrow
    //   207: astore_3
    //   208: goto -19 -> 189
    //   211: astore_2
    //   212: goto -60 -> 152
    //
    // Exception table:
    //   from	to	target	type
    //   8	74	149	java/lang/Exception
    //   8	74	186	finally
    //   80	89	207	finally
    //   91	95	207	finally
    //   97	101	207	finally
    //   103	108	207	finally
    //   154	173	207	finally
    //   80	89	211	java/lang/Exception
    //   91	95	211	java/lang/Exception
    //   97	101	211	java/lang/Exception
    //   103	108	211	java/lang/Exception
  }

  public final boolean b(boolean paramBoolean, af paramaf, String[] paramArrayOfString)
  {
    AppMethodBeat.i(29043);
    boolean bool = super.c(paramaf, paramArrayOfString);
    if ((bool) && (paramBoolean))
      anF(a("update", paramaf));
    ahw();
    AppMethodBeat.o(29043);
    return bool;
  }

  public final ArrayList<String> dsm()
  {
    Object localObject = null;
    AppMethodBeat.i(29031);
    long l = bo.anU();
    Cursor localCursor = this.bSd.a("ContactLabel", new String[] { "labelName" }, null, null, null, null, "createTime ASC ", 2);
    if (localCursor == null)
      AppMethodBeat.o(29031);
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      while (localCursor.moveToNext())
        ((ArrayList)localObject).add(localCursor.getString(0));
      localCursor.close();
      ab.i("MicroMsg.Label.ContactLabelStorage", "getAllLabel time:%s count:%s stack:%s", new Object[] { Long.valueOf(bo.gb(l)), Integer.valueOf(((ArrayList)localObject).size()), bo.dpG() });
      AppMethodBeat.o(29031);
    }
  }

  public final ArrayList<af> dsn()
  {
    Object localObject = null;
    AppMethodBeat.i(29032);
    long l = bo.anU();
    Cursor localCursor = this.bSd.a("select * from ContactLabel order by createTime ASC ", null, 2);
    if (localCursor == null)
      AppMethodBeat.o(29032);
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      while (localCursor.moveToNext())
      {
        af localaf = new af();
        localaf.d(localCursor);
        ((ArrayList)localObject).add(localaf);
      }
      localCursor.close();
      ab.i("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", new Object[] { Long.valueOf(bo.gb(l)), Integer.valueOf(((ArrayList)localObject).size()), bo.dpG() });
      AppMethodBeat.o(29032);
    }
  }

  public final void dso()
  {
    AppMethodBeat.i(29034);
    if ((this.xXd != null) && (this.xXe != null))
      AppMethodBeat.o(29034);
    while (true)
    {
      return;
      HashMap localHashMap1 = new HashMap();
      HashMap localHashMap2 = new HashMap();
      long l = bo.anU();
      Object localObject1 = "select username , contactLabelIds from rcontact where (type & " + com.tencent.mm.n.a.NS() + " !=0 ) and ( contactLabelIds != '') ;";
      localObject1 = this.bSd.a((String)localObject1, null, 2);
      Object localObject2;
      Object localObject3;
      if (localObject1 == null)
      {
        this.xXd = localHashMap1;
        this.xXe = localHashMap2;
        AppMethodBeat.o(29034);
        continue;
        localHashMap1.put(localObject2, localObject3);
      }
      else
      {
        while (((Cursor)localObject1).moveToNext())
        {
          localObject2 = ((Cursor)localObject1).getString(0);
          if (!bo.isNullOrNil((String)localObject2))
          {
            String[] arrayOfString = bo.nullAsNil(((Cursor)localObject1).getString(1)).split(",");
            if ((arrayOfString != null) && (arrayOfString.length > 0))
            {
              localObject3 = new int[arrayOfString.length];
              int i = 0;
              label190: if (i < arrayOfString.length)
              {
                localObject3[i] = bo.getInt(arrayOfString[i], -1);
                if (!localHashMap2.containsKey(Integer.valueOf(localObject3[i])))
                  break label254;
                ((ArrayList)localHashMap2.get(Integer.valueOf(localObject3[i]))).add(localObject2);
              }
              while (true)
              {
                i++;
                break label190;
                break;
                label254: ArrayList localArrayList = new ArrayList();
                localArrayList.add(localObject2);
                localHashMap2.put(Integer.valueOf(localObject3[i]), localArrayList);
              }
            }
          }
        }
        ((Cursor)localObject1).close();
        ab.i("MicroMsg.Label.ContactLabelStorage", "checkRebuildCache time:%s user:%s label:%s stack:%s", new Object[] { Long.valueOf(bo.gb(l)), Integer.valueOf(localHashMap1.size()), Integer.valueOf(localHashMap2.size()), bo.dpG() });
        this.xXd = localHashMap1;
        this.xXe = localHashMap2;
        AppMethodBeat.o(29034);
      }
    }
  }

  public final boolean eq(List<af> paramList)
  {
    AppMethodBeat.i(29044);
    if (paramList.size() <= 0)
    {
      ab.i("MicroMsg.Label.ContactLabelStorage", "cpan[insertAddLabel] list is null.");
      AppMethodBeat.o(29044);
      return false;
    }
    h localh = null;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
      ab.i("MicroMsg.Label.ContactLabelStorage", "begin insertOrUpdateList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      int i = paramList.size();
      new ArrayList();
      for (int j = 0; j < i; j++)
      {
        String str = c((af)paramList.get(j));
        if (!bo.isNullOrNil(str))
          pI(str);
      }
      if (localh != null)
      {
        localh.mB(l);
        ab.i("MicroMsg.Label.ContactLabelStorage", "end deleteLocalLabel transaction");
      }
      ahw();
      AppMethodBeat.o(29044);
      break;
      l = -1L;
    }
  }

  public final boolean er(List<af> paramList)
  {
    AppMethodBeat.i(29045);
    if (paramList.size() <= 0)
    {
      ab.i("MicroMsg.Label.ContactLabelStorage", "cpan[insertOrUpdateList] list is null.");
      AppMethodBeat.o(29045);
      return false;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    h localh = null;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
      ab.i("MicroMsg.Label.ContactLabelStorage", "begin insertOrUpdateList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      int i = paramList.size();
      int j = 0;
      if (j < i)
      {
        af localaf = (af)paramList.get(j);
        if (localaf != null)
        {
          ai.a locala = b(localaf);
          switch (ai.1.xXf[locala.ordinal()])
          {
          default:
            ab.w("MicroMsg.Label.ContactLabelStorage", "cpan[insertOrUpdateList] unknow result.");
          case 1:
          case 2:
          case 3:
          }
        }
        while (true)
        {
          j++;
          break;
          b(false, localaf, new String[] { "labelID" });
          localArrayList2.add(localaf);
          continue;
          localaf.field_createTime = System.currentTimeMillis();
          a(false, localaf);
          localArrayList1.add(localaf);
        }
      }
      if (localh != null)
      {
        localh.mB(l);
        ab.i("MicroMsg.Label.ContactLabelStorage", "end insertOrUpdateList transaction");
      }
      if (localArrayList1.size() > 0)
        anF(x("insert", localArrayList1));
      if (localArrayList2.size() > 0)
        anF(x("update", localArrayList2));
      ahw();
      AppMethodBeat.o(29045);
      break;
      l = -1L;
    }
  }

  public final boolean es(List<af> paramList)
  {
    AppMethodBeat.i(29055);
    boolean bool;
    if ((paramList == null) || (paramList.size() <= 0))
    {
      ab.w("MicroMsg.Label.ContactLabelStorage", "cpan[deleteList] list is null.");
      AppMethodBeat.o(29055);
      bool = false;
      return bool;
    }
    h localh = null;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
      ab.i("MicroMsg.Label.ContactLabelStorage", "begin deleteList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
        a(false, (af)paramList.get(j), new String[] { "labelID" });
      if (localh != null)
      {
        localh.mB(l);
        ab.i("MicroMsg.Label.ContactLabelStorage", "end insertOrUpdateList transaction");
      }
      anF(x("delete", paramList));
      dsp();
      AppMethodBeat.o(29055);
      bool = true;
      break;
      l = -1L;
    }
  }

  // ERROR //
  public final ArrayList<af> et(List<af> paramList)
  {
    // Byte code:
    //   0: sipush 29056
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokeinterface 244 1 0
    //   12: ifgt +13 -> 25
    //   15: sipush 29056
    //   18: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aconst_null
    //   22: astore_1
    //   23: aload_1
    //   24: areturn
    //   25: aload_1
    //   26: invokeinterface 244 1 0
    //   31: istore_2
    //   32: new 113	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   39: astore_3
    //   40: aload_3
    //   41: ldc_w 274
    //   44: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_3
    //   49: ldc_w 511
    //   52: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: iconst_0
    //   57: istore 4
    //   59: iload 4
    //   61: iload_2
    //   62: if_icmpge +66 -> 128
    //   65: aload_3
    //   66: new 113	java/lang/StringBuilder
    //   69: dup
    //   70: ldc_w 278
    //   73: invokespecial 280	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   76: aload_1
    //   77: iload 4
    //   79: invokeinterface 248 2 0
    //   84: checkcast 30	com/tencent/mm/storage/af
    //   87: getfield 118	com/tencent/mm/storage/af:field_labelID	I
    //   90: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   93: ldc_w 278
    //   96: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: iload 4
    //   108: iload_2
    //   109: iconst_1
    //   110: isub
    //   111: if_icmpge +11 -> 122
    //   114: aload_3
    //   115: ldc_w 282
    //   118: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: iinc 4 1
    //   125: goto -66 -> 59
    //   128: aload_3
    //   129: ldc_w 284
    //   132: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_3
    //   137: ldc_w 330
    //   140: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload_3
    //   145: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: astore_1
    //   149: ldc 178
    //   151: ldc_w 513
    //   154: iconst_1
    //   155: anewarray 182	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: aload_1
    //   161: aastore
    //   162: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload_0
    //   166: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   169: aload_1
    //   170: aconst_null
    //   171: iconst_2
    //   172: invokeinterface 131 4 0
    //   177: astore_3
    //   178: aload_3
    //   179: astore_1
    //   180: aload_3
    //   181: invokeinterface 137 1 0
    //   186: ifeq +107 -> 293
    //   189: aload_3
    //   190: astore_1
    //   191: new 71	java/util/ArrayList
    //   194: astore 5
    //   196: aload_3
    //   197: astore_1
    //   198: aload 5
    //   200: invokespecial 73	java/util/ArrayList:<init>	()V
    //   203: aload_3
    //   204: astore_1
    //   205: new 30	com/tencent/mm/storage/af
    //   208: astore 6
    //   210: aload_3
    //   211: astore_1
    //   212: aload 6
    //   214: invokespecial 383	com/tencent/mm/storage/af:<init>	()V
    //   217: aload_3
    //   218: astore_1
    //   219: aload 6
    //   221: aload_3
    //   222: invokevirtual 386	com/tencent/mm/storage/af:d	(Landroid/database/Cursor;)V
    //   225: aload_3
    //   226: astore_1
    //   227: aload 5
    //   229: aload 6
    //   231: invokevirtual 290	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   234: pop
    //   235: aload_3
    //   236: astore_1
    //   237: aload_3
    //   238: invokeinterface 293 1 0
    //   243: ifne -40 -> 203
    //   246: aload_3
    //   247: astore_1
    //   248: ldc 178
    //   250: ldc_w 515
    //   253: iconst_1
    //   254: anewarray 182	java/lang/Object
    //   257: dup
    //   258: iconst_0
    //   259: aload 5
    //   261: invokevirtual 296	java/util/ArrayList:size	()I
    //   264: invokestatic 301	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   267: aastore
    //   268: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: aload_3
    //   272: ifnull +9 -> 281
    //   275: aload_3
    //   276: invokeinterface 170 1 0
    //   281: sipush 29056
    //   284: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   287: aload 5
    //   289: astore_1
    //   290: goto -267 -> 23
    //   293: aload_3
    //   294: ifnull +9 -> 303
    //   297: aload_3
    //   298: invokeinterface 170 1 0
    //   303: sipush 29056
    //   306: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: aconst_null
    //   310: astore_1
    //   311: goto -288 -> 23
    //   314: astore 5
    //   316: aconst_null
    //   317: astore_3
    //   318: aload_3
    //   319: astore_1
    //   320: ldc 178
    //   322: ldc_w 517
    //   325: iconst_1
    //   326: anewarray 182	java/lang/Object
    //   329: dup
    //   330: iconst_0
    //   331: aload 5
    //   333: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   336: aastore
    //   337: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: aload_3
    //   341: ifnull -38 -> 303
    //   344: aload_3
    //   345: invokeinterface 170 1 0
    //   350: goto -47 -> 303
    //   353: astore_3
    //   354: aconst_null
    //   355: astore_1
    //   356: aload_1
    //   357: ifnull +9 -> 366
    //   360: aload_1
    //   361: invokeinterface 170 1 0
    //   366: sipush 29056
    //   369: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   372: aload_3
    //   373: athrow
    //   374: astore_3
    //   375: goto -19 -> 356
    //   378: astore 5
    //   380: goto -62 -> 318
    //
    // Exception table:
    //   from	to	target	type
    //   165	178	314	java/lang/Exception
    //   165	178	353	finally
    //   180	189	374	finally
    //   191	196	374	finally
    //   198	203	374	finally
    //   205	210	374	finally
    //   212	217	374	finally
    //   219	225	374	finally
    //   227	235	374	finally
    //   237	246	374	finally
    //   248	271	374	finally
    //   320	340	374	finally
    //   180	189	378	java/lang/Exception
    //   191	196	378	java/lang/Exception
    //   198	203	378	java/lang/Exception
    //   205	210	378	java/lang/Exception
    //   212	217	378	java/lang/Exception
    //   219	225	378	java/lang/Exception
    //   227	235	378	java/lang/Exception
    //   237	246	378	java/lang/Exception
    //   248	271	378	java/lang/Exception
  }

  public final boolean pI(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(29040);
    ab.i("MicroMsg.Label.ContactLabelStorage", "cpan[delete] labelID:%s", new Object[] { String.valueOf(paramString) });
    ab.d("MicroMsg.Label.ContactLabelStorage", "cpan[query] SQL:%s", new Object[] { "labelID =? " });
    try
    {
      i = this.bSd.delete("ContactLabel", "labelID =? ", new String[] { paramString });
      if (i > 0)
      {
        AppMethodBeat.o(29040);
        return bool;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.Label.ContactLabelStorage", "cpan[delete] exception %s", new Object[] { paramString.toString() });
        int i = -1;
        continue;
        AppMethodBeat.o(29040);
        bool = false;
      }
    }
  }

  // ERROR //
  public final ArrayList<String> w(String paramString, List<String> paramList)
  {
    // Byte code:
    //   0: sipush 29036
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 178
    //   8: ldc_w 522
    //   11: iconst_1
    //   12: anewarray 182	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: ldc_w 532
    //   20: aastore
    //   21: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: new 113	java/lang/StringBuilder
    //   27: dup
    //   28: ldc_w 534
    //   31: invokespecial 280	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_1
    //   35: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc_w 534
    //   41: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: astore_3
    //   48: new 113	java/lang/StringBuilder
    //   51: dup
    //   52: ldc_w 534
    //   55: invokespecial 280	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload_1
    //   59: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc_w 534
    //   65: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore 4
    //   73: new 113	java/lang/StringBuilder
    //   76: dup
    //   77: ldc_w 534
    //   80: invokespecial 280	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   83: aload_1
    //   84: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: ldc_w 534
    //   90: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: astore_1
    //   97: aload_0
    //   98: getfield 60	com/tencent/mm/storage/ai:bSd	Lcom/tencent/mm/sdk/e/e;
    //   101: ldc_w 532
    //   104: iconst_3
    //   105: anewarray 28	java/lang/String
    //   108: dup
    //   109: iconst_0
    //   110: aload_3
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: aload 4
    //   116: aastore
    //   117: dup
    //   118: iconst_2
    //   119: aload_1
    //   120: aastore
    //   121: iconst_2
    //   122: invokeinterface 131 4 0
    //   127: astore 4
    //   129: aload 4
    //   131: astore_1
    //   132: aload 4
    //   134: ldc 139
    //   136: invokeinterface 143 2 0
    //   141: istore 5
    //   143: aload 4
    //   145: astore_1
    //   146: aload 4
    //   148: invokeinterface 137 1 0
    //   153: ifeq +110 -> 263
    //   156: aload 4
    //   158: astore_1
    //   159: new 71	java/util/ArrayList
    //   162: astore_3
    //   163: aload 4
    //   165: astore_1
    //   166: aload_3
    //   167: invokespecial 73	java/util/ArrayList:<init>	()V
    //   170: aload 4
    //   172: astore_1
    //   173: aload 4
    //   175: iload 5
    //   177: invokeinterface 147 2 0
    //   182: astore 6
    //   184: aload_2
    //   185: ifnull +29 -> 214
    //   188: aload 4
    //   190: astore_1
    //   191: aload_2
    //   192: invokeinterface 244 1 0
    //   197: ifle +17 -> 214
    //   200: aload 4
    //   202: astore_1
    //   203: aload_2
    //   204: aload 6
    //   206: invokeinterface 537 2 0
    //   211: ifne +13 -> 224
    //   214: aload 4
    //   216: astore_1
    //   217: aload_3
    //   218: aload 6
    //   220: invokevirtual 290	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   223: pop
    //   224: aload 4
    //   226: astore_1
    //   227: aload 4
    //   229: invokeinterface 293 1 0
    //   234: istore 7
    //   236: iload 7
    //   238: ifne -68 -> 170
    //   241: aload 4
    //   243: ifnull +10 -> 253
    //   246: aload 4
    //   248: invokeinterface 170 1 0
    //   253: sipush 29036
    //   256: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   259: aload_3
    //   260: astore_1
    //   261: aload_1
    //   262: areturn
    //   263: aload 4
    //   265: ifnull +10 -> 275
    //   268: aload 4
    //   270: invokeinterface 170 1 0
    //   275: sipush 29036
    //   278: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: aconst_null
    //   282: astore_1
    //   283: goto -22 -> 261
    //   286: astore_2
    //   287: aconst_null
    //   288: astore 4
    //   290: aload 4
    //   292: astore_1
    //   293: ldc 178
    //   295: ldc_w 539
    //   298: iconst_1
    //   299: anewarray 182	java/lang/Object
    //   302: dup
    //   303: iconst_0
    //   304: aload_2
    //   305: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   308: aastore
    //   309: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: aload 4
    //   314: ifnull -39 -> 275
    //   317: aload 4
    //   319: invokeinterface 170 1 0
    //   324: goto -49 -> 275
    //   327: astore_2
    //   328: aconst_null
    //   329: astore_1
    //   330: aload_1
    //   331: ifnull +9 -> 340
    //   334: aload_1
    //   335: invokeinterface 170 1 0
    //   340: sipush 29036
    //   343: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   346: aload_2
    //   347: athrow
    //   348: astore_2
    //   349: goto -19 -> 330
    //   352: astore_2
    //   353: goto -63 -> 290
    //
    // Exception table:
    //   from	to	target	type
    //   97	129	286	java/lang/Exception
    //   97	129	327	finally
    //   132	143	348	finally
    //   146	156	348	finally
    //   159	163	348	finally
    //   166	170	348	finally
    //   173	184	348	finally
    //   191	200	348	finally
    //   203	214	348	finally
    //   217	224	348	finally
    //   227	236	348	finally
    //   293	312	348	finally
    //   132	143	352	java/lang/Exception
    //   146	156	352	java/lang/Exception
    //   159	163	352	java/lang/Exception
    //   166	170	352	java/lang/Exception
    //   173	184	352	java/lang/Exception
    //   191	200	352	java/lang/Exception
    //   203	214	352	java/lang/Exception
    //   217	224	352	java/lang/Exception
    //   227	236	352	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ai
 * JD-Core Version:    0.6.2
 */