package a.c.b.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"})
public final class e
{
  static final int a(a parama)
  {
    AppMethodBeat.i(56384);
    try
    {
      Object localObject = parama.getClass().getDeclaredField("label");
      j.o(localObject, "field");
      ((Field)localObject).setAccessible(true);
      localObject = ((Field)localObject).get(parama);
      parama = (a)localObject;
      if (!(localObject instanceof Integer))
        parama = null;
      parama = (Integer)parama;
      if (parama != null);
      for (i = parama.intValue(); ; i = 0)
      {
        i--;
        AppMethodBeat.o(56384);
        return i;
      }
    }
    catch (Exception parama)
    {
      while (true)
        int i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.c.b.a.e
 * JD-Core Version:    0.6.2
 */