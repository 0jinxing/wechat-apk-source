package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSingelLinePanel;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;

public class ContactLabelPreference extends Preference
{
  private TextView gne;
  private MMSingelLinePanel plB;
  private ArrayList<String> plC;
  private String title;

  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23392);
    this.plC = new ArrayList();
    setLayoutResource(2130970127);
    AppMethodBeat.o(23392);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23394);
    this.gne = ((TextView)paramView.findViewById(2131820678));
    this.plB = ((MMSingelLinePanel)paramView.findViewById(2131820902));
    this.plB.setSingleLine(true);
    this.plB.yxl = false;
    this.plB.qe(false);
    if (this.gne != null)
      this.gne.setText(this.title);
    if ((this.plB != null) && (this.plC != null) && (this.plC.size() > 0))
      this.plB.a(this.plC, this.plC);
    super.onBindView(paramView);
    AppMethodBeat.o(23394);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23393);
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970154, paramViewGroup);
    AppMethodBeat.o(23393);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactLabelPreference
 * JD-Core Version:    0.6.2
 */