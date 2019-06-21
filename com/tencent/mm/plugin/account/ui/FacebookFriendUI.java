package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o.b;

@Deprecated
public class FacebookFriendUI extends MMActivity
  implements d.a, f
{
  private ProgressDialog ehJ = null;
  d gBe;
  private ListView gtT;
  private View gtV;
  String gtX;
  private TextView gtY = null;
  private boolean gxV = false;

  private void bj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(124826);
    com.tencent.mm.ui.base.h.a(this, paramString2, paramString1, new FacebookFriendUI.4(this), null);
    AppMethodBeat.o(124826);
  }

  public final int getLayoutId()
  {
    return 2130969545;
  }

  public final void initView()
  {
    AppMethodBeat.i(124824);
    this.gtT = ((ListView)findViewById(2131824012));
    this.gtY = ((TextView)findViewById(2131824013));
    this.gtY.setText(2131299541);
    Object localObject1 = (TextView)findViewById(2131821807);
    ((TextView)localObject1).setText(2131299539);
    Object localObject2 = new com.tencent.mm.ui.tools.o((byte)0);
    ((com.tencent.mm.ui.tools.o)localObject2).zHa = new o.b()
    {
      public final void apo()
      {
      }

      public final void app()
      {
      }

      public final void apq()
      {
      }

      public final void apr()
      {
      }

      public final boolean vN(String paramAnonymousString)
      {
        return false;
      }

      public final void vO(String paramAnonymousString)
      {
        AppMethodBeat.i(124807);
        FacebookFriendUI.a(FacebookFriendUI.this, bo.vA(paramAnonymousString));
        paramAnonymousString = FacebookFriendUI.this;
        if (paramAnonymousString.gBe != null)
          paramAnonymousString.gBe.vM(paramAnonymousString.gtX);
        AppMethodBeat.o(124807);
      }
    };
    a((com.tencent.mm.ui.tools.o)localObject2);
    this.gBe = new d(this, new FacebookFriendUI.5(this, (TextView)localObject1));
    this.gBe.gBa = new FacebookFriendUI.6(this);
    this.gtT.setAdapter(this.gBe);
    this.gtV = findViewById(2131824014);
    this.gtT.setOnItemClickListener(new FacebookFriendUI.7(this));
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.FacebookFriendUI", "isBindForFacebookApp:" + r.Za());
    ap localap;
    if (r.Za())
    {
      this.gtT.setVisibility(0);
      this.gtV.setVisibility(8);
      long l = bo.c((Long)g.RP().Ry().get(65831, null));
      localObject1 = bo.nullAsNil((String)g.RP().Ry().get(65830, null));
      if ((bo.gb(l) > 86400000L) && (((String)localObject1).length() > 0))
      {
        localObject2 = new c(getString(2131305891));
        ((c)localObject2).arX((String)localObject1);
        new com.tencent.mm.plugin.account.model.h((c)localObject2, new FacebookFriendUI.8(this)).apm();
      }
      localObject2 = new com.tencent.mm.plugin.account.friend.a.ab();
      ((com.tencent.mm.plugin.account.friend.a.ab)localObject2).aqg();
      localap = new ap(new FacebookFriendUI.9(this, (com.tencent.mm.plugin.account.friend.a.ab)localObject2), false);
      if (bo.h((Integer)g.RP().Ry().get(65829, null)) > 0)
      {
        g.RP().Ry().set(65829, Integer.valueOf(1));
        g.Rg().a((m)localObject2, 0);
        localObject1 = this.mController.ylL;
        getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject1, getString(2131302046), true, new FacebookFriendUI.10(this, localap, (com.tencent.mm.plugin.account.friend.a.ab)localObject2));
        addTextOptionMenu(0, getString(2131299803), new FacebookFriendUI.11(this));
      }
    }
    while (true)
    {
      setBackBtn(new FacebookFriendUI.2(this));
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(124809);
          BackwardSupportUtil.c.a(FacebookFriendUI.e(FacebookFriendUI.this));
          AppMethodBeat.o(124809);
        }
      };
      AppMethodBeat.o(124824);
      return;
      localap.ae(5000L, 5000L);
      break;
      this.gtT.setVisibility(8);
      this.gtV.setVisibility(0);
      ((TextView)findViewById(2131824015)).setText(2131299771);
      this.gtV.setOnClickListener(new FacebookFriendUI.12(this));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124820);
    super.onCreate(paramBundle);
    setMMTitle(2131299802);
    g.Rg().a(32, this);
    initView();
    AppMethodBeat.o(124820);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(124823);
    g.Rg().b(32, this);
    this.gBe.bIf();
    super.onDestroy();
    AppMethodBeat.o(124823);
  }

  public void onPause()
  {
    AppMethodBeat.i(124822);
    super.onPause();
    com.tencent.mm.ah.o.acd().e(this);
    AppMethodBeat.o(124822);
  }

  public void onResume()
  {
    AppMethodBeat.i(124821);
    super.onResume();
    com.tencent.mm.ah.o.acd().d(this);
    this.gBe.notifyDataSetChanged();
    AppMethodBeat.o(124821);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(124825);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.FacebookFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramm.getType() != 32)
      AppMethodBeat.o(124825);
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if ((paramInt1 == 4) && (paramInt2 == -68))
      {
        paramm = paramString;
        if (bo.isNullOrNil(paramString))
          paramm = "error";
        bj(getString(2131297061), paramm);
        AppMethodBeat.o(124825);
      }
      else if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gBe.a(null, null);
        AppMethodBeat.o(124825);
      }
      else
      {
        Toast.makeText(this, 2131301454, 0).show();
        AppMethodBeat.o(124825);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(124827);
    this.gBe.notifyDataSetChanged();
    AppMethodBeat.o(124827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI
 * JD-Core Version:    0.6.2
 */