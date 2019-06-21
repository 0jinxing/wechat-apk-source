package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.audio.b;
import com.tencent.mm.plugin.story.model.audio.c;
import com.tencent.mm.plugin.story.ui.a.e;
import com.tencent.mm.protocal.protobuf.bqk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorAudioView$3
  implements View.OnClickListener
{
  EditorAudioView$3(EditorAudioView paramEditorAudioView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110510);
    paramView = this.sli;
    boolean bool;
    if (!EditorAudioView.h(this.sli))
    {
      bool = true;
      EditorAudioView.d(paramView, bool);
      if (EditorAudioView.h(this.sli))
        break label178;
      paramView = this.sli.getCallback();
      if (paramView != null)
        paramView.d(null);
      EditorAudioView.c(this.sli).setSelection(null);
      EditorAudioView.b(this.sli).setSelection(null);
      paramView = b.rUx;
      b localb = b.cyS();
      if (localb == null)
        break label170;
      localb.rUr = false;
      paramView = new bqk();
      paramView.wSJ = localb.rUp;
      paramView.wSK = 8;
      paramView.wSM = ((int)bo.anT());
      localb.rUs.add(paramView);
      ab.i(b.TAG, "record no bgm " + c.a(paramView));
      AppMethodBeat.o(110510);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label170: AppMethodBeat.o(110510);
      continue;
      label178: if (EditorAudioView.i(this.sli) != -1)
      {
        this.sli.Fj(EditorAudioView.i(this.sli));
        AppMethodBeat.o(110510);
      }
      else
      {
        paramView = EditorAudioView.b(this.sli);
        paramView.Fj(paramView.sC);
        AppMethodBeat.o(110510);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioView.3
 * JD-Core Version:    0.6.2
 */