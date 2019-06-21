package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class VoiceHeaderPreference extends Preference
{
  private MMActivity crP;
  private TextView gJE;
  private TextView gne;
  private ImageView iyo;
  private int lXY;
  private Button lXZ;
  private View lYa;
  private View.OnClickListener lYb;
  private String lYc;
  private String lYd;
  private String mTitle;

  public VoiceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(26185);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(26185);
  }

  public VoiceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(26186);
    this.mTitle = "";
    this.lXY = 255;
    this.lYb = null;
    this.lYc = "";
    this.lYd = "";
    this.crP = ((MMActivity)paramContext);
    setLayoutResource(2130971017);
    AppMethodBeat.o(26186);
  }

  public final void a(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(26188);
    this.lYb = paramOnClickListener;
    if ((this.lXZ == null) || (this.lYa == null))
      AppMethodBeat.o(26188);
    while (true)
    {
      return;
      if ((this.lXZ != null) && (this.lYb != null))
      {
        this.lXZ.setOnClickListener(paramOnClickListener);
        this.lXZ.setVisibility(0);
        this.lYa.setVisibility(0);
        AppMethodBeat.o(26188);
      }
      else
      {
        this.lXZ.setVisibility(8);
        this.lYa.setVisibility(8);
        AppMethodBeat.o(26188);
      }
    }
  }

  public final void ej(String paramString1, String paramString2)
  {
    AppMethodBeat.i(26187);
    this.lYc = paramString1;
    this.lYd = paramString2;
    if (this.gne != null)
    {
      if (!bo.isNullOrNil(this.lYc))
      {
        this.gne.setText(this.lYc);
        this.gne.setVisibility(0);
      }
    }
    else
    {
      if (this.gJE == null)
        break label116;
      if (bo.isNullOrNil(this.lYd))
        break label107;
      this.gJE.setText(this.lYd);
      this.gJE.setVisibility(0);
      AppMethodBeat.o(26187);
    }
    while (true)
    {
      return;
      this.gne.setVisibility(8);
      break;
      label107: this.gJE.setVisibility(8);
      label116: AppMethodBeat.o(26187);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(26189);
    super.onBindView(paramView);
    this.iyo = ((ImageView)paramView.findViewById(2131823772));
    this.gne = ((TextView)paramView.findViewById(2131828458));
    this.gJE = ((TextView)paramView.findViewById(2131823773));
    this.lXZ = ((Button)paramView.findViewById(2131823774));
    this.lYa = paramView.findViewById(2131823792);
    if (!bo.isNullOrNil(this.lYc))
    {
      this.gne.setText(this.lYc);
      this.gne.setVisibility(0);
      if (bo.isNullOrNil(this.lYd))
        break label191;
      this.gJE.setText(this.lYd);
      this.gJE.setVisibility(0);
      label131: if ((this.lXZ == null) || (this.lYb == null))
        break label203;
      this.lXZ.setOnClickListener(this.lYb);
      this.lXZ.setVisibility(0);
      this.lYa.setVisibility(0);
      AppMethodBeat.o(26189);
    }
    while (true)
    {
      return;
      this.gne.setVisibility(8);
      break;
      label191: this.gJE.setVisibility(8);
      break label131;
      label203: this.lXZ.setVisibility(8);
      this.lYa.setVisibility(8);
      AppMethodBeat.o(26189);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoiceHeaderPreference
 * JD-Core Version:    0.6.2
 */