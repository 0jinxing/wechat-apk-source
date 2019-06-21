package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class d$a extends BaseAdapter
{
  List<String> aEB;
  private final Context context;
  int piC = -1;
  private final int style;

  public d$a(Context paramContext)
  {
    this.context = paramContext;
    this.style = 1;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44050);
    int i;
    if (this.aEB != null)
    {
      i = this.aEB.size();
      AppMethodBeat.o(44050);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44050);
    }
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
    boolean bool = true;
    AppMethodBeat.i(44051);
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.context, 2130970175, null);
      paramView = new d.b();
      paramView.piD = ((TextView)paramViewGroup.findViewById(2131820674));
      paramView.piE = ((CheckBox)paramViewGroup.findViewById(2131826057));
      paramView.piF = ((RadioButton)paramViewGroup.findViewById(2131820934));
      paramViewGroup.setTag(paramView);
    }
    paramView = (d.b)paramViewGroup.getTag();
    paramView.piD.setText((CharSequence)this.aEB.get(paramInt));
    switch (this.style)
    {
    default:
      paramView.piE.setVisibility(8);
      paramView.piF.setVisibility(8);
      AppMethodBeat.o(44051);
      return paramViewGroup;
    case 1:
      paramView.piE.setVisibility(8);
      paramView.piF.setVisibility(0);
      paramView = paramView.piF;
      if (paramInt == this.piC);
      for (bool = true; ; bool = false)
      {
        paramView.setChecked(bool);
        break;
      }
    case 2:
    }
    paramView.piE.setVisibility(0);
    paramView.piF.setVisibility(8);
    paramView = paramView.piE;
    if (paramInt == this.piC);
    while (true)
    {
      paramView.setChecked(bool);
      break;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.d.a
 * JD-Core Version:    0.6.2
 */