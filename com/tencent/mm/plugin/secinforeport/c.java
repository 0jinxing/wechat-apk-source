package com.tencent.mm.plugin.secinforeport;

import android.os.Build;
import android.os.Build.VERSION;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.plugin.normsg.Normsg.b;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.brp;
import com.tencent.mm.protocal.protobuf.brq;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.zip.Deflater;

 enum c
  implements com.tencent.mm.plugin.secinforeport.a.c
{
  static
  {
    AppMethodBeat.i(57501);
    qjh = new c("INSTANCE");
    qji = new c[] { qjh };
    AppMethodBeat.o(57501);
  }

  private static String cip()
  {
    AppMethodBeat.i(57499);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    byte[] arrayOfByte2;
    int i;
    Object localObject3;
    try
    {
      arrayOfByte2 = com.tencent.mm.plugin.normsg.a.b.oTO.jE(false).getBytes();
      localObject2 = localObject1;
      i = arrayOfByte2.length;
      if (arrayOfByte2 != null)
        break label132;
      localObject2 = localObject1;
      localObject3 = new java/lang/IllegalArgumentException;
      localObject2 = localObject1;
      ((IllegalArgumentException)localObject3).<init>("dataIn is null.");
      localObject2 = localObject1;
      AppMethodBeat.o(57499);
      localObject2 = localObject1;
      throw ((Throwable)localObject3);
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.SecInfoReporterImpl", localException, "exception when compressing dump maps", new Object[0]);
    }
    if (localObject2 == null);
    for (localObject2 = ""; ; localObject2 = new String((byte[])localObject2))
    {
      if (((String)localObject2).length() > 5120)
      {
        h.pYm.a(633L, 4L, 1L, false);
        ab.d("MicroMsg.SecInfoReporterImpl", "compressed and base64 result is still too large with length " + ((String)localObject2).length());
      }
      AppMethodBeat.o(57499);
      return localObject2;
      label132: localObject2 = localException;
      localObject3 = new java/util/zip/Deflater;
      localObject2 = localException;
      ((Deflater)localObject3).<init>();
      localObject2 = localException;
      ((Deflater)localObject3).setLevel(9);
      localObject2 = localException;
      ((Deflater)localObject3).setInput(arrayOfByte2, 0, i);
      localObject2 = localException;
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localObject2 = localException;
      localByteArrayOutputStream.<init>(i);
      localObject2 = localException;
      ((Deflater)localObject3).finish();
      localObject2 = localException;
      arrayOfByte2 = new byte[4096];
      while (true)
      {
        localObject2 = localException;
        if (((Deflater)localObject3).finished())
          break;
        localObject2 = localException;
        localByteArrayOutputStream.write(arrayOfByte2, 0, ((Deflater)localObject3).deflate(arrayOfByte2));
      }
      localObject2 = localException;
      localByteArrayOutputStream.close();
      localObject2 = localException;
      byte[] arrayOfByte1 = Base64.encode(localByteArrayOutputStream.toByteArray(), 2);
      localObject2 = arrayOfByte1;
      localObject3 = new java/lang/StringBuilder;
      localObject2 = arrayOfByte1;
      ((StringBuilder)localObject3).<init>("Base64 length = ");
      localObject2 = arrayOfByte1;
      ab.d("MicroMsg.SecInfoReporterImpl", arrayOfByte1.length + "\n content = " + Arrays.toString(arrayOfByte1));
      localObject2 = arrayOfByte1;
      break;
    }
  }

  public final void Ch(int paramInt)
  {
    AppMethodBeat.i(57498);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<st><Manufacturer>").append(Build.MANUFACTURER).append("</Manufacturer><Model>").append(Build.MODEL).append("</Model><VersionRelease>").append(Build.VERSION.RELEASE).append("</VersionRelease><VersionIncremental>").append(Build.VERSION.INCREMENTAL).append("</VersionIncremental><Display>").append(Build.DISPLAY).append("</Display>");
    if (paramInt == -2147483646)
      localStringBuilder.append("<FingerPrint>").append(Build.FINGERPRINT).append("</FingerPrint><NDM>").append(cip()).append("</NDM>");
    localStringBuilder.append("</st>");
    ab.d("MicroMsg.SecInfoReporterImpl", "report msg:\n" + localStringBuilder.toString());
    o(paramInt, localStringBuilder.toString().getBytes(Charset.forName("UTF-8")));
    AppMethodBeat.o(57498);
  }

  public final boolean Y(int paramInt, long paramLong)
  {
    AppMethodBeat.i(57496);
    boolean bool = c.a.Y(paramInt, paramLong);
    AppMethodBeat.o(57496);
    return bool;
  }

  public final void ff(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57497);
    byte[] arrayOfByte = Normsg.b.Aj(paramInt2);
    if (arrayOfByte != null)
      o(paramInt1, arrayOfByte);
    AppMethodBeat.o(57497);
  }

  public final void o(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57500);
    if (paramArrayOfByte == null)
    {
      ab.e("MicroMsg.SecInfoReporterImpl", "data is null.");
      AppMethodBeat.o(57500);
    }
    while (true)
    {
      return;
      Object localObject = new b.a();
      ((b.a)localObject).uri = com.tencent.mm.plugin.normsg.a.b.oTO.TQ("");
      ((b.a)localObject).fsI = 771;
      ((b.a)localObject).fsJ = new brp();
      ((b.a)localObject).fsK = new brq();
      localObject = ((b.a)localObject).acD();
      brp localbrp = (brp)((com.tencent.mm.ai.b)localObject).fsG.fsP;
      localbrp.wTQ = paramInt;
      localbrp.wTP = new com.tencent.mm.bt.b(paramArrayOfByte);
      e.pXa.a(416L, 0L, 1L, false);
      w.a((com.tencent.mm.ai.b)localObject, new c.1(this, paramInt), false);
      AppMethodBeat.o(57500);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.secinforeport.c
 * JD-Core Version:    0.6.2
 */