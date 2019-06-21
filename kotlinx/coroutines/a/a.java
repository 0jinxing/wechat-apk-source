package kotlinx.coroutines.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"arraycopy", "", "E", "source", "", "srcPos", "", "destination", "destinationStart", "length", "([Ljava/lang/Object;I[Ljava/lang/Object;II)V", "kotlinx-coroutines-core"})
public final class a
{
  public static final <E> void a(E[] paramArrayOfE1, int paramInt1, E[] paramArrayOfE2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(118384);
    j.p(paramArrayOfE1, "source");
    j.p(paramArrayOfE2, "destination");
    System.arraycopy(paramArrayOfE1, paramInt1, paramArrayOfE2, paramInt2, paramInt3);
    AppMethodBeat.o(118384);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.a
 * JD-Core Version:    0.6.2
 */