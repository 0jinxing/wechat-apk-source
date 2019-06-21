package com.tencent.mm.plugin.aa.ui;

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
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.q;

public final class e extends q
{
  private String chatroomName;
  private String[] gnP;
  private Cursor gnQ;
  private String query;

  public e(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, true, 0);
    AppMethodBeat.i(40770);
    this.chatroomName = paramString;
    paramMMBaseSelectContactUI = ((c)g.K(c.class)).XV().oe(this.chatroomName);
    if (paramMMBaseSelectContactUI != null)
      this.gnP = bo.ej(paramMMBaseSelectContactUI);
    AppMethodBeat.o(40770);
  }

  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(40771);
    ab.i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", new Object[] { paramString });
    clearCache();
    this.query = paramString;
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    if ((!bo.isNullOrNil(this.query)) && (this.gnP != null))
    {
      g.RQ();
      this.gnQ = ((j)g.K(j.class)).XM().a(this.gnP, "@all.chatroom", this.query, null, null);
    }
    notifyDataSetChanged();
    ci(paramString, true);
    AppMethodBeat.o(40771);
  }

  public final void finish()
  {
    AppMethodBeat.i(40773);
    super.finish();
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    AppMethodBeat.o(40773);
  }

  public final int getCount()
  {
    AppMethodBeat.i(40774);
    int i;
    if (this.gnQ == null)
    {
      i = 0;
      AppMethodBeat.o(40774);
    }
    while (true)
    {
      return i;
      i = this.gnQ.getCount();
      AppMethodBeat.o(40774);
    }
  }

  public final a mP(int paramInt)
  {
    AppMethodBeat.i(40772);
    com.tencent.mm.ui.contact.a.e locale = null;
    if (this.gnQ.moveToPosition(paramInt))
    {
      ad localad = new ad();
      localad.d(this.gnQ);
      locale = new com.tencent.mm.ui.contact.a.e(paramInt);
      locale.ehM = localad;
      locale.zmW = true;
    }
    AppMethodBeat.o(40772);
    return locale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.e
 * JD-Core Version:    0.6.2
 */