package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "_exceptionsHolder", "isActive", "()Z", "isCancelling", "isSealed", "getList", "()Lkotlinx/coroutines/NodeList;", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sealLocked", "", "proposedException", "toString", "", "kotlinx-coroutines-core"})
final class bg$b
  implements ay
{
  volatile Object BQF;
  public volatile boolean BQG;
  public volatile Throwable BQH;
  final bk BQt;

  public bg$b(bk parambk, Throwable paramThrowable)
  {
    AppMethodBeat.i(118538);
    this.BQt = parambk;
    this.BQG = false;
    this.BQH = paramThrowable;
    AppMethodBeat.o(118538);
  }

  static ArrayList<Throwable> ely()
  {
    AppMethodBeat.i(118536);
    ArrayList localArrayList = new ArrayList(4);
    AppMethodBeat.o(118536);
    return localArrayList;
  }

  public final void B(Throwable paramThrowable)
  {
    AppMethodBeat.i(118535);
    j.p(paramThrowable, "exception");
    Object localObject = this.BQH;
    if (localObject == null)
    {
      this.BQH = paramThrowable;
      AppMethodBeat.o(118535);
    }
    while (true)
    {
      return;
      if (paramThrowable == localObject)
      {
        AppMethodBeat.o(118535);
      }
      else
      {
        localObject = this.BQF;
        if (localObject == null)
        {
          this.BQF = paramThrowable;
          AppMethodBeat.o(118535);
        }
        else if ((localObject instanceof Throwable))
        {
          if (paramThrowable == localObject)
          {
            AppMethodBeat.o(118535);
          }
          else
          {
            ArrayList localArrayList = ely();
            localArrayList.add(localObject);
            localArrayList.add(paramThrowable);
            this.BQF = localArrayList;
            AppMethodBeat.o(118535);
          }
        }
        else
        {
          if (!(localObject instanceof ArrayList))
            break;
          if (localObject == null)
          {
            paramThrowable = new v("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
            AppMethodBeat.o(118535);
            throw paramThrowable;
          }
          ((ArrayList)localObject).add(paramThrowable);
          AppMethodBeat.o(118535);
        }
      }
    }
    paramThrowable = (Throwable)new IllegalStateException("State is ".concat(String.valueOf(localObject)).toString());
    AppMethodBeat.o(118535);
    throw paramThrowable;
  }

  public final bk ell()
  {
    return this.BQt;
  }

  public final boolean elx()
  {
    if (this.BQH != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isActive()
  {
    if (this.BQH == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isSealed()
  {
    AppMethodBeat.i(118534);
    boolean bool;
    if (this.BQF == bh.elz())
    {
      bool = true;
      AppMethodBeat.o(118534);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118534);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(118537);
    String str = "Finishing[cancelling=" + elx() + ", completing=" + this.BQG + ", rootCause=" + this.BQH + ", exceptions=" + this.BQF + ", list=" + this.BQt + ']';
    AppMethodBeat.o(118537);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bg.b
 * JD-Core Version:    0.6.2
 */