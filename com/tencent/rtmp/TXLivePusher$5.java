package com.tencent.rtmp;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;
import com.tencent.ugc.TXRecordCommon.TXRecordResult;

class TXLivePusher$5
  implements Runnable
{
  TXLivePusher$5(TXLivePusher paramTXLivePusher)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65929);
    TXRecordCommon.TXRecordResult localTXRecordResult = new TXRecordCommon.TXRecordResult();
    localTXRecordResult.retCode = -1;
    localTXRecordResult.descMsg = "record video failed";
    if (TXLivePusher.access$600(this.this$0) != null)
      TXLivePusher.access$600(this.this$0).onRecordComplete(localTXRecordResult);
    TXCLog.w(TXLivePusher.access$700(), "record complete fail");
    AppMethodBeat.o(65929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.5
 * JD-Core Version:    0.6.2
 */