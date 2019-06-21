package com.tencent.mm.plugin.multitalk.ui;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.q;

public final class b extends q
{
  private String chatroomName;
  private String[] gnP;
  private Cursor gnQ;
  private String query;

  public b(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, true, 0);
    AppMethodBeat.i(54177);
    this.chatroomName = paramString;
    paramMMBaseSelectContactUI = ((c)g.K(c.class)).XV().oe(this.chatroomName);
    if (paramMMBaseSelectContactUI != null)
      this.gnP = bo.ej(paramMMBaseSelectContactUI);
    AppMethodBeat.o(54177);
  }

  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(54178);
    ab.i("MicroMsg.multitalk.MultiTalkSelectSearchAdapter", "doSearch: %s", new Object[] { paramString });
    clearCache();
    this.query = paramString;
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    if ((!bo.isNullOrNil(this.query)) && (this.gnP != null))
      this.gnQ = ((j)g.K(j.class)).XM().a(this.gnP, "@all.chatroom", this.query, null, null);
    notifyDataSetChanged();
    ci(paramString, true);
    AppMethodBeat.o(54178);
  }

  public final void finish()
  {
    AppMethodBeat.i(54180);
    super.finish();
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    AppMethodBeat.o(54180);
  }

  public final int getCount()
  {
    AppMethodBeat.i(54181);
    int i;
    if (this.gnQ == null)
    {
      i = 0;
      AppMethodBeat.o(54181);
    }
    while (true)
    {
      return i;
      i = this.gnQ.getCount();
      AppMethodBeat.o(54181);
    }
  }

  public final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(54179);
    com.tencent.mm.plugin.multitalk.ui.widget.a locala = null;
    if (this.gnQ.moveToPosition(paramInt))
    {
      ad localad = new ad();
      localad.d(this.gnQ);
      locala = new com.tencent.mm.plugin.multitalk.ui.widget.a(paramInt);
      locala.ehM = localad;
      locala.zmW = clI();
      locala.query = this.query;
    }
    AppMethodBeat.o(54179);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.b
 * JD-Core Version:    0.6.2
 */