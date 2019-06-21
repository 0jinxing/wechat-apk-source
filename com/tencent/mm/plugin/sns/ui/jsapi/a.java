package com.tencent.mm.plugin.sns.ui.jsapi;

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

public final class a extends AnimatedExpandableListView.a
{
  private Context mContext;
  private LayoutInflater mInflater;
  public int rJl;
  public int rJm;
  public int rJn;
  public int rJo;
  int rJu;
  List<String> rJv;
  a.b rJw;
  boolean rJx;
  public int[] rtD;
  ArrayList<String> rtE;
  public int rtF;
  public boolean rtG;
  public ArrayList<String> rtH;
  public ArrayList<String> rtI;
  public ArrayList<String> rtJ;
  public ArrayList<String> rtK;
  public int[] rth;
  public int style;

  public a(Context paramContext)
  {
    AppMethodBeat.i(40218);
    this.rJu = 4;
    this.rJl = 0;
    this.rJm = 1;
    this.rJn = 2;
    this.rJo = 3;
    this.rth = new int[] { 2131303680, 2131303678, 2131303674, 2131303667 };
    this.rtD = new int[] { 2131303681, 2131303679, 2131303675, 2131303668 };
    this.rtF = 0;
    this.rtG = false;
    this.rtH = new ArrayList();
    this.rtI = new ArrayList();
    this.rtJ = new ArrayList();
    this.rtK = new ArrayList();
    this.rJw = null;
    this.rJx = true;
    this.mContext = paramContext;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    AppMethodBeat.o(40218);
  }

  private static List<String> O(List<String> paramList)
  {
    AppMethodBeat.i(40226);
    LinkedList localLinkedList = new LinkedList();
    g.RQ();
    if (!g.RN().QY())
      AppMethodBeat.o(40226);
    while (true)
    {
      return localLinkedList;
      if (paramList == null)
      {
        AppMethodBeat.o(40226);
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
        AppMethodBeat.o(40226);
      }
    }
  }

  public static void ZF(String paramString)
  {
    AppMethodBeat.i(40222);
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
      AppMethodBeat.o(40222);
    }
    while (true)
    {
      return;
      g.RQ();
      g.RP().Ry().set(335875, paramString);
      AppMethodBeat.o(40222);
    }
  }

  private boolean bg(int paramInt, String paramString)
  {
    AppMethodBeat.i(40224);
    boolean bool;
    if (paramInt == 1)
    {
      bool = h(this.rtH, paramString);
      AppMethodBeat.o(40224);
    }
    while (true)
    {
      return bool;
      bool = h(this.rtI, paramString);
      AppMethodBeat.o(40224);
    }
  }

  private static List<String> ctC()
  {
    AppMethodBeat.i(40221);
    g.RQ();
    Object localObject = (String)g.RP().Ry().get(335875, null);
    ab.d("MicroMsg.Sns.AnimatedExpandableListAdapter", "dz:getTopFive : %s", new Object[] { localObject });
    if (bo.isNullOrNil((String)localObject))
    {
      AppMethodBeat.o(40221);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = bo.P(((String)localObject).split(","));
      AppMethodBeat.o(40221);
    }
  }

  private static boolean h(List<String> paramList, String paramString)
  {
    AppMethodBeat.i(40223);
    paramList = paramList.iterator();
    boolean bool;
    while (paramList.hasNext())
      if (((String)paramList.next()).equals(paramString))
      {
        bool = true;
        AppMethodBeat.o(40223);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(40223);
    }
  }

  public final int Ec(int paramInt)
  {
    AppMethodBeat.i(40228);
    if ((("visible".equals(this.rJv.get(paramInt))) || ("invisible".equals(this.rJv.get(paramInt)))) && (this.rtE != null))
    {
      paramInt = this.rtE.size() + 1;
      AppMethodBeat.o(40228);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(40228);
    }
  }

  public final void T(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(40220);
    Object localObject1 = ctC();
    Object localObject2 = new ArrayList();
    if ((localObject1 != null) && (paramArrayList != null))
    {
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        String str = (String)((Iterator)localObject1).next();
        if (h(paramArrayList, str))
        {
          paramArrayList.remove(str);
          ((ArrayList)localObject2).add(str);
        }
      }
      paramArrayList.addAll(0, (Collection)localObject2);
      localObject2 = bo.c((List)localObject2, ",");
      g.RQ();
      g.RP().Ry().set(335875, localObject2);
    }
    this.rtE = paramArrayList;
    AppMethodBeat.o(40220);
  }

  public final View d(int paramInt1, int paramInt2, View paramView)
  {
    AppMethodBeat.i(40227);
    a.a locala;
    label153: Object localObject1;
    Object localObject2;
    if (paramView == null)
      if (this.style == 1)
      {
        paramView = this.mInflater.inflate(2130970769, null);
        locala = new a.a(this, (byte)0);
        locala.titleView = ((TextView)paramView.findViewById(2131827789));
        locala.nQl = ((TextView)paramView.findViewById(2131827790));
        locala.rtN = ((TextView)paramView.findViewById(2131827791));
        locala.rtO = ((TextView)paramView.findViewById(2131827792));
        locala.olR = ((ImageView)paramView.findViewById(2131827787));
        locala.rtP = ((ImageView)paramView.findViewById(2131827788));
        locala.rtP.setOnClickListener(new a.1(this));
        paramView.setTag(locala);
        localObject1 = locala.rtP;
        localObject2 = ((View)localObject1).getTag();
        if ((localObject2 != null) && ((localObject2 instanceof a.c)))
          break label394;
        localObject2 = new a.c(this);
        ((a.c)localObject2).rtQ = paramInt1;
        ((a.c)localObject2).rtR = paramInt2;
        ((View)localObject1).setTag(localObject2);
        label209: if (paramInt2 != this.rtE.size())
          break label551;
        locala.titleView.setVisibility(8);
        locala.nQl.setVisibility(8);
        locala.olR.setVisibility(8);
        locala.rtP.setVisibility(8);
        locala.rtN.setVisibility(0);
        locala.rtO.setVisibility(0);
        if (paramInt1 != this.rJo)
          break label443;
        if (this.rtK.size() <= 0)
          break label419;
        localObject1 = bo.c(O(this.rtK), ",");
        locala.rtO.setText("√".concat(String.valueOf(localObject1)));
        locala.rtO.setVisibility(0);
        locala.rtO.setTextColor(this.mContext.getResources().getColor(2131690496));
      }
    label394: label419: label551: 
    while (true)
    {
      AppMethodBeat.o(40227);
      return paramView;
      paramView = this.mInflater.inflate(2130970768, null);
      break;
      locala = (a.a)paramView.getTag();
      break label153;
      localObject1 = (a.c)((View)localObject1).getTag();
      ((a.c)localObject1).rtQ = paramInt1;
      ((a.c)localObject1).rtR = paramInt2;
      break label209;
      locala.rtO.setText("");
      locala.rtO.setVisibility(8);
      continue;
      label443: if (paramInt1 == this.rJn)
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
          locala.rtP.setVisibility(4);
          locala.rtN.setVisibility(8);
          locala.rtO.setVisibility(8);
          String str = (String)this.rtE.get(paramInt2);
          locala.titleView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, str));
          localObject2 = locala.nQl;
          localObject1 = com.tencent.mm.plugin.label.a.a.bJa().PE(str);
          Object localObject3 = com.tencent.mm.plugin.label.a.a.bJa().PH((String)localObject1);
          if ((localObject3 == null) || (((List)localObject3).size() == 0));
          for (localObject1 = ""; ; localObject1 = com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, (CharSequence)localObject1))
          {
            ((TextView)localObject2).setText((CharSequence)localObject1);
            locala.rtP.setImageResource(2131231952);
            if (this.style != 1)
              break label930;
            if (paramInt1 != this.rJn)
              break label851;
            if (!bg(1, str))
              break label837;
            locala.olR.setImageResource(2131231937);
            break;
            localObject1 = new ArrayList(((List)localObject3).size());
            localObject3 = ((List)localObject3).iterator();
            while (((Iterator)localObject3).hasNext())
              ((ArrayList)localObject1).add(((com.tencent.mm.plugin.messenger.a.b)g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ((String)((Iterator)localObject3).next()));
            localObject1 = bo.c((List)localObject1, ",");
          }
          label837: locala.olR.setImageResource(2131231939);
          continue;
          label851: if (paramInt1 == this.rJo)
          {
            if (this.rtF != paramInt1)
              locala.olR.setImageResource(2131231940);
            while (true)
            {
              if (!bg(2, str))
                break label916;
              locala.olR.setImageResource(2131231938);
              break;
              locala.olR.setImageResource(2131231938);
            }
            locala.olR.setImageResource(2131231940);
            continue;
            if (paramInt1 == this.rJn)
            {
              if (bg(1, str))
                locala.olR.setImageResource(2131231117);
              else
                locala.olR.setImageResource(2131231120);
            }
            else if (paramInt1 == this.rJo)
              if (bg(2, str))
                locala.olR.setImageResource(2131231119);
              else
                locala.olR.setImageResource(2131231120);
          }
        }
    }
  }

  public final Object getChild(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40219);
    Object localObject = this.rtE.get(paramInt2);
    AppMethodBeat.o(40219);
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
    return this.rJu;
  }

  public final long getGroupId(int paramInt)
  {
    return 0L;
  }

  public final View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(40225);
    if ((paramView == null) || (!(paramView.getTag() instanceof a.a)))
      if (this.style == 1)
      {
        paramView = this.mInflater.inflate(2130970771, null);
        paramViewGroup = new a.a(this, (byte)0);
        paramViewGroup.titleView = ((TextView)paramView.findViewById(2131827789));
        paramViewGroup.olR = ((ImageView)paramView.findViewById(2131827787));
        paramViewGroup.nQl = ((TextView)paramView.findViewById(2131827790));
        paramView.setTag(paramViewGroup);
        label102: paramViewGroup.titleView.setText(this.rth[paramInt]);
        paramViewGroup.nQl.setText(this.rtD[paramInt]);
        if ((paramInt != this.rJm) && (paramInt != this.rJl))
          break label265;
        if (this.rtF == paramInt)
          break label233;
        paramViewGroup.olR.setImageResource(2131231852);
        label165: if ((!this.rtG) || (paramInt != this.rJm))
          break label451;
        paramView = new View(this.mContext);
        paramView.setVisibility(8);
        AppMethodBeat.o(40225);
      }
    while (true)
    {
      return paramView;
      paramView = this.mInflater.inflate(2130970770, null);
      break;
      paramViewGroup = (a.a)paramView.getTag();
      break label102;
      label233: paramViewGroup.olR.setImageResource(2131231853);
      paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
      break label165;
      label265: if (paramInt == this.rJn)
      {
        if (this.rtF != paramInt)
        {
          paramViewGroup.olR.setImageResource(2131231852);
          break label165;
        }
        paramViewGroup.olR.setImageResource(2131231853);
        paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
        break label165;
      }
      if (paramInt != this.rJo)
        break label165;
      if (this.style == 1)
      {
        if (this.rtF != paramInt)
        {
          paramViewGroup.olR.setImageResource(2131231852);
          break label165;
        }
        paramViewGroup.olR.setImageResource(2131231877);
        paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
        break label165;
      }
      if (this.rtF != paramInt)
      {
        paramViewGroup.olR.setImageResource(2131231852);
        break label165;
      }
      paramViewGroup.olR.setImageResource(2131231854);
      paramViewGroup.olR.setContentDescription(this.mContext.getString(2131302909));
      break label165;
      label451: AppMethodBeat.o(40225);
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.a
 * JD-Core Version:    0.6.2
 */