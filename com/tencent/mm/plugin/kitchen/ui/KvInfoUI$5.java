package com.tencent.mm.plugin.kitchen.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.d;

final class KvInfoUI$5 extends ArrayAdapter
{
  KvInfoUI$5(KvInfoUI paramKvInfoUI, Context paramContext)
  {
    super(paramContext, 2130969915, 2131825205);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(114445);
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    paramViewGroup = (d)KvInfoUI.b(this.nHk).getItem(paramInt);
    TextView localTextView = (TextView)paramView.findViewById(2131825205);
    if ((paramViewGroup != null) && (paramViewGroup.pXS))
      localTextView.setBackgroundResource(2131690683);
    while (true)
    {
      AppMethodBeat.o(114445);
      return paramView;
      localTextView.setBackgroundResource(2131690597);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.ui.KvInfoUI.5
 * JD-Core Version:    0.6.2
 */