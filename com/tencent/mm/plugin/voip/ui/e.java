package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.widget.BaseSmallView;

public final class e extends BaseSmallView
{
  private TextView timeTv;

  public e(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(4980);
    LayoutInflater.from(paramContext).inflate(2130971036, this);
    this.timeTv = ((TextView)findViewById(2131828572));
    AppMethodBeat.o(4980);
  }

  public final void abZ(String paramString)
  {
    AppMethodBeat.i(4982);
    this.timeTv.setTextSize(1, 12.0F);
    this.timeTv.setText(paramString);
    AppMethodBeat.o(4982);
  }

  public final void aca(String paramString)
  {
    AppMethodBeat.i(4981);
    this.timeTv.setTextSize(1, 14.0F);
    this.timeTv.setText(paramString);
    AppMethodBeat.o(4981);
  }

  public final void cLq()
  {
  }

  public final void cLr()
  {
  }

  public final OpenGlRender getFilterData()
  {
    return null;
  }

  public final void onAnimationEnd()
  {
  }

  public final void setCaptureView(CaptureView paramCaptureView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.e
 * JD-Core Version:    0.6.2
 */