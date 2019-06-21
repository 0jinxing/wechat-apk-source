package a.h;

import a.a.ab;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.NoSuchElementException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"})
public final class c extends ab
{
  private final int AVM;
  private boolean AVN;
  private int AVO;
  private final int hzv;

  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55994);
    this.hzv = paramInt3;
    this.AVM = paramInt2;
    if (this.hzv > 0)
      if (paramInt1 <= paramInt2)
      {
        this.AVN = bool;
        if (!this.AVN)
          break label75;
      }
    while (true)
    {
      this.AVO = paramInt1;
      AppMethodBeat.o(55994);
      return;
      bool = false;
      break;
      if (paramInt1 >= paramInt2)
        break;
      bool = false;
      break;
      label75: paramInt1 = this.AVM;
    }
  }

  public final boolean hasNext()
  {
    return this.AVN;
  }

  public final int nextInt()
  {
    AppMethodBeat.i(55993);
    int i = this.AVO;
    if (i == this.AVM)
    {
      if (!this.AVN)
      {
        Throwable localThrowable = (Throwable)new NoSuchElementException();
        AppMethodBeat.o(55993);
        throw localThrowable;
      }
      this.AVN = false;
    }
    while (true)
    {
      AppMethodBeat.o(55993);
      return i;
      this.AVO += this.hzv;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.h.c
 * JD-Core Version:    0.6.2
 */