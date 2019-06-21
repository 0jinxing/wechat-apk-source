package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.e;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.plugin.fav.ui.l.2;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j extends a
{
  private final int moM;
  private HashMap<String, SpannableString> mpj;

  public j(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74639);
    this.mpj = new HashMap();
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427657);
    AppMethodBeat.o(74639);
  }

  private static String L(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(74642);
    paramContext = "[" + paramContext.getResources().getString(paramInt) + "]";
    AppMethodBeat.o(74642);
    return paramContext;
  }

  private static void a(TextView paramTextView1, TextView paramTextView2, aar paramaar)
  {
    AppMethodBeat.i(74641);
    if (!paramaar.wgW)
    {
      ab.d("MicroMsg.FavRecordListItem", "has no datasrcname");
      paramTextView1.setVisibility(8);
      ab.d("MicroMsg.FavRecordListItem", "field type %d", new Object[] { Integer.valueOf(paramaar.dataType) });
      switch (paramaar.dataType)
      {
      case 9:
      case 11:
      case 12:
      case 13:
      case 14:
      case 18:
      default:
      case 1:
      case 3:
      case 5:
      case 7:
      case 6:
      case 8:
      case 15:
      case 4:
      case 2:
      case 10:
      case 16:
      case 17:
      case 19:
      }
    }
    while (true)
    {
      AppMethodBeat.o(74641);
      while (true)
      {
        return;
        paramTextView1.setVisibility(0);
        paramTextView1.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramTextView1.getContext(), paramaar.wgV, paramTextView1.getTextSize()));
        break;
        paramTextView2.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramTextView2.getContext(), paramaar.desc, paramTextView2.getTextSize()));
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299748));
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299746) + paramaar.title);
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299743) + paramaar.title);
        AppMethodBeat.o(74641);
        continue;
        paramTextView1 = paramaar.wgT.why;
        paramaar = new StringBuilder().append(L(paramTextView2.getContext(), 2131299742));
        if (bo.isNullOrNil(paramTextView1.cIK));
        for (paramTextView1 = paramTextView1.label; ; paramTextView1 = paramTextView1.cIK)
        {
          paramTextView2.setText(paramTextView1);
          AppMethodBeat.o(74641);
          break;
        }
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299739) + paramaar.title);
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299735));
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299747));
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299740));
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299663) + paramaar.wgT.whC.title);
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299644));
        AppMethodBeat.o(74641);
        continue;
        paramTextView2.setText(L(paramTextView2.getContext(), 2131299745));
        AppMethodBeat.o(74641);
      }
      paramTextView2.setText(L(paramTextView2.getContext(), 2131299737) + paramaar.title);
    }
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74640);
    Object localObject = paramViewGroup.getContext();
    int i;
    int j;
    boolean bool;
    LinkedList localLinkedList;
    int k;
    int m;
    label189: int n;
    if (paramView == null)
    {
      paramViewGroup = new j.a();
      localObject = a(View.inflate((Context)localObject, 2130969512, null), paramViewGroup, paramg);
      paramViewGroup.iqT = ((ImageView)((View)localObject).findViewById(2131821479));
      paramViewGroup.mpl = ((TextView)((View)localObject).findViewById(2131823921));
      paramViewGroup.mpm = ((TextView)((View)localObject).findViewById(2131823922));
      paramViewGroup.mpn = ((TextView)((View)localObject).findViewById(2131823923));
      paramViewGroup.mpo = ((TextView)((View)localObject).findViewById(2131823924));
      paramViewGroup.moY = ((ImageView)((View)localObject).findViewById(2131823919));
      paramViewGroup.mpk = ((ImageView)((View)localObject).findViewById(2131823920));
      paramViewGroup.mpp = ((FrameLayout)((View)localObject).findViewById(2131823918));
      a(paramViewGroup, paramg);
      i = 0;
      j = 0;
      bool = false;
      localLinkedList = paramg.field_favProto.wiv;
      paramView = localLinkedList.iterator();
      k = 0;
      m = 0;
      if (!paramView.hasNext())
        break label385;
      switch (((aar)paramView.next()).dataType)
      {
      case 9:
      case 12:
      case 13:
      default:
        label292: n = k;
        k = m;
        m = n;
      case 2:
      case 4:
      case 15:
      case 1:
      case 3:
      case 5:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 14:
      case 16:
      case 17:
      }
    }
    while (true)
    {
      n = j + 1;
      j = m;
      m = k;
      k = j;
      j = n;
      break label189;
      paramViewGroup = (j.a)paramView.getTag();
      localObject = paramView;
      break;
      if (bool)
        break label292;
      bool = true;
      n = k;
      i = j;
      k = m;
      m = n;
      continue;
      if (k != 0)
        break label292;
      m = 1;
      k = j;
    }
    label385: ab.d("MicroMsg.FavRecordListItem", "hasThumb %s, firstRemarkIndex %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(m) });
    if (localLinkedList.size() <= 0)
    {
      ab.w("MicroMsg.FavRecordListItem", "dataList size is null");
      AppMethodBeat.o(74640);
      return localObject;
    }
    paramView = (aar)localLinkedList.get(m);
    a(paramViewGroup.mpl, paramViewGroup.mpm, paramView);
    ImageView localImageView;
    aar localaar;
    label599: l locall;
    if (bool)
    {
      paramViewGroup.mpp.setVisibility(0);
      paramViewGroup.iqT.setVisibility(0);
      localImageView = paramViewGroup.iqT;
      localaar = (aar)localLinkedList.get(i);
      switch (localaar.dataType)
      {
      default:
      case 2:
        while (true)
          if (m + 1 < localLinkedList.size())
          {
            paramViewGroup.mpn.setVisibility(0);
            paramViewGroup.mpo.setVisibility(0);
            a(paramViewGroup.mpn, paramViewGroup.mpo, (aar)localLinkedList.get(m + 1));
            AppMethodBeat.o(74640);
            break;
            locall = this.mhy;
            j = this.moM;
            k = this.moM;
            if (localImageView != null)
              if (!f.Mn())
              {
                localImageView.setImageResource(2130839707);
              }
              else if ((localaar != null) && (paramg != null))
              {
                String str = localaar.mnd;
                if (str != null)
                {
                  paramView = null;
                  if (localaar.mnd != null)
                  {
                    paramView = (String[])locall.mkn.get(str);
                    if (paramView != null)
                      break label852;
                    paramView = new String[2];
                    paramView[0] = b.b(localaar);
                    paramView[1] = b.c(localaar);
                    locall.mkn.put(str, paramView);
                  }
                }
              }
          }
      case 4:
      case 15:
      }
    }
    label852: 
    while (true)
    {
      locall.mkm.a(localImageView, paramView, null, 2131231864, j, k);
      if ((paramView == null) || (paramView.length <= 0))
        break;
      paramView = paramView[0];
      com.tencent.mm.kernel.g.RS().aa(new l.2(locall, paramView, paramg, localaar));
      break;
      this.mhy.b(localImageView, localaar, paramg, 2131230817, this.moM, this.moM);
      break;
      paramViewGroup.mpp.setVisibility(8);
      paramViewGroup.iqT.setVisibility(8);
      break;
      paramViewGroup.mpn.setVisibility(8);
      paramViewGroup.mpo.setVisibility(8);
      break label599;
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74643);
    j.a locala = (j.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.j
 * JD-Core Version:    0.6.2
 */