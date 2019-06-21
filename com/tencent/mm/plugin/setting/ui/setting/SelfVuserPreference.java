package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public class SelfVuserPreference extends Preference
{
  Drawable drawable;
  private String qlD;
  String text;

  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(127040);
    setLayoutResource(2130970127);
    AppMethodBeat.o(127040);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(127042);
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(2131822184);
    if (localImageView != null)
    {
      localImageView.setImageDrawable(this.drawable);
      ab.d("MicroMsg.SelfVuserPreference", "onBindView set icon=" + this.drawable);
      if (!bo.isNullOrNil(this.qlD))
        localImageView.setContentDescription(this.qlD);
    }
    paramView = (TextView)paramView.findViewById(2131821513);
    if (paramView != null)
    {
      paramView.setVisibility(0);
      paramView.setText(this.text);
    }
    AppMethodBeat.o(127042);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(127041);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970201, paramViewGroup);
    AppMethodBeat.o(127041);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfVuserPreference
 * JD-Core Version:    0.6.2
 */