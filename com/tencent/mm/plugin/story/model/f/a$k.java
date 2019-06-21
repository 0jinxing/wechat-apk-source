package com.tencent.mm.plugin.story.model.f;

import a.b.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.f;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"})
public final class a$k<T>
  implements Comparator<T>
{
  public final int compare(T paramT1, T paramT2)
  {
    AppMethodBeat.i(109362);
    paramT2 = (f)paramT2;
    if (paramT2.field_updateTime == 0L)
    {
      l = paramT2.field_storyPostTime * 1000L;
      paramT2 = (Comparable)Long.valueOf(l);
      paramT1 = (f)paramT1;
      if (paramT1.field_updateTime != 0L)
        break label90;
    }
    label90: for (long l = paramT1.field_storyPostTime * 1000L; ; l = paramT1.field_updateTime)
    {
      int i = a.a(paramT2, (Comparable)Long.valueOf(l));
      AppMethodBeat.o(109362);
      return i;
      l = paramT2.field_updateTime;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.a.k
 * JD-Core Version:    0.6.2
 */