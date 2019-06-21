package com.tencent.mm.plugin.u.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.plugin.scanner.util.c;
import com.tencent.mm.plugin.scanner.util.f;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.QbarNative.QBarReportMsg;
import com.tencent.qbar.QbarNative.QBarResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a
{
  Set<Integer> cJV;
  private Object cli;
  private boolean hHg;
  boolean mCancelled;
  private QbarNative pAk;
  a.a pAl;
  long pAm;

  public a()
  {
    AppMethodBeat.i(80742);
    this.pAk = new QbarNative();
    this.cli = new Object();
    this.hHg = false;
    this.pAl = null;
    this.pAm = 0L;
    this.mCancelled = false;
    AppMethodBeat.o(80742);
  }

  private d Q(Bitmap paramBitmap)
  {
    AppMethodBeat.i(80745);
    paramBitmap = new f(paramBitmap);
    if ((paramBitmap.chS() == null) || (paramBitmap.width <= 0) || (paramBitmap.height <= 0))
    {
      paramBitmap = null;
      AppMethodBeat.o(80745);
    }
    while (true)
    {
      return paramBitmap;
      paramBitmap = a(paramBitmap, this.cJV);
      AppMethodBeat.o(80745);
    }
  }

  private d a(f.a parama, Set<Integer> paramSet)
  {
    AppMethodBeat.i(80749);
    d locald = new d();
    Object localObject = this.cli;
    if (paramSet != null);
    try
    {
      if ((!paramSet.isEmpty()) && (!i(paramSet)))
      {
        sI();
        parama = null;
      }
      label156: LinkedList localLinkedList1;
      label395: LinkedList localLinkedList2;
      while (true)
      {
        return parama;
        if (!this.hHg)
        {
          paramSet = new java/util/HashSet;
          paramSet.<init>();
          paramSet.add(Integer.valueOf(2));
          paramSet.add(Integer.valueOf(1));
          paramSet.add(Integer.valueOf(4));
          paramSet.add(Integer.valueOf(3));
        }
        for (boolean bool = i(paramSet); ; bool = this.hHg)
        {
          if (bool)
            break label156;
          sI();
          parama = null;
          AppMethodBeat.o(80749);
          break;
        }
        ab.d("MicroMsg.scanner.DecodeFile", "directScanQRCodeImg, lumSrc==null:%b", new Object[] { Boolean.FALSE });
        if (parama.chS() != null)
          ab.i("MicroMsg.scanner.DecodeFile", "directScanQRCodeImg, lumSrc.getMatrix.length: %d, lumSrc.getWidth: %d, lumSrc.getHeight: %d", new Object[] { Integer.valueOf(parama.chS().length), Integer.valueOf(parama.width), Integer.valueOf(parama.height) });
        long l1 = System.currentTimeMillis();
        if ((parama.chS() != null) && (parama.width * parama.height == parama.chS().length))
          m.pZK.fc(parama.width, parama.height);
        long l2;
        for (i = this.pAk.z(parama.chS(), parama.width, parama.height); ; i = -1)
        {
          l2 = System.currentTimeMillis();
          ab.d("MicroMsg.scanner.DecodeFile", "directScanQRCodeImg decode ScanImage %s, cost: %s", new Object[] { Integer.valueOf(i), Long.valueOf(l2 - l1) });
          m.pZK.jH(l2 - l1);
          m.pZK.cgI();
          if (i == 0)
            break label395;
          paramSet = new java/util/ArrayList;
          paramSet.<init>();
          parama = new java/util/ArrayList;
          parama.<init>();
          this.pAk.t(paramSet, parama);
          m.pZK.qab = paramSet;
          parama = null;
          AppMethodBeat.o(80749);
          break;
        }
        parama = v.Zp().nV("basescanui@datacenter");
        if (parama != null)
        {
          i = parama.getInt("key_basescanui_screen_x", 0);
          int j = parama.getInt("key_basescanui_screen_y", 0);
          parama = this.pAk;
          parama.SetCenterCoordinate(i, j, com.tencent.mm.bz.a.gd(ah.getContext()), com.tencent.mm.bz.a.ge(ah.getContext()), parama.Aqx);
          ab.i("MicroMsg.scanner.DecodeFile", "directScanQRCodeImg x=%d,y=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        }
        m.pZK.cgH();
        m.pZK.jI(l2 - l1);
        localLinkedList1 = new java/util/LinkedList;
        localLinkedList1.<init>();
        localLinkedList2 = new java/util/LinkedList;
        localLinkedList2.<init>();
        this.pAk.s(localLinkedList1, localLinkedList2);
        i = localLinkedList1.size();
        if (i != 0)
          break;
        parama = null;
        AppMethodBeat.o(80749);
      }
      ab.i("MicroMsg.scanner.DecodeFile", "GetResults size %d", new Object[] { Integer.valueOf(localLinkedList1.size()) });
      QbarNative.QBarResult localQBarResult = (QbarNative.QBarResult)localLinkedList1.get(0);
      paramSet = null;
      if (!bo.ek(localLinkedList2))
        paramSet = (QbarNative.QBarReportMsg)localLinkedList2.get(0);
      parama = "";
      String str;
      if (localQBarResult != null)
      {
        if (!bo.isNullOrNil(localQBarResult.data))
        {
          str = localQBarResult.typeName;
          if ((!str.equals("QR_CODE")) && (!str.equals("WX_CODE")))
            break label755;
          parama = localQBarResult.data;
        }
        label673: locald.result = parama;
        locald.rawData = localQBarResult.rawData;
        locald.cvn = r.Ws(localQBarResult.typeName);
        if (paramSet == null)
          break label790;
      }
      label790: for (int i = paramSet.qrcodeVersion; ; i = 0)
      {
        locald.cvo = i;
        m.pZK.a(localQBarResult.typeName, parama, localQBarResult.charset, paramSet, localLinkedList1.size(), localLinkedList2);
        AppMethodBeat.o(80749);
        parama = locald;
        break;
        label755: parama = new java/lang/StringBuilder;
        parama.<init>();
        parama = str + "," + localQBarResult.data;
        break label673;
      }
    }
    catch (Exception paramSet)
    {
      while (true)
      {
        parama = new java/lang/StringBuilder;
        parama.<init>(" Exception in directScanQRCodeImg() ");
        ab.e("MicroMsg.scanner.DecodeFile", paramSet.getMessage());
        ab.printErrStackTrace("MicroMsg.scanner.DecodeFile", paramSet, "", new Object[0]);
        AppMethodBeat.o(80749);
        parama = locald;
      }
    }
    finally
    {
      AppMethodBeat.o(80749);
    }
    throw parama;
  }

  private int h(Set<Integer> arg1)
  {
    int i = 0;
    AppMethodBeat.i(80746);
    int[] arrayOfInt;
    if ((??? != null) && (!???.isEmpty()))
    {
      arrayOfInt = new int[???.size()];
      ??? = ???.iterator();
      i = 0;
      while (???.hasNext())
      {
        Integer localInteger = (Integer)???.next();
        if (localInteger != null)
        {
          arrayOfInt[i] = localInteger.intValue();
          i++;
        }
      }
      ab.i("MicroMsg.scanner.DecodeFile", "QBarNative.SetReaders, readers:%s", new Object[] { Arrays.toString(arrayOfInt) });
    }
    while (true)
    {
      synchronized (this.cli)
      {
        i = this.pAk.i(arrayOfInt, arrayOfInt.length);
        AppMethodBeat.o(80746);
        return i;
      }
      AppMethodBeat.o(80746);
    }
  }

  private boolean i(Set<Integer> paramSet)
  {
    boolean bool = false;
    AppMethodBeat.i(80747);
    if ((!this.hHg) && (paramSet != null) && (!paramSet.isEmpty()))
    {
      int i = this.pAk.a(1, "ANY", "UTF-8", com.tencent.qbar.a.iy(ah.getContext()));
      m.pZK.qaa = paramSet.contains(Integer.valueOf(3));
      int j = h(paramSet);
      ab.i("MicroMsg.scanner.DecodeFile", "QbarNative.Init = [%s], SetReaders = [%s], version = [%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), QbarNative.getVersion() });
      if ((i == 0) && (j == 0))
        this.hHg = true;
    }
    else
    {
      bool = this.hHg;
      AppMethodBeat.o(80747);
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.scanner.DecodeFile", "QbarNative failed, releaseDecoder 1");
      AppMethodBeat.o(80747);
    }
  }

  private void sI()
  {
    AppMethodBeat.i(80748);
    ab.d("MicroMsg.scanner.DecodeFile", "releaseDecoder() start, hasInitQBar = %s", new Object[] { Boolean.valueOf(this.hHg) });
    synchronized (this.cli)
    {
      if (this.hHg)
      {
        int i = this.pAk.release();
        this.pAk = null;
        this.hHg = false;
        ab.d("MicroMsg.scanner.DecodeFile", "QbarNative.Release() = [%s]", new Object[] { Integer.valueOf(i) });
      }
      c.chQ();
      AppMethodBeat.o(80748);
      return;
    }
  }

  public final d P(Bitmap paramBitmap)
  {
    AppMethodBeat.i(80744);
    long l = SystemClock.elapsedRealtime();
    paramBitmap = Q(paramBitmap);
    m.pZK.cgJ();
    ab.d("MicroMsg.scanner.DecodeFile", "decode once time(ms):".concat(String.valueOf(SystemClock.elapsedRealtime() - l)));
    sI();
    AppMethodBeat.o(80744);
    return paramBitmap;
  }

  public final d Vu(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(80743);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.scanner.DecodeFile", "in decodeFile, file == null");
      AppMethodBeat.o(80743);
    }
    for (paramString = localObject3; ; paramString = (String)localObject2)
    {
      while (true)
      {
        return paramString;
        BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.d.amj(paramString);
        if (localOptions != null)
        {
          localOptions.inJustDecodeBounds = false;
          localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
          if (localOptions.outWidth * localOptions.outHeight * 8 * 4L > 268435456L)
          {
            ab.i("MicroMsg.scanner.DecodeFile", "initial width %d, initial height %d", new Object[] { Integer.valueOf(localOptions.outWidth), Integer.valueOf(localOptions.outHeight) });
            localOptions.inSampleSize = 4;
          }
        }
        if (!this.mCancelled)
        {
          localObject2 = localObject1;
          try
          {
            paramString = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString, localOptions);
            if (paramString == null)
            {
              localObject2 = localObject1;
              ab.e("MicroMsg.scanner.DecodeFile", "decode bitmap is null!");
              AppMethodBeat.o(80743);
              paramString = localObject3;
            }
            else
            {
              localObject2 = localObject1;
              paramString = P(paramString);
              if (paramString == null);
              for (boolean bool = true; ; bool = false)
              {
                localObject2 = paramString;
                ab.d("MicroMsg.scanner.DecodeFile", "decode result==null:%b", new Object[] { Boolean.valueOf(bool) });
                localObject2 = paramString;
                if (paramString == null)
                  break label272;
                localObject2 = paramString;
                bool = bo.isNullOrNil(paramString.result);
                localObject2 = paramString;
                if (bool)
                  break label272;
                AppMethodBeat.o(80743);
                break;
              }
            }
          }
          catch (OutOfMemoryError paramString)
          {
            ab.e("MicroMsg.scanner.DecodeFile", "OutOfMemoryError, e: %s", new Object[] { paramString.getMessage() });
          }
        }
      }
      label272: AppMethodBeat.o(80743);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.a
 * JD-Core Version:    0.6.2
 */