package com.tencent.mm.chatroom.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomCardPreference extends Preference
{
  public boolean cui;
  private TextView eoi;
  public CharSequence eoj;
  public CharSequence eok;
  private LinearLayout eol;
  private View mView;

  public RoomCardPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cui = false;
  }

  public RoomCardPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(104468);
    this.cui = false;
    setLayoutResource(2130970127);
    AppMethodBeat.o(104468);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(104470);
    super.onBindView(paramView);
    paramView = (ViewGroup)paramView.findViewById(2131821019).findViewById(2131820982);
    if (this.eol == null)
      this.eol = ((LinearLayout)paramView.getChildAt(1));
    if (this.eoi == null)
      this.eoi = ((TextView)paramView.findViewById(2131826078));
    if (this.cui)
    {
      this.eol.setVisibility(0);
      this.eoi.setVisibility(0);
    }
    while (true)
    {
      if (this.eok != null)
        this.eoi.setText(this.eok);
      AppMethodBeat.o(104470);
      return;
      this.eol.setVisibility(8);
      this.eoi.setVisibility(8);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104469);
    if (this.mView == null)
    {
      View localView = super.onCreateView(paramViewGroup);
      paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
      paramViewGroup.removeAllViews();
      View.inflate(this.mContext, 2130970199, paramViewGroup);
      this.mView = localView;
    }
    paramViewGroup = this.mView;
    AppMethodBeat.o(104469);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.preference.RoomCardPreference
 * JD-Core Version:    0.6.2
 */