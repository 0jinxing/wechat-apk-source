package com.tencent.mm.plugin.story.f;

import android.content.Context;
import android.graphics.Matrix;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cgu;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/presenter/StoryDataProtoUtil$reshowStoryDataEditorItem$1$1$2", "com/tencent/mm/plugin/story/presenter/StoryDataProtoUtil$$special$$inlined$let$lambda$1"})
final class l$a
  implements Runnable
{
  l$a(cgu paramcgu, Matrix paramMatrix, Context paramContext, ViewGroup paramViewGroup, cee paramcee)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109666);
    l locall = l.sac;
    l.a((CharSequence)this.sad.text, this.sad.textColor, this.sad.eUv, this.sae, this.fbw, this.saf);
    AppMethodBeat.o(109666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.l.a
 * JD-Core Version:    0.6.2
 */