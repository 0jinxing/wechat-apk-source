package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.b;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.h;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;

public final class d extends o
  implements n.b
{
  private Cursor gnQ;
  private String jMp;
  private int pUv;

  public d(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, false, false);
    AppMethodBeat.i(30242);
    ab.i("MicroMsg.RecentConversationAdapter", "create!");
    this.jMp = paramString;
    Km();
    AppMethodBeat.o(30242);
  }

  private void Km()
  {
    AppMethodBeat.i(30243);
    ab.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    this.gnQ = z.aeU().rn(this.jMp);
    this.pUv = 0;
    AppMethodBeat.o(30243);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(30247);
    Km();
    notifyDataSetChanged();
    AppMethodBeat.o(30247);
  }

  public final void finish()
  {
    AppMethodBeat.i(30246);
    super.finish();
    ab.i("MicroMsg.RecentConversationAdapter", "finish!");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    AppMethodBeat.o(30246);
  }

  public final int getCount()
  {
    AppMethodBeat.i(30244);
    int i = this.gnQ.getCount();
    AppMethodBeat.o(30244);
    return i + 1;
  }

  public final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(30245);
    Object localObject = null;
    if (paramInt == this.pUv)
    {
      localObject = new h(paramInt);
      ((h)localObject).mKQ = this.zmV.getActivity().getResources().getString(2131302891);
    }
    while (true)
    {
      AppMethodBeat.o(30245);
      return localObject;
      if ((paramInt > this.pUv) && (this.gnQ.moveToPosition(paramInt - this.pUv - 1)))
      {
        a locala = new a(paramInt);
        com.tencent.mm.aj.a.a locala1 = new com.tencent.mm.aj.a.a();
        locala1.d(this.gnQ);
        localObject = locala;
        if (locala.jMj == -1L)
        {
          locala.jMj = locala1.field_bizChatId;
          localObject = z.aeT().aK(locala1.field_bizChatId);
          if (((c)localObject).isGroup())
          {
            locala.gnx = ((c)localObject).field_chatName;
            locala.yDO = ((c)localObject).field_headImageUrl;
            locala.username = ((c)localObject).field_brandUserName;
          }
          while (true)
          {
            if (bo.ac(locala.gnx))
              locala.gnx = this.zmV.getActivity().getResources().getString(2131302552);
            localObject = locala;
            if (!bo.isNullOrNil(locala.username))
              break;
            locala.username = locala1.field_brandUserName;
            localObject = locala;
            break;
            localObject = z.aeV().cH(((c)localObject).field_bizChatServId);
            if (localObject != null)
            {
              locala.gnx = ((j)localObject).field_userName;
              locala.yDO = ((j)localObject).field_headImageUrl;
              locala.username = ((j)localObject).field_brandUserName;
            }
          }
        }
      }
      else
      {
        ab.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.d
 * JD-Core Version:    0.6.2
 */