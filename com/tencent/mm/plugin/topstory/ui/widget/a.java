package com.tencent.mm.plugin.topstory.ui.widget;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.protocal.protobuf.bko;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;

public final class a
  implements com.tencent.mm.pluginsdk.b.a, n.b
{
  private Context context;
  private f ehK;
  private ad ehM;
  private CheckBoxPreference kRm;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  private void biW()
  {
    AppMethodBeat.i(2224);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    localHelperHeaderPreference.ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131305865));
    int i;
    if ((r.YK() & 0x4000000) == 0)
    {
      i = 1;
      if (i == 0)
        break label142;
      localHelperHeaderPreference.sd(1);
      this.ehK.ce("contact_info_top_story_install", true);
      this.ehK.ce("contact_info_top_story_uninstall", false);
      this.ehK.ce("contact_info_go_to_top_story", false);
      this.ehK.ce("contact_info_top_story_not_disturb", false);
      label116: if (!cHr())
        break label198;
      this.kRm.uOT = true;
      AppMethodBeat.o(2224);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label142: localHelperHeaderPreference.sd(0);
      this.ehK.ce("contact_info_top_story_install", false);
      this.ehK.ce("contact_info_top_story_uninstall", true);
      this.ehK.ce("contact_info_go_to_top_story", true);
      this.ehK.ce("contact_info_top_story_not_disturb", true);
      break label116;
      label198: this.kRm.uOT = false;
      AppMethodBeat.o(2224);
    }
  }

  private static boolean cHr()
  {
    AppMethodBeat.i(2226);
    boolean bool;
    if ((r.YF() & 0x1000000) == 0)
    {
      bool = true;
      AppMethodBeat.o(2226);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(2226);
    }
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(2222);
    if ("contact_info_go_to_top_story".equals(paramString))
      c.W(this.context, 0);
    do
      while (true)
      {
        AppMethodBeat.o(2222);
        return false;
        if ("contact_info_top_story_install".equals(paramString))
        {
          jX(true);
        }
        else
        {
          if (!"contact_info_top_story_uninstall".equals(paramString))
            break;
          h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.1(this), null);
        }
      }
    while (!"contact_info_top_story_not_disturb".equals(paramString));
    int i = r.YF();
    if (this.kRm.isChecked())
    {
      i &= -16777217;
      label134: g.RP().Ry().set(40, Integer.valueOf(i));
      paramString = new act();
      paramString.wkw = 55;
      if (!this.kRm.isChecked())
        break label219;
    }
    label219: for (i = 2; ; i = 1)
    {
      paramString.pvD = i;
      ((j)g.K(j.class)).XL().c(new j.a(55, paramString));
      break;
      i |= 16777216;
      break label134;
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(2225);
    paramInt = bo.g(paramObject, 0);
    if ((paramn != g.RP().Ry()) || (paramInt <= 0))
      AppMethodBeat.o(2225);
    while (true)
    {
      return;
      if ((paramInt != 40) && (paramInt != 34) && (paramInt != 7))
      {
        AppMethodBeat.o(2225);
      }
      else
      {
        biW();
        AppMethodBeat.o(2225);
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(2220);
    this.ehK = paramf;
    this.ehM = paramad;
    paramf.addPreferencesFromResource(2131165225);
    g.RP().Ry().a(this);
    this.kRm = ((CheckBoxPreference)paramf.aqO("contact_info_top_story_not_disturb"));
    biW();
    AppMethodBeat.o(2220);
    return true;
  }

  public final boolean biV()
  {
    AppMethodBeat.i(2221);
    g.RP().Ry().b(this);
    AppMethodBeat.o(2221);
    return true;
  }

  final void jX(boolean paramBoolean)
  {
    AppMethodBeat.i(2223);
    int i = r.YK();
    if (paramBoolean)
    {
      i &= -67108865;
      g.RP().Ry().set(34, Integer.valueOf(i));
      Object localObject = new bko();
      ((bko)localObject).vCi = 67108864;
      if (!paramBoolean)
        break label197;
      i = 0;
      label54: ((bko)localObject).wNJ = i;
      ((j)g.K(j.class)).XL().c(new j.a(39, (com.tencent.mm.bt.a)localObject));
      biW();
      if (!paramBoolean)
        break label202;
      if (((j)g.K(j.class)).XR().aoZ("topstoryapp") == null)
      {
        localObject = new ak();
        ((ak)localObject).setUsername("topstoryapp");
        ((ak)localObject).setContent(this.context.getString(2131305865));
        ((ak)localObject).eD(bo.anU());
        ((ak)localObject).hO(0);
        ((ak)localObject).hM(0);
        ((j)g.K(j.class)).XR().d((ak)localObject);
      }
      AppMethodBeat.o(2223);
    }
    while (true)
    {
      return;
      i |= 67108864;
      break;
      label197: i = 1;
      break label54;
      label202: ((j)g.K(j.class)).XR().aoX("topstoryapp");
      AppMethodBeat.o(2223);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.a
 * JD-Core Version:    0.6.2
 */