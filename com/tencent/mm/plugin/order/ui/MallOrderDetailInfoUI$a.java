package com.tencent.mm.plugin.order.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class MallOrderDetailInfoUI$a extends BaseAdapter
{
  private MallOrderDetailInfoUI$a(MallOrderDetailInfoUI paramMallOrderDetailInfoUI)
  {
  }

  private MallOrderDetailObject.a AF(int paramInt)
  {
    AppMethodBeat.i(43805);
    MallOrderDetailObject.a locala = (MallOrderDetailObject.a)MallOrderDetailInfoUI.e(this.pdR).get(paramInt);
    AppMethodBeat.o(43805);
    return locala;
  }

  public final int getCount()
  {
    AppMethodBeat.i(43804);
    int i = MallOrderDetailInfoUI.e(this.pdR).size();
    AppMethodBeat.o(43804);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(43807);
    paramInt = AF(paramInt).type;
    AppMethodBeat.o(43807);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43806);
    MallOrderDetailObject.a locala = AF(paramInt);
    switch (locala.type)
    {
    default:
      if (paramView == null)
      {
        paramView = View.inflate(this.pdR, 2130970040, null);
        paramViewGroup = new MallOrderDetailInfoUI.b(this.pdR, (byte)0);
        paramViewGroup.kne = ((TextView)paramView.findViewById(2131825797));
        paramViewGroup.kog = ((TextView)paramView.findViewById(2131825798));
        paramViewGroup.koh = ((TextView)paramView.findViewById(2131825794));
        paramViewGroup.jAp = paramView.findViewById(2131825796);
        paramView.setTag(paramViewGroup);
        paramViewGroup.kne.setText(locala.name);
        if (!TextUtils.isEmpty(locala.value))
          break label434;
        paramViewGroup.kog.setVisibility(4);
        label153: if (!locala.kch)
          break label457;
        paramViewGroup.koh.setVisibility(0);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      if (paramInt + 1 < getCount())
      {
        locala = AF(paramInt + 1);
        MallOrderDetailInfoUI.b(paramViewGroup.jAp, locala);
      }
      AppMethodBeat.o(43806);
      while (true)
      {
        return paramView;
        paramView = View.inflate(this.pdR, 2130970042, null);
        paramViewGroup = paramView.findViewById(2131825796);
        MallOrderDetailInfoUI.a(this.pdR, (CheckedTextView)paramView.findViewById(2131825800));
        MallOrderDetailInfoUI.b(this.pdR, (CheckedTextView)paramView.findViewById(2131825799));
        MallOrderDetailInfoUI.f(this.pdR).setOnClickListener(this.pdR.pdQ);
        MallOrderDetailInfoUI.g(this.pdR).setOnClickListener(this.pdR.pdQ);
        if (paramInt + 1 < getCount())
          MallOrderDetailInfoUI.b(paramViewGroup, AF(paramInt + 1));
        AppMethodBeat.o(43806);
      }
      paramView = View.inflate(this.pdR, 2130970041, null);
      paramViewGroup = (TextView)paramView.findViewById(2131825799);
      View localView = paramView.findViewById(2131825796);
      if (bo.getInt(locala.value, 0) >= 0)
      {
        paramViewGroup.setText(2131301331);
        paramViewGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231570, 0);
      }
      while (true)
      {
        if (paramInt + 1 < getCount())
          MallOrderDetailInfoUI.b(localView, AF(paramInt + 1));
        AppMethodBeat.o(43806);
        break;
        paramViewGroup.setText(2131301330);
        paramViewGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231566, 0);
      }
      paramViewGroup = (MallOrderDetailInfoUI.b)paramView.getTag();
      break;
      label434: paramViewGroup.kog.setVisibility(0);
      paramViewGroup.kog.setText(locala.value);
      break label153;
      label457: paramViewGroup.koh.setVisibility(8);
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.a
 * JD-Core Version:    0.6.2
 */