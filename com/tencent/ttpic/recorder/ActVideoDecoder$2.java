package com.tencent.ttpic.recorder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gles.GLConfig;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.util.i;

class ActVideoDecoder$2
  implements Runnable
{
  ActVideoDecoder$2(ActVideoDecoder paramActVideoDecoder)
  {
  }

  public void run()
  {
    AppMethodBeat.i(83678);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      BenchUtil.benchStart(ActVideoDecoder.access$600() + "[decodeNext]");
      ActVideoDecoder.access$700(this.this$0);
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      BenchUtil.benchEnd(ActVideoDecoder.access$600() + "[decodeNext]");
      ActVideoDecoder.access$802(this.this$0, false);
      AppMethodBeat.o(83678);
      return;
    }
    catch (Exception localException)
    {
      do
        i.a(ActVideoDecoder.access$600(), "decodeNext error: ", localException);
      while (!GLConfig.DEBUG);
      AppMethodBeat.o(83678);
      throw localException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.recorder.ActVideoDecoder.2
 * JD-Core Version:    0.6.2
 */