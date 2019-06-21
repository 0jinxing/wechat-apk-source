package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import com.google.a.a.e;

public abstract class d
  implements c
{
  public boolean AlL = false;
  b AlM = null;
  protected byte[] AlN = null;
  public Object AlO = null;
  protected int AlP;
  protected int AlQ = 2;
  protected int AlR = 0;
  protected final String TAG2 = getClass().getSimpleName();
  private final long ftT = 60000L;
  private Runnable ftX = new d.1(this);
  boolean jIN = false;
  private int mErrorCode = -999;
  private Handler mHandler = new Handler(Looper.getMainLooper());

  public final int a(b paramb)
  {
    int i;
    if (this.AlN == null)
    {
      com.tencent.pb.common.c.c.w("MicroMsg.Voip", new Object[] { this.TAG2, "dosene reqData is null cmd=" + this.AlP });
      i = -1;
    }
    while (true)
    {
      return i;
      this.AlM = paramb;
      paramb = new i(this);
      i = f.dPx().a(null, paramb, this.AlP, dPt(), this.AlN, this.AlR);
      if (i >= 0)
        this.mHandler.postDelayed(this.ftX, 60000L);
      com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "NETTASK_SEND dosene:cmd ", dPt(), Integer.valueOf(i) });
    }
  }

  public final void c(int paramInt, e parame)
  {
    this.AlP = paramInt;
    Object localObject = null;
    try
    {
      parame = e.b(parame);
      this.AlN = parame;
      return;
    }
    catch (Exception parame)
    {
      while (true)
        parame = localObject;
    }
  }

  protected abstract Object ch(byte[] paramArrayOfByte);

  protected abstract String dPt();

  public abstract int getType();

  public final void r(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 2;
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "onResp errcode", Integer.valueOf(paramInt) });
    this.mHandler.removeCallbacks(this.ftX);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "NETTASK_RECV onResp:cmd= ", dPt(), Integer.valueOf(paramInt), Boolean.valueOf(this.jIN) });
    if (paramInt != 0)
    {
      com.tencent.pb.common.c.c.w("MicroMsg.Voip", new Object[] { this.TAG2, "getNetworkErrType errcode:".concat(String.valueOf(paramInt)) });
      if (paramInt == -1)
        if (h.isNetworkConnected())
          i = 1;
    }
    while (true)
    {
      if (this.jIN)
        com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "onResp netscene already canceled, cmd:" + this.AlP });
      while (true)
      {
        return;
        if (paramInt == 6801)
        {
          i = 10;
          break;
        }
        i = 4;
        break;
        this.mErrorCode = paramInt;
        this.AlO = ch(paramArrayOfByte);
        this.mHandler.post(new d.2(this, i, paramInt));
      }
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.d
 * JD-Core Version:    0.6.2
 */