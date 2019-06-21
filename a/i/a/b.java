package a.i.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "Ljava/lang/IllegalAccessException;", "(Ljava/lang/IllegalAccessException;)V", "kotlin-reflect-api"})
public final class b extends Exception
{
  public b(IllegalAccessException paramIllegalAccessException)
  {
    super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", (Throwable)paramIllegalAccessException);
    AppMethodBeat.i(118653);
    AppMethodBeat.o(118653);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.a.b
 * JD-Core Version:    0.6.2
 */