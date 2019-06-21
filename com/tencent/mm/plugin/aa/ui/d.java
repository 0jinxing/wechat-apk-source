package com.tencent.mm.plugin.aa.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.aa.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import java.util.List;

public final class d extends o
{
  private String chatroomName;
  private List<String> gnO;

  public d(l paraml, String paramString)
  {
    super(paraml, null, true, true);
    AppMethodBeat.i(40767);
    this.chatroomName = paramString;
    ab.i("MicroMsg.AASelectInitAdapter", "resetData");
    this.gnO = h.vE(this.chatroomName);
    AppMethodBeat.o(40767);
  }

  public final int getCount()
  {
    AppMethodBeat.i(40769);
    int i = this.gnO.size();
    AppMethodBeat.o(40769);
    return i;
  }

  public final a mP(int paramInt)
  {
    AppMethodBeat.i(40768);
    Object localObject = (String)this.gnO.get(paramInt);
    g.RQ();
    localObject = ((j)g.K(j.class)).XM().aoO((String)localObject);
    c localc = new c(paramInt);
    localc.cuP = this.chatroomName;
    localc.ehM = ((ad)localObject);
    localc.zmW = true;
    AppMethodBeat.o(40768);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.d
 * JD-Core Version:    0.6.2
 */