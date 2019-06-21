package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.f;
import kotlinx.coroutines.a.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "list", "getList", "()Lkotlinx/coroutines/NodeList;", "getString", "", "state", "toString", "kotlinx-coroutines-core"})
public final class bk extends f
  implements ay
{
  public final bk ell()
  {
    return this;
  }

  public final String getString(String paramString)
  {
    AppMethodBeat.i(118559);
    j.p(paramString, "state");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("List{");
    localStringBuilder.append(paramString);
    localStringBuilder.append("}[");
    int i = 1;
    paramString = elJ();
    if (paramString == null)
    {
      paramString = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
      AppMethodBeat.o(118559);
      throw paramString;
    }
    paramString = (h)paramString;
    if ((j.j(paramString, (f)this) ^ true))
    {
      int j = i;
      bf localbf;
      if ((paramString instanceof bf))
      {
        localbf = (bf)paramString;
        if (i == 0)
          break label128;
        i = 0;
      }
      while (true)
      {
        localStringBuilder.append(localbf);
        j = i;
        paramString = paramString.elK();
        i = j;
        break;
        label128: localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    paramString = localStringBuilder.toString();
    j.o(paramString, "StringBuilder().apply(builderAction).toString()");
    AppMethodBeat.o(118559);
    return paramString;
  }

  public final boolean isActive()
  {
    return true;
  }

  public final String toString()
  {
    AppMethodBeat.i(118560);
    String str = getString("Active");
    AppMethodBeat.o(118560);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bk
 * JD-Core Version:    0.6.2
 */