package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class d extends a
{
  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26393);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11001));
    localArrayList.add(Integer.valueOf(11004));
    AppMethodBeat.o(26393);
    return localArrayList;
  }

  // ERROR //
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: sipush 26394
    //   3: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: sipush 11001
    //   10: if_icmpne +109 -> 119
    //   13: new 43	com/tencent/mm/protocal/protobuf/ctm
    //   16: dup
    //   17: invokespecial 44	com/tencent/mm/protocal/protobuf/ctm:<init>	()V
    //   20: astore_3
    //   21: aload_3
    //   22: aload_2
    //   23: invokevirtual 48	com/tencent/mm/protocal/protobuf/ctm:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   26: pop
    //   27: invokestatic 54	com/tencent/mm/cb/b:dqD	()Lcom/tencent/mm/cb/b;
    //   30: getfield 58	com/tencent/mm/cb/b:xFH	J
    //   33: aload_3
    //   34: getfield 61	com/tencent/mm/protocal/protobuf/ctm:woY	J
    //   37: lcmp
    //   38: ifle +289 -> 327
    //   41: invokestatic 67	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   44: invokevirtual 73	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   47: ldc 75
    //   49: invokevirtual 81	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   52: astore_3
    //   53: aload_3
    //   54: astore_2
    //   55: aload_3
    //   56: invokestatic 87	com/tencent/mm/a/e:q	(Ljava/io/InputStream;)[B
    //   59: astore 4
    //   61: aload 4
    //   63: astore_2
    //   64: aload_3
    //   65: invokestatic 90	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   68: sipush 26394
    //   71: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: aload_2
    //   75: areturn
    //   76: astore 4
    //   78: aconst_null
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: ldc 92
    //   84: aload 4
    //   86: ldc 94
    //   88: iconst_0
    //   89: anewarray 96	java/lang/Object
    //   92: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_3
    //   96: invokestatic 90	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   99: aconst_null
    //   100: astore_2
    //   101: goto -33 -> 68
    //   104: astore_3
    //   105: aconst_null
    //   106: astore_2
    //   107: aload_2
    //   108: invokestatic 90	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   111: sipush 26394
    //   114: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: aload_3
    //   118: athrow
    //   119: iload_1
    //   120: sipush 11004
    //   123: if_icmpne +204 -> 327
    //   126: bipush 9
    //   128: invokestatic 107	com/tencent/mm/plugin/wear/model/c/a:HH	(I)V
    //   131: new 109	com/tencent/mm/protocal/protobuf/ctn
    //   134: dup
    //   135: invokespecial 110	com/tencent/mm/protocal/protobuf/ctn:<init>	()V
    //   138: astore_3
    //   139: aload_3
    //   140: aload_2
    //   141: invokevirtual 111	com/tencent/mm/protocal/protobuf/ctn:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   144: pop
    //   145: new 113	com/tencent/mm/protocal/protobuf/cto
    //   148: dup
    //   149: invokespecial 114	com/tencent/mm/protocal/protobuf/cto:<init>	()V
    //   152: astore_2
    //   153: ldc 116
    //   155: invokestatic 122	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   158: checkcast 116	com/tencent/mm/plugin/emoji/b/d
    //   161: invokeinterface 126 1 0
    //   166: ifnull +90 -> 256
    //   169: ldc 116
    //   171: invokestatic 122	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   174: checkcast 116	com/tencent/mm/plugin/emoji/b/d
    //   177: invokeinterface 126 1 0
    //   182: aload_3
    //   183: getfield 130	com/tencent/mm/protocal/protobuf/ctn:vQq	Ljava/lang/String;
    //   186: invokeinterface 136 2 0
    //   191: astore 4
    //   193: aload 4
    //   195: ifnull +61 -> 256
    //   198: aload 4
    //   200: invokeinterface 140 1 0
    //   205: astore 4
    //   207: aload 4
    //   209: invokeinterface 146 1 0
    //   214: ifeq +42 -> 256
    //   217: aload 4
    //   219: invokeinterface 150 1 0
    //   224: checkcast 152	com/tencent/mm/storage/emotion/EmojiInfo
    //   227: astore 5
    //   229: aload 5
    //   231: invokevirtual 156	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   234: invokestatic 162	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   237: ifne -30 -> 207
    //   240: aload_2
    //   241: getfield 166	com/tencent/mm/protocal/protobuf/cto:vII	Ljava/util/LinkedList;
    //   244: aload 5
    //   246: invokevirtual 156	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   249: invokevirtual 169	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   252: pop
    //   253: goto -46 -> 207
    //   256: aload_2
    //   257: getfield 166	com/tencent/mm/protocal/protobuf/cto:vII	Ljava/util/LinkedList;
    //   260: invokevirtual 173	java/util/LinkedList:size	()I
    //   263: ifne +49 -> 312
    //   266: new 175	com/tencent/mm/g/a/vh
    //   269: dup
    //   270: invokespecial 176	com/tencent/mm/g/a/vh:<init>	()V
    //   273: astore 4
    //   275: aload 4
    //   277: getfield 180	com/tencent/mm/g/a/vh:cSo	Lcom/tencent/mm/g/a/vh$a;
    //   280: iconst_1
    //   281: anewarray 182	java/lang/String
    //   284: dup
    //   285: iconst_0
    //   286: aload_3
    //   287: getfield 130	com/tencent/mm/protocal/protobuf/ctn:vQq	Ljava/lang/String;
    //   290: aastore
    //   291: putfield 188	com/tencent/mm/g/a/vh$a:cSp	[Ljava/lang/String;
    //   294: aload 4
    //   296: getfield 180	com/tencent/mm/g/a/vh:cSo	Lcom/tencent/mm/g/a/vh$a;
    //   299: iconst_1
    //   300: putfield 192	com/tencent/mm/g/a/vh$a:cuy	I
    //   303: getstatic 198	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   306: aload 4
    //   308: invokevirtual 202	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   311: pop
    //   312: aload_2
    //   313: invokevirtual 206	com/tencent/mm/protocal/protobuf/cto:toByteArray	()[B
    //   316: astore_2
    //   317: sipush 26394
    //   320: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   323: goto -249 -> 74
    //   326: astore_2
    //   327: sipush 26394
    //   330: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: aconst_null
    //   334: astore_2
    //   335: goto -261 -> 74
    //   338: astore_2
    //   339: goto -312 -> 27
    //   342: astore_2
    //   343: goto -198 -> 145
    //   346: astore_3
    //   347: goto -240 -> 107
    //   350: astore 4
    //   352: goto -272 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   41	53	76	java/io/IOException
    //   41	53	104	finally
    //   312	317	326	java/io/IOException
    //   21	27	338	java/io/IOException
    //   139	145	342	java/io/IOException
    //   55	61	346	finally
    //   82	95	346	finally
    //   55	61	350	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.d
 * JD-Core Version:    0.6.2
 */