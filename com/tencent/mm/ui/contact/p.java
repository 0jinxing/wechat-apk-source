package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.api.i;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class p extends q
{
  private Cursor gnQ;
  private ak handler;
  private String jMp;
  private String query;
  private m.a zmU;
  private List<String> znn;

  public p(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, false, 0);
    AppMethodBeat.i(105225);
    this.handler = new ak(Looper.getMainLooper());
    this.znn = null;
    this.jMp = paramString;
    ab.i("MicroMsg.MMSearchContactAdapter", "Create!");
    Kh();
    AppMethodBeat.o(105225);
  }

  private void Kh()
  {
    AppMethodBeat.i(105227);
    ab.i("MicroMsg.MMSearchContactAdapter", "initData!");
    this.query = null;
    clearCache();
    AppMethodBeat.o(105227);
  }

  public final void a(m.a parama)
  {
    this.zmU = parama;
  }

  protected final boolean c(com.tencent.mm.ui.contact.a.a parama)
  {
    return true;
  }

  public final void ci(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105226);
    if (this.zmU != null)
      this.zmU.w(paramString, getCount(), paramBoolean);
    AppMethodBeat.o(105226);
  }

  public final void finish()
  {
    AppMethodBeat.i(105230);
    super.finish();
    ab.i("MicroMsg.MMSearchContactAdapter", "finish!");
    Kh();
    AppMethodBeat.o(105230);
  }

  public final int getCount()
  {
    AppMethodBeat.i(105228);
    int i;
    if (this.gnQ == null)
    {
      i = 0;
      AppMethodBeat.o(105228);
    }
    while (true)
    {
      return i;
      i = this.gnQ.getCount();
      AppMethodBeat.o(105228);
    }
  }

  protected final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(105229);
    com.tencent.mm.ui.bizchat.a locala = null;
    c localc;
    if ((paramInt >= 0) && (this.gnQ.moveToPosition(paramInt)))
    {
      locala = new com.tencent.mm.ui.bizchat.a(paramInt);
      localc = new c();
      localc.d(this.gnQ);
      if (locala.jMj == -1L)
      {
        locala.jMj = localc.field_bizChatLocalId;
        if (!localc.isGroup())
          break label155;
        locala.gnx = localc.field_chatName;
        locala.yDO = localc.field_headImageUrl;
        locala.username = localc.field_brandUserName;
        if (bo.ac(locala.gnx))
          locala.gnx = this.zmV.getActivity().getResources().getString(2131302888);
        if (bo.isNullOrNil(locala.username))
          locala.username = localc.field_brandUserName;
      }
    }
    while (true)
    {
      AppMethodBeat.o(105229);
      return locala;
      label155: j localj = ((i)g.K(i.class)).cH(localc.field_bizChatServId);
      if (localj == null)
        break;
      locala.gnx = localj.field_userName;
      locala.yDO = localj.field_headImageUrl;
      locala.username = localj.field_brandUserName;
      break;
      ab.e("MicroMsg.MMSearchContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.p
 * JD-Core Version:    0.6.2
 */