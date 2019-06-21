package com.tencent.mm.plugin.wallet_core.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet.a.t;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wallet_core.model.p.a;
import com.tencent.mm.plugin.wallet_core.model.p.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

final class l$a extends BaseAdapter
{
  int tHG;
  List<t> tHH;
  j tHI;
  p<String> tHJ;

  public l$a(l paraml)
  {
    AppMethodBeat.i(47380);
    this.tHG = -1;
    this.tHH = new LinkedList();
    this.tHI = null;
    this.tHJ = new l.a.1(this);
    AppMethodBeat.o(47380);
  }

  public final int getCount()
  {
    AppMethodBeat.i(47381);
    int i = this.tHH.size();
    AppMethodBeat.o(47381);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(47382);
    Object localObject = this.tHH.get(paramInt);
    AppMethodBeat.o(47382);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47383);
    Object localObject1;
    label154: label185: String str;
    int i;
    if (paramView == null)
    {
      paramView = l.c(this.tHF).inflate(2130971085, paramViewGroup, false);
      paramViewGroup = new l.c();
      paramViewGroup.tHL = paramView.findViewById(2131828761);
      paramViewGroup.iDT = ((TextView)paramView.findViewById(2131828763));
      paramViewGroup.kiF = ((TextView)paramView.findViewById(2131828764));
      paramViewGroup.kEq = ((TextView)paramView.findViewById(2131828765));
      paramViewGroup.tHN = ((CheckBox)paramView.findViewById(2131828766));
      paramViewGroup.tHM = ((ImageView)paramView.findViewById(2131828762));
      paramView.setTag(paramViewGroup);
      localObject1 = (t)getItem(paramInt);
      if ((paramInt != this.tHG) || (this.tHG <= 0))
        break label418;
      paramViewGroup.tHL.setVisibility(0);
      paramViewGroup.tHM.setVisibility(8);
      if (bo.isNullOrNil(((t)localObject1).tnN))
        break label438;
      paramViewGroup.iDT.setText(((t)localObject1).tnN);
      paramViewGroup.iDT.setVisibility(0);
      str = ((t)localObject1).tmO;
      if ((this.tHI == null) || (this.tHI.tnm == null))
        break label456;
      localObject2 = this.tHI.tnm;
      i = 0;
      label221: if (i >= ((List)localObject2).size())
        break label456;
      if (!str.equals(((f)((List)localObject2).get(i)).tmO))
        break label450;
      localObject2 = (f)((List)localObject2).get(i);
      label270: str = ((t)localObject1).tmP;
      localObject1 = ((t)localObject1).tmQ;
      if (localObject2 == null)
        break label524;
      str = ((f)localObject2).tmP;
      localObject1 = ((f)localObject2).tmQ;
    }
    label524: for (Object localObject2 = str; ; localObject2 = str)
    {
      if (!bo.isNullOrNil((String)localObject2))
      {
        paramViewGroup.kiF.setText((CharSequence)localObject2);
        paramViewGroup.kiF.setVisibility(0);
        label332: if (bo.isNullOrNil((String)localObject1))
          break label474;
        paramViewGroup.kEq.setText((CharSequence)localObject1);
        paramViewGroup.kEq.setVisibility(0);
        label357: localObject2 = ((p.b)this.tHJ.tzD.get(paramInt)).tzL;
        if (localObject2 != p.a.tzG)
          break label486;
        paramViewGroup.tHN.setChecked(false);
        paramViewGroup.tHN.setEnabled(false);
      }
      while (true)
      {
        AppMethodBeat.o(47383);
        return paramView;
        paramViewGroup = (l.c)paramView.getTag();
        break;
        label418: paramViewGroup.tHL.setVisibility(8);
        paramViewGroup.tHM.setVisibility(0);
        break label154;
        label438: paramViewGroup.iDT.setVisibility(8);
        break label185;
        label450: i++;
        break label221;
        label456: localObject2 = null;
        break label270;
        paramViewGroup.kiF.setVisibility(8);
        break label332;
        label474: paramViewGroup.kEq.setVisibility(8);
        break label357;
        label486: paramViewGroup.tHN.setEnabled(true);
        if (localObject2 == p.a.tzH)
          paramViewGroup.tHN.setChecked(true);
        else
          paramViewGroup.tHN.setChecked(false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.l.a
 * JD-Core Version:    0.6.2
 */