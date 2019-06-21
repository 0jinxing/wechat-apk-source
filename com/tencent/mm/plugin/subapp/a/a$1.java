package com.tencent.mm.plugin.subapp.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.apx;
import com.tencent.mm.protocal.protobuf.cmn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.LinkedList;

final class a$1
  implements ap.a
{
  a$1(a parama)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25220);
    boolean bool;
    if (this.ssJ.ssI < 0)
    {
      AppMethodBeat.o(25220);
      bool = false;
    }
    while (true)
    {
      return bool;
      apx localapx = (apx)this.ssJ.ehh.fsH.fsP;
      try
      {
        Object localObject1 = (cmn)localapx.wtX.get(this.ssJ.ssI);
        if ((localObject1 != null) && (((cmn)localObject1).xkr != null) && (((cmn)localObject1).xkr.getBuffer() != null) && (((cmn)localObject1).xkq != null) && (((cmn)localObject1).xkq.getBuffer() != null))
        {
          ab.d("MicroMsg.NetSceneGetVUserInfo", "onGYNetEnd ver:" + localapx.Version + " idx:" + this.ssJ.ssI + " id:" + Integer.toHexString(((cmn)localObject1).ID) + " size:" + ((cmn)localObject1).xkq.getILen() + " hdsize:" + ((cmn)localObject1).xkr.getILen());
          a.a(((cmn)localObject1).ID, true, ((cmn)localObject1).xkr.getBuffer().toByteArray());
          a.a(((cmn)localObject1).ID, false, ((cmn)localObject1).xkq.getBuffer().toByteArray());
        }
        localObject1 = this.ssJ;
        ((a)localObject1).ssI -= 1;
        AppMethodBeat.o(25220);
        bool = true;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.NetSceneGetVUserInfo", "get item :" + this.ssJ.ssI + " not Found");
          Object localObject2 = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.a.a.1
 * JD-Core Version:    0.6.2
 */