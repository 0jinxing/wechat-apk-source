package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

final class ContactSearchResultUI$a extends BaseAdapter
{
  private Context mContext;

  public ContactSearchResultUI$a(ContactSearchResultUI paramContactSearchResultUI, Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final int getCount()
  {
    AppMethodBeat.i(25517);
    int i = ContactSearchResultUI.b(this.svk).size();
    int j = ContactSearchResultUI.c(this.svk).size();
    AppMethodBeat.o(25517);
    return i + j;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 8;
    AppMethodBeat.i(25518);
    ContactSearchResultUI.c localc;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.mContext, 2130970571, null);
      localc = new ContactSearchResultUI.c();
      localc.ejo = ((ImageView)paramViewGroup.findViewById(2131823652));
      localc.emg = ((TextView)paramViewGroup.findViewById(2131824267));
      localc.jKL = paramViewGroup.findViewById(2131824270);
      localc.jKM = ((TextView)paramViewGroup.findViewById(2131824272));
      localc.jKP = paramViewGroup.findViewById(2131824269);
      paramViewGroup.setTag(localc);
      if (paramInt < ContactSearchResultUI.b(this.svk).size())
        break label285;
      paramView = (bvk)ContactSearchResultUI.c(this.svk).get(paramInt - ContactSearchResultUI.b(this.svk).size());
      localc.username = paramView.jBB;
      a.b.r(localc.ejo, localc.username);
      localc.ejo.setTag(localc.username);
      a.b.b(localc.ejo, localc.username);
      localc.jKL.setVisibility(8);
      localc.jKP.setVisibility(8);
      localc.jKM.setText("");
    }
    label285: but localbut;
    while (true)
    {
      try
      {
        localc.emg.setText(j.b(this.mContext, paramView.jCH, localc.emg.getTextSize()));
        AppMethodBeat.o(25518);
        return paramViewGroup;
        localc = (ContactSearchResultUI.c)paramView.getTag();
        paramViewGroup = paramView;
      }
      catch (Exception paramView)
      {
        localc.emg.setText("");
        continue;
      }
      localbut = (but)ContactSearchResultUI.b(this.svk).get(paramInt);
      if (localbut != null)
        break label322;
      ab.e("MicroMsg.ContactSearchResultAdapter", "shouldnot be empty");
      AppMethodBeat.o(25518);
    }
    label322: localc.username = localbut.wcB.wVI;
    a.b.r(localc.ejo, localc.username);
    localc.ejo.setTag(localc.username);
    a.b.b(localc.ejo, localc.username);
    String str = localbut.wcB.wVI;
    Object localObject1 = (ContactSearchResultUI.b)ContactSearchResultUI.d(this.svk).get(str);
    paramView = (View)localObject1;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = new ContactSearchResultUI.b((byte)0);
      ContactSearchResultUI.d(this.svk).put(str, localObject1);
      paramView = localbut.wCa;
      if (paramView != null)
      {
        localObject2 = new d();
        ((d)localObject2).field_username = str;
        ((d)localObject2).field_brandFlag = paramView.gvb;
        ((d)localObject2).field_brandIconURL = paramView.gve;
        ((d)localObject2).field_brandInfo = paramView.gvd;
        ((d)localObject2).field_extInfo = paramView.gvc;
        if (((d)localObject2).cJ(false) == null)
          break label824;
      }
    }
    label548: label566: label824: for (paramView = ((d)localObject2).cJ(false).aek(); ; paramView = null)
      while (true)
      {
        boolean bool;
        if (paramView != null)
        {
          if ((((d)localObject2).cJ(false).aem()) && (!bo.isNullOrNil(paramView.fvS)))
          {
            bool = true;
            ((ContactSearchResultUI.b)localObject1).jKJ = bool;
            if (localbut.wBT == 0)
              break label749;
            bool = true;
            ((ContactSearchResultUI.b)localObject1).jKI = bool;
          }
        }
        else
        {
          paramView = (View)localObject1;
          localObject1 = localc.jKL;
          if (!paramView.jKI)
            break label755;
          paramInt = 0;
          label592: ((View)localObject1).setVisibility(paramInt);
          localObject1 = localc.jKP;
          paramInt = i;
          if (paramView.jKJ)
            paramInt = 0;
          ((View)localObject1).setVisibility(paramInt);
          ab.v("MicroMsg.ContactSearchResultAdapter", "verifyFlay : %d", new Object[] { Integer.valueOf(localbut.wBT) });
          paramView = bo.nullAsNil(localbut.guQ);
        }
        try
        {
          localc.jKM.setText(j.b(this.mContext, paramView, localc.jKM.getTextSize()));
        }
        catch (Exception paramView)
        {
          try
          {
            localObject2 = localc.emg;
            localObject1 = this.mContext;
            if (!bo.isNullOrNil(localbut.wyX.wVI))
              paramView = localbut.wyX.wVI;
            while (true)
            {
              ((TextView)localObject2).setText(j.b((Context)localObject1, paramView, localc.emg.getTextSize()));
              AppMethodBeat.o(25518);
              break;
              bool = false;
              break label548;
              label749: bool = false;
              break label566;
              label755: paramInt = 8;
              break label592;
              paramView = paramView;
              localc.jKM.setText("");
              break label679;
              if (!bo.isNullOrNil(localbut.guS))
                paramView = localbut.guS;
              else
                paramView = bo.nullAsNil(localbut.wcB.wVI);
            }
          }
          catch (Exception paramView)
          {
            while (true)
              localc.emg.setText("");
          }
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI.a
 * JD-Core Version:    0.6.2
 */