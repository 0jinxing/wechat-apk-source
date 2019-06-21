package com.tencent.mm.plugin.scanner.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.QbarNative.QBarReportMsg;
import com.tencent.qbar.QbarNative.QBarResult;
import com.tencent.qbar.QbarNative.QBarZoomInfo;
import com.tencent.qbar.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class d extends b
{
  private Object cli;
  private QbarNative hHf;
  private boolean hHg;
  private byte[] hHh;
  private byte[] hHi;
  public volatile boolean isDecoding;
  public boolean ovx;
  public boolean qdM;
  public Set<Integer> qfh;
  public int qht;

  public d(b.a parama, int paramInt, boolean paramBoolean)
  {
    super(parama);
    AppMethodBeat.i(81381);
    this.hHg = false;
    this.isDecoding = false;
    this.ovx = true;
    this.qdM = false;
    this.cli = new Object();
    this.hHf = new QbarNative();
    this.qht = paramInt;
    this.ovx = paramBoolean;
    AppMethodBeat.o(81381);
  }

  private static Set<Integer> Ca(int paramInt)
  {
    AppMethodBeat.i(81387);
    HashSet localHashSet = new HashSet();
    if (paramInt == 1)
    {
      localHashSet.add(Integer.valueOf(2));
      localHashSet.add(Integer.valueOf(4));
      localHashSet.add(Integer.valueOf(5));
      localHashSet.add(Integer.valueOf(3));
    }
    while (true)
    {
      AppMethodBeat.o(81387);
      return localHashSet;
      if (paramInt == 2)
      {
        localHashSet.add(Integer.valueOf(1));
        localHashSet.add(Integer.valueOf(4));
        localHashSet.add(Integer.valueOf(5));
      }
      else if (paramInt == 0)
      {
        localHashSet.add(Integer.valueOf(2));
        localHashSet.add(Integer.valueOf(1));
        localHashSet.add(Integer.valueOf(4));
        localHashSet.add(Integer.valueOf(5));
        localHashSet.add(Integer.valueOf(3));
      }
      else if (paramInt == 3)
      {
        localHashSet.add(Integer.valueOf(2));
        localHashSet.add(Integer.valueOf(3));
      }
    }
  }

  private byte[] a(byte[] paramArrayOfByte, Point paramPoint1, Rect paramRect, Point paramPoint2)
  {
    while (true)
    {
      long l;
      Object localObject;
      try
      {
        AppMethodBeat.i(81382);
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
        {
          ab.w("MicroMsg.scanner.QBarDecoder", "prepareGrayData , data is null");
          paramArrayOfByte = null;
          AppMethodBeat.o(81382);
          return paramArrayOfByte;
        }
        ab.i("MicroMsg.scanner.QBarDecoder", "resolution %s, coverage %s", new Object[] { paramPoint1, paramRect });
        l = System.currentTimeMillis();
        localObject = new android/graphics/Rect;
        ((Rect)localObject).<init>();
        if ((com.tencent.mm.compatible.e.d.Lt()) || (!this.ovx))
        {
          i = paramRect.width();
          j = paramRect.height();
          ((Rect)localObject).left = paramRect.left;
          ((Rect)localObject).right = (paramRect.right - i % 4);
          ((Rect)localObject).top = paramRect.top;
          ((Rect)localObject).bottom = (paramRect.bottom - j % 4);
          if ((((Rect)localObject).right > ((Rect)localObject).left) && (((Rect)localObject).bottom > ((Rect)localObject).top))
            break label420;
          paramArrayOfByte = null;
          AppMethodBeat.o(81382);
          continue;
        }
      }
      finally
      {
      }
      ((Rect)localObject).left = (paramPoint1.x / 2 - paramRect.height() / 2);
      ((Rect)localObject).right = (paramPoint1.x / 2 + paramRect.height() / 2);
      ((Rect)localObject).top = (paramPoint1.y / 2 - paramRect.width() / 2);
      ((Rect)localObject).bottom = (paramPoint1.y / 2 + paramRect.width() / 2);
      if (((Rect)localObject).left < 0)
        ((Rect)localObject).left = 0;
      if (((Rect)localObject).right > paramPoint1.x - 1)
        ((Rect)localObject).right = (paramPoint1.x - 1);
      if (((Rect)localObject).top < 0)
        ((Rect)localObject).top = 0;
      if (((Rect)localObject).bottom > paramPoint1.y - 1)
        ((Rect)localObject).bottom = (paramPoint1.y - 1);
      int i = ((Rect)localObject).width() % 4;
      int j = ((Rect)localObject).height() % 4;
      if (i != 0)
        ((Rect)localObject).right -= i;
      if (j != 0)
        ((Rect)localObject).bottom -= j;
      if ((((Rect)localObject).right <= ((Rect)localObject).left) || (((Rect)localObject).bottom <= ((Rect)localObject).top))
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(81382);
      }
      else
      {
        label420: ab.i("MicroMsg.scanner.QBarDecoder", "targetRect %s", new Object[] { localObject });
        paramRect = new com/tencent/mm/plugin/scanner/util/c;
        paramRect.<init>(paramArrayOfByte, paramPoint1.x, paramPoint1.y, (Rect)localObject);
        paramPoint2.x = paramRect.width;
        paramPoint2.y = paramRect.height;
        j = 0;
        if (!com.tencent.mm.compatible.e.d.Lt())
        {
          j = 90;
          paramPoint2.x = paramRect.height;
          paramPoint2.y = paramRect.width;
        }
        ab.d("MicroMsg.scanner.QBarDecoder", "rotate angle: ".concat(String.valueOf(j)));
        if (this.hHh == null)
        {
          this.hHh = new byte[paramRect.width * paramRect.height * 3 / 2];
          this.hHi = new byte[paramRect.width * paramRect.height];
          ab.d("MicroMsg.scanner.QBarDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(paramRect.width * paramRect.height * 3 / 2) });
        }
        while (true)
        {
          localObject = this.hHh;
          int k = paramPoint2.x;
          i = paramPoint2.y;
          int m = paramPoint1.x;
          int n = paramPoint1.y;
          int i1 = paramRect.left;
          int i2 = paramRect.top;
          int i3 = paramRect.width;
          int i4 = paramRect.height;
          j = QbarNative.a((byte[])localObject, new int[] { k, i }, paramArrayOfByte, m, n, i1, i2, i3, i4, j);
          if (j == 0)
            break label813;
          ab.e("MicroMsg.scanner.QBarDecoder", "decode pro_result %s", new Object[] { Integer.valueOf(j) });
          paramArrayOfByte = null;
          AppMethodBeat.o(81382);
          break;
          if (this.hHh.length != paramRect.width * paramRect.height * 3 / 2)
          {
            this.hHh = null;
            this.hHh = new byte[paramRect.width * paramRect.height * 3 / 2];
            this.hHi = null;
            this.hHi = new byte[paramRect.width * paramRect.height];
            ab.d("MicroMsg.scanner.QBarDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(paramRect.width * paramRect.height * 3 / 2) });
          }
        }
        label813: System.arraycopy(this.hHh, 0, this.hHi, 0, this.hHi.length);
        ab.d("MicroMsg.scanner.QBarDecoder", "decode, rotate and gray, cost:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        paramArrayOfByte = this.hHi;
        AppMethodBeat.o(81382);
      }
    }
  }

  private boolean b(byte[] paramArrayOfByte, Point paramPoint)
  {
    AppMethodBeat.i(81386);
    long l1 = System.currentTimeMillis();
    ab.i("MicroMsg.scanner.QBarDecoder", "decode() start");
    boolean bool;
    if (this.isDecoding)
    {
      ab.e("MicroMsg.scanner.QBarDecoder", "is decoding, return false");
      bool = false;
      AppMethodBeat.o(81386);
    }
    while (true)
    {
      return bool;
      if (this.qdM)
      {
        ab.w("MicroMsg.scanner.QBarDecoder", "isReleasing, return false 1");
        bool = false;
        AppMethodBeat.o(81386);
      }
      else
      {
        if (paramArrayOfByte != null)
          break;
        ab.e("MicroMsg.scanner.QBarDecoder", "wrong args");
        bool = false;
        AppMethodBeat.o(81386);
      }
    }
    while (true)
    {
      synchronized (this.cli)
      {
        while (true)
        {
          this.isDecoding = true;
          this.qhl = null;
          this.cvo = 0;
          this.cvn = 0;
          m.pZK.cgI();
          try
          {
            i = this.qht;
            if (!this.hHg)
            {
              localObject2 = Ca(i);
              if ((!this.hHg) && (!((Set)localObject2).isEmpty()))
              {
                int j = this.hHf.a(0, "ANY", "UTF-8", a.iy(ah.getContext()));
                a.a(this.hHf);
                m.pZK.qaa = ((Set)localObject2).contains(Integer.valueOf(3));
                i = h((Set)localObject2);
                ab.i("MicroMsg.scanner.QBarDecoder", "QbarNative.Init = [%s], SetReaders = [%s], version = [%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), QbarNative.getVersion() });
                if ((j == 0) && (i == 0))
                  this.hHg = true;
              }
              else
              {
                bool = this.hHg;
              }
            }
            while (true)
            {
              if (bool)
                break label318;
              sI();
              this.isDecoding = false;
              bool = false;
              AppMethodBeat.o(81386);
              break;
              ab.e("MicroMsg.scanner.QBarDecoder", "QbarNative failed, releaseDecoder 1");
              bool = false;
              continue;
              bool = this.hHg;
            }
            label318: long l2 = System.currentTimeMillis();
            ab.i("MicroMsg.scanner.QBarDecoder", "data len %d, image size %s", new Object[] { Integer.valueOf(paramArrayOfByte.length), paramPoint });
            i = this.hHf.z(paramArrayOfByte, paramPoint.x, paramPoint.y);
            l2 = System.currentTimeMillis() - l2;
            Object localObject2 = this.hHf;
            paramArrayOfByte = new com/tencent/qbar/QbarNative$QBarZoomInfo;
            paramArrayOfByte.<init>();
            ((QbarNative)localObject2).GetZoomInfo(paramArrayOfByte, ((QbarNative)localObject2).Aqx);
            ab.i("MicroMsg.scanner.QBarDecoder", "after scanImage, result:%d, isZoom %b, zoomFactor %f", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramArrayOfByte.isZoom), Float.valueOf(paramArrayOfByte.zoomFactor) });
            if ((i < 0) && (paramArrayOfByte.isZoom) && (this.qhj != null))
            {
              localObject2 = new android/os/Bundle;
              ((Bundle)localObject2).<init>();
              ((Bundle)localObject2).putInt("zoom_action", 6);
              ((Bundle)localObject2).putInt("zoom_type", 1);
              ((Bundle)localObject2).putInt("zoom_scale", (int)(paramArrayOfByte.zoomFactor * 100.0F));
              this.qhj.K((Bundle)localObject2);
            }
            m.pZK.fc(paramPoint.x, paramPoint.y);
            m.pZK.cgJ();
            long l3 = System.currentTimeMillis();
            m.pZK.jH(l2);
            ab.d("MicroMsg.scanner.QBarDecoder", "decode ScanImage %s, cost:%d", new Object[] { Integer.valueOf(i), Long.valueOf(l3 - l1) });
            if (i != 0)
            {
              localObject2 = m.pZK;
              paramArrayOfByte = new java/util/ArrayList;
              paramArrayOfByte.<init>();
              paramPoint = new java/util/ArrayList;
              paramPoint.<init>();
              this.hHf.t(paramArrayOfByte, paramPoint);
              ((m)localObject2).qab = paramArrayOfByte;
              this.isDecoding = false;
              bool = false;
              AppMethodBeat.o(81386);
              break;
            }
            m.pZK.cgH();
            m.pZK.jI(l2);
            paramPoint = new java/util/LinkedList;
            paramPoint.<init>();
            localObject2 = new java/util/LinkedList;
            ((LinkedList)localObject2).<init>();
            this.hHf.s(paramPoint, (List)localObject2);
            QbarNative.QBarResult localQBarResult;
            String str;
            if (paramPoint.size() != 0)
            {
              localQBarResult = (QbarNative.QBarResult)paramPoint.get(0);
              ab.i("MicroMsg.scanner.QBarDecoder", "decode size %d, type:%s, sCharset: %s, data:%s", new Object[] { Integer.valueOf(paramPoint.size()), localQBarResult.typeName, localQBarResult.charset, localQBarResult.data });
              paramArrayOfByte = null;
              if (!bo.ek((List)localObject2))
                paramArrayOfByte = (QbarNative.QBarReportMsg)((List)localObject2).get(0);
              if (localQBarResult != null)
                if (!bo.isNullOrNil(localQBarResult.data))
                {
                  str = localQBarResult.typeName;
                  if ((!str.equals("QR_CODE")) && (!str.equals("WX_CODE")))
                    break label964;
                  this.qhl = localQBarResult.data;
                }
            }
            for (qhm = 1; ; qhm = 2)
            {
              this.cvn = r.Ws(localQBarResult.typeName);
              if (paramArrayOfByte == null)
                break label1037;
              i = paramArrayOfByte.qrcodeVersion;
              this.cvo = i;
              this.rawData = localQBarResult.rawData;
              m.pZK.a(localQBarResult.typeName, this.qhl, localQBarResult.charset, paramArrayOfByte, paramPoint.size(), (List)localObject2);
              this.isDecoding = false;
              this.qhn = (System.currentTimeMillis() - l1);
              ab.i("MicroMsg.scanner.QBarDecoder", "decode() finish, resultText = [%s], cost:%d", new Object[] { this.qhl, Long.valueOf(this.qhn) });
              if (bo.isNullOrNil(this.qhl))
                break label1043;
              bool = true;
              AppMethodBeat.o(81386);
              break;
              label964: StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              this.qhl = (str + "," + localQBarResult.data);
            }
          }
          catch (Exception paramArrayOfByte)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.scanner.QBarDecoder", paramArrayOfByte, "decodeInternal error", new Object[0]);
          }
        }
      }
      label1037: int i = 0;
      continue;
      label1043: bool = false;
    }
  }

  private int h(Set<Integer> arg1)
  {
    int i = 0;
    AppMethodBeat.i(81389);
    int[] arrayOfInt;
    int j;
    if ((??? != null) && (!???.isEmpty()))
    {
      arrayOfInt = new int[???.size()];
      ??? = ???.iterator();
      j = 0;
      while (???.hasNext())
      {
        Integer localInteger = (Integer)???.next();
        if (localInteger != null)
        {
          arrayOfInt[j] = localInteger.intValue();
          j++;
        }
      }
      ab.i("MicroMsg.scanner.QBarDecoder", "QBarNative.SetReaders, readers:%s", new Object[] { Arrays.toString(arrayOfInt) });
    }
    while (true)
    {
      synchronized (this.cli)
      {
        if (this.hHf != null)
        {
          j = this.hHf.i(arrayOfInt, arrayOfInt.length);
          AppMethodBeat.o(81389);
          return j;
        }
        AppMethodBeat.o(81389);
        j = i;
      }
      AppMethodBeat.o(81389);
      j = i;
    }
  }

  public final void a(byte[] paramArrayOfByte, Point paramPoint)
  {
    AppMethodBeat.i(81385);
    com.tencent.mm.sdk.g.d.f(new d.1(this, paramArrayOfByte, paramPoint), "scan_decode");
    AppMethodBeat.o(81385);
  }

  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect)
  {
    AppMethodBeat.i(81383);
    Point localPoint = new Point();
    paramArrayOfByte = a(paramArrayOfByte, paramPoint, paramRect, localPoint);
    boolean bool;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      bool = b(paramArrayOfByte, localPoint);
      AppMethodBeat.o(81383);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(81383);
    }
  }

  public final byte[] a(byte[] paramArrayOfByte, Point paramPoint1, int paramInt, Rect paramRect, Point paramPoint2)
  {
    try
    {
      AppMethodBeat.i(81384);
      byte[] arrayOfByte1 = paramArrayOfByte;
      if (270 == paramInt)
      {
        byte[] arrayOfByte2 = new byte[paramArrayOfByte.length];
        QbarNative.a(arrayOfByte2, paramArrayOfByte, paramPoint1.x, paramPoint1.y);
        arrayOfByte1 = new byte[paramArrayOfByte.length];
        QbarNative.a(arrayOfByte1, arrayOfByte2, paramPoint1.y, paramPoint1.x);
        QbarNative.nativeRelease();
      }
      paramArrayOfByte = a(arrayOfByte1, paramPoint1, paramRect, paramPoint2);
      AppMethodBeat.o(81384);
      return paramArrayOfByte;
    }
    finally
    {
    }
    throw paramArrayOfByte;
  }

  public final void chP()
  {
    AppMethodBeat.i(81391);
    if (this.hHg)
    {
      sI();
      this.hHg = false;
    }
    this.qdM = false;
    this.isDecoding = false;
    this.hHf = new QbarNative();
    AppMethodBeat.o(81391);
  }

  public final void chT()
  {
    AppMethodBeat.i(81388);
    if (this.hHg)
    {
      Set localSet1 = this.qfh;
      Set localSet2;
      if (localSet1 != null)
      {
        localSet2 = localSet1;
        if (!localSet1.isEmpty());
      }
      else
      {
        localSet2 = Ca(this.qht);
      }
      h(localSet2);
    }
    AppMethodBeat.o(81388);
  }

  public final void sI()
  {
    AppMethodBeat.i(81390);
    ab.d("MicroMsg.scanner.QBarDecoder", "releaseDecoder() start, hasInitQBar = %s", new Object[] { Boolean.valueOf(this.hHg) });
    this.qdM = true;
    synchronized (this.cli)
    {
      if (this.hHg)
      {
        int i = this.hHf.release();
        this.hHf = null;
        this.hHg = false;
        ab.d("MicroMsg.scanner.QBarDecoder", "QbarNative.Release() = [%s]", new Object[] { Integer.valueOf(i) });
      }
      c.chQ();
      AppMethodBeat.o(81390);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.d
 * JD-Core Version:    0.6.2
 */