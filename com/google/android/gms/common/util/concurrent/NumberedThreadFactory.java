package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberedThreadFactory
  implements ThreadFactory
{
  private final int priority;
  private final ThreadFactory zzaau;
  private final String zzaav;
  private final AtomicInteger zzaaw;

  public NumberedThreadFactory(String paramString)
  {
    this(paramString, 0);
  }

  public NumberedThreadFactory(String paramString, int paramInt)
  {
    AppMethodBeat.i(90303);
    this.zzaaw = new AtomicInteger();
    this.zzaau = Executors.defaultThreadFactory();
    this.zzaav = ((String)Preconditions.checkNotNull(paramString, "Name must not be null"));
    this.priority = paramInt;
    AppMethodBeat.o(90303);
  }

  public Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(90304);
    paramRunnable = this.zzaau.newThread(new zza(paramRunnable, this.priority));
    String str = this.zzaav;
    int i = this.zzaaw.getAndIncrement();
    paramRunnable.setName(String.valueOf(str).length() + 13 + str + "[" + i + "]");
    AppMethodBeat.o(90304);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.concurrent.NumberedThreadFactory
 * JD-Core Version:    0.6.2
 */