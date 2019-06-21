package com.tencent.mm.plugin.recharge.ui;

import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MallEditText$a$a extends Filter
{
  private MallEditText$a$a(MallEditText.a parama)
  {
  }

  private static int[] fJ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(44218);
    if (paramString1.equals(paramString2))
    {
      paramString1 = com.tencent.mm.plugin.recharge.model.a.pFK;
      AppMethodBeat.o(44218);
    }
    while (true)
    {
      return paramString1;
      if ((paramString2 != null) && (paramString1.length() == paramString2.length()))
      {
        int i = 0;
        int[] arrayOfInt = new int[2];
        int[] tmp46_45 = arrayOfInt;
        tmp46_45[0] = -1;
        int[] tmp50_46 = tmp46_45;
        tmp50_46[1] = -1;
        tmp50_46;
        int j = paramString1.length() - 1;
        int k;
        while (true)
        {
          k = i;
          if (j <= 0)
            break;
          k = i;
          if (paramString2.charAt(j) != paramString1.charAt(j))
          {
            i++;
            k = i;
            if (i > 2)
              break;
            arrayOfInt[(i - 1)] = j;
            k = i;
          }
          j--;
          i = k;
        }
        if (k <= 2)
        {
          AppMethodBeat.o(44218);
          paramString1 = arrayOfInt;
        }
      }
      else
      {
        paramString1 = com.tencent.mm.plugin.recharge.model.a.pFL;
        AppMethodBeat.o(44218);
      }
    }
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults;
    ArrayList localArrayList;
    Object localObject1;
    try
    {
      AppMethodBeat.i(44217);
      localFilterResults = new android/widget/Filter$FilterResults;
      localFilterResults.<init>();
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (paramCharSequence != null);
      for (localObject1 = b.ws(paramCharSequence.toString()); ((String)localObject1).equals(MallEditText.a.a(this.pGH)); localObject1 = "")
      {
        paramCharSequence = MallEditText.a(this.pGH.pGB);
        localObject1 = new com/tencent/mm/plugin/recharge/ui/MallEditText$a$a$1;
        ((MallEditText.a.a.1)localObject1).<init>(this);
        paramCharSequence.post((Runnable)localObject1);
        AppMethodBeat.o(44217);
        return localFilterResults;
      }
      MallEditText.a.a(this.pGH, (String)localObject1);
      if (this.pGH.pGB.asa())
        break label374;
      if (bo.isNullOrNil(MallEditText.a.a(this.pGH)))
        break label354;
      ab.d("MicroMsg.MallEditText", "performFiltering ".concat(String.valueOf(paramCharSequence)));
      paramCharSequence = MallEditText.a.b(this.pGH).iterator();
      while (paramCharSequence.hasNext())
      {
        localObject1 = (com.tencent.mm.plugin.recharge.model.a)paramCharSequence.next();
        if (((com.tencent.mm.plugin.recharge.model.a)localObject1).pFM.startsWith(MallEditText.a.a(this.pGH)))
          localArrayList.add(localObject1);
      }
    }
    finally
    {
    }
    boolean bool = false;
    label219: if (localArrayList.size() == 0)
    {
      localObject1 = MallEditText.a(this.pGH.pGB);
      paramCharSequence = new com/tencent/mm/plugin/recharge/ui/MallEditText$a$a$2;
      paramCharSequence.<init>(this);
      ((AutoCompleteTextView)localObject1).post(paramCharSequence);
      bool = false;
    }
    while (true)
    {
      label354: label374: Object localObject2;
      while (true)
      {
        paramCharSequence = this.pGH.pGC;
        this.pGH.pGC = localArrayList;
        this.pGH.pGD = bool;
        localFilterResults.count = this.pGH.pGC.size();
        localFilterResults.values = this.pGH.pGC;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("results.count ");
        ab.d("MicroMsg.MallEditText", localFilterResults.count);
        paramCharSequence.clear();
        AppMethodBeat.o(44217);
        break;
        localArrayList.addAll(MallEditText.a.b(this.pGH));
        bool = false;
        break label219;
        long l = System.currentTimeMillis();
        ab.d("MicroMsg.MallEditText", "performFiltering ".concat(String.valueOf(paramCharSequence)));
        paramCharSequence = MallEditText.a.b(this.pGH).iterator();
        while (paramCharSequence.hasNext())
        {
          localObject1 = (com.tencent.mm.plugin.recharge.model.a)paramCharSequence.next();
          if (((com.tencent.mm.plugin.recharge.model.a)localObject1).pFM.equals(MallEditText.a.a(this.pGH)))
          {
            ((com.tencent.mm.plugin.recharge.model.a)localObject1).pFO = com.tencent.mm.plugin.recharge.model.a.pFK;
            localArrayList.clear();
            localArrayList.add(localObject1);
          }
        }
        if (localArrayList.size() <= 0)
        {
          paramCharSequence = MallEditText.f(this.pGH.pGB);
          if (paramCharSequence != null);
        }
        try
        {
          MallEditText.a(this.pGH.pGB, com.tencent.mm.pluginsdk.a.cJ(this.pGH.pGB.getContext()));
          if (MallEditText.f(this.pGH.pGB) != null)
          {
            localObject2 = MallEditText.f(this.pGH.pGB).iterator();
            if (((Iterator)localObject2).hasNext())
            {
              paramCharSequence = (String[])((Iterator)localObject2).next();
              localObject1 = b.ws(paramCharSequence[2]);
              arrayOfInt = fJ(MallEditText.a.a(this.pGH), (String)localObject1);
              if (!com.tencent.mm.plugin.recharge.model.a.pFK.equals(arrayOfInt))
                break label696;
              localObject2 = new com/tencent/mm/plugin/recharge/model/a;
              ((com.tencent.mm.plugin.recharge.model.a)localObject2).<init>((String)localObject1, paramCharSequence[1], 1);
              ((com.tencent.mm.plugin.recharge.model.a)localObject2).pFO = com.tencent.mm.plugin.recharge.model.a.pFK;
              localArrayList.clear();
              localArrayList.add(localObject2);
            }
          }
          paramCharSequence = new java/lang/StringBuilder;
          paramCharSequence.<init>(" search phone number cost ");
          ab.d("MicroMsg.MallEditText", System.currentTimeMillis() - l + " ms ");
          bool = true;
        }
        catch (Exception paramCharSequence)
        {
          while (true)
          {
            int[] arrayOfInt;
            ab.printErrStackTrace("MicroMsg.MallEditText", paramCharSequence, "", new Object[0]);
            continue;
            label696: if ((!com.tencent.mm.plugin.recharge.model.a.pFL.equals(arrayOfInt)) && (localArrayList.size() < 5))
            {
              com.tencent.mm.plugin.recharge.model.a locala = new com/tencent/mm/plugin/recharge/model/a;
              locala.<init>((String)localObject1, paramCharSequence[1], 1);
              locala.pFO = arrayOfInt;
              localArrayList.add(locala);
            }
          }
        }
      }
      if ((localArrayList.size() == 1) && (this.pGH.pGB.asa()))
      {
        localObject1 = (com.tencent.mm.plugin.recharge.model.a)localArrayList.get(0);
        if (com.tencent.mm.plugin.recharge.model.a.pFK.equals(((com.tencent.mm.plugin.recharge.model.a)localObject1).pFO))
        {
          localObject2 = MallEditText.a(this.pGH.pGB);
          paramCharSequence = new com/tencent/mm/plugin/recharge/ui/MallEditText$a$a$3;
          paramCharSequence.<init>(this, (com.tencent.mm.plugin.recharge.model.a)localObject1);
          ((AutoCompleteTextView)localObject2).post(paramCharSequence);
          bool = false;
        }
      }
    }
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.MallEditText.a.a
 * JD-Core Version:    0.6.2
 */