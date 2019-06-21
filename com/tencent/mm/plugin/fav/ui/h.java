package com.tencent.mm.plugin.fav.ui;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
{
  static void E(com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74040);
    String str = r.Yz();
    abl localabl = new abl();
    localabl.alD(str);
    localabl.alE(str);
    localabl.LN(paramg.field_sourceType);
    localabl.ml(bo.anU());
    paramg.field_favProto.a(localabl);
    paramg.field_fromUser = localabl.cEV;
    paramg.field_toUser = localabl.toUser;
    AppMethodBeat.o(74040);
  }

  public static com.tencent.mm.plugin.fav.a.g a(LinkedList<aar> paramLinkedList, long paramLong)
  {
    AppMethodBeat.i(74036);
    Object localObject1 = null;
    if (paramLong != -1L)
    {
      localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = iJ(paramLong);
      ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.wiv.clear();
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new com.tencent.mm.plugin.fav.a.g();
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_type = 18;
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_sourceType = 6;
      E((com.tencent.mm.plugin.fav.a.g)localObject2);
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.LM(1);
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.LL(127);
    }
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime = bo.anT();
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_updateTime = bo.anU();
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.mk(((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime);
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.wit.ml(bo.anU());
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.aE(paramLinkedList);
    AppMethodBeat.o(74036);
    return localObject2;
  }

  public static boolean a(String paramString, LinkedList<aar> paramLinkedList, long paramLong)
  {
    AppMethodBeat.i(74035);
    boolean bool;
    if (paramString.length() == 0)
    {
      ab.e("MicroMsg.FavPostLogic", "postNote null");
      bool = false;
      AppMethodBeat.o(74035);
      return bool;
    }
    if (-1L == paramLong);
    for (paramString = a(paramLinkedList, paramLong); ; paramString = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong))
    {
      b.B(paramString);
      bool = true;
      AppMethodBeat.o(74035);
      break;
    }
  }

  // ERROR //
  private static List<String> bN(List<String> paramList)
  {
    // Byte code:
    //   0: ldc 181
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: invokeinterface 186 1 0
    //   15: ifne +10 -> 25
    //   18: ldc 181
    //   20: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: aload_0
    //   24: areturn
    //   25: new 188	java/util/ArrayList
    //   28: dup
    //   29: invokespecial 189	java/util/ArrayList:<init>	()V
    //   32: astore_1
    //   33: aload_0
    //   34: invokeinterface 193 1 0
    //   39: astore_2
    //   40: aload_2
    //   41: invokeinterface 199 1 0
    //   46: ifeq +83 -> 129
    //   49: aload_2
    //   50: invokeinterface 203 1 0
    //   55: checkcast 154	java/lang/String
    //   58: astore_3
    //   59: aconst_null
    //   60: astore 4
    //   62: aload_3
    //   63: invokestatic 209	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   66: astore_0
    //   67: aload_0
    //   68: ifnonnull +10 -> 78
    //   71: aload_0
    //   72: invokestatic 213	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   75: goto -35 -> 40
    //   78: aload_0
    //   79: astore 4
    //   81: aload_3
    //   82: invokestatic 219	com/tencent/mm/sdk/platformtools/r:amn	(Ljava/lang/String;)Z
    //   85: ifeq +14 -> 99
    //   88: aload_0
    //   89: astore 4
    //   91: aload_1
    //   92: aload_3
    //   93: invokeinterface 223 2 0
    //   98: pop
    //   99: aload_0
    //   100: invokestatic 213	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   103: goto -63 -> 40
    //   106: astore_0
    //   107: aconst_null
    //   108: astore_0
    //   109: aload_0
    //   110: invokestatic 213	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   113: goto -73 -> 40
    //   116: astore_0
    //   117: aload 4
    //   119: invokestatic 213	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   122: ldc 181
    //   124: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: aload_0
    //   128: athrow
    //   129: ldc 181
    //   131: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   134: aload_1
    //   135: astore_0
    //   136: goto -113 -> 23
    //   139: astore 4
    //   141: goto -32 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   62	67	106	java/lang/Exception
    //   62	67	116	finally
    //   81	88	116	finally
    //   91	99	116	finally
    //   81	88	139	java/lang/Exception
    //   91	99	139	java/lang/Exception
  }

  public static boolean bO(List<String> paramList)
  {
    AppMethodBeat.i(74039);
    paramList = bN(paramList);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.e("MicroMsg.FavPostLogic", "postImgs path null");
      AppMethodBeat.o(74039);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      com.tencent.mm.plugin.fav.a.g localg = new com.tencent.mm.plugin.fav.a.g();
      localg.field_type = 2;
      localg.field_sourceType = 6;
      E(localg);
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        aar localaar = new aar();
        localaar.akV(str);
        localaar.akU(com.tencent.mm.plugin.fav.a.b.cf(localaar.toString(), 2));
        d.c(str, 150, 150, Bitmap.CompressFormat.JPEG, 90, com.tencent.mm.plugin.fav.a.b.c(localaar));
        localaar.akW(com.tencent.mm.plugin.fav.a.b.c(localaar));
        localaar.LE(2);
        localg.field_favProto.wiv.add(localaar);
      }
      b.B(localg);
      com.tencent.mm.plugin.report.service.h.pYm.e(10648, new Object[] { Integer.valueOf(2), Integer.valueOf(paramList.size()) });
      AppMethodBeat.o(74039);
    }
  }

  private static com.tencent.mm.plugin.fav.a.g iJ(long paramLong)
  {
    AppMethodBeat.i(74037);
    com.tencent.mm.plugin.fav.a.g localg = new com.tencent.mm.plugin.fav.a.g();
    localg.field_type = 18;
    localg.field_sourceType = 6;
    String str = r.Yz();
    abl localabl = new abl();
    localabl.alD(str);
    localabl.alE(str);
    localabl.LN(localg.field_sourceType);
    localabl.ml(bo.anU());
    localg.field_favProto.a(localabl);
    localg.field_fromUser = localabl.cEV;
    localg.field_toUser = localabl.toUser;
    localg.field_favProto.LM(1);
    localg.field_favProto.LL(127);
    localg.field_edittime = bo.anT();
    localg.field_updateTime = bo.anU();
    localg.field_favProto.mk(localg.field_edittime);
    localg.field_favProto.wit.ml(bo.anU());
    localg.field_itemStatus = 9;
    localg.field_localId = paramLong;
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().y(localg);
    AppMethodBeat.o(74037);
    return localg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.h
 * JD-Core Version:    0.6.2
 */