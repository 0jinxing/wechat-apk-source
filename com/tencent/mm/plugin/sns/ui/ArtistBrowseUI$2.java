package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

final class ArtistBrowseUI$2
  implements r.a
{
  ArtistBrowseUI$2(ArtistBrowseUI paramArtistBrowseUI)
  {
  }

  public final void cry()
  {
    AppMethodBeat.i(38096);
    Object localObject1 = this.rgD.rpp.getCntMedia();
    if (localObject1 == null)
      AppMethodBeat.o(38096);
    while (true)
    {
      return;
      ab.d("MicroMsg.ArtistBrowseUI", "set bg the meida id " + ((bau)localObject1).Id);
      localObject2 = b.lY(723);
      ((b)localObject2).tx(((bau)localObject1).Url);
      ((b)localObject2).ajK();
      if (e.ct(an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id) + i.l((bau)localObject1)))
        break;
      AppMethodBeat.o(38096);
    }
    Object localObject2 = af.cnB();
    Object localObject3;
    String str;
    if ((((aw)localObject2).cnk() != null) && (!((aw)localObject2).cnk().equals("")))
    {
      localObject3 = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id) + i.l((bau)localObject1);
      str = an.fZ(af.getAccSnsPath(), ((aw)localObject2).cnk());
      if (!e.ct((String)localObject3))
        break label433;
      ab.d("MicroMsg.UploadManager", "bg file is exist!'");
      e.tf(str);
      e.deleteFile(str + ((aw)localObject2).cnk() + "bg_");
      e.deleteFile(str + ((aw)localObject2).cnk() + "tbg_");
      e.y((String)localObject3, str + ((aw)localObject2).cnk() + "bg_");
    }
    while (true)
    {
      localObject3 = af.cnJ();
      Object localObject4 = ((aw)localObject2).cnk();
      str = ((bau)localObject1).Id;
      localObject4 = ((m)localObject3).YX((String)localObject4);
      ((l)localObject4).field_bgId = str;
      ((m)localObject3).c((l)localObject4);
      ((aw)localObject2).con();
      localObject2 = new ax(7);
      ((bau)localObject1).wEN = 1;
      ((ax)localObject2).qNK.xfI.wbK.add(localObject1);
      ((ax)localObject2).De(2);
      ((ax)localObject2).commit();
      localObject1 = new Intent();
      ((Intent)localObject1).setClass(this.rgD, SettingSnsBackgroundUI.class);
      ((Intent)localObject1).setFlags(536870912);
      ((Intent)localObject1).addFlags(67108864);
      this.rgD.startActivity((Intent)localObject1);
      this.rgD.finish();
      AppMethodBeat.o(38096);
      break;
      label433: e.deleteFile(str + ((aw)localObject2).cnk() + "bg_");
      e.deleteFile(str + ((aw)localObject2).cnk() + "tbg_");
      ab.e("MicroMsg.UploadManager", "bg file is not exist! wait to down it");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistBrowseUI.2
 * JD-Core Version:    0.6.2
 */