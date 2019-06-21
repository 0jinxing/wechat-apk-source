package com.tencent.mm.network;

import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.stn.StnLogic;
import com.tencent.mars.stn.StnLogic.ICallBack;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class af
  implements StnLogic.ICallBack
{
  private static WakerLock ger = null;
  private static int ges = 1000000205;
  private static int get = 205;
  private static byte[] geu;
  private static byte[] gev;

  private static int a(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2)
  {
    int i = 0;
    AppMethodBeat.i(58708);
    int j;
    if (aa.ano() == null)
    {
      AppMethodBeat.o(58708);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        byte[] arrayOfByte = aa.ano().amU();
        if (arrayOfByte != null)
        {
          paramByteArrayOutputStream1.write(arrayOfByte);
          geu = arrayOfByte;
        }
        arrayOfByte = aa.ano().eJt;
        if (arrayOfByte != null)
        {
          paramByteArrayOutputStream2.write(arrayOfByte);
          gev = arrayOfByte;
        }
        j = aa.ano().gcU.QF();
        AppMethodBeat.o(58708);
      }
      catch (Exception localException)
      {
        ab.e("StnCallBack", exception2String(localException));
        if ((geu == null) || (gev == null));
      }
      try
      {
        paramByteArrayOutputStream1.write(geu);
        paramByteArrayOutputStream2.write(gev);
        label126: AppMethodBeat.o(58708);
        j = i;
      }
      catch (IOException paramByteArrayOutputStream1)
      {
        break label126;
      }
    }
  }

  private static String exception2String(Exception paramException)
  {
    AppMethodBeat.i(58699);
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    paramException = localStringWriter.toString();
    AppMethodBeat.o(58699);
    return paramException;
  }

  public final int buf2Resp(int paramInt1, Object paramObject, byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2)
  {
    paramInt2 = -1;
    AppMethodBeat.i(58703);
    if (aa.anp() == null)
    {
      AppMethodBeat.o(58703);
      paramInt1 = paramInt2;
    }
    while (true)
    {
      return paramInt1;
      try
      {
        paramInt1 = aa.anp().a(paramInt1, paramArrayOfByte, paramArrayOfInt1, paramArrayOfInt2);
        AppMethodBeat.o(58703);
      }
      catch (Exception paramObject)
      {
        ab.e("StnCallBack", exception2String(paramObject));
        new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
        AppMethodBeat.o(58703);
        paramInt1 = paramInt2;
      }
    }
  }

  public final int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(58706);
    paramArrayOfInt[0] = get;
    paramArrayOfInt[1] = ges;
    int i;
    if ((a(paramByteArrayOutputStream1, paramByteArrayOutputStream2) == 0) || (paramByteArrayOutputStream1.size() == 0) || (paramByteArrayOutputStream2.size() == 0))
    {
      i = StnLogic.ECHECK_NEXT;
      AppMethodBeat.o(58706);
    }
    while (true)
    {
      return i;
      i = StnLogic.ECHECK_NOW;
      AppMethodBeat.o(58706);
    }
  }

  public final boolean isLogoned()
  {
    boolean bool1 = false;
    AppMethodBeat.i(58710);
    if (aa.ano() == null)
      AppMethodBeat.o(58710);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = aa.ano().gcU.adb();
        bool1 = bool2;
        AppMethodBeat.o(58710);
      }
      catch (Exception localException)
      {
        ab.e("StnCallBack", exception2String(localException));
        new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
        AppMethodBeat.o(58710);
      }
    }
  }

  public final boolean makesureAuthed()
  {
    boolean bool1 = false;
    AppMethodBeat.i(58700);
    if (aa.ano() == null)
      AppMethodBeat.o(58700);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = aa.ano().amT();
        bool1 = bool2;
        AppMethodBeat.o(58700);
      }
      catch (Exception localException)
      {
        ab.e("StnCallBack", exception2String(localException));
        new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
        AppMethodBeat.o(58700);
      }
    }
  }

  public final void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(58711);
    ab.i("StnCallBack", "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean), paramString });
    try
    {
      aa.ano().gdc.networkAnalysisCallBack(paramInt1, paramInt2, paramBoolean, paramString);
      AppMethodBeat.o(58711);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("StnCallBack", paramString, "", new Object[0]);
        new StringBuilder().append(paramString.getClass().getSimpleName()).append(":").append(paramString.getStackTrace()[0]).append(", ").append(paramString.getStackTrace()[1]);
        AppMethodBeat.o(58711);
      }
    }
  }

  public final boolean onLongLinkIdentifyResp(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(58707);
    ByteArrayOutputStream localByteArrayOutputStream;
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null))
      localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(paramArrayOfByte1);
      localByteArrayOutputStream.write(paramArrayOfByte2);
      label31: onPush(ges, localByteArrayOutputStream.toByteArray());
      AppMethodBeat.o(58707);
      return true;
    }
    catch (IOException paramArrayOfByte1)
    {
      break label31;
    }
  }

  public final String[] onNewDns(String paramString)
  {
    return new String[0];
  }

  public final void onPush(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58701);
    if (aa.anq() == null)
      AppMethodBeat.o(58701);
    while (true)
    {
      return;
      try
      {
        if (ger == null)
        {
          localObject = new com/tencent/mars/comm/WakerLock;
          ((WakerLock)localObject).<init>(aa.getContext(), "StnCallBack");
          ger = (WakerLock)localObject;
        }
        ger.lock(1000L, "StnLogic.onNotify");
        Object localObject = aa.anm();
        af.1 local1 = new com/tencent/mm/network/af$1;
        local1.<init>(this, paramInt, paramArrayOfByte);
        ((ak)localObject).post(local1);
        AppMethodBeat.o(58701);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("StnCallBack", exception2String(paramArrayOfByte));
        new StringBuilder().append(paramArrayOfByte.getClass().getSimpleName()).append(":").append(paramArrayOfByte.getStackTrace()[0]).append(", ").append(paramArrayOfByte.getStackTrace()[1]);
        AppMethodBeat.o(58701);
      }
    }
  }

  // ERROR //
  public final int onTaskEnd(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: ldc_w 261
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 114	com/tencent/mm/network/aa:anp	()Lcom/tencent/mm/network/z;
    //   9: ifnonnull +13 -> 22
    //   12: ldc_w 261
    //   15: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: iconst_0
    //   19: istore_1
    //   20: iload_1
    //   21: ireturn
    //   22: invokestatic 114	com/tencent/mm/network/aa:anp	()Lcom/tencent/mm/network/z;
    //   25: iload_1
    //   26: invokevirtual 265	com/tencent/mm/network/z:mC	(I)I
    //   29: istore 5
    //   31: invokestatic 247	com/tencent/mm/network/aa:anm	()Lcom/tencent/mm/sdk/platformtools/ak;
    //   34: astore 6
    //   36: new 267	com/tencent/mm/network/af$2
    //   39: astore 7
    //   41: aload 7
    //   43: aload_0
    //   44: iload_1
    //   45: aload_2
    //   46: iload_3
    //   47: iload 4
    //   49: invokespecial 270	com/tencent/mm/network/af$2:<init>	(Lcom/tencent/mm/network/af;ILjava/lang/Object;II)V
    //   52: aload 6
    //   54: aload 7
    //   56: invokevirtual 258	com/tencent/mm/sdk/platformtools/ak:post	(Ljava/lang/Runnable;)Z
    //   59: pop
    //   60: iload 5
    //   62: istore_1
    //   63: ldc_w 261
    //   66: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: goto -49 -> 20
    //   72: astore_2
    //   73: iconst_0
    //   74: istore_1
    //   75: ldc 80
    //   77: aload_2
    //   78: invokestatic 84	com/tencent/mm/network/af:exception2String	(Ljava/lang/Exception;)Ljava/lang/String;
    //   81: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: new 121	java/lang/StringBuilder
    //   87: dup
    //   88: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   91: aload_2
    //   92: invokevirtual 126	java/lang/Object:getClass	()Ljava/lang/Class;
    //   95: invokevirtual 131	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   98: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: ldc 137
    //   103: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: aload_2
    //   107: invokevirtual 141	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   110: iconst_0
    //   111: aaload
    //   112: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   115: ldc 146
    //   117: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload_2
    //   121: invokevirtual 141	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   124: iconst_1
    //   125: aaload
    //   126: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: goto -67 -> 63
    //   133: astore_2
    //   134: iload 5
    //   136: istore_1
    //   137: goto -62 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   22	31	72	java/lang/Exception
    //   31	60	133	java/lang/Exception
  }

  public final void reportConnectInfo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(58705);
    try
    {
      aa.anl().mF(paramInt1);
      com.tencent.mm.an.a.ln(paramInt1);
      AppMethodBeat.o(58705);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("StnCallBack", "reportConnectInfo :%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58705);
      }
    }
  }

  public final boolean req2Buf(int paramInt1, Object paramObject, ByteArrayOutputStream paramByteArrayOutputStream, int[] paramArrayOfInt, int paramInt2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(58702);
    if (aa.anp() == null)
      AppMethodBeat.o(58702);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = aa.anp().a(paramInt1, paramByteArrayOutputStream, paramArrayOfInt, paramInt2);
        bool1 = bool2;
        AppMethodBeat.o(58702);
      }
      catch (Exception paramObject)
      {
        ab.e("StnCallBack", exception2String(paramObject));
        new StringBuilder().append(paramObject.getClass().getSimpleName()).append(":").append(paramObject.getStackTrace()[0]).append(", ").append(paramObject.getStackTrace()[1]);
        AppMethodBeat.o(58702);
      }
    }
  }

  public final void requestDoSync()
  {
    AppMethodBeat.i(58709);
    if (aa.anq() == null)
      AppMethodBeat.o(58709);
    while (true)
    {
      return;
      try
      {
        ak localak = aa.anm();
        af.3 local3 = new com/tencent/mm/network/af$3;
        local3.<init>(this);
        localak.post(local3);
        AppMethodBeat.o(58709);
      }
      catch (Exception localException)
      {
        ab.e("StnCallBack", exception2String(localException));
        new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
        AppMethodBeat.o(58709);
      }
    }
  }

  public final String[] requestNetCheckShortLinkHosts()
  {
    return new String[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.af
 * JD-Core Version:    0.6.2
 */