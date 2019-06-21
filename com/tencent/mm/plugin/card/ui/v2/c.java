package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.k.m;
import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardTicketAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "isInvalid", "", "(Z)V", "()Z", "setInvalid", "jumpList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListModel;", "Lkotlin/collections/ArrayList;", "getJumpList", "()Ljava/util/ArrayList;", "setJumpList", "(Ljava/util/ArrayList;)V", "licenseList", "getLicenseList", "setLicenseList", "licenseTitle", "getLicenseTitle", "()Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListModel;", "setLicenseTitle", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListModel;)V", "ticketList", "getTicketList", "setTicketList", "ticketTitle", "getTicketTitle", "setTicketTitle", "getItemCount", "", "getItemViewType", "position", "getModelByPos", "getPosByCardId", "cardId", "", "getPosInLicenseListByCardId", "getPosInTicketListByCardId", "getRelativePosByType", "cardType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeModelByCardId", "title", "setModelList", "Companion", "plugin-card_release"})
public final class c extends RecyclerView.a<f>
{
  public static final c.a kqc;
  private ArrayList<d> kpW;
  private ArrayList<d> kpX;
  private ArrayList<d> kpY;
  private d kpZ;
  private d kqa;
  private boolean kqb;

  static
  {
    AppMethodBeat.i(89297);
    kqc = new c.a((byte)0);
    AppMethodBeat.o(89297);
  }

  public c(boolean paramBoolean)
  {
    this.kqb = paramBoolean;
  }

  public final void GZ(String paramString)
  {
    AppMethodBeat.i(89293);
    j.p(paramString, "cardId");
    if (this.kpZ != null);
    for (int i = 1; ; i = 0)
    {
      Object localObject1 = this.kpY;
      Object localObject2;
      int j;
      Object localObject3;
      label65: d locald;
      if (localObject1 != null)
      {
        i += ((ArrayList)localObject1).size();
        localObject2 = this.kpW;
        j = i;
        if (localObject2 == null)
          break label217;
        localObject3 = ((Iterable)localObject2).iterator();
        j = 0;
        if (!((Iterator)localObject3).hasNext())
          break label208;
        locald = (d)((Iterator)localObject3).next();
        localObject1 = locald.kqe;
        if (localObject1 == null)
          break label197;
        localObject1 = ((bih)localObject1).vCb;
        label102: if (!m.I((String)localObject1, paramString, false))
          break label202;
        ((ArrayList)localObject2).remove(locald);
        ab.d("MicroMsg.CardTicketAdapter", "remove ticket: %s, %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        if (((ArrayList)localObject2).isEmpty())
          if (this.kpY != null)
          {
            paramString = this.kpY;
            if (paramString == null)
              j.dWJ();
            if (!paramString.isEmpty());
          }
          else
          {
            this.kpZ = null;
          }
        notifyDataSetChanged();
        AppMethodBeat.o(89293);
      }
      while (true)
      {
        return;
        break;
        label197: localObject1 = null;
        break label102;
        label202: j++;
        break label65;
        label208: j = i + ((ArrayList)localObject2).size();
        label217: i = j;
        if (this.kqa != null)
          i = j + 1;
        localObject3 = this.kpX;
        if (localObject3 != null)
        {
          localObject2 = ((Iterable)localObject3).iterator();
          label368: for (j = 0; ; j++)
          {
            if (!((Iterator)localObject2).hasNext())
              break label374;
            locald = (d)((Iterator)localObject2).next();
            localObject1 = locald.kqe;
            if (localObject1 != null);
            for (localObject1 = ((bih)localObject1).vCb; ; localObject1 = null)
            {
              if (!m.I((String)localObject1, paramString, false))
                break label368;
              ((ArrayList)localObject3).remove(locald);
              ab.d("MicroMsg.CardTicketAdapter", "remove license: %s, %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
              if (((ArrayList)localObject3).isEmpty())
                this.kqa = null;
              notifyDataSetChanged();
              AppMethodBeat.o(89293);
              break;
            }
          }
          label374: AppMethodBeat.o(89293);
        }
        else
        {
          AppMethodBeat.o(89293);
        }
      }
    }
  }

  public final void Ha(String paramString)
  {
    AppMethodBeat.i(89295);
    j.p(paramString, "title");
    if (bo.isNullOrNil(paramString))
    {
      this.kpZ = null;
      AppMethodBeat.o(89295);
    }
    while (true)
    {
      return;
      if (this.kpZ == null)
      {
        this.kpZ = new d();
        locald = this.kpZ;
        if (locald == null)
          j.dWJ();
        locald.type = 0;
      }
      d locald = this.kpZ;
      if (locald == null)
        j.dWJ();
      locald.title = paramString;
      AppMethodBeat.o(89295);
    }
  }

  public final void Hb(String paramString)
  {
    AppMethodBeat.i(89296);
    j.p(paramString, "title");
    if (bo.isNullOrNil(paramString))
    {
      this.kqa = null;
      AppMethodBeat.o(89296);
    }
    while (true)
    {
      return;
      if (this.kqa == null)
      {
        this.kqa = new d();
        locald = this.kqa;
        if (locald == null)
          j.dWJ();
        locald.type = 0;
      }
      d locald = this.kqa;
      if (locald == null)
        j.dWJ();
      locald.title = paramString;
      AppMethodBeat.o(89296);
    }
  }

  public final void a(ArrayList<d> paramArrayList1, ArrayList<d> paramArrayList2, ArrayList<d> paramArrayList3)
  {
    AppMethodBeat.i(89294);
    this.kpY = paramArrayList1;
    this.kpW = paramArrayList2;
    this.kpX = paramArrayList3;
    notifyDataSetChanged();
    AppMethodBeat.o(89294);
  }

  public final int bO(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(89292);
    j.p(paramString, "cardId");
    Object localObject;
    Iterator localIterator;
    switch (paramInt)
    {
    default:
      j.p(paramString, "cardId");
      localObject = this.kpX;
      if (localObject != null)
      {
        localIterator = ((Iterable)localObject).iterator();
        paramInt = 0;
        if (localIterator.hasNext())
        {
          localObject = ((d)localIterator.next()).kqe;
          if (localObject != null)
          {
            localObject = ((bih)localObject).vCb;
            label100: if (!j.j(localObject, paramString))
              break label262;
            AppMethodBeat.o(89292);
          }
        }
      }
      break;
    case 1:
    }
    while (true)
    {
      return paramInt;
      j.p(paramString, "cardId");
      localObject = this.kpY;
      if (localObject != null)
      {
        paramInt = ((ArrayList)localObject).size() + 0;
        label142: localObject = this.kpW;
        if (localObject != null)
          localIterator = ((Iterable)localObject).iterator();
      }
      else
      {
        label239: for (int j = 0; ; j++)
        {
          if (!localIterator.hasNext())
            break label245;
          localObject = ((d)localIterator.next()).kqe;
          if (localObject != null);
          for (localObject = ((bih)localObject).vCb; ; localObject = null)
          {
            if (!j.j(localObject, paramString))
              break label239;
            paramInt = j + paramInt;
            AppMethodBeat.o(89292);
            break;
            paramInt = 0;
            break label142;
          }
        }
      }
      label245: AppMethodBeat.o(89292);
      paramInt = i;
      continue;
      localObject = null;
      break label100;
      label262: paramInt++;
      break;
      AppMethodBeat.o(89292);
      paramInt = i;
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(89290);
    int i = 0;
    if (this.kpZ != null)
      i = 1;
    ArrayList localArrayList = this.kpY;
    int j = i;
    if (localArrayList != null)
      j = i + localArrayList.size();
    localArrayList = this.kpW;
    i = j;
    if (localArrayList != null)
      i = j + localArrayList.size();
    j = i;
    if (this.kqa != null)
      j = i + 1;
    localArrayList = this.kpX;
    i = j;
    if (localArrayList != null)
      i = j + localArrayList.size();
    AppMethodBeat.o(89290);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(89289);
    d locald = tl(paramInt);
    if (locald != null)
    {
      paramInt = locald.type;
      AppMethodBeat.o(89289);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(89289);
    }
  }

  public final d tl(int paramInt)
  {
    AppMethodBeat.i(89291);
    Object localObject1 = this.kpY;
    Object localObject2;
    label40: Object localObject3;
    label61: int i;
    if (localObject1 != null)
    {
      localObject1 = Integer.valueOf(((ArrayList)localObject1).size());
      localObject2 = this.kpW;
      if (localObject2 == null)
        break label125;
      localObject2 = Integer.valueOf(((ArrayList)localObject2).size());
      localObject3 = this.kpX;
      if (localObject3 == null)
        break label130;
      localObject3 = Integer.valueOf(((ArrayList)localObject3).size());
      ab.d("MicroMsg.CardTicketAdapter", "pos: %s, jSize: %s, tSize: %s, lSize: %s", new Object[] { Integer.valueOf(paramInt), localObject1, localObject2, localObject3 });
      i = -1;
      if (this.kpZ == null)
        break label139;
      if (paramInt != 0)
        break label136;
      localObject1 = this.kpZ;
      AppMethodBeat.o(89291);
    }
    while (true)
    {
      return localObject1;
      localObject1 = null;
      break;
      label125: localObject2 = null;
      break label40;
      label130: localObject3 = null;
      break label61;
      label136: i = 0;
      label139: localObject1 = this.kpY;
      int j = i;
      if (localObject1 != null)
      {
        if ((paramInt > i) && (paramInt <= ((ArrayList)localObject1).size() + i))
        {
          localObject1 = (d)((ArrayList)localObject1).get(paramInt - i - 1);
          AppMethodBeat.o(89291);
        }
        else
        {
          j = i + ((ArrayList)localObject1).size();
        }
      }
      else
      {
        localObject1 = this.kpW;
        i = j;
        if (localObject1 != null)
        {
          if ((paramInt > j) && (paramInt <= ((ArrayList)localObject1).size() + j))
          {
            localObject1 = (d)((ArrayList)localObject1).get(paramInt - j - 1);
            AppMethodBeat.o(89291);
          }
          else
          {
            i = j + ((ArrayList)localObject1).size();
          }
        }
        else
        {
          j = i;
          if (this.kqa != null)
          {
            i++;
            j = i;
            if (paramInt == i)
            {
              localObject1 = this.kqa;
              AppMethodBeat.o(89291);
            }
          }
          else
          {
            localObject1 = this.kpX;
            if ((localObject1 != null) && (paramInt > j) && (paramInt <= ((ArrayList)localObject1).size() + j))
            {
              localObject1 = (d)((ArrayList)localObject1).get(paramInt - j - 1);
              AppMethodBeat.o(89291);
            }
            else
            {
              AppMethodBeat.o(89291);
              localObject1 = null;
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.c
 * JD-Core Version:    0.6.2
 */