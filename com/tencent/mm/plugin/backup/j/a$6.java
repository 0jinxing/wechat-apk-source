package com.tencent.mm.plugin.backup.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class a$6
  implements bz.a
{
  a$6(a parama)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(18096);
    ab.i("MicroMsg.BackupCore.MsgSynchronize", "appMsgListener onreceive appmsg");
    parama = aa.a(parama.eAB.vED);
    Object localObject = br.z(parama, "appmsg");
    ab.d("MicroMsg.BackupCore.MsgSynchronize", "BackupCore msgcontent:%s", new Object[] { parama });
    if (((String)((Map)localObject).get(".appmsg.action")).equals("phone"))
    {
      ab.i("MicroMsg.BackupCore.MsgSynchronize", "this appmsg is from phone, ignore.");
      AppMethodBeat.o(18096);
    }
    while (true)
    {
      return;
      parama = (String)((Map)localObject).get(".appmsg.messageaction");
      String str = (String)((Map)localObject).get(".appmsg.extinfo");
      localObject = ((String)((Map)localObject).get(".appmsg.appattach.aeskey")).getBytes();
      aw.RS().aa(new a.6.1(this, parama, str, (byte[])localObject));
      AppMethodBeat.o(18096);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.j.a.6
 * JD-Core Version:    0.6.2
 */