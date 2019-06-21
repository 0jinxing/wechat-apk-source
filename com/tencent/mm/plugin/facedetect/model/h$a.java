package com.tencent.mm.plugin.facedetect.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class h$a
{
  public String gJH;
  public long lTT;
  public long lTU;
  public boolean lTV;
  public long lTW;
  public String lTX;
  public boolean lTY;
  public boolean lTZ;
  public int type;

  public h$a(int paramInt, String paramString)
  {
    AppMethodBeat.i(216);
    this.type = paramInt;
    this.lTX = paramString;
    switch (this.type)
    {
    default:
      ab.e("MicroMsg.FaceDetectProcessModel", "hy: unknown type");
      this.type = 100;
      AppMethodBeat.o(216);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      this.lTT = 30L;
      this.lTU = 7000L;
      this.gJH = ah.getContext().getString(2131303872);
      this.lTV = true;
      this.lTW = 2500L;
      this.lTY = false;
      this.lTZ = false;
      AppMethodBeat.o(216);
      continue;
      this.lTT = 30L;
      this.lTU = 7000L;
      this.gJH = ah.getContext().getString(2131299472);
      this.lTV = false;
      this.lTW = -1L;
      this.lTY = true;
      this.lTZ = true;
      AppMethodBeat.o(216);
      continue;
      this.lTT = 30L;
      this.lTU = 7000L;
      this.gJH = ah.getContext().getString(2131299473);
      this.lTV = false;
      this.lTW = -1L;
      this.lTY = true;
      this.lTZ = true;
      AppMethodBeat.o(216);
      continue;
      this.lTT = 30L;
      this.lTU = 7000L;
      this.gJH = ah.getContext().getString(2131299471);
      this.lTV = true;
      this.lTW = -1L;
      this.lTY = true;
      this.lTZ = true;
      AppMethodBeat.o(216);
      continue;
      this.lTT = 30L;
      this.lTU = 7000L;
      this.gJH = ah.getContext().getString(2131299474);
      this.lTV = true;
      this.lTW = 1000L;
      this.lTY = true;
      this.lTZ = true;
      AppMethodBeat.o(216);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(217);
    String str = "FaceProcessItem{type=" + this.type + ", frameTween=" + this.lTT + ", hintTween=" + this.lTU + ", hintStr='" + this.gJH + '\'' + ", isCheckFace=" + this.lTV + ", minSuccTime=" + this.lTW + ", actionData='" + this.lTX + '\'' + '}';
    AppMethodBeat.o(217);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.h.a
 * JD-Core Version:    0.6.2
 */