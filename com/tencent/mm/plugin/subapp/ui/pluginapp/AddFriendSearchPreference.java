package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.InputPreference.a;
import com.tencent.mm.ui.base.preference.Preference;

public class AddFriendSearchPreference extends Preference
{
  private Context context;
  private TextView gDQ;
  private String suU;
  String suV;
  private View.OnClickListener suW;
  View.OnClickListener suX;
  private InputPreference.a suY;
  private TextView suZ;
  private View.OnClickListener sva;

  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25495);
    this.suU = "";
    this.suV = "";
    this.suW = null;
    this.suX = null;
    this.suY = null;
    this.suZ = null;
    this.gDQ = null;
    this.sva = new AddFriendSearchPreference.1(this);
    this.context = paramContext;
    setLayoutResource(2130970127);
    AppMethodBeat.o(25495);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(25497);
    super.onBindView(paramView);
    paramView.setOnTouchListener(new AddFriendSearchPreference.2(this));
    this.suZ = ((TextView)paramView.findViewById(2131820980));
    this.gDQ = ((TextView)paramView.findViewById(2131826023));
    this.gDQ.setText(this.suV);
    if (this.suX != null)
      this.gDQ.setOnTouchListener(new AddFriendSearchPreference.3(this));
    if (this.suY != null)
    {
      paramView = (Button)paramView.findViewById(2131820869);
      paramView.setOnClickListener(this.sva);
      paramView.setVisibility(0);
    }
    NW(8);
    AppMethodBeat.o(25497);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25496);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970143, paramViewGroup);
    paramViewGroup.setPadding(0, paramViewGroup.getPaddingTop(), 0, paramViewGroup.getPaddingBottom());
    AppMethodBeat.o(25496);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference
 * JD-Core Version:    0.6.2
 */