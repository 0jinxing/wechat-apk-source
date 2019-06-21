package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class RemarkInfoPreference extends Preference
{
  private MMActivity crP;
  private TextView gne;
  private ImageView iyo;
  private TextView pnu;
  private boolean ppo;
  private String summary;
  private String title;

  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23761);
    this.ppo = false;
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(23761);
  }

  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23762);
    this.ppo = false;
    setLayoutResource(2130970127);
    setWidgetLayoutResource(2130970202);
    AppMethodBeat.o(23762);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23764);
    this.gne = ((TextView)paramView.findViewById(2131820678));
    this.pnu = ((TextView)paramView.findViewById(2131821841));
    this.iyo = ((ImageView)paramView.findViewById(2131822184));
    if (!this.ppo)
      this.iyo.setVisibility(8);
    while (true)
    {
      if (this.gne != null)
        this.gne.setText(this.title);
      if (this.pnu != null)
        this.pnu.setText(this.summary);
      super.onBindView(paramView);
      AppMethodBeat.o(23764);
      return;
      this.iyo.setVisibility(0);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23763);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
    localViewGroup.removeAllViews();
    paramViewGroup.inflate(2130970165, localViewGroup);
    AppMethodBeat.o(23763);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.RemarkInfoPreference
 * JD-Core Version:    0.6.2
 */