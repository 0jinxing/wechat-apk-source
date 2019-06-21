package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public class GameRegionPreference extends Preference
{
  GameRegionPreference.a nlP;

  public GameRegionPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public GameRegionPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public GameRegionPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112154);
    setLayoutResource(2130970127);
    AppMethodBeat.o(112154);
  }

  public final void b(GameRegionPreference.a parama)
  {
    AppMethodBeat.i(112155);
    if ((parama == null) || (bo.isNullOrNil(parama.dui)))
    {
      ab.e("MicroMsg.GameRegionPreference", "setData region error");
      AppMethodBeat.o(112155);
    }
    while (true)
    {
      return;
      this.nlP = parama;
      setKey(parama.dui);
      AppMethodBeat.o(112155);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(112157);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(2131824617);
    paramView = (CheckBox)paramView.findViewById(2131824618);
    if ((localTextView != null) && (paramView != null) && (this.nlP != null))
    {
      localTextView.setText(e.a(this.nlP));
      paramView.setChecked(this.nlP.gBF);
    }
    AppMethodBeat.o(112157);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(112156);
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130969772, paramViewGroup);
    AppMethodBeat.o(112156);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRegionPreference
 * JD-Core Version:    0.6.2
 */