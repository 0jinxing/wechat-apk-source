package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;

public class VcardContactLinkPreference extends KeyValuePreference
{
  public VcardContactLinkPreference(Context paramContext)
  {
    super(paramContext);
  }

  public VcardContactLinkPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public VcardContactLinkPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81344);
    super.onBindView(paramView);
    ((TextView)paramView.findViewById(16908304)).setTextColor(a.i(this.mContext, 2131689909));
    AppMethodBeat.o(81344);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81343);
    paramViewGroup = super.onCreateView(paramViewGroup);
    AppMethodBeat.o(81343);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference
 * JD-Core Version:    0.6.2
 */