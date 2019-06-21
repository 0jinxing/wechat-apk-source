package com.tencent.mm.plugin.webview.luggage;

import java.io.PipedOutputStream;

final class LuggageMMLocalResourceProvider$1
  implements Runnable
{
  LuggageMMLocalResourceProvider$1(LuggageMMLocalResourceProvider paramLuggageMMLocalResourceProvider, LuggageMMLocalResourceProvider.GetLocalResourceInfoTask paramGetLocalResourceInfoTask, PipedOutputStream paramPipedOutputStream)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 5980
    //   3: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 40	java/io/FileInputStream
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: getfield 23	com/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider$1:uhM	Lcom/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider$GetLocalResourceInfoTask;
    //   15: getfield 46	com/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider$GetLocalResourceInfoTask:path	Ljava/lang/String;
    //   18: invokespecial 49	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: aload_0
    //   23: getfield 25	com/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider$1:uhN	Ljava/io/PipedOutputStream;
    //   26: invokestatic 53	com/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider:c	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   29: aload_1
    //   30: invokevirtual 56	java/io/FileInputStream:close	()V
    //   33: aload_0
    //   34: getfield 25	com/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider$1:uhN	Ljava/io/PipedOutputStream;
    //   37: invokevirtual 59	java/io/PipedOutputStream:close	()V
    //   40: sipush 5980
    //   43: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: return
    //   47: astore_1
    //   48: sipush 5980
    //   51: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: goto -8 -> 46
    //   57: astore_1
    //   58: aconst_null
    //   59: astore_1
    //   60: aload_1
    //   61: ifnull +7 -> 68
    //   64: aload_1
    //   65: invokevirtual 56	java/io/FileInputStream:close	()V
    //   68: aload_0
    //   69: getfield 25	com/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider$1:uhN	Ljava/io/PipedOutputStream;
    //   72: invokevirtual 59	java/io/PipedOutputStream:close	()V
    //   75: sipush 5980
    //   78: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: goto -35 -> 46
    //   84: astore_1
    //   85: sipush 5980
    //   88: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: goto -45 -> 46
    //   94: astore_1
    //   95: aconst_null
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +7 -> 105
    //   101: aload_2
    //   102: invokevirtual 56	java/io/FileInputStream:close	()V
    //   105: aload_0
    //   106: getfield 25	com/tencent/mm/plugin/webview/luggage/LuggageMMLocalResourceProvider$1:uhN	Ljava/io/PipedOutputStream;
    //   109: invokevirtual 59	java/io/PipedOutputStream:close	()V
    //   112: sipush 5980
    //   115: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: aload_1
    //   119: athrow
    //   120: astore_2
    //   121: goto -9 -> 112
    //   124: astore_3
    //   125: aload_1
    //   126: astore_2
    //   127: aload_3
    //   128: astore_1
    //   129: goto -32 -> 97
    //   132: astore_2
    //   133: goto -73 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   29	40	47	java/lang/Exception
    //   6	21	57	java/lang/Exception
    //   64	68	84	java/lang/Exception
    //   68	75	84	java/lang/Exception
    //   6	21	94	finally
    //   101	105	120	java/lang/Exception
    //   105	112	120	java/lang/Exception
    //   21	29	124	finally
    //   21	29	132	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider.1
 * JD-Core Version:    0.6.2
 */