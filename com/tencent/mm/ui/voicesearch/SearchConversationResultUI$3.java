package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.q;

final class SearchConversationResultUI$3
  implements AdapterView.OnItemClickListener
{
  SearchConversationResultUI$3(SearchConversationResultUI paramSearchConversationResultUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(35317);
    if (paramInt < SearchConversationResultUI.a(this.zLu).getHeaderViewsCount())
      AppMethodBeat.o(35317);
    while (true)
    {
      return;
      paramInt -= SearchConversationResultUI.a(this.zLu).getHeaderViewsCount();
      paramAdapterView = (ak)SearchConversationResultUI.b(this.zLu).getItem(paramInt);
      if (paramAdapterView == null)
      {
        ab.e("MicroMsg.VoiceSearchResultUI", "null user at position = ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(35317);
      }
      else
      {
        ab.d("MicroMsg.VoiceSearchResultUI", "username " + paramAdapterView.field_username);
        if (t.ne(paramAdapterView.field_username))
        {
          if (r.YS())
          {
            paramAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(this.zLu.mController.ylL, "tmessage", ".ui.TConversationUI", paramAdapterView);
            AppMethodBeat.o(35317);
          }
          else
          {
            d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            AppMethodBeat.o(35317);
          }
        }
        else if (t.ng(paramAdapterView.field_username))
        {
          if (r.YP())
          {
            paramAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(this.zLu.mController.ylL, "qmessage", ".ui.QConversationUI", paramAdapterView);
            AppMethodBeat.o(35317);
          }
          else
          {
            d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            AppMethodBeat.o(35317);
          }
        }
        else if (t.nf(paramAdapterView.field_username))
        {
          d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          AppMethodBeat.o(35317);
        }
        else if (t.nk(paramAdapterView.field_username))
        {
          MMAppMgr.cancelNotification(paramAdapterView.field_username);
          d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          AppMethodBeat.o(35317);
        }
        else if (t.nc(paramAdapterView.field_username))
        {
          if (r.Zb())
          {
            SearchConversationResultUI.a(this.zLu, ChattingUI.class, new Intent().putExtra("Chat_User", paramAdapterView.field_username).putExtra("finish_direct", true));
            AppMethodBeat.o(35317);
          }
          else
          {
            d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            AppMethodBeat.o(35317);
          }
        }
        else if (t.np(paramAdapterView.field_username))
        {
          if (r.YV())
          {
            paramAdapterView = new Intent();
            paramAdapterView.putExtra("type", 20);
            d.b(this.zLu, "readerapp", ".ui.ReaderAppUI", paramAdapterView);
            AppMethodBeat.o(35317);
          }
          else
          {
            d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            AppMethodBeat.o(35317);
          }
        }
        else if (t.nx(paramAdapterView.field_username))
        {
          if (r.YW())
          {
            paramAdapterView = new Intent();
            paramAdapterView.putExtra("type", 11);
            d.b(this.zLu, "readerapp", ".ui.ReaderAppUI", paramAdapterView);
            AppMethodBeat.o(35317);
          }
          else
          {
            d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            AppMethodBeat.o(35317);
          }
        }
        else if (t.nh(paramAdapterView.field_username))
        {
          d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          AppMethodBeat.o(35317);
        }
        else if (t.ni(paramAdapterView.field_username))
        {
          if (r.YY())
          {
            paramAdapterView = new Intent().putExtra("finish_direct", true);
            d.b(this.zLu, "masssend", ".ui.MassSendHistoryUI", paramAdapterView);
            AppMethodBeat.o(35317);
          }
          else
          {
            d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            AppMethodBeat.o(35317);
          }
        }
        else if (t.no(paramAdapterView.field_username))
        {
          if (r.YT())
          {
            SearchConversationResultUI.b(this.zLu, ChattingUI.class, new Intent().putExtra("Chat_User", paramAdapterView.field_username).putExtra("finish_direct", true));
            AppMethodBeat.o(35317);
          }
          else
          {
            d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            AppMethodBeat.o(35317);
          }
        }
        else if ((t.nm(SearchConversationResultUI.c(this.zLu))) || (t.nn(SearchConversationResultUI.c(this.zLu))) || (t.nj(SearchConversationResultUI.c(this.zLu))) || (t.nr(SearchConversationResultUI.c(this.zLu))) || (t.ns(SearchConversationResultUI.c(this.zLu))) || (t.nd(SearchConversationResultUI.c(this.zLu))) || (t.nA(SearchConversationResultUI.c(this.zLu))))
        {
          d.b(this.zLu, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          AppMethodBeat.o(35317);
        }
        else
        {
          SearchConversationResultUI.c(this.zLu, ChattingUI.class, new Intent().putExtra("Chat_User", paramAdapterView.field_username).putExtra("finish_direct", true));
          AppMethodBeat.o(35317);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.SearchConversationResultUI.3
 * JD-Core Version:    0.6.2
 */