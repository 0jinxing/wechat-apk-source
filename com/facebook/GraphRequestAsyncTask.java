package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.List;

public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<GraphResponse>>
{
  private static final String TAG;
  private final HttpURLConnection connection;
  private Exception exception;
  private final GraphRequestBatch requests;

  static
  {
    AppMethodBeat.i(71734);
    TAG = GraphRequestAsyncTask.class.getCanonicalName();
    AppMethodBeat.o(71734);
  }

  public GraphRequestAsyncTask(GraphRequestBatch paramGraphRequestBatch)
  {
    this(null, paramGraphRequestBatch);
  }

  public GraphRequestAsyncTask(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    this.requests = paramGraphRequestBatch;
    this.connection = paramHttpURLConnection;
  }

  public GraphRequestAsyncTask(HttpURLConnection paramHttpURLConnection, Collection<GraphRequest> paramCollection)
  {
    this(paramHttpURLConnection, new GraphRequestBatch(paramCollection));
    AppMethodBeat.i(71727);
    AppMethodBeat.o(71727);
  }

  public GraphRequestAsyncTask(HttpURLConnection paramHttpURLConnection, GraphRequest[] paramArrayOfGraphRequest)
  {
    this(paramHttpURLConnection, new GraphRequestBatch(paramArrayOfGraphRequest));
    AppMethodBeat.i(71726);
    AppMethodBeat.o(71726);
  }

  public GraphRequestAsyncTask(Collection<GraphRequest> paramCollection)
  {
    this(null, new GraphRequestBatch(paramCollection));
    AppMethodBeat.i(71725);
    AppMethodBeat.o(71725);
  }

  public GraphRequestAsyncTask(GraphRequest[] paramArrayOfGraphRequest)
  {
    this(null, new GraphRequestBatch(paramArrayOfGraphRequest));
    AppMethodBeat.i(71724);
    AppMethodBeat.o(71724);
  }

  protected List<GraphResponse> doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(71731);
    try
    {
      if (this.connection == null)
      {
        paramArrayOfVoid = this.requests.executeAndWait();
        AppMethodBeat.o(71731);
      }
      while (true)
      {
        return paramArrayOfVoid;
        paramArrayOfVoid = GraphRequest.executeConnectionAndWait(this.connection, this.requests);
        AppMethodBeat.o(71731);
      }
    }
    catch (Exception paramArrayOfVoid)
    {
      while (true)
      {
        this.exception = paramArrayOfVoid;
        paramArrayOfVoid = null;
        AppMethodBeat.o(71731);
      }
    }
  }

  protected final Exception getException()
  {
    return this.exception;
  }

  protected final GraphRequestBatch getRequests()
  {
    return this.requests;
  }

  protected void onPostExecute(List<GraphResponse> paramList)
  {
    AppMethodBeat.i(71730);
    super.onPostExecute(paramList);
    if (this.exception != null)
      Utility.logd(TAG, String.format("onPostExecute: exception encountered during request: %s", new Object[] { this.exception.getMessage() }));
    AppMethodBeat.o(71730);
  }

  protected void onPreExecute()
  {
    AppMethodBeat.i(71729);
    super.onPreExecute();
    if (FacebookSdk.isDebugEnabled())
      Utility.logd(TAG, String.format("execute async task: %s", new Object[] { this }));
    if (this.requests.getCallbackHandler() == null)
      if (!(Thread.currentThread() instanceof HandlerThread))
        break label75;
    label75: for (Handler localHandler = new Handler(); ; localHandler = new Handler(Looper.getMainLooper()))
    {
      this.requests.setCallbackHandler(localHandler);
      AppMethodBeat.o(71729);
      return;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(71728);
    String str = "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + "}";
    AppMethodBeat.o(71728);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.GraphRequestAsyncTask
 * JD-Core Version:    0.6.2
 */