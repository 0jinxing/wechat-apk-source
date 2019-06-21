package com.tencent.mm.plugin.sns.ui;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ayq;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

final class ac$4
  implements Runnable
{
  ac$4(ac paramac)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38341);
    ac localac = this.rkS;
    long l = System.currentTimeMillis();
    ax localax;
    Object localObject1;
    Object localObject2;
    int i;
    if ((!TextUtils.isEmpty(localac.nuk)) && (!TextUtils.isEmpty(localac.fgE)))
    {
      localax = localac.rkO;
      String str1 = localac.videoPath;
      String str2 = localac.thumbPath;
      localObject1 = localac.desc;
      localObject2 = localac.cvZ;
      String str3 = localac.nuk;
      String str4 = localac.fgE;
      String str5 = af.getAccSnsTmpPath() + g.x(str1.getBytes());
      ax.Yw(str5);
      e.y(str1, str5);
      str1 = af.getAccSnsTmpPath() + g.x(str2.getBytes());
      e.y(str2, str1);
      localObject2 = ax.c("", str5, str1, (String)localObject2, str3, str4);
      if (localObject2 == null)
      {
        ab.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
        i = 0;
        if (i != 0)
          break label465;
        ab.i("MicroMsg.SightWidget", "commitInThread videopath " + e.asZ(localac.videoPath) + " thumb: " + e.asZ(localac.thumbPath) + ",cdnUrl " + localac.nuk + "cdnThubmUrl " + localac.fgE);
        al.d(new ac.7(localac));
        label269: ab.i("MicroMsg.SightWidget", "removeRunnable showProgress");
        al.af(this.rkS.rkR);
        if (this.rkS.rkO != null)
          break label490;
        AppMethodBeat.o(38341);
      }
    }
    while (true)
    {
      return;
      ((bau)localObject2).Desc = ((String)localObject1);
      if (bo.isNullOrNil(((bau)localObject2).Title))
        ((bau)localObject2).Title = ((String)localObject1);
      localax.qNK.xfI.wbK.add(localObject2);
      localObject1 = new ayq();
      ((ayq)localObject1).wCt = ((bau)localObject2).cNE;
      localax.qNL.wFf.add(localObject1);
      i = 1;
      break;
      if (!localac.rkO.t(localac.videoPath, localac.thumbPath, localac.desc, localac.cvZ))
      {
        ab.i("MicroMsg.SightWidget", "commitInThread videopath " + e.asZ(localac.videoPath) + " thumb: " + e.asZ(localac.thumbPath));
        al.d(new ac.8(localac));
        break label269;
      }
      label465: ab.i("MicroMsg.SightWidget", "commitInThread cost time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      break label269;
      label490: al.d(this.rkS.rkQ);
      AppMethodBeat.o(38341);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ac.4
 * JD-Core Version:    0.6.2
 */