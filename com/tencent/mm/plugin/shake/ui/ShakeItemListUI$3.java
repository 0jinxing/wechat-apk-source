package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.d.a.i;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class ShakeItemListUI$3
  implements AdapterView.OnItemClickListener
{
  ShakeItemListUI$3(ShakeItemListUI paramShakeItemListUI, int paramInt)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24722);
    paramAdapterView = (com.tencent.mm.plugin.shake.b.d)ShakeItemListUI.b(this.quC).getItem(paramInt);
    if (paramAdapterView == null)
      AppMethodBeat.o(24722);
    label47: label182: label215: Object localObject;
    while (true)
    {
      return;
      paramView = m.cjS();
      int i;
      if (paramAdapterView == null)
      {
        ab.w("MicroMsg.NewShakeItemStorage", "setRead, but item is null");
        i = paramAdapterView.field_type;
        if (i != 4)
          break label215;
        paramView = new Intent();
        if (!com.tencent.mm.aw.d.aio())
          break label182;
        com.tencent.mm.aw.a.b(i.d(paramAdapterView.field_lvbuffer, 0L));
      }
      while (true)
      {
        paramView.putExtra("key_scene", 3);
        com.tencent.mm.bp.d.b(this.quC, "music", ".ui.MusicMainUI", paramView);
        AppMethodBeat.o(24722);
        break;
        paramAdapterView.field_insertBatch = 1;
        paramAdapterView.bJt = 1024;
        if (-1 == paramView.bSd.update("shakeitem1", paramAdapterView.Hl(), "shakeItemID=? and insertBatch=?", new String[] { paramAdapterView.field_shakeItemID, "2" }))
          break label47;
        paramView.doNotify();
        break label47;
        com.tencent.mm.aw.a.aic();
        paramView.putExtra("key_mode", 1);
        paramView.putExtra("KGlobalShakeMusic", true);
        com.tencent.mm.aw.a.c(i.d(paramAdapterView.field_lvbuffer, 0L));
      }
      if (i == 11)
      {
        if (System.currentTimeMillis() - this.quC.quz > 2000L)
        {
          this.quC.quz = System.currentTimeMillis();
          if ((paramAdapterView.field_reserved3 == null) || (paramAdapterView.field_reserved3.split(",").length != 3) || (paramAdapterView.field_reserved3.split(",")[0] == null) || (paramAdapterView.field_reserved3.split(",")[0].equals("")))
            break label411;
          paramView = paramAdapterView.field_reserved3.split(",");
          localObject = new se();
          ((se)localObject).cOf.userName = paramView[0];
          ((se)localObject).cOf.cOh = bo.bc(paramView[1], "");
          ((se)localObject).cOf.cOi = Integer.parseInt(paramView[2]);
          ((se)localObject).cOf.scene = 1077;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        }
        while (true)
        {
          if (ShakeItemListUI.d(this.quC))
          {
            com.tencent.mm.plugin.shake.d.a.h.a(paramAdapterView);
            com.tencent.mm.plugin.shake.d.a.h.b(paramAdapterView);
          }
          AppMethodBeat.o(24722);
          break;
          label411: paramView = new Intent();
          paramView.putExtra("rawUrl", paramAdapterView.getCity());
          paramView.putExtra("scene", 27);
          paramView.putExtra("stastic_scene", 5);
          com.tencent.mm.bp.d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
        }
      }
      if (!k.Cz(i))
        break;
      k.a(paramAdapterView, this.quC, true);
      AppMethodBeat.o(24722);
    }
    paramView = paramAdapterView.field_username;
    aw.ZK();
    ad localad = c.XM().aoO(paramView);
    ab.d("MicroMsg.ShakeItemListUI", "listView onTtemClick username:" + paramView + " display:" + paramAdapterView.field_nickname + " position:" + paramInt + " contactName" + localad.field_username);
    ab.d("MicroMsg.ShakeItemListUI", "isContact:" + com.tencent.mm.n.a.jh(localad.field_type) + "  contact:" + localad);
    if (com.tencent.mm.n.a.jh(localad.field_type))
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("Contact_User", paramView);
      if (this.quE == paramAdapterView.field_sex);
      for (paramInt = 23; ; paramInt = 24)
      {
        ((Intent)localObject).putExtra("Contact_Scene", paramInt);
        ((Intent)localObject).putExtra("Sns_from_Scene", 22);
        if ((paramView != null) && (paramView.length() > 0))
        {
          if (localad.dsf())
          {
            com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramAdapterView.field_username + "," + ((Intent)localObject).getIntExtra("Contact_Scene", 23));
            ((Intent)localObject).putExtra("Contact_Scene", 23);
          }
          com.tencent.mm.plugin.shake.a.gkE.c((Intent)localObject, this.quC);
        }
        AppMethodBeat.o(24722);
        break;
      }
    }
    ab.d("MicroMsg.ShakeItemListUI", "listView onTtemClick username:" + paramView + " display:" + paramAdapterView.field_nickname + " position:" + paramInt + " contactName" + localad.field_username);
    paramView = new Intent();
    paramView.putExtra("Contact_User", paramAdapterView.field_username);
    paramView.putExtra("Contact_Nick", paramAdapterView.field_nickname);
    paramView.putExtra("Contact_Distance", paramAdapterView.field_distance);
    paramView.putExtra("Contact_Signature", paramAdapterView.field_signature);
    paramView.putExtra("Contact_Province", paramAdapterView.getProvince());
    paramView.putExtra("Contact_City", paramAdapterView.getCity());
    paramView.putExtra("Contact_Sex", paramAdapterView.field_sex);
    paramView.putExtra("Contact_IsLBSFriend", true);
    paramView.putExtra("Contact_VUser_Info", paramAdapterView.field_reserved3);
    paramView.putExtra("Contact_VUser_Info_Flag", paramAdapterView.field_reserved1);
    if (this.quE == paramAdapterView.field_sex);
    for (paramInt = 23; ; paramInt = 24)
    {
      paramView.putExtra("Contact_Scene", paramInt);
      paramView.putExtra("Sns_from_Scene", 22);
      paramView.putExtra("Contact_KSnsIFlag", paramAdapterView.field_snsFlag);
      paramView.putExtra("Contact_KSnsBgUrl", paramAdapterView.field_sns_bgurl);
      if ((paramAdapterView.field_reserved1 & 0x8) > 0)
        com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramAdapterView.field_username + "," + paramView.getIntExtra("Contact_Scene", 23));
      com.tencent.mm.plugin.shake.a.gkE.c(paramView, this.quC);
      AppMethodBeat.o(24722);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI.3
 * JD-Core Version:    0.6.2
 */