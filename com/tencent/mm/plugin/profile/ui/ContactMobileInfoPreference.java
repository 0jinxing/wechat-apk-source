package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactMobileInfoPreference extends Preference
{
  private String gDV;
  private TextView iDT;
  private String mTitle;
  private TextView plD;

  public ContactMobileInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public ContactMobileInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23395);
    setLayoutResource(2130970127);
    AppMethodBeat.o(23395);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23397);
    this.iDT = ((TextView)paramView.findViewById(2131820678));
    this.plD = ((TextView)paramView.findViewById(2131820792));
    if (this.iDT != null)
      this.iDT.setText(this.mTitle);
    if (this.plD != null)
      this.plD.setText(this.gDV);
    super.onBindView(paramView);
    AppMethodBeat.o(23397);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23396);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
    localViewGroup.removeAllViews();
    paramViewGroup.inflate(2130970156, localViewGroup);
    AppMethodBeat.o(23396);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactMobileInfoPreference
 * JD-Core Version:    0.6.2
 */