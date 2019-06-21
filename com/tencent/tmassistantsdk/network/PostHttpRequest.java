package com.tencent.tmassistantsdk.network;

import com.qq.taf.jce.JceStruct;
import org.apache.http.client.methods.HttpPost;

public abstract class PostHttpRequest
{
  static final String REQUEST_SERVER_URL = "http://masdk.3g.qq.com/";
  static final String TAG = "BaseHttpRequest";
  HttpPost mHttpPost = null;

  // ERROR //
  public void cancleRequest()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	com/tencent/tmassistantsdk/network/PostHttpRequest:mHttpPost	Lorg/apache/http/client/methods/HttpPost;
    //   6: ifnull +53 -> 59
    //   9: aload_0
    //   10: getfield 19	com/tencent/tmassistantsdk/network/PostHttpRequest:mHttpPost	Lorg/apache/http/client/methods/HttpPost;
    //   13: invokevirtual 29	org/apache/http/client/methods/HttpPost:isAborted	()Z
    //   16: ifne +43 -> 59
    //   19: new 31	java/lang/StringBuilder
    //   22: astore_1
    //   23: aload_1
    //   24: ldc 33
    //   26: invokespecial 36	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: ldc 11
    //   31: aload_1
    //   32: aload_0
    //   33: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   36: ldc 42
    //   38: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 55	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aload_0
    //   48: getfield 19	com/tencent/tmassistantsdk/network/PostHttpRequest:mHttpPost	Lorg/apache/http/client/methods/HttpPost;
    //   51: invokevirtual 58	org/apache/http/client/methods/HttpPost:abort	()V
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 19	com/tencent/tmassistantsdk/network/PostHttpRequest:mHttpPost	Lorg/apache/http/client/methods/HttpPost;
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: astore_1
    //   63: ldc 11
    //   65: aload_1
    //   66: ldc 60
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 66	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield 19	com/tencent/tmassistantsdk/network/PostHttpRequest:mHttpPost	Lorg/apache/http/client/methods/HttpPost;
    //   80: goto -21 -> 59
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    //   88: astore_1
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield 19	com/tencent/tmassistantsdk/network/PostHttpRequest:mHttpPost	Lorg/apache/http/client/methods/HttpPost;
    //   94: aload_1
    //   95: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   47	54	62	java/lang/Exception
    //   2	47	83	finally
    //   54	59	83	finally
    //   75	80	83	finally
    //   89	96	83	finally
    //   47	54	88	finally
    //   63	75	88	finally
  }

  protected abstract void onFinished(JceStruct paramJceStruct1, JceStruct paramJceStruct2, int paramInt);

  protected boolean sendRequest(JceStruct paramJceStruct)
  {
    if (paramJceStruct == null);
    while (true)
    {
      return false;
      try
      {
        if (this.mHttpPost != null)
          continue;
        Thread localThread = new java/lang/Thread;
        PostHttpRequest.1 local1 = new com/tencent/tmassistantsdk/network/PostHttpRequest$1;
        local1.<init>(this, paramJceStruct);
        localThread.<init>(local1);
        localThread.start();
      }
      finally
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.network.PostHttpRequest
 * JD-Core Version:    0.6.2
 */