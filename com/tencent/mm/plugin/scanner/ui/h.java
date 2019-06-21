package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public final class h extends Preference
{
  private Context mContext;
  private View mView;
  List<a.a> pil;

  public h(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(81069);
    this.mView = null;
    this.mContext = null;
    this.pil = null;
    this.mContext = paramContext;
    setLayoutResource(2130970385);
    AppMethodBeat.o(81069);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81070);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(81070);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81071);
    super.onBindView(paramView);
    paramView = (GridView)this.mView.findViewById(2131826579);
    h.b localb = new h.b(this);
    paramView.setAdapter(localb);
    if (this.pil != null)
      localb.setItemList(this.pil);
    AppMethodBeat.o(81071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.h
 * JD-Core Version:    0.6.2
 */