package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.wenote.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class NoteEditorVoiceBaseView$1
  implements View.OnClickListener
{
  NoteEditorVoiceBaseView$1(NoteEditorVoiceBaseView paramNoteEditorVoiceBaseView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27188);
    String str1 = NoteEditorVoiceBaseView.a(this.uVg);
    String str2;
    if (a.dfY().buH())
    {
      str2 = "true";
      ab.i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", new Object[] { str1, str2, a.dfY().path });
      if ((!com.tencent.mm.r.a.bJ(NoteEditorVoiceBaseView.b(this.uVg))) && (!com.tencent.mm.r.a.bH(NoteEditorVoiceBaseView.b(this.uVg))))
        break label93;
      AppMethodBeat.o(27188);
    }
    while (true)
    {
      return;
      str2 = "false";
      break;
      label93: if ((!f.Mn()) && (!bo.isNullOrNil(NoteEditorVoiceBaseView.a(this.uVg))))
      {
        t.hO(paramView.getContext());
        AppMethodBeat.o(27188);
      }
      else if (k.ddK().miB)
      {
        AppMethodBeat.o(27188);
      }
      else if ((bo.bc(NoteEditorVoiceBaseView.a(this.uVg), "").equals(a.dfY().path)) && (a.dfY().buH()))
      {
        paramView = this.uVg;
        ab.d("MicroMsg.NoteEditorVoiceBaseView", "stop play");
        paramView.ceT();
        a.dfY().stopPlay();
        AppMethodBeat.o(27188);
      }
      else
      {
        NoteEditorVoiceBaseView.c(this.uVg);
        AppMethodBeat.o(27188);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView.1
 * JD-Core Version:    0.6.2
 */