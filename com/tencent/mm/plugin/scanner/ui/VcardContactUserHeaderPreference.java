package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a.r;
import com.tencent.mm.plugin.scanner.a.r.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public class VcardContactUserHeaderPreference extends Preference
{
  private String bCu;
  private final Context context;
  private String qaA;
  private ImageView qgZ;
  private TextView qha;
  private TextView qhb;
  private TextView qhc;
  private TextView qhd;
  private String qhe;
  private String title;

  public VcardContactUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  public VcardContactUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }

  public final void a(r paramr)
  {
    AppMethodBeat.i(81361);
    if (paramr != null)
    {
      if (!bo.isNullOrNil(paramr.qam.aDu()))
        this.qhe = paramr.qam.aDu();
      if (!bo.isNullOrNil(paramr.bCu))
        this.bCu = paramr.bCu;
      if (!bo.isNullOrNil(paramr.qaA))
        this.qaA = paramr.qaA;
      if (!bo.isNullOrNil(paramr.title))
        this.title = paramr.title;
    }
    AppMethodBeat.o(81361);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81360);
    super.onBindView(paramView);
    ab.e("MicroMsg.scanner.VcardContactUserHeaderPreference", "onbindview");
    this.qgZ = ((ImageView)paramView.findViewById(2131828389));
    this.qha = ((TextView)paramView.findViewById(2131828390));
    if (this.qhe != null)
      this.qha.setText(this.qhe);
    this.qhb = ((TextView)paramView.findViewById(2131828391));
    if (this.bCu != null)
    {
      this.qhb.setText(this.context.getString(2131304211, new Object[] { this.bCu }));
      this.qhb.setVisibility(0);
    }
    this.qhc = ((TextView)paramView.findViewById(2131828393));
    if (this.qaA != null)
    {
      this.qhc.setText(this.context.getString(2131304216, new Object[] { this.qaA }));
      this.qhc.setVisibility(0);
    }
    this.qhd = ((TextView)paramView.findViewById(2131828392));
    if (this.title != null)
    {
      this.qhd.setText(this.context.getString(2131304217, new Object[] { this.title }));
      this.qhd.setVisibility(0);
    }
    AppMethodBeat.o(81360);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.VcardContactUserHeaderPreference
 * JD-Core Version:    0.6.2
 */