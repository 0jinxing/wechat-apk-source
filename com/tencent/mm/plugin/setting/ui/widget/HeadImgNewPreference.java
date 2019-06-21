package com.tencent.mm.plugin.setting.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgNewPreference extends Preference
{
  private int height;
  private ImageView iNr;
  private TextView qqS;
  private View qqT;
  private String qqU;
  public View.OnClickListener qqV;
  private boolean qqW;
  private boolean qqX;

  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(127698);
    this.height = -1;
    this.qqW = false;
    this.qqX = false;
    setLayoutResource(2130970127);
    AppMethodBeat.o(127698);
  }

  public final void WB(String paramString)
  {
    AppMethodBeat.i(127700);
    this.qqU = null;
    if (this.iNr != null)
    {
      a.b.b(this.iNr, paramString);
      if (paramString != null)
        break label48;
      this.qqW = false;
      AppMethodBeat.o(127700);
    }
    while (true)
    {
      return;
      this.qqU = paramString;
      break;
      label48: this.qqW = true;
      AppMethodBeat.o(127700);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(127701);
    super.onBindView(paramView);
    if (this.iNr == null)
      this.iNr = ((ImageView)paramView.findViewById(2131826036));
    if (this.qqS == null)
      this.qqS = ((TextView)paramView.findViewById(2131826038));
    if (this.qqT == null)
      this.qqT = paramView.findViewById(2131821044);
    if (this.qqV != null)
      this.qqT.setOnClickListener(this.qqV);
    if (this.qqU != null)
    {
      a.b.b(this.iNr, this.qqU);
      this.qqU = null;
    }
    if (!this.qqW)
    {
      this.qqT.setVisibility(8);
      this.qqS.setVisibility(0);
    }
    while (true)
    {
      paramView = (RelativeLayout)paramView.findViewById(2131822347);
      if (this.height != -1)
        paramView.setMinimumHeight(this.height);
      AppMethodBeat.o(127701);
      return;
      this.qqS.setVisibility(8);
      this.qqT.setVisibility(0);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(127699);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    if (this.qqX)
      View.inflate(this.mContext, 2130970247, localViewGroup);
    while (true)
    {
      this.iNr = ((ImageView)paramViewGroup.findViewById(2131826036));
      this.qqS = ((TextView)paramViewGroup.findViewById(2131826038));
      this.qqT = paramViewGroup.findViewById(2131821044);
      AppMethodBeat.o(127699);
      return paramViewGroup;
      View.inflate(this.mContext, 2130970150, localViewGroup);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.HeadImgNewPreference
 * JD-Core Version:    0.6.2
 */