package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

final class CardShopUI$a extends BaseAdapter
{
  private CardShopUI$a(CardShopUI paramCardShopUI)
  {
  }

  private od tf(int paramInt)
  {
    AppMethodBeat.i(88636);
    od localod = (od)CardShopUI.a(this.knD).get(paramInt);
    AppMethodBeat.o(88636);
    return localod;
  }

  public final int getCount()
  {
    AppMethodBeat.i(88635);
    int i = CardShopUI.a(this.knD).size();
    AppMethodBeat.o(88635);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88637);
    if (paramView == null)
    {
      paramView = View.inflate(this.knD.mController.ylL, 2130968978, null);
      paramViewGroup = new a();
      paramViewGroup.knE = ((TextView)paramView.findViewById(2131822311));
      paramViewGroup.knF = ((TextView)paramView.findViewById(2131822312));
      paramViewGroup.knG = ((TextView)paramView.findViewById(2131822313));
      paramViewGroup.knH = ((ImageView)paramView.findViewById(2131822315));
      paramViewGroup.knI = paramView.findViewById(2131822314);
      paramView.setTag(paramViewGroup);
    }
    od localod;
    while (true)
    {
      localod = tf(paramInt);
      if (localod != null)
        break;
      paramViewGroup.knE.setText("");
      paramViewGroup.knF.setText("");
      paramViewGroup.knG.setText("");
      AppMethodBeat.o(88637);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
    paramViewGroup.knE.setText(localod.name);
    if (localod.qVo <= 0.0F)
      paramViewGroup.knF.setVisibility(8);
    while (true)
    {
      paramViewGroup.knG.setText(localod.duc + localod.dud + localod.fBg);
      paramViewGroup.knI.setOnClickListener(CardShopUI.f(this.knD));
      paramViewGroup.knI.setTag(localod);
      AppMethodBeat.o(88637);
      break;
      paramViewGroup.knF.setText(l.g(this.knD.getBaseContext(), localod.qVo));
      paramViewGroup.knF.setVisibility(0);
    }
  }

  final class a
  {
    public TextView knE;
    public TextView knF;
    public TextView knG;
    public ImageView knH;
    public View knI;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardShopUI.a
 * JD-Core Version:    0.6.2
 */