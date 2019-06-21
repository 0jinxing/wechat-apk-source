package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ProfileDescribeView;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.base.preference.Preference;

public class ProfileDescribePreference extends Preference
{
  public ad ldh;
  private View omq;
  public bv pCq;
  private ProfileDescribeView vrn;

  public ProfileDescribePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ProfileDescribePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28116);
    super.onBindView(paramView);
    if (this.ldh == null)
      AppMethodBeat.o(28116);
    while (true)
    {
      return;
      this.vrn.cby();
      AppMethodBeat.o(28116);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28115);
    if (this.omq == null)
    {
      View localView = super.onCreateView(paramViewGroup);
      paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
      paramViewGroup.removeAllViews();
      ProfileDescribeView localProfileDescribeView = new ProfileDescribeView(localView.getContext());
      this.vrn = localProfileDescribeView;
      paramViewGroup.addView(localProfileDescribeView, new AbsListView.LayoutParams(-1, -2));
      this.vrn.T(this.ldh);
      this.omq = localView;
    }
    paramViewGroup = this.omq;
    AppMethodBeat.o(28115);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.ProfileDescribePreference
 * JD-Core Version:    0.6.2
 */