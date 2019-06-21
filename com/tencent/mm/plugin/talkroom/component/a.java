package com.tencent.mm.plugin.talkroom.component;

import android.os.IInterface;

public abstract interface a extends IInterface
{
  public abstract int Close();

  public abstract int SetCurrentMicId(int paramInt);

  public abstract int a(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt4);

  public abstract e a(c paramc);

  public abstract int cEb();

  public abstract d cEc();

  public abstract byte[] e(int[] paramArrayOfInt, String paramString);

  public abstract int uninitLive();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.a
 * JD-Core Version:    0.6.2
 */