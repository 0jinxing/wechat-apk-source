package a.i.b.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d<V>
{
  private static final d<Object> BNG;
  private final c<V> BNH;

  static
  {
    AppMethodBeat.i(123003);
    BNG = new d(c.BND);
    AppMethodBeat.o(123003);
  }

  private d(c<V> paramc)
  {
    this.BNH = paramc;
  }

  private d<V> a(c<V> paramc)
  {
    AppMethodBeat.i(123000);
    if (paramc == this.BNH)
    {
      AppMethodBeat.o(123000);
      paramc = this;
    }
    while (true)
    {
      return paramc;
      paramc = new d(paramc);
      AppMethodBeat.o(123000);
    }
  }

  public static <V> d<V> ekG()
  {
    return BNG;
  }

  public final V get(int paramInt)
  {
    AppMethodBeat.i(123001);
    Object localObject = this.BNH.get(paramInt);
    AppMethodBeat.o(123001);
    return localObject;
  }

  public final d<V> t(int paramInt, V paramV)
  {
    AppMethodBeat.i(123002);
    paramV = a(this.BNH.b(paramInt, paramV));
    AppMethodBeat.o(123002);
    return paramV;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.d.d
 * JD-Core Version:    0.6.2
 */