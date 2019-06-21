package com.tencent.mm.plugin.story.model.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
public final class g$b<T>
  implements Comparator<T>
{
  public final int compare(T paramT1, T paramT2)
  {
    AppMethodBeat.i(138772);
    int i = a.b.a.a((Comparable)Integer.valueOf(((com.tencent.mm.plugin.story.model.b.a)paramT1).fDG), (Comparable)Integer.valueOf(((com.tencent.mm.plugin.story.model.b.a)paramT2).fDG));
    AppMethodBeat.o(138772);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.g.b
 * JD-Core Version:    0.6.2
 */