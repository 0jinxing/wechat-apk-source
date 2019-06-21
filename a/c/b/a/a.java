package a.c.b.a;

import a.c.c;
import a.f.b.j;
import a.l;
import a.p;
import a.p.a;
import a.q;
import a.y;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"})
public abstract class a
  implements c<Object>, Serializable
{
  final c<Object> AVp;

  public a(c<Object> paramc)
  {
    this.AVp = paramc;
  }

  public c<y> a(Object paramObject, c<?> paramc)
  {
    j.p(paramc, "completion");
    throw ((Throwable)new UnsupportedOperationException("create(Any?;Continuation) has not been overridden"));
  }

  protected abstract Object bO(Object paramObject);

  protected void dWw()
  {
  }

  public final void dn(Object paramObject)
  {
    j.p((c)this, "frame");
    a locala = (a)this;
    while (true)
    {
      c localc = locala.AVp;
      if (localc == null)
        j.dWJ();
      try
      {
        paramObject = locala.bO(paramObject);
        if (paramObject == a.c.a.a.AVh)
          return;
        p.a locala1 = p.AUp;
        paramObject = p.dl(paramObject);
        locala.dWw();
        if ((localc instanceof a))
          locala = (a)localc;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          paramObject = p.AUp;
          paramObject = p.dl(q.n(localThrowable));
          continue;
          localc.dn(paramObject);
        }
      }
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Continuation at ");
    j.p(this, "receiver$0");
    Object localObject = (d)getClass().getAnnotation(d.class);
    if (localObject == null)
    {
      localObject = null;
      if (localObject == null)
        break label153;
    }
    label153: for (localObject = (Serializable)localObject; ; localObject = (Serializable)getClass().getName())
    {
      return localObject;
      int i = ((d)localObject).v();
      if (i > 1)
        throw ((Throwable)new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + i + ". Please update the Kotlin standard library.").toString()));
      i = e.a(this);
      if (i < 0);
      for (i = -1; ; i = localObject.dWy()[i])
      {
        localObject = new StackTraceElement(((d)localObject).c(), ((d)localObject).m(), ((d)localObject).f(), i);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.c.b.a.a
 * JD-Core Version:    0.6.2
 */