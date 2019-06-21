package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.lx;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.g.a.so;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class o$e$1
  implements o.b
{
  o$e$1(o.e parame, bek parambek, int paramInt)
  {
  }

  public final boolean lO(int paramInt)
  {
    AppMethodBeat.i(58404);
    g.RQ();
    g.RP().Ry().set(8196, Long.valueOf(this.fJy.vQe));
    boolean bool;
    if ((this.fJy.vQe & this.fJA.fHJ) != 0)
    {
      bool = true;
      ab.i("MicroMsg.SyncService", "%s onFinishCmd ContinueFlag:%s canCont:%s SNSSYNCKEY:%s StorySyncKey:%s  NetSceneMinSync.this.selecto:%s", new Object[] { this.fJA, Integer.valueOf(this.fJy.vQe), Boolean.valueOf(bool), Integer.valueOf(this.fJy.vQe & 0x100), Integer.valueOf(this.fJy.vQe & 0x80), Integer.valueOf(this.fJA.fHJ) });
      Object localObject;
      if ((!bool) && ((this.fJy.vQe & 0x100) != 0))
      {
        localObject = new rv();
        ((rv)localObject).cNO.cvp = 3;
        a.xxA.m((b)localObject);
      }
      if ((!bool) && ((this.fJy.vQe & 0x200000) != 0))
      {
        localObject = new lx();
        a.xxA.m((b)localObject);
      }
      if ((!bool) && ((this.fJy.vQe & 0x80) != 0))
      {
        localObject = new so();
        a.xxA.m((b)localObject);
      }
      if (bool)
      {
        if ((paramInt != 0) || (!this.fJA.fJw))
          break label340;
        ab.w("MicroMsg.SyncService", "%s onFinishCmd is continue Sync , but no Cmd , I will not continue again.", new Object[] { this.fJA });
      }
    }
    while (true)
    {
      this.fJA.fJv.onSceneEnd(0, 0, "", this.fJA);
      o.a(this.fJA.fJl, this.fJA);
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcReceiveMsgEnable, this.fJz);
      AppMethodBeat.o(58404);
      return true;
      bool = false;
      break;
      label340: o.a(this.fJA.fJl, this.fJA.scene, this.fJA.fHJ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.e.1
 * JD-Core Version:    0.6.2
 */