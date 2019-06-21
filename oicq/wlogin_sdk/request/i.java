package oicq.wlogin_sdk.request;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.SecureRandom;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

public final class i
{
  public static byte[] BUO = new byte[0];
  public SecureRandom BUD;
  public byte[] BUE;
  public byte[] BUF;
  public byte[] BUG;
  public f BUH;
  public g BUI;
  public long BUJ;
  public int BUK;
  public long BUL;
  public int BUM;
  byte[] BUN;
  byte[] BUP;
  int BUQ;
  byte[] BUR;
  byte[] BUS;
  byte[] BUT;
  byte[] BUU;
  byte[] BUV;
  byte[] BUW;
  int BUX;
  int BUY;
  int BUZ;
  int BVa;
  byte[] BVb;
  ErrMsg BVc;
  byte[] BVd;
  byte[] BVe;
  byte[] BVf;
  c BVg;
  public Context _context;
  public long _uin;

  public i()
  {
    AppMethodBeat.i(96443);
    this.BUD = new SecureRandom();
    this.BUE = util.emO();
    this.BUF = null;
    this.BUG = new byte[16];
    this.BUH = new f();
    this.BUI = new g();
    this._uin = 0L;
    this.BUJ = 0L;
    this.BUK = 0;
    this.BUL = -1L;
    this.BUM = 0;
    this._context = null;
    this.BUN = new byte[0];
    this.BUP = new byte[0];
    this.BUQ = 0;
    this.BUR = new byte[0];
    this.BUS = new byte[0];
    this.BUT = new byte[0];
    this.BUU = new byte[0];
    this.BUV = new byte[0];
    this.BUW = new byte[0];
    this.BUX = 0;
    this.BUY = 0;
    this.BUZ = 0;
    this.BVa = 0;
    this.BVb = new byte[0];
    this.BVc = new ErrMsg();
    this.BVd = new byte[0];
    this.BVe = new byte[4];
    this.BVf = new byte[0];
    this.BVg = null;
    AppMethodBeat.o(96443);
  }

  public static long emE()
  {
    AppMethodBeat.i(96444);
    long l = System.currentTimeMillis() / 1000L;
    AppMethodBeat.o(96444);
    return l;
  }

  public final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, byte[] paramArrayOfByte10, byte[] paramArrayOfByte11, byte[] paramArrayOfByte12, byte[] paramArrayOfByte13, byte[] paramArrayOfByte14, byte[] paramArrayOfByte15, byte[] paramArrayOfByte16, byte[][] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(96445);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("put siginfo:");
      util.awF(paramLong1 + "," + paramLong2 + "," + paramLong3 + "," + paramLong4 + "," + paramLong5 + "," + paramLong6 + "," + util.cP(paramArrayOfByte1) + "," + util.cP(paramArrayOfByte2) + "," + util.cP(paramArrayOfByte3) + "," + util.cP(paramArrayOfByte4) + "," + util.cP(paramArrayOfByte5) + "," + util.cP(paramArrayOfByte6) + "," + util.cP(paramArrayOfByte7) + "," + util.cP(paramArrayOfByte8) + "," + util.cP(paramArrayOfByte9) + "," + util.cP(paramArrayOfByte10) + "," + util.cP(paramArrayOfByte11) + "," + util.cP(paramArrayOfByte12) + "," + util.cP(paramArrayOfByte13) + "," + util.cP(paramArrayOfByte14) + "," + util.cP(paramArrayOfByte15) + "," + util.cP(paramArrayOfByte16));
      localObject = "";
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfByte.length)
        {
          util.awF("reserve:".concat(String.valueOf(localObject)));
          i = this.BVg.a(paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3, paramArrayOfByte4, paramArrayOfByte5, paramArrayOfByte6, paramArrayOfByte7, paramArrayOfByte8, paramArrayOfByte9, paramArrayOfByte10, paramArrayOfByte11, paramArrayOfByte12, paramArrayOfByte13, paramArrayOfByte14, paramArrayOfByte15, paramArrayOfByte16, paramArrayOfByte);
          AppMethodBeat.o(96445);
          return i;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(String.valueOf(localObject));
        localObject = String.format("reserve[%d]: %d ", new Object[] { Integer.valueOf(i), Long.valueOf(util.cP(paramArrayOfByte[i])) });
      }
    }
    finally
    {
    }
    throw paramArrayOfByte1;
  }

  public final void i(Long paramLong)
  {
    try
    {
      AppMethodBeat.i(96447);
      this.BVg.i(paramLong);
      AppMethodBeat.o(96447);
      return;
    }
    finally
    {
      paramLong = finally;
    }
    throw paramLong;
  }

  public final WloginSigInfo og(long paramLong)
  {
    try
    {
      AppMethodBeat.i(96446);
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("uin=");
      util.jh("get_siginfo", paramLong + "appid=522017402");
      localObject1 = this.BVg.og(paramLong);
      if (localObject1 != null)
        AppMethodBeat.o(96446);
      while (true)
      {
        return localObject1;
        AppMethodBeat.o(96446);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.request.i
 * JD-Core Version:    0.6.2
 */