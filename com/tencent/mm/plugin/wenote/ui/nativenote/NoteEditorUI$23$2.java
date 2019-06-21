package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.plugin.fav.ui.g;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;

final class NoteEditorUI$23$2
  implements n.d
{
  NoteEditorUI$23$2(NoteEditorUI.23 param23)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    int i = 0;
    int j = 0;
    int k = 1;
    paramInt = 1;
    AppMethodBeat.i(27029);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    }
    while (true)
    {
      AppMethodBeat.o(27029);
      while (true)
      {
        return;
        if (NoteEditorUI.f(this.uTB.uTu) != null)
          NoteEditorUI.f(this.uTB.uTu).a(null);
        NoteEditorUI.a(this.uTB.uTu, com.tencent.mm.ui.base.h.b(this.uTB.uTu.mController.ylL, this.uTB.uTu.getString(2131296325), true, new NoteEditorUI.23.2.1(this)));
        com.tencent.mm.sdk.g.d.post(new NoteEditorUI.23.2.2(this), "AddFavNoteSync");
        AppMethodBeat.o(27029);
        continue;
        if (NoteEditorUI.f(this.uTB.uTu) != null)
          NoteEditorUI.f(this.uTB.uTu).a(null);
        NoteEditorUI.j(this.uTB.uTu).deV();
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_scene", 2);
        paramMenuItem.putExtra("key_fav_item_id", NoteEditorUI.h(this.uTB.uTu));
        com.tencent.mm.plugin.fav.a.b.b(this.uTB.uTu.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
        paramMenuItem = NoteEditorUI.k(this.uTB.uTu);
        paramMenuItem.mfc += 1;
        AppMethodBeat.o(27029);
        continue;
        com.tencent.mm.ui.base.h.a(this.uTB.uTu.mController.ylL, this.uTB.uTu.getString(2131296882), "", new NoteEditorUI.23.2.3(this), null);
        AppMethodBeat.o(27029);
        continue;
        paramMenuItem = new cl();
        e.a(paramMenuItem, NoteEditorUI.m(this.uTB.uTu));
        a.xxA.m(paramMenuItem);
        com.tencent.mm.plugin.fav.ui.c.a(paramMenuItem.cvB.ret, this.uTB.uTu, this.uTB.uTu.mUw);
        AppMethodBeat.o(27029);
        continue;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        paramMenuItem.putExtra("select_is_ret", true);
        paramMenuItem.putExtra("mutil_select_is_ret", true);
        paramMenuItem.putExtra("Retr_Msg_Type", 2);
        paramMenuItem.putExtra("Retr_Msg_Id", NoteEditorUI.m(this.uTB.uTu));
        com.tencent.mm.bp.d.b(this.uTB.uTu, ".ui.transmit.SelectConversationUI", paramMenuItem, 4096);
        paramMenuItem = NoteEditorUI.n(this.uTB.uTu);
        paramMenuItem.meZ += 1;
        AppMethodBeat.o(27029);
        continue;
        NoteEditorUI.j(this.uTB.uTu).deV();
        paramMenuItem = new com.tencent.mm.plugin.wenote.model.a.q();
        if (NoteEditorUI.d(this.uTB.uTu) == 1)
        {
          bool = true;
          label579: paramMenuItem.uOr = bool;
          paramMenuItem.uOv = NoteEditorUI.o(this.uTB.uTu);
          paramMenuItem.uOu = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().ahf(this.uTB.uTu.getString(2131305653));
          paramMenuItem.uOw = NoteEditorUI.p(this.uTB.uTu);
          paramMenuItem.uOx = NoteEditorUI.q(this.uTB.uTu);
          if (NoteEditorUI.d(this.uTB.uTu) != 1)
            break label788;
          paramMenuItem.uOt = NoteEditorUI.m(this.uTB.uTu);
          if (!NoteEditorUI.r(this.uTB.uTu))
            break label760;
          paramMenuItem.mgQ = true;
          com.tencent.mm.plugin.report.service.h.pYm.e(14790, new Object[] { Integer.valueOf(3) });
        }
        while (true)
        {
          com.tencent.mm.plugin.wenote.model.nativenote.manager.h.deH().a(paramMenuItem);
          com.tencent.mm.ui.widget.snackbar.b.i(this.uTB.uTu, this.uTB.uTu.getString(2131305654));
          AppMethodBeat.o(27029);
          break;
          bool = false;
          break label579;
          label760: paramMenuItem.mgQ = false;
          com.tencent.mm.plugin.report.service.h.pYm.e(14790, new Object[] { Integer.valueOf(2) });
          continue;
          label788: com.tencent.mm.plugin.report.service.h.pYm.e(14790, new Object[] { Integer.valueOf(1) });
          paramMenuItem.uOs = NoteEditorUI.h(this.uTB.uTu);
        }
        com.tencent.mm.plugin.wenote.model.nativenote.manager.h.deH().a(null);
        com.tencent.mm.ui.widget.snackbar.b.i(this.uTB.uTu, this.uTB.uTu.getString(2131305648));
        AppMethodBeat.o(27029);
        continue;
        com.tencent.mm.plugin.fav.a.h.j(NoteEditorUI.h(this.uTB.uTu), 0, 0);
        if ((NoteEditorUI.s(this.uTB.uTu)) || (NoteEditorUI.t(this.uTB.uTu)))
          paramInt = 1;
        String str;
        while (true)
        {
          if (paramInt != 0)
          {
            NoteEditorUI.j(this.uTB.uTu).deV();
            this.uTB.uTu.dfL();
            NoteEditorUI.w(this.uTB.uTu);
          }
          if ((NoteEditorUI.s(this.uTB.uTu)) || (NoteEditorUI.t(this.uTB.uTu)))
          {
            NoteEditorUI.x(this.uTB.uTu);
            NoteEditorUI.y(this.uTB.uTu);
            NoteEditorUI.z(this.uTB.uTu);
          }
          paramMenuItem = new gh();
          paramMenuItem.cAH.type = 30;
          paramMenuItem.cAH.cAO = 1;
          paramMenuItem.cAH.cvv = NoteEditorUI.h(this.uTB.uTu);
          a.xxA.m(paramMenuItem);
          str = paramMenuItem.cAI.path;
          NoteEditorUI.a(this.uTB.uTu, paramMenuItem.cAI.thumbPath);
          if (!bo.isNullOrNil(str))
            break label1166;
          NoteEditorUI.A(this.uTB.uTu).post(new NoteEditorUI.23.2.4(this));
          AppMethodBeat.o(27029);
          break;
          paramInt = j;
          if (NoteEditorUI.u(this.uTB.uTu))
          {
            paramInt = j;
            if (!com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().deu().equals(NoteEditorUI.v(this.uTB.uTu)))
              paramInt = 1;
          }
        }
        label1166: NoteEditorUI.b(this.uTB.uTu, str);
        paramMenuItem = NoteEditorUI.B(this.uTB.uTu);
        paramMenuItem.mfa += 1;
        AppMethodBeat.o(27029);
        continue;
        NoteEditorUI.a(this.uTB.uTu, com.tencent.mm.ui.base.h.b(this.uTB.uTu.mController.ylL, this.uTB.uTu.getString(2131305714), true, new NoteEditorUI.23.2.5(this)));
        paramMenuItem = new gh();
        paramMenuItem.cAH.type = 32;
        paramMenuItem.cAH.cvv = NoteEditorUI.h(this.uTB.uTu);
        paramMenuItem.cAH.cvC = com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMZ;
        a.xxA.m(paramMenuItem);
        boolean bool = paramMenuItem.cAI.cAY;
        if (paramMenuItem.cAI.path == null)
        {
          NoteEditorUI.g(this.uTB.uTu);
          Toast.makeText(this.uTB.uTu.mController.ylL, this.uTB.uTu.mController.ylL.getString(2131301750), 1).show();
          paramMenuItem = com.tencent.mm.plugin.report.service.h.pYm;
          if (NoteEditorUI.e(this.uTB.uTu));
          while (true)
          {
            paramMenuItem.e(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(paramInt) });
            AppMethodBeat.o(27029);
            break;
            paramInt = 0;
          }
        }
        if (bool)
        {
          NoteEditorUI.g(this.uTB.uTu);
          Toast.makeText(this.uTB.uTu.mController.ylL, this.uTB.uTu.mController.ylL.getString(2131301750), 1).show();
          paramMenuItem = com.tencent.mm.plugin.report.service.h.pYm;
          if (NoteEditorUI.e(this.uTB.uTu));
          for (paramInt = k; ; paramInt = 0)
          {
            paramMenuItem.e(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(paramInt) });
            AppMethodBeat.o(27029);
            break;
          }
        }
        NoteEditorUI.A(this.uTB.uTu).post(new NoteEditorUI.23.2.6(this));
        AppMethodBeat.o(27029);
        continue;
        paramMenuItem = new gh();
        paramMenuItem.cAH.type = 32;
        paramMenuItem.cAH.cvv = NoteEditorUI.h(this.uTB.uTu);
        paramMenuItem.cAH.cvC = com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMZ;
        a.xxA.m(paramMenuItem);
        bool = paramMenuItem.cAI.cAY;
        paramInt = i;
        if (paramMenuItem.cAI.ret != 0)
          paramInt = 1;
        if (paramMenuItem.cAI.path == null)
        {
          com.tencent.mm.ui.base.h.bQ(this.uTB.uTu.mController.ylL, this.uTB.uTu.getString(2131299721));
          AppMethodBeat.o(27029);
        }
        else if (bool)
        {
          com.tencent.mm.ui.base.h.bQ(this.uTB.uTu.mController.ylL, this.uTB.uTu.getString(2131296323));
          AppMethodBeat.o(27029);
        }
        else if (paramInt != 0)
        {
          com.tencent.mm.ui.base.h.bQ(this.uTB.uTu.mController.ylL, this.uTB.uTu.getString(2131296324));
          AppMethodBeat.o(27029);
        }
        else
        {
          paramMenuItem = new Intent();
          paramMenuItem.putExtra("Select_Conv_Type", 3);
          paramMenuItem.putExtra("scene_from", 1);
          paramMenuItem.putExtra("mutil_select_is_ret", true);
          paramMenuItem.putExtra("select_fav_local_id", NoteEditorUI.h(this.uTB.uTu));
          paramMenuItem.putExtra("Retr_fav_xml_str", com.tencent.mm.plugin.wenote.model.c.ddG().uMN.ddH());
          com.tencent.mm.bp.d.b(this.uTB.uTu, ".ui.transmit.SelectConversationUI", paramMenuItem, 4355);
          paramMenuItem = NoteEditorUI.C(this.uTB.uTu);
          paramMenuItem.meZ += 1;
          AppMethodBeat.o(27029);
          continue;
          com.tencent.mm.plugin.wenote.model.h.br(this.uTB.uTu.mController.ylL, NoteEditorUI.D(this.uTB.uTu));
          AppMethodBeat.o(27029);
          continue;
          AppMethodBeat.o(27029);
          continue;
          if (bo.isNullOrNil(NoteEditorUI.E(this.uTB.uTu)))
          {
            NoteEditorUI.A(this.uTB.uTu).post(new NoteEditorUI.23.2.7(this));
            AppMethodBeat.o(27029);
          }
          else
          {
            paramMenuItem = NoteEditorUI.F(this.uTB.uTu);
            paramMenuItem.mfa += 1;
            NoteEditorUI.b(this.uTB.uTu, NoteEditorUI.E(this.uTB.uTu));
            AppMethodBeat.o(27029);
            continue;
            paramMenuItem = new Intent();
            paramMenuItem.putExtra("k_expose_msg_id", NoteEditorUI.D(this.uTB.uTu));
            if ((NoteEditorUI.G(this.uTB.uTu) != null) && (NoteEditorUI.G(this.uTB.uTu).length > 1))
              paramMenuItem.putExtra("k_username", NoteEditorUI.G(this.uTB.uTu)[1]);
            paramMenuItem.putExtra("showShare", NoteEditorUI.H(this.uTB.uTu));
            paramMenuItem.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
            com.tencent.mm.bp.d.b(this.uTB.uTu.mController.ylL, "webview", ".ui.tools.WebViewUI", paramMenuItem);
            AppMethodBeat.o(27029);
          }
        }
      }
      g.a(this.uTB.uTu, NoteEditorUI.h(this.uTB.uTu), NoteEditorUI.I(this.uTB.uTu));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.2
 * JD-Core Version:    0.6.2
 */