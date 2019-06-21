package com.tencent.mm.plugin.subapp.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.apw;
import com.tencent.mm.protocal.protobuf.apx;
import com.tencent.mm.protocal.protobuf.cmn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

public final class a extends m
  implements k
{
  final b ehh;
  private f ehi;
  private ap frk;
  int ssI;

  public a()
  {
    AppMethodBeat.i(25221);
    this.ssI = 0;
    this.frk = new ap(new a.1(this), true);
    aw.ZK();
    int j = bo.h((Integer)c.Ry().get(66052, null));
    if (ao.a.flw.kA(j))
    {
      aw.ZK();
      i = bo.h((Integer)c.Ry().get(66053, null));
    }
    Object localObject = new StringBuilder("init: allfileid:").append(Integer.toBinaryString(j)).append(" inver:");
    aw.ZK();
    ab.d("MicroMsg.NetSceneGetVUserInfo", bo.h((Integer)c.Ry().get(66053, null)) + " reqver:" + i);
    localObject = new b.a();
    ((b.a)localObject).fsJ = new apw();
    ((b.a)localObject).fsK = new apx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getvuserinfo";
    ((b.a)localObject).fsI = 167;
    ((b.a)localObject).fsL = 60;
    ((b.a)localObject).fsM = 1000000060;
    this.ehh = ((b.a)localObject).acD();
    ((apw)this.ehh.fsG.fsP).Version = i;
    AppMethodBeat.o(25221);
  }

  // ERROR //
  static boolean a(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: sipush 25224
    //   5: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 174	java/io/FileOutputStream
    //   11: astore 4
    //   13: aload 4
    //   15: getstatic 71	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   18: iload_0
    //   19: iload_1
    //   20: invokeinterface 178 3 0
    //   25: invokespecial 179	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   28: aload 4
    //   30: astore 5
    //   32: aload 4
    //   34: aload_2
    //   35: invokevirtual 183	java/io/FileOutputStream:write	([B)V
    //   38: aload 4
    //   40: astore 5
    //   42: aload 4
    //   44: invokevirtual 186	java/io/FileOutputStream:close	()V
    //   47: aload 4
    //   49: invokevirtual 186	java/io/FileOutputStream:close	()V
    //   52: iconst_1
    //   53: istore_1
    //   54: sipush 25224
    //   57: invokestatic 167	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: iload_1
    //   61: ireturn
    //   62: astore 6
    //   64: aconst_null
    //   65: astore_2
    //   66: aload_2
    //   67: astore 5
    //   69: ldc 97
    //   71: aload 6
    //   73: ldc 188
    //   75: iconst_0
    //   76: anewarray 190	java/lang/Object
    //   79: invokestatic 194	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   82: aload_2
    //   83: ifnull +7 -> 90
    //   86: aload_2
    //   87: invokevirtual 186	java/io/FileOutputStream:close	()V
    //   90: sipush 25224
    //   93: invokestatic 167	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: iload_3
    //   97: istore_1
    //   98: goto -38 -> 60
    //   101: astore_2
    //   102: aconst_null
    //   103: astore 5
    //   105: aload 5
    //   107: ifnull +8 -> 115
    //   110: aload 5
    //   112: invokevirtual 186	java/io/FileOutputStream:close	()V
    //   115: sipush 25224
    //   118: invokestatic 167	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: aload_2
    //   122: athrow
    //   123: astore_2
    //   124: goto -72 -> 52
    //   127: astore_2
    //   128: goto -38 -> 90
    //   131: astore 5
    //   133: goto -18 -> 115
    //   136: astore_2
    //   137: goto -32 -> 105
    //   140: astore 6
    //   142: aload 4
    //   144: astore_2
    //   145: goto -79 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   8	28	62	java/lang/Exception
    //   8	28	101	finally
    //   47	52	123	java/lang/Exception
    //   86	90	127	java/lang/Exception
    //   110	115	131	java/lang/Exception
    //   32	38	136	finally
    //   42	47	136	finally
    //   69	82	136	finally
    //   32	38	140	java/lang/Exception
    //   42	47	140	java/lang/Exception
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25222);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25222);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25223);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetVUserInfo", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25223);
    }
    while (true)
    {
      return;
      paramq = (apx)((b)paramq).fsH.fsP;
      paramArrayOfByte = new StringBuilder("onGYNetEnd new version:").append(paramq.Version).append(" old version:");
      aw.ZK();
      ab.d("MicroMsg.NetSceneGetVUserInfo", bo.h((Integer)c.Ry().get(66053, null)) + " Count:" + paramq.wtX.size());
      aw.ZK();
      c.Ry().set(66053, Integer.valueOf(paramq.Version));
      if (paramq.wtX.size() <= 0)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(25223);
      }
      else
      {
        int i = 0;
        paramInt1 = 0;
        while (i < paramq.wtX.size())
        {
          int j = ((cmn)paramq.wtX.get(i)).ID;
          i++;
          paramInt1 |= j;
        }
        aw.ZK();
        c.Ry().set(66052, Integer.valueOf(paramInt1));
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        this.ssI = (paramq.wtX.size() - 1);
        this.frk.ae(50L, 50L);
        AppMethodBeat.o(25223);
      }
    }
  }

  public final int getType()
  {
    return 167;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.a.a
 * JD-Core Version:    0.6.2
 */