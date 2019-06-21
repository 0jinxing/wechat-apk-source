package com.tencent.mm.plugin.card.model.a;

import a.f.b.j;
import a.k.d;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.nv;
import com.tencent.mm.protocal.protobuf.nw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.nio.charset.Charset;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CardSnapshotMgr$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "loadHomePageSnapshot", "", "storeList", "Lcom/tencent/mm/protocal/protobuf/CardHomePageStoreList;", "underList", "Lcom/tencent/mm/protocal/protobuf/CardHomePageUnderList;", "loadInvalidTicketPageSnapshot", "", "invalidTicketList", "Lcom/tencent/mm/protocal/protobuf/PageTicketList;", "loadTicketPageSnapshot", "jumpList", "Lcom/tencent/mm/protocal/protobuf/PageTicketJumpList;", "ticketList", "licenseList", "saveHomePageSnapshot", "saveInvalidTicketPageSnapshot", "saveTicketPageSnapshot", "plugin-card_release"})
public final class a$a
{
  public static boolean a(nv paramnv, nw paramnw)
  {
    boolean bool1 = true;
    AppMethodBeat.i(89152);
    j.p(paramnv, "storeList");
    j.p(paramnw, "underList");
    ab.i(a.access$getTAG$cp(), "load home page snapshot");
    boolean bool2 = false;
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    String str = (String)((e)localObject).Ry().i(ac.a.xWe);
    if (str != null)
    {
      localObject = d.ISO_8859_1;
      if (str == null)
      {
        paramnv = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(89152);
        throw paramnv;
      }
      localObject = str.getBytes((Charset)localObject);
      j.o(localObject, "(this as java.lang.String).getBytes(charset)");
      paramnv.parseFrom((byte[])localObject);
      bool2 = true;
    }
    paramnv = g.RP();
    j.o(paramnv, "MMKernel.storage()");
    paramnv = (String)paramnv.Ry().i(ac.a.xWf);
    if (paramnv != null)
    {
      localObject = d.ISO_8859_1;
      if (paramnv == null)
      {
        paramnv = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(89152);
        throw paramnv;
      }
      paramnv = paramnv.getBytes((Charset)localObject);
      j.o(paramnv, "(this as java.lang.String).getBytes(charset)");
      paramnw.parseFrom(paramnv);
      bool2 = bool1;
    }
    while (true)
    {
      AppMethodBeat.o(89152);
      return bool2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.a.a
 * JD-Core Version:    0.6.2
 */