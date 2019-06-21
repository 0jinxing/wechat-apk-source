package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.b;

final class SnsBrowseUI$2
  implements View.OnClickListener
{
  SnsBrowseUI$2(SnsBrowseUI paramSnsBrowseUI, av paramav, TimeLineObject paramTimeLineObject)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38750);
    if (this.rpD.vCy == null)
    {
      AppMethodBeat.o(38750);
      return;
    }
    paramView = com.tencent.mm.plugin.sns.c.a.gkF.df(this.rpD.vCy.fKh);
    int i = 0;
    if (this.rpE.xfI.wbJ == 1)
      i = 2;
    while (true)
    {
      if (!i.a(this.rpE, this.rpC))
        break label171;
      com.tencent.mm.plugin.sns.c.a.gkF.a(this.rpC, this.rpD.vCy.fKh, paramView, this.rpE.jBB, i, 18, 9, this.rpD.vCy.vCs, this.rpE.Id);
      AppMethodBeat.o(38750);
      break;
      if (this.rpE.xfI.wbJ == 3)
        i = 5;
      else if (this.rpE.xfI.wbJ == 15)
        i = 4;
    }
    label171: switch (this.rpD.jCt)
    {
    default:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(38750);
      break;
      Object localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", this.rpD.Url);
      com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject, this.rpC);
      com.tencent.mm.plugin.sns.c.a.gkF.a(this.rpC, this.rpD.vCy.fKh, paramView, this.rpE.jBB, i, 18, 1, this.rpD.vCy.vCs, this.rpE.Id);
      AppMethodBeat.o(38750);
      break;
      if (this.rpD.Scene == 1)
      {
        localObject = new gt();
        ((gt)localObject).cBv.actionCode = 2;
        ((gt)localObject).cBv.scene = 3;
        ((gt)localObject).cBv.appId = this.rpD.vCy.fKh;
        ((gt)localObject).cBv.context = this.rpC;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        com.tencent.mm.plugin.sns.c.a.gkF.a(this.rpC, this.rpD.vCy.fKh, paramView, this.rpE.jBB, i, 18, 6, this.rpD.vCy.vCs, this.rpE.Id);
        AppMethodBeat.o(38750);
        break;
        int j = af.a(this.rpC, this.rpD);
        if (j == 1)
        {
          localObject = new gt();
          ((gt)localObject).cBv.context = this.rpC;
          ((gt)localObject).cBv.actionCode = 2;
          ((gt)localObject).cBv.appId = this.rpD.vCy.fKh;
          ((gt)localObject).cBv.messageAction = this.rpD.vCy.vCu;
          ((gt)localObject).cBv.messageExt = this.rpD.vCy.vCt;
          ((gt)localObject).cBv.scene = 3;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
          com.tencent.mm.plugin.sns.c.a.gkF.a(this.rpC, this.rpD.vCy.fKh, paramView, this.rpE.jBB, i, 18, 6, this.rpD.vCy.vCs, this.rpE.Id);
          AppMethodBeat.o(38750);
          break;
        }
        if (j == 2)
        {
          localObject = new gt();
          ((gt)localObject).cBv.context = this.rpC;
          ((gt)localObject).cBv.actionCode = 1;
          ((gt)localObject).cBv.appId = this.rpD.vCy.fKh;
          ((gt)localObject).cBv.messageAction = this.rpD.vCy.vCu;
          ((gt)localObject).cBv.messageExt = this.rpD.vCy.vCt;
          ((gt)localObject).cBv.scene = 3;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
          com.tencent.mm.plugin.sns.c.a.gkF.a(this.rpC, this.rpD.vCy.fKh, paramView, this.rpE.jBB, i, 18, 3, this.rpD.vCy.vCs, this.rpE.Id);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsBrowseUI.2
 * JD-Core Version:    0.6.2
 */