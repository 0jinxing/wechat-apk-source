package com.tencent.mm.plugin.aa.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class LaunchAAByPersonAmountSelectUI$a extends BaseAdapter
{
  List<LaunchAAByPersonAmountSelectUI.b> dataList;

  public LaunchAAByPersonAmountSelectUI$a(List<String> paramList, Map<String, Double> paramMap)
  {
    AppMethodBeat.i(40799);
    this.dataList = null;
    this.dataList = new ArrayList();
    Iterator localIterator = paramMap.iterator();
    if (localIterator.hasNext())
    {
      paramMap = (String)localIterator.next();
      LaunchAAByPersonAmountSelectUI.b localb = new LaunchAAByPersonAmountSelectUI.b(paramList, (byte)0);
      localb.username = paramMap;
      Object localObject;
      if ((localObject != null) && (localObject.containsKey(paramMap)));
      for (localb.goB = paramList.getString(2131296331, new Object[] { localObject.get(paramMap) }); ; localb.goB = "")
      {
        this.dataList.add(localb);
        break;
      }
    }
    AppMethodBeat.o(40799);
  }

  private LaunchAAByPersonAmountSelectUI.b mQ(int paramInt)
  {
    AppMethodBeat.i(40801);
    LaunchAAByPersonAmountSelectUI.b localb = (LaunchAAByPersonAmountSelectUI.b)this.dataList.get(paramInt);
    AppMethodBeat.o(40801);
    return localb;
  }

  public final int getCount()
  {
    AppMethodBeat.i(40800);
    int i = this.dataList.size();
    AppMethodBeat.o(40800);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(40802);
    LaunchAAByPersonAmountSelectUI.b localb = mQ(paramInt);
    Object localObject = paramView;
    if (localb != null)
    {
      localObject = paramView;
      if (!bo.isNullOrNil(localb.username))
      {
        View localView = paramView;
        if (paramView == null)
        {
          localView = v.hu(this.gou).inflate(2130969917, paramViewGroup, false);
          paramView = new LaunchAAByPersonAmountSelectUI.a.a(this, (byte)0);
          paramView.eks = ((ImageView)localView.findViewById(2131823704));
          paramView.goa = ((TextView)localView.findViewById(2131821556));
          paramView.gob = ((WalletFormView)localView.findViewById(2131825206));
          paramView.goA = new LaunchAAByPersonAmountSelectUI.c(this.gou, localb.username);
          paramView.gob.a(paramView.goA);
          paramView.eks.setOnTouchListener(new LaunchAAByPersonAmountSelectUI.a.1(this, paramView));
          paramView.goa.setOnTouchListener(new LaunchAAByPersonAmountSelectUI.a.2(this, paramView));
          localView.setTag(paramView);
          this.gou.a(paramView.gob, 2, false, true);
        }
        paramView = (LaunchAAByPersonAmountSelectUI.a.a)localView.getTag();
        if (!bo.isNullOrNil(localb.username))
        {
          paramView.goA.username = localb.username;
          a.b.b(paramView.eks, localb.username);
          paramView.goa.setText(j.b(this.gou.mController.ylL, ((b)g.K(b.class)).getDisplayName(localb.username, LaunchAAByPersonAmountSelectUI.n(this.gou)), paramView.goa.getTextSize()));
        }
        localObject = localView;
        if (localb.goB != null)
        {
          localObject = localView;
          if (paramView.gob.getText() != null)
          {
            localObject = localView;
            if (!localb.goB.equals(paramView.gob.getText().toLowerCase()))
            {
              localObject = paramView.gob;
              paramViewGroup = paramView.goA;
              if (((WalletFormView)localObject).Aih != null)
                ((WalletFormView)localObject).Aih.removeTextChangedListener(paramViewGroup);
              paramView.gob.setText(localb.goB);
              paramView.gob.a(paramView.goA);
              localObject = localView;
            }
          }
        }
      }
    }
    AppMethodBeat.o(40802);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.a
 * JD-Core Version:    0.6.2
 */