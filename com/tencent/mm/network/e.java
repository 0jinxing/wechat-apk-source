package com.tencent.mm.network;

import com.tencent.mm.network.a.b;
import com.tencent.mm.protocal.y;
import java.util.List;

public abstract interface e
{
  public abstract int a(r paramr, l paraml);

  public abstract int a(String paramString, boolean paramBoolean, List<String> paramList);

  public abstract void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean);

  public abstract void a(b paramb);

  public abstract void a(h paramh);

  public abstract void a(o paramo);

  public abstract void a(y paramy);

  public abstract void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4);

  public abstract boolean acT();

  public abstract c adg();

  public abstract i adh();

  public abstract void adi();

  public abstract void adj();

  public abstract void cF(boolean paramBoolean);

  public abstract void cG(boolean paramBoolean);

  public abstract void cH(boolean paramBoolean);

  public abstract void cI(boolean paramBoolean);

  public abstract void cancel(int paramInt);

  public abstract int getHostByName(String paramString, List<String> paramList);

  public abstract String[] getIPsString(boolean paramBoolean);

  public abstract String getIspId();

  public abstract String getNetworkServerIp();

  public abstract void keepSignalling();

  public abstract void qs(String paramString);

  public abstract void qt(String paramString);

  public abstract void reportFailIp(String paramString);

  public abstract void reset();

  public abstract void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt);

  public abstract void setSignallingStrategy(long paramLong1, long paramLong2);

  public abstract void stopSignalling();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.e
 * JD-Core Version:    0.6.2
 */