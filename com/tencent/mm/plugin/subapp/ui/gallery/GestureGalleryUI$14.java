package com.tencent.mm.plugin.subapp.ui.gallery;

import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;

final class GestureGalleryUI$14
  implements n.d
{
  GestureGalleryUI$14(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(25395);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(25395);
    case 1:
      while (true)
      {
        label50: return;
        if (!bo.isNullOrNil(GestureGalleryUI.c(this.sum)))
          break;
        ab.w("MicroMsg.GestureGalleryUI", "share image to friend fail, imgPath is null");
        AppMethodBeat.o(25395);
      }
      if (r.amo(GestureGalleryUI.c(this.sum)))
      {
        paramMenuItem = com.tencent.mm.vfs.e.atg(GestureGalleryUI.c(this.sum));
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramMenuItem);
        if (paramMenuItem != null)
          break label721;
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr();
        ah.getContext();
        paramMenuItem = paramMenuItem.Jf(GestureGalleryUI.c(this.sum));
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramMenuItem);
      }
      break;
    case 2:
    case 3:
    case 4:
    }
    label186: label199: label716: label721: 
    while (true)
    {
      long l;
      Object localObject;
      if (paramMenuItem == null)
      {
        l = 0L;
        if (paramMenuItem != null)
          break label316;
        localObject = GestureGalleryUI.c(this.sum);
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        if (((com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject, localOptions) == null) || (localOptions.outHeight <= com.tencent.mm.m.b.Na())) && (localOptions.outWidth <= com.tencent.mm.m.b.Na()))
          break label716;
      }
      for (paramInt = 1; ; paramInt = 0)
      {
        if ((l > com.tencent.mm.m.b.Nb()) || (paramInt != 0))
        {
          h.a(this.sum.mController.ylL, this.sum.getString(2131299043), "", this.sum.getString(2131300601), null);
          AppMethodBeat.o(25395);
          break label50;
          l = com.tencent.mm.vfs.e.asZ(paramMenuItem.dve());
          break label186;
          localObject = paramMenuItem.dve();
          break label199;
        }
        localObject = new Intent();
        if (paramMenuItem == null);
        for (paramMenuItem = ""; ; paramMenuItem = paramMenuItem.Aq())
        {
          ((Intent)localObject).putExtra("Retr_File_Name", paramMenuItem);
          ((Intent)localObject).putExtra("Retr_Msg_Type", 5);
          ((Intent)localObject).putExtra("Retr_MsgImgScene", 1);
          com.tencent.mm.plugin.subapp.b.gkE.k((Intent)localObject, this.sum.mController.ylL);
          AppMethodBeat.o(25395);
          break;
        }
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Retr_File_Name", GestureGalleryUI.c(this.sum));
        paramMenuItem.putExtra("Retr_Compress_Type", 0);
        paramMenuItem.putExtra("Retr_Msg_Type", 0);
        com.tencent.mm.plugin.subapp.b.gkE.k(paramMenuItem, this.sum.mController.ylL);
        AppMethodBeat.o(25395);
        break label50;
        if ((GestureGalleryUI.c(this.sum) == null) || (GestureGalleryUI.c(this.sum).equals("")))
          break;
        aw.ZK();
        if (!c.isSDCardAvailable())
        {
          t.hO(this.sum);
          AppMethodBeat.o(25395);
          break label50;
        }
        com.tencent.mm.pluginsdk.ui.tools.n.j(GestureGalleryUI.c(this.sum), this.sum);
        AppMethodBeat.o(25395);
        break label50;
        paramMenuItem = new cl();
        com.tencent.mm.pluginsdk.model.e.a(paramMenuItem, 1, GestureGalleryUI.c(this.sum));
        paramMenuItem.cvA.activity = this.sum;
        paramMenuItem.cvA.cvH = 32;
        a.xxA.m(paramMenuItem);
        AppMethodBeat.o(25395);
        break label50;
        ab.i("MicroMsg.GestureGalleryUI", "request deal QBAR string");
        paramMenuItem = new cf();
        paramMenuItem.cvm.activity = this.sum;
        paramMenuItem.cvm.ctB = GestureGalleryUI.k(this.sum);
        paramMenuItem.cvm.cvn = GestureGalleryUI.j(this.sum);
        paramMenuItem.cvm.cvo = GestureGalleryUI.n(this.sum);
        paramMenuItem.cvm.scene = GestureGalleryUI.o(this.sum);
        paramMenuItem.cvm.cvs = this.sum.getIntent().getBundleExtra("_stat_obj");
        a.xxA.m(paramMenuItem);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.14
 * JD-Core Version:    0.6.2
 */