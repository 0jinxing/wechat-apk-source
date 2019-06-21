package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.database.Cursor;
import android.database.MergeCursor;
import android.util.SparseArray;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.a.h;
import com.tencent.mm.ui.contact.a.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class c extends o
  implements n.b
{
  private Cursor gnQ;
  private int pUv;
  private c.a zkH;
  private int zkI;
  private int zkJ;
  private int zkK;
  private int zkL;
  private int zkM;
  private int zkN;
  private HashMap<String, Integer> zkO;
  private SparseArray<String> zkP;

  public c(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, c.a parama)
  {
    this(paramMMBaseSelectContactUI, paramList, true, paramBoolean, parama, false);
  }

  public c(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, c.a parama, boolean paramBoolean3)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean1, paramBoolean2, paramBoolean3);
    AppMethodBeat.i(105190);
    this.zkI = 2147483647;
    this.pUv = 2147483647;
    this.zkJ = 2147483647;
    this.zkK = 2147483647;
    this.zkL = 2147483647;
    this.zkM = 2147483647;
    this.zkN = 2147483647;
    this.zkO = null;
    this.zkP = null;
    ab.i("MicroMsg.AlphabetContactAdapter", "create!");
    if (parama != null);
    for (this.zkH = parama; ; this.zkH = new c.a())
    {
      com.tencent.mm.kernel.g.RQ();
      ((j)com.tencent.mm.kernel.g.K(j.class)).XM().a(this);
      Km();
      AppMethodBeat.o(105190);
      return;
    }
  }

  private void Km()
  {
    AppMethodBeat.i(105191);
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    this.zkI = 2147483647;
    this.pUv = 2147483647;
    this.zkJ = 2147483647;
    this.zkK = 2147483647;
    this.zkL = 2147483647;
    this.zkN = 2147483647;
    label90: ArrayList localArrayList;
    Object localObject1;
    label205: Object localObject2;
    label256: int j;
    if (this.zkO != null)
    {
      this.zkO.clear();
      if (this.zkP == null)
        break label446;
      this.zkP.clear();
      localArrayList = new ArrayList();
      if (!this.zkH.zkU)
        break label584;
      com.tencent.mm.kernel.g.RQ();
      localObject1 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().k(bo.P(this.zkH.zkX.split(",")), false);
      localArrayList.add(localObject1);
      i = ((Cursor)localObject1).getCount();
      ab.d("MicroMsg.AlphabetContactAdapter", "ap: recent like count %d", new Object[] { Integer.valueOf(i) });
      if (i <= 0)
        break label460;
      this.zkN = 0;
      bM(this.zkN, "☆");
      i = i + 1 + 0;
      if (this.zkH.zjx != "@all.contact.without.chatroom.without.openim.without.openimfavour")
        break label471;
      com.tencent.mm.kernel.g.RQ();
      localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().eB(bo.P(this.zkH.zkW.split(",")));
      localArrayList.add(localObject2);
      j = ((Cursor)localObject2).getCount();
      if (j <= 0)
        break label513;
      this.zkJ = i;
      i += j + 1;
      bM(this.zkJ, "☆");
    }
    Object localObject3;
    int k;
    while (true)
    {
      localObject3 = bo.P(this.zkH.zkW.split(","));
      com.tencent.mm.kernel.g.RQ();
      localArrayList.add(((j)com.tencent.mm.kernel.g.K(j.class)).XM().k((List)localObject3, true));
      localObject2 = t.W((List)localObject3);
      localObject3 = t.V((List)localObject3);
      if ((localObject2 == null) || (localObject3 == null))
        break label529;
      j = 0;
      k = i;
      i = j;
      while (i < localObject2.length)
      {
        j = k;
        if (i < localObject3.length)
        {
          bM(localObject3[i] + k, localObject2[i]);
          j = k + 1;
        }
        i++;
        k = j;
      }
      this.zkO = new HashMap();
      break;
      label446: this.zkP = new SparseArray();
      break label90;
      label460: this.zkN = 2147483647;
      i = 0;
      break label205;
      label471: com.tencent.mm.kernel.g.RQ();
      localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().eA(bo.P(this.zkH.zkW.split(",")));
      break label256;
      label513: this.zkJ = 2147483647;
    }
    ((Cursor)localObject1).getCount();
    label529: ab.d("MicroMsg.AlphabetContactAdapter", "headerPosMap=%s", new Object[] { this.zkO.toString() });
    this.gnQ = new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[0]));
    notifyDataSetChanged();
    AppMethodBeat.o(105191);
    return;
    label584: if (this.zkH.zkV)
    {
      this.zkM = 0;
      bM(this.zkM, "nonLimit");
    }
    for (int i = 1; ; i = 0)
    {
      if ((this.zkH.zkY) && (this.zkH.zkZ != null) && (!bo.isNullOrNil(this.zkH.zkZ)))
      {
        localObject2 = bo.P(this.zkH.zkZ.split(";"));
        com.tencent.mm.kernel.g.RQ();
        localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().ew((List)localObject2);
        localArrayList.add(localObject2);
        j = ((Cursor)localObject2).getCount();
        if (j > 0)
        {
          this.zkI = i;
          j = i + (j + 1);
          bM(this.zkI, "↑");
          i = j;
          if (this.zkH.zkR)
          {
            if (this.zkH.zjx != "@all.contact.without.chatroom.without.openim.without.openimfavour")
              break label1087;
            com.tencent.mm.kernel.g.RQ();
            localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().eD(this.elZ);
            label786: localArrayList.add(localObject2);
            i = ((Cursor)localObject2).getCount();
            if (i <= 0)
              break label1118;
            this.zkJ = j;
            i = j + (i + 1);
            bM(this.zkJ, "☆");
          }
        }
      }
      while (true)
      {
        com.tencent.mm.kernel.g.RQ();
        localObject3 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().b(this.zkH.zjx, "", this.elZ);
        localArrayList.add(localObject3);
        localObject2 = t.a(this.zkH.zjx, "", "", this.elZ);
        localObject1 = t.a(this.zkH.zjx, "", this.elZ, "");
        j = i;
        if (localObject2 == null)
          break label1145;
        j = i;
        if (localObject1 == null)
          break label1145;
        int m = 0;
        for (k = i; m < localObject2.length; k = j)
        {
          j = k;
          if (m < localObject1.length)
          {
            bM(localObject1[m] + k, localObject2[m]);
            j = k + 1;
          }
          m++;
        }
        this.zkI = 2147483647;
        j = i;
        break;
        j = i;
        if (!this.zkH.zkQ)
          break;
        localObject2 = g.fm(this.elZ);
        localArrayList.add(localObject2);
        j = ((Cursor)localObject2).getCount();
        if (j > 0)
        {
          this.pUv = i;
          j = i + (j + 1);
          bM(this.pUv, "↑");
          break;
        }
        this.pUv = 2147483647;
        j = i;
        break;
        label1087: com.tencent.mm.kernel.g.RQ();
        localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().eC(this.elZ);
        break label786;
        label1118: this.zkJ = 2147483647;
        i = j;
      }
      j = i + (((Cursor)localObject3).getCount() + localObject2.length);
      label1145: i = j;
      if (this.zkH.zkS)
      {
        com.tencent.mm.kernel.g.RQ();
        localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().c("@all.chatroom.contact", "", this.elZ);
        localArrayList.add(localObject2);
        i = ((Cursor)localObject2).getCount();
        if (i <= 0)
          break label1343;
        this.zkK = j;
        i = j + (i + 1);
        bM(this.zkK, this.zmV.getActivity().getString(2131296440));
      }
      while (true)
      {
        if (!this.zkH.zkT)
          break label1353;
        com.tencent.mm.kernel.g.RQ();
        localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().c("@verify.contact", "", this.elZ);
        localArrayList.add(localObject2);
        if (((Cursor)localObject2).getCount() <= 0)
          break label1355;
        this.zkL = i;
        bM(this.zkL, this.zmV.getActivity().getString(2131302887));
        break;
        label1343: this.zkK = 2147483647;
        i = j;
      }
      label1353: break;
      label1355: this.zkL = 2147483647;
      break;
    }
  }

  private void bM(int paramInt, String paramString)
  {
    AppMethodBeat.i(105192);
    this.zkO.put(paramString, Integer.valueOf(paramInt));
    this.zkP.put(paramInt, paramString);
    AppMethodBeat.o(105192);
  }

  private static a bN(int paramInt, String paramString)
  {
    AppMethodBeat.i(105196);
    h localh = new h(paramInt);
    localh.mKQ = paramString;
    AppMethodBeat.o(105196);
    return localh;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(105198);
    Km();
    notifyDataSetChanged();
    AppMethodBeat.o(105198);
  }

  public final int arM(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(105193);
    if (paramString.equals("↑"))
    {
      i = 0;
      AppMethodBeat.o(105193);
    }
    while (true)
    {
      return i;
      if (this.zkO != null)
      {
        if (this.zkO.containsKey(paramString))
        {
          i = ((Integer)this.zkO.get(paramString)).intValue() + this.zmV.getContentLV().getHeaderViewsCount();
          AppMethodBeat.o(105193);
        }
        else
        {
          AppMethodBeat.o(105193);
        }
      }
      else
        AppMethodBeat.o(105193);
    }
  }

  protected final boolean c(a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(105199);
    int i = parama.position + 1;
    int j = this.zkN;
    int k = this.zkI;
    int m = this.pUv;
    int n = this.zkJ;
    int i1 = this.zkK;
    int i2 = this.zkL;
    int i3 = 0;
    if (i3 < 6)
      if (i == new int[] { j, k, m, n, i1, i2 }[i3])
        AppMethodBeat.o(105199);
    while (true)
    {
      return bool;
      i3++;
      break;
      if (this.zkP.indexOfKey(i) >= 0)
      {
        AppMethodBeat.o(105199);
      }
      else
      {
        AppMethodBeat.o(105199);
        bool = false;
      }
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(105197);
    super.finish();
    ab.i("MicroMsg.AlphabetContactAdapter", "finish!");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    com.tencent.mm.kernel.g.RQ();
    ((j)com.tencent.mm.kernel.g.K(j.class)).XM().b(this);
    AppMethodBeat.o(105197);
  }

  public final int getCount()
  {
    AppMethodBeat.i(105194);
    int i = this.gnQ.getCount();
    if (this.zkO == null);
    for (int j = 0; ; j = this.zkO.size())
    {
      AppMethodBeat.o(105194);
      return j + i;
    }
  }

  protected final a mP(int paramInt)
  {
    AppMethodBeat.i(105195);
    Object localObject;
    if (paramInt == this.zkN)
    {
      localObject = bN(paramInt, this.zmV.getActivity().getString(2131302889));
      AppMethodBeat.o(105195);
    }
    while (true)
    {
      return localObject;
      if (paramInt == this.zkI)
      {
        localObject = bN(paramInt, this.zkH.zla);
        AppMethodBeat.o(105195);
      }
      else if (paramInt == this.pUv)
      {
        localObject = bN(paramInt, this.zmV.getActivity().getString(2131302881));
        AppMethodBeat.o(105195);
      }
      else if (paramInt == this.zkJ)
      {
        localObject = bN(paramInt, this.zmV.getActivity().getString(2131302875));
        AppMethodBeat.o(105195);
      }
      else if (paramInt == this.zkK)
      {
        localObject = bN(paramInt, this.zmV.getActivity().getString(2131296440));
        AppMethodBeat.o(105195);
      }
      else if (paramInt == this.zkL)
      {
        localObject = bN(paramInt, this.zmV.getActivity().getString(2131302887));
        AppMethodBeat.o(105195);
      }
      else if (paramInt == this.zkM)
      {
        localObject = new k(paramInt);
        AppMethodBeat.o(105195);
      }
      else if (this.zkP.indexOfKey(paramInt) >= 0)
      {
        localObject = bN(paramInt, (String)this.zkP.get(paramInt));
        AppMethodBeat.o(105195);
      }
      else
      {
        int i = paramInt;
        int j = 0;
        int k;
        int m;
        do
        {
          k = j;
          if (j > this.zkP.size())
            break;
          k = j;
          if (this.zkP.indexOfKey(i) >= 0)
            k = j + 1;
          m = i - 1;
          i = m;
          j = k;
        }
        while (m >= 0);
        j = paramInt - k;
        if (this.gnQ.moveToPosition(j))
        {
          ab.d("MicroMsg.AlphabetContactAdapter", "create contact item position=%d | index=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j) });
          ad localad = new ad();
          localad.d(this.gnQ);
          localObject = new e(paramInt);
          ((a)localObject).ehM = localad;
          ((a)localObject).zmW = clI();
          ((a)localObject).zmX = this.zmX;
          AppMethodBeat.o(105195);
        }
        else
        {
          ab.i("MicroMsg.AlphabetContactAdapter", "create contact item error: position=%d | index=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j) });
          localObject = null;
          AppMethodBeat.o(105195);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.c
 * JD-Core Version:    0.6.2
 */