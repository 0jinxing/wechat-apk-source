package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NoiseDetectMaskView extends RelativeLayout
{
  ProgressBar gHA;
  private Context mContext;
  TextView mMV;
  TextView sLY;
  private NoiseDetectMaskView.b sLZ;
  private NoiseDetectMaskView.a sMa;

  public NoiseDetectMaskView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(26143);
    this.gHA = null;
    this.mContext = null;
    this.mContext = paramContext;
    this.mContext.getSystemService("layout_inflater");
    LayoutInflater.from(this.mContext).inflate(2130970308, this);
    this.gHA = ((ProgressBar)findViewById(2131826362));
    this.mMV = ((TextView)findViewById(2131826363));
    this.sLY = ((TextView)findViewById(2131826364));
    this.sLY.setOnClickListener(new NoiseDetectMaskView.1(this));
    findViewById(2131823808).setOnClickListener(new NoiseDetectMaskView.2(this));
    AppMethodBeat.o(26143);
  }

  public final void reset()
  {
    AppMethodBeat.i(26144);
    if (this.gHA != null)
      this.gHA.setVisibility(0);
    this.mMV.setText(2131304304);
    this.sLY.setVisibility(8);
    AppMethodBeat.o(26144);
  }

  public void setOnCancelDetectCallback(NoiseDetectMaskView.a parama)
  {
    this.sMa = parama;
  }

  public void setOnClickRetryCallback(NoiseDetectMaskView.b paramb)
  {
    this.sLZ = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView
 * JD-Core Version:    0.6.2
 */