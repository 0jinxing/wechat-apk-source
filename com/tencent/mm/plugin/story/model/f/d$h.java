package com.tencent.mm.plugin.story.model.f;

import a.b.a;
import a.l;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.f;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"})
public final class d$h<T>
  implements Comparator<T>
{
  public final int compare(T paramT1, T paramT2)
  {
    AppMethodBeat.i(109400);
    int i = a.a((Comparable)Integer.valueOf(((f)((o)paramT2).second).field_storyPostTime), (Comparable)Integer.valueOf(((f)((o)paramT1).second).field_storyPostTime));
    AppMethodBeat.o(109400);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.d.h
 * JD-Core Version:    0.6.2
 */