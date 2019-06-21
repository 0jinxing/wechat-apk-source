package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomContributePreference extends Preference
{
  private MaskLayout ekr;
  private ImageView eks;
  private String ekt;

  public RoomContributePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }

  public RoomContributePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(104179);
    setLayoutResource(2130970127);
    setWidgetLayoutResource(2130970183);
    AppMethodBeat.o(104179);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(104181);
    super.onBindView(paramView);
    if ((this.eks != null) && (!bo.isNullOrNil(this.ekt)))
      a.b.b(this.eks, this.ekt);
    AppMethodBeat.o(104181);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104180);
    paramViewGroup = super.onCreateView(paramViewGroup);
    this.ekr = ((MaskLayout)paramViewGroup.findViewById(2131826063));
    this.eks = ((ImageView)paramViewGroup.findViewById(2131820629));
    AppMethodBeat.o(104180);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomContributePreference
 * JD-Core Version:    0.6.2
 */