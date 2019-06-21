package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.c;

public final class i
{
  public int ALh;
  public int ALi;
  public int ALj;
  public int ALk;
  public int ALl;
  public int ALm;
  public int ALn;
  public int ALo;
  public int ALp;
  public int AlQ;
  public int mHeight;
  public int mWidth;

  public i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
  {
    AppMethodBeat.i(128000);
    this.ALh = paramInt1;
    this.mWidth = paramInt2;
    this.mHeight = paramInt3;
    this.ALi = paramInt4;
    this.ALj = paramInt5;
    this.ALk = paramInt6;
    this.ALl = paramInt7;
    this.AlQ = paramInt8;
    this.ALm = paramInt9;
    this.ALn = paramInt10;
    this.ALo = paramInt11;
    this.ALp = paramInt12;
    c.d("VoiceEngineConf", new Object[] { "mDisableVideo: ", Integer.valueOf(paramInt1), " mWidth: ", Integer.valueOf(paramInt2), " mHeight: ", Integer.valueOf(paramInt3), " mInFPS: ", Integer.valueOf(paramInt4), " mOutFmt: ", Integer.valueOf(paramInt5), " mOSType: ", Integer.valueOf(paramInt6), " mNetKbps: ", Integer.valueOf(paramInt7), " mNetType: ", Integer.valueOf(paramInt8), " mMTUSize: ", Integer.valueOf(paramInt9), " mCPUFlag: ", Integer.valueOf(paramInt10), " mDispRate: ", Integer.valueOf(paramInt11), " mVCodecType: ", Integer.valueOf(paramInt12) });
    AppMethodBeat.o(128000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.i
 * JD-Core Version:    0.6.2
 */