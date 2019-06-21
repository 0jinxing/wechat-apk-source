package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class bb<K, V>
{
  public final ap che;
  public volatile boolean chh;
  public final ae<K, bb.a<V>> exy;
  private final long threshold;
  private final long timeoutMillis;
  public final LinkedHashMap<K, b<K, V>> xBc;
  private final bb.c<K, V> xBd;
  public final ap xBe;
  private final long xBf;
  private boolean xBg;

  public bb(bb.c<K, V> paramc, Looper paramLooper, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(52242);
    this.xBc = new LinkedHashMap();
    this.xBg = true;
    this.chh = false;
    if (paramLooper == null)
    {
      paramc = new IllegalArgumentException("arg looper can not be null!");
      AppMethodBeat.o(52242);
      throw paramc;
    }
    if (paramInt1 <= 0)
    {
      paramc = new IllegalArgumentException("arg size can not be <= 0!");
      AppMethodBeat.o(52242);
      throw paramc;
    }
    this.xBd = paramc;
    this.exy = new ae(paramInt1);
    if (paramInt2 > 0)
    {
      l2 = paramInt2;
      this.threshold = l2;
      if (300000L <= 0L)
        break label222;
    }
    label222: for (long l2 = 300000L; ; l2 = 60000L)
    {
      this.xBf = l2;
      l2 = l1;
      if (1000L > 0L)
        l2 = 1000L;
      this.timeoutMillis = l2;
      this.che = new ap(paramLooper, new bb.1(this), false);
      this.xBe = new ap(new al("RWCache_timeoutChecker").oAl.getLooper(), new bb.2(this), false);
      AppMethodBeat.o(52242);
      return;
      l2 = 40L;
      break;
    }
  }

  private void a(K paramK, b<K, V> paramb)
  {
    AppMethodBeat.i(52246);
    try
    {
      this.xBc.put(paramK, paramb);
      if ((this.xBg) && (this.xBc.size() > this.threshold))
      {
        this.che.ae(0L, 0L);
        this.xBg = false;
      }
      while (true)
      {
        return;
        if (this.che.doT())
        {
          paramK = this.che;
          long l = this.xBf;
          paramK.ae(l, l);
        }
      }
    }
    finally
    {
      AppMethodBeat.o(52246);
    }
    throw paramK;
  }

  public final boolean A(K paramK, V paramV)
  {
    boolean bool = true;
    AppMethodBeat.i(52244);
    if (paramK == null)
    {
      paramK = new NullPointerException("key == null");
      AppMethodBeat.o(52244);
      throw paramK;
    }
    bb.a locala = (bb.a)this.exy.get(paramK);
    Object localObject = new bb.a(paramV);
    if (((bb.a)localObject).equals(locala))
    {
      bool = false;
      AppMethodBeat.o(52244);
      return bool;
    }
    this.exy.put(paramK, localObject);
    localObject = new b();
    ((b)localObject).aCx = paramK;
    ((b)localObject).values = paramV;
    if (paramV == null);
    for (int i = 2; ; i = 1)
    {
      ((b)localObject).xBj = i;
      a(paramK, (b)localObject);
      AppMethodBeat.o(52244);
      break;
    }
  }

  public final V get(K paramK)
  {
    AppMethodBeat.i(52243);
    if (paramK == null)
    {
      paramK = new NullPointerException("key == null");
      AppMethodBeat.o(52243);
      throw paramK;
    }
    bb.a locala = (bb.a)this.exy.get(paramK);
    if (locala != null)
    {
      paramK = locala.xBi;
      AppMethodBeat.o(52243);
    }
    while (true)
    {
      return paramK;
      this.exy.put(paramK, new bb.a(null));
      AppMethodBeat.o(52243);
      paramK = null;
    }
  }

  public final void pl(boolean paramBoolean)
  {
    AppMethodBeat.i(52245);
    ab.i("MicroMsg.RWCache", "summer appendAll force: " + paramBoolean + " tid: " + Thread.currentThread().getId() + " holderMap size: " + this.xBc.size());
    while (true)
    {
      try
      {
        this.xBg = true;
        if (this.xBc.isEmpty())
          return;
        if (!this.xBd.akm())
        {
          AppMethodBeat.o(52245);
          continue;
        }
        Iterator localIterator = this.xBc.entrySet().iterator();
        if (paramBoolean)
        {
          if (!localIterator.hasNext())
            break label299;
          this.xBd.a((b)((Map.Entry)localIterator.next()).getValue());
          localIterator.remove();
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(52245);
      }
      this.chh = false;
      ap localap = this.xBe;
      long l = this.timeoutMillis;
      localap.ae(l, l);
      while ((!this.chh) && (localObject.hasNext()))
      {
        this.xBd.a((b)((Map.Entry)localObject.next()).getValue());
        localObject.remove();
      }
      if (this.chh)
        ab.i("MicroMsg.RWCache", "summer appendAll timeout size[%d] hasNext[%b] end", new Object[] { Integer.valueOf(this.xBc.size()), Boolean.valueOf(localObject.hasNext()) });
      this.xBe.stopTimer();
      label299: this.xBd.akn();
      AppMethodBeat.o(52245);
    }
  }

  public static final class b<K, V>
  {
    public K aCx;
    public V values;
    public int xBj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bb
 * JD-Core Version:    0.6.2
 */