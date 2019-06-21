package a.i.b.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c<V>
{
  static final c<Object> BND;
  private final c<V> BNE;
  private final c<V> BNF;
  private final long key;
  private final int size;
  private final V value;

  static
  {
    AppMethodBeat.i(122999);
    BND = new c();
    AppMethodBeat.o(122999);
  }

  private c()
  {
    this.size = 0;
    this.key = 0L;
    this.value = null;
    this.BNE = null;
    this.BNF = null;
  }

  private c(long paramLong, V paramV, c<V> paramc1, c<V> paramc2)
  {
    AppMethodBeat.i(122994);
    this.key = paramLong;
    this.value = paramV;
    this.BNE = paramc1;
    this.BNF = paramc2;
    this.size = (paramc1.size + 1 + paramc2.size);
    AppMethodBeat.o(122994);
  }

  private static <V> c<V> a(long paramLong, V paramV, c<V> paramc1, c<V> paramc2)
  {
    AppMethodBeat.i(122998);
    c localc1;
    c localc2;
    if (paramc1.size + paramc2.size > 1)
      if (paramc1.size >= paramc2.size * 5)
      {
        localc1 = paramc1.BNE;
        localc2 = paramc1.BNF;
        if (localc2.size < localc1.size * 2)
        {
          paramV = new c(paramc1.key + paramLong, paramc1.value, localc1, new c(-paramc1.key, paramV, localc2.nX(localc2.key + paramc1.key), paramc2));
          AppMethodBeat.o(122998);
        }
      }
    while (true)
    {
      return paramV;
      c localc3 = localc2.BNE;
      c localc4 = localc2.BNF;
      long l1 = localc2.key;
      long l2 = paramc1.key;
      Object localObject = localc2.value;
      localc3 = new c(-localc2.key, paramc1.value, localc1, localc3.nX(localc3.key + localc2.key));
      long l3 = -paramc1.key;
      long l4 = localc2.key;
      long l5 = localc4.key;
      paramV = new c(l1 + l2 + paramLong, localObject, localc3, new c(l3 - l4, paramV, localc4.nX(localc2.key + l5 + paramc1.key), paramc2));
      AppMethodBeat.o(122998);
      continue;
      if (paramc2.size >= paramc1.size * 5)
      {
        localc3 = paramc2.BNE;
        localObject = paramc2.BNF;
        if (localc3.size < ((c)localObject).size * 2)
        {
          paramV = new c(paramc2.key + paramLong, paramc2.value, new c(-paramc2.key, paramV, paramc1, localc3.nX(localc3.key + paramc2.key)), (c)localObject);
          AppMethodBeat.o(122998);
        }
        else
        {
          localc2 = localc3.BNE;
          localc4 = localc3.BNF;
          paramV = new c(localc3.key + paramc2.key + paramLong, localc3.value, new c(-paramc2.key - localc3.key, paramV, paramc1, localc2.nX(localc2.key + localc3.key + paramc2.key)), new c(-localc3.key, paramc2.value, localc4.nX(localc4.key + localc3.key), (c)localObject));
          AppMethodBeat.o(122998);
        }
      }
      else
      {
        paramV = new c(paramLong, paramV, paramc1, paramc2);
        AppMethodBeat.o(122998);
      }
    }
  }

  private c<V> a(c<V> paramc1, c<V> paramc2)
  {
    AppMethodBeat.i(122997);
    if ((paramc1 == this.BNE) && (paramc2 == this.BNF))
    {
      AppMethodBeat.o(122997);
      paramc1 = this;
    }
    while (true)
    {
      return paramc1;
      paramc1 = a(this.key, this.value, paramc1, paramc2);
      AppMethodBeat.o(122997);
    }
  }

  private c<V> nX(long paramLong)
  {
    AppMethodBeat.i(122995);
    c localc;
    if ((this.size == 0) || (paramLong == this.key))
    {
      AppMethodBeat.o(122995);
      localc = this;
    }
    while (true)
    {
      return localc;
      localc = new c(paramLong, this.value, this.BNE, this.BNF);
      AppMethodBeat.o(122995);
    }
  }

  final c<V> b(long paramLong, V paramV)
  {
    AppMethodBeat.i(122996);
    if (this.size == 0)
    {
      paramV = new c(paramLong, paramV, this, this);
      AppMethodBeat.o(122996);
    }
    while (true)
    {
      return paramV;
      if (paramLong < this.key)
      {
        paramV = a(this.BNE.b(paramLong - this.key, paramV), this.BNF);
        AppMethodBeat.o(122996);
      }
      else if (paramLong > this.key)
      {
        paramV = a(this.BNE, this.BNF.b(paramLong - this.key, paramV));
        AppMethodBeat.o(122996);
      }
      else if (paramV == this.value)
      {
        AppMethodBeat.o(122996);
        paramV = this;
      }
      else
      {
        paramV = new c(paramLong, paramV, this.BNE, this.BNF);
        AppMethodBeat.o(122996);
      }
    }
  }

  final V get(long paramLong)
  {
    Object localObject = this;
    if (((c)localObject).size == 0);
    for (localObject = null; ; localObject = ((c)localObject).value)
    {
      return localObject;
      c localc;
      if (paramLong < ((c)localObject).key)
      {
        localc = ((c)localObject).BNE;
        paramLong -= ((c)localObject).key;
        localObject = localc;
        break;
      }
      if (paramLong > ((c)localObject).key)
      {
        localc = ((c)localObject).BNF;
        paramLong -= ((c)localObject).key;
        localObject = localc;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.d.c
 * JD-Core Version:    0.6.2
 */