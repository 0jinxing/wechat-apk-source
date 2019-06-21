package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.v;
import java.util.HashMap;
import junit.framework.Assert;

final class d extends BaseAdapter
{
  private final Context context;
  protected int piC;
  private final int style;
  protected String value;
  protected final HashMap<CharSequence, c> values;
  protected CharSequence[] yBt;
  protected CharSequence[] yBu;

  public d(Context paramContext)
  {
    AppMethodBeat.i(107151);
    this.piC = -1;
    this.values = new HashMap();
    this.context = paramContext;
    this.style = 1;
    AppMethodBeat.o(107151);
  }

  protected final void dAw()
  {
    int i = 0;
    AppMethodBeat.i(107152);
    if (this.yBt == null)
      this.yBt = new CharSequence[0];
    if (this.yBu == null)
      this.yBu = new CharSequence[0];
    if (this.yBt.length == this.yBu.length);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.values.clear();
      while (i < this.yBu.length)
      {
        c localc = new c(this.yBt[i], 1048576 + i);
        this.values.put(this.yBu[i], localc);
        i++;
      }
    }
    AppMethodBeat.o(107152);
  }

  public final int getCount()
  {
    return this.yBu.length;
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
    AppMethodBeat.i(107153);
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = v.hu(this.context).inflate(2130970175, null);
      paramView = new d.a();
      paramView.piD = ((TextView)paramViewGroup.findViewById(2131820674));
      paramView.piE = ((CheckBox)paramViewGroup.findViewById(2131826057));
      paramView.piF = ((RadioButton)paramViewGroup.findViewById(2131820934));
      paramViewGroup.setTag(paramView);
    }
    paramView = (d.a)paramViewGroup.getTag();
    paramView.piD.setText(this.yBt[paramInt]);
    switch (this.style)
    {
    default:
      paramView.piE.setVisibility(8);
      paramView.piF.setVisibility(8);
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(107153);
      return paramViewGroup;
      paramView.piE.setVisibility(8);
      paramView.piF.setVisibility(0);
      paramView.piF.setChecked(this.yBu[paramInt].equals(this.value));
      continue;
      paramView.piE.setVisibility(0);
      paramView.piF.setVisibility(8);
      paramView.piE.setChecked(this.yBu[paramInt].equals(this.value));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.d
 * JD-Core Version:    0.6.2
 */