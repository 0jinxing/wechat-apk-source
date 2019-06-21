package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class l extends a
{
  protected final boolean HI(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 11032:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final boolean HK(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 11032:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26409);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11032));
    localArrayList.add(Integer.valueOf(11034));
    AppMethodBeat.o(26409);
    return localArrayList;
  }

  // ERROR //
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: sipush 26410
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_1
    //   7: tableswitch	default:+25 -> 32, 11032:+37->44, 11033:+25->32, 11034:+324->331
    //   33: newarray byte
    //   35: astore_2
    //   36: sipush 26410
    //   39: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: aload_2
    //   43: areturn
    //   44: new 46	com/tencent/mm/protocal/protobuf/cuk
    //   47: dup
    //   48: invokespecial 47	com/tencent/mm/protocal/protobuf/cuk:<init>	()V
    //   51: astore_3
    //   52: invokestatic 53	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   55: ldc 55
    //   57: iconst_0
    //   58: invokevirtual 61	com/tencent/mm/m/e:getInt	(Ljava/lang/String;I)I
    //   61: ifeq +35 -> 96
    //   64: aload_3
    //   65: ldc 62
    //   67: putfield 66	com/tencent/mm/protocal/protobuf/cuk:xcZ	I
    //   70: aload_3
    //   71: invokestatic 72	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   74: ldc 73
    //   76: invokevirtual 79	android/content/Context:getString	(I)Ljava/lang/String;
    //   79: putfield 83	com/tencent/mm/protocal/protobuf/cuk:xpw	Ljava/lang/String;
    //   82: aload_3
    //   83: invokevirtual 87	com/tencent/mm/protocal/protobuf/cuk:toByteArray	()[B
    //   86: astore_2
    //   87: sipush 26410
    //   90: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: goto -51 -> 42
    //   96: bipush 13
    //   98: iconst_0
    //   99: invokestatic 93	com/tencent/mm/plugin/wear/model/c/a:gn	(II)V
    //   102: bipush 15
    //   104: invokestatic 96	com/tencent/mm/plugin/wear/model/c/a:HH	(I)V
    //   107: new 98	com/tencent/mm/g/a/vg
    //   110: dup
    //   111: invokespecial 99	com/tencent/mm/g/a/vg:<init>	()V
    //   114: astore_2
    //   115: aload_2
    //   116: getfield 103	com/tencent/mm/g/a/vg:cSe	Lcom/tencent/mm/g/a/vg$a;
    //   119: iconst_3
    //   120: putfield 108	com/tencent/mm/g/a/vg$a:action	I
    //   123: getstatic 114	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   126: aload_2
    //   127: invokevirtual 118	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   130: pop
    //   131: aload_2
    //   132: getfield 122	com/tencent/mm/g/a/vg:cSf	Lcom/tencent/mm/g/a/vg$b;
    //   135: getfield 127	com/tencent/mm/g/a/vg$b:cSg	I
    //   138: tableswitch	default:+34 -> 172, 1:+37->175, 2:+151->289, 3:+109->247, 4:+130->268, 5:+172->310
    //   173: impdep2
    //   174: if_acmpne +11523 -> 11697
    //   177: putfield 66	com/tencent/mm/protocal/protobuf/cuk:xcZ	I
    //   180: aload_3
    //   181: ldc 129
    //   183: putfield 83	com/tencent/mm/protocal/protobuf/cuk:xpw	Ljava/lang/String;
    //   186: aload_3
    //   187: new 131	com/tencent/mm/bt/b
    //   190: dup
    //   191: aload_2
    //   192: getfield 122	com/tencent/mm/g/a/vg:cSf	Lcom/tencent/mm/g/a/vg$b;
    //   195: getfield 135	com/tencent/mm/g/a/vg$b:cSk	[B
    //   198: invokespecial 138	com/tencent/mm/bt/b:<init>	([B)V
    //   201: putfield 142	com/tencent/mm/protocal/protobuf/cuk:xqL	Lcom/tencent/mm/bt/b;
    //   204: aload_3
    //   205: new 131	com/tencent/mm/bt/b
    //   208: dup
    //   209: aload_2
    //   210: getfield 122	com/tencent/mm/g/a/vg:cSf	Lcom/tencent/mm/g/a/vg$b;
    //   213: getfield 145	com/tencent/mm/g/a/vg$b:cSl	[B
    //   216: invokespecial 138	com/tencent/mm/bt/b:<init>	([B)V
    //   219: putfield 148	com/tencent/mm/protocal/protobuf/cuk:xqM	Lcom/tencent/mm/bt/b;
    //   222: aload_3
    //   223: aload_2
    //   224: getfield 122	com/tencent/mm/g/a/vg:cSf	Lcom/tencent/mm/g/a/vg$b;
    //   227: getfield 151	com/tencent/mm/g/a/vg$b:cSm	Ljava/lang/String;
    //   230: putfield 154	com/tencent/mm/protocal/protobuf/cuk:xqN	Ljava/lang/String;
    //   233: aload_3
    //   234: aload_2
    //   235: getfield 122	com/tencent/mm/g/a/vg:cSf	Lcom/tencent/mm/g/a/vg$b;
    //   238: getfield 157	com/tencent/mm/g/a/vg$b:cSn	Ljava/lang/String;
    //   241: putfield 160	com/tencent/mm/protocal/protobuf/cuk:xqO	Ljava/lang/String;
    //   244: goto -162 -> 82
    //   247: aload_3
    //   248: ldc 161
    //   250: putfield 66	com/tencent/mm/protocal/protobuf/cuk:xcZ	I
    //   253: aload_3
    //   254: invokestatic 72	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   257: ldc 162
    //   259: invokevirtual 79	android/content/Context:getString	(I)Ljava/lang/String;
    //   262: putfield 83	com/tencent/mm/protocal/protobuf/cuk:xpw	Ljava/lang/String;
    //   265: goto -183 -> 82
    //   268: aload_3
    //   269: ldc 163
    //   271: putfield 66	com/tencent/mm/protocal/protobuf/cuk:xcZ	I
    //   274: aload_3
    //   275: invokestatic 72	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   278: ldc 164
    //   280: invokevirtual 79	android/content/Context:getString	(I)Ljava/lang/String;
    //   283: putfield 83	com/tencent/mm/protocal/protobuf/cuk:xpw	Ljava/lang/String;
    //   286: goto -204 -> 82
    //   289: aload_3
    //   290: ldc 165
    //   292: putfield 66	com/tencent/mm/protocal/protobuf/cuk:xcZ	I
    //   295: aload_3
    //   296: invokestatic 72	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   299: ldc 166
    //   301: invokevirtual 79	android/content/Context:getString	(I)Ljava/lang/String;
    //   304: putfield 83	com/tencent/mm/protocal/protobuf/cuk:xpw	Ljava/lang/String;
    //   307: goto -225 -> 82
    //   310: aload_3
    //   311: ldc 167
    //   313: putfield 66	com/tencent/mm/protocal/protobuf/cuk:xcZ	I
    //   316: aload_3
    //   317: invokestatic 72	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   320: ldc 168
    //   322: invokevirtual 79	android/content/Context:getString	(I)Ljava/lang/String;
    //   325: putfield 83	com/tencent/mm/protocal/protobuf/cuk:xpw	Ljava/lang/String;
    //   328: goto -246 -> 82
    //   331: new 170	com/tencent/mm/protocal/protobuf/cuv
    //   334: dup
    //   335: invokespecial 171	com/tencent/mm/protocal/protobuf/cuv:<init>	()V
    //   338: astore_3
    //   339: aload_3
    //   340: aload_2
    //   341: invokevirtual 175	com/tencent/mm/protocal/protobuf/cuv:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   344: pop
    //   345: invokestatic 72	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   348: aload_3
    //   349: getfield 178	com/tencent/mm/protocal/protobuf/cuv:xqS	Ljava/lang/String;
    //   352: aload_3
    //   353: getfield 181	com/tencent/mm/protocal/protobuf/cuv:xqT	Ljava/lang/String;
    //   356: invokestatic 187	com/tencent/mm/bp/d:H	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   359: goto -327 -> 32
    //   362: astore_2
    //   363: goto -331 -> 32
    //   366: astore_2
    //   367: goto -22 -> 345
    //
    // Exception table:
    //   from	to	target	type
    //   82	87	362	java/io/IOException
    //   339	345	366	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.l
 * JD-Core Version:    0.6.2
 */