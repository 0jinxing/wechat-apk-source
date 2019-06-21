package kotlinx.coroutines;

import a.c.a;
import a.c.e;
import a.c.e.b;
import a.c.e.b.a;
import a.c.e.c;
import a.f.a.m;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"})
public final class aa extends a
  implements bq<String>
{
  public static final aa.a BPL;
  final long id;

  static
  {
    AppMethodBeat.i(118554);
    BPL = new aa.a((byte)0);
    AppMethodBeat.o(118554);
  }

  public aa(long paramLong)
  {
    super((e.c)BPL);
    AppMethodBeat.i(118553);
    this.id = paramLong;
    AppMethodBeat.o(118553);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this != paramObject)
    {
      bool2 = bool1;
      if (!(paramObject instanceof aa))
        break label45;
      paramObject = (aa)paramObject;
      if (this.id != paramObject.id)
        break label47;
    }
    label45: label47: for (int i = 1; ; i = 0)
    {
      bool2 = bool1;
      if (i != 0)
        bool2 = true;
      return bool2;
    }
  }

  public final <R> R fold(R paramR, m<? super R, ? super e.b, ? extends R> paramm)
  {
    AppMethodBeat.i(118555);
    j.p(paramm, "operation");
    j.p(paramm, "operation");
    paramR = e.b.a.a((e.b)this, paramR, paramm);
    AppMethodBeat.o(118555);
    return paramR;
  }

  public final <E extends e.b> E get(e.c<E> paramc)
  {
    AppMethodBeat.i(118556);
    j.p(paramc, "key");
    j.p(paramc, "key");
    paramc = e.b.a.a((e.b)this, paramc);
    AppMethodBeat.o(118556);
    return paramc;
  }

  public final int hashCode()
  {
    long l = this.id;
    return (int)(l ^ l >>> 32);
  }

  public final e minusKey(e.c<?> paramc)
  {
    AppMethodBeat.i(118557);
    j.p(paramc, "key");
    j.p(paramc, "key");
    paramc = e.b.a.b((e.b)this, paramc);
    AppMethodBeat.o(118557);
    return paramc;
  }

  public final e plus(e parame)
  {
    AppMethodBeat.i(118558);
    j.p(parame, "context");
    j.p(parame, "context");
    parame = e.b.a.a((e.b)this, parame);
    AppMethodBeat.o(118558);
    return parame;
  }

  public final String toString()
  {
    AppMethodBeat.i(118550);
    String str = "CoroutineId(" + this.id + ')';
    AppMethodBeat.o(118550);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.aa
 * JD-Core Version:    0.6.2
 */