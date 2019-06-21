package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/Empty;", "Lkotlinx/coroutines/Incomplete;", "isActive", "", "(Z)V", "()Z", "list", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "toString", "", "kotlinx-coroutines-core"})
final class ar
  implements ay
{
  final boolean csi;

  public ar(boolean paramBoolean)
  {
    this.csi = paramBoolean;
  }

  public final bk ell()
  {
    return null;
  }

  public final boolean isActive()
  {
    return this.csi;
  }

  public final String toString()
  {
    AppMethodBeat.i(118289);
    StringBuilder localStringBuilder = new StringBuilder("Empty{");
    if (this.csi);
    for (String str = "Active"; ; str = "New")
    {
      str = str + '}';
      AppMethodBeat.o(118289);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.ar
 * JD-Core Version:    0.6.2
 */