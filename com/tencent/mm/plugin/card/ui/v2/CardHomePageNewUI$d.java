package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH;", "Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;)V", "appendUnderList", "", "model", "Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;", "getItemCount", "", "getItemViewType", "position", "getModelByPos", "getPosByMerchantId", "merchantId", "", "moveStoreToUnderList", "", "element", "Lcom/tencent/mm/protocal/protobuf/CardHomePageElement;", "onBindViewHolder", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeModelByMId", "removeTitleSection", "replaceModelByMId", "mchInfo", "plugin-card_release"})
public final class CardHomePageNewUI$d extends RecyclerView.a<CardHomePageNewUI.e>
{
  private int GX(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(89189);
    j.p(paramString, "merchantId");
    if (CardHomePageNewUI.e(this.koY) != null);
    for (int j = 1; ; j = 0)
    {
      if (CardHomePageNewUI.f(this.koY) != null)
        j++;
      while (true)
      {
        Iterator localIterator = ((Iterable)CardHomePageNewUI.a(this.koY)).iterator();
        Object localObject;
        for (int k = 0; localIterator.hasNext(); k++)
        {
          localObject = ((CardHomePageNewUI.a)localIterator.next()).koU;
          if (localObject != null);
          for (localObject = ((ns)localObject).vSR; j.j(localObject, paramString); localObject = null)
          {
            j += k;
            AppMethodBeat.o(89189);
            return j;
          }
        }
        j = CardHomePageNewUI.a(this.koY).size() + j - 1;
        if (CardHomePageNewUI.c(this.koY) != null)
          j++;
        while (true)
        {
          localIterator = ((Iterable)CardHomePageNewUI.b(this.koY)).iterator();
          label243: for (k = i; ; k++)
          {
            if (!localIterator.hasNext())
              break label249;
            localObject = ((CardHomePageNewUI.a)localIterator.next()).koU;
            if (localObject != null);
            for (localObject = ((ns)localObject).vSR; ; localObject = null)
            {
              if (!j.j(localObject, paramString))
                break label243;
              j = j + k + 1;
              AppMethodBeat.o(89189);
              break;
            }
          }
          label249: j = -1;
          AppMethodBeat.o(89189);
          break;
        }
      }
    }
  }

  public final void GW(String paramString)
  {
    AppMethodBeat.i(89188);
    j.p(paramString, "merchantId");
    Iterator localIterator = CardHomePageNewUI.a(this.koY).iterator();
    CardHomePageNewUI.a locala;
    Object localObject;
    if (localIterator.hasNext())
    {
      locala = (CardHomePageNewUI.a)localIterator.next();
      localObject = locala.koU;
      if (localObject != null)
      {
        localObject = ((ns)localObject).vSR;
        label59: if (!j.j(localObject, paramString))
          break label103;
        CardHomePageNewUI.a(this.koY).remove(locala);
        CardHomePageNewUI.h(this.koY).getAdapter().notifyDataSetChanged();
        AppMethodBeat.o(89188);
      }
    }
    while (true)
    {
      return;
      localObject = null;
      break label59;
      label103: break;
      localIterator = CardHomePageNewUI.b(this.koY).iterator();
      label219: 
      while (true)
      {
        if (!localIterator.hasNext())
          break label221;
        locala = (CardHomePageNewUI.a)localIterator.next();
        localObject = locala.koU;
        if (localObject != null);
        for (localObject = ((ns)localObject).vSR; ; localObject = null)
        {
          if (!j.j(localObject, paramString))
            break label219;
          CardHomePageNewUI.b(this.koY).remove(locala);
          if (CardHomePageNewUI.b(this.koY).size() == 0)
          {
            CardHomePageNewUI.d(this.koY);
            CardHomePageNewUI.h(this.koY).getAdapter().notifyDataSetChanged();
          }
          AppMethodBeat.o(89188);
          break;
        }
      }
      label221: AppMethodBeat.o(89188);
    }
  }

  public final void a(String paramString, ns paramns)
  {
    AppMethodBeat.i(89190);
    j.p(paramString, "merchantId");
    j.p(paramns, "mchInfo");
    Object localObject1 = CardHomePageNewUI.a(this.koY).iterator();
    Object localObject2;
    Object localObject3;
    label67: int i;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (CardHomePageNewUI.a)((Iterator)localObject1).next();
      localObject3 = ((CardHomePageNewUI.a)localObject2).koU;
      if (localObject3 != null)
      {
        localObject3 = ((ns)localObject3).vSR;
        if (!j.j(localObject3, paramString))
          break label122;
        ((CardHomePageNewUI.a)localObject2).koU = paramns;
        i = GX(paramString);
        if (i >= 0)
          CardHomePageNewUI.h(this.koY).getAdapter().b(i, Boolean.TRUE);
        AppMethodBeat.o(89190);
      }
    }
    while (true)
    {
      return;
      localObject3 = null;
      break label67;
      label122: break;
      localObject2 = CardHomePageNewUI.b(this.koY).iterator();
      label231: 
      while (true)
      {
        if (!((Iterator)localObject2).hasNext())
          break label233;
        localObject1 = (CardHomePageNewUI.a)((Iterator)localObject2).next();
        localObject3 = ((CardHomePageNewUI.a)localObject1).koU;
        if (localObject3 != null);
        for (localObject3 = ((ns)localObject3).vSR; ; localObject3 = null)
        {
          if (!j.j(localObject3, paramString))
            break label231;
          ((CardHomePageNewUI.a)localObject1).koU = paramns;
          i = GX(paramString);
          if (i >= 0)
            CardHomePageNewUI.h(this.koY).getAdapter().b(i, Boolean.TRUE);
          AppMethodBeat.o(89190);
          break;
        }
      }
      label233: AppMethodBeat.o(89190);
    }
  }

  public final int getItemCount()
  {
    int i = 1;
    AppMethodBeat.i(89183);
    ArrayList localArrayList = CardHomePageNewUI.a(this.koY);
    int j;
    int k;
    if (localArrayList != null)
    {
      j = localArrayList.size();
      localArrayList = CardHomePageNewUI.b(this.koY);
      if (localArrayList == null)
        break label101;
      k = localArrayList.size();
      label42: if (CardHomePageNewUI.c(this.koY) == null)
        break label118;
    }
    label101: label118: for (int m = 1; ; m = 0)
    {
      if (CardHomePageNewUI.e(this.koY) != null);
      for (int n = 1; ; n = 0)
      {
        if (CardHomePageNewUI.f(this.koY) != null);
        while (true)
        {
          AppMethodBeat.o(89183);
          return j + k + m + n + i;
          j = 0;
          break;
          k = 0;
          break label42;
          i = 0;
        }
      }
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(89184);
    CardHomePageNewUI.a locala = th(paramInt);
    if (locala != null)
    {
      paramInt = locala.type;
      AppMethodBeat.o(89184);
    }
    while (true)
    {
      return paramInt;
      paramInt = 3;
      AppMethodBeat.o(89184);
    }
  }

  public final CardHomePageNewUI.a th(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(89187);
    Object localObject1 = CardHomePageNewUI.a(this.koY);
    Object localObject2;
    label51: boolean bool;
    if (localObject1 != null)
    {
      localObject1 = Integer.valueOf(((ArrayList)localObject1).size());
      localObject2 = CardHomePageNewUI.a(this.koY);
      if (localObject2 == null)
        break label128;
      localObject2 = Integer.valueOf(((ArrayList)localObject2).size());
      if (CardHomePageNewUI.c(this.koY) == null)
        break label134;
      bool = true;
      label64: ab.d("MicroMsg.CardHomePageNewUI", "pos: %s, sSize: %s, uSize: %s, title: %s", new Object[] { Integer.valueOf(paramInt), localObject1, localObject2, Boolean.valueOf(bool) });
      localObject1 = CardHomePageNewUI.e(this.koY);
      if (localObject1 == null)
        break label140;
      if (paramInt != 0)
        break label142;
      AppMethodBeat.o(89187);
    }
    while (true)
    {
      return localObject1;
      localObject1 = null;
      break;
      label128: localObject2 = null;
      break label51;
      label134: bool = false;
      break label64;
      label140: i = 0;
      label142: localObject1 = CardHomePageNewUI.f(this.koY);
      int j = i;
      if (localObject1 != null)
      {
        if (paramInt == i)
          AppMethodBeat.o(89187);
        else
          j = i + 1;
      }
      else
      {
        localObject1 = CardHomePageNewUI.a(this.koY);
        i = j;
        if (localObject1 != null)
        {
          if (paramInt - j < ((ArrayList)localObject1).size())
          {
            localObject1 = (CardHomePageNewUI.a)((ArrayList)localObject1).get(paramInt - j);
            AppMethodBeat.o(89187);
          }
          else
          {
            i = ((ArrayList)localObject1).size() - 1;
          }
        }
        else
        {
          j = i;
          if (CardHomePageNewUI.c(this.koY) != null)
          {
            i++;
            j = i;
            if (paramInt == i)
            {
              localObject1 = CardHomePageNewUI.c(this.koY);
              AppMethodBeat.o(89187);
            }
          }
          else
          {
            localObject1 = CardHomePageNewUI.b(this.koY);
            if ((localObject1 != null) && (paramInt > j) && (paramInt <= ((ArrayList)localObject1).size() + j))
            {
              localObject1 = (CardHomePageNewUI.a)((ArrayList)localObject1).get(paramInt - j - 1);
              AppMethodBeat.o(89187);
            }
            else
            {
              AppMethodBeat.o(89187);
              localObject1 = null;
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.d
 * JD-Core Version:    0.6.2
 */