package com.tencent.mm.sdk.g.d;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.f;
import com.tencent.mm.sdk.g.e;
import com.tencent.mm.sdk.g.e.a;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import junit.framework.Assert;

public final class a extends FutureTask<Runnable>
  implements b, Comparable<a>
{
  private static final String FORMAT;
  public volatile boolean bYT;
  public long cmn;
  private long cvc;
  public final String eOn;
  public long fpi;
  final int priority;
  public long startTime;
  public int token;
  private long waitTime;
  private final com.tencent.mm.sdk.g.a.d xDT;
  public String xDU;
  final AtomicBoolean xEN;
  f xEO;
  public Throwable xEP;
  private Handler xEQ;
  public Runnable xzE;

  static
  {
    AppMethodBeat.i(52711);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName=%s");
    localStringBuilder.append("|addTime=%d");
    localStringBuilder.append("|usedTime=%dms");
    localStringBuilder.append("|waitTime=%dms");
    localStringBuilder.append("|started=%b");
    localStringBuilder.append("|isAlive=%b");
    localStringBuilder.append("|loopTag=%s");
    FORMAT = localStringBuilder.toString();
    AppMethodBeat.o(52711);
  }

  public a(Runnable paramRunnable, String paramString1, String paramString2, long paramLong, com.tencent.mm.sdk.g.a.d paramd, f paramf, Handler paramHandler)
  {
    super(paramRunnable, null);
    AppMethodBeat.i(52702);
    this.bYT = true;
    this.xEN = new AtomicBoolean(false);
    Assert.assertNotNull("FutureRunnable arg name is null!", paramString1);
    this.xzE = paramRunnable;
    this.eOn = paramString1;
    this.cvc = paramLong;
    this.priority = 5;
    this.cmn = SystemClock.uptimeMillis();
    this.xDT = paramd;
    this.xEO = paramf;
    this.token = hashCode();
    this.xDU = paramString2;
    this.xEQ = paramHandler;
    AppMethodBeat.o(52702);
  }

  private void f(e parame)
  {
    AppMethodBeat.i(52705);
    if (this.xEQ != null)
      this.xEQ.removeMessages(com.tencent.mm.sdk.g.d.xDN, parame);
    AppMethodBeat.o(52705);
  }

  protected final void done()
  {
    AppMethodBeat.i(52704);
    super.done();
    try
    {
      if (!isCancelled())
        get();
      AppMethodBeat.o(52704);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.xEP = localThrowable;
      if ((this.xEP instanceof RuntimeException))
      {
        localObject = (RuntimeException)this.xEP;
        AppMethodBeat.o(52704);
        throw ((Throwable)localObject);
      }
      if ((this.xEP instanceof Error))
      {
        localObject = (Error)this.xEP;
        AppMethodBeat.o(52704);
        throw ((Throwable)localObject);
      }
      Object localObject = new Error(this.xEP);
      AppMethodBeat.o(52704);
      throw ((Throwable)localObject);
    }
  }

  public final boolean dqs()
  {
    boolean bool = true;
    AppMethodBeat.i(52707);
    if (this.xEN.compareAndSet(false, true))
    {
      this.bYT = false;
      AppMethodBeat.o(52707);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(52707);
      bool = false;
    }
  }

  public final e dqt()
  {
    AppMethodBeat.i(52709);
    e locale = new e(this.eOn);
    if (!this.bYT)
      locale.xDX = e.a.xEb;
    while (true)
    {
      locale.xDY = this.cmn;
      locale.startTime = this.startTime;
      locale.iBv = this.fpi;
      AppMethodBeat.o(52709);
      return locale;
      if (this.xEN.get())
        locale.xDX = e.a.xEa;
      else
        locale.xDX = e.a.xDZ;
    }
  }

  public final String getKey()
  {
    return this.eOn;
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(52706);
    boolean bool;
    if ((this.bYT) && (this.xEN.get()))
    {
      bool = true;
      AppMethodBeat.o(52706);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52706);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(52703);
    if (!this.xEN.compareAndSet(false, true))
    {
      this.bYT = false;
      AppMethodBeat.o(52703);
    }
    while (true)
    {
      return;
      this.startTime = SystemClock.uptimeMillis();
      this.waitTime = (this.startTime - this.cmn - this.cvc);
      if (this.xDT != null)
        this.xDT.a(this.xzE, this.token);
      e locale = dqt();
      if ((this.xEQ != null) && (this.xEO != null))
      {
        Message localMessage = new Message();
        localMessage.what = com.tencent.mm.sdk.g.d.xDN;
        localMessage.obj = locale;
        this.xEQ.sendMessageDelayed(localMessage, 1800000L);
      }
      try
      {
        super.run();
        this.bYT = false;
        this.fpi = (SystemClock.uptimeMillis() - this.startTime);
        f(locale);
        if (this.xEO != null)
          this.xEO.x(this.eOn, this.fpi, this.waitTime);
        if (this.xDT != null)
        {
          this.xDT.b(this.xzE, this.token);
          AppMethodBeat.o(52703);
        }
      }
      finally
      {
        this.bYT = false;
        this.fpi = (SystemClock.uptimeMillis() - this.startTime);
        f(locale);
        if (this.xEO != null)
          this.xEO.x(this.eOn, this.fpi, this.waitTime);
        if (this.xDT != null)
          this.xDT.b(this.xzE, this.token);
        AppMethodBeat.o(52703);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(52708);
    String str1 = FORMAT;
    String str2 = this.eOn;
    long l1 = this.cmn;
    long l2 = this.fpi;
    long l3 = this.waitTime;
    boolean bool1 = this.xEN.get();
    boolean bool2 = this.bYT;
    String str3 = this.xDU;
    if (this.xEP == null);
    for (String str4 = ""; ; str4 = "|throwable=" + this.xEP)
    {
      str4 = String.format(str1, new Object[] { str2, Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Boolean.valueOf(bool1), Boolean.valueOf(bool2), str3, str4 });
      AppMethodBeat.o(52708);
      return str4;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.d.a
 * JD-Core Version:    0.6.2
 */