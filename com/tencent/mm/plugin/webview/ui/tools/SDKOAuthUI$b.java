package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.protocal.protobuf.bet;
import java.util.LinkedList;

final class SDKOAuthUI$b extends BaseAdapter
{
  private LayoutInflater mInflater;
  LinkedList<bet> usV;
  private c.a usW;
  private Context usX;
  private int usY;

  public SDKOAuthUI$b(Context paramContext, LinkedList<bet> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(7546);
    this.usX = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.usV = paramLinkedList;
    this.usW = new c.a();
    this.usW.ePT = 2131231695;
    paramContext = this.usW;
    paramContext.eQf = true;
    paramContext.eQg = this.usX.getResources().getDimension(2131428615);
    this.usY = paramInt;
    AppMethodBeat.o(7546);
  }

  public final bet Jm(int paramInt)
  {
    AppMethodBeat.i(7548);
    bet localbet;
    if ((paramInt >= 0) && (paramInt < this.usV.size()))
    {
      localbet = (bet)this.usV.get(paramInt);
      AppMethodBeat.o(7548);
    }
    while (true)
    {
      return localbet;
      localbet = null;
      AppMethodBeat.o(7548);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(7547);
    int i;
    if (this.usV == null)
    {
      i = 0;
      AppMethodBeat.o(7547);
    }
    while (true)
    {
      return i;
      i = this.usV.size();
      AppMethodBeat.o(7547);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(7549);
    bet localbet = Jm(paramInt);
    if (localbet == null)
    {
      AppMethodBeat.o(7549);
      return paramView;
    }
    if (paramView == null)
    {
      paramViewGroup = new SDKOAuthUI.b.a((byte)0);
      paramView = this.mInflater.inflate(2130968792, null, false);
      paramViewGroup.usZ = ((ImageView)paramView.findViewById(2131821558));
      paramViewGroup.uta = ((TextView)paramView.findViewById(2131821559));
      paramViewGroup.utb = ((TextView)paramView.findViewById(2131821560));
      paramViewGroup.utc = ((ImageView)paramView.findViewById(2131821561));
      paramView.setTag(paramViewGroup);
      label108: paramViewGroup.uta.setText(localbet.nickname);
      o.ahp().a(localbet.wrK, paramViewGroup.usZ, this.usW.ahG());
      if (localbet.desc == null)
        break label210;
      paramViewGroup.utb.setText(localbet.desc);
      paramViewGroup.utb.setVisibility(0);
      label170: if (localbet.id != this.usY)
        break label222;
      paramViewGroup.utc.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(7549);
      break;
      paramViewGroup = (SDKOAuthUI.b.a)paramView.getTag();
      break label108;
      label210: paramViewGroup.utb.setVisibility(8);
      break label170;
      label222: paramViewGroup.utc.setVisibility(4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.b
 * JD-Core Version:    0.6.2
 */