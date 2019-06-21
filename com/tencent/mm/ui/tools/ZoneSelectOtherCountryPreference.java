package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public class ZoneSelectOtherCountryPreference extends Preference
{
  String text;
  ZoneSelectOtherCountryPreference.a zIq;

  public ZoneSelectOtherCountryPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ZoneSelectOtherCountryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ZoneSelectOtherCountryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(35020);
    setLayoutResource(2130970127);
    AppMethodBeat.o(35020);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(35022);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(2131826048);
    if (!bo.isNullOrNil(this.text))
      localTextView.setText(this.text);
    paramView.setOnClickListener(new ZoneSelectOtherCountryPreference.1(this));
    AppMethodBeat.o(35022);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35021);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
    localViewGroup.removeAllViews();
    paramViewGroup.inflate(2130970170, localViewGroup);
    AppMethodBeat.o(35021);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference
 * JD-Core Version:    0.6.2
 */