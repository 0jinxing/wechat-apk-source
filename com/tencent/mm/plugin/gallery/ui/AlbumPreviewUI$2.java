package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONObject;

final class AlbumPreviewUI$2
  implements AdapterView.OnItemClickListener
{
  AlbumPreviewUI$2(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(21389);
    paramAdapterView = AlbumPreviewUI.a(this.mPO).ws(paramInt);
    boolean bool;
    if ((paramAdapterView == null) || (bo.isNullOrNil(paramAdapterView.fPT)))
      if (paramAdapterView == null)
      {
        bool = true;
        ab.w("MicroMsg.AlbumPreviewUI", "item is null %s, item original path is null", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(21389);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((e.bBZ().hOZ == 0) || (e.bBZ().hOZ == 5) || (e.bBZ().hOZ == 10) || (e.bBZ().hOZ == 11))
      {
        if (e.bBZ().mOu == 2)
        {
          com.tencent.mm.ui.base.h.a(this.mPO, true, this.mPO.getString(2131300211), "", this.mPO.getString(2131297041), this.mPO.getString(2131296868), new AlbumPreviewUI.2.1(this, paramAdapterView, paramInt), null);
          AppMethodBeat.o(21389);
          continue;
        }
        if (paramAdapterView == null)
        {
          ab.w("MicroMsg.AlbumPreviewUI", "get item error, null, position %d", new Object[] { Integer.valueOf(paramInt) });
          this.mPO.setResult(0);
        }
        while (true)
        {
          this.mPO.finish();
          AppMethodBeat.o(21389);
          break;
          paramView = new Intent();
          if (paramAdapterView.getType() == 2)
          {
            paramView.putExtra("is_video", true);
            paramView.putExtra("video_full_path", paramAdapterView.fPT);
          }
          if (e.bBZ().hOZ == 10)
            paramView.putExtra("CropImage_OutputPath", paramAdapterView.fPT);
          paramView.setData(Uri.parse(Uri.encode(paramAdapterView.fPT)));
          ab.i("MicroMsg.AlbumPreviewUI", "getItem ok");
          this.mPO.setResult(-1, paramView);
        }
      }
      Object localObject;
      if (e.bBZ().hOZ == 4)
      {
        if (paramInt < AlbumPreviewUI.a(this.mPO).mOM.size())
        {
          ab.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!!");
          AppMethodBeat.o(21389);
          continue;
        }
        if (paramAdapterView == null)
        {
          ab.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!! MediaItem == null.");
          AppMethodBeat.o(21389);
          continue;
        }
        if ((paramAdapterView.getType() == 2) && (AlbumPreviewUI.a(this.mPO).mOI.size() != 0))
        {
          com.tencent.mm.ui.base.h.bQ(this.mPO.mController.ylL, com.tencent.mm.bz.a.an(this.mPO.mController.ylL, 2131300175));
          AppMethodBeat.o(21389);
          continue;
        }
        localObject = AlbumPreviewUI.a(this.mPO).wr(paramAdapterView.getType());
        e.B((ArrayList)localObject);
        paramView = new Intent(this.mPO, ImagePreviewUI.class);
        paramView.putExtra("key_edit_video_max_time_length", this.mPO.getIntent().getIntExtra("key_edit_video_max_time_length", 10));
        paramView.putExtra("key_edit_text_color", this.mPO.getIntent().getStringExtra("key_edit_text_color"));
        paramView.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(this.mPO).bCw());
        paramView.putExtra("preview_all", true);
        paramView.putExtra("preview_position", ((ArrayList)localObject).indexOf(paramAdapterView));
        paramAdapterView = this.mPO;
        paramAdapterView.V(paramInt - AlbumPreviewUI.a(paramAdapterView).mOM.size(), true);
        paramView.putExtra("send_raw_img", AlbumPreviewUI.d(this.mPO));
        paramView.putExtra("max_select_count", AlbumPreviewUI.i(this.mPO));
        paramView.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(this.mPO));
        paramView.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(this.mPO));
        this.mPO.startActivityForResult(paramView, 0);
        AppMethodBeat.o(21389);
        continue;
      }
      if (e.bBZ().hOZ == 14)
      {
        if (paramInt < AlbumPreviewUI.a(this.mPO).mOM.size())
        {
          ab.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!!");
          AppMethodBeat.o(21389);
          continue;
        }
        if (paramAdapterView == null)
        {
          ab.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!! MediaItem == null.");
          AppMethodBeat.o(21389);
          continue;
        }
        if ((paramAdapterView.getType() == 2) && (AlbumPreviewUI.a(this.mPO).mOI.size() != 0))
        {
          com.tencent.mm.ui.base.h.bQ(this.mPO.mController.ylL, com.tencent.mm.bz.a.an(this.mPO.mController.ylL, 2131300175));
          AppMethodBeat.o(21389);
          continue;
        }
        if (!(paramAdapterView instanceof GalleryItem.VideoMediaItem))
          break label2043;
        paramAdapterView = (GalleryItem.VideoMediaItem)paramAdapterView;
        paramInt = paramAdapterView.eXL;
        if ((paramInt == 0) || (paramInt == 180))
        {
          if (paramAdapterView.videoWidth < paramAdapterView.videoHeight)
            break label1026;
          ab.i("MicroMsg.AlbumPreviewUI", "select story video, video ratio error, width:%s, height:%s, rotate:%s", new Object[] { Integer.valueOf(paramAdapterView.videoWidth), Integer.valueOf(paramAdapterView.videoHeight), Integer.valueOf(paramInt) });
          com.tencent.mm.plugin.report.service.h.pYm.k(1005L, 52L, 1L);
          com.tencent.mm.ui.base.h.bQ(this.mPO.mController.ylL, com.tencent.mm.bz.a.an(this.mPO.mController.ylL, 2131300188));
          AppMethodBeat.o(21389);
          continue;
        }
        if (((paramInt == 270) || (paramInt == 90)) && (paramAdapterView.videoHeight >= paramAdapterView.videoWidth))
        {
          ab.i("MicroMsg.AlbumPreviewUI", "select story video, video ratio error, width:%s, height:%s, rotate:%s", new Object[] { Integer.valueOf(paramAdapterView.videoWidth), Integer.valueOf(paramAdapterView.videoHeight), Integer.valueOf(paramInt) });
          com.tencent.mm.plugin.report.service.h.pYm.k(1005L, 52L, 1L);
          com.tencent.mm.ui.base.h.bQ(this.mPO.mController.ylL, com.tencent.mm.bz.a.an(this.mPO.mController.ylL, 2131300188));
          AppMethodBeat.o(21389);
          continue;
        }
        label1026: if (paramAdapterView.fPW <= 2000)
        {
          ab.i("MicroMsg.AlbumPreviewUI", "select story video, duration too long, duration:%s", new Object[] { Integer.valueOf(paramAdapterView.fPW) });
          com.tencent.mm.plugin.report.service.h.pYm.k(1005L, 53L, 1L);
          com.tencent.mm.ui.base.h.bQ(this.mPO.mController.ylL, com.tencent.mm.bz.a.an(this.mPO.mController.ylL, 2131300194));
          AppMethodBeat.o(21389);
          continue;
        }
        if ((paramAdapterView.videoFrameRate <= 1) && (paramAdapterView.videoFrameRate >= 0))
        {
          ab.i("MicroMsg.AlbumPreviewUI", "select story video, videoFrameRate too small:%s, videoPath:%s", new Object[] { Integer.valueOf(paramAdapterView.videoFrameRate), paramAdapterView.fPT });
          if (paramAdapterView.videoFrameRate != 1);
        }
      }
      try
      {
        localObject = SightVideoJNI.getSimpleMp4Info(paramAdapterView.fPT);
        if (!bo.isNullOrNil((String)localObject))
        {
          paramView = new org/json/JSONObject;
          paramView.<init>((String)localObject);
          double d = paramView.optDouble("videoFPS");
          ab.i("MicroMsg.AlbumPreviewUI", "update from getSimpleMp4Info videoFPS:%s", new Object[] { Double.valueOf(d) });
          if (d > 0.0D)
            paramAdapterView.videoFrameRate = ((int)d);
        }
        label1232: if (paramAdapterView.videoFrameRate <= 0)
        {
          ab.i("MicroMsg.AlbumPreviewUI", "final videoFrameRate:%s, too small, videoPath:%s", new Object[] { Integer.valueOf(paramAdapterView.videoFrameRate), paramAdapterView.fPT });
          com.tencent.mm.plugin.report.service.h.pYm.k(1005L, 54L, 1L);
          com.tencent.mm.ui.base.h.bQ(this.mPO.mController.ylL, com.tencent.mm.bz.a.an(this.mPO.mController.ylL, 2131300186));
          AppMethodBeat.o(21389);
          continue;
        }
        if (paramAdapterView.fPW >= 10500)
        {
          paramView = new Intent();
          paramView.putExtra("key_video_path", paramAdapterView.fPT);
          paramView.putExtra("key_need_clip_video_first", true);
          paramView.putExtra("key_need_remux_video", false);
          paramView.putExtra("key_text_color", this.mPO.getIntent().getStringExtra("key_edit_text_color"));
          paramView.putExtra("key_max_duration_seconds", this.mPO.getIntent().getIntExtra("key_edit_video_max_time_length", 10));
          d.b(this.mPO.mController.ylL, "mmsight", ".segment.MMSightEditUI", paramView, 4374);
          AppMethodBeat.o(21389);
          continue;
        }
        paramView = new Intent();
        paramView.putExtra("K_SEGMENTVIDEOPATH", paramAdapterView.fPT);
        paramView.putExtra("KSEGMENTVIDEOTHUMBPATH", paramAdapterView.lZg);
        this.mPO.setResult(-1, paramView);
        this.mPO.finish();
        AppMethodBeat.o(21389);
        continue;
        if (AlbumPreviewUI.n(this.mPO))
        {
          if (paramInt < AlbumPreviewUI.a(this.mPO).mOM.size())
          {
            ab.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!!");
            AppMethodBeat.o(21389);
            continue;
          }
          if (paramAdapterView == null)
          {
            ab.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!! MediaItem == null.");
            AppMethodBeat.o(21389);
            continue;
          }
          if ((paramAdapterView.getType() == 2) && (AlbumPreviewUI.a(this.mPO).mOI.size() != 0))
          {
            com.tencent.mm.ui.base.h.bQ(this.mPO.mController.ylL, com.tencent.mm.bz.a.an(this.mPO.mController.ylL, 2131300175));
            AppMethodBeat.o(21389);
            continue;
          }
          localObject = AlbumPreviewUI.a(this.mPO).wr(paramAdapterView.getType());
          e.B((ArrayList)localObject);
          paramView = new Intent(this.mPO, ImagePreviewUI.class);
          paramView.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(this.mPO).bCw());
          paramView.putExtra("preview_all", true);
          paramView.putExtra("preview_position", ((ArrayList)localObject).indexOf(paramAdapterView));
          localObject = this.mPO;
          ((AlbumPreviewUI)localObject).V(paramInt - AlbumPreviewUI.a((AlbumPreviewUI)localObject).mOM.size(), true);
          paramView.putExtra("send_raw_img", AlbumPreviewUI.d(this.mPO));
          if (paramAdapterView.getType() == 2);
          for (paramInt = 1; ; paramInt = AlbumPreviewUI.i(this.mPO))
          {
            paramView.putExtra("max_select_count", paramInt);
            paramView.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(this.mPO));
            paramView.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(this.mPO));
            this.mPO.startActivityForResult(paramView, 0);
            AppMethodBeat.o(21389);
            break;
          }
        }
        if (paramInt < AlbumPreviewUI.a(this.mPO).mOM.size())
        {
          ab.w("MicroMsg.AlbumPreviewUI", "POSITION ERROR!!!");
          AppMethodBeat.o(21389);
          continue;
        }
        e.B(AlbumPreviewUI.a(this.mPO).mOH);
        paramView = new Intent(this.mPO, ImagePreviewUI.class);
        paramView.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(this.mPO).bCw());
        paramView.putExtra("preview_all", true);
        paramView.putExtra("preview_position", paramInt - AlbumPreviewUI.a(this.mPO).mOM.size());
        paramAdapterView = this.mPO;
        paramAdapterView.V(paramInt - AlbumPreviewUI.a(paramAdapterView).mOM.size(), true);
        paramView.putExtra("send_raw_img", AlbumPreviewUI.d(this.mPO));
        paramView.putExtra("max_select_count", AlbumPreviewUI.i(this.mPO));
        paramView.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(this.mPO));
        paramView.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(this.mPO));
        paramView.putExtra("album_business_tag", AlbumPreviewUI.u(this.mPO));
        paramView.putExtra("album_video_max_duration", AlbumPreviewUI.A(this.mPO));
        this.mPO.startActivityForResult(paramView, 0);
        label2043: AppMethodBeat.o(21389);
      }
      catch (Exception paramView)
      {
        break label1232;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.2
 * JD-Core Version:    0.6.2
 */