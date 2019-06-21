package com.tencent.mm.plugin.story.model;

import a.b.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.b;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"})
public final class i$a$b$a<T>
  implements Comparator<T>
{
  public final int compare(T paramT1, T paramT2)
  {
    AppMethodBeat.i(109037);
    int i = a.a((Comparable)Long.valueOf(((b)paramT2).lastModified()), (Comparable)Long.valueOf(((b)paramT1).lastModified()));
    AppMethodBeat.o(109037);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.i.a.b.a
 * JD-Core Version:    0.6.2
 */