package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends f
{
  private boolean flo;

  public i(c.a parama, a parama1)
  {
    super(parama, parama1);
    AppMethodBeat.i(36754);
    this.flo = false;
    h.pYm.a(150L, 10L, 1L, true);
    AppMethodBeat.o(36754);
  }

  public final boolean Dj(int paramInt)
  {
    AppMethodBeat.i(36756);
    Object localObject1;
    Object localObject2;
    boolean bool;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    BitmapFactory.Options localOptions;
    label231: int i;
    if ((this.qOa.qFK != null) && (this.qOa.qFK.size() > 0))
    {
      localObject1 = (com.tencent.mm.plugin.sns.data.e)this.qOa.qFK.get(paramInt);
      localObject2 = (bau)this.qOa.qFU.get(paramInt);
      if ((localObject1 == null) || (localObject2 == null))
      {
        ab.e("MicroMsg.SnsDownloadThumb", "decodeElement or media is null.");
        bool = false;
        AppMethodBeat.o(36756);
        return bool;
      }
      ab.i("MicroMsg.SnsDownloadThumb", "In processGroupDownloadSuccessData ing, %d.", new Object[] { Integer.valueOf(paramInt) });
      localObject3 = new StringBuilder();
      localObject4 = ((bau)localObject2).Id;
      localObject5 = an.fZ(af.getAccSnsPath(), (String)localObject4) + com.tencent.mm.plugin.sns.data.i.n((bau)localObject2);
      localObject4 = com.tencent.mm.plugin.sns.data.i.e((bau)localObject2);
      this.flo = s.Zj((String)localObject5);
      if (this.qOB)
        this.flo = true;
      if (this.flo)
        h.pYm.a(22L, 64L, 1L, true);
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeFile((String)localObject5, localOptions);
      if (localOptions.outMimeType == null)
        break label1171;
      localObject3 = localOptions.outMimeType.toLowerCase();
      if ((localOptions.outMimeType == null) || (bo.isNullOrNil(localOptions.outMimeType)))
        h.pYm.a(150L, 35L, 1L, true);
      i = -1;
      if ((!((String)localObject3).contains("jpg")) && (!((String)localObject3).contains("jpeg")))
        break label1203;
      int j = MMNativeJpeg.queryQuality((String)localObject5);
      i = j;
      if (j != 0)
        break label1203;
      i = -1;
    }
    label1171: label1179: label1203: 
    while (true)
    {
      long l1 = com.tencent.mm.vfs.e.asZ((String)localObject5);
      if (l1 <= 0L)
        h.pYm.a(150L, 23L, 1L, true);
      long l2 = bo.yz();
      localObject3 = com.tencent.mm.plugin.sns.data.i.i((bau)localObject2);
      StringBuilder localStringBuilder1 = new StringBuilder();
      String str = ((bau)localObject2).Id;
      com.tencent.mm.vfs.e.y((String)localObject5, an.fZ(af.getAccSnsPath(), str) + (String)localObject3);
      StringBuilder localStringBuilder2 = new StringBuilder("file exist ");
      localStringBuilder1 = new StringBuilder();
      str = ((bau)localObject2).Id;
      ab.v("MicroMsg.SnsDownloadThumb", com.tencent.mm.vfs.e.ct(localStringBuilder1.append(an.fZ(af.getAccSnsPath(), str)).append((String)localObject3).toString()));
      long l3 = bo.yz();
      localObject3 = ((bau)localObject2).Id;
      if (!s.a(an.fZ(af.getAccSnsPath(), (String)localObject3), com.tencent.mm.plugin.sns.data.i.n((bau)localObject2), (String)localObject4, af.cnO()))
      {
        ab.e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
        h.pYm.a(150L, 27L, 1L, true);
      }
      l3 = bo.az(l3);
      bool = com.tencent.mm.vfs.e.ct((String)localObject5);
      com.tencent.mm.vfs.e.deleteFile((String)localObject5);
      l2 = bo.az(l2);
      localObject5 = new StringBuilder();
      localObject3 = ((bau)localObject2).Id;
      if (!com.tencent.mm.vfs.e.ct(an.fZ(af.getAccSnsPath(), (String)localObject3) + (String)localObject4))
      {
        ab.i("MicroMsg.SnsDownloadThumb", "fileExists is false %s.", new Object[] { Long.valueOf(com.tencent.mm.vfs.e.asZ(this.qOa.getPath() + (String)localObject4)) });
        h.pYm.a(150L, 31L, 1L, true);
        if (bool)
        {
          localObject3 = new StringBuilder();
          localObject5 = ((bau)localObject2).Id;
          if (!com.tencent.mm.vfs.e.ct(an.fZ(af.getAccSnsPath(), (String)localObject5) + (String)localObject4))
          {
            bool = com.tencent.mm.plugin.normsg.a.b.oTO.bVR();
            ab.i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", new Object[] { Boolean.valueOf(bool) });
            h.pYm.a(150L, 32L, 1L, true);
            if (bool)
              h.pYm.a(150L, 33L, 1L, true);
          }
        }
      }
      h.pYm.e(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l2), Integer.valueOf(this.qOt), Thread.currentThread().getName(), af.cnR(), com.tencent.mm.compatible.util.e.eSl });
      if ((((com.tencent.mm.plugin.sns.data.e)localObject1).qFQ == 0) || (this.qOa.qFJ.qFQ == 5))
      {
        localObject3 = com.tencent.mm.plugin.sns.data.i.f((bau)localObject2);
        localObject1 = ((bau)localObject2).Id;
        s.b(an.fZ(af.getAccSnsPath(), (String)localObject1), (String)localObject4, (String)localObject3, af.cnN());
      }
      while (true)
      {
        localObject1 = new StringBuilder();
        localObject4 = ((bau)localObject2).Id;
        c.a(an.fZ(af.getAccSnsPath(), (String)localObject4) + (String)localObject3, ((bau)localObject2).wEH, 1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l1, l3);
        localObject4 = new StringBuilder();
        localObject2 = ((bau)localObject2).Id;
        this.qNZ = com.tencent.mm.plugin.sns.data.i.Xk(an.fZ(af.getAccSnsPath(), (String)localObject2) + (String)localObject3);
        this.qOu.put(paramInt, this.qNZ);
        bool = com.tencent.mm.plugin.sns.data.i.b(this.qNZ);
        ab.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + bool + " isWebp: " + this.flo + " srcImgFileSize: " + l1 + " index: " + paramInt);
        if (!bool)
        {
          h.pYm.a(150L, 65L, 1L, true);
          if (!this.qOD)
            break label1179;
          h.pYm.a(150L, 50L, 1L, true);
        }
        while (true)
        {
          if (this.qOC)
            h.pYm.a(150L, 54L, 1L, true);
          if (this.qOB)
            h.pYm.a(150L, 57L, 1L, true);
          if ((this.flo) && (!bool))
            h.pYm.a(22L, 65L, 1L, true);
          if ((this.qOD) && (bool))
            com.tencent.mm.plugin.sns.lucky.a.b.kT(139);
          bool = true;
          AppMethodBeat.o(36756);
          break;
          localObject3 = "";
          break label231;
          h.pYm.a(150L, 51L, 1L, true);
        }
        localObject3 = localObject4;
      }
    }
  }

  public final boolean cor()
  {
    AppMethodBeat.i(36755);
    String str1;
    String str2;
    BitmapFactory.Options localOptions;
    String str3;
    if (this.qOa.qFJ != null)
    {
      str1 = com.tencent.mm.plugin.sns.data.i.e(this.cNr);
      this.flo = s.Zj(this.qOa.getPath() + this.qOa.cop());
      if (this.qOB)
        this.flo = true;
      if (this.flo)
        h.pYm.a(22L, 64L, 1L, true);
      str2 = this.qOa.getPath() + this.qOa.cop();
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeFile(str2, localOptions);
      if (localOptions.outMimeType == null)
        break label1086;
      str3 = localOptions.outMimeType.toLowerCase();
      if ((localOptions.outMimeType == null) || (bo.isNullOrNil(localOptions.outMimeType)))
        h.pYm.a(150L, 35L, 1L, true);
      if ((!str3.contains("jpg")) && (!str3.contains("jpeg")))
        break label1117;
      int i = MMNativeJpeg.queryQuality(str2);
      j = i;
      if (i != 0);
    }
    label1086: label1094: label1117: for (int j = -1; ; j = -1)
    {
      long l1 = com.tencent.mm.vfs.e.asZ(str2);
      if (l1 <= 0L)
        h.pYm.a(150L, 23L, 1L, true);
      long l2 = bo.yz();
      str3 = com.tencent.mm.plugin.sns.data.i.i(this.cNr);
      com.tencent.mm.vfs.e.y(this.qOa.getPath() + this.qOa.cop(), this.qOa.getPath() + str3);
      ab.v("MicroMsg.SnsDownloadThumb", "file src" + com.tencent.mm.vfs.e.ct(new StringBuilder().append(this.qOa.getPath()).append(str3).toString()));
      long l3 = bo.yz();
      if (!s.a(this.qOa.getPath(), this.qOa.cop(), str1, af.cnO()))
      {
        ab.e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
        h.pYm.a(150L, 27L, 1L, true);
      }
      l3 = bo.az(l3);
      boolean bool = com.tencent.mm.vfs.e.ct(this.qOa.getPath() + this.qOa.cop());
      com.tencent.mm.vfs.e.deleteFile(this.qOa.getPath() + this.qOa.cop());
      l2 = bo.az(l2);
      if (!com.tencent.mm.vfs.e.ct(this.qOa.getPath() + str1))
      {
        ab.i("MicroMsg.SnsDownloadThumb", "fileExists is false %s", new Object[] { Long.valueOf(com.tencent.mm.vfs.e.asZ(this.qOa.getPath() + str1)) });
        h.pYm.a(150L, 31L, 1L, true);
        if ((bool) && (!com.tencent.mm.vfs.e.ct(this.qOa.getPath() + str1)))
        {
          bool = com.tencent.mm.plugin.normsg.a.b.oTO.bVR();
          ab.i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", new Object[] { Boolean.valueOf(bool) });
          h.pYm.a(150L, 32L, 1L, true);
          if (bool)
            h.pYm.a(150L, 33L, 1L, true);
        }
      }
      h.pYm.e(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l2), Integer.valueOf(this.qOt), Thread.currentThread().getName(), af.cnR(), com.tencent.mm.compatible.util.e.eSl });
      if ((this.qOa.qFJ.qFQ == 0) || (this.qOa.qFJ.qFQ == 5))
      {
        str3 = com.tencent.mm.plugin.sns.data.i.f(this.cNr);
        s.b(this.qOa.getPath(), str1, str3, af.cnN());
      }
      while (true)
      {
        c.a(this.qOa.getPath() + str3, this.qOa.url, 1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, j, l1, l3);
        this.qNZ = com.tencent.mm.plugin.sns.data.i.Xk(this.qOa.getPath() + str3);
        bool = com.tencent.mm.plugin.sns.data.i.b(this.qNZ);
        ab.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + bool + " isWebp: " + this.flo + " srcImgFileSize: " + l1);
        if (!bool)
        {
          h.pYm.a(150L, 65L, 1L, true);
          if (!this.qOD)
            break label1094;
          h.pYm.a(150L, 50L, 1L, true);
        }
        while (true)
        {
          if (this.qOC)
            h.pYm.a(150L, 54L, 1L, true);
          if (this.qOB)
            h.pYm.a(150L, 57L, 1L, true);
          if ((this.flo) && (!bool))
            h.pYm.a(22L, 65L, 1L, true);
          if ((this.qOD) && (bool))
            com.tencent.mm.plugin.sns.lucky.a.b.kT(139);
          AppMethodBeat.o(36755);
          return true;
          str3 = "";
          break;
          h.pYm.a(150L, 51L, 1L, true);
        }
        str3 = str1;
      }
    }
  }

  protected final int cos()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.i
 * JD-Core Version:    0.6.2
 */