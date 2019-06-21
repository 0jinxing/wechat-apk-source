package kotlinx.coroutines;

import a.c.a;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "kotlinx-coroutines-core"})
public final class ab extends a
{
  public static final ab.a BPM;
  final String name;

  static
  {
    AppMethodBeat.i(118495);
    BPM = new ab.a((byte)0);
    AppMethodBeat.o(118495);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118497);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof ab))
      {
        paramObject = (ab)paramObject;
        if (!j.j(this.name, paramObject.name));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(118497);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118497);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118496);
    String str = this.name;
    int i;
    if (str != null)
    {
      i = str.hashCode();
      AppMethodBeat.o(118496);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(118496);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(118494);
    String str = "CoroutineName(" + this.name + ')';
    AppMethodBeat.o(118494);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.ab
 * JD-Core Version:    0.6.2
 */