package com.tencent.mm.plugin.facedetect.ui;

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

public final class FaceHeaderPreference extends Preference
{
  private MMActivity crP;
  private TextView gne;
  private ImageView iyo;
  private int lXY;
  private Button lXZ;
  private View lYa;
  private View.OnClickListener lYb;
  private String lYc;
  private String lYd;
  private String mTitle;

  public FaceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(500);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(500);
  }

  public FaceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(501);
    this.mTitle = "";
    this.lXY = 255;
    this.lYb = null;
    this.lYc = "";
    this.lYd = "";
    this.crP = ((MMActivity)paramContext);
    setLayoutResource(2130969472);
    AppMethodBeat.o(501);
  }

  public final void a(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(503);
    this.lYb = paramOnClickListener;
    if ((this.lXZ == null) || (this.lYa == null))
      AppMethodBeat.o(503);
    while (true)
    {
      return;
      if ((this.lXZ != null) && (this.lYb != null))
      {
        this.lXZ.setOnClickListener(paramOnClickListener);
        this.lXZ.setVisibility(0);
        this.lYa.setVisibility(0);
        AppMethodBeat.o(503);
      }
      else
      {
        this.lXZ.setVisibility(8);
        this.lYa.setVisibility(8);
        AppMethodBeat.o(503);
      }
    }
  }

  public final void ej(String paramString1, String paramString2)
  {
    AppMethodBeat.i(502);
    this.lYc = paramString1;
    this.lYd = paramString2;
    if (this.gne != null)
      if (!bo.isNullOrNil(this.lYc))
      {
        this.gne.setText(this.lYc);
        this.gne.setVisibility(0);
        AppMethodBeat.o(502);
      }
    while (true)
    {
      return;
      this.gne.setVisibility(8);
      AppMethodBeat.o(502);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(504);
    super.onBindView(paramView);
    this.iyo = ((ImageView)paramView.findViewById(2131823790));
    this.gne = ((TextView)paramView.findViewById(2131823791));
    this.lXZ = ((Button)paramView.findViewById(2131823774));
    this.lYa = paramView.findViewById(2131823792);
    if (!bo.isNullOrNil(this.lYc))
    {
      this.gne.setText(this.lYc);
      this.gne.setVisibility(0);
      if ((this.lXZ == null) || (this.lYb == null))
        break label149;
      this.lXZ.setOnClickListener(this.lYb);
      this.lXZ.setVisibility(0);
      this.lYa.setVisibility(0);
      AppMethodBeat.o(504);
    }
    while (true)
    {
      return;
      this.gne.setVisibility(8);
      break;
      label149: if (this.lXZ != null)
        this.lXZ.setVisibility(8);
      this.lYa.setVisibility(8);
      AppMethodBeat.o(504);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceHeaderPreference
 * JD-Core Version:    0.6.2
 */