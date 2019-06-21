package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;
import java.util.Iterator;
import java.util.List;

final class NoteVoiceView$2
  implements View.OnClickListener
{
  NoteVoiceView$2(NoteVoiceView paramNoteVoiceView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27211);
    if ((com.tencent.mm.r.a.bJ(paramView.getContext())) || (com.tencent.mm.r.a.bH(paramView.getContext())))
      AppMethodBeat.o(27211);
    while (true)
    {
      return;
      if ((!f.Mn()) && (!bo.isNullOrNil(NoteVoiceView.h(this.uVm))))
      {
        t.hO(paramView.getContext());
        AppMethodBeat.o(27211);
      }
      else
      {
        if (bo.bc(NoteVoiceView.h(this.uVm), "").equals(NoteVoiceView.i(this.uVm).path))
          break;
        NoteVoiceView.j(this.uVm);
        AppMethodBeat.o(27211);
      }
    }
    if (NoteVoiceView.i(this.uVm).buH())
    {
      paramView = this.uVm;
      ab.i("MicroMsg.NoteVoiceView", "pause play");
      localObject = paramView.uVk;
      ab.i("MicroMsg.RecordVoiceHelper", "pause play");
      aj.amB("keep_app_silent");
      if (((a)localObject).mfO == null)
        ab.w("MicroMsg.RecordVoiceHelper", "pause play error, player is null");
      while (true)
      {
        localObject = paramView.uVl;
        ((NoteVoiceView.a)localObject).isPaused = true;
        ((NoteVoiceView.a)localObject).removeMessages(4096);
        NoteVoiceView.c(((NoteVoiceView.a)localObject).uVm).setImageResource(2131232106);
        NoteVoiceView.c(((NoteVoiceView.a)localObject).uVm).setContentDescription(((NoteVoiceView.a)localObject).uVm.getContext().getResources().getString(2131297015));
        paramView.mkd.setKeepScreenOn(false);
        AppMethodBeat.o(27211);
        break;
        if (((a)localObject).mfO.pause())
        {
          localObject = ((a)localObject).callbacks.iterator();
          while (((Iterator)localObject).hasNext())
            ((Iterator)localObject).next();
        }
      }
    }
    paramView = this.uVm;
    ab.i("MicroMsg.NoteVoiceView", "resume play");
    Object localObject = paramView.uVk;
    ab.i("MicroMsg.RecordVoiceHelper", "resume play");
    aj.amA("keep_app_silent");
    int i;
    if (((a)localObject).mfO == null)
    {
      ab.w("MicroMsg.RecordVoiceHelper", "resum play error, player is null");
      i = 0;
    }
    boolean bool;
    do
    {
      localObject = paramView.uVl;
      ((NoteVoiceView.a)localObject).isPaused = false;
      ((NoteVoiceView.a)localObject).sendEmptyMessage(4096);
      NoteVoiceView.c(((NoteVoiceView.a)localObject).uVm).setImageResource(2131232107);
      NoteVoiceView.c(((NoteVoiceView.a)localObject).uVm).setContentDescription(((NoteVoiceView.a)localObject).uVm.getContext().getResources().getString(2131296997));
      paramView.mkd.setKeepScreenOn(true);
      if (i == 0)
        NoteVoiceView.j(this.uVm);
      AppMethodBeat.o(27211);
      break;
      bool = ((a)localObject).mfO.Ew();
      i = bool;
    }
    while (!bool);
    localObject = ((a)localObject).callbacks.iterator();
    while (true)
    {
      i = bool;
      if (!((Iterator)localObject).hasNext())
        break;
      ((Iterator)localObject).next();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView.2
 * JD-Core Version:    0.6.2
 */