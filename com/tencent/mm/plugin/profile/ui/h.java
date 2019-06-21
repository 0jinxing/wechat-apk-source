package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.n;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class h
  implements com.tencent.mm.pluginsdk.b.a
{
  Context context;
  private f ehK;
  private ad ehM;
  private String ehq;
  u eih;
  private int gwP;
  private boolean pli;
  private boolean plj;
  private int pmV;
  ContactListExpandPreference pmW;

  public h(Context paramContext)
  {
    AppMethodBeat.i(23533);
    this.context = paramContext;
    this.pmW = new ContactListExpandPreference(paramContext, 0);
    AppMethodBeat.o(23533);
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(23534);
    ab.d("MicroMsg.ContactWidgetGroupCard", "handleEvent ".concat(String.valueOf(paramString)));
    aw.ZK();
    paramString = c.XM().aoO(paramString);
    if ((paramString == null) || ((int)paramString.ewQ <= 0))
      AppMethodBeat.o(23534);
    while (true)
    {
      return true;
      Intent localIntent = new Intent();
      localIntent.setClass(this.context, ContactInfoUI.class);
      localIntent.putExtra("Contact_User", paramString.field_username);
      this.context.startActivity(localIntent);
      AppMethodBeat.o(23534);
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(23535);
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label364;
      bool = true;
      label34: Assert.assertTrue(bool);
      if (paramf == null)
        break label370;
    }
    label364: label370: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.ehK = paramf;
      this.ehM = paramad;
      this.pli = paramBoolean;
      this.gwP = paramInt;
      this.plj = ((Activity)this.context).getIntent().getBooleanExtra("User_Verify", false);
      this.pmV = ((Activity)this.context).getIntent().getIntExtra("Kdel_from", -1);
      this.ehq = paramad.field_username;
      aw.ZK();
      this.eih = c.XV().ob(this.ehq);
      this.ehK.removeAll();
      paramf = new PreferenceSmallCategory(this.context);
      this.ehK.b(paramf);
      this.pmW.setKey("roominfo_contact_anchor");
      this.ehK.b(this.pmW);
      paramf = new PreferenceCategory(this.context);
      this.ehK.b(paramf);
      paramf = new NormalUserFooterPreference(this.context);
      paramf.setLayoutResource(2130969206);
      paramf.setKey("contact_info_footer_normal");
      if (paramf.a(this.ehM, "", this.pli, this.plj, false, this.gwP, this.pmV, false, false, 0L, ""))
        this.ehK.b(paramf);
      this.pmW.a(this.ehK, this.pmW.mKey);
      paramf = n.my(this.ehq);
      this.pmW.oD(false).oE(false);
      this.pmW.u(this.ehq, paramf);
      this.pmW.a(new h.1(this));
      AppMethodBeat.o(23535);
      return true;
      bool = false;
      break;
      bool = false;
      break label34;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23536);
    NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)this.ehK.aqO("contact_info_footer_normal");
    if (localNormalUserFooterPreference != null)
      localNormalUserFooterPreference.biV();
    AppMethodBeat.o(23536);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.h
 * JD-Core Version:    0.6.2
 */