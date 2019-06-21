package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.awi;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.protocal.protobuf.cpr;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;

final class t$1
  implements Runnable
{
  t$1(t paramt, cpx paramcpx)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4681);
    a.Logi("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData begin");
    Object localObject1 = this.sTB.vJd.getBuffer().toByteArray();
    try
    {
      localObject2 = new com/tencent/mm/protocal/protobuf/cpr;
      ((cpr)localObject2).<init>();
      localObject1 = (cpr)((cpr)localObject2).parseFrom((byte[])localObject1);
      if ((((cpr)localObject1).xlM != null) && (((cpr)localObject1).xlM.vJd != null) && (((cpr)localObject1).xlM.vJd.getBuffer() != null))
        this.sTC.sTy.xlM = ((cpr)localObject1).xlM;
      if ((((cpr)localObject1).xlN.vJd != null) && (((cpr)localObject1).xlN.vJd.getBuffer() != null))
        this.sTC.sTy.xlN = ((cpr)localObject1).xlN;
      if (((cpr)localObject1).xnc != 0)
        this.sTC.sTy.xnc = ((cpr)localObject1).xnc;
      if ((((cpr)localObject1).xnd != null) && (((cpr)localObject1).xnd.xlZ != 0))
        this.sTC.sTy.xnd = ((cpr)localObject1).xnd;
      if ((((cpr)localObject1).xne != null) && (((cpr)localObject1).xne.xlZ != 0))
        this.sTC.sTy.xne = ((cpr)localObject1).xne;
      if ((((cpr)localObject1).xnE != null) && (((cpr)localObject1).xnE.size() != 0))
      {
        this.sTC.sTy.xnE = ((cpr)localObject1).xnE;
        this.sTC.sTy.xnD = ((cpr)localObject1).xnE.size();
      }
      if (((cpr)localObject1).xng != 0)
        this.sTC.sTy.xng = ((cpr)localObject1).xng;
      if (((cpr)localObject1).xnh != 0)
        this.sTC.sTy.xnh = ((cpr)localObject1).xnh;
      if (((cpr)localObject1).xnl.xlZ != 0)
        this.sTC.sTy.xnl = ((cpr)localObject1).xnl;
      if (((cpr)localObject1).xnm > 0)
      {
        this.sTC.sTy.xnm = ((cpr)localObject1).xnm;
        if (((cpr)localObject1).nwQ <= 0)
          break label914;
        this.sTC.sTy.nwQ = (((cpr)localObject1).nwQ - 1);
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "zhengxue[ENCRYPT] got encryptStrategy[" + this.sTC.sTy.nwQ + "] from relaydata");
        if (((cpr)localObject1).xnn <= 0)
          break label935;
        this.sTC.sTy.xnn = ((cpr)localObject1).xnn;
        this.sTC.sTy.xno = ((cpr)localObject1).xno;
        this.sTC.sTy.xnp = ((cpr)localObject1).xnp;
        this.sTC.sTy.xnq = ((cpr)localObject1).xnq;
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got ARQCacheLen: " + ((cpr)localObject1).xnn + ", ARQRttThreshold: " + ((cpr)localObject1).xno + ", ARQUsedRateThreshold: " + ((cpr)localObject1).xnp + ", ARQRespRateThreshold: " + ((cpr)localObject1).xnq);
        if (((cpr)localObject1).xnu <= 0)
          break label945;
        this.sTC.sTy.xnu = ((cpr)localObject1).xnu;
        this.sTC.sTy.xnx = ((cpr)localObject1).xnx;
        if (((cpr)localObject1).xnz != null)
          this.sTC.sTy.xnz = ((cpr)localObject1).xnz;
        this.sTC.sTy.xnC = ((cpr)localObject1).xnC;
        this.sTC.sTy.xnB = ((cpr)localObject1).xnB;
        this.sTC.sNl.sPB.a(((cpr)localObject1).xnC, ((cpr)localObject1).xnB, this.sTC.sNl.sPp.nwu, this.sTC.sNl.sPp.nwv);
        if ((this.sTC.sTy.xlM == null) || (this.sTC.sTy.xlM.vJd == null) || (this.sTC.sTy.xlM.vJd.getBuffer() == null) || (this.sTC.sTy.xnc == 0) || (this.sTC.sTy.xlN == null) || (this.sTC.sTy.xlN.vJd == null) || (this.sTC.sTy.xlN.vJd.getBuffer() == null) || (this.sTC.sTy.xnd == null) || (this.sTC.sTy.xnd.xlZ == 0) || (this.sTC.sTy.xne == null) || (this.sTC.sTy.xne.xlZ == 0) || (this.sTC.sTy.xnl == null) || (this.sTC.sTy.xnl.xlZ == 0))
          break label966;
        i = 1;
        if (i != 0)
          break label971;
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData end");
        AppMethodBeat.o(4681);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", localIOException, "", new Object[0]);
        AppMethodBeat.o(4681);
        continue;
        this.sTC.sTy.xnm = 0;
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQstrategy in mrdata");
        continue;
        label914: this.sTC.sTy.nwQ = 1;
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no EncryptStrategy in mrdata");
        continue;
        label935: a.Logi("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQKeyParameters in mrdata");
        continue;
        label945: this.sTC.sTy.xnu = 0;
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no QosStrategy in mrdata");
        continue;
        label966: int i = 0;
        continue;
        label971: a.Logi("MicroMsg.Voip.VoipSyncHandle", "multiRelayData recv all, update. RedirectReqThreshold = " + this.sTC.sTy.xnx + " BothSideSwitchFlag = " + localIOException.xny);
        this.sTC.sNl.Gm(this.sTC.sTy.xnc);
        this.sTC.sNl.bo(this.sTC.sTy.xlM.vJd.getBuffer().toByteArray());
        if ((localIOException.xnj != null) && (localIOException.xnj.getBuffer() != null) && (localIOException.xnv != null) && (localIOException.xnv.getBuffer() != null))
          this.sTC.sNl.a(localIOException.xnj.getBuffer().toByteArray(), localIOException.xni, this.sTC.sTy.nwQ, localIOException.xnv.getBuffer().toByteArray());
        if (com.tencent.mm.plugin.voip.b.cIj().cJZ() != 0)
          this.sTC.sNl.bp(this.sTC.sTy.xlN.vJd.getBuffer().toByteArray());
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onMultiRelayData natsvr =" + this.sTC.sTy.xnD);
        this.sTC.sNl.a(this.sTC.sTy.xnd, this.sTC.sTy.xne, this.sTC.sTy.xnl, this.sTC.sTy.xnE);
        this.sTC.sNl.i(this.sTC.sTy.xnm, this.sTC.sTy.xnn, this.sTC.sTy.xno, this.sTC.sTy.xnp, this.sTC.sTy.xnq);
        this.sTC.sNl.Gl(this.sTC.sTy.xnu);
        Object localObject2 = this.sTC.sNl;
        i = this.sTC.sTy.xng;
        int j = this.sTC.sTy.xnh;
        ((k)localObject2).sPp.sUf = i;
        ((k)localObject2).sPp.sUg = j;
        this.sTC.sNl.Gk(this.sTC.sTy.xnx);
        this.sTC.sNl.sPp.sVb = localIOException.xny;
        if ((localIOException.xnA != null) && (localIOException.xnA.getBuffer() != null))
          this.sTC.sNl.sPp.sUj = localIOException.xnA.getBuffer().toByteArray();
        if ((localIOException.xns != null) && (localIOException.xns.getBuffer() != null) && (localIOException.xnt != null) && (localIOException.xnt.getBuffer() != null))
          this.sTC.sNl.b(localIOException.xnr, localIOException.xns.getBuffer().toByteArray(), localIOException.xnt.getBuffer().toByteArray());
        localObject2 = this.sTC.sNl;
        awi localawi = this.sTC.sTy.xnz;
        localObject2 = ((k)localObject2).sPp;
        a.Logd("MicroMsg.Voip", "v2protocal updateJbmBitrateRsSvrParam BitrateFlag : " + localawi.wzZ + " Bitrate: " + localawi.wAa);
        ((v2protocal)localObject2).field_jbmParamArraySize = 27;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray = new int[((v2protocal)localObject2).field_jbmParamArraySize];
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[0] = localawi.wzY;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[1] = localawi.wzZ;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[2] = localawi.wAa;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[3] = localawi.wAb;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[4] = localawi.wAc;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[5] = localawi.wAd;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[6] = localawi.wAe;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[7] = localawi.wAh;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[8] = localawi.wAi;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[9] = localawi.wAl;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[10] = localawi.wAm;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[11] = localawi.wAp;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[12] = localawi.wAq;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[13] = localawi.wAt;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[14] = localawi.wAu;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[15] = localawi.wAx;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[16] = localawi.wAy;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[17] = localawi.wAB;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[18] = localawi.wAC;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[19] = localawi.wAF;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[20] = localawi.wAG;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[21] = localawi.wAJ;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[22] = localawi.wAK;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[23] = localawi.wAN;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[24] = localawi.wAO;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[25] = localawi.wAR;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamArray[26] = localawi.wAS;
        ((v2protocal)localObject2).field_jbmParamDoubleArraySize = 20;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray = new double[((v2protocal)localObject2).field_jbmParamDoubleArraySize];
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[0] = localawi.wAf;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[1] = localawi.wAg;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[2] = localawi.wAj;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[3] = localawi.wAk;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[4] = localawi.wAn;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[5] = localawi.wAo;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[6] = localawi.wAr;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[7] = localawi.wAs;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[8] = localawi.wAv;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[9] = localawi.wAw;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[10] = localawi.wAz;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[11] = localawi.wAA;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[12] = localawi.wAD;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[13] = localawi.wAE;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[14] = localawi.wAH;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[15] = localawi.wAI;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[16] = localawi.wAL;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[17] = localawi.wAM;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[18] = localawi.wAP;
        ((v2protocal)localObject2).field_jbmBitratRsSvrParamDoubleArray[19] = localawi.wAQ;
        this.sTC.sNl.cIT();
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData end");
        AppMethodBeat.o(4681);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.t.1
 * JD-Core Version:    0.6.2
 */