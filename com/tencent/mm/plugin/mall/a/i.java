package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class i
{
  private static boolean okX;
  private static List<i.a> okY;

  static
  {
    AppMethodBeat.i(43115);
    okX = false;
    okY = new ArrayList();
    AppMethodBeat.o(43115);
  }

  public static void a(i.a parama)
  {
    AppMethodBeat.i(43113);
    ab.d("MicroMsg.QueryWeChatWalletManager", "remove ret: %s", new Object[] { Boolean.valueOf(okY.remove(parama)) });
    AppMethodBeat.o(43113);
  }

  // ERROR //
  public static void a(i.a parama, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 64
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 40
    //   7: ldc 66
    //   9: iconst_1
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: iload_1
    //   16: invokestatic 54	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   19: aastore
    //   20: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: invokestatic 73	com/tencent/mm/kernel/g:RK	()Z
    //   26: ifne +16 -> 42
    //   29: ldc 40
    //   31: ldc 75
    //   33: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: ldc 64
    //   38: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: return
    //   42: invokestatic 83	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   45: invokevirtual 89	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   48: getstatic 95	com/tencent/mm/storage/ac$a:xWr	Lcom/tencent/mm/storage/ac$a;
    //   51: aconst_null
    //   52: invokevirtual 101	com/tencent/mm/storage/z:get	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   55: checkcast 103	java/lang/String
    //   58: astore_2
    //   59: aload_2
    //   60: invokestatic 109	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   63: ifne +158 -> 221
    //   66: new 111	com/tencent/mm/protocal/protobuf/cge
    //   69: astore_3
    //   70: aload_3
    //   71: invokespecial 112	com/tencent/mm/protocal/protobuf/cge:<init>	()V
    //   74: aload_3
    //   75: aload_2
    //   76: getstatic 118	org/apache/commons/a/a:ISO_8859_1	Ljava/nio/charset/Charset;
    //   79: invokevirtual 122	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   82: invokevirtual 126	com/tencent/mm/protocal/protobuf/cge:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   85: pop
    //   86: aload_0
    //   87: ifnull +10 -> 97
    //   90: aload_0
    //   91: aload_3
    //   92: invokeinterface 129 2 0
    //   97: iconst_1
    //   98: istore 4
    //   100: iload 4
    //   102: ifeq +7 -> 109
    //   105: iload_1
    //   106: ifeq +62 -> 168
    //   109: aload_0
    //   110: ifnull +25 -> 135
    //   113: getstatic 29	com/tencent/mm/plugin/mall/a/i:okY	Ljava/util/List;
    //   116: aload_0
    //   117: invokeinterface 132 2 0
    //   122: ifne +13 -> 135
    //   125: getstatic 29	com/tencent/mm/plugin/mall/a/i:okY	Ljava/util/List;
    //   128: aload_0
    //   129: invokeinterface 135 2 0
    //   134: pop
    //   135: getstatic 22	com/tencent/mm/plugin/mall/a/i:okX	Z
    //   138: ifeq +57 -> 195
    //   141: ldc 40
    //   143: ldc 137
    //   145: invokestatic 139	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: iload 4
    //   150: ifne +18 -> 168
    //   153: iload_1
    //   154: ifne +14 -> 168
    //   157: getstatic 145	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   160: ldc2_w 146
    //   163: lconst_1
    //   164: lconst_1
    //   165: invokevirtual 151	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   168: ldc 64
    //   170: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -132 -> 41
    //   176: astore_2
    //   177: iconst_0
    //   178: istore 4
    //   180: ldc 40
    //   182: aload_2
    //   183: ldc 153
    //   185: iconst_0
    //   186: anewarray 4	java/lang/Object
    //   189: invokestatic 157	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: goto -92 -> 100
    //   195: iconst_1
    //   196: putstatic 22	com/tencent/mm/plugin/mall/a/i:okX	Z
    //   199: ldc 159
    //   201: new 161	com/tencent/mm/plugin/mall/a/i$1
    //   204: dup
    //   205: invokespecial 162	com/tencent/mm/plugin/mall/a/i$1:<init>	()V
    //   208: invokestatic 167	com/tencent/mm/wallet_core/ui/e:a	(Ljava/lang/String;Lcom/tencent/mm/wallet_core/ui/e$b;)V
    //   211: goto -63 -> 148
    //   214: astore_2
    //   215: iconst_1
    //   216: istore 4
    //   218: goto -38 -> 180
    //   221: iconst_0
    //   222: istore 4
    //   224: goto -124 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   66	86	176	java/io/IOException
    //   90	97	214	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.i
 * JD-Core Version:    0.6.2
 */