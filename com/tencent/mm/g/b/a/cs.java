package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class cs extends a
{
  public long cVR = 0L;
  private String ddc;
  private String dhA;
  public cs.c dhB;
  public cs.b dhC;
  private String dhD;
  public cs.d dhE;
  public cs.e dhF;
  public cs.a dhG;
  private String dhx;
  private long dhy = 0L;
  private String dhz;

  public final String Fj()
  {
    int i = -1;
    AppMethodBeat.i(51117);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ddc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.dhA);
    ((StringBuffer)localObject).append(",");
    if (this.dhB != null)
    {
      j = this.dhB.value;
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      if (this.dhC == null)
        break label285;
      j = this.dhC.value;
      label138: ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.cVR);
      ((StringBuffer)localObject).append(",");
      ((StringBuffer)localObject).append(this.dhD);
      ((StringBuffer)localObject).append(",");
      if (this.dhE == null)
        break label290;
      j = this.dhE.value;
      label198: ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      if (this.dhF == null)
        break label295;
    }
    label285: label290: label295: for (int j = this.dhF.value; ; j = -1)
    {
      ((StringBuffer)localObject).append(j);
      ((StringBuffer)localObject).append(",");
      j = i;
      if (this.dhG != null)
        j = this.dhG.value;
      ((StringBuffer)localObject).append(j);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(51117);
      return localObject;
      j = -1;
      break;
      j = -1;
      break label138;
      j = -1;
      break label198;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(51118);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("AppId:").append(this.ddc);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("PageId:").append(this.dhx);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ActionTimeStampMs:").append(this.dhy);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ShareTicket:").append(this.dhz);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("ChattingId:").append(this.dhA);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("IsGroupChatting:").append(this.dhB);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("EventId:").append(this.dhC);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Scene:").append(this.cVR);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SceneNote:").append(this.dhD);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("MsgState:").append(this.dhE);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("SubScribeState:").append(this.dhF);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("AppType:").append(this.dhG);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(51118);
    return localObject;
  }

  public final cs Hk()
  {
    AppMethodBeat.i(51113);
    this.dhy = bo.anU();
    super.aj("ActionTimeStampMs", this.dhy);
    AppMethodBeat.o(51113);
    return this;
  }

  public final int getId()
  {
    return 16024;
  }

  public final cs hE(String paramString)
  {
    AppMethodBeat.i(51111);
    this.ddc = t("AppId", paramString, true);
    AppMethodBeat.o(51111);
    return this;
  }

  public final cs hF(String paramString)
  {
    AppMethodBeat.i(51112);
    this.dhx = t("PageId", paramString, true);
    AppMethodBeat.o(51112);
    return this;
  }

  public final cs hG(String paramString)
  {
    AppMethodBeat.i(51114);
    this.dhz = t("ShareTicket", paramString, true);
    AppMethodBeat.o(51114);
    return this;
  }

  public final cs hH(String paramString)
  {
    AppMethodBeat.i(51115);
    this.dhA = t("ChattingId", paramString, true);
    AppMethodBeat.o(51115);
    return this;
  }

  public final cs hI(String paramString)
  {
    AppMethodBeat.i(51116);
    this.dhD = t("SceneNote", paramString, true);
    AppMethodBeat.o(51116);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cs
 * JD-Core Version:    0.6.2
 */