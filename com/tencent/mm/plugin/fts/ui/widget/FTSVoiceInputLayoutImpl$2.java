package com.tencent.mm.plugin.fts.ui.widget;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FTSVoiceInputLayoutImpl$2
  implements View.OnLongClickListener
{
  FTSVoiceInputLayoutImpl$2(FTSVoiceInputLayoutImpl paramFTSVoiceInputLayoutImpl)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(62182);
    ab.d("MicroMsg.FTSVoiceInputLayoutImpl", "btn onLongClickListener currentState %s", new Object[] { Integer.valueOf(this.mNb.currentState) });
    FTSVoiceInputLayoutImpl.a(this.mNb, true);
    paramView = FTSVoiceInputLayoutImpl.b(this.mNb);
    ab.d("MicroMsg.FTSVoiceInputDrawable", "longClickState %s", new Object[] { Integer.valueOf(paramView.currentState) });
    paramView.currentState = 7;
    paramView.invalidateSelf();
    AppMethodBeat.o(62182);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl.2
 * JD-Core Version:    0.6.2
 */