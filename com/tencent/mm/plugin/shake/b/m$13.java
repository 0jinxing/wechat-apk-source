package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class m$13
  implements bz.a
{
  m$13(m paramm)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(24489);
    m.cjZ();
    Object localObject;
    if (m.cjW() != null)
    {
      m.cjZ();
      m.cjW();
      localObject = aa.a(parama.eAB.vED);
      ab.v("MicroMsg.ShakeMsgMgr", "func[onResvMsg] content:".concat(String.valueOf(localObject)));
      if (bo.isNullOrNil((String)localObject))
      {
        ab.d("MicroMsg.ShakeMsgMgr", "func[onResvMsg] Msg content empty");
        AppMethodBeat.o(24489);
      }
    }
    while (true)
    {
      return;
      Map localMap = br.z((String)localObject, "sysmsg");
      int i = bo.getInt((String)localMap.get(".sysmsg.shake.$type"), 0);
      switch (i)
      {
      default:
        ab.d("MicroMsg.ShakeMsgMgr", "Unrecognized type :".concat(String.valueOf(i)));
        AppMethodBeat.o(24489);
        break;
      case 1:
        localObject = new f();
        i = bo.getInt((String)localMap.get(".sysmsg.shake.shaketv.msgtype"), 0);
        if (i == 0)
        {
          ((f)localObject).field_type = 1;
          ((f)localObject).field_subtype = i;
          ((f)localObject).field_svrid = parama.eAB.ptF;
          ((f)localObject).field_createtime = bo.anT();
          ((f)localObject).field_tag = ((String)localMap.get(".sysmsg.shake.shaketv.jumpurl"));
          ((f)localObject).field_status = 0;
          ((f)localObject).field_title = ((String)localMap.get(".sysmsg.shake.shaketv.title"));
          ((f)localObject).field_thumburl = ((String)localMap.get(".sysmsg.shake.shaketv.iconurl"));
          ((f)localObject).field_desc = ((String)localMap.get(".sysmsg.shake.shaketv.desc"));
          ((f)localObject).field_reserved1 = bo.nullAsNil((String)localMap.get(".sysmsg.shake.shaketv.pid"));
          m.cjT().a((f)localObject);
          AppMethodBeat.o(24489);
        }
        else
        {
          ab.w("MicroMsg.ShakeMsgMgr", "Unknown subType:".concat(String.valueOf(i)));
          AppMethodBeat.o(24489);
          continue;
          ab.w("MicroMsg.SubCoreShake", "func[onRecieveMsg] getShakeMsgMgr null");
          AppMethodBeat.o(24489);
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.m.13
 * JD-Core Version:    0.6.2
 */