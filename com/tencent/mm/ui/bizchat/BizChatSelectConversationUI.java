package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.applet.g;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.protobuf.acr;
import com.tencent.mm.protocal.protobuf.kd;
import com.tencent.mm.protocal.protobuf.uo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.v;
import java.util.HashMap;

@com.tencent.mm.ui.base.a(19)
public class BizChatSelectConversationUI extends MMBaseSelectContactUI
  implements com.tencent.mm.aj.n
{
  private String jMp = null;
  private int scene = 0;
  private com.tencent.mm.ui.base.p tipDialog = null;
  j yEk;
  private TextView yFh;

  private com.tencent.mm.ui.widget.a.c a(String paramString1, String paramString2, String paramString3, final String paramString4, final long paramLong)
  {
    AppMethodBeat.i(30191);
    paramString1 = g.a(this.mController, paramString1, paramString3, paramString2, true, getResources().getString(2131297041), new q.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        AppMethodBeat.i(30177);
        if (paramAnonymousBoolean)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("enterprise_biz_name", paramString4);
          localIntent.putExtra("key_biz_chat_id", paramLong);
          localIntent.putExtra("key_is_biz_chat", true);
          if (!bo.isNullOrNil(paramAnonymousString))
            localIntent.putExtra("enterprise_share_append_text", paramAnonymousString);
          BizChatSelectConversationUI.this.setResult(-1, localIntent);
          BizChatSelectConversationUI.this.finish();
        }
        AppMethodBeat.o(30177);
      }
    });
    AppMethodBeat.o(30191);
    return paramString1;
  }

  private void a(String paramString, long paramLong, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(30188);
    ab.i("MicroMsg.BizChatSelectConversationUI", "doClickUser=%s", new Object[] { paramString });
    if (this.scene == 2)
      if (getIntent().getBooleanExtra("enterprise_extra_params", true))
      {
        q(paramString, String.valueOf(paramCharSequence), paramLong);
        AppMethodBeat.o(30188);
      }
    while (true)
    {
      return;
      r(paramString, String.valueOf(paramCharSequence), paramLong);
      AppMethodBeat.o(30188);
      continue;
      if (this.scene == 1)
      {
        HashMap localHashMap = (HashMap)getIntent().getSerializableExtra("enterprise_extra_params");
        String str = (String)localHashMap.get("img_url");
        paramCharSequence = (String)localHashMap.get("desc");
        a((String)localHashMap.get("title"), paramCharSequence, str, paramString, paramLong);
      }
      AppMethodBeat.o(30188);
    }
  }

  private void aWh()
  {
    AppMethodBeat.i(30182);
    if (bo.isNullOrNil(this.jMp))
    {
      this.jMp = getIntent().getStringExtra("enterprise_biz_name");
      if (bo.isNullOrNil(this.jMp))
      {
        ab.e("MicroMsg.BizChatSelectConversationUI", "brandUserName is null");
        finish();
      }
    }
    AppMethodBeat.o(30182);
  }

  private void q(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(30189);
    g.a(this.mController, paramLong, getString(2131302497), paramString2, getString(2131297041), new BizChatSelectConversationUI.2(this, paramString1, paramLong));
    AppMethodBeat.o(30189);
  }

  private void r(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(30190);
    g.a(this.mController, paramLong, getString(2131302497), paramString2, getString(2131297041), new BizChatSelectConversationUI.3(this, paramString1, paramLong));
    AppMethodBeat.o(30190);
  }

  public final void a(int paramInt, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(30194);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (paramm.getType() == 1355)
    {
      paramm = ((com.tencent.mm.aj.a.n)paramm).afm();
      paramm = z.aeT().rq(paramm.wcb.wku.vMV);
      if (paramm == null)
      {
        Toast.makeText(ah.getContext(), getString(2131302514), 0).show();
        AppMethodBeat.o(30194);
      }
    }
    while (true)
    {
      return;
      a(this.jMp, paramm.field_bizChatLocalId, paramm.field_chatName);
      AppMethodBeat.o(30194);
    }
  }

  public final void a(ListView paramListView, int paramInt)
  {
    AppMethodBeat.i(30185);
    super.a(paramListView, paramInt);
    if (this.yFh == null)
    {
      Object localObject = new BizChatSelectConversationUI.1(this);
      String str = getString(2131302890);
      View localView = v.hu(this).inflate(2130969809, null);
      localView.setOnClickListener((View.OnClickListener)localObject);
      localObject = (TextView)localView.findViewById(2131822953);
      ((TextView)localObject).setText(str);
      paramListView.addHeaderView(localView);
      this.yFh = ((TextView)localObject);
    }
    this.yFh.setVisibility(paramInt);
    AppMethodBeat.o(30185);
  }

  public final com.tencent.mm.ui.contact.m aoA()
  {
    AppMethodBeat.i(30184);
    aWh();
    com.tencent.mm.ui.contact.p localp = new com.tencent.mm.ui.contact.p(this, this.jMp);
    AppMethodBeat.o(30184);
    return localp;
  }

  public final boolean aow()
  {
    return false;
  }

  public final boolean aox()
  {
    return false;
  }

  public final String aoy()
  {
    AppMethodBeat.i(30192);
    String str = s.mJ(this.jMp);
    AppMethodBeat.o(30192);
    return str;
  }

  public final o aoz()
  {
    AppMethodBeat.i(30183);
    aWh();
    d locald = new d(this, this.jMp);
    AppMethodBeat.o(30183);
    return locald;
  }

  public final void bMQ()
  {
    AppMethodBeat.i(30186);
    super.bMQ();
    AppMethodBeat.o(30186);
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(30187);
    if (paramInt < getContentLV().getHeaderViewsCount())
    {
      ab.i("MicroMsg.BizChatSelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(30187);
    }
    while (true)
    {
      return;
      if (!(getContentLV().getAdapter().getItem(paramInt) instanceof a))
      {
        ab.w("MicroMsg.BizChatSelectConversationUI", "Click HeaderView not BizChatConvDataItem");
        AppMethodBeat.o(30187);
      }
      else
      {
        a locala = (a)getContentLV().getAdapter().getItem(paramInt);
        if (locala == null)
        {
          AppMethodBeat.o(30187);
        }
        else
        {
          String str = locala.username;
          long l = locala.jMj;
          if ((str == null) || (l == -1L))
          {
            ab.i("MicroMsg.BizChatSelectConversationUI", "onclick err userName:%s,bizChatId:%s", new Object[] { str, Long.valueOf(l) });
            AppMethodBeat.o(30187);
          }
          else
          {
            a(str, l, locala.gnx);
            AppMethodBeat.o(30187);
          }
        }
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30193);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(30193);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(30193);
      case 1:
      }
    }
    paramIntent = paramIntent.getBundleExtra("result_data");
    acr localacr;
    if (paramIntent != null)
    {
      ab.i("MicroMsg.BizChatSelectConversationUI", "bundle != null");
      String str = paramIntent.getString("enterprise_members");
      localacr = new acr();
      com.tencent.mm.aj.a.c localc = new com.tencent.mm.aj.a.c();
      if (this.yEk != null)
      {
        paramIntent = this.yEk.field_addMemberUrl;
        label115: localc.field_addMemberUrl = paramIntent;
        localc.field_brandUserName = this.jMp;
        if (!e.a(localc, str, null, localacr))
          break label261;
        if (localc.field_bizChatLocalId == -1L)
          break label208;
        a(this.jMp, localc.field_bizChatLocalId, localc.field_chatName);
        paramInt1 = 1;
      }
    }
    while (true)
    {
      if (paramInt1 == 0)
      {
        Toast.makeText(this, getString(2131302514), 0).show();
        AppMethodBeat.o(30193);
        break;
        paramIntent = null;
        break label115;
        label208: z.aeZ();
        paramIntent = com.tencent.mm.aj.a.h.a(this.jMp, localacr, this);
        getString(2131297061);
        this.tipDialog = com.tencent.mm.ui.base.h.b(this, getString(2131296430), true, new BizChatSelectConversationUI.5(this, paramIntent));
        paramInt1 = 1;
        continue;
        label261: paramInt1 = 0;
        continue;
      }
      AppMethodBeat.o(30193);
      break;
      paramInt1 = 0;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(30180);
    super.onCreate(paramBundle);
    this.scene = getIntent().getIntExtra("biz_chat_scene", 1);
    aWh();
    paramBundle = z.aeV().cI(this.jMp);
    this.yEk = z.aeV().cH(paramBundle);
    String str = this.jMp;
    if (this.yEk == null)
      bool = true;
    ab.i("MicroMsg.BizChatSelectConversationUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", new Object[] { str, paramBundle, Boolean.valueOf(bool) });
    if ((bo.isNullOrNil(paramBundle)) || (this.yEk == null) || (this.yEk.afh()) || (bo.isNullOrNil(this.yEk.field_addMemberUrl)))
    {
      z.aeZ();
      com.tencent.mm.aj.a.h.a(this.jMp, this);
      paramBundle = getActivity();
      getString(2131297061);
      this.tipDialog = com.tencent.mm.ui.base.h.b(paramBundle, getString(2131297086), true, new BizChatSelectConversationUI.6(this));
    }
    AppMethodBeat.o(30180);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30181);
    super.onDestroy();
    AppMethodBeat.o(30181);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSelectConversationUI
 * JD-Core Version:    0.6.2
 */