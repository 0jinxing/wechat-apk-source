package a.f.b;

import a.l;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "arity", "", "(I)V", "getArity", "()I", "toString", "", "kotlin-stdlib"})
public abstract class k<R>
  implements h<R>, Serializable
{
  private final int AVt;

  public k(int paramInt)
  {
    this.AVt = paramInt;
  }

  public final int dWz()
  {
    return this.AVt;
  }

  public String toString()
  {
    String str = v.a(this);
    j.o(str, "Reflection.renderLambdaToString(this)");
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.f.b.k
 * JD-Core Version:    0.6.2
 */