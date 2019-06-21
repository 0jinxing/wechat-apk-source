package com.tencent.mm.plugin.story.f;

import a.f.b.j;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.xy;
import com.tencent.mm.storage.emotion.EmojiInfo;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/presenter/StoryDataProtoUtil$reshowStoryDataEditorItem$1$2$2", "com/tencent/mm/plugin/story/presenter/StoryDataProtoUtil$$special$$inlined$let$lambda$2"})
final class l$b
  implements Runnable
{
  l$b(xy paramxy, Matrix paramMatrix, Rect paramRect, Context paramContext, ViewGroup paramViewGroup, cee paramcee)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109667);
    Object localObject = l.sac;
    localObject = g.M(d.class);
    j.o(localObject, "MMKernel.plugin(IPluginEmoji::class.java)");
    localObject = ((d)localObject).getProvider().Je(this.sah.cvZ);
    j.o(localObject, "MMKernel.plugin(IPluginE…der.getEmojiByMd5(it.md5)");
    l.a((EmojiInfo)localObject, this.sae, this.fbw, this.saf);
    AppMethodBeat.o(109667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.l.b
 * JD-Core Version:    0.6.2
 */