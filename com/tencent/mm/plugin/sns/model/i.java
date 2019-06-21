package com.tencent.mm.plugin.sns.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.g.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class i extends h<String, Integer, Boolean>
{
  private n feQ;
  private String key;
  private String nQB;
  private int qIO;
  private String qIP;
  private List<bau> qIQ;

  public i(String paramString1, String paramString2, List<bau> paramList)
  {
    AppMethodBeat.i(36231);
    this.key = "";
    this.feQ = null;
    af.cnC().qIp.add(paramString1);
    this.nQB = paramString2;
    this.qIP = af.getAccSnsPath();
    this.qIO = af.cnN();
    this.qIQ = paramList;
    this.key = paramString1;
    AppMethodBeat.o(36231);
  }

  private boolean a(String paramString1, String paramString2, List<bau> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(36233);
    ab.i("MicroMsg.MutiImageLoader", "makeMutilMedia " + paramString1 + " " + paramString2);
    Object localObject1 = new LinkedList();
    Object localObject2 = paramList.iterator();
    int i = 0;
    String str1;
    String str2;
    String str3;
    if (((Iterator)localObject2).hasNext())
    {
      bau localbau = (bau)((Iterator)localObject2).next();
      str1 = com.tencent.mm.plugin.sns.data.i.f(localbau);
      str2 = com.tencent.mm.plugin.sns.data.i.e(localbau);
      str3 = an.fZ(this.qIP, localbau.Id);
      if (!e.ct(str3 + str1))
        if (!e.ct(str3 + str2))
        {
          paramList = com.tencent.mm.plugin.sns.data.i.l(localbau);
          if (e.ct(str3 + paramList))
            break label455;
          paramList = com.tencent.mm.plugin.sns.data.i.m(localbau);
        }
    }
    label455: 
    while (true)
    {
      s.a(str3, paramList, str2, af.cnO());
      s.b(str3, str2, str1, af.cnN());
      paramList = com.tencent.mm.plugin.sns.data.i.Xk(str3 + str1);
      if (paramList == null)
      {
        e.deleteFile(str3 + str1);
        ab.e("MicroMsg.MutiImageLoader", "userThumb decode fail !! ".concat(String.valueOf(str1)));
        AppMethodBeat.o(36233);
      }
      while (true)
      {
        return bool;
        ((List)localObject1).add(paramList);
        ab.i("MicroMsg.MutiImageLoader", "getbitmap from bm " + paramList + " " + str3 + str1);
        i++;
        if (i < 4)
          break;
        try
        {
          paramString1 = an.fZ(this.qIP, paramString1);
          e.tf(paramString1);
          localObject1 = com.tencent.mm.plugin.sns.data.i.p((List)localObject1, this.qIO);
          localObject2 = Bitmap.CompressFormat.JPEG;
          paramList = new java/lang/StringBuilder;
          paramList.<init>();
          d.a((Bitmap)localObject1, 100, (Bitmap.CompressFormat)localObject2, paramString1 + paramString2, false);
          bool = true;
          AppMethodBeat.o(36233);
        }
        catch (IOException paramString1)
        {
          ab.printErrStackTrace("MicroMsg.MutiImageLoader", paramString1, "makeMutilMedia failed: ".concat(String.valueOf(paramString2)), new Object[0]);
          AppMethodBeat.o(36233);
        }
      }
      break;
    }
  }

  public final a cin()
  {
    AppMethodBeat.i(36232);
    a locala = af.cnq();
    AppMethodBeat.o(36232);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.i
 * JD-Core Version:    0.6.2
 */