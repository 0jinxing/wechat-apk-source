package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public final class g extends Preference
{
  private View mView;

  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(81040);
    this.mView = null;
    setLayoutResource(2130970381);
    AppMethodBeat.o(81040);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81041);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    super.onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(81041);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(138487);
    super.onBindView(paramView);
    AppMethodBeat.o(138487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.g
 * JD-Core Version:    0.6.2
 */