package a.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"})
public final class c
{
  public static final int aO(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(56012);
    paramInt1 = ik(ik(paramInt1, paramInt3) - ik(paramInt2, paramInt3), paramInt3);
    AppMethodBeat.o(56012);
    return paramInt1;
  }

  private static final int ik(int paramInt1, int paramInt2)
  {
    paramInt1 %= paramInt2;
    if (paramInt1 >= 0);
    while (true)
    {
      return paramInt1;
      paramInt1 += paramInt2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.d.c
 * JD-Core Version:    0.6.2
 */