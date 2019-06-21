package com.google.firebase.iid;

import android.support.v4.f.a;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

final class i
{

  @GuardedBy("this")
  private final Map<Pair<String, String>, TaskCompletionSource<String>> bvJ;

  i()
  {
    AppMethodBeat.i(108728);
    this.bvJ = new a();
    AppMethodBeat.o(108728);
  }

  static String a(TaskCompletionSource<String> paramTaskCompletionSource)
  {
    AppMethodBeat.i(108731);
    try
    {
      paramTaskCompletionSource = (String)Tasks.await(paramTaskCompletionSource.getTask());
      AppMethodBeat.o(108731);
      return paramTaskCompletionSource;
    }
    catch (ExecutionException paramTaskCompletionSource)
    {
      paramTaskCompletionSource = paramTaskCompletionSource.getCause();
      if ((paramTaskCompletionSource instanceof IOException))
      {
        paramTaskCompletionSource = (IOException)paramTaskCompletionSource;
        AppMethodBeat.o(108731);
        throw paramTaskCompletionSource;
      }
      if ((paramTaskCompletionSource instanceof RuntimeException))
      {
        paramTaskCompletionSource = (RuntimeException)paramTaskCompletionSource;
        AppMethodBeat.o(108731);
        throw paramTaskCompletionSource;
      }
      paramTaskCompletionSource = new IOException(paramTaskCompletionSource);
      AppMethodBeat.o(108731);
      throw paramTaskCompletionSource;
    }
    catch (InterruptedException paramTaskCompletionSource)
    {
      paramTaskCompletionSource = new IOException(paramTaskCompletionSource);
      AppMethodBeat.o(108731);
    }
    throw paramTaskCompletionSource;
  }

  private static String a(l paraml, TaskCompletionSource<String> paramTaskCompletionSource)
  {
    AppMethodBeat.i(108730);
    try
    {
      paraml = paraml.zzp();
      paramTaskCompletionSource.setResult(paraml);
      AppMethodBeat.o(108730);
      return paraml;
    }
    catch (RuntimeException paraml)
    {
      paramTaskCompletionSource.setException(paraml);
      AppMethodBeat.o(108730);
      throw paraml;
    }
    catch (IOException paraml)
    {
      label25: break label25;
    }
  }

  final l a(String paramString1, String paramString2, l paraml)
  {
    try
    {
      AppMethodBeat.i(108729);
      Pair localPair = new android/util/Pair;
      localPair.<init>(paramString1, paramString2);
      paramString2 = (TaskCompletionSource)this.bvJ.get(localPair);
      int i;
      if (paramString2 != null)
      {
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          paramString1 = String.valueOf(localPair);
          i = String.valueOf(paramString1).length();
          paraml = new java/lang/StringBuilder;
          paraml.<init>(i + 29);
          paraml.append("Joining ongoing request for: ").append(paramString1);
        }
        paramString1 = new com/google/firebase/iid/j;
        paramString1.<init>(paramString2);
        AppMethodBeat.o(108729);
      }
      while (true)
      {
        return paramString1;
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          paramString2 = String.valueOf(localPair);
          i = String.valueOf(paramString2).length();
          paramString1 = new java/lang/StringBuilder;
          paramString1.<init>(i + 24);
          paramString1.append("Making new request for: ").append(paramString2);
        }
        paramString2 = new com/google/android/gms/tasks/TaskCompletionSource;
        paramString2.<init>();
        this.bvJ.put(localPair, paramString2);
        paramString1 = new com/google/firebase/iid/k;
        paramString1.<init>(this, paraml, paramString2, localPair);
        AppMethodBeat.o(108729);
      }
    }
    finally
    {
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.i
 * JD-Core Version:    0.6.2
 */