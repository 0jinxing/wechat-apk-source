package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.f;
import com.tencent.mm.ui.contact.a.h;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.List;

public final class g extends o
  implements n.b
{
  private int fromScene;
  private Cursor gnQ;
  int pUu;
  int pUv;
  private List<String> pUw;
  private int pUx;

  public g(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList1, List<String> paramList2, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramList2, true, false);
    AppMethodBeat.i(44986);
    this.pUx = 0;
    this.pUw = paramList1;
    this.fromScene = paramInt;
    ab.i("MicroMsg.RecentConversationAdapter", "create!");
    Km();
    ((j)com.tencent.mm.kernel.g.K(j.class)).XR().a(this);
    AppMethodBeat.o(44986);
  }

  private void Km()
  {
    AppMethodBeat.i(44987);
    ab.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    this.pUx = 0;
    ArrayList localArrayList = new ArrayList();
    this.pUu = -1;
    this.pUv = -1;
    Object localObject;
    int i;
    if ((this.pUw != null) && (this.pUw.size() > 0))
    {
      com.tencent.mm.kernel.g.RQ();
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().ex(this.pUw);
      localArrayList.add(localObject);
      i = ((Cursor)localObject).getCount();
      if (i > 0)
      {
        this.pUu = this.zmV.getContentLV().getHeaderViewsCount();
        this.pUx += 1;
      }
    }
    while (true)
    {
      localObject = this.elZ;
      if (localObject != null)
      {
        ((List)localObject).addAll(this.pUw);
        label167: if (this.fromScene != 1)
          break label293;
        localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XR().a(t.fkQ, (List)localObject, this.znm, "");
        label204: if (((Cursor)localObject).getCount() <= 0)
          break label344;
        this.pUx += 1;
        if (i <= 0)
          break label325;
        this.pUv = (i + this.pUu + 1);
      }
      while (true)
      {
        localArrayList.add(localObject);
        this.gnQ = new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[0]));
        AppMethodBeat.o(44987);
        return;
        this.pUu = -1;
        break;
        localObject = this.pUw;
        break label167;
        label293: localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XR().a(t.fkU, (List)localObject, this.znm, "");
        break label204;
        label325: this.pUv = this.zmV.getContentLV().getHeaderViewsCount();
        continue;
        label344: this.pUv = -1;
      }
      i = 0;
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(44991);
    Km();
    notifyDataSetChanged();
    AppMethodBeat.o(44991);
  }

  public final void finish()
  {
    AppMethodBeat.i(44990);
    super.finish();
    ab.i("MicroMsg.RecentConversationAdapter", "finish!");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    ((j)com.tencent.mm.kernel.g.K(j.class)).XR().b(this);
    AppMethodBeat.o(44990);
  }

  public final int getCount()
  {
    AppMethodBeat.i(44989);
    int i = this.gnQ.getCount();
    int j = this.pUx;
    AppMethodBeat.o(44989);
    return i + j;
  }

  public final a mP(int paramInt)
  {
    AppMethodBeat.i(44988);
    Object localObject1;
    Object localObject2;
    if ((paramInt == this.pUv) || (paramInt == this.pUu))
    {
      localObject1 = new h(paramInt);
      if (paramInt == this.pUu)
        if (this.fromScene == 1)
        {
          ((h)localObject1).mKQ = this.zmV.getActivity().getResources().getString(2131296367);
          localObject2 = localObject1;
        }
    }
    while (true)
    {
      AppMethodBeat.o(44988);
      return localObject2;
      ((h)localObject1).mKQ = this.zmV.getActivity().getResources().getString(2131302452);
      localObject2 = localObject1;
      continue;
      localObject2 = localObject1;
      if (paramInt == this.pUv)
      {
        ((h)localObject1).mKQ = this.zmV.getActivity().getResources().getString(2131305345);
        localObject2 = localObject1;
        continue;
        int i;
        if (this.pUx == 2)
          if (paramInt > this.pUv)
            i = paramInt - 2;
        while (true)
        {
          if (!this.gnQ.moveToPosition(i))
            break label316;
          localObject2 = new f(paramInt);
          localObject1 = new ak();
          ((ak)localObject1).d(this.gnQ);
          com.tencent.mm.kernel.g.RQ();
          ((a)localObject2).ehM = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoI(((at)localObject1).field_username);
          if (((a)localObject2).ehM == null)
          {
            com.tencent.mm.kernel.g.RQ();
            ((a)localObject2).ehM = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoN(((at)localObject1).field_username);
          }
          break;
          i = paramInt - 1;
          continue;
          if (this.pUx == 1)
          {
            i = paramInt - 1;
          }
          else
          {
            ab.e("MicroMsg.RecentConversationAdapter", "Actually dead branch. position=%d", new Object[] { Integer.valueOf(paramInt) });
            i = paramInt;
          }
        }
        label316: localObject2 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.g
 * JD-Core Version:    0.6.2
 */