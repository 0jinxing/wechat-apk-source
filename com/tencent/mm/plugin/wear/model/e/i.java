package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ctv;
import java.util.ArrayList;
import java.util.List;

public final class i extends a
{
  public ctv tYz;

  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26403);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11002));
    AppMethodBeat.o(26403);
    return localArrayList;
  }

  // ERROR //
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: sipush 26404
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iload_1
    //   9: sipush 11002
    //   12: if_icmpne +301 -> 313
    //   15: iconst_1
    //   16: iconst_0
    //   17: invokestatic 51	com/tencent/mm/plugin/wear/model/c/a:gn	(II)V
    //   20: iconst_0
    //   21: invokestatic 54	com/tencent/mm/plugin/wear/model/c/a:HH	(I)V
    //   24: new 56	com/tencent/mm/g/a/vh
    //   27: dup
    //   28: invokespecial 57	com/tencent/mm/g/a/vh:<init>	()V
    //   31: astore 4
    //   33: aload 4
    //   35: getfield 61	com/tencent/mm/g/a/vh:cSo	Lcom/tencent/mm/g/a/vh$a;
    //   38: invokestatic 67	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   41: invokevirtual 73	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   44: ldc 74
    //   46: invokevirtual 80	android/content/res/Resources:getStringArray	(I)[Ljava/lang/String;
    //   49: putfield 86	com/tencent/mm/g/a/vh$a:cSp	[Ljava/lang/String;
    //   52: aload 4
    //   54: getfield 61	com/tencent/mm/g/a/vh:cSo	Lcom/tencent/mm/g/a/vh$a;
    //   57: iconst_1
    //   58: putfield 90	com/tencent/mm/g/a/vh$a:cuy	I
    //   61: getstatic 96	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   64: aload 4
    //   66: invokevirtual 100	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   69: pop
    //   70: invokestatic 106	com/tencent/mm/plugin/wear/model/a:cUn	()Lcom/tencent/mm/plugin/wear/model/a;
    //   73: getfield 110	com/tencent/mm/plugin/wear/model/a:tXt	Lcom/tencent/mm/plugin/wear/model/d;
    //   76: aload_2
    //   77: invokevirtual 116	com/tencent/mm/plugin/wear/model/d:bB	([B)[B
    //   80: astore_2
    //   81: aload_2
    //   82: ifnull +231 -> 313
    //   85: new 118	com/tencent/mm/protocal/protobuf/ctv
    //   88: astore 5
    //   90: aload 5
    //   92: invokespecial 119	com/tencent/mm/protocal/protobuf/ctv:<init>	()V
    //   95: aload 5
    //   97: aload_2
    //   98: invokevirtual 123	com/tencent/mm/protocal/protobuf/ctv:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   101: pop
    //   102: new 125	com/tencent/mm/protocal/protobuf/ctw
    //   105: astore 6
    //   107: aload 6
    //   109: invokespecial 126	com/tencent/mm/protocal/protobuf/ctw:<init>	()V
    //   112: bipush 20
    //   114: istore_1
    //   115: aconst_null
    //   116: astore_2
    //   117: aload_2
    //   118: astore 4
    //   120: iload_1
    //   121: ifle +33 -> 154
    //   124: invokestatic 132	com/tencent/mm/model/r:Yz	()Ljava/lang/String;
    //   127: astore_2
    //   128: aload_2
    //   129: invokestatic 138	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   132: istore 7
    //   134: aload_2
    //   135: astore 4
    //   137: iload 7
    //   139: ifeq +15 -> 154
    //   142: ldc2_w 139
    //   145: invokestatic 146	java/lang/Thread:sleep	(J)V
    //   148: iinc 1 255
    //   151: goto -34 -> 117
    //   154: aload 4
    //   156: invokestatic 138	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   159: istore 7
    //   161: iload 7
    //   163: ifeq +13 -> 176
    //   166: sipush 26404
    //   169: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: aload_3
    //   173: astore_2
    //   174: aload_2
    //   175: areturn
    //   176: aload 6
    //   178: aload 4
    //   180: putfield 150	com/tencent/mm/protocal/protobuf/ctw:vHl	Ljava/lang/String;
    //   183: invokestatic 67	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   186: invokestatic 153	com/tencent/mm/sdk/platformtools/ah:doA	()Ljava/lang/String;
    //   189: iconst_0
    //   190: invokevirtual 157	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   193: astore_2
    //   194: invokestatic 67	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   197: pop
    //   198: aload_2
    //   199: invokestatic 163	com/tencent/mm/sdk/platformtools/aa:h	(Landroid/content/SharedPreferences;)Ljava/lang/String;
    //   202: astore_2
    //   203: invokestatic 166	com/tencent/mm/sdk/platformtools/aa:dor	()Ljava/lang/String;
    //   206: astore 4
    //   208: aload_2
    //   209: ldc 168
    //   211: invokevirtual 173	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   214: ifeq +77 -> 291
    //   217: aload 6
    //   219: aload 4
    //   221: putfield 176	com/tencent/mm/protocal/protobuf/ctw:luQ	Ljava/lang/String;
    //   224: aload 6
    //   226: invokevirtual 180	com/tencent/mm/protocal/protobuf/ctw:toByteArray	()[B
    //   229: astore_2
    //   230: invokestatic 106	com/tencent/mm/plugin/wear/model/a:cUn	()Lcom/tencent/mm/plugin/wear/model/a;
    //   233: getfield 110	com/tencent/mm/plugin/wear/model/a:tXt	Lcom/tencent/mm/plugin/wear/model/d;
    //   236: aload_2
    //   237: invokevirtual 183	com/tencent/mm/plugin/wear/model/d:bC	([B)[B
    //   240: astore_2
    //   241: aload_2
    //   242: ifnull +82 -> 324
    //   245: aload_0
    //   246: aload 5
    //   248: putfield 185	com/tencent/mm/plugin/wear/model/e/i:tYz	Lcom/tencent/mm/protocal/protobuf/ctv;
    //   251: new 187	com/tencent/mm/g/a/vi
    //   254: astore 4
    //   256: aload 4
    //   258: invokespecial 188	com/tencent/mm/g/a/vi:<init>	()V
    //   261: aload 4
    //   263: getfield 192	com/tencent/mm/g/a/vi:cSq	Lcom/tencent/mm/g/a/vi$a;
    //   266: bipush 9
    //   268: putfield 195	com/tencent/mm/g/a/vi$a:cuy	I
    //   271: getstatic 96	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   274: aload 4
    //   276: invokestatic 201	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   279: invokevirtual 205	com/tencent/mm/sdk/b/a:a	(Lcom/tencent/mm/sdk/b/b;Landroid/os/Looper;)V
    //   282: sipush 26404
    //   285: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   288: goto -114 -> 174
    //   291: aload 6
    //   293: aload_2
    //   294: putfield 176	com/tencent/mm/protocal/protobuf/ctw:luQ	Ljava/lang/String;
    //   297: goto -73 -> 224
    //   300: astore_2
    //   301: ldc 207
    //   303: aload_2
    //   304: ldc 209
    //   306: iconst_0
    //   307: anewarray 211	java/lang/Object
    //   310: invokestatic 217	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   313: sipush 26404
    //   316: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   319: aload_3
    //   320: astore_2
    //   321: goto -147 -> 174
    //   324: sipush 26404
    //   327: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   330: aload_3
    //   331: astore_2
    //   332: goto -158 -> 174
    //   335: astore 4
    //   337: goto -189 -> 148
    //
    // Exception table:
    //   from	to	target	type
    //   85	112	300	java/io/IOException
    //   124	134	300	java/io/IOException
    //   142	148	300	java/io/IOException
    //   154	161	300	java/io/IOException
    //   176	224	300	java/io/IOException
    //   224	241	300	java/io/IOException
    //   245	282	300	java/io/IOException
    //   291	297	300	java/io/IOException
    //   142	148	335	java/lang/InterruptedException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.i
 * JD-Core Version:    0.6.2
 */