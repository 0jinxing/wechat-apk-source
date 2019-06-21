package com.tencent.mm.plugin.topstory.ui.video;

final class n$a
  implements Runnable
{
  private String lWq;
  private boolean mTL;

  private n$a(n paramn)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 1761
    //   3: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 43	org/json/JSONObject
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: getfield 29	com/tencent/mm/plugin/topstory/ui/video/n$a:lWq	Ljava/lang/String;
    //   15: invokespecial 46	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   18: aload_0
    //   19: getfield 19	com/tencent/mm/plugin/topstory/ui/video/n$a:sFe	Lcom/tencent/mm/plugin/topstory/ui/video/n;
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 32	com/tencent/mm/plugin/topstory/ui/video/n$a:mTL	Z
    //   27: invokestatic 49	com/tencent/mm/plugin/topstory/ui/video/n:a	(Lcom/tencent/mm/plugin/topstory/ui/video/n;Lorg/json/JSONObject;Z)V
    //   30: aload_0
    //   31: getfield 19	com/tencent/mm/plugin/topstory/ui/video/n$a:sFe	Lcom/tencent/mm/plugin/topstory/ui/video/n;
    //   34: iconst_0
    //   35: putfield 52	com/tencent/mm/plugin/topstory/ui/video/n:sEY	Z
    //   38: sipush 1761
    //   41: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: return
    //   45: astore_1
    //   46: aload_0
    //   47: getfield 19	com/tencent/mm/plugin/topstory/ui/video/n$a:sFe	Lcom/tencent/mm/plugin/topstory/ui/video/n;
    //   50: iconst_0
    //   51: putfield 52	com/tencent/mm/plugin/topstory/ui/video/n:sEY	Z
    //   54: sipush 1761
    //   57: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: goto -16 -> 44
    //   63: astore_1
    //   64: aload_0
    //   65: getfield 19	com/tencent/mm/plugin/topstory/ui/video/n$a:sFe	Lcom/tencent/mm/plugin/topstory/ui/video/n;
    //   68: iconst_0
    //   69: putfield 52	com/tencent/mm/plugin/topstory/ui/video/n:sEY	Z
    //   72: sipush 1761
    //   75: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: aload_1
    //   79: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   6	30	45	java/lang/Exception
    //   6	30	63	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.n.a
 * JD-Core Version:    0.6.2
 */