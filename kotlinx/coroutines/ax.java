package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "(Lkotlinx/coroutines/NodeList;)V", "isActive", "", "()Z", "getList", "()Lkotlinx/coroutines/NodeList;", "toString", "", "kotlinx-coroutines-core"})
public final class ax
  implements ay
{
  final bk BQt;

  public ax(bk parambk)
  {
    AppMethodBeat.i(118453);
    this.BQt = parambk;
    AppMethodBeat.o(118453);
  }

  public final bk ell()
  {
    return this.BQt;
  }

  public final boolean isActive()
  {
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(118452);
    String str = this.BQt.getString("New");
    AppMethodBeat.o(118452);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.ax
 * JD-Core Version:    0.6.2
 */