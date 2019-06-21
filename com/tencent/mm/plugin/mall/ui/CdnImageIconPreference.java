package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class CdnImageIconPreference extends IconPreference
{
  String iconUrl;
  private CdnImageView oll;

  public CdnImageIconPreference(Context paramContext)
  {
    super(paramContext);
  }

  public CdnImageIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CdnImageIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43132);
    super.onBindView(paramView);
    this.oll = ((CdnImageView)paramView.findViewById(2131822184));
    if (!bo.isNullOrNil(this.iconUrl))
    {
      this.oll.setUseSdcardCache(true);
      this.oll.setUrl(this.iconUrl);
      this.oll.setVisibility(0);
    }
    AppMethodBeat.o(43132);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43131);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130969000, localViewGroup);
    AppMethodBeat.o(43131);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.CdnImageIconPreference
 * JD-Core Version:    0.6.2
 */