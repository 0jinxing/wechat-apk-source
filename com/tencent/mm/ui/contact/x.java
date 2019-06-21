package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.b;
import com.tencent.mm.ui.contact.a.f;
import com.tencent.mm.ui.contact.a.h;
import java.util.List;

public final class x extends o
  implements n.b
{
  private Cursor gnQ;
  private int pUv;
  private List<String> zor;
  private int zos;
  private boolean zot;
  private int zou;

  public x(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList)
  {
    this(paramMMBaseSelectContactUI, paramList, true, false, false, 0);
  }

  public x(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean1, paramBoolean2);
    AppMethodBeat.i(105257);
    this.zou = 0;
    ab.i("MicroMsg.RecentConversationAdapter", "create!");
    this.zot = paramBoolean3;
    this.zou = paramInt;
    Km();
    ((j)g.K(j.class)).XR().a(this);
    AppMethodBeat.o(105257);
  }

  private void Km()
  {
    int i = 0;
    AppMethodBeat.i(105258);
    ab.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    if (s.hr(this.zou, 4))
    {
      this.gnQ = ((j)g.K(j.class)).XR().a(t.fkU, this.elZ, this.znm, "");
      if (!this.zot)
        break label220;
    }
    label220: for (int j = 2; ; j = 0)
    {
      if (this.zor != null)
        i = this.zor.size();
      this.zos = i;
      this.pUv = (j + this.zos);
      clearCache();
      AppMethodBeat.o(105258);
      return;
      if (s.hr(this.zou, 16))
      {
        this.gnQ = ((j)g.K(j.class)).XR().a(t.fkW, this.elZ, this.znm, "");
        break;
      }
      this.gnQ = ((j)g.K(j.class)).XR().a(t.fkP, this.elZ, this.znm, "");
      break;
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(105262);
    Km();
    notifyDataSetChanged();
    AppMethodBeat.o(105262);
  }

  public final void finish()
  {
    AppMethodBeat.i(105261);
    super.finish();
    ab.i("MicroMsg.RecentConversationAdapter", "finish!");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    ((j)g.K(j.class)).XR().b(this);
    AppMethodBeat.o(105261);
  }

  public final int getCount()
  {
    AppMethodBeat.i(105259);
    int i = this.pUv + 1;
    int j = i;
    if (this.gnQ != null)
      j = i + this.gnQ.getCount();
    AppMethodBeat.o(105259);
    return j;
  }

  protected final a mP(int paramInt)
  {
    ak localak = null;
    AppMethodBeat.i(105260);
    Object localObject;
    if (this.pUv > this.zos)
      if (paramInt == this.zos)
      {
        localObject = new h(paramInt);
        ((h)localObject).mKQ = this.zmV.getActivity().getResources().getString(2131302887);
      }
    while (true)
    {
      if (paramInt == this.pUv)
      {
        localObject = new h(paramInt);
        ((h)localObject).mKQ = this.zmV.getActivity().getResources().getString(2131302872);
      }
      while (true)
      {
        AppMethodBeat.o(105260);
        return localObject;
        if (paramInt != this.zos + 1)
          break label373;
        localObject = new b(paramInt);
        String str = this.zmV.getActivity().getResources().getString(2131302887);
        ((b)localObject).resId = 2131231196;
        ((b)localObject).bCu = str;
        break;
        if (paramInt < this.zos)
        {
          localObject = localak;
          if (this.zor != null)
          {
            localObject = localak;
            if (paramInt >= 0)
            {
              localObject = localak;
              if (paramInt < this.zor.size())
              {
                localObject = new b(paramInt);
                ((b)localObject).username = ((String)this.zor.get(paramInt));
              }
            }
          }
        }
        else if ((paramInt > this.pUv) && (this.gnQ.moveToPosition(paramInt - this.pUv - 1)))
        {
          localObject = new f(paramInt);
          localak = new ak();
          localak.d(this.gnQ);
          g.RQ();
          ((a)localObject).ehM = ((j)g.K(j.class)).XM().aoI(localak.field_username);
          if (((a)localObject).ehM == null)
          {
            g.RQ();
            ((a)localObject).ehM = ((j)g.K(j.class)).XM().aoN(localak.field_username);
          }
          ((a)localObject).zmW = clI();
        }
        else
        {
          ab.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
        }
      }
      label373: localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.x
 * JD-Core Version:    0.6.2
 */