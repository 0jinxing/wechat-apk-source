package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.j.a.b;
import java.util.ArrayList;
import java.util.List;

public final class InvoiceListUI$a extends BaseAdapter
{
  private final Context context;
  List<b> items;

  public InvoiceListUI$a(InvoiceListUI paramInvoiceListUI, Context paramContext)
  {
    AppMethodBeat.i(16864);
    this.items = new ArrayList();
    this.context = paramContext;
    AppMethodBeat.o(16864);
  }

  private b ni(int paramInt)
  {
    AppMethodBeat.i(16867);
    b localb = (b)this.items.get(paramInt);
    AppMethodBeat.o(16867);
    return localb;
  }

  public final int getCount()
  {
    AppMethodBeat.i(16866);
    int i = this.items.size();
    AppMethodBeat.o(16866);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(16865);
    paramViewGroup = new a();
    b localb;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130971041, null);
      paramViewGroup.gKm = ((ImageView)paramView.findViewById(2131828587));
      paramViewGroup.gKl = ((TextView)paramView.findViewById(2131828586));
      paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828585));
      paramView.setTag(paramViewGroup);
      localb = ni(paramInt);
      if ((localb.type == null) || (!localb.type.equals("0")))
        break label189;
      paramViewGroup.gKl.setText(2131300677);
      paramViewGroup.gtb.setText(localb.title);
      label123: if ((!InvoiceListUI.d(this.gKj)) || (InvoiceListUI.e(this.gKj) == null) || (InvoiceListUI.e(this.gKj).nuH != localb.nuH))
        break label234;
      paramViewGroup.gKm.setImageResource(2131231853);
    }
    while (true)
    {
      AppMethodBeat.o(16865);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label189: if ((localb.type == null) || (!localb.type.equals("1")))
        break label123;
      paramViewGroup.gKl.setText(2131300683);
      paramViewGroup.gtb.setText(localb.nuI);
      break label123;
      label234: paramViewGroup.gKm.setImageBitmap(null);
    }
  }

  final class a
  {
    TextView gKl;
    ImageView gKm;
    TextView gtb;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceListUI.a
 * JD-Core Version:    0.6.2
 */