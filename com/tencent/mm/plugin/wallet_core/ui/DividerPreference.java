package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.preference.Preference;

public class DividerPreference extends Preference
{
  private boolean jlN;
  private View mView;
  private boolean peN;
  private boolean peO;

  public DividerPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DividerPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47095);
    this.mView = null;
    this.peN = false;
    this.peO = false;
    this.jlN = true;
    setLayoutResource(2130969295);
    AppMethodBeat.o(47095);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47096);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(47096);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(47097);
    super.onBindView(paramView);
    View localView = paramView.findViewById(2131823314);
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
          AppMethodBeat.o(47097);
        }
        while (true)
        {
          return;
          localView.setVisibility(0);
          AppMethodBeat.o(47097);
        }
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.DividerPreference
 * JD-Core Version:    0.6.2
 */