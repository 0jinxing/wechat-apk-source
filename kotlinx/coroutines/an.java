package kotlinx.coroutines;

import a.c.c;
import a.c.e;
import a.c.e.c;
import a.l;
import a.p;
import a.p.a;
import a.v;
import a.y;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.c.i;
import kotlinx.coroutines.c.j;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate", "()Lkotlin/coroutines/Continuation;", "getExceptionalResult", "", "state", "", "getSuccessfulResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "run", "", "takeState", "kotlinx-coroutines-core"})
public abstract class an<T> extends i
{
  public int BQd;

  public an(int paramInt)
  {
    this.BQd = paramInt;
  }

  public static Throwable eg(Object paramObject)
  {
    Object localObject = null;
    if (!(paramObject instanceof q))
      paramObject = null;
    while (true)
    {
      q localq = (q)paramObject;
      paramObject = localObject;
      if (localq != null)
        paramObject = localq.cause;
      return paramObject;
    }
  }

  public <T> T ec(Object paramObject)
  {
    return paramObject;
  }

  public abstract Object ekO();

  public abstract c<T> ekR();

  public final void run()
  {
    j localj = this.BSN;
    try
    {
      Object localObject1 = ekR();
      if (localObject1 == null)
      {
        localObject1 = new a/v;
        ((v)localObject1).<init>("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        throw ((Throwable)localObject1);
      }
    }
    catch (Throwable localThrowable)
    {
      localObject5 = new kotlinx/coroutines/ak;
      ((ak)localObject5).<init>("Unexpected exception running ".concat(String.valueOf(this)), localThrowable);
      throw ((Throwable)localObject5);
    }
    finally
    {
      localj.emj();
    }
    Object localObject6 = (al)localObject2;
    c localc = ((al)localObject6).BQb;
    Object localObject5 = localc.dWv();
    Object localObject3;
    Object localObject7;
    if (bo.UY(this.BQd))
    {
      localObject3 = (bc)((e)localObject5).get((e.c)bc.BQx);
      localObject7 = ekO();
      localObject6 = o.b((e)localObject5, ((al)localObject6).BPZ);
      if (localObject3 == null)
        break label188;
    }
    while (true)
    {
      try
      {
        if (!((bc)localObject3).isActive())
        {
          localObject7 = (Throwable)((bc)localObject3).els();
          localObject3 = p.AUp;
          localc.dn(p.dl(a.q.n((Throwable)localObject7)));
          localObject3 = y.AUy;
          o.a((e)localObject5, localObject6);
          localj.emj();
          return;
          localObject3 = null;
          break;
        }
        label188: localObject3 = eg(localObject7);
        if (localObject3 != null)
        {
          localObject7 = p.AUp;
          localc.dn(p.dl(a.q.n((Throwable)localObject3)));
          continue;
        }
      }
      finally
      {
        o.a((e)localObject5, localObject6);
      }
      localObject7 = ec(localObject7);
      p.a locala = p.AUp;
      localc.dn(p.dl(localObject7));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.an
 * JD-Core Version:    0.6.2
 */