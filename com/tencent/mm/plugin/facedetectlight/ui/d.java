package com.tencent.mm.plugin.facedetectlight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.gif.MMAnimateView;

public final class d extends a
  implements View.OnClickListener
{
  public d(ViewGroup paramViewGroup, com.tencent.mm.plugin.facedetectlight.ui.container.a parama)
  {
    super(paramViewGroup, parama);
  }

  public final int btU()
  {
    return 2130969467;
  }

  public final void initView()
  {
    AppMethodBeat.i(806);
    FaceDetectReporter.bsJ().bsK();
    FaceDetectReporter.bsJ().bsL();
    FaceDetectReporter.bsJ().lUA = System.currentTimeMillis();
    MMAnimateView localMMAnimateView = (MMAnimateView)findViewById(2131823784);
    localMMAnimateView.setImageResource(2131231249);
    localMMAnimateView.start();
    ((Button)findViewById(2131823787)).setOnClickListener(this);
    AppMethodBeat.o(806);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(807);
    if (paramView.getId() == 2131823787)
    {
      setVisibility(8);
      this.mds.startPreview();
    }
    AppMethodBeat.o(807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.d
 * JD-Core Version:    0.6.2
 */