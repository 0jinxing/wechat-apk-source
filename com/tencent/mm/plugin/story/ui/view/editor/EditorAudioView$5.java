package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.al;
import com.tencent.mm.g.b.a.at;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.b;
import com.tencent.mm.plugin.story.model.audio.c;
import com.tencent.mm.plugin.story.ui.a.e;
import com.tencent.mm.protocal.protobuf.bqk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorAudioView$5
  implements View.OnClickListener
{
  EditorAudioView$5(EditorAudioView paramEditorAudioView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110512);
    EditorAudioView.c(this.sli).setSelection(null);
    paramView = this.sli.getCallback();
    if (paramView != null)
    {
      localObject = AudioCacheInfo.rUj;
      localObject = new AudioCacheInfo();
      ((AudioCacheInfo)localObject).type = AudioCacheInfo.cyK();
      paramView.d((AudioCacheInfo)localObject);
    }
    EditorAudioView.b(this.sli, true);
    EditorAudioView.c(this.sli, false);
    paramView = b.rUx;
    Object localObject = b.cyS();
    if (localObject != null)
    {
      paramView = new bqk();
      paramView.wSK = 14;
      paramView.wSM = ((int)bo.anT());
      ((b)localObject).rUs.add(paramView);
      ab.i(b.TAG, "record enter search " + c.a(paramView));
    }
    paramView = h.scu;
    h.cAm().Fw();
    paramView = h.scu;
    h.cAq().FY();
    paramView = h.scu;
    h.EU(17);
    AppMethodBeat.o(110512);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioView.5
 * JD-Core Version:    0.6.2
 */