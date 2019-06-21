package com.bumptech.glide.c.b;

import android.util.Log;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.c.c.n.a;
import com.bumptech.glide.h.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

final class y
  implements d.a<Object>, e, e.a
{
  private int aCm;
  private b aCn;
  private Object aCo;
  private c aCp;
  private final f<?> azT;
  private final e.a azU;
  private volatile n.a<?> azZ;

  y(f<?> paramf, e.a parama)
  {
    this.azT = paramf;
    this.azU = parama;
  }

  public final void S(Object paramObject)
  {
    AppMethodBeat.i(91892);
    i locali = this.azT.aAl;
    if ((paramObject != null) && (locali.a(this.azZ.aEq.mh())))
    {
      this.aCo = paramObject;
      this.azU.mm();
      AppMethodBeat.o(91892);
    }
    while (true)
    {
      return;
      this.azU.a(this.azZ.azW, paramObject, this.azZ.aEq, this.azZ.aEq.mh(), this.aCp);
      AppMethodBeat.o(91892);
    }
  }

  public final void a(com.bumptech.glide.c.h paramh, Exception paramException, com.bumptech.glide.c.a.d<?> paramd, com.bumptech.glide.c.a parama)
  {
    AppMethodBeat.i(91896);
    this.azU.a(paramh, paramException, paramd, this.azZ.aEq.mh());
    AppMethodBeat.o(91896);
  }

  public final void a(com.bumptech.glide.c.h paramh1, Object paramObject, com.bumptech.glide.c.a.d<?> paramd, com.bumptech.glide.c.a parama, com.bumptech.glide.c.h paramh2)
  {
    AppMethodBeat.i(91895);
    this.azU.a(paramh1, paramObject, paramd, this.azZ.aEq.mh(), paramh1);
    AppMethodBeat.o(91895);
  }

  public final void b(Exception paramException)
  {
    AppMethodBeat.i(91893);
    this.azU.a(this.aCp, paramException, this.azZ.aEq, this.azZ.aEq.mh());
    AppMethodBeat.o(91893);
  }

  public final void cancel()
  {
    AppMethodBeat.i(91891);
    n.a locala = this.azZ;
    if (locala != null)
      locala.aEq.cancel();
    AppMethodBeat.o(91891);
  }

  public final boolean mk()
  {
    AppMethodBeat.i(91890);
    Object localObject1;
    long l;
    if (this.aCo != null)
    {
      localObject1 = this.aCo;
      this.aCo = null;
      l = com.bumptech.glide.h.e.ok();
    }
    while (true)
    {
      try
      {
        Object localObject3 = this.azT.awi.awj.awN.u(localObject1.getClass());
        if (localObject3 != null)
        {
          d locald = new com/bumptech/glide/c/b/d;
          locald.<init>((com.bumptech.glide.c.d)localObject3, localObject1, this.azT.aAd);
          Object localObject4 = new com/bumptech/glide/c/b/c;
          ((c)localObject4).<init>(this.azZ.azW, this.azT.aAb);
          this.aCp = ((c)localObject4);
          this.azT.mn().a(this.aCp, locald);
          if (Log.isLoggable("SourceGenerator", 2))
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>("Finished encoding source to cache, key: ");
            ((StringBuilder)localObject4).append(this.aCp).append(", data: ").append(localObject1).append(", encoder: ").append(localObject3).append(", duration: ").append(com.bumptech.glide.h.e.q(l));
          }
          this.azZ.aEq.cleanup();
          this.aCn = new b(Collections.singletonList(this.azZ.azW), this.azT, this);
          if ((this.aCn != null) && (this.aCn.mk()))
          {
            AppMethodBeat.o(91890);
            bool = true;
            return bool;
          }
        }
        else
        {
          localObject3 = new com/bumptech/glide/h$e;
          ((h.e)localObject3).<init>(localObject1.getClass());
          AppMethodBeat.o(91890);
          throw ((Throwable)localObject3);
        }
      }
      finally
      {
        this.azZ.aEq.cleanup();
        AppMethodBeat.o(91890);
      }
      this.aCn = null;
      this.azZ = null;
      boolean bool = false;
      if (!bool)
      {
        if (this.aCm < this.azT.mo().size());
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label459;
          List localList = this.azT.mo();
          i = this.aCm;
          this.aCm = (i + 1);
          this.azZ = ((n.a)localList.get(i));
          if ((this.azZ == null) || ((!this.azT.aAl.a(this.azZ.aEq.mh())) && (!this.azT.l(this.azZ.aEq.mg()))))
            break;
          this.azZ.aEq.a(this.azT.aAk, this);
          bool = true;
          break;
        }
      }
      label459: AppMethodBeat.o(91890);
    }
  }

  public final void mm()
  {
    AppMethodBeat.i(91894);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(91894);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.y
 * JD-Core Version:    0.6.2
 */