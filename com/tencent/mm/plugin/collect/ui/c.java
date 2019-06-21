package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.Preference;

public final class c extends Preference
{
  String edV;
  private TextView iDT;
  private ImageView kEn;
  private Context mContext;
  String mTitle;
  private View mView;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(41324);
    this.mView = null;
    this.iDT = null;
    this.kEn = null;
    this.edV = null;
    this.mTitle = null;
    this.mContext = null;
    this.mContext = paramContext;
    setLayoutResource(2130969165);
    AppMethodBeat.o(41324);
  }

  public c(Context paramContext, byte paramByte)
  {
    super(paramContext);
    AppMethodBeat.i(41325);
    this.mView = null;
    this.iDT = null;
    this.kEn = null;
    this.edV = null;
    this.mTitle = null;
    this.mContext = null;
    this.mContext = paramContext;
    setLayoutResource(2130969164);
    AppMethodBeat.o(41325);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(41326);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(41326);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(41327);
    super.onBindView(paramView);
    this.iDT = ((TextView)paramView.findViewById(16908310));
    this.kEn = ((ImageView)paramView.findViewById(2131822889));
    this.iDT.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, this.mTitle, this.iDT.getTextSize()));
    if (!bo.isNullOrNil(this.edV))
    {
      this.kEn.setVisibility(0);
      g.RQ();
      paramView = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoN(this.edV);
      if ((paramView == null) || ((int)paramView.ewQ <= 0))
      {
        ab.d("MicroMsg.CollectPayInfoPreference", "Receiver in contactStg and try to get contact");
        long l = bo.anU();
        ao.a.flu.a(this.edV, "", new c.1(this, l));
        AppMethodBeat.o(41327);
      }
    }
    while (true)
    {
      return;
      a.b.b(this.kEn, this.edV);
      AppMethodBeat.o(41327);
      continue;
      this.kEn.setVisibility(8);
      AppMethodBeat.o(41327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.c
 * JD-Core Version:    0.6.2
 */