package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomGrantPreference extends Preference
{
  TextView eku;
  String ekv;

  public RoomGrantPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.eku = null;
    this.ekv = "";
  }

  public RoomGrantPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(104182);
    this.eku = null;
    this.ekv = "";
    setLayoutResource(2130970127);
    setWidgetLayoutResource(2130970202);
    AppMethodBeat.o(104182);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(104184);
    if (this.eku == null)
      this.eku = ((TextView)paramView.findViewById(2131822953));
    this.eku.setText(this.ekv);
    super.onBindView(paramView);
    AppMethodBeat.o(104184);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104183);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970166, paramViewGroup);
    AppMethodBeat.o(104183);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomGrantPreference
 * JD-Core Version:    0.6.2
 */