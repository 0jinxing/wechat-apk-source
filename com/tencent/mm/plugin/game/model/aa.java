package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.cw;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aa
{
  public String mAppId;
  public List<aa.a> mXO;

  public aa(String paramString)
  {
    AppMethodBeat.i(111366);
    this.mAppId = "";
    this.mXO = new LinkedList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(111366);
    while (true)
    {
      return;
      this.mAppId = paramString;
      this.mXO.addAll(bEH());
      AppMethodBeat.o(111366);
    }
  }

  public aa(String paramString, List<cw> paramList)
  {
    AppMethodBeat.i(111367);
    this.mAppId = "";
    this.mXO = new LinkedList();
    if ((bo.isNullOrNil(paramString)) || (paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(111367);
    while (true)
    {
      return;
      this.mAppId = paramString;
      this.mXO.clear();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        cw localcw = (cw)paramList.next();
        paramString = new aa.a();
        paramString.mXP = localcw.ndr;
        paramString.cIS = localcw.jBB;
        paramString.tag = localcw.Label;
        paramString.mEA = localcw.nds;
        paramString.mXR = localcw.ndt;
        paramString.mXQ = localcw.ndu;
        paramString.mXS = localcw.ndv;
        this.mXO.add(paramString);
      }
      bEI();
      AppMethodBeat.o(111367);
    }
  }

  // ERROR //
  private List<aa.a> bEH()
  {
    // Byte code:
    //   0: ldc 136
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 138	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   12: aload_0
    //   13: getfield 27	com/tencent/mm/plugin/game/model/aa:mAppId	Ljava/lang/String;
    //   16: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc 145
    //   21: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: astore_1
    //   28: new 29	java/util/LinkedList
    //   31: dup
    //   32: invokespecial 30	java/util/LinkedList:<init>	()V
    //   35: astore_2
    //   36: ldc 151
    //   38: invokestatic 157	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   41: checkcast 151	com/tencent/mm/plugin/game/a/c
    //   44: invokeinterface 161 1 0
    //   49: aload_1
    //   50: invokevirtual 167	com/tencent/mm/plugin/game/model/w:NK	(Ljava/lang/String;)[B
    //   53: astore_1
    //   54: aload_1
    //   55: ifnonnull +10 -> 65
    //   58: ldc 136
    //   60: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: aload_2
    //   64: areturn
    //   65: new 169	java/io/ByteArrayInputStream
    //   68: dup
    //   69: aload_1
    //   70: invokespecial 172	java/io/ByteArrayInputStream:<init>	([B)V
    //   73: astore_3
    //   74: new 174	java/io/ObjectInputStream
    //   77: astore 4
    //   79: aload 4
    //   81: aload_3
    //   82: invokespecial 177	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   85: aload 4
    //   87: astore_1
    //   88: aload_2
    //   89: aload 4
    //   91: invokeinterface 182 1 0
    //   96: checkcast 47	java/util/List
    //   99: invokeinterface 51 2 0
    //   104: pop
    //   105: aload_3
    //   106: invokevirtual 185	java/io/ByteArrayInputStream:close	()V
    //   109: aload 4
    //   111: invokeinterface 186 1 0
    //   116: ldc 136
    //   118: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: goto -58 -> 63
    //   124: astore 5
    //   126: aconst_null
    //   127: astore 4
    //   129: aload 4
    //   131: astore_1
    //   132: ldc 188
    //   134: aload 5
    //   136: ldc 25
    //   138: iconst_0
    //   139: anewarray 4	java/lang/Object
    //   142: invokestatic 194	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   145: aload_3
    //   146: invokevirtual 185	java/io/ByteArrayInputStream:close	()V
    //   149: aload 4
    //   151: ifnull -35 -> 116
    //   154: aload 4
    //   156: invokeinterface 186 1 0
    //   161: goto -45 -> 116
    //   164: astore_1
    //   165: goto -49 -> 116
    //   168: astore 4
    //   170: aconst_null
    //   171: astore_1
    //   172: aload_3
    //   173: invokevirtual 185	java/io/ByteArrayInputStream:close	()V
    //   176: aload_1
    //   177: ifnull +9 -> 186
    //   180: aload_1
    //   181: invokeinterface 186 1 0
    //   186: ldc 136
    //   188: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: aload 4
    //   193: athrow
    //   194: astore_1
    //   195: goto -86 -> 109
    //   198: astore_1
    //   199: goto -83 -> 116
    //   202: astore_1
    //   203: goto -54 -> 149
    //   206: astore 5
    //   208: goto -32 -> 176
    //   211: astore_1
    //   212: goto -26 -> 186
    //   215: astore 4
    //   217: goto -45 -> 172
    //   220: astore 5
    //   222: goto -93 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   74	85	124	java/lang/Exception
    //   154	161	164	java/io/IOException
    //   74	85	168	finally
    //   105	109	194	java/io/IOException
    //   109	116	198	java/io/IOException
    //   145	149	202	java/io/IOException
    //   172	176	206	java/io/IOException
    //   180	186	211	java/io/IOException
    //   88	105	215	finally
    //   132	145	215	finally
    //   88	105	220	java/lang/Exception
  }

  // ERROR //
  public final void bEI()
  {
    // Byte code:
    //   0: ldc 196
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 138	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   12: aload_0
    //   13: getfield 27	com/tencent/mm/plugin/game/model/aa:mAppId	Ljava/lang/String;
    //   16: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc 145
    //   21: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: astore_1
    //   28: new 198	java/io/ByteArrayOutputStream
    //   31: dup
    //   32: invokespecial 199	java/io/ByteArrayOutputStream:<init>	()V
    //   35: astore_2
    //   36: new 201	java/io/ObjectOutputStream
    //   39: astore_3
    //   40: aload_3
    //   41: aload_2
    //   42: invokespecial 204	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   45: aload_3
    //   46: astore 4
    //   48: aload_3
    //   49: aload_0
    //   50: getfield 32	com/tencent/mm/plugin/game/model/aa:mXO	Ljava/util/List;
    //   53: invokeinterface 210 2 0
    //   58: aload_3
    //   59: astore 4
    //   61: aload_2
    //   62: invokevirtual 214	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   65: astore 5
    //   67: aload_3
    //   68: astore 4
    //   70: ldc 151
    //   72: invokestatic 157	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   75: checkcast 151	com/tencent/mm/plugin/game/a/c
    //   78: invokeinterface 161 1 0
    //   83: aload_1
    //   84: aload 5
    //   86: invokevirtual 218	com/tencent/mm/plugin/game/model/w:w	(Ljava/lang/String;[B)Z
    //   89: pop
    //   90: aload_3
    //   91: invokeinterface 219 1 0
    //   96: aload_2
    //   97: invokevirtual 220	java/io/ByteArrayOutputStream:close	()V
    //   100: ldc 196
    //   102: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: return
    //   106: astore 4
    //   108: ldc 196
    //   110: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: goto -8 -> 105
    //   116: astore_1
    //   117: aconst_null
    //   118: astore_3
    //   119: aload_3
    //   120: astore 4
    //   122: ldc 188
    //   124: aload_1
    //   125: ldc 25
    //   127: iconst_0
    //   128: anewarray 4	java/lang/Object
    //   131: invokestatic 194	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: aload_3
    //   135: ifnull +9 -> 144
    //   138: aload_3
    //   139: invokeinterface 219 1 0
    //   144: aload_2
    //   145: invokevirtual 220	java/io/ByteArrayOutputStream:close	()V
    //   148: ldc 196
    //   150: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: goto -48 -> 105
    //   156: astore 4
    //   158: ldc 196
    //   160: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: goto -58 -> 105
    //   166: astore_3
    //   167: aconst_null
    //   168: astore 4
    //   170: aload 4
    //   172: ifnull +10 -> 182
    //   175: aload 4
    //   177: invokeinterface 219 1 0
    //   182: aload_2
    //   183: invokevirtual 220	java/io/ByteArrayOutputStream:close	()V
    //   186: ldc 196
    //   188: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: aload_3
    //   192: athrow
    //   193: astore 4
    //   195: goto -99 -> 96
    //   198: astore 4
    //   200: goto -56 -> 144
    //   203: astore 4
    //   205: goto -23 -> 182
    //   208: astore 4
    //   210: goto -24 -> 186
    //   213: astore_3
    //   214: goto -44 -> 170
    //   217: astore_1
    //   218: goto -99 -> 119
    //
    // Exception table:
    //   from	to	target	type
    //   96	100	106	java/io/IOException
    //   36	45	116	java/lang/Exception
    //   144	148	156	java/io/IOException
    //   36	45	166	finally
    //   90	96	193	java/io/IOException
    //   138	144	198	java/io/IOException
    //   175	182	203	java/io/IOException
    //   182	186	208	java/io/IOException
    //   48	58	213	finally
    //   61	67	213	finally
    //   70	90	213	finally
    //   122	134	213	finally
    //   48	58	217	java/lang/Exception
    //   61	67	217	java/lang/Exception
    //   70	90	217	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aa
 * JD-Core Version:    0.6.2
 */