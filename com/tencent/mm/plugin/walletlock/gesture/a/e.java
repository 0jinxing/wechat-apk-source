package com.tencent.mm.plugin.walletlock.gesture.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bil;
import com.tencent.mm.protocal.protobuf.bim;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.util.List;

public final class e
{
  public static void a(g paramg)
  {
    AppMethodBeat.i(51578);
    if (paramg.tVD == -1L)
      AppMethodBeat.o(51578);
    while (true)
    {
      return;
      long l = SystemClock.elapsedRealtime();
      if (l < paramg.tVD)
      {
        paramg.tVD = l;
        paramg.tVE += l;
        ab.d("MicroMsg.GestureUtil", String.format("Rebooted, need to add additional %d ms, now elapsed %d ms", new Object[] { Long.valueOf(l), Long.valueOf(paramg.tVE) }));
        AppMethodBeat.o(51578);
      }
      else
      {
        paramg.tVE = (l - paramg.tVD + paramg.tVE);
        paramg.tVD = l;
        AppMethodBeat.o(51578);
      }
    }
  }

  public static boolean b(bil parambil)
  {
    boolean bool = true;
    AppMethodBeat.i(51573);
    if ((parambil == null) || (parambil.wLQ == null) || (parambil.wLQ.getBuffer() == null))
    {
      AppMethodBeat.o(51573);
      bool = false;
    }
    while (true)
    {
      return bool;
      byte[] arrayOfByte = parambil.wLQ.getBufferToBytes();
      if ((arrayOfByte.length == 0) || ((arrayOfByte.length & 0x1) != 0))
      {
        AppMethodBeat.o(51573);
        bool = false;
      }
      else
      {
        long l = new p(parambil.uin).longValue();
        arrayOfByte = bx(arrayOfByte);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(parambil.version);
        if (parambil.wLO.hasBuffer())
          localStringBuilder.append(new String(parambil.wLO.getBufferToBytes()));
        localStringBuilder.append(l);
        int i = UtilsJni.doEcdsaVerify(a.tVz, localStringBuilder.toString().getBytes(), arrayOfByte);
        ab.d("MicroMsg.GestureUtil", String.format("verifyPatternBuffer, ret:%d", new Object[] { Integer.valueOf(i) }));
        if (i == 1)
        {
          AppMethodBeat.o(51573);
        }
        else
        {
          AppMethodBeat.o(51573);
          bool = false;
        }
      }
    }
  }

  public static boolean b(bim parambim)
  {
    boolean bool = false;
    AppMethodBeat.i(51574);
    if ((parambim == null) || (parambim.wLS == null) || (parambim.wLS.getBuffer() == null))
      AppMethodBeat.o(51574);
    while (true)
    {
      return bool;
      localObject = parambim.wLS.getBufferToBytes();
      if ((localObject.length != 0) && ((localObject.length & 0x1) == 0))
        break;
      AppMethodBeat.o(51574);
    }
    byte[] arrayOfByte = bx((byte[])localObject);
    com.tencent.mm.kernel.g.RN();
    long l = new p(com.tencent.mm.kernel.a.QF()).longValue();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(parambim.wLR);
    ((StringBuilder)localObject).append(l);
    int i = UtilsJni.doEcdsaVerify(a.tVz, ((StringBuilder)localObject).toString().getBytes(), arrayOfByte);
    if (((i != 1) && (parambim.wLT == 1)) || ((i == 1) && (parambim.wLT == 0)));
    for (bool = true; ; bool = false)
    {
      ab.d("MicroMsg.GestureUtil", String.format("verifyPatternInfo, verifyRes:%d ret:%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) }));
      AppMethodBeat.o(51574);
      break;
    }
  }

  private static byte[] bx(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51575);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (int i = 0; i < paramArrayOfByte.length - 1; i += 2)
      localByteArrayOutputStream.write("0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[i])) << 4 | "0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[(i + 1)])));
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    AppMethodBeat.o(51575);
    return paramArrayOfByte;
  }

  public static String by(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51580);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      String str = Integer.toHexString(paramArrayOfByte[j] & 0xFF);
      if (str.length() < 2)
        localStringBuilder.append('0');
      localStringBuilder.append(str);
    }
    paramArrayOfByte = localStringBuilder.toString();
    AppMethodBeat.o(51580);
    return paramArrayOfByte;
  }

  public static boolean cTz()
  {
    int i = -1;
    boolean bool1 = false;
    AppMethodBeat.i(51576);
    boolean bool2;
    if ((!com.tencent.mm.kernel.g.RK()) || (com.tencent.mm.kernel.a.QT()))
    {
      ab.w("MicroMsg.GestureUtil", "not login !!");
      AppMethodBeat.o(51576);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bim localbim = d.cTG();
      bil localbil = d.cTF();
      int j;
      label53: int k;
      label61: label71: label78: boolean bool3;
      if (localbim == null)
      {
        j = 1;
        if (localbil != null)
          break label244;
        k = 1;
        if (j != 0)
          break label250;
        bool2 = b(localbim);
        if (localbim != null)
          break label255;
        j = -1;
        ab.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock serverInfo:%s status:%d  svrinfoValid:%s", new Object[] { localbim, Integer.valueOf(j), Boolean.valueOf(bool2) });
        if (k != 0)
          break label264;
        bool3 = b(localbil);
        label120: if (localbil != null)
          break label270;
        k = i;
        label128: ab.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock localBuff:%s status:%d  localBuffValid:%s", new Object[] { localbil, Integer.valueOf(k), Boolean.valueOf(bool3) });
        if ((bool2) && (!bool3))
          break label425;
      }
      try
      {
        ab.i("MicroMsg.GestureUtil", "Both info & buff are valid, choose one to trust.");
        if (localbim.wLR > localbil.version)
        {
          ab.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, srvInfo wins.", new Object[] { Integer.valueOf(localbim.wLR), Integer.valueOf(localbil.version) });
          if (localbim.wLT == 1)
          {
            AppMethodBeat.o(51576);
            bool2 = true;
            continue;
            j = 0;
            break label53;
            label244: k = 0;
            break label61;
            label250: bool2 = false;
            break label71;
            label255: j = localbim.wLT;
            break label78;
            label264: bool3 = false;
            break label120;
            label270: k = localbil.wLP;
            break label128;
          }
          else
          {
            AppMethodBeat.o(51576);
            bool2 = bool1;
          }
        }
        else if (localbim.wLR == localbil.version)
        {
          ab.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, draw.", new Object[] { Integer.valueOf(localbim.wLR), Integer.valueOf(localbil.version) });
          if (localbim.wLT == 1)
          {
            AppMethodBeat.o(51576);
            bool2 = true;
          }
          else
          {
            AppMethodBeat.o(51576);
            bool2 = bool1;
          }
        }
        else
        {
          ab.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, localBuff wins.", new Object[] { Integer.valueOf(localbim.wLR), Integer.valueOf(localbil.version) });
          if (localbil.wLP == 1)
          {
            AppMethodBeat.o(51576);
            bool2 = true;
          }
          else
          {
            AppMethodBeat.o(51576);
            bool2 = bool1;
            continue;
            label425: ab.i("MicroMsg.GestureUtil", "Info is valid but buf is invalid, we trust info this time.");
            if (localbim.wLT == 1)
            {
              AppMethodBeat.o(51576);
              bool2 = true;
            }
            else
            {
              AppMethodBeat.o(51576);
              bool2 = bool1;
              continue;
              if (bool3)
              {
                ab.i("MicroMsg.GestureUtil", "Info is invalid but buff is valid, we trust buff this time.");
                if (localbil.wLP == 1)
                {
                  AppMethodBeat.o(51576);
                  bool2 = true;
                }
                else
                {
                  AppMethodBeat.o(51576);
                  bool2 = bool1;
                }
              }
              else
              {
                ab.w("MicroMsg.GestureUtil", "Both buff & info are invalid, do not activate this time and wait for next sync.");
                AppMethodBeat.o(51576);
                bool2 = bool1;
              }
            }
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.GestureUtil", localException, "isUserSetWalletLock throw an exception.", new Object[0]);
        AppMethodBeat.o(51576);
        bool2 = bool1;
      }
    }
  }

  public static byte[] dX(List<f> paramList)
  {
    AppMethodBeat.i(51577);
    if (paramList == null)
    {
      paramList = new IllegalArgumentException("pattern is null");
      AppMethodBeat.o(51577);
      throw paramList;
    }
    int i = paramList.size();
    Object localObject = new byte[i];
    for (int j = 0; j < i; j++)
    {
      f localf = (f)paramList.get(j);
      int k = localf.tVA;
      localObject[j] = ((byte)(byte)(localf.tVB + k * 3 + 1));
    }
    paramList = new StringBuilder();
    for (j = 0; j < i; j++)
      paramList.append(localObject[j]);
    paramList = paramList.toString();
    localObject = r.Yz();
    localObject = com.tencent.mm.a.g.x((com.tencent.mm.a.g.x(paramList.getBytes()) + (String)localObject).getBytes());
    paramList = com.tencent.mm.a.g.x(((String)localObject + paramList).getBytes()).getBytes();
    AppMethodBeat.o(51577);
    return paramList;
  }

  public static byte[] stringToBytes(String paramString)
  {
    AppMethodBeat.i(51579);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (int i = 0; i < paramString.length(); i += 2)
      localByteArrayOutputStream.write(Integer.parseInt(paramString.substring(i, i + 2), 16));
    paramString = localByteArrayOutputStream.toByteArray();
    AppMethodBeat.o(51579);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.a.e
 * JD-Core Version:    0.6.2
 */