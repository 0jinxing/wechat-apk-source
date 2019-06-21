package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public final class i extends Preference
{
  private View mView;
  private int peP;
  String peQ;

  public i(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43920);
    this.mView = null;
    this.peP = 2147483647;
    setLayoutResource(2130970050);
    AppMethodBeat.o(43920);
  }

  public final void UA(String paramString)
  {
    AppMethodBeat.i(43923);
    try
    {
      this.peP = Color.parseColor(paramString);
      AppMethodBeat.o(43923);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        this.peP = -1;
        AppMethodBeat.o(43923);
      }
    }
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43921);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43921);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43922);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(2131825826);
    paramView = (TextView)paramView.findViewById(2131825827);
    localTextView.setText(getTitle());
    paramView.setText(this.peQ);
    if (this.peP != 2147483647)
      paramView.setTextColor(this.peP);
    AppMethodBeat.o(43922);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.i
 * JD-Core Version:    0.6.2
 */