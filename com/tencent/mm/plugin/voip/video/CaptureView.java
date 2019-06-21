package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.video.ObservableSurfaceView;

public class CaptureView extends ObservableSurfaceView
{
  public CaptureView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(5042);
    init();
    AppMethodBeat.o(5042);
  }

  public CaptureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(5043);
    init();
    AppMethodBeat.o(5043);
  }

  public CaptureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(5044);
    init();
    AppMethodBeat.o(5044);
  }

  private void init()
  {
    AppMethodBeat.i(5045);
    if (j.cLO())
      setNeedSetType(true);
    AppMethodBeat.o(5045);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.CaptureView
 * JD-Core Version:    0.6.2
 */