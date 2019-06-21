package com.tencent.mm.plugin.story.f;

import a.f.b.j;
import android.content.Context;
import android.graphics.Matrix;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ayv;
import com.tencent.mm.protocal.protobuf.cee;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/presenter/StoryDataProtoUtil$reshowStoryDataEditorItem$1$3$2", "com/tencent/mm/plugin/story/presenter/StoryDataProtoUtil$$special$$inlined$let$lambda$3"})
final class l$c
  implements Runnable
{
  l$c(ayv paramayv, Matrix paramMatrix, Context paramContext, ViewGroup paramViewGroup, cee paramcee)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109668);
    Object localObject = l.sac;
    localObject = this.saj.eUt;
    j.o(localObject, "it.cityName");
    String str = this.saj.eUu;
    j.o(str, "it.poiName");
    l.a((String)localObject, str, this.sae, this.fbw, this.saf);
    AppMethodBeat.o(109668);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.l.c
 * JD-Core Version:    0.6.2
 */