package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.websearch.api.ai;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bvo;
import com.tencent.mm.protocal.protobuf.mg;
import com.tencent.mm.protocal.protobuf.mn;
import com.tencent.mm.protocal.protobuf.uz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.IOException;

public final class a$b extends com.tencent.mm.ui.base.sortview.a.b
{
  public final void a(Context paramContext, com.tencent.mm.ui.base.sortview.a.a parama, com.tencent.mm.ui.base.sortview.a parama1)
  {
    int i = 8;
    AppMethodBeat.i(13863);
    if ((paramContext == null) || (parama == null) || (parama1 == null) || (parama1.getData() == null))
    {
      ab.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
      AppMethodBeat.o(13863);
    }
    while (true)
    {
      return;
      if (!(parama instanceof a.a))
      {
        ab.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
        AppMethodBeat.o(13863);
      }
      else
      {
        if ((parama1 instanceof a))
          break;
        ab.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
        AppMethodBeat.o(13863);
      }
    }
    paramContext = (a.a)parama;
    parama = (a)parama1;
    paramContext.username = parama.username;
    paramContext.iconUrl = parama.iconUrl;
    com.tencent.mm.pluginsdk.ui.a.b.r(paramContext.ejo, parama.username);
    parama1 = paramContext.jKL;
    int j;
    if (parama.jKI)
    {
      j = 0;
      label141: parama1.setVisibility(j);
      parama1 = paramContext.jKP;
      j = i;
      if (parama.jKJ)
        j = 0;
      parama1.setVisibility(j);
      com.tencent.mm.plugin.brandservice.b.a.b(paramContext.emg, parama.nickName);
      boolean bool1 = com.tencent.mm.plugin.brandservice.b.a.b(paramContext.jKO, parama.jKH);
      boolean bool2 = com.tencent.mm.plugin.brandservice.b.a.b(paramContext.jKN, parama.jKG);
      if (com.tencent.mm.plugin.brandservice.b.a.b(paramContext.jKM, parama.jKF))
      {
        if ((bool1) || (bool2))
          break label283;
        paramContext.jKM.setMaxLines(2);
      }
    }
    while (true)
    {
      ab.d("MicroMsg.BizContactDataItem", "fillingView , nickName : %s, followFriends : %s.", new Object[] { parama.nickName, parama.jKG });
      AppMethodBeat.o(13863);
      break;
      j = 8;
      break label141;
      label283: paramContext.jKM.setMaxLines(1);
    }
  }

  public final void a(View paramView, com.tencent.mm.ui.base.sortview.a.a parama)
  {
    AppMethodBeat.i(13864);
    if ((paramView != null) && (parama != null) && ((parama instanceof a.a)))
    {
      parama = (a.a)parama;
      parama.jKK = ((TextView)paramView.findViewById(2131821069));
      parama.jKP = paramView.findViewById(2131824269);
      parama.ejo = ((ImageView)paramView.findViewById(2131823652));
      parama.emg = ((TextView)paramView.findViewById(2131824267));
      parama.jKL = paramView.findViewById(2131824270);
      parama.jKN = ((TextView)paramView.findViewById(2131824274));
      parama.jKM = ((TextView)paramView.findViewById(2131824272));
      parama.jKO = ((TextView)paramView.findViewById(2131824271));
    }
    AppMethodBeat.o(13864);
  }

  public final boolean a(Context paramContext, com.tencent.mm.ui.base.sortview.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(13861);
    boolean bool;
    if (!(parama instanceof a))
    {
      bool = false;
      AppMethodBeat.o(13861);
    }
    a locala;
    Object localObject1;
    while (true)
    {
      return bool;
      locala = (a)parama;
      if (!(parama.getData() instanceof mn))
      {
        ab.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BusinessResultItem.");
        bool = false;
        AppMethodBeat.o(13861);
      }
      else
      {
        localObject1 = (mn)parama.getData();
        if ((((mn)localObject1).vQv != null) && (((mn)localObject1).vQv.vQb != null))
          break;
        ab.e("MicroMsg.BizContactDataItem", "The brItem.ContactItem or brItem.ContactItem.ContactItem is null.");
        bool = false;
        AppMethodBeat.o(13861);
      }
    }
    Object localObject2 = null;
    String str = "";
    label140: int i;
    if (paramArrayOfObject != null)
      if ((paramArrayOfObject.length > 0) && ((paramArrayOfObject[0] instanceof c)))
      {
        localObject2 = (c)paramArrayOfObject[0];
        if ((paramArrayOfObject.length > 2) && ((paramArrayOfObject[2] instanceof Integer)))
        {
          i = ((Integer)paramArrayOfObject[2]).intValue();
          label166: if ((paramArrayOfObject.length > 3) && ((paramArrayOfObject[3] instanceof String)))
          {
            str = (String)paramArrayOfObject[3];
            paramArrayOfObject = (Object[])localObject2;
            localObject2 = str;
          }
        }
      }
    while (true)
    {
      Object localObject4 = ((mn)localObject1).vQv.mZj;
      bvo localbvo = ((mn)localObject1).vQv.vQb;
      if (localbvo.wyX != null)
      {
        localObject1 = localbvo.wyX.wVI;
        label234: if (localbvo.wcB == null)
          break label285;
      }
      label285: for (str = localbvo.wcB.wVI; ; str = null)
      {
        if (!bo.isNullOrNil(str))
          break label291;
        ab.e("MicroMsg.BizContactDataItem", "onItemClick but username is null");
        bool = false;
        AppMethodBeat.o(13861);
        break;
        localObject1 = null;
        break label234;
      }
      label291: ai.adO(str);
      if (!bo.isNullOrNil((String)localObject4))
      {
        i = 8;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("rawUrl", (String)localObject4);
        ((Intent)localObject2).putExtra("useJs", true);
        ((Intent)localObject2).putExtra("vertical_scroll", true);
        d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
      }
      while (true)
      {
        paramContext = locala.aWm();
        if ((paramContext != null) && (paramArrayOfObject != null))
          paramContext.a(paramArrayOfObject, parama, i, str, locala.aWn(), locala.getPosition());
        bool = true;
        AppMethodBeat.o(13861);
        break;
        ad localad = ((j)g.K(j.class)).XM().aoO(str);
        localObject4 = new Intent();
        Bundle localBundle = new Bundle();
        localBundle.putString("Contact_Ext_Args_Search_Id", (String)localObject2);
        localBundle.putInt("Contact_Ext_Args_Index", locala.aWn());
        localBundle.putString("Contact_Ext_Args_Query_String", "");
        localBundle.putInt("Contact_Scene", i);
        ((Intent)localObject4).putExtra("Contact_Ext_Args", localBundle);
        ((Intent)localObject4).putExtra("Contact_User", str);
        ((Intent)localObject4).putExtra("Contact_Scene", i);
        if (!com.tencent.mm.n.a.jh(localad.field_type))
        {
          ((Intent)localObject4).putExtra("Contact_Alias", localbvo.guS);
          ((Intent)localObject4).putExtra("Contact_Nick", (String)localObject1);
          ((Intent)localObject4).putExtra("Contact_Signature", localbvo.guQ);
          ((Intent)localObject4).putExtra("Contact_RegionCode", RegionCodeDecoder.aC(localbvo.guW, localbvo.guO, localbvo.guP));
          ((Intent)localObject4).putExtra("Contact_Sex", localbvo.guN);
          ((Intent)localObject4).putExtra("Contact_VUser_Info", localbvo.wBU);
          ((Intent)localObject4).putExtra("Contact_VUser_Info_Flag", localbvo.wBT);
          ((Intent)localObject4).putExtra("Contact_KWeibo_flag", localbvo.wBX);
          ((Intent)localObject4).putExtra("Contact_KWeibo", localbvo.wBV);
          ((Intent)localObject4).putExtra("Contact_KWeiboNick", localbvo.wBW);
          if (localbvo.wWC == null);
        }
        try
        {
          ((Intent)localObject4).putExtra("Contact_customInfo", localbvo.wWC.toByteArray());
          b.gkE.c((Intent)localObject4, paramContext);
          i = 1;
        }
        catch (IOException localIOException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.BizContactDataItem", localIOException, "", new Object[0]);
        }
      }
      paramArrayOfObject = localIOException;
      Object localObject3 = str;
      continue;
      i = 0;
      break label166;
      localObject3 = null;
      break label140;
      i = 0;
      paramArrayOfObject = localObject3;
      localObject3 = str;
    }
  }

  public final View c(Context paramContext, View paramView)
  {
    AppMethodBeat.i(13862);
    View localView = paramView;
    if (paramView == null)
      localView = View.inflate(paramContext, 2130970571, null);
    AppMethodBeat.o(13862);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.a.b
 * JD-Core Version:    0.6.2
 */