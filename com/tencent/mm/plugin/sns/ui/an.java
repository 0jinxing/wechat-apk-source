package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.au;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class an
{
  private Activity czX;
  private List<bau> list;

  public an(Activity paramActivity)
  {
    AppMethodBeat.i(38962);
    this.list = new ArrayList();
    this.czX = paramActivity;
    AppMethodBeat.o(38962);
  }

  private boolean dj(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(38965);
    Object localObject = h.YT(paramString);
    if (localObject == null)
    {
      ab.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] snsinfo is null! localId:%s index:%ss", new Object[] { paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(38965);
    }
    while (true)
    {
      return bool;
      paramString = ((n)localObject).cqu();
      if (paramString.xfI == null)
      {
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj is null!");
        AppMethodBeat.o(38965);
      }
      else if (paramString.xfI.wbK.size() == 0)
      {
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj.MediaObjList.size() == 0");
        AppMethodBeat.o(38965);
      }
      else
      {
        this.list.clear();
        paramString = paramString.xfI.wbK.iterator();
        for (int i = 0; ; i++)
        {
          if (!paramString.hasNext())
            break label196;
          localObject = (bau)paramString.next();
          this.list.add(localObject);
          if ((paramInt == i) && (!af.cnC().B((bau)localObject)))
          {
            ab.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] is not exists");
            AppMethodBeat.o(38965);
            break;
          }
        }
        label196: AppMethodBeat.o(38965);
        bool = true;
      }
    }
  }

  public final void a(View paramView, int paramInt1, int paramInt2, au paramau)
  {
    AppMethodBeat.i(38964);
    if (paramView == null)
    {
      ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] view is null! scene:%s", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(38964);
    }
    Object localObject;
    ao localao;
    String str;
    int i;
    int j;
    n localn;
    while (true)
    {
      return;
      localObject = paramView.getTag();
      if (!(localObject instanceof ao))
        break label682;
      localao = (ao)localObject;
      str = localao.czD;
      i = localao.index;
      j = localao.position;
      if (!dj(str, i))
      {
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", new Object[] { str, Integer.valueOf(i) });
        AppMethodBeat.o(38964);
      }
      else
      {
        com.tencent.mm.kernel.g.RQ();
        if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
        {
          ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
          AppMethodBeat.o(38964);
        }
        else
        {
          localn = h.YT(str);
          if (dj(str, i))
            break;
          ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", new Object[] { str, Integer.valueOf(i) });
          AppMethodBeat.o(38964);
        }
      }
    }
    Intent localIntent = new Intent();
    if (localn != null)
    {
      if (paramau != null)
        paramau.qMn.x(localn);
      TimeLineObject localTimeLineObject = localn.cqu();
      if (localao.index < localTimeLineObject.xfI.wbK.size())
      {
        paramau = (bau)localTimeLineObject.xfI.wbK.get(localao.index);
        label272: if (paramInt1 != 1)
          break label702;
        localObject = com.tencent.mm.modelsns.b.lY(716);
        label285: ((com.tencent.mm.modelsns.b)localObject).tx(i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(paramau.Id).mb(localao.index).mb(localTimeLineObject.xfI.wbK.size());
        ((com.tencent.mm.modelsns.b)localObject).ajK();
        if (paramInt1 != 1)
          break label713;
        paramau = com.tencent.mm.modelsns.b.lY(744);
        label371: paramau.tx(i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc());
        paramau.b(localIntent, "intent_key_StatisticsOplog");
        paramau = new Bundle();
        paramau.putInt("stat_scene", 3);
        paramau.putString("stat_msg_id", "sns_" + i.jV(localn.field_snsId));
        paramau.putString("stat_send_msg_user", localn.field_userName);
        localIntent.putExtra("_stat_obj", paramau);
      }
    }
    while (true)
    {
      paramau = new int[2];
      paramView.getLocationInWindow(paramau);
      int k = paramView.getWidth();
      int m = paramView.getHeight();
      if (paramInt1 == -1)
        localIntent.putExtra("k_is_from_sns_msg_ui", true);
      localIntent.putExtra("sns_gallery_localId", str);
      localIntent.putExtra("sns_gallery_position", i);
      localIntent.putExtra("sns_position", j);
      localIntent.putExtra("sns_gallery_showtype", 1);
      localIntent.putExtra("K_ad_scene", paramInt1);
      localIntent.putExtra("K_ad_source", paramInt2);
      localIntent.putExtra("k_is_from_sns_main_timeline", localao.rps);
      localIntent.putExtra("img_gallery_left", paramau[0]);
      localIntent.putExtra("img_gallery_top", paramau[1]);
      localIntent.putExtra("img_gallery_width", k);
      localIntent.putExtra("img_gallery_height", m);
      localIntent.setClass(this.czX, SnsBrowseUI.class);
      this.czX.startActivity(localIntent);
      this.czX.overridePendingTransition(0, 0);
      label682: AppMethodBeat.o(38964);
      break;
      paramau = new bau();
      break label272;
      label702: localObject = com.tencent.mm.modelsns.b.lZ(716);
      break label285;
      label713: paramau = com.tencent.mm.modelsns.b.lZ(744);
      break label371;
      ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
    }
  }

  public final void t(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38963);
    a(paramView, paramInt1, paramInt2, null);
    AppMethodBeat.o(38963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.an
 * JD-Core Version:    0.6.2
 */