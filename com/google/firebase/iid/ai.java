package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class ai
{

  @GuardedBy("MessengerIpcClient.class")
  private static ai bwO;
  final Context bvF;
  final ScheduledExecutorService bwP;

  @GuardedBy("this")
  private aj bwQ;

  @GuardedBy("this")
  private int bwR;

  private ai(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    AppMethodBeat.i(108818);
    this.bwQ = new aj(this, (byte)0);
    this.bwR = 1;
    this.bwP = paramScheduledExecutorService;
    this.bvF = paramContext.getApplicationContext();
    AppMethodBeat.o(108818);
  }

  public static ai ar(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(108817);
      if (bwO == null)
      {
        ai localai = new com/google/firebase/iid/ai;
        localai.<init>(paramContext, Executors.newSingleThreadScheduledExecutor());
        bwO = localai;
      }
      paramContext = bwO;
      AppMethodBeat.o(108817);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public final <T> Task<T> a(c<T> paramc)
  {
    try
    {
      AppMethodBeat.i(108819);
      Object localObject;
      if (Log.isLoggable("MessengerIpcClient", 3))
      {
        String str = String.valueOf(paramc);
        int i = String.valueOf(str).length();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(i + 9);
        ((StringBuilder)localObject).append("Queueing ").append(str);
      }
      if (!this.bwQ.b(paramc))
      {
        localObject = new com/google/firebase/iid/aj;
        ((aj)localObject).<init>(this, (byte)0);
        this.bwQ = ((aj)localObject);
        this.bwQ.b(paramc);
      }
      paramc = paramc.bvD.getTask();
      AppMethodBeat.o(108819);
      return paramc;
    }
    finally
    {
    }
    throw paramc;
  }

  public final int uX()
  {
    try
    {
      int i = this.bwR;
      this.bwR = (i + 1);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.ai
 * JD-Core Version:    0.6.2
 */