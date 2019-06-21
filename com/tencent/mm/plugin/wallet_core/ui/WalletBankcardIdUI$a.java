package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.wallet.a.t;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

final class WalletBankcardIdUI$a extends BaseAdapter
{
  private Context mContext;
  private LayoutInflater mInflater;
  List<t> tEw;

  public WalletBankcardIdUI$a(Context paramContext, List<t> paramList)
  {
    AppMethodBeat.i(47170);
    this.mInflater = null;
    this.tEw = new LinkedList();
    this.mContext = null;
    this.mInflater = LayoutInflater.from(paramContext);
    this.tEw = paramList;
    this.mContext = paramContext;
    AppMethodBeat.o(47170);
  }

  public final int getCount()
  {
    AppMethodBeat.i(47171);
    int i;
    if (this.tEw == null)
    {
      i = 0;
      AppMethodBeat.o(47171);
    }
    while (true)
    {
      return i;
      i = this.tEw.size();
      AppMethodBeat.o(47171);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(47172);
    Object localObject = this.tEw.get(paramInt);
    AppMethodBeat.o(47172);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47173);
    Object localObject;
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130971072, paramViewGroup, false);
      paramViewGroup = new WalletBankcardIdUI.a.a(this);
      paramViewGroup.tEx = ((ImageView)paramView.findViewById(2131828699));
      paramViewGroup.pMc = ((TextView)paramView.findViewById(2131828700));
      paramViewGroup.tEy = ((TextView)paramView.findViewById(2131828701));
      paramViewGroup.tEz = ((TextView)paramView.findViewById(2131828702));
      paramView.setTag(paramViewGroup);
      localObject = (t)getItem(paramInt);
      if (bo.isNullOrNil(((t)localObject).pcj))
        break label336;
      paramViewGroup.pMc.setText(((t)localObject).pcj);
      paramViewGroup.pMc.setVisibility(0);
      label128: if (bo.isNullOrNil(((t)localObject).tnN))
        break label348;
      paramViewGroup.tEy.setText(((t)localObject).tnN);
      paramViewGroup.tEy.setVisibility(0);
      label159: if (bo.isNullOrNil(((t)localObject).tmP))
        break label360;
      paramViewGroup.tEz.setText(((t)localObject).tmP);
      paramViewGroup.tEz.setVisibility(0);
    }
    while (true)
    {
      String str = ((t)localObject).tnT;
      ab.v("Micromsg.WalletInputCardIDUI", "bankType:" + ((t)localObject).tnS + ", logurl:" + str);
      paramViewGroup.tEx.setImageBitmap(null);
      if (!bo.isNullOrNil(str))
      {
        localObject = new c.a();
        o.ahq();
        ((c.a)localObject).ePY = null;
        ((c.a)localObject).ePK = e.eSn;
        ((c.a)localObject).ePJ = b.UK(str);
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).ePZ = true;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(str, paramViewGroup.tEx, (c)localObject);
      }
      AppMethodBeat.o(47173);
      return paramView;
      paramViewGroup = (WalletBankcardIdUI.a.a)paramView.getTag();
      break;
      label336: paramViewGroup.pMc.setVisibility(8);
      break label128;
      label348: paramViewGroup.tEy.setVisibility(8);
      break label159;
      label360: paramViewGroup.tEz.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.a
 * JD-Core Version:    0.6.2
 */