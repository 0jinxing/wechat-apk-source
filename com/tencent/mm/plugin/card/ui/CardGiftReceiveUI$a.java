package com.tencent.mm.plugin.card.ui;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
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
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

final class CardGiftReceiveUI$a extends BaseAdapter
{
  CardGiftReceiveUI$a(CardGiftReceiveUI paramCardGiftReceiveUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(88423);
    int i = CardGiftReceiveUI.b(this.klk).kcP.size();
    AppMethodBeat.o(88423);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88424);
    CardGiftInfo.AccepterItem localAccepterItem = (CardGiftInfo.AccepterItem)CardGiftReceiveUI.b(this.klk).kcP.get(paramInt);
    ImageView localImageView;
    String str;
    if (paramView == null)
    {
      paramView = View.inflate(this.klk, 2130968921, null);
      paramViewGroup = new CardGiftReceiveUI.b(this.klk);
      paramViewGroup.klm = ((ImageView)paramView.findViewById(2131822071));
      paramViewGroup.jWY = ((TextView)paramView.findViewById(2131822072));
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131822073));
      paramViewGroup.kln = ((TextView)paramView.findViewById(2131822074));
      paramView.setTag(paramViewGroup);
      if (localAccepterItem != null)
        if (localAccepterItem.kcX != null)
        {
          localImageView = paramViewGroup.klm;
          str = localAccepterItem.kcX;
          if ((localImageView != null) && (!TextUtils.isEmpty(str)))
            break label232;
        }
    }
    while (true)
    {
      paramViewGroup.jWY.setText(localAccepterItem.kcW);
      paramViewGroup.gsf.setText(localAccepterItem.kcU);
      paramViewGroup.kln.setText(localAccepterItem.kcV + this.klk.mController.ylL.getString(2131297860));
      AppMethodBeat.o(88424);
      return paramView;
      paramViewGroup = (CardGiftReceiveUI.b)paramView.getTag();
      break;
      label232: if (!TextUtils.isEmpty(str))
      {
        Object localObject = new c.a();
        ((c.a)localObject).ePK = e.eSn;
        o.ahq();
        ((c.a)localObject).ePY = null;
        ((c.a)localObject).ePJ = m.Gz(str);
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).eQf = true;
        ((c.a)localObject).eQg = 3.0F;
        ((c.a)localObject).ePF = true;
        ((c.a)localObject).ePO = 34;
        ((c.a)localObject).ePN = 34;
        ((c.a)localObject).ePT = 2130839644;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(str, localImageView, (c)localObject);
      }
      else
      {
        localImageView.setImageResource(2130839644);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.a
 * JD-Core Version:    0.6.2
 */