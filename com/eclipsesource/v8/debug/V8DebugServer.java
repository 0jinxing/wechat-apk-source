package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.List;

public class V8DebugServer
{
  private static final String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
  public static String DEBUG_OBJECT_NAME;
  private static final String HEADER_EMBEDDING_HOST = "Embedding-Host: ";
  private static final String HEADER_PROTOCOL_VERSION = "Protocol-Version: ";
  private static final String HEADER_TYPE = "Type: ";
  private static final String HEADER_V8_VERSION = "V8-Version: ";
  private static final String J2V8_VERSION = "4.0.0";
  private static final String MAKE_BREAK_EVENT = "__j2v8_MakeBreakEvent";
  private static final String MAKE_COMPILE_EVENT = "__j2v8_MakeCompileEvent";
  private static final int PROTOCOL_BUFFER_SIZE = 4096;
  private static final Charset PROTOCOL_CHARSET;
  private static final byte[] PROTOCOL_CONTENT_LENGTH_BYTES;
  private static final String PROTOCOL_CONTENT_LENGTH_HEADER = "Content-Length:";
  private static final String PROTOCOL_EOL = "\r\n";
  private static final byte[] PROTOCOL_EOL_BYTES;
  private static final String PROTOCOL_VERSION = "1";
  private static final String SET_LISTENER = "setListener";
  private static final String V8_DEBUG_OBJECT = "Debug";
  private static final String V8_VERSION = "4.10.253";
  private Socket client;
  private Object clientLock;
  private V8Object debugObject;
  private List<String> requests;
  private V8Object runningStateDcp;
  private V8 runtime;
  private ServerSocket server;
  private V8Object stoppedStateDcp;
  private boolean traceCommunication;
  private boolean waitForConnection;

  static
  {
    AppMethodBeat.i(74946);
    DEBUG_OBJECT_NAME = "__j2v8_Debug";
    PROTOCOL_CHARSET = Charset.forName("UTF-8");
    PROTOCOL_EOL_BYTES = "\r\n".getBytes(PROTOCOL_CHARSET);
    PROTOCOL_CONTENT_LENGTH_BYTES = "Content-Length:".getBytes(PROTOCOL_CHARSET);
    AppMethodBeat.o(74946);
  }

  // ERROR //
  public V8DebugServer(V8 paramV8, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 124	java/lang/Object:<init>	()V
    //   4: ldc 125
    //   6: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: new 4	java/lang/Object
    //   13: dup
    //   14: invokespecial 124	java/lang/Object:<init>	()V
    //   17: putfield 127	com/eclipsesource/v8/debug/V8DebugServer:clientLock	Ljava/lang/Object;
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield 129	com/eclipsesource/v8/debug/V8DebugServer:traceCommunication	Z
    //   25: aload_0
    //   26: new 131	java/util/LinkedList
    //   29: dup
    //   30: invokespecial 132	java/util/LinkedList:<init>	()V
    //   33: putfield 134	com/eclipsesource/v8/debug/V8DebugServer:requests	Ljava/util/List;
    //   36: aload_0
    //   37: aload_1
    //   38: putfield 136	com/eclipsesource/v8/debug/V8DebugServer:runtime	Lcom/eclipsesource/v8/V8;
    //   41: aload_0
    //   42: iload_3
    //   43: putfield 138	com/eclipsesource/v8/debug/V8DebugServer:waitForConnection	Z
    //   46: aload_1
    //   47: getstatic 94	com/eclipsesource/v8/debug/V8DebugServer:DEBUG_OBJECT_NAME	Ljava/lang/String;
    //   50: invokevirtual 144	com/eclipsesource/v8/V8:getObject	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   53: astore 4
    //   55: aload 4
    //   57: ifnonnull +17 -> 74
    //   60: getstatic 150	java/lang/System:err	Ljava/io/PrintStream;
    //   63: ldc 152
    //   65: invokevirtual 158	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   68: ldc 125
    //   70: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: return
    //   74: aload_0
    //   75: aload 4
    //   77: ldc 60
    //   79: invokevirtual 161	com/eclipsesource/v8/V8Object:getObject	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   82: putfield 163	com/eclipsesource/v8/debug/V8DebugServer:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   85: aload 4
    //   87: invokevirtual 166	com/eclipsesource/v8/V8Object:release	()V
    //   90: aload_1
    //   91: new 168	java/lang/StringBuilder
    //   94: dup
    //   95: ldc 170
    //   97: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   100: getstatic 94	com/eclipsesource/v8/debug/V8DebugServer:DEBUG_OBJECT_NAME	Ljava/lang/String;
    //   103: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: ldc 178
    //   108: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: getstatic 94	com/eclipsesource/v8/debug/V8DebugServer:DEBUG_OBJECT_NAME	Ljava/lang/String;
    //   114: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: ldc 180
    //   119: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: getstatic 94	com/eclipsesource/v8/debug/V8DebugServer:DEBUG_OBJECT_NAME	Ljava/lang/String;
    //   125: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc 182
    //   130: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: getstatic 94	com/eclipsesource/v8/debug/V8DebugServer:DEBUG_OBJECT_NAME	Ljava/lang/String;
    //   136: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: ldc 184
    //   141: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: getstatic 94	com/eclipsesource/v8/debug/V8DebugServer:DEBUG_OBJECT_NAME	Ljava/lang/String;
    //   147: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc 186
    //   152: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokevirtual 193	com/eclipsesource/v8/V8:executeVoidScript	(Ljava/lang/String;)V
    //   161: new 195	java/net/ServerSocket
    //   164: astore_1
    //   165: aload_1
    //   166: iload_2
    //   167: invokespecial 197	java/net/ServerSocket:<init>	(I)V
    //   170: aload_0
    //   171: aload_1
    //   172: putfield 199	com/eclipsesource/v8/debug/V8DebugServer:server	Ljava/net/ServerSocket;
    //   175: ldc 125
    //   177: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: goto -107 -> 73
    //   183: astore_1
    //   184: aload 4
    //   186: invokevirtual 166	com/eclipsesource/v8/V8Object:release	()V
    //   189: ldc 125
    //   191: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: aload_1
    //   195: athrow
    //   196: astore_1
    //   197: aload_0
    //   198: aload_1
    //   199: invokevirtual 203	com/eclipsesource/v8/debug/V8DebugServer:logError	(Ljava/lang/Throwable;)V
    //   202: ldc 125
    //   204: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: goto -134 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   74	85	183	finally
    //   161	175	196	java/lang/Exception
  }

  public static void configureV8ForDebugging()
  {
    AppMethodBeat.i(74929);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("-expose-debug-as=");
      V8.setFlags(DEBUG_OBJECT_NAME);
      AppMethodBeat.o(74929);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(74929);
    }
  }

  // ERROR //
  private void enterBreakLoop(V8Object paramV8Object1, V8Object paramV8Object2)
  {
    // Byte code:
    //   0: ldc_w 263
    //   3: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 265	com/eclipsesource/v8/V8Array
    //   9: astore_3
    //   10: aload_3
    //   11: aload_0
    //   12: getfield 136	com/eclipsesource/v8/debug/V8DebugServer:runtime	Lcom/eclipsesource/v8/V8;
    //   15: invokespecial 268	com/eclipsesource/v8/V8Array:<init>	(Lcom/eclipsesource/v8/V8;)V
    //   18: aload_3
    //   19: iconst_0
    //   20: invokevirtual 272	com/eclipsesource/v8/V8Array:push	(Z)Lcom/eclipsesource/v8/V8Array;
    //   23: pop
    //   24: aload_0
    //   25: aload_1
    //   26: ldc_w 274
    //   29: aload_3
    //   30: invokevirtual 278	com/eclipsesource/v8/V8Object:executeObjectFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)Lcom/eclipsesource/v8/V8Object;
    //   33: putfield 280	com/eclipsesource/v8/debug/V8DebugServer:stoppedStateDcp	Lcom/eclipsesource/v8/V8Object;
    //   36: aload_3
    //   37: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   40: aload_1
    //   41: ldc_w 283
    //   44: invokevirtual 287	com/eclipsesource/v8/V8Object:getInteger	(Ljava/lang/String;)I
    //   47: istore 4
    //   49: aload_2
    //   50: ldc_w 289
    //   53: invokevirtual 293	com/eclipsesource/v8/V8Object:getArray	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Array;
    //   56: astore_3
    //   57: new 265	com/eclipsesource/v8/V8Array
    //   60: astore 5
    //   62: aload 5
    //   64: aload_0
    //   65: getfield 136	com/eclipsesource/v8/debug/V8DebugServer:runtime	Lcom/eclipsesource/v8/V8;
    //   68: invokespecial 268	com/eclipsesource/v8/V8Array:<init>	(Lcom/eclipsesource/v8/V8;)V
    //   71: aload 5
    //   73: iload 4
    //   75: invokevirtual 296	com/eclipsesource/v8/V8Array:push	(I)Lcom/eclipsesource/v8/V8Array;
    //   78: pop
    //   79: aload 5
    //   81: aload_3
    //   82: invokevirtual 299	com/eclipsesource/v8/V8Array:push	(Lcom/eclipsesource/v8/V8Value;)Lcom/eclipsesource/v8/V8Array;
    //   85: pop
    //   86: aload_0
    //   87: getfield 163	com/eclipsesource/v8/debug/V8DebugServer:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   90: ldc 34
    //   92: aload 5
    //   94: invokevirtual 278	com/eclipsesource/v8/V8Object:executeObjectFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)Lcom/eclipsesource/v8/V8Object;
    //   97: astore_1
    //   98: aload_1
    //   99: ldc_w 301
    //   102: aconst_null
    //   103: invokevirtual 305	com/eclipsesource/v8/V8Object:executeStringFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)Ljava/lang/String;
    //   106: astore_2
    //   107: aload_0
    //   108: getfield 129	com/eclipsesource/v8/debug/V8DebugServer:traceCommunication	Z
    //   111: ifeq +19 -> 130
    //   114: getstatic 308	java/lang/System:out	Ljava/io/PrintStream;
    //   117: ldc_w 310
    //   120: aload_2
    //   121: invokestatic 314	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   124: invokevirtual 318	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   127: invokevirtual 158	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   130: aload_0
    //   131: aload_2
    //   132: invokespecial 321	com/eclipsesource/v8/debug/V8DebugServer:sendJson	(Ljava/lang/String;)V
    //   135: aload 5
    //   137: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   140: aload_3
    //   141: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   144: aload_1
    //   145: ifnull +7 -> 152
    //   148: aload_1
    //   149: invokevirtual 166	com/eclipsesource/v8/V8Object:release	()V
    //   152: aload_0
    //   153: invokespecial 225	com/eclipsesource/v8/debug/V8DebugServer:isConnected	()Z
    //   156: ifeq +97 -> 253
    //   159: aload_0
    //   160: getfield 280	com/eclipsesource/v8/debug/V8DebugServer:stoppedStateDcp	Lcom/eclipsesource/v8/V8Object;
    //   163: ldc_w 323
    //   166: aconst_null
    //   167: invokevirtual 327	com/eclipsesource/v8/V8Object:executeBooleanFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)Z
    //   170: istore 6
    //   172: iload 6
    //   174: ifne +79 -> 253
    //   177: aload_0
    //   178: ldc2_w 328
    //   181: invokevirtual 333	com/eclipsesource/v8/debug/V8DebugServer:processRequests	(J)V
    //   184: goto -32 -> 152
    //   187: astore_1
    //   188: goto -36 -> 152
    //   191: astore_1
    //   192: aload_3
    //   193: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   196: ldc_w 263
    //   199: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: aload_1
    //   203: athrow
    //   204: astore_1
    //   205: aload_0
    //   206: getfield 280	com/eclipsesource/v8/debug/V8DebugServer:stoppedStateDcp	Lcom/eclipsesource/v8/V8Object;
    //   209: invokevirtual 166	com/eclipsesource/v8/V8Object:release	()V
    //   212: aload_0
    //   213: aconst_null
    //   214: putfield 280	com/eclipsesource/v8/debug/V8DebugServer:stoppedStateDcp	Lcom/eclipsesource/v8/V8Object;
    //   217: ldc_w 263
    //   220: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: aload_1
    //   224: athrow
    //   225: astore_2
    //   226: aconst_null
    //   227: astore_1
    //   228: aload 5
    //   230: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   233: aload_3
    //   234: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   237: aload_1
    //   238: ifnull +7 -> 245
    //   241: aload_1
    //   242: invokevirtual 166	com/eclipsesource/v8/V8Object:release	()V
    //   245: ldc_w 263
    //   248: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   251: aload_2
    //   252: athrow
    //   253: aload_0
    //   254: getfield 280	com/eclipsesource/v8/debug/V8DebugServer:stoppedStateDcp	Lcom/eclipsesource/v8/V8Object;
    //   257: invokevirtual 166	com/eclipsesource/v8/V8Object:release	()V
    //   260: aload_0
    //   261: aconst_null
    //   262: putfield 280	com/eclipsesource/v8/debug/V8DebugServer:stoppedStateDcp	Lcom/eclipsesource/v8/V8Object;
    //   265: ldc_w 263
    //   268: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: return
    //   272: astore_2
    //   273: goto -45 -> 228
    //
    // Exception table:
    //   from	to	target	type
    //   177	184	187	java/lang/InterruptedException
    //   18	36	191	finally
    //   6	18	204	finally
    //   36	71	204	finally
    //   135	144	204	finally
    //   148	152	204	finally
    //   152	172	204	finally
    //   177	184	204	finally
    //   192	204	204	finally
    //   228	237	204	finally
    //   241	245	204	finally
    //   245	253	204	finally
    //   71	98	225	finally
    //   98	130	272	finally
    //   130	135	272	finally
  }

  private boolean isConnected()
  {
    AppMethodBeat.i(74936);
    synchronized (this.clientLock)
    {
      if ((this.server != null) && (this.client != null) && (this.client.isConnected()))
      {
        bool = true;
        AppMethodBeat.o(74936);
        return bool;
      }
      boolean bool = false;
    }
  }

  private void processRequest(String paramString)
  {
    AppMethodBeat.i(74938);
    if (this.traceCommunication)
      System.out.println("Got message: \n" + paramString.substring(0, Math.min(paramString.length(), 1000)));
    Object localObject = new V8Array(this.runtime);
    ((V8Array)localObject).push(paramString);
    if (this.stoppedStateDcp != null);
    for (paramString = this.stoppedStateDcp; ; paramString = this.runningStateDcp)
    {
      String str = paramString.executeFunction("processDebugJSONRequest", (V8Array)localObject).toString();
      localObject = str;
      if (this.stoppedStateDcp == null)
      {
        localObject = str;
        if (str.contains("\"running\":false"))
        {
          localObject = str.replace("\"running\":false", "\"running\":true").replace("\"success\":true", "\"success\":false").replace("{\"", "{\"message\":\"Client requested suspension is not supported on J2V8.\",\"");
          paramString.add("running_", true);
        }
      }
      if (this.traceCommunication)
        System.out.println("Returning response: \n" + ((String)localObject).substring(0, Math.min(((String)localObject).length(), 1000)));
      sendJson((String)localObject);
      AppMethodBeat.o(74938);
      return;
    }
  }

  private void sendCompileEvent(V8Object paramV8Object)
  {
    V8Object localV8Object1 = null;
    AppMethodBeat.i(74941);
    if (!isConnected())
      AppMethodBeat.o(74941);
    while (true)
    {
      return;
      int i = paramV8Object.getInteger("type_");
      V8Object localV8Object2 = paramV8Object.getObject("script_");
      V8Array localV8Array = new V8Array(this.runtime);
      paramV8Object = localV8Object1;
      try
      {
        localV8Array.push(localV8Object2);
        paramV8Object = localV8Object1;
        localV8Array.push(i);
        paramV8Object = localV8Object1;
        localV8Object1 = this.debugObject.executeObjectFunction("__j2v8_MakeCompileEvent", localV8Array);
        paramV8Object = localV8Object1;
        String str = localV8Object1.executeStringFunction("toJSONProtocol", null);
        paramV8Object = localV8Object1;
        if (this.traceCommunication)
        {
          paramV8Object = localV8Object1;
          PrintStream localPrintStream = System.out;
          paramV8Object = localV8Object1;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          paramV8Object = localV8Object1;
          localStringBuilder.<init>("Sending event (CompileEvent):\n");
          paramV8Object = localV8Object1;
          localPrintStream.println(str.substring(0, Math.min(str.length(), 1000)));
        }
        paramV8Object = localV8Object1;
        if (str.length() > 0)
        {
          paramV8Object = localV8Object1;
          sendJson(str);
        }
        localV8Array.release();
        localV8Object2.release();
        if (localV8Object1 != null)
        {
          localV8Object1.release();
          AppMethodBeat.o(74941);
          continue;
        }
      }
      finally
      {
        localV8Array.release();
        localV8Object2.release();
        if (paramV8Object != null)
          paramV8Object.release();
        AppMethodBeat.o(74941);
      }
      AppMethodBeat.o(74941);
    }
  }

  private void sendJson(String paramString)
  {
    AppMethodBeat.i(74934);
    sendMessage("", paramString.replace("\\/", "/"));
    AppMethodBeat.o(74934);
  }

  private void sendMessage(String paramString1, String paramString2)
  {
    AppMethodBeat.i(74935);
    synchronized (this.clientLock)
    {
      if (!isConnected())
      {
        paramString1 = new java/io/IOException;
        paramString1.<init>("There is no connected client.");
        AppMethodBeat.o(74935);
        throw paramString1;
      }
    }
    byte[] arrayOfByte = paramString2.getBytes(PROTOCOL_CHARSET);
    paramString2 = new java/lang/StringBuilder;
    paramString2.<init>();
    paramString2.append(paramString1);
    paramString2.append("Content-Length:");
    paramString2.append(Integer.toString(arrayOfByte.length));
    paramString2.append("\r\n");
    paramString2.append("\r\n");
    this.client.getOutputStream().write(paramString2.toString().getBytes(PROTOCOL_CHARSET));
    if (arrayOfByte.length > 0)
      this.client.getOutputStream().write(arrayOfByte);
    AppMethodBeat.o(74935);
  }

  // ERROR //
  private void setupEventHandler()
  {
    // Byte code:
    //   0: ldc_w 432
    //   3: invokestatic 90	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 10	com/eclipsesource/v8/debug/V8DebugServer$EventHandler
    //   9: dup
    //   10: aload_0
    //   11: aconst_null
    //   12: invokespecial 435	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:<init>	(Lcom/eclipsesource/v8/debug/V8DebugServer;Lcom/eclipsesource/v8/debug/V8DebugServer$1;)V
    //   15: astore_1
    //   16: aload_0
    //   17: getfield 163	com/eclipsesource/v8/debug/V8DebugServer:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   20: aload_1
    //   21: ldc 15
    //   23: invokevirtual 439	com/eclipsesource/v8/V8Object:registerJavaMethod	(Lcom/eclipsesource/v8/JavaVoidCallback;Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   26: pop
    //   27: aload_0
    //   28: getfield 163	com/eclipsesource/v8/debug/V8DebugServer:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   31: ldc 15
    //   33: invokevirtual 161	com/eclipsesource/v8/V8Object:getObject	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   36: checkcast 441	com/eclipsesource/v8/V8Function
    //   39: astore_1
    //   40: new 265	com/eclipsesource/v8/V8Array
    //   43: astore_2
    //   44: aload_2
    //   45: aload_0
    //   46: getfield 136	com/eclipsesource/v8/debug/V8DebugServer:runtime	Lcom/eclipsesource/v8/V8;
    //   49: invokespecial 268	com/eclipsesource/v8/V8Array:<init>	(Lcom/eclipsesource/v8/V8;)V
    //   52: aload_2
    //   53: aload_1
    //   54: invokevirtual 299	com/eclipsesource/v8/V8Array:push	(Lcom/eclipsesource/v8/V8Value;)Lcom/eclipsesource/v8/V8Array;
    //   57: astore_2
    //   58: aload_0
    //   59: getfield 163	com/eclipsesource/v8/debug/V8DebugServer:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   62: ldc 57
    //   64: aload_2
    //   65: invokevirtual 363	com/eclipsesource/v8/V8Object:executeFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)Ljava/lang/Object;
    //   68: pop
    //   69: aload_1
    //   70: ifnull +14 -> 84
    //   73: aload_1
    //   74: invokevirtual 444	com/eclipsesource/v8/V8Function:isReleased	()Z
    //   77: ifne +7 -> 84
    //   80: aload_1
    //   81: invokevirtual 445	com/eclipsesource/v8/V8Function:release	()V
    //   84: aload_2
    //   85: ifnull +64 -> 149
    //   88: aload_2
    //   89: invokevirtual 446	com/eclipsesource/v8/V8Array:isReleased	()Z
    //   92: ifne +57 -> 149
    //   95: aload_2
    //   96: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   99: ldc_w 432
    //   102: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: return
    //   106: astore_1
    //   107: aconst_null
    //   108: astore_2
    //   109: aconst_null
    //   110: astore_3
    //   111: aload_3
    //   112: ifnull +14 -> 126
    //   115: aload_3
    //   116: invokevirtual 444	com/eclipsesource/v8/V8Function:isReleased	()Z
    //   119: ifne +7 -> 126
    //   122: aload_3
    //   123: invokevirtual 445	com/eclipsesource/v8/V8Function:release	()V
    //   126: aload_2
    //   127: ifnull +14 -> 141
    //   130: aload_2
    //   131: invokevirtual 446	com/eclipsesource/v8/V8Array:isReleased	()Z
    //   134: ifne +7 -> 141
    //   137: aload_2
    //   138: invokevirtual 281	com/eclipsesource/v8/V8Array:release	()V
    //   141: ldc_w 432
    //   144: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_1
    //   148: athrow
    //   149: ldc_w 432
    //   152: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -50 -> 105
    //   158: astore_2
    //   159: aconst_null
    //   160: astore 4
    //   162: aload_1
    //   163: astore_3
    //   164: aload_2
    //   165: astore_1
    //   166: aload 4
    //   168: astore_2
    //   169: goto -58 -> 111
    //   172: astore 4
    //   174: aload_1
    //   175: astore_3
    //   176: aload 4
    //   178: astore_1
    //   179: goto -68 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   27	40	106	finally
    //   40	58	158	finally
    //   58	69	172	finally
  }

  public int getPort()
  {
    AppMethodBeat.i(74931);
    int i;
    if ((this.server != null) && (this.server.isBound()))
    {
      i = this.server.getLocalPort();
      AppMethodBeat.o(74931);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(74931);
    }
  }

  protected void logError(Throwable paramThrowable)
  {
  }

  public void processRequests(long paramLong)
  {
    AppMethodBeat.i(74937);
    if (this.server == null)
      AppMethodBeat.o(74937);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      label130: 
      do
      {
        do
          while (true)
          {
            int j;
            synchronized (this.requests)
            {
              String[] arrayOfString = (String[])this.requests.toArray(new String[this.requests.size()]);
              this.requests.clear();
              int i = arrayOfString.length;
              j = 0;
              if (j >= i)
                break label130;
              ??? = arrayOfString[j];
            }
            try
            {
              processRequest(???);
              j++;
              continue;
              localObject = finally;
              AppMethodBeat.o(74937);
              throw localObject;
            }
            catch (Exception localException)
            {
              while (true)
                logError(localException);
            }
          }
        while (localObject.length > 0);
        if (paramLong > 0L)
          Thread.sleep(10L);
      }
      while ((paramLong > 0L) && (l + paramLong > System.currentTimeMillis()));
      AppMethodBeat.o(74937);
    }
  }

  public void setTraceCommunication(boolean paramBoolean)
  {
    this.traceCommunication = paramBoolean;
  }

  public void start()
  {
    AppMethodBeat.i(74932);
    if (this.server == null)
      AppMethodBeat.o(74932);
    while (true)
    {
      return;
      boolean bool = this.waitForConnection;
      ??? = new Thread(new V8DebugServer.ClientLoop(this, null), "J2V8 Debugger Server");
      ((Thread)???).setDaemon(true);
      ((Thread)???).start();
      setupEventHandler();
      this.runningStateDcp = this.runtime.executeObjectScript("(function() {return new " + DEBUG_OBJECT_NAME + ".DebugCommandProcessor(null, true)})()");
      if (bool)
      {
        synchronized (this.clientLock)
        {
          while (true)
          {
            bool = this.waitForConnection;
            if (!bool)
              break;
            try
            {
              this.clientLock.wait();
            }
            catch (InterruptedException localInterruptedException2)
            {
            }
          }
        }
        try
        {
          processRequests(100L);
          AppMethodBeat.o(74932);
          continue;
          localObject2 = finally;
          AppMethodBeat.o(74932);
          throw localObject2;
        }
        catch (InterruptedException localInterruptedException1)
        {
        }
      }
      else
      {
        AppMethodBeat.o(74932);
      }
    }
  }

  public void stop()
  {
    AppMethodBeat.i(74933);
    try
    {
      this.server.close();
      synchronized (this.clientLock)
      {
        if (this.client != null)
        {
          this.client.close();
          this.client = null;
        }
        if (this.runningStateDcp != null)
        {
          this.runningStateDcp.release();
          this.runningStateDcp = null;
        }
        if (this.debugObject != null)
        {
          this.debugObject.release();
          this.debugObject = null;
        }
        if (this.stoppedStateDcp != null)
        {
          this.stoppedStateDcp.release();
          this.stoppedStateDcp = null;
        }
        AppMethodBeat.o(74933);
        return;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        logError(localIOException);
    }
  }

  class EventHandler
    implements JavaVoidCallback
  {
    private EventHandler()
    {
    }

    private void safeRelease(Releasable paramReleasable)
    {
      AppMethodBeat.i(74928);
      if (paramReleasable != null)
        paramReleasable.release();
      AppMethodBeat.o(74928);
    }

    // ERROR //
    public void invoke(V8Object paramV8Object, V8Array paramV8Array)
    {
      // Byte code:
      //   0: ldc 44
      //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aload_2
      //   6: ifnull +10 -> 16
      //   9: aload_2
      //   10: invokevirtual 50	com/eclipsesource/v8/V8Array:isUndefined	()Z
      //   13: ifeq +9 -> 22
      //   16: ldc 44
      //   18: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   21: return
      //   22: aload_2
      //   23: iconst_0
      //   24: invokevirtual 54	com/eclipsesource/v8/V8Array:getInteger	(I)I
      //   27: istore_3
      //   28: aload_2
      //   29: iconst_1
      //   30: invokevirtual 58	com/eclipsesource/v8/V8Array:getObject	(I)Lcom/eclipsesource/v8/V8Object;
      //   33: astore 4
      //   35: aload_2
      //   36: iconst_2
      //   37: invokevirtual 58	com/eclipsesource/v8/V8Array:getObject	(I)Lcom/eclipsesource/v8/V8Object;
      //   40: astore_2
      //   41: aload_2
      //   42: astore 5
      //   44: aload 4
      //   46: astore 6
      //   48: aload_0
      //   49: getfield 15	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:this$0	Lcom/eclipsesource/v8/debug/V8DebugServer;
      //   52: invokestatic 62	com/eclipsesource/v8/debug/V8DebugServer:access$200	(Lcom/eclipsesource/v8/debug/V8DebugServer;)Z
      //   55: ifeq +75 -> 130
      //   58: ldc 64
      //   60: astore_1
      //   61: iload_3
      //   62: tableswitch	default:+46 -> 108, 1:+108->170, 2:+114->176, 3:+120->182, 4:+126->188, 5:+132->194, 6:+138->200, 7:+144->206, 8:+150->212
      //   109: astore 5
      //   111: aload 4
      //   113: astore 6
      //   115: getstatic 70	java/lang/System:out	Ljava/io/PrintStream;
      //   118: ldc 72
      //   120: aload_1
      //   121: invokestatic 78	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   124: invokevirtual 82	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
      //   127: invokevirtual 88	java/io/PrintStream:println	(Ljava/lang/String;)V
      //   130: aload_2
      //   131: astore 5
      //   133: aload 4
      //   135: astore 6
      //   137: aload_0
      //   138: getfield 15	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:this$0	Lcom/eclipsesource/v8/debug/V8DebugServer;
      //   141: invokestatic 91	com/eclipsesource/v8/debug/V8DebugServer:access$300	(Lcom/eclipsesource/v8/debug/V8DebugServer;)Z
      //   144: istore 7
      //   146: iload 7
      //   148: ifne +70 -> 218
      //   151: aload_0
      //   152: aload 4
      //   154: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   157: aload_0
      //   158: aload_2
      //   159: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   162: ldc 44
      //   164: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   167: goto -146 -> 21
      //   170: ldc 95
      //   172: astore_1
      //   173: goto -65 -> 108
      //   176: ldc 97
      //   178: astore_1
      //   179: goto -71 -> 108
      //   182: ldc 99
      //   184: astore_1
      //   185: goto -77 -> 108
      //   188: ldc 101
      //   190: astore_1
      //   191: goto -83 -> 108
      //   194: ldc 103
      //   196: astore_1
      //   197: goto -89 -> 108
      //   200: ldc 105
      //   202: astore_1
      //   203: goto -95 -> 108
      //   206: ldc 107
      //   208: astore_1
      //   209: goto -101 -> 108
      //   212: ldc 109
      //   214: astore_1
      //   215: goto -107 -> 108
      //   218: iload_3
      //   219: tableswitch	default:+37 -> 256, 1:+56->275, 2:+37->256, 3:+37->256, 4:+37->256, 5:+117->336, 6:+117->336
      //   257: aload 4
      //   259: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   262: aload_0
      //   263: aload_2
      //   264: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   267: ldc 44
      //   269: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   272: goto -251 -> 21
      //   275: aload_2
      //   276: astore 5
      //   278: aload 4
      //   280: astore 6
      //   282: aload_0
      //   283: getfield 15	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:this$0	Lcom/eclipsesource/v8/debug/V8DebugServer;
      //   286: aload 4
      //   288: aload_2
      //   289: invokestatic 113	com/eclipsesource/v8/debug/V8DebugServer:access$400	(Lcom/eclipsesource/v8/debug/V8DebugServer;Lcom/eclipsesource/v8/V8Object;Lcom/eclipsesource/v8/V8Object;)V
      //   292: goto -36 -> 256
      //   295: astore 5
      //   297: aload_2
      //   298: astore_1
      //   299: aload 5
      //   301: astore_2
      //   302: aload_1
      //   303: astore 5
      //   305: aload 4
      //   307: astore 6
      //   309: aload_0
      //   310: getfield 15	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:this$0	Lcom/eclipsesource/v8/debug/V8DebugServer;
      //   313: aload_2
      //   314: invokevirtual 117	com/eclipsesource/v8/debug/V8DebugServer:logError	(Ljava/lang/Throwable;)V
      //   317: aload_0
      //   318: aload 4
      //   320: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   323: aload_0
      //   324: aload_1
      //   325: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   328: ldc 44
      //   330: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   333: goto -312 -> 21
      //   336: aload_2
      //   337: astore 5
      //   339: aload 4
      //   341: astore 6
      //   343: aload_0
      //   344: getfield 15	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:this$0	Lcom/eclipsesource/v8/debug/V8DebugServer;
      //   347: aload_2
      //   348: invokestatic 121	com/eclipsesource/v8/debug/V8DebugServer:access$500	(Lcom/eclipsesource/v8/debug/V8DebugServer;Lcom/eclipsesource/v8/V8Object;)V
      //   351: goto -95 -> 256
      //   354: astore_1
      //   355: aload 6
      //   357: astore 4
      //   359: aload_0
      //   360: aload 4
      //   362: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   365: aload_0
      //   366: aload 5
      //   368: invokespecial 93	com/eclipsesource/v8/debug/V8DebugServer$EventHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
      //   371: ldc 44
      //   373: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   376: aload_1
      //   377: athrow
      //   378: astore_1
      //   379: aconst_null
      //   380: astore 5
      //   382: aconst_null
      //   383: astore 4
      //   385: goto -26 -> 359
      //   388: astore_1
      //   389: aconst_null
      //   390: astore 5
      //   392: goto -33 -> 359
      //   395: astore_2
      //   396: aconst_null
      //   397: astore_1
      //   398: aconst_null
      //   399: astore 4
      //   401: goto -99 -> 302
      //   404: astore_2
      //   405: aconst_null
      //   406: astore_1
      //   407: goto -105 -> 302
      //
      // Exception table:
      //   from	to	target	type
      //   48	58	295	java/lang/Exception
      //   115	130	295	java/lang/Exception
      //   137	146	295	java/lang/Exception
      //   282	292	295	java/lang/Exception
      //   343	351	295	java/lang/Exception
      //   48	58	354	finally
      //   115	130	354	finally
      //   137	146	354	finally
      //   282	292	354	finally
      //   309	317	354	finally
      //   343	351	354	finally
      //   22	35	378	finally
      //   35	41	388	finally
      //   22	35	395	java/lang/Exception
      //   35	41	404	java/lang/Exception
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.V8DebugServer
 * JD-Core Version:    0.6.2
 */