package com.tencent.mm.plugin.fav.a;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.abm;
import com.tencent.mm.protocal.protobuf.abn;
import com.tencent.mm.protocal.protobuf.cg;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import java.util.Collection;
import java.util.LinkedList;

final class aj$a
{
  LinkedList<tb> mgm;
  ak mgn;

  aj$a(aj paramaj)
  {
    AppMethodBeat.i(102735);
    this.mgn = new ak("MicroMsg.Fav.NetSceneFavSync")
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(102734);
        Object localObject1;
        Object localObject2;
        if ((aj.a.this.mgm == null) || (aj.a.this.mgm.isEmpty()))
        {
          localObject1 = aj.a.this.mgo;
          paramAnonymousMessage = (abm)((aj)localObject1).ehh.fsG.fsP;
          localObject2 = (abn)((aj)localObject1).ehh.fsH.fsP;
          byte[] arrayOfByte = ((abn)localObject2).vTO.getBuffer().toByteArray();
          arrayOfByte = com.tencent.mm.protocal.aa.j(paramAnonymousMessage.vTO.getBuffer().toByteArray(), arrayOfByte);
          if ((arrayOfByte != null) && (arrayOfByte.length > 0))
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavConfigStorage().aV(arrayOfByte);
          paramAnonymousMessage.vTO = com.tencent.mm.platformtools.aa.ad(arrayOfByte);
          i = ((abn)localObject2).vQe;
          if ((paramAnonymousMessage.vTN & i) == 0)
          {
            ab.i("MicroMsg.Fav.NetSceneFavSync", "processEnd, minUpdateTime:%d", new Object[] { Long.valueOf(((aj)localObject1).mgk) });
            com.tencent.mm.kernel.g.RP().Ry().set(8217, Integer.valueOf(1));
            if (((aj)localObject1).mgk > 0L)
            {
              localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().v(((aj)localObject1).mgk, -1);
              if (((LinkedList)localObject2).size() > 0)
              {
                paramAnonymousMessage = (Message)localObject2;
                if (((LinkedList)localObject2).size() > 40)
                {
                  localObject2 = ((LinkedList)localObject2).subList(0, 40);
                  paramAnonymousMessage = new LinkedList();
                  paramAnonymousMessage.addAll((Collection)localObject2);
                }
                ((aj)localObject1).mgl = true;
                ab.i("MicroMsg.Fav.NetSceneFavSync", "processEnd, start batch get list size:%d", new Object[] { Integer.valueOf(paramAnonymousMessage.size()) });
                paramAnonymousMessage = new ah(paramAnonymousMessage);
                if (!com.tencent.mm.kernel.g.Rg().a(paramAnonymousMessage, 0))
                {
                  ab.w("MicroMsg.Fav.NetSceneFavSync", "do scene BatchGetFav fail");
                  ah.bve();
                }
              }
            }
            ((aj)localObject1).ehi.onSceneEnd(0, 0, "", (m)localObject1);
            AppMethodBeat.o(102734);
          }
          while (true)
          {
            return;
            ab.i("MicroMsg.Fav.NetSceneFavSync", "continue flag:%d", new Object[] { Integer.valueOf(((abn)localObject2).vQe) });
            ((aj)localObject1).a(((m)localObject1).ftf, ((aj)localObject1).ehi);
            AppMethodBeat.o(102734);
          }
        }
        paramAnonymousMessage = (tb)aj.a.this.mgm.getFirst();
        ab.d("MicroMsg.Fav.NetSceneFavSync", "cmdId = " + paramAnonymousMessage.wat);
        aj.a.this.mgm.removeFirst();
        switch (paramAnonymousMessage.wat)
        {
        default:
        case 200:
        }
        while (true)
        {
          AppMethodBeat.o(102734);
          break;
          localObject2 = com.tencent.mm.platformtools.aa.a(paramAnonymousMessage.wau);
          if (localObject2 == null)
          {
            ab.e("MicroMsg.Fav.NetSceneFavSync", "docmd: no protobuf found.");
            sendEmptyMessage(0);
            AppMethodBeat.o(102734);
            break;
          }
          paramAnonymousMessage = aj.a.this.mgo;
          if (localObject2 != null);
          try
          {
            i = localObject2.length;
            label506: ab.i("MicroMsg.Fav.NetSceneFavSync", "processAddItem bufSize=%d", new Object[] { Integer.valueOf(i) });
            localObject1 = new com/tencent/mm/protocal/protobuf/cg;
            ((cg)localObject1).<init>();
            localObject2 = (cg)((cg)localObject1).parseFrom((byte[])localObject2);
            if (localObject2 == null)
              ab.e("MicroMsg.Fav.NetSceneFavSync", "klem processAddItem favitem null");
            while (true)
            {
              sendEmptyMessage(0);
              break;
              i = 0;
              break label506;
              ab.i("MicroMsg.Fav.NetSceneFavSync", "klem processAddItem id:%d, flag:%d, updateSeq:%d, updateTime:%d", new Object[] { Integer.valueOf(((cg)localObject2).vEp), Integer.valueOf(((cg)localObject2).vEq), Integer.valueOf(((cg)localObject2).vEs), Integer.valueOf(((cg)localObject2).vEr) });
              if ((((cg)localObject2).vEq & 0x1) == 0)
                break label679;
              b.a(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(((cg)localObject2).vEp), false, null);
            }
          }
          catch (Exception paramAnonymousMessage)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.Fav.NetSceneFavSync", paramAnonymousMessage, "", new Object[0]);
            label679: if ((paramAnonymousMessage.mgk < 0L) || (((cg)localObject2).vEr < paramAnonymousMessage.mgk))
              paramAnonymousMessage.mgk = ((cg)localObject2).vEr;
            paramAnonymousMessage = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(((cg)localObject2).vEp);
            if (paramAnonymousMessage != null)
              break label886;
          }
        }
        paramAnonymousMessage = new com/tencent/mm/plugin/fav/a/g;
        paramAnonymousMessage.<init>();
        paramAnonymousMessage.field_updateTime = (((cg)localObject2).vEr * 1000L);
        label886: for (int i = 1; ; i = 0)
        {
          paramAnonymousMessage.field_id = ((cg)localObject2).vEp;
          paramAnonymousMessage.field_updateSeq = ((cg)localObject2).vEs;
          if (paramAnonymousMessage.field_localSeq == ((cg)localObject2).vEs)
            paramAnonymousMessage.field_updateTime = (((cg)localObject2).vEr * 1000L);
          paramAnonymousMessage.field_flag = ((cg)localObject2).vEq;
          paramAnonymousMessage.field_type = ((cg)localObject2).jCt;
          if (i != 0)
          {
            paramAnonymousMessage.field_localId = System.currentTimeMillis();
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().y(paramAnonymousMessage);
            break;
          }
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramAnonymousMessage, new String[] { "localId" });
          break;
        }
      }
    };
    AppMethodBeat.o(102735);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.aj.a
 * JD-Core Version:    0.6.2
 */