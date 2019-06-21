package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.e;
import com.tencent.mm.ui.q;

final class VoiceSearchResultUI$2
  implements AdapterView.OnItemClickListener
{
  VoiceSearchResultUI$2(VoiceSearchResultUI paramVoiceSearchResultUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(35370);
    int i;
    Object localObject;
    if (!VoiceSearchResultUI.a(this.zLI))
    {
      paramAdapterView = h.pYm;
      paramView = new StringBuilder().append(VoiceSearchResultUI.b(this.zLI)).append(",").append(VoiceSearchResultUI.c(this.zLI)).append(",");
      if (VoiceSearchResultUI.d(this.zLI) == null)
      {
        i = 0;
        paramAdapterView.X(10452, i + "," + paramInt);
      }
    }
    else
    {
      localObject = VoiceSearchResultUI.f(this.zLI).PP(paramInt);
      paramAdapterView = this.zLI;
      paramView = ((ap)localObject).field_username;
      localObject = ((ad)localObject).Oj();
      if ((paramView != null) && (paramView.length() > 0))
        break label156;
      AppMethodBeat.o(35370);
    }
    while (true)
    {
      return;
      i = VoiceSearchResultUI.d(this.zLI).length;
      break;
      label156: ab.d("MicroMsg.VoiceSearchResultUI", "dealSelectContact ".concat(String.valueOf(paramView)));
      if (paramAdapterView.showType == 3)
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("Select_Conv_User", paramView);
        paramAdapterView.setResult(-1, (Intent)localObject);
        paramAdapterView.finish();
        AppMethodBeat.o(35370);
      }
      else if ((paramAdapterView.showType == 1) || (t.nJ(paramView)) || (t.mZ(paramView)) || (t.kH(paramView)) || (t.mW(paramView)) || (VoiceSearchResultUI.asA((String)localObject)))
      {
        if (paramAdapterView.showType == 1)
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Contact_User", paramView);
          if (t.mW(paramView))
            ((Intent)localObject).putExtra("Is_group_card", true);
          if ((paramView != null) && (paramView.length() > 0))
          {
            e.a((Intent)localObject, paramView);
            if (paramAdapterView.zLH)
            {
              paramAdapterView.a(ChattingUI.class, new Intent().putExtra("Chat_User", paramView).putExtra("finish_direct", true));
              paramAdapterView.finish();
              AppMethodBeat.o(35370);
            }
            else
            {
              d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", (Intent)localObject);
            }
          }
          else
          {
            AppMethodBeat.o(35370);
          }
        }
        else if (paramAdapterView.showType == 2)
        {
          if (bo.isNullOrNil(paramView))
          {
            ab.e("MicroMsg.VoiceSearchResultUI", "username is null ".concat(String.valueOf(paramView)));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.ne(paramView))
          {
            if (r.YS())
            {
              paramView = new Intent().putExtra("finish_direct", true);
              d.b(paramAdapterView.mController.ylL, "tmessage", ".ui.TConversationUI", paramView);
              AppMethodBeat.o(35370);
              continue;
            }
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.ng(paramView))
          {
            if (r.YP())
            {
              paramView = new Intent().putExtra("finish_direct", true);
              d.b(paramAdapterView.mController.ylL, "qmessage", ".ui.QConversationUI", paramView);
              AppMethodBeat.o(35370);
              continue;
            }
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.nf(paramView))
          {
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.nk(paramView))
          {
            MMAppMgr.cancelNotification(paramView);
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.nc(paramView))
          {
            if (r.Zb())
            {
              paramAdapterView.a(ChattingUI.class, new Intent().putExtra("Chat_User", paramView).putExtra("finish_direct", true));
              AppMethodBeat.o(35370);
              continue;
            }
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.np(paramView))
          {
            if (r.YV())
            {
              paramView = new Intent();
              paramView.putExtra("type", 20);
              d.b(paramAdapterView, "readerapp", ".ui.ReaderAppUI", paramView);
              AppMethodBeat.o(35370);
              continue;
            }
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.nx(paramView))
          {
            if (r.YW())
            {
              paramView = new Intent();
              paramView.putExtra("type", 11);
              d.b(paramAdapterView, "readerapp", ".ui.ReaderAppUI", paramView);
              AppMethodBeat.o(35370);
              continue;
            }
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.nh(paramView))
          {
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.ni(paramView))
          {
            if (r.YY())
            {
              d.b(paramAdapterView, "masssend", ".ui.MassSendHistoryUI", new Intent().putExtra("finish_direct", true));
              AppMethodBeat.o(35370);
              continue;
            }
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if (t.no(paramView))
          {
            if (r.YT())
            {
              paramAdapterView.a(ChattingUI.class, new Intent().putExtra("Chat_User", paramView).putExtra("finish_direct", true));
              AppMethodBeat.o(35370);
              continue;
            }
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          if ((t.nm(paramView)) || (t.nn(paramView)) || (t.nj(paramView)) || (t.nr(paramView)) || (t.ns(paramView)) || (t.nd(paramView)) || (t.nA(paramView)))
          {
            d.b(paramAdapterView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView));
            AppMethodBeat.o(35370);
            continue;
          }
          paramAdapterView.a(ChattingUI.class, new Intent().putExtra("Chat_User", paramView).putExtra("finish_direct", true));
          AppMethodBeat.o(35370);
        }
      }
      else
      {
        paramView = new Intent(paramAdapterView, SearchConversationResultUI.class);
        paramView.putExtra("SearchConversationResult_User", (String)localObject);
        paramAdapterView.startActivity(paramView);
        AppMethodBeat.o(35370);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.VoiceSearchResultUI.2
 * JD-Core Version:    0.6.2
 */