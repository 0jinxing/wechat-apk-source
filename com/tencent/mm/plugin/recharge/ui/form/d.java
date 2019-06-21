package com.tencent.mm.plugin.recharge.ui.form;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends BaseAdapter
  implements Filterable
{
  private static String TAG = "MicroMsg.MobileHistoryAdapter";
  private Context mContext;
  public List<com.tencent.mm.plugin.recharge.model.a> pGC;
  public boolean pGD;
  private List<com.tencent.mm.plugin.recharge.model.a> pGE;
  private String pGG;
  private AutoCompleteTextView pGt;
  private List<String[]> pGw;
  private b pIT;
  public d pIU;
  public a pIV;
  private MallFormView pIg;

  public d(MallFormView paramMallFormView, List<String[]> paramList)
  {
    AppMethodBeat.i(44410);
    this.pGC = new ArrayList();
    this.pGD = false;
    this.pIU = null;
    this.pIV = null;
    this.mContext = paramMallFormView.getContext();
    this.pIg = paramMallFormView;
    this.pGt = ((AutoCompleteTextView)paramMallFormView.getContentEditText());
    this.pGw = paramList;
    AppMethodBeat.o(44410);
  }

  public final com.tencent.mm.plugin.recharge.model.a BA(int paramInt)
  {
    com.tencent.mm.plugin.recharge.model.a locala1 = null;
    while (true)
    {
      try
      {
        AppMethodBeat.i(44414);
        if (!this.pGD)
          break label79;
        if (paramInt == 0)
        {
          AppMethodBeat.o(44414);
          return locala1;
        }
        if (paramInt <= this.pGC.size())
        {
          locala1 = (com.tencent.mm.plugin.recharge.model.a)this.pGC.get(paramInt - 1);
          AppMethodBeat.o(44414);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(44414);
      continue;
      label79: if (paramInt < this.pGC.size())
      {
        com.tencent.mm.plugin.recharge.model.a locala2 = (com.tencent.mm.plugin.recharge.model.a)this.pGC.get(paramInt);
        AppMethodBeat.o(44414);
      }
      else
      {
        AppMethodBeat.o(44414);
      }
    }
  }

  public final void cK(List<com.tencent.mm.plugin.recharge.model.a> paramList)
  {
    try
    {
      AppMethodBeat.i(44411);
      this.pGE = paramList;
      this.pGC.clear();
      this.pGD = false;
      notifyDataSetChanged();
      AppMethodBeat.o(44411);
      return;
    }
    finally
    {
      paramList = finally;
    }
    throw paramList;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44413);
    int i;
    if (this.pGD)
    {
      i = this.pGC.size() + 2;
      AppMethodBeat.o(44413);
    }
    while (true)
    {
      return i;
      if (this.pGC.size() > 0)
      {
        i = this.pGC.size() + 1;
        AppMethodBeat.o(44413);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(44413);
      }
    }
  }

  public final Filter getFilter()
  {
    AppMethodBeat.i(44412);
    ab.d(TAG, "getFilter");
    if (this.pIT == null)
      this.pIT = new b((byte)0);
    b localb = this.pIT;
    AppMethodBeat.o(44412);
    return localb;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(44416);
    if (this.pGD)
      if (paramInt == 0)
      {
        paramInt = 2;
        AppMethodBeat.o(44416);
      }
    while (true)
    {
      return paramInt;
      if (paramInt <= this.pGC.size())
      {
        AppMethodBeat.o(44416);
        paramInt = i;
      }
      else
      {
        paramInt = 3;
        AppMethodBeat.o(44416);
        continue;
        if (paramInt < this.pGC.size())
        {
          AppMethodBeat.o(44416);
          paramInt = i;
        }
        else
        {
          paramInt = 1;
          AppMethodBeat.o(44416);
        }
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44415);
    switch (getItemViewType(paramInt))
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(44415);
      return paramView;
      c localc;
      label147: com.tencent.mm.plugin.recharge.model.a locala;
      SpannableStringBuilder localSpannableStringBuilder;
      int j;
      label282: int k;
      label393: label668: if (paramView == null)
      {
        paramViewGroup = View.inflate(this.mContext, 2130970472, null);
        localc = new c((byte)0);
        localc.pGK = ((TextView)paramViewGroup.findViewById(2131826879));
        localc.gtb = ((TextView)paramViewGroup.findViewById(2131826880));
        localc.pIY = ((ImageView)paramViewGroup.findViewById(2131826878));
        paramViewGroup.setTag(localc);
        if ((localc != null) && (localc.pIY != null))
        {
          if (paramInt == 0)
            localc.pIY.setVisibility(0);
        }
        else
        {
          locala = BA(paramInt);
          paramView = paramViewGroup;
          if (locala == null)
            continue;
          paramView = paramViewGroup;
          if (localc == null)
            continue;
          paramView = paramViewGroup;
          if (localc.pGK == null)
            continue;
          paramView = paramViewGroup;
          if (localc.gtb == null)
            continue;
          paramView = b.VB(locala.pFM);
          ab.d(TAG, "record.record " + paramView + ", record.name " + locala.name + "，record.location " + locala.pFN);
          if (com.tencent.mm.plugin.recharge.model.a.pFK.equals(locala.pFO))
            break label587;
          localSpannableStringBuilder = new SpannableStringBuilder(paramView);
          paramView = locala.pFO;
          int i = paramView.length;
          j = 0;
          if (j >= i)
            break label393;
          k = paramView[j];
          if (k >= 0)
          {
            if (k < 7)
              break label376;
            paramInt = k + 2;
          }
        }
      }
      else
      {
        while (true)
        {
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(2131690378)), paramInt, paramInt + 1, 34);
          j++;
          break label282;
          localc = (c)paramView.getTag();
          paramViewGroup = paramView;
          break;
          localc.pIY.setVisibility(8);
          break label147;
          label376: paramInt = k;
          if (k >= 3)
            paramInt = k + 1;
        }
        localc.pGK.setTextSize(24.0F);
        localc.pGK.setTextColor(this.mContext.getResources().getColor(2131690316));
        localc.gtb.setTextColor(this.mContext.getResources().getColor(2131690316));
        localc.pGK.setText(localSpannableStringBuilder);
        label456: if ((locala.name != null) && (!bo.isNullOrNil(locala.name.trim())))
        {
          if (!bo.isNullOrNil(locala.pFN))
            localc.gtb.setText(locala.name + this.mContext.getString(2131305272, new Object[] { locala.pFN }));
          while (true)
          {
            if (!locala.name.equals(this.mContext.getString(2131305280)))
              break label668;
            localc.gtb.setTextColor(this.mContext.getResources().getColor(2131690375));
            paramView = paramViewGroup;
            break;
            label587: localc.pGK.setTextSize(16.0F);
            localc.pGK.setTextColor(this.mContext.getResources().getColor(2131690164));
            localc.gtb.setTextColor(this.mContext.getResources().getColor(2131690164));
            localc.pGK.setText(paramView);
            break label456;
            localc.gtb.setText(locala.name);
          }
          localc.gtb.setTextColor(this.mContext.getResources().getColor(2131690312));
          paramView = paramViewGroup;
        }
        else if (!bo.isNullOrNil(locala.pFN))
        {
          localc.gtb.setText(this.mContext.getString(2131305282) + this.mContext.getString(2131305272, new Object[] { locala.pFN }));
          paramView = paramViewGroup;
        }
        else
        {
          localc.gtb.setText(this.mContext.getString(2131305282));
          paramView = paramViewGroup;
          continue;
          paramView = View.inflate(this.mContext, 2130970471, null);
          paramView.setOnClickListener(new d.1(this));
          continue;
          paramView = View.inflate(this.mContext, 2130970473, null);
          paramView.setOnClickListener(new d.2(this));
          continue;
          paramView = View.inflate(this.mContext, 2130970473, null);
          ((TextView)paramView.findViewById(2131826882)).setText(2131301384);
          paramView.setOnClickListener(new d.3(this));
        }
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 4;
  }

  public static abstract interface a
  {
    public abstract void cen();
  }

  final class b extends Filter
  {
    private b()
    {
    }

    private static int[] fJ(String paramString1, String paramString2)
    {
      AppMethodBeat.i(44409);
      if (paramString1.equals(paramString2))
      {
        paramString1 = com.tencent.mm.plugin.recharge.model.a.pFK;
        AppMethodBeat.o(44409);
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
            AppMethodBeat.o(44409);
            paramString1 = arrayOfInt;
          }
        }
        else
        {
          paramString1 = com.tencent.mm.plugin.recharge.model.a.pFL;
          AppMethodBeat.o(44409);
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
        AppMethodBeat.i(44407);
        localFilterResults = new android/widget/Filter$FilterResults;
        localFilterResults.<init>();
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        if (paramCharSequence != null);
        for (localObject1 = b.ws(paramCharSequence.toString()); (((String)localObject1).equals(d.d(d.this))) && (!((String)localObject1).equals("")); localObject1 = "")
        {
          localObject1 = d.a(d.this);
          paramCharSequence = new com/tencent/mm/plugin/recharge/ui/form/d$b$1;
          paramCharSequence.<init>(this);
          ((AutoCompleteTextView)localObject1).post(paramCharSequence);
          AppMethodBeat.o(44407);
          return localFilterResults;
        }
        d.a(d.this, (String)localObject1);
        if (d.b(d.this).asa())
          break label298;
        if (bo.isNullOrNil(d.d(d.this)))
          break label278;
        ab.i(d.TAG, "performFiltering1 ".concat(String.valueOf(paramCharSequence)));
        paramCharSequence = d.e(d.this).iterator();
        while (paramCharSequence.hasNext())
        {
          localObject1 = (com.tencent.mm.plugin.recharge.model.a)paramCharSequence.next();
          if (((com.tencent.mm.plugin.recharge.model.a)localObject1).pFM.startsWith(d.d(d.this)))
            localArrayList.add(localObject1);
        }
      }
      finally
      {
      }
      boolean bool = false;
      label226: localFilterResults.count = localArrayList.size();
      localFilterResults.values = localArrayList;
      d.this.pGD = bool;
      if (localArrayList.size() == 0);
      for (d.b(d.this).pIQ = true; ; d.b(d.this).pIQ = false)
      {
        AppMethodBeat.o(44407);
        break;
        label278: localArrayList.addAll(d.e(d.this));
        bool = false;
        break label226;
        label298: long l = System.currentTimeMillis();
        ab.i(d.TAG, "performFiltering2 ".concat(String.valueOf(paramCharSequence)));
        paramCharSequence = com.tencent.mm.plugin.recharge.a.a.cec();
        if ((paramCharSequence != null) && (((String)localObject1).equals(paramCharSequence.pFM)))
        {
          AppMethodBeat.o(44407);
          break;
        }
        if ((d.f(d.this) == null) || (d.f(d.this).isEmpty()))
          d.a(d.this, com.tencent.mm.pluginsdk.a.cJ(d.g(d.this)));
        Object localObject2;
        if (d.f(d.this) != null)
        {
          Iterator localIterator = d.f(d.this).iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label531;
            localObject1 = (String[])localIterator.next();
            paramCharSequence = b.ws(localObject1[2]);
            int[] arrayOfInt = fJ(d.d(d.this), paramCharSequence);
            if (com.tencent.mm.plugin.recharge.model.a.pFK.equals(arrayOfInt))
            {
              AppMethodBeat.o(44407);
              break;
            }
            if ((!com.tencent.mm.plugin.recharge.model.a.pFL.equals(arrayOfInt)) && (localArrayList.size() < 4))
            {
              localObject2 = new com/tencent/mm/plugin/recharge/model/a;
              ((com.tencent.mm.plugin.recharge.model.a)localObject2).<init>(paramCharSequence, localObject1[1], 1);
              ((com.tencent.mm.plugin.recharge.model.a)localObject2).pFO = arrayOfInt;
              localArrayList.add(localObject2);
            }
          }
        }
        label531: localObject1 = com.tencent.mm.plugin.recharge.a.a.cea().ceb().iterator();
        while (true)
        {
          if (!((Iterator)localObject1).hasNext())
            break label645;
          paramCharSequence = (com.tencent.mm.plugin.recharge.model.a)((Iterator)localObject1).next();
          localObject2 = b.ws(paramCharSequence.pFM);
          localObject2 = fJ(d.d(d.this), (String)localObject2);
          if (com.tencent.mm.plugin.recharge.model.a.pFK.equals(localObject2))
          {
            AppMethodBeat.o(44407);
            break;
          }
          if ((!com.tencent.mm.plugin.recharge.model.a.pFL.equals(localObject2)) && (localArrayList.size() < 4))
          {
            paramCharSequence.pFO = ((int[])localObject2);
            localArrayList.add(paramCharSequence);
          }
        }
        label645: localObject1 = d.TAG;
        paramCharSequence = new java/lang/StringBuilder;
        paramCharSequence.<init>(" search phone number cost ");
        ab.d((String)localObject1, System.currentTimeMillis() - l + " ms ");
        bool = true;
        break label226;
      }
    }

    protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
    {
      AppMethodBeat.i(44408);
      if (paramFilterResults.values == null)
      {
        d.this.pGC = new ArrayList();
        if (paramFilterResults.count != 0)
          break label109;
      }
      label109: for (d.b(d.this).pIQ = true; ; d.b(d.this).pIQ = false)
      {
        ab.i(d.TAG, "results.count " + paramFilterResults.count);
        if (paramFilterResults.count > 0)
          d.this.notifyDataSetChanged();
        AppMethodBeat.o(44408);
        return;
        d.this.pGC = ((List)paramFilterResults.values);
        break;
      }
    }
  }

  final class c
  {
    TextView gtb;
    TextView pGK;
    ImageView pIY;

    private c()
    {
    }
  }

  public static abstract interface d
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.d
 * JD-Core Version:    0.6.2
 */