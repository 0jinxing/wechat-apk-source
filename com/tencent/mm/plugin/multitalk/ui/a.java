package com.tencent.mm.plugin.multitalk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.List;

public final class a extends o
{
  private String chatroomName;
  private List<String> gnO;

  public a(l paraml, String paramString)
  {
    super(paraml, null, true, true);
    AppMethodBeat.i(54174);
    this.chatroomName = paramString;
    ab.i("MicroMsg.multitalk.MultiTalkSelectInitAdapter", "resetData");
    this.gnO = ((c)g.K(c.class)).XV().oe(this.chatroomName);
    if (this.gnO == null)
      this.gnO = new ArrayList();
    AppMethodBeat.o(54174);
  }

  public final int getCount()
  {
    AppMethodBeat.i(54176);
    int i = this.gnO.size();
    AppMethodBeat.o(54176);
    return i;
  }

  public final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(54175);
    Object localObject = (String)this.gnO.get(paramInt);
    ad localad = ((j)g.K(j.class)).XM().aoO((String)localObject);
    localObject = new com.tencent.mm.plugin.multitalk.ui.widget.a(paramInt);
    ((com.tencent.mm.ui.contact.a.a)localObject).ehM = localad;
    ((com.tencent.mm.ui.contact.a.a)localObject).zmW = clI();
    AppMethodBeat.o(54175);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.a
 * JD-Core Version:    0.6.2
 */