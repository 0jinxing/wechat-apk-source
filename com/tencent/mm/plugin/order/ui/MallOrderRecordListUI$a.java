package com.tencent.mm.plugin.order.ui;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

public final class MallOrderRecordListUI$a extends BaseAdapter
{
  protected MallOrderRecordListUI$a(MallOrderRecordListUI paramMallOrderRecordListUI)
  {
  }

  private i AJ(int paramInt)
  {
    AppMethodBeat.i(43857);
    i locali = (i)this.pee.pea.get(paramInt);
    AppMethodBeat.o(43857);
    return locali;
  }

  public final int getCount()
  {
    AppMethodBeat.i(43856);
    int i = this.pee.pea.size();
    AppMethodBeat.o(43856);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43858);
    MallOrderRecordListUI.b localb;
    i locali;
    int i;
    Object localObject1;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.pee, 2130970054, null);
      localb = new MallOrderRecordListUI.b(this.pee, (byte)0);
      localb.peg = ((TextView)paramViewGroup.findViewById(2131825837));
      localb.pei = ((TextView)paramViewGroup.findViewById(2131825839));
      localb.peh = ((TextView)paramViewGroup.findViewById(2131825838));
      localb.pej = ((TextView)paramViewGroup.findViewById(2131825841));
      localb.pel = paramViewGroup.findViewById(2131825834);
      localb.pem = ((TextView)paramViewGroup.findViewById(2131825835));
      localb.pen = ((TextView)paramViewGroup.findViewById(2131825836));
      localb.pek = ((TextView)paramViewGroup.findViewById(2131825840));
      paramViewGroup.setTag(localb);
      locali = AJ(paramInt);
      i = 0;
      if (paramInt != 0)
        break label605;
      i = 1;
      localObject1 = AJ(0);
      paramView = new GregorianCalendar();
      paramView.setTimeInMillis(((i)localObject1).pcX * 1000L);
      paramView = MallOrderRecordListUI.eS(paramView.get(1), paramView.get(2) + 1);
    }
    while (true)
      while (true)
      {
        if (i != 0)
        {
          localObject1 = new SimpleDateFormat(this.pee.getString(2131300014, new Object[] { "" })).format(new Date(AJ(paramInt).pcX * 1000L));
          localb.pem.setText((CharSequence)localObject1);
          if ((!bo.isNullOrNil(paramView)) && (!bo.isNullOrNil((String)this.pee.ped.get(paramView))))
            localb.pen.setText((CharSequence)this.pee.ped.get(paramView));
          localb.pel.setVisibility(0);
          label338: localb.peg.setText(locali.pcW);
          localb.peh.setText(locali.pcY);
          i = this.pee.mController.ylL.getResources().getColor(2131690263);
          paramInt = i;
          if (bo.isNullOrNil(locali.pdk));
        }
        try
        {
          paramInt = Color.parseColor(locali.pdk);
          localb.peh.setTextColor(paramInt);
          localb.pei.setText(this.pee.AI(locali.pcX));
          i = this.pee.mController.ylL.getResources().getColor(2131690265);
          paramInt = i;
          if (bo.isNullOrNil(locali.pdl));
        }
        catch (Exception paramView)
        {
          try
          {
            paramInt = Color.parseColor(locali.pdl);
            if (locali.pcV != locali.pdm)
            {
              paramView = e.e(locali.pcV / 100.0D, locali.pda);
              localObject1 = new SpannableString(paramView);
              ((SpannableString)localObject1).setSpan(new StrikethroughSpan(), 0, paramView.length(), 33);
              localb.pej.setText((CharSequence)localObject1);
              localb.pek.setTextColor(paramInt);
              localb.pek.setText(e.e(locali.pdm / 100.0D, locali.pda));
              AppMethodBeat.o(43858);
              return paramViewGroup;
              localb = (MallOrderRecordListUI.b)paramView.getTag();
              paramViewGroup = paramView;
              break;
              label605: localObject1 = AJ(paramInt);
              Object localObject2 = AJ(paramInt - 1);
              if ((((i)localObject1).pcX <= 0) || (((i)localObject2).pcX <= 0))
                break label835;
              paramView = new GregorianCalendar();
              paramView.setTimeInMillis(((i)localObject2).pcX * 1000L);
              localObject2 = new GregorianCalendar();
              ((GregorianCalendar)localObject2).setTimeInMillis(((i)localObject1).pcX * 1000L);
              if ((paramView.get(1) == ((GregorianCalendar)localObject2).get(1)) && (paramView.get(2) == ((GregorianCalendar)localObject2).get(2)))
                break label835;
              i = 1;
              paramView = MallOrderRecordListUI.eS(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2) + 1);
              continue;
              localb.pel.setVisibility(8);
              break label338;
              paramView = paramView;
              ab.w("MicroMsg.WalletOrderListUI", "Parse color exp. colortext=" + bo.nullAsNil(locali.pdk));
              paramInt = i;
            }
          }
          catch (Exception paramView)
          {
            while (true)
            {
              ab.w("MicroMsg.WalletOrderListUI", "Parse color exp. colortext=" + bo.nullAsNil(locali.pdl));
              paramInt = i;
              continue;
              localb.pej.setText("");
            }
            label835: paramView = null;
          }
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.a
 * JD-Core Version:    0.6.2
 */