package com.tencent.mm.plugin.story.model.f;

import a.f.a.a;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "onNotifyChange"})
final class d$b
  implements k.a
{
  d$b(d paramd)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(109393);
    ab.i(d.access$getTAG$cp(), "chatRoomStgListener ".concat(String.valueOf(paramString)));
    if ((!d.i(this.rXu)) && (j.j(paramString, d.a(this.rXu))))
      b.a("StoryStateFetcher_updateChatRoom", (a)new d.b.1(this));
    AppMethodBeat.o(109393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.d.b
 * JD-Core Version:    0.6.2
 */