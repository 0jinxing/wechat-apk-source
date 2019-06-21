package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ap extends AnimatedExpandableListView.a
{
  public static int[] rtD = { 2131303681, 2131303679, 2131303675, 2131303668 };
  public static int[] rth = { 2131303680, 2131303678, 2131303674, 2131303667 };
  private Context mContext;
  private LayoutInflater mInflater;
  ArrayList<String> rtE;
  public int rtF;
  public boolean rtG;
  public ArrayList<String> rtH;
  public ArrayList<String> rtI;
  public ArrayList<String> rtJ;
  public ArrayList<String> rtK;
  b rtL;
  public int style;

  public ap(Context paramContext)
  {
    AppMethodBeat.i(39050);
    this.rtF = 0;
    this.rtG = false;
    this.rtH = new ArrayList();
    this.rtI = new ArrayList();
    this.rtJ = new ArrayList();
    this.rtK = new ArrayList();
    this.rtL = null;
    this.mContext = paramContext;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    AppMethodBeat.o(39050);
  }

  private static List<String> O(List<String> paramList)
  {
    AppMethodBeat.i(39058);
    LinkedList localLinkedList = new LinkedList();
    g.RQ();
    if (!g.RN().QY())
      AppMethodBeat.o(39058);
    while (true)
    {
      return localLinkedList;
      if (paramList == null)
      {
        AppMethodBeat.o(39058);
      }
      else
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          g.RQ();
          ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
          paramList = str;
          if (localad != null)
          {
            paramList = str;
            if ((int)localad.ewQ != 0)
              paramList = localad.Oj();
          }
          localLinkedList.add(paramList);
        }
        AppMethodBeat.o(39058);
      }
    }
  }

  public static void ZF(String paramString)
  {
    AppMethodBeat.i(39054);
    ab.d("MicroMsg.Sns.AnimatedExpandableListAdapter", "recordTopFive : %s", new Object[] { paramString });
    if (ctC() != null)
    {
      ArrayList localArrayList = new ArrayList(ctC());
      if (!h(localArrayList, paramString))
      {
        if (localArrayList.size() == 5)
          localArrayList.remove(4);
        localArrayList.add(0, paramString);
        paramString = bo.c(localArrayList, ",");
        g.RQ();
        g.RP().Ry().set(335875, paramString);
      }
      AppMethodBeat.o(39054);
    }
    while (true)
    {
      return;
      g.RQ();
      g.RP().Ry().set(335875, paramString);
      AppMethodBeat.o(39054);
    }
  }

  private boolean bg(int paramInt, String paramString)
  {
    AppMethodBeat.i(39056);
    boolean bool;
    if (paramInt == 1)
    {
      bool = h(this.rtH, paramString);
      AppMethodBeat.o(39056);
    }
    while (true)
    {
      return bool;
      bool = h(this.rtI, paramString);
      AppMethodBeat.o(39056);
    }
  }

  private static List<String> ctC()
  {
    AppMethodBeat.i(39053);
    g.RQ();
    Object localObject = (String)g.RP().Ry().get(335875, null);
    ab.d("MicroMsg.Sns.AnimatedExpandableListAdapter", "dz:getTopFive : %s", new Object[] { localObject });
    if (bo.isNullOrNil((String)localObject))
    {
      AppMethodBeat.o(39053);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = bo.P(((String)localObject).split(","));
      AppMethodBeat.o(39053);
    }
  }

  private static boolean h(List<String> paramList, String paramString)
  {
    AppMethodBeat.i(39055);
    paramList = paramList.iterator();
    boolean bool;
    while (paramList.hasNext())
      if (((String)paramList.next()).equals(paramString))
      {
        bool = true;
        AppMethodBeat.o(39055);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39055);
    }
  }

  public final int Ec(int paramInt)
  {
    AppMethodBeat.i(39060);
    if ((paramInt > 1) && (this.rtE != null))
    {
      paramInt = this.rtE.size() + 1;
      AppMethodBeat.o(39060);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(39060);
    }
  }

  public final void T(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(39052);
    Object localObject1 = ctC();
    Object localObject2 = new ArrayList();
    if ((localObject1 != null) && (paramArrayList != null))
    {
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        if (h(paramArrayList, (String)localObject1))
        {
          paramArrayList.remove(localObject1);
          ((ArrayList)localObject2).add(localObject1);
        }
      }
      paramArrayList.addAll(0, (Collection)localObject2);
      localObject2 = bo.c((List)localObject2, ",");
      g.RQ();
      g.RP().Ry().set(335875, localObject2);
    }
    this.rtE = paramArrayList;
    AppMethodBeat.o(39052);
  }

  public final View d(int paramInt1, int paramInt2, View paramView)
  {
    AppMethodBeat.i(39059);
    ap.a locala;
    label153: Object localObject1;
    Object localObject2;
    if (paramView == null)
      if (this.style == 1)
      {
        paramView = this.mInflater.inflate(2130970769, null);
        locala = new ap.a(this, (byte)0);
        locala.titleView = ((TextView)paramView.findViewById(2131827789));
        locala.nQl = ((TextView)paramView.findViewById(2131827790));
        locala.rtN = ((TextView)paramView.findViewById(2131827791));
        locala.rtO = ((TextView)paramView.findViewById(2131827792));
        locala.olR = ((ImageView)paramView.findViewById(2131827787));
        locala.rtP = ((ImageView)paramView.findViewById(2131827788));
        locala.rtP.setOnClickListener(new ap.1(this));
        paramView.setTag(locala);
        localObject1 = locala.rtP;
        localObject2 = ((View)localObject1).getTag();
        if ((localObject2 != null) && ((localObject2 instanceof ap.c)))
          break label391;
        localObject2 = new ap.c(this);
        ((ap.c)localObject2).rtQ = paramInt1;
        ((ap.c)localObject2).rtR = paramInt2;
        ((View)localObject1).setTag(localObject2);
        label209: if (paramInt2 != this.rtE.size())
          break label545;
        locala.titleView.setVisibility(8);
        locala.nQl.setVisibility(8);
        locala.olR.setVisibility(8);
        locala.rtP.setVisibility(8);
        locala.rtN.setVisibility(0);
        locala.rtO.setVisibility(0);
        if (paramInt1 != 3)
          break label440;
        if (this.rtK.size() <= 0)
          break label416;
        localObject1 = bo.c(O(this.rtK), ",");
        locala.rtO.setText("√".concat(String.valueOf(localObject1)));
        locala.rtO.setVisibility(0);
        locala.rtO.setTextColor(this.mContext.getResources().getColor(2131690496));
      }
    label391: label416: label545: 
    while (true)
    {
      AppMethodBeat.o(39059);
      return paramView;
      paramView = this.mInflater.inflate(2130970768, null);
      break;
      locala = (ap.a)paramView.getTag();
      break label153;
      localObject1 = (ap.c)((View)localObject1).getTag();
      ((ap.c)localObject1).rtQ = paramInt1;
      ((ap.c)localObject1).rtR = paramInt2;
      break label209;
      locala.rtO.setText("");
      locala.rtO.setVisibility(8);
      continue;
      label440: if (paramInt1 == 2)
        if (this.rtJ.size() > 0)
        {
          localObject1 = bo.c(O(this.rtJ), ",");
          locala.rtO.setText("√".concat(String.valueOf(localObject1)));
          locala.rtO.setVisibility(0);
          locala.rtO.setTextColor(this.mContext.getResources().getColor(2131690495));
        }
        else
        {
          locala.rtO.setText("");
          locala.rtO.setVisibility(8);
          continue;
          locala.titleView.setVisibility(0);
          locala.nQl.setVisibility(0);
          locala.olR.setVisibility(0);
          locala.rtP.setVisibility(0);
          locala.rtN.setVisibility(8);
          locala.rtO.setVisibility(8);
          localObject2 = (String)this.rtE.get(paramInt2);
          locala.titleView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, (CharSequence)localObject2));
          TextView localTextView = locala.nQl;
          localObject1 = com.tencent.mm.plugin.label.a.a.bJa().PE((String)localObject2);
          Object localObject3 = com.tencent.mm.plugin.label.a.a.bJa().PH((String)localObject1);
          if ((localObject3 == null) || (((List)localObject3).size() == 0));
          for (localObject1 = ""; ; localObject1 = com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, (CharSequence)localObject1))
          {
            localTextView.setText((CharSequence)localObject1);
            locala.rtP.setImageResource(2131231952);
            if (this.style != 1)
              break label918;
            if (paramInt1 != 2)
              break label842;
            if (!bg(1, (String)localObject2))
              break label828;
            locala.olR.setImageResource(2131231937);
            break;
            localObject1 = new ArrayList(((List)localObject3).size());
            localObject3 = ((List)localObject3).iterator();
            while (((Iterator)localObject3).hasNext())
              ((ArrayList)localObject1).add(((com.tencent.mm.plugin.messenger.a.b)g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ((String)((Iterator)localObject3).next()));
            localObject1 = bo.c((List)localObject1, ",");
          }
          label828: locala.olR.setImageResource(2131231939);
          continue;
          label842: if (paramInt1 == 3)
          {
            if (this.rtF != paramInt1)
              locala.olR.setImageResource(2131231940);
            while (true)
            {
              if (!bg(2, (String)localObject2))
                break label904;
              locala.olR.setImageResource(2131231938);
              break;
              locala.olR.setImageResource(2131231938);
            }
            locala.olR.setImageResource(2131231940);
            continue;
            if (paramInt1 == 2)
            {
              if (bg(1, (String)localObject2))
                locala.olR.setImageResource(2131231117);
              else
                locala.olR.setImageResource(2131231120);
            }
            else if (paramInt1 == 3)
              if (bg(2, (String)localObject2))
                locala.olR.setImageResource(2131231119);
              else
                locala.olR.setImageResource(2131231120);
          }
        }
    }
  }

  public final Object getChild(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39051);
    Object localObject = this.rtE.get(paramInt2);
    AppMethodBeat.o(39051);
    return localObject;
  }

  public final long getChildId(int paramInt1, int paramInt2)
  {
    return 0L;
  }

  public final Object getGroup(int paramInt)
  {
    return null;
  }

  public final int getGroupCount()
  {
    return 4;
  }

  public final long getGroupId(int paramInt)
  {
    return 0L;
  }

  public final View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(39057);
    if ((paramView == null) || (!(paramView.getTag() instanceof ap.a)))
      if (this.style == 1)
      {
        paramView = this.mInflater.inflate(2130970771, null);
        paramViewGroup = new ap.a(this, (byte)0);
        paramViewGroup.titleView = ((TextView)paramView.findViewById(2131827789));
        paramViewGroup.olR = ((ImageView)paramView.findViewById(2131827787));
        paramViewGroup.nQl = ((TextView)paramView.findViewById(2131827790));
        paramView.setTag(paramViewGroup);
        label102: paramViewGroup.titleView.setText(rth[paramInt]);
        paramViewGroup.nQl.setText(rtD[paramInt]);
        switch (paramInt)
        {
        default:
          label160: if ((this.rtG) && (paramInt == 1))
          {
            paramView = new View(this.mContext);
            paramView.setVisibility(8);
            AppMethodBeat.o(39057);
          }
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
    while (true)
    {
      return paramView;
      paramView = this.mInflater.inflate(2130970770, null);
      break;
      paramViewGroup = (ap.a)paramView.getTag();
      break label102;
      if (this.rtF != paramInt)
      {
        paramViewGroup.olR.setImageResource(2131231852);
        break label160;
      }
      paramViewGroup.olR.setImageResource(2131231853);
      paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
      break label160;
      if (this.rtF != paramInt)
      {
        paramViewGroup.olR.setImageResource(2131231852);
        break label160;
      }
      paramViewGroup.olR.setImageResource(2131231853);
      paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
      break label160;
      if (this.style == 1)
      {
        if (this.rtF != paramInt)
        {
          paramViewGroup.olR.setImageResource(2131231852);
          break label160;
        }
        paramViewGroup.olR.setImageResource(2131231877);
        paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
        break label160;
      }
      if (this.rtF != paramInt)
      {
        paramViewGroup.olR.setImageResource(2131231852);
        break label160;
      }
      paramViewGroup.olR.setImageResource(2131231854);
      paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
      break label160;
      AppMethodBeat.o(39057);
    }
  }

  public final boolean hasStableIds()
  {
    return false;
  }

  public final boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    return true;
  }

  public static abstract interface b
  {
    public abstract void a(ap.c paramc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ap
 * JD-Core Version:    0.6.2
 */