package com.tencent.mm.plugin.talkroom.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ah;

public class v2engine
{
  private static g flC;

  public static g ZL()
  {
    AppMethodBeat.i(25749);
    if (flC == null)
      flC = new g(ah.getContext());
    g localg = flC;
    AppMethodBeat.o(25749);
    return localg;
  }

  public native int Close();

  public native int GetAudioData(PByteArray paramPByteArray, int paramInt, PInt paramPInt1, PInt paramPInt2);

  public native int GetStatis(PByteArray paramPByteArray, String paramString);

  public native int IsSilenceFrame();

  public native int Open(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt, short[] paramArrayOfShort, int paramInt4);

  public native int Send(byte[] paramArrayOfByte, short paramShort);

  public native int SetCurrentMicId(int paramInt);

  public native int initLive(int paramInt, String paramString);

  public native int uninitLive();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.v2engine
 * JD-Core Version:    0.6.2
 */