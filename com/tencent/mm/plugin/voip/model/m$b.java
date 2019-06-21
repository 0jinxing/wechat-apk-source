package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class m$b
  implements Runnable
{
  boolean sQc = false;
  boolean sQd = false;

  m$b(m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4440);
    if ((this.sQb.kzf == 2) && (!this.sQd))
    {
      long l1 = System.currentTimeMillis();
      int i;
      int j;
      boolean bool;
      Object localObject1;
      if ((this.sQb.sNl.cIQ()) && (this.sQb.sNl.sPp.videoDecode(this.sQb.sNl.sPp.sUU) == 1))
      {
        i = this.sQb.sNl.sPp.field_remoteImgWidth;
        j = this.sQb.sNl.sPp.field_remoteImgHeight;
        if ((i != 0) || (j >= 3))
          break label343;
        bool = true;
        if (!bool)
          break label386;
        if (!this.sQc)
        {
          localObject1 = this.sQb;
          ((m)localObject1).sPV |= 1;
          this.sQb.sNl.sPq.setHWDecMode(this.sQb.sPV);
          ab.i("MicroMsg.Voip.VoipDeviceHandler", "steve: change to HW dec");
        }
        if (v2protocal.sVJ == null);
      }
      while (true)
      {
        try
        {
          while (true)
          {
            i = this.sQb.sNl.sPp.field_remoteImgLength;
            ab.d("MicroMsg.Voip.VoipDeviceHandler", "steve:video decode successfully!..len=".concat(String.valueOf(i)));
            j = this.sQb.sNl.sPp.field_remoteImgHeight;
            localObject1 = new byte[i];
            this.sQb.sNl.sPp.getVideoHWDecode(this.sQb.sNl.sPp.sUU, (byte[])localObject1, i);
            v2protocal.sVJ.T((byte[])localObject1, j);
            long l2 = System.currentTimeMillis();
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("steve: fill in AvcDecoder take time = ");
            ab.d("MicroMsg.Voip.VoipDeviceHandler", l2 - l1 + ", startTime = " + l1);
            this.sQc = bool;
            try
            {
              Thread.sleep(10L);
            }
            catch (InterruptedException localInterruptedException)
            {
              ab.printErrStackTrace("MicroMsg.Voip.VoipDeviceHandler", localInterruptedException, "", new Object[0]);
            }
          }
          break;
          label343: bool = false;
        }
        catch (Exception localException)
        {
          ab.e("EncodeDecode", "interrupted while waiting");
          ab.e("MicroMsg.Voip.VoipDeviceHandler", " error:" + localException.toString());
          continue;
        }
        label386: Object localObject2;
        if (this.sQc)
        {
          localObject2 = this.sQb;
          ((m)localObject2).sPV &= -2;
          if (v2protocal.sVJ != null)
            v2protocal.sVJ.sOe = false;
          this.sQb.sNl.sPq.setHWDecMode(this.sQb.sPV);
          ab.i("MicroMsg.Voip.VoipDeviceHandler", "steve: change to SW dec");
        }
        if ((this.sQb.sNl.sPp.field_remoteImgLength > 0) && (this.sQb.sNl.sPq != null))
        {
          localObject2 = this.sQb.sNl.sPp;
          ((v2protocal)localObject2).sVv += 1;
          this.sQb.sNl.sPq.b(i, j, this.sQb.sNl.sPp.sUU);
        }
      }
    }
    AppMethodBeat.o(4440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.m.b
 * JD-Core Version:    0.6.2
 */