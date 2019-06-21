package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.c;
import com.tencent.mm.plugin.fav.ui.k;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class h extends a
{
  private static int moM;

  public h(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74633);
    moM = com.tencent.mm.bz.a.al(paraml.context, 2131427657);
    AppMethodBeat.o(74633);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74634);
    paramViewGroup = paramViewGroup.getContext();
    h.a locala;
    View localView;
    if (paramView == null)
    {
      locala = new h.a();
      localView = a(View.inflate(paramViewGroup, 2130969517, null), locala, paramg);
      locala.moS = localView.findViewById(2131823927);
      locala.moT = localView.findViewById(2131823938);
      locala.moU = localView.findViewById(2131823934);
      locala.moV = localView.findViewById(2131823936);
      locala.moW = localView.findViewById(2131823928);
      locala.moX = ((ImageView)localView.findViewById(2131823929));
      locala.moZ = localView.findViewById(2131823930);
      locala.moY = ((ImageView)localView.findViewById(2131823919));
      locala.mpa = ((TextView)localView.findViewById(2131823931));
      locala.mpb = ((TextView)localView.findViewById(2131823932));
      locala.mpc = ((TextView)localView.findViewById(2131823933));
      locala.mpd = ((ImageView)localView.findViewById(2131823939));
      locala.mpe = ((TextView)localView.findViewById(2131823940));
      locala.mpf = ((TextView)localView.findViewById(2131823941));
      locala.mpg = ((TextView)localView.findViewById(2131823935));
      locala.mph = ((TextView)localView.findViewById(2131823937));
      localView.setTag(locala);
    }
    Object localObject1;
    while (true)
    {
      a(locala, paramg);
      localObject1 = paramg.field_favProto.wiv;
      if (((List)localObject1).size() >= 2)
        break;
      ab.e("MicroMsg.Fav.FavNoteListItem", "no other item");
      AppMethodBeat.o(74634);
      return localView;
      locala = (h.a)paramView.getTag();
      localView = paramView;
    }
    int i = -1;
    int j = ((List)localObject1).size();
    int k = 0;
    int m = -1;
    int n = 1;
    int i1 = 0;
    int i2 = 0;
    if (i1 < ((List)localObject1).size())
    {
      paramViewGroup = (aar)((List)localObject1).get(i1);
      if (i1 == 0)
      {
        paramView = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.b(paramViewGroup));
        if (!paramView.exists())
          l.b(paramg, paramViewGroup);
      }
      while (true)
      {
        i1++;
        break;
        if (paramViewGroup.whb == null)
        {
          paramViewGroup = new ld();
          paramViewGroup.cGU.type = 10;
          paramViewGroup.cGU.field_localId = paramg.field_localId;
          paramViewGroup.cGU.path = com.tencent.mm.vfs.j.w(paramView.dMD());
          com.tencent.mm.sdk.b.a.xxA.m(paramViewGroup);
        }
        continue;
        int i3;
        if ((paramViewGroup.dataType != 2) && (paramViewGroup.dataType != 4))
        {
          i3 = k;
          i4 = i;
          k = i2;
          if (paramViewGroup.dataType != 15);
        }
        else
        {
          int i5 = i2 + 1;
          i2 = 1;
          i3 = i2;
          i4 = i;
          k = i5;
          if (i == -1)
          {
            i4 = i1;
            k = i5;
            i3 = i2;
          }
        }
        switch (paramViewGroup.dataType)
        {
        case 2:
        case 4:
        case 9:
        case 12:
        case 13:
        case 15:
        case 17:
        case 18:
        case 19:
        default:
        case 3:
        case 5:
        case 6:
        case 7:
        case 8:
        case 10:
        case 11:
        case 14:
        case 16:
        case 20:
        case 1:
        }
        do
        {
          n = 0;
          i2 = k;
          k = i3;
          i = i4;
          break;
          m = i1;
          i2 = k;
          k = i3;
          i = i4;
          break;
        }
        while (bo.bc(paramViewGroup.desc, "").trim().length() > 0);
        j--;
        i2 = k;
        k = i3;
        i = i4;
      }
    }
    if ((n != 0) && (j == 2))
    {
      i1 = 1;
      label735: if ((i1 == 0) || (m <= 0))
        break label1181;
      localObject1 = (aar)((List)localObject1).get(m);
      if (((aar)localObject1).dataType != 3)
        break label849;
      locala.moS.setVisibility(8);
      locala.moT.setVisibility(8);
      locala.moU.setVisibility(0);
      locala.moV.setVisibility(8);
      locala.mpg.setText(k.K(this.mhy.context, (int)com.tencent.mm.plugin.fav.a.b.iu(((aar)localObject1).duration)));
    }
    label1168: 
    while (true)
    {
      AppMethodBeat.o(74634);
      break;
      i1 = 0;
      break label735;
      label849: if (((aar)localObject1).dataType == 20)
      {
        locala.moS.setVisibility(8);
        locala.moT.setVisibility(8);
        locala.moU.setVisibility(8);
        locala.moV.setVisibility(0);
        locala.mph.setText(k.K(this.mhy.context, (int)com.tencent.mm.plugin.fav.a.b.iu(((aar)localObject1).duration)));
      }
      else
      {
        paramView = null;
        if (((aar)localObject1).dataType == 6)
        {
          i2 = 2131230798;
          paramg = ((aar)localObject1).wgT.why;
          paramViewGroup = ((aar)localObject1).wgT.hHV;
          if (bo.isNullOrNil(paramViewGroup))
            if (k.Md(paramg.cIK))
            {
              paramView = paramg.cIK;
              label986: paramg = paramg.label;
              paramViewGroup = paramView;
              paramView = paramg;
            }
        }
        while (true)
        {
          locala.moU.setVisibility(8);
          locala.moV.setVisibility(8);
          locala.moS.setVisibility(8);
          locala.moT.setVisibility(0);
          locala.mpd.setImageResource(i2);
          locala.mpe.setText(paramViewGroup);
          if (bo.isNullOrNil(paramView))
            break label1168;
          locala.mpf.setText(paramView);
          locala.mpf.setVisibility(0);
          break;
          paramViewGroup = paramg.label;
          continue;
          paramView = paramViewGroup;
          if (!k.Md(paramg.cIK))
            break label986;
          paramView = paramg.cIK;
          continue;
          k = c.LX(((aar)localObject1).wgo);
          paramg = ((aar)localObject1).title;
          localObject2 = ((aar)localObject1).desc;
          i2 = k;
          paramView = (View)localObject2;
          paramViewGroup = paramg;
          if (bo.isNullOrNil((String)localObject2))
          {
            paramView = com.tencent.mm.plugin.fav.a.b.aC((float)((aar)localObject1).wgu);
            i2 = k;
            paramViewGroup = paramg;
          }
        }
        locala.mpf.setVisibility(8);
      }
    }
    label1181: locala.moS.setVisibility(0);
    locala.moT.setVisibility(8);
    locala.moU.setVisibility(8);
    locala.moV.setVisibility(8);
    ArrayList localArrayList1 = new ArrayList();
    paramViewGroup = null;
    int i4 = 1;
    label1234: if (i4 < ((List)localObject1).size())
    {
      localObject2 = (aar)((List)localObject1).get(i4);
      if (((aar)localObject2).dataType == 1)
      {
        localObject2 = ((aar)localObject2).desc;
        if (bo.isNullOrNil((String)localObject2))
          break label2443;
        paramView = (View)localObject2;
        if (((String)localObject2).length() > 1000)
          paramView = ((String)localObject2).substring(0, 1000);
        paramView = paramView.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", "&").replace(" ", " ").split("\n");
        localObject2 = paramViewGroup;
        if (paramView != null)
        {
          localObject2 = paramViewGroup;
          if (paramView.length > 0)
          {
            ArrayList localArrayList2 = new ArrayList();
            for (i1 = 0; ; i1++)
            {
              if (i1 >= paramView.length)
                break label2437;
              if (!bo.isNullOrNil(paramView[i1].trim()))
              {
                localArrayList2.add(paramView[i1]);
                i1++;
                localObject2 = "";
                while (i1 < paramView.length)
                {
                  localObject2 = (String)localObject2 + paramView[i1] + " ";
                  i1++;
                }
              }
            }
            paramView = ((String)localObject2).trim();
            if (paramView.length() > 0)
              localArrayList2.add(paramView);
            i1 = 0;
            if ((localArrayList2.size() <= 0) || (!bo.isNullOrNil(paramViewGroup)))
              break label2432;
            paramView = (String)localArrayList2.get(0);
            for (i1 = 1; i1 < localArrayList2.size(); i1++)
              label1516: localArrayList1.add(localArrayList2.get(i1));
          }
        }
      }
      else
      {
        paramView = localView.getContext();
        switch (((aar)localObject2).dataType)
        {
        case 4:
        case 9:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 17:
        case 18:
        case 19:
        default:
          paramView = "";
          label1647: localObject2 = paramViewGroup;
          if (!bo.isNullOrNil(paramView))
            localArrayList1.add(paramView);
          break;
        case 3:
        case 20:
        case 5:
        case 7:
        case 6:
        case 8:
        case 10:
        case 16:
        }
      }
    }
    label1352: for (Object localObject2 = paramViewGroup; ; localObject2 = paramView)
    {
      i4++;
      paramViewGroup = (ViewGroup)localObject2;
      break label1234;
      paramView = k.L(paramView, 2131299748) + " " + k.K(paramView, (int)com.tencent.mm.plugin.fav.a.b.iu(((aar)localObject2).duration));
      break label1647;
      paramView = k.L(paramView, 2131299746) + " " + ((aar)localObject2).title;
      break label1647;
      paramView = k.L(paramView, 2131299743) + " " + ((aar)localObject2).title;
      break label1647;
      localObject2 = ((aar)localObject2).wgT.why;
      if (k.Md(((aay)localObject2).cIK))
      {
        paramView = k.L(paramView, 2131299742) + " " + ((aay)localObject2).cIK;
        break label1647;
      }
      paramView = k.L(paramView, 2131299742) + " " + ((aay)localObject2).label;
      break label1647;
      paramView = k.L(paramView, 2131299739) + " " + ((aar)localObject2).title;
      break label1647;
      paramView = k.L(paramView, 2131299663) + " " + ((aar)localObject2).wgT.whC.title;
      break label1647;
      paramView = k.L(paramView, 2131299644);
      break label1647;
      if (!bo.isNullOrNil(paramViewGroup))
      {
        locala.mpb.setText(com.tencent.mm.pluginsdk.ui.e.j.b(locala.mpb.getContext(), paramViewGroup, locala.mpb.getTextSize()));
        locala.mpb.setVisibility(0);
        if (localArrayList1.size() > 0)
          locala.mpb.setMaxLines(1);
      }
      while (true)
      {
        paramView = new StringBuffer();
        for (i1 = 0; (i1 < localArrayList1.size()) && (i1 < 2); i1++)
        {
          paramView.append((String)localArrayList1.get(i1));
          paramView.append("\n");
        }
        locala.mpb.setMaxLines(3);
        continue;
        locala.mpb.setVisibility(8);
      }
      if (paramView.length() != 0)
      {
        paramView = paramView.substring(0, paramView.length() - 1);
        locala.mpc.setText(com.tencent.mm.pluginsdk.ui.e.j.b(locala.mpc.getContext(), paramView, locala.mpc.getTextSize()));
        locala.mpc.setVisibility(0);
        if (k == 0)
          break label2419;
        locala.moW.setVisibility(0);
        paramView = (aar)((List)localObject1).get(i);
        if (((aar)((List)localObject1).get(i)).dataType != 2)
          break label2344;
        paramViewGroup = locala.moX;
        k = moM;
        l.a(paramViewGroup, paramView, paramg, true, k, k);
        locala.moY.setVisibility(8);
      }
      while (true)
      {
        if (i2 <= 1)
          break label2396;
        locala.mpa.setText(localView.getContext().getString(2131299648, new Object[] { Integer.valueOf(i2) }));
        locala.mpa.setVisibility(0);
        locala.moZ.setVisibility(0);
        break;
        locala.mpc.setVisibility(8);
        break label2195;
        locala.moY.setVisibility(0);
        paramViewGroup = this.mhy;
        localObject2 = locala.moX;
        localObject1 = paramView.cvq;
        k = moM;
        paramViewGroup.a((ImageView)localObject2, paramView, paramg, (String)localObject1, 2131230817, k, k);
      }
      label2396: locala.mpa.setVisibility(8);
      locala.moZ.setVisibility(8);
      break;
      label2419: locala.moW.setVisibility(8);
      break;
      paramView = paramViewGroup;
      break label1516;
      i1 = 0;
      break label1409;
      paramView = null;
      break label1352;
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74635);
    h.a locala = (h.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.h
 * JD-Core Version:    0.6.2
 */