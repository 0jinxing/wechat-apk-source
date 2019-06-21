package com.tencent.mm.plugin.appbrand.jsapi.camera.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.QbarNative.QBarResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a extends b
{
  private Object cli;
  private QbarNative hHf;
  private volatile boolean hHg;
  private byte[] hHh;
  byte[] hHi;
  private String type;

  public a(b.a parama, String paramString)
  {
    super(parama);
    AppMethodBeat.i(130973);
    this.cli = new Object();
    this.hHg = false;
    this.type = paramString;
    AppMethodBeat.o(130973);
  }

  private void sI()
  {
    AppMethodBeat.i(130977);
    synchronized (this.cli)
    {
      if (this.hHg)
      {
        int i = this.hHf.release();
        this.hHf = null;
        this.hHg = false;
        ab.d("MicroMsg.appbrand.ScanQBarDecoder", "QbarNative.Release():%d", new Object[] { Integer.valueOf(i) });
      }
      AppMethodBeat.o(130977);
      return;
    }
  }

  public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(130975);
    while (true)
    {
      boolean bool;
      Object localObject2;
      synchronized (this.cli)
      {
        if (!this.hHg)
        {
          ab.e("MicroMsg.appbrand.ScanQBarDecoder", "not init");
          bool = false;
          AppMethodBeat.o(130975);
          return bool;
        }
        ab.d("MicroMsg.appbrand.ScanQBarDecoder", "decode start");
        localObject2 = new int[2];
        localObject2[0] = paramInt1;
        localObject2[1] = paramInt2;
        if (this.hHh == null)
        {
          this.hHh = new byte[paramInt1 * paramInt2 * 3 / 2];
          this.hHi = new byte[paramInt1 * paramInt2];
          ab.d("MicroMsg.appbrand.ScanQBarDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(paramInt1 * paramInt2 * 3 / 2) });
          ab.d("MicroMsg.appbrand.ScanQBarDecoder", "onFrameData: %s, width: %s, height: %s cameraRotation:%d", new Object[] { paramArrayOfByte, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          paramInt1 = QbarNative.a(this.hHh, (int[])localObject2, paramArrayOfByte, paramInt1, paramInt2, 0, 0, paramInt1, paramInt2, paramInt3);
          if (paramInt1 == 0)
            break label294;
          ab.e("MicroMsg.appbrand.ScanQBarDecoder", "decode isProOk %s", new Object[] { Integer.valueOf(paramInt1) });
          bool = false;
          AppMethodBeat.o(130975);
          continue;
        }
        if (this.hHh.length == paramInt1 * paramInt2 * 3 / 2)
          continue;
        this.hHh = null;
        this.hHh = new byte[paramInt1 * paramInt2 * 3 / 2];
        this.hHi = null;
        this.hHi = new byte[paramInt1 * paramInt2];
        ab.d("MicroMsg.appbrand.ScanQBarDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(paramInt1 * paramInt2 * 3 / 2) });
      }
      label294: System.arraycopy(this.hHh, 0, this.hHi, 0, this.hHi.length);
      if (this.hHi != null)
        ab.d("MicroMsg.appbrand.ScanQBarDecoder", "tempGrayData.len: %d, width: %d, height: %d", new Object[] { Integer.valueOf(this.hHi.length), Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]) });
      if (this.hHi != null)
      {
        paramInt1 = this.hHf.z(this.hHi, localObject2[0], localObject2[1]);
        ab.i("MicroMsg.appbrand.ScanQBarDecoder", "after scanImage, result:%d", new Object[] { Integer.valueOf(paramInt1) });
      }
      while (true)
      {
        if (paramInt1 == 0)
          break label429;
        bool = false;
        AppMethodBeat.o(130975);
        break;
        paramInt1 = -1;
      }
      label429: paramArrayOfByte = this.hHf.dPR();
      if (paramArrayOfByte.size() == 0)
      {
        bool = false;
        AppMethodBeat.o(130975);
      }
      else
      {
        ab.i("MicroMsg.appbrand.ScanQBarDecoder", "GetResults size %d", new Object[] { Integer.valueOf(paramArrayOfByte.size()) });
        paramArrayOfByte = (QbarNative.QBarResult)paramArrayOfByte.get(0);
        ab.i("MicroMsg.appbrand.ScanQBarDecoder", "decode type:%s, sCharset: %s, data:%s", new Object[] { paramArrayOfByte.typeName, paramArrayOfByte.charset, paramArrayOfByte.data });
        if ((paramArrayOfByte != null) && (!bo.isNullOrNil(paramArrayOfByte.data)))
        {
          localObject2 = paramArrayOfByte.typeName;
          if ((((String)localObject2).equals("QR_CODE")) || (((String)localObject2).equals("WX_CODE")))
          {
            b(paramArrayOfByte.data, 1, paramArrayOfByte.rawData);
            bool = true;
            AppMethodBeat.o(130975);
          }
          else
          {
            b(paramArrayOfByte.data, 2, null);
            bool = true;
            AppMethodBeat.o(130975);
          }
        }
        else
        {
          bool = false;
          AppMethodBeat.o(130975);
        }
      }
    }
  }

  public final void init()
  {
    AppMethodBeat.i(130974);
    ab.i("MicroMsg.appbrand.ScanQBarDecoder", "init");
    Object localObject1 = this.type;
    while (true)
    {
      synchronized (this.cli)
      {
        if (this.hHg)
        {
          ab.i("MicroMsg.appbrand.ScanQBarDecoder", "the QbarDecoder is already init");
          AppMethodBeat.o(130974);
          return;
        }
        this.hHf = new QbarNative();
        ??? = new HashSet();
        if (((String)localObject1).contains("barcode"))
          ((Set)???).add(Integer.valueOf(1));
        if (((String)localObject1).contains("qrcode"))
          ((Set)???).add(Integer.valueOf(2));
        ((Set)???).add(Integer.valueOf(4));
        localObject1 = new int[((Set)???).size()];
        ??? = ((Set)???).iterator();
        i = 0;
        if (((Iterator)???).hasNext())
        {
          Integer localInteger = (Integer)((Iterator)???).next();
          if (localInteger == null)
            continue;
          localObject1[i] = localInteger.intValue();
          i++;
        }
      }
      int j = this.hHf.a(0, "ANY", "UTF-8", com.tencent.qbar.a.iy(ah.getContext()));
      com.tencent.qbar.a.a(this.hHf);
      int i = this.hHf.i(arrayOfInt, arrayOfInt.length);
      ab.i("MicroMsg.appbrand.ScanQBarDecoder", "QbarNative.Init = [%d], SetReaders = [%d], version = [%s], readers: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), QbarNative.getVersion(), Arrays.toString(arrayOfInt) });
      if ((j != 0) || (i != 0))
      {
        ab.e("MicroMsg.appbrand.ScanQBarDecoder", "QbarNative failed");
        sI();
        AppMethodBeat.o(130974);
        continue;
      }
      synchronized (this.cli)
      {
        this.hHg = true;
        AppMethodBeat.o(130974);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(130976);
    ab.i("MicroMsg.appbrand.ScanQBarDecoder", "release");
    sI();
    AppMethodBeat.o(130976);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.a.a
 * JD-Core Version:    0.6.2
 */