package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.f;

final class VoipVideoFragment$2
  implements View.OnClickListener
{
  VoipVideoFragment$2(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4871);
    paramView = this.sYn;
    if (!VoipVideoFragment.j(this.sYn));
    for (boolean bool = true; ; bool = false)
    {
      VoipVideoFragment.b(paramView, bool);
      if (!VoipVideoFragment.j(this.sYn))
        VoipVideoFragment.k(this.sYn).setVisibility(8);
      Toast.makeText(this.sYn.getActivity(), String.format("mIsShowFaceRect:%b", new Object[] { Boolean.valueOf(VoipVideoFragment.j(this.sYn)) }), 0).show();
      AppMethodBeat.o(4871);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.2
 * JD-Core Version:    0.6.2
 */