package com.tencent.mm.plugin.account.friend.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.aym;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.applet.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i extends BaseAdapter
{
  private Context context;
  public List<String[]> gsD;
  public int[] gty;
  public LinkedList<aym> gvi;
  private LinkedList<aym> gvj;
  private List<String[]> gvk;
  private i.a gvl;
  public b gvm;
  private b.b gvn;
  int showType;

  public i(Context paramContext, i.a parama, int paramInt)
  {
    AppMethodBeat.i(108344);
    this.gvi = new LinkedList();
    this.gvj = new LinkedList();
    this.gvk = new LinkedList();
    this.showType = 1;
    this.gvm = new b(new i.1(this));
    this.gvn = null;
    this.context = paramContext;
    this.showType = paramInt;
    this.gvl = parama;
    this.gty = new int[this.gvi.size()];
    AppMethodBeat.o(108344);
  }

  private void a(aym paramaym, String[] paramArrayOfString)
  {
    AppMethodBeat.i(108349);
    Iterator localIterator = this.gvj.iterator();
    while (localIterator.hasNext())
    {
      aym localaym = (aym)localIterator.next();
      if ((localaym.pXM != null) && (paramaym.pXM != null) && (localaym.pXM.equals(paramaym.pXM)))
      {
        ab.d("MicroMsg.FriendAdapter", "tigerreg mobile already added");
        AppMethodBeat.o(108349);
      }
    }
    while (true)
    {
      return;
      this.gvj.add(paramaym);
      paramaym = paramArrayOfString[2];
      paramArrayOfString = paramArrayOfString[1];
      this.gvk.add(new String[] { paramaym, paramArrayOfString });
      AppMethodBeat.o(108349);
    }
  }

  public final boolean apN()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.gty != null)
    {
      if (this.gty.length != 0)
        break label23;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label23: int i = 0;
      if (i < this.gty.length)
      {
        int j = this.gty[i];
        if (this.showType == 1)
        {
          bool2 = bool1;
          if (j == 0);
        }
        else
        {
          while ((this.showType != 2) || (j != 0))
          {
            i++;
            break;
          }
          bool2 = bool1;
        }
      }
      else
      {
        bool2 = true;
      }
    }
  }

  public final void dl(boolean paramBoolean)
  {
    AppMethodBeat.i(108346);
    int i;
    int[] arrayOfInt;
    int j;
    if (this.showType == 1)
    {
      i = 0;
      if (i < this.gty.length)
      {
        arrayOfInt = this.gty;
        if (paramBoolean);
        for (j = 1; ; j = 0)
        {
          arrayOfInt[i] = j;
          i++;
          break;
        }
      }
    }
    else if (this.showType == 2)
    {
      i = 0;
      if (i < this.gty.length)
      {
        arrayOfInt = this.gty;
        if (paramBoolean);
        for (j = 2; ; j = 0)
        {
          arrayOfInt[i] = j;
          i++;
          break;
        }
      }
    }
    notifyDataSetChanged();
    AppMethodBeat.o(108346);
  }

  public final int getCount()
  {
    AppMethodBeat.i(108350);
    int i = this.gvi.size();
    AppMethodBeat.o(108350);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(108352);
    long l = ((aym)this.gvi.get(paramInt)).hashCode();
    AppMethodBeat.o(108352);
    return l;
  }

  public final int getSelectCount()
  {
    int[] arrayOfInt = this.gty;
    int i = arrayOfInt.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      int m = arrayOfInt[j];
      int n;
      if (this.showType == 1)
      {
        n = k;
        if (m == 1)
          n = k + 1;
      }
      while (true)
      {
        j++;
        k = n;
        break;
        n = k;
        if (this.showType == 2)
        {
          n = k;
          if (m == 2)
            n = k + 1;
        }
      }
    }
    return k;
  }

  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(108353);
    if (this.showType == 1)
    {
      if (this.gvn == null)
        this.gvn = new b.b()
        {
          public final int apO()
          {
            AppMethodBeat.i(108340);
            int i = i.this.getCount();
            AppMethodBeat.o(108340);
            return i;
          }

          public final String mW(int paramAnonymousInt)
          {
            String str = null;
            AppMethodBeat.i(108339);
            if ((paramAnonymousInt < 0) || (paramAnonymousInt >= i.this.getCount()))
            {
              ab.e("MicroMsg.FriendAdapter", "pos is invalid");
              AppMethodBeat.o(108339);
            }
            while (true)
            {
              return str;
              aym localaym = i.this.mV(paramAnonymousInt);
              if (localaym == null)
              {
                AppMethodBeat.o(108339);
              }
              else
              {
                str = localaym.jBB;
                AppMethodBeat.o(108339);
              }
            }
          }
        };
      if (this.gvm != null)
        this.gvm.a(paramInt, this.gvn);
    }
    aym localaym = (aym)this.gvi.get(paramInt);
    i.b localb;
    if (paramView == null)
    {
      localb = new i.b();
      if (this.showType == 1)
      {
        paramView = View.inflate(this.context, 2130969550, null);
        localb.gtG = ((TextView)paramView.findViewById(2131824020));
        localb.gvr = ((TextView)paramView.findViewById(2131824025));
        localb.gvs = ((Button)paramView.findViewById(2131824023));
        localb.gvt = ((Button)paramView.findViewById(2131824024));
        localb.gvq = ((ImageView)paramView.findViewById(2131824019));
        localb.gvu = ((TextView)paramView.findViewById(2131824021));
        localb.gvv = ((TextView)paramView.findViewById(2131824022));
        paramView.setTag(localb);
        paramViewGroup = localb;
        paramViewGroup.gvv.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(108341);
            paramAnonymousView = i.this;
            int i = paramInt;
            if (paramAnonymousView.showType == 1)
              paramAnonymousView.gty[i] = 0;
            while (true)
            {
              paramAnonymousView.notifyDataSetChanged();
              AppMethodBeat.o(108341);
              return;
              if (paramAnonymousView.showType == 2)
                paramAnonymousView.gty[i] = 0;
            }
          }
        });
        if (this.showType != 1)
          break label513;
        if (bo.isNullOrNil(((String[])this.gvk.get(paramInt))[1]))
          break label472;
        paramViewGroup.gtG.setText(((String[])this.gvk.get(paramInt))[1]);
        label270: paramViewGroup.gvs.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(108342);
            i.this.mU(paramInt);
            AppMethodBeat.o(108342);
          }
        });
        a.b.b(paramViewGroup.gvq, localaym.jBB);
        label298: switch (this.gty[paramInt])
        {
        default:
        case 1:
        case 3:
        case 2:
        case 0:
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(108353);
      return paramView;
      paramViewGroup = localb;
      if (this.showType != 2)
        break;
      paramView = View.inflate(this.context, 2130969551, null);
      localb.gtG = ((TextView)paramView.findViewById(2131824020));
      localb.gvr = ((TextView)paramView.findViewById(2131824025));
      localb.gvs = ((Button)paramView.findViewById(2131824023));
      localb.gvt = ((Button)paramView.findViewById(2131824024));
      localb.gvu = ((TextView)paramView.findViewById(2131824021));
      localb.gvv = ((TextView)paramView.findViewById(2131824022));
      paramView.setTag(localb);
      paramViewGroup = localb;
      break;
      paramViewGroup = (i.b)paramView.getTag();
      break;
      label472: if (bo.isNullOrNil(localaym.jCH))
      {
        paramViewGroup.gtG.setText(localaym.jBB);
        break label270;
      }
      paramViewGroup.gtG.setText(localaym.jCH);
      break label270;
      label513: if (this.showType != 2)
        break label298;
      paramViewGroup.gtG.setText(((String[])this.gvk.get(paramInt))[1]);
      paramViewGroup.gvt.setOnClickListener(new i.5(this, paramInt));
      break label298;
      paramViewGroup.gvs.setVisibility(8);
      paramViewGroup.gvr.setVisibility(0);
      paramViewGroup.gvu.setVisibility(0);
      paramViewGroup.gvv.setVisibility(0);
      continue;
      paramViewGroup.gvs.setVisibility(8);
      paramViewGroup.gvr.setVisibility(0);
      paramViewGroup.gvu.setVisibility(0);
      paramViewGroup.gvv.setVisibility(0);
      continue;
      paramViewGroup.gvs.setVisibility(8);
      paramViewGroup.gvt.setVisibility(8);
      paramViewGroup.gvr.setVisibility(0);
      paramViewGroup.gvu.setVisibility(0);
      paramViewGroup.gvv.setVisibility(0);
      continue;
      if (this.showType == 1)
      {
        paramViewGroup.gvr.setVisibility(8);
        paramViewGroup.gvs.setVisibility(0);
        paramViewGroup.gvt.setVisibility(8);
        paramViewGroup.gvu.setVisibility(8);
        paramViewGroup.gvv.setVisibility(8);
      }
      else if (this.showType == 2)
      {
        paramViewGroup.gvr.setVisibility(8);
        paramViewGroup.gvs.setVisibility(8);
        paramViewGroup.gvt.setVisibility(0);
        paramViewGroup.gvu.setVisibility(8);
        paramViewGroup.gvv.setVisibility(8);
      }
    }
  }

  public final void mU(int paramInt)
  {
    AppMethodBeat.i(108345);
    if (this.showType == 1)
      this.gty[paramInt] = 1;
    while (true)
    {
      notifyDataSetChanged();
      AppMethodBeat.o(108345);
      return;
      if (this.showType == 2)
        this.gty[paramInt] = 2;
    }
  }

  public final aym mV(int paramInt)
  {
    AppMethodBeat.i(108351);
    aym localaym = (aym)this.gvi.get(paramInt);
    AppMethodBeat.o(108351);
    return localaym;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(108347);
    super.notifyDataSetChanged();
    if (this.gvl != null)
      this.gvl.notifyDataSetChanged();
    AppMethodBeat.o(108347);
  }

  public final void r(LinkedList<aym> paramLinkedList)
  {
    AppMethodBeat.i(108348);
    if (paramLinkedList != null)
    {
      this.gvj.clear();
      this.gvi.clear();
      this.gvk.clear();
      Iterator localIterator1 = this.gsD.iterator();
      while (localIterator1.hasNext())
      {
        String[] arrayOfString = (String[])localIterator1.next();
        Iterator localIterator2 = paramLinkedList.iterator();
        while (localIterator2.hasNext())
        {
          aym localaym = (aym)localIterator2.next();
          if (this.showType == 1)
          {
            if (((localaym.jBT == 1) || (localaym.jBT == 0)) && (!bo.isNullOrNil(arrayOfString[2])) && (localaym.pXM.equals(com.tencent.mm.a.g.x(arrayOfString[2].getBytes()))))
              a(localaym, arrayOfString);
          }
          else if ((this.showType == 2) && (localaym.jBT == 2) && (!bo.isNullOrNil(arrayOfString[2])) && (localaym.pXM.equals(com.tencent.mm.a.g.x(arrayOfString[2].getBytes()))))
            a(localaym, arrayOfString);
        }
      }
    }
    this.gty = new int[this.gvj.size()];
    this.gvi.addAll(this.gvj);
    this.gvj.clear();
    AppMethodBeat.o(108348);
  }

  public final void wc(String paramString)
  {
    AppMethodBeat.i(108354);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.gvk.size(); i++)
      if (this.gty[i] == 2)
        localArrayList.add(((String[])this.gvk.get(i))[0]);
    paramString = new ai(paramString, localArrayList);
    com.tencent.mm.kernel.g.Rg().a(paramString, 0);
    AppMethodBeat.o(108354);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.i
 * JD-Core Version:    0.6.2
 */