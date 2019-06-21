package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TextPreference extends Preference
{
  protected int Hu;
  private Context context;
  protected CharSequence mText;
  protected TextView sW;

  public TextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107298);
    this.context = paramContext;
    setLayoutResource(2130970184);
    AppMethodBeat.o(107298);
  }

  private void cu()
  {
    AppMethodBeat.i(107301);
    if (this.sW == null)
      AppMethodBeat.o(107301);
    while (true)
    {
      return;
      this.sW.setText(this.mText);
      this.sW.setGravity(this.Hu);
      AppMethodBeat.o(107301);
    }
  }

  public final void ae(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107302);
    this.mText = paramCharSequence;
    this.Hu = 17;
    cu();
    AppMethodBeat.o(107302);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107300);
    super.onBindView(paramView);
    this.sW = ((TextView)paramView.findViewById(16908310));
    cu();
    AppMethodBeat.o(107300);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107299);
    paramViewGroup = super.onCreateView(paramViewGroup);
    AppMethodBeat.o(107299);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.TextPreference
 * JD-Core Version:    0.6.2
 */