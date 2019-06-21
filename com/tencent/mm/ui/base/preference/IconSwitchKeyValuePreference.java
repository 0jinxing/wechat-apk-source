package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.tools.q;

public class IconSwitchKeyValuePreference extends IconPreference
{
  private TextView pnu;
  private int status = 0;

  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void cu()
  {
    AppMethodBeat.i(107191);
    if (this.pnu == null)
      AppMethodBeat.o(107191);
    while (true)
    {
      return;
      int i = BackwardSupportUtil.b.b(this.mContext, 2.0F);
      this.pnu.setTextColor(q.ij(this.mContext));
      if (this.status == 0)
      {
        this.pnu.setCompoundDrawablesWithIntrinsicBounds(2131232006, 0, 0, 0);
        this.pnu.setCompoundDrawablePadding(i);
        AppMethodBeat.o(107191);
      }
      else if (this.status == 1)
      {
        this.pnu.setCompoundDrawablesWithIntrinsicBounds(2131232004, 0, 0, 0);
        this.pnu.setCompoundDrawablePadding(i);
        AppMethodBeat.o(107191);
      }
      else if (this.status == 2)
      {
        this.pnu.setCompoundDrawablesWithIntrinsicBounds(2131232005, 0, 0, 0);
        this.pnu.setCompoundDrawablePadding(i);
        AppMethodBeat.o(107191);
      }
      else
      {
        this.pnu.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        AppMethodBeat.o(107191);
      }
    }
  }

  public final void NS(int paramInt)
  {
    AppMethodBeat.i(107190);
    this.status = paramInt;
    cu();
    AppMethodBeat.o(107190);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(107189);
    super.onBindView(paramView);
    this.pnu = ((TextView)paramView.findViewById(16908304));
    cu();
    AppMethodBeat.o(107189);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference
 * JD-Core Version:    0.6.2
 */