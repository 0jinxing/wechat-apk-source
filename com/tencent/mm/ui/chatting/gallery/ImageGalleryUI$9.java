package com.tencent.mm.ui.chatting.gallery;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.b.a.k;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;

final class ImageGalleryUI$9
  implements n.d
{
  ImageGalleryUI$9(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(32205);
    ab.i("MicroMsg.ImageGalleryUI", "curTransState %d", new Object[] { Integer.valueOf(ImageGalleryUI.f(this.yWC)) });
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 4:
    case 2:
    case 3:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(32205);
      Object localObject;
      while (true)
      {
        return;
        localObject = ImageGalleryUI.j(this.yWC).dFO();
        if ((localObject != null) && (((bi)localObject).bws()))
        {
          paramMenuItem = u.ut(((cy)localObject).field_imgPath);
          if ((paramMenuItem.status != 199) && (paramMenuItem.status != 199))
          {
            ImageGalleryUI.b(this.yWC, u.e(((cy)localObject).field_msgId, 1));
            ImageGalleryUI.j(this.yWC).OQ(this.yWC.mQT.getCurrentItem());
            AppMethodBeat.o(32205);
          }
          else
          {
            ImageGalleryUI.j(this.yWC).OL(this.yWC.mQT.getCurrentItem());
            AppMethodBeat.o(32205);
          }
        }
        else
        {
          ImageGalleryUI.j(this.yWC).OL(this.yWC.mQT.getCurrentItem());
          AppMethodBeat.o(32205);
          continue;
          paramMenuItem = ImageGalleryUI.j(this.yWC).dFO();
          if ((paramMenuItem != null) && (paramMenuItem.bws()))
          {
            localObject = u.ut(paramMenuItem.field_imgPath);
            if ((((s)localObject).status != 199) && (((s)localObject).status != 199))
            {
              ImageGalleryUI.b(this.yWC, u.e(paramMenuItem.field_msgId, 2));
              ImageGalleryUI.j(this.yWC).OQ(this.yWC.mQT.getCurrentItem());
              AppMethodBeat.o(32205);
            }
            else
            {
              paramMenuItem = new ArrayList();
              paramMenuItem.add(ImageGalleryUI.j(this.yWC).dFO());
              c.f(this.yWC.mController.ylL, paramMenuItem);
              AppMethodBeat.o(32205);
            }
          }
          else
          {
            paramMenuItem = new ArrayList();
            paramMenuItem.add(ImageGalleryUI.j(this.yWC).dFO());
            com.tencent.mm.modelstat.b.fRa.H((bi)paramMenuItem.get(0));
            c.f(this.yWC.mController.ylL, paramMenuItem);
            AppMethodBeat.o(32205);
            continue;
            ImageGalleryUI.j(this.yWC).OM(this.yWC.mQT.getCurrentItem());
            AppMethodBeat.o(32205);
            continue;
            if (!d.afj("favorite"))
              break;
            ImageGalleryUI.j(this.yWC).ON(this.yWC.mQT.getCurrentItem());
            AppMethodBeat.o(32205);
            continue;
            ab.i("MicroMsg.ImageGalleryUI", "request deal QBAR string");
            paramMenuItem = new cf();
            paramMenuItem.cvm.activity = this.yWC;
            paramMenuItem.cvm.ctB = ImageGalleryUI.c(this.yWC);
            paramMenuItem.cvm.cvn = ImageGalleryUI.B(this.yWC);
            paramMenuItem.cvm.cvo = ImageGalleryUI.C(this.yWC);
            paramMenuItem.cvm.scene = 37;
            paramMenuItem.cvm.cvs = this.yWC.getIntent().getBundleExtra("_stat_obj");
            ImageGalleryUI.a(this.yWC, paramMenuItem);
            ImageGalleryUI.b(this.yWC, paramMenuItem);
            a.xxA.m(paramMenuItem);
            AppMethodBeat.o(32205);
            continue;
            ImageGalleryUI.D(this.yWC);
            AppMethodBeat.o(32205);
            continue;
            if (ImageGalleryUI.j(this.yWC) == null)
              break;
            if (c.c(ImageGalleryUI.j(this.yWC).dFO()))
              ImageGalleryUI.E(this.yWC);
            AppMethodBeat.o(32205);
          }
        }
      }
      paramMenuItem = ImageGalleryUI.F(this.yWC);
      if (((ImageGalleryUI.f(this.yWC) == 0) || (ImageGalleryUI.f(this.yWC) == 2)) && (!bo.isNullOrNil(paramMenuItem)))
      {
        localObject = new k();
        if (ImageGalleryUI.f(this.yWC) == 2);
        for (long l = 1L; ; l = 0L)
        {
          ((k)localObject).cVR = l;
          ((k)localObject).cVS = 3L;
          ((k)localObject).ajK();
          ImageGalleryUI.e(this.yWC, (int)(r.Yz().hashCode() + System.currentTimeMillis() & 0xFFFFFFFF));
          localObject = ag.ck(paramMenuItem + com.tencent.mm.vfs.e.ata(paramMenuItem));
          if (com.tencent.mm.plugin.scanner.e.cgy().cgD().Wf((String)localObject) == null)
            break label935;
          localObject = new Intent();
          ((Intent)localObject).putExtra("original_file_path", paramMenuItem);
          ((Intent)localObject).putExtra("msg_id", ImageGalleryUI.j(this.yWC).Ou(ImageGalleryUI.G(this.yWC)).field_msgId);
          ImageGalleryUI.a(this.yWC, TranslationResultUI.class, (Intent)localObject);
          this.yWC.finish();
          this.yWC.overridePendingTransition(2131034130, 2131034130);
          AppMethodBeat.o(32205);
          break;
        }
        label935: ImageGalleryUI.H(this.yWC);
        ab.i("MicroMsg.ImageGalleryUI", "try to translate img %s, sessionId %d", new Object[] { paramMenuItem, Integer.valueOf(ImageGalleryUI.h(this.yWC)) });
        localObject = new pu();
        ((pu)localObject).cLZ.scene = 1;
        ((pu)localObject).cLZ.filePath = paramMenuItem;
        ((pu)localObject).cLZ.ctE = ImageGalleryUI.h(this.yWC);
        a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.9
 * JD-Core Version:    0.6.2
 */