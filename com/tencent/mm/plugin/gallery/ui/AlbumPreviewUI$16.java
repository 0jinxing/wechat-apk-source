package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

final class AlbumPreviewUI$16
  implements MenuItem.OnMenuItemClickListener
{
  AlbumPreviewUI$16(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(21411);
    ab.d("MicroMsg.AlbumPreviewUI", "send image, previewImageCount:%d, chooseForTimeline:%b", new Object[] { Integer.valueOf(e.bCg()), Boolean.valueOf(AlbumPreviewUI.l(this.mPO)) });
    int i;
    if (AlbumPreviewUI.l(this.mPO))
      i = 3;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    while (true)
    {
      try
      {
        localObject1 = AlbumPreviewUI.b(this.mPO);
        paramMenuItem = new java/lang/StringBuilder;
        paramMenuItem.<init>();
        ((com.tencent.mm.plugin.gallery.stub.a)localObject1).aK(11610, i + "," + e.bCg());
        if (AlbumPreviewUI.m(this.mPO) >= 0);
      }
      catch (Exception paramMenuItem)
      {
        try
        {
          AlbumPreviewUI.a(this.mPO, AlbumPreviewUI.b(this.mPO).Nd());
          e.bCf();
          if (AlbumPreviewUI.a(this.mPO).bCw().size() == 0)
          {
            ab.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick");
            this.mPO.setResult(-2);
            this.mPO.finish();
            AppMethodBeat.o(21411);
            return true;
            i = 2;
            continue;
            paramMenuItem = paramMenuItem;
            ab.e("MicroMsg.AlbumPreviewUI", "report error, %s", new Object[] { paramMenuItem.getMessage() });
            ab.printErrStackTrace("MicroMsg.AlbumPreviewUI", paramMenuItem, "", new Object[0]);
          }
        }
        catch (Exception paramMenuItem)
        {
          AlbumPreviewUI.a(this.mPO, 26214400);
          ab.e("MicroMsg.AlbumPreviewUI", "getMaxSendVideoSize error, %s", new Object[] { paramMenuItem.getMessage() });
          ab.printErrStackTrace("MicroMsg.AlbumPreviewUI", paramMenuItem, "", new Object[0]);
          continue;
          paramMenuItem = new Intent();
          i = e.bBZ().mOu;
          if (AlbumPreviewUI.l(this.mPO))
            i = 1;
          if (AlbumPreviewUI.n(this.mPO))
            i = 1;
          if (i != 1)
            break label654;
        }
      }
      if (AlbumPreviewUI.l(this.mPO))
      {
        bool = true;
        paramMenuItem.putExtra("CropImage_Compress_Img", bool);
        localObject2 = AlbumPreviewUI.a(this.mPO).mOI;
        localObject1 = new ArrayList();
        localObject2 = ((ArrayList)localObject2).iterator();
      }
      while (true)
      {
        if (!((Iterator)localObject2).hasNext())
          break label448;
        localObject3 = (GalleryItem.MediaItem)((Iterator)localObject2).next();
        if ((((GalleryItem.MediaItem)localObject3).mMimeType.equals("edit")) && (!bo.isNullOrNil(((GalleryItem.MediaItem)localObject3).mOj)))
        {
          ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject3).mOj);
          continue;
          if (!AlbumPreviewUI.d(this.mPO))
          {
            bool = true;
            break;
          }
          bool = false;
          break;
        }
        ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject3).fPT);
      }
      label448: paramMenuItem.putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject1);
      paramMenuItem.putExtra("KSelectImgUseTime", System.currentTimeMillis() - AlbumPreviewUI.o(this.mPO));
      AlbumPreviewUI.p(this.mPO);
      this.mPO.setResult(-1, paramMenuItem);
      AlbumPreviewUI.q(this.mPO);
      if ((bo.isNullOrNil(AlbumPreviewUI.j(this.mPO))) || ("medianote".equals(AlbumPreviewUI.k(this.mPO))))
        break label644;
      if (bo.yz() - AlbumPreviewUI.r(this.mPO) >= 1000L)
        break;
      ab.w("MicroMsg.AlbumPreviewUI", "sendimg btn event frequence limit");
      AppMethodBeat.o(21411);
    }
    ab.i("MicroMsg.AlbumPreviewUI", "switch to SendImgProxyUI");
    AlbumPreviewUI.a(this.mPO, bo.yz());
    paramMenuItem.setClassName(this.mPO, "com.tencent.mm.ui.chatting.SendImgProxyUI");
    paramMenuItem.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(this.mPO));
    paramMenuItem.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(this.mPO));
    this.mPO.startActivityForResult(paramMenuItem, 4373);
    while (true)
    {
      AppMethodBeat.o(21411);
      break;
      label644: this.mPO.finish();
      continue;
      label654: if (i == 2)
      {
        ab.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick video");
        if (this.mPO.getIntent().getBooleanExtra("GalleryUI_SkipVideoSizeLimit", false));
        for (i = 0; ; i = ((com.tencent.mm.pluginsdk.ui.c.a)localObject1).aAa())
        {
          if (i != 0)
            break label810;
          paramMenuItem.setData(Uri.fromFile(new File((String)AlbumPreviewUI.a(this.mPO).bCw().get(0))));
          paramMenuItem.putStringArrayListExtra("key_select_video_list", AlbumPreviewUI.a(this.mPO).bCw());
          this.mPO.setResult(-1, paramMenuItem);
          AlbumPreviewUI.q(this.mPO);
          this.mPO.finish();
          break;
          localObject1 = com.tencent.mm.pluginsdk.ui.c.a.ajK((String)AlbumPreviewUI.a(this.mPO).bCw().get(0));
          ((com.tencent.mm.pluginsdk.ui.c.a)localObject1).mSize = AlbumPreviewUI.m(this.mPO);
        }
        label810: if (i == 2)
        {
          AlbumPreviewUI.s(this.mPO);
          AppMethodBeat.o(21411);
          break;
        }
        AlbumPreviewUI.t(this.mPO);
        AppMethodBeat.o(21411);
        break;
      }
      if (i == 3)
      {
        if ((!bo.isNullOrNil(AlbumPreviewUI.u(this.mPO))) && (AlbumPreviewUI.u(this.mPO).equals("album_business_bubble_media_by_coordinate")))
        {
          localObject3 = AlbumPreviewUI.a(this.mPO).mOI;
          localObject2 = new ArrayList();
          localObject1 = new ArrayList();
          localObject3 = ((ArrayList)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (GalleryItem.MediaItem)((Iterator)localObject3).next();
            if (((GalleryItem.MediaItem)localObject4).getType() == 1)
            {
              if ((((GalleryItem.MediaItem)localObject4).mMimeType.equals("edit")) && (!bo.isNullOrNil(((GalleryItem.MediaItem)localObject4).mOj)))
                ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject4).mOj);
              else
                ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject4).fPT);
            }
            else if (((GalleryItem.MediaItem)localObject4).getType() == 2)
              ((ArrayList)localObject2).add(((GalleryItem.MediaItem)localObject4).fPT);
          }
          paramMenuItem.putExtra("CropImage_Compress_Img", false);
          paramMenuItem.putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject1);
          paramMenuItem.putStringArrayListExtra("key_select_video_list", (ArrayList)localObject2);
          paramMenuItem.putExtra("KSelectImgUseTime", System.currentTimeMillis() - AlbumPreviewUI.o(this.mPO));
          paramMenuItem.putExtra("longitude", AlbumPreviewUI.v(this.mPO));
          paramMenuItem.putExtra("latitude", AlbumPreviewUI.w(this.mPO));
          AlbumPreviewUI.p(this.mPO);
          this.mPO.setResult(-1, paramMenuItem);
          this.mPO.finish();
          AppMethodBeat.o(21411);
          break;
        }
        if (bo.yz() - AlbumPreviewUI.r(this.mPO) < 1000L)
        {
          ab.w("MicroMsg.AlbumPreviewUI", "sendimg btn event frequence limit");
          AppMethodBeat.o(21411);
          break;
        }
        AlbumPreviewUI.a(this.mPO, bo.yz());
        localObject3 = AlbumPreviewUI.a(this.mPO).mOI;
        localObject2 = new ArrayList();
        localObject1 = new ArrayList();
        Object localObject4 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject3 = (GalleryItem.MediaItem)((Iterator)localObject4).next();
          if (((GalleryItem.MediaItem)localObject3).getType() == 1)
          {
            if ((((GalleryItem.MediaItem)localObject3).mMimeType.equals("edit")) && (!bo.isNullOrNil(((GalleryItem.MediaItem)localObject3).mOj)))
              ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject3).mOj);
            else
              ((ArrayList)localObject1).add(((GalleryItem.MediaItem)localObject3).fPT);
          }
          else if (((GalleryItem.MediaItem)localObject3).getType() == 2)
            ((ArrayList)localObject2).add(((GalleryItem.MediaItem)localObject3).fPT);
        }
        if (AlbumPreviewUI.l(this.mPO))
          bool = true;
        while (true)
        {
          paramMenuItem.putExtra("CropImage_Compress_Img", bool);
          paramMenuItem.putStringArrayListExtra("key_select_video_list", (ArrayList)localObject2);
          paramMenuItem.putExtra("KSelectImgUseTime", System.currentTimeMillis() - AlbumPreviewUI.o(this.mPO));
          AlbumPreviewUI.p(this.mPO);
          if (((ArrayList)localObject1).size() <= 0)
            break label1483;
          paramMenuItem.setClassName(this.mPO, "com.tencent.mm.ui.chatting.SendImgProxyUI");
          paramMenuItem.putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject1);
          paramMenuItem.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(this.mPO));
          paramMenuItem.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(this.mPO));
          paramMenuItem.putExtra("CropImage_limit_Img_Size", 26214400);
          ab.i("MicroMsg.AlbumPreviewUI", "switch to SendImgProxyUI");
          this.mPO.startActivityForResult(paramMenuItem, 4373);
          break;
          if (!AlbumPreviewUI.d(this.mPO))
            bool = true;
        }
        label1483: ab.i("MicroMsg.AlbumPreviewUI", "QueryTypeImageAndVideo");
        this.mPO.setResult(-1, paramMenuItem);
        this.mPO.finish();
        continue;
      }
      ab.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick default");
      this.mPO.setResult(-2);
      this.mPO.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.16
 * JD-Core Version:    0.6.2
 */