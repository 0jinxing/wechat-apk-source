package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.bt.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.i.x;
import com.tencent.mm.plugin.backup.i.y;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.protocal.protobuf.gv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.IOException;
import java.util.LinkedList;

public final class c extends com.tencent.mm.plugin.backup.g.b
{
  private static int progress;
  private String filePath;
  private int frO;
  private com.tencent.mm.ai.g jAi;
  private byte[] jAj;
  public x jxp;
  private y jxq;
  private byte[] key;
  private int offset;
  private int start;
  private int type;

  public c(String paramString1, int paramInt, LinkedList<gu> paramLinkedList, String paramString2, com.tencent.mm.ai.g paramg, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17883);
    this.jxp = new x();
    this.jxq = new y();
    this.jAi = null;
    this.start = 0;
    this.offset = 0;
    this.frO = 0;
    this.jxp.jCx = paramString1;
    this.jxp.jCy = paramInt;
    this.type = paramInt;
    if (paramInt == 1)
    {
      paramString1 = new gv();
      paramString1.jBw = paramLinkedList;
      paramString1.jBv = paramLinkedList.size();
    }
    while (true)
    {
      try
      {
        this.jAj = paramString1.toByteArray();
        this.frO = this.jAj.length;
        paramInt = this.frO;
        this.jxp.jCz = (16 - paramInt % 16 + this.frO);
        ab.i("MicroMsg.BakSceneDataPush", "BakSceneDataPush init:%s  type:%d, localTotalLen:%d, reqDataSize:%d", new Object[] { this.jxp.jCx, Integer.valueOf(this.jxp.jCy), Integer.valueOf(this.frO), Integer.valueOf(this.jxp.jCz) });
        this.jAi = paramg;
        this.key = paramArrayOfByte;
        AppMethodBeat.o(17883);
        return;
      }
      catch (IOException paramString1)
      {
        ab.e("MicroMsg.BakSceneDataPush", "backList to buffer error");
        ab.printErrStackTrace("MicroMsg.BakSceneDataPush", paramString1, "", new Object[0]);
        continue;
      }
      this.filePath = paramString2;
      this.frO = e.cs(paramString2);
    }
  }

  public static void setProgress(int paramInt)
  {
    AppMethodBeat.i(17884);
    ab.i("MicroMsg.BakSceneDataPush", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
    AppMethodBeat.o(17884);
  }

  public final a aTS()
  {
    return this.jxq;
  }

  public final a aTT()
  {
    return this.jxp;
  }

  public final boolean aUc()
  {
    AppMethodBeat.i(17885);
    Object localObject1 = null;
    Object localObject2;
    boolean bool;
    label72: int j;
    if (this.type == 1)
    {
      i = this.frO;
      localObject1 = this.jAj;
      this.start = this.offset;
      this.offset = (i + this.start);
      localObject2 = localObject1;
      if (this.key != null)
      {
        localObject2 = this.key;
        if (this.offset != this.frO)
          break label501;
        bool = true;
        localObject2 = AesEcb.aesCryptEcb((byte[])localObject1, (byte[])localObject2, true, bool);
      }
      this.jxp.jCA = this.start;
      localObject1 = this.jxp;
      j = this.start;
      if (localObject2 != null)
        break label507;
    }
    label462: label501: label507: for (int i = 0; ; i = localObject2.length)
    {
      ((x)localObject1).jCB = (i + j);
      this.jxp.jBi = new com.tencent.mm.bt.b((byte[])localObject2);
      this.jxp.jCD = progress;
      ab.i("MicroMsg.BakSceneDataPush", "doSecne %s---total:%d, start:%d, offset:%d, data.len:%d", new Object[] { this.jxp.jCx, Integer.valueOf(this.frO), Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(this.jxp.jCB) });
      bool = super.aUc();
      AppMethodBeat.o(17885);
      return bool;
      long l;
      int k;
      if (this.frO - this.offset > 524288L)
      {
        l = 524288L;
        k = (int)l;
        i = 3;
      }
      while (true)
      {
        j = i - 1;
        if ((i <= 0) || (localObject1 != null))
          break label462;
        if (!bo.isNullOrNil(this.filePath))
        {
          localObject1 = this.filePath;
          aw.ZK();
          if (((String)localObject1).startsWith(com.tencent.mm.model.c.Yb()))
          {
            localObject1 = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
            ab.i("MicroMsg.BakSceneDataPush", "md5:%s", new Object[] { localObject1 });
            localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd((String)localObject1);
            if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB))
            {
              localObject2 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l((EmojiInfo)localObject1);
              localObject1 = new byte[k];
              System.arraycopy(localObject2, this.offset, localObject1, 0, k);
              i = j;
              continue;
              l = this.frO - this.offset;
              break;
            }
            localObject1 = e.e(this.filePath, this.offset, k);
            i = j;
            continue;
          }
        }
        localObject1 = e.e(this.filePath, this.offset, k);
        i = j;
      }
      if (localObject1 == null)
        ab.e("MicroMsg.BakSceneDataPush", "read file error, offset%d, len:%d", new Object[] { Integer.valueOf(this.offset), Integer.valueOf(k) });
      i = k;
      break;
      bool = false;
      break label72;
    }
  }

  public final int getType()
  {
    return 5;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17886);
    ab.i("MicroMsg.BakSceneDataPush", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.jxq.jCx, Integer.valueOf(this.jxq.jCy), Integer.valueOf(this.jxq.jCA), Integer.valueOf(this.jxq.jCB), Integer.valueOf(this.jxq.jBT) });
    if (this.jxq.jBT != 0)
    {
      ab.e("MicroMsg.BakSceneDataPush", "status:%d", new Object[] { Integer.valueOf(this.jxq.jBT) });
      l(4, this.jxq.jBT, "error");
      AppMethodBeat.o(17886);
    }
    while (true)
    {
      return;
      this.jAi.a(this.jxp.jCB - this.jxp.jCA, this.frO, this);
      if (this.offset == this.frO)
      {
        ab.i("MicroMsg.BakSceneDataPush", "back complete: %s,  %d", new Object[] { this.jxp.jCx, Integer.valueOf(this.frO) });
        l(0, 0, "success");
        AppMethodBeat.o(17886);
      }
      else
      {
        aUc();
        AppMethodBeat.o(17886);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.c.c
 * JD-Core Version:    0.6.2
 */