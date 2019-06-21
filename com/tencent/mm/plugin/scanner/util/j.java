package com.tencent.mm.plugin.scanner.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qbar.QbarNative;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class j extends b
{
  private Object cli;
  private byte[] hHh;
  private boolean isDecoding;
  private int outHeight;
  private int outWidth;
  public boolean ovx;
  private boolean qdM;
  private final int qih;
  private boolean qii;
  private final int qij;
  private int qik;
  private boolean qil;
  private volatile boolean qim;
  public volatile boolean qin;
  private long qio;
  private int quality;

  public j(b.a parama, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parama);
    AppMethodBeat.i(81452);
    this.qih = 25;
    this.quality = 50;
    this.qii = false;
    this.qij = 1;
    this.qik = 0;
    this.isDecoding = false;
    this.ovx = true;
    this.cli = new Object();
    this.qdM = false;
    this.quality = paramInt;
    this.ovx = paramBoolean2;
    this.qil = paramBoolean1;
    ab.i("MicroMsg.scanner.ScanImageDecoder", "quality = [%s], needRotate = [%s], ocrMode=[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
    AppMethodBeat.o(81452);
  }

  private static int Cg(int paramInt)
  {
    int i;
    if (paramInt > 0)
    {
      i = paramInt;
      if (paramInt <= 5);
    }
    else
    {
      i = 3;
    }
    return i;
  }

  private static int a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    AppMethodBeat.i(81456);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      paramInt1 = -1;
      AppMethodBeat.o(81456);
    }
    while (true)
    {
      return paramInt1;
      if (paramInt3 == 1)
      {
        paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 6, 140);
        AppMethodBeat.o(81456);
      }
      else if (paramInt3 == 2)
      {
        paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 8, 120);
        AppMethodBeat.o(81456);
      }
      else if (paramInt3 == 4)
      {
        paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 13, 80);
        AppMethodBeat.o(81456);
      }
      else if (paramInt3 == 5)
      {
        paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 15, 65);
        AppMethodBeat.o(81456);
      }
      else
      {
        paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 10, 100);
        AppMethodBeat.o(81456);
      }
    }
  }

  @TargetApi(8)
  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect)
  {
    AppMethodBeat.i(81453);
    boolean bool1;
    if (this.isDecoding)
    {
      ab.e("MicroMsg.scanner.ScanImageDecoder", "decode() is decoding, return false");
      bool1 = false;
      AppMethodBeat.o(81453);
    }
    label54: label61: label125: int i;
    label131: int j;
    while (true)
    {
      return bool1;
      this.isDecoding = true;
      if ((paramArrayOfByte == null) || (paramPoint == null) || (paramRect == null))
      {
        boolean bool2;
        if (paramArrayOfByte == null)
        {
          bool1 = true;
          if (paramPoint != null)
            break label125;
          bool2 = true;
          if (paramRect != null)
            break label131;
        }
        for (boolean bool3 = true; ; bool3 = false)
        {
          ab.e("MicroMsg.scanner.ScanImageDecoder", "decode() data null:[%s], resolution null:[%s], coverage null:[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          this.isDecoding = false;
          bool1 = false;
          AppMethodBeat.o(81453);
          break;
          bool1 = false;
          break label54;
          bool2 = false;
          break label61;
        }
      }
      try
      {
        if (this.qik <= 0)
        {
          this.qik += 1;
          this.isDecoding = false;
          bool1 = false;
          AppMethodBeat.o(81453);
        }
        else
        {
          synchronized (this.cli)
          {
            Rect localRect = new android/graphics/Rect;
            localRect.<init>();
            if ((com.tencent.mm.compatible.e.d.Lt()) || (!this.ovx))
            {
              i = paramRect.width();
              j = paramRect.height();
              localRect.left = paramRect.left;
              paramRect.right -= i % 4;
              localRect.top = paramRect.top;
              paramRect.bottom -= j % 4;
              if ((localRect.right <= localRect.left) || (localRect.bottom <= localRect.top))
              {
                this.isDecoding = false;
                bool1 = false;
                AppMethodBeat.o(81453);
              }
            }
            else
            {
              localRect.left = (paramPoint.x / 2 - paramRect.height() / 2);
              localRect.right = (paramPoint.x / 2 + paramRect.height() / 2);
              localRect.top = (paramPoint.y / 2 - paramRect.width() / 2);
              localRect.bottom = (paramPoint.y / 2 + paramRect.width() / 2);
              if (localRect.left < 0)
                localRect.left = 0;
              if (localRect.right > paramPoint.x - 1)
                localRect.right = (paramPoint.x - 1);
              if (localRect.top < 0)
                localRect.top = 0;
              if (localRect.bottom > paramPoint.y - 1)
                localRect.bottom = (paramPoint.y - 1);
              j = localRect.width() % 4;
              i = localRect.height() % 4;
              if (j != 0)
                localRect.right -= j;
              if (i != 0)
                localRect.bottom -= i;
              if ((localRect.right <= localRect.left) || (localRect.bottom <= localRect.top))
              {
                this.isDecoding = false;
                bool1 = false;
                AppMethodBeat.o(81453);
              }
              else
              {
                paramRect = new com/tencent/mm/plugin/scanner/util/c;
                paramRect.<init>(paramArrayOfByte, paramPoint.x, paramPoint.y, localRect);
                if ((paramRect.height == 0) || (paramRect.width == 0))
                {
                  this.isDecoding = false;
                  bool1 = false;
                  AppMethodBeat.o(81453);
                }
                else if (this.qdM)
                {
                  ab.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 1");
                  bool1 = false;
                  AppMethodBeat.o(81453);
                }
                else
                {
                  paramArrayOfByte = paramRect.chR();
                  if (paramArrayOfByte == null)
                  {
                    this.isDecoding = false;
                    bool1 = false;
                    AppMethodBeat.o(81453);
                  }
                  else if (!this.qii)
                  {
                    if ((!com.tencent.mm.compatible.e.d.Lt()) || (this.ovx))
                    {
                      j = a(localRect.height(), localRect.width(), this.qil, Cg(q.etc.erk));
                      ab.d("MicroMsg.scanner.ScanImageDecoder", "Focus init params1=[%s] params2=[%s] params3=[%s], focusThreshold=[%s]", new Object[] { Integer.valueOf(localRect.height()), Integer.valueOf(localRect.width()), Boolean.valueOf(this.qil), Integer.valueOf(q.etc.erk) });
                      if (j != -1)
                        break label953;
                      ab.e("MicroMsg.scanner.ScanImageDecoder", "error in Focus init = [%s]", new Object[] { Integer.valueOf(j) });
                      bool1 = false;
                      AppMethodBeat.o(81453);
                      continue;
                    }
                    j = a(localRect.width(), localRect.height(), this.qil, Cg(q.etc.erk));
                    ab.d("MicroMsg.scanner.ScanImageDecoder", "Focus init Landscape params1=[%s] params2=[%s] params3=[%s], focusThreshold=[%s]", new Object[] { Integer.valueOf(localRect.width()), Integer.valueOf(localRect.height()), Boolean.valueOf(this.qil), Integer.valueOf(q.etc.erk) });
                  }
                }
              }
            }
          }
        }
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.scanner.ScanImageDecoder", " Exception in decode(): [%s]", new Object[] { paramArrayOfByte.toString() });
        ab.printErrStackTrace("MicroMsg.scanner.ScanImageDecoder", paramArrayOfByte, "", new Object[0]);
      }
    }
    label953: label1754: 
    while (true)
    {
      this.qhk = null;
      this.isDecoding = false;
      bool1 = false;
      AppMethodBeat.o(81453);
      break;
      this.qii = true;
      paramPoint = new boolean[2];
      long l = bo.yz();
      if ((com.tencent.mm.compatible.e.d.Lt()) && (!this.ovx));
      for (bool1 = true; ; bool1 = false)
      {
        QbarNative.FocusPro(paramArrayOfByte, bool1, paramPoint);
        ab.d("MicroMsg.scanner.ScanImageDecoder", "is best:%s, need focus:%s, cost:%s", new Object[] { Boolean.valueOf(paramPoint[0]), Boolean.valueOf(paramPoint[1]), Long.valueOf(bo.az(l)) });
        this.qim = paramPoint[0];
        this.qin = paramPoint[1];
        if (this.qio == 0L)
          this.qio = System.currentTimeMillis();
        if ((!this.qin) && (System.currentTimeMillis() - this.qio > 9000L))
        {
          ab.d("MicroMsg.scanner.ScanImageDecoder", "reach focus interfal");
          this.qin = true;
          this.qio = System.currentTimeMillis();
        }
        if (this.qim != true)
          break label1754;
        if (!this.qdM)
          break label1145;
        ab.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 2");
        bool1 = false;
        AppMethodBeat.o(81453);
        break;
      }
      label1145: this.outWidth = paramRect.width;
      this.outHeight = paramRect.height;
      j = 0;
      if (!com.tencent.mm.compatible.e.d.Lt())
      {
        j = 1;
        this.outWidth = paramRect.height;
        this.outHeight = paramRect.width;
      }
      if (this.hHh == null)
      {
        this.hHh = new byte[this.outWidth * this.outHeight * 3 / 2];
        ab.v("MicroMsg.scanner.ScanImageDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(this.outWidth * this.outHeight * 3 / 2) });
      }
      while (true)
      {
        i = QbarNative.b(this.hHh, paramArrayOfByte, this.outWidth, this.outHeight);
        ab.d("MicroMsg.scanner.ScanImageDecoder", "decode() imgRet = [%s], outWidth = [%s], outHeight = [%s], imgRotate=[%s], imgScale=[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(this.outWidth), Integer.valueOf(this.outHeight), Integer.valueOf(j), Integer.valueOf(0) });
        if (i == 0)
          break label1427;
        this.qhk = null;
        this.isDecoding = false;
        bool1 = false;
        AppMethodBeat.o(81453);
        break;
        if (this.hHh.length != this.outWidth * this.outHeight * 3 / 2)
        {
          this.hHh = null;
          this.hHh = new byte[this.outWidth * this.outHeight * 3 / 2];
          ab.v("MicroMsg.scanner.ScanImageDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(this.outWidth * this.outHeight * 3 / 2) });
        }
      }
      if (this.qdM)
      {
        ab.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 3");
        bool1 = false;
        AppMethodBeat.o(81453);
        break;
      }
      if (com.tencent.mm.compatible.util.d.iW(8))
      {
        paramArrayOfByte = new com/tencent/mm/plugin/scanner/util/j$1;
        paramArrayOfByte.<init>(this);
        com.tencent.mm.compatible.a.a.a(8, paramArrayOfByte);
      }
      while (true)
      {
        ab.i("MicroMsg.scanner.ScanImageDecoder", "decode() finish greyData.length = [%s]", new Object[] { Integer.valueOf(this.qhk.length) });
        this.isDecoding = false;
        bool1 = true;
        AppMethodBeat.o(81453);
        break;
        ab.d("MicroMsg.scanner.ScanImageDecoder", "decode() compress jpeg by PlanarYUVLuminanceSource");
        paramPoint = new com/tencent/mm/plugin/scanner/util/c;
        paramRect = this.hHh;
        i = this.outWidth;
        j = this.outHeight;
        paramArrayOfByte = new android/graphics/Rect;
        paramArrayOfByte.<init>(0, 0, this.outWidth, this.outHeight);
        paramPoint.<init>(paramRect, i, j, paramArrayOfByte);
        paramRect = new int[paramPoint.width * paramPoint.height];
        QbarNative.a(paramPoint.cLa, paramRect, paramPoint.qhr, paramPoint.qhs, paramPoint.left, paramPoint.top, paramPoint.width, paramPoint.height);
        QbarNative.nativeRelease();
        paramArrayOfByte = Bitmap.createBitmap(paramPoint.width, paramPoint.height, Bitmap.Config.ARGB_8888);
        paramArrayOfByte.setPixels(paramRect, 0, paramPoint.width, 0, 0, paramPoint.width, paramPoint.height);
        paramPoint = new java/io/ByteArrayOutputStream;
        paramPoint.<init>();
        paramArrayOfByte.compress(Bitmap.CompressFormat.JPEG, this.quality, paramPoint);
        this.qhk = paramPoint.toByteArray();
        paramPoint.close();
        if (ae.gin)
        {
          j = this.quality;
          paramPoint = Bitmap.CompressFormat.JPEG;
          paramRect = new java/lang/StringBuilder;
          paramRect.<init>();
          com.tencent.mm.sdk.platformtools.d.a(paramArrayOfByte, j, paramPoint, h.getExternalStorageDirectory().getAbsolutePath() + "/_scanImage_.JPEG", false);
        }
        paramArrayOfByte.recycle();
      }
    }
  }

  public final void chP()
  {
    AppMethodBeat.i(81455);
    if (this.qii)
      sI();
    this.isDecoding = false;
    this.qdM = false;
    this.qii = false;
    AppMethodBeat.o(81455);
  }

  public final void sI()
  {
    AppMethodBeat.i(81454);
    ab.d("MicroMsg.scanner.ScanImageDecoder", "releaseDecoder start");
    this.qdM = true;
    if (this.cli != null);
    synchronized (this.cli)
    {
      if (this.qii)
      {
        ab.d("sizepara", "ImgProcessScan.FocusRelease() = [%s]", new Object[] { Integer.valueOf(0) });
        this.qii = false;
        ab.d("MicroMsg.scanner.ScanImageDecoder", "ImgProcessScan.Release() = [%s]", new Object[] { Integer.valueOf(QbarNative.FocusRelease()) });
      }
      this.hHh = null;
      c.chQ();
      ab.d("MicroMsg.scanner.ScanImageDecoder", "releaseDecoder done");
      AppMethodBeat.o(81454);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.j
 * JD-Core Version:    0.6.2
 */