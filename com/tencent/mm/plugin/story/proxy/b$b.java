package com.tencent.mm.plugin.story.proxy;

import a.l;
import a.v;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/proxy/StoryHintProxy$mHandler$1", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-story_release"})
public final class b$b extends ak
{
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(109724);
    Object localObject;
    if (paramMessage != null)
      localObject = paramMessage.obj;
    while ((localObject != null) && ((paramMessage.obj instanceof View)) && (paramMessage.what == b.a(this.saT)))
    {
      localObject = b.b(this.saT);
      if (localObject != null)
      {
        paramMessage = paramMessage.obj;
        if (paramMessage == null)
        {
          paramMessage = new v("null cannot be cast to non-null type android.view.View");
          AppMethodBeat.o(109724);
          throw paramMessage;
          localObject = null;
        }
        else
        {
          ((View.OnClickListener)localObject).onClick((View)paramMessage);
          AppMethodBeat.o(109724);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109724);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.b.b
 * JD-Core Version:    0.6.2
 */