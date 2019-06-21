package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.f;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$3
  implements View.OnClickListener
{
  VoipVideoFragment$3(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4872);
    boolean bool1 = bo.a((Boolean)paramView.getTag(), false);
    boolean bool2;
    if (!bool1)
    {
      bool2 = true;
      paramView.setTag(Boolean.valueOf(bool2));
      if (!bool1)
        break label117;
      VoipVideoFragment.k(this.sYn).setVisibility(8);
      Toast.makeText(this.sYn.getActivity(), "stop face detect", 0).show();
    }
    while (true)
    {
      if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null))
        ((c)this.sYn.sVY.get()).cJM();
      AppMethodBeat.o(4872);
      return;
      bool2 = false;
      break;
      label117: Toast.makeText(this.sYn.getActivity(), "start face detect", 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.3
 * JD-Core Version:    0.6.2
 */