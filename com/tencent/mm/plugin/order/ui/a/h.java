package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.preference.Preference;

public final class h extends Preference
{
  boolean jlN;
  private View mView;
  boolean peN;
  boolean peO;

  public h(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43917);
    this.mView = null;
    this.peN = false;
    this.peO = false;
    this.jlN = true;
    setLayoutResource(2130970049);
    AppMethodBeat.o(43917);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43918);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43918);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43919);
    super.onBindView(paramView);
    View localView = paramView.findViewById(2131825825);
    paramView = (LinearLayout.LayoutParams)localView.getLayoutParams();
    int i = BackwardSupportUtil.b.b(this.mContext, 10.0F);
    if (this.peN);
    for (int j = i; ; j = 0)
    {
      if (this.peO);
      while (true)
      {
        paramView.setMargins(0, j, 0, i);
        localView.setLayoutParams(paramView);
        if (!this.jlN)
        {
          localView.setVisibility(4);
          AppMethodBeat.o(43919);
        }
        while (true)
        {
          return;
          localView.setVisibility(0);
          AppMethodBeat.o(43919);
        }
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.h
 * JD-Core Version:    0.6.2
 */