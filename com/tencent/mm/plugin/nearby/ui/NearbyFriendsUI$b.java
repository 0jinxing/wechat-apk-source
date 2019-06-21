package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.axv;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.applet.b.b;
import java.util.LinkedList;
import java.util.List;

final class NearbyFriendsUI$b extends BaseAdapter
{
  private final Context context;
  b gvm;
  private b.b gvn;

  public NearbyFriendsUI$b(NearbyFriendsUI paramNearbyFriendsUI, Context paramContext)
  {
    AppMethodBeat.i(55462);
    this.gvm = new b(new NearbyFriendsUI.b.1(this));
    this.gvn = null;
    this.context = paramContext;
    AppMethodBeat.o(55462);
  }

  public final int getCount()
  {
    AppMethodBeat.i(55463);
    int i = NearbyFriendsUI.s(this.oQs).size();
    AppMethodBeat.o(55463);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(55464);
    if (this.gvn == null)
      this.gvn = new NearbyFriendsUI.b.2(this);
    if (this.gvm != null)
      this.gvm.a(paramInt, this.gvn);
    Object localObject1;
    label353: Object localObject2;
    if (paramView == null)
    {
      paramViewGroup = new NearbyFriendsUI.d();
      paramView = View.inflate(this.context, 2130970289, null);
      paramViewGroup.gtG = ((TextView)paramView.findViewById(2131823616));
      paramViewGroup.oQA = ((TextView)paramView.findViewById(2131826309));
      paramViewGroup.oQz = ((TextView)paramView.findViewById(2131826303));
      paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131823615));
      paramViewGroup.gvr = ((TextView)paramView.findViewById(2131826300));
      paramViewGroup.oQB = ((ImageView)paramView.findViewById(2131826302));
      paramViewGroup.oQC = ((ImageView)paramView.findViewById(2131826304));
      paramViewGroup.oQE = ((ImageView)paramView.findViewById(2131826305));
      paramViewGroup.oQF = ((ImageView)paramView.findViewById(2131826306));
      paramViewGroup.oQG = ((ImageView)paramView.findViewById(2131826307));
      localObject1 = paramViewGroup.oQC.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = com.tencent.mm.bz.a.al(this.context, 2131427812);
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.bz.a.al(this.context, 2131427812);
      paramViewGroup.oQC.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramViewGroup.oQD = ((ImageView)paramView.findViewById(2131826301));
      paramView.setTag(paramViewGroup);
      localObject1 = (axv)NearbyFriendsUI.s(this.oQs).get(paramInt);
      paramViewGroup.gtG.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, ((axv)localObject1).jCH, paramViewGroup.gtG.getTextSize()));
      if (NearbyFriendsUI.h(this.oQs) != 1)
        break label760;
      switch (((axv)localObject1).guN)
      {
      default:
        paramViewGroup.oQD.setVisibility(8);
        if (((axv)localObject1).wBT != 0)
        {
          paramViewGroup.oQB.setVisibility(0);
          localObject2 = BackwardSupportUtil.b.i(ao.a.flw.ky(((axv)localObject1).wBT), 2.0F);
          paramViewGroup.oQB.setImageBitmap((Bitmap)localObject2);
          paramViewGroup.oQD.setVisibility(8);
          label406: paramViewGroup.oQz.setText(((axv)localObject1).wBS);
          paramViewGroup.oQE.setVisibility(8);
          paramViewGroup.oQF.setVisibility(8);
          paramViewGroup.oQG.setVisibility(8);
          if ((localObject1 instanceof com.tencent.mm.plugin.nearby.a.a))
          {
            localObject2 = ((com.tencent.mm.plugin.nearby.a.a)localObject1).oPv;
            if ((localObject2 == null) || (((LinkedList)localObject2).size() != 1))
              break label784;
            paramViewGroup.oQE.setVisibility(0);
            NearbyFriendsUI.o(paramViewGroup.oQE, (String)((LinkedList)localObject2).get(0));
          }
          label501: if ((((axv)localObject1).guQ != null) && (!((axv)localObject1).guQ.trim().equals("")))
            break label938;
          paramViewGroup.oQA.setVisibility(8);
          label534: if ((((axv)localObject1).wBZ == null) || ((((axv)localObject1).wBZ.guY & 0x1) <= 0))
            break label975;
          paramViewGroup.oQC.setVisibility(0);
          label563: if (!NearbyFriendsUI.c.Aa(((axv)localObject1).guN))
            break label987;
          paramViewGroup.gvq.setImageBitmap(null);
          localObject2 = new c.a();
          ((c.a)localObject2).ePK = com.tencent.mm.plugin.i.c.XW();
          ((c.a)localObject2).ePH = true;
          ((c.a)localObject2).ePZ = true;
          localObject2 = ((c.a)localObject2).ahG();
          o.ahp().a(((axv)localObject1).jBB, paramViewGroup.gvq, (com.tencent.mm.at.a.a.c)localObject2);
          if (bo.isNullOrNil(((axv)localObject1).guS))
            break label1175;
          paramViewGroup.gvr.setText(((axv)localObject1).guS);
          paramViewGroup.gvr.setVisibility(0);
        }
        break;
      case 1:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(55464);
      return paramView;
      paramViewGroup = (NearbyFriendsUI.d)paramView.getTag();
      break;
      paramViewGroup.oQD.setVisibility(0);
      paramViewGroup.oQD.setImageResource(2131231387);
      paramViewGroup.oQD.setContentDescription(this.context.getString(2131301309));
      break label353;
      paramViewGroup.oQD.setVisibility(0);
      paramViewGroup.oQD.setImageResource(2131231386);
      paramViewGroup.oQD.setContentDescription(this.context.getString(2131299774));
      break label353;
      label760: paramViewGroup.oQD.setVisibility(8);
      break label353;
      paramViewGroup.oQB.setVisibility(8);
      break label406;
      label784: if ((localObject2 != null) && (((LinkedList)localObject2).size() == 2))
      {
        paramViewGroup.oQE.setVisibility(0);
        paramViewGroup.oQF.setVisibility(0);
        NearbyFriendsUI.o(paramViewGroup.oQE, (String)((LinkedList)localObject2).get(0));
        NearbyFriendsUI.o(paramViewGroup.oQF, (String)((LinkedList)localObject2).get(1));
        break label501;
      }
      if ((localObject2 == null) || (((LinkedList)localObject2).size() < 3))
        break label501;
      paramViewGroup.oQE.setVisibility(0);
      paramViewGroup.oQF.setVisibility(0);
      paramViewGroup.oQG.setVisibility(0);
      NearbyFriendsUI.o(paramViewGroup.oQE, (String)((LinkedList)localObject2).get(0));
      NearbyFriendsUI.o(paramViewGroup.oQF, (String)((LinkedList)localObject2).get(1));
      NearbyFriendsUI.o(paramViewGroup.oQG, (String)((LinkedList)localObject2).get(2));
      break label501;
      label938: paramViewGroup.oQA.setVisibility(0);
      paramViewGroup.oQA.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, ((axv)localObject1).guQ, paramViewGroup.oQA.getTextSize()));
      break label534;
      label975: paramViewGroup.oQC.setVisibility(8);
      break label563;
      label987: a.b.b(paramViewGroup.gvq, ((axv)localObject1).jBB);
      if (((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoJ(((axv)localObject1).jBB))
      {
        paramViewGroup.gvr.setVisibility(0);
        if (ad.Mn(((axv)localObject1).wBT))
        {
          paramViewGroup.gvr.setText(this.oQs.getString(2131301621));
        }
        else
        {
          ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM(((axv)localObject1).jBB);
          Context localContext;
          if (localad != null)
          {
            localObject2 = paramViewGroup.gtG;
            localContext = this.context;
            if (!bo.isNullOrNil(localad.Oj()))
              break label1165;
          }
          label1165: for (localObject1 = ((axv)localObject1).jCH; ; localObject1 = localad.Oj())
          {
            ((TextView)localObject2).setText(com.tencent.mm.pluginsdk.ui.e.j.b(localContext, (CharSequence)localObject1, paramViewGroup.gtG.getTextSize()));
            paramViewGroup.gvr.setText(this.oQs.getString(2131301626));
            break;
          }
        }
      }
      else
      {
        label1175: paramViewGroup.gvr.setVisibility(8);
      }
    }
  }

  public final axv zZ(int paramInt)
  {
    AppMethodBeat.i(55465);
    axv localaxv = (axv)NearbyFriendsUI.s(this.oQs).get(paramInt);
    AppMethodBeat.o(55465);
    return localaxv;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.b
 * JD-Core Version:    0.6.2
 */