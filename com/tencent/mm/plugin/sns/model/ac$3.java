package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.bax;
import com.tencent.mm.sdk.platformtools.ab;

final class ac$3
  implements Runnable
{
  ac$3(ac paramac, baa parambaa)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36373);
    this.qKw.wDQ += 1;
    try
    {
      ab.i("MicroMsg.SightCdnUpload", "add try count %d", new Object[] { Integer.valueOf(this.qKw.wDQ) });
      bax localbax = new com/tencent/mm/protocal/protobuf/bax;
      localbax.<init>();
      localbax = (bax)localbax.parseFrom(this.qKx.qKs.rfI);
      localbax.wFH = this.qKw;
      this.qKx.qKs.rfI = localbax.toByteArray();
      af.cnu().a(this.qKx.qKs.reX, this.qKx.qKs);
      AppMethodBeat.o(36373);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in checkUploadaddCount %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(36373);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ac.3
 * JD-Core Version:    0.6.2
 */